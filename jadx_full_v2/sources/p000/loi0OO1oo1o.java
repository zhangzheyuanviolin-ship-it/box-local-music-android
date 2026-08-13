            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.net.InetAddress;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.net.URL;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.BitSet;
            import java.util.Currency;
            import java.util.Iterator;
            import java.util.Locale;
            import java.util.Objects;
            import java.util.StringTokenizer;
            import java.util.UUID;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicIntegerArray;
            import java.util.concurrent.atomic.AtomicLong;
            
            public final class loi0OO1oo1o extends llOl001olOi {
                public static final loi0OO1oo1o I00000oOI = new loi0OO1oo1o(0);
                public final int I00000oIO;

                public loi0OO1oo1o(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public static void I0000Il00O(o0Io0l11I o0io0l11i, llII0l1O1l1 llii0l1o1l1) {
/* 1 */             OlOl0Oi olOl0Oi = o0io0l11i.I00iOIl;
/* 5 */             if (llii0l1o1l1 == null || (llii0l1o1l1 instanceof llIi1IlOl)) {
/* 444 */               if (o0io0l11i.I00l0I0l0lO1 != null) {
/* 446 */                   o0io0l11i.I000II();
                        }
/* 449 */               o0io0l11i.I00100l0();
/* 452 */               olOl0Oi.write("null");
/* 900 */               return;
                    }
/* 14 */            if (llii0l1o1l1 instanceof llIoiI) {
/* 16 */                llIoiI llioii = (llIoiI) llii0l1o1l1;
/* 18 */                Serializable serializable = llioii.I00iOIl;
/* 22 */                if (!(serializable instanceof Number)) {
/* 174 */                   if (serializable instanceof Boolean) {
/* 178 */                       boolean zBooleanValue = ((Boolean) serializable).booleanValue();
/* 182 */                       o0io0l11i.I000II();
/* 185 */                       o0io0l11i.I00100l0();
/* 195 */                       olOl0Oi.write(true != zBooleanValue ? "false" : "true");
/* 198 */                       return;
                            }
/* 199 */                   String strI0001Ioi1lo = llioii.I0001Ioi1lo();
/* 203 */                   if (strI0001Ioi1lo != null) {
/* 219 */                       o0io0l11i.I000II();
/* 222 */                       o0io0l11i.I00100l0();
/* 225 */                       o0io0l11i.I000O01llI0(strI0001Ioi1lo);
/* 228 */                       return;
                            } else {
/* 207 */                       if (o0io0l11i.I00l0I0l0lO1 != null) {
/* 209 */                           o0io0l11i.I000II();
                                }
/* 212 */                       o0io0l11i.I00100l0();
/* 215 */                       olOl0Oi.write("null");
/* 218 */                       return;
                            }
                        }
/* 24 */                Number numberI0000oI00 = llioii.I0000oI00();
/* 28 */                o0io0l11i.I000II();
/* 31 */                String string = numberI0000oI00.toString();
/* 35 */                Class<?> cls = numberI0000oI00.getClass();
/* 41 */                if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
/* 78 */                    if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
/* 152 */                       if (o0io0l11i.I00ioIO != 1) {
/* 161 */                           I000II.I000iOII("Numeric values must be finite, but was ".concat(string));
/* 164 */                           return;
                                }
                            } else if (cls != Float.class && cls != Double.class && !o0Io0l11I.I00l0OO0IO.matcher(string).matches()) {
/* 118 */                       String strValueOf = String.valueOf(cls);
/* 146 */                       I000II.I000iOII(IIl001iO0Io.I00100o1O0lo(new StringBuilder(strValueOf.length() + 47 + string.length()), "String created by ", strValueOf, " is not a valid JSON number: ", string));
/* 149 */                       return;
                            }
                        }
/* 165 */               o0io0l11i.I00100l0();
/* 168 */               olOl0Oi.append((CharSequence) string);
/* 171 */               return;
                    }
/* 231 */           if (llii0l1o1l1 instanceof llI001IilOi) {
/* 233 */               o0io0l11i.I000II();
/* 236 */               o0io0l11i.I00100l0();
/* 239 */               int i = o0io0l11i.I00iiO;
/* 241 */               int[] iArrCopyOf = o0io0l11i.I00iiI;
/* 244 */               if (i == iArrCopyOf.length) {
/* 247 */                   iArrCopyOf = Arrays.copyOf(iArrCopyOf, i + i);
/* 251 */                   o0io0l11i.I00iiI = iArrCopyOf;
                        }
/* 253 */               int i2 = o0io0l11i.I00iiO;
/* 257 */               o0io0l11i.I00iiO = i2 + 1;
/* 259 */               iArrCopyOf[i2] = 1;
/* 263 */               olOl0Oi.write(91);
/* 272 */               Iterator it = llii0l1o1l1.I0000O().I00iOIl.iterator();
/* 280 */               while (it.hasNext()) {
/* 288 */                   I0000Il00O(o0io0l11i, (llII0l1O1l1) it.next());
                        }
/* 295 */               o0io0l11i.I00000oIO(1, 2, ']');
/* 298 */               return;
                    }
/* 301 */           if (!(llii0l1o1l1 instanceof llIiii10)) {
/* 438 */               I000II.I000iOII("Couldn't write ".concat(String.valueOf(llii0l1o1l1.getClass())));
/* 441 */               return;
                    }
/* 303 */           o0io0l11i.I000II();
/* 306 */           o0io0l11i.I00100l0();
/* 309 */           int i3 = o0io0l11i.I00iiO;
/* 311 */           int[] iArrCopyOf2 = o0io0l11i.I00iiI;
/* 314 */           if (i3 == iArrCopyOf2.length) {
/* 317 */               iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i3 + i3);
/* 321 */               o0io0l11i.I00iiI = iArrCopyOf2;
                    }
/* 323 */           int i4 = o0io0l11i.I00iiO;
/* 327 */           o0io0l11i.I00iiO = i4 + 1;
/* 330 */           iArrCopyOf2[i4] = 3;
/* 334 */           olOl0Oi.write(123);
/* 349 */           Iterator it2 = ((lo0IO0l1I) llii0l1o1l1.I00000oOI().I00iOIl.entrySet()).iterator();
/* 361 */           while (((O100iii0I0i) it2).hasNext()) {
/* 366 */               O100l1 o100l1I00000oOI = ((lo01Olli) it2).I00000oOI();
/* 374 */               String str = (String) o100l1I00000oOI.getKey();
/* 378 */               Objects.requireNonNull(str, "name == null");
/* 383 */               if (o0io0l11i.I00l0I0l0lO1 != null) {
/* 414 */                   I000II.I001IO000("Already wrote a name, expecting a value.");
/* 417 */                   return;
                        }
/* 385 */               int iI0000Il00O = o0io0l11i.I0000Il00O();
/* 389 */               if (iI0000Il00O != 3 && iI0000Il00O != 5) {
/* 396 */                   I000II.I001IO000("Please begin an object before writing a name.");
/* 399 */                   return;
                        } else {
/* 400 */                   o0io0l11i.I00l0I0l0lO1 = str;
/* 408 */                   I0000Il00O(o0io0l11i, (llII0l1O1l1) o100l1I00000oOI.getValue());
                        }
                    }
/* 420 */           o0io0l11i.I00000oIO(3, 5, '}');
                }

                public static final llII0l1O1l1 I0000O(o0IlOioo o0iloioo, int i) {
                    int i2 = i - 1;
/* 4 */             if (i2 == 5) {
/* 78 */                String strI00ioIO = o0iloioo.I00ioIO();
/* 82 */                llIoiI llioii = new llIoiI();
/* 85 */                Objects.requireNonNull(strI00ioIO);
/* 88 */                llioii.I00iOIl = strI00ioIO;
/* 90 */                VarHandle.storeStoreFence();
/* 106 */               return llioii;
                    }
/* 7 */             if (i2 == 6) {
/* 64 */                llooo1oooI llooo1oooi = new llooo1oooI(o0iloioo.I00ioIO());
/* 67 */                llIoiI llioii2 = new llIoiI();
/* 70 */                llioii2.I00iOIl = llooo1oooi;
/* 72 */                VarHandle.storeStoreFence();
/* 75 */                return llioii2;
                    }
/* 10 */            if (i2 != 7) {
/* 14 */                if (i2 == 8) {
/* 16 */                    o0iloioo.I00lli11();
/* 19 */                    return llIi1IlOl.I00iOIl;
                        }
/* 32 */                I000II.I001IO000("Unexpected token: ".concat(ll1OIi.I00000oIO(i)));
/* 35 */                return null;
                    }
/* 43 */            Boolean boolValueOf = Boolean.valueOf(o0iloioo.I00l0I0l0lO1());
/* 47 */            llIoiI llioii3 = new llIoiI();
/* 50 */            llioii3.I00iOIl = boolValueOf;
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            return llioii3;
                }

                public static final llII0l1O1l1 I0000oI00(o0IlOioo o0iloioo, int i) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 32 */                o0iloioo.I00Io1lO();
/* 37 */                llI001IilOi lli001iiloi = new llI001IilOi();
/* 45 */                lli001iiloi.I00iOIl = new ArrayList();
/* 47 */                VarHandle.storeStoreFence();
/* 106 */               return lli001iiloi;
                    }
/* 6 */             if (i2 != 2) {
/* 8 */                 return null;
                    }
/* 10 */            o0iloioo.I00OIl();
/* 15 */            llIiii10 lliiii10 = new llIiii10();
/* 20 */            OiOIlO1OII0 oiOIlO1OII0 = lo0olliO11.I00l0I0l0lO1;
/* 26 */            lliiii10.I00iOIl = new lo0olliO11(false);
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            return lliiii10;
                }

                @Override
                public final Object I00000oIO(o0IlOioo o0iloioo) {
                    switch (this.I00000oIO) {
                        case 0:
/* 929 */                   int iI00ooIo0 = o0iloioo.I00ooIo0();
/* 933 */                   llII0l1O1l1 llii0l1o1l1I0000oI00 = I0000oI00(o0iloioo, iI00ooIo0);
/* 937 */                   if (llii0l1o1l1I0000oI00 == null) {
/* 939 */                       return I0000O(o0iloioo, iI00ooIo0);
                            }
/* 946 */                   ArrayDeque arrayDeque = new ArrayDeque();
                            while (true) {
/* 953 */                       if (o0iloioo.I00Ol00()) {
/* 964 */                           String strI00iiI = llii0l1o1l1I0000oI00 instanceof llIiii10 ? o0iloioo.I00iiI() : null;
/* 965 */                           int iI00ooIo02 = o0iloioo.I00ooIo0();
/* 969 */                           llII0l1O1l1 llii0l1o1l1I0000oI002 = I0000oI00(o0iloioo, iI00ooIo02);
/* 980 */                           llII0l1O1l1 llii0l1o1l1I0000O = llii0l1o1l1I0000oI002 == null ? I0000O(o0iloioo, iI00ooIo02) : llii0l1o1l1I0000oI002;
/* 983 */                           if (llii0l1o1l1I0000oI00 instanceof llI001IilOi) {
/* 990 */                               ((llI001IilOi) llii0l1o1l1I0000oI00).I00iOIl.add(llii0l1o1l1I0000O);
                                    } else {
/* 999 */                               ((llIiii10) llii0l1o1l1I0000oI00).I00iOIl.put(strI00iiI, llii0l1o1l1I0000O);
                                    }
/* 1002 */                          if (llii0l1o1l1I0000oI002 != null) {
/* 1004 */                              arrayDeque.addLast(llii0l1o1l1I0000oI00);
/* 1007 */                              llii0l1o1l1I0000oI00 = llii0l1o1l1I0000O;
                                    }
                                } else {
/* 1011 */                          if (llii0l1o1l1I0000oI00 instanceof llI001IilOi) {
/* 1013 */                              o0iloioo.I00IoiI();
                                    } else {
/* 1017 */                              o0iloioo.I00OOll1();
                                    }
/* 1024 */                          if (arrayDeque.isEmpty()) {
/* 1026 */                              return llii0l1o1l1I0000oI00;
                                    }
/* 1032 */                          llii0l1o1l1I0000oI00 = (llII0l1O1l1) arrayDeque.removeLast();
                                }
                            }
                        case 1:
/* 925 */                   o0iloioo.I00oliIiO01i();
/* 18 */                    return null;
                        case 2:
/* 921 */                   return new AtomicBoolean(o0iloioo.I00l0I0l0lO1());
                        case 3:
/* 853 */                   ArrayList arrayList = new ArrayList();
/* 856 */                   o0iloioo.I00Io1lO();
/* 863 */                   while (o0iloioo.I00Ol00()) {
                                try {
/* 873 */                           arrayList.add(Integer.valueOf(o0iloioo.I00oII()));
                                } catch (NumberFormatException e) {
/* 883 */                           throw new llO11IolIO(e, 25);
                                }
                            }
/* 884 */                   o0iloioo.I00IoiI();
/* 887 */                   int size = arrayList.size();
/* 893 */                   AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
/* 896 */                   for (int i = 0; i < size; i++) {
/* 908 */                       atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                            }
/* 914 */                   return atomicIntegerArray;
                        case 4:
/* 829 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 831 */                       o0iloioo.I00lli11();
/* 18 */                        return null;
                            }
                            try {
/* 839 */                       return Long.valueOf(o0iloioo.I00o0iI0io1());
                            } catch (NumberFormatException e2) {
/* 850 */                       throw new llO11IolIO(e2, 25);
                            }
                        case 5:
/* 784 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 786 */                       o0iloioo.I00lli11();
/* 18 */                        return null;
                            }
/* 790 */                   String strI00ioIO = o0iloioo.I00ioIO();
/* 798 */                   if (strI00ioIO.length() == 1) {
/* 804 */                       return Character.valueOf(strI00ioIO.charAt(0));
                            }
/* 824 */                   throw new llO11IolIO(loill0OOio.I00000oIO((byte) 31, strI00ioIO, o0iloioo, "Expecting character, got: ", "; at "), 25);
                        case 6:
/* 752 */                   int iI00ooIo03 = o0iloioo.I00ooIo0();
/* 756 */                   if (iI00ooIo03 != 9) {
                                return iI00ooIo03 == 8 ? Boolean.toString(o0iloioo.I00l0I0l0lO1()) : o0iloioo.I00ioIO();
                            }
/* 758 */                   o0iloioo.I00lli11();
/* 18 */                    return null;
                        case 7:
/* 724 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 726 */                       o0iloioo.I00lli11();
/* 18 */                        return null;
                            }
/* 730 */                   String strI00ioIO2 = o0iloioo.I00ioIO();
                            try {
/* 734 */                       return ll10OIO0I.I00000oIO(strI00ioIO2);
                            } catch (NumberFormatException e3) {
/* 751 */                       throw new llO11IolIO(loill0OOio.I00000oIO((byte) 41, strI00ioIO2, o0iloioo, "Failed parsing '", "' as BigDecimal; at path "), e3, 25);
                            }
                        case 8:
/* 688 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 690 */                       o0iloioo.I00lli11();
/* 18 */                        return null;
                            }
/* 694 */                   String strI00ioIO3 = o0iloioo.I00ioIO();
                            try {
/* 698 */                       ll10OIO0I.I00000oOI(strI00ioIO3);
/* 703 */                       return new BigInteger(strI00ioIO3);
                            } catch (NumberFormatException e4) {
/* 719 */                       throw new llO11IolIO(loill0OOio.I00000oIO((byte) 41, strI00ioIO3, o0iloioo, "Failed parsing '", "' as BigInteger; at path "), e4, 25);
                            }
                        case 9:
/* 668 */                   if (o0iloioo.I00ooIo0() != 9) {
/* 680 */                       return new llooo1oooI(o0iloioo.I00ioIO());
                            }
/* 670 */                   o0iloioo.I00lli11();
/* 18 */                    return null;
                        case 10:
/* 663 */                   throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#java-lang-class-unsupported");
                        case 11:
/* 640 */                   if (o0iloioo.I00ooIo0() != 9) {
/* 652 */                       return new StringBuilder(o0iloioo.I00ioIO());
                            }
/* 642 */                   o0iloioo.I00lli11();
/* 18 */                    return null;
                        case 12:
/* 620 */                   if (o0iloioo.I00ooIo0() != 9) {
/* 632 */                       return new StringBuffer(o0iloioo.I00ioIO());
                            }
/* 622 */                   o0iloioo.I00lli11();
/* 18 */                    return null;
                        case 13:
/* 594 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 596 */                       o0iloioo.I00lli11();
/* 18 */                        return null;
                            }
/* 600 */                   String strI00ioIO4 = o0iloioo.I00ioIO();
/* 608 */                   if (strI00ioIO4.equals("null")) {
/* 18 */                        return null;
                            }
/* 612 */                   return new URL(strI00ioIO4);
                        case 14:
/* 560 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 562 */                       o0iloioo.I00lli11();
/* 18 */                        return null;
                            }
                            try {
/* 566 */                       String strI00ioIO5 = o0iloioo.I00ioIO();
/* 574 */                       if (strI00ioIO5.equals("null")) {
/* 18 */                            return null;
                                }
/* 579 */                       return new URI(strI00ioIO5);
                            } catch (URISyntaxException e5) {
/* 589 */                       throw new llIIooI0iolO(e5, 25);
                            }
                        case 15:
/* 541 */                   if (o0iloioo.I00ooIo0() != 9) {
/* 551 */                       return InetAddress.getByName(o0iloioo.I00ioIO());
                            }
/* 543 */                   o0iloioo.I00lli11();
/* 18 */                    return null;
                        case 16:
/* 507 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 509 */                       o0iloioo.I00lli11();
/* 18 */                        return null;
                            }
/* 513 */                   String strI00ioIO6 = o0iloioo.I00ioIO();
                            try {
/* 517 */                       return UUID.fromString(strI00ioIO6);
                            } catch (IllegalArgumentException e6) {
/* 536 */                       throw new llO11IolIO(loill0OOio.I00000oIO((byte) 35, strI00ioIO6, o0iloioo, "Failed parsing '", "' as UUID; at path "), e6, 25);
                            }
                        case 17:
/* 479 */                   String strI00ioIO7 = o0iloioo.I00ioIO();
                            try {
/* 483 */                       return Currency.getInstance(strI00ioIO7);
                            } catch (IllegalArgumentException e7) {
/* 502 */                       throw new llO11IolIO(loill0OOio.I00000oIO((byte) 39, strI00ioIO7, o0iloioo, "Failed parsing '", "' as Currency; at path "), e7, 25);
                            }
                        case PoseLandmark.RIGHT_PINKY:
/* 403 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 405 */                       o0iloioo.I00lli11();
/* 18 */                        return null;
                            }
/* 417 */                   StringTokenizer stringTokenizer = new StringTokenizer(o0iloioo.I00ioIO(), "_");
/* 431 */                   String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
/* 443 */                   String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
/* 450 */                   String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
                        case PoseLandmark.LEFT_INDEX:
/* 279 */                   BitSet bitSet = new BitSet();
/* 282 */                   o0iloioo.I00Io1lO();
/* 285 */                   int iI00ooIo04 = o0iloioo.I00ooIo0();
/* 289 */                   int i2 = 0;
/* 291 */                   while (iI00ooIo04 != 2) {
                                int i3 = iI00ooIo04 - 1;
/* 296 */                       if (i3 == 5 || i3 == 6) {
/* 348 */                           int iI00oII = o0iloioo.I00oII();
/* 352 */                           if (iI00oII != 0) {
/* 355 */                               if (iI00oII != 1) {
/* 367 */                                   String strI00100l0 = o0iloioo.I00100l0(true);
/* 390 */                                   iilo0lOo110.I0000Il00O(String.valueOf(iI00oII).length() + 48 + strI00100l0.length(), "Invalid bitset value ", iI00oII, ", expected 0 or 1; at path ", strI00100l0);
/* 18 */                                    return null;
                                        }
/* 357 */                               bitSet.set(i2);
                                    } else {
                                        continue;
                                    }
                                } else {
/* 301 */                           if (i3 != 7) {
/* 310 */                               String strI00000oIO = ll1OIi.I00000oIO(iI00ooIo04);
/* 316 */                               String strI00100l02 = o0iloioo.I00100l0(false);
/* 347 */                               throw new llO11IolIO(IIl001iO0Io.I00100o1O0lo(new StringBuilder(strI00000oIO.length() + 37 + strI00100l02.length()), "Invalid bitset value type: ", strI00000oIO, "; at path ", strI00100l02), 25);
                                    }
/* 307 */                           if (o0iloioo.I00l0I0l0lO1()) {
/* 357 */                               bitSet.set(i2);
                                    }
                                }
/* 360 */                       i2++;
/* 362 */                       iI00ooIo04 = o0iloioo.I00ooIo0();
                            }
/* 394 */                   o0iloioo.I00IoiI();
/* 397 */                   return bitSet;
                        case PoseLandmark.RIGHT_INDEX:
/* 243 */                   int iI00ooIo05 = o0iloioo.I00ooIo0();
/* 247 */                   if (iI00ooIo05 != 9) {
                                return iI00ooIo05 == 6 ? Boolean.valueOf(Boolean.parseBoolean(o0iloioo.I00ioIO())) : Boolean.valueOf(o0iloioo.I00l0I0l0lO1());
                            }
/* 249 */                   o0iloioo.I00lli11();
/* 18 */                    return null;
                        case PoseLandmark.LEFT_THUMB:
/* 228 */                   if (o0iloioo.I00ooIo0() != 9) {
/* 238 */                       return Boolean.valueOf(o0iloioo.I00ioIO());
                            }
/* 230 */                   o0iloioo.I00lli11();
/* 18 */                    return null;
                        case PoseLandmark.RIGHT_THUMB:
/* 168 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 170 */                       o0iloioo.I00lli11();
/* 18 */                        return null;
                            }
                            try {
/* 174 */                       int iI00oII2 = o0iloioo.I00oII();
/* 180 */                       if (iI00oII2 <= 255 && iI00oII2 >= -128) {
/* 187 */                           return Byte.valueOf((byte) iI00oII2);
                                }
/* 192 */                       String strI00100l03 = o0iloioo.I00100l0(true);
/* 213 */                       iilo0lOo110.I0000Il00O(String.valueOf(iI00oII2).length() + 40 + strI00100l03.length(), "Lossy conversion from ", iI00oII2, " to byte; at path ", strI00100l03);
/* 18 */                        return null;
                            } catch (NumberFormatException e8) {
/* 223 */                       throw new llO11IolIO(e8, 25);
                            }
                        case PoseLandmark.LEFT_HIP:
/* 108 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 110 */                       o0iloioo.I00lli11();
/* 18 */                        return null;
                            }
                            try {
/* 114 */                       int iI00oII3 = o0iloioo.I00oII();
/* 121 */                       if (iI00oII3 <= 65535 && iI00oII3 >= -32768) {
/* 128 */                           return Short.valueOf((short) iI00oII3);
                                }
/* 133 */                       String strI00100l04 = o0iloioo.I00100l0(true);
/* 153 */                       iilo0lOo110.I0000Il00O(String.valueOf(iI00oII3).length() + 41 + strI00100l04.length(), "Lossy conversion from ", iI00oII3, " to short; at path ", strI00100l04);
/* 18 */                        return null;
                            } catch (NumberFormatException e9) {
/* 163 */                       throw new llO11IolIO(e9, 25);
                            }
                        case PoseLandmark.RIGHT_HIP:
/* 82 */                    if (o0iloioo.I00ooIo0() == 9) {
/* 84 */                        o0iloioo.I00lli11();
/* 18 */                        return null;
                            }
                            try {
/* 92 */                        return Integer.valueOf(o0iloioo.I00oII());
                            } catch (NumberFormatException e10) {
/* 103 */                       throw new llO11IolIO(e10, 25);
                            }
                        case PoseLandmark.LEFT_KNEE:
                            try {
/* 67 */                        return new AtomicInteger(o0iloioo.I00oII());
                            } catch (NumberFormatException e11) {
/* 77 */                        throw new llO11IolIO(e11, 25);
                            }
                        case PoseLandmark.RIGHT_KNEE:
/* 46 */                    if (o0iloioo.I00ooIo0() != 9) {
/* 56 */                        return Double.valueOf(o0iloioo.I00lll10());
                            }
/* 48 */                    o0iloioo.I00lli11();
/* 18 */                    return null;
                        default:
/* 26 */                    if (o0iloioo.I00ooIo0() != 9) {
/* 37 */                        return Float.valueOf((float) o0iloioo.I00lll10());
                            }
/* 28 */                    o0iloioo.I00lli11();
/* 18 */                    return null;
                    }
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 1:
/* 11 */                    return "AnonymousOrNonStaticLocalClassAdapter";
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
