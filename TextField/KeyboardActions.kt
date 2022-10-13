import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldExamplesComposable() {
	val focusManager = LocalFocusManager.current
	var userInput by rememberSaveable { mutableStateOf("") }
	
	Row(
		horizontalArrangement = Arrangement.spacedBy(8.dp),
		verticalAlignment = Alignment.CenterVertically
	) {
		TextField(
			value = userInput,
			onValueChange = { userInput = it },
			keyboardOptions = KeyboardOptions(
				keyboardType = KeyboardType.Text,
				imeAction = ImeAction.Done
			),
			keyboardActions = KeyboardActions(
				onDone = { focusManager.clearFocus() }
			)
		)
		Button(
			onClick = {
				focusManager.clearFocus()
			}
		) {
			Text("Search")
		}
	}
}
