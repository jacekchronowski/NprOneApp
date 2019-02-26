package jc.highapp.nproneapp.animations

import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation

fun View.startFadeOutAnimation(durationTime: Long) {
    startAnimation(
        AlphaAnimation(1.0f, 0.0f).apply {
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationEnd(p0: Animation?) {
                    visibility = View.GONE
                }

                override fun onAnimationRepeat(p0: Animation?) = Unit
                override fun onAnimationStart(p0: Animation?) = Unit

            })
            duration = durationTime
            fillAfter = true
        })

}