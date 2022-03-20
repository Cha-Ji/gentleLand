package com.gdsc.gentleland.di.module

import com.gdsc.gentleland.di.provider.DispatcherProvider
import com.gdsc.gentleland.di.provider.DispatcherProviderImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface DispatcherModule {

    @Binds
    fun bindDispatcherModule(provider: DispatcherProviderImpl): DispatcherProvider
}