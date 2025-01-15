package com.sky.crispyJourney;

import com.getcapacitor.BridgeActivity;
import android.os.Bundle;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState());

        // ✅ Explicitly set the correct WebView path for loading index.html
        this.loadUrl("file:///android_asset/index.html");
    }
}
