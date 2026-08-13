            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            
            public final class Illlll00 extends Ol0IioOo {
                public Illlll00(Ii1Ool1 ii1Ool1, Illlll00 illlll00, int i, boolean z) {
/* 11 */            super(ii1Ool1, illlll00, i1i0olI.I00iiO, OIiiIOl10O.I000II, i, OlI1o0ooI.I00IO1);
/* 15 */            this.I00lli11 = true;
/* 17 */            this.I00oO101o = z;
/* 20 */            this.I00oOio10iI1 = false;
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return false;
                }

                @Override
                public final boolean I001IIilI0O() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00IOO() {
/* 1 */             return false;
                }

                @Override
                public final Illll0i I010l10O(int i, I11IlOOO i11IlOOO, Ii1Ool1 ii1Ool1, Illlil illlil, OI1Iio0ii1 oI1Iio0ii1, OlI1o0ooI olI1o0ooI) {
/* 7 */             return new Illlll00(ii1Ool1, (Illlll00) illlil, i, this.I00oO101o);
                }

                @Override
                public final Illll0i I010l1O(IllliloOi illliloOi) {
                    OI1Iio0ii1 oI1Iio0ii1;
/* 5 */             Illlll00 illlll00 = (Illlll00) super.I010l1O(illliloOi);
/* 7 */             if (illlll00 == null) {
/* 9 */                 return null;
                    }
/* 11 */            List listI00Iooi00oi = illlll00.I00Iooi00oi();
/* 19 */            if ((listI00Iooi00oi instanceof Collection) && listI00Iooi00oi.isEmpty()) {
/* 966 */               return illlll00;
                    }
/* 32 */            Iterator it = listI00Iooi00oi.iterator();
/* 40 */            while (it.hasNext()) {
/* 56 */                if (ilioooOo11.I0000Il00O(((Ooo00oi0O) it.next()).getType()) != null) {
/* 58 */                    List listI00Iooi00oi2 = illlll00.I00Iooi00oi();
/* 72 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00Iooi00oi2, 10));
/* 75 */                    Iterator it2 = listI00Iooi00oi2.iterator();
/* 83 */                    while (it2.hasNext()) {
/* 99 */                        arrayList.add(ilioooOo11.I0000Il00O(((Ooo00oi0O) it2.next()).getType()));
                            }
/* 115 */                   int size = illlll00.I00Iooi00oi().size() - arrayList.size();
/* 116 */                   boolean z = true;
/* 117 */                   if (size == 0) {
/* 125 */                       ArrayList arrayListI00ilO0 = IOOi0Ool1i.I00ilO0(arrayList, illlll00.I00Iooi00oi());
/* 133 */                       if (arrayListI00ilO0.isEmpty()) {
/* 966 */                           return illlll00;
                                }
/* 137 */                       Iterator it3 = arrayListI00ilO0.iterator();
/* 145 */                       while (it3.hasNext()) {
/* 151 */                           OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) it3.next();
/* 169 */                           if (!O0000Ioio00.I0000O((OI1Iio0ii1) oIoi0IIoi.I00iOIl, ((Ooo00oi0O) oIoi0IIoi.I00iiI).getName())) {
                                    }
                                }
/* 966 */                       return illlll00;
                            }
/* 171 */                   List<Ooo00oi0O> listI00Iooi00oi3 = illlll00.I00Iooi00oi();
/* 183 */                   ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI00Iooi00oi3, 10));
/* 194 */                   for (Ooo00oi0O ooo00oi0O : listI00Iooi00oi3) {
/* 202 */                       OI1Iio0ii1 name = ooo00oi0O.getName();
/* 206 */                       int i = ooo00oi0O.I00ilO0;
/* 208 */                       int i2 = i - size;
/* 210 */                       if (i2 >= 0 && (oI1Iio0ii1 = (OI1Iio0ii1) arrayList.get(i2)) != null) {
/* 220 */                           name = oI1Iio0ii1;
                                }
/* 225 */                       arrayList2.add(ooo00oi0O.I010iIIOlo(illlll00, name, i));
                            }
/* 231 */                   IllliloOi illliloOiI010o0o0oO = illlll00.I010o0o0oO(OoOilII0.I00000oOI);
/* 240 */                   if (arrayList.isEmpty()) {
/* 242 */                       z = false;
                            } else {
/* 244 */                       Iterator it4 = arrayList.iterator();
/* 252 */                       while (it4.hasNext()) {
/* 260 */                           if (((OI1Iio0ii1) it4.next()) == null) {
                                        break;
                                    }
                                }
/* 242 */                       z = false;
                            }
/* 266 */                   illliloOiI010o0o0oO.I00oOio10iI1 = Boolean.valueOf(z);
/* 268 */                   illliloOiI010o0o0oO.I00io1l = arrayList2;
/* 274 */                   illliloOiI010o0o0oO.I00ilI0I1 = illlll00.I00000oIO();
/* 276 */                   return super.I010l1O(illliloOiI010o0o0oO);
                        }
                    }
/* 966 */           return illlll00;
                }
            }
