            package p000;

            import android.graphics.RectF;
            import java.util.Arrays;
            
            public final class I0OIIO1o1 implements Ii0010O01 {
                public Ii0010O01 I00000oIO;
                public float I00000oOI;

                @Override
                public final float I00000oIO(RectF rectF) {
/* 11 */            return Math.max(0.0f, this.I00000oIO.I00000oIO(rectF) + this.I00000oOI);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I0OIIO1o1)) {
/* 7 */                 return false;
                    }
/* 11 */            I0OIIO1o1 i0OIIO1o1 = (I0OIIO1o1) obj;
                    return this.I00000oIO.equals(i0OIIO1o1.I00000oIO) && this.I00000oOI == i0OIIO1o1.I00000oOI;
                }

                public final int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{this.I00000oIO, Float.valueOf(this.I00000oOI)});
                }
            }
