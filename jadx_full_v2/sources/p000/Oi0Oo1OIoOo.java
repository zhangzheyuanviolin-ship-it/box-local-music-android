            package p000;

            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.util.Pair;
            import android.util.Rational;
            import android.util.Size;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Objects;
            
            public final class Oi0Oo1OIoOo {
                public static final double I000O01llI0 = Math.sqrt(2.3703703703703702d);
                public final Size I00000oIO;
                public final Rational I00000oOI;
                public final Rational I0000Il00O;
                public final HashSet I0000O;
                public final OlilOlOiI I0000oI00;
                public final IIllOioOlolI I0001Ioi1lo;
                public final HashMap I000II;

                public Oi0Oo1OIoOo(IIllOo0 iIllOo0, HashSet hashSet) {
/* 9 */             Size sizeI0001Ioi1lo = OoI0lIiO.I0001Ioi1lo(iIllOo0.I0010o().I000OOo1O());
/* 13 */            IIllOioOlolI iIllOioOlolII0010o = iIllOo0.I0010o();
/* 19 */            OlilOlOiI olilOlOiI = new OlilOlOiI(iIllOioOlolII0010o, sizeI0001Ioi1lo);
/* 30 */            this.I000II = new HashMap();
/* 32 */            this.I00000oIO = sizeI0001Ioi1lo;
/* 54 */            Rational rational = ((double) sizeI0001Ioi1lo.getWidth()) / ((double) sizeI0001Ioi1lo.getHeight()) > I000O01llI0 ? I1O0oI0ol.I0000Il00O : I1O0oI0ol.I00000oIO;
/* 56 */            sizeI0001Ioi1lo.toString();
/* 59 */            Objects.toString(rational);
/* 65 */            l11I11lO.I0000O(3, "ResolutionsMerger");
/* 68 */            this.I00000oOI = rational;
/* 70 */            Rational rational2 = I1O0oI0ol.I00000oIO;
/* 76 */            if (rational.equals(rational2)) {
/* 78 */                rational2 = I1O0oI0ol.I0000Il00O;
                    } else if (!rational.equals(I1O0oI0ol.I0000Il00O)) {
/* 100 */               IioIoO10iOiI.I000OiO("Invalid sensor aspect-ratio: ", rational);
/* 106 */               throw null;
                    }
/* 89 */            this.I0000Il00O = rational2;
/* 91 */            this.I0001Ioi1lo = iIllOioOlolII0010o;
/* 93 */            this.I0000O = hashSet;
/* 95 */            this.I0000oI00 = olilOlOiI;
                }

                public static Rect I00000oIO(Size size, Size size2) {
                    RectF rectF;
                    RectF rectF2;
/* 1 */             Rational rationalI000O01llI0 = I000O01llI0(size2);
/* 5 */             int width = size.getWidth();
/* 9 */             int height = size.getHeight();
/* 13 */            Rational rationalI000O01llI02 = I000O01llI0(size);
/* 28 */            if (rationalI000O01llI0.floatValue() == rationalI000O01llI02.floatValue()) {
/* 34 */                rectF2 = new RectF(0.0f, 0.0f, width, height);
                    } else {
/* 50 */                if (rationalI000O01llI0.floatValue() > rationalI000O01llI02.floatValue()) {
                            float f = width;
/* 57 */                    float fFloatValue = f / rationalI000O01llI0.floatValue();
/* 61 */                    float f2 = (height - fFloatValue) / 2.0f;
/* 65 */                    rectF = new RectF(0.0f, f2, f, fFloatValue + f2);
                        } else {
                            float f3 = height;
/* 75 */                    float fFloatValue2 = rationalI000O01llI0.floatValue() * f3;
/* 78 */                    float f4 = (width - fFloatValue2) / 2.0f;
/* 82 */                    rectF = new RectF(f4, 0.0f, fFloatValue2 + f4, f3);
                        }
/* 68 */                rectF2 = rectF;
                    }
/* 88 */            Rect rect = new Rect();
/* 91 */            rectF2.round(rect);
/* 106 */           return rect;
                }

                public static boolean I0000O(Size size, Size size2) {
                    return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
                }

                public static Rational I000O01llI0(Size size) {
/* 11 */            return new Rational(size.getWidth(), size.getHeight());
                }

                public final OOI1i0iI I00000oOI(OolIl0ii1 oolIl0ii1, Rect rect, int i, boolean z) {
                    boolean z2;
                    Size size;
                    Size size2;
                    Pair pairCreate;
/* 5 */             if (OoI0lIiO.I0000Il00O(i)) {
/* 22 */                z2 = true;
/* 17 */                rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
                    } else {
/* 25 */                z2 = false;
                    }
/* 26 */            if (z) {
/* 28 */                Size sizeI0001Ioi1lo = OoI0lIiO.I0001Ioi1lo(rect);
/* 36 */                Iterator it = I0000Il00O(oolIl0ii1).iterator();
                        while (true) {
/* 44 */                    if (!it.hasNext()) {
/* 71 */                        pairCreate = Pair.create(sizeI0001Ioi1lo, sizeI0001Ioi1lo);
                                break;
                            }
/* 50 */                    Size size3 = (Size) it.next();
/* 56 */                    Size sizeI0001Ioi1lo2 = OoI0lIiO.I0001Ioi1lo(I00000oIO(size3, sizeI0001Ioi1lo));
/* 64 */                    if (!I0000O(sizeI0001Ioi1lo2, sizeI0001Ioi1lo)) {
/* 66 */                        pairCreate = Pair.create(size3, sizeI0001Ioi1lo2);
                                break;
                            }
                        }
/* 77 */                size = (Size) pairCreate.first;
/* 81 */                size2 = (Size) pairCreate.second;
                    } else {
/* 84 */                Size sizeI0001Ioi1lo3 = OoI0lIiO.I0001Ioi1lo(rect);
/* 88 */                List listI0000Il00O = I0000Il00O(oolIl0ii1);
/* 92 */                Iterator it2 = listI0000Il00O.iterator();
                        while (true) {
/* 100 */                   if (!it2.hasNext()) {
/* 145 */                       Iterator it3 = listI0000Il00O.iterator();
                                while (true) {
/* 153 */                           if (!it3.hasNext()) {
/* 168 */                               size = sizeI0001Ioi1lo3;
                                        break;
                                    }
/* 159 */                           size = (Size) it3.next();
/* 165 */                           if (!I0000O(size, sizeI0001Ioi1lo3)) {
                                        break;
                                    }
                                }
                            } else {
/* 106 */                       Size size4 = (Size) it2.next();
/* 108 */                       Rational rationalI000O01llI0 = I1O0oI0ol.I00000oIO;
/* 114 */                       if (!I1O0oI0ol.I00000oIO(rationalI000O01llI0, sizeI0001Ioi1lo3)) {
/* 117 */                           rationalI000O01llI0 = I1O0oI0ol.I0000Il00O;
/* 123 */                           if (!I1O0oI0ol.I00000oIO(rationalI000O01llI0, sizeI0001Ioi1lo3)) {
/* 126 */                               rationalI000O01llI0 = I000O01llI0(sizeI0001Ioi1lo3);
                                    }
                                }
/* 134 */                       if (!I0000oI00(rationalI000O01llI0, size4) && !I0000O(size4, sizeI0001Ioi1lo3)) {
/* 143 */                           size = size4;
                                    break;
                                }
                            }
                        }
/* 169 */               rect = I00000oIO(sizeI0001Ioi1lo3, size);
/* 173 */               size2 = size;
                    }
                    return z2 ? new OOI1i0iI(new Rect(rect.top, rect.left, rect.bottom, rect.right), new Size(size2.getHeight(), size2.getWidth()), size) : new OOI1i0iI(rect, size2, size);
                }

                public final List I0000Il00O(OolIl0ii1 oolIl0ii1) {
                    Rational rationalI000O01llI0;
/* 8 */             if (!this.I0000O.contains(oolIl0ii1)) {
/* 159 */               IioIoO10iOiI.I000OiO("Invalid child config: ", oolIl0ii1);
/* 7 */                 return null;
                    }
/* 10 */            HashMap map = this.I000II;
/* 16 */            if (map.containsKey(oolIl0ii1)) {
/* 22 */                List list = (List) map.get(oolIl0ii1);
/* 24 */                Objects.requireNonNull(list);
/* 27 */                return list;
                    }
/* 32 */            ArrayList<Size> arrayListI000oI1ioi = this.I0000oI00.I000oI1ioi(oolIl0ii1);
/* 38 */            HashMap map2 = new HashMap();
/* 43 */            ArrayList arrayList = new ArrayList();
/* 54 */            for (Size size : arrayListI000oI1ioi) {
/* 66 */                Iterator it = map2.keySet().iterator();
                        while (true) {
/* 74 */                    if (!it.hasNext()) {
/* 89 */                        rationalI000O01llI0 = null;
                                break;
                            }
/* 80 */                    rationalI000O01llI0 = (Rational) it.next();
/* 86 */                    if (I1O0oI0ol.I00000oIO(rationalI000O01llI0, size)) {
                                break;
                            }
                        }
/* 90 */                if (rationalI000O01llI0 != null) {
/* 96 */                    Size size2 = (Size) map2.get(rationalI000O01llI0);
/* 98 */                    Objects.requireNonNull(size2);
/* 109 */                   if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                            }
                        } else {
/* 142 */                   rationalI000O01llI0 = I000O01llI0(size);
                        }
/* 146 */               arrayList.add(size);
/* 149 */               map2.put(rationalI000O01llI0, size);
                    }
/* 153 */           map.put(oolIl0ii1, arrayList);
/* 156 */           return arrayList;
                }

                public final boolean I0000oI00(Rational rational, Size size) {
/* 1 */             Rational rational2 = this.I00000oOI;
/* 7 */             if (rational2.equals(rational) || I1O0oI0ol.I00000oIO(rational, size)) {
/* 70 */                return false;
                    }
/* 16 */            float fFloatValue = rational2.floatValue();
/* 20 */            float fFloatValue2 = rational.floatValue();
/* 24 */            Rational rationalI000O01llI0 = I1O0oI0ol.I00000oIO;
/* 30 */            if (!I1O0oI0ol.I00000oIO(rationalI000O01llI0, size)) {
/* 33 */                rationalI000O01llI0 = I1O0oI0ol.I0000Il00O;
/* 39 */                if (!I1O0oI0ol.I00000oIO(rationalI000O01llI0, size)) {
/* 42 */                    rationalI000O01llI0 = I000O01llI0(size);
                        }
                    }
/* 46 */            float fFloatValue3 = rationalI000O01llI0.floatValue();
/* 52 */            if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
/* 70 */                return false;
                    }
                    return fFloatValue > fFloatValue2 ? fFloatValue2 < fFloatValue3 : fFloatValue2 > fFloatValue3;
                }

                public final ArrayList I0001Ioi1lo(List list, boolean z) {
                    List arrayList;
/* 3 */             HashMap map = new HashMap();
/* 6 */             Rational rational = I1O0oI0ol.I00000oIO;
/* 13 */            map.put(rational, new ArrayList());
/* 16 */            Rational rational2 = I1O0oI0ol.I0000Il00O;
/* 23 */            map.put(rational2, new ArrayList());
/* 28 */            ArrayList arrayList2 = new ArrayList();
/* 31 */            arrayList2.add(rational);
/* 34 */            arrayList2.add(rational2);
/* 37 */            Iterator it = list.iterator();
/* 45 */            while (it.hasNext()) {
/* 51 */                Size size = (Size) it.next();
/* 57 */                if (size.getHeight() > 0) {
/* 60 */                    Iterator it2 = arrayList2.iterator();
                            while (true) {
/* 68 */                        if (!it2.hasNext()) {
/* 89 */                            arrayList = null;
                                    break;
                                }
/* 74 */                        Rational rational3 = (Rational) it2.next();
/* 80 */                        if (I1O0oI0ol.I00000oIO(rational3, size)) {
/* 86 */                            arrayList = (List) map.get(rational3);
                                    break;
                                }
                            }
/* 90 */                    if (arrayList == null) {
/* 94 */                        arrayList = new ArrayList();
/* 97 */                        Rational rationalI000O01llI0 = I000O01llI0(size);
/* 101 */                       arrayList2.add(rationalI000O01llI0);
/* 104 */                       map.put(rationalI000O01llI0, arrayList);
                            }
/* 109 */                   arrayList.add(size);
                        }
                    }
/* 119 */           ArrayList arrayList3 = new ArrayList(map.keySet());
/* 124 */           Rational rationalI000O01llI02 = I000O01llI0(this.I00000oIO);
/* 131 */           II1liooilI iI1liooilI = new II1liooilI(6);
/* 134 */           iI1liooilI.I00iiI = rationalI000O01llI02;
/* 136 */           VarHandle.storeStoreFence();
/* 139 */           Collections.sort(arrayList3, iI1liooilI);
/* 144 */           ArrayList arrayList4 = new ArrayList();
/* 147 */           Iterator it3 = arrayList3.iterator();
/* 155 */           while (it3.hasNext()) {
/* 161 */               Rational rational4 = (Rational) it3.next();
/* 169 */               if (!rational4.equals(I1O0oI0ol.I0000Il00O) && !rational4.equals(I1O0oI0ol.I00000oIO)) {
/* 184 */                   List list2 = (List) map.get(rational4);
/* 186 */                   Objects.requireNonNull(list2);
/* 195 */                   arrayList4.addAll(I000II(rational4, list2, z));
                        }
                    }
/* 332 */           return arrayList4;
                }

                public final ArrayList I000II(Rational rational, List list, boolean z) {
                    ArrayList arrayList;
/* 3 */             ArrayList<Size> arrayList2 = new ArrayList();
/* 6 */             Iterator it = list.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                Size size = (Size) it.next();
/* 26 */                if (I1O0oI0ol.I00000oIO(rational, size)) {
/* 28 */                    arrayList2.add(size);
                        }
                    }
/* 38 */            Collections.sort(arrayList2, new IOi101(true));
/* 43 */            HashSet hashSet = new HashSet(arrayList2);
/* 48 */            Iterator it2 = this.I0000O.iterator();
/* 56 */            while (it2.hasNext()) {
/* 64 */                List<Size> listI0000Il00O = I0000Il00O((OolIl0ii1) it2.next());
/* 68 */                if (!z) {
/* 72 */                    ArrayList arrayList3 = new ArrayList();
/* 83 */                    for (Size size2 : listI0000Il00O) {
/* 95 */                        if (!I0000oI00(rational, size2)) {
/* 97 */                            arrayList3.add(size2);
                                }
                            }
/* 101 */                   listI0000Il00O = arrayList3;
                        }
/* 106 */               if (listI0000Il00O.isEmpty()) {
/* 110 */                   return new ArrayList();
                        }
/* 118 */               if (listI0000Il00O.isEmpty() || arrayList2.isEmpty()) {
/* 178 */                   arrayList2 = new ArrayList();
                        } else {
/* 129 */                   ArrayList arrayList4 = new ArrayList();
/* 140 */                   for (Size size3 : arrayList2) {
/* 148 */                       Iterator it3 = listI0000Il00O.iterator();
                                while (true) {
/* 156 */                           if (!it3.hasNext()) {
                                        break;
                                    }
/* 168 */                           if (!I0000O((Size) it3.next(), size3)) {
/* 170 */                               arrayList4.add(size3);
                                        break;
                                    }
                                }
                            }
/* 174 */                   arrayList2 = arrayList4;
                        }
/* 185 */               if (listI0000Il00O.isEmpty() || arrayList2.isEmpty()) {
/* 277 */                   arrayList = new ArrayList();
                        } else {
/* 209 */                   ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
/* 214 */                   arrayList = new ArrayList();
/* 225 */                   for (Size size4 : arrayList5) {
/* 233 */                       Iterator it4 = listI0000Il00O.iterator();
                                while (true) {
/* 241 */                           if (!it4.hasNext()) {
/* 256 */                               arrayList.add(size4);
                                        break;
                                    }
/* 253 */                           if (I0000O((Size) it4.next(), size4)) {
                                        break;
                                    }
                                }
                            }
/* 264 */                   if (!arrayList.isEmpty()) {
/* 271 */                       arrayList.remove(arrayList.size() - 1);
                            }
                        }
/* 280 */               hashSet.retainAll(arrayList);
                    }
/* 287 */           ArrayList arrayList6 = new ArrayList();
/* 298 */           for (Size size5 : arrayList2) {
/* 310 */               if (!hashSet.contains(size5)) {
/* 312 */                   arrayList6.add(size5);
                        }
                    }
/* 408 */           return arrayList6;
                }
            }
