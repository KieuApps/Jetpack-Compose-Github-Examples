import androidx.compose.animation.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.unit.IntOffset

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun EnterTransitionExamples() {
    var visible by remember { mutableStateOf(false) }

    
    // Fade In
    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(),
        exit = ExitTransition.None
    ) {
        Text("Hello World!")
    }
    
    
    // Slide In
    AnimatedVisibility(
        visible = visible,
        enter = slideIn { IntOffset(it.width / 4, 100) },
        exit = ExitTransition.None
    ) {
        Text("Hello World!")
    }
    
    
    // Scale In
    AnimatedVisibility(
        visible = visible,
        enter = scaleIn(),
        exit = ExitTransition.None
    ) {
        Text("Hello World!")
    }
    
    
    // Expand In
    AnimatedVisibility(
        visible = visible,
        enter = expandIn(),
        exit = ExitTransition.None
    ) {
        Text("Hello World!")
    }
    
    
    // Expand Horizontally
    AnimatedVisibility(
        visible = visible,
        enter = expandHorizontally(),
        exit = ExitTransition.None
    ) {
        Text("Hello World!")
    }
    
    
    // Expand Vertically
    AnimatedVisibility(
        visible = visible,
        enter = expandVertically(),
        exit = ExitTransition.None
    ) {
        Text("Hello World!")
    }
}
