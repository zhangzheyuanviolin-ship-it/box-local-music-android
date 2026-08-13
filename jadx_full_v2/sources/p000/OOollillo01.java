            package p000;

            import android.graphics.RectF;
            import java.util.Arrays;
            
            public final class OOollillo01 implements Ii0010O01 {
                public float I00000oIO;

                @Override
                public final float I00000oIO(RectF rectF) {
/* 15 */            return Math.min(rectF.width(), rectF.height()) * this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof OOollillo01) && this.I00000oIO == ((OOollillo01) obj).I00000oIO;
                }

                public final int hashCode() {
/* 11 */            return Arrays.hashCode(new Object[]{Float.valueOf(this.I00000oIO)});
                }

                public final String toString() {
/* 14 */            return IIl001iO0Io.I000lI((int) (this.I00000oIO * 100.0f), "%", new StringBuilder());
                }
            }
