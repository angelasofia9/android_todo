package com.example.myapplication

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.myapplication.Data.SharedPreferencesManager
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding
private lateinit var  sharedPref: SharedPreferencesManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        sharedPref = SharedPreferencesManager(this
        )
        val user= sharedPref.getUser()
        val boolean= sharedPref.getBoolean()
        if(boolean)
        Toast.makeText(this,user,Toast.LENGTH_SHORT).show()
        initUI()
        Toast.makeText(this,"$boolean",)

    }

    private fun initUI() {
        setupOnClickListener()
    }

    private fun setupOnClickListener  {
        binding.loginButton.setOnClickListener{
            val user = binding.txtusuario.text.toString()
            val pass= binding.txtcontraseña.text.toString()

            val intent = Intent( )
        }






        sharedPref.saveUser(user)



        //<Button>(R.id.bottom).setOnClickListener {
        Toast.makeText(  this,  "hola mundo", Toast.LENGTH_SHORT).show()
    }
}