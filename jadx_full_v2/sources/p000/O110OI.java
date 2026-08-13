            package p000;

            import android.content.Context;
            import kotlin.jvm.functions.Function1;
            
            public final class O110OI extends Oll0io implements IlliIl1l11O {
                public OI10i0Il I00iOIl;
                public int I00iiI;
                public final Context I00iiO;
                public final O0oiOi I00iio;
                public final IlliIl1l11O I00ilI0I1;
                public final int I00ilO0;
                public final int I00io1l;
                public final IIo0l1 I00ioIO;
                public final IllOOo00lI I00l0I0l0lO1;
                public final Function1 I00l0OO0IO;
                public final OI10i0Il I00li1OI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O110OI(Context context, O0oiOi o0oiOi, IlliIl1l11O illiIl1l11O, int i, int i2, IIo0l1 iIo0l1, IllOOo00lI illOOo00lI, Function1 function1, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo) {
/* 20 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiO = context;
/* 3 */             this.I00iio = o0oiOi;
/* 5 */             this.I00ilI0I1 = illiIl1l11O;
/* 7 */             this.I00ilO0 = i;
/* 9 */             this.I00io1l = i2;
/* 11 */            this.I00ioIO = iIo0l1;
/* 13 */            this.I00l0I0l0lO1 = illOOo00lI;
/* 15 */            this.I00l0OO0IO = function1;
/* 17 */            this.I00li1OI = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 22 */            return new O110OI(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, this.I00li1OI, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((O110OI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OI10i0Il oI10i0Il;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 6 */             if (i == 0) {
/* 23 */                lIoii1l01l0i.I00000oOI(obj);
/* 26 */                OI10i0Il oI10i0Il2 = this.I00li1OI;
/* 28 */                this.I00iOIl = oI10i0Il2;
/* 30 */                this.I00iiI = 1;
/* 49 */                Object objI00000oOI = iIoOlloI.I00000oOI(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, this);
/* 53 */                if (objI00000oOI == ii0111o) {
/* 55 */                    return ii0111o;
                        }
/* 57 */                obj = objI00000oOI;
/* 58 */                oI10i0Il = oI10i0Il2;
                    } else {
/* 8 */                 if (i != 1) {
/* 18 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 21 */                    return null;
                        }
/* 10 */                oI10i0Il = this.I00iOIl;
/* 12 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 61 */            oI10i0Il.setValue((OOIl1Io0) obj);
/* 64 */            return OoiIlOl1iI.I00000oIO;
                }
            }
