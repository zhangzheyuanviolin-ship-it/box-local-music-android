            package p000;

            import android.opengl.GLES10;
            import java.lang.invoke.VarHandle;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import javax.microedition.khronos.egl.EGL10;
            import javax.microedition.khronos.egl.EGLConfig;
            import javax.microedition.khronos.egl.EGLContext;
            import javax.microedition.khronos.egl.EGLDisplay;
            import javax.microedition.khronos.egl.EGLSurface;
            
            public abstract class l0IIloIo1i0i {
                public static final Pattern I00000oIO = Pattern.compile("^OpenGL ES(-C[ML])? (\\d)\\.(\\d).*$");

                /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
                
                    r10 = r4;
                 */
                /* JADX WARN: Removed duplicated region for block: B:91:0x00e5 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final il1I111 I00000oIO() throws Exception {
                    EGLDisplay eGLDisplayEglGetDisplay;
                    EGLSurface eGLSurface;
                    int i;
                    EGLContext eGLContextEglCreateContext;
                    int[] iArr;
                    EGLConfig[] eGLConfigArr;
/* 6 */             EGL10 egl10 = (EGL10) EGLContext.getEGL();
/* 9 */             if (egl10 == null) {
/* 388 */               throw new iliiIi1i(0, "EGLContext.getEGL() returned null");
                    }
/* 11 */            EGLContext eGLContextEglGetCurrentContext = egl10.eglGetCurrentContext();
/* 15 */            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
/* 17 */            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
/* 20 */            if (eGLContextEglGetCurrentContext == null || eGLContextEglGetCurrentContext.equals(eGLContext)) {
/* 35 */                eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
/* 39 */                if (eGLDisplayEglGetDisplay == null || eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
/* 380 */                   throw iliiIi1i.I00000oIO(egl10, "egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY)");
                        }
/* 47 */                egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
/* 52 */                I00000oOI(egl10, "egl.eglInitialize");
/* 68 */                int[][] iArr2 = {new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12326, 8, 12325, 8, 12352, 4, 12344}, new int[]{12326, 8, 12325, 8, 12338, 0, 12344}};
/* 85 */                int[][] iArr3 = {new int[]{12440, 2, 12344}, new int[]{12440, 1, 12344}};
/* 89 */                int i2 = 0;
/* 90 */                EGLSurface eGLSurfaceEglCreatePbufferSurface = null;
                        while (true) {
/* 91 */                    if (i2 >= 2) {
                                break;
                            }
/* 93 */                    if (eGLSurfaceEglCreatePbufferSurface != null && eGLSurfaceEglCreatePbufferSurface != eGLSurface2) {
/* 97 */                        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, eGLContext);
/* 100 */                       egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                            }
/* 103 */                   if (eGLContextEglGetCurrentContext != null && eGLContextEglGetCurrentContext != eGLContext) {
/* 107 */                       egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglGetCurrentContext);
                            }
                            try {
/* 110 */                       iArr = new int[1];
/* 112 */                       int i3 = i2;
                                try {
/* 120 */                           i = i3;
                                    try {
/* 122 */                               I0000Il00O(egl10, eGLDisplayEglGetDisplay, iArr2[i3], null, 0, iArr);
/* 125 */                               int i4 = iArr[0];
/* 127 */                               eGLConfigArr = new EGLConfig[i4];
/* 131 */                               I0000Il00O(egl10, eGLDisplayEglGetDisplay, iArr2[i], eGLConfigArr, i4, iArr);
                                    } catch (Exception e) {
/* 191 */                               e = e;
/* 221 */                               eGLContextEglCreateContext = null;
/* 189 */                               eGLSurfaceEglCreatePbufferSurface = null;
/* 223 */                               if (i > 0) {
/* 230 */                                   throw e;
                                        }
/* 184 */                               eGLContextEglGetCurrentContext = eGLContextEglCreateContext;
/* 226 */                               i2 = i + 1;
                                    }
                                } catch (Exception e2) {
/* 216 */                           e = e2;
/* 217 */                           i = i3;
                                }
                            } catch (Exception e3) {
/* 219 */                       e = e3;
/* 220 */                       i = i2;
                            }
/* 136 */                   if (iArr[0] <= 0) {
/* 215 */                       throw new iliiIi1i(0, "No matching configs found for set " + i);
                            }
/* 142 */                   eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfigArr[0], eGLContext, iArr3[i]);
                            try {
/* 148 */                       I00000oOI(egl10, "egl.eglCreateContext");
/* 161 */                       eGLSurfaceEglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfigArr[0], new int[]{12375, 2, 12374, 2, 12344});
                            } catch (Exception e4) {
/* 188 */                       e = e4;
/* 189 */                       eGLSurfaceEglCreatePbufferSurface = null;
/* 223 */                       if (i > 0) {
                                }
/* 184 */                       eGLContextEglGetCurrentContext = eGLContextEglCreateContext;
/* 226 */                       i2 = i + 1;
                            }
                            try {
/* 167 */                       I00000oOI(egl10, "egl.eglCreatePbufferSurface");
/* 170 */                       boolean zEglMakeCurrent = egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
/* 176 */                       I00000oOI(egl10, "egl.eglMakeCurrent");
/* 179 */                       if (zEglMakeCurrent) {
/* 181 */                           eGLContextEglGetCurrentContext = eGLContextEglCreateContext;
                                    break;
                                }
                            } catch (Exception e5) {
/* 186 */                       e = e5;
/* 223 */                       if (i > 0) {
                                }
/* 184 */                       eGLContextEglGetCurrentContext = eGLContextEglCreateContext;
/* 226 */                       i2 = i + 1;
                            }
/* 184 */                   eGLContextEglGetCurrentContext = eGLContextEglCreateContext;
/* 226 */                   i2 = i + 1;
                        }
                    } else {
/* 29 */                eGLDisplayEglGetDisplay = null;
/* 30 */                eGLSurface = null;
                    }
/* 231 */           if (eGLContextEglGetCurrentContext == null || eGLContextEglGetCurrentContext.equals(eGLContext)) {
/* 373 */               throw iliiIi1i.I00000oIO(egl10, "Finding or creating a context");
                    }
/* 241 */           String strGlGetString = GLES10.glGetString(7938);
/* 247 */           I00000oOI(egl10, "GLES10.glGetString(GLES10.GL_VERSION)");
/* 252 */           String strGlGetString2 = GLES10.glGetString(7937);
/* 258 */           I00000oOI(egl10, "GLES10.glGetString(GLES10.GL_RENDERER)");
/* 263 */           String strGlGetString3 = GLES10.glGetString(7936);
/* 269 */           I00000oOI(egl10, "GLES10.glGetString(GLES10.GL_VENDOR)");
/* 272 */           if (eGLSurface != null && eGLDisplayEglGetDisplay != null) {
/* 276 */               egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, eGLContext);
/* 279 */               egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurface);
/* 282 */               egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglGetCurrentContext);
                    }
/* 285 */           if (strGlGetString == null || strGlGetString2 == null || strGlGetString3 == null) {
/* 366 */               throw new iliiIi1i(0, "Got null value for a GL string");
                    }
/* 293 */           Matcher matcher = I00000oIO.matcher(strGlGetString);
/* 301 */           if (!matcher.find() || matcher.groupCount() != 3) {
/* 358 */               throw new iliiIi1i(0, "Failed to parse version from ".concat(strGlGetString));
                    }
/* 316 */           int i5 = Integer.parseInt(matcher.group(2), 10);
/* 324 */           int i6 = Integer.parseInt(matcher.group(3), 10);
/* 330 */           il1I111 il1i111 = new il1I111();
/* 333 */           il1i111.I00000oIO = strGlGetString2;
/* 335 */           il1i111.I00000oOI = strGlGetString;
/* 337 */           il1i111.I0000Il00O = i5;
/* 339 */           il1i111.I0000O = i6;
/* 341 */           il1i111.I0000oI00 = strGlGetString3;
/* 343 */           VarHandle.storeStoreFence();
/* 346 */           return il1i111;
                }

                public static void I00000oOI(EGL10 egl10, String str) throws iliiIi1i {
/* 1 */             int iEglGetError = egl10.eglGetError();
/* 7 */             if (iEglGetError != 12288) {
/* 37 */                throw new iliiIi1i(iEglGetError, IlIi0I0.I000OiO(iEglGetError, "EGL error ", " during ", str));
                    }
                }

                public static void I0000Il00O(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr, EGLConfig[] eGLConfigArr, int i, int[] iArr2) throws iliiIi1i {
                    try {
/* 1 */                 egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i, iArr2);
/* 6 */                 I00000oOI(egl10, "egl.eglChooseConfig");
                    } catch (RuntimeException e) {
/* 24 */                iliiIi1i iliiii1i = new iliiIi1i("egl.eglChooseConfig failed with ".concat(e.toString()), e);
/* 28 */                iliiii1i.I00iOIl = 0;
/* 30 */                VarHandle.storeStoreFence();
/* 685 */               throw iliiii1i;
                    }
                }
            }
