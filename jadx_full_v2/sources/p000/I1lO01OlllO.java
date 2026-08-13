            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1lO01OlllO {
                public int I00000oIO;
                public Ioi1lIO I00000oOI;

                public static I1lO01OlllO I00000oIO(int i, Ioi1lIO ioi1lIO) {
/* 3 */             I1lO01OlllO i1lO01OlllO = new I1lO01OlllO();
/* 6 */             i1lO01OlllO.I00000oIO = i;
/* 8 */             i1lO01OlllO.I00000oOI = ioi1lIO;
/* 10 */            VarHandle.storeStoreFence();
/* 37 */            return i1lO01OlllO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1lO01OlllO) {
/* 10 */                I1lO01OlllO i1lO01OlllO = (I1lO01OlllO) obj;
/* 16 */                if (this.I00000oIO == i1lO01OlllO.I00000oIO && this.I00000oOI.equals(i1lO01OlllO.I00000oOI)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 14 */            return this.I00000oOI.hashCode() ^ ((this.I00000oIO ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "CaptureError{requestId=" + this.I00000oIO + ", imageCaptureException=" + this.I00000oOI + "}";
                }
            }
