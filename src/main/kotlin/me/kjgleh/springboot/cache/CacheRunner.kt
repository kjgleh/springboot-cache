package me.kjgleh.springboot.cache

import me.kjgleh.springboot.cache.service.FindProductService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class CacheRunner(
    private val findProductService: FindProductService
) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
//        val products = findProductService.findAll()
//        products.forEach {
//            println(it.id)
//        }

        findProductService.deleteCache()
    }
}
