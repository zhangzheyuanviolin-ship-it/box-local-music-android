            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.res.AssetFileDescriptor;
            import java.io.File;
            import java.io.IOException;
            
            public abstract class OOIoli1I {
                public static final Oi0OoOoOI1li I00000oIO = new Oi0OoOoOI1li();
                public static final Object I00000oOI = new Object();
                public static iOloo0O0O I0000Il00O = null;

                /* JADX WARN: Removed duplicated region for block: B:104:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x00d5  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oIO(Context context, boolean z) {
                    int i;
                    boolean z2;
                    long length;
                    int i2;
                    File file;
                    OOIolIl1 oOIolIl1I00000oIO;
                    OOIolIl1 oOIolIl1;
                    OOIolIl1 oOIolIl12;
                    int i3;
                    AssetFileDescriptor assetFileDescriptorOpenFd;
/* 1 */             if (z || I0000Il00O == null) {
                        synchronized (I00000oOI) {
/* 12 */                    if (!z) {
/* 16 */                        if (I0000Il00O != null) {
/* 19 */                            return;
                                }
/* 25 */                        i = 0;
                                try {
/* 33 */                            assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                                    try {
/* 47 */                                z2 = assetFileDescriptorOpenFd.getLength() <= 0;
/* 48 */                                assetFileDescriptorOpenFd.close();
                                    } finally {
                                    }
                                } catch (IOException unused) {
/* 65 */                            z2 = false;
                                }
/* 81 */                        File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
/* 84 */                        long length2 = file2.length();
/* 100 */                       boolean z3 = !file2.exists() && length2 > 0;
/* 116 */                       File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
/* 119 */                       length = file3.length();
/* 135 */                       boolean z4 = !file3.exists() && length > 0;
/* 136 */                       i2 = 14;
                                try {
/* 158 */                           long j = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).lastUpdateTime;
/* 168 */                           file = new File(context.getFilesDir(), "profileInstalled");
/* 175 */                           if (file.exists()) {
/* 197 */                               oOIolIl1I00000oIO = null;
                                    } else {
                                        try {
/* 177 */                                   oOIolIl1I00000oIO = OOIolIl1.I00000oIO(file);
                                        } catch (IOException unused2) {
/* 184 */                                   iOloo0O0O ioloo0o0o = new iOloo0O0O(i2);
/* 187 */                                   I0000Il00O = ioloo0o0o;
/* 191 */                                   I00000oIO.I000OOo1O(ioloo0o0o);
/* 295 */                                   return;
                                        }
                                    }
/* 199 */                           if (oOIolIl1I00000oIO == null && oOIolIl1I00000oIO.I0000Il00O == j && (i3 = oOIolIl1I00000oIO.I00000oOI) != 2) {
/* 212 */                               i = i3;
                                    } else if (z2) {
/* 216 */                               i = 327680;
                                    } else if (z3) {
/* 221 */                               i = 1;
                                    } else if (z4) {
/* 225 */                               i = 2;
                                    }
/* 226 */                           if (z && z4 && i != 1) {
/* 232 */                               i = 2;
                                    }
/* 233 */                           if (oOIolIl1I00000oIO != null && oOIolIl1I00000oIO.I00000oOI == 2 && i == 1 && length2 < oOIolIl1I00000oIO.I0000O) {
/* 247 */                               i = 3;
                                    }
/* 249 */                           oOIolIl1 = oOIolIl1I00000oIO;
/* 254 */                           oOIolIl12 = new OOIolIl1(1, i, j, length);
/* 257 */                           if (oOIolIl1 != null || !oOIolIl1.equals(oOIolIl12)) {
                                        try {
/* 265 */                                   oOIolIl12.I00000oOI(file);
                                        } catch (IOException unused3) {
                                        }
                                    }
/* 270 */                           iOloo0O0O ioloo0o0o2 = new iOloo0O0O(i2);
/* 273 */                           I0000Il00O = ioloo0o0o2;
/* 277 */                           I00000oIO.I000OOo1O(ioloo0o0o2);
/* 295 */                           return;
                                } catch (PackageManager.NameNotFoundException unused4) {
/* 284 */                           iOloo0O0O ioloo0o0o3 = new iOloo0O0O(i2);
/* 287 */                           I0000Il00O = ioloo0o0o3;
/* 291 */                           I00000oIO.I000OOo1O(ioloo0o0o3);
/* 295 */                           return;
                                }
                            }
/* 25 */                    i = 0;
/* 33 */                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
/* 47 */                    if (assetFileDescriptorOpenFd.getLength() <= 0) {
                            }
/* 48 */                    assetFileDescriptorOpenFd.close();
/* 81 */                    File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
/* 84 */                    long length22 = file22.length();
/* 100 */                   if (file22.exists()) {
/* 116 */                       File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
/* 119 */                       length = file32.length();
/* 135 */                       if (file32.exists()) {
/* 136 */                           i2 = 14;
/* 158 */                           long j2 = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).lastUpdateTime;
/* 168 */                           file = new File(context.getFilesDir(), "profileInstalled");
/* 175 */                           if (file.exists()) {
                                    }
/* 199 */                           if (oOIolIl1I00000oIO == null) {
/* 214 */                               if (z2) {
                                        }
                                    }
/* 226 */                           if (z) {
/* 232 */                               i = 2;
                                    }
/* 233 */                           if (oOIolIl1I00000oIO != null) {
/* 247 */                               i = 3;
                                    }
/* 249 */                           oOIolIl1 = oOIolIl1I00000oIO;
/* 254 */                           oOIolIl12 = new OOIolIl1(1, i, j2, length);
/* 257 */                           if (oOIolIl1 != null) {
/* 265 */                               oOIolIl12.I00000oOI(file);
                                    }
/* 270 */                           iOloo0O0O ioloo0o0o22 = new iOloo0O0O(i2);
/* 273 */                           I0000Il00O = ioloo0o0o22;
/* 277 */                           I00000oIO.I000OOo1O(ioloo0o0o22);
/* 295 */                           return;
                                }
                            }
                        }
                    }
                }
            }
