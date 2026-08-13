            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class ilioooOo11 {
                public static final int I00000oIO(O0iIl1 o0iIl1) {
/* 7 */             I111oOiIiO0 i111oOiIiO0I00IOO = o0iIl1.getAnnotations().I00IOO(OlIllOO11lOl.I00100o1O0lo);
/* 11 */            if (i111oOiIiO0I00IOO == null) {
/* 13 */                return 0;
                    }
/* 33 */            return ((Number) ((IooOlil01il) ((IOo0i1) O1Oii0O0loo.I00000oOI(OlIlllOI1.I0000oI00, i111oOiIiO0I00IOO.I00111O()))).I00000oIO).intValue();
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static final Ol0O0iI0l0O I00000oOI(O0i1lI0o1io o0i1lI0o1io, I11IlOOO i11IlOOO, O0iIl1 o0iIl1, List list, ArrayList arrayList, O0iIl1 o0iIl12, boolean z) {
                    OI000ilOol oI000ilOolI000iOII;
/* 1 */             I11IiIloOo i11IiIloOo = i1i0olI.I00iiO;
/* 23 */            ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (o0iIl1 != null ? 1 : 0) + 1);
/* 27 */            List list2 = list;
/* 37 */            ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 40 */            Iterator it = list2.iterator();
/* 48 */            while (it.hasNext()) {
/* 61 */                arrayList3.add(new OlIo1I((O0iIl1) it.next()));
                    }
/* 65 */            arrayList2.addAll(arrayList3);
/* 78 */            iiIiiol0.I00000oIO(arrayList2, o0iIl1 != null ? new OlIo1I(o0iIl1) : null);
/* 85 */            int i = 0;
/* 90 */            for (Object obj : arrayList) {
/* 96 */                int i2 = i + 1;
/* 98 */                if (i < 0) {
/* 112 */                   IOOi1I.I000lI();
/* 115 */                   throw null;
                        }
/* 107 */               arrayList2.add(new OlIo1I((O0iIl1) obj));
/* 110 */               i = i2;
                    }
/* 121 */           arrayList2.add(new OlIo1I(o0iIl12));
/* 137 */           int size = list.size() + arrayList.size() + (o0iIl1 != null ? 1 : 0);
/* 138 */           if (z) {
/* 140 */               oI000ilOolI000iOII = o0i1lI0o1io.I001IO000(size);
                    } else {
/* 145 */               OI1Iio0ii1 oI1Iio0ii1 = OlIlllOI1.I00000oIO;
/* 161 */               oI000ilOolI000iOII = o0i1lI0o1io.I000iOII("Function" + size);
                    }
/* 165 */           if (o0iIl1 != null) {
/* 167 */               Ill0IO ill0IO = OlIllOO11lOl.I00100l0;
/* 173 */               if (!i11IlOOO.I001l0I00(ill0IO)) {
/* 183 */                   ArrayList arrayListI00O0o1oo = IOOi0Ool1i.I00O0o1oo(i11IlOOO, new IIIO1Io(o0i1lI0o1io, ill0IO, Il011I1OiO0I.I00iOIl));
/* 191 */                   if (arrayListI00O0o1oo.isEmpty()) {
/* 193 */                       i11IlOOO = i11IiIloOo;
                            } else {
/* 197 */                       I11Io0oil0i0 i11Io0oil0i0 = new I11Io0oil0i0();
/* 200 */                       i11Io0oil0i0.I00iiI = arrayListI00O0o1oo;
/* 202 */                       VarHandle.storeStoreFence();
/* 205 */                       i11IlOOO = i11Io0oil0i0;
                            }
                        }
                    }
/* 213 */           if (!list.isEmpty()) {
/* 215 */               int size2 = list.size();
/* 219 */               Ill0IO ill0IO2 = OlIllOO11lOl.I00100o1O0lo;
/* 225 */               if (!i11IlOOO.I001l0I00(ill0IO2)) {
/* 244 */                   ArrayList arrayListI00O0o1oo2 = IOOi0Ool1i.I00O0o1oo(i11IlOOO, new IIIO1Io(o0i1lI0o1io, ill0IO2, Collections.singletonMap(OlIlllOI1.I0000oI00, new IooOlil01il(size2))));
                            I11IiIloOo i11IiIloOo2 = i11IiIloOo;
/* 252 */                   if (!arrayListI00O0o1oo2.isEmpty()) {
/* 257 */                       I11Io0oil0i0 i11Io0oil0i02 = new I11Io0oil0i0();
/* 260 */                       i11Io0oil0i02.I00iiI = arrayListI00O0o1oo2;
/* 262 */                       VarHandle.storeStoreFence();
                                i11IiIloOo2 = i11Io0oil0i02;
                            }
/* 265 */                   i11IlOOO = i11IiIloOo2;
                        }
                    }
/* 270 */           return l0loOIIo0iOo.I00000oOI(lOoOoloI01i0.I00000oOI(i11IlOOO), oI000ilOolI000iOII, arrayList2);
                }

                public static final OI1Iio0ii1 I0000Il00O(O0iIl1 o0iIl1) {
                    String str;
/* 7 */             I111oOiIiO0 i111oOiIiO0I00IOO = o0iIl1.getAnnotations().I00IOO(OlIllOO11lOl.I0010I0i);
/* 12 */            if (i111oOiIiO0I00IOO != null) {
/* 25 */                Object objI00Oio = IOOi0Ool1i.I00Oio(i111oOiIiO0I00IOO.I00111O().values());
/* 36 */                OlOlol0il01 olOlol0il01 = objI00Oio instanceof OlOlol0il01 ? (OlOlol0il01) objI00Oio : null;
/* 37 */                if (olOlol0il01 != null && (str = (String) olOlol0il01.I00000oIO) != null) {
/* 49 */                    if (!OI1Iio0ii1.I0001Ioi1lo(str)) {
/* 52 */                        str = null;
                            }
/* 53 */                    if (str != null) {
/* 55 */                        return OI1Iio0ii1.I0000oI00(str);
                            }
                        }
                    }
/* 11 */            return null;
                }

                public static final List I0000O(O0iIl1 o0iIl1) {
/* 1 */             I000O01llI0(o0iIl1);
/* 4 */             int iI00000oIO = I00000oIO(o0iIl1);
/* 8 */             if (iI00000oIO == 0) {
/* 10 */                return Il01100l.I00iOIl;
                    }
/* 18 */            List listSubList = o0iIl1.I00OIl().subList(0, iI00000oIO);
/* 32 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listSubList, 10));
/* 35 */            Iterator it = listSubList.iterator();
/* 43 */            while (it.hasNext()) {
/* 55 */                arrayList.add(((OoOi1Ol) it.next()).I00000oOI());
                    }
/* 186 */           return arrayList;
                }

                public static final Illo0o I0000oI00(Ill0OI0lo ill0OI0lo) {
                    Illo0olo0 illo0olo0I00000oIO;
/* 5 */             if (!ill0OI0lo.I0000O() || ill0OI0lo.I0000Il00O() || (illo0olo0I00000oIO = Illo101.I0000Il00O.I00000oIO(ill0OI0lo.I000OOo1O().I00000oOI(), ill0OI0lo.I000II().I00000oOI())) == null) {
/* 41 */                return null;
                    }
/* 38 */            return illo0olo0I00000oIO.I00000oIO;
                }

                public static final O0iIl1 I0001Ioi1lo(O0iIl1 o0iIl1) {
/* 1 */             I000O01llI0(o0iIl1);
/* 14 */            if (o0iIl1.getAnnotations().I00IOO(OlIllOO11lOl.I00100l0) == null) {
/* 35 */                return null;
                    }
/* 30 */            return ((OoOi1Ol) o0iIl1.I00OIl().get(I00000oIO(o0iIl1))).I00000oOI();
                }

                public static final List I000II(O0iIl1 o0iIl1) {
/* 1 */             I000O01llI0(o0iIl1);
/* 4 */             List listI00OIl = o0iIl1.I00OIl();
/* 40 */            return listI00OIl.subList(((!I000O01llI0(o0iIl1) || o0iIl1.getAnnotations().I00IOO(OlIllOO11lOl.I00100l0) == null) ? 0 : 1) + I00000oIO(o0iIl1), listI00OIl.size() - 1);
                }

                public static final boolean I000O01llI0(O0iIl1 o0iIl1) {
                    Illo0o illo0oI0000oI00;
/* 5 */             IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
/* 9 */             if (iOIiO1lIl0lI00100o1O0lo == null) {
/* 52 */                return false;
                    }
/* 13 */            if ((iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol) && O0i1lI0o1io.I00IioO0OiOi(iOIiO1lIl0lI00100o1O0lo)) {
/* 24 */                int i = IiOiOOIo.I00000oIO;
/* 30 */                illo0oI0000oI00 = I0000oI00(IiOiIO0i1Oil.I0001Ioi1lo(iOIiO1lIl0lI00100o1O0lo));
                    } else {
/* 22 */                illo0oI0000oI00 = null;
                    }
                    return O0000Ioio00.I0000O(illo0oI0000oI00, Illo01lli.I0000Il00O) || O0000Ioio00.I0000O(illo0oI0000oI00, Illo0liIIii.I0000Il00O);
                }
            }
