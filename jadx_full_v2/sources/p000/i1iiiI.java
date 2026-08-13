            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class i1iiiI extends i1OOoII {
                public final int I00ilO0;
                public final iI0iIIo I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i1iiiI(iI0iIIo ii0iiio, int i) {
/* 6 */             super(ii0iiio, (byte) 0);
/* 1 */             this.I00ilO0 = i;
/* 3 */             this.I00io1l = ii0iiio;
                }

                @Override
                public final Object I00000oIO(int i) {
/* 1 */             int i2 = this.I00ilO0;
/* 3 */             iI0iIIo ii0iiio = this.I00io1l;
                    switch (i2) {
                        case 0:
/* 40 */                    Object[] objArr = ii0iiio.I00iio;
/* 42 */                    objArr.getClass();
/* 45 */                    return objArr[i];
                        case 1:
/* 20 */                    iIOo1ol0 iioo1ol0 = new iIOo1ol0(false, 5);
/* 23 */                    iioo1ol0.I00iio = ii0iiio;
/* 25 */                    Object[] objArr2 = ii0iiio.I00iio;
/* 27 */                    objArr2.getClass();
/* 32 */                    iioo1ol0.I00iiI = objArr2[i];
/* 34 */                    iioo1ol0.I00iiO = i;
/* 36 */                    VarHandle.storeStoreFence();
/* 39 */                    return iioo1ol0;
                        default:
/* 8 */                     Object[] objArr3 = ii0iiio.I00ilI0I1;
/* 10 */                    objArr3.getClass();
/* 13 */                    return objArr3[i];
                    }
                }
            }
