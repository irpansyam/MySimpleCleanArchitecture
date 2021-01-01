package com.irpansyam.mysimplecleanarchitecture.data

import com.irpansyam.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}