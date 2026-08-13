            package p000;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.Signature;
            import android.content.pm.SigningInfo;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.StrictMode;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class Io0ii1o0 {
                public static Io0ii1o0 I0000Il00O;
                public Context I00000oIO;
                public volatile String I00000oOI;

                public static Io0ii1o0 I00000oIO(Context context) {
                    Io0ii1o0 io0ii1o0;
/* 1 */             lII0I0I000I.I000II(context);
                    synchronized (Io0ii1o0.class) {
/* 7 */                 io0ii1o0 = I0000Il00O;
/* 9 */                 if (io0ii1o0 == null) {
/* 11 */                    il11lo il11loVar = li0iOI11O1lI.I00000oIO;
                            synchronized (li0iOI11O1lI.class) {
/* 18 */                        if (li0iOI11O1lI.I0000oI00 == null) {
/* 24 */                            li0iOI11O1lI.I0000oI00 = context.getApplicationContext();
                                } else {
/* 34 */                            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                                }
                            }
/* 40 */                    io0ii1o0 = new Io0ii1o0();
/* 47 */                    io0ii1o0.I00000oIO = context.getApplicationContext();
/* 49 */                    VarHandle.storeStoreFence();
/* 52 */                    I0000Il00O = io0ii1o0;
                        }
                    }
/* 60 */            return io0ii1o0;
                }

                /* JADX WARN: Code restructure failed: missing block: B:58:0x00c5, code lost:
                
                    r5 = r9;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final boolean I0000Il00O(PackageInfo packageInfo, boolean z) {
                    iIi000111ioI iii000111ioi;
                    iIi000111ioI iii000111ioi2;
                    int i;
/* 2 */             if (packageInfo != null) {
/* 7 */                 if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
/* 29 */                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
/* 41 */                    z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                        }
                        try {
/* 47 */                    iii000111ioi = z ? lOiI0il.I0000Il00O : lOiI0il.I00000oOI;
/* 49 */                    SigningInfo signingInfo = packageInfo.signingInfo;
/* 51 */                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
/* 146 */                       i1oll0i01 i1oll0i01Var = iI1olii1.I00lll10;
/* 148 */                       iii000111ioi2 = iIi000111ioI.I00o101lO;
                            } else {
/* 66 */                        i1oll0i01 i1oll0i01Var2 = iI1olii1.I00lll10;
/* 69 */                        Object[] objArrCopyOf = new Object[4];
/* 71 */                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
/* 75 */                        int length = signingCertificateHistory.length;
/* 76 */                        int i2 = 0;
/* 77 */                        int i3 = 0;
/* 78 */                        while (i2 < length) {
/* 82 */                            byte[] byteArray = signingCertificateHistory[i2].toByteArray();
/* 86 */                            byteArray.getClass();
/* 89 */                            int length2 = objArrCopyOf.length;
/* 90 */                            int i4 = i3 + 1;
/* 92 */                            if (i4 < 0) {
/* 134 */                               throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                                    }
/* 94 */                            if (i4 <= length2) {
/* 96 */                                i = length2;
                                    } else {
/* 101 */                               i = (length2 >> 1) + length2 + 1;
/* 102 */                               if (i < i4) {
/* 104 */                                   int iHighestOneBit = Integer.highestOneBit(i3);
/* 108 */                                   i = iHighestOneBit + iHighestOneBit;
                                        }
/* 109 */                               if (i < 0) {
/* 111 */                                   i = Integer.MAX_VALUE;
                                        }
                                    }
/* 114 */                           if (i > length2) {
/* 117 */                               objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                                    }
/* 121 */                           objArrCopyOf[i3] = byteArray;
/* 123 */                           i2++;
/* 125 */                           i3 = i4;
                                }
/* 142 */                       iii000111ioi2 = i3 == 0 ? iIi000111ioI.I00o101lO : new iIi000111ioI(objArrCopyOf, i3);
                            }
                        } catch (IllegalArgumentException unused) {
/* 212 */                   Log.i("GoogleSignatureVerifier", "package info is not set correctly");
/* 236 */                   if ((z ? I0000O(packageInfo, lOiI0il.I00000oIO) : I0000O(packageInfo, lOiI0il.I00000oIO[0])) != null) {
                            }
                        }
/* 154 */               if (iii000111ioi2.isEmpty()) {
/* 207 */                   throw new IllegalArgumentException("Unable to obtain package certificate history.");
                        }
/* 156 */               iI1olii1 ii1olii1I001i1O0Ol = iii000111ioi2.I001i1O0Ol();
/* 160 */               int size = ii1olii1I001i1O0Ol.size();
/* 164 */               int i5 = 0;
/* 165 */               while (i5 < size) {
/* 171 */                   byte[] bArr = (byte[]) ii1olii1I001i1O0Ol.get(i5);
/* 173 */                   i1oll0i01 i1oll0i01VarListIterator = iii000111ioi.listIterator(0);
/* 195 */                   do {
/* 181 */                       int i6 = i5 + 1;
/* 183 */                       if (i1oll0i01VarListIterator.hasNext()) {
                                }
/* 195 */                   } while (!Arrays.equals(bArr, (byte[]) i1oll0i01VarListIterator.next()));
/* 6 */                     return true;
                        }
                    }
/* 1 */             return false;
                }

                public static l1O1iiOOil1o I0000O(PackageInfo packageInfo, l1O1iiOOil1o... l1o1iiooil1oArr) {
/* 1 */             Signature[] signatureArr = packageInfo.signatures;
/* 4 */             if (signatureArr != null) {
/* 9 */                 if (signatureArr.length != 1) {
/* 15 */                    Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
/* 3 */                     return null;
                        }
/* 30 */                l1oliollOo l1oliolloo = new l1oliollOo(packageInfo.signatures[0].toByteArray());
/* 34 */                for (int i = 0; i < l1o1iiooil1oArr.length; i++) {
/* 42 */                    if (l1o1iiooil1oArr[i].equals(l1oliolloo)) {
/* 44 */                        return l1o1iiooil1oArr[i];
                            }
                        }
                    }
/* 3 */             return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:84:0x01b8  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00000oOI(int i) throws PackageManager.NameNotFoundException {
                    IIOo1i iIOo1iI001lllioOl;
                    int length;
                    ApplicationInfo applicationInfo;
                    boolean zI00OI1;
/* 11 */            String[] packagesForUid = this.I00000oIO.getPackageManager().getPackagesForUid(i);
/* 16 */            if (packagesForUid == null || (length = packagesForUid.length) == 0) {
/* 480 */               iIOo1iI001lllioOl = IIOo1i.I001lllioOl("no pkgs");
                    } else {
/* 23 */                iIOo1iI001lllioOl = null;
/* 24 */                int i2 = 0;
                        while (true) {
/* 25 */                    if (i2 >= length) {
/* 474 */                       lII0I0I000I.I000II(iIOo1iI001lllioOl);
                                break;
                            }
/* 27 */                    String str = packagesForUid[i2];
/* 35 */                    if (str == null) {
/* 37 */                        iIOo1iI001lllioOl = IIOo1i.I001lllioOl("null pkg");
                            } else if (str.equals(this.I00000oOI)) {
/* 463 */                       iIOo1iI001lllioOl = IIOo1i.I0000oI00;
                            } else {
/* 53 */                        il11lo il11loVar = li0iOI11O1lI.I00000oIO;
/* 55 */                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                try {
/* 61 */                            li0iOI11O1lI.I00000oIO();
/* 68 */                            zI00OI1 = ((i1OiIiiIl) li0iOI11O1lI.I0000Il00O).I00OI1();
/* 72 */                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                } catch (IioI1I1llol1 | RemoteException e) {
/* 312 */                           Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                } finally {
                                }
/* 75 */                        if (zI00OI1) {
/* 79 */                            boolean zI00000oOI = Io0ii0lOoi.I00000oOI(this.I00000oIO);
/* 83 */                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                    try {
/* 91 */                                lII0I0I000I.I000II(li0iOI11O1lI.I0000oI00);
                                        try {
/* 94 */                                    li0iOI11O1lI.I00000oIO();
/* 99 */                                    lII0I0I000I.I000II(li0iOI11O1lI.I0000oI00);
/* 116 */                                   Context context = (Context) OIOiOlIO01.I00O0o1oo(OIOiOlIO01.I00O0i0ii(OIOiOlIO01.I00O10llo(li0iOI11O1lI.I0000oI00)));
                                            try {
/* 120 */                                       i1OiIiiIl i1oiiiiil = (i1OiIiiIl) li0iOI11O1lI.I0000Il00O;
/* 122 */                                       Parcel parcelI00Iooi00oi = i1oiiiiil.I00Iooi00oi();
/* 126 */                                       int i3 = iil1OIloI1i.I00000oIO;
/* 128 */                                       parcelI00Iooi00oi.writeInt(1);
/* 133 */                                       int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcelI00Iooi00oi);
/* 137 */                                       lO0IioIooIl.I000OiO(parcelI00Iooi00oi, 1, str);
/* 141 */                                       lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 2, 4);
/* 144 */                                       parcelI00Iooi00oi.writeInt(zI00000oOI ? 1 : 0);
/* 147 */                                       lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 3, 4);
/* 151 */                                       parcelI00Iooi00oi.writeInt(0);
/* 158 */                                       lO0IioIooIl.I0001Ioi1lo(parcelI00Iooi00oi, 4, OIOiOlIO01.I00O10llo(context));
/* 162 */                                       lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 5, 4);
/* 165 */                                       parcelI00Iooi00oi.writeInt(0);
/* 169 */                                       lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 6, 4);
/* 173 */                                       parcelI00Iooi00oi.writeInt(1);
/* 178 */                                       lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 8, 4);
/* 181 */                                       parcelI00Iooi00oi.writeInt(0);
/* 184 */                                       lO0IioIooIl.I00100o1O0lo(iI00100l0, parcelI00Iooi00oi);
/* 187 */                                       Parcel parcelI00IoO0 = i1oiiiiil.I00IoO0(6, parcelI00Iooi00oi);
/* 197 */                                       lli1IIiI lli1iiii = (lli1IIiI) iil1OIloI1i.I00000oIO(parcelI00IoO0, lli1IIiI.CREATOR);
/* 199 */                                       parcelI00IoO0.recycle();
/* 204 */                                       if (lli1iiii.I00iOIl) {
/* 208 */                                           lili0I1oo.I00000oIO(lli1iiii.I00iio);
/* 215 */                                           iIOo1iI001lllioOl = new IIOo1i(true, (String) null, (Exception) null);
                                                } else {
/* 220 */                                           String str2 = lli1iiii.I00iiI;
/* 238 */                                           PackageManager.NameNotFoundException nameNotFoundException = ll1l1lO0Ioil.I00000oIO(lli1iiii.I00iiO) == 4 ? new PackageManager.NameNotFoundException() : null;
/* 241 */                                           if (str2 == null) {
/* 239 */                                               str2 = "error checking package certificate";
                                                    }
/* 246 */                                           lili0I1oo.I00000oIO(lli1iiii.I00iio);
/* 251 */                                           ll1l1lO0Ioil.I00000oIO(lli1iiii.I00iiO);
/* 257 */                                           iIOo1iI001lllioOl = new IIOo1i(false, str2, (Exception) nameNotFoundException);
                                                }
                                            } catch (RemoteException e2) {
/* 264 */                                       Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
/* 269 */                                       iIOo1iI001lllioOl = IIOo1i.I001lloI("module call", e2);
                                            }
                                        } catch (IioI1I1llol1 e3) {
/* 276 */                                   Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
/* 291 */                                   iIOo1iI001lllioOl = IIOo1i.I001lloI("module init: ".concat(String.valueOf(e3.getMessage())), e3);
                                        }
/* 439 */                               if (iIOo1iI001lllioOl.I00000oOI) {
/* 441 */                                   this.I00000oOI = str;
                                        }
                                    } catch (Throwable th) {
/* 304 */                               throw th;
                                    }
                                } else {
                                    try {
/* 327 */                               PackageInfo packageInfo = this.I00000oIO.getPackageManager().getPackageInfo(str, 134217792);
/* 333 */                               boolean zI00000oOI2 = Io0ii0lOoi.I00000oOI(this.I00000oIO);
/* 337 */                               if (packageInfo == null) {
/* 339 */                                   iIOo1iI001lllioOl = IIOo1i.I001lllioOl("null pkg");
/* 439 */                                   if (iIOo1iI001lllioOl.I00000oOI) {
                                            }
                                        } else {
/* 344 */                                   Signature[] signatureArr = packageInfo.signatures;
/* 346 */                                   if (signatureArr == null || signatureArr.length != 1) {
/* 433 */                                       iIOo1iI001lllioOl = IIOo1i.I001lllioOl("single cert required");
                                            } else {
/* 365 */                                       l1oliollOo l1oliolloo = new l1oliollOo(packageInfo.signatures[0].toByteArray());
/* 368 */                                       String str3 = packageInfo.packageName;
/* 370 */                                       StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                                try {
/* 374 */                                           IIOo1i iIOo1iI00000oOI = li0iOI11O1lI.I00000oOI(str3, l1oliolloo, zI00000oOI2, false);
/* 378 */                                           StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
/* 383 */                                           if (iIOo1iI00000oOI.I00000oOI && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
/* 394 */                                               StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                        try {
/* 400 */                                                   IIOo1i iIOo1iI00000oOI2 = li0iOI11O1lI.I00000oOI(str3, l1oliolloo, false, true);
/* 404 */                                                   StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
/* 409 */                                                   if (iIOo1iI00000oOI2.I00000oOI) {
/* 413 */                                                       iIOo1iI001lllioOl = IIOo1i.I001lllioOl("debuggable release cert app rejected");
                                                            }
                                                        } finally {
                                                        }
                                                    }
/* 424 */                                           iIOo1iI001lllioOl = iIOo1iI00000oOI;
                                                } finally {
                                                }
                                            }
/* 439 */                                   if (iIOo1iI001lllioOl.I00000oOI) {
                                            }
                                        }
                                    } catch (PackageManager.NameNotFoundException e4) {
/* 452 */                               iIOo1iI001lllioOl = IIOo1i.I001lloI("no pkg ".concat(str), e4);
                                    }
                                }
                            }
/* 467 */                   if (iIOo1iI001lllioOl.I00000oOI) {
                                break;
                            }
/* 470 */                   i2++;
                        }
                    }
/* 486 */           if (!iIOo1iI001lllioOl.I00000oOI && Log.isLoggable("GoogleCertificatesRslt", 3)) {
/* 500 */               if (((Throwable) iIOo1iI001lllioOl.I0000Il00O) != null) {
/* 502 */                   iIOo1iI001lllioOl.I001lIiIIo1O();
                        } else {
/* 506 */                   iIOo1iI001lllioOl.I001lIiIIo1O();
                        }
                    }
/* 509 */           return iIOo1iI001lllioOl.I00000oOI;
                }
            }
