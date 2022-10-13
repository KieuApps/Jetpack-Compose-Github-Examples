import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.material.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp

@Composable
fun ComponentExamplesComposable() {
	
	// TriStateCheckbox
	Column {
		val (apples, onApplesStateChange) = rememberSaveable { mutableStateOf(true) }
		val (oranges, onOrangesStateChange) = rememberSaveable { mutableStateOf(true) }
		val (watermelons, onWatermelonsStateChange) = rememberSaveable { mutableStateOf(true) }
		
		val fruitState = rememberSaveable(apples, oranges, watermelons) {
			if(apples && oranges && watermelons)
				ToggleableState.On
			else if(!apples && !oranges && !watermelons)
				ToggleableState.Off
			else
				ToggleableState.Indeterminate
		}
		
		val onFruitClick = {
			val s = fruitState != ToggleableState.On
			onApplesStateChange(s)
			onOrangesStateChange(s)
			onWatermelonsStateChange(s)
		}
		
		Row(verticalAlignment = Alignment.CenterVertically) {
			TriStateCheckbox(state = fruitState, onClick = onFruitClick)
			Text("Fruit")
		}
		Column(Modifier.padding(start = 16.dp)) {
			Row(verticalAlignment = Alignment.CenterVertically) {
				Checkbox(apples, onApplesStateChange)
				Text("Apples")
			}
			Row(verticalAlignment = Alignment.CenterVertically) {
				Checkbox(oranges, onOrangesStateChange)
				Text("Oranges")
			}
			Row(verticalAlignment = Alignment.CenterVertically) {
				Checkbox(watermelons, onWatermelonsStateChange)
				Text("Watermelons")
			}
		}
	}
}
