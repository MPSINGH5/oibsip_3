package com.example.basic_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add: Button=findViewById(R.id.ADD)
        val sub: Button=findViewById(R.id.SUB)
        val multiply: Button=findViewById(R.id.MULTIPLY)
        val divide: Button=findViewById(R.id.DIVIDE)
        val Number1:TextView=findViewById(R.id.Number1_Container)
        val Number2:TextView=findViewById(R.id.Number2_Container)
        val result: TextView=findViewById(R.id.Result)

        add.setOnClickListener{



            if(Number1.getText().toString().equals("") || Number2.getText().toString().equals("")||Number1.getText().toString().equals("-")||Number2.getText().toString().equals("-")|| Number1.getText().toString().equals(".")|| Number2.getText().toString().equals("."))
            { result.text="Input first"  }
            else

            {  val num1:Double= Number1.text.toString().toDouble()
            val num2: Double=Number2.text.toString().toDouble()
            result.text=(num1+num2).toString()}




        }
        sub.setOnClickListener{
            if(Number1.getText().toString().equals("") || Number2.getText().toString().equals("")||Number1.getText().toString().equals("-")||Number2.getText().toString().equals("-")|| Number1.getText().toString().equals(".")|| Number2.getText().toString().equals("."))
            { result.text="Input first"  }
            else{
            val num1:Double= Number1.text.toString().toDouble()
            val num2: Double=Number2.text.toString().toDouble()


                result.text=(num1-num2).toString()}


        }
        multiply.setOnClickListener{
            if(Number1.getText().toString().equals("") || Number2.getText().toString().equals("") || Number1.getText().toString().equals("-")||Number2.getText().toString().equals("-")|| Number1.getText().toString().equals(".")|| Number2.getText().toString().equals("."))
            { result.text="Input first"  }
            else
            {val num1:Double= Number1.text.toString().toDouble()
            val num2: Double=Number2.text.toString().toDouble()

                result.text=(num1*num2).toString()}


        }
        divide.setOnClickListener{
            if(Number1.getText().toString().equals("") || Number2.getText().toString().equals("")||Number1.getText().toString().equals("-")||Number2.getText().toString().equals("-")|| Number1.getText().toString().equals(".")|| Number2.getText().toString().equals("."))
            { result.text="Input first"  }
            else
            {
                val num1:Double= Number1.text.toString().toDouble()
            val num2: Double=Number2.text.toString().toDouble()
                if(num2.equals(0.0) || num2.equals(-0.0))
                result.text="Invalid Input"
                else
                result.text=(num1/num2).toString()}


        }
        



    }
}