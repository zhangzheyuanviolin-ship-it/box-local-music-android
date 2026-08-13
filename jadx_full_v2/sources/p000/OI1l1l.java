            package p000;

            import android.util.Log;
            import com.k2fsa.sherpa.onnx.OfflineTts;
            import java.lang.invoke.VarHandle;
            
/* 15 */    public final class OI1l1l extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public float I00iiO;
                public Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OI1l1l(OliiOI oliiOI, String str, int i, float f, IOoil1iiIilo iOoil1iiIilo) {
/* 13 */            super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 3;
/* 4 */             this.I00iio = oliiOI;
/* 6 */             this.I00ilI0I1 = str;
/* 8 */             this.I00iiI = i;
/* 10 */            this.I00iiO = f;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 84 */                    return new OI1l1l((Oii110oOoO) this.I00iio, this.I00iiO, (OiO1O1lil10) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 66 */                    return new OI1l1l(this.I00iiO, (Oii110oOoO) this.I00iio, (OI1OloOIO1O) obj2, iOoil1iiIilo);
                        case 2:
/* 51 */                    return new OI1l1l((I0oo10O) this.I00iio, this.I00iiO, (I110IiI0o1Il) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 33 */                    return new OI1l1l((OliiOI) this.I00iio, (String) obj2, this.I00iiI, this.I00iiO, iOoil1iiIilo);
                        default:
/* 12 */                    OI1l1l oI1l1l = new OI1l1l((OoI1Oi0l1I0o) obj2, iOoil1iiIilo);
/* 15 */                    oI1l1l.I00iio = obj;
/* 17 */                    return oI1l1l;
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
/* 18 */            return ((OI1l1l) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
                
                    if (r10.I01101IOlO(r11, r10) == r4) goto L54;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    float fI000O01llI0;
                    Ii0110 ii0110;
                    switch (this.I00iOIl) {
                        case 0:
/* 285 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 287 */                   int i = this.I00iiI;
/* 289 */                   if (i == 0) {
/* 301 */                       lIoii1l01l0i.I00000oOI(obj);
/* 306 */                       Oii110oOoO oii110oOoO = (Oii110oOoO) this.I00iio;
/* 308 */                       float f = this.I00iiO;
/* 312 */                       OiO1O1lil10 oiO1O1lil10 = (OiO1O1lil10) this.I00ilI0I1;
/* 314 */                       this.I00iiI = 1;
/* 320 */                       if (oii110oOoO.I010l1ol111(f, oiO1O1lil10, this) == ii0111o) {
/* 322 */                           return ii0111o;
                                }
                            } else {
/* 291 */                       if (i != 1) {
/* 297 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 6 */                             return null;
                                }
/* 293 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 324 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 213 */                   Oii110oOoO oii110oOoO2 = (Oii110oOoO) this.I00iio;
/* 215 */                   float f2 = this.I00iiO;
/* 217 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 219 */                   int i2 = this.I00iiI;
/* 223 */                   if (i2 == 0) {
/* 241 */                       lIoii1l01l0i.I00000oOI(obj);
/* 246 */                       if (f2 > 0.0f) {
/* 248 */                           this.I00iiI = 1;
/* 260 */                           if (oii110oOoO2.I010l1ol111(f2, oii110oOoO2.I00iiI.getValue(), this) != ii0111o2) {
                                    }
/* 279 */                           return ii0111o2;
                                }
                            } else {
/* 225 */                       if (i2 != 1) {
/* 227 */                           if (i2 == 2) {
/* 229 */                               lIoii1l01l0i.I00000oOI(obj);
/* 281 */                               return OoiIlOl1iI.I00000oIO;
                                    }
/* 233 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 6 */                             return null;
                                }
/* 237 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 265 */                   if (f2 == 0.0f) {
/* 269 */                       OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) this.I00ilI0I1;
/* 271 */                       this.I00iiI = 2;
                                break;
                            }
/* 281 */                   return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 155 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 157 */                   int i3 = this.I00iiI;
/* 159 */                   if (i3 == 0) {
/* 171 */                       lIoii1l01l0i.I00000oOI(obj);
/* 178 */                       I10i01 i10i01 = ((I0oo10O) this.I00iio).I00oO101o;
/* 184 */                       Float f3 = new Float(this.I00iiO);
/* 190 */                       I110IiI0o1Il i110IiI0o1Il = (I110IiI0o1Il) this.I00ilI0I1;
/* 192 */                       this.I00iiI = 1;
/* 203 */                       if (I10i01.I00000oIO(i10i01, f3, i110IiI0o1Il, null, null, this, 12) == ii0111o3) {
/* 205 */                           return ii0111o3;
                                }
                            } else {
/* 161 */                       if (i3 != 1) {
/* 167 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 6 */                             return null;
                                }
/* 163 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 207 */                   return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 96 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 98 */                    lIoii1l01l0i.I00000oOI(obj);
/* 105 */                   OfflineTts offlineTts = ((OliiOI) this.I00iio).I00000oIO;
/* 107 */                   if (offlineTts == null) {
/* 6 */                         return null;
                            }
/* 118 */                   String string = OlOoOIi0o.I00OIo((String) this.I00ilI0I1).toString();
/* 126 */                   if (string.length() == 0) {
/* 129 */                       return new float[0];
                            }
                            try {
/* 140 */                       return offlineTts.generate(string, this.I00iiI, this.I00iiO).getSamples();
                            } catch (Throwable th) {
/* 151 */                       Log.e("SupertonicEngine", "synthesize failed", th);
/* 6 */                         return null;
                            }
                        default:
/* 10 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 12 */                    int i4 = this.I00iiI;
/* 14 */                    if (i4 == 0) {
/* 32 */                        lIoii1l01l0i.I00000oOI(obj);
/* 37 */                        Ii0110 ii01102 = (Ii0110) this.I00iio;
/* 43 */                        fI000O01llI0 = lOiIo0.I000O01llI0(ii01102.I00000oIO());
/* 47 */                        ii0110 = ii01102;
                            } else {
/* 16 */                        if (i4 != 1) {
/* 28 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 6 */                             return null;
                                }
/* 18 */                        fI000O01llI0 = this.I00iiO;
/* 22 */                        ii0110 = (Ii0110) this.I00iio;
/* 24 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 52 */                    while (il001oo1.I0000O(ii0110)) {
/* 56 */                        OoI1Oi0l1I0o ooI1Oi0l1I0o = (OoI1Oi0l1I0o) this.I00ilI0I1;
/* 61 */                        II1O00ioi iI1O00ioi = new II1O00ioi(4);
/* 64 */                        iI1O00ioi.I00iiO = ooI1Oi0l1I0o;
/* 66 */                        iI1O00ioi.I00iiI = fI000O01llI0;
/* 68 */                        VarHandle.storeStoreFence();
/* 71 */                        this.I00iio = ii0110;
/* 73 */                        this.I00iiO = fI000O01llI0;
/* 75 */                        this.I00iiI = 1;
/* 89 */                        if (l1i0lii.I00000oIO(getContext()).I00000oIO(this, iI1O00ioi) == ii0111o5) {
/* 91 */                            return ii0111o5;
                                }
                            }
/* 93 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public OI1l1l(float f, Oii110oOoO oii110oOoO, OI1OloOIO1O oI1OloOIO1O, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 1;
/* 17 */            this.I00iiO = f;
                    this.I00iio = oii110oOoO;
                    this.I00ilI0I1 = oI1OloOIO1O;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public OI1l1l(OoI1Oi0l1I0o ooI1Oi0l1I0o, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 4;
/* 18 */            this.I00ilI0I1 = ooI1Oi0l1I0o;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public OI1l1l(Object obj, float f, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 19 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00iiO = f;
                    this.I00ilI0I1 = obj2;
                }
            }
