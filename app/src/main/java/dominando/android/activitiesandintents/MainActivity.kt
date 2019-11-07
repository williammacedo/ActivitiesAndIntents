package dominando.android.activitiesandintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.parceler.Parcels

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTela2.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("nome", "William")
            intent.putExtra("idade", 31)
            startActivity(intent)
        }

        buttonParcel.setOnClickListener {
            val cliente = Cliente(1, "William")
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("cliente", Parcels.wrap(cliente))
            startActivity(intent)
        }

        buttonSerializable.setOnClickListener {
            val pessoa = Pessoa("William", 31)
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("pessoa", pessoa)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("WFM", "Tela1::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("WFM", "Tela1::onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("WFM", "Tela1::onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("WFM", "Tela1::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("WFM", "Tela1::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("WFM", "Tela1::onDestroy")
    }
}
