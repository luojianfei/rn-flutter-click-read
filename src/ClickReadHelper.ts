import { native } from "./Native";

class ClickReadHelper {
  /**
   * 打开点读书页面
   */
  openClickRead() {
    native.openClickRead();
  }

  /**
   * 初始化flutter引擎
   */
  initEngine() {
    native.initFlutterEngine();
  }
}

export const clickReadHelper = new ClickReadHelper();
