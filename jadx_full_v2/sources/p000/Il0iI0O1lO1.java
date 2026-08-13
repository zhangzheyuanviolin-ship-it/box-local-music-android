            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Il0iI0O1lO1 extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final Il0l0iooI I00iiI;
                public final Il1OOloOIl1 I00iiO;
                public final Oiolo1I I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Il0iI0O1lO1(Il0l0iooI il0l0iooI, Il1OOloOIl1 il1OOloOIl1, Oiolo1I oiolo1I, int i) {
/* 10 */            super(1);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = il0l0iooI;
/* 5 */             this.I00iiO = il1OOloOIl1;
/* 7 */             this.I00iio = oiolo1I;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Il0l0iooI il0l0iooI = this.I00iiI;
/* 6 */             Oiolo1I oiolo1I = this.I00iio;
/* 8 */             Il1OOloOIl1 il1OOloOIl1 = this.I00iiO;
/* 12 */            float f = 1.0f;
                    switch (i) {
                        case 0:
/* 60 */                    int iOrdinal = ((Il0OoI0oO1Ii) obj).ordinal();
/* 64 */                    if (iOrdinal == 0) {
/* 88 */                        IlI1o11l0 ilI1o11l0 = il0l0iooI.I00000oIO.I00000oIO;
/* 90 */                        if (ilI1o11l0 != null) {
/* 92 */                            f = ilI1o11l0.I00000oIO;
                                }
                            } else if (iOrdinal != 1) {
/* 68 */                        if (iOrdinal != 2) {
/* 82 */                            I000II.I00000oIO();
/* 5 */                             return null;
                                }
/* 72 */                        IlI1o11l0 ilI1o11l02 = il1OOloOIl1.I00000oIO.I00000oIO;
/* 79 */                        f = ilI1o11l02 != null ? ilI1o11l02.I00000oIO : oiolo1I.I000II;
                            }
/* 94 */                    return Float.valueOf(f);
                        default:
/* 19 */                    int iOrdinal2 = ((Il0OoI0oO1Ii) obj).ordinal();
/* 23 */                    if (iOrdinal2 == 0) {
/* 47 */                        OiO0oIloO1oI oiO0oIloO1oI = il0l0iooI.I00000oIO.I0000O;
/* 49 */                        if (oiO0oIloO1oI != null) {
/* 51 */                            f = oiO0oIloO1oI.I00000oIO;
                                }
                            } else if (iOrdinal2 != 1) {
/* 27 */                        if (iOrdinal2 != 2) {
/* 41 */                            I000II.I00000oIO();
/* 5 */                             return null;
                                }
/* 31 */                        OiO0oIloO1oI oiO0oIloO1oI2 = il1OOloOIl1.I00000oIO.I0000O;
/* 38 */                        f = oiO0oIloO1oI2 != null ? oiO0oIloO1oI2.I00000oIO : oiolo1I.I000O01llI0;
                            }
/* 53 */                    return Float.valueOf(f);
                    }
                }
            }
