import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldExamplesComposable() {
	var text by rememberSaveable { mutableStateOf("") }
	
	// TextField - Plain
	TextField(
		value = text,
		onValueChange = { text = it }
	)
	
	// TextField - Custom Icons
	TextField(
		value = text,
		onValueChange = { text = it },
		label = { Text("Add...") },
		leadingIcon = {
			Icon(
				Icons.Default.Clear,
				contentDescription = "Clear",
				modifier = Modifier
					.clip(CircleShape)
					.clickable { /* TO DO */ }
					.padding(12.dp)
			)
		},
		trailingIcon = {
			Icon(
				Icons.Default.Add,
				contentDescription = "Add",
				modifier = Modifier
					.clip(CircleShape)
					.clickable { /* TO DO */ }
					.padding(12.dp)
			)
		},
	)
	
	// TextField - Custom Colors #1
	TextField(
		value = text,
		onValueChange = { text = it },
		shape = RoundedCornerShape(size = 16.dp),
		colors = TextFieldDefaults.textFieldColors(
			textColor = Color.Red,
			backgroundColor = Color.LightGray,
			cursorColor = Color.Green,
			focusedIndicatorColor = Color.Transparent,
			unfocusedIndicatorColor = Color.Transparent
		)
	)
	
	// TextField - Custom Colors #2
	TextField(
		value = text,
		onValueChange = { text = it },
		leadingIcon = { Icon(Icons.Default.Search, "Search") },
		trailingIcon = {
			Icon(
				Icons.Default.Clear,
				contentDescription = "Clear",
				modifier = Modifier
					.clip(CircleShape)
					.clickable { /* TO DO */ }
					.padding(12.dp)
			)
		},
		colors = TextFieldDefaults.textFieldColors(
			leadingIconColor = Color.Red,
			trailingIconColor = Color.Green,
			focusedIndicatorColor = Color.Blue,
			unfocusedIndicatorColor = Color.Blue
		)
	)
}
