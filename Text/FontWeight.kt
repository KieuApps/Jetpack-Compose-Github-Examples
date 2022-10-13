import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@Composable
fun TextExamplesComposable() {
	
	// FontWeight - Bold
	Text(
		"Bold text example.",
		fontWeight = FontWeight.Bold
	)
	
	// FontWeight - SemiBold
	Text(
		"SemiBold text example.",
		fontWeight = FontWeight.SemiBold
	)
	
	// FontWeight - Normal
	Text(
		"Normal text example.",
		fontWeight = FontWeight.Normal
	)
	
	// FontWeight - Thin
	Text(
		"Thin text example.",
		fontWeight = FontWeight.Thin
	)
	
	// FontWeight - W900
	Text(
		"W900 text example.",
		fontWeight = FontWeight.W900
	)
	
	// FontWeight - W400
	Text(
		"W400 text example.",
		fontWeight = FontWeight.W400
	)
	
	// FontWeight - W100
	Text(
		"W100 text example.",
		fontWeight = FontWeight.W100
	)
}
