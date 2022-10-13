import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun ToastExamplesComposable() {
	val context = LocalContext.current
	
	// Toast - Short
	Button(
		onClick = {
			android.widget.Toast.makeText(
				context,
				"Yum, toast!",
				android.widget.Toast.LENGTH_SHORT
			).show()
		}
	) {
		Text("Make Toast")
	}
	
	// Toast - Long
	Button(
		onClick = {
			android.widget.Toast.makeText(
				context,
				"Yum, toast!",
				android.widget.Toast.LENGTH_LONG
			).show()
		}
	) {
		Text("Make Toast")
	}
}
