package com.tusu.santoecomerch.Aauthentication;

import android.content.Context;
import android.content.SharedPreferences;

public class UserAuthintication {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Context context;

    private static final String PREFERENCE_NAME=  "user authuntication";
    private static final String TIME_STAMP ="time_stamp";
    private static final String DEVICE_KEY ="device_key";
    private static final String DAFFULT_USER_AUTHITICATION="Could not found value";

    public UserAuthintication(Context context) {
        this.context=context;
        sharedPreferences=context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
    }

    public void saveUserinfo(String timeStamp,String device_key){
        editor.putString(TIME_STAMP,timeStamp);
        editor.putString(DEVICE_KEY,device_key);
        editor.commit();
    }

    public String getTimeStamp(){
        return sharedPreferences.getString(TIME_STAMP,DAFFULT_USER_AUTHITICATION);
    }
    public String getDeviceKey(){
        return sharedPreferences.getString(DEVICE_KEY,DAFFULT_USER_AUTHITICATION);
    }
    public void clearUser(){
        editor.clear();
        editor.commit();
    }
}
