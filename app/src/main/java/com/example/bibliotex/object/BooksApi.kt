package br.org.project.dungeonsgo.`object`

import br.org.project.dungeonsgo.request.BooksRequest
import feign.Feign
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder


object BooksApi {
    fun connect(): BooksRequest {
        return Feign.builder()
            .decoder(GsonDecoder())
            .encoder(GsonEncoder())
            .target(BooksRequest::class.java, "https://www.googleapis.com/books/v1")
    }
}