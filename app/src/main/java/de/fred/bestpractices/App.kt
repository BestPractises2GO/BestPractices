package de.fred.bestpractices

import android.app.Application
import de.fred.bestpractices.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate(){
        super.onCreate()
        // start Koin!
        startKoin {
            // Android context
            androidContext(this@App)
            // modules
            modules(viewModelModule)
        }
    }
}