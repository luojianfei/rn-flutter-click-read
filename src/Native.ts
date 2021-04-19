import { NativeModules, Platform } from "react-native";

const { RNFlutterClickRead } = NativeModules;

class Native {
  startClickRead() {
    if (Platform.OS === "android") {
      RNFlutterClickRead.startClickRead();
    }
  }
}

export const native = new Native();
