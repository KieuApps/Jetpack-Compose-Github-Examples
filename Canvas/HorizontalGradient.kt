import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.unit.dp

@Composable
fun GradientExamplesComposable() {
	
	// Horizontal Gradient - Clamp
	Canvas(
		modifier = Modifier
			.fillMaxWidth(0.5f)
			.height(100.dp)
	) {
		val canvasWidth = size.width
		
		drawRect(
			brush = Brush.horizontalGradient(
				colors = listOf(
					Color.Blue,
					Color.Gray
				),
				startX = 0f,
				endX = canvasWidth / 3,
				tileMode = TileMode.Clamp
			)
		)
	}
	
	// Horizontal Gradient - Mirror
	Canvas(
		modifier = Modifier
			.fillMaxWidth(0.5f)
			.height(100.dp)
	) {
		val canvasWidth = size.width
		
		drawRect(
			brush = Brush.horizontalGradient(
				colors = listOf(
					Color.Blue,
					Color.Gray
				),
				startX = 0f,
				endX = canvasWidth / 3,
				tileMode = TileMode.Mirror
			)
		)
	}
	
	// Horizontal Gradient - Repeated
	Canvas(
		modifier = Modifier
			.fillMaxWidth(0.5f)
			.height(100.dp)
	) {
		val canvasWidth = size.width
		
		drawRect(
			brush = Brush.horizontalGradient(
				colors = listOf(
					Color.Blue,
					Color.Gray
				),
				startX = 0f,
				endX = canvasWidth / 3,
				tileMode = TileMode.Repeated
			)
		)
	}
}
