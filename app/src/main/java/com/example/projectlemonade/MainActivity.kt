package com.example.projectlemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView:ImageView=findViewById(R.id.imageView)
        var i=1
        val randRange=(2..12).random()
        imageView.setOnClickListener(){
            if(imageView.drawable.constantState==resources.getDrawable(R.drawable.tree).constantState){
                imageView.setImageResource(R.drawable.half_lemon)
            }
            else if(imageView.drawable.constantState==resources.getDrawable(R.drawable.half_lemon).constantState){
                if(i<=randRange){
                    Toast.makeText(this,"Squeeze ${i} times",Toast.LENGTH_SHORT).show()
                    i++
                }
                else{
                    imageView.setImageResource(R.drawable.lemon_juice)
                }
            }
            else if(imageView.drawable.constantState==resources.getDrawable(R.drawable.lemon_juice).constantState){
                imageView.setImageResource(R.drawable.empty_glass)
            }
            else if(imageView.drawable.constantState==resources.getDrawable(R.drawable.empty_glass).constantState){
                imageView.setImageResource(R.drawable.tree)
                i=1
            }
        }
    }
}