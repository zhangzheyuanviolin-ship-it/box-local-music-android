            package com.google.mlkit.vision.segmentation.subject.internal;

            import android.content.Context;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.util.Log;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.CommonConvertUtils;
            import com.google.mlkit.vision.common.internal.ImageUtils;
            import com.google.mlkit.vision.segmentation.subject.Subject;
            import com.google.mlkit.vision.segmentation.subject.SubjectSegmentationResult;
            import com.google.mlkit.vision.segmentation.subject.SubjectSegmenterOptions;
            import java.lang.invoke.VarHandle;
            import java.nio.FloatBuffer;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.I00Ol00;
            import p000.IOiOol0;
            import p000.IioIii0IO;
            import p000.IlIII1l;
            import p000.Io1OIO1l0o;
            import p000.O1Il0Il;
            import p000.O1lli10oolO;
            import p000.O1o0111OI00;
            import p000.O1o01iO0liI0;
            import p000.OIOiOlIO01;
            import p000.OIiil10iiO;
            import p000.OllIllO1O;
            import p000.OloOI1o;
            import p000.iOOiO000;
            import p000.iOiloii0i1io;
            import p000.ii1loIOIll0;
            import p000.ilOlOIiO0;
            import p000.io1OllI;
            import p000.lII0I0I000I;
            import p000.lOl1i1ioi11;
            import p000.lOlO01O;
            import p000.lOo0lllo;
            import p000.li0O0iolIoOi;
            import p000.li0lO1OoO;
            import p000.li0lloo;
            import p000.lilIlIOl1;
            import p000.lliOIl0IO;
            import p000.llilOiOoOo1;
            import p000.lloOoloi;
            import p000.lloolOoi;
            import p000.loO1lOoI0oOi;
            import p000.loi1IOlio;
            import p000.loi1ool;
            import p000.loiOiI01lli;
            import p000.loliO1I0;
            import p000.lolloi;
            import p000.loloOIo0OIi0;
            import p000.loloio;
            import p000.loo01iI0;
            import p000.loo0iOl1l1i;
            import p000.loo11OllO;
            import p000.looIIoOl;
            import p000.o0IiOl;
            
            public final class zzj extends O1Il0Il {
                private static final IlIII1l[] zza = {OIiil10iiO.I000OiO};
                private static final ImageUtils zzb = ImageUtils.getInstance();
                private final Context zzc;
                private final SubjectSegmenterOptions zzd;
                private final loi1ool zze;
                private final loiOiI01lli zzf;
                private boolean zzg = true;
                private boolean zzh;
                private lolloi zzi;

                public zzj(O1o0111OI00 o1o0111OI00, SubjectSegmenterOptions subjectSegmenterOptions, loi1ool loi1oolVar, loiOiI01lli loioii01lli) {
/* 9 */             lII0I0I000I.I000O01llI0("MlKitContext can not be null", o1o0111OI00);
/* 14 */            lII0I0I000I.I000O01llI0("SubjectSegmenterOptions can not be null", subjectSegmenterOptions);
/* 21 */            this.zzc = o1o0111OI00.I00000oOI();
/* 23 */            this.zzd = subjectSegmenterOptions;
/* 25 */            this.zze = loi1oolVar;
/* 27 */            this.zzf = loioii01lli;
                }

                private final void zzg(final li0lO1OoO li0lo1ooo, long j, final boolean z, final InputImage inputImage, final loo11OllO loo11ollo) {
/* 5 */             final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
/* 26 */            this.zze.I0000Il00O(new loi1IOlio() {
                        @Override
                        public final loO1lOoI0oOi zza() {
/* 13 */                    return this.zza.zzc(jElapsedRealtime, li0lo1ooo, z, inputImage, loo11ollo);
                        }
                    }, li0lloo.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
/* 31 */            lloolOoi lloolooiZza = this.zzd.zza();
/* 35 */            Boolean boolValueOf = Boolean.valueOf(z);
/* 41 */            ilOlOIiO0 iloloiio0 = new ilOlOIiO0();
/* 44 */            iloloiio0.I00000oIO = li0lo1ooo;
/* 46 */            iloloiio0.I00000oOI = boolValueOf;
/* 48 */            iloloiio0.I0000Il00O = lloolooiZza;
/* 50 */            VarHandle.storeStoreFence();
/* 53 */            zzh zzhVar = new Object() {
                    };
/* 55 */            li0lloo li0llooVar = li0lloo.UNKNOWN_EVENT;
/* 59 */            loi1ool loi1oolVar = this.zze;
/* 62 */            OllIllO1O ollIllO1O = new OllIllO1O(3);
/* 65 */            ollIllO1O.I00iiO = loi1oolVar;
/* 67 */            ollIllO1O.I00iio = iloloiio0;
/* 69 */            ollIllO1O.I00iiI = jElapsedRealtime;
/* 71 */            VarHandle.storeStoreFence();
/* 75 */            io1OllI.I00000oIO(1, ollIllO1O);
/* 78 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 82 */            long j2 = jCurrentTimeMillis - jElapsedRealtime;
/* 84 */            loiOiI01lli loioii01lli = this.zzf;
/* 86 */            int i = li0lo1ooo.I00iOIl;
                    synchronized (loioii01lli) {
/* 89 */                AtomicLong atomicLong = loioii01lli.I00000oOI;
/* 91 */                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 103 */               if (atomicLong.get() != -1 && jElapsedRealtime2 - loioii01lli.I00000oOI.get() <= 1800000) {
/* 122 */                   return;
                        }
/* 153 */               o0IiOl o0iiolI0000Il00O = loioii01lli.I00000oIO.I0000Il00O(new OloOI1o(0, Arrays.asList(new O1lli10oolO(24336, i, 0, j2, jCurrentTimeMillis, null, null, 0, -1))));
/* 161 */               Io1OIO1l0o io1OIO1l0o = new Io1OIO1l0o(8);
/* 164 */               io1OIO1l0o.I00iiO = loioii01lli;
/* 166 */               io1OIO1l0o.I00iiI = jElapsedRealtime2;
/* 168 */               VarHandle.storeStoreFence();
/* 171 */               o0iiolI0000Il00O.I0000Il00O(io1OIO1l0o);
                    }
                }

                private static final FloatBuffer zzh(float[] fArr) {
/* 1 */             if (fArr == null) {
/* 3 */                 return null;
                    }
/* 6 */             FloatBuffer floatBufferAllocate = FloatBuffer.allocate(fArr.length);
/* 10 */            floatBufferAllocate.put(fArr);
/* 13 */            floatBufferAllocate.rewind();
/* 49 */            return floatBufferAllocate;
                }

                @Override
                public final synchronized void load() {
                    loo01iI0 lolooio0oii0;
                    try {
/* 2 */                 long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 6 */                 Context context = this.zzc;
/* 8 */                 IlIII1l[] ilIII1lArr = zza;
/* 15 */                if (!OIiil10iiO.I00000oIO(context, ilIII1lArr)) {
/* 19 */                    if (!this.zzh) {
/* 23 */                        OIiil10iiO.I0000O(this.zzc, ilIII1lArr);
/* 26 */                        this.zzh = true;
                            }
/* 34 */                    zzf(li0lO1OoO.OPTIONAL_MODULE_NOT_AVAILABLE, jElapsedRealtime);
/* 46 */                    throw new O1o01iO0liI0("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
                        }
                        try {
/* 49 */                    lolloi lolloiVarI00OI1 = this.zzi;
/* 51 */                    if (lolloiVarI00OI1 == null) {
/* 65 */                        IBinder iBinderI00000oOI = IioIii0IO.I0000Il00O(this.zzc, IioIii0IO.I00000oOI, "com.google.android.gms.mlkit_subject_segmentation").I00000oOI("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator");
/* 69 */                        int i = loloio.I000II;
/* 73 */                        if (iBinderI00000oOI == null) {
/* 75 */                            lolooio0oii0 = null;
                                } else {
/* 77 */                            IInterface iInterfaceQueryLocalInterface = iBinderI00000oOI.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
/* 93 */                            lolooio0oii0 = iInterfaceQueryLocalInterface instanceof loo01iI0 ? (loo01iI0) iInterfaceQueryLocalInterface : new loloOIo0OIi0(iBinderI00000oOI, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator", 8);
                                }
/* 140 */                       lolloiVarI00OI1 = ((loloOIo0OIi0) lolooio0oii0).I00OI1(OIOiOlIO01.I00O10llo(this.zzc), new looIIoOl(this.zzd.zzd(), this.zzd.zzc(), this.zzd.zze(), this.zzd.zzg(), this.zzd.zzf()));
/* 144 */                       this.zzi = lolloiVarI00OI1;
                            }
                            try {
/* 149 */                       lolloiVarI00OI1.getClass();
/* 152 */                       Parcel parcelObtain = Parcel.obtain();
/* 158 */                       parcelObtain.writeInterfaceToken(lolloiVarI00OI1.I000OOo1O);
/* 161 */                       lolloiVarI00OI1.I00O0o1oo(1, parcelObtain);
/* 166 */                       zzf(li0lO1OoO.NO_ERROR, jElapsedRealtime);
                            } catch (RemoteException e) {
/* 174 */                       zzf(li0lO1OoO.OPTIONAL_MODULE_INIT_ERROR, jElapsedRealtime);
/* 184 */                       throw new O1o01iO0liI0(13, e, "Failed to init module subject segmenter");
                            }
                        } catch (Exception e2) {
/* 187 */                   zzf(li0lO1OoO.OPTIONAL_MODULE_CREATE_ERROR, jElapsedRealtime);
/* 197 */                   throw new O1o01iO0liI0(13, e2, "Failed to load subject segmentation module");
                        }
                    } catch (Throwable th) {
/* 541 */               throw th;
                    }
                }

                @Override
                public final synchronized void release() {
                    try {
                        try {
/* 3 */                     lolloi lolloiVar = this.zzi;
/* 5 */                     if (lolloiVar != null) {
/* 7 */                         Parcel parcelObtain = Parcel.obtain();
/* 13 */                        parcelObtain.writeInterfaceToken(lolloiVar.I000OOo1O);
/* 17 */                        lolloiVar.I00O0o1oo(2, parcelObtain);
                            }
/* 20 */                    this.zzi = null;
                        } catch (RemoteException unused) {
/* 31 */                    Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
                        }
/* 37 */                this.zzg = true;
/* 45 */                this.zze.I0000Il00O(new loi1IOlio() {
                            @Override
                            public final loO1lOoI0oOi zza() {
/* 5 */                         IOiOol0 iOiOol0 = new IOiOol0(12);
/* 10 */                        iOiOol0.I00iio = li0O0iolIoOi.TYPE_THIN;
/* 15 */                        return new I00Ol00(iOiOol0, 0);
                            }
                        }, li0lloo.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE);
                    } finally {
/* 50 */                this.zzi = null;
                    }
                }

                public final loO1lOoI0oOi zzc(long j, li0lO1OoO li0lo1ooo, boolean z, InputImage inputImage, loo11OllO loo11ollo) {
                    ii1loIOIll0 ii1loioill0I000OiO;
/* 7 */             Long lValueOf = Long.valueOf(j & Long.MAX_VALUE);
/* 11 */            Boolean boolValueOf = Boolean.valueOf(z);
/* 17 */            lOo0lllo loo0lllo = new lOo0lllo();
/* 20 */            loo0lllo.I00000oIO = lValueOf;
/* 22 */            loo0lllo.I00000oOI = li0lo1ooo;
/* 24 */            loo0lllo.I0000Il00O = boolValueOf;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            int format = inputImage.getFormat();
/* 35 */            int mobileVisionImageSize = zzb.getMobileVisionImageSize(inputImage);
/* 74 */            lOl1i1ioi11 lol1i1ioi11 = format != -1 ? format != 35 ? format != 842094169 ? format != 16 ? format != 17 ? lOl1i1ioi11.UNKNOWN_FORMAT : lOl1i1ioi11.NV21 : lOl1i1ioi11.NV16 : lOl1i1ioi11.YV12 : lOl1i1ioi11.YUV_420_888 : lOl1i1ioi11.BITMAP;
/* 80 */            Integer numValueOf = Integer.valueOf(mobileVisionImageSize & Integer.MAX_VALUE);
/* 86 */            lOlO01O lolo01o = new lOlO01O();
/* 89 */            lolo01o.I00000oIO = lol1i1ioi11;
/* 91 */            lolo01o.I00000oOI = numValueOf;
/* 93 */            VarHandle.storeStoreFence();
/* 98 */            lloolOoi lloolooiZza = this.zzd.zza();
/* 103 */           ii1loIOIll0 ii1loioill0I000OiO2 = null;
/* 104 */           if (loo11ollo != null) {
/* 106 */               ArrayList arrayList = loo11ollo.I00iio;
/* 108 */               iOOiO000 iooio000 = iOiloii0i1io.I00ilI0I1;
/* 110 */               Object[] array = arrayList.toArray();
/* 114 */               int length = array.length;
/* 115 */               lilIlIOl1.I00000oIO(length, array);
/* 118 */               ii1loioill0I000OiO = iOiloii0i1io.I000OiO(length, array);
/* 122 */               ArrayList<loo0iOl1l1i> arrayList2 = loo11ollo.I00iOIl;
/* 128 */               if (!arrayList2.isEmpty()) {
/* 131 */                   Object[] objArrCopyOf = new Object[4];
/* 137 */                   int i = 0;
/* 142 */                   for (loo0iOl1l1i loo0iol1l1i : arrayList2) {
/* 153 */                       Integer numValueOf2 = Integer.valueOf(loo0iol1l1i.I00iiO & Integer.MAX_VALUE);
/* 160 */                       Integer numValueOf3 = Integer.valueOf(loo0iol1l1i.I00iio & Integer.MAX_VALUE);
/* 167 */                       Integer numValueOf4 = Integer.valueOf(loo0iol1l1i.I00ilI0I1 & Integer.MAX_VALUE);
/* 174 */                       Integer numValueOf5 = Integer.valueOf(loo0iol1l1i.I00ilO0 & Integer.MAX_VALUE);
/* 180 */                       lloOoloi lloooloi = new lloOoloi();
/* 183 */                       lloooloi.I00000oIO = numValueOf2;
/* 185 */                       lloooloi.I00000oOI = numValueOf3;
/* 187 */                       lloooloi.I0000Il00O = numValueOf4;
/* 189 */                       lloooloi.I0000O = numValueOf5;
/* 191 */                       VarHandle.storeStoreFence();
/* 194 */                       int i2 = i + 1;
/* 196 */                       int length2 = objArrCopyOf.length;
/* 197 */                       if (length2 < i2) {
/* 202 */                           int i3 = length2 + (length2 >> 1) + 1;
/* 204 */                           if (i3 < i2) {
/* 206 */                               int iHighestOneBit = Integer.highestOneBit(i);
/* 210 */                               i3 = iHighestOneBit + iHighestOneBit;
                                    }
/* 211 */                           if (i3 < 0) {
/* 213 */                               i3 = Integer.MAX_VALUE;
                                    }
/* 214 */                           objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                                }
/* 218 */                       objArrCopyOf[i] = lloooloi;
/* 220 */                       i = i2;
                            }
/* 222 */                   ii1loioill0I000OiO2 = iOiloii0i1io.I000OiO(i, objArrCopyOf);
                        }
                    } else {
/* 227 */               ii1loioill0I000OiO = null;
                    }
/* 232 */           IOiOol0 iOiOol0 = new IOiOol0(12);
/* 237 */           iOiOol0.I00iio = li0O0iolIoOi.TYPE_THIN;
/* 241 */           lliOIl0IO llioil0io = new lliOIl0IO();
/* 244 */           llioil0io.I00000oIO = loo0lllo;
/* 246 */           llioil0io.I00000oOI = lolo01o;
/* 248 */           llioil0io.I0000Il00O = lloolooiZza;
/* 250 */           llioil0io.I0000O = ii1loioill0I000OiO2;
/* 252 */           llioil0io.I0000oI00 = ii1loioill0I000OiO;
/* 254 */           VarHandle.storeStoreFence();
/* 257 */           iOiOol0.I00io1l = llioil0io;
/* 261 */           return new I00Ol00(iOiOol0, 0);
                }

                public final loO1lOoI0oOi zzd(li0lO1OoO li0lo1ooo, long j) {
/* 5 */             IOiOol0 iOiOol0 = new IOiOol0(12);
/* 10 */            iOiOol0.I00iio = li0O0iolIoOi.TYPE_THIN;
/* 14 */            lloolOoi lloolooiZza = this.zzd.zza();
/* 29 */            Long lValueOf = Long.valueOf(Long.MAX_VALUE & (SystemClock.elapsedRealtime() - j));
/* 35 */            llilOiOoOo1 lliloioooo1 = new llilOiOoOo1();
/* 38 */            lliloioooo1.I00000oIO = li0lo1ooo;
/* 40 */            lliloioooo1.I00000oOI = lValueOf;
/* 42 */            lliloioooo1.I0000Il00O = lloolooiZza;
/* 44 */            VarHandle.storeStoreFence();
/* 47 */            iOiOol0.I00ilO0 = lliloioooo1;
/* 52 */            return new I00Ol00(iOiOol0, 0);
                }

                @Override
                public final synchronized SubjectSegmentationResult run(InputImage inputImage) {
                    loo11OllO loo11olloI00OI1;
                    ArrayList arrayList;
                    try {
/* 6 */                 lII0I0I000I.I000O01llI0("Input image can not be null", inputImage);
/* 9 */                 long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 13 */                lolloi lolloiVar = this.zzi;
/* 15 */                lII0I0I000I.I000II(lolloiVar);
                        try {
/* 55 */                    loo11olloI00OI1 = lolloiVar.I00OI1(ImageUtils.getInstance().getImageDataWrapper(inputImage), new loliO1I0(inputImage.getFormat(), inputImage.getWidth(), inputImage.getHeight(), SystemClock.elapsedRealtime(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees())));
/* 61 */                    arrayList = new ArrayList();
/* 70 */                    if (this.zzd.zze()) {
/* 82 */                        for (loo0iOl1l1i loo0iol1l1i : loo11olloI00OI1.I00iOIl) {
/* 111 */                           arrayList.add(new Subject(zzh(loo0iol1l1i.I00iOIl), loo0iol1l1i.I00iiI, loo0iol1l1i.I00iiO, loo0iol1l1i.I00iio, loo0iol1l1i.I00ilI0I1, loo0iol1l1i.I00ilO0));
                                }
                            }
/* 124 */                   zzg(li0lO1OoO.NO_ERROR, jElapsedRealtime, this.zzg, inputImage, loo11olloI00OI1);
/* 128 */                   this.zzg = false;
                        } catch (RemoteException e) {
/* 153 */                   zzg(li0lO1OoO.OPTIONAL_MODULE_INFERENCE_ERROR, jElapsedRealtime, this.zzg, inputImage, null);
/* 165 */                   throw new O1o01iO0liI0(13, e, "Failed to run thin subject segmenter.");
                        }
                    } catch (Throwable th) {
/* 186 */               throw th;
                    }
/* 140 */           return new SubjectSegmentationResult(arrayList, zzh(loo11olloI00OI1.I00iiI), loo11olloI00OI1.I00iiO);
                }

                public final void zzf(final li0lO1OoO li0lo1ooo, final long j) {
/* 10 */            this.zze.I0000Il00O(new loi1IOlio() {
                        @Override
                        public final loO1lOoI0oOi zza() {
/* 7 */                     return this.zza.zzd(li0lo1ooo, j);
                        }
                    }, li0lloo.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
                }
            }
