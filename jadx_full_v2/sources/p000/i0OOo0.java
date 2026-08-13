            package p000;

            import android.content.Context;
            import android.util.Log;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            
            public final class i0OOo0 {
                public static final Object I00000oOI = new Object();
                public Context I00000oIO;

                public ii10lIloOOii I00000oIO(String str, String str2, iOlOi1iIii ioloi1iiii, long j) {
                    File fileI00000oOI;
                    synchronized (I00000oOI) {
                        try {
                            try {
/* 11 */                        fileI00000oOI = I00000oOI(str);
                                try {
/* 20 */                            byte[] bArrI00IlilI0i0i = new IoIlOo1o0IIl(fileI00000oOI).I00IlilI0i0i();
/* 24 */                            ii0II11oi0I ii0ii11oi0i = ii0II11oi0I.I00000oOI;
/* 26 */                            ii0oIOiIl ii0oioiil = ii0oIOiIl.I0000Il00O;
/* 30 */                            iOlOOil iolooilI001IIilI0O = iOlOOil.I001IIilI0O(bArrI00IlilI0i0i, ii0II11oi0I.I0000Il00O);
/* 38 */                            if (!iolooilI001IIilI0O.I001lllioOl()) {
/* 44 */                                Log.w("AccelerationAllowlistPersistence", "No persistence time in cached entry, discarding it");
                                    } else if (System.currentTimeMillis() / 1000 <= iolooilI001IIilI0O.I001IO000().I00111O() + j) {
/* 81 */                                if (iolooilI001IIilI0O.I001i1lo1io().equals(str2)) {
/* 92 */                                    return iolooilI001IIilI0O.I001i1O0Ol();
                                        }
/* 87 */                                Log.i("AccelerationAllowlistPersistence", "Different client library version, discarding cached content");
/* 10 */                                return null;
                                    }
/* 102 */                           Log.i("AccelerationAllowlistPersistence", "Cache expired");
/* 10 */                            return null;
                                } catch (IOException e) {
/* 139 */                           e = e;
/* 143 */                           if (fileI00000oOI == null) {
/* 208 */                               Log.w("AccelerationAllowlistPersistence", "Unable to access acceleration allowlist cache file: null", e);
/* 217 */                               ((lIO0IIo) ioloi1iiii.I0000oI00).I000O01llI0(iI1lI0i.FILE_READ_FAILED);
                                    } else if (fileI00000oOI.exists()) {
/* 191 */                               Log.w("AccelerationAllowlistPersistence", "Error reading acceleration allowlist cache file: " + fileI00000oOI.toString(), e);
/* 200 */                               ((lIO0IIo) ioloi1iiii.I0000oI00).I000O01llI0(iI1lI0i.FILE_READ_FAILED);
                                    } else {
/* 169 */                               Log.i("AccelerationAllowlistPersistence", "No acceleration allowlist cache file at: " + fileI00000oOI.toString());
                                    }
/* 10 */                            return null;
                                }
                            } catch (IOException e2) {
/* 141 */                       e = e2;
/* 142 */                       fileI00000oOI = null;
                            }
                        } catch (ii0iI11ol e3) {
/* 125 */                   Log.e("AccelerationAllowlistPersistence", "Invalid cached data in file: " + fileI00000oOI.toString(), e3);
/* 134 */                   ((lIO0IIo) ioloi1iiii.I0000oI00).I000O01llI0(iI1lI0i.FILE_READ_RETURNED_MALFORMED_DATA);
/* 10 */                    return null;
                        } finally {
                        }
                    }
                }

                public File I00000oOI(String str) throws IOException {
/* 9 */             String strI000lI = IlIi0I0.I000lI("com.google.mlkit.AccelerationAllowList.", str, ".com.google.perception.NNAPI");
/* 13 */            Context context = this.I00000oIO;
/* 17 */            File noBackupFilesDir = context.getNoBackupFilesDir();
/* 21 */            if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
/* 34 */                Log.w("AccelerationAllowlistPersistence", "noBackupFilesDir doesn't exist, using regular files directory instead");
/* 37 */                noBackupFilesDir = context.getFilesDir();
/* 45 */                if (!noBackupFilesDir.isDirectory()) {
                            try {
/* 51 */                        if (!noBackupFilesDir.mkdirs()) {
/* 62 */                            Log.w("AccelerationAllowlistPersistence", "mkdirs failed: ".concat(String.valueOf(noBackupFilesDir)));
/* 78 */                            throw new IOException("Unable to create persistence dir ".concat(String.valueOf(noBackupFilesDir)));
                                }
                            } catch (SecurityException e) {
/* 90 */                        Log.w("AccelerationAllowlistPersistence", "mkdirs threw an exception: ".concat(String.valueOf(noBackupFilesDir)), e);
/* 106 */                       throw new IOException("Unable to create persistence dir ".concat(String.valueOf(noBackupFilesDir)), e);
                            }
                        }
                    }
/* 107 */           return new File(noBackupFilesDir, strI000lI);
                }

                public void I0000Il00O(ii10lIloOOii ii10liloooii, String str, String str2, iOlOi1iIii ioloi1iiii) {
                    File fileI00000oOI;
/* 5 */             iOlOOi iolooiI00111O = iOlOOil.I00111O();
/* 9 */             iolooiI00111O.I0001Ioi1lo();
/* 16 */            iOlOOil.I001l0I00((iOlOOil) iolooiI00111O.I00iiI, ii10liloooii);
/* 19 */            ii101o ii101oVarI001IIilI0O = ii10IO.I001IIilI0O();
/* 29 */            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
/* 36 */            if (!ii101oVarI001IIilI0O.I00iiI.I00100l0()) {
/* 38 */                ii101oVarI001IIilI0O.I000II();
                    }
/* 1 */             ((ii10IO) ii101oVarI001IIilI0O.I00iiI).zzd = jCurrentTimeMillis;
/* 52 */            ii10IO ii10io = (ii10IO) ii101oVarI001IIilI0O.I0000Il00O();
/* 54 */            iolooiI00111O.I0001Ioi1lo();
/* 61 */            iOlOOil.I001iOo1i0O((iOlOOil) iolooiI00111O.I00iiI, ii10io);
/* 64 */            iolooiI00111O.I0001Ioi1lo();
/* 71 */            iOlOOil.I001lIiIIo1O((iOlOOil) iolooiI00111O.I00iiI, str2);
/* 78 */            iOlOOil iolooil = (iOlOOil) iolooiI00111O.I0000Il00O();
                    synchronized (I00000oOI) {
                        try {
                            try {
/* 83 */                        fileI00000oOI = I00000oOI(str);
                                try {
/* 105 */                           Log.i("AccelerationAllowlistPersistence", "Saving nnapi allowlist cache to: " + fileI00000oOI.toString());
/* 110 */                           IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(fileI00000oOI);
/* 113 */                           FileOutputStream fileOutputStreamI00IoO0 = ioIlOo1o0IIl.I00IoO0();
                                    try {
/* 117 */                               iolooil.I0000Il00O(fileOutputStreamI00IoO0);
/* 120 */                               ioIlOo1o0IIl.I0010o(fileOutputStreamI00IoO0);
/* 123 */                               fileI00000oOI.toString();
                                    } catch (Throwable th) {
/* 132 */                               ioIlOo1o0IIl.I00100o1O0lo(fileOutputStreamI00IoO0);
/* 141 */                               ((lIO0IIo) ioloi1iiii.I0000oI00).I000O01llI0(iI1lI0i.FILE_WRITE_FAILED);
/* 144 */                               throw th;
                                    }
                                } catch (IOException e) {
/* 129 */                           e = e;
/* 157 */                           Log.e("AccelerationAllowlistPersistence", "Error writing to nnapi allowlist cache file ".concat(String.valueOf(fileI00000oOI)), e);
/* 166 */                           ((lIO0IIo) ioloi1iiii.I0000oI00).I000O01llI0(iI1lI0i.FILE_WRITE_FAILED);
                                }
                            } catch (IOException e2) {
/* 145 */                       e = e2;
/* 146 */                       fileI00000oOI = null;
                            }
                        } catch (Throwable th2) {
/* 483 */                   throw th2;
                        }
                    }
                }
            }
