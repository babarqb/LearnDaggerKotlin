package com.babarqb.learndaggerkotlin.di.application

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val mApplication: Application) {

    @Provides
    @ApplicationScope
    internal fun application(): Application = mApplication
}

// Java Code

//@Module
//public class ApplicationModule {
//    private final Application mApplication;
//
//    public ApplicationModule(Application application) {
//        mApplication = application;
//    }
//
//    @Provides
//    @ApplicationScope
//    Application application(){
//        return mApplication;
//    }
//}