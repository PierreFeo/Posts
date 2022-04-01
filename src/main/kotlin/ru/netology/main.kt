package ru.netology

fun main() {
    val wllService = WallService()
    val post = Post(
        0,
        2,
        3,
        4,
        1648641285,
        "Эта запись выглядит пустой",
        7,
        2,
        0,
        Comments(1u, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
        Copyright(2, "vk.com", "Дуров", "CD"),
        Likes(1u, userLikes = true, canLike = true, canPublish = true),
        Reposts(2u, true),
        Views(2u),
        "4",
        5,
        canPin = true,
        canDelete = true,
        canEdit = false,
        isPinned = 9,
        markedAsAds = true,
        isFavorite = true,
        Donut(true, 12, Placeholder("У вас нет подписки"), true, "Текст"),
        postponedId = 3
    )
    println(wllService.add(post))
    println(wllService.update(post))


}