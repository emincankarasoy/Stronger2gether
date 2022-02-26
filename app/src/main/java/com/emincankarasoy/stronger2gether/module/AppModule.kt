package com.emincankarasoy.stronger2gether.module

import android.app.Activity
import android.app.AlertDialog
import com.emincankarasoy.stronger2gether.R

fun Activity.checkExitRequest(){
    val activity = this
    AlertDialog.Builder(this).apply {
        setTitle("Warning!")
        setMessage("Are you sure you want to exit?")
        setPositiveButton(R.string.yes){ _, _ ->
            activity.finish()
        }
        setNegativeButton(R.string.no){ _ , _ ->

        }
        create()
    }.show()
}
