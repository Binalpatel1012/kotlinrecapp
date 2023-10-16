package com.example.kotlinrecapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform