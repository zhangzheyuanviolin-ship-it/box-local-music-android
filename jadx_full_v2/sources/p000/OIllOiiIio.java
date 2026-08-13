            package p000;
            
/* 34 */    public class OIllOiiIio implements IIi0O1OOO1i0 {
                private final IIOoIilO I00iOIl;

                public OIllOiiIio(IIOoIilO iIOoIilO) {
/* 4 */             this.I00iOIl = iIOoIilO;
/* 13 */            if (iIOoIilO.I00iOIl.size() < 4) {
/* 23 */                for (int size = iIOoIilO.I00iOIl.size() - 1; size < 4; size++) {
/* 29 */                    this.I00iOIl.I00ioIO(IIi0II0l0o.I00iOIl);
                        }
                    }
                }

                private OIlli00oo I0000Il00O(int i) {
/* 3 */             IIOoOiOI iIOoOiOII00lll10 = this.I00iOIl.I00lll10(i);
/* 9 */             if (iIOoOiOII00lll10 instanceof IIOoIilO) {
/* 15 */                return new OIlli00oo((IIOoIilO) iIOoOiOII00lll10);
                    }
/* 19 */            return null;
                }

                private void I000O01llI0(int i, OIlli00oo oIlli00oo) {
/* 10 */            this.I00iOIl.I00oliIiO01i(i, oIlli00oo == null ? IIi0II0l0o.I00iOIl : oIlli00oo.I00iOIl);
                }

                public OIlli00oo I00000oIO() {
/* 2 */             return I0000Il00O(1);
                }

                public OIlli00oo I00000oOI() {
/* 2 */             return I0000Il00O(0);
                }

                public OIlli00oo I0000O() {
/* 2 */             return I0000Il00O(3);
                }

                public OIlli00oo I0000oI00() {
/* 2 */             return I0000Il00O(2);
                }

                public void I0001Ioi1lo(OIlli00oo oIlli00oo) {
/* 2 */             I000O01llI0(1, oIlli00oo);
                }

                public void I000II(OIlli00oo oIlli00oo) {
/* 2 */             I000O01llI0(0, oIlli00oo);
                }

                public void I000OOo1O(OIlli00oo oIlli00oo) {
/* 2 */             I000O01llI0(3, oIlli00oo);
                }

                public void I000OiO(OIlli00oo oIlli00oo) {
/* 2 */             I000O01llI0(2, oIlli00oo);
                }

                @Override
                public IIOoOiOI I00Io1lO() {
/* 1 */             return this.I00iOIl;
                }

/* 35 */        public OIllOiiIio() {
/* 37 */            IIOoIilO iIOoIilO = new IIOoIilO();
                    this.I00iOIl = iIOoIilO;
/* 38 */            IIi0II0l0o iIi0II0l0o = IIi0II0l0o.I00iOIl;
                    iIOoIilO.I00ioIO(iIi0II0l0o);
/* 39 */            iIOoIilO.I00ioIO(iIi0II0l0o);
/* 40 */            iIOoIilO.I00ioIO(iIi0II0l0o);
/* 41 */            iIOoIilO.I00ioIO(iIi0II0l0o);
                }
            }
