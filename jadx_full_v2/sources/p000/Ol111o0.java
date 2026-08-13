            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Ol111o0 {
                public int I00000oIO;
                public IllOOo00lI I00000oOI;
                public IOO1O00oI I0000Il00O;
                public OIooO1iiliI I0000O;
                public Ol111o0 I0000oI00;
                public Function1 I0001Ioi1lo;
                public boolean I000II;
                public float[] I000O01llI0;
                public OIooi1iOiOol I000OOo1O;
                public OIooi1iOiOol I000OiO;
                public boolean I000iOII;
                public OIooliIO0 I000l1;
                public OIooi1iOiOol I000lI;
                public OIooi1iOiOol I000o00OoI0I;
                public OIilII I000oI1ioi;
                public OIooliIO0 I00100l0;
                public OIOo1iiI I00100o1O0lo;
                public OIooO1iiliI I0010I0i;
                public OIooO1iiliI I0010o;
                public Ol111O1I I00111O;
                public OI11IlOoi I001IIilI0O;

                public final void I00000oIO(float f) {
                    float fMin;
                    float fMax;
/* 1 */             OIooO1iiliI oIooO1iiliI = this.I0010o;
/* 3 */             OIooi1iOiOol oIooi1iOiOol = this.I000lI;
/* 5 */             OIooi1iOiOol oIooi1iOiOol2 = this.I000o00OoI0I;
/* 7 */             OIooO1iiliI oIooO1iiliI2 = this.I0010I0i;
/* 16 */            if (I0000Il00O()) {
/* 32 */                fMax = Math.max(this.I000OiO.I000II() - (oIooi1iOiOol2.I000II() / 2.0f), 0.0f);
/* 42 */                fMin = Math.min(oIooi1iOiOol2.I000II() / 2.0f, fMax);
                    } else {
/* 61 */                float fMax2 = Math.max(this.I000OOo1O.I000II() - (oIooi1iOiOol.I000II() / 2.0f), 0.0f);
/* 71 */                fMin = Math.min(oIooi1iOiOol.I000II() / 2.0f, fMax2);
/* 77 */                fMax = fMax2;
                    }
/* 88 */            oIooO1iiliI2.I000O01llI0(oIooO1iiliI.I000II() + oIooO1iiliI2.I000II() + f);
/* 91 */            oIooO1iiliI.I000O01llI0(0.0f);
/* 100 */           float fI0001Ioi1lo = Ol10ooO01IO.I0001Ioi1lo(oIooO1iiliI2.I000II(), this.I000O01llI0, fMin, fMax);
/* 104 */           IOO1O00oI iOO1O00oI = this.I0000Il00O;
/* 110 */           float f2 = fMax - fMin;
/* 125 */           float fI00000oOI = l1I1Il.I00000oOI(iOO1O00oI.I00000oIO, iOO1O00oI.I00000oOI, lIiioliIlo.I00000oOI(f2 == 0.0f ? 0.0f : (fI0001Ioi1lo - fMin) / f2, 0.0f, 1.0f));
/* 137 */           if (fI00000oOI == this.I0000O.I000II()) {
/* 139 */               return;
                    }
/* 140 */           Function1 function1 = this.I0001Ioi1lo;
/* 142 */           if (function1 != null) {
/* 148 */               function1.invoke(Float.valueOf(fI00000oOI));
                    } else {
/* 152 */               I0000O(fI00000oOI);
                    }
                }

                public final float I00000oOI() {
/* 1 */             IOO1O00oI iOO1O00oI = this.I0000Il00O;
/* 3 */             float f = iOO1O00oI.I00000oIO;
/* 5 */             float f2 = iOO1O00oI.I00000oOI;
/* 13 */            float fI00000oOI = lIiioliIlo.I00000oOI(this.I0000O.I000II(), f, f2);
/* 17 */            float f3 = f2 - f;
/* 29 */            return lIiioliIlo.I00000oOI(f3 == 0.0f ? 0.0f : (fI00000oOI - f) / f3, 0.0f, 1.0f);
                }

                public final boolean I0000Il00O() {
                    return this.I000oI1ioi == OIilII.I00iOIl;
                }

                public final void I0000O(float f) {
/* 3 */             if (this.I000II) {
/* 5 */                 IOO1O00oI iOO1O00oI = this.I0000Il00O;
/* 7 */                 float f2 = iOO1O00oI.I00000oIO;
/* 9 */                 float f3 = iOO1O00oI.I00000oOI;
/* 17 */                f = Ol10ooO01IO.I0001Ioi1lo(lIiioliIlo.I00000oOI(f, f2, f3), this.I000O01llI0, f2, f3);
                    }
/* 23 */            this.I0000O.I000O01llI0(f);
                }
            }
