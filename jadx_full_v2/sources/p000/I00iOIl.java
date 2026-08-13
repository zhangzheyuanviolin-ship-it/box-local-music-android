            package p000;

            import android.graphics.RectF;
            import java.util.Arrays;
            
            public final class I00iOIl implements Ii0010O01 {
                public final float I00000oIO;

                public I00iOIl(float f) {
/* 4 */             this.I00000oIO = f;
                }

                @Override
                public final float I00000oIO(RectF rectF) {
/* 1 */             return this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof I00iOIl) && this.I00000oIO == ((I00iOIl) obj).I00000oIO;
                }

                public final int hashCode() {
/* 11 */            return Arrays.hashCode(new Object[]{Float.valueOf(this.I00000oIO)});
                }

                public final String toString() {
/* 10 */            return Oi010OO0.I001i1O0Ol(new StringBuilder(), this.I00000oIO, "px");
                }
            }
