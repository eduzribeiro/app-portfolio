package me.dio.portfoliogithub

import android.app.Application
import me.dio.portfoliogithub.data.di.DataModule
import me.dio.portfoliogithub.domain.di.DomainModule
import me.dio.portfoliogithub.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}