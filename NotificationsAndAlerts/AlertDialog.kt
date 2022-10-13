import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AlertDialogExamplesComposable() {
	val showAlert = rememberSaveable { mutableStateOf(false) }
	
	Button({ showAlert.value = true }) { Text("Show Alert") }
	
	if(showAlert.value) {
		AlertDialog(
			title = { Text("Alert Dialog Example") },
			text = { Text("This is an example description...") },
			buttons = {
				Row(
					modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp),
					horizontalArrangement = Arrangement.spacedBy(16.dp)
				) {
					TextButton({ showAlert.value = false }) {
						Text("Cancel")
					}
					Button({ showAlert.value = false }) {
						Text("Okay")
					}
				}
			},
			onDismissRequest = { showAlert.value = false }
		)
	}
}
