            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class Ii00lIOoi extends I010I0 implements Ii00ilI1 {
                public Ii00lIOoi() {
/* 3 */             super(o0iOli.I00iiO);
                }

                @Override
                public final Ii00l101O I00OIl(Ii00l0i1loO ii00l0i1loO) {
/* 3 */             if (!(ii00l0i1loO instanceof I010II)) {
                        return o0iOli.I00iiO == ii00l0i1loO ? Il00o11.I00iOIl : this;
                    }
/* 9 */             if (this.I00iOIl != ((I010II) ii00l0i1loO)) {
/* 11 */                return this;
                    }
/* 13 */            throw null;
                }

                public abstract void I00iOIl(Ii00l101O ii00l101O, Runnable runnable);

                @Override
                public final Ii00ilI1 I00lli11(Ii00l0i1loO ii00l0i1loO) {
/* 4 */             if (!(ii00l0i1loO instanceof I010II)) {
/* 16 */                if (o0iOli.I00iiO == ii00l0i1loO) {
/* 18 */                    return this;
                        }
/* 3 */                 return null;
                    }
/* 10 */            if (this.I00iOIl != ((I010II) ii00l0i1loO)) {
/* 3 */                 return null;
                    }
/* 13 */            throw null;
                }

                public void I00oliIiO01i(Ii00l101O ii00l101O, Runnable runnable) throws IiiI1OOll0l1 {
/* 1 */             IiiIIO0IO.I00000oOI(this, ii00l101O, runnable);
                }

                public boolean I00oo1iO0ll(Ii00l101O ii00l101O) {
/* 3 */             return !(this instanceof OoiI00ill);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Ii00lIOoi I00ooIo0(int i) {
/* 1 */             l10OI0.I00000oIO(i);
/* 6 */             O0olI0 o0olI0 = new O0olI0();
/* 17 */            IiIiOllooO iiIiOllooO = this instanceof IiIiOllooO ? (IiIiOllooO) this : null;
/* 18 */            if (iiIiOllooO == null) {
/* 20 */                iiIiOllooO = Ii1o1OoolI.I00000oIO;
                    }
/* 22 */            o0olI0.I00iiI = iiIiOllooO;
/* 24 */            o0olI0.I00iiO = this;
/* 26 */            o0olI0.I00iio = i;
/* 33 */            o0olI0.I00ilI0I1 = new O1I0iI0001();
/* 40 */            o0olI0.I00ilO0 = new Object();
/* 42 */            VarHandle.storeStoreFence();
/* 49 */            return o0olI0;
                }

                public String toString() {
/* 26 */            return getClass().getSimpleName() + '@' + Ii1Oo1l.I00000oIO(this);
                }
            }
