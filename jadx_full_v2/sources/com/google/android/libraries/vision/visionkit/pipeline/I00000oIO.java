            package com.google.android.libraries.vision.visionkit.pipeline;

            import android.graphics.Bitmap;
            import android.util.Log;
            import java.nio.ByteBuffer;
            import p000.I000II;
            import p000.IoOOl0iOl1io;
            import p000.ii0II11oi0I;
            import p000.ii0OOOOo0i;
            import p000.ii0iI11ol;
            import p000.ii0oIOiIl;
            import p000.ii1000OlO0o1;
            import p000.ii110IOiOI11;
            import p000.iiOOiO011l00;
            import p000.iilo1l;
            import p000.il001oIi1I;
            import p000.il11looIo1l;
            import p000.il1looOi;
            import p000.l1I0oI;
            import p000.l1oiOIloOo;
            import p000.lI1000oO0Ol;
            import p000.lill1ilil1I;
            
            public abstract class I00000oIO {
                protected final ii0II11oi0I zza;
                private final ii110IOiOI11 zzb;
                private final iiOOiO011l00 zzc;
                private long zzd;
                private final long zze;
                private final long zzf;
                private final long zzg;
                private final long zzh;

                public I00000oIO(iilo1l iilo1lVar) {
                    iiOOiO011l00 nativePipelineImpl;
                    ii0II11oi0I ii0ii11oi0iI0000Il00O;
/* 3 */             ii0II11oi0I ii0ii11oi0i = ii0II11oi0I.I00000oOI;
/* 5 */             if (ii0ii11oi0i == null) {
                        synchronized (ii0II11oi0I.class) {
                            try {
/* 11 */                        ii0ii11oi0iI0000Il00O = ii0II11oi0I.I00000oOI;
/* 13 */                        if (ii0ii11oi0iI0000Il00O == null) {
/* 21 */                            ii0oIOiIl ii0oioiil = ii0oIOiIl.I0000Il00O;
/* 23 */                            ii0ii11oi0iI0000Il00O = ii0OOOOo0i.I0000Il00O();
/* 27 */                            ii0II11oi0I.I00000oOI = ii0ii11oi0iI0000Il00O;
                                }
                            } finally {
                            }
                        }
/* 16 */                ii0ii11oi0i = ii0ii11oi0iI0000Il00O;
                    }
/* 31 */            if (ii0ii11oi0i == null) {
/* 33 */                ii0oIOiIl ii0oioiil2 = ii0oIOiIl.I0000Il00O;
/* 35 */                ii0ii11oi0i = ii0II11oi0I.I0000Il00O;
                    }
/* 44 */            if (iilo1lVar.I001lIiIIo1O()) {
/* 50 */                nativePipelineImpl = new l1I0oI(20);
/* 53 */                this.zzc = nativePipelineImpl;
                    } else if (iilo1lVar.I001l0I00()) {
/* 65 */                nativePipelineImpl = new NativePipelineImpl(this, this, this, ii0ii11oi0i);
/* 68 */                this.zzc = nativePipelineImpl;
                    } else {
/* 73 */                nativePipelineImpl = new NativePipelineImpl(this, this, this, ii0ii11oi0i);
/* 78 */                System.loadLibrary("mlkitcommonpipeline");
/* 81 */                this.zzc = nativePipelineImpl;
                    }
/* 55 */            iiOOiO011l00 iiooio011l00 = nativePipelineImpl;
/* 88 */            if (iilo1lVar.I001lllioOl()) {
/* 99 */                this.zzb = new ii110IOiOI11(iilo1lVar.I00111O());
                    } else {
/* 109 */               this.zzb = new ii110IOiOI11(10);
                    }
/* 111 */           this.zza = ii0ii11oi0i;
/* 113 */           long jInitializeFrameManager = iiooio011l00.initializeFrameManager();
/* 117 */           this.zze = jInitializeFrameManager;
/* 119 */           long jInitializeFrameBufferReleaseCallback = iiooio011l00.initializeFrameBufferReleaseCallback(jInitializeFrameManager);
/* 123 */           this.zzf = jInitializeFrameBufferReleaseCallback;
/* 125 */           long jInitializeResultsCallback = iiooio011l00.initializeResultsCallback();
/* 129 */           this.zzg = jInitializeResultsCallback;
/* 131 */           long jInitializeIsolationCallback = iiooio011l00.initializeIsolationCallback();
/* 135 */           this.zzh = jInitializeIsolationCallback;
/* 149 */           this.zzd = iiooio011l00.initialize(iilo1lVar.I0000O(), jInitializeFrameBufferReleaseCallback, jInitializeResultsCallback, jInitializeIsolationCallback, 0L, 0L);
                }

                public final int zza(String str) {
/* 5 */             Log.w("VKP", "openFileDescriptor called but is not available for this pipeline. Ignoring call.");
/* 8 */             return -1;
                }

                public final lI1000oO0Ol zzb() {
/* 5 */             byte[] analyticsLogs = this.zzc.getAnalyticsLogs(this.zzd);
/* 9 */             if (analyticsLogs == null) {
/* 11 */                return l1oiOIloOo.I00iOIl;
                    }
                    try {
/* 14 */                ii0II11oi0I ii0ii11oi0i = ii0II11oi0I.I00000oOI;
/* 16 */                ii0oIOiIl ii0oioiil = ii0oIOiIl.I0000Il00O;
/* 24 */                return lI1000oO0Ol.I0000O(il11looIo1l.I001IO000(analyticsLogs, ii0II11oi0I.I0000Il00O));
                    } catch (ii0iI11ol e) {
/* 32 */                IoOOl0iOl1io.I000l1("Could not parse analytics logs", e);
/* 35 */                return null;
                    }
                }

                public final lI1000oO0Ol zzc(ii1000OlO0o1 ii1000olo0o1) {
/* 12 */            if (this.zzd == 0) {
/* 132 */               I000II.I001IO000("Pipeline has been closed or was not initialized");
/* 11 */                return null;
                    }
/* 14 */            ii110IOiOI11 ii110ioioi11 = this.zzb;
/* 16 */            long j = ii1000olo0o1.I00000oOI;
                    synchronized (ii110ioioi11) {
/* 29 */                if (ii110ioioi11.I00000oOI.size() == ii110ioioi11.I00000oIO) {
/* 39 */                    String str = "Buffer is full. Drop frame " + j;
/* 50 */                    if (Log.isLoggable("VisionKit", 5)) {
/* 58 */                        Log.w("VisionKit", lill1ilil1I.I00000oIO(str, ii110ioioi11));
                            }
                        } else {
/* 71 */                    ii110ioioi11.I00000oOI.put(Long.valueOf(j), ii1000olo0o1);
/* 75 */                    iiOOiO011l00 iiooio011l00 = this.zzc;
/* 77 */                    long j2 = this.zzd;
/* 79 */                    long j3 = this.zze;
/* 81 */                    long j4 = ii1000olo0o1.I00000oOI;
/* 83 */                    byte[] bArr = ii1000olo0o1.I00000oIO;
/* 85 */                    il001oIi1I il001oii1i = ii1000olo0o1.I0000Il00O;
/* 101 */                   byte[] bArrProcess = iiooio011l00.process(j2, j3, j4, bArr, il001oii1i.I00000oIO, il001oii1i.I00000oOI, ii1000olo0o1.I0000O - 1, ii1000olo0o1.I0000oI00 - 1);
/* 105 */                   if (bArrProcess != null) {
                                try {
/* 116 */                           return lI1000oO0Ol.I0000O(il1looOi.I001IO000(bArrProcess, this.zza));
                                } catch (ii0iI11ol e) {
/* 124 */                           IoOOl0iOl1io.I000l1("Could not parse results", e);
/* 11 */                            return null;
                                }
                            }
                        }
                    }
/* 107 */           return l1oiOIloOo.I00iOIl;
                }

                public final synchronized void zzd() {
/* 4 */             long j = this.zzd;
/* 10 */            if (j != 0) {
/* 14 */                this.zzc.stop(j);
/* 30 */                this.zzc.close(this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
/* 33 */                this.zzd = 0L;
/* 37 */                this.zzc.mo40zza();
                    }
                }

                public final void zze(int i) {
/* 5 */             Log.w("VKP", "closeFileDescriptor called but is not available for this pipeline. Ignoring call.");
                }

                public final void zzf(long j) {
/* 1 */             ii110IOiOI11 ii110ioioi11 = this.zzb;
                    synchronized (ii110ioioi11) {
/* 10 */                ii110ioioi11.I00000oOI.remove(Long.valueOf(j));
                    }
                }

                public final void zzg(il1looOi il1loooi) {
/* 7 */             String strConcat = "Pipeline received results: ".concat(String.valueOf(il1loooi));
/* 18 */            if (Log.isLoggable("VisionKit", 4)) {
/* 24 */                Log.i("VisionKit", lill1ilil1I.I00000oIO(strConcat, this));
                    }
                }

                public final void zzh() throws PipelineException {
/* 1 */             long j = this.zzd;
/* 7 */             if (j == 0) {
/* 113 */               throw new PipelineException(9, "Pipeline has been closed or was not initialized");
                    }
                    try {
/* 11 */                this.zzc.start(j);
/* 18 */                this.zzc.waitUntilIdle(this.zzd);
                    } catch (PipelineException e) {
/* 27 */                this.zzc.stop(this.zzd);
/* 30 */                throw e;
                    }
                }

                public final void zzi() {
/* 1 */             long j = this.zzd;
/* 7 */             if (j == 0) {
/* 26 */                I000II.I001IO000("Pipeline has been closed or was not initialized");
                    } else {
/* 15 */                if (this.zzc.stop(j)) {
/* 17 */                    return;
                        }
/* 20 */                I000II.I001IO000("Pipeline did not stop successfully.");
                    }
                }

                public final lI1000oO0Ol zzj(long j, Bitmap bitmap, int i) {
/* 8 */             if (this.zzd == 0) {
/* 84 */                I000II.I001IO000("Pipeline has been closed or was not initialized");
/* 7 */                 return null;
                    }
/* 16 */            if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
/* 78 */                I000II.I000iOII("Unsupported bitmap config ".concat(String.valueOf(bitmap.getConfig())));
/* 7 */                 return null;
                    }
/* 36 */            byte[] bArrProcessBitmap = this.zzc.processBitmap(this.zzd, j, bitmap, bitmap.getWidth(), bitmap.getHeight(), 0, i - 1);
/* 40 */            if (bArrProcessBitmap == null) {
/* 42 */                return l1oiOIloOo.I00iOIl;
                    }
                    try {
/* 51 */                return lI1000oO0Ol.I0000O(il1looOi.I001IO000(bArrProcessBitmap, this.zza));
                    } catch (ii0iI11ol e) {
/* 60 */                IoOOl0iOl1io.I000l1("Could not parse results", e);
/* 7 */                 return null;
                    }
                }

                public final lI1000oO0Ol zzk(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
/* 10 */            if (this.zzd == 0) {
/* 89 */                I000II.I001IO000("Pipeline has been closed or was not initialized");
/* 9 */                 return null;
                    }
/* 16 */            if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
/* 83 */                I000II.I001IO000("Byte buffers are not direct.");
/* 9 */                 return null;
                    }
/* 54 */            byte[] bArrProcessYuvFrame = this.zzc.processYuvFrame(this.zzd, j, byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5, i6 - 1);
/* 58 */            if (bArrProcessYuvFrame == null) {
/* 60 */                return l1oiOIloOo.I00iOIl;
                    }
                    try {
/* 69 */                return lI1000oO0Ol.I0000O(il1looOi.I001IO000(bArrProcessYuvFrame, this.zza));
                    } catch (ii0iI11ol e) {
/* 77 */                IoOOl0iOl1io.I000l1("Could not parse results", e);
/* 9 */                 return null;
                    }
                }
            }
