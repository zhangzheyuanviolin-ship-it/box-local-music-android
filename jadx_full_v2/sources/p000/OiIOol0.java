            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
/* 7 */     public final class OiIOol0 implements IOoil1iiIilo, Ii011lOOlI1 {
                public static final AtomicReferenceFieldUpdater I00iiI = AtomicReferenceFieldUpdater.newUpdater(OiIOol0.class, Object.class, "result");
                public final IOoil1iiIilo I00iOIl;
                private volatile Object result;

                public OiIOol0(IOoil1iiIilo iOoil1iiIilo, Object obj) {
/* 4 */             this.I00iOIl = iOoil1iiIilo;
/* 6 */             this.result = obj;
                }

                public final Object I00000oIO() throws Throwable {
/* 1 */             Object obj = this.result;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iiI;
/* 5 */             if (obj == ii0111o) {
/* 7 */                 AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I00iiI;
/* 9 */                 Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 15 */                if (atomicReferenceFieldUpdater.compareAndSet(this, ii0111o, ii0111o2)) {
/* 17 */                    return ii0111o2;
                        }
/* 18 */                obj = this.result;
                    }
/* 22 */            if (obj == Ii0111o.I00iiO) {
/* 24 */                return Ii0111o.I00iOIl;
                    }
/* 29 */            if (obj instanceof Oi10Ii1i1lo) {
/* 113 */               throw ((Oi10Ii1i1lo) obj).I00iOIl;
                    }
/* 31 */            return obj;
                }

                @Override
                public final Ii011lOOlI1 getCallerFrame() {
/* 1 */             IOoil1iiIilo iOoil1iiIilo = this.I00iOIl;
/* 5 */             if (iOoil1iiIilo instanceof Ii011lOOlI1) {
/* 7 */                 return (Ii011lOOlI1) iOoil1iiIilo;
                    }
/* 10 */            return null;
                }

                @Override
                public final Ii00l101O getContext() {
/* 3 */             return this.I00iOIl.getContext();
                }

                @Override
                public final void resumeWith(Object obj) {
/* 1 */             AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I00iiI;
                    while (true) {
/* 3 */                 Object obj2 = this.result;
/* 5 */                 Ii0111o ii0111o = Ii0111o.I00iiI;
/* 7 */                 if (obj2 != ii0111o) {
/* 16 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 18 */                    if (obj2 != ii0111o2) {
/* 36 */                        I000II.I001IO000("Already resumed");
/* 49 */                        return;
                            } else if (atomicReferenceFieldUpdater.compareAndSet(this, ii0111o2, Ii0111o.I00iiO)) {
/* 30 */                        this.I00iOIl.resumeWith(obj);
/* 33 */                        return;
                            }
                        } else if (atomicReferenceFieldUpdater.compareAndSet(this, ii0111o, obj)) {
/* 15 */                    return;
                        }
                    }
                }

                public final String toString() {
/* 13 */            return "SafeContinuation for " + this.I00iOIl;
                }

/* 8 */         public OiIOol0(IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             this(iOoil1iiIilo, Ii0111o.I00iiI);
                }
            }
