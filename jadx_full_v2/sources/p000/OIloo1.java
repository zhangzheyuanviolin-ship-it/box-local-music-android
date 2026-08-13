            package p000;

            import android.util.Log;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.Map;
            
/* 5 */     public class OIloo1 extends OIlololiOOOI {
                private static final String I00iiI = "StructTreeRoot";

                public OIloo1() {
/* 3 */             super(I00iiI);
                }

                public OIlloOi10 I00100o1O0lo() {
/* 7 */             IIOoOiOI iIOoOiOII00oII = I00Io1lO().I00oII(IIi0I0I0o.I01illiil1Oo);
/* 13 */            if (!(iIOoOiOII00oII instanceof IIOoi0ooOoO)) {
/* 28 */                return null;
                    }
/* 19 */            OIloloii oIloloii = new OIloloii();
/* 22 */            oIloloii.I00iOIl = (IIOoi0ooOoO) iIOoOiOII00oII;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            return oIloloii;
                }

                public IIOoOiOI I0010I0i() {
/* 7 */             return I00Io1lO().I00oII(IIi0I0I0o.I01ll0oooOoO);
                }

                @Deprecated
                public IIOoIilO I0010o() {
/* 1 */             IIOoi0ooOoO iIOoi0ooOoOI000II = I00Io1lO();
/* 5 */             IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I01ll0oooOoO;
/* 7 */             IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoOI000II.I00oII(iIi0I0I0o);
/* 13 */            if (!(iIOoOiOII00oII instanceof IIOoi0ooOoO)) {
/* 30 */                if (iIOoOiOII00oII instanceof IIOoIilO) {
/* 32 */                    return (IIOoIilO) iIOoOiOII00oII;
                        }
/* 35 */                return null;
                    }
/* 17 */            IIOoOiOI iIOoOiOII00oII2 = ((IIOoi0ooOoO) iIOoOiOII00oII).I00oII(iIi0I0I0o);
/* 23 */            if (iIOoOiOII00oII2 instanceof IIOoIilO) {
/* 25 */                return (IIOoIilO) iIOoOiOII00oII2;
                    }
/* 35 */            return null;
                }

                public OIlloOiOo I00111O() {
/* 7 */             IIOoOiOI iIOoOiOII00oII = I00Io1lO().I00oII(IIi0I0I0o.I0I1Ol);
/* 13 */            if (!(iIOoOiOII00oII instanceof IIOoi0ooOoO)) {
/* 28 */                return null;
                    }
/* 19 */            OIlloOiOo oIlloOiOo = new OIlloOiOo();
/* 22 */            oIlloOiOo.I00iOIl = (IIOoi0ooOoO) iIOoOiOII00oII;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            return oIlloOiOo;
                }

                public int I001IIilI0O() {
/* 9 */             return I00Io1lO().I00oooO(IIi0I0I0o.I0I1iI, null, -1);
                }

                public Map<String, Object> I001IO000() {
/* 7 */             IIOoOiOI iIOoOiOII00oII = I00Io1lO().I00oII(IIi0I0I0o.I0II1I0li10);
/* 13 */            if (iIOoOiOII00oII instanceof IIOoi0ooOoO) {
                        try {
/* 17 */                    return IIOoilii0iil.I00000oIO((IIOoi0ooOoO) iIOoOiOII00oII);
                        } catch (IOException e) {
/* 29 */                    Log.e("PdfBox-Android", e.getMessage(), e);
                        }
                    }
/* 34 */            return new HashMap();
                }

                public void I001i1O0Ol(OIlloOi10 oIlloOi10) {
/* 7 */             I00Io1lO().I010ioo(IIi0I0I0o.I01illiil1Oo, oIlloOi10);
                }

                public void I001i1lo1io(IIOoOiOI iIOoOiOI) {
/* 7 */             I00Io1lO().I010iIIOlo(IIi0I0I0o.I01ll0oooOoO, iIOoOiOI);
                }

                public void I001iOo1i0O(OIlloOiOo oIlloOiOo) {
/* 7 */             I00Io1lO().I010ioo(IIi0I0I0o.I0I1Ol, oIlloOiOo);
                }

                public void I001l0I00(int i) {
/* 7 */             I00Io1lO().I010i10l(IIi0I0I0o.I0I1iI, i);
                }

                public void I001lIiIIo1O(Map<String, String> map) {
/* 3 */             IIOoi0ooOoO iIOoi0ooOoO = new IIOoi0ooOoO();
/* 18 */            for (Map.Entry<String, String> entry : map.entrySet()) {
/* 26 */                String key = entry.getKey();
/* 42 */                iIOoi0ooOoO.I010l10O(IIi0I0I0o.I00ioIO(key), entry.getValue());
                    }
/* 52 */            I00Io1lO().I010iIIOlo(IIi0I0I0o.I0II1I0li10, iIOoi0ooOoO);
                }

/* 6 */         public OIloo1(IIOoi0ooOoO iIOoi0ooOoO) {
/* 7 */             super(iIOoi0ooOoO);
                }
            }
