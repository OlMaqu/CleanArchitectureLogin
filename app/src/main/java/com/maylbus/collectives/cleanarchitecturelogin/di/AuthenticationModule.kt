package com.maylbus.collectives.cleanarchitecturelogin.di

import com.maylbus.collectives.cleanarchitecturelogin.repository.auth.AuthenticationProvider
import com.maylbus.collectives.cleanarchitecturelogin.repository.auth.AuthenticationRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AuthenticationModule {

    @Provides
    fun provideAuthenticationRepository(): AuthenticationProvider = AuthenticationRepository()
}