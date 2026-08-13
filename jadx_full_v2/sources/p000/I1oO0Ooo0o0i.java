            package p000;
            
/* 11 */    public final class I1oO0Ooo0o0i extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 0;
                public int I00iiI;
                public float I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1oO0Ooo0o0i(I10i01 i10i01, float f, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             super(2, iOoil1iiIilo);
/* 4 */             this.I00iio = i10i01;
/* 6 */             this.I00iiO = f;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iio;
                    switch (i) {
                        case 0:
/* 30 */                    return new I1oO0Ooo0o0i((I10i01) obj2, this.I00iiO, iOoil1iiIilo);
                        default:
/* 12 */                    I1oO0Ooo0o0i i1oO0Ooo0o0i = new I1oO0Ooo0o0i((IOl0iiI) obj2, iOoil1iiIilo);
/* 21 */                    i1oO0Ooo0o0i.I00iiO = ((Number) obj).floatValue();
/* 23 */                    return i1oO0Ooo0o0i;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 41 */                    return ((I1oO0Ooo0o0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 26 */                    return ((I1oO0Ooo0o0i) create(Float.valueOf(((Number) obj).floatValue()), (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 6 */             Object obj2 = this.I00iio;
                    switch (i) {
                        case 0:
/* 124 */                   I10i01 i10i01 = (I10i01) obj2;
/* 126 */                   float f = this.I00iiO;
/* 128 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 130 */                   int i2 = this.I00iiI;
/* 132 */                   if (i2 == 0) {
/* 144 */                       lIoii1l01l0i.I00000oOI(obj);
/* 149 */                       Float f2 = new Float(f);
/* 169 */                       OoIoO0I0oOI ooIoO0I0oOI = ((Number) i10i01.I0000O()).floatValue() < f ? i000I00.I00000oIO : i000I00.I00000oOI;
/* 171 */                       this.I00iiI = 1;
/* 183 */                       if (I10i01.I00000oIO(i10i01, f2, ooIoO0I0oOI, null, null, this, 12) == ii0111o) {
/* 185 */                           return ii0111o;
                                }
                            } else {
/* 134 */                       if (i2 != 1) {
/* 140 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 136 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 187 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 14 */                    Oil000 oil000 = ((IOl0iiI) obj2).I00000oIO;
/* 16 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 18 */                    int i3 = this.I00iiI;
/* 25 */                    if (i3 == 0) {
/* 37 */                        lIoii1l01l0i.I00000oOI(obj);
/* 40 */                        float f3 = this.I00iiO;
/* 48 */                        Object objI000II = oil000.I0000O.I00iOIl.I000II(Oiioi1IoIIli.I0000oI00);
/* 56 */                        IlliIl1l11O illiIl1l11O = (IlliIl1l11O) (objI000II != null ? objI000II : null);
/* 58 */                        if (illiIl1l11O == null) {
/* 122 */                           throw IIlIOloOOO.I000OOo1O("Required value was null.");
                                }
/* 86 */                        OIOlIiiioi oIOlIiiioiI00000oIO = OIOlIiiioi.I00000oIO((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
/* 90 */                        this.I00iiI = 1;
/* 92 */                        obj = illiIl1l11O.invoke(oIOlIiiioiI00000oIO, this);
/* 96 */                        if (obj == ii0111o2) {
/* 98 */                            return ii0111o2;
                                }
                            } else {
/* 27 */                        if (i3 != 1) {
/* 33 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 29 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 112 */                   return new Float(Float.intBitsToFloat((int) (((OIOlIiiioi) obj).I00000oIO & 4294967295L)));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public I1oO0Ooo0o0i(IOl0iiI iOl0iiI, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 13 */            this.I00iio = iOl0iiI;
                }
            }
