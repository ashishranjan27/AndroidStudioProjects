package com.example.internet;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MainActivityTest {

    private MainActivity mainActivity;

    @Rule
    //launch the activity
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp()  {
        //get the activity
        mainActivity = activityActivityTestRule.getActivity();
    }

    @Test
    public void getdata() {
        Context context = Mockito.mock(Context.class);
        ConnectivityManager connectivityManager = Mockito.mock(ConnectivityManager.class);
        NetworkInfo networkInfo = Mockito.mock(NetworkInfo.class);
        Mockito.when(context.getSystemService(Context.CONNECTIVITY_SERVICE)).thenReturn(connectivityManager);
        Mockito.when(connectivityManager.getActiveNetworkInfo()).thenReturn(networkInfo);
        Mockito.when(networkInfo.isConnected()).thenReturn(true);

        assertFalse(mainActivity.checknetwork());
    }

}