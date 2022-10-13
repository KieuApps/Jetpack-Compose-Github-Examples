import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CanvasExamplesComposable() {
	
	// Arc
	Canvas(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		drawArc(
			color = Color.Yellow,
			startAngle = 30f,
			sweepAngle = 300f,
			useCenter = true,
			topLeft = Offset(25.dp.toPx(), 50.dp.toPx()),
			size = Size(50.dp.toPx(), 50.dp.toPx())
		)
	}
	
	// Circle
	Canvas(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		drawCircle(
			color = Color.Green,
			radius = 25.dp.toPx()
		)
	}
	
	// Line
	Canvas(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		val canvasWidth = size.width
		val canvasHeight = size.height
		
		drawLine(
			color = Color.Red,
			strokeWidth = 2.dp.toPx(),
			start = Offset(0f, 0f),
			end = Offset(
				x = canvasWidth / 2,
				y = canvasHeight / 2
			)
		)
	}
	
	// Oval
	Canvas(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		val canvasWidth = size.width
		val canvasHeight = size.height
		
		drawOval(
			color = Color.DarkGray,
			size = Size(
				width = canvasWidth / 2,
				height = canvasHeight / 2
			)
		)
	}
	
	// Rectangle
	Canvas(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		drawRect(
			color = Color.Blue,
			size = Size(150.dp.toPx(), 75.dp.toPx())
		)
	}
}
