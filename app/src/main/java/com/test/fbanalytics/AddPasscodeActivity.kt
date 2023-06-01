package com.test.fbanalytics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.fbanalytics.databinding.ActivityAddPasscodeBinding

class AddPasscodeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddPasscodeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPasscodeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}