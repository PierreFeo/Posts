package ru.netology

import org.junit.Test
import org.junit.Assert.*
import ru.netology.data.comments.Comment
import ru.netology.data.exception.PostNotFoundException
import ru.netology.data.post.Post

class WallServiceTest {
    @Test
    fun updatePostTrue() {
        val service = WallService()

        service.add(
            Post(id = 1)
        )
        service.add(
            Post(id = 2)
        )
        val update = Post(id = 1)
        val result = service.update(update)
        assertTrue(result)
    }


    @Test
    fun updatePostFalse() {

        val service = WallService()

        service.add(
            Post(id = 1)
        )
        service.add(
            Post(id = 2)
        )
        val update = Post(id = 3)
        val result = service.update(update)
        assertFalse(result)
    }

    @Test
    fun testAdd() {
        val service = WallService()
        val expectedId = 1
        val actualId = service.add(Post()).id
        assertEquals(expectedId, actualId)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        service.add(Post(id = 1))
        service.createComment(Comment(1, 2, "Текст комментария"))
    }

    @Test
    fun addComment() {
        val service = WallService()

        service.add(
            Post(id = 1)
        )
        service.add(
            Post(id = 2)
        )
        val comment = Comment(1, 1, "Текст комментария")
        val result = service.createComment(comment)
        assertTrue(result)
    }

}





