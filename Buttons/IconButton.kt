import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

@Composable
fun IconButtonExamples() {
	
	// IconButton - Plain
	IconButton(
		onClick = { /* TODO */ }
	) {
		Icon(Icons.Default.Add, "Add")
	}
	
	
	// IconButton - Custom Color
	IconButton(
		onClick = { /* TODO */ },
		modifier = Modifier
			.clip(CircleShape)
			.background(MaterialTheme.colors.primary)
	) {
		Icon(
			imageVector = Icons.Default.Add,
			contentDescription = "Add"
		)
	}
	
	
	// IconButton - BorderStroke
	IconButton(
		onClick = { },
		modifier = Modifier
			.clip(CircleShape)
			.border(
				border = BorderStroke(2.dp, MaterialTheme.colors.onSurface),
				shape = CircleShape
			)
	) {
		Icon(
			imageVector = Icons.Default.Add,
			contentDescription = "Add"
		)
	}
}
