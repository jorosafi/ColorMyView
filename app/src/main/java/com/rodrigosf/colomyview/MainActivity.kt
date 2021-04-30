package com.rodrigosf.colomyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rodrigosf.colomyview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setActionListener()
    }

    //Generates action listener for different boxes in layout
    private fun setActionListener() {
        val boxes: List<View> =
            listOf(binding.boxOneText,
                binding.boxTwoText,
                binding.boxThreeText,
                binding.boxFourText,
                binding.boxFiveText,
                binding.constraintLayout)

        for (view in boxes) {
           view.setOnClickListener{
               changeBackground(it)
           }
        }
    }

    //Changes the background color of box that is clicked on
    private fun changeBackground(view: View) {
        when(view.id) {
            R.id.box_one_text -> binding.boxOneText.setBackgroundColor(Color.CYAN)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.YELLOW)

            else -> view.setBackgroundColor(Color.DKGRAY)
        }
    }
}