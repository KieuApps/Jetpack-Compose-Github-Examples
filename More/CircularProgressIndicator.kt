import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun CircularProgressBarExamples() {
	
	var progress by remember { mutableStateOf(0f) }
	
	LaunchedEffect(Unit) {
		while(progress < 1f) {
			delay(75L)
			progress += 0.01f
		}
	}
	
	
	// CircularProgressBar - Infinite
	CircularProgressIndicator()
	
	
	// CircularProgressBar - Plain
	CircularProgressIndicator(progress)
	
	
	// CircularProgressBar - Custom Color
	CircularProgressIndicator(
		progress = progress,
		modifier = Modifier.padding(8.dp),
		color = Color.Green,
		strokeWidth = 2.dp
	)
	
	
	// CircularProgressBar - Custom
	Box(modifier = Modifier.size(40.dp)) {
		Canvas(modifier = Modifier.size(40.dp)) {
			drawArc(
				brush = Brush.verticalGradient(
					listOf(
						Color(0xFF2196F3),
						Color(0xFF3F51B5))
				),
				startAngle = -90f,
				sweepAngle = progress,
				useCenter = false,
				style = Stroke(
					width = 6.dp.toPx(),
					cap = StrokeCap.Round
				)
			)
		}
	}
}
