            package p000;

            import java.util.Set;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class I0ii0I010ioo extends iOIi0iO1OI1I {
                public static final AtomicReferenceFieldUpdater I00000oIO = AtomicReferenceFieldUpdater.newUpdater(I0ii1I1ii.class, Set.class, "I00ioIO");
                public static final AtomicIntegerFieldUpdater I00000oOI = AtomicIntegerFieldUpdater.newUpdater(I0ii1I1ii.class, "I00l0I0l0lO1");

                @Override
                public final void I00000oIO(IOOoo0o0Io iOOoo0o0Io, Set set) {
/* 4 */             I00000oIO.compareAndSet(iOOoo0o0Io, null, set);
                }

                @Override
                public final int I00000oOI(IOOoo0o0Io iOOoo0o0Io) {
/* 3 */             return I00000oOI.decrementAndGet(iOOoo0o0Io);
                }
            }
