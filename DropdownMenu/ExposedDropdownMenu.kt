import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ExposedDropdownMenuBox
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DropdownMenuExampleComposable() {
	
	// ExposedDropdownMenu - Plain
	var expanded by remember { mutableStateOf(false) }
	val sizes = listOf(
		"Small", "Medium", "Large"
	)
	var selectedSize by rememberSaveable { mutableStateOf("Select a size") }
	
	ExposedDropdownMenuBox(
		expanded = expanded,
		onExpandedChange = { expanded = !expanded },
		modifier = Modifier.fillMaxWidth(0.7f)
	) {
		TextField(
			value = selectedSize,
			onValueChange = { selectedSize = it },
			readOnly = true,
			trailingIcon = {
				Icon(Icons.Default.KeyboardArrowDown, "Expand")
			}
		)
		ExposedDropdownMenu(
			expanded = expanded,
			onDismissRequest = { expanded = false }
		) {
			sizes.forEach { size ->
				DropdownMenuItem(
					onClick = {
						selectedSize = size
						expanded = false
					}
				) {
					Text(size)
				}
			}
		}
	}
}
