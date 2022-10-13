import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.LeadingIconTab
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun TabsExamplesComposable() {
	data class Page(
		val label: String,
		val icon: ImageVector,
	)
	
	var currentPage by rememberSaveable { mutableStateOf(1) }
	val pages = listOf(
		Page("Home", Icons.Default.Home),
		Page("Alert", Icons.Default.Notifications)
	)
	
	// TabRow - Tab, Icon Only
	TabRow(
		selectedTabIndex = currentPage
	) {
		pages.forEachIndexed { index, page ->
			Tab(
				selected = currentPage == index,
				onClick = { currentPage = index },
				icon = { Icon(page.icon, page.label) },
				modifier = Modifier.padding(top = 8.dp)
			)
		}
	}
	
	// TabRow - LeadingIconTab - Plain
	TabRow(
		selectedTabIndex = currentPage
	) {
		pages.forEachIndexed { index, page ->
			LeadingIconTab(
				selected = currentPage == index,
				onClick = { currentPage = index },
				text = { Text(page.label) },
				icon = { Icon(page.icon, page.label) },
				modifier = Modifier.padding(top = 8.dp)
			)
		}
	}
	
	// TabRow - Tab, Text Only
	TabRow(
		selectedTabIndex = currentPage
	) {
		pages.forEachIndexed { index, page ->
			Tab(
				selected = currentPage == index,
				onClick = { currentPage = index },
				text = { Text(page.label) },
				modifier = Modifier.padding(top = 8.dp)
			)
		}
	}
	
	// TabRow - Tab, Plain
	TabRow(
		selectedTabIndex = currentPage
	) {
		pages.forEachIndexed { index, page ->
			Tab(
				selected = currentPage == index,
				onClick = { currentPage = index },
				text = { Text(page.label) },
				icon = { Icon(page.icon, page.label) },
				modifier = Modifier.padding(top = 8.dp)
			)
		}
	}
}
