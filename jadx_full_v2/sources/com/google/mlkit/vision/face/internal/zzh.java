            package com.google.mlkit.vision.face.internal;

            import android.content.Context;
            import android.graphics.Rect;
            import android.os.SystemClock;
            import android.util.Pair;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.BitmapInStreamingChecker;
            import com.google.mlkit.vision.common.internal.ImageUtils;
            import com.google.mlkit.vision.face.Face;
            import com.google.mlkit.vision.face.FaceDetectorOptions;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.I00Ol00;
            import p000.I0Oi111ii;
            import p000.O1Il0Il;
            import p000.O1o0111OI00;
            import p000.O1o01iO0liI0;
            import p000.OloOII1ioI1l;
            import p000.Oo1ooo0ollI;
            import p000.ilIliOoI1;
            import p000.ilO0o0olO0;
            import p000.io1OllI;
            import p000.l1o1O00;
            import p000.lI0IOoI;
            import p000.lI0illOiIllI;
            import p000.lI0ooOol111;
            import p000.lI1ioiiOli1;
            import p000.lII0I0I000I;
            import p000.lIIO1i1Oo01O;
            import p000.lIIi1il;
            import p000.lIIl0IOioI;
            import p000.lIli10;
            import p000.lOio11O;
            import p000.lOoIoI1Ioii;
            import p000.li0ll1ooi1;
            import p000.li10lI1;
            import p000.li1Io1I1li;
            
            public final class zzh extends O1Il0Il {
                static final AtomicBoolean zza = new AtomicBoolean(true);
                private static final ImageUtils zzb = ImageUtils.getInstance();
                private final FaceDetectorOptions zzc;
                private final li10lI1 zzd;
                private final li1Io1I1li zze;
                private final zzb zzf;
                private boolean zzg;
                private final BitmapInStreamingChecker zzh = new BitmapInStreamingChecker();

                public zzh(li10lI1 li10li1, FaceDetectorOptions faceDetectorOptions, zzb zzbVar) {
/* 13 */            lII0I0I000I.I000O01llI0("FaceDetectorOptions can not be null", faceDetectorOptions);
/* 16 */            this.zzc = faceDetectorOptions;
/* 18 */            this.zzd = li10li1;
/* 20 */            this.zzf = zzbVar;
/* 26 */            Context contextI00000oOI = O1o0111OI00.I0000Il00O().I00000oOI();
/* 32 */            li1Io1I1li li1io1i1li = new li1Io1I1li();
/* 42 */            li1io1i1li.I00000oOI = new AtomicLong(-1L);
/* 46 */            OloOII1ioI1l oloOII1ioI1l = new OloOII1ioI1l();
/* 51 */            oloOII1ioI1l.I00000oOI = "mlkit:vision";
/* 53 */            VarHandle.storeStoreFence();
/* 60 */            li1io1i1li.I00000oIO = lOio11O.I00000oIO(contextI00000oOI, oloOII1ioI1l);
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            this.zze = li1io1i1li;
                }

                public static void zzf(List list) {
/* 1 */             Iterator it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 18 */                ((Face) it.next()).zzc(-1);
                    }
                }

                private final synchronized void zzg(final lIIi1il liii1il, long j, final InputImage inputImage, final int i, final int i2) {
/* 6 */             final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
/* 26 */            this.zzd.I0000Il00O(new li0ll1ooi1() {
                        @Override
                        public final lOoIoI1Ioii zza() {
/* 13 */                    return this.zza.zzc(jElapsedRealtime, liii1il, i, i2, inputImage);
                        }
                    }, lIIl0IOioI.ON_DEVICE_FACE_DETECT);
/* 35 */            Boolean boolValueOf = Boolean.valueOf(zza.get());
/* 44 */            Integer numValueOf = Integer.valueOf(i & Integer.MAX_VALUE);
/* 50 */            Integer numValueOf2 = Integer.valueOf(i2 & Integer.MAX_VALUE);
/* 56 */            lI0IOoI li0iooiZza = zzj.zza(this.zzc);
/* 62 */            ilIliOoI1 ililiooi1 = new ilIliOoI1();
/* 65 */            ililiooi1.I00000oIO = liii1il;
/* 67 */            ililiooi1.I00000oOI = boolValueOf;
/* 69 */            ililiooi1.I0000Il00O = li0iooiZza;
/* 71 */            ililiooi1.I0000O = numValueOf;
/* 73 */            ililiooi1.I0000oI00 = numValueOf2;
/* 75 */            VarHandle.storeStoreFence();
/* 80 */            zzg zzgVar = new zzg(this);
/* 83 */            li10lI1 li10li1 = this.zzd;
/* 85 */            lIIl0IOioI liil0ioioi = lIIl0IOioI.AGGREGATED_ON_DEVICE_FACE_DETECTION;
/* 90 */            Oo1ooo0ollI oo1ooo0ollI = new Oo1ooo0ollI(4);
/* 93 */            oo1ooo0ollI.I00iiO = li10li1;
/* 95 */            oo1ooo0ollI.I00iio = liil0ioioi;
/* 97 */            oo1ooo0ollI.I00ilI0I1 = ililiooi1;
/* 99 */            oo1ooo0ollI.I00iiI = jElapsedRealtime;
/* 101 */           oo1ooo0ollI.I00ilO0 = zzgVar;
/* 103 */           VarHandle.storeStoreFence();
/* 107 */           io1OllI.I00000oIO(1, oo1ooo0ollI);
/* 110 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 131 */           this.zze.I00000oIO(true != this.zzg ? 24303 : 24304, liii1il.I00iOIl, jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
                }

                @Override
                public final synchronized void load() {
/* 8 */             this.zzg = this.zzf.zzd();
                }

                @Override
                public final synchronized void release() {
                    try {
/* 4 */                 this.zzf.zzb();
/* 10 */                zza.set(true);
/* 13 */                li10lI1 li10li1 = this.zzd;
/* 19 */                I0Oi111ii i0Oi111ii = new I0Oi111ii(14);
/* 33 */                i0Oi111ii.I00iio = this.zzg ? lIIO1i1Oo01O.TYPE_THICK : lIIO1i1Oo01O.TYPE_THIN;
/* 47 */                li10li1.I00000oOI(new I00Ol00(i0Oi111ii, 0), lIIl0IOioI.ON_DEVICE_FACE_CLOSE, li10li1.I0000O());
                    } catch (Throwable th) {
/* 113 */               throw th;
                    }
                }

                public final lOoIoI1Ioii zzc(long j, lIIi1il liii1il, int i, int i2, InputImage inputImage) {
/* 7 */             Long lValueOf = Long.valueOf(j & Long.MAX_VALUE);
/* 17 */            Boolean boolValueOf = Boolean.valueOf(zza.get());
/* 23 */            lI1ioiiOli1 li1ioiioli1 = new lI1ioiiOli1();
/* 26 */            li1ioiioli1.I00000oIO = lValueOf;
/* 28 */            li1ioiioli1.I00000oOI = liii1il;
/* 30 */            li1ioiioli1.I0000Il00O = boolValueOf;
/* 32 */            VarHandle.storeStoreFence();
/* 37 */            lI0IOoI li0iooiZza = zzj.zza(this.zzc);
/* 46 */            Integer numValueOf = Integer.valueOf(i & Integer.MAX_VALUE);
/* 52 */            Integer numValueOf2 = Integer.valueOf(i2 & Integer.MAX_VALUE);
/* 56 */            ImageUtils imageUtils = zzb;
/* 58 */            int mobileVisionImageFormat = imageUtils.getMobileVisionImageFormat(inputImage);
/* 62 */            int mobileVisionImageSize = imageUtils.getMobileVisionImageSize(inputImage);
/* 101 */           lI0illOiIllI li0illoiilli = mobileVisionImageFormat != -1 ? mobileVisionImageFormat != 35 ? mobileVisionImageFormat != 842094169 ? mobileVisionImageFormat != 16 ? mobileVisionImageFormat != 17 ? lI0illOiIllI.UNKNOWN_FORMAT : lI0illOiIllI.NV21 : lI0illOiIllI.NV16 : lI0illOiIllI.YV12 : lI0illOiIllI.YUV_420_888 : lI0illOiIllI.BITMAP;
/* 104 */           Integer numValueOf3 = Integer.valueOf(Integer.MAX_VALUE & mobileVisionImageSize);
/* 110 */           lI0ooOol111 li0ooool111 = new lI0ooOol111();
/* 113 */           li0ooool111.I00000oIO = li0illoiilli;
/* 115 */           li0ooool111.I00000oOI = numValueOf3;
/* 117 */           VarHandle.storeStoreFence();
/* 122 */           lIli10 lili10 = new lIli10();
/* 125 */           lili10.I00000oIO = li1ioiioli1;
/* 127 */           lili10.I00000oOI = li0ooool111;
/* 129 */           lili10.I0000Il00O = li0iooiZza;
/* 131 */           lili10.I0000O = numValueOf;
/* 133 */           lili10.I0000oI00 = numValueOf2;
/* 135 */           VarHandle.storeStoreFence();
/* 142 */           I0Oi111ii i0Oi111ii = new I0Oi111ii(14);
/* 154 */           i0Oi111ii.I00iio = this.zzg ? lIIO1i1Oo01O.TYPE_THICK : lIIO1i1Oo01O.TYPE_THIN;
/* 156 */           i0Oi111ii.I00ilI0I1 = lili10;
/* 161 */           return new I00Ol00(i0Oi111ii, 0);
                }

                public final lOoIoI1Ioii zzd(ilIliOoI1 ililiooi1, int i, l1o1O00 l1o1o00) {
/* 5 */             I0Oi111ii i0Oi111ii = new I0Oi111ii(14);
/* 17 */            i0Oi111ii.I00iio = this.zzg ? lIIO1i1Oo01O.TYPE_THICK : lIIO1i1Oo01O.TYPE_THIN;
/* 23 */            Integer numValueOf = Integer.valueOf(Integer.MAX_VALUE & i);
/* 29 */            ilO0o0olO0 ilo0o0olo0 = new ilO0o0olO0();
/* 32 */            ilo0o0olo0.I00000oIO = ililiooi1;
/* 34 */            ilo0o0olo0.I00000oOI = numValueOf;
/* 36 */            ilo0o0olo0.I0000Il00O = l1o1o00;
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            i0Oi111ii.I00io1l = ilo0o0olo0;
/* 46 */            return new I00Ol00(i0Oi111ii, 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0105 A[Catch: all -> 0x002b, O1o01iO0liI0 -> 0x002e, Merged into TryCatch #1 {all -> 0x002b, O1o01iO0liI0 -> 0x002e, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0033, B:42:0x00ff, B:50:0x0115, B:49:0x010f, B:45:0x0105, B:19:0x0041, B:20:0x0045, B:21:0x004e, B:23:0x0054, B:24:0x005f, B:26:0x0065, B:28:0x0071, B:30:0x0077, B:32:0x0085, B:34:0x00d6, B:36:0x00e1, B:39:0x00ee, B:41:0x00f7, B:53:0x0120, B:55:0x0126, B:58:0x012d, B:59:0x0136, B:57:0x012a), top: B:63:0x0005 }] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x010f A[Catch: all -> 0x002b, O1o01iO0liI0 -> 0x002e, Merged into TryCatch #1 {all -> 0x002b, O1o01iO0liI0 -> 0x002e, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0033, B:42:0x00ff, B:50:0x0115, B:49:0x010f, B:45:0x0105, B:19:0x0041, B:20:0x0045, B:21:0x004e, B:23:0x0054, B:24:0x005f, B:26:0x0065, B:28:0x0071, B:30:0x0077, B:32:0x0085, B:34:0x00d6, B:36:0x00e1, B:39:0x00ee, B:41:0x00f7, B:53:0x0120, B:55:0x0126, B:58:0x012d, B:59:0x0136, B:57:0x012a), top: B:63:0x0005 }] */
                /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final synchronized List run(InputImage inputImage) {
                    long jElapsedRealtime;
                    List list;
                    ArrayList arrayList;
                    List list2;
                    List list3;
                    ArrayList arrayList2;
                    try {
/* 6 */                 jElapsedRealtime = SystemClock.elapsedRealtime();
/* 12 */                this.zzh.check(inputImage);
/* 17 */                Pair pairZza = this.zzf.zza(inputImage);
/* 23 */                List<Face> list4 = (List) pairZza.first;
/* 27 */                List<Face> list5 = (List) pairZza.second;
/* 29 */                if (list4 == null && list5 == null) {
/* 43 */                    throw new O1o01iO0liI0("No detector is enabled", 13);
                        }
/* 50 */                if (list4 == null) {
/* 52 */                    lII0I0I000I.I000II(list5);
/* 56 */                    arrayList2 = list5;
                        } else if (list5 == null) {
/* 67 */                    arrayList2 = list4;
                        } else {
/* 72 */                    HashSet hashSet = new HashSet();
/* 83 */                    for (Face face : list5) {
/* 95 */                        boolean z = false;
/* 100 */                       for (Face face2 : list4) {
/* 112 */                           if (face.getBoundingBox() == null || face2.getBoundingBox() == null) {
/* 224 */                               list3 = list5;
                                    } else {
/* 120 */                               Rect boundingBox = face.getBoundingBox();
/* 124 */                               Rect boundingBox2 = face2.getBoundingBox();
/* 132 */                               if (boundingBox.intersect(boundingBox2)) {
/* 144 */                                   list3 = list5;
/* 173 */                                   double dMin = (Math.min(boundingBox.bottom, boundingBox2.bottom) - Math.max(boundingBox.top, boundingBox2.top)) * (Math.min(boundingBox.right, boundingBox2.right) - Math.max(boundingBox.left, boundingBox2.left));
/* 213 */                                   if (dMin / ((((boundingBox.bottom - boundingBox.top) * (boundingBox.right - boundingBox.left)) + ((boundingBox2.bottom - boundingBox2.top) * (boundingBox2.right - boundingBox2.left))) - dMin) > 0.6d) {
/* 219 */                                       face2.zzb(face.zza());
/* 222 */                                       z = true;
                                            }
                                        }
                                    }
/* 226 */                           hashSet.add(face2);
/* 231 */                           list5 = list3;
                                }
/* 235 */                       List list6 = list5;
/* 237 */                       if (!z) {
/* 239 */                           hashSet.add(face);
                                }
/* 244 */                       list5 = list6;
                            }
/* 248 */                   list = list5;
/* 252 */                   arrayList = new ArrayList(hashSet);
/* 255 */                   list2 = list4;
/* 278 */                   zzg(lIIi1il.NO_ERROR, jElapsedRealtime, inputImage, list != null ? 0 : list.size(), list2 != null ? 0 : list2.size());
/* 284 */                   zza.set(false);
                        }
/* 58 */                list = list5;
/* 60 */                list2 = list4;
/* 61 */                arrayList = arrayList2;
/* 278 */               zzg(lIIi1il.NO_ERROR, jElapsedRealtime, inputImage, list != null ? 0 : list.size(), list2 != null ? 0 : list2.size());
/* 284 */               zza.set(false);
                    } catch (O1o01iO0liI0 e) {
/* 308 */               zzg(e.I00iOIl == 14 ? lIIi1il.MODEL_NOT_DOWNLOADED : lIIi1il.UNKNOWN_ERROR, jElapsedRealtime, inputImage, 0, 0);
/* 311 */               throw e;
                    } finally {
                    }
/* 288 */           return arrayList;
                }
            }
