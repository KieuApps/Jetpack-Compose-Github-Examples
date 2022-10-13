import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun LazyRowExamplesComposable() {
	
	data class Movie(
		val title: String,
		val cover: Int = R.drawable.some_image,
		val link: String = ""
	)
	
	val movies = listOf(
		Movie("Movie\nOne"),
		Movie("Movie\nTwo"),
		Movie("Movie\nThree"),
		Movie("Movie\nFour"),
		Movie("Movie\nFive"),
		Movie("Movie\nSix"),
		Movie("Movie\nSeven"),
	)
	
	// LazyRow - Plain
	LazyRow(
		modifier = Modifier.padding(8.dp),
		verticalAlignment = Alignment.CenterVertically
	) {
		
		item { Text("Liked\nMovies") }
		
		items(movies) { movie ->
			Image(
				painter = painterResource(movie.cover),
				contentDescription = movie.title,
				modifier = Modifier
					.padding(8.dp)
					.clickable { openLink(movie.link) }
			)
		}
	}
}
