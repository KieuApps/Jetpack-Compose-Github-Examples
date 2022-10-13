import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.DEVELOPER_NAME.APP_NAME.ui.theme.Shapes

@Composable
fun SurfaceExamplesComposable() {
	
	// Surface - Plain
	Surface(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp),
	) {
		/* TODO */
    
	}
	
	// Surface - Custom Shape
	Surface(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp),
		shape = Shapes.small,
		elevation = 8.dp
	) {
		/* TODO */
    
	}
	
	// Surface - Custom Colors
	Surface(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp),
		shape = RoundedCornerShape(percent = 25),
		color = MaterialTheme.colors.primary,
		contentColor = MaterialTheme.colors.onPrimary,
		border = BorderStroke(
			width = 2.dp,
			color = Color.White
		),
		elevation = 8.dp
	) {
		/* TODO */
    
	}
}
