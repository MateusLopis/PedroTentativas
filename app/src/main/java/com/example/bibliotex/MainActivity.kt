package com.example.bibliotex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import br.org.project.dungeonsgo.model.BooksParser
import br.org.project.dungeonsgo.task.BooksTask
import kotlinx.android.synthetic.main.tela_disponiveis.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_disponiveis)
    }

    fun onClickSearch(v: View) {

        val tituloLivro = et_procura.text.toString()
        val ret = BooksTask().execute(tituloLivro).get()

        var listProduct = ArrayList<BooksParser>()


        Log.e("aqui foi", listProduct.toString())

        listProduct.addAll(ret.items)

        Log.e("api", listProduct.toString())

        var transaction = supportFragmentManager.beginTransaction()

        listProduct.forEach {
            val parametros = Bundle()

            parametros.putSerializable("produto", it)

            val fragmento = ItemFragment()
            fragmento.arguments = parametros

            transaction.add(R.id.layout_scroll, fragmento)
        }

        transaction.commit()

    }
}