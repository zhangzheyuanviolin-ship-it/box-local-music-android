            package p000;

            import java.lang.invoke.VarHandle;
            
/* 10 */    public class OIlOl1 implements IIi0O1OOO1i0 {
                public static final String I00iiI = "S";
                public static final String I00iiO = "D";
                private final IIOoi0ooOoO I00iOIl;

                public OIlOl1() {
/* 9 */             this.I00iOIl = new IIOoi0ooOoO();
                }

                @Override
                public IIOoi0ooOoO I00Io1lO() {
/* 1 */             return this.I00iOIl;
                }

                public OIlOo1Oil0 I00000oOI() {
/* 1 */             IIOoi0ooOoO iIOoi0ooOoO = this.I00iOIl;
/* 3 */             IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I00ooiO1I;
/* 9 */             IIOoIilO iIOoIilO = (IIOoIilO) iIOoi0ooOoO.I00oII(iIi0I0I0o);
/* 11 */            if (iIOoIilO == null) {
/* 15 */                iIOoIilO = new IIOoIilO();
/* 18 */                IIOool iIOool = IIOool.I00iio;
/* 20 */                iIOoIilO.I00ioIO(iIOool);
/* 23 */                iIOoIilO.I00ioIO(iIOool);
/* 26 */                iIOoIilO.I00ioIO(iIOool);
/* 31 */                this.I00iOIl.I010iIIOlo(iIi0I0I0o, iIOoIilO);
                    }
/* 42 */            return new OIlOo1Oil0(iIOoIilO.I00oo1iO0ll(), OIliI1oooi.I00iiI);
                }

                public String I0000Il00O() {
/* 5 */             String strI010101Oo1lO = this.I00iOIl.I010101Oo1lO(IIi0I0I0o.I0IIOlio);
                    return strI010101Oo1lO == null ? I00iiI : strI010101Oo1lO;
                }

                public float I0000O() {
/* 7 */             return this.I00iOIl.I00ooiO1I(IIi0I0I0o.I0IlIoI1oi0, 1.0f);
                }

                public OIlll1 I0000oI00() {
/* 1 */             IIOoi0ooOoO iIOoi0ooOoO = this.I00iOIl;
/* 3 */             IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I011iO;
/* 9 */             IIOoIilO iIOoIilO = (IIOoIilO) iIOoi0ooOoO.I00oII(iIi0I0I0o);
/* 11 */            if (iIOoIilO == null) {
/* 15 */                iIOoIilO = new IIOoIilO();
/* 20 */                iIOoIilO.I00ioIO(IIOool.I00ilI0I1);
/* 25 */                this.I00iOIl.I010iIIOlo(iIi0I0I0o, iIOoIilO);
                    }
/* 30 */            IIOoIilO iIOoIilO2 = new IIOoIilO();
/* 33 */            iIOoIilO2.I00ioIO(iIOoIilO);
/* 38 */            OIlll1 oIlll1 = new OIlll1();
/* 45 */            oIlll1.I00iiI = iIOoIilO2.I00oo1iO0ll();
/* 48 */            oIlll1.I00iOIl = 0;
/* 50 */            VarHandle.storeStoreFence();
/* 113 */           return oIlll1;
                }

                public void I0001Ioi1lo(OIlOo1Oil0 oIlOo1Oil0) {
                    IIOoIilO iIOoIilO;
/* 1 */             if (oIlOo1Oil0 != null) {
/* 5 */                 iIOoIilO = new IIOoIilO();
/* 8 */                 float[] fArr = oIlOo1Oil0.I00000oIO;
/* 12 */                iIOoIilO.I00iOIl.clear();
/* 17 */                for (float f : fArr) {
/* 26 */                    iIOoIilO.I00ioIO(new IIOolo0l(f));
                        }
                    } else {
/* 32 */                iIOoIilO = null;
                    }
/* 37 */            this.I00iOIl.I010iIIOlo(IIi0I0I0o.I00ooiO1I, iIOoIilO);
                }

                public void I000II(String str) {
/* 5 */             this.I00iOIl.I010l10O(IIi0I0I0o.I0IIOlio, str);
                }

                public void I000O01llI0(float f) {
/* 5 */             this.I00iOIl.I010OIo1l(IIi0I0I0o.I0IlIoI1oi0, f);
                }

                public void I000OOo1O(IIOoIilO iIOoIilO) {
/* 1 */             if (iIOoIilO == null) {
/* 4 */                 iIOoIilO = null;
                    }
/* 9 */             this.I00iOIl.I010iIIOlo(IIi0I0I0o.I011iO, iIOoIilO);
                }

/* 11 */        public OIlOl1(IIOoi0ooOoO iIOoi0ooOoO) {
/* 13 */            this.I00iOIl = iIOoi0ooOoO;
                }
            }
