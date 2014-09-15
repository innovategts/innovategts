package com.example.vspmemberweb;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class DoubleMeActivity extends Activity implements OnClickListener {

   EditText inputValue=null;
   Integer doubledValue =0;
   Button doubleMe;

   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.calculate);

       inputValue = (EditText) findViewById(R.id.inputNum);
       doubleMe = (Button) findViewById(R.id.doubleme);

       doubleMe.setOnClickListener(this);
   }

   @Override
   public void onClick(View v) {

       switch (v.getId()){
       case R.id.doubleme:

             new Thread(new Runnable() {
                   public void run() {

                       try{
                           URL url = new URL("http://10.0.2.2:8080/VSPMemberweb/DoubleMeServlet");
                           URLConnection connection = url.openConnection();

                           String inputString = inputValue.getText().toString();
                           //inputString = URLEncoder.encode(inputString, "UTF-8");

                           Log.d("inputString", inputString);

                           connection.setDoOutput(true);
                           OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
                           out.write(inputString);
                           out.close();

                           BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                           String returnString="";
                           doubledValue =0;

                           while ((returnString = in.readLine()) != null) 
                           {
                               doubledValue= Integer.parseInt(returnString);
                           }
                           in.close();


                           runOnUiThread(new Runnable() {
                                public void run() {

                                    inputValue.setText(doubledValue.toString());

                               }
                           });

                           }catch(Exception e)
                           {
                               Log.d("Exception",e.toString());
                           }

                   }
                 }).start();

           break;
           }
       }

   }