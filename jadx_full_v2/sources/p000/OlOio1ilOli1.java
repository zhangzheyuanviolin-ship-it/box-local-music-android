            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class OlOio1ilOli1 extends iO1oioi implements O01IlO {
                public final O011OoiO1 I00000oIO;
                public final i01lIlOi I00000oOI;
                public final I11l01l I0000Il00O;
                public final i1i0olI I0000O;
                public int I0000oI00 = -1;
                public OlOilIlol1 I0001Ioi1lo;
                public final O01IIOOIO I000II;
                public final O01O11o I000O01llI0;

                public OlOio1ilOli1(O011OoiO1 o011OoiO1, i01lIlOi i01liloi, I11l01l i11l01l, OilOloI oilOloI, OlOilIlol1 olOilIlol1) {
                    O01O11o o01O11o;
/* 4 */             this.I00000oIO = o011OoiO1;
/* 6 */             this.I00000oOI = i01liloi;
/* 8 */             this.I0000Il00O = i11l01l;
/* 12 */            this.I0000O = o011OoiO1.I00000oOI;
/* 17 */            this.I0001Ioi1lo = olOilIlol1;
/* 19 */            O01IIOOIO o01iiooio = o011OoiO1.I00000oIO;
/* 21 */            this.I000II = o01iiooio;
/* 25 */            if (o01iiooio.I0000O) {
/* 27 */                o01O11o = null;
                    } else {
/* 31 */                O01O11o o01O11o2 = new O01O11o();
/* 47 */                IliI1Ii1II iliI1Ii1II = new IliI1Ii1II(2, o01O11o2, O01O11o.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 3);
/* 50 */                IioiI0IIIIO iioiI0IIIIO = new IioiI0IIIIO();
/* 53 */                iioiI0IIIIO.I00000oOI = oilOloI;
/* 55 */                iioiI0IIIIO.I0000Il00O = iliI1Ii1II;
/* 57 */                int iI0000oI00 = oilOloI.I0000oI00();
/* 67 */                if (iI0000oI00 <= 64) {
/* 74 */                    iioiI0IIIIO.I00000oIO = iI0000oI00 != 64 ? (-1) << iI0000oI00 : 0L;
/* 78 */                    iioiI0IIIIO.I0000O = IioiI0IIIIO.I0000oI00;
                        } else {
/* 84 */                    iioiI0IIIIO.I00000oIO = 0L;
/* 88 */                    int i = (iI0000oI00 - 1) >>> 6;
/* 92 */                    long[] jArr = new long[i];
/* 94 */                    if ((iI0000oI00 & 63) != 0) {
/* 100 */                       jArr[i - 1] = (-1) << iI0000oI00;
                            }
/* 102 */                   iioiI0IIIIO.I0000O = jArr;
                        }
/* 80 */                VarHandle.storeStoreFence();
/* 105 */               o01O11o2.I00000oIO = iioiI0IIIIO;
/* 107 */               VarHandle.storeStoreFence();
/* 110 */               o01O11o = o01O11o2;
                    }
/* 111 */           this.I000O01llI0 = o01O11o;
                }

                @Override
                public final i1i0olI I00000oIO() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final IOl1ii1loO I00000oOI(OilOloI oilOloI) {
/* 1 */             O011OoiO1 o011OoiO1 = this.I00000oIO;
/* 3 */             i01lIlOi i01liloiI00000oOI = liIOOi1iIII.I00000oOI(o011OoiO1, oilOloI);
/* 7 */             I11l01l i11l01l = this.I0000Il00O;
/* 11 */            o00io0IiOOo0 o00io0iiooo0 = (o00io0IiOOo0) i11l01l.I0000O;
/* 16 */            int i = o00io0iiooo0.I00iiI + 1;
/* 17 */            o00io0iiooo0.I00iiI = i;
/* 24 */            if (i == ((Object[]) o00io0iiooo0.I00iio).length) {
/* 26 */                o00io0iiooo0.I0001Ioi1lo();
                    }
/* 33 */            ((Object[]) o00io0iiooo0.I00iio)[i] = oilOloI;
/* 37 */            i11l01l.I00100l0(i01liloiI00000oOI.I00iOIl);
/* 45 */            if (i11l01l.I00IO1oi11O() != 4) {
/* 47 */                int iOrdinal = i01liloiI00000oOI.ordinal();
                        return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new OlOio1ilOli1(o011OoiO1, i01liloiI00000oOI, i11l01l, oilOloI, this.I0001Ioi1lo) : (this.I00000oOI == i01liloiI00000oOI && o011OoiO1.I00000oIO.I0000O) ? this : new OlOio1ilOli1(o011OoiO1, i01liloiI00000oOI, i11l01l, oilOloI, this.I0001Ioi1lo);
                    }
/* 93 */            I11l01l.I001IO000(i11l01l, "Unexpected leading comma", 0, null, 6);
/* 186 */           throw null;
                }

                @Override
                public final boolean I0000O() {
                    boolean z;
                    boolean z2;
/* 1 */             I11l01l i11l01l = this.I0000Il00O;
/* 3 */             int iI00IoO0 = i11l01l.I00IoO0();
/* 9 */             String str = (String) i11l01l.I000II;
/* 20 */            if (iI00IoO0 == str.length()) {
/* 144 */               I11l01l.I001IO000(i11l01l, "EOF", 0, null, 6);
/* 541 */               throw null;
                    }
/* 29 */            if (str.charAt(iI00IoO0) == '\"') {
/* 31 */                iI00IoO0++;
/* 33 */                z = true;
                    } else {
/* 35 */                z = false;
                    }
/* 36 */            int iI00IioO0OiOi = i11l01l.I00IioO0OiOi(iI00IoO0);
/* 44 */            if (iI00IioO0OiOi >= str.length() || iI00IioO0OiOi == -1) {
/* 140 */               I11l01l.I001IO000(i11l01l, "EOF", 0, null, 6);
/* 143 */               throw null;
                    }
/* 49 */            int i = iI00IioO0OiOi + 1;
/* 55 */            int iCharAt = str.charAt(iI00IioO0OiOi) | ' ';
/* 59 */            if (iCharAt == 102) {
/* 101 */               i11l01l.I000l1(i, "alse");
/* 104 */               z2 = false;
                    } else {
/* 63 */                if (iCharAt != 116) {
/* 95 */                    I11l01l.I001IO000(i11l01l, "Expected valid boolean literal prefix, but had '" + i11l01l.I0010o() + '\'', 0, null, 6);
/* 98 */                    throw null;
                        }
/* 67 */                i11l01l.I000l1(i, "rue");
/* 70 */                z2 = true;
                    }
/* 105 */           if (!z) {
/* 139 */               return z2;
                    }
/* 113 */           if (i11l01l.I00000oOI == str.length()) {
/* 135 */               I11l01l.I001IO000(i11l01l, "EOF", 0, null, 6);
/* 138 */               throw null;
                    }
/* 121 */           if (str.charAt(i11l01l.I00000oOI) == '\"') {
                        i11l01l.I00000oOI++;
/* 128 */               return z2;
                    }
/* 131 */           I11l01l.I001IO000(i11l01l, "Expected closing quotation mark", 0, null, 6);
/* 134 */           throw null;
                }

                @Override
                public final char I0000oI00() {
/* 1 */             I11l01l i11l01l = this.I0000Il00O;
/* 3 */             String strI0010o = i11l01l.I0010o();
/* 13 */            if (strI0010o.length() == 1) {
/* 15 */                return strI0010o.charAt(0);
                    }
/* 30 */            I11l01l.I001IO000(i11l01l, IIl001iO0Io.I000iOII('\'', "Expected single char, but got '", strI0010o), 0, null, 6);
/* 113 */           throw null;
                }

                /* JADX WARN: Removed duplicated region for block: B:49:0x0137  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0001Ioi1lo(O0O01001OOII o0o01001ooii) {
                    String strI00000oOI;
/* 1 */             O011OoiO1 o011OoiO1 = this.I00000oIO;
/* 3 */             I11l01l i11l01l = this.I0000Il00O;
/* 7 */             o00io0IiOOo0 o00io0iiooo0 = (o00io0IiOOo0) i11l01l.I0000O;
                    try {
                    } catch (O1looIlIoo0O e) {
/* 310 */               if (!OlOoOIi0o.I000oI1ioi(e.getMessage(), "at path", false)) {
                        }
                    }
/* 14 */            if (!(o0o01001ooii instanceof I01IoO)) {
/* 295 */               return o0o01001ooii.I00000oOI(this);
                    }
/* 23 */            String strI0000Il00O = lI1lOI10li.I0000Il00O(o011OoiO1, ((I01IoO) o0o01001ooii).I0000O());
/* 31 */            String strI00IO1 = i11l01l.I00IO1(strI0000Il00O, this.I000II.I0000Il00O);
/* 37 */            if (strI00IO1 != null) {
                        try {
/* 231 */                   O0O01001OOII o0o01001ooiiI00000oIO = lI1o0lI.I00000oIO((I01IoO) o0o01001ooii, this, strI00IO1);
/* 237 */                   OlOilIlol1 olOilIlol1 = new OlOilIlol1();
/* 240 */                   olOilIlol1.I00000oIO = strI0000Il00O;
/* 242 */                   this.I0001Ioi1lo = olOilIlol1;
/* 244 */                   return o0o01001ooiiI00000oIO.I00000oOI(this);
                        } catch (Oili1O e2) {
/* 262 */                   String strI00IioO0OiOi = OlOoOIi0o.I00IioO0OiOi(OlOoOIi0o.I00O10llo(e2.getMessage(), '\n'), ".");
/* 266 */                   String message = e2.getMessage();
/* 270 */                   String strSubstring = "";
/* 273 */                   int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(message, '\n', 0, 6);
/* 277 */                   if (iI001i1O0Ol != -1) {
/* 286 */                       strSubstring = message.substring(iI001i1O0Ol + 1, message.length());
                            }
/* 291 */                   I11l01l.I001IO000(i11l01l, strI00IioO0OiOi, 0, strSubstring, 2);
/* 294 */                   throw null;
                        }
                    }
/* 46 */            String strI0000Il00O2 = lI1lOI10li.I0000Il00O(o011OoiO1, ((I01IoO) o0o01001ooii).I0000O());
/* 50 */            O01O0o1iI o01O0o1iII000OiO = I000OiO();
/* 61 */            String strI00000oIO = ((I01IoO) o0o01001ooii).I0000O().I00000oIO();
/* 67 */            if (o01O0o1iII000OiO instanceof O01ioO1o0i11) {
/* 158 */               O01ioO1o0i11 o01ioO1o0i11 = (O01ioO1o0i11) o01O0o1iII000OiO;
/* 164 */               O01O0o1iI o01O0o1iI = (O01O0o1iI) o01ioO1o0i11.get(strI0000Il00O2);
/* 166 */               if (o01O0o1iI != null) {
/* 168 */                   O01lO1iO o01lO1iOI0000oI00 = O01O1110.I0000oI00(o01O0o1iI);
/* 182 */                   strI00000oOI = o01lO1iOI0000oI00 instanceof O01iI0i0 ? null : o01lO1iOI0000oI00.I00000oOI();
                        }
                        try {
/* 189 */                   return lOoI1iI.I00000oIO(o011OoiO1, strI0000Il00O2, o01ioO1o0i11, lI1o0lI.I00000oIO((I01IoO) o0o01001ooii, this, strI00000oOI));
                        } catch (Oili1O e3) {
/* 228 */                   throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, e3.getMessage(), null, null, o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01ioO1o0i11.toString()).toString() : null));
                        }
                    }
/* 71 */            StringBuilder sb = new StringBuilder("Expected ");
/* 76 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 86 */            sb.append(oOoOl1001II.I00000oOI(O01ioO1o0i11.class).I000oI1ioi());
/* 91 */            sb.append(", but had ");
/* 106 */           sb.append(oOoOl1001II.I00000oOI(o01O0o1iII000OiO.getClass()).I000oI1ioi());
/* 111 */           sb.append(" as the serialized body of ");
/* 114 */           sb.append(strI00000oIO);
/* 157 */           throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, sb.toString(), o00io0iiooo0.I0000Il00O(), null, o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII000OiO.toString()).toString() : null));
/* 310 */           if (!OlOoOIi0o.I000oI1ioi(e.getMessage(), "at path", false)) {
/* 312 */               throw e;
                    }
/* 966 */           throw new O1looIlIoo0O(e.getMessage() + " at path: " + o00io0iiooo0.I0000Il00O(), e, e.I00iOIl, e.I00iiI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:67:0x00ed, code lost:
                
                    r0 = r3.I00iiI;
                    r1 = (int[]) r3.I00ilI0I1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x00f6, code lost:
                
                    if (r1[r0] != (-2)) goto L70;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x00f8, code lost:
                
                    r1[r0] = -1;
                    r0 = r0 - 1;
                    r3.I00iiI = r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x00fe, code lost:
                
                    if (r0 == (-1)) goto L72;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x0100, code lost:
                
                    r3.I00iiI = r0 - 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0103, code lost:
                
                    r2.I001IIilI0O(p000.IIl001iO0Io.I000iOII('\'', "Encountered an unknown key '", r5), p000.OlOoOIi0o.I001lloI(((java.lang.String) r2.I000II).subSequence(0, r2.I00000oOI).toString(), r5, 0, 6), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x0122, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000II(OilOloI oilOloI) {
                    byte b;
/* 5 */             I11l01l i11l01l = this.I0000Il00O;
/* 9 */             o00io0IiOOo0 o00io0iiooo0 = (o00io0IiOOo0) i11l01l.I0000O;
/* 11 */            i01lIlOi i01liloi = this.I00000oOI;
/* 13 */            int iOrdinal = i01liloi.ordinal();
/* 18 */            char c = ':';
/* 20 */            int i = 0;
/* 20 */            zI00IoiI = false;
/* 20 */            boolean zI00IoiI = false;
/* 21 */            byte b2 = 1;
/* 22 */            int i2 = -1;
/* 24 */            if (iOrdinal == 0) {
/* 138 */               boolean zI00IoiI2 = i11l01l.I00IoiI();
                        while (true) {
/* 142 */                   boolean zI000iOII = i11l01l.I000iOII();
/* 150 */                   O01O11o o01O11o = this.I000O01llI0;
/* 152 */                   if (zI000iOII) {
/* 156 */                       boolean z = this.I000II.I0000Il00O;
/* 165 */                       String strI00111O = z ? i11l01l.I00111O() : i11l01l.I000lI();
/* 169 */                       i11l01l.I00100l0(c);
/* 172 */                       O011OoiO1 o011OoiO1 = this.I00000oIO;
/* 174 */                       int iI00000oIO = O01iI00o.I00000oIO(oilOloI, o011OoiO1, strI00111O);
/* 178 */                       byte b3 = b2;
/* 181 */                       if (iI00000oIO != -3) {
/* 183 */                           if (o01O11o != null) {
/* 185 */                               IioiI0IIIIO iioiI0IIIIO = o01O11o.I00000oIO;
/* 187 */                               if (iI00000oIO < 64) {
                                            iioiI0IIIIO.I00000oIO |= 1 << iI00000oIO;
                                        } else {
                                            int i3 = (iI00000oIO >>> 6) - 1;
/* 207 */                                   long[] jArr = (long[]) iioiI0IIIIO.I0000O;
/* 214 */                                   jArr[i3] = jArr[i3] | (1 << (iI00000oIO & 63));
                                        }
                                    }
/* 196 */                           i2 = iI00000oIO;
                                } else {
/* 221 */                           if (!O01iI00o.I0000Il00O(o011OoiO1, oilOloI)) {
/* 223 */                               OlOilIlol1 olOilIlol1 = this.I0001Ioi1lo;
/* 225 */                               if (olOilIlol1 == null || !O0000Ioio00.I0000O(olOilIlol1.I00000oIO, strI00111O)) {
                                            break;
                                        }
/* 235 */                               olOilIlol1.I00000oIO = null;
                                    }
/* 294 */                           ArrayList arrayList = new ArrayList();
/* 297 */                           byte bI00IO1oi11O = i11l01l.I00IO1oi11O();
/* 303 */                           if (bI00IO1oi11O == 8 || bI00IO1oi11O == 6) {
                                        while (true) {
/* 314 */                                   byte bI00IO1oi11O2 = i11l01l.I00IO1oi11O();
/* 318 */                                   b = b3;
/* 320 */                                   if (bI00IO1oi11O2 != b) {
/* 334 */                                       if (bI00IO1oi11O2 == 8 || bI00IO1oi11O2 == 6) {
/* 405 */                                           arrayList.add(Byte.valueOf(bI00IO1oi11O2));
                                                } else if (bI00IO1oi11O2 == 9) {
/* 353 */                                           if (((Number) IOOi0Ool1i.I00Io1o110i(arrayList)).byteValue() != 8) {
/* 361 */                                               I11l01l.I001IO000(i11l01l, "found ] instead of }", 0, null, 6);
/* 364 */                                               throw null;
                                                    }
/* 355 */                                           IOOii0O10Io0.I00111O(arrayList);
                                                } else if (bI00IO1oi11O2 == 7) {
/* 378 */                                           if (((Number) IOOi0Ool1i.I00Io1o110i(arrayList)).byteValue() != 6) {
/* 386 */                                               I11l01l.I001IO000(i11l01l, "found } instead of ]", 0, null, 6);
/* 389 */                                               throw null;
                                                    }
/* 380 */                                           IOOii0O10Io0.I00111O(arrayList);
                                                } else if (bI00IO1oi11O2 == 10) {
/* 397 */                                           I11l01l.I001IO000(i11l01l, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
/* 400 */                                           throw null;
                                                }
/* 408 */                                       i11l01l.I000o00OoI0I();
/* 415 */                                       if (arrayList.size() == 0) {
                                                    break;
                                                }
                                            } else if (z) {
/* 324 */                                       i11l01l.I0010o();
                                            } else {
/* 328 */                                       i11l01l.I000lI();
                                            }
/* 331 */                                   b3 = b;
                                        }
                                    } else {
/* 307 */                               i11l01l.I0010o();
/* 310 */                               b = b3;
                                    }
/* 417 */                           zI00IoiI2 = i11l01l.I00IoiI();
/* 421 */                           b2 = b;
/* 422 */                           c = ':';
                                }
                            } else {
/* 426 */                       if (zI00IoiI2) {
/* 554 */                           l0I0OO0.I0000O(i11l01l);
/* 966 */                           throw null;
                                }
/* 428 */                       if (o01O11o != null) {
/* 430 */                           IioiI0IIIIO iioiI0IIIIO2 = o01O11o.I00000oIO;
/* 434 */                           IliI1Ii1II iliI1Ii1II = (IliI1Ii1II) iioiI0IIIIO2.I0000Il00O;
/* 438 */                           OilOloI oilOloI2 = (OilOloI) iioiI0IIIIO2.I00000oOI;
/* 440 */                           int iI0000oI00 = oilOloI2.I0000oI00();
                                    while (true) {
/* 444 */                               long j = iioiI0IIIIO2.I00000oIO;
/* 446 */                               long j2 = -1;
/* 450 */                               if (j != -1) {
/* 453 */                                   int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                            iioiI0IIIIO2.I00000oIO |= 1 << iNumberOfTrailingZeros;
/* 478 */                                   if (((Boolean) iliI1Ii1II.invoke(oilOloI2, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
/* 480 */                                       i2 = iNumberOfTrailingZeros;
                                                break;
                                            }
                                        } else if (iI0000oI00 > 64) {
/* 486 */                                   long[] jArr2 = (long[]) iioiI0IIIIO2.I0000O;
/* 488 */                                   int length = jArr2.length;
/* 489 */                                   loop3: while (i < length) {
/* 491 */                                       int i4 = i + 1;
/* 493 */                                       int i5 = i4 * 64;
/* 495 */                                       long j3 = jArr2[i];
/* 499 */                                       while (j3 != j2) {
/* 502 */                                           int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j3);
/* 508 */                                           j3 |= 1 << iNumberOfTrailingZeros2;
/* 509 */                                           i2 = iNumberOfTrailingZeros2 + i5;
/* 524 */                                           if (((Boolean) iliI1Ii1II.invoke(oilOloI2, Integer.valueOf(i2))).booleanValue()) {
/* 526 */                                               jArr2[i] = j3;
                                                        break loop3;
                                                    }
/* 530 */                                           j2 = -1;
                                                }
/* 533 */                                       jArr2[i] = j3;
/* 535 */                                       i = i4;
/* 537 */                                       j2 = -1;
                                            }
                                        }
                                    }
                                } else {
/* 540 */                           i2 = -1;
                                }
                            }
                        }
                    } else if (iOrdinal != 2) {
/* 29 */                boolean zI00IoiI3 = i11l01l.I00IoiI();
/* 37 */                if (i11l01l.I000iOII()) {
/* 39 */                    int i6 = this.I0000oI00;
/* 41 */                    if (i6 != -1 && !zI00IoiI3) {
/* 48 */                        I11l01l.I001IO000(i11l01l, "Expected end of the array or comma", 0, null, 6);
/* 51 */                        throw null;
                            }
/* 52 */                    i2 = i6 + 1;
/* 54 */                    this.I0000oI00 = i2;
                        } else if (zI00IoiI3) {
/* 64 */                    l0I0OO0.I0000Il00O(i11l01l, "array");
/* 67 */                    throw null;
                        }
                    } else {
/* 68 */                int i7 = this.I0000oI00;
/* 76 */                Object[] objArr = i7 % 2 != 0;
/* 77 */                if (objArr != true) {
/* 86 */                    i11l01l.I00100l0(':');
                        } else if (i7 != -1) {
/* 81 */                    zI00IoiI = i11l01l.I00IoiI();
                        }
/* 93 */                if (i11l01l.I000iOII()) {
/* 95 */                    if (objArr != false) {
/* 97 */                        int i8 = this.I0000oI00;
/* 99 */                        int i9 = i11l01l.I00000oOI;
/* 102 */                       if (i8 == -1) {
/* 104 */                           if (zI00IoiI) {
/* 109 */                               I11l01l.I001IO000(i11l01l, "Unexpected leading comma", i9, null, 4);
/* 112 */                               throw null;
                                    }
                                } else if (!zI00IoiI) {
/* 118 */                           I11l01l.I001IO000(i11l01l, "Expected comma after the key-value pair", i9, null, 4);
/* 121 */                           throw null;
                                }
                            }
/* 124 */                   i2 = this.I0000oI00 + 1;
/* 126 */                   this.I0000oI00 = i2;
                        } else if (zI00IoiI) {
/* 134 */                   l0I0OO0.I0000O(i11l01l);
/* 137 */                   throw null;
                        }
                    }
/* 543 */           if (i01liloi != i01lIlOi.I00ilI0I1) {
/* 551 */               ((int[]) o00io0iiooo0.I00ilI0I1)[o00io0iiooo0.I00iiI] = i2;
                    }
/* 553 */           return i2;
                }

                @Override
                public final O01O0o1iI I000OiO() {
/* 5 */             O01IIOOIO o01iiooio = this.I00000oIO.I00000oIO;
/* 7 */             I00IOO i00ioo = new I00IOO();
/* 12 */            i00ioo.I0000Il00O = this.I0000Il00O;
/* 16 */            i00ioo.I00000oIO = o01iiooio.I0000Il00O;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            return i00ioo.I0001Ioi1lo();
                }

                @Override
                public final int I000lI() {
/* 1 */             I11l01l i11l01l = this.I0000Il00O;
/* 3 */             long jI00100o1O0lo = i11l01l.I00100o1O0lo();
/* 7 */             int i = (int) jI00100o1O0lo;
/* 11 */            if (jI00100o1O0lo == i) {
/* 13 */                return i;
                    }
/* 36 */            I11l01l.I001IO000(i11l01l, "Failed to parse int for input '" + jI00100o1O0lo + '\'', 0, null, 6);
/* 113 */           throw null;
                }

                @Override
                public final void I000oI1ioi(OilOloI oilOloI) {
/* 6 */             if (oilOloI.I0000oI00() == 0 && O01iI00o.I0000Il00O(this.I00000oIO, oilOloI)) {
/* 20 */                while (I000II(oilOloI) != -1) {
                        }
                    }
/* 22 */            I11l01l i11l01l = this.I0000Il00O;
/* 28 */            if (i11l01l.I00IoiI()) {
/* 66 */                l0I0OO0.I0000Il00O(i11l01l, "");
/* 186 */               throw null;
                    }
/* 34 */            i11l01l.I00100l0(this.I00000oOI.I00iiI);
/* 39 */            o00io0IiOOo0 o00io0iiooo0 = (o00io0IiOOo0) i11l01l.I0000O;
/* 41 */            int i = o00io0iiooo0.I00iiI;
/* 45 */            int[] iArr = (int[]) o00io0iiooo0.I00ilI0I1;
/* 50 */            if (iArr[i] == -2) {
/* 52 */                iArr[i] = -1;
                        i--;
/* 56 */                o00io0iiooo0.I00iiI = i;
                    }
/* 58 */            if (i != -1) {
/* 61 */                o00io0iiooo0.I00iiI = i - 1;
                    }
                }

                @Override
                public final Ii1iO1O I00100l0(OilOloI oilOloI) {
                    return OlOl0IIi0OOl.I00000oIO(oilOloI) ? new O01Io1010OiI(this.I0000Il00O, this.I00000oIO) : this;
                }

                @Override
                public final Object I00100o1O0lo(OilOloI oilOloI, int i, O0O01001OOII o0o01001ooii, Object obj) {
/* 5 */             o00io0IiOOo0 o00io0iiooo0 = (o00io0IiOOo0) this.I0000Il00O.I0000O;
/* 19 */            boolean z = this.I00000oOI == i01lIlOi.I00ilI0I1 && (i & 1) == 0;
/* 21 */            if (z) {
/* 25 */                int[] iArr = (int[]) o00io0iiooo0.I00ilI0I1;
/* 27 */                int i2 = o00io0iiooo0.I00iiI;
/* 31 */                if (iArr[i2] == -2) {
/* 39 */                    ((Object[]) o00io0iiooo0.I00iio)[i2] = O1oO0lOoI1.I00iio;
                        }
                    }
/* 41 */            Object objI0001Ioi1lo = I0001Ioi1lo(o0o01001ooii);
/* 45 */            if (z) {
/* 49 */                int[] iArr2 = (int[]) o00io0iiooo0.I00ilI0I1;
/* 51 */                int i3 = o00io0iiooo0.I00iiI;
/* 55 */                if (iArr2[i3] != -2) {
/* 57 */                    int i4 = i3 + 1;
/* 58 */                    o00io0iiooo0.I00iiI = i4;
/* 65 */                    if (i4 == ((Object[]) o00io0iiooo0.I00iio).length) {
/* 67 */                        o00io0iiooo0.I0001Ioi1lo();
                            }
                        }
/* 72 */                Object[] objArr = (Object[]) o00io0iiooo0.I00iio;
/* 74 */                int i5 = o00io0iiooo0.I00iiI;
/* 88 */                objArr[i5] = ((O01IIOOIO) o00io0iiooo0.I00iiO).I000OOo1O ? objI0001Ioi1lo : Io1Oioii1111.I00iio;
/* 94 */                ((int[]) o00io0iiooo0.I00ilI0I1)[i5] = -2;
                    }
/* 483 */           return objI0001Ioi1lo;
                }

                @Override
                public final String I0010o() {
/* 3 */             boolean z = this.I000II.I0000Il00O;
/* 5 */             I11l01l i11l01l = this.I0000Il00O;
                    return z ? i11l01l.I00111O() : i11l01l.I0010I0i();
                }

                @Override
                public final int I00111O(OilOloI oilOloI) {
/* 23 */            return O01iI00o.I00000oOI(oilOloI, this.I00000oIO, I0010o(), " at path ".concat(((o00io0IiOOo0) this.I0000Il00O.I0000O).I0000Il00O()));
                }

                @Override
                public final long I001IIilI0O() {
/* 3 */             return this.I0000Il00O.I00100o1O0lo();
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[RETURN] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I001IO000() {
                    boolean z;
/* 2 */             O01O11o o01O11o = this.I000O01llI0;
/* 10 */            if (!(o01O11o != null ? o01O11o.I00000oOI : false)) {
/* 12 */                I11l01l i11l01l = this.I0000Il00O;
/* 18 */                int iI00IioO0OiOi = i11l01l.I00IioO0OiOi(i11l01l.I00IoO0());
/* 24 */                String str = (String) i11l01l.I000II;
/* 30 */                int length = str.length() - iI00IioO0OiOi;
/* 33 */                if (length < 4 || iI00IioO0OiOi == -1) {
/* 80 */                    z = false;
/* 81 */                    if (z) {
/* 31 */                        return true;
                            }
                        } else {
/* 39 */                    int i = 0;
                            while (true) {
/* 40 */                        if (i < 4) {
/* 54 */                            if ("null".charAt(i) != str.charAt(iI00IioO0OiOi + i)) {
                                        break;
                                    }
/* 57 */                            i++;
                                } else if (length <= 4 || iOI0IO0iio0o.I00000oIO(str.charAt(iI00IioO0OiOi + 4)) != 0) {
/* 76 */                            i11l01l.I00000oOI = iI00IioO0OiOi + 4;
/* 78 */                            z = true;
                                }
                            }
/* 80 */                    z = false;
/* 81 */                    if (z) {
                            }
                        }
                    }
/* 1 */             return false;
                }

                @Override
                public final O011OoiO1 I001i1lo1io() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final byte I001l0I00() {
/* 1 */             I11l01l i11l01l = this.I0000Il00O;
/* 3 */             long jI00100o1O0lo = i11l01l.I00100o1O0lo();
/* 8 */             byte b = (byte) jI00100o1O0lo;
/* 12 */            if (jI00100o1O0lo == b) {
/* 14 */                return b;
                    }
/* 37 */            I11l01l.I001IO000(i11l01l, "Failed to parse byte for input '" + jI00100o1O0lo + '\'', 0, null, 6);
/* 113 */           throw null;
                }

                @Override
                public final short I001lllioOl() {
/* 1 */             I11l01l i11l01l = this.I0000Il00O;
/* 3 */             long jI00100o1O0lo = i11l01l.I00100o1O0lo();
/* 8 */             short s = (short) jI00100o1O0lo;
/* 12 */            if (jI00100o1O0lo == s) {
/* 14 */                return s;
                    }
/* 37 */            I11l01l.I001IO000(i11l01l, "Failed to parse short for input '" + jI00100o1O0lo + '\'', 0, null, 6);
/* 113 */           throw null;
                }

                @Override
                public final float I001lloI() throws NumberFormatException {
/* 1 */             I11l01l i11l01l = this.I0000Il00O;
/* 3 */             String strI0010o = i11l01l.I0010o();
                    try {
/* 9 */                 float f = Float.parseFloat(strI0010o);
/* 22 */                if (Math.abs(f) <= Float.MAX_VALUE) {
/* 24 */                    return f;
                        }
/* 36 */                I11l01l.I001IO000(i11l01l, l0I0OO0.I0001Ioi1lo(Float.valueOf(f), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
/* 39 */                throw null;
                    } catch (IllegalArgumentException unused) {
/* 49 */                I11l01l.I001IO000(i11l01l, IIl001iO0Io.I000iOII('\'', "Failed to parse type 'float' for input '", strI0010o), 0, null, 6);
/* 113 */               throw null;
                    }
                }

                @Override
                public final double I00II0oii1o() throws NumberFormatException {
/* 1 */             I11l01l i11l01l = this.I0000Il00O;
/* 3 */             String strI0010o = i11l01l.I0010o();
                    try {
/* 9 */                 double d = Double.parseDouble(strI0010o);
/* 24 */                if (Math.abs(d) <= Double.MAX_VALUE) {
/* 26 */                    return d;
                        }
/* 38 */                I11l01l.I001IO000(i11l01l, l0I0OO0.I0001Ioi1lo(Double.valueOf(d), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
/* 41 */                throw null;
                    } catch (IllegalArgumentException unused) {
/* 51 */                I11l01l.I001IO000(i11l01l, IIl001iO0Io.I000iOII('\'', "Failed to parse type 'double' for input '", strI0010o), 0, null, 6);
/* 113 */               throw null;
                    }
                }
            }
