package de.fred.bestpractices.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import de.fred.bestpractices.ui.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainFragmentViewModel : BaseViewModel(){

    val exampleText = MutableLiveData<String>().apply { value = "test" }

    fun init(){
        viewModelScope.launch {
            var newValue = 1
            withContext(Dispatchers.IO){
                for(i in 1  until 200000){
                    newValue = i
                }
            }
            exampleText.value = "Der neue Wert ist: $newValue"
        }
    }
}