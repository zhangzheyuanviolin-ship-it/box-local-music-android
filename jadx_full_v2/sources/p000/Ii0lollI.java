            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Ii0lollI extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final Ii00l101O I00iiI;
                public final Oi1oIiOiIi0 I00iiO;
                public final boolean I00iio;
                public final boolean I00ilI0I1;
                public final Function1 I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii0lollI(Ii00l101O ii00l101O, Oi1oIiOiIi0 oi1oIiOiIi0, boolean z, boolean z2, Function1 function1, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = ii00l101O;
/* 3 */             this.I00iiO = oi1oIiOiIi0;
/* 5 */             this.I00iio = z;
/* 7 */             this.I00ilI0I1 = z2;
/* 9 */             this.I00ilO0 = function1;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            return new Ii0lollI(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((Ii0lollI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             if (i != 0) {
/* 8 */                 if (i == 1) {
/* 10 */                    lIoii1l01l0i.I00000oOI(obj);
/* 13 */                    return obj;
                        }
/* 16 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                return null;
                    }
/* 21 */            lIoii1l01l0i.I00000oOI(obj);
/* 35 */            Ii0loi11oIl ii0loi11oIl = new Ii0loi11oIl(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, (IOoil1iiIilo) null);
/* 38 */            this.I00iOIl = 1;
/* 42 */            Object objI0000oI00 = iOi1II01i0.I0000oI00(this.I00iiI, ii0loi11oIl, this);
                    return objI0000oI00 == ii0111o ? ii0111o : objI0000oI00;
                }
            }
