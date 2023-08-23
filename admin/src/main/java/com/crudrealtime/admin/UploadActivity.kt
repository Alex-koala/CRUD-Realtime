package com.crudrealtime.admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class UploadActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload)

        binding.saveButton.setOnClickListener{
            val name = binding.uploadName.text.toString()
        }

    }
}