package ru.netology.data.attachment

data class Video(
   val id: Int = 0,
   val ownerId: Int = 0,
   val title: String? = null,
   val description: String? = null,
   val duration: Int = 0,
   val type: String? = null
)