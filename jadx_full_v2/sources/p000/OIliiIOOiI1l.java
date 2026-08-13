            package p000;

            import android.util.Log;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            
/* 65 */    public final class OIliiIOOiI1l implements IIi0O1OOO1i0, OIlOoO {
                public final int I00iOIl = 0;
                public IIi0O1OOO1i0 I00iiI;
                public Object I00iiO;

                public OIliiIOOiI1l(IIOoi0ooOoO iIOoi0ooOoO) {
/* 7 */             this.I00iiI = iIOoi0ooOoO;
/* 9 */             Oii0OIi11oli oii0OIi11oli = Oii0OIi11oli.I00000oOI;
/* 23 */            Class cls = (Class) oii0OIi11oli.I00000oIO.get(iIOoi0ooOoO.I010101Oo1lO(IIi0I0I0o.I01OOiI1o));
/* 25 */            Oii0OIIO oii0OIIO = null;
/* 26 */            if (cls != null) {
                        try {
/* 37 */                    oii0OIIO = (Oii0OIIO) cls.getDeclaredConstructor(null).newInstance(null);
                        } catch (IllegalAccessException e) {
/* 59 */                    IioIoO10iOiI.I000lI(e);
/* 62 */                    throw null;
                        } catch (InstantiationException e2) {
/* 55 */                    IioIoO10iOiI.I000lI(e2);
/* 58 */                    throw null;
                        } catch (NoSuchMethodException e3) {
/* 63 */                    IioIoO10iOiI.I000lI(e3);
/* 186 */                   throw null;
                        } catch (InvocationTargetException e4) {
/* 51 */                    IioIoO10iOiI.I000lI(e4);
/* 54 */                    throw null;
                        }
                    }
/* 40 */            this.I00iiO = oii0OIIO;
                }

                @Override
                public O1OoooIi1Ol0 I00000oIO() {
/* 5 */             return ((OIo0IlIloO) this.I00iiI).I00000oIO();
                }

                @Override
                public OIloOoil011l I00000oOI() {
/* 9 */             IIOoOiOI iIOoOiOII00oII = ((OIo0IlIloO) this.I00iiI).I00iOIl.I00oII(IIi0I0I0o.I01OoOi);
/* 15 */            if (iIOoOiOII00oII instanceof IIOoIilO) {
/* 21 */                return new OIloOoil011l((IIOoIilO) iIOoOiOII00oII);
                    }
/* 25 */            return null;
                }

                @Override
                public InputStream I0000Il00O() {
/* 5 */             return ((IIi0io1lIo) this.I00iiO).I010l1ol111();
                }

                @Override
                public OIloii I0000O() {
/* 3 */             IIi0io1lIo iIi0io1lIo = (IIi0io1lIo) this.I00iiO;
/* 5 */             IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I0II0i00l;
/* 13 */            if (!iIi0io1lIo.I00iOIl.containsKey(iIi0I0I0o)) {
/* 64 */                OIo0IlIloO oIo0IlIloO = (OIo0IlIloO) this.I00iiI;
/* 68 */                if (oIo0IlIloO.I00lll10 == null) {
/* 72 */                    IIOoOiOI iIOoOiOII00oII = oIo0IlIloO.I00iOIl.I00oII(iIi0I0I0o);
/* 78 */                    if (iIOoOiOII00oII instanceof IIOoi0ooOoO) {
/* 89 */                        oIo0IlIloO.I00lll10 = new OIloii((IIOoi0ooOoO) iIOoOiOII00oII, oIo0IlIloO.I00oI0i);
                            }
                        }
/* 91 */                return oIo0IlIloO.I00lll10;
                    }
/* 19 */            Log.w("PdfBox-Android", "Using resources dictionary found in charproc entry");
/* 24 */            Log.w("PdfBox-Android", "This should have been in the font or in the page dictionary");
/* 33 */            IIOoi0ooOoO iIOoi0ooOoO = (IIOoi0ooOoO) iIi0io1lIo.I00oII(iIi0I0I0o);
/* 35 */            OIloii oIloii = new OIloii();
/* 43 */            oIloii.I00iiO = new HashMap();
/* 46 */            if (iIOoi0ooOoO == null) {
/* 58 */                I000II.I000iOII("resourceDictionary is null");
/* 45 */                return null;
                    }
/* 48 */            oIloii.I00iOIl = iIOoi0ooOoO;
/* 50 */            oIloii.I00iiI = null;
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            return oIloii;
                }

                public OIlOo0I1lIl I0000oI00(IIi0I0I0o iIi0I0I0o) {
/* 7 */             IIOoOiOI iIOoOiOII00oII = ((IIOoi0ooOoO) this.I00iiI).I00oII(IIi0I0I0o.I010OIo1l);
/* 13 */            if (!(iIOoOiOII00oII instanceof IIOoi0ooOoO)) {
/* 36 */                return null;
                    }
/* 17 */            IIOoOiOI iIOoOiOII00oII2 = ((IIOoi0ooOoO) iIOoOiOII00oII).I00oII(iIi0I0I0o);
/* 23 */            if (!(iIOoOiOII00oII2 instanceof IIOoi0ooOoO)) {
/* 36 */                return null;
                    }
/* 30 */            OIlOo0I1lIl oIlOo0I1lIl = new OIlOo0I1lIl(1);
/* 33 */            oIlOo0I1lIl.I00iiI = (IIOoi0ooOoO) iIOoOiOII00oII2;
/* 35 */            return oIlOo0I1lIl;
                }

                public OIloOoil011l I0001Ioi1lo() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             OIlilOioI oIlilOioI = new OIlilOioI(this);
/* 15 */            for (Object objI001i1O0Ol = oIlilOioI.I001i1O0Ol(); objI001i1O0Ol != null; objI001i1O0Ol = oIlilOioI.I001i1O0Ol()) {
/* 19 */                if (objI001i1O0Ol instanceof OIii101l1I0O) {
/* 31 */                    if (!((OIii101l1I0O) objI001i1O0Ol).I00000oIO.equals("d1") || arrayList.size() != 6) {
/* 117 */                       return null;
                            }
/* 41 */                    for (int i = 0; i < 6; i++) {
/* 49 */                        if (!(arrayList.get(i) instanceof IIi0IoOo)) {
/* 117 */                           return null;
                                }
                            }
/* 62 */                    float fI00ioIO = ((IIi0IoOo) arrayList.get(2)).I00ioIO();
/* 73 */                    float fI00ioIO2 = ((IIi0IoOo) arrayList.get(3)).I00ioIO();
/* 103 */                   return new OIloOoil011l(fI00ioIO, fI00ioIO2, ((IIi0IoOo) arrayList.get(4)).I00ioIO() - fI00ioIO, ((IIi0IoOo) arrayList.get(5)).I00ioIO() - fI00ioIO2);
                        }
/* 109 */               arrayList.add((IIOoOiOI) objI001i1O0Ol);
                    }
/* 117 */           return null;
                }

                public int I000II() {
/* 10 */            return ((IIOoi0ooOoO) this.I00iiI).I00oooO(IIi0I0I0o.I01o00iOi, null, 40);
                }

                public OIlo1Ioo I000O01llI0() {
/* 13 */            IIOoi0ooOoO iIOoi0ooOoO = (IIOoi0ooOoO) ((IIOoi0ooOoO) this.I00iiI).I00oII(IIi0I0I0o.I0I11O000oO);
/* 17 */            OIliOo11 oIliOo11 = (OIliOo11) this.I00iiO;
/* 19 */            OIlo1Ioo oIlo1Ioo = new OIlo1Ioo();
/* 24 */            new HashSet();
/* 27 */            if (iIOoi0ooOoO == null) {
/* 80 */                I000II.I000iOII("page tree root cannot be null");
/* 83 */                return null;
                    }
/* 41 */            if (IIi0I0I0o.I0I1101l0.equals(iIOoi0ooOoO.I00o0iI0io1(IIi0I0I0o.I0IilI00l))) {
/* 45 */                IIOoIilO iIOoIilO = new IIOoIilO();
/* 48 */                iIOoIilO.I00ioIO(iIOoi0ooOoO);
/* 53 */                IIOoi0ooOoO iIOoi0ooOoO2 = new IIOoi0ooOoO();
/* 56 */                oIlo1Ioo.I00iOIl = iIOoi0ooOoO2;
/* 60 */                iIOoi0ooOoO2.I010iIIOlo(IIi0I0I0o.I01lloolio1l, iIOoIilO);
/* 66 */                iIOoi0ooOoO2.I010i10l(IIi0I0I0o.I011IOil, 1);
                    } else {
/* 70 */                oIlo1Ioo.I00iOIl = iIOoi0ooOoO;
                    }
/* 72 */            oIlo1Ioo.I00iiI = oIliOo11;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            return oIlo1Ioo;
                }

                public Oii0OIIO I000OOo1O() throws IOException {
/* 3 */             Oii0OIIO oii0OIIO = (Oii0OIIO) this.I00iiO;
/* 5 */             if (oii0OIIO != null) {
/* 7 */                 return oii0OIIO;
                    }
/* 20 */            I000II.I00111O("No security handler for filter ", ((IIOoi0ooOoO) this.I00iiI).I010101Oo1lO(IIi0I0I0o.I01OOiI1o));
/* 23 */            return null;
                }

                public int I000OiO() {
/* 9 */             return ((IIOoi0ooOoO) this.I00iiI).I00oooO(IIi0I0I0o.I0Il1IoilolI, null, 0);
                }

                public boolean I000iOII() {
/* 7 */             IIOoOiOI iIOoOiOII00oII = ((IIOoi0ooOoO) this.I00iiI).I00oII(IIi0I0I0o.I01O1lIi);
/* 13 */            if (iIOoOiOII00oII instanceof IIOoOl1o1) {
/* 17 */                return ((IIOoOl1o1) iIOoOiOII00oII).I00iOIl;
                    }
/* 20 */            return true;
                }

                @Override
                public final IIOoOiOI I00Io1lO() {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    return (IIOoi0ooOoO) this.I00iiI;
                        case 1:
/* 13 */                    return (IIOoi0ooOoO) this.I00iiI;
                        default:
/* 8 */                     return (IIi0io1lIo) this.I00iiO;
                    }
                }

/* 66 */        public OIliiIOOiI1l(OIo0IlIloO oIo0IlIloO, IIi0io1lIo iIi0io1lIo) {
/* 68 */            this.I00iiI = oIo0IlIloO;
/* 69 */            this.I00iiO = iIi0io1lIo;
                }

/* 69 */        public OIliiIOOiI1l() {
                }
            }
