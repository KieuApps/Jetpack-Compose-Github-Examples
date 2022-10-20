import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

@Composable
fun BuildAnnotatedStringExamples() {
	
	// BuildAnnotatedString
	Text(
		text = buildAnnotatedString {
			withStyle(
				style = SpanStyle(
					color = Color(0xFF9A50A7),
					fontWeight = FontWeight.Bold,
					fontStyle = FontStyle.Italic
				)
			) {
				append("H")
			}
			append("ello ")
			withStyle(
				style = SpanStyle(
					color = Color(0xFF9A50A7),
					fontWeight = FontWeight.Bold,
					fontStyle = FontStyle.Italic,
					letterSpacing = 12.sp
				)
			) {
				append("K")
			}
			withStyle(
				style = SpanStyle(
					letterSpacing = 12.sp
				)
			) {
				append("otlin")
			}
		},
		style = MaterialTheme.typography.h4
	)
}
