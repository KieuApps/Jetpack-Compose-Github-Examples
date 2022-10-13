import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle

@Composable
fun TextExamplesComposable() {
	
	// FontStyle - Italic
	Text(
		"Italic text example.",
		fontStyle = FontStyle.Italic
	)
	
	// FontStyle - Normal
	Text(
		"Normal text example.",
		fontStyle = FontStyle.Normal
	)
}
