/* generic EPD Controller for Android devices,
 * based on https://github.com/unwmun/refreshU */

package org.koreader.launcher.device.rockchip;

import org.koreader.launcher.device.EPDController;

public class RK3066EPDController extends RK30xxEPDController implements EPDController {
    @Override
    public void setEpdMode(android.view.View targetView,
                           int mode, long delay,
                           int x, int y, int width, int height, String epdMode)
    {
        requestEpdMode(targetView, epdMode);
    }
}
