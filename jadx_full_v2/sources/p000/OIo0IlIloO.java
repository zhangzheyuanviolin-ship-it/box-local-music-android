            package p000;

            import android.util.Log;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OIo0IlIloO extends OIloiiI1i1 {
                public OIloii I00lll10;
                public IIOoi0ooOoO I00o0iI0io1;
                public O1OoooIi1Ol0 I00o0l1o1o0;
                public II1i0i0ilO I00o101lO;
                public IoIlOo1o0IIl I00oI0i;

                /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[EDGE_INSN: B:16:0x0037->B:17:0x0039 BREAK  A[LOOP:0: B:10:0x0021->B:21:?]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final O1OoooIi1Ol0 I00000oIO() {
/* 1 */             O1OoooIi1Ol0 o1OoooIi1Ol0I0000Il00O = this.I00o0l1o1o0;
/* 3 */             if (o1OoooIi1Ol0I0000Il00O == null) {
/* 9 */                 IIOoIilO iIOoIilOI00lli11 = this.I00iOIl.I00lli11(IIi0I0I0o.I01i1oI);
/* 13 */                if (iIOoIilOI00lli11 != null) {
/* 15 */                    ArrayList arrayList = iIOoIilOI00lli11.I00iOIl;
/* 22 */                    if (arrayList.size() != 6) {
/* 56 */                        o1OoooIi1Ol0I0000Il00O = OIll100.I00l0I0l0lO1;
/* 58 */                        this.I00o0l1o1o0 = o1OoooIi1Ol0I0000Il00O;
                            } else {
/* 30 */                        Iterator it = new ArrayList(arrayList).iterator();
/* 38 */                        while (it.hasNext()) {
/* 48 */                            if (!(((IIOoOiOI) it.next()) instanceof IIi0IoOo)) {
/* 56 */                                o1OoooIi1Ol0I0000Il00O = OIll100.I00l0I0l0lO1;
                                        break;
                                    }
                                }
/* 51 */                        o1OoooIi1Ol0I0000Il00O = O1OoooIi1Ol0.I0000Il00O(iIOoIilOI00lli11);
/* 58 */                        this.I00o0l1o1o0 = o1OoooIi1Ol0I0000Il00O;
                            }
                        }
                    }
/* 113 */           return o1OoooIi1Ol0I0000Il00O;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final float I00000oOI(int i) throws IOException {
                    OIliiIOOiI1l oIliiIOOiI1l;
/* 1 */             IIOoi0ooOoO iIOoi0ooOoO = this.I00iOIl;
/* 6 */             if (this.I00l0OO0IO == null) {
/* 65 */                oIliiIOOiI1l = null;
                    } else {
/* 8 */                 IIOoi0ooOoO iIOoi0ooOoOI00lll10 = this.I00o0iI0io1;
/* 10 */                if (iIOoi0ooOoOI00lll10 == null) {
/* 14 */                    iIOoi0ooOoOI00lll10 = iIOoi0ooOoO.I00lll10(IIi0I0I0o.I010iIIOlo);
/* 18 */                    this.I00o0iI0io1 = iIOoi0ooOoOI00lll10;
                        }
/* 20 */                if (iIOoi0ooOoOI00lll10 != null) {
/* 25 */                    String strI0000Il00O = this.I00l0OO0IO.I0000Il00O(i);
/* 29 */                    IIOoi0ooOoO iIOoi0ooOoOI00lll102 = this.I00o0iI0io1;
/* 31 */                    if (iIOoi0ooOoOI00lll102 == null) {
/* 35 */                        iIOoi0ooOoOI00lll102 = iIOoi0ooOoO.I00lll10(IIi0I0I0o.I010iIIOlo);
/* 39 */                        this.I00o0iI0io1 = iIOoi0ooOoOI00lll102;
                            }
/* 45 */                    IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoOI00lll102.I00oII(IIi0I0I0o.I00ioIO(strI0000Il00O));
/* 56 */                    IIi0io1lIo iIi0io1lIo = iIOoOiOII00oII instanceof IIi0io1lIo ? (IIi0io1lIo) iIOoOiOII00oII : null;
/* 57 */                    if (iIi0io1lIo != null) {
/* 61 */                        oIliiIOOiI1l = new OIliiIOOiI1l(this, iIi0io1lIo);
                            }
                        }
                    }
/* 67 */            if (oIliiIOOiI1l != null && ((IIi0io1lIo) oIliiIOOiI1l.I00iiO).I00oooO(IIi0I0I0o.I01o00iOi, null, 0) != 0) {
/* 85 */                ArrayList arrayList = new ArrayList();
/* 90 */                OIlilOioI oIlilOioI = new OIlilOioI(oIliiIOOiI1l);
/* 97 */                for (Object objI001i1O0Ol = oIlilOioI.I001i1O0Ol(); objI001i1O0Ol != null; objI001i1O0Ol = oIlilOioI.I001i1O0Ol()) {
/* 101 */                   if (objI001i1O0Ol instanceof OIii101l1I0O) {
/* 105 */                       String str = ((OIii101l1I0O) objI001i1O0Ol).I00000oIO;
/* 113 */                       if (!str.equals("d0") && !str.equals("d1")) {
/* 126 */                           IioIoO10iOiI.I000OOo1O("First operator must be d0 or d1");
/* 66 */                            return 0.0f;
                                }
/* 134 */                       IIOoOiOI iIOoOiOI = (IIOoOiOI) arrayList.get(0);
/* 138 */                       if (iIOoOiOI instanceof IIi0IoOo) {
/* 142 */                           return ((IIi0IoOo) iIOoOiOI).I00ioIO();
                                }
/* 161 */                       IioIoO10iOiI.I000OOo1O("Unexpected argument type: ".concat(iIOoOiOI.getClass().getName()));
/* 66 */                        return 0.0f;
                            }
/* 167 */                   arrayList.add((IIOoOiOI) objI001i1O0Ol);
                        }
/* 177 */               IioIoO10iOiI.I000OOo1O("Unexpected end of stream");
                    }
/* 66 */            return 0.0f;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return true;
                }

                @Override
                public final Ooo0OIOI I0000oI00(int i) {
/* 1 */             O1OoooIi1Ol0 o1OoooIi1Ol0I00000oIO = I00000oIO();
/* 5 */             float fI000OiO = I000OiO(i);
/* 9 */             float[] fArr = o1OoooIi1Ol0I00000oIO.I00iOIl;
/* 12 */            float f = fArr[0];
/* 15 */            float f2 = fArr[1];
/* 18 */            float f3 = fArr[3];
/* 21 */            float f4 = fArr[4];
/* 40 */            return new Ooo0OIOI((f3 * 0.0f) + (f * fI000OiO) + fArr[6], (0.0f * f4) + (fI000OiO * f2) + fArr[7]);
                }

                @Override
                public final float I000OiO(int i) {
                    Float f;
/* 1 */             IIOoi0ooOoO iIOoi0ooOoO = this.I00iOIl;
/* 7 */             int iI00oooO = iIOoi0ooOoO.I00oooO(IIi0I0I0o.I01OiO1OI, null, -1);
/* 13 */            int iI00oooO2 = iIOoi0ooOoO.I00oooO(IIi0I0I0o.I01lolI0O, null, -1);
/* 17 */            List listI000iOII = I000iOII();
/* 26 */            if (listI000iOII.isEmpty() || i < iI00oooO || i > iI00oooO2) {
/* 54 */                OIll1lio oIll1lio = this.I00iio;
                        return oIll1lio != null ? oIll1lio.I00iOIl.I00ooiO1I(IIi0I0I0o.I01oo0OOli, 0.0f) : I00000oOI(i);
                    }
/* 32 */            int i2 = i - iI00oooO;
/* 37 */            if (i2 < listI000iOII.size() && (f = (Float) listI000iOII.get(i2)) != null) {
/* 49 */                return f.floatValue();
                    }
/* 25 */            return 0.0f;
                }

                @Override
                public final boolean I000l1() {
/* 1 */             return false;
                }

                @Override
                public final int I000oI1ioi(ByteArrayInputStream byteArrayInputStream) {
/* 1 */             return byteArrayInputStream.read();
                }

                @Override
                public final void I0010o() {
/* 5 */             IIOoOiOI iIOoOiOII00oII = this.I00iOIl.I00oII(IIi0I0I0o.I01O10iIoo1O);
/* 11 */            if (iIOoOiOII00oII instanceof IIi0I0I0o) {
/* 13 */                IIi0I0I0o iIi0I0I0o = (IIi0I0I0o) iIOoOiOII00oII;
/* 15 */                Il0IIl0OOI il0IIl0OOII00000oOI = Il0IIl0OOI.I00000oOI(iIi0I0I0o);
/* 19 */                this.I00l0OO0IO = il0IIl0OOII00000oOI;
/* 21 */                if (il0IIl0OOII00000oOI == null) {
/* 41 */                    Log.w("PdfBox-Android", "Unknown encoding: " + iIi0I0I0o.I00iOIl);
                        }
                    } else if (iIOoOiOII00oII instanceof IIOoi0ooOoO) {
/* 53 */                Iii100lOoooi iii100lOoooi = new Iii100lOoooi();
/* 61 */                iii100lOoooi.I00ilI0I1 = new HashMap();
/* 63 */                iii100lOoooi.I00iiO = (IIOoi0ooOoO) iIOoOiOII00oII;
/* 66 */                iii100lOoooi.I00iio = null;
/* 68 */                iii100lOoooi.I0000O();
/* 71 */                VarHandle.storeStoreFence();
/* 74 */                this.I00l0OO0IO = iii100lOoooi;
                    }
/* 78 */            this.I00li1OI = Io0O0o0l1o.I0000O;
                }

                @Override
                public final Il0IIl0OOI I00111O() {
/* 29 */            throw new UnsupportedOperationException("not supported for Type 3 fonts");
                }

                @Override
                public final II1i0i0ilO getBoundingBox() {
                    II1i0i0ilO iI1i0i0ilO;
/* 1 */             IIOoi0ooOoO iIOoi0ooOoO = this.I00iOIl;
/* 3 */             II1i0i0ilO iI1i0i0ilO2 = this.I00o101lO;
/* 5 */             if (iI1i0i0ilO2 != null) {
/* 541 */               return iI1i0i0ilO2;
                    }
/* 9 */             IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoO.I00oII(IIi0I0I0o.I01OoOi);
/* 26 */            OIloOoil011l oIloOoil011l = iIOoOiOII00oII instanceof IIOoIilO ? new OIloOoil011l((IIOoIilO) iIOoOiOII00oII) : null;
/* 28 */            if (oIloOoil011l == null) {
/* 34 */                Log.w("PdfBox-Android", "FontBBox missing, returning empty rectangle");
/* 39 */                iI1i0i0ilO = new II1i0i0ilO(1);
                    } else {
/* 44 */                IIOoIilO iIOoIilO = oIloOoil011l.I00iOIl;
/* 53 */                if (oIloOoil011l.I00000oIO() == 0.0f && oIloOoil011l.I00000oOI() == 0.0f && oIloOoil011l.I0000Il00O() == 0.0f && oIloOoil011l.I0000O() == 0.0f) {
/* 79 */                    IIOoi0ooOoO iIOoi0ooOoOI00lll10 = this.I00o0iI0io1;
/* 81 */                    if (iIOoi0ooOoOI00lll10 == null) {
/* 85 */                        iIOoi0ooOoOI00lll10 = iIOoi0ooOoO.I00lll10(IIi0I0I0o.I010iIIOlo);
/* 89 */                        this.I00o0iI0io1 = iIOoi0ooOoOI00lll10;
                            }
/* 91 */                    if (iIOoi0ooOoOI00lll10 != null) {
/* 99 */                        Iterator it = iIOoi0ooOoOI00lll10.I00iOIl.keySet().iterator();
/* 107 */                       while (it.hasNext()) {
/* 115 */                           IIOoOiOI iIOoOiOII00oII2 = iIOoi0ooOoOI00lll10.I00oII((IIi0I0I0o) it.next());
/* 126 */                           IIi0io1lIo iIi0io1lIo = iIOoOiOII00oII2 instanceof IIi0io1lIo ? (IIi0io1lIo) iIOoOiOII00oII2 : null;
/* 127 */                           if (iIi0io1lIo != null) {
                                        try {
/* 134 */                                   OIloOoil011l oIloOoil011lI0001Ioi1lo = new OIliiIOOiI1l(this, iIi0io1lIo).I0001Ioi1lo();
/* 138 */                                   if (oIloOoil011lI0001Ioi1lo != null) {
/* 159 */                                       iIOoIilO.I00oliIiO01i(0, new IIOolo0l(Math.min(oIloOoil011l.I00000oIO(), oIloOoil011lI0001Ioi1lo.I00000oIO())));
/* 179 */                                       iIOoIilO.I00oliIiO01i(1, new IIOolo0l(Math.min(oIloOoil011l.I00000oOI(), oIloOoil011lI0001Ioi1lo.I00000oOI())));
/* 200 */                                       iIOoIilO.I00oliIiO01i(2, new IIOolo0l(Math.max(oIloOoil011l.I0000Il00O(), oIloOoil011lI0001Ioi1lo.I0000Il00O())));
/* 221 */                                       iIOoIilO.I00oliIiO01i(3, new IIOolo0l(Math.max(oIloOoil011l.I0000O(), oIloOoil011lI0001Ioi1lo.I0000O())));
                                            }
                                        } catch (IOException unused) {
                                        }
                                    }
                                }
                            }
                        }
/* 243 */               iI1i0i0ilO = new II1i0i0ilO(oIloOoil011l.I00000oIO(), oIloOoil011l.I00000oOI(), oIloOoil011l.I0000Il00O(), oIloOoil011l.I0000O());
                    }
/* 246 */           this.I00o101lO = iI1i0i0ilO;
/* 248 */           return iI1i0i0ilO;
                }

                @Override
                public final String getName() {
/* 5 */             return this.I00iOIl.I010101Oo1lO(IIi0I0I0o.I0I0I1i);
                }
            }
