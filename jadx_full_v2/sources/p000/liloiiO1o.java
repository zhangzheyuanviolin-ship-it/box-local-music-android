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
            
            public abstract class liloiiO1o {
                public static il0ioI1OI I00000oIO(ilOiIllI iloiilli) {
                    String strI001l0I00;
/* 1 */             int iI000O01llI0 = iloiilli.I000O01llI0();
/* 5 */             il0ioI1OI il0ioi1oiI0000O = I0000O(iloiilli, iI000O01llI0);
/* 9 */             if (il0ioi1oiI0000O == null) {
/* 11 */                return I0000Il00O(iloiilli, iI000O01llI0);
                    }
/* 18 */            ArrayDeque arrayDeque = new ArrayDeque();
                    while (true) {
/* 21 */                int iI00000oIO = iloiilli.I00ioIO;
/* 23 */                if (iI00000oIO == 0) {
/* 25 */                    iI00000oIO = iloiilli.I00000oIO();
                        }
/* 29 */                String str = null;
/* 33 */                if (iI00000oIO == 2 || iI00000oIO == 4 || iI00000oIO == 17) {
/* 147 */                   boolean z = il0ioi1oiI0000O instanceof il0OoIi0Oi;
/* 149 */                   int iI00000oIO2 = iloiilli.I00ioIO;
/* 151 */                   if (z) {
/* 153 */                       if (iI00000oIO2 == 0) {
/* 155 */                           iI00000oIO2 = iloiilli.I00000oIO();
                                }
/* 159 */                       if (iI00000oIO2 != 4) {
/* 186 */                           throw iloiilli.I001i1lo1io("END_ARRAY");
                                }
/* 161 */                       int i = iloiilli.I00ll1;
/* 165 */                       iloiilli.I00ll1 = i - 1;
/* 167 */                       int[] iArr = iloiilli.I00lll10;
                                int i2 = i - 2;
/* 175 */                       iArr[i2] = iArr[i2] + 1;
/* 177 */                       iloiilli.I00ioIO = 0;
                            } else {
/* 187 */                       if (iI00000oIO2 == 0) {
/* 189 */                           iI00000oIO2 = iloiilli.I00000oIO();
                                }
/* 193 */                       if (iI00000oIO2 != 2) {
/* 437 */                           throw iloiilli.I001i1lo1io("END_OBJECT");
                                }
/* 195 */                       int i3 = iloiilli.I00ll1;
                                int i4 = i3 - 1;
/* 199 */                       iloiilli.I00ll1 = i4;
/* 203 */                       iloiilli.I00lli11[i4] = null;
/* 205 */                       int[] iArr2 = iloiilli.I00lll10;
                                int i5 = i3 - 2;
/* 213 */                       iArr2[i5] = iArr2[i5] + 1;
/* 215 */                       iloiilli.I00ioIO = 0;
                            }
/* 221 */                   if (arrayDeque.isEmpty()) {
/* 231 */                       return il0ioi1oiI0000O;
                            }
/* 227 */                   il0ioi1oiI0000O = (il0ioI1OI) arrayDeque.removeLast();
                        } else {
/* 43 */                    if (il0ioi1oiI0000O instanceof il0oiOo1loi1) {
/* 45 */                        int iI00000oIO3 = iloiilli.I00ioIO;
/* 47 */                        if (iI00000oIO3 == 0) {
/* 49 */                            iI00000oIO3 = iloiilli.I00000oIO();
                                }
/* 55 */                        if (iI00000oIO3 == 14) {
/* 57 */                            strI001l0I00 = iloiilli.I00IOO();
                                } else if (iI00000oIO3 == 12) {
/* 69 */                            strI001l0I00 = iloiilli.I001l0I00('\'');
                                } else {
/* 76 */                            if (iI00000oIO3 != 13) {
/* 102 */                               throw iloiilli.I001i1lo1io("a name");
                                    }
/* 80 */                            strI001l0I00 = iloiilli.I001l0I00('\"');
                                }
/* 61 */                        str = strI001l0I00;
/* 85 */                        iloiilli.I00ioIO = 0;
/* 93 */                        iloiilli.I00lli11[iloiilli.I00ll1 - 1] = str;
                            }
/* 103 */                   int iI000O01llI02 = iloiilli.I000O01llI0();
/* 107 */                   il0ioI1OI il0ioi1oiI0000O2 = I0000O(iloiilli, iI000O01llI02);
/* 118 */                   il0ioI1OI il0ioi1oiI0000Il00O = il0ioi1oiI0000O2 == null ? I0000Il00O(iloiilli, iI000O01llI02) : il0ioi1oiI0000O2;
/* 121 */                   if (il0ioi1oiI0000O instanceof il0OoIi0Oi) {
/* 128 */                       ((il0OoIi0Oi) il0ioi1oiI0000O).I00iOIl.add(il0ioi1oiI0000Il00O);
                            } else {
/* 137 */                       ((il0oiOo1loi1) il0ioi1oiI0000O).I00iOIl.put(str, il0ioi1oiI0000Il00O);
                            }
/* 140 */                   if (il0ioi1oiI0000O2 != null) {
/* 142 */                       arrayDeque.addLast(il0ioi1oiI0000O);
/* 145 */                       il0ioi1oiI0000O = il0ioi1oiI0000Il00O;
                            }
                        }
                    }
                }

                public static void I00000oOI(ilOlO0l ilolo0l, il0ioI1OI il0ioi1oi) {
/* 1 */             StringWriter stringWriter = ilolo0l.I00iOIl;
/* 5 */             if (il0ioi1oi == null || (il0ioi1oi instanceof il0o0Oo10)) {
/* 428 */               if (ilolo0l.I00l0I0l0lO1 != null) {
/* 430 */                   ilolo0l.I00100l0();
                        }
/* 433 */               ilolo0l.I000II();
/* 436 */               stringWriter.write("null");
/* 900 */               return;
                    }
/* 16 */            if (il0ioi1oi instanceof il1OoiO10iI) {
/* 18 */                il1OoiO10iI il1ooio10ii = (il1OoiO10iI) il0ioi1oi;
/* 20 */                Serializable serializable = il1ooio10ii.I00iOIl;
/* 24 */                if (!(serializable instanceof Number)) {
/* 160 */                   if (serializable instanceof Boolean) {
/* 164 */                       boolean zBooleanValue = ((Boolean) serializable).booleanValue();
/* 168 */                       ilolo0l.I00100l0();
/* 171 */                       ilolo0l.I000II();
/* 181 */                       stringWriter.write(true != zBooleanValue ? "false" : "true");
/* 184 */                       return;
                            }
/* 185 */                   String strI0001Ioi1lo = il1ooio10ii.I0001Ioi1lo();
/* 189 */                   if (strI0001Ioi1lo != null) {
/* 205 */                       ilolo0l.I00100l0();
/* 208 */                       ilolo0l.I000II();
/* 211 */                       ilolo0l.I000l1(strI0001Ioi1lo);
/* 214 */                       return;
                            } else {
/* 193 */                       if (ilolo0l.I00l0I0l0lO1 != null) {
/* 195 */                           ilolo0l.I00100l0();
                                }
/* 198 */                       ilolo0l.I000II();
/* 201 */                       stringWriter.write("null");
/* 204 */                       return;
                            }
                        }
/* 26 */                Number numberI0000oI00 = il1ooio10ii.I0000oI00();
/* 30 */                ilolo0l.I00100l0();
/* 33 */                String string = numberI0000oI00.toString();
/* 37 */                Class<?> cls = numberI0000oI00.getClass();
/* 43 */                if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
/* 80 */                    if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
/* 138 */                       if (ilolo0l.I00ioIO != 1) {
/* 147 */                           I000II.I000iOII("Numeric values must be finite, but was ".concat(string));
/* 150 */                           return;
                                }
                            } else if (cls != Float.class && cls != Double.class && !ilOlO0l.I00l0OO0IO.matcher(string).matches()) {
/* 132 */                       I000II.I000iOII(IIl001iO0Io.I000oI1ioi("String created by ", String.valueOf(cls), " is not a valid JSON number: ", string));
/* 135 */                       return;
                            }
                        }
/* 151 */               ilolo0l.I000II();
/* 154 */               stringWriter.append((CharSequence) string);
/* 157 */               return;
                    }
/* 217 */           if (il0ioi1oi instanceof il0OoIi0Oi) {
/* 219 */               ilolo0l.I00100l0();
/* 222 */               ilolo0l.I000II();
/* 225 */               int i = ilolo0l.I00iiO;
/* 227 */               int[] iArrCopyOf = ilolo0l.I00iiI;
/* 230 */               if (i == iArrCopyOf.length) {
/* 233 */                   iArrCopyOf = Arrays.copyOf(iArrCopyOf, i + i);
/* 237 */                   ilolo0l.I00iiI = iArrCopyOf;
                        }
/* 239 */               int i2 = ilolo0l.I00iiO;
/* 243 */               ilolo0l.I00iiO = i2 + 1;
/* 245 */               iArrCopyOf[i2] = 1;
/* 249 */               stringWriter.write(91);
/* 256 */               Iterator it = ((il0OoIi0Oi) il0ioi1oi).I00iOIl.iterator();
/* 264 */               while (it.hasNext()) {
/* 272 */                   I00000oOI(ilolo0l, (il0ioI1OI) it.next());
                        }
/* 279 */               ilolo0l.I0000Il00O(1, 2, ']');
/* 282 */               return;
                    }
/* 285 */           if (!(il0ioi1oi instanceof il0oiOo1loi1)) {
/* 422 */               I000II.I000iOII("Couldn't write ".concat(String.valueOf(il0ioi1oi.getClass())));
/* 425 */               return;
                    }
/* 287 */           ilolo0l.I00100l0();
/* 290 */           ilolo0l.I000II();
/* 293 */           int i3 = ilolo0l.I00iiO;
/* 295 */           int[] iArrCopyOf2 = ilolo0l.I00iiI;
/* 298 */           if (i3 == iArrCopyOf2.length) {
/* 301 */               iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i3 + i3);
/* 305 */               ilolo0l.I00iiI = iArrCopyOf2;
                    }
/* 307 */           int i4 = ilolo0l.I00iiO;
/* 311 */           ilolo0l.I00iiO = i4 + 1;
/* 314 */           iArrCopyOf2[i4] = 3;
/* 318 */           stringWriter.write(123);
/* 333 */           Iterator it2 = ((ilII0ii0) il0ioi1oi.I00000oOI().I00iOIl.entrySet()).iterator();
/* 345 */           while (((O100iii0I0i) it2).hasNext()) {
/* 350 */               iI0lliloO ii0llilooI0000O = ((ilI1IIOII1) it2).I0000O();
/* 358 */               String str = (String) ii0llilooI0000O.getKey();
/* 362 */               Objects.requireNonNull(str, "name == null");
/* 367 */               if (ilolo0l.I00l0I0l0lO1 != null) {
/* 398 */                   I000II.I001IO000("Already wrote a name, expecting a value.");
/* 401 */                   return;
                        }
/* 369 */               int iI00000oIO = ilolo0l.I00000oIO();
/* 373 */               if (iI00000oIO != 3 && iI00000oIO != 5) {
/* 380 */                   I000II.I001IO000("Please begin an object before writing a name.");
/* 383 */                   return;
                        } else {
/* 384 */                   ilolo0l.I00l0I0l0lO1 = str;
/* 392 */                   I00000oOI(ilolo0l, (il0ioI1OI) ii0llilooI0000O.getValue());
                        }
                    }
/* 404 */           ilolo0l.I0000Il00O(3, 5, '}');
                }

                public static final il0ioI1OI I0000Il00O(ilOiIllI iloiilli, int i) {
                    int i2 = i - 1;
/* 4 */             if (i2 == 5) {
/* 150 */               String strI000II = iloiilli.I000II();
/* 154 */               il1OoiO10iI il1ooio10ii = new il1OoiO10iI();
/* 157 */               Objects.requireNonNull(strI000II);
/* 160 */               il1ooio10ii.I00iOIl = strI000II;
/* 162 */               VarHandle.storeStoreFence();
/* 332 */               return il1ooio10ii;
                    }
/* 7 */             if (i2 == 6) {
/* 136 */               ilI0OO ili0oo = new ilI0OO(iloiilli.I000II());
/* 139 */               il1OoiO10iI il1ooio10ii2 = new il1OoiO10iI();
/* 142 */               il1ooio10ii2.I00iOIl = ili0oo;
/* 144 */               VarHandle.storeStoreFence();
/* 147 */               return il1ooio10ii2;
                    }
/* 9 */             boolean z = true;
/* 12 */            if (i2 != 7) {
/* 16 */                if (i2 != 8) {
/* 61 */                    I000II.I001IO000("Unexpected token: ".concat(lilol1OolOo.I00000oIO(i)));
/* 64 */                    return null;
                        }
/* 18 */                int iI00000oIO = iloiilli.I00ioIO;
/* 20 */                if (iI00000oIO == 0) {
/* 22 */                    iI00000oIO = iloiilli.I00000oIO();
                        }
/* 26 */                if (iI00000oIO != 7) {
/* 50 */                    throw iloiilli.I001i1lo1io("null");
                        }
/* 28 */                iloiilli.I00ioIO = 0;
/* 30 */                int[] iArr = iloiilli.I00lll10;
                        int i3 = iloiilli.I00ll1 - 1;
/* 39 */                iArr[i3] = iArr[i3] + 1;
/* 41 */                return il0o0Oo10.I00iOIl;
                    }
/* 68 */            int iI00000oIO2 = iloiilli.I00ioIO;
/* 70 */            if (iI00000oIO2 == 0) {
/* 72 */                iI00000oIO2 = iloiilli.I00000oIO();
                    }
/* 76 */            if (iI00000oIO2 == 5) {
/* 78 */                iloiilli.I00ioIO = 0;
/* 80 */                int[] iArr2 = iloiilli.I00lll10;
                        int i4 = iloiilli.I00ll1 - 1;
/* 89 */                iArr2[i4] = iArr2[i4] + 1;
                    } else {
/* 92 */                if (iI00000oIO2 != 6) {
/* 127 */                   throw iloiilli.I001i1lo1io("a boolean");
                        }
/* 94 */                iloiilli.I00ioIO = 0;
/* 96 */                int[] iArr3 = iloiilli.I00lll10;
                        int i5 = iloiilli.I00ll1 - 1;
/* 105 */               iArr3[i5] = iArr3[i5] + 1;
/* 107 */               z = false;
                    }
/* 108 */           Boolean boolValueOf = Boolean.valueOf(z);
/* 112 */           il1OoiO10iI il1ooio10ii3 = new il1OoiO10iI();
/* 115 */           il1ooio10ii3.I00iOIl = boolValueOf;
/* 117 */           VarHandle.storeStoreFence();
/* 120 */           return il1ooio10ii3;
                }

                public static final il0ioI1OI I0000O(ilOiIllI iloiilli, int i) {
                    int i2 = i - 1;
/* 6 */             if (i2 == 0) {
/* 51 */                int iI00000oIO = iloiilli.I00ioIO;
/* 53 */                if (iI00000oIO == 0) {
/* 55 */                    iI00000oIO = iloiilli.I00000oIO();
                        }
/* 59 */                if (iI00000oIO != 3) {
/* 106 */                   throw iloiilli.I001i1lo1io("BEGIN_ARRAY");
                        }
/* 61 */                iloiilli.I00Io1lO(1);
/* 70 */                iloiilli.I00lll10[iloiilli.I00ll1 - 1] = 0;
/* 72 */                iloiilli.I00ioIO = 0;
/* 76 */                il0OoIi0Oi il0ooii0oi = new il0OoIi0Oi();
/* 84 */                il0ooii0oi.I00iOIl = new ArrayList();
/* 86 */                VarHandle.storeStoreFence();
/* 89 */                return il0ooii0oi;
                    }
/* 9 */             if (i2 != 2) {
/* 11 */                return null;
                    }
/* 13 */            int iI00000oIO2 = iloiilli.I00ioIO;
/* 15 */            if (iI00000oIO2 == 0) {
/* 17 */                iI00000oIO2 = iloiilli.I00000oIO();
                    }
/* 21 */            if (iI00000oIO2 != 1) {
/* 50 */                throw iloiilli.I001i1lo1io("BEGIN_OBJECT");
                    }
/* 23 */            iloiilli.I00Io1lO(3);
/* 26 */            iloiilli.I00ioIO = 0;
/* 30 */            il0oiOo1loi1 il0oioo1loi1 = new il0oiOo1loi1();
/* 38 */            il0oioo1loi1.I00iOIl = new iI0o1i0o(1);
/* 40 */            VarHandle.storeStoreFence();
/* 43 */            return il0oioo1loi1;
                }
            }
