            package androidx.profileinstaller;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.os.Process;
            import java.io.File;
            import java.io.IOException;
            import p000.I1Ii1lIoOI;
            import p000.OOIoioOOOi10;
            import p000.Oi1ol0llI;
            import p000.iOOoIil;
            
            public class ProfileInstallReceiver extends BroadcastReceiver {
                @Override
                public final void onReceive(Context context, Intent intent) throws IOException {
                    Bundle extras;
/* 1 */             if (intent == null) {
/* 332 */               return;
                    }
/* 5 */             String action = intent.getAction();
/* 18 */            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
/* 30 */                OOIoioOOOi10.I0000Il00O(context, new I1Ii1lIoOI(1), new Oi1ol0llI(this, 14), true);
/* 33 */                return;
                    }
/* 43 */            if (!"androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
/* 155 */               if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
/* 161 */                   Process.sendSignal(Process.myPid(), 10);
/* 166 */                   setResultCode(12);
/* 169 */                   return;
                        }
/* 176 */               if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
/* 332 */                   return;
                        }
/* 186 */               String string = extras.getString("EXTRA_BENCHMARK_OPERATION");
/* 192 */               Oi1ol0llI oi1ol0llI = new Oi1ol0llI(this, 14);
/* 201 */               if (!"DROP_SHADER_CACHE".equals(string)) {
/* 229 */                   oi1ol0llI.I0001Ioi1lo(16, null);
/* 332 */                   return;
                        } else if (iOOoIil.I00000oIO(context.createDeviceProtectedStorageContext().getCacheDir())) {
/* 217 */                   oi1ol0llI.I0001Ioi1lo(14, null);
/* 220 */                   return;
                        } else {
/* 223 */                   oi1ol0llI.I0001Ioi1lo(15, null);
/* 226 */                   return;
                        }
                    }
/* 45 */            Bundle extras2 = intent.getExtras();
/* 49 */            if (extras2 != null) {
/* 53 */                String string2 = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
/* 63 */                if (!"WRITE_SKIP_FILE".equals(string2)) {
/* 117 */                   if ("DELETE_SKIP_FILE".equals(string2)) {
/* 121 */                       I1Ii1lIoOI i1Ii1lIoOI = new I1Ii1lIoOI(1);
/* 126 */                       Oi1ol0llI oi1ol0llI2 = new Oi1ol0llI(this, 14);
/* 140 */                       new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
/* 145 */                       OOIoioOOOi10.I00000oOI(i1Ii1lIoOI, oi1ol0llI2, 11, null);
/* 148 */                       return;
                            }
/* 332 */                   return;
                        }
/* 67 */                I1Ii1lIoOI i1Ii1lIoOI2 = new I1Ii1lIoOI(1);
/* 72 */                Oi1ol0llI oi1ol0llI3 = new Oi1ol0llI(this, 14);
                        try {
/* 96 */                    OOIoioOOOi10.I00000oIO(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
/* 99 */                    OOIoioOOOi10.I00000oOI(i1Ii1lIoOI2, oi1ol0llI3, 10, null);
                        } catch (PackageManager.NameNotFoundException e) {
/* 106 */                   OOIoioOOOi10.I00000oOI(i1Ii1lIoOI2, oi1ol0llI3, 7, e);
                        }
                    }
                }
            }
