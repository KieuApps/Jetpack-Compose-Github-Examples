import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SpacerExamples() {
	
	// Spacer - Size
	Spacer(Modifier.size(40.dp))
	
	
	// Spacer - Width
	Spacer(Modifier.width(160.dp))
	
	
	// Spacer - Height
	Spacer(Modifier.height(40.dp))
	
	
	// Spacer - Custom, Wide
	Spacer(
		Modifier
			.background(Color.Gray)
			.height(10.dp)
			.fillMaxWidth()
	)
	
	
	// Spacer - Custom, Tall
	Spacer(
		Modifier
			.background(Color.Gray)
			.height(120.dp)
			.width(10.dp)
	)
}
