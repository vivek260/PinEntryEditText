package com.example.myapplication

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    var currentFocusIndex = 0
    private var binding: ActivityMainBinding? = null
    var blink_anim: Animation? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        blink_anim = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.blink);
        binding?.tv1?.text ="|"
        binding?.tv1?.startAnimation(blink_anim)
        binding?.et?.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                when (s.length) {
                    1 -> {
                        binding?.tv1?.clearAnimation()
                        binding?.tv1?.text = s.takeLast(1)
                        binding?.tv2?.text ="|"
                        binding?.tv2?.startAnimation(blink_anim)
                    }
                    2 -> {
                        binding?.tv2?.clearAnimation()
                        binding?.tv2?.text = s.takeLast(1)
                        binding?.tv3?.text = "|"
                        binding?.tv3?.startAnimation(blink_anim)
                    }
                    3 -> {
                        binding?.tv3?.clearAnimation()
                        binding?.tv3?.text = s.takeLast(1)
                        binding?.tv4?.text = "|"
                        binding?.tv4?.startAnimation(blink_anim)
                    }
                    4 -> {
                        binding?.tv4?.clearAnimation()
                        binding?.tv4?.text = s.takeLast(1)
                    }
                }
                if (currentFocusIndex < s.length) {
                    ++currentFocusIndex
                } else {
                    removeLastPin(currentFocusIndex)
                    --currentFocusIndex
                }
            }
        })
    }

    private fun removeLastPin(index: Int) {
        when (index) {
            1 -> {
                binding?.tv1?.text = "|"
                binding?.tv2?.clearAnimation()
                binding?.tv2?.text = ""
                binding?.tv1?.startAnimation(blink_anim)
            }
            2 -> {
                binding?.tv2?.text = "|"
                binding?.tv3?.clearAnimation()
                binding?.tv3?.text = ""
                binding?.tv2?.startAnimation(blink_anim)
            }
            3 -> {
                binding?.tv3?.text = "|"
                binding?.tv4?.clearAnimation()
                binding?.tv4?.text = ""
                binding?.tv3?.startAnimation(blink_anim)
            }
            4 -> {
                binding?.tv4?.text = "|"
                binding?.tv4?.startAnimation(blink_anim)
            }
        }
    }

}