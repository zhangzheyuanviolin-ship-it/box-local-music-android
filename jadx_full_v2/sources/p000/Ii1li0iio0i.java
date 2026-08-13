            package p000;

            import com.k2fsa.sherpa.onnx.OfflineTts;
            import java.util.ArrayList;
            
/* 13 */    public final class Ii1li0iio0i extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final boolean I00iiI;
                public Object I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1li0iio0i(Ol0o1OiOIIIl ol0o1OiOIIIl, Ol0oI1llIloI ol0oI1llIloI, boolean z, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 1;
/* 4 */             this.I00iiO = ol0o1OiOIIIl;
/* 6 */             this.I00iio = ol0oI1llIloI;
/* 8 */             this.I00iiI = z;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             boolean z = this.I00iiI;
/* 5 */             Object obj2 = this.I00iio;
                    switch (i) {
                        case 0:
/* 65 */                    Ii1li0iio0i ii1li0iio0i = new Ii1li0iio0i((Ol0ioI1iI) obj2, z, iOoil1iiIilo);
/* 68 */                    ii1li0iio0i.I00iiO = obj;
/* 70 */                    return ii1li0iio0i;
                        case 1:
/* 56 */                    return new Ii1li0iio0i((Ol0o1OiOIIIl) this.I00iiO, (Ol0oI1llIloI) obj2, z, iOoil1iiIilo);
                        case 2:
/* 43 */                    return new Ii1li0iio0i((O1oIOiI11o0) this.I00iiO, iOoil1iiIilo, this.I00iiI, (Oliii00iliIi) obj2, 2);
                        default:
/* 24 */                    return new Ii1li0iio0i((Ili1iIl) this.I00iiO, iOoil1iiIilo, this.I00iiI, (OI10i0Il) obj2, 3);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
                            break;
                        case 1:
/* 46 */                    ((Ii1li0iio0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 2:
/* 32 */                    ((Ii1li0iio0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((Ii1li0iio0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    switch (this.I00iOIl) {
                        case 0:
/* 154 */                   Ol0olo0 ol0olo0 = (Ol0olo0) this.I00iiO;
/* 156 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 158 */                   lIoii1l01l0i.I00000oOI(obj);
/* 163 */                   ArrayList arrayList = new ArrayList();
/* 178 */                   for (Ol0ioI1iI ol0ioI1iI : ol0olo0.I001IIilI0O()) {
/* 202 */                       if (O0000Ioio00.I0000O(ol0ioI1iI.I001i1O0Ol(), ((Ol0ioI1iI) this.I00iio).I001i1O0Ol())) {
/* 208 */                           Ol0ilO ol0ilO = (Ol0ilO) ol0ioI1iI.I00100o1O0lo();
/* 212 */                           ol0ilO.I000II(this.I00iiI);
/* 219 */                           arrayList.add(ol0ilO.I00000oOI());
                                } else {
/* 223 */                           arrayList.add(ol0ioI1iI);
                                }
                            }
/* 227 */                   Ol0olO ol0olOI001IO000 = Ol0olo0.I001IO000();
/* 231 */                   ol0olOI001IO000.I000II(arrayList);
                            break;
                        case 1:
/* 119 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 121 */                   lIoii1l01l0i.I00000oOI(obj);
/* 128 */                   Ii1liIllli0 ii1liIllli0 = ((Ol0o1OiOIIIl) this.I00iiO).I00000oOI;
/* 134 */                   Ol0ioI1iI ol0ioI1iI2 = ((Ol0oI1llIloI) this.I00iio).I00000oIO;
/* 136 */                   boolean z = this.I00iiI;
/* 138 */                   ii1liIllli0.getClass();
/* 146 */                   iOi1IOoIO0l.I00000oOI(new II1lO00lOl(ii1liIllli0, ol0ioI1iI2, z, null));
                            break;
                        case 2:
/* 48 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 50 */                    lIoii1l01l0i.I00000oOI(obj);
/* 55 */                    if (this.I00iiI) {
/* 61 */                        Object obj2 = ((O1oIOiI11o0) this.I00iiO).I00IlilI0i0i;
/* 70 */                        OliiOI oliiOI = obj2 instanceof OliiOI ? (OliiOI) obj2 : null;
/* 71 */                        if (oliiOI != null) {
/* 77 */                            OlO0OIIl1 olO0OIIl1 = ((Oliii00iliIi) this.I00iio).I00000oOI;
/* 84 */                            OliiOl0 oliiOl0 = (OliiOl0) olO0OIIl1.getValue();
/* 86 */                            OfflineTts offlineTts = oliiOI.I00000oIO;
/* 96 */                            int iNumSpeakers = offlineTts != null ? offlineTts.numSpeakers() : 1;
/* 113 */                           olO0OIIl1.I000lI(null, OliiOl0.I00000oIO(oliiOl0, null, false, 0, 0.0f, iNumSpeakers < 1 ? 1 : iNumSpeakers, null, 47));
                                }
                            }
                            break;
                        default:
/* 7 */                     Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 9 */                     lIoii1l01l0i.I00000oOI(obj);
/* 12 */                    boolean z2 = this.I00iiI;
/* 16 */                    OI10i0Il oI10i0Il = (OI10i0Il) this.I00iio;
/* 18 */                    if (z2) {
/* 22 */                        oI10i0Il.setValue(Boolean.TRUE);
                            } else if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 42 */                        Ili1iIl.I00000oIO((Ili1iIl) this.I00iiO);
                            }
                            break;
                    }
/* 45 */            return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public Ii1li0iio0i(Ol0ioI1iI ol0ioI1iI, boolean z, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 0;
/* 15 */            this.I00iio = ol0ioI1iI;
                    this.I00iiI = z;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public Ii1li0iio0i(Object obj, IOoil1iiIilo iOoil1iiIilo, boolean z, Object obj2, int i) {
                    super(2, iOoil1iiIilo);
/* 16 */            this.I00iOIl = i;
                    this.I00iiI = z;
                    this.I00iiO = obj;
                    this.I00iio = obj2;
                }
            }
