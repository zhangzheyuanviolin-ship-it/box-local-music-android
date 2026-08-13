            package p000;

            import kotlin.jvm.functions.Function1;
            
/* 15 */    public final class Il0iIi0iO extends O0iO10011II implements Function1 {
                public final int I00iOIl = 0;
                public final Oiolo1I I00iiI;
                public final Object I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Il0iIi0iO(Oiolo1I oiolo1I, OoI11o1OI ooI11o1OI, OoI11o1OI ooI11o1OI2, OoI11o1OI ooI11o1OI3) {
/* 13 */            super(1);
/* 4 */             this.I00iiI = oiolo1I;
/* 6 */             this.I00iiO = ooI11o1OI;
/* 8 */             this.I00iio = ooI11o1OI2;
/* 10 */            this.I00ilI0I1 = ooI11o1OI3;
                }

                @Override
                public final Object invoke(Object obj) {
                    long j;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iio;
/* 5 */             Object obj3 = this.I00iiO;
/* 7 */             Oiolo1I oiolo1I = this.I00iiI;
/* 10 */            Object obj4 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 91 */                    Oi11lOiIoi oi11lOiIoi = (Oi11lOiIoi) obj;
/* 93 */                    OlO01l1oOil olO01l1oOil = (OlO01l1oOil) obj3;
/* 110 */                   float fFloatValue = olO01l1oOil != null ? ((Number) olO01l1oOil.getValue()).floatValue() : 1.0f;
/* 111 */                   IIo11l1iO iIo11l1iO = oiolo1I.I0000Il00O;
/* 145 */                   float fI000II = fFloatValue * ((oiolo1I.I0000O() && ((Boolean) ((OIooliIO0) iIo11l1iO.I00iOIl).getValue()).booleanValue()) ? ((OIooO1iiliI) iIo11l1iO.I00iiI).I000II() : 1.0f);
/* 150 */                   if (oiolo1I.I0000O()) {
/* 152 */                       oiolo1I.I000II = fI000II;
                            }
/* 154 */                   oi11lOiIoi.I0000Il00O(fI000II);
/* 157 */                   OlO01l1oOil olO01l1oOil2 = (OlO01l1oOil) obj2;
/* 172 */                   float fFloatValue2 = olO01l1oOil2 != null ? ((Number) olO01l1oOil2.getValue()).floatValue() : 1.0f;
/* 178 */                   boolean z = oiolo1I.I0000O() && ((Boolean) ((OIooliIO0) iIo11l1iO.I00iiO).getValue()).booleanValue();
/* 210 */                   float fI000II2 = fFloatValue2 * (z ? ((OIooO1iiliI) iIo11l1iO.I00iio).I000II() : 1.0f);
/* 215 */                   if (oiolo1I.I0000O()) {
/* 217 */                       oiolo1I.I000O01llI0 = fI000II2;
/* 229 */                       oiolo1I.I000iOII = z ? ((OIooO1iiliI) iIo11l1iO.I00iio).I000II() : 1.0f;
/* 231 */                       if (z) {
/* 233 */                           OooIlilo oooIlilo = oiolo1I.I000l1;
/* 235 */                           if (oooIlilo == null) {
/* 239 */                               oooIlilo = new OooIlilo(false);
/* 242 */                               oiolo1I.I000l1 = oooIlilo;
                                    }
/* 244 */                           OOiIii oOiIii = IiIOOioo1I.I00000oIO;
/* 256 */                           oooIlilo.I00000oIO(fI000II2, Iio1OlIo0.I0000Il00O(Oo111Ii1Il.I00000oIO(oiolo1I.I0000O)));
                                }
                            }
/* 259 */                   oi11lOiIoi.I000iOII(fI000II2);
/* 262 */                   oi11lOiIoi.I000l1(fI000II2);
/* 265 */                   OlO01l1oOil olO01l1oOil3 = (OlO01l1oOil) obj4;
/* 278 */                   long j2 = olO01l1oOil3 != null ? ((OoI0l01O) olO01l1oOil3.getValue()).I00000oIO : OoI0l01O.I00000oOI;
/* 284 */                   if (oiolo1I.I0000O() && ((Boolean) ((OIooliIO0) iIo11l1iO.I00ilI0I1).getValue()).booleanValue()) {
/* 312 */                       j2 = ((OoI0l01O) ((OIooliIO0) iIo11l1iO.I00ilO0).getValue()).I00000oIO;
                            }
/* 318 */                   if (oiolo1I.I0000O()) {
/* 320 */                       oiolo1I.I000OOo1O = j2;
                            }
/* 322 */                   oi11lOiIoi.I001iOo1i0O(j2);
/* 325 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 17 */                    Il1OOloOIl1 il1OOloOIl1 = (Il1OOloOIl1) obj4;
/* 19 */                    int iOrdinal = ((Il0OoI0oO1Ii) obj).ordinal();
/* 23 */                    OoI0l01O ooI0l01OI00000oIO = null;
/* 24 */                    if (iOrdinal == 0) {
/* 59 */                        OiO0oIloO1oI oiO0oIloO1oI = ((Il0l0iooI) obj2).I00000oIO.I0000O;
/* 61 */                        if (oiO0oIloO1oI != null) {
/* 63 */                            j = oiO0oIloO1oI.I00000oOI;
                                } else {
/* 72 */                            OiO0oIloO1oI oiO0oIloO1oI2 = il1OOloOIl1.I00000oIO.I0000O;
/* 74 */                            if (oiO0oIloO1oI2 != null) {
/* 76 */                                j = oiO0oIloO1oI2.I00000oOI;
                                    }
                                }
/* 65 */                        ooI0l01OI00000oIO = OoI0l01O.I00000oIO(j);
                            } else if (iOrdinal == 1) {
/* 52 */                        ooI0l01OI00000oIO = (OoI0l01O) obj3;
                            } else {
/* 29 */                        if (iOrdinal != 2) {
/* 47 */                            I000II.I00000oIO();
/* 23 */                            return null;
                                }
/* 33 */                        OiO0oIloO1oI oiO0oIloO1oI3 = il1OOloOIl1.I00000oIO.I0000O;
/* 42 */                        ooI0l01OI00000oIO = OoI0l01O.I00000oIO(oiO0oIloO1oI3 != null ? oiO0oIloO1oI3.I00000oOI : oiolo1I.I000OOo1O);
                            }
/* 86 */                    return OoI0l01O.I00000oIO(ooI0l01OI00000oIO != null ? ooI0l01OI00000oIO.I00000oIO : OoI0l01O.I00000oOI);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public Il0iIi0iO(OoI0l01O ooI0l01O, Il0l0iooI il0l0iooI, Il1OOloOIl1 il1OOloOIl1, Oiolo1I oiolo1I) {
                    super(1);
/* 17 */            this.I00iiO = ooI0l01O;
                    this.I00iio = il0l0iooI;
                    this.I00ilI0I1 = il1OOloOIl1;
                    this.I00iiI = oiolo1I;
                }
            }
