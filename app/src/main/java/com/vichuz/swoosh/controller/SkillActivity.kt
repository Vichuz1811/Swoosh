package com.vichuz.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.vichuz.swoosh.R
import com.vichuz.swoosh.controller.model.Player
import com.vichuz.swoosh.controller.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }




    fun onBeginnerClicked(view: View) {
        intermediateBtn.isChecked = false

        player.skill = "beginner"
    }

    fun onIntermediateClicked(view: View) {
        beginnerbtn.isChecked = false

        player.skill = "intermediate"
    }

    fun skillFinishClicked(view: View) {

        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }

        else {
            Toast.makeText(this, "Select any one of the level", Toast.LENGTH_SHORT).show()
        }

    }
}


