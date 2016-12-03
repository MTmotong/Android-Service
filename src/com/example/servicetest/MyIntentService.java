package com.example.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

//IntentService 集开启线程和自动停止与一身

public class MyIntentService extends IntentService {

	public MyIntentService() {
		super("MyIntentService");
	}

	@Override //在子线程中运行
	protected void onHandleIntent(Intent intent) {
		// TODO Auto-generated method stub
		// 打印当前线程的id
		Log.d("MyIntentService", "Thread id is " + Thread.currentThread().getId());
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d("MyIntentService", "onDestroy executed");
	}
	
}
