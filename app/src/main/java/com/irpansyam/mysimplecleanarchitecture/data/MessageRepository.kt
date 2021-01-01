package com.irpansyam.mysimplecleanarchitecture.data

import com.irpansyam.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}
