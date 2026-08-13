            package p000;

            import android.content.Context;
            import android.util.Log;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.PrintWriter;
            import java.nio.charset.Charset;
            
            public final class iOliloiooo {
                public static final Object I00000oOI;
                public final Context I00000oIO;

                static {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(iOliloiooo.class);
/* 13 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(Context.class));
/* 23 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = new i1O01Ill(19);
/* 25 */            iOiIOOl0lOI00000oOI.I00000oOI();
/* 33 */            I00000oOI = new Object();
                }

                public iOliloiooo(Context context) {
/* 4 */             this.I00000oIO = context;
                }

                public final IioiI0IIIIO I00000oIO(i0O1001OIi i0o1001oii) {
                    IioiI0IIIIO iioiI0IIIIO;
                    synchronized (I00000oOI) {
                        try {
/* 10 */                    File fileI00000oOI = I00000oOI(i0o1001oii);
/* 14 */                    iioiI0IIIIO = null;
                            try {
/* 32 */                        String str = new String(new IoIlOo1o0IIl(fileI00000oOI).I00IlilI0i0i(), Charset.forName("UTF-8"));
                                try {
/* 35 */                            iI01OoiIlOl ii01ooiilolI00000oOI = lii0olO.I00000oOI(str);
/* 41 */                            if (ii01ooiilolI00000oOI instanceof iI0IO110Iil) {
/* 73 */                                iI0IO110Iil ii0io110iilI00000oOI = ii01ooiilolI00000oOI.I00000oOI();
                                        try {
/* 124 */                                   iioiI0IIIIO = new IioiI0IIIIO(ii0io110iilI00000oOI.I0000oI00("temporaryTokenExpiryTimestamp").I0000O(), new iOlii1iOOil(ii0io110iilI00000oOI.I0000oI00("fid").I0001Ioi1lo()), ii0io110iilI00000oOI.I0000oI00("refreshToken").I0001Ioi1lo(), ii0io110iilI00000oOI.I0000oI00("temporaryToken").I0001Ioi1lo());
                                        } catch (ClassCastException | IllegalStateException | NullPointerException e) {
/* 136 */                                   ((lIO0IIo) i0o1001oii.I0000oI00).I000O01llI0(iOiooo0O1l.FILE_READ_RETURNED_INVALID_DATA);
/* 165 */                                   Log.e("MLKitInstallationIdSaver", "Error traversing installation info JSON object:\nraw json:\n" + str + "\nparsed json:\n" + ii0io110iilI00000oOI.toString(), e);
                                        }
                                    } else {
/* 55 */                                Log.e("MLKitInstallationIdSaver", "Error parsing installation info JSON element:\n".concat(String.valueOf(ii01ooiilolI00000oOI)));
/* 64 */                                ((lIO0IIo) i0o1001oii.I0000oI00).I000O01llI0(iOiooo0O1l.FILE_READ_RETURNED_MALFORMED_DATA);
                                    }
                                } catch (iI0Iol1l e2) {
/* 179 */                           Log.e("MLKitInstallationIdSaver", "Error parsing installation info JSON object:\n".concat(str), e2);
/* 188 */                           ((lIO0IIo) i0o1001oii.I0000oI00).I000O01llI0(iOiooo0O1l.FILE_READ_RETURNED_MALFORMED_DATA);
                                }
                            } catch (IOException e3) {
/* 198 */                       if (fileI00000oOI.exists()) {
/* 229 */                           ((lIO0IIo) i0o1001oii.I0000oI00).I000O01llI0(iOiooo0O1l.FILE_READ_FAILED);
/* 250 */                           Log.w("MLKitInstallationIdSaver", "Error reading installation id file: " + fileI00000oOI.toString(), e3);
                                } else {
/* 218 */                           Log.i("MLKitInstallationIdSaver", "Installation id file not yet present: " + fileI00000oOI.toString());
                                }
/* 14 */                        return null;
                            }
                        } catch (Throwable th) {
/* 437 */                   throw th;
                        }
                    }
/* 192 */           return iioiI0IIIIO;
                }

                public final File I00000oOI(i0O1001OIi i0o1001oii) {
/* 3 */             lIO0IIo lio0iio = (lIO0IIo) i0o1001oii.I0000O;
/* 5 */             iOiooo0O1l ioiooo0o1l = iOiooo0O1l.DIRECTORY_CREATION_FAILED;
/* 11 */            Context context = this.I00000oIO;
/* 13 */            File noBackupFilesDir = context.getNoBackupFilesDir();
/* 17 */            if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
/* 30 */                Log.w("MLKitInstallationIdSaver", "noBackupFilesDir doesn't exist, using regular files directory instead");
/* 33 */                noBackupFilesDir = context.getFilesDir();
/* 37 */                if (noBackupFilesDir != null && !noBackupFilesDir.isDirectory()) {
                            try {
/* 49 */                        if (!noBackupFilesDir.mkdirs()) {
/* 67 */                            Log.w("MLKitInstallationIdSaver", "mkdirs failed: " + noBackupFilesDir.toString());
/* 70 */                            lio0iio.I000O01llI0(ioiooo0o1l);
                                }
                            } catch (SecurityException e) {
/* 85 */                        Log.w("MLKitInstallationIdSaver", "mkdirs threw an exception: ".concat(noBackupFilesDir.toString()), e);
/* 88 */                        lio0iio.I000O01llI0(ioiooo0o1l);
                            }
                        }
                    }
/* 93 */            return new File(noBackupFilesDir, "com.google.mlkit.InstallationId");
                }

                public final void I0000Il00O(IioiI0IIIIO iioiI0IIIIO, i0O1001OIi i0o1001oii) {
                    File fileI00000oOI;
/* 31 */            String str = String.format("{\n \"fid\": \"%s\",\n \"refreshToken\": \"%s\",\n \"temporaryToken\": \"%s\",\n \"temporaryTokenExpiryTimestamp\": \"%d\"\n}\n", ((iOlii1iOOil) iioiI0IIIIO.I00000oOI).I00000oIO, (String) iioiI0IIIIO.I0000Il00O, (String) iioiI0IIIIO.I0000O, Long.valueOf(iioiI0IIIIO.I00000oIO));
                    synchronized (I00000oOI) {
                        try {
                            try {
/* 38 */                        fileI00000oOI = I00000oOI(i0o1001oii);
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
/* 107 */                       ((lIO0IIo) i0o1001oii.I0000oI00).I000O01llI0(iOiooo0O1l.FILE_WRITE_FAILED);
/* 120 */                       Log.e("MLKitInstallationIdSaver", "Error writing to installation id file ".concat(String.valueOf(fileI00000oOI)), e);
                            }
                        } catch (Throwable th2) {
/* 332 */                   throw th2;
                        }
                    }
                }
            }
