            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            
            public final class O0IoIioI implements IllOOo00lI {
                public final int I00iOIl;
                public O0IoOilol1 I00iiI;
                public O0Iol0OO1O I00iiO;

                public O0IoIioI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    String str;
                    switch (this.I00iOIl) {
                        case 0:
/* 82 */                    O0IoOilol1 o0IoOilol1 = this.I00iiI;
/* 84 */                    O0Iol0OO1O o0Iol0OO1O = this.I00iiO;
/* 86 */                    OOoOiOo01lo oOoOiOo01lo = o0IoOilol1.I0000Il00O;
/* 91 */                    O0O00I1Ili o0O00I1Ili = O0IoOilol1.I0001Ioi1lo[0];
/* 97 */                    OOoOI1lIOi oOoOI1lIOi = (OOoOI1lIOi) oOoOiOo01lo.invoke();
/* 99 */                    if (oOoOI1lIOi != null) {
/* 101 */                       O0i1llII o0i1llII = oOoOI1lIOi.I00000oOI;
/* 105 */                       str = (String) o0i1llII.I000O01llI0;
/* 113 */                       if (((O0i1lIiil) o0i1llII.I0000Il00O) != O0i1lIiil.I00l0I0l0lO1) {
/* 116 */                           str = null;
                                }
                            }
/* 117 */                   if (str == null || str.length() <= 0) {
/* 3 */                         return null;
                            }
/* 139 */                   return o0Iol0OO1O.I00iiI.getClassLoader().loadClass(str.replace('/', '.'));
                        default:
/* 7 */                     O0IoOilol1 o0IoOilol12 = this.I00iiI;
/* 14 */                    O0Ii1II o0Ii1II = new O0Ii1II(this.I00iiO, 1);
/* 17 */                    OOoOiOo01lo oOoOiOo01lo2 = o0IoOilol12.I0000O;
/* 21 */                    O0O00I1Ili o0O00I1Ili2 = O0IoOilol1.I0001Ioi1lo[1];
/* 30 */                    Collection<Ii1Ool1> collectionI00000oIO = lIoi00l.I00000oIO((O1iil1I01o) oOoOiOo01lo2.invoke(), null, 3);
/* 38 */                    ArrayList arrayList = new ArrayList();
/* 49 */                    for (Ii1Ool1 ii1Ool1 : collectionI00000oIO) {
/* 70 */                        IiO10i1 iiO10i1 = ii1Ool1 instanceof IIiO00o1o ? (IiO10i1) ii1Ool1.I00IoIO0lI(o0Ii1II, OoiIlOl1iI.I00000oIO) : null;
/* 71 */                        if (iiO10i1 != null) {
/* 73 */                            arrayList.add(iiO10i1);
                                }
                            }
/* 77 */                    return IOOi0Ool1i.I00iIi0i1o(arrayList);
                    }
                }
            }
