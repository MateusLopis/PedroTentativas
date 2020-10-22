package br.org.project.dungeonsgo.model

import java.io.Serializable
import java.util.Date

data class BooksParser(
    val id: String,
    val volumeInfo: BookVolumeInfo
) : Serializable