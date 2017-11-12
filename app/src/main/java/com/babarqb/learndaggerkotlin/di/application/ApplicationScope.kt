package com.babarqb.learndaggerkotlin.di.application

import java.lang.annotation.RetentionPolicy
import java.lang.annotation.RetentionPolicy.*
import javax.inject.Scope


@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationScope

//@Scope
//@Retention(RetentionPolicy.RUNTIME)
//public @interface ApplicatonScope{}