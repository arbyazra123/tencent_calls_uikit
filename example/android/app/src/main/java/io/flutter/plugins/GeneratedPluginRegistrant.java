package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.tencent.cloud.tuikit.tuicall_engine.TUICallEnginePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin tencent_calls_engine, com.tencent.cloud.tuikit.tuicall_engine.TUICallEnginePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.tencent.cloud.tuikit.flutter.tuicallkit.TUICallKitPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin tencent_calls_uikit, com.tencent.cloud.tuikit.flutter.tuicallkit.TUICallKitPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.qq.qcloud.tencent_im_sdk_plugin.tencent_im_sdk_plugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin tencent_cloud_chat_sdk, com.qq.qcloud.tencent_im_sdk_plugin.tencent_im_sdk_plugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.tencent.cloud.uikit.core.TUICorePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin tencent_cloud_uikit_core, com.tencent.cloud.uikit.core.TUICorePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e);
    }
  }
}
