package com.test.fbanalytics

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.fbanalytics.databinding.ActivityChangePasswordBinding

class ChangePasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChangePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePasswordBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnAddPasscode.setOnClickListener {
            val intent = Intent(this@ChangePasswordActivity, AddPasscodeActivity::class.java)
            startActivity(intent)
        }
    }
}