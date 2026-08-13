            package p000;

            import java.io.ByteArrayInputStream;
            import java.io.InputStream;
            import java.io.SequenceInputStream;
            import java.util.ArrayList;
            import java.util.Collections;
            
            public final class OIlo0iIOiOI implements IIi0O1OOO1i0, OIlOoO {
                public IIOoi0ooOoO I00iOIl;
                public OIloii I00iiI;
                public IoIlOo1o0IIl I00iiO;
                public OIloOoil011l I00iio;

                public OIlo0iIOiOI(IIOoi0ooOoO iIOoi0ooOoO) {
/* 4 */             this.I00iOIl = iIOoi0ooOoO;
                }

                @Override
                public final O1OoooIi1Ol0 I00000oIO() {
/* 3 */             return new O1OoooIi1Ol0();
                }

                @Override
                public final OIloOoil011l I00000oOI() {
/* 1 */             return I0000oI00();
                }

                @Override
                public final InputStream I0000Il00O() {
/* 5 */             IIOoOiOI iIOoOiOII00oII = this.I00iOIl.I00oII(IIi0I0I0o.I011IO1I11OI);
/* 11 */            if (iIOoOiOII00oII instanceof IIi0io1lIo) {
/* 15 */                return ((IIi0io1lIo) iIOoOiOII00oII).I010l1ol111();
                    }
/* 23 */            if (iIOoOiOII00oII instanceof IIOoIilO) {
/* 25 */                IIOoIilO iIOoIilO = (IIOoIilO) iIOoOiOII00oII;
/* 27 */                ArrayList arrayList = iIOoIilO.I00iOIl;
/* 33 */                if (arrayList.size() > 0) {
/* 36 */                    byte[] bArr = {10};
/* 44 */                    ArrayList arrayList2 = new ArrayList();
/* 51 */                    for (int i = 0; i < arrayList.size(); i++) {
/* 53 */                        IIOoOiOI iIOoOiOII00lll10 = iIOoIilO.I00lll10(i);
/* 59 */                        if (iIOoOiOII00lll10 instanceof IIi0io1lIo) {
/* 67 */                            arrayList2.add(((IIi0io1lIo) iIOoOiOII00lll10).I010l1ol111());
/* 75 */                            arrayList2.add(new ByteArrayInputStream(bArr));
                                }
                            }
/* 87 */                    return new SequenceInputStream(Collections.enumeration(arrayList2));
                        }
                    }
/* 95 */            return new ByteArrayInputStream(new byte[0]);
                }

                @Override
                public final OIloii I0000O() {
/* 3 */             if (this.I00iiI == null) {
/* 9 */                 IIOoOiOI iIOoOiOII00000oOI = OIlo1Ioo.I00000oOI(IIi0I0I0o.I0II0i00l, this.I00iOIl);
/* 15 */                if (iIOoOiOII00000oOI instanceof IIOoi0ooOoO) {
/* 26 */                    this.I00iiI = new OIloii((IIOoi0ooOoO) iIOoOiOII00000oOI, this.I00iiO);
                        }
                    }
/* 28 */            return this.I00iiI;
                }

                public final OIloOoil011l I0000oI00() {
/* 5 */             IIOoOiOI iIOoOiOII00000oOI = OIlo1Ioo.I00000oOI(IIi0I0I0o.I011Ol0, this.I00iOIl);
/* 11 */            if (!(iIOoOiOII00000oOI instanceof IIOoIilO)) {
/* 117 */               return I0001Ioi1lo();
                    }
/* 17 */            OIloOoil011l oIloOoil011l = new OIloOoil011l((IIOoIilO) iIOoOiOII00000oOI);
/* 20 */            OIloOoil011l oIloOoil011lI0001Ioi1lo = I0001Ioi1lo();
/* 27 */            OIloOoil011l oIloOoil011l2 = new OIloOoil011l(0.0f, 0.0f, 0.0f, 0.0f);
/* 44 */            IIOolo0l iIOolo0l = new IIOolo0l(Math.max(oIloOoil011lI0001Ioi1lo.I00000oIO(), oIloOoil011l.I00000oIO()));
/* 47 */            IIOoIilO iIOoIilO = oIloOoil011l2.I00iOIl;
/* 50 */            iIOoIilO.I00oliIiO01i(0, iIOolo0l);
/* 71 */            iIOoIilO.I00oliIiO01i(1, new IIOolo0l(Math.max(oIloOoil011lI0001Ioi1lo.I00000oOI(), oIloOoil011l.I00000oOI())));
/* 92 */            iIOoIilO.I00oliIiO01i(2, new IIOolo0l(Math.min(oIloOoil011lI0001Ioi1lo.I0000Il00O(), oIloOoil011l.I0000Il00O())));
/* 113 */           iIOoIilO.I00oliIiO01i(3, new IIOolo0l(Math.min(oIloOoil011lI0001Ioi1lo.I0000O(), oIloOoil011l.I0000O())));
/* 116 */           return oIloOoil011l2;
                }

                public final OIloOoil011l I0001Ioi1lo() {
/* 1 */             OIloOoil011l oIloOoil011l = this.I00iio;
/* 3 */             if (oIloOoil011l != null) {
/* 113 */               return oIloOoil011l;
                    }
/* 9 */             IIOoOiOI iIOoOiOII00000oOI = OIlo1Ioo.I00000oOI(IIi0I0I0o.I01olIOo10, this.I00iOIl);
/* 15 */            if (iIOoOiOII00000oOI instanceof IIOoIilO) {
/* 21 */                OIloOoil011l oIloOoil011l2 = new OIloOoil011l((IIOoIilO) iIOoOiOII00000oOI);
/* 24 */                this.I00iio = oIloOoil011l2;
/* 26 */                return oIloOoil011l2;
                    }
/* 27 */            OIloOoil011l oIloOoil011l3 = OIloOoil011l.I00iiI;
/* 29 */            this.I00iio = oIloOoil011l3;
/* 113 */           return oIloOoil011l3;
                }

                public final boolean I000II() {
/* 5 */             IIOoOiOI iIOoOiOII00oII = this.I00iOIl.I00oII(IIi0I0I0o.I011IO1I11OI);
                    return iIOoOiOII00oII instanceof IIi0io1lIo ? ((IIi0io1lIo) iIOoOiOII00oII).I00iOIl.size() > 0 : (iIOoOiOII00oII instanceof IIOoIilO) && ((IIOoIilO) iIOoOiOII00oII).I00iOIl.size() > 0;
                }

                @Override
                public final IIOoOiOI I00Io1lO() {
/* 1 */             return this.I00iOIl;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OIlo0iIOiOI) && ((OIlo0iIOiOI) obj).I00iOIl == this.I00iOIl;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }
            }
