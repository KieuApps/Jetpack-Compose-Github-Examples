import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedButtonExamples() {
	
	val contentColor = MaterialTheme.colors.onBackground
	
	// OutlinedButton - Plain
	OutlinedButton(
		onClick = { /* TODO */ },
		shape = CircleShape,
		border = BorderStroke(1.dp, contentColor),
		colors = ButtonDefaults.buttonColors(
			backgroundColor = Color.Transparent,
			contentColor = contentColor
		)
	) {
		Text("Button")
	}
}
