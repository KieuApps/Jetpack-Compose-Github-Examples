import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CardExamplesComposable() {
	
	// Card - Plain
	Box(Modifier.padding(8.dp)) {
		Card(
			modifier = Modifier.fillMaxWidth(0.75f),
			elevation = 6.dp
		) {
			Column(Modifier.padding(16.dp)) {
				Text("Card Example")
				Text(
					"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed " +
						"do eiusmod tempor incididunt ut labore et dolore magna aliqua."
				)
			}
		}
	}
	
	// Card - Clickable
	Box(Modifier.padding(8.dp)) {
		Card(
			modifier = Modifier
				.fillMaxWidth(0.75f)
				.clickable { /* TODO */ },
			elevation = 6.dp
		) {
			Column(Modifier.padding(16.dp)) {
				Text("Clickable Card")
				Text(
					"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed " +
						"do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
				)
			}
		}
	}
	
	// Card - Expandable
	var expanded by rememberSaveable { mutableStateOf(false) }
	val icon = Icons.Default.ArrowDropDown
	
	Box(Modifier.padding(8.dp)) {
		Card(
			modifier = Modifier
				.fillMaxWidth(0.75f)
				.clickable { expanded = !expanded },
			elevation = 6.dp
		) {
			Column(modifier = Modifier.padding(16.dp)) {
				Row {
					Text("Expandable Card", Modifier.weight(1f))
					Icon(icon, if(expanded) "Show less" else "Show more")
				}
				AnimatedVisibility(expanded) {
					Text(
						"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed " +
							"do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
					)
				}
			}
		}
	}
}
