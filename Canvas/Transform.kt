import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.unit.dp

@Composable
fun CanvasExamplesComposable() {
	
	// Transform
	Canvas(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		val canvasWidth = size.width
		val canvasHeight = size.height
		
		withTransform({
			translate(
				left = canvasWidth / 10,
				top = -(canvasHeight / 4)
			)
			scale(0.25f, 0.25f)
			rotate(degrees = 65f)
		}) {
			/* Your Canvas code... */
			drawRect(Color.Blue)
			
		}
	}
}
