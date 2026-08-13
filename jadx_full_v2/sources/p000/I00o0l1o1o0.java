            package p000;
            
            public final class I00o0l1o1o0 implements IllOOo00lI {
                public final int I00iOIl;
                public I00oo1iO0ll I00iiI;

                public I00o0l1o1o0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    IiIill0O0li1 iiIill0O0li1;
/* 1 */             int i = this.I00iOIl;
/* 3 */             I00oo1iO0ll i00oo1iO0ll = this.I00iiI;
                    switch (i) {
                        case 0:
/* 20 */                    Iol100iI0lO iol100iI0lO = (Iol100iI0lO) iiliIooIliOo.I00000oIO(i00oo1iO0ll, Iol0oOO.I00000oIO);
/* 22 */                    if (iol100iI0lO == null) {
/* 38 */                        Ioll0IliO1l.I00000oIO("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + iol100iI0lO);
                            }
/* 41 */                    Iol100iI0lO iol100iI0lO2 = i00oo1iO0ll.I00oli;
/* 43 */                    i00oo1iO0ll.I00oli = iol100iI0lO;
/* 45 */                    if (iol100iI0lO2 != null && !O0000Ioio00.I0000O(iol100iI0lO, iol100iI0lO2) && ((iiIill0O0li1 = i00oo1iO0ll.I00ooIo0) != null || !i00oo1iO0ll.I010II)) {
/* 61 */                        if (iiIill0O0li1 != null) {
/* 63 */                            i00oo1iO0ll.I010l1ol111(iiIill0O0li1);
                                }
/* 67 */                        i00oo1iO0ll.I00ooIo0 = null;
/* 69 */                        i00oo1iO0ll.I011IOil();
                            }
/* 72 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 8 */                     i00oo1iO0ll.I011iIOio();
/* 11 */                    return Boolean.TRUE;
                    }
                }
            }
