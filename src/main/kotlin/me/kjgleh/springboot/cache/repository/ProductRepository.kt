package me.kjgleh.springboot.cache.repository

import me.kjgleh.springboot.cache.domain.Product
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class ProductRepository {

    fun findAll(): List<Product> {
        println("@@@@ ProductRepository @@@@@")
        return listOf(
            Product(
                id = "1",
                name = UUID.randomUUID().toString()
            ),
            Product(
                id = "2",
                name = UUID.randomUUID().toString()
            )
        )
    }
}
