package com.irpansyam.mysimplecleanarchitecture.di

import com.irpansyam.mysimplecleanarchitecture.data.IMessageDataSource
import com.irpansyam.mysimplecleanarchitecture.data.MessageDataSource
import com.irpansyam.mysimplecleanarchitecture.data.MessageRepository
import com.irpansyam.mysimplecleanarchitecture.domain.IMessageRepository
import com.irpansyam.mysimplecleanarchitecture.domain.MessageInteractor
import com.irpansyam.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository{
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}