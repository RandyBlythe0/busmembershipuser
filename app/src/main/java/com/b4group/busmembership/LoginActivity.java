package com.b4group.busmembership;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.maps.model.LatLng;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        Button sign_in_button = (Button) findViewById(R.id.sign_in_button);
        sign_in_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MapsActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }

    public String api_call(int pull,int bus_id, double latitude, double longitude){
//        RequestQueue queue = Volley.newRequestQueue(this);
//        String api_string = pull == 1 ? "pull_coordinates" : "push_coordinates";
//        api_string += "?bus_id=" + bus_id;
//        api_string += "&x=" + latitude;
//        api_string += "&y=" + longitude;
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, Global.base_url+api_string,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        // Display the first 500 characters of the response string.
//                        //textView.setText("Response is: "+ response.substring(0,500));
//                        Log.i("Json Response",response.toString());
//                        try {
//                            JSONArray jArray = new JSONArray(response);
//                            for (int i=0;i<jArray.length();i++){
//                                JSONObject obj = jArray.getJSONObject(i);
//                                globalLatLng = new LatLng(obj.getDouble("x"),obj.getDouble("y"));
//                                Log.i("Json Response",obj.toString());
//                            }
//                        } catch (JSONException e) {
//                            Log.e("Json Response",e.toString());
//                        }
//
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                //textView.setText("That didn't work!");
//                Log.e("API Response", "Error in API Request" + error.toString());
//            }
//        });

// Add the request to the RequestQueue.
//        queue.add(stringRequest);
        return "";
    }

}
