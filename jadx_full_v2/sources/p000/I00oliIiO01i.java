            package p000;
            
            public final class I00oliIiO01i extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final I00oo1iO0ll I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I00oliIiO01i(I00oo1iO0ll i00oo1iO0ll, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = i00oo1iO0ll;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             I00oo1iO0ll i00oo1iO0ll = this.I00iiI;
                    switch (i) {
                        case 0:
/* 18 */                    return new I00oliIiO01i(i00oo1iO0ll, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new I00oliIiO01i(i00oo1iO0ll, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 28 */                    ((I00oliIiO01i) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((I00oliIiO01i) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             IOoil1iiIilo iOoil1iiIilo = null;
/* 7 */             I00oo1iO0ll i00oo1iO0ll = this.I00iiI;
                    switch (i) {
                        case 0:
/* 46 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 48 */                    lIoii1l01l0i.I00000oOI(obj);
/* 53 */                    if (i00oo1iO0ll.I00oooO == null) {
/* 57 */                        IoI1l00l ioI1l00l = new IoI1l00l();
/* 60 */                        OI0lOIiOIOOo oI0lOIiOIOOo = i00oo1iO0ll.I00o101lO;
/* 62 */                        if (oI0lOIiOIOOo != null) {
/* 74 */                            iOi1II01i0.I0000O(i00oo1iO0ll.I00ooiO1I(), null, null, new I00oI0i(oI0lOIiOIOOo, ioI1l00l, iOoil1iiIilo, 0), 3);
                                }
/* 77 */                        i00oo1iO0ll.I00oooO = ioI1l00l;
                                break;
                            }
                            break;
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 17 */                    IoI1l00l ioI1l00l2 = i00oo1iO0ll.I00oooO;
/* 19 */                    if (ioI1l00l2 != null) {
/* 23 */                        IoI1lIo00o0i ioI1lIo00o0i = new IoI1lIo00o0i(ioI1l00l2);
/* 26 */                        OI0lOIiOIOOo oI0lOIiOIOOo2 = i00oo1iO0ll.I00o101lO;
/* 28 */                        if (oI0lOIiOIOOo2 != null) {
/* 40 */                            iOi1II01i0.I0000O(i00oo1iO0ll.I00ooiO1I(), null, null, new I00oI0i(oI0lOIiOIOOo2, ioI1lIo00o0i, iOoil1iiIilo, 1), 3);
                                }
/* 43 */                        i00oo1iO0ll.I00oooO = null;
                                break;
                            }
                            break;
                    }
/* 45 */            return ooiIlOl1iI;
                }
            }
