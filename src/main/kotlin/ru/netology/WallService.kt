package ru.netology

import ru.netology.data.post.Post

internal class WallService {

    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += if (posts.isEmpty()) post.copy(id = 1) else post.copy(id = posts.last().id + 1)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, value) in posts.withIndex()) {
            if (post.id == value.id) {
                posts[index] = post.copy(ownerId = value.ownerId, date = value.date)
                return true
            }
        }
        return false
    }
}
