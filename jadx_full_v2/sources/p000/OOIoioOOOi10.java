            package p000;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.res.AssetManager;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.DataInputStream;
            import java.io.DataOutputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.channels.FileChannel;
            import java.nio.channels.FileLock;
            import java.util.Arrays;
            import java.util.concurrent.Executor;
            
            public abstract class OOIoioOOOi10 {
                public static final i1O10l1io1iO I00000oIO = new i1O10l1io1iO(14);

                public static void I00000oIO(PackageInfo packageInfo, File file) throws IOException {
                    try {
/* 15 */                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
                        try {
/* 20 */                    dataOutputStream.writeLong(packageInfo.lastUpdateTime);
/* 23 */                    dataOutputStream.close();
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                }

                public static void I00000oOI(Executor executor, Oi1ol0llI oi1ol0llI, int i, PackageManager.NameNotFoundException nameNotFoundException) {
/* 4 */             II0OlOll iI0OlOll = new II0OlOll(6);
/* 7 */             iI0OlOll.I00iiO = oi1ol0llI;
/* 9 */             iI0OlOll.I00iiI = i;
/* 11 */            iI0OlOll.I00iio = nameNotFoundException;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            executor.execute(iI0OlOll);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:111:0x017a  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x0183  */
                /* JADX WARN: Removed duplicated region for block: B:143:0x01ce  */
                /* JADX WARN: Removed duplicated region for block: B:144:0x01d2  */
                /* JADX WARN: Removed duplicated region for block: B:222:0x0281  */
                /* JADX WARN: Removed duplicated region for block: B:231:0x0295 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:233:0x0299  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
                /* JADX WARN: Removed duplicated region for block: B:281:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:286:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r15v19 */
                /* JADX WARN: Type inference failed for: r15v2 */
                /* JADX WARN: Type inference failed for: r15v3 */
                /* JADX WARN: Type inference failed for: r15v4 */
                /* JADX WARN: Type inference failed for: r15v5 */
                /* JADX WARN: Type inference failed for: r15v7 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I0000Il00O(Context context, Executor executor, OOIoilO1I10I oOIoilO1I10I, boolean z) {
                    boolean z2;
                    FileInputStream fileInputStreamI00000oIO;
                    byte[] bArr;
                    ?? r15;
                    IiOoliOIo1[] iiOoliOIo1ArrI000II;
                    IiOoliOIo1[] iiOoliOIo1Arr;
                    IiOoiiil iiOoiiil;
                    FileInputStream fileInputStreamI00000oIO2;
                    IiOoliOIo1[] iiOoliOIo1Arr2;
                    byte[] bArr2;
                    ?? r152;
                    boolean z3;
                    boolean z4;
                    Throwable th;
                    Throwable th2;
                    boolean z5;
                    boolean z6;
                    ByteArrayOutputStream byteArrayOutputStream;
                    boolean z7;
                    boolean z8;
/* 5 */             Context applicationContext = context.getApplicationContext();
/* 9 */             String packageName = applicationContext.getPackageName();
/* 13 */            ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
/* 17 */            AssetManager assets = applicationContext.getAssets();
/* 28 */            String name = new File(applicationInfo.sourceDir).getName();
                    try {
/* 38 */                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
/* 42 */                File filesDir = context.getFilesDir();
/* 47 */                if (!z) {
/* 53 */                    File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
/* 60 */                    if (file.exists()) {
                                try {
/* 71 */                            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                                    try {
/* 74 */                                long j = dataInputStream.readLong();
/* 78 */                                dataInputStream.close();
/* 89 */                                z8 = j == packageInfo.lastUpdateTime;
/* 90 */                                if (z8) {
/* 93 */                                    oOIoilO1I10I.I0001Ioi1lo(2, null);
                                        }
                                    } finally {
                                    }
                                } catch (IOException unused) {
                                }
/* 108 */                       if (z8) {
                                }
                            } else {
/* 62 */                        z8 = false;
/* 108 */                       if (z8) {
/* 111 */                           context.getPackageName();
/* 114 */                           OOIoli1I.I00000oIO(context, false);
/* 670 */                           return;
                                }
                            }
                        }
/* 119 */               context.getPackageName();
/* 133 */               File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
/* 140 */               IiOoiiil iiOoiiil2 = new IiOoiiil();
/* 143 */               iiOoiiil2.I0000oI00 = false;
/* 147 */               iiOoiiil2.I00000oIO = executor;
/* 149 */               iiOoiiil2.I00000oOI = oOIoilO1I10I;
/* 151 */               iiOoiiil2.I0000O = name;
/* 153 */               iiOoiiil2.I0000Il00O = file2;
/* 155 */               VarHandle.storeStoreFence();
/* 163 */               if (file2.exists()) {
/* 169 */                   if (!file2.canWrite()) {
/* 171 */                       iiOoiiil2.I00000oOI(4, null);
/* 174 */                       z2 = true;
/* 659 */                       z6 = false;
                                z7 = z2;
                            }
/* 192 */                   iiOoiiil2.I0000oI00 = true;
                            try {
                                try {
/* 195 */                           fileInputStreamI00000oIO = iiOoiiil2.I00000oIO(assets, "dexopt/baseline.prof");
                                } catch (FileNotFoundException e) {
/* 207 */                           oOIoilO1I10I.I0001Ioi1lo(6, e);
/* 210 */                           fileInputStreamI00000oIO = null;
/* 213 */                           bArr = iO0iOI0.I00000oIO;
/* 215 */                           r15 = 8;
/* 215 */                           r152 = 8;
/* 217 */                           if (fileInputStreamI00000oIO != null) {
                                    }
/* 290 */                           iiOoliOIo1Arr = iiOoiiil2.I0001Ioi1lo;
/* 292 */                           byte[] bArr3 = iO0ii0001iio.I00000oIO;
/* 294 */                           if (iiOoliOIo1Arr != null) {
                                    }
/* 380 */                           OOIoilO1I10I oOIoilO1I10I2 = iiOoiiil2.I00000oOI;
/* 382 */                           iiOoliOIo1Arr2 = iiOoiiil2.I0001Ioi1lo;
/* 386 */                           if (iiOoliOIo1Arr2 != null) {
                                    }
/* 459 */                           bArr2 = iiOoiiil2.I000II;
/* 461 */                           if (bArr2 != null) {
                                    }
/* 640 */                           if (z4) {
                                    }
/* 645 */                           z6 = z4;
                                    z7 = z5;
/* 667 */                           OOIoli1I.I00000oIO(context, (z6 && z) ? z7 : false);
                                } catch (IOException e2) {
/* 202 */                           oOIoilO1I10I.I0001Ioi1lo(7, e2);
/* 210 */                           fileInputStreamI00000oIO = null;
/* 213 */                           bArr = iO0iOI0.I00000oIO;
/* 215 */                           r15 = 8;
/* 215 */                           r152 = 8;
/* 217 */                           if (fileInputStreamI00000oIO != null) {
                                    }
/* 290 */                           iiOoliOIo1Arr = iiOoiiil2.I0001Ioi1lo;
/* 292 */                           byte[] bArr32 = iO0ii0001iio.I00000oIO;
/* 294 */                           if (iiOoliOIo1Arr != null) {
                                    }
/* 380 */                           OOIoilO1I10I oOIoilO1I10I22 = iiOoiiil2.I00000oOI;
/* 382 */                           iiOoliOIo1Arr2 = iiOoiiil2.I0001Ioi1lo;
/* 386 */                           if (iiOoliOIo1Arr2 != null) {
                                    }
/* 459 */                           bArr2 = iiOoiiil2.I000II;
/* 461 */                           if (bArr2 != null) {
                                    }
/* 640 */                           if (z4) {
                                    }
/* 645 */                           z6 = z4;
                                    z7 = z5;
/* 667 */                           OOIoli1I.I00000oIO(context, (z6 && z) ? z7 : false);
                                }
/* 217 */                       if (fileInputStreamI00000oIO != null) {
                                    try {
                                    } catch (IOException e3) {
/* 273 */                               oOIoilO1I10I.I0001Ioi1lo(7, e3);
                                        try {
/* 264 */                                   fileInputStreamI00000oIO.close();
                                        } catch (IOException e4) {
/* 269 */                                   oOIoilO1I10I.I0001Ioi1lo(7, e4);
                                        }
/* 277 */                               iiOoliOIo1ArrI000II = null;
/* 278 */                               iiOoiiil2.I0001Ioi1lo = iiOoliOIo1ArrI000II;
/* 290 */                               iiOoliOIo1Arr = iiOoiiil2.I0001Ioi1lo;
/* 292 */                               byte[] bArr322 = iO0ii0001iio.I00000oIO;
/* 294 */                               if (iiOoliOIo1Arr != null) {
                                        }
/* 380 */                               OOIoilO1I10I oOIoilO1I10I222 = iiOoiiil2.I00000oOI;
/* 382 */                               iiOoliOIo1Arr2 = iiOoiiil2.I0001Ioi1lo;
/* 386 */                               if (iiOoliOIo1Arr2 != null) {
                                        }
/* 459 */                               bArr2 = iiOoiiil2.I000II;
/* 461 */                               if (bArr2 != null) {
                                        }
/* 640 */                               if (z4) {
                                        }
/* 645 */                               z6 = z4;
                                        z7 = z5;
/* 667 */                               OOIoli1I.I00000oIO(context, (z6 && z) ? z7 : false);
                                    } catch (IllegalStateException e5) {
/* 261 */                               oOIoilO1I10I.I0001Ioi1lo(8, e5);
/* 264 */                               fileInputStreamI00000oIO.close();
/* 277 */                               iiOoliOIo1ArrI000II = null;
/* 278 */                               iiOoiiil2.I0001Ioi1lo = iiOoliOIo1ArrI000II;
/* 290 */                               iiOoliOIo1Arr = iiOoiiil2.I0001Ioi1lo;
/* 292 */                               byte[] bArr3222 = iO0ii0001iio.I00000oIO;
/* 294 */                               if (iiOoliOIo1Arr != null) {
                                        }
/* 380 */                               OOIoilO1I10I oOIoilO1I10I2222 = iiOoiiil2.I00000oOI;
/* 382 */                               iiOoliOIo1Arr2 = iiOoiiil2.I0001Ioi1lo;
/* 386 */                               if (iiOoliOIo1Arr2 != null) {
                                        }
/* 459 */                               bArr2 = iiOoiiil2.I000II;
/* 461 */                               if (bArr2 != null) {
                                        }
/* 640 */                               if (z4) {
                                        }
/* 645 */                               z6 = z4;
                                        z7 = z5;
/* 667 */                               OOIoli1I.I00000oIO(context, (z6 && z) ? z7 : false);
                                    }
/* 227 */                           if (!Arrays.equals(bArr, ilI1oOi.I00000oOI(fileInputStreamI00000oIO, 4))) {
/* 260 */                               throw new IllegalStateException("Invalid magic");
                                    }
/* 235 */                           iiOoliOIo1ArrI000II = iO0iOI0.I000II(fileInputStreamI00000oIO, ilI1oOi.I00000oOI(fileInputStreamI00000oIO, 4), iiOoiiil2.I0000O);
                                    try {
/* 239 */                               fileInputStreamI00000oIO.close();
                                    } catch (IOException e6) {
/* 244 */                               oOIoilO1I10I.I0001Ioi1lo(7, e6);
                                    }
/* 278 */                           iiOoiiil2.I0001Ioi1lo = iiOoliOIo1ArrI000II;
                                }
/* 290 */                       iiOoliOIo1Arr = iiOoiiil2.I0001Ioi1lo;
/* 292 */                       byte[] bArr32222 = iO0ii0001iio.I00000oIO;
/* 294 */                       if (iiOoliOIo1Arr != null) {
                                    try {
/* 298 */                               fileInputStreamI00000oIO2 = iiOoiiil2.I00000oIO(assets, "dexopt/baseline.profm");
                                    } catch (FileNotFoundException e7) {
/* 373 */                               oOIoilO1I10I.I0001Ioi1lo(9, e7);
                                    } catch (IOException e8) {
/* 367 */                               oOIoilO1I10I.I0001Ioi1lo(7, e8);
                                    } catch (IllegalStateException e9) {
/* 361 */                               iiOoiiil2.I0001Ioi1lo = null;
/* 363 */                               oOIoilO1I10I.I0001Ioi1lo(8, e9);
                                    }
/* 302 */                           if (fileInputStreamI00000oIO2 != null) {
                                        try {
/* 314 */                                   if (!Arrays.equals(iO0iOI0.I00000oOI, ilI1oOi.I00000oOI(fileInputStreamI00000oIO2, 4))) {
/* 345 */                                       throw new IllegalStateException("Invalid magic");
                                            }
/* 324 */                                   iiOoiiil2.I0001Ioi1lo = iO0iOI0.I0000O(fileInputStreamI00000oIO2, ilI1oOi.I00000oOI(fileInputStreamI00000oIO2, 4), bArr32222, iiOoliOIo1Arr);
/* 326 */                                   fileInputStreamI00000oIO2.close();
/* 329 */                                   iiOoiiil = iiOoiiil2;
/* 377 */                                   if (iiOoiiil != null) {
/* 379 */                                       iiOoiiil2 = iiOoiiil;
                                            }
                                        } finally {
                                        }
                                    } else {
/* 355 */                               if (fileInputStreamI00000oIO2 != null) {
/* 357 */                                   fileInputStreamI00000oIO2.close();
                                        }
/* 376 */                               iiOoiiil = null;
/* 377 */                               if (iiOoiiil != null) {
                                        }
                                    }
                                }
/* 380 */                       OOIoilO1I10I oOIoilO1I10I22222 = iiOoiiil2.I00000oOI;
/* 382 */                       iiOoliOIo1Arr2 = iiOoiiil2.I0001Ioi1lo;
/* 386 */                       if (iiOoliOIo1Arr2 != null) {
/* 390 */                           if (!iiOoiiil2.I0000oI00) {
/* 455 */                               I000II.I001IO000("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
/* 458 */                               return;
                                    }
                                    try {
/* 394 */                               byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
/* 397 */                                   byteArrayOutputStream.write(bArr);
/* 400 */                                   byteArrayOutputStream.write(bArr32222);
                                        } finally {
                                        }
                                    } catch (IOException e10) {
/* 449 */                               oOIoilO1I10I22222.I0001Ioi1lo(7, e10);
                                    } catch (IllegalStateException e11) {
/* 445 */                               oOIoilO1I10I22222.I0001Ioi1lo(8, e11);
                                    }
/* 407 */                           if (iO0iOI0.I000OOo1O(byteArrayOutputStream, bArr32222, iiOoliOIo1Arr2)) {
/* 430 */                               iiOoiiil2.I000II = byteArrayOutputStream.toByteArray();
/* 432 */                               byteArrayOutputStream.close();
/* 452 */                               iiOoiiil2.I0001Ioi1lo = null;
                                    } else {
/* 410 */                               oOIoilO1I10I22222.I0001Ioi1lo(5, null);
/* 413 */                               iiOoiiil2.I0001Ioi1lo = null;
/* 415 */                               byteArrayOutputStream.close();
                                    }
                                }
/* 459 */                       bArr2 = iiOoiiil2.I000II;
/* 461 */                       if (bArr2 != null) {
/* 463 */                           z4 = false;
/* 464 */                           z5 = true;
                                } else {
                                    try {
/* 469 */                               if (!iiOoiiil2.I0000oI00) {
/* 652 */                                   I000II.I001IO000("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
/* 655 */                                   return;
                                        }
                                        try {
                                            try {
/* 473 */                                       ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                try {
                                                    try {
/* 480 */                                               FileOutputStream fileOutputStream = new FileOutputStream(iiOoiiil2.I0000Il00O);
                                                        try {
                                                            try {
/* 483 */                                                       FileChannel channel = fileOutputStream.getChannel();
                                                                try {
/* 487 */                                                           FileLock fileLockTryLock = channel.tryLock();
                                                                    try {
                                                                        try {
/* 491 */                                                                   if (fileLockTryLock != null) {
                                                                                try {
/* 497 */                                                                           if (fileLockTryLock.isValid()) {
/* 501 */                                                                               byte[] bArr4 = new byte[Barcode.FORMAT_UPC_A];
                                                                                        while (true) {
/* 503 */                                                                                   int i = byteArrayInputStream.read(bArr4);
/* 507 */                                                                                   if (i <= 0) {
                                                                                                break;
                                                                                            } else {
/* 510 */                                                                                       fileOutputStream.write(bArr4, 0, i);
                                                                                            }
                                                                                        }
/* 514 */                                                                               z5 = true;
/* 515 */                                                                               iiOoiiil2.I00000oOI(1, null);
/* 518 */                                                                               fileLockTryLock.close();
/* 521 */                                                                               channel.close();
/* 524 */                                                                               fileOutputStream.close();
/* 527 */                                                                               byteArrayInputStream.close();
/* 530 */                                                                               iiOoiiil2.I000II = null;
/* 532 */                                                                               iiOoiiil2.I0001Ioi1lo = null;
/* 534 */                                                                               z4 = true;
                                                                                    }
                                                                                } catch (Throwable th3) {
/* 561 */                                                                           th = th3;
/* 557 */                                                                           Throwable th4 = th;
/* 572 */                                                                           if (fileLockTryLock == null) {
/* 582 */                                                                               throw th4;
                                                                                    }
                                                                                    try {
/* 574 */                                                                               fileLockTryLock.close();
/* 582 */                                                                               throw th4;
                                                                                    } catch (Throwable th5) {
/* 579 */                                                                               th4.addSuppressed(th5);
/* 582 */                                                                               throw th4;
                                                                                    }
                                                                                }
                                                                            }
/* 571 */                                                                   throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                        } catch (Throwable th6) {
/* 553 */                                                                   th = th6;
/* 554 */                                                                   Throwable th7 = th;
/* 586 */                                                                   if (channel == null) {
/* 596 */                                                                       throw th7;
                                                                            }
                                                                            try {
/* 588 */                                                                       channel.close();
/* 596 */                                                                       throw th7;
                                                                            } catch (Throwable th8) {
/* 593 */                                                                       th7.addSuppressed(th8);
/* 596 */                                                                       throw th7;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th9) {
/* 556 */                                                               th = th9;
                                                                    }
                                                                } catch (Throwable th10) {
/* 583 */                                                           th = th10;
                                                                }
                                                            } catch (Throwable th11) {
/* 550 */                                                       th = th11;
/* 551 */                                                       th2 = th;
                                                                try {
/* 600 */                                                           fileOutputStream.close();
/* 608 */                                                           throw th2;
                                                                } catch (Throwable th12) {
/* 605 */                                                           th2.addSuppressed(th12);
/* 608 */                                                           throw th2;
                                                                }
                                                            }
                                                        } catch (Throwable th13) {
/* 597 */                                                   th = th13;
/* 551 */                                                   th2 = th;
/* 600 */                                                   fileOutputStream.close();
/* 608 */                                                   throw th2;
                                                        }
                                                    } catch (Throwable th14) {
/* 609 */                                               th = th14;
/* 548 */                                               th = th;
                                                        try {
/* 612 */                                                   byteArrayInputStream.close();
/* 620 */                                                   throw th;
                                                        } catch (Throwable th15) {
/* 617 */                                                   th.addSuppressed(th15);
/* 620 */                                                   throw th;
                                                        }
                                                    }
                                                } catch (Throwable th16) {
/* 547 */                                           th = th16;
/* 548 */                                           th = th;
/* 612 */                                           byteArrayInputStream.close();
/* 620 */                                           throw th;
                                                }
                                            } catch (FileNotFoundException e12) {
/* 543 */                                       e = e12;
/* 635 */                                       iiOoiiil2.I00000oOI(6, e);
                                                z3 = r152;
/* 639 */                                       z4 = false;
                                                z5 = z3;
/* 640 */                                       if (z4) {
                                                }
/* 645 */                                       z6 = z4;
                                                z7 = z5;
/* 667 */                                       OOIoli1I.I00000oIO(context, (z6 && z) ? z7 : false);
                                            } catch (IOException e13) {
/* 540 */                                       e = e13;
/* 627 */                                       iiOoiiil2.I00000oOI(7, e);
                                                z3 = r15;
/* 639 */                                       z4 = false;
                                                z5 = z3;
/* 640 */                                       if (z4) {
                                                }
/* 645 */                                       z6 = z4;
                                                z7 = z5;
/* 667 */                                       OOIoli1I.I00000oIO(context, (z6 && z) ? z7 : false);
                                            }
                                        } catch (FileNotFoundException e14) {
/* 624 */                                   e = e14;
/* 625 */                                   r152 = 1;
/* 635 */                                   iiOoiiil2.I00000oOI(6, e);
                                            z3 = r152;
/* 639 */                                   z4 = false;
                                            z5 = z3;
/* 640 */                                   if (z4) {
                                            }
/* 645 */                                   z6 = z4;
                                            z7 = z5;
/* 667 */                                   OOIoli1I.I00000oIO(context, (z6 && z) ? z7 : false);
                                        } catch (IOException e15) {
/* 621 */                                   e = e15;
/* 622 */                                   r15 = 1;
/* 627 */                                   iiOoiiil2.I00000oOI(7, e);
                                            z3 = r15;
/* 639 */                                   z4 = false;
                                            z5 = z3;
/* 640 */                                   if (z4) {
                                            }
/* 645 */                                   z6 = z4;
                                            z7 = z5;
/* 667 */                                   OOIoli1I.I00000oIO(context, (z6 && z) ? z7 : false);
                                        }
                                    } finally {
/* 647 */                               iiOoiiil2.I000II = null;
/* 649 */                               iiOoiiil2.I0001Ioi1lo = null;
                                    }
                                }
/* 640 */                       if (z4) {
/* 642 */                           I00000oIO(packageInfo, filesDir);
                                }
/* 645 */                       z6 = z4;
                                z7 = z5;
                            } finally {
                            }
/* 213 */                   bArr = iO0iOI0.I00000oIO;
/* 215 */                   r15 = 8;
/* 215 */                   r152 = 8;
                        } else {
                            try {
                            } catch (IOException unused2) {
/* 189 */                       z2 = true;
/* 656 */                       iiOoiiil2.I00000oOI(4, null);
                            }
/* 183 */                   if (!file2.createNewFile()) {
/* 185 */                       iiOoiiil2.I00000oOI(4, null);
/* 174 */                       z2 = true;
/* 659 */                       z6 = false;
                                z7 = z2;
                            }
/* 192 */                   iiOoiiil2.I0000oI00 = true;
/* 195 */                   fileInputStreamI00000oIO = iiOoiiil2.I00000oIO(assets, "dexopt/baseline.prof");
/* 213 */                   bArr = iO0iOI0.I00000oIO;
/* 215 */                   r15 = 8;
/* 215 */                   r152 = 8;
/* 217 */                   if (fileInputStreamI00000oIO != null) {
                            }
/* 290 */                   iiOoliOIo1Arr = iiOoiiil2.I0001Ioi1lo;
/* 292 */                   byte[] bArr322222 = iO0ii0001iio.I00000oIO;
/* 294 */                   if (iiOoliOIo1Arr != null) {
                            }
/* 380 */                   OOIoilO1I10I oOIoilO1I10I222222 = iiOoiiil2.I00000oOI;
/* 382 */                   iiOoliOIo1Arr2 = iiOoiiil2.I0001Ioi1lo;
/* 386 */                   if (iiOoliOIo1Arr2 != null) {
                            }
/* 459 */                   bArr2 = iiOoiiil2.I000II;
/* 461 */                   if (bArr2 != null) {
                            }
/* 640 */                   if (z4) {
                            }
/* 645 */                   z6 = z4;
                            z7 = z5;
                        }
/* 667 */               OOIoli1I.I00000oIO(context, (z6 && z) ? z7 : false);
                    } catch (PackageManager.NameNotFoundException e16) {
/* 672 */               oOIoilO1I10I.I0001Ioi1lo(7, e16);
/* 676 */               OOIoli1I.I00000oIO(context, false);
                    }
                }
            }
