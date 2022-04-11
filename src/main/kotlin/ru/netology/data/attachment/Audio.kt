package ru.netology.data.attachment

data class Audio(
    val id: Int = 0,
    val ownerId: Int = 0,
    val artist: String? = null,
    val title: String? = null,
    val duration: Int = 0,
    val url: String? = null
)