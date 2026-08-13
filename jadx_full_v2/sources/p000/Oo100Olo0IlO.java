            package p000;
            
            public final class Oo100Olo0IlO implements Oo0ooO0ll0 {
                public Object I00iOIl;
                public ThreadLocal I00iiI;
                public Oo1011O00 I00iiO;

                @Override
                public final Object I00IoiI(IlliIl1l11O illiIl1l11O, Object obj) {
/* 1 */             return illiIl1l11O.invoke(obj, this);
                }

                @Override
                public final Ii00l101O I00OIl(Ii00l0i1loO ii00l0i1loO) {
                    return O0000Ioio00.I0000O(this.I00iiO, ii00l0i1loO) ? Il00o11.I00iOIl : this;
                }

                @Override
                public final Object I00Ol00() {
/* 1 */             ThreadLocal threadLocal = this.I00iiI;
/* 3 */             Object obj = threadLocal.get();
/* 9 */             threadLocal.set(this.I00iOIl);
/* 20 */            return obj;
                }

                @Override
                public final Ii00l101O I00ioIO(Ii00l101O ii00l101O) {
/* 1 */             return iiollilo0IO1.I00000oIO(this, ii00l101O);
                }

                @Override
                public final Ii00ilI1 I00lli11(Ii00l0i1loO ii00l0i1loO) {
/* 7 */             if (O0000Ioio00.I0000O(this.I00iiO, ii00l0i1loO)) {
/* 9 */                 return this;
                    }
/* 10 */            return null;
                }

                @Override
                public final void I00lll10(Object obj) {
/* 3 */             this.I00iiI.set(obj);
                }

                @Override
                public final Ii00l0i1loO getKey() {
/* 1 */             return this.I00iiO;
                }

                public final String toString() {
/* 28 */            return "ThreadLocal(value=" + this.I00iOIl + ", threadLocal = " + this.I00iiI + ')';
                }
            }
