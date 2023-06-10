package com.cetc28.openglapp.activity;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.cetc28.openglapp.opengl.MyGLSurfaceView;

public class OpenGLES20Activity extends Activity {

    private MyGLSurfaceView mGLView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        mGLView = new MyGLSurfaceView(this);
        setContentView(mGLView);
    }
}
