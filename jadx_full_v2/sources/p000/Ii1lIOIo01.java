            package p000;

            import java.lang.invoke.VarHandle;
            
/* 15 */    public final class Ii1lIOIo01 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 1;
                public final String I00iiI;
                public final long I00iiO;
                public Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1lIOIo01(O1111l o1111l, IiioilIl1Il iiioilIl1Il, String str, long j, IOoil1iiIilo iOoil1iiIilo) {
/* 13 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iio = o1111l;
/* 6 */             this.I00ilI0I1 = iiioilIl1Il;
/* 8 */             this.I00iiI = str;
/* 10 */            this.I00iiO = j;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 33 */                    long j = this.I00iiO;
/* 37 */                    Ii1lIOIo01 ii1lIOIo01 = new Ii1lIOIo01(this.I00iiI, (String) obj2, j, iOoil1iiIilo);
/* 40 */                    ii1lIOIo01.I00iio = obj;
/* 42 */                    return ii1lIOIo01;
                        default:
/* 23 */                    return new Ii1lIOIo01((O1111l) this.I00iio, (IiioilIl1Il) obj2, this.I00iiI, this.I00iiO, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 32 */                    return ((Ii1lIOIo01) create((Ooli101Iii1) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    ((Ii1lIOIo01) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 21 */                    return ooiIlOl1iI;
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             long j = this.I00iiO;
/* 5 */             String str = this.I00iiI;
/* 7 */             Object obj2 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 68 */                    Ooli101Iii1 ooli101Iii1 = (Ooli101Iii1) this.I00iio;
/* 70 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 72 */                    lIoii1l01l0i.I00000oOI(obj);
/* 79 */                    Ooli001 ooli001 = (Ooli001) ooli101Iii1.I00100o1O0lo();
/* 81 */                    I01lIi i01lIiI001IIilI0O = I01lO1io10.I001IIilI0O();
/* 85 */                    i01lIiI001IIilI0O.I0000O();
/* 92 */                    ((I01lO1io10) i01lIiI001IIilI0O.I00iiI).I001IO000(str);
/* 97 */                    i01lIiI001IIilI0O.I0000O();
/* 104 */                   ((I01lO1io10) i01lIiI001IIilI0O.I00iiI).I001i1lo1io((String) obj2);
/* 107 */                   i01lIiI001IIilI0O.I0000O();
/* 114 */                   ((I01lO1io10) i01lIiI001IIilI0O.I00iiI).I001i1O0Ol(j);
/* 121 */                   I01lO1io10 i01lO1io10 = (I01lO1io10) i01lIiI001IIilI0O.I00000oOI();
/* 123 */                   ooli001.I0000O();
/* 130 */                   ((Ooli101Iii1) ooli001.I00iiI).I001iOo1i0O(i01lO1io10);
/* 133 */                   return ooli001.I00000oOI();
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    O1111l o1111l = (O1111l) this.I00iio;
/* 27 */                    float responseGenerationSpeed = o1111l.I00000oIO.getResponseGenerationSpeed();
/* 31 */                    IOO0o0I1l iOO0o0I1l = Iio1OlIo0.I00iiI;
/* 39 */                    int iI000II = (int) Iio1OlIo0.I000II(j, Iio1llolooo.I00iio);
/* 42 */                    int contextLengthUsed = o1111l.I00000oIO.getContextLengthUsed();
/* 46 */                    O11101IIlil1 o11101IIlil1 = new O11101IIlil1();
/* 49 */                    o11101IIlil1.I00000oIO = str;
/* 51 */                    o11101IIlil1.I00000oOI = responseGenerationSpeed;
/* 53 */                    o11101IIlil1.I0000Il00O = iI000II;
/* 55 */                    o11101IIlil1.I0000O = contextLengthUsed;
/* 57 */                    VarHandle.storeStoreFence();
/* 60 */                    ((IiioilIl1Il) obj2).invoke(o11101IIlil1);
/* 63 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public Ii1lIOIo01(String str, String str2, long j, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 17 */            this.I00iiI = str;
                    this.I00ilI0I1 = str2;
                    this.I00iiO = j;
                }
            }
