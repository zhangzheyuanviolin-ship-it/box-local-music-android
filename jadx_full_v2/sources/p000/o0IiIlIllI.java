            package p000;

            import android.os.StrictMode;
            import java.lang.invoke.VarHandle;
            import java.security.SecureRandom;
            import java.util.UUID;
            import java.util.concurrent.atomic.AtomicLong;
            
            public final class o0IiIlIllI {
                public static final o0IiIlIllI I0000Il00O;
                public UUID I00000oIO;
                public AtomicLong I00000oOI;

                static {
/* 1 */             StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
/* 7 */                 UUID uuidRandomUUID = UUID.randomUUID();
/* 16 */                long jNextLong = new SecureRandom().nextLong();
/* 20 */                o0IiIlIllI o0iiililli = new o0IiIlIllI();
/* 23 */                o0iiililli.I00000oIO = uuidRandomUUID;
/* 43 */                o0iiililli.I00000oOI = new AtomicLong((jNextLong ^ 25214903917L) & 281474976710655L);
/* 45 */                VarHandle.storeStoreFence();
/* 48 */                I0000Il00O = o0iiililli;
                    } finally {
/* 55 */                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }

                public final long I00000oIO() {
                    AtomicLong atomicLong;
                    long j;
/* 30 */            do {
/* 1 */                 atomicLong = this.I00000oOI;
/* 3 */                 j = atomicLong.get();
/* 30 */            } while (!atomicLong.compareAndSet(j, ((25214903917L * (((j * 25214903917L) + 11) & 281474976710655L)) + 11) & 281474976710655L));
/* 45 */            return (((int) (r5 >>> 16)) << 32) + ((int) (r3 >>> 16));
                }

                public final UUID I00000oOI() {
/* 8 */             long jI00000oIO = I00000oIO() & (-61441);
/* 14 */            long jI00000oIO2 = I00000oIO() >>> 2;
/* 15 */            UUID uuid = this.I00000oIO;
/* 29 */            return new UUID(jI00000oIO ^ uuid.getMostSignificantBits(), jI00000oIO2 ^ uuid.getLeastSignificantBits());
                }
            }
