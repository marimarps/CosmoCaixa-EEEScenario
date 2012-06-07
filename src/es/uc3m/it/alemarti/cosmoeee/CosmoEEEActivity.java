package es.uc3m.it.alemarti.cosmoeee;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;

public class CosmoEEEActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("http://eiffel.itram.es/cosmoapp/");
    }
}