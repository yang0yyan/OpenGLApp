package com.cetc28.openglapp.activity;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.cetc28.openglapp.R;
import com.cetc28.openglapp.utils.PermissionUtil;

public class DownloadActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

        boolean isPermission = PermissionUtil.getPermissions(this,PermissionUtil.WRITE_EXTERNAL_STORAGE,PermissionUtil.READ_EXTERNAL_STORAGE);
        if(isPermission){
            
        }
    }
}
