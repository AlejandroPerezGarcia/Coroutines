package cl.desafiolatam.theadscoroutineii

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.URL

class Repository {



    suspend fun downloadFromNetwork (url: String ): Bitmap? = withContext(Dispatchers.IO){
        val urldisplay = url
        var bmp: Bitmap? =  null

        val inputStream = URL(urldisplay).openStream()
        bmp = BitmapFactory.decodeStream(inputStream)

        bmp
    }
}