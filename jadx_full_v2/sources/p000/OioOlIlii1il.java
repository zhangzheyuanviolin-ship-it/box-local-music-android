            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.RectF;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.ContextThemeWrapper;
            import java.lang.invoke.VarHandle;
            
            public final class OioOlIlii1il {
                public iiol0Oi0 I00000oIO;
                public iiol0Oi0 I00000oOI;
                public iiol0Oi0 I0000Il00O;
                public iiol0Oi0 I0000O;
                public Ii0010O01 I0000oI00;
                public Ii0010O01 I0001Ioi1lo;
                public Ii0010O01 I000II;
                public Ii0010O01 I000O01llI0;
                public Iioi0lilII I000OOo1O;
                public Iioi0lilII I000OiO;
                public Iioi0lilII I000iOII;
                public Iioi0lilII I000l1;

                public static OioOio1lI0 I00000oIO(Context context, int i, int i2, I00iOIl i00iOIl) {
/* 3 */             ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
/* 7 */             if (i2 != 0) {
/* 13 */                contextThemeWrapper.getTheme().applyStyle(i2, true);
                    }
/* 18 */            TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(OOilOii0o1I.I000o00OoI0I);
                    try {
/* 23 */                int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
/* 28 */                int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
/* 33 */                int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
/* 38 */                int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
/* 42 */                int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
/* 47 */                Ii0010O01 ii0010O01I0000Il00O = I0000Il00O(typedArrayObtainStyledAttributes, 5, i00iOIl);
/* 53 */                Ii0010O01 ii0010O01I0000Il00O2 = I0000Il00O(typedArrayObtainStyledAttributes, 8, ii0010O01I0000Il00O);
/* 59 */                Ii0010O01 ii0010O01I0000Il00O3 = I0000Il00O(typedArrayObtainStyledAttributes, 9, ii0010O01I0000Il00O);
/* 64 */                Ii0010O01 ii0010O01I0000Il00O4 = I0000Il00O(typedArrayObtainStyledAttributes, 7, ii0010O01I0000Il00O);
/* 69 */                Ii0010O01 ii0010O01I0000Il00O5 = I0000Il00O(typedArrayObtainStyledAttributes, 6, ii0010O01I0000Il00O);
/* 75 */                OioOio1lI0 oioOio1lI0 = new OioOio1lI0();
/* 82 */                oioOio1lI0.I00000oIO = l1I11i.I00000oIO(i4);
/* 84 */                oioOio1lI0.I0000oI00 = ii0010O01I0000Il00O2;
/* 90 */                oioOio1lI0.I00000oOI = l1I11i.I00000oIO(i5);
/* 92 */                oioOio1lI0.I0001Ioi1lo = ii0010O01I0000Il00O3;
/* 98 */                oioOio1lI0.I0000Il00O = l1I11i.I00000oIO(i6);
/* 100 */               oioOio1lI0.I000II = ii0010O01I0000Il00O4;
/* 106 */               oioOio1lI0.I0000O = l1I11i.I00000oIO(i7);
/* 108 */               oioOio1lI0.I000O01llI0 = ii0010O01I0000Il00O5;
/* 113 */               return oioOio1lI0;
                    } finally {
/* 115 */               typedArrayObtainStyledAttributes.recycle();
                    }
                }

                public static OioOio1lI0 I00000oOI(Context context, AttributeSet attributeSet, int i, int i2) {
/* 4 */             I00iOIl i00iOIl = new I00iOIl(0.0f);
/* 9 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOii0o1I.I000OOo1O, i, i2);
/* 14 */            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
/* 19 */            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
/* 23 */            typedArrayObtainStyledAttributes.recycle();
/* 26 */            return I00000oIO(context, resourceId, resourceId2, i00iOIl);
                }

                public static Ii0010O01 I0000Il00O(TypedArray typedArray, int i, Ii0010O01 ii0010O01) {
/* 1 */             TypedValue typedValuePeekValue = typedArray.peekValue(i);
/* 5 */             if (typedValuePeekValue != null) {
/* 8 */                 int i2 = typedValuePeekValue.type;
/* 11 */                if (i2 == 5) {
/* 30 */                    return new I00iOIl(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
                        }
/* 35 */                if (i2 == 6) {
/* 41 */                    float fraction = typedValuePeekValue.getFraction(1.0f, 1.0f);
/* 45 */                    OOollillo01 oOollillo01 = new OOollillo01();
/* 48 */                    oOollillo01.I00000oIO = fraction;
/* 50 */                    VarHandle.storeStoreFence();
/* 53 */                    return oOollillo01;
                        }
                    }
/* 215 */           return ii0010O01;
                }

                public final boolean I0000O() {
                    return (this.I00000oOI instanceof OiI11loO0) && (this.I00000oIO instanceof OiI11loO0) && (this.I0000Il00O instanceof OiI11loO0) && (this.I0000O instanceof OiI11loO0);
                }

                public final boolean I0000oI00(RectF rectF) {
/* 55 */            boolean z = this.I000l1.getClass().equals(Iioi0lilII.class) && this.I000OiO.getClass().equals(Iioi0lilII.class) && this.I000OOo1O.getClass().equals(Iioi0lilII.class) && this.I000iOII.getClass().equals(Iioi0lilII.class);
/* 58 */            float fI00000oIO = this.I0000oI00.I00000oIO(rectF);
                    return z && ((this.I0001Ioi1lo.I00000oIO(rectF) > fI00000oIO ? 1 : (this.I0001Ioi1lo.I00000oIO(rectF) == fI00000oIO ? 0 : -1)) == 0 && (this.I000O01llI0.I00000oIO(rectF) > fI00000oIO ? 1 : (this.I000O01llI0.I00000oIO(rectF) == fI00000oIO ? 0 : -1)) == 0 && (this.I000II.I00000oIO(rectF) > fI00000oIO ? 1 : (this.I000II.I00000oIO(rectF) == fI00000oIO ? 0 : -1)) == 0) && I0000O();
                }

                public final OioOio1lI0 I0001Ioi1lo() {
/* 3 */             OioOio1lI0 oioOio1lI0 = new OioOio1lI0();
/* 8 */             oioOio1lI0.I00000oIO = this.I00000oIO;
/* 12 */            oioOio1lI0.I00000oOI = this.I00000oOI;
/* 16 */            oioOio1lI0.I0000Il00O = this.I0000Il00O;
/* 20 */            oioOio1lI0.I0000O = this.I0000O;
/* 24 */            oioOio1lI0.I0000oI00 = this.I0000oI00;
/* 28 */            oioOio1lI0.I0001Ioi1lo = this.I0001Ioi1lo;
/* 32 */            oioOio1lI0.I000II = this.I000II;
/* 36 */            oioOio1lI0.I000O01llI0 = this.I000O01llI0;
/* 40 */            oioOio1lI0.I000OOo1O = this.I000OOo1O;
/* 44 */            oioOio1lI0.I000OiO = this.I000OiO;
/* 48 */            oioOio1lI0.I000iOII = this.I000iOII;
/* 52 */            oioOio1lI0.I000l1 = this.I000l1;
/* 113 */           return oioOio1lI0;
                }

                public final String toString() {
/* 44 */            return "[" + this.I0000oI00 + ", " + this.I0001Ioi1lo + ", " + this.I000II + ", " + this.I000O01llI0 + "]";
                }
            }
