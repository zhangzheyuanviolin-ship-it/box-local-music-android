            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.HashSet;
            import java.util.Iterator;
            
            public final class OIlo1Ioo implements IIi0O1OOO1i0, Iterable {
                public IIOoi0ooOoO I00iOIl;
                public OIliOo11 I00iiI;

                public static IIOoOiOI I00000oOI(IIi0I0I0o iIi0I0I0o, IIOoi0ooOoO iIOoi0ooOoO) {
/* 1 */             IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoO.I00oII(iIi0I0I0o);
/* 5 */             if (iIOoOiOII00oII != null) {
/* 7 */                 return iIOoOiOII00oII;
                    }
/* 12 */            IIOoOiOI iIOoOiOII00oliIiO01i = iIOoi0ooOoO.I00oliIiO01i(IIi0I0I0o.I0I1IlI1, IIi0I0I0o.I0I10lio10);
/* 18 */            if (!(iIOoOiOII00oliIiO01i instanceof IIOoi0ooOoO)) {
/* 41 */                return null;
                    }
/* 20 */            IIOoi0ooOoO iIOoi0ooOoO2 = (IIOoi0ooOoO) iIOoOiOII00oliIiO01i;
/* 34 */            if (IIi0I0I0o.I0I11O000oO.equals(iIOoi0ooOoO2.I00oII(IIi0I0I0o.I0IilI00l))) {
/* 36 */                return I00000oOI(iIi0I0I0o, iIOoi0ooOoO2);
                    }
/* 41 */            return null;
                }

                @Override
                public final IIOoOiOI I00Io1lO() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final Iterator iterator() {
/* 3 */             IIOoi0ooOoO iIOoi0ooOoO = this.I00iOIl;
/* 6 */             OIlo1IOiO0i oIlo1IOiO0i = new OIlo1IOiO0i(0);
/* 9 */             oIlo1IOiO0i.I00iio = this;
/* 16 */            oIlo1IOiO0i.I00iiI = new ArrayDeque();
/* 23 */            oIlo1IOiO0i.I00iiO = new HashSet();
/* 25 */            oIlo1IOiO0i.I00000oIO(iIOoi0ooOoO);
/* 29 */            oIlo1IOiO0i.I00iiO = null;
/* 31 */            VarHandle.storeStoreFence();
/* 113 */           return oIlo1IOiO0i;
                }
            }
