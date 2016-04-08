package com.multiculturalapp;
import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;
public class HomePageTest extends ActivityUnitTestCase<HomePage> {
    public HomePageTest(Class<HomePage> activityClass) {
		super(activityClass);
	}
        public void testNextActivityWasLaunchedWithIntent() {
        	Intent mLaunchIntent = new Intent(getInstrumentation().getTargetContext(), HomePage.class);
            startActivity(mLaunchIntent, null, null);
            final Button launchNextButton =(Button) getActivity().findViewById(R.id.worshipPlaces);
            	launchNextButton.performClick();
            final Intent launchIntent = getStartedActivityIntent();
            assertNotNull("Intent was null", launchIntent);
            	assertTrue(isFinishCalled());
            final String payload =launchIntent.getStringExtra("activity_worship_places");
            	assertEquals("Payload is empty", HomePage.class, payload);
    }
}