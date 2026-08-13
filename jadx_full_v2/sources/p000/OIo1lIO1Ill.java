            package p000;
            
            public final class OIo1lIO1Ill implements III0liIO {
                public OIoIoIO0oI1O I00000oOI;
                public III0liIO I0000Il00O;
                public O0iOOoiioO I0000O;

                /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final float I00000oIO(float f, float f2, float f3) {
                    int iI00100l0;
                    int iI00100l02;
                    int iI00100l03;
/* 1 */             O0iOOoiioO o0iOOoiioO = this.I0000O;
/* 3 */             OIoIoIO0oI1O oIoIoIO0oI1O = this.I00000oOI;
/* 7 */             float fI00000oIO = this.I0000Il00O.I00000oIO(f, f2, f3);
/* 14 */            boolean z = false;
/* 16 */            if (f <= 0.0f) {
/* 25 */                float f4 = f + f2;
/* 26 */                OOo0IO oOo0IO = Ooooi01I.I00000oIO;
/* 32 */                if (f4 <= 1.0f) {
                        }
                    } else if (f + f2 > f3) {
/* 23 */                z = true;
                    }
/* 43 */            if (Math.abs(fI00000oIO) != 0.0f && z) {
/* 50 */                if (o0iOOoiioO == O0iOOoiioO.I00iiI && oIoIoIO0oI1O.I000lI().I0000oI00 == OIilII.I00iiI) {
/* 69 */                    iI00100l03 = oIoIoIO0oI1O.I00100l0() + (-oIoIoIO0oI1O.I0001Ioi1lo);
                        } else {
/* 71 */                    iI00100l03 = oIoIoIO0oI1O.I0001Ioi1lo;
                        }
/* 74 */                float fI00100l0 = iI00100l03 * (-1.0f);
/* 77 */                while (fI00000oIO > 0.0f && fI00100l0 < fI00000oIO) {
/* 88 */                    fI00100l0 += oIoIoIO0oI1O.I00100l0();
                        }
/* 92 */                while (fI00000oIO < 0.0f && fI00100l0 > fI00000oIO) {
/* 103 */                   fI00100l0 -= oIoIoIO0oI1O.I00100l0();
                        }
/* 105 */               return fI00100l0;
                    }
/* 106 */           int i = oIoIoIO0oI1O.I0001Ioi1lo;
/* 108 */           OIooliIO0 oIooliIO0 = oIoIoIO0oI1O.I00II0oii1o;
/* 122 */           if (Math.abs(i) < 1.0E-6d) {
/* 11 */                return 0.0f;
                    }
/* 125 */           O0iOOoiioO o0iOOoiioO2 = O0iOOoiioO.I00iiI;
/* 127 */           if (o0iOOoiioO == o0iOOoiioO2 && oIoIoIO0oI1O.I000lI().I0000oI00 == OIilII.I00iiI) {
/* 146 */               iI00100l0 = oIoIoIO0oI1O.I00100l0() + (-oIoIoIO0oI1O.I0001Ioi1lo);
                    } else {
/* 148 */               iI00100l0 = oIoIoIO0oI1O.I0001Ioi1lo;
                    }
/* 151 */           float f5 = iI00100l0 * (-1.0f);
/* 152 */           if (o0iOOoiioO == o0iOOoiioO2 && oIoIoIO0oI1O.I000lI().I0000oI00 == OIilII.I00iiI) {
/* 174 */               if (!((Boolean) oIooliIO0.getValue()).booleanValue()) {
/* 177 */                   iI00100l02 = oIoIoIO0oI1O.I00100l0();
/* 182 */                   f5 += iI00100l02;
                        }
                    } else if (((Boolean) oIooliIO0.getValue()).booleanValue()) {
/* 196 */               iI00100l02 = oIoIoIO0oI1O.I00100l0();
/* 182 */               f5 += iI00100l02;
                    }
/* 202 */           return lIiioliIlo.I00000oOI(f5, -f3, f3);
                }
            }
