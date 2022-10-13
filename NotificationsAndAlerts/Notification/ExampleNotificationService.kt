import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import com.DEVELOPER_NAME.APP_NAME.R

class ExampleNotificationService(
	private val context: Context,
) {
	private val notificationManager = context
		.getSystemService(Context.NOTIFICATION_SERVICE)
		as NotificationManager

	fun showNotification(message: String) {
		val exampleNotification =
			NotificationCompat.Builder(context, EXAMPLE_CHANNEL_ID)
				.setSmallIcon(R.drawable.ic_baseline_notifications_24)
				.setContentTitle("Example Notification")
				.setContentText("Someone says: $message")
				.build()

		notificationManager.notify(1, exampleNotification)
	}

	companion object {
		const val EXAMPLE_CHANNEL_ID = "example_channel"
	}
}
