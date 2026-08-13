            package p000;

            import android.graphics.Point;
            import android.view.Display;
            import android.view.RoundedCorner;
            import java.lang.invoke.VarHandle;
            
            public abstract class il1i1IilIol {
                public static OiI10iIOOol0 I00000oIO(Display display, int i) {
                    int i2;
/* 1 */             RoundedCorner roundedCorner = display.getRoundedCorner(i);
/* 6 */             if (roundedCorner == null) {
/* 5 */                 return null;
                    }
/* 10 */            int position = roundedCorner.getPosition();
/* 14 */            if (position != 0) {
/* 16 */                i2 = 1;
/* 17 */                if (position != 1) {
/* 19 */                    i2 = 2;
/* 20 */                    if (position != 2) {
/* 22 */                        i2 = 3;
/* 23 */                        if (position != 3) {
/* 32 */                            I000II.I000iOII(Oi010OO0.I000oI1ioi(position, "Invalid position: "));
/* 5 */                             return null;
                                }
                            }
                        }
                    } else {
/* 36 */                i2 = 0;
                    }
/* 37 */            int radius = roundedCorner.getRadius();
/* 41 */            Point center = roundedCorner.getCenter();
/* 45 */            int i3 = center.x;
/* 47 */            int i4 = center.y;
/* 49 */            OiI10iIOOol0 oiI10iIOOol0 = new OiI10iIOOol0();
/* 52 */            oiI10iIOOol0.I00000oIO = i2;
/* 54 */            oiI10iIOOol0.I00000oOI = radius;
/* 61 */            oiI10iIOOol0.I0000Il00O = new Point(i3, i4);
/* 63 */            VarHandle.storeStoreFence();
/* 66 */            return oiI10iIOOol0;
                }
            }
