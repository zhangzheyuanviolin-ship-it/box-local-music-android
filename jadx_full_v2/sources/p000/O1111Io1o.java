            package p000;
            
            public final class O1111Io1o extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final O0l0IlolloIO I00iiI;
                public final String I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1111Io1o(O0l0IlolloIO o0l0IlolloIO, String str, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = o0l0IlolloIO;
/* 5 */             this.I00iiO = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             String str = this.I00iiO;
/* 5 */             O0l0IlolloIO o0l0IlolloIO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 20 */                    return new O1111Io1o(o0l0IlolloIO, str, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new O1111Io1o(o0l0IlolloIO, str, iOoil1iiIilo, 1);
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
/* 28 */                    ((O1111Io1o) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((O1111Io1o) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             String str = this.I00iiO;
/* 7 */             O0l0IlolloIO o0l0IlolloIO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 21 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 23 */                    lIoii1l01l0i.I00000oOI(obj);
/* 26 */                    o0l0IlolloIO.invoke(str);
                            break;
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 17 */                    o0l0IlolloIO.invoke(str);
                            break;
                    }
/* 20 */            return ooiIlOl1iI;
                }
            }
