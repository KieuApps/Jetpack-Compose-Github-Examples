import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily

@Composable
fun TextExamplesComposable() {
	
	// FontFamily - Default
	Text(
		"Default text example.",
		fontFamily = FontFamily.Default
	)
	
	// FontFamily - Cursive
	Text(
		"Cursive text example.",
		fontFamily = FontFamily.Cursive
	)
	
	// FontFamily - Monospace
	Text(
		"Monospace text example.",
		fontFamily = FontFamily.Monospace
	)
	
	// FontFamily - SansSerif
	Text(
		"SansSerif text example.",
		fontFamily = FontFamily.SansSerif
	)
	
	// FontFamily - Serif
	Text(
		"Serif text example.",
		fontFamily = FontFamily.Serif
	)
}
