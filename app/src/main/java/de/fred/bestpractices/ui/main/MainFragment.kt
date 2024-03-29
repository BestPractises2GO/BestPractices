package de.fred.bestpractices.ui.main


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import de.fred.bestpractices.databinding.MainFragmentBinding
import kotlinx.android.synthetic.main.main_fragment.*
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.android.inject


class MainFragment : Fragment() {

    val viewModel: MainFragmentViewModel by inject()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return MainFragmentBinding.inflate(inflater).apply {
            viewModel = this@MainFragment.viewModel
            lifecycleOwner = this@MainFragment
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getKoin().setProperty("test", "testest2")

        viewModel.initialize()
        viewpager.adapter = fragmentManager?.let { ViewPagerAdapter(it, lifecycle) }

        TabLayoutMediator(tabs, viewpager,
            TabLayoutMediator.OnConfigureTabCallback { tab, position -> tab.text = "Tab $position" }).attach()
        viewpager.currentItem = 2
    }
}
