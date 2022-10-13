import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextDecoration

@Composable
fun TextExamplesComposable() {
	
	// TextDecoration - Underline
	Text(
		"Underline text example.",
		textDecoration = TextDecoration.Underline
	)
	
	// TextDecoration - LineThrough
	Text(
		"LineThrough text example.",
		textDecoration = TextDecoration.LineThrough
	)
}
