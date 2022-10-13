import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BoxExamplesComposable() {
	
	// Box - Plain
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp),
		contentAlignment = Alignment.TopStart
	) {
		HelloWorldText()
		LoremIpsumDolorText()
	}
}

// ---------------------------------------------------------------------

@Composable
fun HelloWorldText() {
	Text(
		"Hello World!",
		color = Color.White.copy(0.5f)
	)
}

@Composable
fun LoremIpsumDolorText() {
	Text(
		"Lorem ipsum dolor sit amet, \n" +
			"consectetur adipiscing \n" +
			"elit, sed do eiusmod tempor \n" +
			"incididunt ut labore et \n" +
			"dolore magna aliqua.",
		color = Color.White.copy(0.5f)
	)
}
