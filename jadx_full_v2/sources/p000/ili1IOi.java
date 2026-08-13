            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class ili1IOi extends lio0Oolo1li1 {
                public AtomicReferenceFieldUpdater I00000oIO;
                public AtomicReferenceFieldUpdater I00000oOI;
                public AtomicReferenceFieldUpdater I0000Il00O;
                public AtomicReferenceFieldUpdater I0000O;
                public AtomicReferenceFieldUpdater I0000oI00;

                @Override
                public final ili1II I00000oIO(iliIlI0o00ii iliili0o00ii) {
/* 9 */             return (ili1II) this.I0000O.getAndSet(iliili0o00ii, ili1II.I0000O);
                }

                @Override
                public final ili1iI1O0lIl I00000oOI(iliIlI0o00ii iliili0o00ii) {
/* 9 */             return (ili1iI1O0lIl) this.I0000Il00O.getAndSet(iliili0o00ii, ili1iI1O0lIl.I0000Il00O);
                }

                @Override
                public final void I0000Il00O(ili1iI1O0lIl ili1ii1o0lil, ili1iI1O0lIl ili1ii1o0lil2) {
/* 3 */             this.I00000oOI.lazySet(ili1ii1o0lil, ili1ii1o0lil2);
                }

                @Override
                public final void I0000O(ili1iI1O0lIl ili1ii1o0lil, Thread thread) {
/* 3 */             this.I00000oIO.lazySet(ili1ii1o0lil, thread);
                }

                @Override
                public final boolean I0000oI00(iliIlI0o00ii iliili0o00ii, ili1II ili1ii, ili1II ili1ii2) {
/* 1 */             AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.I0000O;
/* 7 */             while (!atomicReferenceFieldUpdater.compareAndSet(iliili0o00ii, ili1ii, ili1ii2)) {
/* 15 */                if (atomicReferenceFieldUpdater.get(iliili0o00ii) != ili1ii) {
/* 17 */                    return false;
                        }
                    }
/* 9 */             return true;
                }

                @Override
                public final boolean I0001Ioi1lo(iliIlI0o00ii iliili0o00ii, Object obj, Object obj2) {
/* 1 */             AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.I0000oI00;
/* 7 */             while (!atomicReferenceFieldUpdater.compareAndSet(iliili0o00ii, obj, obj2)) {
/* 15 */                if (atomicReferenceFieldUpdater.get(iliili0o00ii) != obj) {
/* 17 */                    return false;
                        }
                    }
/* 9 */             return true;
                }

                @Override
                public final boolean I000II(iliIlI0o00ii iliili0o00ii, ili1iI1O0lIl ili1ii1o0lil, ili1iI1O0lIl ili1ii1o0lil2) {
/* 1 */             AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.I0000Il00O;
/* 7 */             while (!atomicReferenceFieldUpdater.compareAndSet(iliili0o00ii, ili1ii1o0lil, ili1ii1o0lil2)) {
/* 15 */                if (atomicReferenceFieldUpdater.get(iliili0o00ii) != ili1ii1o0lil) {
/* 17 */                    return false;
                        }
                    }
/* 9 */             return true;
                }
            }
