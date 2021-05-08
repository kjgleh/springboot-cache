package me.kjgleh.springboot.cache.service

import me.kjgleh.springboot.cache.domain.Product
import me.kjgleh.springboot.cache.repository.ProductRepository
import org.springframework.cache.annotation.CacheEvict
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class FindProductService(
    private val productRepository: ProductRepository
) {

    @Cacheable("products")
    fun findAll(): List<Product> {
        return productRepository.findAll()
    }

    @CacheEvict("products")
    fun deleteCache() {
    }
}
