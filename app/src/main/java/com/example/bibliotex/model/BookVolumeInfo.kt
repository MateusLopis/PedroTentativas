package br.org.project.dungeonsgo.model

import java.io.Serializable
import java.util.Date

data class BookVolumeInfo(
    val title: String,
    val description: String,
    val imageLinks: BookImageLinks
) : Serializable