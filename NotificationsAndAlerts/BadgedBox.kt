import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Badge
import androidx.compose.material.BadgedBox
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BadgedBoxExamplesComposable() {
	var notificationCount by rememberSaveable { mutableStateOf(0) }
	val badgeText = notificationCount.toString()
	
	Row {
		Button({
			if(notificationCount in 0..900)
				notificationCount += 1
		}) {
			Text("Add one")
		}
		BadgedBox(
			modifier = Modifier.padding(16.dp),
			badge = {
				Badge(
					backgroundColor = if(notificationCount >= 1)
						MaterialTheme.colors.error
					else Color.Transparent
				) {
					if(notificationCount >= 1)
						Text(text = badgeText)
				}
			}
		) {
			Icon(
				Icons.Default.Notifications,
				contentDescription = "$notificationCount Notifications"
			)
		}
	}
}
