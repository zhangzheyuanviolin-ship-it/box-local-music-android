            package p000;

            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class OI11IlOoi {
                public final AtomicReference I00000oIO = new AtomicReference(null);
                public final OI1I0OoOl I00000oOI = new OI1I0OoOl();

                public final void I00000oIO(OI111O oi111o) {
                    AtomicReference atomicReference;
                    OI111O oi111o2;
/* 34 */            do {
/* 1 */                 atomicReference = this.I00000oIO;
/* 7 */                 oi111o2 = (OI111O) atomicReference.get();
/* 9 */                 if (oi111o2 != null && oi111o.I00000oIO.compareTo(oi111o2.I00000oIO) < 0) {
/* 29 */                    throw new CancellationException("Current mutation had a higher priority");
                        }
/* 34 */            } while (!atomicReference.compareAndSet(oi111o2, oi111o));
/* 36 */            if (oi111o2 != null) {
/* 48 */                oi111o2.I00000oOI.I000II(new IlOO00ooliO("Mutation interrupted", 0));
                    }
                }
            }
