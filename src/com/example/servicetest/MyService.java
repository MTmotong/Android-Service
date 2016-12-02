package com.example.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	// 服务第一次创建时调用
	@Override
	public void onCreate() {
		super.onCreate();
		Log.d("MyService", "onCreate executed");
	}
	//服务启动时调用
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		
		Log.d("MyService", "onStartCommand executed");
		return super.onStartCommand(intent, flags, startId);
		
	}
	//服务销毁时调用
	@Override 
	public void onDestroy() {
		super.onDestroy();
		Log.d("MyService", "onDestroy executed");
	}
}
