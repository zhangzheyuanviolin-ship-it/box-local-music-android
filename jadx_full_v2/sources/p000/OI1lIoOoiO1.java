            package p000;
            
            public final class OI1lIoOoiO1 extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final float I00iiI;
                public final float I00iiO;
                public final Oii110oOoO I00iio;
                public final OiO1O1lil10 I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OI1lIoOoiO1(float f, float f2, Oii110oOoO oii110oOoO, OiO1O1lil10 oiO1O1lil10, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = f;
/* 3 */             this.I00iiO = f2;
/* 5 */             this.I00iio = oii110oOoO;
/* 7 */             this.I00ilI0I1 = oiO1O1lil10;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            return new OI1lIoOoiO1(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OI1lIoOoiO1) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
                
                    if (r2.I01101IOlO(r7.I00ilI0I1, r7) == r0) goto L20;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 5 */             Oii110oOoO oii110oOoO = this.I00iio;
/* 7 */             float f = this.I00iiI;
/* 9 */             float f2 = this.I00iiO;
/* 13 */            if (i == 0) {
/* 34 */                lIoii1l01l0i.I00000oOI(obj);
/* 39 */                if (f != f2) {
/* 42 */                    this.I00iOIl = 1;
/* 54 */                    if (oii110oOoO.I010l1ol111(f, oii110oOoO.I00iiI.getValue(), this) != ii0111o) {
                            }
/* 71 */                    return ii0111o;
                        }
                    } else {
/* 15 */                if (i != 1) {
/* 17 */                    if (i == 2) {
/* 19 */                        lIoii1l01l0i.I00000oOI(obj);
/* 72 */                        return OoiIlOl1iI.I00000oIO;
                            }
/* 25 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 28 */                    return null;
                        }
/* 30 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 59 */            if (f == f2) {
/* 61 */                this.I00iOIl = 2;
                    }
/* 72 */            return OoiIlOl1iI.I00000oIO;
                }
            }
