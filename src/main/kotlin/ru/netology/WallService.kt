package ru.netology

import ru.netology.data.attachment.Attachment
import ru.netology.data.comments.Comment
import ru.netology.data.exception.PostNotFoundException
import ru.netology.data.post.Post

internal class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

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

    fun createComment(comment: Comment): Boolean {
        for (arrayId in posts)
            if (arrayId.id == comment.postId) {
                comments += comment
                return true
            }
        throw PostNotFoundException("Невозможно добавить комментарий, поста с таким id не существует")
    }

}
