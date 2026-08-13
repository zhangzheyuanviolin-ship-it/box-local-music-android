            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class OiIl0IIi0 implements OiIiol10 {
                public Function1 I00iOIl;
                public OI10I1IoI0Ol I00iiI;
                public OI10I1IoI0Ol I00iiO;

                @Override
                public final OiIiloli0I I00000oIO(String str, IllOOo00lI illOOo00lI) {
/* 1 */             int length = str.length();
/* 6 */             for (int i = 0; i < length; i++) {
/* 16 */                if (!iOlI1lIi0.I0000Il00O(str.charAt(i))) {
/* 18 */                    OI10I1IoI0Ol oI10I1IoI0Ol = this.I00iiO;
/* 20 */                    if (oI10I1IoI0Ol == null) {
/* 22 */                        long[] jArr = OiO10oio.I00000oIO;
/* 26 */                        oI10I1IoI0Ol = new OI10I1IoI0Ol();
/* 29 */                        this.I00iiO = oI10I1IoI0Ol;
                            }
/* 31 */                    Object objI000II = oI10I1IoI0Ol.I000II(str);
/* 35 */                    if (objI000II == null) {
/* 39 */                        objI000II = new ArrayList();
/* 42 */                        oI10I1IoI0Ol.I000lI(str, objI000II);
                            }
/* 47 */                    ((List) objI000II).add(illOOo00lI);
/* 54 */                    IOO000ilo iOO000ilo = new IOO000ilo(27);
/* 57 */                    iOO000ilo.I00iiO = oI10I1IoI0Ol;
/* 59 */                    iOO000ilo.I00iio = str;
/* 61 */                    iOO000ilo.I00iiI = illOOo00lI;
/* 63 */                    VarHandle.storeStoreFence();
/* 66 */                    return iOO000ilo;
                        }
                    }
/* 72 */            I000II.I000iOII("Registered key is empty or blank");
/* 75 */            return null;
                }

                @Override
                public final boolean I0000Il00O(Object obj) {
/* 9 */             return ((Boolean) this.I00iOIl.invoke(obj)).booleanValue();
                }

                /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Map I0000O() {
                    char c;
                    long j;
                    long j2;
                    long j3;
                    long[] jArr;
                    int i;
                    long[] jArr2;
                    int i2;
                    char c2;
                    long j4;
/* 3 */             OI10I1IoI0Ol oI10I1IoI0Ol = this.I00iiI;
/* 5 */             if (oI10I1IoI0Ol == null && this.I00iiO == null) {
/* 11 */                return Il011I1OiO0I.I00iOIl;
                    }
/* 14 */            int i3 = 0;
/* 20 */            int i4 = oI10I1IoI0Ol != null ? oI10I1IoI0Ol.I0000oI00 : 0;
/* 21 */            OI10I1IoI0Ol oI10I1IoI0Ol2 = this.I00iiO;
/* 32 */            HashMap map = new HashMap(i4 + (oI10I1IoI0Ol2 != null ? oI10I1IoI0Ol2.I0000oI00 : 0));
/* 35 */            char c3 = 7;
/* 36 */            long j5 = -9187201950435737472L;
/* 41 */            int i5 = 8;
/* 43 */            if (oI10I1IoI0Ol != null) {
/* 45 */                Object[] objArr = oI10I1IoI0Ol.I00000oOI;
/* 47 */                Object[] objArr2 = oI10I1IoI0Ol.I0000Il00O;
/* 49 */                long[] jArr3 = oI10I1IoI0Ol.I00000oIO;
                        int length = jArr3.length - 2;
/* 54 */                if (length >= 0) {
/* 56 */                    int i6 = 0;
/* 57 */                    j2 = 128;
                            while (true) {
/* 59 */                        long j6 = jArr3[i6];
/* 61 */                        j3 = 255;
/* 69 */                        if ((((~j6) << c3) & j6 & j5) != j5) {
/* 76 */                            int i7 = 8 - ((~(i6 - length)) >>> 31);
/* 78 */                            int i8 = 0;
/* 79 */                            while (i8 < i7) {
/* 85 */                                if ((j6 & 255) < 128) {
/* 89 */                                    int i9 = (i6 << 3) + i8;
/* 95 */                                    c2 = c3;
/* 101 */                                   j4 = j5;
/* 107 */                                   map.put((String) objArr[i9], (List) objArr2[i9]);
                                        } else {
/* 111 */                                   c2 = c3;
/* 113 */                                   j4 = j5;
                                        }
/* 115 */                               j6 >>= 8;
/* 116 */                               i8++;
/* 118 */                               c3 = c2;
/* 120 */                               j5 = j4;
                                    }
/* 123 */                           c = c3;
/* 125 */                           j = j5;
/* 127 */                           if (i7 != 8) {
                                        break;
                                    }
                                } else {
/* 130 */                           c = c3;
/* 132 */                           j = j5;
                                }
/* 134 */                       if (i6 == length) {
                                    break;
                                }
/* 136 */                       i6++;
/* 138 */                       c3 = c;
/* 140 */                       j5 = j;
                            }
                        } else {
/* 143 */                   c = 7;
/* 145 */                   j = -9187201950435737472L;
/* 147 */                   j2 = 128;
/* 149 */                   j3 = 255;
                        }
                    }
/* 151 */           OI10I1IoI0Ol oI10I1IoI0Ol3 = this.I00iiO;
/* 153 */           if (oI10I1IoI0Ol3 != null) {
/* 155 */               Object[] objArr3 = oI10I1IoI0Ol3.I00000oOI;
/* 157 */               Object[] objArr4 = oI10I1IoI0Ol3.I0000Il00O;
/* 159 */               long[] jArr4 = oI10I1IoI0Ol3.I00000oIO;
                        int length2 = jArr4.length - 2;
/* 164 */               if (length2 >= 0) {
/* 166 */                   int i10 = 0;
                            while (true) {
/* 167 */                       long j7 = jArr4[i10];
/* 177 */                       if ((((~j7) << c) & j7 & j) != j) {
/* 184 */                           int i11 = 8 - ((~(i10 - length2)) >>> 31);
/* 186 */                           int i12 = i3;
/* 187 */                           while (i12 < i11) {
/* 193 */                               if ((j7 & j3) < j2) {
/* 197 */                                   int i13 = (i10 << 3) + i12;
/* 198 */                                   Object obj = objArr3[i13];
/* 202 */                                   List list = (List) objArr4[i13];
/* 204 */                                   String str = (String) obj;
/* 212 */                                   i2 = i5;
/* 215 */                                   if (list.size() == 1) {
/* 223 */                                       Object objInvoke = ((IllOOo00lI) list.get(i3)).invoke();
/* 227 */                                       if (objInvoke != null) {
/* 233 */                                           if (!I0000Il00O(objInvoke)) {
/* 253 */                                               IOOlIIilOl0.I0000oI00(lIo1lO.I00000oIO(objInvoke));
/* 210 */                                               return null;
                                                    }
/* 243 */                                           map.put(str, IOOi1I.I00000oIO(objInvoke));
                                                }
/* 246 */                                       jArr2 = jArr4;
                                            } else {
/* 257 */                                       int size = list.size();
/* 263 */                                       ArrayList arrayList = new ArrayList(size);
/* 266 */                                       while (i3 < size) {
/* 274 */                                           long[] jArr5 = jArr4;
/* 276 */                                           Object objInvoke2 = ((IllOOo00lI) list.get(i3)).invoke();
/* 280 */                                           if (objInvoke2 != null && !I0000Il00O(objInvoke2)) {
/* 293 */                                               IOOlIIilOl0.I0000oI00(lIo1lO.I00000oIO(objInvoke2));
/* 210 */                                               return null;
                                                    }
/* 297 */                                           arrayList.add(objInvoke2);
/* 300 */                                           i3++;
/* 302 */                                           jArr4 = jArr5;
                                                }
/* 305 */                                       jArr2 = jArr4;
/* 307 */                                       map.put(str, arrayList);
                                            }
                                        } else {
/* 311 */                                   jArr2 = jArr4;
/* 313 */                                   i2 = i5;
                                        }
/* 315 */                               j7 >>= i2;
/* 317 */                               i12++;
/* 319 */                               i5 = i2;
/* 321 */                               jArr4 = jArr2;
/* 323 */                               i3 = 0;
                                    }
/* 326 */                           jArr = jArr4;
/* 328 */                           i = i5;
/* 329 */                           if (i11 != i) {
                                        break;
                                    }
                                } else {
/* 332 */                           jArr = jArr4;
/* 334 */                           i = i5;
                                }
/* 335 */                       if (i10 == length2) {
                                    break;
                                }
/* 337 */                       i10++;
/* 339 */                       i5 = i;
/* 340 */                       jArr4 = jArr;
/* 342 */                       i3 = 0;
                            }
                        }
                    }
/* 743 */           return map;
                }

                @Override
                public final Object I0000oI00(String str) {
/* 1 */             OI10I1IoI0Ol oI10I1IoI0Ol = this.I00iiI;
/* 13 */            List list = oI10I1IoI0Ol != null ? (List) oI10I1IoI0Ol.I000iOII(str) : null;
/* 15 */            List list2 = list;
/* 17 */            if (list2 == null || list2.isEmpty()) {
/* 3 */                 return null;
                    }
/* 31 */            if (list.size() > 1 && oI10I1IoI0Ol != null) {
/* 39 */                List listSubList = list.subList(1, list.size());
/* 43 */                int iI0001Ioi1lo = oI10I1IoI0Ol.I0001Ioi1lo(str);
/* 47 */                if (iI0001Ioi1lo < 0) {
/* 49 */                    iI0001Ioi1lo = ~iI0001Ioi1lo;
                        }
/* 50 */                Object[] objArr = oI10I1IoI0Ol.I0000Il00O;
/* 52 */                Object obj = objArr[iI0001Ioi1lo];
/* 56 */                oI10I1IoI0Ol.I00000oOI[iI0001Ioi1lo] = str;
/* 58 */                objArr[iI0001Ioi1lo] = listSubList;
                    }
/* 63 */            return list.get(0);
                }
            }
