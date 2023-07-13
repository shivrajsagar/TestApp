package com.joy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import com.joy.joyfillandroid.LongText
import com.joy.joyfillandroid.NumberField
import com.joy.joyfillandroid.ShortField
import com.joy.joyfillandroid.TextField

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayout:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayout = findViewById(R.id.layout)
        linearLayout.setVerticalGravity(LinearLayout.VERTICAL)
        linearLayout.gravity = Gravity.CENTER_VERTICAL


        val shortField = ShortField(this)
        val textField = TextField(this)
        val longText = LongText(this)

        linearLayout.addView(textField)
        linearLayout.addView(shortField)

        linearLayout.addView(longText)

        linearLayout.addView(NumberField(this))

    }
}