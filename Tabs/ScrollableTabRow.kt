import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.LeadingIconTab
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

data class Page(
	val label: String,
	val icon: ImageVector,
)

@Composable
fun ScrollableTabRowExamples() {
	
	var currentPage by rememberSaveable { mutableStateOf(0) }
	val pages = listOf(
		Page("Acct", Icons.Default.AccountCircle),
		Page("Home", Icons.Default.Home),
		Page("Alert", Icons.Default.Notifications),
		Page("Info", Icons.Default.Info),
		Page("Share", Icons.Default.Share),
		Page("Menu", Icons.Default.MoreVert),
	)
	
	// ScrollableTabRow - Tab, Icon Only
	ScrollableTabRow(
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
	
	// ScrollableTabRow - LeadingIconTab, Plain
	ScrollableTabRow(
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
	
	// ScrollableTabRow - Tab, Text Only
	ScrollableTabRow(
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
	
	// ScrollableTabRow - Tab, Plain
	ScrollableTabRow(
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
