            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1iIilil {
                public int I00000oIO;

                public static final I1iIilil I00000oIO(int i) {
/* 3 */             I1iIilil i1iIilil = new I1iIilil();
/* 6 */             i1iIilil.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return i1iIilil;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof I1iIilil) && this.I00000oIO == ((I1iIilil) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 7 */             return Oi010OO0.I0010I0i("AudioRestrictionMode(value=", this.I00000oIO, ')');
                }
            }
