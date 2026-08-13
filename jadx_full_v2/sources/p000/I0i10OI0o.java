            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class I0i10OI0o {
                public static final List I00000oOI = IOOi1I.I000O01llI0(I00000oIO(0), I00000oIO(1), I00000oIO(2), I00000oIO(3), I00000oIO(4), I00000oIO(5));
                public int I00000oIO;

                public static final I0i10OI0o I00000oIO(int i) {
/* 3 */             I0i10OI0o i0i10OI0o = new I0i10OI0o();
/* 6 */             i0i10OI0o.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return i0i10OI0o;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof I0i10OI0o) && this.I00000oIO == ((I0i10OI0o) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 7 */             return Oi010OO0.I0010I0i("AfMode(value=", this.I00000oIO, ')');
                }
            }
