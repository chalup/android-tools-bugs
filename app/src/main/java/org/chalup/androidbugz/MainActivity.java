package org.chalup.androidbugz;

import android.app.Activity;
import android.content.Context;
import android.preference.PreferenceManager;

public class MainActivity extends Activity {
  private static void falsePositive(Context context) {
    boolean wat = PreferenceManager
        .getDefaultSharedPreferences(context)
        .edit()
        .putString("wat", "wat")
        .commit();
  }
}
