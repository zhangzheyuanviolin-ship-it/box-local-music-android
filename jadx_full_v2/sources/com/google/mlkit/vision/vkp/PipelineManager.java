            package com.google.mlkit.vision.vkp;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.content.pm.ProviderInfo;
            import android.content.res.AssetFileDescriptor;
            import android.graphics.Bitmap;
            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.media.Image;
            import android.net.Uri;
            import android.os.Environment;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.ParcelFileDescriptor;
            import android.os.Process;
            import android.os.SystemClock;
            import android.system.ErrnoException;
            import android.util.Log;
            import android.util.LongSparseArray;
            import com.google.android.libraries.intelligence.acceleration.Analytics;
            import com.google.android.libraries.vision.visionkit.pipeline.PipelineException;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.ImageConvertUtils;
            import com.google.mlkit.vision.common.internal.VisionImageMetadataParcel;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import p000.IO0iIlI1li;
            import p000.IioIoO10iOiI;
            import p000.Iioo110oI;
            import p000.O0oO1lOOo1;
            import p000.O11o0I1oo;
            import p000.O1o01iO0liI0;
            import p000.OOIllOil;
            import p000.i1IIOio;
            import p000.i1Il01;
            import p000.i1IoOl;
            import p000.iI1I1lol;
            import p000.iIlol1Ii001I;
            import p000.iO0OliiO;
            import p000.iO10oi0;
            import p000.iOIo11i;
            import p000.iOlOI0l11;
            import p000.iOlOi1iIii;
            import p000.iOllO10O;
            import p000.iOloioo;
            import p000.iOloo0O0O;
            import p000.iOoIlloll1i;
            import p000.ii01lO0l11ii;
            import p000.ii0OOl;
            import p000.ii0i1l11;
            import p000.ii1000OlO0o1;
            import p000.ii10lI1lO0;
            import p000.ii10lIloOOii;
            import p000.ii1liiOo0;
            import p000.iiI011O00i;
            import p000.iiI0Ill0;
            import p000.iiI0O1lI;
            import p000.iil10O1iilo;
            import p000.iilli0i1lI;
            import p000.iilo1l;
            import p000.il001oIi1I;
            import p000.il11looIo1l;
            import p000.il1looOi;
            import p000.ilOI0IoO1I;
            import p000.ilOiO0;
            import p000.io0olIOlOoI;
            import p000.io0olIo0i;
            import p000.io1OllI;
            import p000.ioIIlOOoo;
            import p000.ioIOiI;
            import p000.iol1Ol0ooOoi;
            import p000.iolOO0iIIlI;
            import p000.l00oIl;
            import p000.l0IOIIIlol;
            import p000.l0i0l1l;
            import p000.l0i1I00l0o;
            import p000.l0iOi11Io0Il;
            import p000.l0iiio;
            import p000.l1I1li11l;
            import p000.l1Io001O1;
            import p000.l1l0lOliO;
            import p000.l1lOO0O0l;
            import p000.lI00l0oo;
            import p000.lI1000oO0Ol;
            import p000.lII0I0I000I;
            import p000.lIO0IIo;
            import p000.lIOiOOl;
            import p000.lIiI1010Ool;
            import p000.lIil0l010OO;
            import p000.lIll1lOoI1;
            import p000.lIlo101;
            import p000.lioioo11;
            import p000.lo00o1lli0;
            import p000.loO11iIiO;
            import p000.looi1l1;
            import p000.looiiiOIoI;
            import p000.o0IiOl;
            
            public class PipelineManager {
                private final Context zza;
                private final zzc zzb;
                private final boolean zzc;
                private final List zzd = new ArrayList();
                private final List zze = new ArrayList();
                private final iOoIlloll1i zzf;
                private final iOllO10O zzg;
                private final iOlOI0l11 zzh;
                private zzd zzi;
                private boolean zzj;
                private boolean zzk;
                private long zzl;

                static {
/* 3 */             System.loadLibrary("mlkitcommonpipeline");
                }

                public PipelineManager(Context context, zzc zzcVar, boolean z, iOllO10O iollo10o, iOlOI0l11 ioloi0l11) {
/* 20 */            iOoIlloll1i iooilloll1i = new iOoIlloll1i();
/* 28 */            iooilloll1i.I00000oIO = new LongSparseArray();
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            this.zzf = iooilloll1i;
/* 36 */            this.zzk = true;
/* 40 */            this.zzl = -1L;
/* 42 */            this.zza = context;
/* 44 */            this.zzb = zzcVar;
/* 46 */            this.zzc = z;
/* 48 */            this.zzg = iollo10o;
/* 50 */            this.zzh = ioloi0l11;
                }

                public static PipelineManager newInstanceForImageLabeling(Context context, VkpImageLabelerOptions vkpImageLabelerOptions) {
/* 16 */            return new PipelineManager(context, vkpImageLabelerOptions, false, iOloioo.I0000O("vision-internal-vkp"), iOlOI0l11.I00000oIO(context));
                }

                public static PipelineManager newInstanceForObjectDetection(Context context, VkpObjectDetectorOptions vkpObjectDetectorOptions) {
/* 19 */            return new PipelineManager(context, vkpObjectDetectorOptions, vkpObjectDetectorOptions.zzi(), iOloioo.I0000O("vision-internal-vkp"), iOlOI0l11.I00000oIO(context));
                }

                private final l0iiio zzb(String str) throws IOException {
/* 7 */             AssetFileDescriptor assetFileDescriptorOpenFd = this.zza.getAssets().openFd(str);
/* 13 */            this.zze.add(assetFileDescriptorOpenFd);
/* 16 */            l0iOi11Io0Il l0ioi11io0ilI001i1O0Ol = l0iiio.I001i1O0Ol();
/* 20 */            lII0I0I000I.I000II(assetFileDescriptorOpenFd);
/* 27 */            int fd = assetFileDescriptorOpenFd.getParcelFileDescriptor().getFd();
/* 31 */            l0ioi11io0ilI001i1O0Ol.I0001Ioi1lo();
/* 38 */            l0iiio.I001i1lo1io((l0iiio) l0ioi11io0ilI001i1O0Ol.I00iiI, fd);
/* 41 */            long startOffset = assetFileDescriptorOpenFd.getStartOffset();
/* 45 */            l0ioi11io0ilI001i1O0Ol.I0001Ioi1lo();
/* 52 */            l0iiio.I001l0I00((l0iiio) l0ioi11io0ilI001i1O0Ol.I00iiI, startOffset);
/* 55 */            long length = assetFileDescriptorOpenFd.getLength();
/* 59 */            l0ioi11io0ilI001i1O0Ol.I0001Ioi1lo();
/* 66 */            l0iiio.I001iOo1i0O((l0iiio) l0ioi11io0ilI001i1O0Ol.I00iiI, length);
/* 73 */            return (l0iiio) l0ioi11io0ilI001i1O0Ol.I0000Il00O();
                }

                /* JADX WARN: Code restructure failed: missing block: B:105:0x01a4, code lost:
                
                    r5 = p000.loO11iIiO.I00000oIO;
                    r0 = r0.getExternalCacheDirs();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:106:0x01aa, code lost:
                
                    r5 = r0.length;
                    r7 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:107:0x01ac, code lost:
                
                    if (r7 >= r5) goto L179;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:108:0x01ae, code lost:
                
                    r8 = r0[r7];
                 */
                /* JADX WARN: Code restructure failed: missing block: B:109:0x01b0, code lost:
                
                    if (r8 == null) goto L181;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:111:0x01ba, code lost:
                
                    if (r6.startsWith(p000.loO11iIiO.I00000oIO(r8)) == false) goto L182;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:113:0x01bd, code lost:
                
                    r7 = r7 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:114:0x01c0, code lost:
                
                    r10 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
                
                    if (r3.I00000oIO == false) goto L62;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
                
                    if (r3 != false) goto L62;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:80:0x0155, code lost:
                
                    if (r6.startsWith(p000.loO11iIiO.I00000oIO(r5)) != false) goto L81;
                 */
                /* JADX WARN: Removed duplicated region for block: B:16:0x005b A[PHI: r5 r6
                  0x005b: PHI (r5v23 java.lang.String) = (r5v22 java.lang.String), (r5v27 java.lang.String) binds: [B:8:0x003e, B:12:0x0053] A[DONT_GENERATE, DONT_INLINE]
                  0x005b: PHI (r6v9 android.content.pm.ProviderInfo) = (r6v8 android.content.pm.ProviderInfo), (r6v10 android.content.pm.ProviderInfo) binds: [B:8:0x003e, B:12:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final l0iiio zzc(Uri uri) throws IOException, ErrnoException {
                    File dataDir;
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
                    int i;
/* 5 */             List list = this.zze;
/* 7 */             Context context = this.zza;
/* 9 */             String[] strArr = loO11iIiO.I00000oIO;
/* 11 */            lo00o1lli0 lo00o1lli0Var = lo00o1lli0.I0000Il00O;
/* 13 */            ContentResolver contentResolver = context.getContentResolver();
/* 17 */            String scheme = uri.getScheme();
/* 29 */            if ("android.resource".equals(scheme)) {
/* 31 */                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    } else {
/* 47 */                if (!"content".equals(scheme)) {
/* 281 */                   if (!"file".equals(scheme)) {
/* 966 */                       throw new FileNotFoundException("Unsupported scheme");
                            }
/* 283 */                   AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
/* 287 */                   if (assetFileDescriptorOpenAssetFileDescriptor2 == null) {
/* 600 */                       throw new FileNotFoundException("Content resolver returned null value.");
                            }
                            try {
/* 289 */                       ParcelFileDescriptor parcelFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor();
/* 302 */                       String canonicalPath = new File(uri.getPath()).getCanonicalPath();
/* 306 */                       loO11iIiO.I00000oOI(parcelFileDescriptor, canonicalPath);
/* 315 */                       if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
/* 325 */                           lo00o1lli0Var.getClass();
/* 328 */                           File dataDir2 = context.getDataDir();
/* 332 */                           if (dataDir2 == null) {
/* 366 */                               if (!canonicalPath.startsWith(loO11iIiO.I00000oIO(Environment.getDataDirectory()))) {
/* 369 */                                   Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
/* 373 */                                   if (contextCreateDeviceProtectedStorageContext == null || (dataDir = contextCreateDeviceProtectedStorageContext.getDataDir()) == null || !canonicalPath.startsWith(loO11iIiO.I00000oIO(dataDir))) {
                                                try {
/* 392 */                                           String[] strArr2 = loO11iIiO.I00000oIO;
/* 395 */                                           File[] externalFilesDirs = context.getExternalFilesDirs(null);
/* 399 */                                           int length = externalFilesDirs.length;
/* 400 */                                           int i2 = 0;
                                                    while (true) {
/* 401 */                                               if (i2 >= length) {
                                                            try {
                                                                break;
                                                            } catch (NullPointerException e) {
/* 543 */                                                       throw e;
                                                            } catch (Exception e2) {
/* 542 */                                                       throw new RuntimeException(e2);
                                                            }
                                                        }
/* 403 */                                               File file = externalFilesDirs[i2];
/* 405 */                                               if (file != null && canonicalPath.startsWith(loO11iIiO.I00000oIO(file))) {
                                                            break;
                                                        }
/* 418 */                                               i2++;
                                                    }
                                                } catch (NullPointerException e3) {
/* 554 */                                           throw e3;
                                                } catch (Exception e4) {
/* 553 */                                           throw new RuntimeException(e4);
                                                }
                                            }
                                        }
/* 344 */                               boolean z = true;
/* 452 */                               if (z == lo00o1lli0Var.I00000oIO) {
/* 454 */                                   assetFileDescriptorOpenAssetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor2;
                                        }
                                    }
                                }
/* 566 */                       throw new FileNotFoundException("Can't open file: ".concat(canonicalPath));
                            } catch (FileNotFoundException e5) {
                                try {
/* 586 */                           assetFileDescriptorOpenAssetFileDescriptor2.close();
/* 594 */                           throw e5;
                                } catch (IOException e6) {
/* 591 */                           e5.addSuppressed(e6);
/* 594 */                           throw e5;
                                }
                            } catch (IOException e7) {
/* 571 */                       FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
/* 574 */                       fileNotFoundException.initCause(e7);
                                try {
/* 577 */                           assetFileDescriptorOpenAssetFileDescriptor2.close();
/* 585 */                           throw fileNotFoundException;
                                } catch (IOException e8) {
/* 582 */                           fileNotFoundException.addSuppressed(e8);
/* 585 */                           throw fileNotFoundException;
                                }
                            }
                        }
/* 49 */                String authority = uri.getAuthority();
/* 57 */                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
/* 63 */                if (providerInfoResolveContentProvider != null) {
/* 92 */                    lIil0l010OO liil0l010oo = lo00o1lli0Var.I00000oOI;
/* 94 */                    int i3 = liil0l010oo.I00o0l1o1o0;
/* 96 */                    int i4 = 0;
                            while (true) {
/* 98 */                        if (i4 >= i3) {
/* 136 */                           i = 3;
                                    break;
                                }
/* 129 */                       i4++;
/* 131 */                       if (((uri.getAuthority().lastIndexOf(64) < 0 || lI00l0oo.I00000oIO(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2) - 1 == 1) {
/* 134 */                           i = 2;
                                    break;
                                }
                            }
/* 139 */                   if (i - 1 != 1) {
/* 147 */                       boolean zEquals = context.getPackageName().equals(providerInfoResolveContentProvider.packageName);
/* 151 */                       boolean z2 = lo00o1lli0Var.I00000oIO;
/* 153 */                       if (!zEquals) {
/* 158 */                           if (!z2) {
/* 172 */                               if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && providerInfoResolveContentProvider.exported) {
/* 178 */                                   String[] strArr3 = loO11iIiO.I00000oOI;
/* 180 */                                   int length2 = strArr3.length;
/* 181 */                                   int i5 = 0;
                                            while (true) {
/* 182 */                                       if (i5 >= 2) {
/* 195 */                                           String[] strArr4 = loO11iIiO.I0000Il00O;
/* 197 */                                           int length3 = strArr4.length;
/* 198 */                                           int i6 = 0;
                                                    while (true) {
/* 200 */                                               if (i6 >= 3) {
/* 213 */                                                   String[] strArr5 = loO11iIiO.I00000oIO;
/* 217 */                                                   for (int i7 = 0; i7 < 6; i7++) {
/* 219 */                                                       String str = strArr5[i7];
/* 227 */                                                       char cCharAt = str.charAt(str.length() - 1);
/* 231 */                                                       String str2 = providerInfoResolveContentProvider.packageName;
/* 235 */                                                       if (cCharAt == '.') {
/* 241 */                                                           if (!str2.startsWith(str)) {
                                                                    }
                                                                } else if (!str2.equals(str)) {
                                                                }
                                                            }
                                                        } else {
/* 208 */                                                   if (strArr4[i6].equals(authority)) {
                                                                break;
                                                            }
/* 210 */                                                   i6++;
                                                        }
                                                    }
                                                } else {
/* 190 */                                           if (strArr3[i5].equals(authority)) {
                                                        break;
                                                    }
/* 192 */                                           i5++;
                                                }
                                            }
                                        }
/* 253 */                               assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
/* 257 */                               if (assetFileDescriptorOpenAssetFileDescriptor == null) {
/* 266 */                                   throw new FileNotFoundException("Content resolver returned null value.");
                                        }
                                    }
                                }
                            }
/* 274 */                   throw new FileNotFoundException("Can't open content uri.");
                        }
/* 65 */                int iLastIndexOf = authority.lastIndexOf(64);
/* 69 */                if (iLastIndexOf >= 0) {
/* 72 */                    authority = authority.substring(iLastIndexOf + 1);
/* 80 */                    providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
                        }
/* 84 */                if (providerInfoResolveContentProvider == null) {
                        }
                    }
/* 455 */           list.add(assetFileDescriptorOpenAssetFileDescriptor);
/* 458 */           if (assetFileDescriptorOpenAssetFileDescriptor == null) {
/* 527 */               IioIoO10iOiI.I000OOo1O("Failed to open URI ".concat(String.valueOf(uri)));
/* 530 */               return null;
                    }
/* 460 */           l0iOi11Io0Il l0ioi11io0ilI001i1O0Ol = l0iiio.I001i1O0Ol();
/* 468 */           int fd = assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor().getFd();
/* 472 */           l0ioi11io0ilI001i1O0Ol.I0001Ioi1lo();
/* 479 */           l0iiio.I001i1lo1io((l0iiio) l0ioi11io0ilI001i1O0Ol.I00iiI, fd);
/* 482 */           long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
/* 486 */           l0ioi11io0ilI001i1O0Ol.I0001Ioi1lo();
/* 493 */           l0iiio.I001l0I00((l0iiio) l0ioi11io0ilI001i1O0Ol.I00iiI, startOffset);
/* 496 */           long length4 = assetFileDescriptorOpenAssetFileDescriptor.getLength();
/* 500 */           l0ioi11io0ilI001i1O0Ol.I0001Ioi1lo();
/* 507 */           l0iiio.I001iOo1i0O((l0iiio) l0ioi11io0ilI001i1O0Ol.I00iiI, length4);
/* 514 */           return (l0iiio) l0ioi11io0ilI001i1O0Ol.I0000Il00O();
                }

                private final String[] zzd(O11o0I1oo o11o0I1oo, boolean z) {
/* 2 */             if (z) {
/* 4 */                 throw null;
                    }
/* 89 */            throw null;
                }

                public VkpResults process(InputImage inputImage, VisionImageMetadataParcel visionImageMetadataParcel) throws Throwable {
                    VkpStatus vkpStatusZzb;
                    lI1000oO0Ol li1000oo0olZzc;
                    Boolean bool;
                    Boolean bool2;
                    int i;
                    long j;
                    i1IIOio i1iioio;
                    Iterator it;
/* 7 */             long j2 = 0;
/* 9 */             if (this.zzc) {
/* 16 */                long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 20 */                long j3 = this.zzl;
/* 24 */                if (j3 <= 0 || jElapsedRealtime - j3 <= 300) {
/* 49 */                    this.zzl = jElapsedRealtime;
/* 51 */                    vkpStatusZzb = VkpStatus.zzb();
                        } else {
/* 38 */                    Log.w("PipelineManager", "Pipeline is reset.");
/* 41 */                    stop();
/* 44 */                    vkpStatusZzb = start();
                        }
                    } else {
/* 11 */                vkpStatusZzb = VkpStatus.zzb();
                    }
/* 59 */            if (!vkpStatusZzb.isSuccess()) {
/* 61 */                return VkpResults.zza(vkpStatusZzb);
                    }
                    try {
/* 76 */                if (inputImage.getFormat() == -1) {
/* 78 */                    Bitmap bitmapInternal = inputImage.getBitmapInternal();
/* 82 */                    lII0I0I000I.I000II(bitmapInternal);
/* 85 */                    Bitmap.Config config = bitmapInternal.getConfig();
/* 89 */                    Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
/* 91 */                    if (config != config2) {
/* 97 */                        String.valueOf(bitmapInternal.getConfig());
/* 104 */                       bitmapInternal = bitmapInternal.copy(config2, bitmapInternal.isMutable());
                            }
/* 108 */                   zzd zzdVar = this.zzi;
/* 110 */                   lII0I0I000I.I000II(zzdVar);
/* 124 */                   li1000oo0olZzc = zzdVar.zzj(SystemClock.elapsedRealtime() * 1000, bitmapInternal, zze.zza(visionImageMetadataParcel.rotation));
                        } else if (inputImage.getFormat() == 35) {
/* 138 */                   Image.Plane[] planes = inputImage.getPlanes();
/* 142 */                   lII0I0I000I.I000II(planes);
/* 145 */                   zzd zzdVar2 = this.zzi;
/* 147 */                   lII0I0I000I.I000II(zzdVar2);
/* 154 */                   long jElapsedRealtime2 = SystemClock.elapsedRealtime() * 1000;
/* 155 */                   Image.Plane plane = planes[0];
/* 157 */                   lII0I0I000I.I000II(plane);
/* 160 */                   ByteBuffer buffer = plane.getBuffer();
/* 164 */                   Image.Plane plane2 = planes[1];
/* 166 */                   lII0I0I000I.I000II(plane2);
/* 169 */                   ByteBuffer buffer2 = plane2.getBuffer();
/* 173 */                   Image.Plane plane3 = planes[2];
/* 175 */                   lII0I0I000I.I000II(plane3);
/* 178 */                   ByteBuffer buffer3 = plane3.getBuffer();
/* 182 */                   int width = inputImage.getWidth();
/* 186 */                   int height = inputImage.getHeight();
/* 190 */                   Image.Plane plane4 = planes[0];
/* 192 */                   lII0I0I000I.I000II(plane4);
/* 195 */                   int rowStride = plane4.getRowStride();
/* 199 */                   Image.Plane plane5 = planes[1];
/* 201 */                   lII0I0I000I.I000II(plane5);
/* 204 */                   int rowStride2 = plane5.getRowStride();
/* 208 */                   Image.Plane plane6 = planes[1];
/* 210 */                   lII0I0I000I.I000II(plane6);
/* 223 */                   li1000oo0olZzc = zzdVar2.zzk(jElapsedRealtime2, buffer, buffer2, buffer3, width, height, rowStride, rowStride2, plane6.getPixelStride(), zze.zza(visionImageMetadataParcel.rotation));
                        } else {
/* 234 */                   ByteBuffer byteBufferConvertToNv21Buffer = ImageConvertUtils.getInstance().convertToNv21Buffer(inputImage, true);
/* 238 */                   zzd zzdVar3 = this.zzi;
/* 240 */                   lII0I0I000I.I000II(zzdVar3);
/* 243 */                   byte[] bArrArray = byteBufferConvertToNv21Buffer.array();
/* 249 */                   int iZza = zze.zza(visionImageMetadataParcel.rotation);
/* 255 */                   int i2 = visionImageMetadataParcel.width;
/* 257 */                   int i3 = visionImageMetadataParcel.height;
/* 259 */                   il001oIi1I il001oii1i = new il001oIi1I();
/* 264 */                   if (i2 >= 32767 || i2 < 0) {
/* 1051 */                      throw new IllegalArgumentException();
                            }
/* 268 */                   if (i3 >= 32767 || i3 < 0) {
/* 1045 */                      throw new IllegalArgumentException();
                            }
/* 272 */                   il001oii1i.I00000oIO = i2;
/* 274 */                   il001oii1i.I00000oOI = i3;
/* 276 */                   VarHandle.storeStoreFence();
/* 281 */                   long j4 = visionImageMetadataParcel.timestampMillis * 1000;
/* 284 */                   ii1000OlO0o1 ii1000olo0o1 = new ii1000OlO0o1();
/* 287 */                   ii1000olo0o1.I00000oIO = bArrArray;
/* 289 */                   ii1000olo0o1.I00000oOI = j4;
/* 291 */                   ii1000olo0o1.I0000Il00O = il001oii1i;
/* 293 */                   ii1000olo0o1.I0000O = 2;
/* 295 */                   ii1000olo0o1.I0000oI00 = iZza;
/* 297 */                   VarHandle.storeStoreFence();
/* 300 */                   li1000oo0olZzc = zzdVar3.zzc(ii1000olo0o1);
                        }
/* 309 */               if (!li1000oo0olZzc.I0000Il00O()) {
/* 1027 */                  int i4 = lIiI1010Ool.I00o0iI0io1;
/* 1035 */                  return VkpResults.zza(new AutoValue_VkpStatus(false, null, lIll1lOoI1.I00oOio10iI1));
                        }
/* 311 */               zzd zzdVar4 = this.zzi;
/* 313 */               lII0I0I000I.I000II(zzdVar4);
/* 328 */               il11looIo1l il11looio1l = (il11looIo1l) zzdVar4.zzb().I00000oOI(il11looIo1l.I001IIilI0O());
/* 330 */               int i5 = 5;
/* 335 */               ii0OOl ii0ool = (ii0OOl) il11looio1l.I0010I0i(5, null);
/* 337 */               ii0ool.I00000oOI(il11looio1l);
/* 340 */               iil10O1iilo iil10o1iilo = (iil10O1iilo) ii0ool;
/* 342 */               List list = this.zzd;
/* 344 */               iil10o1iilo.I0001Ioi1lo();
/* 351 */               il11looIo1l.I001i1lo1io((il11looIo1l) iil10o1iilo.I00iiI, list);
/* 358 */               il11looIo1l il11looio1l2 = (il11looIo1l) iil10o1iilo.I0000Il00O();
/* 362 */               this.zzd.clear();
/* 365 */               ii0i1l11 ii0i1l11VarI001i1O0Ol = il11looio1l2.I001i1O0Ol();
/* 369 */               iOoIlloll1i iooilloll1i = this.zzf;
/* 371 */               iooilloll1i.getClass();
/* 376 */               ArrayList arrayList = new ArrayList();
/* 379 */               Iterator it2 = ii0i1l11VarI001i1O0Ol.iterator();
/* 387 */               while (it2.hasNext()) {
/* 393 */                   iiI0O1lI iii0o1li = (iiI0O1lI) it2.next();
                            synchronized (iooilloll1i.I00000oIO) {
/* 398 */                       j = j2;
                                try {
/* 410 */                           if (iooilloll1i.I00000oIO.get(iii0o1li.I00111O()) == null) {
/* 412 */                               LongSparseArray longSparseArray = iooilloll1i.I00000oIO;
/* 414 */                               long jI00111O = iii0o1li.I00111O();
/* 420 */                               i1IIOio i1iioio2 = new i1IIOio();
/* 423 */                               VarHandle.storeStoreFence();
/* 426 */                               longSparseArray.put(jI00111O, i1iioio2);
                                    }
/* 442 */                           i1iioio = (i1IIOio) iooilloll1i.I00000oIO.get(iii0o1li.I00111O());
                                } finally {
                                }
                            }
                            synchronized (i1iioio) {
/* 446 */                       long jElapsedRealtime3 = SystemClock.elapsedRealtime();
/* 450 */                       it = it2;
/* 452 */                       long j5 = i1iioio.I00000oIO;
/* 456 */                       if (j5 == j || jElapsedRealtime3 - j5 >= 10000) {
/* 475 */                           i1iioio.I00000oIO = jElapsedRealtime3;
/* 478 */                           arrayList.add(iii0o1li);
                                }
                            }
/* 467 */                   j2 = j;
/* 469 */                   it2 = it;
                        }
/* 491 */               if (!arrayList.isEmpty()) {
/* 493 */                   iOllO10O iollo10o = this.zzg;
/* 495 */                   looi1l1 looi1l1VarI001IIilI0O = looiiiOIoI.I001IIilI0O();
/* 499 */                   looi1l1VarI001IIilI0O.I0001Ioi1lo();
/* 506 */                   looiiiOIoI.I001i1lo1io((looiiiOIoI) looi1l1VarI001IIilI0O.I00iiI, arrayList);
/* 511 */                   i1IoOl i1iool = new i1IoOl();
/* 514 */                   i1iool.I00iOIl = looi1l1VarI001IIilI0O;
/* 516 */                   iOloo0O0O.I000l1();
/* 519 */                   VarHandle.storeStoreFence();
/* 522 */                   iOIo11i ioio11i = iOIo11i.ACCELERATION_ANALYTICS;
/* 524 */                   o0IiOl o0iiol = iollo10o.I0000oI00;
/* 543 */                   String strI00000oIO = o0iiol.I000OOo1O() ? (String) o0iiol.I000II() : O0oO1lOOo1.I0000Il00O.I00000oIO(iollo10o.I000II);
/* 549 */                   IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(i5);
/* 552 */                   iO0iIlI1li.I00iiI = iollo10o;
/* 554 */                   iO0iIlI1li.I00iiO = i1iool;
/* 556 */                   iO0iIlI1li.I00iio = ioio11i;
/* 558 */                   iO0iIlI1li.I00ilI0I1 = strI00000oIO;
/* 560 */                   VarHandle.storeStoreFence();
/* 564 */                   io1OllI.I00000oIO(1, iO0iIlI1li);
                        }
/* 571 */               il1looOi il1loooi = (il1looOi) li1000oo0olZzc.I00000oIO();
/* 573 */               Matrix uprightRotationMatrix = visionImageMetadataParcel.getUprightRotationMatrix();
/* 577 */               boolean z = this.zzk;
/* 583 */               int i6 = 4;
/* 584 */               if (il11looio1l2.I00111O() == 0) {
/* 586 */                   bool2 = null;
                        } else {
/* 592 */                   Iterator it3 = il11looio1l2.I001i1O0Ol().iterator();
/* 596 */                   boolean z2 = false;
                            while (true) {
/* 601 */                       if (it3.hasNext()) {
/* 609 */                           iiI011O00i iii011o00iI001IIilI0O = ((iiI0O1lI) it3.next()).I001IIilI0O();
/* 613 */                           ii1liiOo0 ii1liioo0I001IIilI0O = iii011o00iI001IIilI0O.I001IIilI0O();
/* 621 */                           if (iii011o00iI001IIilI0O.I001i1O0Ol() == 4) {
/* 628 */                               if (iii011o00iI001IIilI0O.I001i1lo1io() == 2 && iii011o00iI001IIilI0O.I00111O().I001IIilI0O().I001IIilI0O() == 2 && ii1liioo0I001IIilI0O.I001i1lo1io() && !ii1liioo0I001IIilI0O.I00111O().I001IIilI0O() && !ii1liioo0I001IIilI0O.I00111O().I001IO000() && !ii1liioo0I001IIilI0O.I001i1O0Ol() && !ii1liioo0I001IIilI0O.I001IO000()) {
/* 682 */                                   bool = Boolean.TRUE;
                                            break;
                                        }
/* 686 */                               z2 = true;
                                    }
                                } else if (z2) {
/* 690 */                           bool = Boolean.FALSE;
                                }
                            }
/* 684 */                   bool2 = bool;
                        }
/* 693 */               Object[] objArrCopyOf = new Object[4];
/* 695 */               l1lOO0O0l l1loo0o0lI001i1lo1io = il1loooi.I001i1lo1io();
/* 699 */               int i7 = 0;
/* 700 */               int i8 = 0;
/* 705 */               while (i7 < l1loo0o0lI001i1lo1io.I00111O()) {
/* 707 */                   l1l0lOliO l1l0lolioI001IIilI0O = l1loo0o0lI001i1lo1io.I001IIilI0O(i7);
/* 711 */                   l00oIl l00oilI001i1O0Ol = l1l0lolioI001IIilI0O.I001i1O0Ol();
/* 749 */                   RectF rectF = new RectF(l00oilI001i1O0Ol.I001IIilI0O(), l00oilI001i1O0Ol.I001IO000(), l00oilI001i1O0Ol.I001i1O0Ol() + l00oilI001i1O0Ol.I001IIilI0O(), l00oilI001i1O0Ol.I00111O() + l00oilI001i1O0Ol.I001IO000());
/* 752 */                   if (uprightRotationMatrix != null) {
/* 754 */                       uprightRotationMatrix.mapRect(rectF);
                            }
/* 759 */                   Rect rect = new Rect();
/* 762 */                   rectF.round(rect);
/* 782 */                   Integer numValueOf = l1l0lolioI001IIilI0O.I001iOo1i0O() ? Integer.valueOf((int) l1l0lolioI001IIilI0O.I001IO000()) : null;
/* 783 */                   Object[] objArrCopyOf2 = new Object[i6];
/* 786 */                   int i9 = 0;
/* 787 */                   int i10 = 0;
/* 792 */                   while (i10 < l1l0lolioI001IIilI0O.I001IIilI0O()) {
/* 798 */                       VkpImageLabel vkpImageLabelZza = VkpImageLabel.zza(l1l0lolioI001IIilI0O.I001i1lo1io(i10));
/* 802 */                       vkpImageLabelZza.getClass();
/* 805 */                       Matrix matrix = uprightRotationMatrix;
/* 807 */                       int i11 = i9 + 1;
/* 809 */                       il1looOi il1loooi2 = il1loooi;
/* 811 */                       int length = objArrCopyOf2.length;
/* 812 */                       if (length < i11) {
/* 820 */                           int i12 = length + (length >> 1) + 1;
/* 822 */                           i = i9;
/* 824 */                           if (i12 < i11) {
/* 826 */                               int iHighestOneBit = Integer.highestOneBit(i);
/* 830 */                               i12 = iHighestOneBit + iHighestOneBit;
                                    }
/* 831 */                           if (i12 < 0) {
/* 833 */                               i12 = Integer.MAX_VALUE;
                                    }
/* 836 */                           objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, i12);
                                } else {
/* 842 */                           i = i9;
                                }
/* 844 */                       objArrCopyOf2[i] = vkpImageLabelZza;
/* 846 */                       i10++;
/* 848 */                       i9 = i11;
/* 849 */                       uprightRotationMatrix = matrix;
/* 851 */                       il1loooi = il1loooi2;
                            }
/* 854 */                   Matrix matrix2 = uprightRotationMatrix;
/* 856 */                   il1looOi il1loooi3 = il1loooi;
/* 868 */                   AutoValue_VkpDetectedObject autoValue_VkpDetectedObject = new AutoValue_VkpDetectedObject(rect, numValueOf, lIOiOOl.I001iOo1i0O(i9, objArrCopyOf2));
/* 871 */                   int i13 = i8 + 1;
/* 873 */                   int length2 = objArrCopyOf.length;
/* 874 */                   if (length2 < i13) {
/* 880 */                       int i14 = length2 + (length2 >> 1) + 1;
/* 881 */                       if (i14 < i13) {
/* 883 */                           int iHighestOneBit2 = Integer.highestOneBit(i8);
/* 887 */                           i14 = iHighestOneBit2 + iHighestOneBit2;
                                }
/* 895 */                       objArrCopyOf = Arrays.copyOf(objArrCopyOf, i14 < 0 ? Integer.MAX_VALUE : i14);
                            }
/* 899 */                   objArrCopyOf[i8] = autoValue_VkpDetectedObject;
/* 901 */                   i7++;
/* 903 */                   i8 = i13;
/* 904 */                   uprightRotationMatrix = matrix2;
/* 906 */                   il1loooi = il1loooi3;
/* 909 */                   i6 = 4;
                        }
/* 915 */               Object[] objArrCopyOf3 = new Object[i6];
/* 925 */               Iterator it4 = il1loooi.I001i1O0Ol().I001IIilI0O().iterator();
/* 929 */               int i15 = 0;
/* 934 */               while (it4.hasNext()) {
/* 946 */                   Iterator it5 = ((l1I1li11l) it4.next()).I00111O().iterator();
/* 954 */                   while (it5.hasNext()) {
/* 962 */                       VkpImageLabel vkpImageLabelZza2 = VkpImageLabel.zza((l0IOIIIlol) it5.next());
/* 966 */                       vkpImageLabelZza2.getClass();
/* 969 */                       int i16 = i15 + 1;
/* 971 */                       int length3 = objArrCopyOf3.length;
/* 972 */                       if (length3 < i16) {
/* 978 */                           int i17 = length3 + (length3 >> 1) + 1;
/* 979 */                           if (i17 < i16) {
/* 981 */                               int iHighestOneBit3 = Integer.highestOneBit(i15);
/* 985 */                               i17 = iHighestOneBit3 + iHighestOneBit3;
                                    }
/* 986 */                           if (i17 < 0) {
/* 988 */                               i17 = Integer.MAX_VALUE;
                                    }
/* 991 */                           objArrCopyOf3 = Arrays.copyOf(objArrCopyOf3, i17);
                                }
/* 997 */                       objArrCopyOf3[i15] = vkpImageLabelZza2;
/* 999 */                       i15 = i16;
                            }
                        }
/* 1017 */              AutoValue_VkpResults autoValue_VkpResults = new AutoValue_VkpResults(VkpStatus.zzb(), lIOiOOl.I001iOo1i0O(i8, objArrCopyOf), lIOiOOl.I001iOo1i0O(i15, objArrCopyOf3), z, bool2);
/* 1021 */              this.zzk = false;
/* 1023 */              return autoValue_VkpResults;
                    } catch (O1o01iO0liI0 e) {
/* 1057 */              return VkpResults.zza(VkpStatus.zza(e));
                    }
                }

                public VkpStatus start() throws Throwable {
                    lIiI1010Ool lilo101;
                    l1Io001O1 l1io001o1I00000oOI;
                    ii10lIloOOii ii10liloooiiI00000oIO;
                    iilo1l iilo1lVarI00000oIO;
                    iOlOi1iIii ioloi1iiii;
                    i1Il01 i1il01;
/* 5 */             if (this.zzj) {
/* 7 */                 return VkpStatus.zzb();
                    }
/* 12 */            zzd zzdVar = this.zzi;
/* 18 */            if (zzdVar == null) {
                        try {
/* 21 */                    zzc zzcVar = this.zzb;
/* 28 */                    if (zzcVar instanceof VkpImageLabelerOptions) {
/* 30 */                        VkpImageLabelerOptions vkpImageLabelerOptions = (VkpImageLabelerOptions) zzcVar;
/* 32 */                        float fZza = vkpImageLabelerOptions.zza();
/* 36 */                        int iZzb = vkpImageLabelerOptions.zzb();
/* 40 */                        vkpImageLabelerOptions.zzc();
/* 43 */                        Context context = this.zza;
/* 45 */                        l0i0l1l l0i0l1lVarI00111O = l0i1I00l0o.I00111O();
/* 59 */                        ii01lO0l11ii ii01lo0l11iiI00111O = ii01lO0l11ii.I00111O(context.getAssets().open("mlkit_label_default_model/mobile_ica_8bit_with_metadata_tflite"));
/* 63 */                        l0i0l1lVarI00111O.I0001Ioi1lo();
/* 70 */                        l0i1I00l0o.I001IIilI0O((l0i1I00l0o) l0i0l1lVarI00111O.I00iiI, ii01lo0l11iiI00111O);
/* 73 */                        iilo1lVarI00000oIO = lioioo11.I00000oIO(l0i0l1lVarI00111O, fZza, iZzb, null);
                            } else {
/* 82 */                        VkpObjectDetectorOptions vkpObjectDetectorOptions = (VkpObjectDetectorOptions) zzcVar;
/* 84 */                        vkpObjectDetectorOptions.zza();
/* 87 */                        vkpObjectDetectorOptions.zzb();
/* 90 */                        vkpObjectDetectorOptions.zzc();
/* 97 */                        if (vkpObjectDetectorOptions.zzg()) {
/* 102 */                           l1Io001O1 l1io001o1 = iol1Ol0ooOoi.I00000oIO;
/* 114 */                           l1io001o1I00000oOI = iol1Ol0ooOoi.I00000oOI(zzb("mlkit_odt_default_classifier/labeler_with_validation.tflite"), ii10lI1lO0.I00111O());
                                } else {
/* 99 */                            l1io001o1I00000oOI = iol1Ol0ooOoi.I00000oIO;
                                }
/* 127 */                       int i = true != vkpObjectDetectorOptions.zzf() ? 3 : 2;
/* 130 */                       l0iiio l0iiioVarZzb = zzb("mlkit_odt_localizer/localizer_with_validation.tflite");
/* 138 */                       if (vkpObjectDetectorOptions.zzf()) {
/* 140 */                           iOlOI0l11 ioloi0l11 = this.zzh;
/* 142 */                           String strZzd = vkpObjectDetectorOptions.zzd();
/* 146 */                           String strZze = vkpObjectDetectorOptions.zze();
/* 150 */                           i1Il01 i1il012 = ioloi0l11.I0000Il00O;
/* 154 */                           iOlOi1iIii ioloi1iiii2 = new iOlOi1iIii(0);
/* 157 */                           ioloi1iiii2.I0000O();
                                    try {
                                        try {
/* 170 */                                   i1il01 = i1il012;
                                            try {
/* 176 */                                       ii10liloooiiI00000oIO = ioloi0l11.I00000oIO.I00000oIO(strZzd, strZze, ioloi1iiii2, ioloi0l11.I0000oI00);
/* 182 */                                       ioloi1iiii2.I0000Il00O();
/* 185 */                                       i1il01.getClass();
/* 190 */                                       i1il01.I0000O(ioloi1iiii2, iOIo11i.ACCELERATION_ALLOWLIST_GET);
/* 195 */                                       Log.i("PipelineManager", "Fetching acceleration allowlist");
/* 208 */                                       this.zzh.I00000oOI(vkpObjectDetectorOptions.zzd(), vkpObjectDetectorOptions.zze());
                                            } catch (Throwable th) {
/* 212 */                                       th = th;
/* 213 */                                       ioloi1iiii = ioloi1iiii2;
/* 226 */                                       ioloi1iiii.I0000Il00O();
/* 229 */                                       i1il01.getClass();
/* 234 */                                       i1il01.I0000O(ioloi1iiii, iOIo11i.ACCELERATION_ALLOWLIST_GET);
/* 237 */                                       throw th;
                                            }
                                        } catch (Throwable th2) {
/* 216 */                                   th = th2;
/* 217 */                                   i1il01 = i1il012;
/* 219 */                                   ioloi1iiii = ioloi1iiii2;
                                        }
                                    } catch (Throwable th3) {
/* 222 */                               th = th3;
/* 223 */                               ioloi1iiii = ioloi1iiii2;
/* 224 */                               i1il01 = i1il012;
                                    }
                                } else {
/* 238 */                           ii10liloooiiI00000oIO = null;
                                }
/* 239 */                       boolean zZzi = vkpObjectDetectorOptions.zzi();
/* 243 */                       Context context2 = this.zza;
/* 245 */                       if (zZzi) {
/* 251 */                           ilOI0IoO1I iloi0ioo1iI00000oIO = iol1Ol0ooOoi.I00000oIO(context2, vkpObjectDetectorOptions.zzh(), l0iiioVarZzb, l1io001o1I00000oOI, ii10liloooiiI00000oIO);
/* 255 */                           iloi0ioo1iI00000oIO.I0001Ioi1lo();
/* 262 */                           ilOiO0.I00II0oii1o((ilOiO0) iloi0ioo1iI00000oIO.I00iiI, i);
/* 265 */                           iilli0i1lI iilli0i1liI001IIilI0O = iilo1l.I001IIilI0O();
/* 269 */                           iilli0i1liI001IIilI0O.I0001Ioi1lo();
/* 282 */                           iilo1l.I001i1lo1io((iilo1l) iilli0i1liI001IIilI0O.I00iiI, (ilOiO0) iloi0ioo1iI00000oIO.I0000Il00O());
/* 285 */                           ioIIlOOoo ioiilooooI00111O = ioIOiI.I00111O();
/* 289 */                           ioiilooooI00111O.I0001Ioi1lo();
/* 296 */                           ioIOiI.I001IIilI0O((ioIOiI) ioiilooooI00111O.I00iiI);
/* 299 */                           ioiilooooI00111O.I0001Ioi1lo();
/* 306 */                           ioIOiI.I001IO000((ioIOiI) ioiilooooI00111O.I00iiI, 1);
/* 309 */                           iilli0i1liI001IIilI0O.I0001Ioi1lo();
/* 322 */                           iilo1l.I001IO000((iilo1l) iilli0i1liI001IIilI0O.I00iiI, (ioIOiI) ioiilooooI00111O.I0000Il00O());
/* 329 */                           iilo1lVarI00000oIO = (iilo1l) iilli0i1liI001IIilI0O.I0000Il00O();
                                } else {
/* 333 */                           boolean zZzh = vkpObjectDetectorOptions.zzh();
/* 337 */                           ii10lI1lO0 ii10li1lo0I00111O = ii10lI1lO0.I00111O();
/* 341 */                           ilOI0IoO1I iloi0ioo1iI001IIilI0O = ilOiO0.I001IIilI0O();
/* 353 */                           iO0OliiO io0oliioI0000O = iol1Ol0ooOoi.I0000O(iol1Ol0ooOoi.I0000oI00(context2.getAssets(), l0iiioVarZzb), l1io001o1I00000oOI, zZzh, ii10li1lo0I00111O);
/* 357 */                           iloi0ioo1iI001IIilI0O.I0001Ioi1lo();
/* 370 */                           ilOiO0.I001l0I00((ilOiO0) iloi0ioo1iI001IIilI0O.I00iiI, (iO10oi0) io0oliioI0000O.I0000Il00O());
/* 373 */                           String strI0000Il00O = iol1Ol0ooOoi.I0000Il00O(context2);
/* 377 */                           if (strI0000Il00O != null) {
/* 379 */                               iloi0ioo1iI001IIilI0O.I0001Ioi1lo();
/* 386 */                               ilOiO0.I001i1O0Ol((ilOiO0) iloi0ioo1iI001IIilI0O.I00iiI, strI0000Il00O);
/* 389 */                               iloi0ioo1iI001IIilI0O.I0001Ioi1lo();
/* 396 */                               ilOiO0.I001i1lo1io((ilOiO0) iloi0ioo1iI001IIilI0O.I00iiI, strI0000Il00O);
                                    }
/* 399 */                           iloi0ioo1iI001IIilI0O.I0001Ioi1lo();
/* 406 */                           ilOiO0.I00II0oii1o((ilOiO0) iloi0ioo1iI001IIilI0O.I00iiI, i);
/* 409 */                           if (ii10liloooiiI00000oIO != null) {
/* 411 */                               iloi0ioo1iI001IIilI0O.I0001Ioi1lo();
/* 418 */                               ilOiO0.I001IO000((ilOiO0) iloi0ioo1iI001IIilI0O.I00iiI, ii10liloooiiI00000oIO);
                                    }
/* 421 */                           iilli0i1lI iilli0i1liI001IIilI0O2 = iilo1l.I001IIilI0O();
/* 425 */                           iilli0i1liI001IIilI0O2.I0001Ioi1lo();
/* 438 */                           iilo1l.I001i1lo1io((iilo1l) iilli0i1liI001IIilI0O2.I00iiI, (ilOiO0) iloi0ioo1iI001IIilI0O.I0000Il00O());
/* 441 */                           ioIIlOOoo ioiilooooI00111O2 = ioIOiI.I00111O();
/* 445 */                           ioiilooooI00111O2.I0001Ioi1lo();
/* 452 */                           ioIOiI.I001IO000((ioIOiI) ioiilooooI00111O2.I00iiI, 2);
/* 455 */                           iilli0i1liI001IIilI0O2.I0001Ioi1lo();
/* 468 */                           iilo1l.I001IO000((iilo1l) iilli0i1liI001IIilI0O2.I00iiI, (ioIOiI) ioiilooooI00111O2.I0000Il00O());
/* 475 */                           iilo1lVarI00000oIO = (iilo1l) iilli0i1liI001IIilI0O2.I0000Il00O();
                                }
                            }
/* 481 */                   ii0OOl ii0ool = (ii0OOl) iilo1lVarI00000oIO.I0010I0i(5, null);
/* 483 */                   ii0ool.I00000oOI(iilo1lVarI00000oIO);
/* 486 */                   iilli0i1lI iilli0i1li = (iilli0i1lI) ii0ool;
/* 488 */                   io0olIo0i io0olio0iI00111O = iolOO0iIIlI.I00111O();
/* 492 */                   io0olio0iI00111O.I0001Ioi1lo();
/* 499 */                   iolOO0iIIlI.I001IIilI0O((iolOO0iIIlI) io0olio0iI00111O.I00iiI);
/* 512 */                   File file = new File(this.zza.getFilesDir(), "com.google.mlkit.acceleration");
/* 519 */                   if (!file.exists() && !file.mkdir()) {
/* 527 */                       List list = this.zzd;
/* 529 */                       iiI0Ill0 iii0ill0I001IO000 = iiI0O1lI.I001IO000();
/* 533 */                       iii0ill0I001IO000.I0001Ioi1lo();
/* 540 */                       iiI0O1lI.I001i1O0Ol((iiI0O1lI) iii0ill0I001IO000.I00iiI);
/* 549 */                       list.add((iiI0O1lI) iii0ill0I001IO000.I0000Il00O());
/* 554 */                       Log.e("PipelineManager", "Failed to create acceleration storage dir");
                            }
/* 557 */                   String absolutePath = file.getAbsolutePath();
/* 561 */                   io0olio0iI00111O.I0001Ioi1lo();
/* 568 */                   iolOO0iIIlI.I001IO000((iolOO0iIIlI) io0olio0iI00111O.I00iiI, absolutePath);
/* 571 */                   iilli0i1li.I0001Ioi1lo();
/* 584 */                   iilo1l.I001i1O0Ol((iilo1l) iilli0i1li.I00iiI, (iolOO0iIIlI) io0olio0iI00111O.I0000Il00O());
/* 595 */                   zzd zzdVar2 = new zzd((iilo1l) iilli0i1li.I0000Il00O());
/* 598 */                   this.zzi = zzdVar2;
/* 600 */                   zzdVar = zzdVar2;
                        } catch (IOException e) {
/* 602 */                   zza();
/* 610 */                   return VkpStatus.zza(new O1o01iO0liI0(5, e, "Failed to initialize detector. "));
                        }
                    }
                    try {
/* 615 */               zzdVar.zzh();
                        try {
/* 621 */                   Analytics.I00000oOI();
/* 632 */                   if (Looper.myLooper() == Looper.getMainLooper()) {
/* 640 */                       io0olIOlOoI.I00iiI.I00iOIl.I00li1OI(OOIllOil.I00iOIl);
                            } else {
/* 650 */                       Handler handler = new Handler(Looper.getMainLooper());
/* 657 */                       Iioo110oI iioo110oI = new Iioo110oI(13);
/* 660 */                       VarHandle.storeStoreFence();
/* 663 */                       handler.post(iioo110oI);
                            }
/* 666 */                   this.zzj = true;
/* 668 */                   return VkpStatus.zzb();
                        } catch (UnsatisfiedLinkError unused) {
/* 680 */                   throw new UnsatisfiedLinkError("Make sure analytics_jni_lib is loaded. For VisionKit Pipeline, analytics_jni_lib can be loaded by setting `include_acceleration_analytics` of `pipeline_android_library` to `True` and this method should be called after initializing Pipeline.java.");
                        }
                    } catch (PipelineException e2) {
/* 712 */               O1o01iO0liI0 o1o01iO0liI0 = new O1o01iO0liI0("Failed to initialize detector. " + ((String) e2.getRootCauseMessage().I00000oOI("")), 3);
/* 718 */               lIO0IIo lio0iio = new lIO0IIo(3, (byte) 0);
/* 734 */               lio0iio.I000O01llI0(new AutoValue_VkpStatus_VkpError(1, e2.getStatusCode().ordinal()));
/* 741 */               Iterator<iI1I1lol> it = e2.getComponentStatuses().iterator();
/* 749 */               while (it.hasNext()) {
/* 769 */                   for (iIlol1Ii001I iilol1ii001i : it.next().I00111O()) {
/* 801 */                       lio0iio.I000O01llI0(new AutoValue_VkpStatus_VkpError(true != "tflite::support::TfLiteSupportStatus".equals(iilol1ii001i.I001IIilI0O()) ? 0 : 3, iilol1ii001i.I00111O()));
                            }
                        }
/* 807 */               int i2 = lio0iio.I0000Il00O;
/* 809 */               if (i2 != 0) {
/* 811 */                   Object[] objArr = lio0iio.I00000oOI;
/* 813 */                   if (i2 != 1) {
/* 815 */                       lilo101 = lIiI1010Ool.I001iOo1i0O(i2, objArr);
/* 823 */                       lio0iio.I0000Il00O = lilo101.size();
/* 825 */                       lio0iio.I0000O = true;
                            } else {
/* 831 */                       Object obj = objArr[0];
/* 833 */                       Objects.requireNonNull(obj);
/* 838 */                       lilo101 = new lIlo101(obj);
                            }
                        } else {
/* 842 */                   lilo101 = lIll1lOoI1.I00oOio10iI1;
                        }
/* 845 */               return new AutoValue_VkpStatus(false, o1o01iO0liI0, lilo101);
                    } finally {
/* 852 */               zza();
                    }
                }

                public void stop() throws IOException {
/* 1 */             zzd zzdVar = this.zzi;
/* 3 */             if (zzdVar != null) {
/* 7 */                 if (this.zzj) {
/* 9 */                     zzdVar.zzi();
                        }
/* 14 */                this.zzi.zzd();
/* 18 */                this.zzi = null;
                    }
/* 21 */            this.zzj = false;
/* 24 */            this.zzk = true;
/* 28 */            this.zzl = -1L;
/* 30 */            zza();
                }

                public final void zza() throws IOException {
/* 11 */            for (AssetFileDescriptor assetFileDescriptor : this.zze) {
/* 19 */                if (assetFileDescriptor != null) {
                            try {
/* 21 */                        assetFileDescriptor.close();
                            } catch (IOException e) {
/* 30 */                        Log.e("PipelineManager", "Failed to close asset model file.", e);
                            }
                        }
                    }
/* 36 */            this.zze.clear();
                }
            }
