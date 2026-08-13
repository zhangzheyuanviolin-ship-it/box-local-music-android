            package p000;

            import java.io.Serializable;
            
            public final class Ooiil01I00 implements O0ioIllo0i1, Serializable {
                public IllOOo00lI I00iOIl;
                public Object I00iiI;

                @Override
                public final boolean I00000oOI() {
                    return this.I00iiI != lo1iloiI1.I00l0I0l0lO1;
                }

                @Override
                public final Object getValue() {
/* 1 */             Object obj = this.I00iiI;
/* 5 */             if (obj != lo1iloiI1.I00l0I0l0lO1) {
/* 29 */                return obj;
                    }
/* 9 */             Object objInvoke = this.I00iOIl.invoke();
/* 13 */            this.I00iiI = objInvoke;
/* 16 */            this.I00iOIl = null;
/* 29 */            return objInvoke;
                }

                public final String toString() {
                    return I00000oOI() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
                }
            }
