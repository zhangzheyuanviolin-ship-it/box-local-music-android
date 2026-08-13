            package p000;

            import java.io.InputStream;
            
            public class OIllIolIo extends OIo0OoioI0oI implements OIlOoO {
                public final IoIlOo1o0IIl I00iiI;

                public OIllIolIo(IIi0io1lIo iIi0io1lIo, IoIlOo1o0IIl ioIlOo1o0IIl) {
/* 3 */             super(iIi0io1lIo, IIi0I0I0o.I01iOOoiOI);
/* 6 */             this.I00iiI = ioIlOo1o0IIl;
                }

                @Override
                public final O1OoooIi1Ol0 I00000oIO() {
/* 13 */            return O1OoooIi1Ol0.I0000Il00O(((IIi0io1lIo) this.I00iOIl.I00iiI).I00oII(IIi0I0I0o.I01oiO0OI0));
                }

                @Override
                public final OIloOoil011l I00000oOI() {
/* 13 */            IIOoIilO iIOoIilO = (IIOoIilO) ((IIi0io1lIo) this.I00iOIl.I00iiI).I00oII(IIi0I0I0o.I00olI);
/* 15 */            if (iIOoIilO != null) {
/* 19 */                return new OIloOoil011l(iIOoIilO);
                    }
/* 23 */            return null;
                }

                @Override
                public final InputStream I0000Il00O() {
/* 7 */             return ((IIi0io1lIo) this.I00iOIl.I00iiI).I010l1ol111();
                }

                @Override
                public final OIloii I0000O() {
/* 1 */             OIllIlO1 oIllIlO1 = this.I00iOIl;
/* 5 */             IIi0io1lIo iIi0io1lIo = (IIi0io1lIo) oIllIlO1.I00iiI;
/* 7 */             IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I0II0i00l;
/* 9 */             IIOoi0ooOoO iIOoi0ooOoOI00lll10 = iIi0io1lIo.I00lll10(iIi0I0I0o);
/* 13 */            if (iIOoi0ooOoOI00lll10 != null) {
/* 19 */                return new OIloii(iIOoi0ooOoOI00lll10, this.I00iiI);
                    }
/* 33 */            if (((IIi0io1lIo) oIllIlO1.I00iiI).I00iOIl.containsKey(iIi0I0I0o)) {
/* 37 */                return new OIloii();
                    }
/* 41 */            return null;
                }
            }
