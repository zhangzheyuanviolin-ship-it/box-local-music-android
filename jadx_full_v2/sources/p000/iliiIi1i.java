            package p000;

            import javax.microedition.khronos.egl.EGL10;
            
            public final class iliiIi1i extends Exception {
                public int I00iOIl;

                public iliiIi1i(int i, String str) {
/* 1 */             super(str);
/* 4 */             this.I00iOIl = i;
                }

                public static iliiIi1i I00000oIO(EGL10 egl10, String str) {
/* 1 */             int iEglGetError = egl10.eglGetError();
                    return iEglGetError != 12288 ? new iliiIi1i(iEglGetError, IlIi0I0.I000OiO(iEglGetError, "EGL error ", " during ", str)) : new iliiIi1i(0, "EGL context not available during ".concat(str));
                }
            }
