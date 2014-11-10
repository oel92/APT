package com.example.connexus_os;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageButton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
 
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.loopj.android.http.*;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;
import org.json.JSONObject;


@SuppressLint("NewApi")
public class ViewStreams extends ActionBarActivity {
	
	@SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

		StrictMode.setThreadPolicy(policy); 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_streams);
        
        final ArrayList<String> images = new ArrayList<String>();
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://connexus-os.appspot.com/mobileView", new AsyncHttpResponseHandler() {

            @Override
            public void onStart() {
                // called before request is started
            }

            @Override
			public void onSuccess(int statusCode, Header[] headers, byte[] response) {
                // called when response HTTP status is "200 OK"
            	System.out.println("works");
            	String str;
				try {
					str = new String(response, "UTF-8");
					JSONArray urls = new JSONArray(str);
					System.out.println(urls.get(0).toString());
					for(int i = 0; i < urls.length(); i++){
						System.out.println("added");
						images.add(urls.get(i).toString());
					}
					
					 ImageButton image1 = (ImageButton)findViewById(R.id.view1);
				        ImageButton image2 = (ImageButton)findViewById(R.id.view2);
				        ImageButton image3 = (ImageButton)findViewById(R.id.view3);
				        ImageButton image4 = (ImageButton)findViewById(R.id.view4);
				        ImageButton image5 = (ImageButton)findViewById(R.id.view5);
				        ImageButton image6 = (ImageButton)findViewById(R.id.view6);
				        ImageButton image7 = (ImageButton)findViewById(R.id.view7);
				        ImageButton image8 = (ImageButton)findViewById(R.id.view8);
				        ImageButton image9 = (ImageButton)findViewById(R.id.view9);
				        ImageButton image10 = (ImageButton)findViewById(R.id.view10);
				        ImageButton image11 = (ImageButton)findViewById(R.id.view11);
				        ImageButton image12 = (ImageButton)findViewById(R.id.view12);
				        ImageButton image13 = (ImageButton)findViewById(R.id.view13);
				        ImageButton image14 = (ImageButton)findViewById(R.id.view14);
				        ImageButton image15 = (ImageButton)findViewById(R.id.view15);
				        ImageButton image16 = (ImageButton)findViewById(R.id.view16);
				        int count = 0;
				        System.out.println(images.size());
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image1.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image2.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image3.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image4.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image5.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image6.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image7.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image8.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image9.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image10.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image11.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image12.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image13.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image14.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image15.setBackgroundDrawable(drawable);
				        	count++;
				        }
				        if(count < images.size()){
				        	Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(images.get(count)).getContent());
				        	Bitmap bitmapScaled = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
				        	Drawable drawable = new BitmapDrawable(bitmapScaled);
				        	image16.setBackgroundDrawable(drawable);
				        	count++;
				        }
				       
				        
					
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	
//            	try {
//            		JSONObject o = new JSONObject(new String(response));
//                    
//					System.out.print(o.optJSONObject(0));
//				} catch (JSONException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
            	
            	
            }
           

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {
                // called when response HTTP status is "4XX" (eg. 401, 403, 404)
            }

            @Override
            public void onRetry(int retryNo) {
                // called when request is retried
        	}


			
			
        });
        
       
        
        
        
	}
}