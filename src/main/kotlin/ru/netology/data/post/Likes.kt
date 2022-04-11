package ru.netology.data.post

internal data class Likes(
    val count: UInt,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean,

    )