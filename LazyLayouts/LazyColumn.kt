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

data class Book(
	val title: String,
	val cover: Int = R.drawable.some_image,
	val link: String = "",
)

@Composable
fun LazyColumnExamples() {
	
	val books = listOf(
		Book("Book One"),
		Book("Book Two"),
		Book("Book Three"),
		Book("Book Four"),
	)
	
	// Lazy Column - Plain
	LazyColumn(
		modifier = Modifier.padding(8.dp),
	) {
		item { Text("Liked Books", style = MaterialTheme.typography.h5) }
		
		items(books) { book ->
			Row {
				Image(
					painter = painterResource(book.cover),
					contentDescription = book.title,
					modifier = Modifier
						.padding(8.dp)
						.clickable { openLink(book.title) }
				)
				Column(
					modifier = Modifier
						.fillMaxWidth()
						.padding(16.dp)
				) {
					Text(
						text = book.title, 
						style = MaterialTheme.typography.h6
					)
                        		Text("Some description...")
				}
			}
		}
	}
}
