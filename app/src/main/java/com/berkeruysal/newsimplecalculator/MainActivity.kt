package com.berkeruysal.newsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.berkeruysal.newsimplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var sayi1:Int?=null
    var sayi2:Int?=null
    var sayilar:Sayilar?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun mySum(view:View)
    {
    sayi1=binding.editText.text.toString().toIntOrNull()
    sayi2=binding.editText2.text.toString().toIntOrNull()
        if(sayi1==null || sayi2==null)
        {
            binding.textView.text="ERROR!"
        }
        else
        {
            var sayilar=Sayilar(sayi1,sayi2)

            binding.textView.text="Sonuc=${sayilar.sayi1!!+sayilar.sayi2!!}"
        }
    }
    fun mySub(view: View)
    {
        sayi1=binding.editText.text.toString().toIntOrNull()
        sayi2=binding.editText2.text.toString().toIntOrNull()
        if (sayi1==null || sayi2==null)
        {
            binding.textView.text="ERROR!"
        }
        else{
            var sayilar=Sayilar(sayi1,sayi2)
            binding.textView.text="Sonuc=${sayilar.sayi1!!-sayilar.sayi2!!}"
        }

    }
    fun myMultiply(view: View)
    {
        sayi1=binding.editText.text.toString().toIntOrNull()
        sayi2=binding.editText2.text.toString().toIntOrNull()
        if (sayi1==null||sayi2==null)
        {
            binding.textView.text="ERROR!"
        }
        else {
            var sayilar=Sayilar(sayi1,sayi2)
            binding.textView.text = "Sonuc=${sayilar.sayi1!! * sayilar.sayi2!!}"

        }
    }
    fun myDiv(view: View)
    {
        sayi1=binding.editText.text.toString().toIntOrNull()
        sayi2=binding.editText2.text.toString().toIntOrNull()
        if (sayi1==null || sayi2==null)
        {
            binding.textView.text="ERROR!"
        }
        else
        {
        var sayilar=Sayilar(sayi1,sayi2)
        binding.textView.text="Sonuc=${sayilar.sayi1!!/sayilar.sayi2!!}"}
    }
}