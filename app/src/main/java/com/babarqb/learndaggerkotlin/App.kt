package com.babarqb.learndaggerkotlin

import android.app.Application
import android.support.annotation.UiThread
import com.babarqb.learndaggerkotlin.di.application.ApplicationComponent
import com.babarqb.learndaggerkotlin.di.application.ApplicationModule
import com.babarqb.learndaggerkotlin.di.application.DaggerApplicationComponent

/**
 * Created by babarqb on 11/11/2017.
 */
class App: Application() {
   val component:ApplicationComponent by lazy {
       DaggerApplicationComponent.builder()
               .applicationModule(ApplicationModule(this))
               .build()
   }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}