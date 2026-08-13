            package p000;

            import android.os.StrictMode;
            import java.lang.invoke.VarHandle;
            import java.security.SecureRandom;
            import java.util.UUID;
            import java.util.concurrent.atomic.AtomicLong;
            
            public final class iIloilO00io {
                public static final iIloilO00io I0000Il00O;
                public UUID I00000oIO;
                public AtomicLong I00000oOI;

                static {
/* 1 */             StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
/* 7 */                 UUID uuidRandomUUID = UUID.randomUUID();
/* 16 */                long jNextLong = new SecureRandom().nextLong();
/* 20 */                iIloilO00io iiloilo00io = new iIloilO00io();
/* 23 */                iiloilo00io.I00000oIO = uuidRandomUUID;
/* 43 */                iiloilo00io.I00000oOI = new AtomicLong((jNextLong ^ 25214903917L) & 281474976710655L);
/* 45 */                VarHandle.storeStoreFence();
/* 48 */                I0000Il00O = iiloilo00io;
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
            }
