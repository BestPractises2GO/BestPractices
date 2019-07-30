package de.fred.bestpractices.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.fred.bestpractices.R
import de.fred.bestpractices.common.addFragmentToActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       addFragmentToActivity(supportFragmentManager, MainFragment(), R.id.mainContainer_FL)
    }
}
