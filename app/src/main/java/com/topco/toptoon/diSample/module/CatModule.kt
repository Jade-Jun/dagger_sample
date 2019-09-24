package com.topco.toptoon.diSample.module

import com.topco.toptoon.diSample.model.Cat
import dagger.Module
import dagger.Provides

/**
 * Cat 객체를 생서유하여 제공할 모듈
 */
@Module
object CatModule {
    @Provides
    fun provideCat() = Cat()
}