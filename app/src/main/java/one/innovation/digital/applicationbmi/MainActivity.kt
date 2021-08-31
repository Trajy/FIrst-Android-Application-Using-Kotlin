package one.innovation.digital.applicationbmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("Lifecycle", "I'm in onCreate() - I started first app layout")

        /* o metodo finish() pula todos os metodos direto para o onDestroy(), não pode ser declarado
           em ontros métodos do ciclo de vida, pois irá respeitar o ciclo */
        // finish()
    }

    override fun onStart() {
        Log.w("Lifecycle","I'm in onStart() - you can see application")
        super.onStart()
    }

    override fun onResume() {
        Log.w("Lifecycle","I'm in onResume() - you can iteract with application")
        super.onResume()
    }

    override fun onStop() {
        Log.w("Lifecycle","I'm in onStop() - you can´t see the app, but screen still exists")
        super.onStop()
    }

    override fun onRestart() {
        Log.w("Lifecycle","I'm in onRestart() - the screen is returning")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.w("Lifecycle","I'm in onDestroy() - the screen was destroied")
        super.onDestroy()
    }
}