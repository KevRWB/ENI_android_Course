package com.example.mod6permissionstp

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {

    val requestPermissionLauncher =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                call()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonCall).setOnClickListener(){
            if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)==
                     PackageManager.PERMISSION_GRANTED){
                call()
            }else{
                requestPermissionLauncher.launch(Manifest.permission.CALL_PHONE)
            }
        }
    }

    fun call(){
        val intentCall = Intent(Intent.ACTION_CALL)
        intentCall.data = Uri.parse("tel:+33612121212")
        startActivity(intentCall)
    }

}