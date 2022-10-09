package movil.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var Lanzar: Button? = null
    var estatico: TextView? = null
    var Modificable: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        estatico= findViewById<EditText>(R.id.Resultado)
        Modificable= findViewById<EditText>(R.id.Mensaje)
        Lanzar = findViewById<Button>(R.id.button)

    }

    fun Ejecutar(view: View) {
        var rollResult=0
        val myFirstDice = Random(6)
        estatico?.setText(myFirstDice.roll().toString())

        rollResult = myFirstDice.roll()
        estatico?.setText(rollResult.toString())
        val luckyNumber = 6
        when (rollResult) {
            luckyNumber -> Modificable?.setText("Ganaste")


            1 -> Modificable?.setText("Sin suerte sacaste un 1. ¡Inténtalo de nuevo!")
            2 -> Modificable?.setText("Sin suerte sacaste un 2. ¡Inténtalo de nuevo!")
            3 -> Modificable?.setText("Sin suerte sacaste un 3. ¡Inténtalo de nuevo!")
            5 -> Modificable?.setText("Sin suerte sacaste un 5. ¡Inténtalo de nuevo!")
            4 -> Modificable?.setText("Sin suerte sacaste un 4. ¡Inténtalo de nuevo!")
        }


        //convert to String and set it as text inside the textview
    }
}
class Random (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}