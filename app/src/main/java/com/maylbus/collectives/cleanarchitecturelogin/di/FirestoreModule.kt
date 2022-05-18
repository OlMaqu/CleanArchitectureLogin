package com.maylbus.collectives.cleanarchitecturelogin.di

import com.maylbus.collectives.cleanarchitecturelogin.repository.firestore.FirestoreProvider
import com.maylbus.collectives.cleanarchitecturelogin.repository.firestore.FirestoreRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object FirestoreModule {

    @Provides
    fun providesFirestoreRepository(): FirestoreProvider = FirestoreRepository()
}