import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonExamples() {
	
	// Button - Plain
	Button(
		onClick = { /* TODO */ }
	) {
		Text("Button")
	}
	
	
	// Button - Rounded
	Button(
		onClick = { /* TODO */ },
		shape = RoundedCornerShape(percent = 50)
	) {
		Text("Rounded Button")
	}
	
	
	// Button - Border
	Button(
		onClick = { /* TODO */ },
		border = BorderStroke(
			width = 2.dp,
			brush = Brush.verticalGradient(
				listOf(
					Color(0xFF9DCEF5),
					Color(0xFF4596D6)
				)
			)
		)
	) {
		Text("Button")
	}
	
	
	// Button - Custom Colors
	val enabled = remember { mutableStateOf(true) }
	
	Row(
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.spacedBy(8.dp)
	) {
		Button(
			onClick = { /* TODO */ },
			enabled = enabled.value,
			colors = ButtonDefaults.buttonColors(
				backgroundColor = Color(0xFF678B3D),
				contentColor = Color(0xFFE3FFC2),
				disabledBackgroundColor = Color(0xFF7A7A7A),
				disabledContentColor = Color(0xFFBDBDBD)
			)
		) { 
			Text("Custom Button") 
		}
		
		Checkbox(
			checked = enabled.value,
			onCheckedChange = { enabled.value = it }
		)
		
		Text(if(enabled.value) "Button is enabled" else "Disabled")
	}
	
	
	// Button - Icon
	Button(
		onClick = { /* TODO */ }
	) { 
		Icon(Icons.Default.Call, "Call")
	}
}
