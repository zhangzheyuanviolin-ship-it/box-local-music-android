            package p000;

            import android.opengl.EGL14;
            import android.opengl.EGLConfig;
            import android.opengl.EGLContext;
            import android.opengl.EGLDisplay;
            import android.opengl.EGLExt;
            import android.opengl.EGLSurface;
            import android.opengl.GLES20;
            import android.util.Size;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public class OIi0ooo0l1 implements Ooo1oiI0 {
                public Object I00ilI0I1;
                public Object I00ioIO;
                public Object I00l0OO0IO;
                public Object I00iiO = new AtomicBoolean(false);
                public Object I00iio = new HashMap();
                public Object I00ilO0 = EGL14.EGL_NO_DISPLAY;
                public Object I00io1l = EGL14.EGL_NO_CONTEXT;
                public int[] I00iiI = Ilo0O01IO.I00000oIO;
                public Object I00l0I0l0lO1 = EGL14.EGL_NO_SURFACE;
                public Object I00li1OI = Collections.EMPTY_MAP;
                public Object I00ll1 = null;
                public Object I00lli11 = Ilo01Io.I00iOIl;
                public int I00iOIl = -1;

                public void I0000Il00O(Iio1oiI iio1oiI, I1l0OOI i1l0OOI) {
/* 6 */             EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
/* 10 */            this.I00ilO0 = eGLDisplayEglGetDisplay;
/* 18 */            if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
/* 234 */               I000II.I001IO000("Unable to get EGL14 display");
/* 332 */               return;
                    }
/* 21 */            int[] iArr = new int[2];
/* 32 */            if (!EGL14.eglInitialize((EGLDisplay) this.I00ilO0, iArr, 0, iArr, 1)) {
/* 224 */               this.I00ilO0 = EGL14.EGL_NO_DISPLAY;
/* 228 */               I000II.I001IO000("Unable to initialize EGL14");
/* 231 */               return;
                    }
/* 34 */            if (i1l0OOI != null) {
/* 60 */                i1l0OOI.I00000oOI = iArr[0] + "." + iArr[1];
                    }
/* 74 */            int i = iio1oiI.I00000oIO() ? 10 : 8;
/* 142 */           EGLConfig[] eGLConfigArr = new EGLConfig[1];
/* 168 */           if (!EGL14.eglChooseConfig((EGLDisplay) this.I00ilO0, new int[]{12324, i, 12323, i, 12322, i, 12321, iio1oiI.I00000oIO() ? 2 : 8, 12325, 0, 12326, 0, 12352, iio1oiI.I00000oIO() ? 64 : 4, 12610, iio1oiI.I00000oIO() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
/* 218 */               I000II.I001IO000("Unable to find a suitable EGLConfig");
/* 221 */               return;
                    }
/* 170 */           EGLConfig eGLConfig = eGLConfigArr[0];
/* 193 */           EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.I00ilO0, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, iio1oiI.I00000oIO() ? 3 : 2, 12344}, 0);
/* 199 */           Ilo0O01IO.I00000oIO("eglCreateContext");
/* 202 */           this.I00ioIO = eGLConfig;
/* 204 */           this.I00io1l = eGLContextEglCreateContext;
/* 212 */           EGL14.eglQueryContext((EGLDisplay) this.I00ilO0, eGLContextEglCreateContext, 12440, new int[1], 0);
                }

                public I1l1o1OiOiI I0000O(Surface surface) {
                    try {
/* 3 */                 EGLDisplay eGLDisplay = (EGLDisplay) this.I00ilO0;
/* 7 */                 EGLConfig eGLConfig = (EGLConfig) this.I00ioIO;
/* 9 */                 Objects.requireNonNull(eGLConfig);
/* 14 */                EGLSurface eGLSurfaceI000OOo1O = Ilo0O01IO.I000OOo1O(eGLDisplay, eGLConfig, surface, this.I00iiI);
/* 20 */                EGLDisplay eGLDisplay2 = (EGLDisplay) this.I00ilO0;
/* 23 */                int[] iArr = new int[1];
/* 28 */                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI000OOo1O, 12375, iArr, 0);
/* 31 */                int i = iArr[0];
/* 33 */                int[] iArr2 = new int[1];
/* 37 */                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI000OOo1O, 12374, iArr2, 0);
/* 44 */                Size size = new Size(i, iArr2[0]);
/* 47 */                int width = size.getWidth();
/* 51 */                int height = size.getHeight();
/* 57 */                I1l1o1OiOiI i1l1o1OiOiI = new I1l1o1OiOiI();
/* 60 */                i1l1o1OiOiI.I00000oIO = eGLSurfaceI000OOo1O;
/* 62 */                i1l1o1OiOiI.I00000oOI = width;
/* 64 */                i1l1o1OiOiI.I0000Il00O = height;
/* 66 */                VarHandle.storeStoreFence();
/* 69 */                return i1l1o1OiOiI;
                    } catch (IllegalArgumentException | IllegalStateException e) {
/* 91 */                l11I11lO.I0001Ioi1lo("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
/* 94 */                return null;
                    }
                }

                public void I0000oI00() {
/* 3 */             EGLDisplay eGLDisplay = (EGLDisplay) this.I00ilO0;
/* 7 */             EGLConfig eGLConfig = (EGLConfig) this.I00ioIO;
/* 9 */             Objects.requireNonNull(eGLConfig);
/* 12 */            int[] iArr = Ilo0O01IO.I00000oIO;
/* 26 */            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
/* 32 */            Ilo0O01IO.I00000oIO("eglCreatePbufferSurface");
/* 35 */            if (eGLSurfaceEglCreatePbufferSurface != null) {
/* 37 */                this.I00l0I0l0lO1 = eGLSurfaceEglCreatePbufferSurface;
                    } else {
/* 42 */                I000II.I001IO000("surface was null");
                    }
                }

                public int I0001Ioi1lo(int i) {
                    int i2;
/* 3 */             OI0l1iiooO oI0l1iiooO = (OI0l1iiooO) this.I00iiO;
/* 5 */             int i3 = oI0l1iiooO.I00000oOI;
/* 7 */             if (i3 <= 0) {
/* 45 */                lO00l0o.I00000oOI("");
/* 77 */                throw null;
                    }
                    int i4 = i3 - 1;
/* 11 */            int i5 = 0;
                    while (true) {
/* 12 */                if (i5 <= i4) {
/* 16 */                    i2 = (i5 + i4) >>> 1;
/* 20 */                    int i6 = oI0l1iiooO.I00000oIO[i2];
/* 22 */                    if (i6 >= i) {
/* 27 */                        if (i6 <= i) {
                                    break;
                                }
                                i4 = i2 - 1;
                            } else {
/* 24 */                        i5 = i2 + 1;
                            }
                        } else {
/* 34 */                    i2 = -(i5 + 1);
                            break;
                        }
                    }
                    return i2 < -1 ? -(i2 + 2) : i2;
                }

                public float I000II(int i, int i2, boolean z) {
                    IioIllI11l0I iioIllI11l0I;
                    float f;
/* 3 */             OI0l1iiooO oI0l1iiooO = (OI0l1iiooO) this.I00iiO;
/* 11 */            if (i >= oI0l1iiooO.I00000oOI - 1) {
                        f = i2;
                    } else {
/* 16 */                int iI0000Il00O = oI0l1iiooO.I0000Il00O(i);
/* 22 */                int iI0000Il00O2 = oI0l1iiooO.I0000Il00O(i + 1);
/* 26 */                if (i2 != iI0000Il00O) {
/* 30 */                    int i3 = iI0000Il00O2 - iI0000Il00O;
/* 39 */                    OooI1i111oO oooI1i111oO = (OooI1i111oO) ((OI0l1oli1I) this.I00iio).I00000oOI(iI0000Il00O);
/* 41 */                    if (oooI1i111oO == null || (iioIllI11l0I = oooI1i111oO.I00000oOI) == null) {
/* 50 */                        iioIllI11l0I = (IioIllI11l0I) this.I00ilI0I1;
                            }
                            float f2 = i3;
/* 56 */                    float fI00000oIO = iioIllI11l0I.I00000oIO((i2 - iI0000Il00O) / f2);
                            return z ? fI00000oIO : ((f2 * fI00000oIO) + iI0000Il00O) / 1000.0f;
                        }
                        f = iI0000Il00O;
                    }
/* 14 */            return f / 1000.0f;
                }

                public OIoi11oolo I000O01llI0(Iio1oiI iio1oiI) {
/* 10 */            Ilo0O01IO.I0000O((AtomicBoolean) this.I00iiO, false);
                    try {
/* 14 */                I0000Il00O(iio1oiI, null);
/* 17 */                I0000oI00();
/* 24 */                I000iOII((EGLSurface) this.I00l0I0l0lO1);
/* 29 */                String strGlGetString = GLES20.glGetString(7939);
/* 39 */                String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.I00ilO0, 12373);
/* 45 */                if (strGlGetString == null) {
/* 1 */                     strGlGetString = "";
                        }
/* 49 */                if (strEglQueryString == null) {
/* 1 */                     strEglQueryString = "";
                        }
/* 53 */                return new OIoi11oolo(strGlGetString, strEglQueryString);
                    } catch (IllegalStateException e) {
/* 81 */                l11I11lO.I0001Ioi1lo("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
/* 86 */                return new OIoi11oolo("", "");
                    } finally {
/* 93 */                I000lI();
                    }
                }

                public I1l0Oloi I000OOo1O(Iio1oiI iio1oiI) {
/* 1 */             Map map = Collections.EMPTY_MAP;
/* 5 */             AtomicBoolean atomicBoolean = (AtomicBoolean) this.I00iiO;
/* 8 */             Ilo0O01IO.I0000O(atomicBoolean, false);
/* 13 */            I1l0OOI i1l0OOI = new I1l0OOI();
/* 18 */            i1l0OOI.I00000oIO = "0.0";
/* 20 */            i1l0OOI.I00000oOI = "0.0";
/* 24 */            i1l0OOI.I0000Il00O = "";
/* 26 */            i1l0OOI.I0000O = "";
                    try {
/* 32 */                if (iio1oiI.I00000oIO()) {
/* 34 */                    OIoi11oolo oIoi11ooloI000O01llI0 = I000O01llI0(iio1oiI);
/* 40 */                    String str = (String) oIoi11ooloI000O01llI0.I00000oIO;
/* 44 */                    String str2 = (String) oIoi11ooloI000O01llI0.I00000oOI;
/* 52 */                    if (!str.contains("GL_EXT_YUV_target")) {
/* 58 */                        l11I11lO.I0000oI00("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
/* 61 */                        iio1oiI = Iio1oiI.I0000O;
                            }
/* 70 */                    this.I00iiI = Ilo0O01IO.I0001Ioi1lo(str2, iio1oiI);
/* 72 */                    i1l0OOI.I0000Il00O = str;
/* 74 */                    i1l0OOI.I0000O = str2;
                        }
/* 76 */                I0000Il00O(iio1oiI, i1l0OOI);
/* 79 */                I0000oI00();
/* 86 */                I000iOII((EGLSurface) this.I00l0I0l0lO1);
/* 93 */                i1l0OOI.I00000oIO = Ilo0O01IO.I000OiO();
/* 99 */                this.I00li1OI = Ilo0O01IO.I000II(iio1oiI);
/* 101 */               int iI000O01llI0 = Ilo0O01IO.I000O01llI0();
/* 105 */               this.I00iOIl = iI000O01llI0;
/* 107 */               I00100o1O0lo(iI000O01llI0);
/* 114 */               this.I00ilI0I1 = Thread.currentThread();
/* 117 */               atomicBoolean.set(true);
/* 124 */               if (!"".isEmpty()) {
/* 157 */                   I000II.I001IO000("Missing required properties:".concat(""));
/* 160 */                   return null;
                        }
/* 128 */               String str3 = i1l0OOI.I00000oIO;
/* 130 */               String str4 = i1l0OOI.I00000oOI;
/* 132 */               String str5 = i1l0OOI.I0000Il00O;
/* 134 */               String str6 = i1l0OOI.I0000O;
/* 136 */               I1l0Oloi i1l0Oloi = new I1l0Oloi();
/* 139 */               i1l0Oloi.I00000oIO = str3;
/* 141 */               i1l0Oloi.I00000oOI = str4;
/* 143 */               i1l0Oloi.I0000Il00O = str5;
/* 145 */               i1l0Oloi.I0000O = str6;
/* 147 */               VarHandle.storeStoreFence();
/* 150 */               return i1l0Oloi;
                    } catch (IllegalArgumentException | IllegalStateException e) {
/* 162 */               I000lI();
/* 168 */               throw e;
                    }
                }

                public void I000OiO(I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
                    float[] fArr;
/* 3 */             OI0l1oli1I oI0l1oli1I = (OI0l1oli1I) this.I00iio;
/* 7 */             OI0l1iiooO oI0l1iiooO = (OI0l1iiooO) this.I00iiO;
/* 20 */            boolean z = ((IIOOoll) this.I00lli11) != Ooo1lo1l.I0000Il00O;
/* 25 */            if (((I110ooool) this.I00io1l) == null) {
/* 31 */                this.I00io1l = i110ooool.I0000Il00O();
/* 37 */                this.I00ioIO = i110ooool3.I0000Il00O();
/* 39 */                int i = oI0l1iiooO.I00000oOI;
/* 41 */                float[] fArr2 = new float[i];
/* 44 */                for (int i2 = 0; i2 < i; i2++) {
/* 54 */                    fArr2[i2] = oI0l1iiooO.I0000Il00O(i2) / 1000.0f;
                        }
/* 59 */                this.I00ilO0 = fArr2;
/* 61 */                int i3 = oI0l1iiooO.I00000oOI;
/* 63 */                int[] iArr = new int[i3];
/* 66 */                for (int i4 = 0; i4 < i3; i4++) {
/* 78 */                    iArr[i4] = 0;
                        }
/* 83 */                this.I00iiI = iArr;
                    }
/* 85 */            if (z) {
/* 94 */                if (((IIOOoll) this.I00lli11) != Ooo1lo1l.I0000Il00O && O0000Ioio00.I0000O((I110ooool) this.I00l0I0l0lO1, i110ooool) && O0000Ioio00.I0000O((I110ooool) this.I00l0OO0IO, i110ooool2)) {
/* 117 */                   return;
                        }
/* 118 */               this.I00l0I0l0lO1 = i110ooool;
/* 120 */               this.I00l0OO0IO = i110ooool2;
/* 132 */               int iI00000oOI = i110ooool.I00000oOI() + (i110ooool.I00000oOI() % 2);
/* 135 */               this.I00li1OI = new float[iI00000oOI];
/* 139 */               this.I00ll1 = new float[iI00000oOI];
/* 141 */               int i5 = oI0l1iiooO.I00000oOI;
/* 143 */               float[][] fArr3 = new float[i5][];
/* 146 */               for (int i6 = 0; i6 < i5; i6++) {
/* 148 */                   int iI0000Il00O = oI0l1iiooO.I0000Il00O(i6);
/* 156 */                   OooI1i111oO oooI1i111oO = (OooI1i111oO) oI0l1oli1I.I00000oOI(iI0000Il00O);
/* 158 */                   if (iI0000Il00O == 0 && oooI1i111oO == null) {
/* 162 */                       fArr = new float[iI00000oOI];
/* 165 */                       for (int i7 = 0; i7 < iI00000oOI; i7++) {
/* 171 */                           fArr[i7] = i110ooool.I00000oIO(i7);
                                }
                            } else if (iI0000Il00O == this.I00iOIl && oooI1i111oO == null) {
/* 182 */                       fArr = new float[iI00000oOI];
/* 185 */                       for (int i8 = 0; i8 < iI00000oOI; i8++) {
/* 191 */                           fArr[i8] = i110ooool2.I00000oIO(i8);
                                }
                            } else {
/* 196 */                       I110ooool i110ooool4 = oooI1i111oO.I00000oIO;
/* 198 */                       float[] fArr4 = new float[iI00000oOI];
/* 201 */                       for (int i9 = 0; i9 < iI00000oOI; i9++) {
/* 207 */                           fArr4[i9] = i110ooool4.I00000oIO(i9);
                                }
/* 212 */                       fArr = fArr4;
                            }
/* 213 */                   fArr3[i6] = fArr;
                        }
/* 229 */               this.I00lli11 = new IIOOoll(this.I00iiI, (float[]) this.I00ilO0, fArr3);
                    }
                }

                public void I000iOII(EGLSurface eGLSurface) {
/* 5 */             ((EGLDisplay) this.I00ilO0).getClass();
/* 12 */            ((EGLContext) this.I00io1l).getClass();
/* 27 */            if (EGL14.eglMakeCurrent((EGLDisplay) this.I00ilO0, eGLSurface, eGLSurface, (EGLContext) this.I00io1l)) {
/* 29 */                return;
                    }
/* 32 */            I000II.I001IO000("eglMakeCurrent failed");
                }

                public void I000l1(Surface surface) {
/* 6 */             Ilo0O01IO.I0000O((AtomicBoolean) this.I00iiO, true);
/* 13 */            Ilo0O01IO.I0000Il00O((Thread) this.I00ilI0I1);
/* 18 */            HashMap map = (HashMap) this.I00iio;
/* 24 */            if (map.containsKey(surface)) {
/* 77 */                return;
                    }
/* 28 */            map.put(surface, Ilo0O01IO.I000OiO);
                }

                public void I000lI() {
/* 3 */             HashMap map = (HashMap) this.I00iio;
/* 13 */            Iterator it = ((Map) this.I00li1OI).values().iterator();
/* 21 */            while (it.hasNext()) {
/* 31 */                GLES20.glDeleteProgram(((Ilo01OlO1) it.next()).I00000oIO);
                    }
/* 37 */            this.I00li1OI = Collections.EMPTY_MAP;
/* 40 */            this.I00ll1 = null;
/* 52 */            if (!Objects.equals((EGLDisplay) this.I00ilO0, EGL14.EGL_NO_DISPLAY)) {
/* 56 */                EGLDisplay eGLDisplay = (EGLDisplay) this.I00ilO0;
/* 58 */                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
/* 62 */                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
/* 77 */                for (I1l1o1OiOiI i1l1o1OiOiI : map.values()) {
/* 93 */                    if (!Objects.equals(i1l1o1OiOiI.I00000oIO, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.I00ilO0, i1l1o1OiOiI.I00000oIO)) {
                                try {
/* 109 */                           Ilo0O01IO.I00000oIO("eglDestroySurface");
                                } catch (IllegalStateException e) {
/* 120 */                           l11I11lO.I00000oOI("GLUtils", e.toString(), e);
                                }
                            }
                        }
/* 124 */               map.clear();
/* 137 */               if (!Objects.equals((EGLSurface) this.I00l0I0l0lO1, EGL14.EGL_NO_SURFACE)) {
/* 147 */                   EGL14.eglDestroySurface((EGLDisplay) this.I00ilO0, (EGLSurface) this.I00l0I0l0lO1);
/* 152 */                   this.I00l0I0l0lO1 = EGL14.EGL_NO_SURFACE;
                        }
/* 164 */               if (!Objects.equals((EGLContext) this.I00io1l, EGL14.EGL_NO_CONTEXT)) {
/* 174 */                   EGL14.eglDestroyContext((EGLDisplay) this.I00ilO0, (EGLContext) this.I00io1l);
/* 179 */                   this.I00io1l = EGL14.EGL_NO_CONTEXT;
                        }
/* 181 */               EGL14.eglReleaseThread();
/* 188 */               EGL14.eglTerminate((EGLDisplay) this.I00ilO0);
/* 193 */               this.I00ilO0 = EGL14.EGL_NO_DISPLAY;
                    }
/* 195 */           this.I00ioIO = null;
/* 198 */           this.I00iOIl = -1;
/* 202 */           this.I00lli11 = Ilo01Io.I00iOIl;
/* 204 */           this.I00l0OO0IO = null;
/* 206 */           this.I00ilI0I1 = null;
                }

                public void I000o00OoI0I(Surface surface, boolean z) {
/* 5 */             if (((Surface) this.I00l0OO0IO) == surface) {
/* 8 */                 this.I00l0OO0IO = null;
/* 14 */                I000iOII((EGLSurface) this.I00l0I0l0lO1);
                    }
/* 19 */            HashMap map = (HashMap) this.I00iio;
/* 36 */            I1l1o1OiOiI i1l1o1OiOiI = z ? (I1l1o1OiOiI) map.remove(surface) : (I1l1o1OiOiI) map.put(surface, Ilo0O01IO.I000OiO);
/* 38 */            if (i1l1o1OiOiI == null || i1l1o1OiOiI == Ilo0O01IO.I000OiO) {
/* 106 */               return;
                    }
                    try {
/* 50 */                EGL14.eglDestroySurface((EGLDisplay) this.I00ilO0, i1l1o1OiOiI.I00000oIO);
                    } catch (RuntimeException e) {
/* 75 */                l11I11lO.I0001Ioi1lo("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
                    }
                }

                @Override
                public I110ooool I000oI1ioi(long j, I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 6 */             long j2 = j / 1000000;
/* 8 */             int[] iArr = Ooo1lo1l.I00000oIO;
/* 10 */            long j3 = this.I00iOIl;
/* 17 */            if (j2 < 0) {
/* 19 */                j2 = 0;
                    }
/* 26 */            long j4 = j2 > j3 ? j3 : j2;
/* 29 */            if (j4 < 0) {
/* 1 */                 return i110ooool3;
                    }
/* 36 */            I000OiO(i110ooool, i110ooool2, i110ooool3);
/* 42 */            I110ooool i110ooool4 = (I110ooool) this.I00ioIO;
/* 50 */            int i = 0;
/* 51 */            if (((IIOOoll) this.I00lli11) != Ooo1lo1l.I0000Il00O) {
/* 53 */                int i2 = (int) j4;
/* 58 */                float fI000II = I000II(I0001Ioi1lo(i2), i2, false);
/* 64 */                float[] fArr = (float[]) this.I00ll1;
/* 72 */                I1Ii1iol[][] i1Ii1iolArr = (I1Ii1iol[][]) ((IIOOoll) this.I00lli11).I00iiI;
/* 78 */                float f = i1Ii1iolArr[0][0].I00000oIO;
/* 87 */                float f2 = i1Ii1iolArr[i1Ii1iolArr.length - 1][0].I00000oOI;
/* 91 */                if (fI000II < f) {
/* 93 */                    fI000II = f;
                        }
/* 96 */                if (fI000II <= f2) {
/* 99 */                    f2 = fI000II;
                        }
/* 100 */               int length = fArr.length;
/* 103 */               boolean z = false;
/* 104 */               for (I1Ii1iol[] i1Ii1iolArr2 : i1Ii1iolArr) {
/* 106 */                   int i3 = 0;
/* 107 */                   int i4 = 0;
/* 110 */                   while (i3 < length - 1) {
/* 114 */                       I1Ii1iol i1Ii1iol = i1Ii1iolArr2[i4];
/* 120 */                       if (f2 <= i1Ii1iol.I00000oOI) {
/* 124 */                           if (i1Ii1iol.I00100l0) {
/* 128 */                               fArr[i3] = i1Ii1iol.I00100o1O0lo;
/* 134 */                               fArr[i3 + 1] = i1Ii1iol.I0010I0i;
                                    } else {
/* 137 */                               i1Ii1iol.I0000Il00O(f2);
/* 144 */                               fArr[i3] = i1Ii1iol.I00000oIO();
/* 152 */                               fArr[i3 + 1] = i1Ii1iol.I00000oOI();
                                    }
/* 154 */                           z = true;
                                }
/* 155 */                       i3 += 2;
/* 157 */                       i4++;
                            }
/* 160 */                   if (z) {
                                break;
                            }
                        }
/* 166 */               int length2 = fArr.length;
/* 167 */               while (i < length2) {
/* 171 */                   i110ooool4.I0000oI00(i, fArr[i]);
/* 174 */                   i++;
                        }
                    } else {
/* 184 */               I110ooool i110oooolI00Io1lO = I00Io1lO((j4 - 1) * 1000000, i110ooool, i110ooool2, i110ooool3);
/* 196 */               I110ooool i110oooolI00Io1lO2 = I00Io1lO(j4 * 1000000, i110ooool, i110ooool2, i110ooool3);
/* 200 */               int iI00000oOI = i110oooolI00Io1lO.I00000oOI();
/* 204 */               while (i < iI00000oOI) {
/* 218 */                   i110ooool4.I0000oI00(i, (i110oooolI00Io1lO.I00000oIO(i) - i110oooolI00Io1lO2.I00000oIO(i)) * 1000.0f);
/* 221 */                   i++;
                        }
                    }
/* 1182 */          return i110ooool4;
                }

                public void I00100l0(long j, float[] fArr, Surface surface) {
/* 6 */             Ilo0O01IO.I0000O((AtomicBoolean) this.I00iiO, true);
/* 13 */            Ilo0O01IO.I0000Il00O((Thread) this.I00ilI0I1);
/* 18 */            HashMap map = (HashMap) this.I00iio;
/* 26 */            lII1OI11o1I.I0000oI00("The surface is not registered.", map.containsKey(surface));
/* 33 */            I1l1o1OiOiI i1l1o1OiOiII0000O = (I1l1o1OiOiI) map.get(surface);
/* 35 */            Objects.requireNonNull(i1l1o1OiOiII0000O);
/* 40 */            if (i1l1o1OiOiII0000O == Ilo0O01IO.I000OiO) {
/* 42 */                i1l1o1OiOiII0000O = I0000O(surface);
/* 46 */                if (i1l1o1OiOiII0000O == null) {
/* 408 */                   return;
                        } else {
/* 49 */                    map.put(surface, i1l1o1OiOiII0000O);
                        }
                    }
/* 52 */            int i = i1l1o1OiOiII0000O.I0000Il00O;
/* 54 */            int i2 = i1l1o1OiOiII0000O.I00000oOI;
/* 56 */            EGLSurface eGLSurface = i1l1o1OiOiII0000O.I00000oIO;
/* 63 */            if (surface != ((Surface) this.I00l0OO0IO)) {
/* 65 */                I000iOII(eGLSurface);
/* 68 */                this.I00l0OO0IO = surface;
/* 70 */                GLES20.glViewport(0, 0, i2, i);
/* 73 */                GLES20.glScissor(0, 0, i2, i);
                    }
/* 78 */            Ilo01OlO1 ilo01OlO1 = (Ilo01OlO1) this.I00ll1;
/* 80 */            ilo01OlO1.getClass();
/* 85 */            if (ilo01OlO1 instanceof Ilo0IIoOoo) {
/* 91 */                GLES20.glUniformMatrix4fv(((Ilo0IIoOoo) ilo01OlO1).I0001Ioi1lo, 1, false, fArr, 0);
/* 96 */                Ilo0O01IO.I00000oOI("glUniformMatrix4fv");
                    }
/* 101 */           GLES20.glDrawArrays(5, 0, 4);
/* 106 */           Ilo0O01IO.I00000oOI("glDrawArrays");
/* 113 */           EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.I00ilO0, eGLSurface, j);
/* 124 */           if (EGL14.eglSwapBuffers((EGLDisplay) this.I00ilO0, eGLSurface)) {
/* 408 */               return;
                    }
/* 150 */           l11I11lO.I0000oI00("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
/* 153 */           I000o00OoI0I(surface, false);
                }

                public void I00100o1O0lo(int i) {
/* 13 */            Ilo01OlO1 ilo01OlO1 = (Ilo01OlO1) ((Map) this.I00li1OI).get((Ilo01Io) this.I00lli11);
/* 15 */            if (ilo01OlO1 == null) {
/* 71 */                IoOOl0iOl1io.I0010I0i("Unable to configure program for input format: ", (Ilo01Io) this.I00lli11);
/* 77 */                return;
                    }
/* 21 */            if (((Ilo01OlO1) this.I00ll1) != ilo01OlO1) {
/* 23 */                this.I00ll1 = ilo01OlO1;
/* 25 */                ilo01OlO1.I00000oOI();
/* 32 */                Objects.toString((Ilo01Io) this.I00lli11);
/* 39 */                Objects.toString((Ilo01OlO1) this.I00ll1);
                    }
/* 45 */            GLES20.glActiveTexture(33984);
/* 50 */            Ilo0O01IO.I00000oOI("glActiveTexture");
/* 56 */            GLES20.glBindTexture(36197, i);
/* 61 */            Ilo0O01IO.I00000oOI("glBindTexture");
                }

                @Override
                public int I001lllioOl() {
/* 1 */             return 0;
                }

                @Override
                public int I00IOO() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public I110ooool I00Io1lO(long j, I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
                    I110ooool i110ooool4;
                    I110ooool i110ooool5;
                    I1Ii1iol[][] i1Ii1iolArr;
/* 3 */             I110ooool i110ooool6 = i110ooool;
/* 5 */             I110ooool i110ooool7 = i110ooool2;
/* 9 */             OI0l1iiooO oI0l1iiooO = (OI0l1iiooO) this.I00iiO;
/* 14 */            long j2 = j / 1000000;
/* 16 */            int[] iArr = Ooo1lo1l.I00000oIO;
/* 18 */            int i = this.I00iOIl;
                    long j3 = i;
/* 25 */            if (j2 < 0) {
/* 27 */                j2 = 0;
                    }
/* 30 */            if (j2 <= j3) {
/* 33 */                j3 = j2;
                    }
/* 34 */            int i2 = (int) j3;
/* 37 */            OI0l1oli1I oI0l1oli1I = (OI0l1oli1I) this.I00iio;
/* 43 */            OooI1i111oO oooI1i111oO = (OooI1i111oO) oI0l1oli1I.I00000oOI(i2);
/* 45 */            if (oooI1i111oO != null) {
/* 47 */                return oooI1i111oO.I00000oIO;
                    }
/* 50 */            if (i2 >= i) {
/* 52 */                return i110ooool7;
                    }
/* 53 */            if (i2 <= 0) {
/* 55 */                return i110ooool6;
                    }
/* 58 */            I000OiO(i110ooool6, i110ooool7, i110ooool3);
/* 63 */            I110ooool i110ooool8 = (I110ooool) this.I00io1l;
/* 71 */            int i3 = 0;
/* 73 */            if (((IIOOoll) this.I00lli11) != Ooo1lo1l.I0000Il00O) {
/* 79 */                float fI000II = I000II(I0001Ioi1lo(i2), i2, false);
/* 85 */                float[] fArr = (float[]) this.I00li1OI;
/* 93 */                I1Ii1iol[][] i1Ii1iolArr2 = (I1Ii1iol[][]) ((IIOOoll) this.I00lli11).I00iiI;
/* 96 */                int length = i1Ii1iolArr2.length - 1;
/* 101 */               float f = i1Ii1iolArr2[0][0].I00000oIO;
/* 107 */               float f2 = i1Ii1iolArr2[length][0].I00000oOI;
/* 109 */               int length2 = fArr.length;
/* 112 */               if (fI000II < f || fI000II > f2) {
/* 217 */                   if (fI000II > f2) {
/* 219 */                       f = f2;
                            } else {
/* 221 */                       length = 0;
                            }
/* 222 */                   float f3 = fI000II - f;
/* 223 */                   int i4 = 0;
/* 224 */                   int i5 = 0;
/* 227 */                   while (i4 < length2 - 1) {
/* 231 */                       I1Ii1iol i1Ii1iol = i1Ii1iolArr2[length][i5];
/* 233 */                       boolean z = i1Ii1iol.I00100l0;
/* 235 */                       float f4 = i1Ii1iol.I0010I0i;
/* 237 */                       float f5 = i1Ii1iol.I00100o1O0lo;
/* 239 */                       if (z) {
/* 241 */                           float f6 = i1Ii1iol.I00000oIO;
/* 245 */                           float f7 = i1Ii1iol.I000iOII;
/* 248 */                           float f8 = i1Ii1iol.I0000Il00O;
/* 250 */                           i1Ii1iolArr = i1Ii1iolArr2;
/* 259 */                           fArr[i4] = (f5 * f3) + ((i1Ii1iol.I0000oI00 - f8) * (f - f6) * f7) + f8;
/* 265 */                           float f9 = (f - f6) * f7;
/* 266 */                           float f10 = i1Ii1iol.I0000O;
/* 275 */                           fArr[i4 + 1] = (f4 * f3) + ((i1Ii1iol.I0001Ioi1lo - f10) * f9) + f10;
                                } else {
/* 278 */                           i1Ii1iolArr = i1Ii1iolArr2;
/* 280 */                           i1Ii1iol.I0000Il00O(f);
/* 295 */                           fArr[i4] = (i1Ii1iol.I00000oIO() * f3) + (i1Ii1iol.I000o00OoI0I * i1Ii1iol.I000O01llI0) + f5;
/* 311 */                           fArr[i4 + 1] = (i1Ii1iol.I00000oOI() * f3) + (i1Ii1iol.I000oI1ioi * i1Ii1iol.I000OOo1O) + f4;
                                }
/* 313 */                       i4 += 2;
/* 315 */                       i5++;
/* 318 */                       i1Ii1iolArr2 = i1Ii1iolArr;
                            }
                        } else {
/* 119 */                   int length3 = i1Ii1iolArr2.length;
/* 120 */                   int i6 = 0;
/* 121 */                   boolean z2 = false;
/* 122 */                   while (i6 < length3) {
/* 124 */                       int i7 = i3;
/* 125 */                       int i8 = i7;
/* 128 */                       while (i7 < length2 - 1) {
/* 132 */                           I1Ii1iol i1Ii1iol2 = i1Ii1iolArr2[i6][i8];
/* 138 */                           if (fI000II <= i1Ii1iol2.I00000oOI) {
/* 142 */                               if (i1Ii1iol2.I00100l0) {
/* 144 */                                   float f11 = i1Ii1iol2.I00000oIO;
/* 148 */                                   float f12 = i1Ii1iol2.I000iOII;
/* 151 */                                   float f13 = i1Ii1iol2.I0000Il00O;
/* 158 */                                   fArr[i7] = ((i1Ii1iol2.I0000oI00 - f13) * (fI000II - f11) * f12) + f13;
/* 165 */                                   float f14 = i1Ii1iol2.I0000O;
/* 172 */                                   fArr[i7 + 1] = ((i1Ii1iol2.I0001Ioi1lo - f14) * (fI000II - f11) * f12) + f14;
                                        } else {
/* 175 */                                   i1Ii1iol2.I0000Il00O(fI000II);
/* 186 */                                   fArr[i7] = (i1Ii1iol2.I000o00OoI0I * i1Ii1iol2.I000O01llI0) + i1Ii1iol2.I00100o1O0lo;
/* 198 */                                   fArr[i7 + 1] = (i1Ii1iol2.I000oI1ioi * i1Ii1iol2.I000OOo1O) + i1Ii1iol2.I0010I0i;
                                        }
/* 200 */                               z2 = true;
                                    }
/* 201 */                           i7 += 2;
/* 203 */                           i8++;
                                }
/* 207 */                       if (z2) {
                                    break;
                                }
/* 211 */                       i6++;
/* 213 */                       i3 = 0;
                            }
                        }
/* 321 */               int length4 = fArr.length;
/* 323 */               for (int i9 = 0; i9 < length4; i9++) {
/* 327 */                   i110ooool8.I0000oI00(i9, fArr[i9]);
                        }
                    } else {
/* 333 */               int iI0001Ioi1lo = I0001Ioi1lo(i2);
/* 338 */               float fI000II2 = I000II(iI0001Ioi1lo, i2, true);
/* 350 */               OooI1i111oO oooI1i111oO2 = (OooI1i111oO) oI0l1oli1I.I00000oOI(oI0l1iiooO.I0000Il00O(iI0001Ioi1lo));
/* 352 */               if (oooI1i111oO2 != null && (i110ooool5 = oooI1i111oO2.I00000oIO) != null) {
/* 359 */                   i110ooool6 = i110ooool5;
                        }
/* 369 */               OooI1i111oO oooI1i111oO3 = (OooI1i111oO) oI0l1oli1I.I00000oOI(oI0l1iiooO.I0000Il00O(iI0001Ioi1lo + 1));
/* 371 */               if (oooI1i111oO3 != null && (i110ooool4 = oooI1i111oO3.I00000oIO) != null) {
/* 378 */                   i110ooool7 = i110ooool4;
                        }
/* 379 */               int iI00000oOI = i110ooool8.I00000oOI();
/* 384 */               for (int i10 = 0; i10 < iI00000oOI; i10++) {
/* 400 */                   i110ooool8.I0000oI00(i10, (i110ooool7.I00000oIO(i10) * fI000II2) + ((1.0f - fI000II2) * i110ooool6.I00000oIO(i10)));
                        }
                    }
/* 1182 */          return i110ooool8;
                }
            }
