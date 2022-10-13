import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SpacerExamplesComposable() {
	
	// Divider - Plain
	Divider()
	
	// Divider - Custom
	Divider(
		modifier = Modifier,
		color = Color.Red,
		thickness = 4.dp,
		startIndent = 40.dp
	)
}
