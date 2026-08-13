            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class O0iiliOio implements IilloIOOO0i {
                public IIolilIo I00iOIl;
                public Iillo1il11l I00iiI;

                @Override
                public final float I00000oIO() {
/* 3 */             return this.I00iOIl.I00000oIO();
                }

                public final void I00000oOI() {
/* 1 */             IIolilIo iIolilIo = this.I00iOIl;
/* 3 */             IOO000ilo iOO000ilo = iIolilIo.I00iiI;
/* 7 */             IIolOo iIolOoI0010o = iIolilIo.I00iiI.I0010o();
/* 11 */            IiIill0O0li1 iiIill0O0li1 = this.I00iiI;
/* 13 */            if (iiIill0O0li1 == null) {
/* 245 */               throw IIlIOloOOO.I000OOo1O("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
                    }
/* 16 */            O1ooOo o1ooOo = (O1ooOo) iiIill0O0li1;
/* 20 */            O1ooOo o1ooOoI0000Il00O = o1ooOo.I00iOIl.I00ilO0;
/* 24 */            if (o1ooOoI0000Il00O == null || (o1ooOoI0000Il00O.I00iio & 4) == 0) {
/* 26 */                o1ooOoI0000Il00O = null;
                    } else {
/* 34 */                while (o1ooOoI0000Il00O != null) {
/* 36 */                    int i = o1ooOoI0000Il00O.I00iiO;
/* 40 */                    if ((i & 2) != 0) {
                                break;
                            } else if ((i & 4) != 0) {
                                break;
                            } else {
/* 48 */                        o1ooOoI0000Il00O = o1ooOoI0000Il00O.I00ilO0;
                            }
                        }
/* 26 */                o1ooOoI0000Il00O = null;
                    }
/* 51 */            if (o1ooOoI0000Il00O == null) {
/* 158 */               OIIlIII0Ili oIIlIII0IliI0000oI00 = il0lI1i1olii.I0000oI00(iiIill0O0li1, 4);
/* 168 */               if (oIIlIII0IliI0000oI00.I0110OiO() == o1ooOo.I00iOIl) {
/* 170 */                   oIIlIII0IliI0000oI00 = oIIlIII0IliI0000oI00.I00olI;
                        }
/* 176 */               oIIlIII0IliI0000oI00.I01I01Oolii(iIolOoI0010o, (Io10IOI) iOO000ilo.I00iiO);
/* 179 */               return;
                    }
/* 53 */            OI110O0 oi110o0 = null;
/* 54 */            while (o1ooOoI0000Il00O != null) {
/* 58 */                if (o1ooOoI0000Il00O instanceof Iillo1il11l) {
/* 61 */                    Iillo1il11l iillo1il11l = (Iillo1il11l) o1ooOoI0000Il00O;
/* 66 */                    Io10IOI io10IOI = (Io10IOI) iOO000ilo.I00iiO;
/* 68 */                    OIIlIII0Ili oIIlIII0IliI0000oI002 = il0lI1i1olii.I0000oI00(iillo1il11l, 4);
/* 74 */                    long jI00000oOI = l000O1l.I00000oOI(oIIlIII0IliI0000oI002.I00iiO);
/* 78 */                    O0iiOioolIi o0iiOioolIi = oIIlIII0IliI0000oI002.I00oO101o;
/* 80 */                    o0iiOioolIi.getClass();
/* 93 */                    ((I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIi)).getSharedDrawScope().I0000Il00O(iIolOoI0010o, jI00000oOI, oIIlIII0IliI0000oI002, iillo1il11l, io10IOI);
                        } else if ((o1ooOoI0000Il00O.I00iiO & 4) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 111 */                   int i2 = 0;
/* 113 */                   for (O1ooOo o1ooOo2 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 118 */                       if ((o1ooOo2.I00iiO & 4) != 0) {
/* 120 */                           i2++;
/* 122 */                           if (i2 == 1) {
/* 124 */                               o1ooOoI0000Il00O = o1ooOo2;
                                    } else {
/* 126 */                               if (oi110o0 == null) {
/* 134 */                                   oi110o0 = new OI110O0(new O1ooOo[16]);
                                        }
/* 137 */                               if (o1ooOoI0000Il00O != null) {
/* 139 */                                   oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 142 */                                   o1ooOoI0000Il00O = null;
                                        }
/* 143 */                               oi110o0.I00000oOI(o1ooOo2);
                                    }
                                }
                            }
/* 149 */                   if (i2 == 1) {
                            }
                        }
/* 152 */               o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                    }
                }

                public final void I0000Il00O(IIolOo iIolOo, long j, OIIlIII0Ili oIIlIII0Ili, Iillo1il11l iillo1il11l, Io10IOI io10IOI) {
/* 1 */             Iillo1il11l iillo1il11l2 = this.I00iiI;
/* 3 */             this.I00iiI = iillo1il11l;
/* 5 */             IIolilIo iIolilIo = this.I00iOIl;
/* 9 */             O0iOOoiioO o0iOOoiioO = oIIlIII0Ili.I00oO101o.I00oo1iO0ll;
/* 11 */            IOO000ilo iOO000ilo = iIolilIo.I00iiI;
/* 13 */            IiIooOOOI iiIooOOOII001IIilI0O = iOO000ilo.I001IIilI0O();
/* 17 */            O0iOOoiioO o0iOOoiioOI001i1O0Ol = iOO000ilo.I001i1O0Ol();
/* 21 */            IIolOo iIolOoI0010o = iOO000ilo.I0010o();
/* 25 */            long jI001iOo1i0O = iOO000ilo.I001iOo1i0O();
/* 31 */            Io10IOI io10IOI2 = (Io10IOI) iOO000ilo.I00iiO;
/* 33 */            iOO000ilo.I00IioO0OiOi(oIIlIII0Ili);
/* 36 */            iOO000ilo.I00IlilI0i0i(o0iOOoiioO);
/* 39 */            iOO000ilo.I00IOO(iIolOo);
/* 42 */            iOO000ilo.I00Io1lO(j);
/* 45 */            iOO000ilo.I00iiO = io10IOI;
/* 47 */            iIolOo.I000II();
                    try {
/* 50 */                iillo1il11l.I00l0I0l0lO1(this);
/* 53 */                iIolOo.I00100l0();
/* 56 */                iOO000ilo.I00IioO0OiOi(iiIooOOOII001IIilI0O);
/* 59 */                iOO000ilo.I00IlilI0i0i(o0iOOoiioOI001i1O0Ol);
/* 62 */                iOO000ilo.I00IOO(iIolOoI0010o);
/* 65 */                iOO000ilo.I00Io1lO(jI001iOo1i0O);
/* 68 */                iOO000ilo.I00iiO = io10IOI2;
/* 70 */                this.I00iiI = iillo1il11l2;
                    } catch (Throwable th) {
/* 74 */                iIolOo.I00100l0();
/* 77 */                iOO000ilo.I00IioO0OiOi(iiIooOOOII001IIilI0O);
/* 80 */                iOO000ilo.I00IlilI0i0i(o0iOOoiioOI001i1O0Ol);
/* 83 */                iOO000ilo.I00IOO(iIolOoI0010o);
/* 86 */                iOO000ilo.I00Io1lO(jI001iOo1i0O);
/* 89 */                iOO000ilo.I00iiO = io10IOI2;
/* 399 */               throw th;
                    }
                }

                @Override
                public final long I0000oI00() {
/* 3 */             return this.I00iOIl.I0000oI00();
                }

                @Override
                public final void I000lI(long j, Io10IOI io10IOI, Function1 function1) {
/* 1 */             Iillo1il11l iillo1il11l = this.I00iiI;
/* 3 */             O0iOOoiioO layoutDirection = getLayoutDirection();
/* 11 */            I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(26);
/* 14 */            i01oIoOI01l.I00iiI = this;
/* 16 */            i01oIoOI01l.I00iio = iillo1il11l;
/* 18 */            i01oIoOI01l.I00iiO = function1;
/* 20 */            VarHandle.storeStoreFence();
/* 26 */            io10IOI.I0000oI00(this, layoutDirection, j, i01oIoOI01l);
                }

                @Override
                public final long I00100l0(float f) {
/* 3 */             return this.I00iOIl.I00100l0(f);
                }

                @Override
                public final long I00100o1O0lo(long j) {
/* 3 */             return this.I00iOIl.I00100o1O0lo(j);
                }

                @Override
                public final void I0010I0i(long j, long j2, long j3, float f, int i, I0ol1Ioloo i0ol1Ioloo) {
/* 3 */             this.I00iOIl.I0010I0i(j, j2, j3, f, i, i0ol1Ioloo);
                }

                @Override
                public final void I001IO000(I0ol0lI i0ol0lI, III11l1I iII11l1I, float f, Iilloo0IOoIo iilloo0IOoIo, IOOil0 iOOil0, int i) {
/* 3 */             this.I00iOIl.I001IO000(i0ol0lI, iII11l1I, f, iilloo0IOoIo, iOOil0, i);
                }

                @Override
                public final void I001i1O0Ol(long j, long j2, long j3, float f, Iilloo0IOoIo iilloo0IOoIo, int i) {
/* 3 */             this.I00iOIl.I001i1O0Ol(j, j2, j3, f, iilloo0IOoIo, i);
                }

                @Override
                public final float I001lIiIIo1O(long j) {
/* 3 */             return this.I00iOIl.I001lIiIIo1O(j);
                }

                @Override
                public final long I00IioO0OiOi(int i) {
/* 3 */             return this.I00iOIl.I00IioO0OiOi(i);
                }

                @Override
                public final void I00IlilI0i0i(long j, float f, long j2, Iilloo0IOoIo iilloo0IOoIo) {
/* 3 */             this.I00iOIl.I00IlilI0i0i(j, f, j2, iilloo0IOoIo);
                }

                @Override
                public final long I00Io1o110i(float f) {
/* 3 */             return this.I00iOIl.I00Io1o110i(f);
                }

                @Override
                public final float I00O0o1oo(int i) {
/* 3 */             return this.I00iOIl.I00O0o1oo(i);
                }

                @Override
                public final float I00OIO1(float f) {
/* 7 */             return f / this.I00iOIl.I00000oIO();
                }

                @Override
                public final void I00OOll1(I0oO00o i0oO00o, long j, long j2, long j3, long j4, float f, IOOil0 iOOil0, int i) {
/* 3 */             this.I00iOIl.I00OOll1(i0oO00o, j, j2, j3, j4, f, iOOil0, i);
                }

                @Override
                public final float I00Ol00() {
/* 3 */             return this.I00iOIl.I00Ol00();
                }

                @Override
                public final void I00i0O(long j, long j2, long j3, long j4, Iilloo0IOoIo iilloo0IOoIo) {
/* 3 */             this.I00iOIl.I00i0O(j, j2, j3, j4, iilloo0IOoIo);
                }

                @Override
                public final float I00i0ilIl0i(float f) {
/* 7 */             return this.I00iOIl.I00000oIO() * f;
                }

                @Override
                public final void I00i0oil(I0oO00o i0oO00o, long j, float f, IOOil0 iOOil0, int i) {
/* 3 */             this.I00iOIl.I00i0oil(i0oO00o, j, f, iOOil0, i);
                }

                @Override
                public final IOO000ilo I00iiI() {
/* 3 */             return this.I00iOIl.I00iiI;
                }

                @Override
                public final int I00iio(long j) {
/* 3 */             return this.I00iOIl.I00iio(j);
                }

                @Override
                public final int I00l0OO0IO(float f) {
/* 3 */             return this.I00iOIl.I00l0OO0IO(f);
                }

                @Override
                public final long I00lli11() {
/* 3 */             return this.I00iOIl.I00lli11();
                }

                @Override
                public final void I00lll10(I0ol0lI i0ol0lI, long j, Iilloo0IOoIo iilloo0IOoIo) {
/* 3 */             this.I00iOIl.I00lll10(i0ol0lI, j, iilloo0IOoIo);
                }

                @Override
                public final void I00o101lO(III11l1I iII11l1I, long j, long j2, long j3, float f, Iilloo0IOoIo iilloo0IOoIo, IOOil0 iOOil0, int i) {
/* 3 */             this.I00iOIl.I00o101lO(iII11l1I, j, j2, j3, f, iilloo0IOoIo, iOOil0, i);
                }

                @Override
                public final long I00oI0i(long j) {
/* 3 */             return this.I00iOIl.I00oI0i(j);
                }

                @Override
                public final float I00oO101o(long j) {
/* 3 */             return this.I00iOIl.I00oO101o(j);
                }

                @Override
                public final void I00oliIiO01i(III11l1I iII11l1I, long j, long j2, float f, Iilloo0IOoIo iilloo0IOoIo, IOOil0 iOOil0, int i) {
/* 3 */             this.I00iOIl.I00oliIiO01i(iII11l1I, j, j2, f, iilloo0IOoIo, iOOil0, i);
                }

                @Override
                public final void I00oo1iO0ll(long j, float f, float f2, long j2, long j3, Iilloo0IOoIo iilloo0IOoIo) {
/* 3 */             this.I00iOIl.I00oo1iO0ll(j, f, f2, j2, j3, iilloo0IOoIo);
                }

                @Override
                public final O0iOOoiioO getLayoutDirection() {
/* 5 */             return this.I00iOIl.I00iOIl.I00000oOI;
                }
            }
