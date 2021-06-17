package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    lateinit var  logIn:TextView
    lateinit var  email:TextView
    lateinit var  passWard:TextView
    lateinit var  contact:TextView
    lateinit var result:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        castView()
        click()
    }
    fun castView(){
        logIn=findViewById(R.id.etLogIn)
        email=findViewById(R.id.etemail)
        passWard=findViewById(R.id.etPass2)
        contact=findViewById(R.id.etContact)
        result=findViewById(R.id.etbtn2)
    }
    fun click(){
        result.setOnClickListener {
            var log=logIn.text.toString()
            var email=email.toString()
            var passWard=passWard.text.toString()
            var contact=contact.text.toString()
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }

}