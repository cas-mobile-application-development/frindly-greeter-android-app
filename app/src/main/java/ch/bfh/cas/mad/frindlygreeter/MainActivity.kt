package ch.bfh.cas.mad.frindlygreeter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/***
 * This code is not production ready code as it
 * uses the most simple version for educational purposes.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonGreet = findViewById<Button>(R.id.button_greet)
        val edittextName = findViewById<EditText>(R.id.edittext_name)
        val textViewOutput = findViewById<TextView>(R.id.text_output)

        buttonGreet.setOnClickListener {
            val name = edittextName.text.toString()
            if (name.isBlank()) {
                edittextName.error = getString(R.string.empty_name_error)
            } else {
                textViewOutput.text = getString(R.string.greeting, name)
            }
        }
    }
}