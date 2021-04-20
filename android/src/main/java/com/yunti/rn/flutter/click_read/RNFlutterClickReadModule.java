
package com.yunti.rn.flutter.click_read;

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
  }

  /**
   * 初始化flutter引擎
   */
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
  public void openClickRead(){
    Activity activity = getCurrentActivity();
    activity.startActivity(FlutterActivity.withCachedEngine(FLUTTER_ENGINE_ID_CLICK_READ).build(activity));
  }

  @ReactMethod
  public void initEngine(){
    initFlutterEngine() ;
  }

  @Override
  public String getName() {
    return "RNFlutterClickRead";
  }
}