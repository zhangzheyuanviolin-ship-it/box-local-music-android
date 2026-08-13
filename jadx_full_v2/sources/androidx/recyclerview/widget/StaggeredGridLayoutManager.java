            package androidx.recyclerview.widget;

            import android.content.Context;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.BitSet;
            import p000.I000II;
            import p000.OIilII0oO1;
            import p000.OOo0l0;
            import p000.iolOOiI;
            import p000.lIl0oooi;
            
            public class StaggeredGridLayoutManager extends lIl0oooi {
                public final int I00000oIO;
                public final iolOOiI[] I00000oOI;
                public final OIilII0oO1 I0000Il00O;
                public final OIilII0oO1 I0000O;
                public final int I0000oI00;

                public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
/* 5 */             this.I00000oIO = -1;
/* 9 */             new Rect();
/* 12 */            OOo0l0 oOo0l0I00000oIO = lIl0oooi.I00000oIO(context, attributeSet, i, i2);
/* 16 */            int i3 = oOo0l0I00000oIO.I00000oIO;
/* 19 */            if (i3 != 0 && i3 != 1) {
/* 26 */                I000II.I000iOII("invalid orientation.");
/* 30 */                throw null;
                    }
/* 33 */            if (i3 != this.I0000oI00) {
/* 36 */                this.I0000oI00 = i3;
/* 38 */                OIilII0oO1 oIilII0oO1 = this.I0000Il00O;
/* 42 */                this.I0000Il00O = this.I0000O;
/* 44 */                this.I0000O = oIilII0oO1;
                    }
/* 46 */            int i4 = oOo0l0I00000oIO.I00000oOI;
/* 50 */            if (i4 != this.I00000oIO) {
/* 52 */                this.I00000oIO = i4;
/* 58 */                new BitSet(this.I00000oIO);
/* 65 */                this.I00000oOI = new iolOOiI[this.I00000oIO];
/* 70 */                for (int i5 = 0; i5 < this.I00000oIO; i5++) {
/* 72 */                    iolOOiI[] iolooiiArr = this.I00000oOI;
/* 78 */                    iolOOiI iolooii = new iolOOiI(15);
/* 83 */                    new ArrayList();
/* 86 */                    VarHandle.storeStoreFence();
/* 89 */                    iolooiiArr[i5] = iolooii;
                        }
                    }
/* 100 */           this.I0000Il00O = OIilII0oO1.I00000oIO(this, this.I0000oI00);
/* 109 */           this.I0000O = OIilII0oO1.I00000oIO(this, 1 - this.I0000oI00);
                }
            }
