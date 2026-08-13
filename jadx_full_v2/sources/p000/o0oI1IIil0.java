            package p000;

            import java.util.ArrayList;
            import java.util.BitSet;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public final class o0oI1IIil0 {
                public String I00000oIO;
                public boolean I00000oOI;
                public final l10lii1 I0000Il00O;
                public BitSet I0000O;
                public BitSet I0000oI00;
                public I1Io0i0II I0001Ioi1lo;
                public I1Io0i0II I000II = new I1Io0i0II(0);
                public i1lioiII I000O01llI0;

                public o0oI1IIil0(i1lioiII i1lioiii, String str, l10lii1 l10lii1Var, BitSet bitSet, BitSet bitSet2, I1Io0i0II i1Io0i0II, I1Io0i0II i1Io0i0II2) {
/* 4 */             this.I000O01llI0 = i1lioiii;
/* 6 */             this.I00000oIO = str;
/* 8 */             this.I0000O = bitSet;
/* 10 */            this.I0000oI00 = bitSet2;
/* 12 */            this.I0001Ioi1lo = i1Io0i0II;
/* 28 */            Iterator it = ((I1Illo1io0) i1Io0i0II2.keySet()).iterator();
/* 36 */            while (it.hasNext()) {
/* 42 */                Integer num = (Integer) it.next();
/* 46 */                ArrayList arrayList = new ArrayList();
/* 55 */                arrayList.add((Long) i1Io0i0II2.get(num));
/* 60 */                this.I000II.put(num, arrayList);
                    }
/* 64 */            this.I00000oOI = false;
/* 66 */            this.I0000Il00O = l10lii1Var;
                }

                public final void I00000oIO(i1IIil1 i1iiil1) {
                    int iI001IIilI0O;
/* 1 */             String str = this.I00000oIO;
/* 3 */             I1Io0i0II i1Io0i0II = this.I000II;
/* 5 */             I1Io0i0II i1Io0i0II2 = this.I0001Ioi1lo;
                    switch (i1iiil1.I000II) {
                        case 0:
/* 25 */                    iI001IIilI0O = ((ioI0OO10) i1iiil1.I000OOo1O).I001IIilI0O();
                            break;
                        default:
/* 16 */                    iI001IIilI0O = ((ioOIO1il0i) i1iiil1.I000OOo1O).I001IIilI0O();
                            break;
                    }
/* 31 */            boolean z = true;
/* 32 */            if (i1iiil1.I0000Il00O != null) {
/* 36 */                this.I0000oI00.set(iI001IIilI0O, true);
                    }
/* 39 */            Boolean bool = i1iiil1.I0000O;
/* 41 */            if (bool != null) {
/* 49 */                this.I0000O.set(iI001IIilI0O, bool.booleanValue());
                    }
/* 56 */            if (i1iiil1.I0000oI00 != null) {
/* 58 */                Integer numValueOf = Integer.valueOf(iI001IIilI0O);
/* 66 */                Long l = (Long) i1Io0i0II2.get(numValueOf);
/* 74 */                long jLongValue = i1iiil1.I0000oI00.longValue() / 1000;
/* 75 */                if (l == null || jLongValue > l.longValue()) {
/* 89 */                    i1Io0i0II2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                    }
/* 94 */            if (i1iiil1.I0001Ioi1lo != null) {
/* 96 */                Integer numValueOf2 = Integer.valueOf(iI001IIilI0O);
/* 104 */               List arrayList = (List) i1Io0i0II.get(numValueOf2);
/* 106 */               if (arrayList == null) {
/* 110 */                   arrayList = new ArrayList();
/* 113 */                   i1Io0i0II.put(numValueOf2, arrayList);
                        }
/* 118 */               boolean zI001l0I00 = false;
                        switch (i1iiil1.I000II) {
                            case 0:
/* 123 */                       z = false;
                                break;
                        }
/* 124 */               if (z) {
/* 126 */                   arrayList.clear();
                        }
/* 129 */               iIIOllOi.I00000oIO();
/* 136 */               l0olllO1i l0olllo1i = (l0olllO1i) this.I000O01llI0.I00iOIl;
/* 138 */               iIl1iil iil1iil = l0olllo1i.I00iio;
/* 140 */               iol01I0001 iol01i0001 = iol1II1ii1i.I00oOio10iI1;
/* 146 */               if (iil1iil.I01101IOlO(str, iol01i0001)) {
                            switch (i1iiil1.I000II) {
                                case 0:
/* 158 */                           zI001l0I00 = ((ioI0OO10) i1iiil1.I000OOo1O).I001l0I00();
                                    break;
                            }
/* 162 */                   if (zI001l0I00) {
/* 164 */                       arrayList.clear();
                            }
                        }
/* 167 */               iIIOllOi.I00000oIO();
/* 172 */               boolean zI01101IOlO = l0olllo1i.I00iio.I01101IOlO(str, iol01i0001);
/* 176 */               Long l2 = i1iiil1.I0001Ioi1lo;
/* 178 */               if (!zI01101IOlO) {
/* 208 */                   arrayList.add(Long.valueOf(l2.longValue() / 1000));
/* 211 */                   return;
                        }
/* 185 */               Long lValueOf = Long.valueOf(l2.longValue() / 1000);
/* 193 */               if (arrayList.contains(lValueOf)) {
/* 211 */                   return;
                        }
/* 195 */               arrayList.add(lValueOf);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r8v6 */
                public final l0OOloOi10O I00000oOI(int i) {
                    ArrayList arrayList;
                    ?? arrayList2;
/* 1 */             I1Io0i0II i1Io0i0II = this.I000II;
/* 3 */             I1Io0i0II i1Io0i0II2 = this.I0001Ioi1lo;
/* 5 */             l0OIio0i l0oiio0iI001lIiIIo1O = l0OOloOi10O.I001lIiIIo1O();
/* 9 */             l0oiio0iI001lIiIIo1O.I0000Il00O();
/* 16 */            ((l0OOloOi10O) l0oiio0iI001lIiIIo1O.I00iiI).I001lllioOl(i);
/* 19 */            boolean z = this.I00000oOI;
/* 21 */            l0oiio0iI001lIiIIo1O.I0000Il00O();
/* 28 */            ((l0OOloOi10O) l0oiio0iI001lIiIIo1O.I00iiI).I00II0oii1o(z);
/* 31 */            l10lii1 l10lii1Var = this.I0000Il00O;
/* 33 */            if (l10lii1Var != null) {
/* 35 */                l0oiio0iI001lIiIIo1O.I0000Il00O();
/* 42 */                ((l0OOloOi10O) l0oiio0iI001lIiIIo1O.I00iiI).I00II0Ol1O0l(l10lii1Var);
                    }
/* 45 */            l10iIi0IIl0 l10iii0iil0I001lllioOl = l10lii1.I001lllioOl();
/* 51 */            ArrayList arrayListI01IO0oio = lio010i.I01IO0oio(this.I0000O);
/* 55 */            l10iii0iil0I001lllioOl.I0000Il00O();
/* 62 */            ((l10lii1) l10iii0iil0I001lllioOl.I00iiI).I00IO1(arrayListI01IO0oio);
/* 67 */            ArrayList arrayListI01IO0oio2 = lio010i.I01IO0oio(this.I0000oI00);
/* 71 */            l10iii0iil0I001lllioOl.I0000Il00O();
/* 78 */            ((l10lii1) l10iii0iil0I001lllioOl.I00iiI).I00II0Ol1O0l(arrayListI01IO0oio2);
/* 81 */            if (i1Io0i0II2 == null) {
/* 83 */                arrayList = null;
                    } else {
/* 89 */                arrayList = new ArrayList(i1Io0i0II2.I00iiO);
/* 98 */                Iterator it = ((I1Illo1io0) i1Io0i0II2.keySet()).iterator();
/* 106 */               while (it.hasNext()) {
/* 112 */                   Integer num = (Integer) it.next();
/* 114 */                   int iIntValue = num.intValue();
/* 122 */                   Long l = (Long) i1Io0i0II2.get(num);
/* 124 */                   if (l != null) {
/* 126 */                       l0ilIi01 l0ilii01I001i1lo1io = l0io11IIiil.I001i1lo1io();
/* 130 */                       l0ilii01I001i1lo1io.I0000Il00O();
/* 137 */                       ((l0io11IIiil) l0ilii01I001i1lo1io.I00iiI).I001iOo1i0O(iIntValue);
/* 140 */                       long jLongValue = l.longValue();
/* 144 */                       l0ilii01I001i1lo1io.I0000Il00O();
/* 151 */                       ((l0io11IIiil) l0ilii01I001i1lo1io.I00iiI).I001l0I00(jLongValue);
/* 160 */                       arrayList.add((l0io11IIiil) l0ilii01I001i1lo1io.I0000oI00());
                            }
                        }
                    }
/* 164 */           if (arrayList != null) {
/* 166 */               l10iii0iil0I001lllioOl.I0000Il00O();
/* 173 */               ((l10lii1) l10iii0iil0I001lllioOl.I00iiI).I00IOO(arrayList);
                    }
/* 176 */           if (i1Io0i0II == null) {
/* 178 */               arrayList2 = Collections.EMPTY_LIST;
                    } else {
/* 185 */               arrayList2 = new ArrayList(i1Io0i0II.I00iiO);
/* 194 */               Iterator it2 = ((I1Illo1io0) i1Io0i0II.keySet()).iterator();
/* 202 */               while (it2.hasNext()) {
/* 208 */                   Integer num2 = (Integer) it2.next();
/* 210 */                   l10oOiI0 l10ooii0I001iOo1i0O = l1100ll.I001iOo1i0O();
/* 214 */                   int iIntValue2 = num2.intValue();
/* 218 */                   l10ooii0I001iOo1i0O.I0000Il00O();
/* 225 */                   ((l1100ll) l10ooii0I001iOo1i0O.I00iiI).I001l0I00(iIntValue2);
/* 232 */                   List list = (List) i1Io0i0II.get(num2);
/* 234 */                   if (list != null) {
/* 236 */                       Collections.sort(list);
/* 239 */                       l10ooii0I001iOo1i0O.I0000Il00O();
/* 248 */                       ((l1100ll) l10ooii0I001iOo1i0O.I00iiI).I001lIiIIo1O(list);
                            }
/* 257 */                   arrayList2.add((l1100ll) l10ooii0I001iOo1i0O.I0000oI00());
                        }
                    }
/* 263 */           l10iii0iil0I001lllioOl.I0000Il00O();
/* 270 */           ((l10lii1) l10iii0iil0I001lllioOl.I00iiI).I00IlilI0i0i((List) arrayList2);
/* 273 */           l0oiio0iI001lIiIIo1O.I0000Il00O();
/* 286 */           ((l0OOloOi10O) l0oiio0iI001lIiIIo1O.I00iiI).I001lloI((l10lii1) l10iii0iil0I001lllioOl.I0000oI00());
/* 293 */           return (l0OOloOi10O) l0oiio0iI001lIiIIo1O.I0000oI00();
                }
            }
