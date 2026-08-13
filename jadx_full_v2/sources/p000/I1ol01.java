            package p000;

            import java.util.concurrent.atomic.AtomicLong;
            
            public final class I1ol01 implements IllOOo00lI {
                public final int I00iOIl;
                public Oiio1oll000 I00iiI;

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             Oiio1oll000 oiio1oll000 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 30 */                    AtomicLong atomicLong = oiio1oll000.I0000O;
/* 32 */                    long andIncrement = atomicLong.getAndIncrement();
/* 38 */                    while (andIncrement == 0) {
/* 40 */                        andIncrement = atomicLong.getAndIncrement();
                            }
/* 45 */                    return Long.valueOf(andIncrement);
                        default:
/* 10 */                    AtomicLong atomicLong2 = oiio1oll000.I0000O;
/* 12 */                    long andIncrement2 = atomicLong2.getAndIncrement();
/* 18 */                    while (andIncrement2 == 0) {
/* 20 */                        andIncrement2 = atomicLong2.getAndIncrement();
                            }
/* 25 */                    return Long.valueOf(andIncrement2);
                    }
                }
            }
