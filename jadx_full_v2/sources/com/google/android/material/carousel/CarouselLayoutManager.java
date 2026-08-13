            package com.google.android.material.carousel;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Paint;
            import android.util.AttributeSet;
            import java.util.ArrayList;
            import java.util.Collections;
            import p000.I000II;
            import p000.IO0i1i;
            import p000.IO0i1l1Io;
            import p000.OOilOii0o1I;
            import p000.Oi010OO0;
            import p000.lIl0oooi;
            
/* 49 */    public class CarouselLayoutManager extends lIl0oooi {
                public IO0i1l1Io I00000oIO;

                public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
/* 6 */             Paint paint = new Paint();
/* 14 */            Collections.unmodifiableList(new ArrayList());
/* 19 */            paint.setStrokeWidth(5.0f);
/* 25 */            paint.setColor(-65281);
/* 28 */            if (attributeSet != null) {
/* 32 */                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOii0o1I.I00000oOI);
/* 37 */                typedArrayObtainStyledAttributes.getInt(0, 0);
/* 44 */                I00000oOI(typedArrayObtainStyledAttributes.getInt(0, 0));
/* 47 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                public final void I00000oOI(int i) {
                    IO0i1i iO0i1i;
/* 2 */             if (i != 0 && i != 1) {
/* 13 */                I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "invalid orientation:"));
/* 16 */                return;
                    }
/* 17 */            IO0i1l1Io iO0i1l1Io = this.I00000oIO;
/* 19 */            if (iO0i1l1Io == null || i != iO0i1l1Io.I00iOIl) {
/* 27 */                if (i == 0) {
/* 46 */                    iO0i1i = new IO0i1i(0);
                        } else {
/* 29 */                    if (i != 1) {
/* 39 */                        I000II.I000iOII("invalid orientation");
/* 42 */                        return;
                            }
/* 33 */                    iO0i1i = new IO0i1i(1);
                        }
/* 49 */                this.I00000oIO = iO0i1i;
                    }
                }

/* 50 */        public CarouselLayoutManager() {
/* 52 */            Paint paint = new Paint();
/* 53 */            Collections.unmodifiableList(new ArrayList());
/* 54 */            paint.setStrokeWidth(5.0f);
/* 55 */            paint.setColor(-65281);
/* 56 */            I00000oOI(0);
                }
            }
