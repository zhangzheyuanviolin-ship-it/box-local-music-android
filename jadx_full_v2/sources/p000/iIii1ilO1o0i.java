            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iIii1ilO1o0i extends i1OOoII {
                public final int I00ilO0;
                public final iI0iIIo I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iIii1ilO1o0i(iI0iIIo ii0iiio, int i) {
/* 6 */             super(ii0iiio, 0);
/* 1 */             this.I00ilO0 = i;
/* 3 */             this.I00io1l = ii0iiio;
                }

                @Override
                public final Object I00000oIO(int i) {
/* 1 */             int i2 = this.I00ilO0;
/* 3 */             iI0iIIo ii0iiio = this.I00io1l;
                    switch (i2) {
                        case 0:
/* 41 */                    Object obj = iI0iIIo.I00o0l1o1o0;
/* 47 */                    return ii0iiio.I00000oOI()[i];
                        case 1:
/* 20 */                    iOI1ll ioi1ll = new iOI1ll(false, 0);
/* 23 */                    ioi1ll.I00iio = ii0iiio;
/* 25 */                    Object obj2 = iI0iIIo.I00o0l1o1o0;
/* 33 */                    ioi1ll.I00iiI = ii0iiio.I00000oOI()[i];
/* 35 */                    ioi1ll.I00iiO = i;
/* 37 */                    VarHandle.storeStoreFence();
/* 40 */                    return ioi1ll;
                        default:
/* 8 */                     Object obj3 = iI0iIIo.I00o0l1o1o0;
/* 14 */                    return ii0iiio.I0000Il00O()[i];
                    }
                }
            }
