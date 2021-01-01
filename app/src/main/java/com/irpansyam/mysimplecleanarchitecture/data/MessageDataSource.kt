package com.irpansyam.mysimplecleanarchitecture.data

import com.irpansyam.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity (
            "Hello $name! Welcome to Clean Architecture"
    )
}