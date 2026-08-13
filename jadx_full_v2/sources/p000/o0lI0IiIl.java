            package p000;

            import android.content.Context;
            import android.util.Log;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.PrintWriter;
            
            public final class o0lI0IiIl {
                public static final Object I00000oOI;
                public final Context I00000oIO;

                static {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(o0lI0IiIl.class);
/* 13 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(Context.class));
/* 23 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = new iOloo0O0O(28);
/* 25 */            iOiIOOl0lOI00000oOI.I00000oOI();
/* 33 */            I00000oOI = new Object();
                }

                public o0lI0IiIl(Context context) {
/* 4 */             this.I00000oIO = context;
                }

                public final void I00000oIO(o0i1ol0 o0i1ol0Var, o01oIol1O o01oiol1o) {
                    File fileI00000oOI;
/* 7 */             String string = o0i1ol0Var.I00000oIO.toString();
                    synchronized (I00000oOI) {
                        try {
                            try {
/* 14 */                        fileI00000oOI = I00000oOI();
                            } catch (IOException e) {
/* 75 */                        e = e;
/* 76 */                        fileI00000oOI = null;
                            }
                            try {
/* 36 */                        Log.i("MLKitRemoteConfigSaver", "Creating remote config settings: " + fileI00000oOI.toString());
/* 41 */                        IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(fileI00000oOI);
/* 44 */                        FileOutputStream fileOutputStreamI00IoO0 = ioIlOo1o0IIl.I00IoO0();
                                try {
/* 50 */                            PrintWriter printWriter = new PrintWriter(fileOutputStreamI00IoO0);
/* 53 */                            printWriter.println(string);
/* 56 */                            printWriter.flush();
/* 59 */                            ioIlOo1o0IIl.I0010o(fileOutputStreamI00IoO0);
/* 62 */                            fileI00000oOI.toString();
                                } catch (Throwable th) {
/* 71 */                            ioIlOo1o0IIl.I00100o1O0lo(fileOutputStreamI00IoO0);
/* 74 */                            throw th;
                                }
                            } catch (IOException e2) {
/* 68 */                        e = e2;
/* 81 */                        o01oiol1o.I0000O.I000l1(loOill110Ol.FILE_WRITE_FAILED);
/* 94 */                        Log.e("MLKitRemoteConfigSaver", "Error writing to remote config settings file ".concat(String.valueOf(fileI00000oOI)), e);
                            }
                        } catch (Throwable th2) {
/* 106 */                   throw th2;
                        }
                    }
                }

                public final File I00000oOI() {
/* 5 */             Context context = this.I00000oIO;
/* 7 */             File noBackupFilesDir = context.getNoBackupFilesDir();
/* 11 */            if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
/* 24 */                Log.w("MLKitRemoteConfigSaver", "noBackupFilesDir doesn't exist, using regular files directory instead");
/* 27 */                noBackupFilesDir = context.getFilesDir();
/* 31 */                if (noBackupFilesDir != null && !noBackupFilesDir.isDirectory()) {
                            try {
/* 43 */                        if (!noBackupFilesDir.mkdirs()) {
/* 61 */                            Log.w("MLKitRemoteConfigSaver", "mkdirs failed: " + noBackupFilesDir.toString());
                                }
                            } catch (SecurityException e) {
/* 76 */                        Log.w("MLKitRemoteConfigSaver", "mkdirs threw an exception: ".concat(noBackupFilesDir.toString()), e);
                            }
                        }
                    }
/* 81 */            return new File(noBackupFilesDir, "com.google.mlkit.RemoteConfig");
                }
            }
