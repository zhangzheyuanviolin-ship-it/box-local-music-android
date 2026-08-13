            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class lOoOoloI01i0 {
                /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final OoOI1i1i I00000oIO(OoOI1i1i ooOI1i1i, I11IlOOO i11IlOOO) {
                    I11IlOOO i11IlOOO2;
                    OoOI1i1i ooOI1i1iI00ll1;
/* 1 */             IIi0oIl iIi0oIl = I11O0o0loi.I00000oOI;
/* 3 */             O0O00I1Ili[] o0O00I1IliArr = I11O0o0loi.I00000oIO;
/* 6 */             O0O00I1Ili o0O00I1Ili = o0O00I1IliArr[0];
/* 12 */            I11O0Ol i11O0Ol = (I11O0Ol) iIi0oIl.I000O01llI0(ooOI1i1i);
/* 14 */            if (i11O0Ol == null || (i11IlOOO2 = i11O0Ol.I00000oIO) == null) {
/* 20 */                i11IlOOO2 = i1i0olI.I00iiO;
                    }
/* 22 */            if (i11IlOOO2 == i11IlOOO) {
/* 24 */                return ooOI1i1i;
                    }
/* 25 */            O0O00I1Ili o0O00I1Ili2 = o0O00I1IliArr[0];
/* 31 */            I11O0Ol i11O0Ol2 = (I11O0Ol) iIi0oIl.I000O01llI0(ooOI1i1i);
/* 33 */            if (i11O0Ol2 != null) {
/* 39 */                if (ooOI1i1i.isEmpty()) {
/* 88 */                    ooOI1i1iI00ll1 = ooOI1i1i;
/* 99 */                    if (ooOI1i1iI00ll1 != null) {
/* 102 */                       ooOI1i1i = ooOI1i1iI00ll1;
                            }
                        } else {
/* 42 */                    I1IlollII1lI i1IlollII1lI = ooOI1i1i.I00iOIl;
/* 46 */                    ArrayList arrayList = new ArrayList();
/* 57 */                    for (Object obj : i1IlollII1lI) {
/* 70 */                        if (!O0000Ioio00.I0000O((I11O0Ol) obj, i11O0Ol2)) {
/* 72 */                            arrayList.add(obj);
                                }
                            }
/* 86 */                    if (arrayList.size() != ooOI1i1i.I00iOIl.I00000oOI()) {
/* 92 */                        OoOI1i1i.I00iiI.getClass();
/* 95 */                        ooOI1i1iI00ll1 = IIlio101Io.I00ll1(arrayList);
                            }
/* 99 */                    if (ooOI1i1iI00ll1 != null) {
                            }
                        }
                    }
/* 111 */           if (i11IlOOO.iterator().hasNext() || !i11IlOOO.isEmpty()) {
/* 122 */               I11O0Ol i11O0Ol3 = new I11O0Ol(i11IlOOO);
/* 125 */               IIlio101Io iIlio101Io = OoOI1i1i.I00iiI;
/* 131 */               O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(I11O0Ol.class);
/* 135 */               iIlio101Io.getClass();
/* 152 */               if (ooOI1i1i.I00iOIl.get(iIlio101Io.I00oI0i(o0IOli0o0I00000oOI.I000O01llI0())) == null) {
                            return ooOI1i1i.isEmpty() ? new OoOI1i1i(Collections.singletonList(i11O0Ol3)) : IIlio101Io.I00ll1(IOOi0Ool1i.I00OI1(IOOi0Ool1i.I00iIi0i1o(ooOI1i1i), i11O0Ol3));
                        }
                    }
/* 154 */           return ooOI1i1i;
                }

                public static final OoOI1i1i I00000oOI(I11IlOOO i11IlOOO) {
/* 5 */             if (i11IlOOO.isEmpty()) {
/* 9 */                 OoOI1i1i.I00iiI.getClass();
/* 12 */                return OoOI1i1i.I00iiO;
                    }
/* 15 */            IIlio101Io iIlio101Io = OoOI1i1i.I00iiI;
/* 22 */            List listSingletonList = Collections.singletonList(new I11O0Ol(i11IlOOO));
/* 26 */            iIlio101Io.getClass();
/* 29 */            return IIlio101Io.I00ll1(listSingletonList);
                }
            }
