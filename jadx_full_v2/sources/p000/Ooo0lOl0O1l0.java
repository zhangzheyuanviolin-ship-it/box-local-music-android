            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.Paint;
            
            public final class Ooo0lOl0O1l0 extends Ooo0olli {
                public I00Ol00 I0000O;
                public float I0000oI00;
                public I00Ol00 I0001Ioi1lo;
                public float I000II;
                public float I000O01llI0;
                public float I000OOo1O;
                public float I000OiO;
                public float I000iOII;
                public Paint.Cap I000l1;
                public Paint.Join I000lI;
                public float I000o00OoI0I;

                @Override
                public final boolean I00000oIO() {
                    return this.I0001Ioi1lo.I000lI() || this.I0000O.I000lI();
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00000oOI(int[] iArr) {
                    boolean z;
/* 1 */             I00Ol00 i00Ol00 = this.I0001Ioi1lo;
/* 7 */             boolean z2 = true;
/* 9 */             if (i00Ol00.I000lI()) {
/* 13 */                ColorStateList colorStateList = (ColorStateList) i00Ol00.I0000O;
/* 19 */                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
/* 25 */                if (colorForState != i00Ol00.I00000oOI) {
/* 27 */                    i00Ol00.I00000oOI = colorForState;
/* 29 */                    z = true;
                        } else {
/* 31 */                    z = false;
                        }
                    }
/* 32 */            I00Ol00 i00Ol002 = this.I0000O;
/* 38 */            if (i00Ol002.I000lI()) {
/* 42 */                ColorStateList colorStateList2 = (ColorStateList) i00Ol002.I0000O;
/* 48 */                int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
/* 54 */                if (colorForState2 != i00Ol002.I00000oOI) {
/* 56 */                    i00Ol002.I00000oOI = colorForState2;
                        } else {
/* 59 */                    z2 = false;
                        }
                    }
/* 60 */            return z | z2;
                }

                public float getFillAlpha() {
/* 1 */             return this.I000O01llI0;
                }

                public int getFillColor() {
/* 3 */             return this.I0001Ioi1lo.I00000oOI;
                }

                public float getStrokeAlpha() {
/* 1 */             return this.I000II;
                }

                public int getStrokeColor() {
/* 3 */             return this.I0000O.I00000oOI;
                }

                public float getStrokeWidth() {
/* 1 */             return this.I0000oI00;
                }

                public float getTrimPathEnd() {
/* 1 */             return this.I000OiO;
                }

                public float getTrimPathOffset() {
/* 1 */             return this.I000iOII;
                }

                public float getTrimPathStart() {
/* 1 */             return this.I000OOo1O;
                }

                public void setFillAlpha(float f) {
/* 1 */             this.I000O01llI0 = f;
                }

                public void setFillColor(int i) {
/* 3 */             this.I0001Ioi1lo.I00000oOI = i;
                }

                public void setStrokeAlpha(float f) {
/* 1 */             this.I000II = f;
                }

                public void setStrokeColor(int i) {
/* 3 */             this.I0000O.I00000oOI = i;
                }

                public void setStrokeWidth(float f) {
/* 1 */             this.I0000oI00 = f;
                }

                public void setTrimPathEnd(float f) {
/* 1 */             this.I000OiO = f;
                }

                public void setTrimPathOffset(float f) {
/* 1 */             this.I000iOII = f;
                }

                public void setTrimPathStart(float f) {
/* 1 */             this.I000OOo1O = f;
                }
            }
