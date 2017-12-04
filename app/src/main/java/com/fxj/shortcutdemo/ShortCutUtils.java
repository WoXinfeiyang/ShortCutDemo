package com.fxj.shortcutdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

/**
 * Created by fuxianjin-hj on 2017/12/4.
 */

public class ShortCutUtils {
    public static void addShortCut(Context context, int iconResId, String title, Intent launcherIntent){
        Intent addShortCutIntent=new Intent("com.android.launcher.action.INSTALL_SHORTCUT");

        Intent.ShortcutIconResource icon=Intent.ShortcutIconResource.fromContext(context,iconResId);
        addShortCutIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE,icon);/*设置快捷方式icon*/

        addShortCutIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME,title);/*设置快捷方式标题*/
        addShortCutIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT,launcherIntent);

        context.sendBroadcast(addShortCutIntent);
    }
}
