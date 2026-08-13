            package com.google.mlkit.vision.label.defaults.internal;

            import android.content.Context;
            import android.os.SystemClock;
            import android.util.Log;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.CommonConvertUtils;
            import com.google.mlkit.vision.common.internal.ImageUtils;
            import com.google.mlkit.vision.common.internal.VisionImageMetadataParcel;
            import com.google.mlkit.vision.label.ImageLabel;
            import com.google.mlkit.vision.label.defaults.ImageLabelerOptions;
            import com.google.mlkit.vision.vkp.PipelineManager;
            import com.google.mlkit.vision.vkp.VkpImageLabel;
            import com.google.mlkit.vision.vkp.VkpImageLabelerOptions;
            import com.google.mlkit.vision.vkp.VkpResults;
            import com.google.mlkit.vision.vkp.VkpStatus;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.I00Ol00;
            import p000.I0Oi111ii;
            import p000.Io1OIO1l0o;
            import p000.O1Il0Il;
            import p000.O1lli10oolO;
            import p000.O1o0111OI00;
            import p000.OllIllO1O;
            import p000.OloOI1o;
            import p000.OloOII1ioI1l;
            import p000.iIoilOlo;
            import p000.iO10llOoIiI0;
            import p000.ii0iO1l;
            import p000.il1ilI1l;
            import p000.io1OllI;
            import p000.lII0I0I000I;
            import p000.lOii01OOi0;
            import p000.lOiiiIli;
            import p000.lOio11O;
            import p000.lOlOili;
            import p000.lOolIoOl0;
            import p000.lOolOi;
            import p000.lOoo11;
            import p000.lil1i1iOi;
            import p000.ll0I0l1O1OOl;
            import p000.ll0il0ioIl;
            import p000.ll101l00l1;
            import p000.lliloI1O;
            import p000.lll0io1I;
            import p000.loII0oIOI1i1;
            import p000.loOiOoIi;
            import p000.loOoI0llOO0I;
            import p000.loiio1IIlIil;
            import p000.o0IiOl;
            
            public final class zze extends O1Il0Il {
                private static final ImageUtils zzb = ImageUtils.getInstance();
                final ll101l00l1 zza;
                private final O1o0111OI00 zzc;
                private final ImageLabelerOptions zzd;
                private final loOiOoIi zze;
                private final loOoI0llOO0I zzf;
                private PipelineManager zzg;

                public zze(O1o0111OI00 o1o0111OI00, ImageLabelerOptions imageLabelerOptions) {
/* 1 */             loOiOoIi looiooiiI00000oIO = loiio1IIlIil.I00000oIO();
/* 10 */            lII0I0I000I.I000O01llI0("Context can not be null", o1o0111OI00);
/* 15 */            lII0I0I000I.I000O01llI0("ImageLabelerOptions can not be null", imageLabelerOptions);
/* 18 */            this.zzc = o1o0111OI00;
/* 20 */            this.zzd = imageLabelerOptions;
/* 22 */            this.zze = looiooiiI00000oIO;
/* 28 */            Float fValueOf = Float.valueOf(imageLabelerOptions.getConfidenceThreshold());
/* 34 */            ll101l00l1 ll101l00l1Var = new ll101l00l1();
/* 37 */            ll101l00l1Var.I00000oIO = fValueOf;
/* 39 */            VarHandle.storeStoreFence();
/* 42 */            this.zza = ll101l00l1Var;
/* 44 */            Context contextI00000oOI = o1o0111OI00.I00000oOI();
/* 50 */            loOoI0llOO0I loooi0lloo0i = new loOoI0llOO0I();
/* 60 */            loooi0lloo0i.I00000oOI = new AtomicLong(-1L);
/* 64 */            OloOII1ioI1l oloOII1ioI1l = new OloOII1ioI1l();
/* 69 */            oloOII1ioI1l.I00000oOI = "mlkit:vision";
/* 71 */            VarHandle.storeStoreFence();
/* 78 */            loooi0lloo0i.I00000oIO = lOio11O.I00000oIO(contextI00000oOI, oloOII1ioI1l);
/* 80 */            VarHandle.storeStoreFence();
/* 83 */            this.zzf = loooi0lloo0i;
                }

                private static iO10llOoIiI0 zze(VkpStatus vkpStatus) {
                    lliloI1O lliloi1o;
/* 11 */            ArrayList arrayList = new ArrayList(vkpStatus.getErrors().size());
/* 26 */            for (VkpStatus.VkpError vkpError : vkpStatus.getErrors()) {
/* 34 */                int errorSpaceNumber = vkpError.getErrorSpaceNumber();
/* 38 */                lliloI1O[] lliloi1oArrValues = lliloI1O.values();
/* 42 */                int length = lliloi1oArrValues.length;
/* 43 */                int i = 0;
                        while (true) {
/* 44 */                    if (i >= length) {
/* 56 */                        lliloi1o = lliloI1O.UNKNOWN;
                                break;
                            }
/* 46 */                    lliloi1o = lliloi1oArrValues[i];
/* 50 */                    if (lliloi1o.I00iOIl == errorSpaceNumber) {
                                break;
                            }
/* 53 */                    i++;
                        }
/* 62 */                Integer numValueOf = Integer.valueOf(vkpError.getErrorCode());
/* 68 */                lll0io1I lll0io1i = new lll0io1I();
/* 71 */                lll0io1i.I00000oIO = lliloi1o;
/* 73 */                lll0io1i.I00000oOI = numValueOf;
/* 75 */                VarHandle.storeStoreFence();
/* 78 */                arrayList.add(lll0io1i);
                    }
/* 82 */            iIoilOlo iioilolo = iO10llOoIiI0.I00lll10;
/* 84 */            Object[] array = arrayList.toArray();
/* 88 */            int length2 = array.length;
/* 89 */            lil1i1iOi.I00000oIO(length2, array);
/* 92 */            return iO10llOoIiI0.I001iOo1i0O(length2, array);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [com.google.mlkit.vision.label.defaults.internal.zzc] */
                private final void zzf(final lOolOi looloi, final VkpStatus vkpStatus, final InputImage inputImage, final boolean z, long j) {
/* 5 */             final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
/* 19 */            ?? r0 = new Object() {
                        public final loII0oIOI1i1 zza() {
/* 13 */                    return this.zza.zzc(jElapsedRealtime, looloi, vkpStatus, z, inputImage);
                        }
                    };
/* 22 */            loOiOoIi looiooii = this.zze;
/* 24 */            lOoo11 looo11 = lOoo11.ON_DEVICE_IMAGE_LABEL_DETECT;
/* 26 */            looiooii.getClass();
/* 29 */            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 37 */            if (looiooii.I0000O(looo11, jElapsedRealtime2)) {
/* 46 */                looiooii.I000OOo1O.put(looo11, Long.valueOf(jElapsedRealtime2));
/* 57 */                looiooii.I00000oOI(r0.zza(), looo11, looiooii.I0000Il00O());
                    }
/* 60 */            ll101l00l1 ll101l00l1Var = this.zza;
/* 62 */            Boolean boolValueOf = Boolean.valueOf(z);
/* 68 */            il1ilI1l il1ili1l = new il1ilI1l();
/* 71 */            il1ili1l.I00000oIO = looloi;
/* 73 */            il1ili1l.I00000oOI = boolValueOf;
/* 75 */            il1ili1l.I0000Il00O = ll101l00l1Var;
/* 77 */            VarHandle.storeStoreFence();
/* 82 */            new Object() {
                    };
/* 85 */            lOoo11 looo112 = lOoo11.UNKNOWN_EVENT;
/* 89 */            loOiOoIi looiooii2 = this.zze;
/* 92 */            OllIllO1O ollIllO1O = new OllIllO1O(2);
/* 95 */            ollIllO1O.I00iiO = looiooii2;
/* 97 */            ollIllO1O.I00iio = il1ili1l;
/* 99 */            ollIllO1O.I00iiI = jElapsedRealtime;
/* 101 */           VarHandle.storeStoreFence();
/* 105 */           io1OllI.I00000oIO(1, ollIllO1O);
/* 108 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 112 */           long j2 = jCurrentTimeMillis - jElapsedRealtime;
/* 114 */           int i = looloi.I00iOIl;
/* 116 */           loOoI0llOO0I loooi0lloo0i = this.zzf;
                    synchronized (loooi0lloo0i) {
/* 119 */               AtomicLong atomicLong = loooi0lloo0i.I00000oOI;
/* 121 */               long jElapsedRealtime3 = SystemClock.elapsedRealtime();
/* 133 */               if (atomicLong.get() != -1 && jElapsedRealtime3 - loooi0lloo0i.I00000oOI.get() <= 1800000) {
/* 152 */                   return;
                        }
/* 183 */               o0IiOl o0iiolI0000Il00O = loooi0lloo0i.I00000oIO.I0000Il00O(new OloOI1o(0, Arrays.asList(new O1lli10oolO(24307, i, 0, j2, jCurrentTimeMillis, null, null, 0, -1))));
/* 190 */               Io1OIO1l0o io1OIO1l0o = new Io1OIO1l0o(6);
/* 193 */               io1OIO1l0o.I00iiO = loooi0lloo0i;
/* 195 */               io1OIO1l0o.I00iiI = jElapsedRealtime3;
/* 197 */               VarHandle.storeStoreFence();
/* 200 */               o0iiolI0000Il00O.I0000Il00O(io1OIO1l0o);
                    }
                }

                private final void zzg(lOolOi looloi, VkpStatus vkpStatus, long j) {
/* 5 */             I0Oi111ii i0Oi111ii = new I0Oi111ii(16);
/* 10 */            i0Oi111ii.I00iio = lOolIoOl0.TYPE_THICK;
/* 12 */            ll101l00l1 ll101l00l1Var = this.zza;
/* 14 */            iIoilOlo iioilolo = iO10llOoIiI0.I00lll10;
/* 16 */            Object[] objArr = {looloi};
/* 21 */            lil1i1iOi.I00000oIO(1, objArr);
/* 24 */            ii0iO1l ii0io1lI001iOo1i0O = iO10llOoIiI0.I001iOo1i0O(1, objArr);
/* 28 */            iO10llOoIiI0 io10llooiii0Zze = zze(vkpStatus);
/* 38 */            Long lValueOf = Long.valueOf(j & Long.MAX_VALUE);
/* 44 */            ll0il0ioIl ll0il0ioil = new ll0il0ioIl();
/* 47 */            ll0il0ioil.I00000oIO = ll101l00l1Var;
/* 49 */            ll0il0ioil.I00000oOI = ii0io1lI001iOo1i0O;
/* 51 */            ll0il0ioil.I0000Il00O = lValueOf;
/* 53 */            ll0il0ioil.I0000O = io10llooiii0Zze;
/* 55 */            VarHandle.storeStoreFence();
/* 58 */            i0Oi111ii.I00ilI0I1 = ll0il0ioil;
/* 63 */            I00Ol00 i00Ol00 = new I00Ol00(i0Oi111ii, 0, (byte) 0);
/* 66 */            loOiOoIi looiooii = this.zze;
/* 74 */            looiooii.I00000oOI(i00Ol00, lOoo11.ON_DEVICE_IMAGE_LABEL_LOAD, looiooii.I0000Il00O());
                }

                @Override
                public final synchronized void load() {
                    try {
/* 2 */                 long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 6 */                 PipelineManager pipelineManagerNewInstanceForImageLabeling = this.zzg;
/* 8 */                 if (pipelineManagerNewInstanceForImageLabeling == null) {
/* 28 */                    pipelineManagerNewInstanceForImageLabeling = PipelineManager.newInstanceForImageLabeling(this.zzc.I00000oOI(), VkpImageLabelerOptions.from(this.zzd.getConfidenceThreshold(), -1, null));
/* 32 */                    this.zzg = pipelineManagerNewInstanceForImageLabeling;
                        }
/* 37 */                VkpStatus vkpStatusStart = pipelineManagerNewInstanceForImageLabeling.start();
/* 45 */                if (vkpStatusStart.isSuccess()) {
/* 69 */                    zzg(lOolOi.NO_ERROR, vkpStatusStart, SystemClock.elapsedRealtime() - jElapsedRealtime);
                        } else {
/* 54 */                    zzg(lOolOi.NO_VALID_MODEL, vkpStatusStart, SystemClock.elapsedRealtime() - jElapsedRealtime);
/* 57 */                    vkpStatusStart.throwsMlKitExceptionIfPresent();
                        }
                    } catch (Throwable th) {
/* 113 */               throw th;
                    }
                }

                @Override
                public final synchronized void release() {
                    try {
/* 2 */                 PipelineManager pipelineManager = this.zzg;
/* 4 */                 if (pipelineManager != null) {
/* 6 */                     pipelineManager.stop();
                        }
/* 12 */                loOiOoIi looiooii = this.zze;
/* 18 */                I0Oi111ii i0Oi111ii = new I0Oi111ii(16);
/* 23 */                i0Oi111ii.I00iio = lOolIoOl0.TYPE_THICK;
/* 37 */                looiooii.I00000oOI(new I00Ol00(i0Oi111ii, 0, (byte) 0), lOoo11.ON_DEVICE_IMAGE_LABEL_CLOSE, looiooii.I0000Il00O());
                    } catch (Throwable th) {
/* 113 */               throw th;
                    }
                }

                public final loII0oIOI1i1 zzc(long j, lOolOi looloi, VkpStatus vkpStatus, boolean z, InputImage inputImage) {
/* 5 */             I0Oi111ii i0Oi111ii = new I0Oi111ii(16);
/* 10 */            i0Oi111ii.I00iio = lOolIoOl0.TYPE_THICK;
/* 18 */            Long lValueOf = Long.valueOf(j & Long.MAX_VALUE);
/* 22 */            iO10llOoIiI0 io10llooiii0Zze = zze(vkpStatus);
/* 26 */            Boolean boolValueOf = Boolean.valueOf(z);
/* 32 */            lOlOili loloili = new lOlOili();
/* 35 */            loloili.I00000oIO = lValueOf;
/* 37 */            loloili.I00000oOI = looloi;
/* 39 */            loloili.I0000Il00O = boolValueOf;
/* 41 */            loloili.I0000O = io10llooiii0Zze;
/* 43 */            VarHandle.storeStoreFence();
/* 46 */            ImageUtils imageUtils = zzb;
/* 48 */            int mobileVisionImageFormat = imageUtils.getMobileVisionImageFormat(inputImage);
/* 52 */            int mobileVisionImageSize = imageUtils.getMobileVisionImageSize(inputImage);
/* 89 */            lOii01OOi0 loii01ooi0 = mobileVisionImageFormat != -1 ? mobileVisionImageFormat != 35 ? mobileVisionImageFormat != 842094169 ? mobileVisionImageFormat != 16 ? mobileVisionImageFormat != 17 ? lOii01OOi0.UNKNOWN_FORMAT : lOii01OOi0.NV21 : lOii01OOi0.NV16 : lOii01OOi0.YV12 : lOii01OOi0.YUV_420_888 : lOii01OOi0.BITMAP;
/* 95 */            Integer numValueOf = Integer.valueOf(mobileVisionImageSize & Integer.MAX_VALUE);
/* 101 */           lOiiiIli loiiiili = new lOiiiIli();
/* 104 */           loiiiili.I00000oIO = loii01ooi0;
/* 106 */           loiiiili.I00000oOI = numValueOf;
/* 108 */           VarHandle.storeStoreFence();
/* 111 */           ll101l00l1 ll101l00l1Var = this.zza;
/* 115 */           ll0I0l1O1OOl ll0i0l1o1ool = new ll0I0l1O1OOl();
/* 118 */           ll0i0l1o1ool.I00000oIO = loloili;
/* 120 */           ll0i0l1o1ool.I00000oOI = ll101l00l1Var;
/* 122 */           ll0i0l1o1ool.I0000Il00O = loiiiili;
/* 124 */           VarHandle.storeStoreFence();
/* 127 */           i0Oi111ii.I00ilO0 = ll0i0l1o1ool;
/* 132 */           return new I00Ol00(i0Oi111ii, 0, (byte) 0);
                }

                @Override
                public final synchronized List run(InputImage inputImage) {
                    ArrayList arrayList;
/* 6 */             lII0I0I000I.I000O01llI0("Mobile vision input can not be null", inputImage);
/* 9 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 13 */            PipelineManager pipelineManager = this.zzg;
/* 15 */            if (pipelineManager == null) {
/* 21 */                Log.e("BundledImageLabelerTask", "Image labeler is not initialized.");
/* 26 */                return new ArrayList();
                    }
/* 60 */            VkpResults vkpResultsProcess = pipelineManager.process(inputImage, new VisionImageMetadataParcel(inputImage.getWidth(), inputImage.getHeight(), 0, SystemClock.elapsedRealtime(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees())));
/* 64 */            VkpStatus status = vkpResultsProcess.getStatus();
/* 72 */            if (!status.isSuccess()) {
/* 81 */                zzf(lOolOi.UNKNOWN_ERROR, status, inputImage, vkpResultsProcess.isFromColdCall(), jElapsedRealtime);
/* 84 */                status.throwsMlKitExceptionIfPresent();
/* 89 */                return new ArrayList();
                    }
/* 94 */            List<VkpImageLabel> imageLabels = vkpResultsProcess.getImageLabels();
/* 102 */           if (imageLabels.isEmpty()) {
/* 106 */               arrayList = new ArrayList();
                    } else {
/* 113 */               ArrayList arrayList2 = new ArrayList();
/* 124 */               for (VkpImageLabel vkpImageLabel : imageLabels) {
/* 153 */                   arrayList2.add(new ImageLabel(vkpImageLabel.getText(), vkpImageLabel.getScore(), vkpImageLabel.getIndex(), vkpImageLabel.getClassName()));
                        }
/* 157 */               arrayList = arrayList2;
                    }
/* 167 */           zzf(lOolOi.NO_ERROR, status, inputImage, vkpResultsProcess.isFromColdCall(), jElapsedRealtime);
/* 171 */           return arrayList;
                }
            }
