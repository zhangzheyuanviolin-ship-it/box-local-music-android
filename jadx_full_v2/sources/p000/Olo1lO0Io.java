            package p000;

            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class Olo1lO0Io extends Oi10IOIi implements IlliIl1l11O {
                public int I00iiI;
                public Object I00iiO;
                public final Ii0110 I00iio;
                public final OOIII0OOoOi1 I00ilI0I1;
                public final Function1 I00ilO0;
                public final Function1 I00io1l;
                public final Function3 I00ioIO;
                public final Function1 I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Olo1lO0Io(Ii0110 ii0110, OOIII0OOoOi1 oOIII0OOoOi1, Function1 function1, Function1 function12, Function3 function3, Function1 function13, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iio = ii0110;
/* 3 */             this.I00ilI0I1 = oOIII0OOoOi1;
/* 5 */             this.I00ilO0 = function1;
/* 7 */             this.I00io1l = function12;
/* 9 */             this.I00ioIO = function3;
/* 11 */            this.I00l0I0l0lO1 = function13;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 16 */            Olo1lO0Io olo1lO0Io = new Olo1lO0Io(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, iOoil1iiIilo);
/* 19 */            olo1lO0Io.I00iiO = obj;
/* 37 */            return olo1lO0Io;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((Olo1lO0Io) create((Oll11lOlo) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 6 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 27 */                Oll11lOlo oll11lOlo = (Oll11lOlo) this.I00iiO;
/* 29 */                this.I00iiI = 1;
/* 48 */                if (OloI0l1i1oO.I000O01llI0(oll11lOlo, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, this) == ii0111o) {
/* 50 */                    return ii0111o;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 51 */            return OoiIlOl1iI.I00000oIO;
                }
            }
