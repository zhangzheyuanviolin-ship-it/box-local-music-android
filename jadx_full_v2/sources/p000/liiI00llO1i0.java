            package p000;

            import java.io.Serializable;
            import java.io.StringWriter;
            import java.lang.invoke.VarHandle;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicLong;
            
            public abstract class liiI00llO1i0 {
                public static iI01OoiIlOl I00000oIO(iI1000o0ol ii1000o0ol) {
                    String strI001l0I00;
/* 1 */             int iI000O01llI0 = ii1000o0ol.I000O01llI0();
/* 5 */             iI01OoiIlOl ii01ooiilolI0000O = I0000O(ii1000o0ol, iI000O01llI0);
/* 9 */             if (ii01ooiilolI0000O == null) {
/* 11 */                return I0000Il00O(ii1000o0ol, iI000O01llI0);
                    }
/* 18 */            ArrayDeque arrayDeque = new ArrayDeque();
                    while (true) {
/* 21 */                int iI00000oIO = ii1000o0ol.I00ioIO;
/* 23 */                if (iI00000oIO == 0) {
/* 25 */                    iI00000oIO = ii1000o0ol.I00000oIO();
                        }
/* 29 */                String str = null;
/* 33 */                if (iI00000oIO == 2 || iI00000oIO == 4 || iI00000oIO == 17) {
/* 147 */                   boolean z = ii01ooiilolI0000O instanceof iI01IIi0Oo;
/* 149 */                   int iI00000oIO2 = ii1000o0ol.I00ioIO;
/* 151 */                   if (z) {
/* 153 */                       if (iI00000oIO2 == 0) {
/* 155 */                           iI00000oIO2 = ii1000o0ol.I00000oIO();
                                }
/* 159 */                       if (iI00000oIO2 != 4) {
/* 186 */                           throw ii1000o0ol.I001i1lo1io("END_ARRAY");
                                }
/* 161 */                       int i = ii1000o0ol.I00ll1;
/* 165 */                       ii1000o0ol.I00ll1 = i - 1;
/* 167 */                       int[] iArr = ii1000o0ol.I00lll10;
                                int i2 = i - 2;
/* 175 */                       iArr[i2] = iArr[i2] + 1;
/* 177 */                       ii1000o0ol.I00ioIO = 0;
                            } else {
/* 187 */                       if (iI00000oIO2 == 0) {
/* 189 */                           iI00000oIO2 = ii1000o0ol.I00000oIO();
                                }
/* 193 */                       if (iI00000oIO2 != 2) {
/* 437 */                           throw ii1000o0ol.I001i1lo1io("END_OBJECT");
                                }
/* 195 */                       int i3 = ii1000o0ol.I00ll1;
                                int i4 = i3 - 1;
/* 199 */                       ii1000o0ol.I00ll1 = i4;
/* 203 */                       ii1000o0ol.I00lli11[i4] = null;
/* 205 */                       int[] iArr2 = ii1000o0ol.I00lll10;
                                int i5 = i3 - 2;
/* 213 */                       iArr2[i5] = iArr2[i5] + 1;
/* 215 */                       ii1000o0ol.I00ioIO = 0;
                            }
/* 221 */                   if (arrayDeque.isEmpty()) {
/* 231 */                       return ii01ooiilolI0000O;
                            }
/* 227 */                   ii01ooiilolI0000O = (iI01OoiIlOl) arrayDeque.removeLast();
                        } else {
/* 43 */                    if (ii01ooiilolI0000O instanceof iI0IO110Iil) {
/* 45 */                        int iI00000oIO3 = ii1000o0ol.I00ioIO;
/* 47 */                        if (iI00000oIO3 == 0) {
/* 49 */                            iI00000oIO3 = ii1000o0ol.I00000oIO();
                                }
/* 55 */                        if (iI00000oIO3 == 14) {
/* 57 */                            strI001l0I00 = ii1000o0ol.I00IOO();
                                } else if (iI00000oIO3 == 12) {
/* 69 */                            strI001l0I00 = ii1000o0ol.I001l0I00('\'');
                                } else {
/* 76 */                            if (iI00000oIO3 != 13) {
/* 102 */                               throw ii1000o0ol.I001i1lo1io("a name");
                                    }
/* 80 */                            strI001l0I00 = ii1000o0ol.I001l0I00('\"');
                                }
/* 61 */                        str = strI001l0I00;
/* 85 */                        ii1000o0ol.I00ioIO = 0;
/* 93 */                        ii1000o0ol.I00lli11[ii1000o0ol.I00ll1 - 1] = str;
                            }
/* 103 */                   int iI000O01llI02 = ii1000o0ol.I000O01llI0();
/* 107 */                   iI01OoiIlOl ii01ooiilolI0000O2 = I0000O(ii1000o0ol, iI000O01llI02);
/* 118 */                   iI01OoiIlOl ii01ooiilolI0000Il00O = ii01ooiilolI0000O2 == null ? I0000Il00O(ii1000o0ol, iI000O01llI02) : ii01ooiilolI0000O2;
/* 121 */                   if (ii01ooiilolI0000O instanceof iI01IIi0Oo) {
/* 128 */                       ((iI01IIi0Oo) ii01ooiilolI0000O).I00iOIl.add(ii01ooiilolI0000Il00O);
                            } else {
/* 137 */                       ((iI0IO110Iil) ii01ooiilolI0000O).I00iOIl.put(str, ii01ooiilolI0000Il00O);
                            }
/* 140 */                   if (ii01ooiilolI0000O2 != null) {
/* 142 */                       arrayDeque.addLast(ii01ooiilolI0000O);
/* 145 */                       ii01ooiilolI0000O = ii01ooiilolI0000Il00O;
                            }
                        }
                    }
                }

                public static void I00000oOI(iI10Ol ii10ol, iI01OoiIlOl ii01ooiilol) {
/* 1 */             StringWriter stringWriter = ii10ol.I00iOIl;
/* 5 */             if (ii01ooiilol == null || (ii01ooiilol instanceof iI0I1O1lOlo)) {
/* 428 */               if (ii10ol.I00l0I0l0lO1 != null) {
/* 430 */                   ii10ol.I00100l0();
                        }
/* 433 */               ii10ol.I000II();
/* 436 */               stringWriter.write("null");
/* 900 */               return;
                    }
/* 16 */            if (ii01ooiilol instanceof iI0IoOoO0oOI) {
/* 18 */                iI0IoOoO0oOI ii0ioooo0ooi = (iI0IoOoO0oOI) ii01ooiilol;
/* 20 */                Serializable serializable = ii0ioooo0ooi.I00iOIl;
/* 24 */                if (!(serializable instanceof Number)) {
/* 160 */                   if (serializable instanceof Boolean) {
/* 164 */                       boolean zBooleanValue = ((Boolean) serializable).booleanValue();
/* 168 */                       ii10ol.I00100l0();
/* 171 */                       ii10ol.I000II();
/* 181 */                       stringWriter.write(true != zBooleanValue ? "false" : "true");
/* 184 */                       return;
                            }
/* 185 */                   String strI0001Ioi1lo = ii0ioooo0ooi.I0001Ioi1lo();
/* 189 */                   if (strI0001Ioi1lo != null) {
/* 205 */                       ii10ol.I00100l0();
/* 208 */                       ii10ol.I000II();
/* 211 */                       ii10ol.I000l1(strI0001Ioi1lo);
/* 214 */                       return;
                            } else {
/* 193 */                       if (ii10ol.I00l0I0l0lO1 != null) {
/* 195 */                           ii10ol.I00100l0();
                                }
/* 198 */                       ii10ol.I000II();
/* 201 */                       stringWriter.write("null");
/* 204 */                       return;
                            }
                        }
/* 26 */                Number numberI0000oI00 = ii0ioooo0ooi.I0000oI00();
/* 30 */                ii10ol.I00100l0();
/* 33 */                String string = numberI0000oI00.toString();
/* 37 */                Class<?> cls = numberI0000oI00.getClass();
/* 43 */                if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
/* 80 */                    if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
/* 138 */                       if (ii10ol.I00ioIO != 1) {
/* 147 */                           I000II.I000iOII("Numeric values must be finite, but was ".concat(string));
/* 150 */                           return;
                                }
                            } else if (cls != Float.class && cls != Double.class && !iI10Ol.I00l0OO0IO.matcher(string).matches()) {
/* 132 */                       I000II.I000iOII(IIl001iO0Io.I000oI1ioi("String created by ", String.valueOf(cls), " is not a valid JSON number: ", string));
/* 135 */                       return;
                            }
                        }
/* 151 */               ii10ol.I000II();
/* 154 */               stringWriter.append((CharSequence) string);
/* 157 */               return;
                    }
/* 217 */           if (ii01ooiilol instanceof iI01IIi0Oo) {
/* 219 */               ii10ol.I00100l0();
/* 222 */               ii10ol.I000II();
/* 225 */               int i = ii10ol.I00iiO;
/* 227 */               int[] iArrCopyOf = ii10ol.I00iiI;
/* 230 */               if (i == iArrCopyOf.length) {
/* 233 */                   iArrCopyOf = Arrays.copyOf(iArrCopyOf, i + i);
/* 237 */                   ii10ol.I00iiI = iArrCopyOf;
                        }
/* 239 */               int i2 = ii10ol.I00iiO;
/* 243 */               ii10ol.I00iiO = i2 + 1;
/* 245 */               iArrCopyOf[i2] = 1;
/* 249 */               stringWriter.write(91);
/* 256 */               Iterator it = ((iI01IIi0Oo) ii01ooiilol).I00iOIl.iterator();
/* 264 */               while (it.hasNext()) {
/* 272 */                   I00000oOI(ii10ol, (iI01OoiIlOl) it.next());
                        }
/* 279 */               ii10ol.I0000Il00O(1, 2, ']');
/* 282 */               return;
                    }
/* 285 */           if (!(ii01ooiilol instanceof iI0IO110Iil)) {
/* 422 */               I000II.I000iOII("Couldn't write ".concat(String.valueOf(ii01ooiilol.getClass())));
/* 425 */               return;
                    }
/* 287 */           ii10ol.I00100l0();
/* 290 */           ii10ol.I000II();
/* 293 */           int i3 = ii10ol.I00iiO;
/* 295 */           int[] iArrCopyOf2 = ii10ol.I00iiI;
/* 298 */           if (i3 == iArrCopyOf2.length) {
/* 301 */               iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i3 + i3);
/* 305 */               ii10ol.I00iiI = iArrCopyOf2;
                    }
/* 307 */           int i4 = ii10ol.I00iiO;
/* 311 */           ii10ol.I00iiO = i4 + 1;
/* 314 */           iArrCopyOf2[i4] = 3;
/* 318 */           stringWriter.write(123);
/* 333 */           Iterator it2 = ((iI0i1oi0OO0l) ii01ooiilol.I00000oOI().I00iOIl.entrySet()).iterator();
/* 345 */           while (((O100iii0I0i) it2).hasNext()) {
/* 350 */               iI0lliloO ii0llilooI0000Il00O = ((iI0i0I1) it2).I0000Il00O();
/* 358 */               String str = (String) ii0llilooI0000Il00O.getKey();
/* 362 */               Objects.requireNonNull(str, "name == null");
/* 367 */               if (ii10ol.I00l0I0l0lO1 != null) {
/* 398 */                   I000II.I001IO000("Already wrote a name, expecting a value.");
/* 401 */                   return;
                        }
/* 369 */               int iI00000oIO = ii10ol.I00000oIO();
/* 373 */               if (iI00000oIO != 3 && iI00000oIO != 5) {
/* 380 */                   I000II.I001IO000("Please begin an object before writing a name.");
/* 383 */                   return;
                        } else {
/* 384 */                   ii10ol.I00l0I0l0lO1 = str;
/* 392 */                   I00000oOI(ii10ol, (iI01OoiIlOl) ii0llilooI0000Il00O.getValue());
                        }
                    }
/* 404 */           ii10ol.I0000Il00O(3, 5, '}');
                }

                public static final iI01OoiIlOl I0000Il00O(iI1000o0ol ii1000o0ol, int i) {
                    int i2 = i - 1;
/* 4 */             if (i2 == 5) {
/* 150 */               String strI000II = ii1000o0ol.I000II();
/* 154 */               iI0IoOoO0oOI ii0ioooo0ooi = new iI0IoOoO0oOI();
/* 157 */               Objects.requireNonNull(strI000II);
/* 160 */               ii0ioooo0ooi.I00iOIl = strI000II;
/* 162 */               VarHandle.storeStoreFence();
/* 332 */               return ii0ioooo0ooi;
                    }
/* 7 */             if (i2 == 6) {
/* 136 */               iI0Oili0O0 ii0oili0o0 = new iI0Oili0O0(ii1000o0ol.I000II());
/* 139 */               iI0IoOoO0oOI ii0ioooo0ooi2 = new iI0IoOoO0oOI();
/* 142 */               ii0ioooo0ooi2.I00iOIl = ii0oili0o0;
/* 144 */               VarHandle.storeStoreFence();
/* 147 */               return ii0ioooo0ooi2;
                    }
/* 9 */             boolean z = true;
/* 12 */            if (i2 != 7) {
/* 16 */                if (i2 != 8) {
/* 61 */                    I000II.I001IO000("Unexpected token: ".concat(liiI1I10II.I00000oIO(i)));
/* 64 */                    return null;
                        }
/* 18 */                int iI00000oIO = ii1000o0ol.I00ioIO;
/* 20 */                if (iI00000oIO == 0) {
/* 22 */                    iI00000oIO = ii1000o0ol.I00000oIO();
                        }
/* 26 */                if (iI00000oIO != 7) {
/* 50 */                    throw ii1000o0ol.I001i1lo1io("null");
                        }
/* 28 */                ii1000o0ol.I00ioIO = 0;
/* 30 */                int[] iArr = ii1000o0ol.I00lll10;
                        int i3 = ii1000o0ol.I00ll1 - 1;
/* 39 */                iArr[i3] = iArr[i3] + 1;
/* 41 */                return iI0I1O1lOlo.I00iOIl;
                    }
/* 68 */            int iI00000oIO2 = ii1000o0ol.I00ioIO;
/* 70 */            if (iI00000oIO2 == 0) {
/* 72 */                iI00000oIO2 = ii1000o0ol.I00000oIO();
                    }
/* 76 */            if (iI00000oIO2 == 5) {
/* 78 */                ii1000o0ol.I00ioIO = 0;
/* 80 */                int[] iArr2 = ii1000o0ol.I00lll10;
                        int i4 = ii1000o0ol.I00ll1 - 1;
/* 89 */                iArr2[i4] = iArr2[i4] + 1;
                    } else {
/* 92 */                if (iI00000oIO2 != 6) {
/* 127 */                   throw ii1000o0ol.I001i1lo1io("a boolean");
                        }
/* 94 */                ii1000o0ol.I00ioIO = 0;
/* 96 */                int[] iArr3 = ii1000o0ol.I00lll10;
                        int i5 = ii1000o0ol.I00ll1 - 1;
/* 105 */               iArr3[i5] = iArr3[i5] + 1;
/* 107 */               z = false;
                    }
/* 108 */           Boolean boolValueOf = Boolean.valueOf(z);
/* 112 */           iI0IoOoO0oOI ii0ioooo0ooi3 = new iI0IoOoO0oOI();
/* 115 */           ii0ioooo0ooi3.I00iOIl = boolValueOf;
/* 117 */           VarHandle.storeStoreFence();
/* 120 */           return ii0ioooo0ooi3;
                }

                public static final iI01OoiIlOl I0000O(iI1000o0ol ii1000o0ol, int i) {
                    int i2 = i - 1;
/* 6 */             if (i2 == 0) {
/* 51 */                int iI00000oIO = ii1000o0ol.I00ioIO;
/* 53 */                if (iI00000oIO == 0) {
/* 55 */                    iI00000oIO = ii1000o0ol.I00000oIO();
                        }
/* 59 */                if (iI00000oIO != 3) {
/* 106 */                   throw ii1000o0ol.I001i1lo1io("BEGIN_ARRAY");
                        }
/* 61 */                ii1000o0ol.I00Io1lO(1);
/* 70 */                ii1000o0ol.I00lll10[ii1000o0ol.I00ll1 - 1] = 0;
/* 72 */                ii1000o0ol.I00ioIO = 0;
/* 76 */                iI01IIi0Oo ii01iii0oo = new iI01IIi0Oo();
/* 84 */                ii01iii0oo.I00iOIl = new ArrayList();
/* 86 */                VarHandle.storeStoreFence();
/* 89 */                return ii01iii0oo;
                    }
/* 9 */             if (i2 != 2) {
/* 11 */                return null;
                    }
/* 13 */            int iI00000oIO2 = ii1000o0ol.I00ioIO;
/* 15 */            if (iI00000oIO2 == 0) {
/* 17 */                iI00000oIO2 = ii1000o0ol.I00000oIO();
                    }
/* 21 */            if (iI00000oIO2 != 1) {
/* 50 */                throw ii1000o0ol.I001i1lo1io("BEGIN_OBJECT");
                    }
/* 23 */            ii1000o0ol.I00Io1lO(3);
/* 26 */            ii1000o0ol.I00ioIO = 0;
/* 30 */            iI0IO110Iil ii0io110iil = new iI0IO110Iil();
/* 38 */            ii0io110iil.I00iOIl = new iI0o1i0o(0);
/* 40 */            VarHandle.storeStoreFence();
/* 43 */            return ii0io110iil;
                }
            }
