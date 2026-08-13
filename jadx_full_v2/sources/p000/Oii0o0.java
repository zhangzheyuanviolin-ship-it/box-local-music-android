            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Oii0o0 extends Oll0io implements Function1 {
                public int I00iOIl;
                public final Object I00iiI;
                public final Object I00iiO;
                public final Oii110oOoO I00iio;
                public final OoI1Oi0l1I0o I00ilI0I1;
                public final float I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oii0o0(Object obj, Object obj2, Oii110oOoO oii110oOoO, OoI1Oi0l1I0o ooI1Oi0l1I0o, float f, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(1, iOoil1iiIilo);
/* 1 */             this.I00iiI = obj;
/* 3 */             this.I00iiO = obj2;
/* 5 */             this.I00iio = oii110oOoO;
/* 7 */             this.I00ilI0I1 = ooI1Oi0l1I0o;
/* 9 */             this.I00ilO0 = f;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            return new Oii0o0(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj) {
/* 11 */            return ((Oii0o0) create((IOoil1iiIilo) obj)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 37 */                Oii0lo1 oii0lo1 = new Oii0lo1(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, null);
/* 40 */                this.I00iOIl = 1;
/* 46 */                if (il001oo1.I0000Il00O(oii0lo1, this) == ii0111o) {
/* 48 */                    return ii0111o;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 49 */            return OoiIlOl1iI.I00000oIO;
                }
            }
