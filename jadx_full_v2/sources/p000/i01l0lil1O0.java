            package p000;

            import android.graphics.Paint;
            
            public final class i01l0lil1O0 {
                public static final i01l0lil1O0 I00000oIO = new i01l0lil1O0();

                public final long I00000oIO(Paint paint) {
/* 1 */             int i = IOOiio0i.I000oI1ioi;
/* 3 */             long colorLong = paint.getColorLong();
/* 9 */             long j = 63 & colorLong;
                    return j < 16 ? colorLong : (colorLong & (-64)) | (j + 1);
                }

                public final void I00000oOI(Paint paint, int i) {
/* 5 */             paint.setBlendMode(iOIill.I00000oIO(i));
                }

                public final void I0000Il00O(Paint paint, long j) {
/* 5 */             paint.setColor(iOIl0I.I00000oOI(j));
                }
            }
