package br.org.project.dungeonsgo.request

import br.org.project.dungeonsgo.model.ApiBook
import br.org.project.dungeonsgo.model.BooksParser
import feign.Headers
import feign.Param
import feign.RequestLine

interface BooksRequest {
    @Headers(
        "x-client-data:CJS2yQEIpbbJAQjBtskBCKmdygEIq8fKAQj2x8oBCKbIygEI58jKAQjpyMoBCLTLygEI29XKARiKwcoB\n" +
                "Decoded:\n" +
                "message ClientVariations {\n" +
                "  // Active client experiment variation IDs.\n" +
                "  repeated int32 variation_id = [3300116, 3300133, 3300161, 3313321, 3318699, 3318774, 3318822, 3318887, 3318889, 3319220, 3320539];\n" +
                "  // Active client experiment variation IDs that trigger server-side behavior.\n" +
                "  repeated int32 trigger_variation_id = [3317898];\n" +
                "}"
    )
    @RequestLine("GET /volumes?q={bookName}")
    fun getBooksByName(@Param("bookname") book: String): ApiBook
}