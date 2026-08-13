            package p000;

            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            
            public abstract class IOOIli0I {
                public static final Set I00000oIO;
                public static final Set I00000oOI;
                public static final ArrayList I0000Il00O;
                public static final ArrayList I0000O;

                static {
/* 140 */           ArrayList arrayListI00O10llo = IOOi0Ool1i.I00O10llo(IOOi0Ool1i.I00O0i0ii(new IO11lol('a', 'z'), new IO11lol('A', 'Z')), new IO11lol('0', '9'));
/* 152 */           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(arrayListI00O10llo, 10));
/* 155 */           Iterator it = arrayListI00O10llo.iterator();
/* 163 */           while (it.hasNext()) {
/* 180 */               arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
                    }
/* 188 */           I00000oIO = IOOi0Ool1i.I00iio(arrayList);
/* 223 */           I00000oOI = IOOi0Ool1i.I00iio(IOOi0Ool1i.I00O10llo(IOOi0Ool1i.I00O0i0ii(new IO11lol('a', 'z'), new IO11lol('A', 'Z')), new IO11lol('0', '9')));
/* 258 */           IOOi0Ool1i.I00iio(IOOi0Ool1i.I00O10llo(IOOi0Ool1i.I00O0i0ii(new IO11lol('a', 'f'), new IO11lol('A', 'F')), new IO11lol('0', '9')));
/* 323 */           Set setI00IlilI0i0i = I1IoiO1l.I00IlilI0i0i(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+'});
/* 335 */           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(setI00IlilI0i0i, 10));
/* 338 */           Iterator it2 = setI00IlilI0i0i.iterator();
/* 346 */           while (it2.hasNext()) {
/* 363 */               arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
                    }
/* 367 */           I0000Il00O = arrayList2;
/* 389 */           I1IoiO1l.I00IlilI0i0i(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~'});
/* 434 */           Oio0lI.I0000oI00(I00000oOI, I1IoiO1l.I00IlilI0i0i(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
/* 441 */           List listI000O01llI0 = IOOi1I.I000O01llI0('-', '.', '_', '~');
/* 453 */           ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(listI000O01llI0, 10));
/* 456 */           Iterator it3 = listI000O01llI0.iterator();
/* 464 */           while (it3.hasNext()) {
/* 481 */               arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
                    }
/* 485 */           I0000O = arrayList3;
                }

                public static final int I00000oIO(char c) {
/* 3 */             if ('0' <= c && c < ':') {
/* 9 */                 return c - '0';
                    }
/* 13 */            if ('A' <= c && c < 'G') {
/* 19 */                return c - '7';
                    }
/* 24 */            if ('a' > c || c >= 'g') {
/* 33 */                return -1;
                    }
/* 30 */            return c - 'W';
                }

                public static final String I00000oOI(String str, int i, int i2, boolean z) {
/* 7 */             int i3 = i;
/* 8 */             while (i3 < i2) {
/* 10 */                char cCharAt = str.charAt(i3);
/* 18 */                if (cCharAt == '%' || (z && cCharAt == '+')) {
/* 28 */                    int i4 = i2 - i;
/* 32 */                    if (i4 > 255) {
/* 34 */                        i4 /= 3;
                            }
/* 38 */                    StringBuilder sb = new StringBuilder(i4);
/* 41 */                    if (i3 > i) {
/* 43 */                        sb.append((CharSequence) str, i, i3);
                            }
/* 46 */                    byte[] bArr = null;
/* 47 */                    while (i3 < i2) {
/* 49 */                        char cCharAt2 = str.charAt(i3);
/* 53 */                        if (z && cCharAt2 == '+') {
/* 59 */                            sb.append(' ');
                                } else if (cCharAt2 == '%') {
/* 67 */                            if (bArr == null) {
/* 73 */                                bArr = new byte[(i2 - i3) / 3];
                                    }
/* 76 */                            int i5 = 0;
/* 77 */                            while (i3 < i2 && str.charAt(i3) == '%') {
/* 85 */                                int i6 = i3 + 2;
/* 91 */                                if (i6 >= i2) {
/* 179 */                                   StringBuilder sb2 = new StringBuilder("Incomplete trailing HEX escape: ");
/* 194 */                                   sb2.append(str.subSequence(i3, str.length()).toString());
/* 197 */                                   sb2.append(", in ");
/* 200 */                                   sb2.append((Object) str);
/* 212 */                                   throw new I1o1lOlooI1(Oi010OO0.I00100l0(i3, " at ", sb2), 9);
                                        }
/* 93 */                                int i7 = i3 + 1;
/* 99 */                                int iI00000oIO = I00000oIO(str.charAt(i7));
/* 107 */                               int iI00000oIO2 = I00000oIO(str.charAt(i6));
/* 112 */                               if (iI00000oIO == -1 || iI00000oIO2 == -1) {
/* 172 */                                   throw new I1o1lOlooI1("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3, 9);
                                        }
/* 122 */                               bArr[i5] = (byte) ((iI00000oIO * 16) + iI00000oIO2);
/* 124 */                               i3 += 3;
/* 116 */                               i5++;
                                    }
/* 214 */                           iOI0OiiiOl1.I00000oIO(0, i5, bArr.length);
/* 224 */                           sb.append(new String(bArr, 0, i5, IO1IOI.I00000oIO));
                                } else {
/* 229 */                           sb.append(cCharAt2);
                                }
/* 62 */                        i3++;
                            }
/* 234 */                   return sb.toString();
                        }
/* 25 */                i3++;
                    }
                    return (i == 0 && i2 == str.length()) ? str.toString() : str.substring(i, i2);
                }

                public static String I0000Il00O(String str) {
/* 1 */             int length = str.length();
/* 5 */             Charset charset = IO1IOI.I00000oIO;
/* 8 */             return I00000oOI(str, 0, length, false);
                }

                public static String I0000O(int i, int i2, int i3, String str) {
/* 4 */             if ((i3 & 1) != 0) {
/* 6 */                 i = 0;
                    }
/* 9 */             if ((i3 & 2) != 0) {
/* 11 */                i2 = str.length();
                    }
/* 17 */            boolean z = (i3 & 4) == 0;
/* 21 */            Charset charset = IO1IOI.I00000oIO;
/* 23 */            return I00000oOI(str, i, i2, z);
                }

                public static final String I0000oI00(String str, boolean z) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 17 */            III1oo00i1li iII1oo00i1liI00000oIO = ilI1olO1ol.I00000oIO(IO1IOI.I00000oIO.newEncoder(), str, 0, str.length());
/* 25 */            while (!iII1oo00i1liI00000oIO.I00II0Ol1O0l()) {
/* 31 */                while (!iII1oo00i1liI00000oIO.I00II0Ol1O0l()) {
/* 33 */                    byte b = iII1oo00i1liI00000oIO.readByte();
/* 37 */                    Byte bValueOf = Byte.valueOf(b);
/* 47 */                    if (I00000oIO.contains(bValueOf) || I0000O.contains(bValueOf)) {
/* 79 */                        sb.append((char) b);
                            } else if (z && b == 32) {
/* 66 */                        sb.append('+');
                            } else {
/* 74 */                        sb.append(I0001Ioi1lo(b));
                            }
                        }
                    }
/* 83 */            return sb.toString();
                }

                public static final String I0001Ioi1lo(byte b) {
/* 3 */             int i = (b & 255) >> 4;
/* 20 */            int i2 = b & 15;
/* 51 */            return new String(new char[]{'%', (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48), (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)});
                }
            }
