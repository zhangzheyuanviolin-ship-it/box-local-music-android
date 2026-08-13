            package p000;

            import android.content.res.Resources;
            
            public final class Ioii1iOi00 {
                public Resources.Theme I00000oIO;
                public int I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ioii1iOi00)) {
/* 7 */                 return false;
                    }
/* 11 */            Ioii1iOi00 ioii1iOi00 = (Ioii1iOi00) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ioii1iOi00.I00000oIO) && this.I00000oOI == ioii1iOi00.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "Key(theme=" + this.I00000oIO + ", id=" + this.I00000oOI + ")";
                }
            }
