package com.topco.toptoon.diSample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.topco.toptoon.diSample.component.DaggerPetComponent
import com.topco.toptoon.diSample.model.Cat
import com.topco.toptoon.diSample.model.Dog
import com.topco.toptoon.diSample.module.CatModule
import com.topco.toptoon.diSample.module.DogModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var cat : Cat

    @Inject
    lateinit var dog : Dog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectComponent()
        initButton()
    }

    private fun injectComponent() {
        DaggerPetComponent.builder()
            .catModule(CatModule)
            .dogModule(DogModule)
            .build()
            .inject(this)
    }

    private fun initButton() {
        btn_dog.setOnClickListener {
            main_text.text = dog.dogName
        }

        btn_cat.setOnClickListener {
            main_text.text = cat.catName
        }
    }
}
