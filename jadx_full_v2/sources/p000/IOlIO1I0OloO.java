            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.util.List;
            
            public final class IOlIO1I0OloO implements OIiOolI1lio, Ii00ilI1 {
                public static final Io1Oioii1111 I00iiI = new Io1Oioii1111(10);
                public IloI0lOlll1 I00iOIl;

                public final void I00000oIO(Object obj, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 4 */             IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(2);
/* 7 */             iO1Io1IOOOIi.I00iiI = this;
/* 9 */             iO1Io1IOOOIi.I00iiO = obj;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            iilIio.I00000oIO(th, iO1Io1IOOOIi);
                }

                @Override
                public final List I000l1(Integer num) {
/* 3 */             return this.I00iOIl.I00IlilI0i0i();
                }

                @Override
                public final boolean I00111O() {
/* 3 */             return this.I00iOIl.I001lloI;
                }

                @Override
                public final Object I00IoiI(IlliIl1l11O illiIl1l11O, Object obj) {
/* 1 */             return illiIl1l11O.invoke(obj, this);
                }

                @Override
                public final Ii00l101O I00OIl(Ii00l0i1loO ii00l0i1loO) {
/* 1 */             return iioloI1O1i.I00000oOI(this, ii00l0i1loO);
                }

                @Override
                public final Ii00l101O I00ioIO(Ii00l101O ii00l101O) {
/* 1 */             return iiollilo0IO1.I00000oIO(this, ii00l101O);
                }

                @Override
                public final Ii00ilI1 I00lli11(Ii00l0i1loO ii00l0i1loO) {
/* 1 */             return iioloI1O1i.I00000oIO(this, ii00l0i1loO);
                }

                @Override
                public final Ii00l0i1loO getKey() {
/* 1 */             return I00iiI;
                }
            }
