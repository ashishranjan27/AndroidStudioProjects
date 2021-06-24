package com.example.opendialertest

import android.content.Intent
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers
import androidx.test.espresso.intent.matcher.IntentMatchers.*
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.hamcrest.CoreMatchers
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test


class MainActivityTest{

    @Rule
    @JvmField
    public var intenttestrule = IntentsTestRule(MainActivity::class.java)

    private val PHONE_NUMBER = "1234567890"
    private val INTENT_DATA_PHONE_NUMBER = "tel:$PHONE_NUMBER"
    private val PACKAGE_ANDROID_DIALER = "com.android.dialer"

    @Test
    fun test() {
        Espresso.onView(withId(R.id.button)).perform(ViewActions.click())
        intended(allOf(
            hasAction(Intent.ACTION_DIAL),
            hasData(INTENT_DATA_PHONE_NUMBER),
            toPackage(PACKAGE_ANDROID_DIALER)
        ));
    }

}