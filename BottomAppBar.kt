import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun BottomAppBarExamplesComposable() {
	data class Page(
		val label: String,
		val icon: ImageVector,
	)
	
	var currentPage by rememberSaveable { mutableStateOf(1) }
	val pages = listOf(
		Page("Contacts", Icons.Default.Person),
		Page("Home", Icons.Default.Home),
		Page("Notifications", Icons.Default.Notifications)
	)
	
	// BottomAppBar - Plain
	BottomAppBar {
		pages.forEachIndexed { index, page ->
			BottomNavigationItem(
				selected = currentPage == index,
				onClick = { currentPage = index },
				icon = { Icon(page.icon, page.label) },
				label = { Text(page.label) },
			)
		}
	}
	
	// BottomAppBar - Always Show Label
	BottomAppBar {
		pages.forEachIndexed { index, page ->
			BottomNavigationItem(
				selected = currentPage == index,
				onClick = { currentPage = index },
				icon = { Icon(page.icon, page.label) },
				label = { Text(page.label) },
				alwaysShowLabel = false
			)
		}
	}
	
	// BottomAppBar - Custom Color
	BottomAppBar(
		backgroundColor = MaterialTheme.colors.secondary,
		contentColor = MaterialTheme.colors.onSecondary
	) {
		pages.forEachIndexed { index, page ->
			BottomNavigationItem(
				selected = currentPage == index,
				onClick = { currentPage = index },
				icon = { Icon(page.icon, page.label) },
				label = { Text(page.label) }
			)
		}
	}
}
