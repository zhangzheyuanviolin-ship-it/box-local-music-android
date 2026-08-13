            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class i1iillI extends i1OOoII {
                public final int I00ilO0;
                public final iI0iIIo I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i1iillI(iI0iIIo ii0iiio, int i) {
/* 6 */             super(ii0iiio, (char) 0);
/* 1 */             this.I00ilO0 = i;
/* 3 */             this.I00io1l = ii0iiio;
                }

                @Override
                public final Object I00000oIO(int i) {
/* 1 */             int i2 = this.I00ilO0;
/* 3 */             iI0iIIo ii0iiio = this.I00io1l;
                    switch (i2) {
                        case 0:
/* 42 */                    Object obj = iI0iIIo.I00o0l1o1o0;
/* 48 */                    return ii0iiio.I00000oOI()[i];
                        case 1:
/* 21 */                    iIOoOIllO iioooillo = new iIOoOIllO(false, 6);
/* 24 */                    iioooillo.I00iio = ii0iiio;
/* 26 */                    Object obj2 = iI0iIIo.I00o0l1o1o0;
/* 34 */                    iioooillo.I00iiI = ii0iiio.I00000oOI()[i];
/* 36 */                    iioooillo.I00iiO = i;
/* 38 */                    VarHandle.storeStoreFence();
/* 41 */                    return iioooillo;
                        default:
/* 8 */                     Object obj3 = iI0iIIo.I00o0l1o1o0;
/* 14 */                    return ii0iiio.I0000Il00O()[i];
                    }
                }
            }
