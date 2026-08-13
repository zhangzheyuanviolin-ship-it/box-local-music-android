            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
/* 15 */    public final class Ii1oIO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 0;
                public OOo0lO I00iiI;
                public int I00iiO;
                public final float I00iio;
                public final OiOiliiO I00ilI0I1;
                public Object I00ilO0;
                public final Object I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1oIO(Ol1iIOI ol1iIOI, float f, Function1 function1, OiOiliiO oiOiliiO, IOoil1iiIilo iOoil1iiIilo) {
/* 13 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00ilO0 = ol1iIOI;
/* 6 */             this.I00iio = f;
/* 8 */             this.I00io1l = function1;
/* 10 */            this.I00ilI0I1 = oiOiliiO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00io1l;
                    switch (i) {
                        case 0:
/* 32 */                    OiOiliiO oiOiliiO = this.I00ilI0I1;
/* 36 */                    return new Ii1oIO(this.I00iio, (Ii1oIilI) obj2, oiOiliiO, iOoil1iiIilo);
                        default:
/* 18 */                    OiOiliiO oiOiliiO2 = this.I00ilI0I1;
/* 23 */                    return new Ii1oIO((Ol1iIOI) this.I00ilO0, this.I00iio, (Function1) obj2, oiOiliiO2, iOoil1iiIilo);
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
/* 18 */            return ((Ii1oIO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OOo0lO oOo0lO;
                    I110IiI1I1 i110IiI1I1;
                    Ii1OoIll0 ii1OoIll0;
                    I0O1IO i0o1io;
                    OOo0lO oOo0lO2;
                    Object objI0000O;
/* 1 */             int i = this.I00iOIl;
/* 6 */             float f = this.I00iio;
/* 8 */             Object obj2 = this.I00io1l;
                    switch (i) {
                        case 0:
/* 201 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 203 */                   int i2 = this.I00iiO;
/* 205 */                   if (i2 == 0) {
/* 223 */                       lIoii1l01l0i.I00000oOI(obj);
/* 234 */                       if (Math.abs(f) > 1.0f) {
/* 238 */                           OOo0lO oOo0lO3 = new OOo0lO();
/* 241 */                           oOo0lO3.I00iOIl = f;
/* 245 */                           OOo0lO oOo0lO4 = new OOo0lO();
/* 250 */                           I110IiI1I1 i110IiI1I1I00000oIO = iOO0I0.I00000oIO(0.0f, f, 28);
                                    try {
/* 254 */                               Ii1oIilI ii1oIilI = (Ii1oIilI) obj2;
/* 256 */                               ii1OoIll0 = ii1oIilI.I00000oIO;
/* 258 */                               OiOiliiO oiOiliiO = this.I00ilI0I1;
/* 263 */                               i0o1io = new I0O1IO(7);
/* 266 */                               i0o1io.I00iiI = oOo0lO4;
/* 268 */                               i0o1io.I00iiO = oiOiliiO;
/* 270 */                               i0o1io.I00iio = oOo0lO3;
/* 272 */                               i0o1io.I00ilI0I1 = ii1oIilI;
/* 274 */                               VarHandle.storeStoreFence();
/* 277 */                               this.I00iiI = oOo0lO3;
/* 279 */                               this.I00ilO0 = i110IiI1I1I00000oIO;
/* 281 */                               this.I00iiO = 1;
                                    } catch (CancellationException unused) {
/* 293 */                               oOo0lO = oOo0lO3;
/* 294 */                               i110IiI1I1 = i110IiI1I1I00000oIO;
/* 305 */                               oOo0lO.I00iOIl = ((Number) i110IiI1I1.I00000oIO()).floatValue();
/* 307 */                               f = oOo0lO.I00iOIl;
/* 311 */                               return new Float(f);
                                    }
/* 287 */                           if (lOiIo0.I0000O(i110IiI1I1I00000oIO, ii1OoIll0, false, i0o1io, this) == ii0111o) {
/* 289 */                               return ii0111o;
                                    }
/* 291 */                           oOo0lO = oOo0lO3;
/* 307 */                           f = oOo0lO.I00iOIl;
                                }
                            } else {
/* 207 */                       if (i2 != 1) {
/* 219 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 211 */                       i110IiI1I1 = (I110IiI1I1) this.I00ilO0;
/* 213 */                       oOo0lO = this.I00iiI;
                                try {
/* 215 */                           lIoii1l01l0i.I00000oOI(obj);
                                } catch (CancellationException unused2) {
/* 305 */                           oOo0lO.I00iOIl = ((Number) i110IiI1I1.I00000oIO()).floatValue();
/* 307 */                           f = oOo0lO.I00iOIl;
/* 311 */                           return new Float(f);
                                }
/* 307 */                       f = oOo0lO.I00iOIl;
                            }
/* 311 */                   return new Float(f);
                        default:
/* 17 */                    Function1 function1 = (Function1) obj2;
/* 21 */                    Ol1iIOI ol1iIOI = (Ol1iIOI) this.I00ilO0;
/* 23 */                    Ol1iiOol0 ol1iiOol0 = ol1iIOI.I00000oIO;
/* 25 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 27 */                    int i3 = this.I00iiO;
/* 30 */                    if (i3 == 0) {
/* 56 */                        lIoii1l01l0i.I00000oOI(obj);
/* 65 */                        float fI000O01llI0 = ol1iiOol0.I000O01llI0(f, il0OoiI.I00000oIO(ol1iIOI.I00000oOI, 0.0f, f));
/* 73 */                        if (Float.isNaN(fI000O01llI0)) {
/* 77 */                            Ioll0IliO1l.I0000Il00O("calculateApproachOffset returned NaN. Please use a valid value.");
                                }
/* 82 */                        oOo0lO2 = new OOo0lO();
/* 93 */                        float fSignum = Math.signum(f) * Math.abs(fI000O01llI0);
/* 94 */                        oOo0lO2.I00iOIl = fSignum;
/* 101 */                       function1.invoke(new Float(fSignum));
/* 104 */                       float f2 = oOo0lO2.I00iOIl;
/* 108 */                       Ol1i0oil0 ol1i0oil0 = new Ol1i0oil0(0);
/* 111 */                       ol1i0oil0.I00iiI = oOo0lO2;
/* 113 */                       ol1i0oil0.I00iiO = function1;
/* 115 */                       VarHandle.storeStoreFence();
/* 118 */                       this.I00iiI = oOo0lO2;
/* 120 */                       this.I00iiO = 1;
/* 127 */                       objI0000O = ol1iIOI.I0000O(this.I00ilI0I1, f2, this.I00iio, ol1i0oil0, this);
/* 131 */                       if (objI0000O != ii0111o2) {
                                }
/* 199 */                       return ii0111o2;
                            }
/* 32 */                    if (i3 != 1) {
/* 34 */                        if (i3 == 2) {
/* 36 */                            lIoii1l01l0i.I00000oOI(obj);
/* 39 */                            return obj;
                                }
/* 42 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 48 */                    OOo0lO oOo0lO5 = this.I00iiI;
/* 50 */                    lIoii1l01l0i.I00000oOI(obj);
/* 53 */                    oOo0lO2 = oOo0lO5;
/* 54 */                    objI0000O = obj;
/* 134 */                   I110IiI1I1 i110IiI1I12 = (I110IiI1I1) objI0000O;
/* 146 */                   float fI000OiO = ol1iiOol0.I000OiO(((Number) i110IiI1I12.I00000oIO()).floatValue());
/* 154 */                   if (Float.isNaN(fI000OiO)) {
/* 158 */                       Ioll0IliO1l.I0000Il00O("calculateSnapOffset returned NaN. Please use a valid value.");
                            }
/* 161 */                   oOo0lO2.I00iOIl = fI000OiO;
/* 165 */                   I110IiI1I1 i110IiI1I1I00000oOI = iOO0I0.I00000oOI(i110IiI1I12, 0.0f, 0.0f, 30);
/* 169 */                   I110IiI0o1Il i110IiI0o1Il = ol1iIOI.I0000Il00O;
/* 173 */                   Ol1i0oil0 ol1i0oil02 = new Ol1i0oil0(1);
/* 176 */                   ol1i0oil02.I00iiI = oOo0lO2;
/* 178 */                   ol1i0oil02.I00iiO = function1;
/* 180 */                   VarHandle.storeStoreFence();
/* 183 */                   this.I00iiI = null;
/* 185 */                   this.I00iiO = 2;
/* 193 */                   Object objI0000Il00O = lOIo00oi1i.I0000Il00O(this.I00ilI0I1, fI000OiO, fI000OiO, i110IiI1I1I00000oOI, i110IiI0o1Il, ol1i0oil02, this);
/* 197 */                   if (objI0000Il00O != ii0111o2) {
/* 200 */                       return objI0000Il00O;
                            }
/* 199 */                   return ii0111o2;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public Ii1oIO(float f, Ii1oIilI ii1oIilI, OiOiliiO oiOiliiO, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 17 */            this.I00iio = f;
                    this.I00io1l = ii1oIilI;
                    this.I00ilI0I1 = oiOiliiO;
                }
            }
