package com.androsz.electricsleep.app;

import android.view.View;

import com.androsz.electricsleep.R;

public class WelcomeTutorialWizardActivity extends CustomTitlebarWizardActivity {

	@Override
	protected int getWizardLayoutId() {
		// TODO Auto-generated method stub
		return R.layout.wizard_welcome;
	}

	@Override
	protected void onFinishWizardActivity() {
		finish();
	}

	@Override
	protected void onPrepareLastSlide() {
		// TODO Auto-generated method stub

	}

	public void onSkipTutorialClick(final View v) {
		finish();
	}

	@Override
	protected boolean onWizardActivity() {
		// TODO Auto-generated method stub
		return false;
	}
}