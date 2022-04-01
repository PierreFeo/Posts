package ru.netology

import kotlin.random.Random
import kotlin.random.nextUInt

internal class WallService {

    var posts = emptyArray<Post>()
    private var newID = 0

    fun add(post: Post): Post {
        newID += 1
        posts += post.copy(id = newID, text = "Мой первый пост")
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, value) in posts.withIndex()) {
            if (post.id == value.id) {
                newID += 1
                posts[index] = post.copy(
                    id = newID,
                    ownerId = value.ownerId,
                    fromId = 12,
                    createdBy = 6,
                    date = value.date,
                    text = "Новый текст",
                    replyOwnerId = 11,
                    replyPostId = 4,
                    friendsOnly = 1,
                    Comments(2u, canPost = false, groupsCanPost = true, canClose = false, canOpen = false),
                    Copyright(3, "yandex.com", "Иванов", "CD"),
                    Likes(2u, userLikes = false, canLike = false, canPublish = true),
                    Reposts(1u, false),
                    Views(1u),
                    postType = "4",
                    signerId = 2,
                    canPin = false,
                    canDelete = false,
                    canEdit = false,
                    isPinned = 8,
                    markedAsAds = false,
                    isFavorite = false,
                    Donut(false, 14, Placeholder("GOLD"), false, "Текст"),
                    postponedId = 3
                )
                return true
            }
        }
        return false
    }
}
