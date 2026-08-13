            package p000;

            import java.util.List;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class I001IIilI0O extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final I001i1lo1io I00iiI;
                public final String I00iiO;
                public final float I00iio;
                public final int I00ilI0I1;
                public final List I00ilO0;
                public final String I00io1l;
                public final Function3 I00ioIO;
                public final Function1 I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I001IIilI0O(I001i1lo1io i001i1lo1io, String str, float f, int i, List list, String str2, Function3 function3, Function1 function1, IOoil1iiIilo iOoil1iiIilo) {
/* 18 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = i001i1lo1io;
/* 3 */             this.I00iiO = str;
/* 5 */             this.I00iio = f;
/* 7 */             this.I00ilI0I1 = i;
/* 9 */             this.I00ilO0 = list;
/* 11 */            this.I00io1l = str2;
/* 13 */            this.I00ioIO = function3;
/* 15 */            this.I00l0I0l0lO1 = function1;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 20 */            return new I001IIilI0O(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((I001IIilI0O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 24 */                I001i1O0Ol i001i1O0Ol = I001i1O0Ol.I00000oIO;
/* 26 */                this.I00iOIl = 1;
/* 49 */                if (i001i1O0Ol.I000OOo1O(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, this) == ii0111o) {
/* 51 */                    return ii0111o;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 52 */            return OoiIlOl1iI.I00000oIO;
                }
            }
