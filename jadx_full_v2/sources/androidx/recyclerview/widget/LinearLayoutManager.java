            package androidx.recyclerview.widget;

            import android.content.Context;
            import android.util.AttributeSet;
            import p000.I000II;
            import p000.OIilII0oO1;
            import p000.OOo0l0;
            import p000.Oi010OO0;
            import p000.lIl0oooi;
            
            public class LinearLayoutManager extends lIl0oooi {
                public final int I00000oIO;
                public final OIilII0oO1 I00000oOI;
                public final boolean I0000Il00O;
                public boolean I0000O = false;

                public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
/* 5 */             this.I00000oIO = 1;
/* 8 */             this.I0000Il00O = false;
/* 12 */            OOo0l0 oOo0l0I00000oIO = lIl0oooi.I00000oIO(context, attributeSet, i, i2);
/* 16 */            int i3 = oOo0l0I00000oIO.I00000oIO;
/* 18 */            if (i3 != 0 && i3 != 1) {
/* 29 */                I000II.I000iOII(Oi010OO0.I000oI1ioi(i3, "invalid orientation:"));
/* 33 */                throw null;
                    }
/* 36 */            if (i3 != this.I00000oIO || this.I00000oOI == null) {
/* 46 */                this.I00000oOI = OIilII0oO1.I00000oIO(this, i3);
/* 48 */                this.I00000oIO = i3;
                    }
/* 50 */            boolean z = oOo0l0I00000oIO.I0000Il00O;
/* 54 */            if (z != this.I0000Il00O) {
/* 57 */                this.I0000Il00O = z;
                    }
/* 61 */            I00000oOI(oOo0l0I00000oIO.I0000O);
                }

                public void I00000oOI(boolean z) {
/* 3 */             if (this.I0000O == z) {
/* 5 */                 return;
                    }
/* 6 */             this.I0000O = z;
                }
            }
