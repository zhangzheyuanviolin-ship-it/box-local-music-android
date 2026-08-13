            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class o0IiO1iO extends i1OOoII {
                public final int I00ilO0;
                public final iI0iIIo I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o0IiO1iO(iI0iIIo ii0iiio, int i) {
/* 5 */             super(ii0iiio);
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
/* 21 */                    i1lil0 i1lil0Var = new i1lil0(false, 4);
/* 24 */                    i1lil0Var.I00iio = ii0iiio;
/* 26 */                    Object obj2 = iI0iIIo.I00o0l1o1o0;
/* 34 */                    i1lil0Var.I00iiI = ii0iiio.I00000oOI()[i];
/* 36 */                    i1lil0Var.I00iiO = i;
/* 38 */                    VarHandle.storeStoreFence();
/* 41 */                    return i1lil0Var;
                        default:
/* 8 */                     Object obj3 = iI0iIIo.I00o0l1o1o0;
/* 14 */                    return ii0iiio.I0000Il00O()[i];
                    }
                }
            }
