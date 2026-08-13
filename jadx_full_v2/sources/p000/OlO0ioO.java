            package p000;

            import java.util.concurrent.atomic.AtomicReference;
            
            public final class OlO0ioO extends I01i000i0iI {
                public AtomicReference I00000oIO;

                @Override
                public final boolean I00000oIO(I01OooO0o0o i01OooO0o0o) {
/* 3 */             AtomicReference atomicReference = this.I00000oIO;
/* 9 */             if (atomicReference.get() != null) {
/* 11 */                return false;
                    }
/* 15 */            atomicReference.set(OlO0iOl0il.I00000oIO);
/* 18 */            return true;
                }

                @Override
                public final IOoil1iiIilo[] I00000oOI(I01OooO0o0o i01OooO0o0o) {
/* 6 */             this.I00000oIO.set(null);
/* 9 */             return I1O11ll000.I00000oIO;
                }
            }
