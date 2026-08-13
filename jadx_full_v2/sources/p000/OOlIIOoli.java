            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OOlIIOoli extends IlOIOIi00io {
                public OOlIIOoli(Ol0O0iI0l0O ol0O0iI0l0O, Ol0O0iI0l0O ol0O0iI0l0O2, int i) {
/* 1 */             super(ol0O0iI0l0O, ol0O0iI0l0O2);
/* 6 */             O0iIo00.I00000oIO.I00000oOI(ol0O0iI0l0O, ol0O0iI0l0O2);
                }

                public static final ArrayList I00o0l1o1o0(IiOOllOI0io iiOOllOI0io, O0iIl1 o0iIl1) throws IOException {
/* 1 */             List<OoOi1Ol> listI00OIl = o0iIl1.I00OIl();
/* 15 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00OIl, 10));
/* 26 */            for (OoOi1Ol ooOi1Ol : listI00OIl) {
/* 36 */                StringBuilder sb = new StringBuilder();
/* 39 */                List listSingletonList = Collections.singletonList(ooOi1Ol);
/* 49 */                IiOOlOlI1I0 iiOOlOlI1I0 = new IiOOlOlI1I0(0);
/* 52 */                iiOOlOlI1I0.I00iiI = iiOOllOI0io;
/* 54 */                VarHandle.storeStoreFence();
/* 63 */                IOOi0Ool1i.I00IioO0OiOi(listSingletonList, sb, ", ", null, null, iiOOlOlI1I0, 60);
/* 70 */                arrayList.add(sb.toString());
                    }
/* 89 */            return arrayList;
                }

                public static final String I00o101lO(String str, String str2) {
/* 7 */             if (!OlOoOIi0o.I00100l0(str, '<')) {
/* 9 */                 return str;
                    }
/* 37 */            return OlOoOIi0o.I00O10llo(str, '<') + '<' + str2 + '>' + OlOoOIi0o.I00O0i0ii('>', str, str);
                }

                @Override
                public final O1iil1I01o I00IoiI() {
/* 5 */             IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = I00iOIl().I00100o1O0lo();
/* 17 */            OI000ilOol oI000ilOol = iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI00100o1O0lo : null;
/* 18 */            if (oI000ilOol != null) {
/* 25 */                return oI000ilOol.I00IoO0(new OOlI1oo1l1());
                    }
/* 40 */            OIiilo1Ool0o.I00100l0("Incorrect classifier: ", I00iOIl().I00100o1O0lo());
/* 11 */            return null;
                }

                @Override
                public final O0iIl1 I00ll1(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 7 */             return new OOlIIOoli(this.I00iiI, this.I00iiO);
                }

                @Override
                public final Ooioo0o1l0 I00li1OI(boolean z) {
/* 16 */            return new OOlIIOoli(this.I00iiI.I00li1OI(z), this.I00iiO.I00li1OI(z), 0);
                }

                @Override
                public final Ooioo0o1l0 I00ll1(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 7 */             return new OOlIIOoli(this.I00iiI, this.I00iiO);
                }

                @Override
                public final Ooioo0o1l0 I00lli11(OoOI1i1i ooOI1i1i) {
/* 16 */            return new OOlIIOoli(this.I00iiI.I00lli11(ooOI1i1i), this.I00iiO.I00lli11(ooOI1i1i), 0);
                }

                @Override
                public final Ol0O0iI0l0O I00lll10() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final String I00o0iI0io1(IiOOllOI0io iiOOllOI0io, IiOOllOI0io iiOOllOI0io2) throws IOException {
/* 1 */             Ol0O0iI0l0O ol0O0iI0l0O = this.I00iiI;
/* 3 */             String strI00OIl = iiOOllOI0io.I00OIl(ol0O0iI0l0O);
/* 7 */             Ol0O0iI0l0O ol0O0iI0l0O2 = this.I00iiO;
/* 9 */             String strI00OIl2 = iiOOllOI0io.I00OIl(ol0O0iI0l0O2);
/* 19 */            if (iiOOllOI0io2.I00000oIO.I000o00OoI0I()) {
/* 44 */                return "raw (" + strI00OIl + ".." + strI00OIl2 + ')';
                    }
/* 57 */            if (ol0O0iI0l0O2.I00OIl().isEmpty()) {
/* 63 */                return iiOOllOI0io.I00II0Ol1O0l(strI00OIl, strI00OIl2, lOoliOIOlIO0.I0000O(this));
                    }
/* 68 */            ArrayList arrayListI00o0l1o1o0 = I00o0l1o1o0(iiOOllOI0io, ol0O0iI0l0O);
/* 72 */            ArrayList arrayListI00o0l1o1o02 = I00o0l1o1o0(iiOOllOI0io, ol0O0iI0l0O2);
/* 84 */            String strI00IlilI0i0i = IOOi0Ool1i.I00IlilI0i0i(arrayListI00o0l1o1o0, ", ", null, null, IiOi0I1.I00ooiO1I, 30);
/* 88 */            ArrayList arrayListI00ilO0 = IOOi0Ool1i.I00ilO0(arrayListI00o0l1o1o0, arrayListI00o0l1o1o02);
/* 96 */            if (arrayListI00ilO0.isEmpty()) {
/* 144 */               strI00OIl2 = I00o101lO(strI00OIl2, strI00IlilI0i0i);
                    } else {
/* 99 */                Iterator it = arrayListI00ilO0.iterator();
/* 107 */               while (it.hasNext()) {
/* 113 */                   OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) it.next();
/* 117 */                   String str = (String) oIoi0IIoi.I00iOIl;
/* 121 */                   String str2 = (String) oIoi0IIoi.I00iiI;
/* 133 */                   if (!O0000Ioio00.I0000O(str, OlOoOIi0o.I00IOO("out ", str2)) && !str2.equals("*")) {
                                break;
                            }
                        }
/* 144 */               strI00OIl2 = I00o101lO(strI00OIl2, strI00IlilI0i0i);
                    }
/* 148 */           String strI00o101lO = I00o101lO(strI00OIl, strI00IlilI0i0i);
                    return strI00o101lO.equals(strI00OIl2) ? strI00o101lO : iiOOllOI0io.I00II0Ol1O0l(strI00o101lO, strI00OIl2, lOoliOIOlIO0.I0000O(this));
                }
            }
