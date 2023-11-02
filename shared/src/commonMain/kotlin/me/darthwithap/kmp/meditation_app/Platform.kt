package me.darthwithap.kmp.meditation_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform