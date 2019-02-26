package jc.highapp.nproneapp.splash.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import jc.highapp.nproneapp.R

class SplashLoadingView : RelativeLayout {

    constructor(context: Context?) : super(context, null, 0)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {

        LayoutInflater.from(context).inflate(R.layout.splash_loading_view_layout, this, true)
        setBackgroundColor(resources.getColor(R.color.splash_background_color))
    }

}