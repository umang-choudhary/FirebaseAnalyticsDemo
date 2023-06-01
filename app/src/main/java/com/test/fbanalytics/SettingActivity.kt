package com.test.fbanalytics

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.fbanalytics.databinding.ActivitySettingBinding

class SettingActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnChangePassword.setOnClickListener {
            val intent = Intent(this@SettingActivity, ChangePasswordActivity::class.java)
            startActivity(intent)
        }

        binding.btnNews.setOnClickListener {
            val intent = Intent(this@SettingActivity, TabNewsActivity::class.java)
            startActivity(intent)
        }
    }
}