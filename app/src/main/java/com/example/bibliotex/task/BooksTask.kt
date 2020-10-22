package br.org.project.dungeonsgo.task

import android.os.AsyncTask
import android.util.Log
import br.org.project.dungeonsgo.`object`.BooksApi
import br.org.project.dungeonsgo.model.ApiBook
import br.org.project.dungeonsgo.model.Books
import br.org.project.dungeonsgo.model.BooksParser

import feign.FeignException

class BooksTask : AsyncTask<String, Void, ApiBook>() {

    override fun doInBackground(vararg params: String?): ApiBook? {
        try {
            Log.v("Parametrro", params[0]!!)
            return BooksApi.connect().getBooksByName(params[0]!!)
        } catch (e: FeignException) {
            Log.e("api", "Erro na busca de usuário na API: Status ${e.status()} / ${e.message}")
            return null
        }
    }

}