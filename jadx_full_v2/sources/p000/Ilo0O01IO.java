            package p000;

            import android.opengl.EGL14;
            import android.opengl.EGLConfig;
            import android.opengl.EGLDisplay;
            import android.opengl.EGLSurface;
            import android.opengl.GLES20;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.FloatBuffer;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
            public abstract class Ilo0O01IO {
                public static final int[] I00000oIO = {12344};
                public static final int[] I00000oOI = {12445, 13632, 12344};
                public static final String I0000Il00O;
                public static final String I0000O;
                public static final IlloioioiI1O I0000oI00;
                public static final IlloioioiI1O I0001Ioi1lo;
                public static final IlloioioiI1O I000II;
                public static final FloatBuffer I000O01llI0;
                public static final FloatBuffer I000OOo1O;
                public static final I1l1o1OiOiI I000OiO;

                static {
/* 19 */            Locale locale = Locale.US;
/* 23 */            I0000Il00O = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
/* 27 */            I0000O = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
/* 35 */            I0000oI00 = new IlloioioiI1O(0);
/* 43 */            I0001Ioi1lo = new IlloioioiI1O(1);
/* 51 */            I000II = new IlloioioiI1O(2);
/* 62 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
/* 70 */            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
/* 73 */            FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
/* 77 */            floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
/* 80 */            floatBufferAsFloatBuffer.position(0);
/* 83 */            I000O01llI0 = floatBufferAsFloatBuffer;
/* 90 */            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
/* 98 */            byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
/* 101 */           FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
/* 105 */           floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
/* 108 */           floatBufferAsFloatBuffer2.position(0);
/* 111 */           I000OOo1O = floatBufferAsFloatBuffer2;
/* 113 */           EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
/* 117 */           I1l1o1OiOiI i1l1o1OiOiI = new I1l1o1OiOiI();
/* 120 */           if (eGLSurface == null) {
/* 136 */               IOOlIIilOl0.I000II("Null eglSurface");
/* 139 */               return;
                    }
/* 122 */           i1l1o1OiOiI.I00000oIO = eGLSurface;
/* 124 */           i1l1o1OiOiI.I00000oOI = 0;
/* 126 */           i1l1o1OiOiI.I0000Il00O = 0;
/* 128 */           VarHandle.storeStoreFence();
/* 131 */           I000OiO = i1l1o1OiOiI;
                }

                public static void I00000oIO(String str) {
/* 1 */             int iEglGetError = EGL14.eglGetError();
/* 7 */             if (iEglGetError == 12288) {
/* 9 */                 return;
                    }
/* 16 */            I000II.I000OiO(": EGL error: 0x", str, Integer.toHexString(iEglGetError));
                }

                public static void I00000oOI(String str) {
/* 1 */             int iGlGetError = GLES20.glGetError();
/* 5 */             if (iGlGetError == 0) {
/* 7 */                 return;
                    }
/* 14 */            I000II.I000OiO(": GL error 0x", str, Integer.toHexString(iGlGetError));
                }

                public static void I0000Il00O(Thread thread) {
/* 12 */            lII1OI11o1I.I0000oI00("Method call must be called on the GL thread.", thread == Thread.currentThread());
                }

                public static void I0000O(AtomicBoolean atomicBoolean, boolean z) {
/* 17 */            lII1OI11o1I.I0000oI00(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == atomicBoolean.get());
                }

                public static void I0000oI00(int i, String str) {
/* 1 */             if (i >= 0) {
/* 3 */                 return;
                    }
/* 12 */            I000II.I001IO000(IlIi0I0.I000lI("Unable to locate '", str, "' in program"));
                }

                public static int[] I0001Ioi1lo(String str, Iio1oiI iio1oiI) {
/* 1 */             int i = iio1oiI.I00000oIO;
/* 4 */             int[] iArr = I00000oIO;
/* 6 */             if (i == 3) {
/* 14 */                if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
/* 16 */                    return I00000oOI;
                        }
/* 23 */                l11I11lO.I0000oI00("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
                    }
/* 37 */            return iArr;
                }

                public static HashMap I000II(Iio1oiI iio1oiI) {
                    Object ilo0IIoOoo;
                    Ilo01Io ilo01Io;
/* 1 */             Map map = Collections.EMPTY_MAP;
/* 5 */             HashMap map2 = new HashMap();
/* 8 */             Ilo01Io[] ilo01IoArrValues = Ilo01Io.values();
/* 12 */            int length = ilo01IoArrValues.length;
/* 15 */            for (int i = 0; i < length; i++) {
/* 17 */                Ilo01Io ilo01Io2 = ilo01IoArrValues[i];
/* 23 */                IlloioioiI1O illoioioiI1O = (IlloioioiI1O) map.get(ilo01Io2);
/* 25 */                if (illoioioiI1O != null) {
/* 29 */                    ilo0IIoOoo = new Ilo0IIoOoo(iio1oiI, illoioioiI1O);
                        } else if (ilo01Io2 == Ilo01Io.I00iiO || ilo01Io2 == (ilo01Io = Ilo01Io.I00iiI)) {
/* 105 */                   ilo0IIoOoo = new Ilo0IIoOoo(iio1oiI, ilo01Io2);
                        } else {
/* 63 */                    lII1OI11o1I.I0000oI00("Unhandled input format: " + ilo01Io2, ilo01Io2 == Ilo01Io.I00iOIl);
/* 70 */                    if (iio1oiI.I00000oIO()) {
/* 78 */                        ilo0IIoOoo = new Ilo01I("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                            } else {
/* 86 */                        IlloioioiI1O illoioioiI1O2 = (IlloioioiI1O) map.get(ilo01Io);
/* 99 */                        ilo0IIoOoo = illoioioiI1O2 != null ? new Ilo0IIoOoo(iio1oiI, illoioioiI1O2) : new Ilo0IIoOoo(iio1oiI, ilo01Io);
                            }
                        }
/* 108 */               Objects.toString(ilo01Io2);
/* 111 */               ilo0IIoOoo.toString();
/* 114 */               map2.put(ilo01Io2, ilo0IIoOoo);
                    }
/* 168 */           return map2;
                }

                public static int I000O01llI0() {
/* 2 */             int[] iArr = new int[1];
/* 5 */             GLES20.glGenTextures(1, iArr, 0);
/* 10 */            I00000oOI("glGenTextures");
/* 13 */            int i = iArr[0];
/* 18 */            GLES20.glBindTexture(36197, i);
/* 35 */            I00000oOI("glBindTexture " + i);
/* 42 */            GLES20.glTexParameteri(36197, 10241, 9729);
/* 47 */            GLES20.glTexParameteri(36197, 10240, 9729);
/* 55 */            GLES20.glTexParameteri(36197, 10242, 33071);
/* 60 */            GLES20.glTexParameteri(36197, 10243, 33071);
/* 65 */            I00000oOI("glTexParameter");
/* 110 */           return i;
                }

                public static EGLSurface I000OOo1O(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
/* 2 */             EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
/* 8 */             I00000oIO("eglCreateWindowSurface");
/* 11 */            if (eGLSurfaceEglCreateWindowSurface != null) {
/* 13 */                return eGLSurfaceEglCreateWindowSurface;
                    }
/* 16 */            I000II.I001IO000("surface was null");
/* 19 */            return null;
                }

                public static String I000OiO() {
/* 13 */            Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
/* 21 */            if (!matcher.find()) {
/* 46 */                return "0.0";
                    }
/* 24 */            String strGroup = matcher.group(1);
/* 28 */            strGroup.getClass();
/* 32 */            String strGroup2 = matcher.group(2);
/* 36 */            strGroup2.getClass();
/* 41 */            return IlIi0I0.I000lI(strGroup, ".", strGroup2);
                }

                public static int I000iOII(int i, String str) {
/* 1 */             int iGlCreateShader = GLES20.glCreateShader(i);
/* 19 */            I00000oOI("glCreateShader type=" + i);
/* 22 */            GLES20.glShaderSource(iGlCreateShader, str);
/* 25 */            GLES20.glCompileShader(iGlCreateShader);
/* 29 */            int[] iArr = new int[1];
/* 35 */            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
/* 40 */            if (iArr[0] != 0) {
/* 42 */                return iGlCreateShader;
                    }
/* 59 */            l11I11lO.I0000oI00("GLUtils", "Could not compile shader: " + str);
/* 62 */            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
/* 66 */            GLES20.glDeleteShader(iGlCreateShader);
/* 77 */            I000II.I001IO000(IlIi0I0.I000OiO(i, "Could not compile shader type ", ":", strGlGetShaderInfoLog));
/* 34 */            return 0;
                }
            }
