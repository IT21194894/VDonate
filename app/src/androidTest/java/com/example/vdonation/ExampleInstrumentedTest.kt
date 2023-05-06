package com.example.vdonation

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.vdonation", appContext.packageName)
    }
}
class SignUpInstrumentedTest {

    @Rule
    @JvmField
    val activityScenarioRule = ActivityScenarioRule(SignupOrg::class.java)

    @Test
    fun signUpTest() {
        val name = "VDOnate"
        val email = "vdonate@gmail.com"
        val password = "pass123456"

        onView(withId(R.id.signup_name)).perform(typeText(name), closeSoftKeyboard())
        onView(withId(R.id.signup_email)).perform(typeText(email), closeSoftKeyboard())
        onView(withId(R.id.signup_password)).perform(typeText(password), closeSoftKeyboard())
        onView(withId(R.id.signup_button)).perform(click())

        onView(withText(R.string.signup_success)).check(matches(isDisplayed()))
    }
}