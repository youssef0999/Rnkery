package com.example.rnkery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = RankingsFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()

        //NAVBAR
        title = resources.getString(R.string.title_rankings)
        loadFragment(RankingsFragment())
        navigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_rankings -> {
                    title = resources.getString(R.string.title_rankings)
                    loadFragment(RankingsFragment())
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

