
package com.reactlibrary;

import android.app.Activity;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;

public class RNFlutterClickReadModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private static final String FLUTTER_ENGINE_ID_CLICK_READ = "YUNTITECH_CLICK_READ" ;
  private FlutterEngine flutterEngine;
  public RNFlutterClickReadModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
    initFlutterEngine() ;
  }

  private void initFlutterEngine(){
    flutterEngine = new FlutterEngine(reactContext);

    flutterEngine.getDartExecutor().executeDartEntrypoint(
            DartExecutor.DartEntrypoint.createDefault()
    );
    FlutterEngineCache
            .getInstance()
            .put(FLUTTER_ENGINE_ID_CLICK_READ, flutterEngine);
  }

  @ReactMethod
  public void startClickRead(){
    Activity activity = getCurrentActivity();
    activity.startActivity(FlutterActivity.withCachedEngine(FLUTTER_ENGINE_ID_CLICK_READ).build(activity));
  }

  @Override
  public String getName() {
    return "RNRnClickRead";
  }
}