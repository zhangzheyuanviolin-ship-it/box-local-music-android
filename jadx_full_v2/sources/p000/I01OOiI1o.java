            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class I01OOiI1o extends iOI0lO1ilo {
                public AtomicReferenceFieldUpdater I00000oIO;
                public AtomicReferenceFieldUpdater I00000oOI;
                public AtomicReferenceFieldUpdater I0000Il00O;
                public AtomicReferenceFieldUpdater I0000O;
                public AtomicReferenceFieldUpdater I0000oI00;

                @Override
                public final boolean I00000oIO(I01Ol1o0 i01Ol1o0, I01OOIlI i01OOIlI, I01OOIlI i01OOIlI2) {
/* 3 */             return this.I0000O.compareAndSet(i01Ol1o0, i01OOIlI, i01OOIlI2);
                }

                @Override
                public final boolean I00000oOI(I01Ol1o0 i01Ol1o0, Object obj, Object obj2) {
/* 3 */             return this.I0000oI00.compareAndSet(i01Ol1o0, obj, obj2);
                }

                @Override
                public final boolean I0000Il00O(I01Ol1o0 i01Ol1o0, I01OiO1OI i01OiO1OI, I01OiO1OI i01OiO1OI2) {
/* 3 */             return this.I0000Il00O.compareAndSet(i01Ol1o0, i01OiO1OI, i01OiO1OI2);
                }

                @Override
                public final void I0000O(I01OiO1OI i01OiO1OI, I01OiO1OI i01OiO1OI2) {
/* 3 */             this.I00000oOI.lazySet(i01OiO1OI, i01OiO1OI2);
                }

                @Override
                public final void I0000oI00(I01OiO1OI i01OiO1OI, Thread thread) {
/* 3 */             this.I00000oIO.lazySet(i01OiO1OI, thread);
                }
            }
