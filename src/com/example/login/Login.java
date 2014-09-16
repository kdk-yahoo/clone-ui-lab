package com.example.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        AsyncHttpClient client = new AsyncHttpClient();
        String searchUrl = "https://ajax.googleapis.com./ajax/services/search/images?v=1.0&q=" + "android";
        client.get(url,responseHandler);
        
    }
    
    public void login(View v){
    	Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
    }
    
    public void cancel(View v){
    	Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show();
    }
}
