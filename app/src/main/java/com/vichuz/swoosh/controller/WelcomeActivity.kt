package com.vichuz.swoosh.controller

import android.content.Intent
import android.os.Bundle
import com.vichuz.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        leagueNextBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
