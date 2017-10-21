package logutil.com.logutils;

import android.util.Log;

/**
 * Created by Suganya on 3/8/2017.
 */

public class LogDebug {

    private static final String TAG = "SUPER_GRADLE_SAMPLE";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
