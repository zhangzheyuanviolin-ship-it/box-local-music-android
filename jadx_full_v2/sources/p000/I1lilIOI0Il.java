            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class I1lilIOI0Il {
                public static final List I00000oOI = IOOi1I.I000O01llI0(I00000oIO(0), I00000oIO(1), I00000oIO(6), I00000oIO(5), I00000oIO(2), I00000oIO(3), I00000oIO(8), I00000oIO(7));
                public int I00000oIO;

                public static final I1lilIOI0Il I00000oIO(int i) {
/* 3 */             I1lilIOI0Il i1lilIOI0Il = new I1lilIOI0Il();
/* 6 */             i1lilIOI0Il.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return i1lilIOI0Il;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof I1lilIOI0Il) && this.I00000oIO == ((I1lilIOI0Il) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 7 */             return Oi010OO0.I0010I0i("AwbMode(value=", this.I00000oIO, ')');
                }
            }
