            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicLong;
            
            public final class o0l1O1OIooi0 extends i1iiOOililI0 {
                public final int I00000oOI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o0l1O1OIooi0(int i) {
/* 4 */             super(1);
/* 1 */             this.I00000oOI = i;
                }

                @Override
                public final Object I00000oIO() {
                    switch (this.I00000oOI) {
                        case 0:
/* 65 */                    o0lI0lIio0 o0li0liio0 = new o0lI0lIio0();
/* 76 */                    o0li0liio0.I0000Il00O = new AtomicLong(2147483647L);
/* 78 */                    VarHandle.storeStoreFence();
/* 81 */                    return o0li0liio0;
                        case 1:
/* 47 */                    o0lOOiO o0looio = new o0lOOiO();
/* 57 */                    o0looio.I0000Il00O = new AtomicLong(-1L);
/* 59 */                    VarHandle.storeStoreFence();
/* 62 */                    return o0looio;
                        case 2:
/* 24 */                    o10IIIO1Ilio o10iiio1ilio = new o10IIIO1Ilio();
/* 32 */                    o10iiio1ilio.I00000oIO = new AtomicBoolean();
/* 39 */                    o10iiio1ilio.I00000oOI = new AtomicInteger();
/* 41 */                    VarHandle.storeStoreFence();
/* 44 */                    return o10iiio1ilio;
                        default:
/* 8 */                     o10Oo010O o10oo010o = new o10Oo010O();
/* 16 */                    o10oo010o.I0000Il00O = new AtomicInteger();
/* 18 */                    VarHandle.storeStoreFence();
/* 21 */                    return o10oo010o;
                    }
                }
            }
