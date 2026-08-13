            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIoIio extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public Object I00iiI;
                public final OIoIoIO0oI1O I00iiO;
                public final int I00iio;
                public final float I00ilI0I1;
                public final I110IiI0o1Il I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OIoIio(OIoIoIO0oI1O oIoIoIO0oI1O, int i, float f, I110IiI0o1Il i110IiI0o1Il, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiO = oIoIoIO0oI1O;
/* 3 */             this.I00iio = i;
/* 5 */             this.I00ilI0I1 = f;
/* 7 */             this.I00ilO0 = i110IiI0o1Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            OIoIio oIoIio = new OIoIio(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo);
/* 15 */            oIoIio.I00iiI = obj;
/* 37 */            return oIoIio;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OIoIio) create((OiOiliiO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i2 = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             int i3 = 1;
/* 8 */             if (i2 != 0) {
/* 10 */                if (i2 == 1) {
/* 12 */                    lIoii1l01l0i.I00000oOI(obj);
/* 15 */                    return ooiIlOl1iI;
                        }
/* 18 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 21 */                return null;
                    }
/* 23 */            lIoii1l01l0i.I00000oOI(obj);
/* 28 */            OiOiliiO oiOiliiO = (OiOiliiO) this.I00iiI;
/* 32 */            O0o0101i o0o0101i = new O0o0101i(i3);
/* 35 */            OIoIoIO0oI1O oIoIoIO0oI1O = this.I00iiO;
/* 37 */            o0o0101i.I0000Il00O = oIoIoIO0oI1O;
/* 39 */            o0o0101i.I00000oOI = oiOiliiO;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            this.I00iOIl = 1;
/* 46 */            OIoIoilI1 oIoIoilI1 = OIoIol.I00000oIO;
/* 50 */            int i4 = this.I00iio;
/* 65 */            oIoIoIO0oI1O.I00100o1O0lo.I000O01llI0(oIoIoIO0oI1O.I000OiO(new Integer(i4).intValue()));
/* 75 */            boolean z = i4 > oIoIoIO0oI1O.I0000oI00;
/* 83 */            int iI0000oI00 = (o0o0101i.I0000oI00() - oIoIoIO0oI1O.I0000oI00) + 1;
/* 84 */            int i5 = 3;
/* 85 */            if (((z && i4 > o0o0101i.I0000oI00()) || (!z && i4 < oIoIoIO0oI1O.I0000oI00)) && Math.abs(i4 - oIoIoIO0oI1O.I0000oI00) >= 3) {
/* 109 */               if (z) {
/* 111 */                   i = i4 - iI0000oI00;
/* 113 */                   int i6 = oIoIoIO0oI1O.I0000oI00;
/* 115 */                   if (i < i6) {
/* 117 */                       i = i6;
                            }
                        } else {
/* 119 */                   int i7 = iI0000oI00 + i4;
/* 120 */                   i = oIoIoIO0oI1O.I0000oI00;
/* 122 */                   if (i7 <= i) {
/* 125 */                       i = i7;
                            }
                        }
/* 126 */               o0o0101i.I0001Ioi1lo(i, 0);
                    }
/* 136 */           float fI00000oOI = o0o0101i.I00000oOI(i4) + this.I00ilI0I1;
/* 140 */           OOo0lO oOo0lO = new OOo0lO();
/* 145 */           O1oiiIIo111o o1oiiIIo111o = new O1oiiIIo111o(i5);
/* 148 */           o1oiiIIo111o.I00iiI = oOo0lO;
/* 150 */           o1oiiIIo111o.I00iiO = o0o0101i;
/* 152 */           VarHandle.storeStoreFence();
/* 160 */           Object objI0000Il00O = lOiIo0.I0000Il00O(0.0f, fI00000oOI, this.I00ilO0, o1oiiIIo111o, this, 4);
/* 164 */           if (objI0000Il00O != ii0111o) {
/* 167 */               objI0000Il00O = ooiIlOl1iI;
                    }
                    return objI0000Il00O == ii0111o ? ii0111o : ooiIlOl1iI;
                }
            }
