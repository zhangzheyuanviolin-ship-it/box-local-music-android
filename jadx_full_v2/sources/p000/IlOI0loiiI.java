            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class IlOI0loiiI {
                public static final List I00000oOI = IOOi1I.I000O01llI0(I00000oIO(0), I00000oIO(1), I00000oIO(2));
                public int I00000oIO;

                public static final IlOI0loiiI I00000oIO(int i) {
/* 3 */             IlOI0loiiI ilOI0loiiI = new IlOI0loiiI();
/* 6 */             ilOI0loiiI.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return ilOI0loiiI;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IlOI0loiiI) && this.I00000oIO == ((IlOI0loiiI) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 7 */             return Oi010OO0.I0010I0i("FlashMode(value=", this.I00000oIO, ')');
                }
            }
