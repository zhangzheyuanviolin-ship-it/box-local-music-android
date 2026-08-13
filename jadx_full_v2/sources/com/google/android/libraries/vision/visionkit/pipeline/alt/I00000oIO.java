            package com.google.android.libraries.vision.visionkit.pipeline.alt;

            import android.graphics.Bitmap;
            import android.util.Log;
            import java.nio.ByteBuffer;
            import p000.I000II;
            import p000.IoOOl0iOl1io;
            import p000.i0i0lO11loi;
            import p000.i0llli;
            import p000.i0lloI0;
            import p000.i0lolloO00;
            import p000.i0o0li;
            import p000.i0o10lO1i;
            import p000.i101o1;
            import p000.i101olIl0OiI;
            import p000.i11IO0ii;
            import p000.i11Iio0OOOI;
            import p000.i11i01Oo;
            import p000.i11liii0;
            import p000.l1I0oI;
            import p000.liO1oilOi;
            
            public abstract class I00000oIO {
                protected final i11IO0ii zba;
                private final i0lloI0 zbb;
                private final i0i0lO11loi zbc;
                private long zbd;
                private final long zbe;
                private final long zbf;
                private final long zbg;
                private final long zbh;

                public I00000oIO(i0lolloO00 i0lolloo00) {
                    i0i0lO11loi nativePipelineImpl;
                    i11IO0ii i11io0iiI00000oIO;
/* 3 */             i11IO0ii i11io0ii = i11IO0ii.I00000oOI;
/* 5 */             if (i11io0ii == null) {
                        synchronized (i11IO0ii.class) {
                            try {
/* 11 */                        i11io0iiI00000oIO = i11IO0ii.I00000oOI;
/* 13 */                        if (i11io0iiI00000oIO == null) {
/* 21 */                            i11liii0 i11liii0Var = i11liii0.I0000Il00O;
/* 23 */                            i11io0iiI00000oIO = i11Iio0OOOI.I00000oIO();
/* 27 */                            i11IO0ii.I00000oOI = i11io0iiI00000oIO;
                                }
                            } finally {
                            }
                        }
/* 16 */                i11io0ii = i11io0iiI00000oIO;
                    }
/* 31 */            if (i11io0ii == null) {
/* 33 */                i11liii0 i11liii0Var2 = i11liii0.I0000Il00O;
/* 35 */                i11io0ii = i11IO0ii.I0000Il00O;
                    }
/* 44 */            if (i0lolloo00.I00111O()) {
/* 50 */                nativePipelineImpl = new l1I0oI(17);
/* 53 */                this.zbc = nativePipelineImpl;
                    } else if (i0lolloo00.I0010o()) {
/* 65 */                nativePipelineImpl = new NativePipelineImpl(this, this, this, i11io0ii);
/* 68 */                this.zbc = nativePipelineImpl;
                    } else {
/* 73 */                nativePipelineImpl = new NativePipelineImpl(this, this, this, i11io0ii);
/* 78 */                System.loadLibrary("mlkit_google_ocr_pipeline");
/* 81 */                this.zbc = nativePipelineImpl;
                    }
/* 55 */            i0i0lO11loi i0i0lo11loi = nativePipelineImpl;
/* 88 */            if (i0lolloo00.I001IIilI0O()) {
/* 99 */                this.zbb = new i0lloI0(i0lolloo00.I000oI1ioi());
                    } else {
/* 109 */               this.zbb = new i0lloI0(10);
                    }
/* 111 */           this.zba = i11io0ii;
/* 113 */           long jInitializeFrameManager = i0i0lo11loi.initializeFrameManager();
/* 117 */           this.zbe = jInitializeFrameManager;
/* 119 */           long jInitializeFrameBufferReleaseCallback = i0i0lo11loi.initializeFrameBufferReleaseCallback(jInitializeFrameManager);
/* 123 */           this.zbf = jInitializeFrameBufferReleaseCallback;
/* 125 */           long jInitializeResultsCallback = i0i0lo11loi.initializeResultsCallback();
/* 129 */           this.zbg = jInitializeResultsCallback;
/* 131 */           long jInitializeIsolationCallback = i0i0lo11loi.initializeIsolationCallback();
/* 135 */           this.zbh = jInitializeIsolationCallback;
/* 149 */           this.zbd = i0i0lo11loi.initialize(i0lolloo00.I00000oOI(), jInitializeFrameBufferReleaseCallback, jInitializeResultsCallback, jInitializeIsolationCallback, 0L, 0L);
                }

                public final void zba(long j) {
/* 1 */             i0lloI0 i0lloi0 = this.zbb;
                    synchronized (i0lloi0) {
/* 10 */                i0lloi0.I00000oOI.remove(Long.valueOf(j));
                    }
                }

                public final int zbb(String str) {
/* 5 */             Log.w("VKP", "openFileDescriptor called but is not available for this pipeline. Ignoring call.");
/* 8 */             return -1;
                }

                public final void zbc(int i) {
/* 5 */             Log.w("VKP", "closeFileDescriptor called but is not available for this pipeline. Ignoring call.");
                }

                public final void zbd(i0o10lO1i i0o10lo1i) {
/* 7 */             String strConcat = "Pipeline received results: ".concat(String.valueOf(i0o10lo1i));
/* 18 */            if (Log.isLoggable("VisionKit", 4)) {
/* 24 */                Log.i("VisionKit", liO1oilOi.I00000oIO(strConcat, this));
                    }
                }

                public final i101olIl0OiI zbe(i0llli i0llliVar) {
/* 12 */            if (this.zbd == 0) {
/* 130 */               I000II.I001IO000("Pipeline has been closed or was not initialized");
/* 11 */                return null;
                    }
/* 14 */            i0lloI0 i0lloi0 = this.zbb;
/* 16 */            long j = i0llliVar.I00000oOI;
                    synchronized (i0lloi0) {
/* 29 */                if (i0lloi0.I00000oOI.size() == i0lloi0.I00000oIO) {
/* 39 */                    String str = "Buffer is full. Drop frame " + j;
/* 50 */                    if (Log.isLoggable("VisionKit", 5)) {
/* 58 */                        Log.w("VisionKit", liO1oilOi.I00000oIO(str, i0lloi0));
                            }
                        } else {
/* 71 */                    i0lloi0.I00000oOI.put(Long.valueOf(j), i0llliVar);
/* 75 */                    i0i0lO11loi i0i0lo11loi = this.zbc;
/* 77 */                    long j2 = this.zbd;
/* 79 */                    long j3 = this.zbe;
/* 81 */                    long j4 = i0llliVar.I00000oOI;
/* 83 */                    byte[] bArr = i0llliVar.I00000oIO;
/* 85 */                    i0o0li i0o0liVar = i0llliVar.I0000Il00O;
/* 99 */                    byte[] bArrProcess = i0i0lo11loi.process(j2, j3, j4, bArr, i0o0liVar.I00000oIO, i0o0liVar.I00000oOI, 1, i0llliVar.I0000O - 1);
/* 103 */                   if (bArrProcess != null) {
                                try {
/* 114 */                           return i101olIl0OiI.I0000O(i0o10lO1i.I00100l0(bArrProcess, this.zba));
                                } catch (i11i01Oo e) {
/* 122 */                           IoOOl0iOl1io.I000l1("Could not parse results", e);
/* 11 */                            return null;
                                }
                            }
                        }
                    }
/* 105 */           return i101o1.I00iOIl;
                }

                public final synchronized void zbf() {
/* 4 */             long j = this.zbd;
/* 10 */            if (j != 0) {
/* 14 */                this.zbc.stop(j);
/* 30 */                this.zbc.close(this.zbd, this.zbe, this.zbf, this.zbg, this.zbh);
/* 33 */                this.zbd = 0L;
/* 37 */                this.zbc.I000l1();
                    }
                }

                public final void zbg() throws PipelineException {
/* 1 */             long j = this.zbd;
/* 7 */             if (j == 0) {
/* 113 */               throw new PipelineException(9, "Pipeline has been closed or was not initialized");
                    }
                    try {
/* 11 */                this.zbc.start(j);
/* 18 */                this.zbc.waitUntilIdle(this.zbd);
                    } catch (PipelineException e) {
/* 27 */                this.zbc.stop(this.zbd);
/* 30 */                throw e;
                    }
                }

                public final void zbh() {
/* 1 */             long j = this.zbd;
/* 7 */             if (j == 0) {
/* 26 */                I000II.I001IO000("Pipeline has been closed or was not initialized");
                    } else {
/* 15 */                if (this.zbc.stop(j)) {
/* 17 */                    return;
                        }
/* 20 */                I000II.I001IO000("Pipeline did not stop successfully.");
                    }
                }

                public final i101olIl0OiI zbi(long j, Bitmap bitmap, int i) {
/* 8 */             if (this.zbd == 0) {
/* 84 */                I000II.I001IO000("Pipeline has been closed or was not initialized");
/* 7 */                 return null;
                    }
/* 16 */            if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
/* 78 */                I000II.I000iOII("Unsupported bitmap config ".concat(String.valueOf(bitmap.getConfig())));
/* 7 */                 return null;
                    }
/* 36 */            byte[] bArrProcessBitmap = this.zbc.processBitmap(this.zbd, j, bitmap, bitmap.getWidth(), bitmap.getHeight(), 0, i - 1);
/* 40 */            if (bArrProcessBitmap == null) {
/* 42 */                return i101o1.I00iOIl;
                    }
                    try {
/* 51 */                return i101olIl0OiI.I0000O(i0o10lO1i.I00100l0(bArrProcessBitmap, this.zba));
                    } catch (i11i01Oo e) {
/* 60 */                IoOOl0iOl1io.I000l1("Could not parse results", e);
/* 7 */                 return null;
                    }
                }

                public final i101olIl0OiI zbj(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
/* 10 */            if (this.zbd == 0) {
/* 89 */                I000II.I001IO000("Pipeline has been closed or was not initialized");
/* 9 */                 return null;
                    }
/* 16 */            if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
/* 83 */                I000II.I001IO000("Byte buffers are not direct.");
/* 9 */                 return null;
                    }
/* 54 */            byte[] bArrProcessYuvFrame = this.zbc.processYuvFrame(this.zbd, j, byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5, i6 - 1);
/* 58 */            if (bArrProcessYuvFrame == null) {
/* 60 */                return i101o1.I00iOIl;
                    }
                    try {
/* 69 */                return i101olIl0OiI.I0000O(i0o10lO1i.I00100l0(bArrProcessYuvFrame, this.zba));
                    } catch (i11i01Oo e) {
/* 77 */                IoOOl0iOl1io.I000l1("Could not parse results", e);
/* 9 */                 return null;
                    }
                }
            }
