import { native } from "./Native";

class ClickReadHelper {
  /**
   * 打开点读书页面
   */
  startClickRead() {
    native.startClickRead();
  }
}

export const clickReadHelper = new ClickReadHelper();
