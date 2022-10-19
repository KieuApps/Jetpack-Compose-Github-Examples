import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CanvasExamples() {
	
	// Canvas - Plain
	Canvas(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		val canvasHeight = size.height
		
		drawCircle(
			color = Color.Green,
			radius = canvasHeight / 2
		)
	}
	
	// Canvas - In a Box
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
			.drawBehind {
				val canvasWidth = size.width
				val canvasHeight = size.height
				
				/* Your Canvas code... */
				drawCircle(
                                	color = Color.Green,
                                	radius = canvasHeight / 2
                            	)
				
			}
	) {
		/* Your Compose code... */
		
	}
}
