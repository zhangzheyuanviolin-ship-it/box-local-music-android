            package p000;

            import android.graphics.Path;
            import android.graphics.PointF;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public class OoIoiillI1 {
                public final OoIoiillo I00000oIO;
                public final String I00000oOI;
                public final String I0000Il00O;
                public final PointF I000II;
                public ArrayList I000OiO;
                public int I000iOII;
                public Path I0000O = null;
                public int I0000oI00 = 0;
                public PointF I0001Ioi1lo = null;
                public boolean I000O01llI0 = false;
                public final ArrayList I000OOo1O = new ArrayList();

                public OoIoiillI1(OoIoiillo ooIoiillo, String str, String str2) {
/* 12 */            this.I000II = null;
/* 23 */            this.I00000oIO = ooIoiillo;
/* 25 */            this.I00000oOI = str;
/* 27 */            this.I0000Il00O = str2;
/* 35 */            this.I000II = new PointF(0.0f, 0.0f);
                }

                public final void I00000oIO() {
/* 6 */             this.I0000O = new Path();
/* 14 */            this.I0001Ioi1lo = new PointF(0.0f, 0.0f);
/* 17 */            this.I0000oI00 = 0;
/* 21 */            OoIoii ooIoii = new OoIoii(0);
/* 24 */            ooIoii.I00000oOI = this;
/* 26 */            VarHandle.storeStoreFence();
/* 31 */            ooIoii.I00000oIO(this.I000OiO);
                }

                public final void I00000oOI(Number number, Number number2) {
/* 1 */             PointF pointF = this.I000II;
/* 9 */             float fFloatValue = number.floatValue() + pointF.x;
/* 16 */            float fFloatValue2 = number2.floatValue() + pointF.y;
/* 23 */            if (this.I0000O.isEmpty()) {
/* 53 */                Log.w("PdfBox-Android", "rlineTo without initial moveTo in font " + this.I00000oOI + ", glyph " + this.I0000Il00O);
/* 58 */                this.I0000O.moveTo(fFloatValue, fFloatValue2);
                    } else {
/* 64 */                this.I0000O.lineTo(fFloatValue, fFloatValue2);
                    }
/* 67 */            pointF.set(fFloatValue, fFloatValue2);
                }

                public final void I0000Il00O(Number number, Number number2) {
/* 1 */             PointF pointF = this.I000II;
/* 9 */             float fFloatValue = number.floatValue() + pointF.x;
/* 16 */            float fFloatValue2 = number2.floatValue() + pointF.y;
/* 19 */            this.I0000O.moveTo(fFloatValue, fFloatValue2);
/* 22 */            pointF.set(fFloatValue, fFloatValue2);
                }

                public final void I0000O(Number number, Number number2, Number number3, Number number4, Number number5, Number number6) {
/* 1 */             PointF pointF = this.I000II;
/* 9 */             float fFloatValue = number.floatValue() + pointF.x;
/* 17 */            float fFloatValue2 = number2.floatValue() + pointF.y;
/* 23 */            float fFloatValue3 = number3.floatValue() + fFloatValue;
/* 29 */            float fFloatValue4 = number4.floatValue() + fFloatValue2;
/* 35 */            float fFloatValue5 = number5.floatValue() + fFloatValue3;
/* 41 */            float fFloatValue6 = number6.floatValue() + fFloatValue4;
/* 49 */            if (this.I0000O.isEmpty()) {
/* 79 */                Log.w("PdfBox-Android", "rrcurveTo without initial moveTo in font " + this.I00000oOI + ", glyph " + this.I0000Il00O);
/* 84 */                this.I0000O.moveTo(fFloatValue5, fFloatValue6);
                    } else {
/* 90 */                this.I0000O.cubicTo(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6);
                    }
/* 93 */            pointF.set(fFloatValue5, fFloatValue6);
                }

                public final String toString() {
/* 19 */            return this.I000OiO.toString().replace("|", "\n").replace(",", " ");
                }
            }
