import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun TextExamplesComposable() {
	
	// Text - Plain
	Text("Hello, World!")
	
	
	// Text - Variable
	val username = "username"
	Text(
		text = "Hello, $username!",
		modifier = Modifier.padding(16.dp)
	)
	
	
	// Text - String Resource
	Text(
		text = "Your string...", 
		modifier = Modifier.padding(8.dp)
	)
	
	
	// Text - Clickable
	Text(
		text = "Click me", 
		modifier = Modifier
			.clickable { /* TODO */ }
			.padding(4.dp)
	)
	
	
	// TextButton - Plain
	TextButton(
		onClick = { }
	) { 
		Text("Button") 
	}
	
	
	// Text - Overflow
	Text(
		"Lorem ipsum dolor sit amet, \n" +
			"consectetur adipiscing \n" +
			"elit, sed do eiusmod tempor \n" +
			"incididunt ut labore et \n" +
			"dolore magna aliqua.",
		maxLines = 1,
		overflow = TextOverflow.Ellipsis
	)
	
	
	// Text - Selectable
	SelectionContainer(
		modifier = Modifier.padding(8.dp)
	) {
		Column {
			Text(
				"Lorem ipsum dolor sit amet, \n" +
					"consectetur adipiscing \n" +
					"elit, sed do eiusmod tempor \n" +
					"incididunt ut labore et \n" +
					"dolore magna aliqua."
			)
			DisableSelection {
				Text("This last text isn't selectable.")
			}
		}
	}
}
