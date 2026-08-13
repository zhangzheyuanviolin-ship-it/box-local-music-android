            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.media.ImageWriter;
            import androidx.camera.core.ImageProcessingUtil;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.util.concurrent.Executor;
            
            public abstract class Ioi0O0l1Ol implements IoiO1iOOil11 {
                public IoOoo0ll I00iOIl;
                public volatile int I00iiI;
                public volatile int I00iiO;
                public volatile boolean I00ilI0I1;
                public volatile boolean I00ilO0;
                public Executor I00io1l;
                public OOlli1l1lOlI I00ioIO;
                public ImageWriter I00l0I0l0lO1;
                public ByteBuffer I00lll10;
                public ByteBuffer I00o0iI0io1;
                public ByteBuffer I00o0l1o1o0;
                public ByteBuffer I00o101lO;
                public ByteBuffer I00oI0i;
                public ByteBuffer I00oII;
                public volatile int I00iio = 1;
                public Rect I00l0OO0IO = new Rect();
                public Rect I00li1OI = new Rect();
                public Matrix I00ll1 = new Matrix();
                public Matrix I00lli11 = new Matrix();
                public final Object I00oIiI10 = new Object();
                public boolean I00oO101o = true;

                public abstract IoiO1IO1I1i I00000oIO(IoiO1ilO ioiO1ilO);

                /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final ListenableFuture I00000oOI(IoiO1IO1I1i ioiO1IO1I1i) throws Throwable {
                    Object obj;
                    Executor executor;
                    IoOoo0ll ioOoo0ll;
                    boolean z;
                    OOlli1l1lOlI oOlli1l1lOlI;
                    ImageWriter imageWriter;
                    ByteBuffer byteBuffer;
                    ByteBuffer byteBuffer2;
                    ByteBuffer byteBuffer3;
                    ByteBuffer byteBuffer4;
                    ByteBuffer byteBuffer5;
                    ByteBuffer byteBuffer6;
                    IoiO1IO1I1i ioiO1IO1I1iI000OOo1O;
/* 3 */             IoiO1IO1I1i ioiO1IO1I1i2 = ioiO1IO1I1i;
/* 13 */            int i = this.I00ilI0I1 ? this.I00iiI : 0;
/* 14 */            Object obj2 = this.I00oIiI10;
                    synchronized (obj2) {
                        try {
                            try {
/* 17 */                        executor = this.I00io1l;
/* 19 */                        ioOoo0ll = this.I00iOIl;
/* 36 */                        z = this.I00ilI0I1 && i != this.I00iiO;
/* 37 */                        if (z) {
/* 39 */                            I000O01llI0(ioiO1IO1I1i2, i);
                                }
/* 45 */                        if (this.I00ilI0I1 || this.I00iio == 3) {
/* 54 */                            I0000oI00(ioiO1IO1I1i);
                                }
                                try {
/* 58 */                            oOlli1l1lOlI = this.I00ioIO;
                                } catch (Throwable th) {
/* 273 */                           th = th;
/* 274 */                           obj = obj2;
                                }
                            } catch (Throwable th2) {
/* 268 */                       th = th2;
                            }
                            try {
/* 61 */                        imageWriter = this.I00l0I0l0lO1;
/* 63 */                        byteBuffer = this.I00lll10;
/* 66 */                        byteBuffer2 = this.I00o0iI0io1;
/* 69 */                        byteBuffer3 = this.I00o0l1o1o0;
/* 71 */                        byteBuffer4 = this.I00o101lO;
/* 75 */                        byteBuffer5 = this.I00oI0i;
/* 77 */                        byteBuffer6 = this.I00oII;
                            } catch (Throwable th3) {
/* 270 */                       th = th3;
/* 271 */                       obj = obj2;
/* 437 */                       throw th;
                            }
                        } catch (Throwable th4) {
/* 32 */                    th = th4;
/* 33 */                    obj = obj2;
                        }
                    }
/* 80 */            if (ioOoo0ll == null || executor == null || !this.I00oO101o) {
/* 264 */               return new Ioil1IIo(new OIiOolI10lO0("No analyzer or executor currently set."), 1);
                    }
/* 88 */            int i2 = this.I00iio;
/* 90 */            if (oOlli1l1lOlI != null) {
/* 93 */                if (i2 == 2) {
/* 97 */                    ioiO1IO1I1iI000OOo1O = ImageProcessingUtil.I0000O(ioiO1IO1I1i2, oOlli1l1lOlI, byteBuffer, i, this.I00ilO0);
                        } else if (this.I00iio != 1) {
/* 131 */                   ioiO1IO1I1i2 = ioiO1IO1I1i;
/* 165 */                   ioiO1IO1I1iI000OOo1O = null;
                        } else {
/* 108 */                   if (this.I00ilO0) {
/* 110 */                       ImageProcessingUtil.I00000oIO(ioiO1IO1I1i2);
                            }
/* 113 */                   if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
/* 124 */                       ioiO1IO1I1iI000OOo1O = ImageProcessingUtil.I000O01llI0(ioiO1IO1I1i2, oOlli1l1lOlI, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
/* 128 */                       ioiO1IO1I1i2 = ioiO1IO1I1i;
                            }
                        }
                    } else if (i2 == 3) {
/* 140 */               if (this.I00ilO0) {
/* 142 */                   ImageProcessingUtil.I00000oIO(ioiO1IO1I1i);
                        }
/* 145 */               if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
/* 155 */                   ioiO1IO1I1i2 = ioiO1IO1I1i;
/* 160 */                   ioiO1IO1I1iI000OOo1O = ImageProcessingUtil.I000OOo1O(ioiO1IO1I1i2, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i);
                        }
                    }
/* 170 */           boolean z2 = ioiO1IO1I1iI000OOo1O == null;
/* 171 */           if (z2) {
/* 173 */               ioiO1IO1I1iI000OOo1O = ioiO1IO1I1i2;
                    }
/* 176 */           Rect rect = new Rect();
/* 181 */           Matrix matrix = new Matrix();
                    synchronized (this.I00oIiI10) {
/* 187 */               if (z && !z2) {
                            try {
/* 207 */                       I000II(ioiO1IO1I1i2.I0001Ioi1lo(), ioiO1IO1I1i2.I0000O(), ioiO1IO1I1iI000OOo1O.I0001Ioi1lo(), ioiO1IO1I1iI000OOo1O.I0000O());
                            } finally {
                            }
                        }
/* 213 */               this.I00iiO = i;
/* 217 */               rect.set(this.I00li1OI);
/* 222 */               matrix.set(this.I00lli11);
                    }
/* 228 */           Ioi0IO1l ioi0IO1l = new Ioi0IO1l();
/* 231 */           ioi0IO1l.I00iOIl = this;
/* 233 */           ioi0IO1l.I00iiI = executor;
/* 235 */           ioi0IO1l.I00iiO = ioiO1IO1I1i2;
/* 237 */           ioi0IO1l.I00iio = matrix;
/* 239 */           ioi0IO1l.I00ilI0I1 = ioiO1IO1I1iI000OOo1O;
/* 241 */           ioi0IO1l.I00ilO0 = rect;
/* 243 */           ioi0IO1l.I00io1l = ioOoo0ll;
/* 245 */           VarHandle.storeStoreFence();
/* 248 */           return iOiiloIII0O.I00000oIO(ioi0IO1l);
                }

                @Override
                public final void I0000Il00O(IoiO1ilO ioiO1ilO) {
                    try {
/* 1 */                 IoiO1IO1I1i ioiO1IO1I1iI00000oIO = I00000oIO(ioiO1ilO);
/* 5 */                 if (ioiO1IO1I1iI00000oIO != null) {
/* 7 */                     I0001Ioi1lo(ioiO1IO1I1iI00000oIO);
                        }
                    } catch (IllegalStateException e) {
/* 16 */                l11I11lO.I00000oOI("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
                    }
                }

                public abstract void I0000O();

                public final void I0000oI00(IoiO1IO1I1i ioiO1IO1I1i) {
/* 6 */             if (this.I00iio != 1 && this.I00iio != 3) {
/* 15 */                if (this.I00iio == 2 && this.I00lll10 == null) {
/* 36 */                    this.I00lll10 = ByteBuffer.allocateDirect(ioiO1IO1I1i.I0000O() * ioiO1IO1I1i.I0001Ioi1lo() * 4);
/* 38 */                    return;
                        }
/* 168 */               return;
                    }
/* 39 */            ByteBuffer byteBufferAllocateDirect = this.I00o0iI0io1;
/* 41 */            if (byteBufferAllocateDirect == null) {
/* 52 */                byteBufferAllocateDirect = ByteBuffer.allocateDirect(ioiO1IO1I1i.I0000O() * ioiO1IO1I1i.I0001Ioi1lo());
/* 56 */                this.I00o0iI0io1 = byteBufferAllocateDirect;
                    }
/* 59 */            byteBufferAllocateDirect.position(0);
/* 62 */            ByteBuffer byteBufferAllocateDirect2 = this.I00o0l1o1o0;
/* 64 */            if (byteBufferAllocateDirect2 == null) {
/* 77 */                byteBufferAllocateDirect2 = ByteBuffer.allocateDirect((ioiO1IO1I1i.I0000O() * ioiO1IO1I1i.I0001Ioi1lo()) / 4);
/* 81 */                this.I00o0l1o1o0 = byteBufferAllocateDirect2;
                    }
/* 83 */            byteBufferAllocateDirect2.position(0);
/* 86 */            ByteBuffer byteBufferAllocateDirect3 = this.I00o101lO;
/* 88 */            if (byteBufferAllocateDirect3 == null) {
/* 101 */               byteBufferAllocateDirect3 = ByteBuffer.allocateDirect((ioiO1IO1I1i.I0000O() * ioiO1IO1I1i.I0001Ioi1lo()) / 4);
/* 105 */               this.I00o101lO = byteBufferAllocateDirect3;
                    }
/* 107 */           byteBufferAllocateDirect3.position(0);
/* 112 */           if (this.I00iio == 3) {
/* 114 */               ByteBuffer byteBufferAllocateDirect4 = this.I00oI0i;
/* 116 */               if (byteBufferAllocateDirect4 == null) {
/* 127 */                   byteBufferAllocateDirect4 = ByteBuffer.allocateDirect(ioiO1IO1I1i.I0000O() * ioiO1IO1I1i.I0001Ioi1lo());
/* 131 */                   this.I00oI0i = byteBufferAllocateDirect4;
                        }
/* 133 */               byteBufferAllocateDirect4.position(0);
/* 136 */               ByteBuffer byteBufferAllocateDirect5 = this.I00oII;
/* 138 */               if (byteBufferAllocateDirect5 == null) {
/* 150 */                   byteBufferAllocateDirect5 = ByteBuffer.allocateDirect((ioiO1IO1I1i.I0000O() * ioiO1IO1I1i.I0001Ioi1lo()) / 2);
/* 154 */                   this.I00oII = byteBufferAllocateDirect5;
                        }
/* 156 */               byteBufferAllocateDirect5.position(0);
                    }
                }

                public abstract void I0001Ioi1lo(IoiO1IO1I1i ioiO1IO1I1i);

                public final void I000II(int i, int i2, int i3, int i4) {
/* 1 */             int i5 = this.I00iiI;
/* 5 */             Matrix matrix = new Matrix();
/* 8 */             if (i5 > 0) {
/* 15 */                RectF rectF = new RectF(0.0f, 0.0f, i, i2);
/* 18 */                RectF rectF2 = OoI0lIiO.I00000oIO;
/* 20 */                Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
/* 22 */                matrix.setRectToRect(rectF, rectF2, scaleToFit);
/* 26 */                matrix.postRotate(i5);
/* 33 */                RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
/* 38 */                Matrix matrix2 = new Matrix();
/* 41 */                matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
/* 44 */                matrix.postConcat(matrix2);
                    }
/* 51 */            RectF rectF4 = new RectF(this.I00l0OO0IO);
/* 54 */            matrix.mapRect(rectF4);
/* 59 */            Rect rect = new Rect();
/* 62 */            rectF4.round(rect);
/* 65 */            this.I00li1OI = rect;
/* 71 */            this.I00lli11.setConcat(this.I00ll1, matrix);
                }

                public final void I000O01llI0(IoiO1IO1I1i ioiO1IO1I1i, int i) {
/* 1 */             OOlli1l1lOlI oOlli1l1lOlI = this.I00ioIO;
/* 3 */             if (oOlli1l1lOlI == null) {
/* 106 */               return;
                    }
/* 6 */             oOlli1l1lOlI.I000O01llI0();
/* 9 */             int iI0001Ioi1lo = ioiO1IO1I1i.I0001Ioi1lo();
/* 13 */            int iI0000O = ioiO1IO1I1i.I0000O();
/* 19 */            int iI0000Il00O = this.I00ioIO.I0000Il00O();
/* 25 */            int iI000oI1ioi = this.I00ioIO.I000oI1ioi();
/* 41 */            boolean z = i == 90 || i == 270;
/* 46 */            int i2 = z ? iI0000O : iI0001Ioi1lo;
/* 47 */            if (!z) {
/* 50 */                iI0001Ioi1lo = iI0000O;
                    }
/* 60 */            this.I00ioIO = new OOlli1l1lOlI(ioOI11II.I00000oIO(i2, iI0001Ioi1lo, iI0000Il00O, iI000oI1ioi));
/* 64 */            if (this.I00iio == 1) {
/* 66 */                ImageWriter imageWriter = this.I00l0I0l0lO1;
/* 68 */                if (imageWriter != null) {
/* 70 */                    imageWriter.close();
                        }
/* 89 */                this.I00l0I0l0lO1 = ImageWriter.newInstance(this.I00ioIO.getSurface(), this.I00ioIO.I000oI1ioi());
                    }
                }

                public final void I000OOo1O(Matrix matrix) {
                    synchronized (this.I00oIiI10) {
/* 4 */                 this.I00ll1 = matrix;
/* 13 */                this.I00lli11 = new Matrix(this.I00ll1);
                    }
                }

                public final void I000OiO(Rect rect) {
                    synchronized (this.I00oIiI10) {
/* 4 */                 this.I00l0OO0IO = rect;
/* 13 */                this.I00li1OI = new Rect(this.I00l0OO0IO);
                    }
                }
            }
