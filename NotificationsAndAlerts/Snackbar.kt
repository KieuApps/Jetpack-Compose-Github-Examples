import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarResult
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch

@Composable
fun SnackbarExamplesComposable() {
	val scaffoldState = rememberScaffoldState()
	val coroutineScope = rememberCoroutineScope()
	
	// Snackbar - Plain
	Scaffold(scaffoldState = scaffoldState) { padding ->
		Button(
			onClick = {
				coroutineScope.launch {
					scaffoldState.snackbarHostState.showSnackbar(
						message = "Sample Snackbar"
					)
				}
			},
			modifier = Modifier.padding(padding)
		) {
			Text("Show Snackbar")
		}
	}
	
	
	// Snackbar - Action Button
	Scaffold(scaffoldState = scaffoldState) { padding ->
		Button(
			onClick = {
				coroutineScope.launch {
					val snackbarResult = scaffoldState.snackbarHostState.showSnackbar(
						message = "Sample Snackbar",
						actionLabel = "Okay"
					)
					when(snackbarResult) {
						SnackbarResult.Dismissed       -> { /* TO DO */ }
						SnackbarResult.ActionPerformed -> { /* TO DO */ }
					}
				}
			},
			modifier = Modifier.padding(padding)
		) {
			Text("Show Snackbar")
		}
	}
}
