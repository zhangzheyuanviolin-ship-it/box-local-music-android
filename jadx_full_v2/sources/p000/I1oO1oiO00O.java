            package p000;

            import android.util.Log;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.nio.ByteBuffer;
            import java.nio.charset.CharacterCodingException;
            import java.nio.charset.CharsetDecoder;
            import java.util.ArrayList;
            
            public abstract class I1oO1oiO00O {
                public static final int I0000O = Long.toString(Long.MAX_VALUE).length();
                public final CharsetDecoder I00000oIO = IO1IIilll1I.I0001Ioi1lo.newDecoder();
                public final OilOll I00000oOI;
                public IIOolO1li I0000Il00O;

                public I1oO1oiO00O(OilOll oilOll) {
/* 12 */            this.I00000oOI = oilOll;
                }

                public static boolean I0000O(int i) {
                    return i >= 48 && i <= 57;
                }

                public static boolean I0000oI00(int i) {
                    return i == 32 || i == 13 || i == 10 || i == 9 || i == 62 || i == 60 || i == 91 || i == 47 || i == 93 || i == 41 || i == 40 || i == 0 || i == 12 || i == 37;
                }

                public static boolean I0001Ioi1lo(char c) {
/* 5 */             if (I0000O(c)) {
/* 26 */                return true;
                    }
/* 9 */             if (c < 'a' || c > 'f') {
                        return c >= 'A' && c <= 'F';
                    }
/* 26 */            return true;
                }

                public static boolean I000II(int i) {
                    return i == 0 || i == 9 || i == 12 || i == 10 || i == 13 || i == 32;
                }

                public final int I00000oIO(int i) {
                    byte b;
/* 2 */             byte[] bArr = new byte[3];
/* 4 */             OilOll oilOll = this.I00000oOI;
/* 6 */             int i2 = oilOll.read(bArr);
/* 10 */            if (i2 == 3 && bArr[0] == 13 && (((b = bArr[1]) == 10 && bArr[2] == 47) || bArr[2] == 62 || b == 47 || b == 62)) {
/* 43 */                i = 0;
                    }
/* 44 */            if (i2 > 0) {
/* 46 */                oilOll.I001lIiIIo1O(i2, bArr);
                    }
/* 49 */            return i;
                }

                public final IIi0O10I I00000oOI(IIi0O11lioI1 iIi0O11lioI1) throws IOException {
/* 1 */             IIOolO1li iIOolO1li = this.I0000Il00O;
/* 3 */             if (iIOolO1li != null) {
/* 5 */                 return iIOolO1li.I00ioIO(iIi0O11lioI1);
                    }
/* 16 */            StringBuilder sb = new StringBuilder("object reference ");
/* 19 */            sb.append(iIi0O11lioI1);
/* 24 */            long position = this.I00000oOI.getPosition();
/* 30 */            sb.append(" at offset ");
/* 33 */            sb.append(position);
/* 38 */            sb.append(" in content stream");
/* 49 */            throw new IOException(sb.toString());
                }

                public final boolean I0000Il00O() {
/* 7 */             return I0000O(this.I00000oOI.peek());
                }

                /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
                
                    r0.read();
                    I001IIilI0O();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
                
                    return r4;
                 */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIOoIilO I000O01llI0() throws IOException {
/* 1 */             OilOll oilOll = this.I00000oOI;
/* 3 */             long position = oilOll.getPosition();
/* 9 */             I000lI('[');
/* 14 */            IIOoIilO iIOoIilO = new IIOoIilO();
/* 17 */            I001IIilI0O();
                    while (true) {
/* 20 */                int iPeek = oilOll.peek();
/* 24 */                if (iPeek <= 0 || ((char) iPeek) == ']') {
                            break;
                        }
/* 31 */                IIOoOiOI iIOoOiOII000l1 = I000l1();
/* 37 */                if (iIOoOiOII000l1 instanceof IIi0O10I) {
/* 39 */                    ArrayList arrayList = iIOoIilO.I00iOIl;
/* 46 */                    if (arrayList.size() <= 0 || !(iIOoIilO.I00l0I0l0lO1(arrayList.size() - 1) instanceof IIOool)) {
/* 121 */                       iIOoOiOII000l1 = null;
                            } else {
/* 72 */                        IIOool iIOool = (IIOool) iIOoIilO.I00o0iI0io1(arrayList.size() - 1);
/* 78 */                        if (arrayList.size() > 0 && (iIOoIilO.I00l0I0l0lO1(arrayList.size() - 1) instanceof IIOool)) {
/* 116 */                           iIOoOiOII000l1 = I00000oOI(new IIi0O11lioI1((int) iIOool.I00iOIl, ((IIOool) iIOoIilO.I00o0iI0io1(arrayList.size() - 1)).I00iOIl));
                                }
                            }
                        }
/* 122 */               if (iIOoOiOII000l1 == null) {
/* 156 */                   Log.w("PdfBox-Android", "Corrupt array element at offset " + oilOll.getPosition() + ", start offset: " + position);
/* 159 */                   String strI0010o = I0010o();
/* 167 */                   if (strI0010o.isEmpty() && oilOll.peek() == 91) {
                                break;
                            }
/* 182 */                   oilOll.I00oIiI10(strI0010o.getBytes(IO1IIilll1I.I0000O));
/* 191 */                   if ("endobj".equals(strI0010o) || "endstream".equals(strI0010o)) {
                                break;
                            }
                        } else {
/* 124 */                   iIOoIilO.I00ioIO(iIOoOiOII000l1);
                        }
/* 202 */               I001IIilI0O();
                    }
/* 207 */           return iIOoIilO;
                }

                public final IIOoi0ooOoO I000OOo1O() {
/* 5 */             I000lI('<');
/* 8 */             I000lI('<');
/* 11 */            I001IIilI0O();
/* 16 */            IIOoi0ooOoO iIOoi0ooOoO = new IIOoi0ooOoO();
/* 19 */            boolean z = false;
/* 22 */            loop0: while (!z) {
/* 24 */                I001IIilI0O();
/* 27 */                OilOll oilOll = this.I00000oOI;
/* 33 */                char cPeek = (char) oilOll.peek();
/* 35 */                if (cPeek == '>') {
/* 37 */                    z = true;
                        } else if (cPeek == '/') {
/* 45 */                    IIi0I0I0o iIi0I0I0oI000OiO = I000OiO();
/* 49 */                    if (iIi0I0I0oI000OiO == null || iIi0I0I0oI000OiO.I00iOIl.isEmpty()) {
/* 77 */                        Log.w("PdfBox-Android", "Empty COSName at offset " + oilOll.getPosition());
                            }
/* 80 */                    long position = oilOll.getPosition();
/* 84 */                    IIOoOiOI iIOoOiOII000l1 = I000l1();
/* 88 */                    I001IIilI0O();
/* 93 */                    if ((iIOoOiOII000l1 instanceof IIi0IoOo) && I0000Il00O()) {
/* 103 */                       long position2 = oilOll.getPosition();
/* 107 */                       IIOoOiOI iIOoOiOII000l12 = I000l1();
/* 111 */                       I001IIilI0O();
/* 116 */                       I000lI('R');
/* 119 */                       boolean z2 = iIOoOiOII000l1 instanceof IIOool;
/* 123 */                       IIi0II0l0o iIi0II0l0o = IIi0II0l0o.I00iOIl;
/* 127 */                       if (!z2) {
/* 147 */                           Log.e("PdfBox-Android", "expected number, actual=" + iIOoOiOII000l1 + " at offset " + position);
                                } else if (iIOoOiOII000l12 instanceof IIOool) {
/* 180 */                           long j = ((IIOool) iIOoOiOII000l1).I00iOIl;
/* 186 */                           if (j <= 0) {
/* 190 */                               StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j, "invalid object number value =", " at offset ");
/* 194 */                               sbI001iOo1i0O.append(position);
/* 201 */                               Log.w("PdfBox-Android", sbI001iOo1i0O.toString());
                                    } else {
/* 209 */                               int i = (int) ((IIOool) iIOoOiOII000l12).I00iOIl;
/* 210 */                               if (i < 0) {
/* 232 */                                   Log.e("PdfBox-Android", "invalid generation number value =" + i + " at offset " + position);
                                        } else {
/* 241 */                                   iIOoOiOII000l1 = I00000oOI(new IIi0O11lioI1(i, j));
                                        }
                                    }
                                } else {
/* 174 */                           Log.e("PdfBox-Android", "expected number, actual=" + iIOoOiOII000l12 + " at offset " + position2);
                                }
/* 150 */                       iIOoOiOII000l1 = iIi0II0l0o;
                            }
/* 245 */                   I001IIilI0O();
/* 248 */                   if (iIOoOiOII000l1 == null) {
/* 268 */                       Log.w("PdfBox-Android", "Bad dictionary declaration at offset " + oilOll.getPosition());
/* 271 */                       return iIOoi0ooOoO;
                            }
/* 274 */                   if (!(iIOoOiOII000l1 instanceof IIOool) || ((IIOool) iIOoOiOII000l1).I00iiI) {
/* 306 */                       iIOoi0ooOoO.I010iIIOlo(iIi0I0I0oI000OiO, iIOoOiOII000l1);
                            } else {
/* 301 */                       Log.w("PdfBox-Android", "Skipped out of range number value at offset " + oilOll.getPosition());
                            }
                        } else {
/* 337 */                   Log.w("PdfBox-Android", "Invalid dictionary, found: '" + cPeek + "' but expected: '/' at offset " + oilOll.getPosition());
/* 340 */                   int i2 = oilOll.read();
/* 345 */                   while (i2 != -1 && i2 != 47 && i2 != 62) {
/* 353 */                       if (i2 == 101 && oilOll.read() == 110 && oilOll.read() == 100) {
/* 371 */                           int i3 = oilOll.read();
/* 419 */                           boolean z3 = i3 == 115 && oilOll.read() == 116 && oilOll.read() == 114 && oilOll.read() == 101 && oilOll.read() == 97 && oilOll.read() == 109;
/* 444 */                           boolean z4 = !z3 && i3 == 111 && oilOll.read() == 98 && oilOll.read() == 106;
/* 445 */                           if (z3 || z4) {
                                        break loop0;
                                    }
                                }
/* 450 */                       i2 = oilOll.read();
                            }
/* 455 */                   if (i2 == -1) {
/* 457 */                       return iIOoi0ooOoO;
                            }
/* 458 */                   oilOll.I00ilO0(i2);
                        }
                    }
/* 463 */           I000lI('>');
/* 466 */           I000lI('>');
/* 541 */           return iIOoi0ooOoO;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIi0I0I0o I000OiO() throws IOException {
                    String str;
/* 3 */             I000lI('/');
/* 8 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 11 */            OilOll oilOll = this.I00000oOI;
/* 13 */            int i = oilOll.read();
/* 18 */            while (i != -1) {
/* 22 */                if (i == 35) {
/* 24 */                    int i2 = oilOll.read();
/* 28 */                    int i3 = oilOll.read();
/* 32 */                    char c = (char) i2;
/* 37 */                    if (I0001Ioi1lo(c)) {
/* 39 */                        char c2 = (char) i3;
/* 44 */                        if (I0001Ioi1lo(c2)) {
/* 61 */                            String str2 = Character.toString(c) + c2;
                                    try {
/* 71 */                                byteArrayOutputStream.write(Integer.parseInt(str2, 16));
/* 74 */                                i2 = oilOll.read();
                                    } catch (NumberFormatException e) {
/* 93 */                                throw new IOException(IlIi0I0.I000lI("Error: expected hex digit, actual='", str2, "'"), e);
                                    }
                                } else {
/* 94 */                            if (i3 == -1 || i2 == -1) {
/* 111 */                               Log.e("PdfBox-Android", "Premature EOF in BaseParser#parseCOSName");
/* 114 */                               i = -1;
                                        break;
                                    }
/* 99 */                            oilOll.I00ilO0(i3);
/* 102 */                           byteArrayOutputStream.write(i);
                                }
/* 105 */                       i = i2;
                            }
                        } else {
/* 120 */                   if (I0000oI00(i)) {
                                break;
                            }
/* 123 */                   byteArrayOutputStream.write(i);
/* 126 */                   i = oilOll.read();
                        }
                    }
/* 131 */           if (i != -1) {
/* 133 */               oilOll.I00ilO0(i);
                    }
/* 136 */           byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
/* 146 */               this.I00000oIO.decode(ByteBuffer.wrap(byteArray));
/* 153 */               str = new String(byteArray, IO1IIilll1I.I0001Ioi1lo);
                    } catch (CharacterCodingException unused) {
/* 161 */               str = new String(byteArray, IO1IIilll1I.I0000oI00);
                    }
/* 164 */           return IIi0I0I0o.I00ioIO(str);
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
                
                    r15 = r15.toString();
                    r0 = p000.IIi0l1.I00iiI;
                    r0 = new java.io.ByteArrayOutputStream();
                    r1 = new java.lang.StringBuilder(r15.trim());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
                
                    if ((r1.length() % 2) == 0) goto L31;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
                
                    r1.append('0');
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
                
                    r2 = r1.length();
                    r3 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
                
                    if (r3 >= r2) goto L148;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
                
                    r4 = r3 + 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
                
                    r0.write(java.lang.Integer.parseInt(r1.substring(r3, r4), 16));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
                
                    r3 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
                
                    if (p000.IIi0l1.I00iiI != false) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
                
                    android.util.Log.w("PdfBox-Android", "Encountered a malformed hex string");
                    r0.write(63);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
                
                    r3 = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
                
                    throw new java.io.IOException("Invalid hex string: ".concat(r15), r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
                
                    return new p000.IIi0l1(r0.toByteArray());
                 */
                /* JADX WARN: Removed duplicated region for block: B:105:0x0194  */
                /* JADX WARN: Removed duplicated region for block: B:154:0x01b2 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:156:0x00d3 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIi0l1 I000iOII() throws IOException {
                    int i;
/* 1 */             OilOll oilOll = this.I00000oOI;
/* 7 */             char c = (char) oilOll.read();
/* 16 */            int iI00000oIO = 1;
/* 23 */            if (c != '<') {
/* 201 */               if (c != '(') {
/* 487 */                   throw new IOException("parseCOSString string should start with '(' or '<' and not '" + c + "' at offset " + oilOll.getPosition());
                        }
/* 205 */               ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 208 */               int i2 = oilOll.read();
/* 213 */               while (iI00000oIO > 0 && i2 != -1) {
/* 217 */                   char c2 = (char) i2;
/* 221 */                   if (c2 == ')') {
/* 225 */                       iI00000oIO = I00000oIO(iI00000oIO - 1);
/* 229 */                       if (iI00000oIO != 0) {
/* 231 */                           byteArrayOutputStream.write(c2);
                                }
                            } else if (c2 == '(') {
/* 239 */                       iI00000oIO++;
/* 241 */                       byteArrayOutputStream.write(c2);
                            } else if (c2 == '\\') {
/* 253 */                       char c3 = (char) oilOll.read();
/* 254 */                       if (c3 == '\n' || c3 == '\r') {
/* 410 */                           i2 = oilOll.read();
                                    while (true) {
/* 414 */                               if ((10 == i2 || 13 == i2) && i2 != -1) {
/* 421 */                                   i2 = oilOll.read();
                                        }
                                    }
                                } else if (c3 == '\\') {
/* 405 */                           byteArrayOutputStream.write(c3);
                                } else if (c3 == 'b') {
/* 400 */                           byteArrayOutputStream.write(8);
                                } else if (c3 == 'f') {
/* 395 */                           byteArrayOutputStream.write(12);
                                } else if (c3 == 'n') {
/* 390 */                           byteArrayOutputStream.write(10);
                                } else if (c3 == 'r') {
/* 385 */                           byteArrayOutputStream.write(13);
                                } else if (c3 == 't') {
/* 380 */                           byteArrayOutputStream.write(9);
                                } else if (c3 != '(') {
/* 282 */                           if (c3 != ')') {
                                        switch (c3) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
/* 293 */                                       StringBuilder sb = new StringBuilder();
/* 296 */                                       sb.append(c3);
/* 299 */                                       i2 = oilOll.read();
/* 303 */                                       char c4 = (char) i2;
/* 304 */                                       if (c4 >= '0' && c4 <= '7') {
/* 310 */                                           sb.append(c4);
/* 313 */                                           i2 = oilOll.read();
/* 317 */                                           char c5 = (char) i2;
/* 318 */                                           if (c5 >= '0' && c5 <= '7') {
/* 322 */                                               sb.append(c5);
/* 325 */                                               i2 = -2;
                                                    }
                                                }
                                                try {
/* 334 */                                           byteArrayOutputStream.write(Integer.parseInt(sb.toString(), 8));
                                                    break;
                                                } catch (NumberFormatException e) {
/* 363 */                                           throw new IOException("Error: Expected octal character, actual='" + ((Object) sb) + "'", e);
                                                }
                                                break;
                                            default:
/* 287 */                                       byteArrayOutputStream.write(c3);
                                                break;
                                        }
                                    } else {
/* 364 */                               iI00000oIO = I00000oIO(iI00000oIO);
/* 368 */                               if (iI00000oIO != 0) {
/* 370 */                                   byteArrayOutputStream.write(c3);
                                        } else {
/* 375 */                                   byteArrayOutputStream.write(92);
                                        }
                                    }
                                }
/* 431 */                       if (i2 != -2) {
/* 435 */                           i2 = oilOll.read();
                                }
                            } else {
/* 426 */                       byteArrayOutputStream.write(c2);
                            }
/* 234 */                   i2 = -2;
/* 431 */                   if (i2 != -2) {
                            }
                        }
/* 441 */               if (i2 != -1) {
/* 443 */                   oilOll.I00ilO0(i2);
                        }
/* 452 */               return new IIi0l1(byteArrayOutputStream.toByteArray());
                    }
/* 27 */            StringBuilder sb2 = new StringBuilder();
                    while (true) {
/* 30 */                int i3 = oilOll.read();
/* 34 */                char c6 = (char) i3;
/* 39 */                if (!I0001Ioi1lo(c6)) {
/* 47 */                    if (i3 == 62) {
                                break;
                            }
/* 53 */                    if (i3 < 0) {
/* 195 */                       IioIoO10iOiI.I000OOo1O("Missing closing bracket for hex string. Reached EOS.");
/* 50 */                        return null;
                            }
/* 57 */                    if (i3 != 32 && i3 != 10 && i3 != 9 && i3 != 13 && i3 != 8 && i3 != 12) {
/* 76 */                        if (sb2.length() % 2 != 0) {
/* 83 */                            sb2.deleteCharAt(sb2.length() - 1);
                                }
/* 92 */                        do {
/* 86 */                            i = oilOll.read();
/* 90 */                            if (i == 62) {
                                        break;
                                    }
/* 92 */                        } while (i >= 0);
/* 94 */                        if (i < 0) {
/* 191 */                           IioIoO10iOiI.I000OOo1O("Missing closing bracket for hex string. Reached EOS.");
/* 50 */                            return null;
                                }
                            }
                        } else {
/* 41 */                    sb2.append(c6);
                        }
                    }
                }

                public final IIOoOiOI I000l1() {
/* 1 */             I001IIilI0O();
/* 4 */             OilOll oilOll = this.I00000oOI;
/* 10 */            char cPeek = (char) oilOll.peek();
/* 13 */            if (cPeek == '(') {
/* 447 */               return I000iOII();
                    }
/* 17 */            if (cPeek == '/') {
/* 442 */               return I000OiO();
                    }
/* 21 */            if (cPeek == '<') {
/* 418 */               int i = oilOll.read();
/* 426 */               char cPeek2 = (char) oilOll.peek();
/* 427 */               oilOll.I00ilO0(i);
                        return cPeek2 == '<' ? I000OOo1O() : I000iOII();
                    }
/* 26 */            if (cPeek == 'R') {
/* 409 */               oilOll.read();
/* 414 */               return new IIi0O10I(null);
                    }
/* 30 */            if (cPeek == '[') {
/* 404 */               return I000O01llI0();
                    }
/* 38 */            if (cPeek == 'f') {
/* 354 */               String str = new String(oilOll.I00io1l(5), IO1IIilll1I.I0000O);
/* 363 */               if (str.equals("false")) {
/* 365 */                   return IIOoOl1o1.I00iiO;
                        }
/* 374 */               StringBuilder sb = new StringBuilder("expected false actual='");
/* 377 */               sb.append(str);
/* 380 */               sb.append("' ");
/* 383 */               sb.append(oilOll);
/* 386 */               long position = oilOll.getPosition();
/* 390 */               sb.append("' at offset ");
/* 393 */               sb.append(position);
/* 403 */               throw new IOException(sb.toString());
                    }
/* 43 */            if (cPeek == 'n') {
/* 339 */               I000o00OoI0I(new char[]{'n', 'u', 'l', 'l'});
/* 342 */               return IIi0II0l0o.I00iOIl;
                    }
/* 47 */            if (cPeek == 't') {
/* 284 */               String str2 = new String(oilOll.I00io1l(4), IO1IIilll1I.I0000O);
/* 293 */               if (str2.equals("true")) {
/* 295 */                   return IIOoOl1o1.I00iiI;
                        }
/* 304 */               StringBuilder sb2 = new StringBuilder("expected true actual='");
/* 307 */               sb2.append(str2);
/* 310 */               sb2.append("' ");
/* 313 */               sb2.append(oilOll);
/* 316 */               long position2 = oilOll.getPosition();
/* 320 */               sb2.append("' at offset ");
/* 323 */               sb2.append(position2);
/* 333 */               throw new IOException(sb2.toString());
                    }
/* 52 */            if (cPeek == 65535) {
/* 25 */                return null;
                    }
/* 64 */            if (Character.isDigit(cPeek) || cPeek == '-' || cPeek == '+' || cPeek == '.') {
/* 223 */               StringBuilder sb3 = new StringBuilder();
/* 226 */               int i2 = oilOll.read();
                        while (true) {
/* 230 */                   char c = (char) i2;
/* 235 */                   if (!Character.isDigit(c) && c != '-' && c != '+' && c != '.' && c != 'E' && c != 'e') {
                                break;
                            }
/* 267 */                   sb3.append(c);
/* 270 */                   i2 = oilOll.read();
                        }
/* 253 */               if (i2 != -1) {
/* 255 */                   oilOll.I00ilO0(i2);
                        }
/* 262 */               return IIi0IoOo.I00l0I0l0lO1(sb3.toString());
                    }
/* 74 */            long position3 = oilOll.getPosition();
/* 78 */            String strI0010o = I0010o();
/* 90 */            if (!strI0010o.isEmpty()) {
/* 98 */                if ("endobj".equals(strI0010o) || "endstream".equals(strI0010o)) {
/* 147 */                   oilOll.I00oIiI10(strI0010o.getBytes(IO1IIilll1I.I0000O));
/* 25 */                    return null;
                        }
/* 111 */               StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Skipped unexpected dir object = '", strI0010o, "' at offset ");
/* 119 */               sbI001IIilI0O.append(oilOll.getPosition());
/* 122 */               sbI001IIilI0O.append(" (start offset: ");
/* 125 */               sbI001IIilI0O.append(position3);
/* 128 */               sbI001IIilI0O.append(")");
/* 137 */               Log.w("PdfBox-Android", sbI001IIilI0O.toString());
/* 25 */                return null;
                    }
/* 151 */           int iPeek = oilOll.peek();
/* 220 */           throw new IOException("Unknown dir object c='" + cPeek + "' cInt=" + ((int) cPeek) + " peek='" + ((char) iPeek) + "' peekInt=" + iPeek + " at offset " + oilOll.getPosition() + " (start offset: " + position3 + ")");
                }

                public final void I000lI(char c) throws IOException {
/* 1 */             OilOll oilOll = this.I00000oOI;
/* 7 */             char c2 = (char) oilOll.read();
/* 8 */             if (c2 == c) {
/* 10 */                return;
                    }
/* 186 */           throw new IOException("expected='" + c + "' actual='" + c2 + "' at offset " + oilOll.getPosition());
                }

                public final void I000o00OoI0I(char[] cArr) {
/* 1 */             I001IIilI0O();
/* 6 */             for (char c : cArr) {
/* 10 */                OilOll oilOll = this.I00000oOI;
/* 16 */                if (oilOll.read() != c) {
/* 65 */                    throw new IOException("Expected string '" + new String(cArr) + "' but missed at character '" + c + "' at offset " + oilOll.getPosition());
                        }
                    }
/* 66 */            I001IIilI0O();
                }

                public final int I000oI1ioi() {
/* 1 */             I001IIilI0O();
/* 4 */             StringBuilder sbI00111O = I00111O();
                    try {
/* 12 */                int i = Integer.parseInt(sbI00111O.toString());
/* 16 */                if (i >= 0 && i <= 65535) {
/* 26 */                    return i;
                        }
/* 35 */                IioIoO10iOiI.I000OOo1O(IIlIOloOOO.I00100l0("Generation Number '", i, "' has more than 5 digits"));
/* 38 */                return 0;
                    } catch (NumberFormatException e) {
/* 47 */                byte[] bytes = sbI00111O.toString().getBytes(IO1IIilll1I.I0000O);
/* 51 */                OilOll oilOll = this.I00000oOI;
/* 53 */                oilOll.I00oIiI10(bytes);
/* 113 */               throw new IOException("Error: Expected an integer type at offset " + oilOll.getPosition() + ", instead got '" + ((Object) sbI00111O) + "'", e);
                    }
                }

                public final String I00100l0() {
                    int i;
/* 1 */             OilOll oilOll = this.I00000oOI;
/* 7 */             if (oilOll.I00l0OO0IO()) {
/* 113 */               throw new IOException("Error: End-of-File, expected line at offset " + oilOll.getPosition());
                    }
/* 13 */            StringBuilder sb = new StringBuilder(11);
                    while (true) {
/* 16 */                i = oilOll.read();
/* 25 */                if (i == -1 || 10 == i || 13 == i) {
                            break;
                        }
/* 34 */                sb.append((char) i);
                    }
/* 38 */            if (13 == i && 10 == oilOll.peek()) {
/* 46 */                oilOll.read();
                    }
/* 49 */            return sb.toString();
                }

                public final long I00100o1O0lo() {
/* 1 */             I001IIilI0O();
/* 4 */             StringBuilder sbI00111O = I00111O();
                    try {
/* 12 */                return Long.parseLong(sbI00111O.toString());
                    } catch (NumberFormatException e) {
/* 24 */                byte[] bytes = sbI00111O.toString().getBytes(IO1IIilll1I.I0000O);
/* 28 */                OilOll oilOll = this.I00000oOI;
/* 30 */                oilOll.I00oIiI10(bytes);
/* 113 */               throw new IOException("Error: Expected a long type at offset " + oilOll.getPosition() + ", instead got '" + ((Object) sbI00111O) + "'", e);
                    }
                }

                public final long I0010I0i() {
/* 1 */             long jI00100o1O0lo = I00100o1O0lo();
/* 9 */             if (jI00100o1O0lo >= 0 && jI00100o1O0lo < 10000000000L) {
/* 20 */                return jI00100o1O0lo;
                    }
/* 29 */            IioIoO10iOiI.I000OOo1O(IlIi0I0.I000l1(jI00100o1O0lo, "Object Number '", "' has more than 10 digits or is negative"));
/* 32 */            return 0L;
                }

                public final String I0010o() {
/* 1 */             I001IIilI0O();
/* 6 */             StringBuilder sb = new StringBuilder();
/* 9 */             OilOll oilOll = this.I00000oOI;
/* 11 */            int i = oilOll.read();
                    while (true) {
/* 15 */                char c = (char) i;
/* 21 */                if (I0000oI00(c) || i == -1) {
                            break;
                        }
/* 25 */                sb.append(c);
/* 28 */                i = oilOll.read();
                    }
/* 33 */            if (i != -1) {
/* 35 */                oilOll.I00ilO0(i);
                    }
/* 38 */            return sb.toString();
                }

                public final StringBuilder I00111O() throws IOException {
                    OilOll oilOll;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 30 */            do {
/* 6 */                 oilOll = this.I00000oOI;
/* 8 */                 int i = oilOll.read();
/* 14 */                if (i < 48 || i > 57) {
/* 66 */                    if (i != -1) {
/* 68 */                        oilOll.I00ilO0(i);
                            }
/* 113 */                   return sb;
                        }
/* 21 */                sb.append((char) i);
/* 30 */            } while (sb.length() <= I0000O);
/* 39 */            StringBuilder sb2 = new StringBuilder("Number '");
/* 42 */            sb2.append((Object) sb);
/* 45 */            long position = oilOll.getPosition();
/* 51 */            sb2.append("' is getting too long, stop reading at offset ");
/* 54 */            sb2.append(position);
/* 64 */            throw new IOException(sb2.toString());
                }

                public final void I001IIilI0O() {
/* 1 */             OilOll oilOll = this.I00000oOI;
/* 3 */             int i = oilOll.read();
                    while (true) {
/* 14 */                if (!I000II(i) && i != 37) {
                            break;
                        }
/* 25 */                if (i == 37) {
/* 27 */                    i = oilOll.read();
/* 33 */                    while (10 != i && 13 != i && i != -1) {
/* 43 */                        i = oilOll.read();
                            }
                        } else {
/* 48 */                    i = oilOll.read();
                        }
                    }
/* 19 */            if (i != -1) {
/* 21 */                oilOll.I00ilO0(i);
                    }
                }

                public final void I001IO000() {
/* 1 */             OilOll oilOll = this.I00000oOI;
/* 3 */             int i = oilOll.read();
/* 9 */             while (32 == i) {
/* 11 */                i = oilOll.read();
                    }
/* 20 */            if (13 != i) {
/* 32 */                if (10 != i) {
/* 34 */                    oilOll.I00ilO0(i);
                        }
                    } else {
/* 22 */                int i2 = oilOll.read();
/* 26 */                if (10 != i2) {
/* 28 */                    oilOll.I00ilO0(i2);
                        }
                    }
                }
            }
