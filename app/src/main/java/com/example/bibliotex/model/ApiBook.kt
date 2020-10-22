package br.org.project.dungeonsgo.model

import java.io.Serializable
import java.util.Date

data class ApiBook(
    val totalItems: Int,
    val items: List<BooksParser>
) : Serializable