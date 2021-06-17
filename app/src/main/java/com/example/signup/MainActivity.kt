package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var sign:TextView
    lateinit var name:TextView
    lateinit var email:TextView
    lateinit var passWard:TextView
    lateinit var passWard2:TextView
    lateinit var phone:TextView
    lateinit var gender:Spinner
    lateinit var check:Button
    lateinit var text:TextView
    lateinit var  signUp:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        castView()
        clickSignUp()
    }
    fun castView(){
        setContentView(R.layout.activity_main)
         sign=findViewById(R.id.etSignUp)
         name=findViewById(R.id.etName)
         email=findViewById(R.id.etEmail)
         passWard=findViewById(R.id.etPass2)
         passWard2=findViewById(R.id.etPassward2)
         check=findViewById(R.id.etcheckBox)
         phone=findViewById(R.id.etPhone)
         text=findViewById(R.id.etText)
        signUp=findViewById(R.id.btnSign)
        gender=findViewById(R.id.etSpinner)
        var genders=arrayOf("select gender", "Female", "Male")
        var genderAdapter = ArrayAdapter(baseContext, android.R.layout.simple_spinner_item, genders)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        gender.adapter=genderAdapter


    }
    fun clickSignUp(){
        signUp.setOnClickListener {
            var sign=sign.text.toString()
            var name=name.text.toString()
            var email=email.text.toString()
            var passWard=passWard.text.toString()
            var passWard2=passWard2.text.toString()
            var check=check.text.toString()
            var phone=phone.text.toString()
            var text=text.text.toString()
            var gender=""
            var intent=Intent(baseContext,Login::class.java)
            startActivity(intent)
        }
    }


}