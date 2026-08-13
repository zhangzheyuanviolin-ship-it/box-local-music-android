            package com.google.mlkit.vision.pose.internal;

            import android.content.Context;
            import android.os.Build;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.util.Log;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.ImageConvertUtils;
            import com.google.mlkit.vision.common.internal.ImageUtils;
            import com.google.mlkit.vision.mediapipe.MediaPipeGraphRunner;
            import com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig;
            import com.google.mlkit.vision.mediapipe.MediaPipeInput;
            import com.google.mlkit.vision.mediapipe.MediaPipeInputFactory;
            import com.google.mlkit.vision.mediapipe.pose.PoseHolder;
            import com.google.mlkit.vision.mediapipe.pose.PoseHolderConverter;
            import com.google.mlkit.vision.mediapipe.utils.ImageConvertNativeUtils;
            import com.google.mlkit.vision.pose.Pose;
            import com.google.mlkit.vision.pose.PoseDetectorOptionsBase;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.IOiOol0;
            import p000.IlIi0I0;
            import p000.Io1OIO1l0o;
            import p000.O0oO1lOOo1;
            import p000.O1Il0Il;
            import p000.O1lli10oolO;
            import p000.O1o0111OI00;
            import p000.O1o01iO0liI0;
            import p000.Oioo1I0o;
            import p000.OllIllO1O;
            import p000.OloIlI0ll;
            import p000.OloOI1o;
            import p000.OloOII1ioI1l;
            import p000.Oo1ooo0ollI;
            import p000.ii01IlIiIo;
            import p000.iiiiIIllo;
            import p000.io1IlOiOOo;
            import p000.io1OllI;
            import p000.lII0I0I000I;
            import p000.lOii1o;
            import p000.lOio0o;
            import p000.lOio11O;
            import p000.liOliIO;
            import p000.lii10I010O0o;
            import p000.lil0ooilloO;
            import p000.lioi0il00i;
            import p000.lioii11l01oI;
            import p000.lioiiIOoil;
            import p000.lo0O0OO1i;
            import p000.lo1I1l1Oo1I1;
            import p000.o01l1ioOo0;
            import p000.o01oIol1O;
            import p000.o0IIIi01O0o;
            import p000.o0IiIio1Ii1i;
            import p000.o0IiOl;
            import p000.o0IlO11iI0;
            import p000.o0O011i1;
            import p000.o0OIl1o1i0Oi;
            import p000.o0OOlo;
            import p000.o0Oll1li;
            import p000.o0ilO10O;
            import p000.o0l101oi1li1;
            import p000.o0llIi;
            
            public final class zzh extends O1Il0Il {
                private static final ImageUtils zzc = ImageUtils.getInstance();
                final String zza;
                final String zzb;
                private final PoseDetectorOptionsBase zzd;
                private final o0OIl1o1i0Oi zze;
                private final o0OOlo zzf;
                private final O1o0111OI00 zzg;
                private final o0ilO10O zzh;
                private boolean zzi = true;
                private PoseDetectorOptionsBase zzj;
                private lo1I1l1Oo1I1 zzk;
                private long zzl;
                private long zzm;
                private MediaPipeGraphRunner zzn;
                private boolean zzo;
                private boolean zzp;
                private boolean zzq;
                private final zzg zzr;

                /* JADX WARN: Type inference failed for: r10v1, types: [com.google.mlkit.vision.pose.internal.zzg] */
                public zzh(O1o0111OI00 o1o0111OI00, PoseDetectorOptionsBase poseDetectorOptionsBase, o0OIl1o1i0Oi o0oil1o1i0oi) {
                    o0ilO10O o0ilo10o;
                    o01l1ioOo0 o01l1iooo0;
/* 9 */             lII0I0I000I.I000O01llI0("MlKitContext can not be null", o1o0111OI00);
/* 14 */            lII0I0I000I.I000O01llI0("PoseDetectorOptionsBase can not be null", poseDetectorOptionsBase);
/* 17 */            this.zze = o0oil1o1i0oi;
/* 24 */            this.zzr = new Object() {
                    };
/* 26 */            Context contextI00000oOI = o1o0111OI00.I00000oOI();
/* 32 */            o0OOlo o0oolo = new o0OOlo();
/* 42 */            o0oolo.I00000oOI = new AtomicLong(-1L);
/* 48 */            OloOII1ioI1l oloOII1ioI1l = new OloOII1ioI1l();
/* 51 */            oloOII1ioI1l.I00000oOI = "mlkit:vision";
/* 53 */            VarHandle.storeStoreFence();
/* 60 */            o0oolo.I00000oIO = lOio11O.I00000oIO(contextI00000oOI, oloOII1ioI1l);
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            this.zzf = o0oolo;
/* 67 */            this.zzg = o1o0111OI00;
/* 69 */            this.zzd = poseDetectorOptionsBase;
/* 71 */            this.zzj = poseDetectorOptionsBase;
/* 77 */            this.zzk = poseDetectorOptionsBase.zzb();
/* 85 */            this.zza = this.zzj.zzf();
/* 93 */            this.zzb = this.zzj.zze();
/* 95 */            Context contextI00000oOI2 = o1o0111OI00.I00000oOI();
/* 99 */            ExecutorService executorService = o0ilO10O.I000iOII;
                    synchronized (o0ilO10O.class) {
/* 104 */               o0ilo10o = o0ilO10O.I000o00OoI0I;
/* 106 */               if (o0ilo10o == null) {
                            synchronized (o01l1ioOo0.class) {
/* 113 */                       o01l1iooo0 = o01l1ioOo0.I00ilI0I1;
/* 115 */                       if (o01l1iooo0 == null) {
/* 121 */                           o01l1iooo0 = new o01l1ioOo0(contextI00000oOI2, o0IIIi01O0o.I00000oIO);
/* 124 */                           o01l1ioOo0.I00ilI0I1 = o01l1iooo0;
                                }
                            }
/* 154 */                   o0OIl1o1i0Oi o0oil1o1i0oi2 = new o0OIl1o1i0Oi(contextI00000oOI2, new Oioo1I0o(contextI00000oOI2), new o0O011i1(contextI00000oOI2, o0IiIio1Ii1i.I00000oIO("shared-remote-config").I00000oIO()), "shared-remote-config");
/* 157 */                   o0l101oi1li1 o0l101oi1li1Var = new o0l101oi1li1();
/* 160 */                   o0l101oi1li1Var.I00iOIl = o0oil1o1i0oi2;
/* 164 */                   o0ilo10o = new o0ilO10O(contextI00000oOI2, o01l1iooo0, o0l101oi1li1Var, o0IIIi01O0o.I00000oIO);
/* 167 */                   o0ilO10O.I000o00OoI0I = o0ilo10o;
                        }
                    }
/* 175 */           this.zzh = o0ilo10o;
                }

                private final boolean zzf(String str) {
                    String str2;
/* 1 */             o0ilO10O o0ilo10o = this.zzh;
/* 3 */             iiiiIIllo iiiiiillo = o0ilo10o.I0000oI00;
/* 5 */             if (iiiiiillo == null || !iiiiiillo.containsKey(str)) {
                        synchronized (o0ilo10o.I000II) {
/* 30 */                    str2 = (String) o0ilo10o.I000II.get(str);
                        }
                    } else {
/* 18 */                str2 = (String) iiiiiillo.get(str);
                    }
/* 37 */            boolean z = true;
/* 38 */            if (!TextUtils.isEmpty(str2) && !Boolean.parseBoolean(str2)) {
/* 47 */                z = false;
                    }
/* 55 */            if (Log.isLoggable("PoseTaskWithRes", 4)) {
/* 79 */                Log.i("PoseTaskWithRes", str + " = " + z);
                    }
/* 82 */            return z;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void load() {
                    boolean z;
                    boolean zEquals;
/* 7 */             this.zzl = SystemClock.elapsedRealtime();
/* 11 */            this.zzm = 0L;
/* 15 */            if (this.zzn != null) {
/* 2840 */              return;
                    }
/* 19 */            o0ilO10O o0ilo10o = this.zzh;
/* 21 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 25 */            Locale locale = Locale.US;
/* 70 */            String str = "pose-detection-common:".concat(String.valueOf(O0oO1lOOo1.I0000Il00O.I00000oIO("pose-detection-common"))) + "&android_sdk=" + Build.VERSION.SDK_INT + "&hardware=" + Build.HARDWARE;
/* 74 */            o0ilo10o.getClass();
/* 81 */            if (!TextUtils.isEmpty(str)) {
/* 84 */                o0ilo10o.I000OiO = str;
                    }
                    try {
/* 92 */                lOio0o.I00000oIO(this.zzh.I00000oIO());
                    } catch (InterruptedException | ExecutionException e) {
/* 111 */               Log.e("PoseTaskWithRes", "remoteConfig.loadAndActivate failed: ".concat(String.valueOf(e.getLocalizedMessage())));
                    }
/* 120 */           this.zzo = zzf("vision_pose_detection_enable_acceleration");
/* 128 */           this.zzp = zzf("vision_pose_detection_enable_acceleration_gpu");
/* 130 */           o0ilO10O o0ilo10o2 = this.zzh;
/* 132 */           long j = o0ilO10O.I000lI;
/* 134 */           o0ilo10o2.getClass();
/* 143 */           Date date = new Date(System.currentTimeMillis());
/* 148 */           o01oIol1O o01oiol1o = new o01oIol1O();
/* 151 */           o01oiol1o.I0000Il00O();
/* 156 */           OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 162 */           Oo1ooo0ollI oo1ooo0ollI = new Oo1ooo0ollI(5);
/* 165 */           oo1ooo0ollI.I00iiO = o0ilo10o2;
/* 167 */           oo1ooo0ollI.I00iio = date;
/* 169 */           oo1ooo0ollI.I00iiI = j;
/* 171 */           oo1ooo0ollI.I00ilI0I1 = o01oiol1o;
/* 173 */           oo1ooo0ollI.I00ilO0 = oloIlI0ll;
/* 175 */           VarHandle.storeStoreFence();
/* 180 */           o0ilo10o2.I00000oOI.execute(oo1ooo0ollI);
/* 189 */           if (this.zzo) {
/* 191 */               o0llIi.I00II0oii1o();
/* 194 */               String str2 = Build.HARDWARE;
/* 202 */               if (!"oriole".equals(str2) && !"raven".equals(str2)) {
/* 213 */                   o0llIi.I00II0oii1o();
/* 220 */                   if (!Boolean.parseBoolean("")) {
/* 223 */                       z = false;
                            }
                        }
/* 225 */               z = true;
                    }
/* 226 */           if (z || !this.zzp) {
/* 273 */               zEquals = false;
                    } else {
/* 238 */               if (this.zzj.getRunConfigName() == null) {
/* 250 */                   PoseDetectorOptionsBase poseDetectorOptionsBase = (PoseDetectorOptionsBase) zzd.zzc().getBestConfiguredOptions(this.zzj);
/* 252 */                   this.zzj = poseDetectorOptionsBase;
/* 258 */                   this.zzk = poseDetectorOptionsBase.zzb();
                        }
/* 268 */               zEquals = "cpu-gpu-opencl".equals(this.zzj.getRunConfigName());
                    }
/* 279 */           this.zzq = z || zEquals;
/* 288 */           String str3 = z ? "_nnapi" : zEquals ? "_gpu" : "";
/* 297 */           if (Log.isLoggable("PoseTaskWithRes", 4)) {
/* 305 */               Log.i("PoseTaskWithRes", "graphVariant = ".concat(str3));
                    }
/* 312 */           String strI000lI = IlIi0I0.I000lI("mlkit_pose/pose_tracking_graph", str3, ".binarypb");
/* 318 */           String strI000lI2 = IlIi0I0.I000lI("mlkit_pose/pose_non_tracking_graph", str3, ".binarypb");
/* 324 */           HashMap map = new HashMap();
/* 331 */           map.put("$POSE_DETECTOR_MODEL", this.zza);
/* 338 */           map.put("$POSE_LANDMARKS_MODEL", this.zzb);
/* 343 */           HashMap map2 = new HashMap();
/* 364 */           File file = new File(((Context) this.zzg.I00000oIO(Context.class)).getCodeCacheDir(), "mlkit_pose");
/* 380 */           String string = (file.mkdirs() || file.exists()) ? file.toString() : "";
/* 396 */           String strConcat = "pose-detection-common_".concat(String.valueOf(O0oO1lOOo1.I0000Il00O.I00000oIO("pose-detection-common")));
/* 404 */           if (z) {
/* 416 */               map2.put("detector_model_delegate", MediaPipeInputFactory.getDelegateInputSidePacketNnapi(string, "NNAPI_DETECTOR_MODEL_TOKEN_".concat(strConcat)));
/* 429 */               map2.put("landmarks_model_delegate", MediaPipeInputFactory.getDelegateInputSidePacketNnapi(string, "NNAPI_LANDMARKS_MODEL_TOKEN_".concat(strConcat)));
                    } else if (zEquals) {
/* 445 */               map2.put("detector_model_delegate", MediaPipeInputFactory.getDelegateInputSidePacketGpu(true, true, string, "OPENCL_DETECTOR_MODEL_TOKEN_".concat(strConcat)));
/* 458 */               map2.put("landmarks_model_delegate", MediaPipeInputFactory.getDelegateInputSidePacketGpu(true, true, string, "OPENCL_LANDMARKS_MODEL_TOKEN_".concat(strConcat)));
                    }
/* 492 */           MediaPipeGraphRunner mediaPipeGraphRunner = new MediaPipeGraphRunner(MediaPipeGraphRunnerConfig.create(this.zzg, this.zzj.zza() == 1 ? strI000lI : strI000lI2, ii01IlIiIo.I001lIiIIo1O("input_frames"), ii01IlIiIo.I001lIiIIo1O("output_pose_landmarks"), map, map2));
/* 495 */           this.zzn = mediaPipeGraphRunner;
/* 497 */           mediaPipeGraphRunner.load();
/* 504 */           long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
/* 505 */           o0llIi.I00II0oii1o();
/* 514 */           if (this.zzj.isForBenchmark()) {
/* 2840 */              return;
                    }
/* 516 */           o0OIl1o1i0Oi o0oil1o1i0oi = this.zze;
/* 522 */           IOiOol0 iOiOol0 = new IOiOol0(14);
/* 527 */           iOiOol0.I00iio = lioi0il00i.TYPE_THICK;
/* 529 */           lo1I1l1Oo1I1 lo1i1l1oo1i1 = this.zzk;
/* 537 */           Long lValueOf = Long.valueOf(jElapsedRealtime2 & Long.MAX_VALUE);
/* 543 */           lo0O0OO1i lo0o0oo1i = new lo0O0OO1i();
/* 547 */           lo0o0oo1i.I00000oIO = null;
/* 549 */           lo0o0oo1i.I00000oOI = null;
/* 551 */           lo0o0oo1i.I0000Il00O = lo1i1l1oo1i1;
/* 553 */           lo0o0oo1i.I0000O = lValueOf;
/* 555 */           lo0o0oo1i.I0000oI00 = null;
/* 557 */           lo0o0oo1i.I0001Ioi1lo = null;
/* 559 */           VarHandle.storeStoreFence();
/* 562 */           iOiOol0.I00ilI0I1 = lo0o0oo1i;
/* 574 */           o0oil1o1i0oi.I00000oOI(o0Oll1li.I00000oOI(iOiOol0), lioiiIOoil.ON_DEVICE_POSE_LOAD, o0oil1o1i0oi.I0000Il00O());
                }

                @Override
                public final void release() {
/* 1 */             o0llIi.I00II0oii1o();
/* 4 */             o0OIl1o1i0Oi o0oil1o1i0oi = this.zze;
/* 6 */             lioiiIOoil lioiiiooil = lioiiIOoil.UNKNOWN_EVENT;
/* 8 */             o0oil1o1i0oi.getClass();
/* 15 */            lOii1o loii1o = new lOii1o(12);
/* 18 */            loii1o.I00iiI = o0oil1o1i0oi;
/* 20 */            VarHandle.storeStoreFence();
/* 24 */            io1OllI.I00000oIO(1, loii1o);
/* 27 */            MediaPipeGraphRunner mediaPipeGraphRunner = this.zzn;
/* 30 */            if (mediaPipeGraphRunner != null) {
/* 32 */                mediaPipeGraphRunner.close();
/* 35 */                this.zzn = null;
                    }
/* 43 */            if (!this.zzj.isForBenchmark()) {
/* 45 */                o0OIl1o1i0Oi o0oil1o1i0oi2 = this.zze;
/* 51 */                IOiOol0 iOiOol0 = new IOiOol0(14);
/* 56 */                iOiOol0.I00iio = lioi0il00i.TYPE_THICK;
/* 58 */                lo1I1l1Oo1I1 lo1i1l1oo1i1 = this.zzk;
/* 73 */                Long lValueOf = Long.valueOf((SystemClock.elapsedRealtime() - this.zzl) & Long.MAX_VALUE);
/* 81 */                Long lValueOf2 = Long.valueOf(this.zzm & Long.MAX_VALUE);
/* 87 */                lo0O0OO1i lo0o0oo1i = new lo0O0OO1i();
/* 90 */                lo0o0oo1i.I00000oIO = null;
/* 92 */                lo0o0oo1i.I00000oOI = null;
/* 94 */                lo0o0oo1i.I0000Il00O = lo1i1l1oo1i1;
/* 96 */                lo0o0oo1i.I0000O = null;
/* 98 */                lo0o0oo1i.I0000oI00 = lValueOf;
/* 100 */               lo0o0oo1i.I0001Ioi1lo = lValueOf2;
/* 102 */               VarHandle.storeStoreFence();
/* 105 */               iOiOol0.I00ilI0I1 = lo0o0oo1i;
/* 117 */               o0oil1o1i0oi2.I00000oOI(o0Oll1li.I00000oOI(iOiOol0), lioiiIOoil.ON_DEVICE_POSE_CLOSE, o0oil1o1i0oi2.I0000Il00O());
                    }
/* 120 */           this.zzi = true;
/* 122 */           PoseDetectorOptionsBase poseDetectorOptionsBase = this.zzd;
/* 124 */           this.zzj = poseDetectorOptionsBase;
/* 130 */           this.zzk = poseDetectorOptionsBase.zzb();
/* 134 */           this.zzl = 0L;
/* 136 */           this.zzm = 0L;
                }

                public final o0IlO11iI0 zzc(long j, lioii11l01oI lioii11l01oi, InputImage inputImage) {
/* 5 */             IOiOol0 iOiOol0 = new IOiOol0(14);
/* 10 */            iOiOol0.I00iio = lioi0il00i.TYPE_THICK;
/* 18 */            Long lValueOf = Long.valueOf(j & Long.MAX_VALUE);
/* 24 */            Boolean boolValueOf = Boolean.valueOf(this.zzi);
/* 30 */            boolean z = true;
/* 31 */            if (!this.zzo && !this.zzp) {
/* 38 */                z = false;
                    }
/* 39 */            Boolean boolValueOf2 = Boolean.valueOf(z);
/* 45 */            Boolean boolValueOf3 = Boolean.valueOf(this.zzq);
/* 51 */            lil0ooilloO lil0ooilloo = new lil0ooilloO();
/* 54 */            lil0ooilloo.I00000oIO = lValueOf;
/* 56 */            lil0ooilloo.I00000oOI = lioii11l01oi;
/* 58 */            lil0ooilloo.I0000Il00O = boolValueOf;
/* 60 */            lil0ooilloo.I0000O = boolValueOf2;
/* 62 */            lil0ooilloo.I0000oI00 = boolValueOf3;
/* 64 */            VarHandle.storeStoreFence();
/* 67 */            int format = inputImage.getFormat();
/* 73 */            int mobileVisionImageSize = zzc.getMobileVisionImageSize(inputImage);
/* 112 */           liOliIO lioliio = format != -1 ? format != 35 ? format != 842094169 ? format != 16 ? format != 17 ? liOliIO.UNKNOWN_FORMAT : liOliIO.NV21 : liOliIO.NV16 : liOliIO.YV12 : liOliIO.YUV_420_888 : liOliIO.BITMAP;
/* 118 */           Integer numValueOf = Integer.valueOf(mobileVisionImageSize & Integer.MAX_VALUE);
/* 124 */           lii10I010O0o lii10i010o0o = new lii10I010O0o();
/* 127 */           lii10i010o0o.I00000oIO = lioliio;
/* 129 */           lii10i010o0o.I00000oOI = numValueOf;
/* 131 */           VarHandle.storeStoreFence();
/* 134 */           lo1I1l1Oo1I1 lo1i1l1oo1i1 = this.zzk;
/* 138 */           lo0O0OO1i lo0o0oo1i = new lo0O0OO1i();
/* 141 */           lo0o0oo1i.I00000oIO = lil0ooilloo;
/* 143 */           lo0o0oo1i.I00000oOI = lii10i010o0o;
/* 145 */           lo0o0oo1i.I0000Il00O = lo1i1l1oo1i1;
/* 148 */           lo0o0oo1i.I0000O = null;
/* 150 */           lo0o0oo1i.I0000oI00 = null;
/* 152 */           lo0o0oo1i.I0001Ioi1lo = null;
/* 154 */           VarHandle.storeStoreFence();
/* 157 */           iOiOol0.I00ilI0I1 = lo0o0oo1i;
/* 159 */           return o0Oll1li.I00000oOI(iOiOol0);
                }

                @Override
                public final Pose run(InputImage inputImage) throws O1o01iO0liI0 {
                    MediaPipeInput mediaPipeInput;
/* 1 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 5 */             byte[] rgbBuffer = ImageConvertNativeUtils.getRgbBuffer(inputImage);
/* 15 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
/* 16 */            if (rgbBuffer == null) {
/* 26 */                mediaPipeInput = MediaPipeInputFactory.getMediaPipeInput(ImageConvertUtils.getInstance().getUpRightBitmap(inputImage), jElapsedRealtimeNanos);
                    } else {
/* 31 */                int width = inputImage.getWidth();
/* 35 */                int height = inputImage.getHeight();
/* 48 */                if ((inputImage.getRotationDegrees() / 90) % 2 == 1) {
/* 50 */                    width = inputImage.getHeight();
/* 54 */                    height = inputImage.getWidth();
                        }
/* 59 */                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(rgbBuffer.length);
/* 63 */                byteBufferAllocateDirect.put(rgbBuffer);
/* 66 */                byteBufferAllocateDirect.rewind();
/* 69 */                mediaPipeInput = MediaPipeInputFactory.getMediaPipeInput(byteBufferAllocateDirect, width, height, jElapsedRealtimeNanos);
                    }
                    try {
/* 73 */                MediaPipeGraphRunner mediaPipeGraphRunner = this.zzn;
/* 75 */                lII0I0I000I.I000II(mediaPipeGraphRunner);
/* 91 */                PoseHolder poseHolder = (PoseHolder) mediaPipeGraphRunner.run(ii01IlIiIo.I001lIiIIo1O(mediaPipeInput), new PoseHolderConverter());
/* 95 */                zze(lioii11l01oI.NO_ERROR, inputImage, jElapsedRealtime);
/* 99 */                this.zzi = false;
/* 104 */               return new Pose(poseHolder, null);
                    } catch (O1o01iO0liI0 e) {
/* 111 */               zze(lioii11l01oI.MEDIAPIPE_ERROR, inputImage, jElapsedRealtime);
/* 186 */               throw e;
                    }
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.google.mlkit.vision.pose.internal.zzf] */
                public final void zze(final lioii11l01oI lioii11l01oi, final InputImage inputImage, long j) {
/* 9 */             if (this.zzj.isForBenchmark()) {
/* 242 */               return;
                    }
/* 17 */            final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                    this.zzm += jElapsedRealtime;
/* 30 */            ?? r0 = new Object() {
                        public final o0IlO11iI0 zza() {
/* 9 */                     return this.zza.zzc(jElapsedRealtime, lioii11l01oi, inputImage);
                        }
                    };
/* 33 */            o0OIl1o1i0Oi o0oil1o1i0oi = this.zze;
/* 35 */            lioiiIOoil lioiiiooil = lioiiIOoil.ON_DEVICE_POSE_INFERENCE;
/* 37 */            o0oil1o1i0oi.getClass();
/* 40 */            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 48 */            if (o0oil1o1i0oi.I0000O(lioiiiooil, jElapsedRealtime2)) {
/* 57 */                o0oil1o1i0oi.I000OOo1O.put(lioiiiooil, Long.valueOf(jElapsedRealtime2));
/* 68 */                o0oil1o1i0oi.I00000oOI(r0.zza(), lioiiiooil, o0oil1o1i0oi.I0000Il00O());
                    }
/* 71 */            lo1I1l1Oo1I1 lo1i1l1oo1i1 = this.zzk;
/* 75 */            Boolean boolValueOf = Boolean.valueOf(this.zzi);
/* 81 */            io1IlOiOOo io1iloiooo = new io1IlOiOOo();
/* 84 */            io1iloiooo.I00000oIO = lioii11l01oi;
/* 86 */            io1iloiooo.I00000oOI = boolValueOf;
/* 88 */            io1iloiooo.I0000Il00O = lo1i1l1oo1i1;
/* 90 */            VarHandle.storeStoreFence();
/* 93 */            o0OIl1o1i0Oi o0oil1o1i0oi2 = this.zze;
/* 95 */            lioiiIOoil lioiiiooil2 = lioiiIOoil.UNKNOWN_EVENT;
/* 100 */           OllIllO1O ollIllO1O = new OllIllO1O(5);
/* 103 */           ollIllO1O.I00iiO = o0oil1o1i0oi2;
/* 105 */           ollIllO1O.I00iio = io1iloiooo;
/* 107 */           ollIllO1O.I00iiI = jElapsedRealtime;
/* 109 */           VarHandle.storeStoreFence();
/* 113 */           io1OllI.I00000oIO(1, ollIllO1O);
/* 116 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 122 */           boolean zZzg = this.zzj.zzg();
/* 126 */           long j2 = jCurrentTimeMillis - jElapsedRealtime;
/* 134 */           if (!this.zzj.isForBenchmark()) {
/* 137 */               o0OOlo o0oolo = this.zzf;
/* 145 */               int i = true != zZzg ? 24313 : 24312;
/* 148 */               int i2 = lioii11l01oi.I00iOIl;
                        synchronized (o0oolo) {
/* 151 */                   AtomicLong atomicLong = o0oolo.I00000oOI;
/* 153 */                   long jElapsedRealtime3 = SystemClock.elapsedRealtime();
/* 165 */                   if (atomicLong.get() == -1 || jElapsedRealtime3 - o0oolo.I00000oOI.get() > 1800000) {
/* 213 */                       o0IiOl o0iiolI0000Il00O = o0oolo.I00000oIO.I0000Il00O(new OloOI1o(0, Arrays.asList(new O1lli10oolO(i, i2, 0, j2, jCurrentTimeMillis, null, null, 0, -1))));
/* 221 */                       Io1OIO1l0o io1OIO1l0o = new Io1OIO1l0o(10);
/* 224 */                       io1OIO1l0o.I00iiO = o0oolo;
/* 226 */                       io1OIO1l0o.I00iiI = jElapsedRealtime3;
/* 228 */                       VarHandle.storeStoreFence();
/* 231 */                       o0iiolI0000Il00O.I0000Il00O(io1OIO1l0o);
                            }
                        }
                    }
/* 237 */           if (this.zzi) {
/* 239 */               o0llIi.I00II0oii1o();
                    }
                }
            }
