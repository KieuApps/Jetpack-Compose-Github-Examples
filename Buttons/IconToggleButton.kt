import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconToggleButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

@Composable
fun IconToggleButtonExamples() {
	
	var checked by rememberSaveable { mutableStateOf(false) }
	val likeIcon = if(checked) Icons.Filled.ThumbUp else Icons.Outlined.ThumbUp
	
	// IconToggleButton - Plain
	IconToggleButton(
		checked = checked,
		onCheckedChange = { checked = it }
	) {
		Icon(likeIcon, "Like")
	}
	
	
	// IconToggleButton - Custom Color
	IconToggleButton(
		checked = checked,
		onCheckedChange = { checked = it },
		modifier = Modifier
			.clip(CircleShape)
			.background(
				if(checked) MaterialTheme.colors.primary
				else Color.Transparent
			)
	) {
		Icon(likeIcon, "Like")
	}
}
