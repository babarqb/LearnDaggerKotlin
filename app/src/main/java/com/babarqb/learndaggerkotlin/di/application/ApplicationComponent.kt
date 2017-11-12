package com.babarqb.learndaggerkotlin.di.application

import com.babarqb.learndaggerkotlin.App
import dagger.Component

/**
 * Created by babarqb on 11/11/2017.
 */

@ApplicationScope
@Component(modules = arrayOf(ApplicationModule::class))
 interface ApplicationComponent {

     fun inject(app: App)
}

//@ApplicationScope
//@Component(modules = { ApplicationModule.class })
//public interface ApplicationCompnent{
//
//}