package com.lenzz.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {
//Intialise the Variables
    lateinit var btnAdd: Button
    lateinit var btnSubstraction: Button
    lateinit var btnMultiplicatio: Button
    lateinit var btnDivision: Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Giving the ids
        btnAdd= findViewById(R.id.btn_add)
        btnSubstraction= findViewById(R.id.btn_substraction)
        btnMultiplicatio= findViewById(R.id.btn_multiplication)
        btnDivision= findViewById(R.id.btn_division)
        etA= findViewById(R.id.et_a)
        etB= findViewById(R.id.et_b)
        resultTv= findViewById(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnSubstraction.setOnClickListener(this)
        btnMultiplicatio.setOnClickListener(this)
        btnDivision.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var a=etA.text.toString().toDouble()
        var b=etB.text.toString().toDouble()
        var result=0.0

        when(v?.id){
            R.id.btn_add ->{
                result=a+b
            }
            R.id.btn_substraction ->{
                result=a-b
            }
            R.id.btn_multiplication ->{
                result=a*b
            }
            R.id.btn_division ->{
                result=a/b
            }
        }
        resultTv.text="Resultis $result"
    }
}

class view {

}
