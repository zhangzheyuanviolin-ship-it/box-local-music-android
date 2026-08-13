            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oo10o0lI00O extends O1ooOo implements O0iOoioOoI {
                public OI0lOIiOIOOo I00o0iI0io1;
                public boolean I00o0l1o1o0;
                public IlIoO1ilo1 I00o101lO;
                public boolean I00oI0i;
                public I10i01 I00oII;
                public I10i01 I00oIiI10;
                public float I00oO101o;
                public float I00oOio10iI1;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
                    float f;
/* 9 */             int i = 0;
/* 10 */            int i2 = 1;
/* 25 */            boolean z = (o1iIo0ll.I0000Il00O(IOo0oO11ll1O.I000OiO(j)) == 0 || o1iIo0ll.I001iOo1i0O(IOo0oO11ll1O.I000OOo1O(j)) == 0) ? false : true;
/* 28 */            if (this.I00oI0i) {
/* 30 */                f = OllII0l101oi.I000o00OoI0I;
                    } else if (z || this.I00o0l1o1o0) {
/* 45 */                float f2 = OllI1oooIo1o.I00000oIO;
/* 47 */                f = OllII0l101oi.I00100l0;
                    } else {
/* 40 */                float f3 = OllI1oooIo1o.I00000oIO;
/* 42 */                f = OllII0l101oi.I001l0I00;
                    }
/* 49 */            float fI00i0ilIl0i = o1iOIoOiO0.I00i0ilIl0i(f);
/* 53 */            I10i01 i10i01 = this.I00oIiI10;
/* 69 */            int iFloatValue = (int) (i10i01 != null ? ((Number) i10i01.I0000O()).floatValue() : fI00i0ilIl0i);
/* 81 */            if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
/* 85 */                Ioliol1Ii.I00000oIO("width and height must be >= 0");
                    }
/* 92 */            OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0olo.I000O01llI0(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
/* 96 */            float f4 = OllI1oooIo1o.I00000oIO;
/* 108 */           float fI00i0ilIl0i2 = o1iOIoOiO0.I00i0ilIl0i((OllII0l101oi.I00111O - o1iOIoOiO0.I00OIO1(fI00i0ilIl0i)) / 2.0f);
/* 120 */           float fI00i0ilIl0i3 = o1iOIoOiO0.I00i0ilIl0i((OllII0l101oi.I001i1O0Ol - OllII0l101oi.I00100l0) - OllI1oooIo1o.I00000oIO);
/* 124 */           boolean z2 = this.I00oI0i;
/* 126 */           if (z2 && this.I00o0l1o1o0) {
/* 138 */               fI00i0ilIl0i2 = fI00i0ilIl0i3 - o1iOIoOiO0.I00i0ilIl0i(OllII0l101oi.I001IIilI0O);
                    } else if (z2 && !this.I00o0l1o1o0) {
/* 149 */               fI00i0ilIl0i2 = o1iOIoOiO0.I00i0ilIl0i(OllII0l101oi.I001IIilI0O);
                    } else if (this.I00o0l1o1o0) {
/* 158 */               fI00i0ilIl0i2 = fI00i0ilIl0i3;
                    }
/* 159 */           I10i01 i10i012 = this.I00oIiI10;
/* 161 */           IOoil1iiIilo iOoil1iiIilo = null;
/* 173 */           Float f5 = i10i012 != null ? (Float) i10i012.I0000oI00.getValue() : null;
/* 175 */           if (f5 == null || f5.floatValue() != fI00i0ilIl0i) {
/* 195 */               iOi1II01i0.I0000O(I00ooiO1I(), null, null, new Oo10lo00ol0l(this, fI00i0ilIl0i, iOoil1iiIilo, i), 3);
                    }
/* 198 */           I10i01 i10i013 = this.I00oII;
/* 211 */           Float f6 = i10i013 != null ? (Float) i10i013.I0000oI00.getValue() : null;
/* 212 */           if (f6 == null || f6.floatValue() != fI00i0ilIl0i2) {
/* 232 */               iOi1II01i0.I0000O(I00ooiO1I(), null, null, new Oo10lo00ol0l(this, fI00i0ilIl0i2, iOoil1iiIilo, i2), 3);
                    }
/* 241 */           if (Float.isNaN(this.I00oOio10iI1) && Float.isNaN(this.I00oO101o)) {
/* 251 */               this.I00oOio10iI1 = fI00i0ilIl0i;
/* 253 */               this.I00oO101o = fI00i0ilIl0i2;
                    }
/* 258 */           I0i1l00llOi1 i0i1l00llOi1 = new I0i1l00llOi1(4);
/* 261 */           i0i1l00llOi1.I00iiO = oO1I0001000iI001lllioOl;
/* 263 */           i0i1l00llOi1.I00iio = this;
/* 265 */           i0i1l00llOi1.I00iiI = fI00i0ilIl0i2;
/* 267 */           VarHandle.storeStoreFence();
/* 272 */           return o1iOIoOiO0.I001i1lo1io(iFloatValue, iFloatValue, Il011I1OiO0I.I00iOIl, i0i1l00llOi1);
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                @Override
                public final void I010101Oo1lO() {
/* 14 */            iOi1II01i0.I0000O(I00ooiO1I(), null, null, new O1iOlO(this, (IOoil1iiIilo) null, 12), 3);
                }

                @Override
                public final void I010II() {
/* 2 */             this.I00oII = null;
/* 4 */             this.I00oIiI10 = null;
/* 8 */             this.I00oOio10iI1 = Float.NaN;
/* 10 */            this.I00oO101o = Float.NaN;
                }
            }
