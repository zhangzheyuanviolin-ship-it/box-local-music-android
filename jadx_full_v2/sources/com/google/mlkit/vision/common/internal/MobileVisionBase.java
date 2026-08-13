            package com.google.mlkit.vision.common.internal;

            import android.graphics.Bitmap;
            import android.graphics.Matrix;
            import android.media.Image;
            import com.google.mlkit.vision.common.InputImage;
            import java.io.Closeable;
            import java.lang.reflect.InvocationTargetException;
            import java.nio.ByteBuffer;
            import java.util.HashMap;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.IIoiOO0;
            import p000.Io0Ool;
            import p000.O0oOOiI0;
            import p000.O0oiO0ilooli;
            import p000.O1Il0Il;
            import p000.O1o00iolI11;
            import p000.O1o01iO0liI0;
            import p000.OIi0011o;
            import p000.OIi011o01;
            import p000.OloIIoII1oo;
            import p000.OloIo0oOIO0;
            import p000.lII0I0I000I;
            import p000.lIooOl1II1Ii;
            import p000.lO01OoOo;
            import p000.lOOiIO;
            import p000.lOOlOoll;
            import p000.lOio0o;
            import p000.o0IiOl;
            
/* 8 */     public class MobileVisionBase<DetectionResultT> implements Closeable, O0oiO0ilooli {
                public static final int zza = 0;
                private static final Io0Ool zzb = new Io0Ool("MobileVisionBase", "");
                private final AtomicBoolean zzc = new AtomicBoolean(false);
                private final O1Il0Il zzd;
                private final IIoiOO0 zze;
                private final Executor zzf;
                private final OloIIoII1oo zzg;

                public MobileVisionBase(O1Il0Il o1Il0Il, Executor executor) {
/* 12 */            this.zzd = o1Il0Il;
/* 16 */            IIoiOO0 iIoiOO0 = new IIoiOO0();
/* 19 */            this.zze = iIoiOO0;
/* 21 */            this.zzf = executor;
/* 23 */            o1Il0Il.pin();
/* 30 */            OloIIoII1oo oloIIoII1ooCallAfterLoad = o1Il0Il.callAfterLoad(executor, new Callable() {
                        @Override
                        public final Object call() {
/* 1 */                     int i = MobileVisionBase.zza;
/* 3 */                     return null;
                        }
                    }, iIoiOO0.I00000oIO);
/* 34 */            zzc zzcVar = new OIi0011o() {
                        @Override
                        public final void onFailure(Exception exc) {
/* 7 */                     MobileVisionBase.zzb.I00000oOI("MobileVisionBase", "Error preloading model resource", exc);
                        }
                    };
/* 36 */            o0IiOl o0iiol = (o0IiOl) oloIIoII1ooCallAfterLoad;
/* 38 */            o0iiol.getClass();
/* 43 */            o0iiol.I0000O(OloIo0oOIO0.I00000oIO, zzcVar);
/* 46 */            this.zzg = o0iiol;
                }

                @Override
                @OIi011o01(O0oOOiI0.ON_DESTROY)
                public synchronized void close() {
/* 9 */             if (this.zzc.getAndSet(true)) {
/* 28 */                return;
                    }
/* 13 */            this.zze.I00000oIO();
/* 20 */            this.zzd.unpin(this.zzf);
                }

                public synchronized OloIIoII1oo closeWithTask() {
/* 9 */             if (this.zzc.getAndSet(true)) {
/* 29 */                return lOio0o.I0000oI00(null);
                    }
/* 13 */            this.zze.I00000oIO();
/* 20 */            return this.zzd.unpinWithTask(this.zzf);
                }

                public synchronized OloIIoII1oo getInitTaskBase() {
/* 2 */             return this.zzg;
                }

                public OloIIoII1oo process(Bitmap bitmap, int i) {
/* 5 */             return processBase(InputImage.fromBitmap(bitmap, i));
                }

                public synchronized OloIIoII1oo processBase(final InputImage inputImage) {
/* 4 */             lII0I0I000I.I000O01llI0("InputImage can not be null", inputImage);
/* 13 */            if (this.zzc.get()) {
/* 24 */                return lOio0o.I0000O(new O1o01iO0liI0("This detector is already closed!", 14));
                    }
/* 38 */            if (inputImage.getWidth() < 32 || inputImage.getHeight() < 32) {
/* 73 */                return lOio0o.I0000O(new O1o01iO0liI0("InputImage width and height should be at least 32!", 3));
                    }
/* 59 */            return this.zzd.callAfterLoad(this.zzf, new Callable() {
                        @Override
                        public final Object call() {
/* 5 */                     return this.zza.zza(inputImage);
                        }
                    }, this.zze.I00000oIO);
                }

                public final Object zza(InputImage inputImage) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    lO01OoOo lo01oooo;
/* 3 */             HashMap map = lO01OoOo.I00ilO0;
/* 5 */             lOOlOoll.I0000O();
/* 8 */             int i = lOOiIO.I00000oIO;
/* 10 */            lOOlOoll.I0000O();
/* 19 */            if (Boolean.parseBoolean("")) {
/* 24 */                HashMap map2 = lO01OoOo.I00ilO0;
/* 32 */                if (map2.get("detectorTaskWithResource#run") == null) {
/* 39 */                    map2.put("detectorTaskWithResource#run", new lO01OoOo("detectorTaskWithResource#run"));
                        }
/* 46 */                lo01oooo = (lO01OoOo) map2.get("detectorTaskWithResource#run");
                    } else {
/* 21 */                lo01oooo = lIooOl1II1Ii.I00io1l;
                    }
/* 48 */            lo01oooo.I00000oIO();
                    try {
/* 53 */                Object objRun = this.zzd.run(inputImage);
/* 57 */                lo01oooo.close();
/* 60 */                return objRun;
                    } catch (Throwable th) {
                        try {
/* 62 */                    lo01oooo.close();
                        } catch (Throwable th2) {
                            try {
/* 81 */                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception unused) {
                            }
                        }
/* 186 */               throw th;
                    }
                }

                public final Object zzb(O1o00iolI11 o1o00iolI11) throws O1o01iO0liI0 {
/* 1 */             InputImage inputImageConvertMlImagetoInputImage = CommonConvertUtils.convertMlImagetoInputImage(o1o00iolI11);
/* 5 */             if (inputImageConvertMlImagetoInputImage != null) {
/* 9 */                 return this.zzd.run(inputImageConvertMlImagetoInputImage);
                    }
/* 49 */            throw new O1o01iO0liI0("Current type of MlImage is not supported.", 13);
                }

/* 9 */         public OloIIoII1oo process(Image image, int i) {
/* 10 */            return processBase(InputImage.fromMediaImage(image, i));
                }

/* 10 */        public OloIIoII1oo process(Image image, int i, Matrix matrix) {
/* 11 */            return processBase(InputImage.fromMediaImage(image, i, matrix));
                }

/* 11 */        public OloIIoII1oo process(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
/* 13 */            return processBase(InputImage.fromByteBuffer(byteBuffer, i, i2, i3, i4));
                }

/* 80 */        public synchronized OloIIoII1oo processBase(O1o00iolI11 o1o00iolI11) {
/* 81 */            lII0I0I000I.I000O01llI0("MlImage can not be null", o1o00iolI11);
                    throw null;
                }
            }
