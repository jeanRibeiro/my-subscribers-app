package br.com.douglasmotta.mysubscribers.data.db.dao

import br.com.douglasmotta.mysubscribers.data.db.entity.SubscriberEntity

interface SubscriberRealmDAO {

    suspend fun insertSubscriber(subscriberEntity: SubscriberEntity): Long

    suspend fun updateSubscriber(subscriberEntity: SubscriberEntity)
}