package ru.netology

import ru.netology.data.attachment.Audio
import ru.netology.data.attachment.AudioAttachment
import ru.netology.data.post.Post


fun main() {
    val wllService = WallService()
    val post = Post()
    val newPost = Post(id = 1, text = "Новый пост")

    println(wllService.add(post))
    println(wllService.add(post))

    println(wllService.update(newPost))
}