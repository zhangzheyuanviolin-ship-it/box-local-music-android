            package p000;

            import java.util.List;
            
            public final class IoI0lIii extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final boolean I00iiI;
                public final int I00iiO;
                public final OI10i0Il I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoI0lIii(int i, IOoil1iiIilo iOoil1iiIilo, OI10i0Il oI10i0Il, boolean z) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = z;
/* 3 */             this.I00iiO = i;
/* 5 */             this.I00iio = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             return new IoI0lIii(this.I00iiO, iOoil1iiIilo, this.I00iio, this.I00iiI);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IoI0lIii) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 26 */                if (this.I00iiI) {
/* 35 */                    long j = (this.I00iiO * 100) + 410;
/* 36 */                    this.I00iOIl = 1;
/* 42 */                    if (il0l1o1l.I00000oOI(j, this) == ii0111o) {
/* 44 */                        return ii0111o;
                            }
                        }
/* 54 */                return OoiIlOl1iI.I00000oIO;
                    }
/* 8 */             if (i != 1) {
/* 16 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                return null;
                    }
/* 10 */            lIoii1l01l0i.I00000oOI(obj);
/* 45 */            List list = IoI0lol0i1i.I00000oIO;
/* 51 */            this.I00iio.setValue(Boolean.TRUE);
/* 54 */            return OoiIlOl1iI.I00000oIO;
                }
            }
