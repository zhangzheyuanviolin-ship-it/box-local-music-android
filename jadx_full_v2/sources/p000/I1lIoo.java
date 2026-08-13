            package p000;

            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            
            public final class I1lIoo {
                public int I00000oIO;
                public Surface I00000oOI;

                public static I1lIoo I00000oIO(int i, Surface surface) {
/* 3 */             I1lIoo i1lIoo = new I1lIoo();
/* 6 */             i1lIoo.I00000oIO = i;
/* 8 */             if (surface == null) {
/* 18 */                IOOlIIilOl0.I000II("Null surface");
/* 21 */                return null;
                    }
/* 10 */            i1lIoo.I00000oOI = surface;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            return i1lIoo;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 26 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1lIoo)) {
/* 28 */                return false;
                    }
/* 8 */             I1lIoo i1lIoo = (I1lIoo) obj;
                    return this.I00000oIO == i1lIoo.I00000oIO && this.I00000oOI.equals(i1lIoo.I00000oOI);
                }

                public final int hashCode() {
/* 14 */            return this.I00000oOI.hashCode() ^ ((this.I00000oIO ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "Result{resultCode=" + this.I00000oIO + ", surface=" + this.I00000oOI + "}";
                }
            }
