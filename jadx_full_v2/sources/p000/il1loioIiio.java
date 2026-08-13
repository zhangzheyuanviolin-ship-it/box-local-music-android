            package p000;

            import android.view.DragEvent;
            
            public abstract class il1loioIiio {
                public static final long I00000oIO(I0IIiO0iI i0IIiO0iI) {
/* 3 */             DragEvent dragEvent = (DragEvent) i0IIiO0iI.I00iiI;
/* 5 */             float x = dragEvent.getX();
/* 9 */             float y = dragEvent.getY();
/* 32 */            return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
                }
            }
