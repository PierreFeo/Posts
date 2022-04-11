package ru.netology

internal data class Donut(
    val isDonut: Boolean,
    val paidDuration: Int,
    val placeHolder: Placeholder,
    val canPublishFreeCopy: Boolean,
    val editMode: String,
)

class Placeholder(
    val text: String
)