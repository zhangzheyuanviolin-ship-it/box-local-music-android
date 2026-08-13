            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IIIi11Oil00o extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final OI0lOIiOIOOo I00iiO;
                public final Ol1o0O0O0 I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIIi11Oil00o(OI0lOIiOIOOo oI0lOIiOIOOo, Ol1o0O0O0 ol1o0O0O0, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = oI0lOIiOIOOo;
/* 5 */             this.I00iio = ol1o0O0O0;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Ol1o0O0O0 ol1o0O0O0 = this.I00iio;
/* 5 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00iiO;
                    switch (i) {
                        case 0:
/* 41 */                    return new IIIi11Oil00o(oI0lOIiOIOOo, ol1o0O0O0, iOoil1iiIilo, 0);
                        case 1:
/* 34 */                    return new IIIi11Oil00o(oI0lOIiOIOOo, ol1o0O0O0, iOoil1iiIilo, 1);
                        case 2:
/* 27 */                    return new IIIi11Oil00o(oI0lOIiOIOOo, ol1o0O0O0, iOoil1iiIilo, 2);
                        case 3:
/* 20 */                    return new IIIi11Oil00o(oI0lOIiOIOOo, ol1o0O0O0, iOoil1iiIilo, 3);
                        default:
/* 13 */                    return new IIIi11Oil00o(oI0lOIiOIOOo, ol1o0O0O0, iOoil1iiIilo, 4);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((IIIi11Oil00o) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Ol1o0O0O0 ol1o0O0O0 = this.I00iio;
/* 5 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00iiO;
/* 10 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 187 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 189 */                   int i2 = this.I00iiI;
/* 191 */                   if (i2 != 0) {
/* 193 */                       if (i2 == 1) {
/* 195 */                           lIoii1l01l0i.I00000oOI(obj);
/* 198 */                           return ooiIlOl1iI;
                                }
/* 200 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 204 */                   lIoii1l01l0i.I00000oOI(obj);
/* 207 */                   Oiolio oiolio = oI0lOIiOIOOo.I00000oIO;
/* 212 */                   IIIi111i1l iIIi111i1l = new IIIi111i1l(0);
/* 215 */                   iIIi111i1l.I00iiI = ol1o0O0O0;
/* 217 */                   VarHandle.storeStoreFence();
/* 220 */                   this.I00iiI = 1;
/* 222 */                   oiolio.getClass();
/* 225 */                   Oiolio.I000lI(oiolio, iIIi111i1l, this);
/* 228 */                   return ii0111o;
                        case 1:
/* 145 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 147 */                   int i3 = this.I00iiI;
/* 149 */                   if (i3 != 0) {
/* 151 */                       if (i3 == 1) {
/* 153 */                           lIoii1l01l0i.I00000oOI(obj);
/* 156 */                           return ooiIlOl1iI;
                                }
/* 158 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 162 */                   lIoii1l01l0i.I00000oOI(obj);
/* 165 */                   Oiolio oiolio2 = oI0lOIiOIOOo.I00000oIO;
/* 169 */                   IIIi111i1l iIIi111i1l2 = new IIIi111i1l(1);
/* 172 */                   iIIi111i1l2.I00iiI = ol1o0O0O0;
/* 174 */                   VarHandle.storeStoreFence();
/* 177 */                   this.I00iiI = 1;
/* 179 */                   oiolio2.getClass();
/* 182 */                   Oiolio.I000lI(oiolio2, iIIi111i1l2, this);
/* 185 */                   return ii0111o2;
                        case 2:
/* 102 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 104 */                   int i4 = this.I00iiI;
/* 106 */                   if (i4 != 0) {
/* 108 */                       if (i4 == 1) {
/* 110 */                           lIoii1l01l0i.I00000oOI(obj);
/* 113 */                           return ooiIlOl1iI;
                                }
/* 115 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 119 */                   lIoii1l01l0i.I00000oOI(obj);
/* 122 */                   Oiolio oiolio3 = oI0lOIiOIOOo.I00000oIO;
/* 127 */                   IIIi111i1l iIIi111i1l3 = new IIIi111i1l(2);
/* 130 */                   iIIi111i1l3.I00iiI = ol1o0O0O0;
/* 132 */                   VarHandle.storeStoreFence();
/* 135 */                   this.I00iiI = 1;
/* 137 */                   oiolio3.getClass();
/* 140 */                   Oiolio.I000lI(oiolio3, iIIi111i1l3, this);
/* 143 */                   return ii0111o3;
                        case 3:
/* 59 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 61 */                    int i5 = this.I00iiI;
/* 63 */                    if (i5 != 0) {
/* 65 */                        if (i5 == 1) {
/* 67 */                            lIoii1l01l0i.I00000oOI(obj);
/* 70 */                            return ooiIlOl1iI;
                                }
/* 72 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 76 */                    lIoii1l01l0i.I00000oOI(obj);
/* 79 */                    Oiolio oiolio4 = oI0lOIiOIOOo.I00000oIO;
/* 84 */                    IIIi111i1l iIIi111i1l4 = new IIIi111i1l(3);
/* 87 */                    iIIi111i1l4.I00iiI = ol1o0O0O0;
/* 89 */                    VarHandle.storeStoreFence();
/* 92 */                    this.I00iiI = 1;
/* 94 */                    oiolio4.getClass();
/* 97 */                    Oiolio.I000lI(oiolio4, iIIi111i1l4, this);
/* 100 */                   return ii0111o4;
                        default:
/* 16 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 18 */                    int i6 = this.I00iiI;
/* 20 */                    if (i6 != 0) {
/* 22 */                        if (i6 == 1) {
/* 24 */                            lIoii1l01l0i.I00000oOI(obj);
/* 27 */                            return ooiIlOl1iI;
                                }
/* 29 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 33 */                    lIoii1l01l0i.I00000oOI(obj);
/* 36 */                    Oiolio oiolio5 = oI0lOIiOIOOo.I00000oIO;
/* 41 */                    IIIi111i1l iIIi111i1l5 = new IIIi111i1l(4);
/* 44 */                    iIIi111i1l5.I00iiI = ol1o0O0O0;
/* 46 */                    VarHandle.storeStoreFence();
/* 49 */                    this.I00iiI = 1;
/* 51 */                    oiolio5.getClass();
/* 54 */                    Oiolio.I000lI(oiolio5, iIIi111i1l5, this);
/* 57 */                    return ii0111o5;
                    }
                }
            }
