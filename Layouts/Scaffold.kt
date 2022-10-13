import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomAppBar
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun ScaffoldExamplesComposable() {
	
	// Scaffold - Custom Drawer
	val scope = rememberCoroutineScope()
	val scaffoldState = rememberScaffoldState()
	val drawer = scaffoldState.drawerState
	
	Box(Modifier.fillMaxWidth()) {
		Scaffold(
			modifier = Modifier
				.width(200.dp)
				.height(350.dp),
			scaffoldState = scaffoldState,
			drawerContent = {
				/* TODO */
			},
			drawerElevation = 8.dp,
			drawerBackgroundColor = MaterialTheme.colors.secondary,
			drawerContentColor = MaterialTheme.colors.onSecondary,
			backgroundColor = MaterialTheme.colors.primary,
			contentColor = MaterialTheme.colors.onPrimary
		) { padding ->
			
			/* Your main content... */
			Box(Modifier.padding(padding)) {
				Text(" drag ->")
			}
			
			/* Close the drawer on back press */
			if(drawer.isOpen) {
				BackHandler {
					scope.launch { drawer.close() }
				}
			}
		}
	}
	
	// Scaffold - Plain
	Box(Modifier.fillMaxWidth()) {
		Scaffold(
			modifier = Modifier
				.width(200.dp)
				.height(350.dp),
			scaffoldState = scaffoldState,
			topBar = {
				TopAppBar {
					/* TODO */
				}
			},
			bottomBar = {
				BottomAppBar {
					/* TODO */
				}
			},
			floatingActionButton = {
				FloatingActionButton(
					onClick = { /* TODO */ }
				) {
					/* TODO */
				}
			},
			drawerContent = {
				/* TODO */
			}
		) { padding ->
			
			/* Your main content... */
			Box(Modifier.padding(padding)) {
				/* TODO */
			}
			
			/* Close the drawer on back press */
			if(drawer.isOpen) {
				BackHandler {
					scope.launch { drawer.close() }
				}
			}
		}
	}
}
