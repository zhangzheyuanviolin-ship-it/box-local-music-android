            package p000;
            
            public final class O1l1OoI1 implements OioOIi1o0I {
                public final float I00000oIO;
                public final boolean I00000oOI;

                public O1l1OoI1(float f, boolean z) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = z;
                }

                @Override
                public final l1lOoiII1l I00000oIO(long j, O0iOOoiioO o0iOOoiioO, IiIooOOOI iiIooOOOI) {
                    long jFloatToRawIntBits;
                    int iFloatToRawIntBits;
                    long jFloatToRawIntBits2;
/* 7 */             float fI00i0ilIl0i = iiIooOOOI.I00i0ilIl0i(this.I00000oIO);
/* 11 */            I0ol0lI i0ol0lII00000oIO = I0olIlI11.I00000oIO();
/* 20 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 32 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
/* 37 */            boolean z = this.I00000oOI;
/* 39 */            if (z) {
/* 41 */                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
/* 46 */                iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                    } else {
/* 55 */                jFloatToRawIntBits = Float.floatToRawIntBits(fI00i0ilIl0i);
/* 60 */                iFloatToRawIntBits = Float.floatToRawIntBits(fI00i0ilIl0i);
                    }
/* 53 */            long j2 = (jFloatToRawIntBits << 32) | (iFloatToRawIntBits & 4294967295L);
/* 65 */            if (z) {
/* 79 */                jFloatToRawIntBits2 = (Float.floatToRawIntBits(fI00i0ilIl0i) << 32) | (Float.floatToRawIntBits(fI00i0ilIl0i) & 4294967295L);
                    } else {
/* 94 */                jFloatToRawIntBits2 = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                    }
/* 131 */           I0ol0lI.I0000Il00O(i0ol0lII00000oIO, new OiI101I1oIi(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, j2, jFloatToRawIntBits2, (Float.floatToRawIntBits(fI00i0ilIl0i) << 32) | (Float.floatToRawIntBits(fI00i0ilIl0i) & 4294967295L), (Float.floatToRawIntBits(fI00i0ilIl0i) << 32) | (Float.floatToRawIntBits(fI00i0ilIl0i) & 4294967295L)));
/* 136 */           return new OIio1O0ll0I(i0ol0lII00000oIO);
                }
            }
