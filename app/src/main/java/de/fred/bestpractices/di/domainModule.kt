package de.fred.bestpractices.di

import de.fred.bestpractices.domain.TestInteractorImpl
import org.koin.dsl.module

val domainModule = module{
    factory {TestInteractorImpl(getProperty("someMessage"))}
}