package ru.netology.data.post

import ru.netology.Donut
import ru.netology.data.attachment.Attachment
import ru.netology.data.comments.Comment

internal data class Post(
    val id: Int = 0,
    val ownerId: Int = 2,
    val fromId: Int = 3,
    val createdBy: Int = 4,
    val date: Int = 1648641285,
    val text: String? = null,
    val replyOwnerId: Int? = null,
    val replyPostId: Int? = null,
    val friendsOnly: Int? = null,
    val copyright: Copyright? = null,
    val likes: Likes? = null,
    val reposts: Reposts? = null,
    val views: Views? = null,
    val postType: String? = null,
    val signerId: Int? = null,
    val canPin: Boolean? = null,
    val canDelete: Boolean? = null,
    val canEdit: Boolean? = null,
    val isPinned: Int? = null,
    val markedAsAds: Boolean? = null,
    val isFavorite: Boolean? = null,
    val donut: Donut? = null,
    val postponedId: Int? = null,
    var arrayAttachments: Array<Attachment> = emptyArray(),
)
