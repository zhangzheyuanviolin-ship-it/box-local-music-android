            package p000;

            import javax.microedition.khronos.egl.EGL10;
            
            public final class il11lI extends Exception {
                public int I00iOIl;

                public il11lI(int i, String str) {
/* 1 */             super(str);
/* 4 */             this.I00iOIl = i;
                }

                public static il11lI I00000oIO(EGL10 egl10, String str) {
/* 1 */             int iEglGetError = egl10.eglGetError();
                    return iEglGetError != 12288 ? new il11lI(iEglGetError, IlIi0I0.I000OiO(iEglGetError, "EGL error ", " during ", str)) : new il11lI(0, "EGL context not available during ".concat(str));
                }
            }
