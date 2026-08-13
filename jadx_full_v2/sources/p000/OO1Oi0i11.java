            package p000;

            import java.util.Random;
            import java.util.concurrent.ThreadLocalRandom;
            
            public final class OO1Oi0i11 extends I01Io1ilOIIo {
                @Override
                public final long I00000oOI() {
/* 7 */             return ThreadLocalRandom.current().nextLong(1000L);
                }

                @Override
                public final long I0000Il00O() {
/* 9 */             return ThreadLocalRandom.current().nextLong(0L, 1000L);
                }

                @Override
                public final Random I0000O() {
/* 1 */             return ThreadLocalRandom.current();
                }
            }
