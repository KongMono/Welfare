package splash_screen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.pawegio.kandroid.IntentFor
import com.pawegio.kandroid.runDelayed
import com.tmt.welfare.MainActivity
import com.tmt.welfare.R
import kotlinx.android.synthetic.main.activity_slashscreen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_slashscreen)

        runDelayed(3000) {
            val intent = IntentFor<MainActivity>(this)
            startActivity(intent)
            finish()
            overridePendingTransition(R.anim.abc_fade_in,R.anim.abc_fade_out)
        }
    }

}
