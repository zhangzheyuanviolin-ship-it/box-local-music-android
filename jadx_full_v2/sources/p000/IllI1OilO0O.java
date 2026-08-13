            package p000;

            import java.util.Iterator;
            
            public final class IllI1OilO0O implements AutoCloseable {
                public Object I00iOIl;
                public I1Il0loi I00iiI;
                public boolean I00iiO;

                public final void I00000oIO() {
                    synchronized (this.I00iOIl) {
                        try {
/* 6 */                     if (this.I00iiO) {
/* 9 */                         return;
                            }
/* 12 */                    Iterator it = this.I00iiI.iterator();
/* 20 */                    if (it.hasNext()) {
/* 28 */                        if (it.next() != null) {
/* 39 */                            throw new ClassCastException();
                                }
/* 31 */                        throw null;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @Override
                public final void close() {
                    synchronized (this.I00iOIl) {
/* 6 */                 if (this.I00iiO) {
/* 9 */                     return;
                        }
/* 11 */                this.I00iiO = true;
/* 16 */                Iterator<E> it = this.I00iiI.iterator();
/* 24 */                if (it.hasNext()) {
/* 36 */                    throw IIlIOloOOO.I000lI(it);
                        }
/* 28 */                this.I00iiI.clear();
                    }
                }
            }
