            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
/* 10 */    public final class O1lIIliooi implements IllOOo00lI {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;

                public O1lIIliooi(OI10i0Il oI10i0Il, int i) {
/* 2 */             this.I00iOIl = 0;
/* 7 */             this.I00iiO = oI10i0Il;
/* 9 */             this.I00iiI = i;
                }

                @Override
                public final Object invoke() {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 105 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 107 */                   int i2 = this.I00iiI;
/* 113 */                   List list = (List) oI10i0Il.getValue();
/* 119 */                   ArrayList arrayList = new ArrayList();
/* 126 */                   int i3 = 0;
/* 131 */                   for (Object obj : list) {
/* 137 */                       int i4 = i3 + 1;
/* 139 */                       if (i3 < 0) {
/* 151 */                           IOOi1I.I000lI();
/* 154 */                           throw null;
                                }
/* 144 */                       if (i3 != i2) {
/* 146 */                           arrayList.add(obj);
                                }
/* 149 */                       i3 = i4;
                            }
/* 155 */                   oI10i0Il.setValue(arrayList);
/* 158 */                   return ooiIlOl1iI;
                        case 1:
/* 99 */                    return new IiI0O1Io(this.I00iiI, 0.0f, (IllOOo00lI) this.I00iiO);
                        case 2:
/* 73 */                    OiiO01I11iI oiiO01I11iI = (OiiO01I11iI) this.I00iiO;
/* 85 */                    return Integer.valueOf(oiiO01I11iI.I0001Ioi1lo.I00000oOI.I0000O(this.I00iiI));
                        default:
/* 13 */                    OilIlo oilIlo = (OilIlo) this.I00iiO;
/* 15 */                    int i5 = this.I00iiI;
/* 17 */                    OlO0OIIl1 olO0OIIl1 = oilIlo.I00000oOI;
/* 31 */                    ArrayList arrayList2 = new ArrayList(((OilIl00O1o) olO0OIIl1.getValue()).I0000O);
/* 34 */                    if (i5 >= 0 && i5 < arrayList2.size()) {
/* 42 */                        arrayList2.remove(i5);
/* 67 */                        olO0OIIl1.I000lI(null, OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl1.getValue(), false, false, null, arrayList2, null, false, false, false, false, null, 1015));
                            }
/* 70 */                    return ooiIlOl1iI;
                    }
                }

/* 11 */        public O1lIIliooi(int i) {
/* 12 */            this.I00iOIl = i;
                }
            }
