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
