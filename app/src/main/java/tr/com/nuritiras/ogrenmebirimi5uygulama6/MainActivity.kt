package tr.com.nuritiras.ogrenmebirimi5uygulama6

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editTextKisaKenar = findViewById<EditText>(R.id.editTextKisaKenar)
        val editTextUzunKenar = findViewById<EditText>(R.id.editTextUzunKenar)
        val buttonKareAlani = findViewById<Button>(R.id.buttonKareAlani)
        val buttonDikdortgenAlani = findViewById<Button>(R.id.buttonDikdortgenAlani)
        val textViewAlan = findViewById<TextView>(R.id.textViewAlan)

        buttonKareAlani.setOnClickListener {
            val kenar = editTextKisaKenar.text.toString().toInt()
            var kare = Dortgen(kenar);
            var alan =kare.alanBul();
            textViewAlan.text = "Alan: $alan"
        }

        buttonDikdortgenAlani.setOnClickListener {
            val kisaKenar = editTextKisaKenar.text.toString().toInt()
            val uzunKenar = editTextUzunKenar.text.toString().toInt()
            var dikdortgen = Dortgen(kisaKenar, uzunKenar)
            var alan = dikdortgen.alanBul()
            textViewAlan.text = "Alan: $alan"
        }


    }
}