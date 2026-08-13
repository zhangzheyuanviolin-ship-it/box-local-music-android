            package com.google.mlkit.vision.facemesh.internal;

            import android.os.SystemClock;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.ImageConvertUtils;
            import com.google.mlkit.vision.common.internal.ImageUtils;
            import com.google.mlkit.vision.facemesh.FaceMesh;
            import com.google.mlkit.vision.facemesh.FaceMeshDetectorOptions;
            import com.google.mlkit.vision.mediapipe.Converter;
            import com.google.mlkit.vision.mediapipe.MediaPipeGraphRunner;
            import com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig;
            import com.google.mlkit.vision.mediapipe.MediaPipeInput;
            import com.google.mlkit.vision.mediapipe.MediaPipeInputFactory;
            import com.google.mlkit.vision.mediapipe.facemesh.BlazeFaceHolderConverter;
            import com.google.mlkit.vision.mediapipe.facemesh.FaceMeshHolderConverter;
            import com.google.mlkit.vision.mediapipe.facemesh.FaceMeshListHolder;
            import com.google.mlkit.vision.mediapipe.utils.ImageConvertNativeUtils;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.I00Ol00;
            import p000.IOiOol0;
            import p000.Io1OIO1l0o;
            import p000.O1Il0Il;
            import p000.O1lli10oolO;
            import p000.O1o0111OI00;
            import p000.O1o01iO0liI0;
            import p000.OllIllO1O;
            import p000.OloOI1o;
            import p000.iOOii1Ol0Oli;
            import p000.iOio11oiIi0I;
            import p000.iiI10IO0io0I;
            import p000.il1o0o00O0;
            import p000.io1OllI;
            import p000.lII0I0I000I;
            import p000.lOlIIi;
            import p000.lOlOliiol;
            import p000.lOo1lI1o1io;
            import p000.li0lOl1IO;
            import p000.li0o0II;
            import p000.li10OOoO0loI;
            import p000.lilIoil;
            import p000.ll0O0O1Il11I;
            import p000.ll0lioioI;
            import p000.ll1IO0lOO;
            import p000.loOIiioiOool;
            import p000.loiI0oIOO;
            import p000.loiOiiIIo00l;
            import p000.o0IiOl;
            
            public final class zzf extends O1Il0Il {
                private static final ImageUtils zzc = ImageUtils.getInstance();
                MediaPipeGraphRunner zza;
                final AtomicBoolean zzb = new AtomicBoolean(true);
                private final FaceMeshDetectorOptions zzd;
                private final ll1IO0lOO zze;
                private final loiI0oIOO zzf;
                private final loiOiiIIo00l zzg;

                public zzf(FaceMeshDetectorOptions faceMeshDetectorOptions, loiI0oIOO loii0oioo, loiOiiIIo00l loioiiiio00l) {
/* 12 */            this.zzd = faceMeshDetectorOptions;
/* 18 */            this.zze = zzg.zza(faceMeshDetectorOptions);
/* 20 */            this.zzf = loii0oioo;
/* 22 */            this.zzg = loioiiiio00l;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [com.google.mlkit.vision.facemesh.internal.zzd] */
                private final void zze(final li0o0II li0o0ii, long j, final InputImage inputImage, final int i) {
/* 5 */             final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
/* 17 */            ?? r0 = new Object() {
                        public final loOIiioiOool zza() {
/* 11 */                    return this.zza.zzc(jElapsedRealtime, li0o0ii, inputImage, i);
                        }
                    };
/* 20 */            loiI0oIOO loii0oioo = this.zzf;
/* 22 */            li10OOoO0loI li10oooo0loi = li10OOoO0loI.ON_DEVICE_FACE_MESH_DETECT;
/* 24 */            loii0oioo.getClass();
/* 27 */            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 35 */            if (loii0oioo.I0000O(li10oooo0loi, jElapsedRealtime2)) {
/* 44 */                loii0oioo.I000OOo1O.put(li10oooo0loi, Long.valueOf(jElapsedRealtime2));
/* 55 */                loii0oioo.I00000oOI(r0.zza(), li10oooo0loi, loii0oioo.I0000Il00O());
                    }
/* 64 */            Boolean boolValueOf = Boolean.valueOf(this.zzb.get());
/* 70 */            il1o0o00O0 il1o0o00o0 = new il1o0o00O0();
/* 73 */            il1o0o00o0.I00000oIO = li0o0ii;
/* 75 */            il1o0o00o0.I00000oOI = boolValueOf;
/* 77 */            VarHandle.storeStoreFence();
/* 82 */            new Object() {
                    };
/* 85 */            li10OOoO0loI li10oooo0loi2 = li10OOoO0loI.UNKNOWN_EVENT;
/* 89 */            loiI0oIOO loii0oioo2 = this.zzf;
/* 92 */            OllIllO1O ollIllO1O = new OllIllO1O(4);
/* 95 */            ollIllO1O.I00iiO = loii0oioo2;
/* 97 */            ollIllO1O.I00iio = il1o0o00o0;
/* 99 */            ollIllO1O.I00iiI = jElapsedRealtime;
/* 101 */           VarHandle.storeStoreFence();
/* 105 */           io1OllI.I00000oIO(1, ollIllO1O);
/* 108 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 112 */           long j2 = jCurrentTimeMillis - jElapsedRealtime;
/* 114 */           loiOiiIIo00l loioiiiio00l = this.zzg;
/* 116 */           int i2 = li0o0ii.I00iOIl;
                    synchronized (loioiiiio00l) {
/* 119 */               AtomicLong atomicLong = loioiiiio00l.I00000oOI;
/* 121 */               long jElapsedRealtime3 = SystemClock.elapsedRealtime();
/* 133 */               if (atomicLong.get() != -1 && jElapsedRealtime3 - loioiiiio00l.I00000oOI.get() <= 1800000) {
/* 152 */                   return;
                        }
/* 183 */               o0IiOl o0iiolI0000Il00O = loioiiiio00l.I00000oIO.I0000Il00O(new OloOI1o(0, Arrays.asList(new O1lli10oolO(24324, i2, 0, j2, jCurrentTimeMillis, null, null, 0, -1))));
/* 190 */               Io1OIO1l0o io1OIO1l0o = new Io1OIO1l0o(7);
/* 193 */               io1OIO1l0o.I00iiO = loioiiiio00l;
/* 195 */               io1OIO1l0o.I00iiI = jElapsedRealtime3;
/* 197 */               VarHandle.storeStoreFence();
/* 200 */               o0iiolI0000Il00O.I0000Il00O(io1OIO1l0o);
                    }
                }

                @Override
                public final synchronized void load() {
                    MediaPipeGraphRunner mediaPipeGraphRunner;
                    try {
/* 4 */                 if (this.zza == null) {
/* 6 */                     FaceMeshDetectorOptions faceMeshDetectorOptions = this.zzd;
/* 8 */                     long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 17 */                    if (faceMeshDetectorOptions.zza() == 1) {
/* 21 */                        HashMap map = new HashMap();
/* 33 */                        map.put("num_faces", MediaPipeInputFactory.getMediaPipeInput(2, 0L));
/* 42 */                        map.put("use_prev_landmarks", MediaPipeInputFactory.getMediaPipeInput(true, 0L));
/* 47 */                        O1o0111OI00 o1o0111OI00I0000Il00O = O1o0111OI00.I0000Il00O();
/* 56 */                        iOOii1Ol0Oli iooii1ol0oli = iOio11oiIi0I.I00lll10;
/* 58 */                        Object[] objArr = {"input_frames"};
/* 62 */                        lilIoil.I00000oIO(1, objArr);
/* 65 */                        iiI10IO0io0I iii10io0io0iI001iOo1i0O = iOio11oiIi0I.I001iOo1i0O(1, objArr);
/* 75 */                        Object[] objArr2 = {"multi_face_landmarks", "multi_face_bounds", "multi_face_geometry"};
/* 80 */                        lilIoil.I00000oIO(3, objArr2);
/* 92 */                        mediaPipeGraphRunner = new MediaPipeGraphRunner(MediaPipeGraphRunnerConfig.create(o1o0111OI00I0000Il00O, "mlkit_facemesh/face_mesh_graph.binarypb", iii10io0io0iI001iOo1i0O, iOio11oiIi0I.I001iOo1i0O(3, objArr2), null, map));
/* 95 */                        this.zza = mediaPipeGraphRunner;
                            } else {
/* 102 */                       O1o0111OI00 o1o0111OI00I0000Il00O2 = O1o0111OI00.I0000Il00O();
/* 113 */                       iOOii1Ol0Oli iooii1ol0oli2 = iOio11oiIi0I.I00lll10;
/* 115 */                       Object[] objArr3 = {"input_frames"};
/* 119 */                       lilIoil.I00000oIO(1, objArr3);
/* 122 */                       iiI10IO0io0I iii10io0io0iI001iOo1i0O2 = iOio11oiIi0I.I001iOo1i0O(1, objArr3);
/* 126 */                       Object[] objArr4 = {"output_face_detections"};
/* 130 */                       lilIoil.I00000oIO(1, objArr4);
/* 143 */                       mediaPipeGraphRunner = new MediaPipeGraphRunner(MediaPipeGraphRunnerConfig.create(o1o0111OI00I0000Il00O2, "mlkit_facemesh/face_short_range_graph.binarypb", iii10io0io0iI001iOo1i0O2, iOio11oiIi0I.I001iOo1i0O(1, objArr4), null, null));
/* 146 */                       this.zza = mediaPipeGraphRunner;
                            }
/* 148 */                   mediaPipeGraphRunner.load();
/* 151 */                   loiI0oIOO loii0oioo = this.zzf;
/* 157 */                   IOiOol0 iOiOol0 = new IOiOol0(13);
/* 162 */                   iOiOol0.I00iio = li0lOl1IO.TYPE_THICK;
/* 164 */                   ll1IO0lOO ll1io0loo = this.zze;
/* 177 */                   Long lValueOf = Long.valueOf(Long.MAX_VALUE & (SystemClock.elapsedRealtime() - jElapsedRealtime));
/* 181 */                   li0o0II li0o0ii = li0o0II.NO_ERROR;
/* 185 */                   ll0O0O1Il11I ll0o0o1il11i = new ll0O0O1Il11I();
/* 188 */                   ll0o0o1il11i.I00000oIO = ll1io0loo;
/* 190 */                   ll0o0o1il11i.I00000oOI = li0o0ii;
/* 192 */                   ll0o0o1il11i.I0000Il00O = lValueOf;
/* 194 */                   VarHandle.storeStoreFence();
/* 197 */                   iOiOol0.I00ilO0 = ll0o0o1il11i;
/* 211 */                   loii0oioo.I00000oOI(new I00Ol00(iOiOol0, 0, (byte) 0), li10OOoO0loI.ON_DEVICE_FACE_MESH_LOAD, loii0oioo.I0000Il00O());
                        }
                    } catch (Throwable th) {
/* 541 */               throw th;
                    }
                }

                @Override
                public final synchronized void release() {
/* 2 */             MediaPipeGraphRunner mediaPipeGraphRunner = this.zza;
/* 4 */             if (mediaPipeGraphRunner != null) {
/* 6 */                 mediaPipeGraphRunner.close();
/* 10 */                this.zza = null;
/* 15 */                this.zzb.set(true);
/* 18 */                loiI0oIOO loii0oioo = this.zzf;
/* 24 */                IOiOol0 iOiOol0 = new IOiOol0(13);
/* 29 */                iOiOol0.I00iio = li0lOl1IO.TYPE_THICK;
/* 43 */                loii0oioo.I00000oOI(new I00Ol00(iOiOol0, 0, (byte) 0), li10OOoO0loI.ON_DEVICE_FACE_MESH_CLOSE, loii0oioo.I0000Il00O());
                    }
                }

                public final loOIiioiOool zzc(long j, li0o0II li0o0ii, InputImage inputImage, int i) {
/* 7 */             Long lValueOf = Long.valueOf(j & Long.MAX_VALUE);
/* 17 */            Boolean boolValueOf = Boolean.valueOf(this.zzb.get());
/* 23 */            lOo1lI1o1io loo1li1o1io = new lOo1lI1o1io();
/* 26 */            loo1li1o1io.I00000oIO = lValueOf;
/* 28 */            loo1li1o1io.I00000oOI = li0o0ii;
/* 30 */            loo1li1o1io.I0000Il00O = boolValueOf;
/* 32 */            VarHandle.storeStoreFence();
/* 35 */            int format = inputImage.getFormat();
/* 41 */            int mobileVisionImageSize = zzc.getMobileVisionImageSize(inputImage);
/* 80 */            lOlIIi loliii = format != -1 ? format != 35 ? format != 842094169 ? format != 16 ? format != 17 ? lOlIIi.UNKNOWN_FORMAT : lOlIIi.NV21 : lOlIIi.NV16 : lOlIIi.YV12 : lOlIIi.YUV_420_888 : lOlIIi.BITMAP;
/* 86 */            Integer numValueOf = Integer.valueOf(mobileVisionImageSize & Integer.MAX_VALUE);
/* 92 */            lOlOliiol lololiiol = new lOlOliiol();
/* 95 */            lololiiol.I00000oIO = loliii;
/* 97 */            lololiiol.I00000oOI = numValueOf;
/* 99 */            VarHandle.storeStoreFence();
/* 104 */           Integer numValueOf2 = Integer.valueOf(i & Integer.MAX_VALUE);
/* 108 */           ll1IO0lOO ll1io0loo = this.zze;
/* 112 */           ll0lioioI ll0lioioi = new ll0lioioI();
/* 115 */           ll0lioioi.I00000oIO = loo1li1o1io;
/* 117 */           ll0lioioi.I00000oOI = ll1io0loo;
/* 119 */           ll0lioioi.I0000Il00O = lololiiol;
/* 121 */           ll0lioioi.I0000O = numValueOf2;
/* 123 */           VarHandle.storeStoreFence();
/* 130 */           IOiOol0 iOiOol0 = new IOiOol0(13);
/* 135 */           iOiOol0.I00iio = li0lOl1IO.TYPE_THICK;
/* 137 */           iOiOol0.I00io1l = ll0lioioi;
/* 142 */           return new I00Ol00(iOiOol0, 0, (byte) 0);
                }

                @Override
                public final synchronized List run(InputImage inputImage) {
                    MediaPipeInput mediaPipeInput;
                    ArrayList arrayList;
                    try {
/* 8 */                 long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
/* 10 */                int width = inputImage.getWidth();
/* 14 */                int height = inputImage.getHeight();
                        try {
/* 18 */                    byte[] rgbBuffer = ImageConvertNativeUtils.getRgbBuffer(inputImage);
/* 23 */                    if (rgbBuffer == null) {
/* 33 */                        mediaPipeInput = MediaPipeInputFactory.getMediaPipeInput(ImageConvertUtils.getInstance().getUpRightBitmap(inputImage), jElapsedRealtimeNanos);
                            } else {
/* 52 */                        if ((inputImage.getRotationDegrees() / 90) % 2 == 1) {
/* 54 */                            width = inputImage.getHeight();
/* 58 */                            height = inputImage.getWidth();
                                }
/* 63 */                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(rgbBuffer.length);
/* 67 */                        byteBufferAllocateDirect.put(rgbBuffer);
/* 70 */                        byteBufferAllocateDirect.rewind();
/* 73 */                        mediaPipeInput = MediaPipeInputFactory.getMediaPipeInput(byteBufferAllocateDirect, width, height, jElapsedRealtimeNanos);
                            }
/* 93 */                    Converter blazeFaceHolderConverter = this.zzd.zza() == 0 ? new BlazeFaceHolderConverter(width, height) : new FaceMeshHolderConverter(width, height);
/* 96 */                    MediaPipeGraphRunner mediaPipeGraphRunner = this.zza;
/* 98 */                    lII0I0I000I.I000II(mediaPipeGraphRunner);
/* 101 */                   iOOii1Ol0Oli iooii1ol0oli = iOio11oiIi0I.I00lll10;
/* 103 */                   Object[] objArr = {mediaPipeInput};
/* 107 */                   lilIoil.I00000oIO(1, objArr);
/* 118 */                   FaceMeshListHolder faceMeshListHolder = (FaceMeshListHolder) mediaPipeGraphRunner.run(iOio11oiIi0I.I001iOo1i0O(1, objArr), blazeFaceHolderConverter);
/* 122 */                   arrayList = new ArrayList();
/* 129 */                   Iterator<FaceMeshListHolder.FaceMeshHolder> it = faceMeshListHolder.getFaceMeshHolders().iterator();
/* 137 */                   while (it.hasNext()) {
/* 150 */                       arrayList.add(new FaceMesh(it.next()));
                            }
/* 164 */                   zze(li0o0II.NO_ERROR, jElapsedRealtimeNanos / 1000, inputImage, arrayList.size());
/* 170 */                   this.zzb.set(false);
                        } catch (O1o01iO0liI0 e) {
/* 182 */                   zze(li0o0II.MEDIAPIPE_ERROR, jElapsedRealtimeNanos / 1000, inputImage, 0);
/* 185 */                   throw e;
                        }
                    } catch (Throwable th) {
/* 966 */               throw th;
                    }
/* 174 */           return arrayList;
                }
            }
