            package p000;

            import android.os.SystemClock;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.concurrent.atomic.AtomicLong;
            
            public final class li1Io1I1li {
                public i0i01Ii0iII I00000oIO;
                public AtomicLong I00000oOI;

                public final synchronized void I00000oIO(int i, int i2, long j, long j2) {
/* 4 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 18 */            if (this.I00000oOI.get() != -1 && jElapsedRealtime - this.I00000oOI.get() <= 1800000) {
/* 37 */                return;
                    }
/* 73 */            o0IiOl o0iiolI0000Il00O = this.I00000oIO.I0000Il00O(new OloOI1o(0, Arrays.asList(new O1lli10oolO(i, i2, 0, j, j2, null, null, 0, -1))));
/* 80 */            Io1OIO1l0o io1OIO1l0o = new Io1OIO1l0o(4);
/* 83 */            io1OIO1l0o.I00iiO = this;
/* 85 */            io1OIO1l0o.I00iiI = jElapsedRealtime;
/* 87 */            VarHandle.storeStoreFence();
/* 90 */            o0iiolI0000Il00O.I0000Il00O(io1OIO1l0o);
                }
            }
