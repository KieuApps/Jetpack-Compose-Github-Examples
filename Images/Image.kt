import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ImageExampleComposable() {
	
	// Image - Plain
		Image(
			painterResource(R.drawable.ic_launcher_foreground),
			contentDescription = "Android"
		)
	
	// Image - Zoomable
	val zoomableImage = painterResource(R.drawable.ic_launcher_foreground)
	val scale = remember { mutableStateOf(1f) }
	
	Image(
		painter = zoomableImage, 
		contentDescription = "Android",
		modifier = Modifier
			.fillMaxWidth()
			.height(200.dp)
			.pointerInput(Unit) {
				detectTransformGestures { _, _, zoom, _ ->
					scale.value *= zoom
				}
			}
			.graphicsLayer(
				scaleX = maxOf(0.5f, minOf(5f, scale.value)),
				scaleY = maxOf(0.5f, minOf(5f, scale.value))
			)
	)
	
	// Image - Zoomable Box
	val zoomableImage2 = painterResource(R.drawable.ic_launcher_foreground)
	val scale2 = remember { mutableStateOf(1f) }
	
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.height(200.dp)
			.pointerInput(Unit) {
				detectTransformGestures { _, _, zoom, _ ->
					scale2.value *= zoom
				}
			}
	) {
		Image(
			painter = zoomableImage2, 
			contentDescription = "Android",
			modifier = Modifier
				.align(Alignment.Center)
				.graphicsLayer(
					scaleX = maxOf(0.5f, minOf(5f, scale2.value)),
					scaleY = maxOf(0.5f, minOf(5f, scale2.value))
				)
		)
	}
	
	// Image - Pannable
	val rotatableImage = painterResource(R.drawable.ic_launcher_foreground)
	val offsetX = remember { mutableStateOf(0f) }
	val offsetY = remember { mutableStateOf(0f) }
	
	Image(
		painter = rotatableImage, 
		contentDescription = "Android",
		modifier = Modifier
			.fillMaxWidth()
			.height(200.dp)
			.pointerInput(Unit) {
				detectTransformGestures { _, pan, _, _ ->
					offsetX.value += pan.x
					offsetY.value += pan.y
				}
			}
			.graphicsLayer(
				translationX = offsetX.value,
				translationY = offsetY.value
			)
	)
	
	// Image - Rotatable
	val pannableImage = painterResource(R.drawable.ic_launcher_foreground)
	val angle = remember { mutableStateOf(0f) }
	
	Image(
		painter = pannableImage, 
		contentDescription = "Android",
		modifier = Modifier
			.fillMaxWidth()
			.height(200.dp)
			.pointerInput(Unit) {
				detectTransformGestures { _, _, _, rotation ->
					angle.value += rotation
				}
			}
			.graphicsLayer(rotationZ = angle.value)
	)
}
