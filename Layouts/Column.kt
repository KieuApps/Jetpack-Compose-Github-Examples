import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ColumnExamples() {
	
	// Column - Centered
	Column(
		modifier = Modifier
			.fillMaxWidth()
			.height(150.dp),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		AnItem()
		AnItem()
		AnItem()
	}
	
	// Column - Top, Start
	Column(
		modifier = Modifier
			.fillMaxWidth()
			.height(150.dp),
		verticalArrangement = Arrangement.Top,
		horizontalAlignment = Alignment.Start
	) {
		AnItem()
		AnItem()
		AnItem()
	}
	
	// Column - Bottom, End
	Column(
		modifier = Modifier
			.fillMaxWidth()
			.height(150.dp),
		verticalArrangement = Arrangement.Bottom,
		horizontalAlignment = Alignment.End
	) {
		AnItem()
		AnItem()
		AnItem()
	}
	
	// Column - Centered, Background Color
	Column(
		modifier = Modifier
			.background(MaterialTheme.colors.surface)
			.fillMaxWidth()
			.padding(vertical = 20.dp)
			.padding(5.dp),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		AnItem()
		AnItem()
		AnItem()
	}
}

// ---------------------------------------------------------------------

@Composable
fun AnItem(
    modifier: Modifier = Modifier, 
    text: String = "An Item..."
) {
	Text(
		text = text,
		modifier = modifier
			.padding(1.dp)
			.clip(CircleShape)
			.background(Color(0xFF4A92B3))
			.padding(horizontal = 8.dp)
			.height(24.dp),
		fontSize = MaterialTheme.typography.button.fontSize
	)
}
