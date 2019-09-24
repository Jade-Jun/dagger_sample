package com.topco.toptoon.diSample.component

import com.topco.toptoon.diSample.MainActivity
import com.topco.toptoon.diSample.module.CatModule
import com.topco.toptoon.diSample.module.DogModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DogModule::class, CatModule::class])
interface PetComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        fun build() : PetComponent

        fun dogModule(dogModule : DogModule) : Builder
        fun catModule(catModule: CatModule) : Builder


    }
}