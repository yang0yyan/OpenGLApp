package com.cetc28.openglapp.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class DownLoadService extends Service {
    public static final String url = "https://dldir1.qq.com/qqfile/qq/PCQQ9.6.7/QQ9.6.7.28815.exe";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
