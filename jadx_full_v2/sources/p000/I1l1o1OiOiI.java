            package p000;

            import android.opengl.EGLSurface;
            
            public final class I1l1o1OiOiI {
                public EGLSurface I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1l1o1OiOiI) {
/* 10 */                I1l1o1OiOiI i1l1o1OiOiI = (I1l1o1OiOiI) obj;
/* 20 */                if (this.I00000oIO.equals(i1l1o1OiOiI.I00000oIO) && this.I00000oOI == i1l1o1OiOiI.I00000oOI && this.I0000Il00O == i1l1o1OiOiI.I0000Il00O) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            return this.I0000Il00O ^ ((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", width=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", height=");
/* 32 */            return IIl001iO0Io.I000lI(this.I0000Il00O, "}", sb);
                }
            }
