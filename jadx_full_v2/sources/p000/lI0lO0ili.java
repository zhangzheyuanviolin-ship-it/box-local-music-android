            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.function.Function;
            
            public final class lI0lO0ili implements Function {
                public static final lI0lO0ili I00000oOI = new lI0lO0ili(0);
                public static final lI0lO0ili I0000Il00O = new lI0lO0ili(1);
                public static final lI0lO0ili I0000O = new lI0lO0ili(2);
                public static final lI0lO0ili I0000oI00 = new lI0lO0ili(3);
                public static final lI0lO0ili I0001Ioi1lo = new lI0lO0ili(4);
                public final int I00000oIO;

                public lI0lO0ili(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:106:0x012c A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0128  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object apply(Object obj) {
                    lOOi0101ii10 looi0101ii10;
                    int length;
                    int iI000OiO;
                    lOio1lIO loio1lio;
                    switch (this.I00000oIO) {
                        case 0:
/* 440 */                   return 0;
                        case 1:
/* 433 */                   return Long.valueOf(((li1l0Iiiii) obj).I00iiI);
                        case 2:
/* 424 */                   return ((lO1l0Oi) obj).I000l1();
                        case 3:
/* 48 */                    ArrayList arrayList = ((lOIllO) obj).I00000oIO;
/* 50 */                    int size = arrayList.size();
/* 56 */                    ll0iOo11011i.I00000oOI(size, "initialCapacity");
/* 59 */                    Object[] objArrCopyOf = new Object[size];
/* 61 */                    lOio1lIO loio1lio2 = lOio1lIO.I00iiO;
/* 65 */                    Collections.sort(arrayList, lOi11lOlOoi1.I00iiO);
/* 68 */                    Iterator it = arrayList.iterator();
/* 74 */                    if (it instanceof lOOi0101ii10) {
/* 76 */                        looi0101ii10 = (lOOi0101ii10) it;
                            } else {
/* 82 */                        lOOi0101ii10 looi0101ii102 = new lOOi0101ii10();
/* 85 */                        it.getClass();
/* 88 */                        looi0101ii102.I00iOIl = it;
/* 90 */                        VarHandle.storeStoreFence();
/* 93 */                        looi0101ii10 = looi0101ii102;
                            }
/* 78 */                    int i = 0;
/* 99 */                    while (looi0101ii10.hasNext()) {
/* 105 */                       lOio1lIO loio1lio3 = (lOio1lIO) looi0101ii10.next();
/* 111 */                       while (looi0101ii10.hasNext()) {
/* 115 */                           if (!looi0101ii10.I00iiI) {
/* 123 */                               looi0101ii10.I00iiO = looi0101ii10.I00iOIl.next();
/* 125 */                               looi0101ii10.I00iiI = true;
                                    }
/* 129 */                           lOio1lIO loio1lio4 = (lOio1lIO) looi0101ii10.I00iiO;
/* 131 */                           lO0IIliiOi0I lo0iiliioi0i = loio1lio3.I00iOIl;
/* 133 */                           lO0IIliiOi0I lo0iiliioi0i2 = loio1lio3.I00iiI;
/* 135 */                           lO0IIliiOi0I lo0iiliioi0i3 = loio1lio4.I00iiI;
/* 137 */                           lO0IIliiOi0I lo0iiliioi0i4 = loio1lio4.I00iOIl;
/* 143 */                           if (lo0iiliioi0i.I0000Il00O(lo0iiliioi0i3) > 0 || lo0iiliioi0i4.I0000Il00O(lo0iiliioi0i2) > 0) {
/* 284 */                               loio1lio3.getClass();
/* 287 */                               length = objArrCopyOf.length;
/* 288 */                               int i2 = i + 1;
/* 290 */                               iI000OiO = IoilIilo.I000OiO(length, i2);
/* 294 */                               if (iI000OiO <= length) {
/* 297 */                                   objArrCopyOf = Arrays.copyOf(objArrCopyOf, iI000OiO);
                                        }
/* 301 */                               objArrCopyOf[i] = loio1lio3;
/* 303 */                               i = i2;
                                    } else {
/* 151 */                               int iI0000Il00O = lo0iiliioi0i.I0000Il00O(lo0iiliioi0i4);
/* 155 */                               lO0IIliiOi0I lo0iiliioi0i5 = loio1lio4.I00iiI;
/* 157 */                               int iI0000Il00O2 = lo0iiliioi0i2.I0000Il00O(lo0iiliioi0i5);
/* 162 */                               if (iI0000Il00O >= 0 && iI0000Il00O2 <= 0) {
/* 167 */                                   loio1lio = loio1lio3;
                                        } else if (iI0000Il00O > 0 || iI0000Il00O2 < 0) {
/* 176 */                                   if (iI0000Il00O >= 0) {
/* 179 */                                       lo0iiliioi0i4 = lo0iiliioi0i;
                                            }
/* 180 */                                   if (iI0000Il00O2 <= 0) {
/* 182 */                                       lo0iiliioi0i5 = lo0iiliioi0i2;
                                            }
/* 192 */                                   if (!(lo0iiliioi0i4.I0000Il00O(lo0iiliioi0i5) <= 0)) {
/* 279 */                                       I000II.I000iOII(ll0Oo10I10.I00000oIO("intersection is undefined for disconnected ranges %s and %s", loio1lio3, loio1lio4));
/* 161 */                                       return null;
                                            }
/* 196 */                                   loio1lio = new lOio1lIO(lo0iiliioi0i4, lo0iiliioi0i5);
                                        } else {
/* 174 */                                   loio1lio = loio1lio4;
                                        }
/* 207 */                               if (!loio1lio.I00iOIl.equals(loio1lio.I00iiI)) {
/* 264 */                                   I000II.I000iOII(ll0Oo10I10.I00000oIO("Overlapping ranges not permitted but found %s overlapping %s", loio1lio3, loio1lio4));
/* 161 */                                   return null;
                                        }
/* 213 */                               lOio1lIO loio1lio5 = (lOio1lIO) looi0101ii10.next();
/* 215 */                               lO0IIliiOi0I lo0iiliioi0i6 = loio1lio5.I00iOIl;
/* 217 */                               int iI0000Il00O3 = lo0iiliioi0i.I0000Il00O(lo0iiliioi0i6);
/* 221 */                               lO0IIliiOi0I lo0iiliioi0i7 = loio1lio5.I00iiI;
/* 223 */                               int iI0000Il00O4 = lo0iiliioi0i2.I0000Il00O(lo0iiliioi0i7);
/* 227 */                               if (iI0000Il00O3 > 0 || iI0000Il00O4 < 0) {
/* 231 */                                   if (iI0000Il00O3 < 0 || iI0000Il00O4 > 0) {
/* 239 */                                       if (iI0000Il00O3 > 0) {
/* 242 */                                           lo0iiliioi0i = lo0iiliioi0i6;
                                                }
/* 243 */                                       if (iI0000Il00O4 < 0) {
/* 246 */                                           lo0iiliioi0i2 = lo0iiliioi0i7;
                                                }
/* 249 */                                       loio1lio3 = new lOio1lIO(lo0iiliioi0i, lo0iiliioi0i2);
                                            } else {
/* 236 */                                       loio1lio3 = loio1lio5;
                                            }
                                        }
                                    }
                                }
/* 284 */                       loio1lio3.getClass();
/* 287 */                       length = objArrCopyOf.length;
/* 288 */                       int i22 = i + 1;
/* 290 */                       iI000OiO = IoilIilo.I000OiO(length, i22);
/* 294 */                       if (iI000OiO <= length) {
                                }
/* 301 */                       objArrCopyOf[i] = loio1lio3;
/* 303 */                       i = i22;
                            }
/* 306 */                   lOl10OOloi lol10ooloiI000oI1ioi = lOI1lll1l10.I000oI1ioi(i, objArrCopyOf);
/* 314 */                   if (lol10ooloiI000oI1ioi.isEmpty()) {
/* 316 */                       return lOIo1liOoI.I00iiI;
                            }
/* 321 */                   if (lol10ooloiI000oI1ioi.I00iio == 1) {
/* 323 */                       lO1loOl0O0O lo1lool0o0oListIterator = lol10ooloiI000oI1ioi.listIterator(0);
/* 327 */                       Object next = lo1lool0o0oListIterator.next();
/* 335 */                       if (lo1lool0o0oListIterator.hasNext()) {
/* 354 */                           StringBuilder sb = new StringBuilder("expected one element but was: <");
/* 357 */                           sb.append(next);
/* 361 */                           for (int i3 = 0; i3 < 4 && lo1lool0o0oListIterator.hasNext(); i3++) {
/* 371 */                               sb.append(", ");
/* 378 */                               sb.append(lo1lool0o0oListIterator.next());
                                    }
/* 388 */                           if (lo1lool0o0oListIterator.hasNext()) {
/* 393 */                               sb.append(", ...");
                                    }
/* 398 */                           sb.append('>');
/* 410 */                           throw new IllegalArgumentException(sb.toString());
                                }
/* 345 */                       if (((lOio1lIO) next).equals(lOio1lIO.I00iiO)) {
/* 347 */                           return lOIo1liOoI.I00iiO;
                                }
                            }
/* 413 */                   lOIo1liOoI loio1liooi = new lOIo1liOoI();
/* 416 */                   loio1liooi.I00iOIl = lol10ooloiI000oI1ioi;
/* 418 */                   VarHandle.storeStoreFence();
/* 421 */                   return loio1liooi;
                        default:
/* 8 */                     lOO0OIOiiOO loo0oioiioo = (lOO0OIOiiOO) obj;
/* 10 */                    int i4 = loo0oioiioo.I0000Il00O;
/* 12 */                    if (i4 == 0) {
/* 43 */                        return lOllil.I00l0I0l0lO1;
                            }
/* 14 */                    Object[] objArr = loo0oioiioo.I00000oOI;
/* 16 */                    if (i4 == 1) {
/* 31 */                        Object obj2 = objArr[0];
/* 33 */                        Objects.requireNonNull(obj2);
/* 38 */                        return new lOo10Oi(obj2);
                            }
/* 18 */                    lOO110IoOiI loo110iooiiI000oI1ioi = lOO110IoOiI.I000oI1ioi(i4, objArr);
/* 26 */                    loo0oioiioo.I0000Il00O = loo110iooiiI000oI1ioi.size();
/* 28 */                    loo0oioiioo.I0000O = true;
/* 45 */                    return loo110iooiiI000oI1ioi;
                    }
                }
            }
