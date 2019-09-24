package com.topco.toptoon.diSample.module

import com.topco.toptoon.diSample.model.Dog
import dagger.Module
import dagger.Provides

@Module
object DogModule {
    @Provides
    fun provideDog() = Dog()
}