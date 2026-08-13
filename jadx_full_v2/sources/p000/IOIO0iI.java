            package p000;

            import android.graphics.RectF;
            import java.util.Arrays;
            
            public final class IOIO0iI implements Ii0010O01 {
                public float I00000oIO;

                @Override
                public final float I00000oIO(RectF rectF) {
/* 1 */             float f = this.I00000oIO;
/* 15 */            float fMin = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
/* 22 */            if (f < 0.0f) {
/* 19 */                return 0.0f;
                    }
                    return f > fMin ? fMin : f;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof IOIO0iI) && this.I00000oIO == ((IOIO0iI) obj).I00000oIO;
                }

                public final int hashCode() {
/* 11 */            return Arrays.hashCode(new Object[]{Float.valueOf(this.I00000oIO)});
                }
            }
