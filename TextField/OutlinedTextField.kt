import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldExamplesComposable() {
	var text by rememberSaveable { mutableStateOf("") }
	
	// OutlinedTextField - Plain
	OutlinedTextField(
		value = text,
		onValueChange = { text = it },
		modifier = Modifier.fillMaxWidth(0.6f),
	)
	
	// OutlinedTextField - Custom Shape
	OutlinedTextField(
		value = text,
		onValueChange = { text = it },
		modifier = Modifier.fillMaxWidth(0.6f),
		label = { Text("First Name") },
		shape = RoundedCornerShape(percent = 50)
	)
	
	// OutlinedTextField - Custom Icons
	OutlinedTextField(
		value = text,
		onValueChange = { text = it },
		modifier = Modifier.fillMaxWidth(0.6f),
		label = { Text("Search") },
		placeholder = { Text("Search...") },
		leadingIcon = { Icon(Icons.Default.Search, "Search") },
		trailingIcon = {
			Icon(
				Icons.Default.MoreVert,
				contentDescription = "More",
				modifier = Modifier
					.clip(CircleShape)
					.clickable { /* TO DO */ }
					.padding(12.dp)
			)
		}
	)
}
