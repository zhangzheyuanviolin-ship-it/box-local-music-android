            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class I0OIi10lO0iO {
                public static final List I00000oOI = IOOi1I.I000O01llI0(I00000oIO(0), I00000oIO(1), I00000oIO(2), I00000oIO(3), I00000oIO(4), I00000oIO(5), I00000oIO(6));
                public int I00000oIO;

                public static final I0OIi10lO0iO I00000oIO(int i) {
/* 3 */             I0OIi10lO0iO i0OIi10lO0iO = new I0OIi10lO0iO();
/* 6 */             i0OIi10lO0iO.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return i0OIi10lO0iO;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof I0OIi10lO0iO) && this.I00000oIO == ((I0OIi10lO0iO) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 7 */             return Oi010OO0.I0010I0i("AeMode(value=", this.I00000oIO, ')');
                }
            }
