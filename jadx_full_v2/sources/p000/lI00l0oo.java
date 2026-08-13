            package p000;

            import android.app.AppOpsManager;
            import android.content.Context;
            import android.os.Binder;
            import android.os.Process;
            import java.util.Objects;
            
            public abstract class lI00l0oo {
                public static int I00000oIO(Context context, String str) {
                    int iNoteProxyOpNoThrow;
/* 1 */             int iMyPid = Process.myPid();
/* 5 */             int iMyUid = Process.myUid();
/* 9 */             String packageName = context.getPackageName();
/* 18 */            if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
/* 21 */                String strPermissionToOp = AppOpsManager.permissionToOp(str);
/* 26 */                if (strPermissionToOp != null) {
/* 29 */                    if (packageName == null) {
/* 35 */                        String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
/* 39 */                        if (packagesForUid != null && packagesForUid.length > 0) {
/* 45 */                            packageName = packagesForUid[0];
                                }
                            }
/* 49 */                    int iMyUid2 = Process.myUid();
/* 53 */                    String packageName2 = context.getPackageName();
/* 59 */                    if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
/* 71 */                        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
/* 82 */                        iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
/* 86 */                        if (iNoteProxyOpNoThrow == 0) {
/* 96 */                            iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, context.getOpPackageName()) : 1;
                                }
                            } else {
/* 108 */                       iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                            }
/* 112 */                   if (iNoteProxyOpNoThrow != 0) {
/* 115 */                       return -2;
                            }
                        }
/* 25 */                return 0;
                    }
/* 17 */            return -1;
                }
            }
