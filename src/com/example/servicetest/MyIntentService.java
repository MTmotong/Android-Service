package com.example.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

//IntentService �������̺߳��Զ�ֹͣ��һ��

public class MyIntentService extends IntentService {

	public MyIntentService() {
		super("MyIntentService");
	}

	@Override //�����߳�������
	protected void onHandleIntent(Intent intent) {
		// TODO Auto-generated method stub
		// ��ӡ��ǰ�̵߳�id
		Log.d("MyIntentService", "Thread id is " + Thread.currentThread().getId());
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d("MyIntentService", "onDestroy executed");
	}
	
}
