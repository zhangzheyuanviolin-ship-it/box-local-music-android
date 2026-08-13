            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.Map;
            
            public final class O0iiOlo {
                public final I0l00oIIo1O1 I00000oIO;
                public boolean I0000Il00O;
                public boolean I0000O;
                public boolean I0000oI00;
                public boolean I0001Ioi1lo;
                public boolean I000II;
                public I0l00oIIo1O1 I000O01llI0;
                public final int I000OiO;
                public boolean I00000oOI = true;
                public final HashMap I000OOo1O = new HashMap();

                public O0iiOlo(I0l00oIIo1O1 i0l00oIIo1O1, int i) {
/* 1 */             this.I000OiO = i;
/* 6 */             this.I00000oIO = i0l00oIIo1O1;
                }

                public final void I00000oIO(I0iolili01 i0iolili01, int i, OIIlIII0Ili oIIlIII0Ili) {
                    float f = i;
/* 14 */            long jFloatToRawIntBits = Float.floatToRawIntBits(f) << 32;
/* 20 */            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
                    while (true) {
/* 21 */                long jI00000oIO = jFloatToRawIntBits | jFloatToRawIntBits2;
/* 105 */               do {
                            switch (this.I000OiO) {
                                case 0:
/* 58 */                            OIlIooO oIlIooO = oIIlIII0Ili.I01101olii;
/* 60 */                            if (oIlIooO != null) {
/* 62 */                                Io10OIiiOll io10OIiiOll = (Io10OIiiOll) oIlIooO;
/* 64 */                                float[] fArrI00000oOI = io10OIiiOll.I00000oOI();
/* 70 */                                if (!io10OIiiOll.I00oII) {
/* 73 */                                    jI00000oIO = O1i010l1l.I0000Il00O(jI00000oIO, fArrI00000oOI);
                                        }
                                    }
/* 79 */                            jI00000oIO = ioolillioIIO.I00000oIO(jI00000oIO, oIIlIII0Ili.I010I0);
                                    break;
                                default:
/* 31 */                            long j = oIIlIII0Ili.I01101IOlO().I00oOio10iI1;
/* 53 */                            jI00000oIO = OIOlIiiioi.I000II((Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32), jI00000oIO);
                                    break;
                            }
/* 83 */                    oIIlIII0Ili = oIIlIII0Ili.I00oli;
/* 95 */                    if (oIIlIII0Ili.equals(this.I00000oIO.I0001Ioi1lo())) {
/* 146 */                       int iRound = Math.round(i0iolili01 instanceof IoI110lO0O ? Float.intBitsToFloat((int) (jI00000oIO & 4294967295L)) : Float.intBitsToFloat((int) (jI00000oIO >> 32)));
/* 150 */                       HashMap map = this.I000OOo1O;
/* 156 */                       if (map.containsKey(i0iolili01)) {
/* 164 */                           int iIntValue = ((Number) O1Oii0O0loo.I00000oOI(i0iolili01, map)).intValue();
/* 168 */                           IoI110lO0O ioI110lO0O = I0l00ioI.I00000oIO;
/* 186 */                           iRound = ((Number) i0iolili01.I00000oIO.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                                }
/* 194 */                       map.put(i0iolili01, Integer.valueOf(iRound));
/* 197 */                       return;
                            }
/* 105 */               } while (!I00000oOI(oIIlIII0Ili).containsKey(i0iolili01));
/* 107 */               float fI0000Il00O = I0000Il00O(oIIlIII0Ili, i0iolili01);
/* 112 */               long jFloatToRawIntBits3 = Float.floatToRawIntBits(fI0000Il00O);
/* 117 */               long jFloatToRawIntBits4 = Float.floatToRawIntBits(fI0000Il00O);
/* 122 */               jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
/* 124 */               jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
                    }
                }

                public final Map I00000oOI(OIIlIII0Ili oIIlIII0Ili) {
                    switch (this.I000OiO) {
                        case 0:
/* 23 */                    return oIIlIII0Ili.I00ooIo0().I00000oOI();
                        default:
/* 14 */                    return oIIlIII0Ili.I01101IOlO().I00ooIo0().I00000oOI();
                    }
                }

                public final int I0000Il00O(OIIlIII0Ili oIIlIII0Ili, I0iolili01 i0iolili01) {
                    switch (this.I000OiO) {
                        case 0:
/* 15 */                    return oIIlIII0Ili.I00OilO00Il(i0iolili01);
                        default:
/* 10 */                    return oIIlIII0Ili.I01101IOlO().I00OilO00Il(i0iolili01);
                    }
                }

                public final boolean I0000O() {
                    return this.I0000Il00O || this.I0000oI00 || this.I0001Ioi1lo || this.I000II;
                }

                public final boolean I0000oI00() {
/* 1 */             I000O01llI0();
                    return this.I000O01llI0 != null;
                }

                public final void I0001Ioi1lo() {
/* 2 */             this.I00000oOI = true;
/* 4 */             I0l00oIIo1O1 i0l00oIIo1O1 = this.I00000oIO;
/* 6 */             I0l00oIIo1O1 i0l00oIIo1O1I000O01llI0 = i0l00oIIo1O1.I000O01llI0();
/* 10 */            if (i0l00oIIo1O1I000O01llI0 == null) {
/* 12 */                return;
                    }
/* 15 */            if (this.I0000Il00O) {
/* 17 */                i0l00oIIo1O1I000O01llI0.I00O10llo();
                    } else if (this.I0000oI00 || this.I0000O) {
/* 29 */                i0l00oIIo1O1I000O01llI0.requestLayout();
                    }
/* 34 */            if (this.I0001Ioi1lo) {
/* 36 */                i0l00oIIo1O1.I00O10llo();
                    }
/* 41 */            if (this.I000II) {
/* 43 */                i0l00oIIo1O1.requestLayout();
                    }
/* 50 */            i0l00oIIo1O1I000O01llI0.I00000oOI().I0001Ioi1lo();
                }

                public final void I000II() {
/* 1 */             HashMap map = this.I000OOo1O;
/* 3 */             map.clear();
/* 9 */             IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(7);
/* 12 */            iIOIlOoI111.I00iiI = this;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            I0l00oIIo1O1 i0l00oIIo1O1 = this.I00000oIO;
/* 19 */            i0l00oIIo1O1.I00IO1oi11O(iIOIlOoI111);
/* 30 */            map.putAll(I00000oOI(i0l00oIIo1O1.I0001Ioi1lo()));
/* 34 */            this.I00000oOI = false;
                }

                public final void I000O01llI0() {
                    O0iiOlo o0iiOloI00000oOI;
                    O0iiOlo o0iiOloI00000oOI2;
/* 1 */             boolean zI0000O = I0000O();
/* 5 */             I0l00oIIo1O1 i0l00oIIo1O1 = this.I00000oIO;
/* 7 */             if (!zI0000O) {
/* 10 */                I0l00oIIo1O1 i0l00oIIo1O1I000O01llI0 = i0l00oIIo1O1.I000O01llI0();
/* 14 */                if (i0l00oIIo1O1I000O01llI0 == null) {
/* 110 */                   return;
                        }
/* 21 */                i0l00oIIo1O1 = i0l00oIIo1O1I000O01llI0.I00000oOI().I000O01llI0;
/* 23 */                if (i0l00oIIo1O1 == null || !i0l00oIIo1O1.I00000oOI().I0000O()) {
/* 36 */                    I0l00oIIo1O1 i0l00oIIo1O12 = this.I000O01llI0;
/* 38 */                    if (i0l00oIIo1O12 == null || i0l00oIIo1O12.I00000oOI().I0000O()) {
/* 110 */                       return;
                            }
/* 51 */                    I0l00oIIo1O1 i0l00oIIo1O1I000O01llI02 = i0l00oIIo1O12.I000O01llI0();
/* 55 */                    if (i0l00oIIo1O1I000O01llI02 != null && (o0iiOloI00000oOI2 = i0l00oIIo1O1I000O01llI02.I00000oOI()) != null) {
/* 63 */                        o0iiOloI00000oOI2.I000O01llI0();
                            }
/* 66 */                    I0l00oIIo1O1 i0l00oIIo1O1I000O01llI03 = i0l00oIIo1O12.I000O01llI0();
/* 81 */                    i0l00oIIo1O1 = (i0l00oIIo1O1I000O01llI03 == null || (o0iiOloI00000oOI = i0l00oIIo1O1I000O01llI03.I00000oOI()) == null) ? null : o0iiOloI00000oOI.I000O01llI0;
                        }
                    }
/* 82 */            this.I000O01llI0 = i0l00oIIo1O1;
                }
            }
