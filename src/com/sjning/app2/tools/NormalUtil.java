package com.sjning.app2.tools;

import com.sjning.app2.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;



/**
 * @author sea 通用工具类
 */
/**
 * @author Administrator
 * 
 */
public class NormalUtil {
	/**
	 * 相机出错时提示框
	 * 
	 * @param activity
	 */
	public static void displayFrameworkBugMessageAndExit(final Activity activity) {
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
		builder.setTitle(activity.getString(R.string.app_name));
		builder.setMessage(activity
				.getString(R.string.msg_camera_framework_bug));
		builder.setPositiveButton(R.string.sure, new OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				activity.finish();
			}
		});
		builder.setOnCancelListener(new OnCancelListener() {

			@Override
			public void onCancel(DialogInterface dialog) {
				// TODO Auto-generated method stub
				activity.finish();
			}
		});
		builder.show();
	}

	public static void displayMessage(Context context, String message) {
		Toast.makeText(context.getApplicationContext(), message,
				Toast.LENGTH_SHORT).show();
	}
}
