            package p000;

            import java.util.Iterator;
            import java.util.List;
            
            public final class IlI0i0I1l implements IlliIl1l11O {
                public final int I00iOIl;
                public List I00iiI;

                public IlI0i0I1l(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
                    Object next;
                    OIoi0IIoi oIoi0IIoi;
                    Object next2;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 10 */            List list = this.I00iiI;
                    switch (i) {
                        case 0:
/* 326 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 332 */                   int iIntValue = ((Integer) obj2).intValue();
/* 347 */                   if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 408 */                       Oo0i1oIIoOO.I00000oOI(list.size() == 1 ? "Captured face" : IIlIOloOOO.I00100l0("Captured ", list.size(), " faces"), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll1, 0, 0, 262142);
                            } else {
/* 414 */                       iloI0lOlll1.I00OilO00Il();
                            }
/* 417 */                   return ooiIlOl1iI;
                        case 1:
/* 231 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 237 */                   int iIntValue2 = ((Integer) obj2).intValue();
/* 253 */                   if (iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
/* 258 */                       int size = list.size();
/* 263 */                       for (int i2 = 0; i2 < size; i2++) {
/* 269 */                           IlliIl1l11O illiIl1l11O = (IlliIl1l11O) list.get(i2);
/* 273 */                           int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 279 */                           IOl0oi0lOl1.I000lI.getClass();
/* 282 */                           IIl11il0I0io iIl11il0I0io = lolOiIoiillI.I00iio;
/* 284 */                           iloI0lOlll12.I00i0oil();
/* 289 */                           if (iloI0lOlll12.I00O10llo) {
/* 291 */                               iloI0lOlll12.I000l1(iIl11il0I0io);
                                    } else {
/* 295 */                               iloI0lOlll12.I00io1l();
                                    }
/* 304 */                           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll12, Integer.valueOf(iHashCode));
/* 311 */                           illiIl1l11O.invoke(iloI0lOlll12, 0);
/* 314 */                           iloI0lOlll12.I0010I0i(true);
                                }
                            } else {
/* 320 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 323 */                   return ooiIlOl1iI;
                        default:
/* 17 */                    CharSequence charSequence = (CharSequence) obj;
/* 23 */                    int iIntValue3 = ((Integer) obj2).intValue();
/* 27 */                    List list2 = list;
/* 34 */                    if (list2.size() == 1) {
/* 42 */                        String str = (String) IOOi0Ool1i.I00OOll1(list2);
/* 45 */                        int iI001i1lo1io = OlOoOIi0o.I001i1lo1io(charSequence, str, iIntValue3, false, 4);
/* 60 */                        oIoi0IIoi = iI001i1lo1io < 0 ? null : new OIoi0IIoi(Integer.valueOf(iI001i1lo1io), str);
                            } else {
/* 67 */                        if (iIntValue3 < 0) {
/* 69 */                            iIntValue3 = 0;
                                }
/* 74 */                        IooO11l iooO11l = new IooO11l(iIntValue3, charSequence.length(), 1);
/* 77 */                        boolean z = charSequence instanceof String;
/* 79 */                        int i3 = iooO11l.I00iiO;
/* 81 */                        int i4 = iooO11l.I00iiI;
/* 83 */                        if (z) {
/* 85 */                            if ((i3 > 0 && iIntValue3 <= i4) || (i3 < 0 && i4 <= iIntValue3)) {
                                        while (true) {
/* 96 */                                    Iterator it = list2.iterator();
                                            while (true) {
/* 104 */                                       if (it.hasNext()) {
/* 106 */                                           next2 = it.next();
/* 111 */                                           String str2 = (String) next2;
/* 124 */                                           if (str2.regionMatches(0, (String) charSequence, iIntValue3, str2.length())) {
                                                    }
                                                } else {
/* 127 */                                           next2 = null;
                                                }
                                            }
/* 128 */                                   String str3 = (String) next2;
/* 130 */                                   if (str3 != null) {
/* 138 */                                       oIoi0IIoi = new OIoi0IIoi(Integer.valueOf(iIntValue3), str3);
                                            } else if (iIntValue3 != i4) {
/* 144 */                                       iIntValue3 += i3;
                                            }
                                        }
                                    }
                                } else if ((i3 > 0 && iIntValue3 <= i4) || (i3 < 0 && i4 <= iIntValue3)) {
/* 154 */                           int i5 = iIntValue3;
                                    while (true) {
/* 158 */                               Iterator it2 = list2.iterator();
                                        while (true) {
/* 166 */                                   if (it2.hasNext()) {
/* 168 */                                       next = it2.next();
/* 173 */                                       String str4 = (String) next;
/* 185 */                                       if (OlOoOIi0o.I00IO1oi11O(str4, 0, charSequence, i5, str4.length(), false)) {
                                                }
                                            } else {
/* 188 */                                       next = null;
                                            }
                                        }
/* 189 */                               String str5 = (String) next;
/* 191 */                               if (str5 != null) {
/* 199 */                                   oIoi0IIoi = new OIoi0IIoi(Integer.valueOf(i5), str5);
                                        } else if (i5 != i4) {
/* 205 */                                   i5 += i3;
                                        }
                                    }
                                }
                            }
/* 207 */                   if (oIoi0IIoi != null) {
/* 225 */                       return new OIoi0IIoi(oIoi0IIoi.I00iOIl, Integer.valueOf(((String) oIoi0IIoi.I00iiI).length()));
                            }
/* 33 */                    return null;
                    }
                }
            }
