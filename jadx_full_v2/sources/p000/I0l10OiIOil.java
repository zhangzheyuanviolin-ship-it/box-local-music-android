            package p000;

            import kotlin.jvm.functions.Function1;
            
/* 27 */    public final class I0l10OiIOil extends Iilio0oo0 {
                public I0l1OOl1l10 I010OIo1l;
                public Boolean I010i10l;
                public II1OIl1 I010iIIOlo;
                public IlOIll0o11Ii I010ioo;
                public IiIooOOOI I010l10O;

                @Override
                public final void I0000O() {
/* 1 */             I00IO1oi11O();
/* 6 */             if (this.I00lll10) {
/* 12 */                IiIooOOOI iiIooOOOI = il0lI1i1olii.I000O01llI0(this).I00oliIiO01i;
/* 14 */                IiIooOOOI iiIooOOOI2 = this.I010l10O;
/* 16 */                if (iiIooOOOI2 == null || !iiIooOOOI2.equals(iiIooOOOI)) {
/* 24 */                    this.I010l10O = iiIooOOOI;
/* 28 */                    I011olOoO(this.I010iIIOlo);
                        }
                    }
                }

                @Override
                public final void I010101Oo1lO() {
/* 3 */             I011olOoO(this.I010iIIOlo);
                }

                @Override
                public final Object I010oio1OO0(Iililo00OiO iililo00OiO, Iililo00OiO iililo00OiO2) {
/* 9 */             Object objI00000oOI = I0l1OOl1l10.I00000oOI(this.I010OIo1l, new I0i11IIlO(iililo00OiO, this, (IOoil1iiIilo) null), iililo00OiO2);
                    return objI00000oOI == Ii0111o.I00iOIl ? objI00000oOI : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final void I011IO1I11OI(IilIoiI1Oo01 iilIoiI1Oo01) {
/* 3 */             if (this.I00lll10) {
/* 18 */                iOi1II01i0.I0000O(I00ooiO1I(), null, null, new I00oI0i(this, iilIoiI1Oo01, null, 4), 3);
                    }
                }

                @Override
                public final boolean I011iiii0i() {
                    return ((OIooliIO0) this.I010OIo1l.I000OOo1O).getValue() != null;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I011lOIoo0l(float f, IOoilo iOoilo) throws Throwable {
                    I0l0lo i0l0lo;
                    OOo0lO oOo0lO;
/* 3 */             if (iOoilo instanceof I0l0lo) {
/* 6 */                 i0l0lo = (I0l0lo) iOoilo;
/* 8 */                 int i = i0l0lo.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i0l0lo.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i0l0lo = new I0l0lo(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = i0l0lo.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = i0l0lo.I00iio;
/* 34 */            if (i2 == 0) {
/* 57 */                lIoii1l01l0i.I00000oOI(obj);
/* 66 */                if (this.I010OIo1l.I0000O()) {
/* 68 */                    I0l1OOl1l10 i0l1OOl1l10 = this.I010OIo1l;
/* 70 */                    i0l0lo.I00iio = 1;
/* 76 */                    if (!i0l1OOl1l10.I0000O()) {
/* 80 */                        Ioll0IliO1l.I00000oIO("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
                            }
/* 87 */                    Object value = ((OIooliIO0) i0l1OOl1l10.I000II).getValue();
/* 91 */                    Ii1loIll001 ii1loIll001I0000Il00O = i0l1OOl1l10.I0000Il00O();
/* 95 */                    float fI0001Ioi1lo = i0l1OOl1l10.I0001Ioi1lo();
/* 101 */                   Function1 function1 = (Function1) i0l1OOl1l10.I00000oOI;
/* 103 */                   if (function1 == null) {
/* 152 */                       O0000Ioio00.I000OOo1O("positionalThreshold");
/* 155 */                       throw null;
                            }
/* 107 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) i0l1OOl1l10.I0000Il00O;
/* 109 */                   if (illOOo00lI == null) {
/* 146 */                       O0000Ioio00.I000OOo1O("velocityThreshold");
/* 149 */                       throw null;
                            }
/* 111 */                   Object objI000O01llI0 = I0l0lIoOIoIi.I000O01llI0(ii1loIll001I0000Il00O, fI0001Ioi1lo, f, function1, illOOo00lI);
/* 136 */                   Object objI000II = ((Boolean) ((Function1) i0l1OOl1l10.I00000oIO).invoke(objI000O01llI0)).booleanValue() ? I0l0lIoOIoIi.I000II(i0l1OOl1l10, objI000O01llI0, f, i0l0lo) : I0l0lIoOIoIi.I000II(i0l1OOl1l10, value, f, i0l0lo);
/* 140 */                   if (objI000II != ii0111o) {
/* 143 */                       return objI000II;
                            }
                        } else {
/* 158 */                   OOo0lO oOo0lO2 = new OOo0lO();
/* 161 */                   oOo0lO2.I00iOIl = f;
/* 163 */                   I0l1OOl1l10 i0l1OOl1l102 = this.I010OIo1l;
/* 167 */                   I0l0ol i0l0ol = new I0l0ol(this, oOo0lO2, f, null);
/* 170 */                   i0l0lo.I00iOIl = oOo0lO2;
/* 172 */                   i0l0lo.I00iio = 2;
/* 178 */                   if (I0l1OOl1l10.I00000oOI(i0l1OOl1l102, i0l0ol, i0l0lo) != ii0111o) {
/* 181 */                       oOo0lO = oOo0lO2;
                            }
                        }
/* 180 */               return ii0111o;
                    }
/* 36 */            if (i2 == 1) {
/* 53 */                lIoii1l01l0i.I00000oOI(obj);
/* 56 */                return obj;
                    }
/* 38 */            if (i2 != 2) {
/* 49 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                return null;
                    }
/* 40 */            oOo0lO = i0l0lo.I00iOIl;
/* 42 */            lIoii1l01l0i.I00000oOI(obj);
/* 186 */           return new Float(oOo0lO.I00iOIl);
                }

                public final void I011olOoO(II1OIl1 iI1OIl1) {
                    IlOIll0o11Ii ilOIll0o11IiI0000O = iI1OIl1;
/* 1 */             if (iI1OIl1 == null) {
/* 3 */                 OoIoO0I0oOI ooIoO0I0oOI = I0l0O0O.I00000oIO;
/* 5 */                 I01OoIoio00O i01OoIoio00O = I0l0O0O.I00000oOI;
/* 11 */                IiIooOOOI iiIooOOOI = il0lI1i1olii.I000O01llI0(this).I00oliIiO01i;
/* 13 */                this.I010l10O = iiIooOOOI;
/* 17 */                ilOIll0o11IiI0000O = I0l0lIoOIoIi.I0000O(this.I010OIo1l, iiIooOOOI, i01OoIoio00O, ooIoO0I0oOI);
                    }
/* 21 */            this.I010ioo = ilOIll0o11IiI0000O;
                }

                @Override
/* 28 */        public final void I0111i(long j) {
                }
            }
