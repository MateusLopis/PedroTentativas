package br.org.project.dungeonsgo.model

import java.io.Serializable
import java.util.Date

data class Books(
    val qtde: Int,
    val produtoId: String,
    val precoTotal: Double,
    val vendaId: String
) : Serializable