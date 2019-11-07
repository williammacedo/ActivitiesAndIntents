package dominando.android.activitiesandintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

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
            intent.putExtra("cliente", cliente)
            startActivity(intent)
        }

        buttonSerializable.setOnClickListener {
            val pessoa = Pessoa("William", 31)
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("pessoa", pessoa)
            startActivity(intent)
        }
    }
}
