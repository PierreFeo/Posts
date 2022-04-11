package ru.netology.data.comments

data class Comment(
    val ownerId: Int,  // Идентификатор владельца заметки
    val postId: Int, //идентификатор записи на стене.
    val message: String, //текст комментария
)