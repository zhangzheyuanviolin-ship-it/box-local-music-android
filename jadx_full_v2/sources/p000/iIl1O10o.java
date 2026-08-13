            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicLong;
            
            public final class iIl1O10o extends i1iiOOililI0 {
                public final int I00000oOI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iIl1O10o(int i) {
/* 4 */             super(0);
/* 1 */             this.I00000oOI = i;
                }

                @Override
                public final Object I00000oIO() {
                    switch (this.I00000oOI) {
                        case 0:
/* 61 */                    iIoilOo iioiloo = new iIoilOo();
/* 69 */                    iioiloo.I00000oIO = new AtomicBoolean();
/* 76 */                    iioiloo.I00000oOI = new AtomicInteger();
/* 78 */                    VarHandle.storeStoreFence();
/* 81 */                    return iioiloo;
                        case 1:
/* 45 */                    iOI1i1O1 ioi1i1o1 = new iOI1i1O1();
/* 53 */                    ioi1i1o1.I0000Il00O = new AtomicInteger();
/* 55 */                    VarHandle.storeStoreFence();
/* 58 */                    return ioi1i1o1;
                        case 2:
/* 26 */                    io0oOO0ll io0ooo0ll = new io0oOO0ll();
/* 37 */                    io0ooo0ll.I0000Il00O = new AtomicLong(2147483647L);
/* 39 */                    VarHandle.storeStoreFence();
/* 42 */                    return io0ooo0ll;
                        default:
/* 8 */                     l0o1iIoI l0o1iioi = new l0o1iIoI();
/* 18 */                    l0o1iioi.I0000Il00O = new AtomicLong(-1L);
/* 20 */                    VarHandle.storeStoreFence();
/* 23 */                    return l0o1iioi;
                    }
                }
            }
