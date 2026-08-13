            package p000;

            import java.nio.ByteBuffer;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            
            public abstract class lilOo1 {
                /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x015a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oIO(l0lIilo1 l0liilo1, HashMap map) {
                    l0liol0OO l0liol0oo;
                    int i;
/* 5 */             int i2 = 4;
/* 6 */             int iI0000O = l0liilo1.I0000O(4);
/* 25 */            if (map.containsKey(iI0000O != 0 ? l0liilo1.I000OOo1O(iI0000O + l0liilo1.I00iOIl) : null)) {
/* 29 */                int iI0000O2 = l0liilo1.I0000O(4);
/* 48 */                String str = (String) map.get(iI0000O2 != 0 ? l0liilo1.I000OOo1O(iI0000O2 + l0liilo1.I00iOIl) : null);
/* 52 */                ArrayList arrayList = new ArrayList();
/* 56 */                int iI0000O3 = l0liilo1.I0000O(6);
/* 77 */                if ((iI0000O3 != 0 ? ((ByteBuffer) l0liilo1.I00iiI).get(iI0000O3 + l0liilo1.I00iOIl) : (byte) 0) != 0) {
/* 224 */                   int i3 = 8;
/* 225 */                   int i4 = 0;
                            while (true) {
/* 226 */                       int iI0000O4 = l0liilo1.I0000O(i3);
/* 238 */                       if (i4 >= (iI0000O4 != 0 ? l0liilo1.I000O01llI0(iI0000O4) : 0)) {
                                    break;
                                }
/* 243 */                       l0liol0OO l0liol0oo2 = new l0liol0OO(1);
/* 246 */                       int iI0000O5 = l0liilo1.I0000O(i3);
/* 250 */                       if (iI0000O5 != 0) {
/* 258 */                           int iI000II = (i4 * 4) + l0liilo1.I000II(iI0000O5);
/* 272 */                           l0liol0oo2.I000OiO(((ByteBuffer) l0liilo1.I00iiI).getInt(iI000II) + iI000II, (ByteBuffer) l0liilo1.I00iiI);
                                } else {
/* 277 */                           l0liol0oo2 = null;
                                }
/* 279 */                       int iI0000O6 = l0liilo1.I0000O(6);
/* 300 */                       if ((iI0000O6 != 0 ? ((ByteBuffer) l0liilo1.I00iiI).get(iI0000O6 + l0liilo1.I00iOIl) : (byte) 0) == 1) {
/* 303 */                           int iI0000O7 = l0liol0oo2.I0000O(4);
/* 322 */                           if (str.compareTo(iI0000O7 != 0 ? l0liol0oo2.I000OOo1O(iI0000O7 + l0liol0oo2.I00iOIl) : null) >= 0) {
/* 347 */                               arrayList.add(l0liol0oo2);
                                    }
                                } else {
/* 326 */                           int iI0000O8 = l0liol0oo2.I0000O(4);
/* 345 */                           if (str.compareTo(iI0000O8 != 0 ? l0liol0oo2.I000OOo1O(iI0000O8 + l0liol0oo2.I00iOIl) : null) <= 0) {
                                    }
                                }
/* 350 */                       i4++;
/* 352 */                       i3 = 8;
                            }
                        } else {
/* 79 */                    int iI0000O9 = l0liilo1.I0000O(8);
/* 83 */                    if (iI0000O9 != 0) {
/* 85 */                        int iI000II2 = l0liilo1.I000II(iI0000O9);
/* 91 */                        ByteBuffer byteBuffer = (ByteBuffer) l0liilo1.I00iiI;
/* 95 */                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
/* 101 */                       int i5 = byteBuffer.getInt(iI000II2 - 4);
/* 105 */                       int i6 = 0;
/* 106 */                       while (i5 != 0) {
/* 108 */                           int i7 = i5 / 2;
/* 113 */                           int i8 = ((i6 + i7) * i2) + iI000II2;
/* 118 */                           int i9 = byteBuffer.getInt(i8) + i8;
/* 128 */                           int iCapacity = byteBuffer.capacity() - (byteBuffer.capacity() - i9);
/* 142 */                           int i10 = byteBuffer.getShort((iCapacity + 4) - byteBuffer.getInt(iCapacity)) + iCapacity;
/* 147 */                           int i11 = byteBuffer.getInt(i10) + i10;
/* 148 */                           int i12 = byteBuffer.getInt(i11);
/* 152 */                           int length = bytes.length;
/* 153 */                           int iMin = Math.min(i12, length);
/* 157 */                           int i13 = 0;
                                    while (true) {
/* 158 */                               if (i13 >= iMin) {
/* 189 */                                   i = i12 - length;
                                            break;
                                        }
/* 162 */                               int i14 = i11 + 4 + i13;
/* 168 */                               int i15 = iMin;
/* 172 */                               if (byteBuffer.get(i14) != bytes[i13]) {
/* 180 */                                   i = byteBuffer.get(i14) - bytes[i13];
                                            break;
                                        } else {
/* 182 */                                   i13++;
/* 184 */                                   iMin = i15;
                                        }
                                    }
/* 191 */                           if (i <= 0) {
/* 199 */                               if (i >= 0) {
/* 209 */                                   l0liol0oo = new l0liol0OO(1);
/* 212 */                                   l0liol0oo.I000OiO(i9, byteBuffer);
                                            break;
                                        } else {
/* 201 */                                   int i16 = i7 + 1;
/* 203 */                                   i6 += i16;
/* 204 */                                   i5 -= i16;
                                        }
                                    } else {
/* 193 */                               i5 = i7;
                                    }
/* 194 */                           i2 = 4;
                                }
/* 216 */                       l0liol0oo = null;
/* 217 */                       if (l0liol0oo != null) {
/* 219 */                           arrayList.add(l0liol0oo);
                                }
                            } else {
/* 216 */                       l0liol0oo = null;
/* 217 */                       if (l0liol0oo != null) {
                                }
                            }
                        }
/* 356 */               Iterator it = arrayList.iterator();
/* 364 */               while (it.hasNext()) {
/* 370 */                   l0liol0OO l0liol0oo3 = (l0liol0OO) it.next();
/* 372 */                   int i17 = 0;
                            while (true) {
/* 375 */                       int iI0000O10 = l0liol0oo3.I0000O(8);
/* 387 */                       if (i17 >= (iI0000O10 != 0 ? l0liol0oo3.I000O01llI0(iI0000O10) : 0)) {
                                    break;
                                }
/* 392 */                       l0lIilo1 l0liilo12 = new l0lIilo1(1);
/* 395 */                       int iI0000O11 = l0liol0oo3.I0000O(8);
/* 399 */                       if (iI0000O11 != 0) {
/* 407 */                           int iI000II3 = (i17 * 4) + l0liol0oo3.I000II(iI0000O11);
/* 421 */                           l0liilo12.I000OiO(((ByteBuffer) l0liol0oo3.I00iiI).getInt(iI000II3) + iI000II3, (ByteBuffer) l0liol0oo3.I00iiI);
                                } else {
/* 426 */                           l0liilo12 = null;
                                }
/* 428 */                       int iI0000O12 = l0liilo12.I0000O(4);
/* 443 */                       String strI000OOo1O = iI0000O12 != 0 ? l0liilo12.I000OOo1O(iI0000O12 + l0liilo12.I00iOIl) : null;
/* 445 */                       int iI0000O13 = l0liilo12.I0000O(6);
/* 460 */                       map.put(strI000OOo1O, iI0000O13 != 0 ? l0liilo12.I000OOo1O(iI0000O13 + l0liilo12.I00iOIl) : null);
/* 463 */                       i17++;
                            }
/* 467 */                   int i18 = 0;
                            while (true) {
/* 469 */                       int iI0000O14 = l0liol0oo3.I0000O(6);
/* 481 */                       if (i18 < (iI0000O14 != 0 ? l0liol0oo3.I000O01llI0(iI0000O14) : 0)) {
/* 486 */                           l0lIilo1 l0liilo13 = new l0lIilo1(1);
/* 489 */                           int iI0000O15 = l0liol0oo3.I0000O(6);
/* 493 */                           if (iI0000O15 != 0) {
/* 501 */                               int iI000II4 = (i18 * 4) + l0liol0oo3.I000II(iI0000O15);
/* 515 */                               l0liilo13.I000OiO(((ByteBuffer) l0liol0oo3.I00iiI).getInt(iI000II4) + iI000II4, (ByteBuffer) l0liol0oo3.I00iiI);
                                    } else {
/* 519 */                               l0liilo13 = null;
                                    }
/* 520 */                           I00000oIO(l0liilo13, map);
/* 523 */                           i18++;
                                }
                            }
                        }
                    }
                }
            }
