package de.fred.bestpractices.common

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager


fun addFragmentToActivity(manager: FragmentManager, fragment: Fragment, frameId: Int) {
    val transaction = manager.beginTransaction()
    transaction.add(frameId, fragment)
    transaction.commit()
}