package com.example.shareapp;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Build;

import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.Intents.intending;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasData;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static androidx.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {



    //Instead use dialler activity
    @Rule
    public IntentsTestRule<MainActivity> mActivityRule =
            new IntentsTestRule<>(MainActivity.class);

   // private static final String PHONE_NUMBER = "12346790";
   // private static final String INTENT_DATA_PHONE_NUMBER = "Download this one :  https://play.google.com/store/apps/details?id=com.hwkrbbt.downloadall&hl=en_IN&gl=US";              //"tel:" + PHONE_NUMBER;
    //private static String PACKAGE_ANDROID_DIALER = "com.android.phone";

    //static {
      //  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        //    PACKAGE_ANDROID_DIALER = "com.android.shareappp";
        //}
    //}

   @Test
    public void triggerIntentTest() {
       onView(withId(R.id.sharebtn)).perform(click());

       intended(allOf(hasAction(Intent.ACTION_CHOOSER),
               hasExtra(is(Intent.EXTRA_INTENT),
                       allOf(hasAction(Intent.ACTION_SEND),
                               hasExtra(Intent.EXTRA_TEXT, "Download this one :  https://play.google.com/store/apps/details?id=com.hwkrbbt.downloadall&hl=en_IN&gl=US"),
                               toPackage("com.whatsapp")
                               ))));

   }

    /*
 @Test
 public void activityResult_DisplaysContactsPhoneNumber() {
     // Build the result to return when the activity is launched.
     Intent resultData = new Intent();
     String phoneNumber = "123-345-6789";
     resultData.putExtra("phone", phoneNumber);
     Instrumentation.ActivityResult result =
             new Instrumentation.ActivityResult(Activity.RESULT_OK, resultData);

     // Set up result stubbing when an intent sent to "contacts" is seen.
     intending(toPackage("com.android.contacts")).respondWith(result);

     // User action that results in "contacts" activity being launched.
     // Launching activity expects phoneNumber to be returned and displayed.
     onView(withId(R.id.sharebtn)).perform(click());

     // Assert that the data we set up above is shown.
   //  onView(withId(R.id.phoneNumber)).check(matches(withText(phoneNumber)));
 }
*/

}