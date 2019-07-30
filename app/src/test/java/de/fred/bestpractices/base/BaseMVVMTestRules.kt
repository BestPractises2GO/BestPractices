package de.fred.bestpractices.base

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import de.fred.bestpractices.rules.CoroutinesTestRule
import org.junit.Rule
import org.junit.rules.TestRule

open class BaseMVVMTestRules{
    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    @get:Rule
    var coroutinesTestRule = CoroutinesTestRule()
}