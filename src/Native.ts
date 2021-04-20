import { NativeModules, Platform } from "react-native";

const { RNFlutterClickRead } = NativeModules;

class Native {
  /**
   * 打开点读书页面
   */
  openClickRead() {
    RNFlutterClickRead.openClickRead();
  }

  /**
   * 初始化flutter引擎
   */
  initFlutterEngine() {
    RNFlutterClickRead.initEngine();
  }
}

export const native = new Native();
