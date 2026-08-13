            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.Log;
            import java.io.Serializable;
            import java.util.List;
            
            public final class I101oOiOiI {
                public int I00000oIO;
                public int I00000oOI;
                public Object I0000Il00O;
                public Serializable I0000O;
                public Object I0000oI00;

                public static String I0000Il00O(IlIoliIO ilIoliIO) {
/* 1 */             ilIoliIO.I00000oIO();
/* 4 */             IlO0oiiii0IO ilO0oiiii0IO = ilIoliIO.I0000Il00O;
/* 6 */             String str = ilO0oiiii0IO.I0000oI00;
/* 8 */             if (str != null) {
/* 10 */                return str;
                    }
/* 11 */            ilIoliIO.I00000oIO();
/* 14 */            String str2 = ilO0oiiii0IO.I00000oOI;
/* 22 */            if (!str2.startsWith("1:")) {
/* 24 */                return str2;
                    }
/* 27 */            String[] strArrSplit = str2.split(":");
/* 34 */            if (strArrSplit.length < 2) {
/* 33 */                return null;
                    }
/* 38 */            String str3 = strArrSplit[1];
/* 44 */            if (str3.isEmpty()) {
/* 33 */                return null;
                    }
/* 49 */            return str3;
                }

                /* JADX WARN: Type inference failed for: r2v10, types: [int[], java.io.Serializable] */
                public int I00000oIO(long j) {
/* 3 */             int i = this.I00000oIO + 1;
/* 7 */             long[] jArr = (long[]) this.I0000Il00O;
/* 9 */             int length = jArr.length;
/* 13 */            if (i > length) {
/* 16 */                int i2 = length * 2;
/* 18 */                long[] jArr2 = new long[i2];
/* 20 */                ?? r2 = new int[i2];
/* 23 */                System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
/* 30 */                I1IoiO1l.I000l1(0, 0, 14, (int[]) this.I0000O, r2);
/* 33 */                this.I0000Il00O = jArr2;
/* 35 */                this.I0000O = r2;
                    }
/* 37 */            int i3 = this.I00000oIO;
/* 41 */            this.I00000oIO = i3 + 1;
/* 45 */            int[] iArr = (int[]) this.I0000oI00;
/* 47 */            int length2 = iArr.length;
/* 50 */            if (this.I00000oOI >= length2) {
/* 52 */                int i4 = length2 * 2;
/* 54 */                iArr = new int[i4];
/* 56 */                int i5 = 0;
/* 57 */                while (i5 < i4) {
/* 59 */                    int i6 = i5 + 1;
/* 61 */                    iArr[i5] = i6;
/* 63 */                    i5 = i6;
                        }
/* 69 */                I1IoiO1l.I000l1(0, 0, 14, (int[]) this.I0000oI00, iArr);
/* 72 */                this.I0000oI00 = iArr;
                    }
/* 74 */            int[] iArr2 = iArr;
/* 75 */            int i7 = this.I00000oOI;
/* 79 */            this.I00000oOI = iArr[i7];
/* 83 */            long[] jArr3 = (long[]) this.I0000Il00O;
/* 85 */            jArr3[i3] = j;
/* 91 */            ((int[]) this.I0000O)[i3] = i7;
/* 93 */            iArr2[i7] = i3;
/* 95 */            while (i3 > 0) {
                        int i8 = ((i3 + 1) >> 1) - 1;
/* 109 */               if (O0000Ioio00.I0001Ioi1lo(jArr3[i8], j) <= 0) {
                            break;
                        }
/* 111 */               I000OOo1O(i8, i3);
/* 114 */               i3 = i8;
                    }
/* 186 */           return i7;
                }

                public synchronized String I00000oOI() {
                    try {
/* 6 */                 if (((String) this.I0000O) == null) {
/* 8 */                     I000O01llI0();
                        }
                    } catch (Throwable th) {
/* 29 */                throw th;
                    }
/* 16 */            return (String) this.I0000O;
                }

                public synchronized int I0000O() {
                    PackageInfo packageInfoI0001Ioi1lo;
                    try {
/* 4 */                 if (this.I00000oIO == 0 && (packageInfoI0001Ioi1lo = I0001Ioi1lo("com.google.android.gms")) != null) {
/* 16 */                    this.I00000oIO = packageInfoI0001Ioi1lo.versionCode;
                        }
                    } catch (Throwable th) {
/* 29 */                throw th;
                    }
/* 21 */            return this.I00000oIO;
                }

                public float I0000oI00(TypedArray typedArray, String str, int i, float f) {
/* 9 */             if (lOollIIio1O.I0000Il00O((XmlResourceParser) this.I0000Il00O, str)) {
/* 12 */                f = typedArray.getFloat(i, f);
                    }
/* 20 */            I000OiO(typedArray.getChangingConfigurations());
/* 483 */           return f;
                }

                public PackageInfo I0001Ioi1lo(String str) {
                    try {
/* 10 */                return ((Context) this.I0000Il00O).getPackageManager().getPackageInfo(str, 0);
                    } catch (PackageManager.NameNotFoundException e) {
/* 32 */                Log.w("FirebaseMessaging", "Failed to find package " + e);
/* 35 */                return null;
                    }
                }

                public boolean I000II() {
                    int i;
                    synchronized (this) {
/* 2 */                 i = this.I00000oOI;
/* 5 */                 if (i == 0) {
/* 13 */                    PackageManager packageManager = ((Context) this.I0000Il00O).getPackageManager();
/* 26 */                    if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
/* 32 */                        Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
/* 36 */                        i = 0;
                            } else {
/* 44 */                        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
/* 49 */                        intent.setPackage("com.google.android.gms");
/* 52 */                        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
/* 57 */                        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
/* 74 */                            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
/* 77 */                            this.I00000oOI = 2;
                                } else {
/* 65 */                            this.I00000oOI = 2;
                                }
/* 68 */                        i = 2;
                            }
                        }
                    }
                    return i != 0;
                }

                public synchronized void I000O01llI0() {
/* 10 */            PackageInfo packageInfoI0001Ioi1lo = I0001Ioi1lo(((Context) this.I0000Il00O).getPackageName());
/* 14 */            if (packageInfoI0001Ioi1lo != null) {
/* 22 */                this.I0000O = Integer.toString(packageInfoI0001Ioi1lo.versionCode);
/* 26 */                this.I0000oI00 = packageInfoI0001Ioi1lo.versionName;
                    }
                }

                public void I000OOo1O(int i, int i2) {
/* 3 */             long[] jArr = (long[]) this.I0000Il00O;
/* 7 */             int[] iArr = (int[]) this.I0000O;
/* 11 */            int[] iArr2 = (int[]) this.I0000oI00;
/* 13 */            long j = jArr[i];
/* 17 */            jArr[i] = jArr[i2];
/* 19 */            jArr[i2] = j;
/* 21 */            int i3 = iArr[i];
/* 23 */            int i4 = iArr[i2];
/* 25 */            iArr[i] = i4;
/* 27 */            iArr[i2] = i3;
/* 29 */            iArr2[i4] = i;
/* 31 */            iArr2[i3] = i2;
                }

                public void I000OiO(int i) {
/* 4 */             this.I00000oIO = i | this.I00000oIO;
                }
            }
