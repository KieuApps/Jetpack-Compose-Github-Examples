import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable

@Composable
fun ExtendedFloatingActionButtonExamplesComposable() {
	ExtendedFloatingActionButton(
		text = { Text("Share") },
		onClick = { /* TODO */ },
		icon = { 
			Icon(
				Icons.Default.Share, 
				contentDescription = "Share"
			) 
		}
	)
}
