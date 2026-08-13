            package p000;

            import android.graphics.Canvas;
            import android.graphics.Paint;
            
            public final class Ii0iIolI implements IllOOo00lI {
                public long I00iOIl;
                public int I00iiI;
                public Canvas I00iiO;
                public Paint I00iio;
                public int I00ilI0I1;
                public float I00ilO0;

                @Override
                public final Object invoke() {
/* 3 */             long j = this.I00iOIl;
/* 5 */             int i = this.I00iiI;
/* 7 */             Canvas canvas = this.I00iiO;
/* 9 */             Paint paint = this.I00iio;
/* 11 */            int i2 = this.I00ilI0I1;
/* 13 */            float f = this.I00ilO0;
/* 15 */            O0iOOoiioO o0iOOoiioO = O0iOOoiioO.I00iOIl;
/* 23 */            float fI0000O = Ol0i1I.I0000O(j) / 2.0f;
/* 43 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(fI0000O) << 32) | (Float.floatToRawIntBits(fI0000O) & 4294967295L);
                    float f2 = i2;
/* 67 */            OiI101I1oIi oiI101I1oIi = new OIiolOlo1iI(lIooiiO1i.I00000oIO(lIl0looO.I00000oIO(0L, j), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits)).I00000oIO;
/* 73 */            if (lIooiiO1i.I0000Il00O(oiI101I1oIi)) {
/* 107 */               float fIntBitsToFloat = Float.intBitsToFloat((int) (oiI101I1oIi.I0000oI00 >> 32));
/* 134 */               canvas.drawRoundRect(f2, f - (oiI101I1oIi.I00000oIO() / 2.0f), (oiI101I1oIi.I00000oOI() * i) + f2, (oiI101I1oIi.I00000oIO() / 2.0f) + f, fIntBitsToFloat, fIntBitsToFloat, paint);
                    } else {
/* 75 */                I0ol0lI i0ol0lII00000oIO = I0olIlI11.I00000oIO();
/* 79 */                I0ol0lI.I0000Il00O(i0ol0lII00000oIO, oiI101I1oIi);
/* 82 */                canvas.save();
/* 91 */                canvas.translate(f2, f - (oiI101I1oIi.I00000oIO() / 2.0f));
/* 96 */                canvas.drawPath(i0ol0lII00000oIO.I00000oIO, paint);
/* 99 */                canvas.restore();
                    }
/* 137 */           return OoiIlOl1iI.I00000oIO;
                }
            }
