import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.inidamleader.ovtracker.util.compose.AutoSizeText

@Composable
fun App() {
    MaterialTheme {
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            AutoSizeText(
                "Hello, ${getPlatformName()}!",
                maxTextSize = 100.sp,
                minTextSize = 10.sp,
                modifier = Modifier.fillMaxSize(0.5f),
            )
        }
    }
}

expect fun getPlatformName(): String
