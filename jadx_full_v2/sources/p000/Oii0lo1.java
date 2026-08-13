            package p000;
            
            public final class Oii0lo1 extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public Object I00iiI;
                public final Object I00iiO;
                public final Object I00iio;
                public final Oii110oOoO I00ilI0I1;
                public final OoI1Oi0l1I0o I00ilO0;
                public final float I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oii0lo1(Object obj, Object obj2, Oii110oOoO oii110oOoO, OoI1Oi0l1I0o ooI1Oi0l1I0o, float f, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiO = obj;
/* 3 */             this.I00iio = obj2;
/* 5 */             this.I00ilI0I1 = oii110oOoO;
/* 7 */             this.I00ilO0 = ooI1Oi0l1I0o;
/* 9 */             this.I00io1l = f;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            Oii0lo1 oii0lo1 = new Oii0lo1(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo);
/* 17 */            oii0lo1.I00iiI = obj;
/* 37 */            return oii0lo1;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((Oii0lo1) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = null;
/* 9 */             Oii110oOoO oii110oOoO = this.I00ilI0I1;
/* 11 */            if (i == 0) {
/* 25 */                lIoii1l01l0i.I00000oOI(obj);
/* 30 */                Ii0110 ii0110 = (Ii0110) this.I00iiI;
/* 32 */                Object obj2 = this.I00iiO;
/* 34 */                Object obj3 = this.I00iio;
/* 40 */                if (O0000Ioio00.I0000O(obj2, obj3)) {
/* 46 */                    oii110oOoO.I00o0iI0io1 = null;
/* 58 */                    if (O0000Ioio00.I0000O(oii110oOoO.I00iiO.getValue(), obj2)) {
/* 60 */                        return ooiIlOl1iI;
                            }
                        } else {
/* 42 */                    oii110oOoO.I010ioo();
                        }
/* 61 */                boolean zI0000O = O0000Ioio00.I0000O(obj2, obj3);
/* 65 */                float f = this.I00io1l;
/* 67 */                if (!zI0000O) {
/* 69 */                    OoI1Oi0l1I0o ooI1Oi0l1I0o = this.I00ilO0;
/* 71 */                    ooI1Oi0l1I0o.I00111O(obj2);
/* 76 */                    ooI1Oi0l1I0o.I00100l0(0L);
/* 81 */                    oii110oOoO.I00iiI.setValue(obj2);
/* 84 */                    ooI1Oi0l1I0o.I000l1(f);
                        }
/* 87 */                oii110oOoO.I010o0o0oO(f);
/* 96 */                if (oii110oOoO.I00lll10.I000OiO()) {
/* 105 */                   iOi1II01i0.I0000O(ii0110, null, null, new O1iOlO(oii110oOoO, iOoil1iiIilo, 7), 3);
                        } else {
/* 111 */                   oii110oOoO.I00lli11 = Long.MIN_VALUE;
                        }
/* 113 */               this.I00iOIl = 1;
/* 119 */               if (oii110oOoO.I0110OiO(this) == ii0111o) {
/* 121 */                   return ii0111o;
                        }
                    } else {
/* 13 */                if (i != 1) {
/* 21 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        }
/* 15 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 122 */           oii110oOoO.I010lI0oi();
/* 168 */           return ooiIlOl1iI;
                }
            }
