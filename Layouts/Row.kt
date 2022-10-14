import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
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
fun RowExamples() {
	
	// Row - Centered
	Row(
		modifier = Modifier
			.fillMaxWidth()
			.height(150.dp),
		horizontalArrangement = Arrangement.Center,
		verticalAlignment = Alignment.CenterVertically
	) {
		AnItem()
		AnItem()
		AnItem()
	}
	
	// Row - Top, Start
	Row(
		modifier = Modifier
			.fillMaxWidth()
			.height(150.dp),
		horizontalArrangement = Arrangement.Start,
		verticalAlignment = Alignment.Top
	) {
		AnItem()
		AnItem()
		AnItem()
	}
	
	// Row - Bottom, End
	Row(
		modifier = Modifier
			.fillMaxWidth()
			.height(150.dp),
		horizontalArrangement = Arrangement.End,
		verticalAlignment = Alignment.Bottom
	) {
		AnItem()
		AnItem()
		AnItem()
	}
	
	// Row - Centered, Background Color
	Row(
		modifier = Modifier
			.background(MaterialTheme.colors.surface)
			.fillMaxWidth()
			.padding(vertical = 20.dp)
			.padding(5.dp),
		horizontalArrangement = Arrangement.Center,
		verticalAlignment = Alignment.CenterVertically
	) {
		AnItem()
		AnItem()
		AnItem()
	}
}

// ---------------------------------------------------------------------

@Composable
fun AnItem(modifier: Modifier = Modifier, text: String = "An Item...") {
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
