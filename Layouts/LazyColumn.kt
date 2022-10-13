import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnExamplesComposable() {
	
	data class Book(
		val title: String,
		val cover: Int = R.drawable.some_image,
		val link: String = "",
	)
	
	val books = listOf(
		Book("Book\nOne"),
		Book("Book\nTwo"),
		Book("Book\nThree"),
		Book("Book\nFour"),
	)
	
	// Lazy Column - Plain
	LazyColumn(
		modifier = Modifier.padding(8.dp),
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		
		item { Text("Liked\nBooks") }
		
		items(books) { book ->
			Image(
				painter = painterResource(book.cover),
				contentDescription = book.title,
				modifier = Modifier
					.padding(8.dp)
					.clickable { openLink(book.title) }
			)
		}
	}
}
