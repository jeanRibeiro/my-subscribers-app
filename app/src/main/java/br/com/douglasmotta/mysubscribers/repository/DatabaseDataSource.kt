package br.com.douglasmotta.mysubscribers.repository

import br.com.douglasmotta.mysubscribers.data.db.dao.SubscriberRoomDAO
import br.com.douglasmotta.mysubscribers.data.db.entity.SubscriberEntity

class DatabaseDataSource(private val subscriberRoomDAO: SubscriberRoomDAO) : SubscriberRepository {

    override suspend fun insertSubscriber(name: String, email: String): Long {
        val subscriber = SubscriberEntity(
            name = name,
            email = email
        )

        return subscriberRoomDAO.insert(subscriber)
    }

    override suspend fun updateSubscriber(id: Long, name: String, email: String) {
        val subscriber = SubscriberEntity(
            id = id,
            name = name,
            email = email
        )

        subscriberRoomDAO.update(subscriber)
    }

    override suspend fun deleteSubscriber(id: Long) {
        subscriberRoomDAO.delete(id)
    }

    override suspend fun deleteAllSubscribers() {
        subscriberRoomDAO.deleteAll()
    }

    override suspend fun getAllSubscribers(): List<SubscriberEntity> {
        return subscriberRoomDAO.getAll()
    }
}