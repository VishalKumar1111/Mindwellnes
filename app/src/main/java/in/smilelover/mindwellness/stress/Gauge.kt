package `in`.smilelover.mindwellness.stress

import `in`.smilelover.mindwellness.R
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Gauge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stress_gauge)

        val gauge_text:TextView=findViewById(R.id.gauge_text)

        val tscore=intent.getIntExtra("Score",0)



       gauge_text.text=tscore.toString()

    }
}