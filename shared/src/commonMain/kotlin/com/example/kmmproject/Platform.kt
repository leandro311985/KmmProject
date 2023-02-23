package com.example.kmmproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

//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