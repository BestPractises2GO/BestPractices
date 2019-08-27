package de.fred.bestpractices.domain

import android.util.Log
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject

class TestInteractorImpl @AssistedInject constructor(
    @Assisted val message: String
) {

    fun test() {
        Log.d("test", message)
    }


    @AssistedInject.Factory
    internal interface Factory {
        fun create(bar: String): TestInteractorImpl
    }
}