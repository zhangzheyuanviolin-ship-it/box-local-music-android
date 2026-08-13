            package p000;
            
            public final class Oll1iiOII implements IlliIl1l11O {
                public final int I00iOIl;

                public Oll1iiOII(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Exception {
                    switch (this.I00iOIl) {
                        case 0:
/* 273 */                   return (Oll1lO) ((OIooliIO0) ((Oll1l0IOli) obj2).I00000oIO.I000II).getValue();
                        case 1:
/* 254 */                   return Integer.valueOf(((O1iIo0ll) obj).I0000Il00O(((Integer) obj2).intValue()));
                        case 2:
/* 237 */                   return Integer.valueOf(((O1iIo0ll) obj).I00OI1(((Integer) obj2).intValue()));
                        case 3:
/* 220 */                   return Integer.valueOf(((O1iIo0ll) obj).I000l1(((Integer) obj2).intValue()));
                        case 4:
/* 203 */                   return Integer.valueOf(((O1iIo0ll) obj).I001iOo1i0O(((Integer) obj2).intValue()));
                        case 5:
/* 152 */                   Oo0I110i oo0I110i = (Oo0I110i) obj2;
/* 186 */                   return IOOi1I.I000O01llI0(Float.valueOf(oo0I110i.I00000oIO.I000II()), Boolean.valueOf(((OIilII) oo0I110i.I0001Ioi1lo.getValue()) == OIilII.I00iOIl));
                        case 6:
/* 117 */                   OiIiOi0II oiIiOi0II = (OiIiOi0II) obj;
/* 119 */                   Oo0OI01Il oo0OI01Il = (Oo0OI01Il) obj2;
/* 145 */                   return IOOi1I.I00000oIO(OiO0O10ii001.I00000oOI(oo0OI01Il.I00000oIO, OiO0O10ii001.I00000oIO, oiIiOi0II), OiO0O10ii001.I00000oOI(Oo0lI00l.I00000oIO(oo0OI01Il.I00000oOI), OiO0O10ii001.I00100l0, oiIiOi0II));
                        case 7:
/* 96 */                    Integer num = (Integer) obj;
/* 98 */                    num.intValue();
/* 113 */                   return new OIoi0IIoi(OlOoOIi0o.I00OIo((String) obj2).toString(), num);
                        case 8:
/* 65 */                    Ii00ilI1 ii00ilI1 = (Ii00ilI1) obj2;
/* 69 */                    if (!(ii00ilI1 instanceof Oo0ooO0ll0)) {
/* 95 */                        return obj;
                            }
/* 76 */                    Integer num2 = obj instanceof Integer ? (Integer) obj : null;
/* 85 */                    int iIntValue = num2 != null ? num2.intValue() : 1;
                            return iIntValue == 0 ? ii00ilI1 : Integer.valueOf(iIntValue + 1);
                        case 9:
/* 49 */                    Oo0ooO0ll0 oo0ooO0ll0 = (Oo0ooO0ll0) obj;
/* 51 */                    Ii00ilI1 ii00ilI12 = (Ii00ilI1) obj2;
/* 53 */                    if (oo0ooO0ll0 != null) {
/* 55 */                        return oo0ooO0ll0;
                            }
/* 59 */                    if (ii00ilI12 instanceof Oo0ooO0ll0) {
/* 62 */                        return (Oo0ooO0ll0) ii00ilI12;
                            }
/* 3 */                     return null;
                        case 10:
/* 18 */                    Oo10Ii01I0i1 oo10Ii01I0i1 = (Oo10Ii01I0i1) obj;
/* 20 */                    Ii00ilI1 ii00ilI13 = (Ii00ilI1) obj2;
/* 24 */                    if (ii00ilI13 instanceof Oo0ooO0ll0) {
/* 26 */                        Oo0ooO0ll0 oo0ooO0ll02 = (Oo0ooO0ll0) ii00ilI13;
/* 28 */                        Ii00l101O ii00l101O = oo10Ii01I0i1.I00000oIO;
/* 30 */                        Object objI00Ol00 = oo0ooO0ll02.I00Ol00();
/* 34 */                        Object[] objArr = oo10Ii01I0i1.I00000oOI;
/* 36 */                        int i = oo10Ii01I0i1.I0000O;
/* 38 */                        objArr[i] = objI00Ol00;
/* 40 */                        Oo0ooO0ll0[] oo0ooO0ll0Arr = oo10Ii01I0i1.I0000Il00O;
/* 44 */                        oo10Ii01I0i1.I0000O = i + 1;
/* 46 */                        oo0ooO0ll0Arr[i] = oo0ooO0ll02;
                            }
/* 48 */                    return oo10Ii01I0i1;
                        default:
/* 12 */                    lolOiIoiillI.I00l0I0l0lO1.invoke(obj);
/* 15 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
