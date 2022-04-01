package ru.netology

import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {
    @Test
    fun updatePostTrue() {

        val service = WallService()

        service.add(
            Post(
                1,
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
        )
        service.add(
            Post(
                2,
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
        )


        val update = Post(
            id = 3,
            ownerId = 2,
            fromId = 12,
            createdBy = 6,
            date = 1648641285,
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


        val result = service.update(update)
        result

        assertFalse(result)
    }


    @Test
    fun updatePostFalse() {

        val service = WallService()

        service.add(
            Post(
                1,
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
        )
        service.add(
            Post(
                2,
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
        )


        val update = Post(
            id = 3,
            ownerId = 2,
            fromId = 12,
            createdBy = 6,
            date = 1648641285,
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


        val result = service.update(update)
        result

        assertTrue(result)
    }

    @Test
    fun testAdd() {
        val service = WallService()
        service.add(
            Post(
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
        )
        val result = service.posts.last().id
        val test = result != 0
        assertTrue(test)
    }

}





