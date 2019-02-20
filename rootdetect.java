package src.com.XXX;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import java.io.File;
import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewEngine;
import uk;
import vq;
import vr;

public class MainActivityMBRC
  extends CordovaActivity
{
  public static Context a;
  public static WebView b;
  public static String c;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    super.init();
    for (;;)
    {
      int k;
      try
      {
        boolean bool = Boolean.valueOf(uk.a()).booleanValue(); 
        i = 1;
        if (!bool)
        {
          String str = Build.TAGS;
          if ((str == null) || (!str.contains("test-keys"))) {
            break label288;
          }
          j = 1;
          if (j == 0)
          {
            String[] arrayOfString = new String[9];
            arrayOfString[0] = "/system/app/Superuser.apk";
            arrayOfString[i] = "/sbin/su";
            arrayOfString[2] = "/system/bin/su";
            arrayOfString[3] = "/system/xbin/su";
            arrayOfString[4] = "/data/local/xbin/su";
            arrayOfString[5] = "/data/local/bin/su";
            arrayOfString[6] = "/system/sd/xbin/su";
            arrayOfString[7] = "/system/bin/failsafe/su";
            arrayOfString[8] = "/data/local/su";
            k = 0;
            if (k >= 9) {
              break label300;
            }
            if (!new File(arrayOfString[k]).exists()) {
              break label294;
            }
            m = 1;
            if (m == 0) {
              if (!vr.a()) {
                break label306;
              }
            }
          }
        }
        if (i != 0) // i cant bypass this condition.
        {
          c = "YES";
          AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
          localBuilder.setTitle("Root Device Detected!");
          localBuilder.setMessage("Perangkat anda terdeteksi sebagai rooted device. Untuk menghindari sesuatu yang tidak diinginkan, anda tidak diperkenankan mengakses aplikasi ini.").setCancelable(false).setPositiveButton("Yes", new vq(this));
          localBuilder.create().show();
          return;
        }
        c = "NO";
        a = getApplicationContext();
        b = (WebView)this.appView.getEngine().getView();
        Log.i("test1", "OPEN");
        super.loadUrl("file:///android_asset/www/index.html");
        return;
      }
      catch (Exception localException)
      {
        localException.getMessage();
        return;
      }
      label288:
      int j = 0;
      continue;
      label294:
      k++;
      continue;
      label300:
      int m = 0;
      continue;
      label306:
      int i = 0;
    }
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
  }
}
