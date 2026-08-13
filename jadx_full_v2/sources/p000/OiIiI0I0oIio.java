            package p000;

            import java.io.Serializable;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class OiIiI0I0oIio implements O0ioIllo0i1, Serializable {
                public static final AtomicReferenceFieldUpdater I00iiO = AtomicReferenceFieldUpdater.newUpdater(OiIiI0I0oIio.class, Object.class, "I00iiI");
                public volatile IllOOo00lI I00iOIl;
                public volatile Object I00iiI;

                @Override
                public final boolean I00000oOI() {
                    return this.I00iiI != lo1iloiI1.I00l0I0l0lO1;
                }

                @Override
                public final Object getValue() {
/* 1 */             Object obj = this.I00iiI;
/* 3 */             lo1iloiI1 lo1iloii1 = lo1iloiI1.I00l0I0l0lO1;
/* 5 */             if (obj != lo1iloii1) {
/* 7 */                 return obj;
                    }
/* 8 */             IllOOo00lI illOOo00lI = this.I00iOIl;
/* 10 */            if (illOOo00lI != null) {
/* 12 */                Object objInvoke = illOOo00lI.invoke();
/* 22 */                if (I00iiO.compareAndSet(this, lo1iloii1, objInvoke)) {
/* 25 */                    this.I00iOIl = null;
/* 27 */                    return objInvoke;
                        }
                    }
/* 28 */            return this.I00iiI;
                }

                public final String toString() {
                    return I00000oOI() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
                }
            }
