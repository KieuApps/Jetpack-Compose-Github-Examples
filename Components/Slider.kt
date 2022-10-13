import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Checkbox
import androidx.compose.material.Slider
import androidx.compose.material.SliderDefaults
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
		var percent by rememberSaveable { mutableStateOf(0.5f) }
		val volume = rememberSaveable { mutableStateOf(50f) }
		val enabled = rememberSaveable { mutableStateOf(true) }
		
		// Slider - Plain
		Slider(percent, { percent = it }, Modifier.fillMaxWidth(0.75f))
		
		// Slider - Steps
		Slider(
			value = volume.value,
			onValueChange = { volume.value = it },
			modifier = Modifier.fillMaxWidth(0.75f),
			valueRange = 0f..100f,
			steps = 9
		)
		
		// Slider - Custom Colors
		Row(
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier
				.clip(CircleShape)
				.clickable { enabled.value = !enabled.value }
		) {
			Checkbox(enabled.value, { enabled.value = !enabled.value })
			Text(if(enabled.value) "Slider is Enabled" else "Disabled", Modifier.padding(end = 8.dp))
		}
		Slider(
			value = volume.value,
			onValueChange = { volume.value = it },
			modifier = Modifier.fillMaxWidth(0.75f),
			valueRange = 0f..100f,
			steps = 9,
			enabled = enabled.value,
			colors = SliderDefaults.colors(
				
				// Enabled Slider colors
				activeTrackColor = Color.Green,
				activeTickColor = Color.Black,
				thumbColor = Color.Red,
				inactiveTrackColor = Color.Blue,
				inactiveTickColor = Color.White,
				
				// Disabled Slider colors
				disabledActiveTrackColor = Color.LightGray,
				disabledActiveTickColor = Color.Black,
				disabledThumbColor = Color.Gray,
				disabledInactiveTrackColor = Color.DarkGray,
				disabledInactiveTickColor = Color.White
			)
		)
	}
}
