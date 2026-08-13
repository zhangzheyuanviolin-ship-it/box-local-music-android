            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l101iooo1 {
                public static final List I00000oIO(liIoOiiO1Oi liiooiio1oi, int i, int i2, ArrayList arrayList, OI0l1iiooO oI0l1iiooO, int i3, int i4, int i5, boolean z, Function1 function1) {
                    int i6;
                    OI0l1iiooO oI0l1iiooO2;
                    int i7;
                    long j;
                    int i8;
                    Object obj;
                    int i9;
/* 11 */            if (liiooiio1oi == null || arrayList.isEmpty() || (i6 = oI0l1iiooO.I00000oOI) == 0) {
/* 317 */               return Il01100l.I00iOIl;
                    }
/* 25 */            int i10 = -1;
/* 26 */            int i11 = 0;
/* 27 */            if (i2 - i < 0 || i6 == 0) {
/* 75 */                oI0l1iiooO2 = IooIo0.I00000oIO;
                    } else {
/* 32 */                IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(0, i6);
/* 36 */                int i12 = iooO11lI000O01llI0.I00iOIl;
/* 38 */                int i13 = iooO11lI000O01llI0.I00iiI;
/* 40 */                int iI0000Il00O = -1;
/* 41 */                if (i12 <= i13) {
/* 47 */                    while (oI0l1iiooO.I0000Il00O(i12) <= i) {
/* 49 */                        iI0000Il00O = oI0l1iiooO.I0000Il00O(i12);
/* 53 */                        if (i12 == i13) {
                                    break;
                                }
/* 55 */                        i12++;
                            }
                        }
/* 58 */                if (iI0000Il00O == -1) {
/* 60 */                    oI0l1iiooO2 = IooIo0.I00000oIO;
                        } else {
/* 63 */                    OI0l1iiooO oI0l1iiooO3 = IooIo0.I00000oIO;
/* 68 */                    oI0l1iiooO2 = new OI0l1iiooO(1);
/* 71 */                    oI0l1iiooO2.I00000oIO(iI0000Il00O);
                        }
                    }
/* 79 */            ArrayList arrayList2 = new ArrayList();
/* 88 */            ArrayList arrayList3 = new ArrayList(arrayList.size());
/* 91 */            int size = arrayList.size();
/* 95 */            int i14 = 0;
/* 96 */            while (i14 < size) {
/* 98 */                Object obj2 = arrayList.get(i14);
/* 105 */               int index = ((O0lilO) obj2).getIndex();
/* 109 */               int[] iArr = oI0l1iiooO.I00000oIO;
/* 111 */               int i15 = oI0l1iiooO.I00000oOI;
/* 113 */               int i16 = i11;
                        while (true) {
/* 114 */                   if (i16 >= i15) {
                                break;
                            }
/* 118 */                   if (iArr[i16] == index) {
/* 120 */                       arrayList3.add(obj2);
                                break;
                            }
/* 124 */                   i16++;
                        }
/* 128 */               i14++;
/* 130 */               i11 = 0;
                    }
/* 132 */           int[] iArr2 = oI0l1iiooO2.I00000oIO;
/* 134 */           int i17 = oI0l1iiooO2.I00000oOI;
/* 136 */           int i18 = 0;
/* 137 */           while (i18 < i17) {
/* 139 */               int i19 = iArr2[i18];
/* 141 */               Iterator it = arrayList.iterator();
/* 145 */               int i20 = 0;
                        while (true) {
/* 150 */                   if (!it.hasNext()) {
/* 168 */                       i20 = i10;
                                break;
                            }
/* 162 */                   if (((O0lilO) it.next()).getIndex() == i19) {
                                break;
                            }
/* 165 */                   i20++;
                        }
/* 190 */               O0lilO o0lilO = i20 == i10 ? (O0lilO) function1.invoke(Integer.valueOf(i19)) : (O0lilO) arrayList.remove(i20);
/* 192 */               int iI00000oIO = iIoOII.I00000oIO(o0lilO, z);
/* 203 */               if (i20 == i10) {
/* 205 */                   i7 = i18;
/* 206 */                   i8 = Integer.MIN_VALUE;
                        } else {
/* 210 */                   long jI000II = o0lilO.I000II(0);
/* 214 */                   if (z) {
/* 216 */                       i7 = i18;
/* 217 */                       j = jI000II & 4294967295L;
                            } else {
/* 221 */                       i7 = i18;
/* 222 */                       j = jI000II >> 32;
                            }
/* 219 */                   i8 = (int) j;
                        }
/* 225 */               int size2 = arrayList3.size();
/* 231 */               int i21 = 0;
                        while (true) {
/* 232 */                   if (i21 >= size2) {
/* 252 */                       obj = null;
                                break;
                            }
/* 234 */                   obj = arrayList3.get(i21);
/* 246 */                   if (((O0lilO) obj).getIndex() != i19) {
                                break;
                            }
/* 249 */                   i21++;
                        }
/* 256 */               O0lilO o0lilO2 = (O0lilO) obj;
/* 258 */               if (o0lilO2 != null) {
/* 261 */                   long jI000II2 = o0lilO2.I000II(0);
/* 269 */                   i9 = (int) (z ? jI000II2 & 4294967295L : jI000II2 >> 32);
                        } else {
/* 277 */                   i9 = Integer.MIN_VALUE;
                        }
/* 285 */               int iMax = i8 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i8);
/* 289 */               if (i9 != Integer.MIN_VALUE) {
/* 292 */                   iMax = Math.min(iMax, i9 - iI00000oIO);
                        }
/* 296 */               o0lilO.I000OiO();
/* 304 */               o0lilO.I000iOII(iMax, 0, i4, i5);
/* 307 */               arrayList2.add(o0lilO);
/* 310 */               i18 = i7 + 1;
/* 313 */               i10 = -1;
                    }
/* 316 */           return arrayList2;
                }
            }
