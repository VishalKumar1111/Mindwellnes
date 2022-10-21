package `in`.smilelover.mindwellness

import `in`.smilelover.mindwellness.stress.Stress
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stress=findViewById<CardView>(R.id.stress_s)
        stress.setOnClickListener {
            val intent=Intent(this,Stress::class.java)
            startActivity(intent)
        }

    }
}