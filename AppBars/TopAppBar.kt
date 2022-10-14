import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBarExamples() {
	
	// TopAppBar - Plain
	TopAppBar(
		title = { Text("") },
		navigationIcon = {
			IconButton(onClick = { /* TODO */ }) {
				Icon(Icons.Default.Menu, "Menu")
			}
		},
		actions = {
			IconButton(onClick = { /* TODO */ }) {
				Icon(Icons.Default.Settings, "Settings")
			}
		}
	)
	
	// TopAppBar - Long Title, Extra Buttons
	TopAppBar(
		title = {
			Text(
				"Title that's too long in some cases",
				maxLines = 1,
				overflow = TextOverflow.Ellipsis
			)
		},
		navigationIcon = {
			IconButton(onClick = { /* TODO */ }) {
				Icon(Icons.Default.Menu, "Menu")
			}
		},
		actions = {
			IconButton(onClick = { /* TODO */ }) {
				Icon(Icons.Outlined.Notifications, "Alerts")
			}
			IconButton(onClick = { /* TODO */ }) {
				Icon(Icons.Default.Settings, "Settings")
			}
		},
		elevation = 8.dp
	)
}
