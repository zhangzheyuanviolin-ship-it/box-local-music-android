            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class OooIIo1 extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final OooIO0OoIO0O I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooIIo1(OooIO0OoIO0O oooIO0OoIO0O, int i) {
/* 6 */             super(1);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = oooIO0OoIO0O;
                }

                @Override
                public final Object invoke(Object obj) {
                    long j;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OooIO0OoIO0O oooIO0OoIO0O = this.I00iiI;
                    switch (i) {
                        case 0:
/* 58 */                    OoI1O01lI ooI1O01lI = (OoI1O01lI) obj;
/* 60 */                    Il0OoI0oO1Ii il0OoI0oO1Ii = Il0OoI0oO1Ii.I00iOIl;
/* 62 */                    Il0OoI0oO1Ii il0OoI0oO1Ii2 = Il0OoI0oO1Ii.I00iiI;
/* 68 */                    if (ooI1O01lI.I0000O(il0OoI0oO1Ii, il0OoI0oO1Ii2)) {
/* 72 */                        OoI1iOioli ooI1iOioli = oooIO0OoIO0O.I00o0l1o1o0.I00000oIO;
/* 74 */                        return Il0iiiII11.I0000Il00O;
                            }
/* 83 */                    if (!ooI1O01lI.I0000O(il0OoI0oO1Ii2, Il0OoI0oO1Ii.I00iiO)) {
/* 92 */                        return Il0iiiII11.I0000Il00O;
                            }
/* 87 */                    OoI1iOioli ooI1iOioli2 = oooIO0OoIO0O.I00o101lO.I00000oIO;
/* 89 */                    return Il0iiiII11.I0000Il00O;
                        default:
/* 10 */                    int iOrdinal = ((Il0OoI0oO1Ii) obj).ordinal();
/* 14 */                    if (iOrdinal == 0) {
/* 49 */                        OoI1iOioli ooI1iOioli3 = oooIO0OoIO0O.I00o0l1o1o0.I00000oIO;
/* 51 */                        j = IOOiio0i.I000lI;
                            } else if (iOrdinal == 1) {
/* 38 */                        OoI1iOioli ooI1iOioli4 = oooIO0OoIO0O.I00o0l1o1o0.I00000oIO;
/* 42 */                        OoI1iOioli ooI1iOioli5 = oooIO0OoIO0O.I00o101lO.I00000oIO;
/* 44 */                        j = IOOiio0i.I000lI;
                            } else {
/* 20 */                        if (iOrdinal != 2) {
/* 31 */                            I000II.I00000oIO();
/* 34 */                            return null;
                                }
/* 24 */                        OoI1iOioli ooI1iOioli6 = oooIO0OoIO0O.I00o101lO.I00000oIO;
/* 28 */                        j = oooIO0OoIO0O.I00oI0i.I0001Ioi1lo;
                            }
/* 53 */                    return IOOiio0i.I00000oIO(j);
                    }
                }
            }
