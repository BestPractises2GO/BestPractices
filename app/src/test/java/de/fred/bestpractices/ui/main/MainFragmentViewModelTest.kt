package de.fred.bestpractices.ui.main

import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.argumentCaptor
import com.nhaarman.mockitokotlin2.atLeastOnce
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import de.fred.bestpractices.base.BaseMVVMTestRules
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldEqual
import org.junit.Test

class MainFragmentViewModelTest : BaseMVVMTestRules() {

    private fun createSut() = MainFragmentViewModel()

    @Test
    fun init() {
        runBlocking {
            //GEGEBEN ViewModel
            val sut = createSut()
            val observer: Observer<String> = mock()
            sut.exampleText.observeForever(observer)
            //WENN Init durchgeführt wird
            sut.initialize().join()

            //DANN Sind die Werte korrekt
            argumentCaptor<String>().apply {
                verify(observer, atLeastOnce()).onChanged(capture())
                firstValue shouldEqual "test"
                lastValue shouldEqual "Der neue Wert ist: 199999"
            }
        }
    }
}