            package p000;

            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.widget.TextView;
            import java.lang.invoke.VarHandle;
            
            public final class I1I01O1lO1o1 {
                public final TextView I00000oIO;
                public final Oi00IilOloo0 I00000oOI;

                public I1I01O1lO1o1(TextView textView) {
/* 4 */             this.I00000oIO = textView;
/* 8 */             Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 13 */            IioooOi1 iioooOi1 = new IioooOi1();
/* 18 */            Iioolooo00I iioolooo00I = new Iioolooo00I();
/* 21 */            iioolooo00I.I00000oIO = textView;
/* 24 */            iioolooo00I.I0000Il00O = true;
/* 28 */            IiooOOOO0IIO iiooOOOO0IIO = new IiooOOOO0IIO();
/* 31 */            iiooOOOO0IIO.I00000oIO = textView;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            iioolooo00I.I00000oOI = iiooOOOO0IIO;
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            iioooOi1.I00000oIO = iioolooo00I;
/* 43 */            VarHandle.storeStoreFence();
/* 46 */            oi00IilOloo0.I00iOIl = iioooOi1;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            this.I00000oOI = oi00IilOloo0;
                }

                public final void I00000oIO(AttributeSet attributeSet, int i) {
/* 10 */            TypedArray typedArrayObtainStyledAttributes = this.I00000oIO.getContext().obtainStyledAttributes(attributeSet, OOilOli0.I000OOo1O, i, 0);
                    try {
/* 23 */                boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
/* 30 */                typedArrayObtainStyledAttributes.recycle();
/* 33 */                I0000Il00O(z);
                    } catch (Throwable th) {
/* 37 */                typedArrayObtainStyledAttributes.recycle();
/* 106 */               throw th;
                    }
                }

                public final void I00000oOI(boolean z) {
/* 7 */             ((ilI1Oi0) this.I00000oOI.I00iOIl).I00000oOI(z);
                }

                public final void I0000Il00O(boolean z) {
/* 7 */             ((ilI1Oi0) this.I00000oOI.I00iOIl).I0000Il00O(z);
                }
            }
