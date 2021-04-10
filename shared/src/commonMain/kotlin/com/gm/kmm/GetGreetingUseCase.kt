package com.gm.kmm

class GetGreetingUseCase(private val repository: PlatformRepo) {

    fun invoke(): String = "Hello, ${repository.getPlatform()}!"
}
