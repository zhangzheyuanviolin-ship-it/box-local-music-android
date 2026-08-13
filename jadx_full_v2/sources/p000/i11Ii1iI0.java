            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class i11Ii1iI0 {
                public static final i11Ii1iI0 I0000Il00O;
                public i11o10OIl I00000oIO;
                public boolean I00000oOI;

                static {
/* 5 */             i11o10OIl i11o10oil = new i11o10OIl();
/* 8 */             i11Ii1iI0 i11ii1ii0 = new i11Ii1iI0();
/* 11 */            i11ii1ii0.I00000oIO = i11o10oil;
/* 13 */            i11ii1ii0.I0000O();
/* 16 */            i11ii1ii0.I0000O();
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            I0000Il00O = i11ii1ii0;
                }

                public static int I00000oIO(i11oIoi1 i11oioi1, int i, Object obj) {
                    int iI0000oI00;
                    int iI00000oOI;
/* 3 */             int iI00000oOI2 = i11I0o0ii.I00000oOI(i << 3);
/* 9 */             if (i11oioi1 == i11oIoi1.I00ilI0I1) {
/* 14 */                Charset charset = i11Oo1I1i.I00000oIO;
/* 16 */                iI00000oOI2 += iI00000oOI2;
                    }
/* 17 */            i11oO1 i11oo1 = i11oO1.I00iOIl;
/* 23 */            int iI0000Il00O = 4;
                    switch (i11oioi1.ordinal()) {
                        case 0:
/* 243 */                   ((Double) obj).getClass();
/* 77 */                    iI0000Il00O = 8;
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 1:
/* 237 */                   ((Float) obj).getClass();
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 2:
/* 230 */                   iI0000Il00O = i11I0o0ii.I0000Il00O(((Long) obj).longValue());
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 3:
/* 219 */                   iI0000Il00O = i11I0o0ii.I0000Il00O(((Long) obj).longValue());
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 4:
/* 208 */                   iI0000Il00O = i11I0o0ii.I0000Il00O(((Integer) obj).intValue());
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 5:
/* 197 */                   ((Long) obj).getClass();
/* 77 */                    iI0000Il00O = 8;
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 6:
/* 191 */                   ((Integer) obj).getClass();
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 7:
/* 184 */                   ((Boolean) obj).getClass();
/* 187 */                   iI0000Il00O = 1;
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 8:
/* 162 */                   if (!(obj instanceof i11I0IiII0Ol)) {
/* 177 */                       iI0000Il00O = i11I0o0ii.I00000oIO((String) obj);
/* 248 */                       return iI00000oOI2 + iI0000Il00O;
                            }
/* 166 */                   iI0000oI00 = ((i11I0IiII0Ol) obj).I0000oI00();
/* 170 */                   iI00000oOI = i11I0o0ii.I00000oOI(iI0000oI00);
/* 126 */                   iI0000Il00O = iI00000oOI + iI0000oI00;
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 9:
/* 155 */                   iI0000Il00O = ((i11O1oIl) ((i1111ll) obj)).I000OiO();
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 10:
/* 142 */                   iI0000oI00 = ((i11O1oIl) ((i1111ll) obj)).I000OiO();
/* 146 */                   iI00000oOI = i11I0o0ii.I00000oOI(iI0000oI00);
/* 126 */                   iI0000Il00O = iI00000oOI + iI0000oI00;
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 11:
/* 114 */                   if (obj instanceof i11I0IiII0Ol) {
/* 118 */                       iI0000oI00 = ((i11I0IiII0Ol) obj).I0000oI00();
/* 122 */                       iI00000oOI = i11I0o0ii.I00000oOI(iI0000oI00);
                            } else {
/* 132 */                       iI0000oI00 = ((byte[]) obj).length;
/* 133 */                       iI00000oOI = i11I0o0ii.I00000oOI(iI0000oI00);
                            }
/* 126 */                   iI0000Il00O = iI00000oOI + iI0000oI00;
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 12:
/* 106 */                   iI0000Il00O = i11I0o0ii.I00000oOI(((Integer) obj).intValue());
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 13:
/* 94 */                    iI0000Il00O = i11I0o0ii.I0000Il00O(((Integer) obj).intValue());
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 14:
/* 82 */                    ((Integer) obj).getClass();
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 15:
/* 74 */                    ((Long) obj).getClass();
/* 77 */                    iI0000Il00O = 8;
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 16:
/* 57 */                    int iIntValue = ((Integer) obj).intValue();
/* 66 */                    iI0000Il00O = i11I0o0ii.I00000oOI((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 17:
/* 39 */                    long jLongValue = ((Long) obj).longValue();
/* 49 */                    iI0000Il00O = i11I0o0ii.I0000Il00O((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        default:
/* 36 */                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                }

                public static void I0000oI00(i11I0o0ii i11i0o0ii, i11oIoi1 i11oioi1, int i, Object obj) {
/* 3 */             if (i11oioi1 == i11oIoi1.I00ilI0I1) {
/* 240 */               Charset charset = i11Oo1I1i.I00000oIO;
/* 243 */               i11i0o0ii.I000oI1ioi(i, 3);
/* 248 */               ((i11O1oIl) ((i1111ll) obj)).I000O01llI0(i11i0o0ii);
/* 252 */               i11i0o0ii.I000oI1ioi(i, 4);
/* 255 */               return;
                    }
/* 7 */             i11i0o0ii.I000oI1ioi(i, i11oioi1.I00iiI);
/* 10 */            i11oO1 i11oo1 = i11oO1.I00iOIl;
                    switch (i11oioi1.ordinal()) {
                        case 0:
/* 234 */                   i11i0o0ii.I000iOII(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                            break;
                        case 1:
/* 220 */                   i11i0o0ii.I000OOo1O(Float.floatToRawIntBits(((Float) obj).floatValue()));
                            break;
                        case 2:
/* 206 */                   i11i0o0ii.I0010o(((Long) obj).longValue());
                            break;
                        case 3:
/* 196 */                   i11i0o0ii.I0010o(((Long) obj).longValue());
                            break;
                        case 4:
/* 186 */                   i11i0o0ii.I000lI(((Integer) obj).intValue());
                            break;
                        case 5:
/* 176 */                   i11i0o0ii.I000iOII(((Long) obj).longValue());
                            break;
                        case 6:
/* 166 */                   i11i0o0ii.I000OOo1O(((Integer) obj).intValue());
                            break;
                        case 7:
/* 156 */                   i11i0o0ii.I0000O(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                            break;
                        case 8:
/* 136 */                   if (!(obj instanceof i11I0IiII0Ol)) {
/* 146 */                       i11i0o0ii.I000o00OoI0I((String) obj);
                                break;
                            } else {
/* 140 */                       i11i0o0ii.I000II((i11I0IiII0Ol) obj);
                                break;
                            }
                        case 9:
/* 130 */                   ((i11O1oIl) ((i1111ll) obj)).I000O01llI0(i11i0o0ii);
                            break;
                        case 10:
/* 113 */                   i11O1oIl i11o1oil = (i11O1oIl) ((i1111ll) obj);
/* 119 */                   i11i0o0ii.I00100o1O0lo(i11o1oil.I000OiO());
/* 122 */                   i11o1oil.I000O01llI0(i11i0o0ii);
                            break;
                        case 11:
/* 93 */                    if (!(obj instanceof i11I0IiII0Ol)) {
/* 101 */                       byte[] bArr = (byte[]) obj;
/* 103 */                       int length = bArr.length;
/* 104 */                       i11i0o0ii.I00100o1O0lo(length);
/* 107 */                       i11i0o0ii.I0000oI00(length, bArr);
                                break;
                            } else {
/* 97 */                        i11i0o0ii.I000II((i11I0IiII0Ol) obj);
                                break;
                            }
                        case 12:
/* 87 */                    i11i0o0ii.I00100o1O0lo(((Integer) obj).intValue());
                            break;
                        case 13:
/* 77 */                    i11i0o0ii.I000lI(((Integer) obj).intValue());
                            break;
                        case 14:
/* 67 */                    i11i0o0ii.I000OOo1O(((Integer) obj).intValue());
                            break;
                        case 15:
/* 57 */                    i11i0o0ii.I000iOII(((Long) obj).longValue());
                            break;
                        case 16:
/* 38 */                    int iIntValue = ((Integer) obj).intValue();
/* 47 */                    i11i0o0ii.I00100o1O0lo((iIntValue >> 31) ^ (iIntValue + iIntValue));
                            break;
                        case 17:
/* 22 */                    long jLongValue = ((Long) obj).longValue();
/* 32 */                    i11i0o0ii.I0010o((jLongValue >> 63) ^ (jLongValue + jLongValue));
                            break;
                    }
                }

                public static boolean I000O01llI0(Map.Entry entry) {
/* 29 */            throw null;
                }

                public static final int I000OOo1O(Map.Entry entry) {
/* 7 */             entry.getValue();
/* 29 */            throw null;
                }

                public final i11Ii1iI0 clone() {
/* 3 */             i11Ii1iI0 i11ii1ii0 = new i11Ii1iI0();
/* 11 */            i11ii1ii0.I00000oIO = new i11o10OIl();
/* 13 */            i11o10OIl i11o10oil = this.I00000oIO;
/* 18 */            if (i11o10oil.I00iiI > 0) {
/* 63 */                ((i11O01I1o) i11o10oil.I0000Il00O(0).I00iOIl).getClass();
/* 110 */               throw null;
                    }
/* 24 */            Iterator it = i11o10oil.I00000oIO().iterator();
/* 32 */            if (!it.hasNext()) {
/* 34 */                return i11ii1ii0;
                    }
/* 39 */            Map.Entry entry = (Map.Entry) it.next();
/* 45 */            i11O01I1o i11o01i1o = (i11O01I1o) entry.getKey();
/* 47 */            entry.getValue();
/* 50 */            i11o01i1o.getClass();
/* 53 */            throw null;
                }

                public final Iterator I0000Il00O() {
/* 1 */             i11o10OIl i11o10oil = this.I00000oIO;
                    return i11o10oil.isEmpty() ? Collections.emptyIterator() : ((I1IlioI1o1I) i11o10oil.entrySet()).iterator();
                }

                public final void I0000O() {
/* 1 */             i11o10OIl i11o10oil = this.I00000oIO;
/* 5 */             if (this.I00000oOI) {
/* 7 */                 return;
                    }
/* 8 */             int i = i11o10oil.I00iiI;
/* 12 */            for (int i2 = 0; i2 < i; i2++) {
/* 18 */                Object obj = i11o10oil.I0000Il00O(i2).I00iiI;
/* 22 */                if (obj instanceof i11O1oIl) {
/* 24 */                    i11O1oIl i11o1oil = (i11O1oIl) obj;
/* 26 */                    i11o1oil.getClass();
/* 39 */                    i11liii0.I0000Il00O.I00000oIO(i11o1oil.getClass()).I0000oI00(i11o1oil);
/* 42 */                    i11o1oil.I0000Il00O();
                        }
                    }
/* 50 */            if (!i11o10oil.I00iio) {
/* 54 */                for (int i3 = 0; i3 < i11o10oil.I00iiI; i3++) {
/* 64 */                    ((i11O01I1o) i11o10oil.I0000Il00O(i3).I00iOIl).getClass();
                        }
/* 74 */                Iterator it = i11o10oil.I00000oIO().iterator();
/* 82 */                while (it.hasNext()) {
/* 96 */                    ((i11O01I1o) ((Map.Entry) it.next()).getKey()).getClass();
                        }
                    }
/* 103 */           if (!i11o10oil.I00iio) {
/* 122 */               i11o10oil.I00iiO = i11o10oil.I00iiO.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(i11o10oil.I00iiO);
/* 141 */               i11o10oil.I00ilO0 = i11o10oil.I00ilO0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(i11o10oil.I00ilO0);
/* 143 */               i11o10oil.I00iio = true;
                    }
/* 145 */           this.I00000oOI = true;
                }

                public final boolean I0001Ioi1lo() {
/* 1 */             i11o10OIl i11o10oil = this.I00000oIO;
/* 3 */             int i = i11o10oil.I00iiI;
/* 6 */             int i2 = 0;
                    while (true) {
/* 7 */                 if (i2 >= i) {
/* 27 */                    Iterator it = i11o10oil.I00000oIO().iterator();
/* 35 */                    while (it.hasNext()) {
/* 47 */                        if (!I000O01llI0((Map.Entry) it.next())) {
                                }
                            }
/* 50 */                    return true;
                        }
/* 17 */                if (!I000O01llI0(i11o10oil.I0000Il00O(i2))) {
                            break;
                        }
/* 20 */                i2++;
                    }
/* 5 */             return false;
                }

                public final void I000II(Map.Entry entry) {
/* 5 */             i11O01I1o i11o01i1o = (i11O01I1o) entry.getKey();
/* 7 */             entry.getValue();
/* 10 */            i11o01i1o.getClass();
/* 29 */            throw null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof i11Ii1iI0) {
/* 17 */                return this.I00000oIO.equals(((i11Ii1iI0) obj).I00000oIO);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }
