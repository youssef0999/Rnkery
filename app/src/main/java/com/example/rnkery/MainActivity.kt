package com.example.rnkery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment2 = WeightsFragment()
        val transaction2 = supportFragmentManager.beginTransaction()
        transaction2.replace(R.id.container, fragment2)
        transaction2.commit()

        val fragment3 = RankingsFragment()
        val transaction3 = supportFragmentManager.beginTransaction()
        transaction3.replace(R.id.container, fragment3)
        transaction3.commit()

        val fragment = HomeFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()

        //NAVBAR
        title = resources.getString(R.string.title_rankings)
        loadFragment(HomeFragment())
        navigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_rankings -> {
                    title = resources.getString(R.string.title_rankings)
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_contact -> {
                    title = resources.getString(R.string.title_contact)
                    loadFragment(ContactFragment())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false

        }
    }

    private fun loadFragment(fragment: Fragment) {
        // load fragment
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}

