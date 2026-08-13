            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class ii0O1Ol1i {
                public static final ii0O1Ol1i I0000Il00O;
                public ii0oll0il I00000oIO;
                public boolean I00000oOI;

                static {
/* 5 */             ii0oll0il ii0oll0ilVar = new ii0oll0il();
/* 8 */             ii0O1Ol1i ii0o1ol1i = new ii0O1Ol1i();
/* 11 */            ii0o1ol1i.I00000oIO = ii0oll0ilVar;
/* 13 */            ii0o1ol1i.I0000O();
/* 16 */            ii0o1ol1i.I0000O();
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            I0000Il00O = ii0o1ol1i;
                }

                public static int I00000oIO(ii10iIl ii10iil, int i, Object obj) {
                    int iI0001Ioi1lo;
                    int iI00000oOI;
/* 3 */             int iI00000oOI2 = ii0I1Il.I00000oOI(i << 3);
/* 9 */             if (ii10iil == ii10iIl.I00ilI0I1) {
/* 14 */                Charset charset = ii0i1ll10I0.I00000oIO;
/* 16 */                iI00000oOI2 += iI00000oOI2;
                    }
/* 17 */            ii10l1 ii10l1Var = ii10l1.I00iOIl;
/* 23 */            int iI0000Il00O = 4;
                    switch (ii10iil.ordinal()) {
                        case 0:
/* 243 */                   ((Double) obj).getClass();
/* 77 */                    iI0000Il00O = 8;
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 1:
/* 237 */                   ((Float) obj).getClass();
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 2:
/* 230 */                   iI0000Il00O = ii0I1Il.I0000Il00O(((Long) obj).longValue());
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 3:
/* 219 */                   iI0000Il00O = ii0I1Il.I0000Il00O(((Long) obj).longValue());
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 4:
/* 208 */                   iI0000Il00O = ii0I1Il.I0000Il00O(((Integer) obj).intValue());
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
/* 162 */                   if (!(obj instanceof ii01lO0l11ii)) {
/* 177 */                       iI0000Il00O = ii0I1Il.I00000oIO((String) obj);
/* 248 */                       return iI00000oOI2 + iI0000Il00O;
                            }
/* 166 */                   iI0001Ioi1lo = ((ii01lO0l11ii) obj).I0001Ioi1lo();
/* 170 */                   iI00000oOI = ii0I1Il.I00000oOI(iI0001Ioi1lo);
/* 126 */                   iI0000Il00O = iI00000oOI + iI0001Ioi1lo;
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 9:
/* 155 */                   iI0000Il00O = ((ii0OoOo10) ((ii00oo) obj)).I0010o();
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 10:
/* 142 */                   iI0001Ioi1lo = ((ii0OoOo10) ((ii00oo) obj)).I0010o();
/* 146 */                   iI00000oOI = ii0I1Il.I00000oOI(iI0001Ioi1lo);
/* 126 */                   iI0000Il00O = iI00000oOI + iI0001Ioi1lo;
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 11:
/* 114 */                   if (obj instanceof ii01lO0l11ii) {
/* 118 */                       iI0001Ioi1lo = ((ii01lO0l11ii) obj).I0001Ioi1lo();
/* 122 */                       iI00000oOI = ii0I1Il.I00000oOI(iI0001Ioi1lo);
                            } else {
/* 132 */                       iI0001Ioi1lo = ((byte[]) obj).length;
/* 133 */                       iI00000oOI = ii0I1Il.I00000oOI(iI0001Ioi1lo);
                            }
/* 126 */                   iI0000Il00O = iI00000oOI + iI0001Ioi1lo;
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 12:
/* 106 */                   iI0000Il00O = ii0I1Il.I00000oOI(((Integer) obj).intValue());
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 13:
/* 94 */                    iI0000Il00O = ii0I1Il.I0000Il00O(((Integer) obj).intValue());
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
/* 66 */                    iI0000Il00O = ii0I1Il.I00000oOI((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        case 17:
/* 39 */                    long jLongValue = ((Long) obj).longValue();
/* 49 */                    iI0000Il00O = ii0I1Il.I0000Il00O((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 248 */                   return iI00000oOI2 + iI0000Il00O;
                        default:
/* 36 */                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                }

                public static void I0000oI00(ii0I1Il ii0i1il, ii10iIl ii10iil, int i, Object obj) {
/* 3 */             if (ii10iil == ii10iIl.I00ilI0I1) {
/* 228 */               Charset charset = ii0i1ll10I0.I00000oIO;
/* 231 */               ii0i1il.I001i1O0Ol(i, 3);
/* 236 */               ((ii0OoOo10) ((ii00oo) obj)).I00100o1O0lo(ii0i1il);
/* 240 */               ii0i1il.I001i1O0Ol(i, 4);
/* 243 */               return;
                    }
/* 7 */             ii0i1il.I001i1O0Ol(i, ii10iil.I00iiI);
/* 10 */            ii10l1 ii10l1Var = ii10l1.I00iOIl;
                    switch (ii10iil.ordinal()) {
                        case 0:
/* 222 */                   ii0i1il.I000o00OoI0I(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                            break;
                        case 1:
/* 208 */                   ii0i1il.I000l1(Float.floatToRawIntBits(((Float) obj).floatValue()));
                            break;
                        case 2:
/* 194 */                   ii0i1il.I001lIiIIo1O(((Long) obj).longValue());
                            break;
                        case 3:
/* 184 */                   ii0i1il.I001lIiIIo1O(((Long) obj).longValue());
                            break;
                        case 4:
/* 174 */                   ii0i1il.I00100l0(((Integer) obj).intValue());
                            break;
                        case 5:
/* 164 */                   ii0i1il.I000o00OoI0I(((Long) obj).longValue());
                            break;
                        case 6:
/* 154 */                   ii0i1il.I000l1(((Integer) obj).intValue());
                            break;
                        case 7:
/* 144 */                   ii0i1il.I0000oI00(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                            break;
                        case 8:
/* 124 */                   if (!(obj instanceof ii01lO0l11ii)) {
/* 134 */                       ii0i1il.I001IO000((String) obj);
                                break;
                            } else {
/* 128 */                       ii0i1il.I000OiO((ii01lO0l11ii) obj);
                                break;
                            }
                        case 9:
/* 118 */                   ((ii0OoOo10) ((ii00oo) obj)).I00100o1O0lo(ii0i1il);
                            break;
                        case 10:
/* 110 */                   ii0i1il.I0010I0i((ii00oo) obj);
                            break;
                        case 11:
/* 93 */                    if (!(obj instanceof ii01lO0l11ii)) {
/* 101 */                       byte[] bArr = (byte[]) obj;
/* 104 */                       ii0i1il.I000II(bArr.length, bArr);
                                break;
                            } else {
/* 97 */                        ii0i1il.I000OiO((ii01lO0l11ii) obj);
                                break;
                            }
                        case 12:
/* 87 */                    ii0i1il.I001iOo1i0O(((Integer) obj).intValue());
                            break;
                        case 13:
/* 77 */                    ii0i1il.I00100l0(((Integer) obj).intValue());
                            break;
                        case 14:
/* 67 */                    ii0i1il.I000l1(((Integer) obj).intValue());
                            break;
                        case 15:
/* 57 */                    ii0i1il.I000o00OoI0I(((Long) obj).longValue());
                            break;
                        case 16:
/* 38 */                    int iIntValue = ((Integer) obj).intValue();
/* 47 */                    ii0i1il.I001iOo1i0O((iIntValue >> 31) ^ (iIntValue + iIntValue));
                            break;
                        case 17:
/* 22 */                    long jLongValue = ((Long) obj).longValue();
/* 32 */                    ii0i1il.I001lIiIIo1O((jLongValue >> 63) ^ (jLongValue + jLongValue));
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

                public final ii0O1Ol1i clone() {
/* 3 */             ii0O1Ol1i ii0o1ol1i = new ii0O1Ol1i();
/* 11 */            ii0o1ol1i.I00000oIO = new ii0oll0il();
/* 13 */            ii0oll0il ii0oll0ilVar = this.I00000oIO;
/* 18 */            if (ii0oll0ilVar.I00iiI > 0) {
/* 63 */                ((ii0Oil1l0io) ii0oll0ilVar.I0000Il00O(0).I00iOIl).getClass();
/* 110 */               throw null;
                    }
/* 24 */            Iterator it = ii0oll0ilVar.I00000oIO().iterator();
/* 32 */            if (!it.hasNext()) {
/* 34 */                return ii0o1ol1i;
                    }
/* 39 */            Map.Entry entry = (Map.Entry) it.next();
/* 45 */            ii0Oil1l0io ii0oil1l0io = (ii0Oil1l0io) entry.getKey();
/* 47 */            entry.getValue();
/* 50 */            ii0oil1l0io.getClass();
/* 53 */            throw null;
                }

                public final Iterator I0000Il00O() {
/* 1 */             ii0oll0il ii0oll0ilVar = this.I00000oIO;
                    return ii0oll0ilVar.isEmpty() ? Collections.emptyIterator() : ((I1IlioI1o1I) ii0oll0ilVar.entrySet()).iterator();
                }

                public final void I0000O() {
/* 1 */             ii0oll0il ii0oll0ilVar = this.I00000oIO;
/* 5 */             if (this.I00000oOI) {
/* 7 */                 return;
                    }
/* 8 */             int i = ii0oll0ilVar.I00iiI;
/* 12 */            for (int i2 = 0; i2 < i; i2++) {
/* 18 */                Object obj = ii0oll0ilVar.I0000Il00O(i2).I00iiI;
/* 22 */                if (obj instanceof ii0OoOo10) {
/* 26 */                    ((ii0OoOo10) obj).I000iOII();
                        }
                    }
/* 34 */            if (!ii0oll0ilVar.I00iio) {
/* 38 */                for (int i3 = 0; i3 < ii0oll0ilVar.I00iiI; i3++) {
/* 48 */                    ((ii0Oil1l0io) ii0oll0ilVar.I0000Il00O(i3).I00iOIl).getClass();
                        }
/* 58 */                Iterator it = ii0oll0ilVar.I00000oIO().iterator();
/* 66 */                while (it.hasNext()) {
/* 80 */                    ((ii0Oil1l0io) ((Map.Entry) it.next()).getKey()).getClass();
                        }
                    }
/* 87 */            if (!ii0oll0ilVar.I00iio) {
/* 106 */               ii0oll0ilVar.I00iiO = ii0oll0ilVar.I00iiO.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ii0oll0ilVar.I00iiO);
/* 125 */               ii0oll0ilVar.I00ilO0 = ii0oll0ilVar.I00ilO0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ii0oll0ilVar.I00ilO0);
/* 127 */               ii0oll0ilVar.I00iio = true;
                    }
/* 129 */           this.I00000oOI = true;
                }

                public final boolean I0001Ioi1lo() {
/* 1 */             ii0oll0il ii0oll0ilVar = this.I00000oIO;
/* 3 */             int i = ii0oll0ilVar.I00iiI;
/* 6 */             int i2 = 0;
                    while (true) {
/* 7 */                 if (i2 >= i) {
/* 27 */                    Iterator it = ii0oll0ilVar.I00000oIO().iterator();
/* 35 */                    while (it.hasNext()) {
/* 47 */                        if (!I000O01llI0((Map.Entry) it.next())) {
                                }
                            }
/* 50 */                    return true;
                        }
/* 17 */                if (!I000O01llI0(ii0oll0ilVar.I0000Il00O(i2))) {
                            break;
                        }
/* 20 */                i2++;
                    }
/* 5 */             return false;
                }

                public final void I000II(Map.Entry entry) {
/* 5 */             ii0Oil1l0io ii0oil1l0io = (ii0Oil1l0io) entry.getKey();
/* 7 */             entry.getValue();
/* 10 */            ii0oil1l0io.getClass();
/* 29 */            throw null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof ii0O1Ol1i) {
/* 17 */                return this.I00000oIO.equals(((ii0O1Ol1i) obj).I00000oIO);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }
