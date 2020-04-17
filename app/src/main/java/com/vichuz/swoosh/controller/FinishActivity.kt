package com.vichuz.swoosh.controller

import android.os.Bundle
import com.vichuz.swoosh.R
import com.vichuz.swoosh.controller.model.Player
import com.vichuz.swoosh.controller.utilities.EXTRA_PLAYER

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableArrayExtra(EXTRA_PLAYER)

    }
}
