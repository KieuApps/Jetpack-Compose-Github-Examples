import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.LeadingIconTab
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

data class Page(
	val label: String,
	val icon: ImageVector,
)

@Composable
fun LeadingIconTabExamples() {
	
	var currentPage by rememberSaveable { mutableStateOf(1) }
	val pages = listOf(
		Page("Acct", Icons.Default.AccountCircle),
		Page("Home", Icons.Default.Home),
		Page("Alert", Icons.Default.Notifications)
	)
	
	
	// LeadingIconTab - Plain
	TabRow(
		selectedTabIndex = currentPage,
		modifier = Modifier.fillMaxWidth(0.85f)
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
	
	
	// LeadingIconTab - Custom Color
	TabRow(
		selectedTabIndex = currentPage,
		modifier = Modifier.fillMaxWidth(0.85f)
	) {
		pages.forEachIndexed { index, page ->
			LeadingIconTab(
				selected = currentPage == index,
				onClick = { currentPage = index },
				text = { Text(page.label) },
				icon = { Icon(page.icon, page.label) },
				modifier = Modifier.padding(top = 8.dp),
				selectedContentColor = Color(0xFF7C3988),
				unselectedContentColor = Color(0xFF7C3988).copy(0.72f)
			)
		}
	}
	
	
	// LeadingIconTab - Custom Shape
	TabRow(
		selectedTabIndex = currentPage,
		modifier = Modifier.fillMaxWidth(0.85f)
	) {
		pages.forEachIndexed { index, page ->
			LeadingIconTab(
				selected = currentPage == index,
				onClick = { currentPage = index },
				text = { Text(page.label) },
				icon = { Icon(page.icon, page.label) },
				modifier = Modifier
					.background(MaterialTheme.colors.background)
					.padding(top = 4.dp, start = 2.dp, end = 2.dp)
					.clip(
						RoundedCornerShape(
							topStart = 8.dp,
							topEnd = 8.dp
						)
					)
					.background(MaterialTheme.colors.primary)
			)
		}
	}
}
