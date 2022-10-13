import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.DEVELOPER_NAME.APP_NAME.util.*

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
				
BottomAppBar(
    backgroundColor = MaterialTheme.colors.secondary,
    contentColor = MaterialTheme.colors.onSecondary,
    modifier = Modifier.fillMaxWidth(0.8f)
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
