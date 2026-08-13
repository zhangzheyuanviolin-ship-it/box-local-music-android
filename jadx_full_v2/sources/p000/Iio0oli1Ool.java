            package p000;

            import android.graphics.SurfaceTexture;
            import android.opengl.EGL14;
            import android.opengl.EGLDisplay;
            import android.opengl.EGLExt;
            import android.opengl.EGLSurface;
            import android.opengl.GLES20;
            import android.opengl.Matrix;
            import android.util.Size;
            import android.view.Surface;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class Iio0oli1Ool extends OIi0ooo0l1 {
                public int I00lll10;
                public int I00o0iI0io1;
                public IOlO11lll0l I00o0l1o1o0;
                public IOlO11lll0l I00o101lO;

                @Override
                public final I1l0Oloi I000OOo1O(Iio1oiI iio1oiI) {
/* 1 */             Map map = Collections.EMPTY_MAP;
/* 3 */             I1l0Oloi i1l0OloiI000OOo1O = super.I000OOo1O(iio1oiI);
/* 11 */            this.I00lll10 = Ilo0O01IO.I000O01llI0();
/* 17 */            this.I00o0iI0io1 = Ilo0O01IO.I000O01llI0();
/* 29 */            return i1l0OloiI000OOo1O;
                }

                public final void I0010I0i(long j, Surface surface, OliolIlIO oliolIlIO, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
/* 6 */             Ilo0O01IO.I0000O((AtomicBoolean) this.I00iiO, true);
/* 13 */            Ilo0O01IO.I0000Il00O((Thread) this.I00ilI0I1);
/* 18 */            HashMap map = (HashMap) this.I00iio;
/* 26 */            lII1OI11o1I.I0000oI00("The surface is not registered.", map.containsKey(surface));
/* 33 */            I1l1o1OiOiI i1l1o1OiOiII0000O = (I1l1o1OiOiI) map.get(surface);
/* 35 */            Objects.requireNonNull(i1l1o1OiOiII0000O);
/* 40 */            if (i1l1o1OiOiII0000O == Ilo0O01IO.I000OiO) {
/* 42 */                i1l1o1OiOiII0000O = I0000O(surface);
/* 46 */                if (i1l1o1OiOiII0000O == null) {
/* 399 */                   return;
                        } else {
/* 49 */                    map.put(surface, i1l1o1OiOiII0000O);
                        }
                    }
/* 52 */            I1l1o1OiOiI i1l1o1OiOiI = i1l1o1OiOiII0000O;
/* 53 */            EGLSurface eGLSurface = i1l1o1OiOiI.I00000oIO;
/* 59 */            if (surface != ((Surface) this.I00l0OO0IO)) {
/* 61 */                I000iOII(eGLSurface);
/* 64 */                this.I00l0OO0IO = surface;
                    }
/* 69 */            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
/* 74 */            GLES20.glClear(16384);
/* 85 */            I0010o(i1l1o1OiOiI, oliolIlIO, surfaceTexture, this.I00o0l1o1o0, this.I00lll10, true);
/* 94 */            I0010o(i1l1o1OiOiI, oliolIlIO, surfaceTexture2, this.I00o101lO, this.I00o0iI0io1, false);
/* 101 */           EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.I00ilO0, eGLSurface, j);
/* 112 */           if (EGL14.eglSwapBuffers((EGLDisplay) this.I00ilO0, eGLSurface)) {
/* 399 */               return;
                    }
/* 138 */           l11I11lO.I0000oI00("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
/* 142 */           I000o00OoI0I(surface, false);
                }

                public final void I0010o(I1l1o1OiOiI i1l1o1OiOiI, OliolIlIO oliolIlIO, SurfaceTexture surfaceTexture, IOlO11lll0l iOlO11lll0l, int i, boolean z) {
/* 7 */             I00100o1O0lo(i);
/* 10 */            int i2 = i1l1o1OiOiI.I00000oOI;
/* 12 */            int i3 = i1l1o1OiOiI.I0000Il00O;
/* 15 */            GLES20.glViewport(0, 0, i2, i3);
/* 18 */            GLES20.glScissor(0, 0, i2, i3);
/* 23 */            float[] fArr = new float[16];
/* 27 */            surfaceTexture.getTransformMatrix(fArr);
/* 30 */            float[] fArr2 = new float[16];
/* 44 */            Matrix.multiplyMM(fArr2, 0, fArr, 0, z ? oliolIlIO.I00ilI0I1 : oliolIlIO.I00ilO0, 0);
/* 49 */            Ilo01OlO1 ilo01OlO1 = (Ilo01OlO1) this.I00ll1;
/* 51 */            ilo01OlO1.getClass();
/* 59 */            if (ilo01OlO1 instanceof Ilo0IIoOoo) {
/* 66 */                GLES20.glUniformMatrix4fv(((Ilo0IIoOoo) ilo01OlO1).I0001Ioi1lo, 1, false, fArr2, 0);
/* 69 */                Ilo0O01IO.I00000oOI("glUniformMatrix4fv");
                    }
/* 75 */            OIoi11oolo oIoi11oolo = iOlO11lll0l.I00000oOI;
/* 77 */            Object obj = oIoi11oolo.I00000oIO;
/* 79 */            Object obj2 = oIoi11oolo.I00000oOI;
/* 101 */           Size size = new Size((int) (((Float) oIoi11oolo.I00000oIO).floatValue() * i2), (int) (((Float) obj2).floatValue() * i3));
/* 106 */           Size size2 = new Size(i2, i3);
/* 109 */           float[] fArr3 = new float[16];
/* 111 */           Matrix.setIdentityM(fArr3, 0);
/* 114 */           float[] fArr4 = new float[16];
/* 116 */           Matrix.setIdentityM(fArr4, 0);
/* 119 */           float[] fArr5 = new float[16];
/* 121 */           Matrix.setIdentityM(fArr5, 0);
/* 148 */           Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
/* 151 */           OIoi11oolo oIoi11oolo2 = iOlO11lll0l.I00000oIO;
/* 163 */           if (((Float) obj).floatValue() != 0.0f || ((Float) obj2).floatValue() != 0.0f) {
/* 206 */               Matrix.translateM(fArr4, 0, ((Float) oIoi11oolo2.I00000oIO).floatValue() / ((Float) obj).floatValue(), ((Float) oIoi11oolo2.I00000oOI).floatValue() / ((Float) obj2).floatValue(), 0.0f);
                    }
/* 222 */           Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
/* 228 */           GLES20.glUniformMatrix4fv(ilo01OlO1.I00000oOI, 1, false, fArr5, 0);
/* 231 */           Ilo0O01IO.I00000oOI("glUniformMatrix4fv");
/* 236 */           GLES20.glUniform1f(ilo01OlO1.I0000Il00O, 1.0f);
/* 241 */           Ilo0O01IO.I00000oOI("glUniform1f");
/* 246 */           GLES20.glEnable(3042);
/* 253 */           GLES20.glBlendFuncSeparate(770, 771, 1, 771);
/* 258 */           GLES20.glDrawArrays(5, 0, 4);
/* 263 */           Ilo0O01IO.I00000oOI("glDrawArrays");
/* 266 */           GLES20.glDisable(3042);
                }
            }
