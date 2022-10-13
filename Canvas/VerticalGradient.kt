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
	
	// Vertical Gradient - Clamp
	Canvas(
		modifier = Modifier
			.fillMaxWidth(0.5f)
			.height(100.dp)
	) {
		val canvasHeight = size.height
		
		drawRect(
			brush = Brush.verticalGradient(
				colors = listOf(
					Color.Blue,
					Color.Gray
				),
				startY = 0.dp.toPx(),
				endY = canvasHeight / 3,
				tileMode = TileMode.Clamp
			)
		)
	}
	
	// Vertical Gradient - Mirror
	Canvas(
		modifier = Modifier
			.fillMaxWidth(0.5f)
			.height(100.dp)
	) {
		val canvasHeight = size.height
		
		drawRect(
			brush = Brush.verticalGradient(
				colors = listOf(
					Color.Blue,
					Color.Gray
				),
				startY = 0.dp.toPx(),
				endY = canvasHeight / 3,
				tileMode = TileMode.Mirror
			)
		)
	}
	
	// Vertical Gradient - Repeated
	Canvas(
		modifier = Modifier
			.fillMaxWidth(0.5f)
			.height(100.dp)
	) {
		val canvasHeight = size.height
		
		drawRect(
			brush = Brush.verticalGradient(
				colors = listOf(
					Color.Blue,
					Color.Gray
				),
				startY = 0.dp.toPx(),
				endY = canvasHeight / 3,
				tileMode = TileMode.Repeated
			)
		)
	}
}
