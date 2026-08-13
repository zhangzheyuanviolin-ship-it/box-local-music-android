            package p000;

            import android.graphics.Bitmap;
            import android.graphics.SurfaceTexture;
            import android.opengl.GLES20;
            import android.opengl.Matrix;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.util.Size;
            import android.view.Surface;
            import androidx.camera.core.ImageProcessingUtil;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class IiI1oOoo implements Olioli, SurfaceTexture.OnFrameAvailableListener {
                public OIi0ooo0l1 I00000oIO;
                public HandlerThread I00000oOI;
                public Io11oioo I0000Il00O;
                public Handler I0000O;
                public AtomicBoolean I0000oI00;
                public float[] I0001Ioi1lo;
                public float[] I000II;
                public LinkedHashMap I000O01llI0;
                public int I000OOo1O;
                public boolean I000OiO;
                public ArrayList I000iOII;

                @Override
                public final void I00000oIO() {
/* 8 */             if (this.I0000oI00.getAndSet(true)) {
/* 10 */                return;
                    }
/* 15 */            I0100i i0100i = new I0100i(19);
/* 18 */            i0100i.I00iiI = this;
/* 20 */            VarHandle.storeStoreFence();
/* 29 */            I0001Ioi1lo(i0100i, new I0il01i00i(2));
                }

                @Override
                public final void I00000oOI(Oll0I0l1i1 oll0I0l1i1) {
/* 7 */             if (this.I0000oI00.get()) {
/* 9 */                 oll0I0l1i1.I0000Il00O();
/* 12 */                return;
                    }
/* 17 */            I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(25);
/* 20 */            i0iOo0oioiO.I00iiI = this;
/* 22 */            i0iOo0oioiO.I00iiO = oll0I0l1i1;
/* 24 */            VarHandle.storeStoreFence();
/* 30 */            IiI1lo0lOI iiI1lo0lOI = new IiI1lo0lOI(0);
/* 33 */            iiI1lo0lOI.I00iiI = oll0I0l1i1;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            I0001Ioi1lo(i0iOo0oioiO, iiI1lo0lOI);
                }

                @Override
                public final ListenableFuture I0000Il00O(int i, int i2) {
/* 3 */             IiI1li iiI1li = new IiI1li();
/* 6 */             iiI1li.I00iOIl = this;
/* 8 */             iiI1li.I00iiI = i;
/* 10 */            iiI1li.I00iiO = i2;
/* 12 */            VarHandle.storeStoreFence();
/* 19 */            return iIllIoiiIO.I0000oI00(iOiiloIII0O.I00000oIO(iiI1li));
                }

                @Override
                public final void I0000O(OliolIlIO oliolIlIO) {
/* 7 */             if (this.I0000oI00.get()) {
/* 9 */                 oliolIlIO.close();
/* 12 */                return;
                    }
/* 17 */            I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(24);
/* 20 */            i0iOo0oioiO.I00iiI = this;
/* 22 */            i0iOo0oioiO.I00iiO = oliolIlIO;
/* 24 */            VarHandle.storeStoreFence();
/* 31 */            I0100i i0100i = new I0100i(18);
/* 34 */            i0100i.I00iiI = oliolIlIO;
/* 36 */            VarHandle.storeStoreFence();
/* 39 */            I0001Ioi1lo(i0iOo0oioiO, i0100i);
                }

                public final void I0000oI00() {
/* 1 */             LinkedHashMap linkedHashMap = this.I000O01llI0;
/* 5 */             if (this.I000OiO && this.I000OOo1O == 0) {
/* 15 */                Iterator it = linkedHashMap.keySet().iterator();
/* 23 */                while (it.hasNext()) {
/* 31 */                    ((OliolIlIO) it.next()).close();
                        }
/* 37 */                Iterator it2 = this.I000iOII.iterator();
/* 45 */                while (it2.hasNext()) {
/* 62 */                    ((I1ioiIOl0) it2.next()).I0000Il00O.I0000O(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
                        }
/* 66 */                linkedHashMap.clear();
/* 69 */                OIi0ooo0l1 oIi0ooo0l1 = this.I00000oIO;
/* 80 */                if (((AtomicBoolean) oIi0ooo0l1.I00iiO).getAndSet(false)) {
/* 87 */                    Ilo0O01IO.I0000Il00O((Thread) oIi0ooo0l1.I00ilI0I1);
/* 90 */                    oIi0ooo0l1.I000lI();
                        }
/* 95 */                this.I00000oOI.quit();
                    }
                }

                public final void I0001Ioi1lo(Runnable runnable, Runnable runnable2) {
                    try {
/* 1 */                 Io11oioo io11oioo = this.I0000Il00O;
/* 6 */                 I00ioIO i00ioIO = new I00ioIO(6);
/* 9 */                 i00ioIO.I00iiI = this;
/* 11 */                i00ioIO.I00iiO = runnable2;
/* 13 */                i00ioIO.I00iio = runnable;
/* 15 */                VarHandle.storeStoreFence();
/* 18 */                io11oioo.execute(i00ioIO);
                    } catch (RejectedExecutionException e) {
/* 27 */                l11I11lO.I0001Ioi1lo("DefaultSurfaceProcessor", "Unable to executor runnable", e);
/* 30 */                runnable2.run();
                    }
                }

                public final void I000II(Exception exc) {
/* 1 */             ArrayList arrayList = this.I000iOII;
/* 3 */             Iterator it = arrayList.iterator();
/* 11 */            while (it.hasNext()) {
/* 21 */                ((I1ioiIOl0) it.next()).I0000Il00O.I0000O(exc);
                    }
/* 25 */            arrayList.clear();
                }

                public final Bitmap I000O01llI0(Size size, float[] fArr, int i) {
/* 7 */             float[] fArr2 = (float[]) fArr.clone();
/* 10 */            l1II0ioIoOo.I00000oIO(fArr2, i);
/* 13 */            l1II0ioIoOo.I00000oOI(fArr2);
/* 18 */            Size sizeI000II = OoI0lIiO.I000II(i, size);
/* 24 */            OIi0ooo0l1 oIi0ooo0l1 = this.I00000oIO;
/* 26 */            oIi0ooo0l1.getClass();
/* 40 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeI000II.getHeight() * sizeI000II.getWidth() * 4);
/* 67 */            lII1OI11o1I.I00000oIO("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeI000II.getHeight() * sizeI000II.getWidth()) * 4);
/* 76 */            lII1OI11o1I.I00000oIO("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
/* 79 */            int[] iArr = Ilo0O01IO.I00000oIO;
/* 81 */            int[] iArr2 = new int[1];
/* 83 */            GLES20.glGenTextures(1, iArr2, 0);
/* 88 */            Ilo0O01IO.I00000oOI("glGenTextures");
/* 91 */            int i2 = iArr2[0];
/* 96 */            GLES20.glActiveTexture(33985);
/* 101 */           Ilo0O01IO.I00000oOI("glActiveTexture");
/* 106 */           GLES20.glBindTexture(3553, i2);
/* 111 */           Ilo0O01IO.I00000oOI("glBindTexture");
/* 136 */           GLES20.glTexImage2D(3553, 0, 6407, sizeI000II.getWidth(), sizeI000II.getHeight(), 0, 6407, 5121, null);
/* 141 */           Ilo0O01IO.I00000oOI("glTexImage2D");
/* 148 */           GLES20.glTexParameteri(3553, 10240, 9729);
/* 153 */           GLES20.glTexParameteri(3553, 10241, 9729);
/* 156 */           int[] iArr3 = new int[1];
/* 158 */           GLES20.glGenFramebuffers(1, iArr3, 0);
/* 163 */           Ilo0O01IO.I00000oOI("glGenFramebuffers");
/* 166 */           int i3 = iArr3[0];
/* 171 */           GLES20.glBindFramebuffer(36160, i3);
/* 176 */           Ilo0O01IO.I00000oOI("glBindFramebuffer");
/* 182 */           GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
/* 187 */           Ilo0O01IO.I00000oOI("glFramebufferTexture2D");
/* 193 */           GLES20.glActiveTexture(33984);
/* 196 */           Ilo0O01IO.I00000oOI("glActiveTexture");
/* 204 */           GLES20.glBindTexture(36197, oIi0ooo0l1.I00iOIl);
/* 207 */           Ilo0O01IO.I00000oOI("glBindTexture");
/* 211 */           oIi0ooo0l1.I00l0OO0IO = null;
/* 221 */           GLES20.glViewport(0, 0, sizeI000II.getWidth(), sizeI000II.getHeight());
/* 232 */           GLES20.glScissor(0, 0, sizeI000II.getWidth(), sizeI000II.getHeight());
/* 237 */           Ilo01OlO1 ilo01OlO1 = (Ilo01OlO1) oIi0ooo0l1.I00ll1;
/* 239 */           ilo01OlO1.getClass();
/* 244 */           if (ilo01OlO1 instanceof Ilo0IIoOoo) {
/* 250 */               GLES20.glUniformMatrix4fv(((Ilo0IIoOoo) ilo01OlO1).I0001Ioi1lo, 1, false, fArr2, 0);
/* 255 */               Ilo0O01IO.I00000oOI("glUniformMatrix4fv");
                    }
/* 259 */           GLES20.glDrawArrays(5, 0, 4);
/* 264 */           Ilo0O01IO.I00000oOI("glDrawArrays");
/* 292 */           GLES20.glReadPixels(0, 0, sizeI000II.getWidth(), sizeI000II.getHeight(), 6408, 5121, byteBufferAllocateDirect);
/* 297 */           Ilo0O01IO.I00000oOI("glReadPixels");
/* 300 */           GLES20.glBindFramebuffer(36160, 0);
/* 307 */           GLES20.glDeleteTextures(1, new int[]{i2}, 0);
/* 312 */           Ilo0O01IO.I00000oOI("glDeleteTextures");
/* 319 */           GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
/* 324 */           Ilo0O01IO.I00000oOI("glDeleteFramebuffers");
/* 327 */           int i4 = oIi0ooo0l1.I00iOIl;
/* 329 */           GLES20.glActiveTexture(33984);
/* 332 */           Ilo0O01IO.I00000oOI("glActiveTexture");
/* 335 */           GLES20.glBindTexture(36197, i4);
/* 338 */           Ilo0O01IO.I00000oOI("glBindTexture");
/* 351 */           Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeI000II.getWidth(), sizeI000II.getHeight(), Bitmap.Config.ARGB_8888);
/* 355 */           byteBufferAllocateDirect.rewind();
/* 364 */           ImageProcessingUtil.I0000oI00(bitmapCreateBitmap, byteBufferAllocateDirect, sizeI000II.getWidth() * 4);
/* 408 */           return bitmapCreateBitmap;
                }

                public final void I000OOo1O(Iio1oiI iio1oiI) {
/* 1 */             Map map = Collections.EMPTY_MAP;
/* 6 */             IIoIil iIoIil = new IIoIil(4);
/* 9 */             iIoIil.I00iiI = this;
/* 11 */            iIoIil.I00iiO = iio1oiI;
/* 13 */            VarHandle.storeStoreFence();
                    try {
/* 20 */                iOiiloIII0O.I00000oIO(iIoIil).get();
                    } catch (InterruptedException | ExecutionException e) {
/* 24 */                e = e;
/* 27 */                if (e instanceof ExecutionException) {
/* 29 */                    e = e.getCause();
                        }
/* 35 */                if (e instanceof RuntimeException) {
/* 77 */                    throw ((RuntimeException) e);
                        }
/* 39 */                IoOOl0iOl1io.I000l1("Failed to create DefaultSurfaceProcessor", e);
                    }
                }

                public final void I000OiO(OoIlOii ooIlOii) throws IOException {
/* 1 */             ArrayList arrayList = this.I000iOII;
/* 7 */             if (arrayList.isEmpty()) {
/* 9 */                 return;
                    }
/* 10 */            if (ooIlOii == null) {
/* 19 */                I000II(new Exception("Failed to snapshot: no JPEG Surface."));
/* 22 */                return;
                    }
                    try {
/* 25 */                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
/* 28 */                    Iterator it = arrayList.iterator();
/* 34 */                    int i = -1;
/* 35 */                    int i2 = -1;
/* 36 */                    Bitmap bitmapI000O01llI0 = null;
/* 37 */                    byte[] byteArray = null;
/* 42 */                    while (it.hasNext()) {
/* 48 */                        I1ioiIOl0 i1ioiIOl0 = (I1ioiIOl0) it.next();
/* 50 */                        int i3 = i1ioiIOl0.I00000oOI;
/* 52 */                        int i4 = i1ioiIOl0.I00000oIO;
/* 54 */                        if (i != i3 || bitmapI000O01llI0 == null) {
/* 58 */                            if (bitmapI000O01llI0 != null) {
/* 60 */                                bitmapI000O01llI0.recycle();
                                    }
/* 74 */                            bitmapI000O01llI0 = I000O01llI0((Size) ooIlOii.I00iiI, (float[]) ooIlOii.I00iiO, i3);
/* 78 */                            i2 = -1;
/* 79 */                            i = i3;
                                }
/* 80 */                        if (i2 != i4) {
/* 82 */                            byteArrayOutputStream.reset();
/* 87 */                            bitmapI000O01llI0.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
/* 90 */                            byteArray = byteArrayOutputStream.toByteArray();
/* 94 */                            i2 = i4;
                                }
/* 97 */                        Surface surface = (Surface) ooIlOii.I00iOIl;
/* 99 */                        Objects.requireNonNull(byteArray);
/* 102 */                       ImageProcessingUtil.I000OiO(byteArray, surface);
/* 107 */                       i1ioiIOl0.I0000Il00O.I00000oOI(null);
/* 110 */                       it.remove();
                            }
/* 114 */                   byteArrayOutputStream.close();
                        } finally {
                        }
                    } catch (IOException e) {
/* 129 */               I000II(e);
                    }
                }

                @Override
                public final void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
/* 1 */             float[] fArr = this.I0001Ioi1lo;
/* 3 */             float[] fArr2 = this.I000II;
/* 11 */            if (this.I0000oI00.get()) {
/* 168 */               return;
                    }
/* 15 */            surfaceTexture.updateTexImage();
/* 18 */            surfaceTexture.getTransformMatrix(fArr);
/* 32 */            OoIlOii ooIlOii = null;
/* 37 */            for (Map.Entry entry : this.I000O01llI0.entrySet()) {
/* 50 */                Surface surface = (Surface) entry.getValue();
/* 56 */                OliolIlIO oliolIlIO = (OliolIlIO) entry.getKey();
/* 63 */                Matrix.multiplyMM(fArr2, 0, fArr, 0, oliolIlIO.I00ilI0I1, 0);
/* 66 */                int i = oliolIlIO.I00iiO;
/* 70 */                if (i == 34) {
                            try {
/* 78 */                        this.I00000oIO.I00100l0(surfaceTexture.getTimestamp(), fArr2, surface);
                            } catch (RuntimeException e) {
/* 87 */                        l11I11lO.I00000oOI("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                            }
                        } else {
/* 114 */                   lII1OI11o1I.I0000oI00("Unsupported format: " + i, i == 256);
/* 122 */                   lII1OI11o1I.I0000oI00("Only one JPEG output is supported.", ooIlOii == null);
/* 135 */                   ooIlOii = new OoIlOii(surface, oliolIlIO.I00iio, (float[]) fArr2.clone());
                        }
                    }
                    try {
/* 140 */               I000OiO(ooIlOii);
                    } catch (RuntimeException e2) {
/* 146 */               I000II(e2);
                    }
                }
            }
