            package p000;

            import android.graphics.RectF;
            import android.opengl.Matrix;
            import android.util.Size;
            import android.view.Surface;
            import java.io.Closeable;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class OliolIlIO implements Closeable {
                public Object I00iOIl;
                public Surface I00iiI;
                public int I00iiO;
                public Size I00iio;
                public float[] I00ilI0I1;
                public float[] I00ilO0;
                public IOo1llI I00io1l;
                public Executor I00ioIO;
                public boolean I00l0I0l0lO1;
                public boolean I00l0OO0IO;
                public IIiOOI I00li1OI;

                public static void I00000oIO(float[] fArr, float[] fArr2, I1lIol0O i1lIol0O) {
/* 2 */             Matrix.setIdentityM(fArr, 0);
/* 5 */             if (i1lIol0O == null) {
/* 7 */                 return;
                    }
/* 8 */             Size size = i1lIol0O.I00000oIO;
/* 10 */            boolean z = i1lIol0O.I0000oI00;
/* 12 */            int i = i1lIol0O.I0000O;
/* 14 */            l1II0ioIoOo.I00000oOI(fArr);
/* 18 */            l1II0ioIoOo.I00000oIO(fArr, i);
/* 26 */            if (z) {
/* 28 */                Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
/* 31 */                Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
                    }
/* 46 */            android.graphics.Matrix matrixI00000oIO = OoI0lIiO.I00000oIO(OoI0lIiO.I000O01llI0(size), OoI0lIiO.I000O01llI0(OoI0lIiO.I000II(i, size)), i, z);
/* 54 */            RectF rectF = new RectF(i1lIol0O.I00000oOI);
/* 57 */            matrixI00000oIO.mapRect(rectF);
/* 67 */            float width = rectF.left / r7.getWidth();
/* 86 */            float height = ((r7.getHeight() - rectF.height()) - rectF.top) / r7.getHeight();
/* 96 */            float fWidth = rectF.width() / r7.getWidth();
/* 106 */           float fHeight = rectF.height() / r7.getHeight();
/* 107 */           Matrix.translateM(fArr, 0, width, height, 0.0f);
/* 110 */           Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
/* 113 */           IIllOo0 iIllOo0 = i1lIol0O.I0000Il00O;
/* 115 */           Matrix.setIdentityM(fArr2, 0);
/* 118 */           l1II0ioIoOo.I00000oOI(fArr2);
/* 121 */           if (iIllOo0 != null) {
/* 129 */               lII1OI11o1I.I0000oI00("Camera has no transform.", iIllOo0.I00100o1O0lo());
/* 141 */               l1II0ioIoOo.I00000oIO(fArr2, iIllOo0.I0000Il00O().I0000oI00());
/* 148 */               if (iIllOo0.I0001Ioi1lo()) {
/* 150 */                   Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
/* 153 */                   Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
                        }
                    }
/* 156 */           Matrix.invertM(fArr2, 0, fArr2, 0);
/* 165 */           Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
                }

                public final Surface I0000Il00O(Io11oioo io11oioo, IOo1llI iOo1llI) {
                    boolean z;
                    synchronized (this.I00iOIl) {
/* 4 */                 this.I00ioIO = io11oioo;
/* 6 */                 this.I00io1l = iOo1llI;
/* 8 */                 z = this.I00l0I0l0lO1;
                    }
/* 11 */            if (z) {
/* 13 */                I000II();
                    }
/* 16 */            return this.I00iiI;
                }

                public final void I000II() {
                    Executor executor;
                    IOo1llI iOo1llI;
/* 3 */             AtomicReference atomicReference = new AtomicReference();
                    synchronized (this.I00iOIl) {
                        try {
/* 11 */                    if (this.I00ioIO == null || (iOo1llI = this.I00io1l) == null) {
/* 34 */                        this.I00l0I0l0lO1 = true;
                            } else if (!this.I00l0OO0IO) {
/* 22 */                        atomicReference.set(iOo1llI);
/* 25 */                        executor = this.I00ioIO;
/* 28 */                        this.I00l0I0l0lO1 = false;
                            }
/* 36 */                    executor = null;
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
/* 38 */            if (executor != null) {
                        try {
/* 44 */                    Io11iII11ll io11iII11ll = new Io11iII11ll(17);
/* 47 */                    io11iII11ll.I00iiI = this;
/* 49 */                    io11iII11ll.I00iiO = atomicReference;
/* 51 */                    VarHandle.storeStoreFence();
/* 54 */                    executor.execute(io11iII11ll);
                        } catch (RejectedExecutionException unused) {
/* 61 */                    l11I11lO.I0000O(3, "SurfaceOutputImpl");
                        }
                    }
                }

                @Override
                public final void close() {
                    synchronized (this.I00iOIl) {
                        try {
/* 6 */                     if (!this.I00l0OO0IO) {
/* 9 */                         this.I00l0OO0IO = true;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 18 */            this.I00li1OI.I00000oOI(null);
                }
            }
