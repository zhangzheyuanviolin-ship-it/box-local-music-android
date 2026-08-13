            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public class OIllo101O {
                private final String I00000oIO;
                private final IIOoi0ooOoO I00000oOI;
                private final List<Object> I0000Il00O;

                public OIllo101O(IIi0I0I0o iIi0I0I0o, IIOoi0ooOoO iIOoi0ooOoO) {
/* 10 */            this.I00000oIO = iIi0I0I0o == null ? null : iIi0I0I0o.I00iOIl;
/* 12 */            this.I00000oOI = iIOoi0ooOoO;
/* 19 */            this.I0000Il00O = new ArrayList();
                }

                public static OIllo101O I0000O(IIi0I0I0o iIi0I0I0o, IIOoi0ooOoO iIOoi0ooOoO) {
                    return IIi0I0I0o.I00ll1.equals(iIi0I0I0o) ? new OIlOi0l0llI(iIOoi0ooOoO) : new OIllo101O(iIi0I0I0o, iIOoi0ooOoO);
                }

                public void I00000oIO(OIllo101O oIllo101O) {
/* 5 */             I000II().add(oIllo101O);
                }

                public void I00000oOI(Oo0l0OoolI0 oo0l0OoolI0) {
/* 5 */             I000II().add(oo0l0OoolI0);
                }

                public void I0000Il00O(OIo0OoioI0oI oIo0OoioI0oI) {
/* 5 */             I000II().add(oIo0OoioI0oI);
                }

                public String I0000oI00() {
/* 5 */             if (I000iOII() == null) {
/* 7 */                 return null;
                    }
/* 15 */            return I000iOII().I010I0(IIi0I0I0o.I00ilO0);
                }

                public String I0001Ioi1lo() {
/* 5 */             if (I000iOII() == null) {
/* 7 */                 return null;
                    }
/* 15 */            return I000iOII().I010I0(IIi0I0I0o.I00l0OO0IO);
                }

                public List<Object> I000II() {
/* 1 */             return this.I0000Il00O;
                }

                public String I000O01llI0() {
/* 5 */             if (I000iOII() == null) {
/* 7 */                 return null;
                    }
/* 15 */            return I000iOII().I010I0(IIi0I0I0o.I01Io1ilOIIo);
                }

                public String I000OOo1O() {
/* 5 */             if (I000iOII() == null) {
/* 7 */                 return null;
                    }
/* 15 */            return I000iOII().I010101Oo1lO(IIi0I0I0o.I01loIooI);
                }

                public int I000OiO() {
/* 6 */             if (I000iOII() == null) {
/* 5 */                 return -1;
                    }
/* 16 */            return I000iOII().I00oooO(IIi0I0I0o.I01ol1I0ol1, null, -1);
                }

                public IIOoi0ooOoO I000iOII() {
/* 1 */             return this.I00000oOI;
                }

                public String I000l1() {
/* 1 */             return this.I00000oIO;
                }

                public String toString() {
/* 33 */            return "tag=" + this.I00000oIO + ", properties=" + this.I00000oOI + ", contents=" + this.I0000Il00O;
                }
            }
