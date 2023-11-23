package com.example.myapplication.Data

import android.content.Context
import  android.content.SharedPreferences

class SharedPreferencesManager( private var context:Context) {

    private  val name_database= "ME_DATA_BASE"

    private  val sharedPreferences: SharedPreferences by lazy {
       context.getSharedPreferences( name_database,Context.MODE_PRIVATE)
    }




    fun saveUser(user: String){
        var editor = sharedPreferences.edit()
        editor.putString("keyUserPref", user)
        editor.apply()

    }

    fun saveBoolean(){
        val editor = sharedPreferences.edit()
        editor.putBoolean("miboolean", true)
        editor.apply()
    }
    fun getUser():String{
        return sharedPreferences.getString("KeyUserPref", "Empty").toString()

    }

    fun getBoolean(): Boolean{
        sharedPreferences.getBoolean("miboolean",false)
    }
}