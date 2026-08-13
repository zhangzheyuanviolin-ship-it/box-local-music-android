            package p000;

            import android.graphics.Point;
            
            public final class OiI10iIOOol0 {
                public int I00000oIO;
                public int I00000oOI;
                public Point I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof OiI10iIOOol0) {
/* 10 */                OiI10iIOOol0 oiI10iIOOol0 = (OiI10iIOOol0) obj;
/* 16 */                if (this.I00000oIO == oiI10iIOOol0.I00000oIO && this.I00000oOI == oiI10iIOOol0.I00000oOI && this.I0000Il00O.equals(oiI10iIOOol0.I0000Il00O)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 16 */            return this.I0000Il00O.hashCode() + (((this.I00000oIO * 31) + this.I00000oOI) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
/* 8 */             int i = this.I00000oIO;
/* 35 */            sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
/* 40 */            sb.append(", radius=");
/* 45 */            sb.append(this.I00000oOI);
/* 50 */            sb.append(", center=");
/* 55 */            sb.append(this.I0000Il00O);
/* 60 */            sb.append('}');
/* 63 */            return sb.toString();
                }
            }
