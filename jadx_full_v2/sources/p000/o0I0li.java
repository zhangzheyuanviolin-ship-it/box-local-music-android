            package p000;

            import android.content.Context;
            import android.util.Log;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.PrintWriter;
            import java.nio.charset.Charset;
            
            public final class o0I0li {
                public static final Object I00000oOI;
                public final Context I00000oIO;

                static {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(o0I0li.class);
/* 13 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(Context.class));
/* 23 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = new IOO0o0I1l(28);
/* 25 */            iOiIOOl0lOI00000oOI.I00000oOI();
/* 33 */            I00000oOI = new Object();
                }

                public o0I0li(Context context) {
/* 4 */             this.I00000oIO = context;
                }

                public final IioiI0IIIIO I00000oIO(o01oIol1O o01oiol1o) {
                    IioiI0IIIIO iioiI0IIIIO;
                    synchronized (I00000oOI) {
                        try {
/* 10 */                    File fileI00000oOI = I00000oOI(o01oiol1o);
/* 14 */                    iioiI0IIIIO = null;
                            try {
/* 32 */                        String str = new String(new IoIlOo1o0IIl(fileI00000oOI).I00IlilI0i0i(), Charset.forName("UTF-8"));
                                try {
/* 35 */                            il0ioI1OI il0ioi1oiI00000oOI = lilloiiOo.I00000oOI(str);
/* 41 */                            if (il0ioi1oiI00000oOI instanceof il0oiOo1loi1) {
/* 71 */                                il0oiOo1loi1 il0oioo1loi1I00000oOI = il0ioi1oiI00000oOI.I00000oOI();
                                        try {
/* 122 */                                   iioiI0IIIIO = new IioiI0IIIIO(il0oioo1loi1I00000oOI.I0000oI00("temporaryTokenExpiryTimestamp").I0000O(), new o01Il0IOli(il0oioo1loi1I00000oOI.I0000oI00("fid").I0001Ioi1lo()), il0oioo1loi1I00000oOI.I0000oI00("refreshToken").I0001Ioi1lo(), il0oioo1loi1I00000oOI.I0000oI00("temporaryToken").I0001Ioi1lo());
                                        } catch (ClassCastException | IllegalStateException | NullPointerException e) {
/* 132 */                                   o01oiol1o.I0000O.I000l1(loOill110Ol.FILE_READ_RETURNED_INVALID_DATA);
/* 161 */                                   Log.e("MLKitInstallationIdSaver", "Error traversing installation info JSON object:\nraw json:\n" + str + "\nparsed json:\n" + il0oioo1loi1I00000oOI.toString(), e);
                                        }
                                    } else {
/* 55 */                                Log.e("MLKitInstallationIdSaver", "Error parsing installation info JSON element:\n".concat(String.valueOf(il0ioi1oiI00000oOI)));
/* 62 */                                o01oiol1o.I0000O.I000l1(loOill110Ol.FILE_READ_RETURNED_MALFORMED_DATA);
                                    }
                                } catch (il1ilOI0IIlo e2) {
/* 175 */                           Log.e("MLKitInstallationIdSaver", "Error parsing installation info JSON object:\n".concat(str), e2);
/* 182 */                           o01oiol1o.I0000O.I000l1(loOill110Ol.FILE_READ_RETURNED_MALFORMED_DATA);
                                }
                            } catch (IOException e3) {
/* 192 */                       if (fileI00000oOI.exists()) {
/* 221 */                           o01oiol1o.I0000O.I000l1(loOill110Ol.FILE_READ_FAILED);
/* 242 */                           Log.w("MLKitInstallationIdSaver", "Error reading installation id file: " + fileI00000oOI.toString(), e3);
                                } else {
/* 212 */                           Log.i("MLKitInstallationIdSaver", "Installation id file not yet present: " + fileI00000oOI.toString());
                                }
/* 14 */                        return null;
                            }
                        } catch (Throwable th) {
/* 437 */                   throw th;
                        }
                    }
/* 186 */           return iioiI0IIIIO;
                }

                public final File I00000oOI(o01oIol1O o01oiol1o) {
/* 1 */             loOill110Ol looill110ol = loOill110Ol.DIRECTORY_CREATION_FAILED;
/* 7 */             Context context = this.I00000oIO;
/* 9 */             File noBackupFilesDir = context.getNoBackupFilesDir();
/* 13 */            if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
/* 26 */                Log.w("MLKitInstallationIdSaver", "noBackupFilesDir doesn't exist, using regular files directory instead");
/* 29 */                noBackupFilesDir = context.getFilesDir();
/* 33 */                if (noBackupFilesDir != null && !noBackupFilesDir.isDirectory()) {
                            try {
/* 45 */                        if (!noBackupFilesDir.mkdirs()) {
/* 63 */                            Log.w("MLKitInstallationIdSaver", "mkdirs failed: " + noBackupFilesDir.toString());
/* 66 */                            o01oiol1o.I00000oIO(looill110ol);
                                }
                            } catch (SecurityException e) {
/* 81 */                        Log.w("MLKitInstallationIdSaver", "mkdirs threw an exception: ".concat(noBackupFilesDir.toString()), e);
/* 84 */                        o01oiol1o.I00000oIO(looill110ol);
                            }
                        }
                    }
/* 89 */            return new File(noBackupFilesDir, "com.google.mlkit.InstallationId");
                }

                public final void I0000Il00O(IioiI0IIIIO iioiI0IIIIO, o01oIol1O o01oiol1o) {
                    File fileI00000oOI;
/* 31 */            String str = String.format("{\n \"fid\": \"%s\",\n \"refreshToken\": \"%s\",\n \"temporaryToken\": \"%s\",\n \"temporaryTokenExpiryTimestamp\": \"%d\"\n}\n", ((o01Il0IOli) iioiI0IIIIO.I00000oOI).I00000oIO, (String) iioiI0IIIIO.I0000Il00O, (String) iioiI0IIIIO.I0000O, Long.valueOf(iioiI0IIIIO.I00000oIO));
                    synchronized (I00000oOI) {
                        try {
                            try {
/* 38 */                        fileI00000oOI = I00000oOI(o01oiol1o);
                            } catch (IOException e) {
/* 99 */                        e = e;
/* 100 */                       fileI00000oOI = null;
                            }
                            try {
/* 60 */                        Log.i("MLKitInstallationIdSaver", "Creating installation id: " + fileI00000oOI.toString());
/* 65 */                        IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(fileI00000oOI);
/* 68 */                        FileOutputStream fileOutputStreamI00IoO0 = ioIlOo1o0IIl.I00IoO0();
                                try {
/* 74 */                            PrintWriter printWriter = new PrintWriter(fileOutputStreamI00IoO0);
/* 77 */                            printWriter.println(str);
/* 80 */                            printWriter.flush();
/* 83 */                            ioIlOo1o0IIl.I0010o(fileOutputStreamI00IoO0);
/* 86 */                            fileI00000oOI.toString();
                                } catch (Throwable th) {
/* 95 */                            ioIlOo1o0IIl.I00100o1O0lo(fileOutputStreamI00IoO0);
/* 98 */                            throw th;
                                }
                            } catch (IOException e2) {
/* 92 */                        e = e2;
/* 105 */                       o01oiol1o.I0000O.I000l1(loOill110Ol.FILE_WRITE_FAILED);
/* 118 */                       Log.e("MLKitInstallationIdSaver", "Error writing to installation id file ".concat(String.valueOf(fileI00000oOI)), e);
                            }
                        } catch (Throwable th2) {
/* 332 */                   throw th2;
                        }
                    }
                }
            }
