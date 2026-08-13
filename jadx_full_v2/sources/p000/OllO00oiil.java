            package p000;

            import java.io.Serializable;
            
            public final class OllO00oiil implements O0ioIllo0i1, Serializable {
                public IllOOo00lI I00iOIl;
                public volatile Object I00iiI = lo1iloiI1.I00l0I0l0lO1;
                public final Object I00iiO = this;

                public OllO00oiil(IllOOo00lI illOOo00lI) {
/* 4 */             this.I00iOIl = illOOo00lI;
                }

                @Override
                public final boolean I00000oOI() {
                    return this.I00iiI != lo1iloiI1.I00l0I0l0lO1;
                }

                @Override
                public final Object getValue() {
                    Object objInvoke;
/* 1 */             Object obj = this.I00iiI;
/* 3 */             lo1iloiI1 lo1iloii1 = lo1iloiI1.I00l0I0l0lO1;
/* 5 */             if (obj != lo1iloii1) {
/* 7 */                 return obj;
                    }
                    synchronized (this.I00iiO) {
/* 11 */                objInvoke = this.I00iiI;
/* 13 */                if (objInvoke == lo1iloii1) {
/* 18 */                    objInvoke = this.I00iOIl.invoke();
/* 22 */                    this.I00iiI = objInvoke;
/* 25 */                    this.I00iOIl = null;
                        }
                    }
/* 28 */            return objInvoke;
                }

                public final String toString() {
                    return I00000oOI() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
                }
            }
