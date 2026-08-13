            package p000;

            import java.util.Map;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class IOollI1oO {
                private volatile Object current = Il011I1OiO0I.I00iOIl;

                static {
/* 7 */             AtomicReferenceFieldUpdater.newUpdater(IOollI1oO.class, Object.class, "current");
                }

                public final Object I00000oIO(Object obj) {
/* 5 */             return ((Map) this.current).get(obj);
                }
            }
