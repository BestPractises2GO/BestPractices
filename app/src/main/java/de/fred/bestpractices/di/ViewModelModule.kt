package de.fred.bestpractices.di

import de.fred.bestpractices.ui.main.MainFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel { MainFragmentViewModel()}
}