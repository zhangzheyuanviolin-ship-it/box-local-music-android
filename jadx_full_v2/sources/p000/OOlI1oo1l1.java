            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOlI1oo1l1 extends OoOiiO01illo {
                public static final O00oiI0oo0ol I0000Il00O;
                public static final O00oiI0oo0ol I0000O;
                public final OoIOol I00000oOI = new OoIOol(new iolOOiI(14));

                static {
/* 1 */             OoOilOl1 ooOilOl1 = OoOilOl1.I00iiI;
/* 16 */            I0000Il00O = l01ill.I00000oIO(ooOilOl1, false, null, 5).I00000oOI(O00oiIoOo1o.I00iiO);
/* 28 */            I0000O = l01ill.I00000oIO(ooOilOl1, false, null, 5).I00000oOI(O00oiIoOo1o.I00iiI);
                }

                @Override
                public final OoOi1Ol I0000O(O0iIl1 o0iIl1) {
/* 19 */            return new OlIo1I(I000O01llI0(o0iIl1, new O00oiI0oo0ol(OoOilOl1.I00iiI, false, false, null, 62)));
                }

                public final OIoi0IIoi I000II(Ol0O0iI0l0O ol0O0iI0l0O, OI000ilOol oI000ilOol, O00oiI0oo0ol o00oiI0oo0ol) {
/* 13 */            if (ol0O0iI0l0O.I00iOIl().I000II().isEmpty()) {
/* 19 */                return new OIoi0IIoi(ol0O0iI0l0O, Boolean.FALSE);
                    }
/* 27 */            if (O0i1lI0o1io.I001iOo1i0O(ol0O0iI0l0O)) {
/* 38 */                OoOi1Ol ooOi1Ol = (OoOi1Ol) ol0O0iI0l0O.I00OIl().get(0);
/* 81 */                return new OIoi0IIoi(l0loOIIo0iOo.I0000Il00O(ol0O0iI0l0O.I00OloOo(), ol0O0iI0l0O.I00iOIl(), Collections.singletonList(new OlIo1I(I000O01llI0(ooOi1Ol.I00000oOI(), o00oiI0oo0ol), ooOi1Ol.I00000oIO())), ol0O0iI0l0O.I00iiI()), Boolean.FALSE);
                    }
/* 89 */            if (l0loOi1ol11o.I00000oIO(ol0O0iI0l0O)) {
/* 113 */               return new OIoi0IIoi(Il0ooiloI.I00000oOI(Il0ooO1IO.I00lll10, ol0O0iI0l0O.I00iOIl().toString()), Boolean.FALSE);
                    }
/* 117 */           O1iil1I01o o1iil1I01oI00IoO0 = oI000ilOol.I00IoO0(this);
/* 121 */           OoOI1i1i ooOI1i1iI00OloOo = ol0O0iI0l0O.I00OloOo();
/* 125 */           OoOIOoO1I ooOIOoO1II000OOo1O = oI000ilOol.I000OOo1O();
/* 133 */           List<OoOOiO> listI000II = oI000ilOol.I000OOo1O().I000II();
/* 148 */           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI000II, 10));
/* 159 */           for (OoOOiO ooOOiO : listI000II) {
/* 177 */               arrayList.add(iolOOiI.I000l1(ooOOiO, o00oiI0oo0ol, this.I00000oOI.I0000oI00(ooOOiO, o00oiI0oo0ol)));
                    }
/* 181 */           boolean zI00iiI = ol0O0iI0l0O.I00iiI();
/* 188 */           IiOOI0O iiOOI0O = new IiOOI0O(2);
/* 191 */           iiOOI0O.I00iiI = oI000ilOol;
/* 193 */           VarHandle.storeStoreFence();
/* 204 */           return new OIoi0IIoi(l0loOIIo0iOo.I0000oI00(ooOI1i1iI00OloOo, ooOIOoO1II000OOo1O, arrayList, zI00iiI, o1iil1I01oI00IoO0, iiOOI0O), Boolean.TRUE);
                }

                public final O0iIl1 I000O01llI0(O0iIl1 o0iIl1, O00oiI0oo0ol o00oiI0oo0ol) {
/* 5 */             IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
/* 11 */            if (iOIiO1lIl0lI00100o1O0lo instanceof OoOOiO) {
/* 15 */                o00oiI0oo0ol.getClass();
/* 35 */                return I000O01llI0(this.I00000oOI.I0000oI00((OoOOiO) iOIiO1lIl0lI00100o1O0lo, O00oiI0oo0ol.I00000oIO(o00oiI0oo0ol, null, true, null, null, 59)), o00oiI0oo0ol);
                    }
/* 43 */            if (!(iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol)) {
/* 138 */               IOOlIIilOl0.I000lI("Unexpected declaration kind: ", iOIiO1lIl0lI00100o1O0lo);
/* 42 */                return null;
                    }
/* 53 */            IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo2 = ilOiIOII1.I00000oOI(o0iIl1).I00iOIl().I00100o1O0lo();
/* 59 */            if (!(iOIiO1lIl0lI00100o1O0lo2 instanceof OI000ilOol)) {
/* 132 */               I000II.I000o00OoI0I("For some reason declaration for upper bound is not a class but \"", iOIiO1lIl0lI00100o1O0lo2, "\" while for lower it's \"", iOIiO1lIl0lI00100o1O0lo, 34);
/* 42 */                return null;
                    }
/* 69 */            OIoi0IIoi oIoi0IIoiI000II = I000II(ilOiIOII1.I00000oIO(o0iIl1), (OI000ilOol) iOIiO1lIl0lI00100o1O0lo, I0000Il00O);
/* 75 */            Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) oIoi0IIoiI000II.I00iOIl;
/* 81 */            boolean zBooleanValue = ((Boolean) oIoi0IIoiI000II.I00iiI).booleanValue();
/* 93 */            OIoi0IIoi oIoi0IIoiI000II2 = I000II(ilOiIOII1.I00000oOI(o0iIl1), (OI000ilOol) iOIiO1lIl0lI00100o1O0lo2, I0000O);
/* 99 */            Ol0O0iI0l0O ol0O0iI0l0O2 = (Ol0O0iI0l0O) oIoi0IIoiI000II2.I00iOIl;
                    return (zBooleanValue || ((Boolean) oIoi0IIoiI000II2.I00iiI).booleanValue()) ? new OOlIIOoli(ol0O0iI0l0O, ol0O0iI0l0O2, 0) : l0loOIIo0iOo.I00000oIO(ol0O0iI0l0O, ol0O0iI0l0O2);
                }
            }
