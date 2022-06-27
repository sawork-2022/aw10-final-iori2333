package com.micropos.cart.service

import com.micropos.cart.models.Cart
import com.micropos.cart.models.PriceEntry
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

sealed interface CartService {
  fun getCart(): Mono<Cart>
  fun clearCart(): Mono<Boolean>
  fun addToCart(product: String, quantity: Int): Mono<Boolean>
  fun removeFromCart(product: String, quantity: Int): Mono<Boolean>
  fun modifyCart(product: String, quantity: Int): Mono<Boolean>
  fun countCart(): Flux<PriceEntry>
}
