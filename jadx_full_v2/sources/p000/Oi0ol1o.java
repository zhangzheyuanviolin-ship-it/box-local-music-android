            package p000;

            import android.content.res.Resources;
            import java.util.Objects;
            
            public final class Oi0ol1o {
                public Resources I00000oIO;
                public Resources.Theme I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && Oi0ol1o.class == obj.getClass()) {
/* 17 */                Oi0ol1o oi0ol1o = (Oi0ol1o) obj;
/* 27 */                if (this.I00000oIO.equals(oi0ol1o.I00000oIO) && Objects.equals(this.I00000oOI, oi0ol1o.I00000oOI)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.I00000oIO, this.I00000oOI);
                }
            }
