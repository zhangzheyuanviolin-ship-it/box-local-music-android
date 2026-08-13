            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class IOli1011IlIo implements Function1 {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public IOli1011IlIo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    int i;
/* 5 */             int i2 = this.I00iOIl;
/* 7 */             int i3 = 0;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i2) {
                        case 0:
/* 215 */                   Oii1lO01il oii1lO01il = (Oii1lO01il) this.I00iiO;
/* 217 */                   int i4 = this.I00iiI;
/* 221 */                   Ol1o1llOII ol1o1llOII = (Ol1o1llOII) this.I00iio;
/* 225 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 229 */                   ((Boolean) obj).getClass();
/* 242 */                   ArrayList arrayList = new ArrayList((List) oI10i0Il.getValue());
/* 249 */                   if (arrayList.isEmpty()) {
/* 251 */                       i = 0;
                            } else {
/* 253 */                       Iterator it = arrayList.iterator();
/* 257 */                       i = 0;
/* 262 */                       while (it.hasNext()) {
/* 274 */                           if (((Boolean) it.next()).booleanValue() && (i = i + 1) < 0) {
/* 281 */                               IOOi1I.I000l1();
/* 284 */                               throw null;
                                    }
                                }
                            }
/* 285 */                   boolean z = oii1lO01il.I0001Ioi1lo;
/* 287 */                   ArrayList arrayList2 = oii1lO01il.I0000oI00;
/* 289 */                   if (z) {
/* 330 */                       if (i != 1 || !((Boolean) arrayList.get(i4)).booleanValue()) {
/* 359 */                           arrayList.set(i4, Boolean.valueOf(!((Boolean) arrayList.get(i4)).booleanValue()));
                                }
                            } else if (!((Boolean) arrayList.get(i4)).booleanValue()) {
/* 303 */                       int size = arrayList2.size();
/* 309 */                       arrayList = new ArrayList(size);
/* 312 */                       int i5 = 0;
/* 313 */                       while (i5 < size) {
/* 324 */                           arrayList.add(Boolean.valueOf(i5 == i4));
/* 327 */                           i5++;
                                }
                            }
/* 362 */                   oI10i0Il.setValue(arrayList);
/* 367 */                   String str = oii1lO01il.I0000Il00O.I00000oOI;
/* 371 */                   ArrayList arrayList3 = new ArrayList();
/* 382 */                   for (Object obj2 : arrayList2) {
/* 388 */                       int i6 = i3 + 1;
/* 390 */                       if (i3 < 0) {
/* 418 */                           IOOi1I.I000lI();
/* 421 */                           throw null;
                                }
/* 411 */                       if (((Boolean) ((List) oI10i0Il.getValue()).get(i3)).booleanValue()) {
/* 413 */                           arrayList3.add(obj2);
                                }
/* 416 */                       i3 = i6;
                            }
/* 434 */                   ol1o1llOII.put(str, IOOi0Ool1i.I00IlilI0i0i(arrayList3, ",", null, null, null, 62));
/* 437 */                   return ooiIlOl1iI;
                        case 1:
/* 163 */                   IiO0o1I iiO0o1I = (IiO0o1I) this.I00iiO;
/* 167 */                   IooOIOoo0I01 iooOIOoo0I01 = (IooOIOoo0I01) this.I00iio;
/* 171 */                   OI0o11I1 oI0o11I1 = (OI0o11I1) this.I00ilI0I1;
/* 173 */                   int i7 = this.I00iiI;
/* 175 */                   if (obj == iiO0o1I) {
/* 208 */                       I000II.I001IO000("A derived state calculation cannot read itself");
/* 11 */                        return null;
                            }
/* 179 */                   if (!(obj instanceof OlO11I0O1l)) {
/* 212 */                       return ooiIlOl1iI;
                            }
/* 183 */                   int i8 = iooOIOoo0I01.I00000oIO - i7;
/* 184 */                   int iI0000O = oI0o11I1.I0000O(obj);
/* 202 */                   oI0o11I1.I000II(Math.min(i8, iI0000O >= 0 ? oI0o11I1.I0000Il00O[iI0000O] : Integer.MAX_VALUE), obj);
/* 212 */                   return ooiIlOl1iI;
                        case 2:
/* 88 */                    IoI1Ol11l1 ioI1Ol11l1 = (IoI1Ol11l1) this.I00iiO;
/* 92 */                    O1iOIoOiO0 o1iOIoOiO0 = (O1iOIoOiO0) this.I00iio;
/* 96 */                    OO1I0001000i oO1I0001000i = (OO1I0001000i) this.I00ilI0I1;
/* 98 */                    int i9 = this.I00iiI;
/* 101 */                   OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 103 */                   int i10 = ioI1Ol11l1.I00000oOI;
/* 105 */                   Oo0I110i oo0I110i = ioI1Ol11l1.I00000oIO;
/* 107 */                   OoI0llll ooI0llll = ioI1Ol11l1.I0000Il00O;
/* 115 */                   Oo0il0olo1l oo0il0olo1l = (Oo0il0olo1l) ioI1Ol11l1.I0000O.invoke();
/* 143 */                   oo0I110i.I00000oIO(OIilII.I00iiI, lOl1III1il.I00000oIO(oO11o0IO, i10, ooI0llll, oo0il0olo1l != null ? oo0il0olo1l.I00000oIO : null, o1iOIoOiO0.getLayoutDirection() == O0iOOoiioO.I00iiI, oO1I0001000i.I00iOIl), i9, oO1I0001000i.I00iOIl);
/* 157 */                   OO11o0IO.I000iOII(oO11o0IO, oO1I0001000i, Math.round(-oo0I110i.I00000oIO.I000II()), 0);
/* 160 */                   return ooiIlOl1iI;
                        default:
/* 17 */                    OO1I0001000i[] oO1I0001000iArr = (OO1I0001000i[]) this.I00iiO;
/* 21 */                    OiI1iiIl1Oi0 oiI1iiIl1Oi0 = (OiI1iiIl1Oi0) this.I00iio;
/* 23 */                    int i11 = this.I00iiI;
/* 27 */                    int[] iArr = (int[]) this.I00ilI0I1;
/* 29 */                    OO11o0IO oO11o0IO2 = (OO11o0IO) obj;
/* 31 */                    int length = oO1I0001000iArr.length;
/* 32 */                    int i12 = 0;
/* 33 */                    while (i3 < length) {
/* 35 */                        OO1I0001000i oO1I0001000i2 = oO1I0001000iArr[i3];
/* 37 */                        int i13 = i12 + 1;
/* 39 */                        Object objI00II0Ol1O0l = oO1I0001000i2.I00II0Ol1O0l();
/* 50 */                        OiI1Olo1I oiI1Olo1I = objI00II0Ol1O0l instanceof OiI1Olo1I ? (OiI1Olo1I) objI00II0Ol1O0l : null;
/* 56 */                        il00OIo0O il00oio0o = oiI1Olo1I != null ? oiI1Olo1I.I0000Il00O : null;
/* 2 */                         oO11o0IO2.I000O01llI0(oO1I0001000i2, iArr[i12], il00oio0o != null ? il00oio0o.I00000oIO(i11, oO1I0001000i2.I00iiI, O0iOOoiioO.I00iOIl) : oiI1iiIl1Oi0.I00000oOI.I00000oIO(oO1I0001000i2.I00iiI, i11), 0.0f);
/* 81 */                        i3++;
/* 83 */                        i12 = i13;
                            }
/* 85 */                    return ooiIlOl1iI;
                    }
                }
            }
