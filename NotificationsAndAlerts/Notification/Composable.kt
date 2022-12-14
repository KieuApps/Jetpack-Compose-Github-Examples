import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import com.DEVELOPER_NAME.APP_NAME.ExampleNotificationService

@Composable
fun NotificationComposable() {
	val context = LocalContext.current
	val service = ExampleNotificationService(context)
	
	var hasNotificationPermission by remember {
		if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
			mutableStateOf(
				ContextCompat.checkSelfPermission(
					context,
					Manifest.permission.POST_NOTIFICATIONS
				) == PackageManager.PERMISSION_GRANTED
			)
		} else mutableStateOf(true)
	}
	
	val permissionLauncher = rememberLauncherForActivityResult(
		contract = ActivityResultContracts.RequestPermission(),
		onResult = { isGranted ->
			hasNotificationPermission = isGranted
		}
	)
	
	Button(
		onClick = {
			if(hasNotificationPermission) {
				service.showNotification("Hello world!")
			} else {
				if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
					permissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
				}
			}
		}
	) {
		Text("Show Notification")
	}
}
