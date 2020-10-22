package br.org.project.dungeonsgo.model

import java.io.Serializable
import java.util.Date

data class BookImageLinks(
    val smallThumbnail: String,
    val thumbnail: String
) : Serializable