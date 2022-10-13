import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Checkbox
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ComponentExamplesComposable() {
	Column {
		var checked by rememberSaveable { mutableStateOf(true) }
		var enabled by rememberSaveable { mutableStateOf(true) }
		
		// Switch - Plain
		Switch(
			checked = checked,
			onCheckedChange = { checked = it }
		)
		
		// Switch - Custom Colors
		Row(
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier
				.clip(CircleShape)
				.clickable { enabled = !enabled }
		) {
			Checkbox(enabled, { enabled = !enabled })
			Text(if(enabled) "Switch is Enabled" else "Disabled", Modifier.padding(end = 16.dp))
		}
		Switch(
			checked = checked,
			onCheckedChange = { checked = it },
			enabled = enabled,
			colors = SwitchDefaults.colors(
				checkedThumbColor = Color.Yellow,
				checkedTrackColor = Color.Green,
				uncheckedThumbColor = Color.Magenta,
				uncheckedTrackColor = Color.Red,
				disabledCheckedThumbColor = Color.Gray,
				disabledCheckedTrackColor = Color.Gray,
				disabledUncheckedThumbColor = Color.Gray,
				disabledUncheckedTrackColor = Color.Gray,
				checkedTrackAlpha = 0.6f,
				uncheckedTrackAlpha = 0.2f
			)
		)
	}
}
