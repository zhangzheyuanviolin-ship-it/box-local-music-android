            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.ByteArrayInputStream;
            import java.io.EOFException;
            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.math.BigInteger;
            
/* 10 */    public final class I00Io1o110i extends FilterInputStream {
                public final int I00iOIl;
                public final boolean I00iiI;
                public final byte[][] I00iiO;

                public I00Io1o110i(int i, byte[] bArr) {
/* 8 */             this(new ByteArrayInputStream(bArr), bArr.length, true);
                }

                public static I00OIO1 I0000Il00O(int i, IiIiIOo iiIiIOo, byte[][] bArr) throws IOException {
                    BigInteger bigInteger;
                    int i2;
                    String str;
                    byte b;
                    byte b2;
/* 7 */             BigInteger bigInteger2 = null;
/* 8 */             int i3 = 0;
/* 9 */             int i4 = 1;
                    switch (i) {
                        case 1:
/* 637 */                   return I00II0oii1o.I001i1O0Ol(I000II(iiIiIOo, bArr));
                        case 2:
/* 628 */                   return I00IoIO0lI.I001i1O0Ol(iiIiIOo.I0000Il00O());
                        case 3:
/* 619 */                   return I001lloI.I001i1O0Ol(iiIiIOo.I0000Il00O());
                        case 4:
/* 611 */                   return new Ii0oii1lIil(iiIiIOo.I0000Il00O());
                        case 5:
/* 594 */                   if (iiIiIOo.I0000Il00O().length == 0) {
/* 596 */                       return Ii0oIIl.I00iOIl;
                            }
/* 601 */                   I000II.I001IO000("malformed NULL encoding encountered");
/* 7 */                     return null;
                        case 6:
/* 582 */                   return I00O0i0ii.I001iOo1i0O(I000II(iiIiIOo, bArr), true);
                        case 7:
/* 568 */                   Ii0o1ll0 ii0o1ll0I001i1O0Ol = Ii0o1ll0.I001i1O0Ol(iiIiIOo.I0000Il00O());
/* 572 */                   I00IoiI i00IoiI = new I00IoiI();
/* 575 */                   i00IoiI.I00iOIl = ii0o1ll0I001i1O0Ol;
/* 577 */                   return i00IoiI;
                        case 8:
                        case 9:
                        case 11:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.LEFT_HEEL:
                        default:
/* 21 */                    IioIoO10iOiI.I000OOo1O(IIlIOloOOO.I00100l0("unknown tag ", i, " encountered"));
/* 7 */                     return null;
                        case 10:
/* 510 */                   byte[] bArrI000II = I000II(iiIiIOo, bArr);
/* 515 */                   if (bArrI000II.length > 1) {
/* 519 */                       return new I00IioO0OiOi(bArrI000II, true);
                            }
/* 524 */                   if (bArrI000II.length == 0) {
/* 556 */                       I000II.I000iOII("ENUMERATED has zero length");
/* 7 */                         return null;
                            }
/* 528 */                   int i5 = bArrI000II[0] & 255;
/* 532 */                   if (i5 >= 12) {
/* 536 */                       return new I00IioO0OiOi(bArrI000II, true);
                            }
/* 540 */                   I00IioO0OiOi[] i00IioO0OiOiArr = I00IioO0OiOi.I00iiI;
/* 542 */                   I00IioO0OiOi i00IioO0OiOi = i00IioO0OiOiArr[i5];
/* 544 */                   if (i00IioO0OiOi != null) {
/* 561 */                       return i00IioO0OiOi;
                            }
/* 548 */                   I00IioO0OiOi i00IioO0OiOi2 = new I00IioO0OiOi(bArrI000II, true);
/* 551 */                   i00IioO0OiOiArr[i5] = i00IioO0OiOi2;
/* 561 */                   return i00IioO0OiOi2;
                        case 12:
/* 491 */                   byte[] bArrI0000Il00O = iiIiIOo.I0000Il00O();
/* 497 */                   Ii0ooIiI ii0ooIiI = new Ii0ooIiI();
/* 500 */                   ii0ooIiI.I00iOIl = bArrI0000Il00O;
/* 502 */                   VarHandle.storeStoreFence();
/* 505 */                   return ii0ooIiI;
                        case 13:
/* 366 */                   byte[] bArrI0000Il00O2 = iiIiIOo.I0000Il00O();
/* 372 */                   I00OIl i00OIl = new I00OIl();
/* 377 */                   StringBuffer stringBuffer = new StringBuffer();
/* 382 */                   BigInteger bigIntegerShiftLeft = null;
/* 383 */                   int i6 = 0;
/* 384 */                   long j = 0;
/* 386 */                   while (i6 != bArrI0000Il00O2.length) {
/* 388 */                       byte b3 = bArrI0000Il00O2[i6];
/* 399 */                       if (j <= 72057594037927808L) {
/* 403 */                           bigInteger = bigInteger2;
/* 405 */                           i2 = i3;
/* 408 */                           long j2 = j + (b3 & Byte.MAX_VALUE);
/* 411 */                           if ((b3 & 128) == 0) {
/* 413 */                               if (i4 != 0) {
/* 415 */                                   i4 = i2;
                                        } else {
/* 418 */                                   stringBuffer.append('.');
                                        }
/* 421 */                               stringBuffer.append(j2);
/* 424 */                               j = 0;
                                    } else {
/* 426 */                               j = j2 << 7;
                                    }
                                } else {
/* 428 */                           bigInteger = bigInteger2;
/* 430 */                           i2 = i3;
/* 432 */                           if (bigIntegerShiftLeft == null) {
/* 434 */                               bigIntegerShiftLeft = BigInteger.valueOf(j);
                                    }
/* 445 */                           BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b3 & Byte.MAX_VALUE));
/* 451 */                           if ((b3 & 128) == 0) {
/* 453 */                               if (i4 != 0) {
/* 455 */                                   i4 = i2;
                                        } else {
/* 458 */                                   stringBuffer.append('.');
                                        }
/* 461 */                               stringBuffer.append(bigIntegerOr);
/* 464 */                               j = 0;
/* 465 */                               bigIntegerShiftLeft = bigInteger;
                                    } else {
/* 468 */                               bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                                    }
                                }
/* 472 */                       i6++;
/* 474 */                       i3 = i2;
/* 476 */                       bigInteger2 = bigInteger;
                            }
/* 483 */                   i00OIl.I00iOIl = stringBuffer.toString();
/* 485 */                   i00OIl.I00iiI = bArrI0000Il00O2;
/* 487 */                   VarHandle.storeStoreFence();
/* 490 */                   return i00OIl;
                        case PoseLandmark.RIGHT_PINKY:
/* 351 */                   byte[] bArrI0000Il00O3 = iiIiIOo.I0000Il00O();
/* 357 */                   Ii0oIOll ii0oIOll = new Ii0oIOll();
/* 360 */                   ii0oIOll.I00iOIl = bArrI0000Il00O3;
/* 362 */                   VarHandle.storeStoreFence();
/* 365 */                   return ii0oIOll;
                        case PoseLandmark.LEFT_INDEX:
/* 336 */                   byte[] bArrI0000Il00O4 = iiIiIOo.I0000Il00O();
/* 342 */                   Ii0oiolI0 ii0oiolI0 = new Ii0oiolI0();
/* 345 */                   ii0oiolI0.I00iOIl = bArrI0000Il00O4;
/* 347 */                   VarHandle.storeStoreFence();
/* 350 */                   return ii0oiolI0;
                        case PoseLandmark.RIGHT_INDEX:
/* 321 */                   byte[] bArrI0000Il00O5 = iiIiIOo.I0000Il00O();
/* 327 */                   Ii0oo11 ii0oo11 = new Ii0oo11();
/* 330 */                   ii0oo11.I00iOIl = bArrI0000Il00O5;
/* 332 */                   VarHandle.storeStoreFence();
/* 335 */                   return ii0oo11;
                        case PoseLandmark.LEFT_THUMB:
/* 306 */                   byte[] bArrI0000Il00O6 = iiIiIOo.I0000Il00O();
/* 312 */                   Ii1001 ii1001 = new Ii1001();
/* 315 */                   ii1001.I00iOIl = bArrI0000Il00O6;
/* 317 */                   VarHandle.storeStoreFence();
/* 320 */                   return ii1001;
                        case PoseLandmark.RIGHT_THUMB:
/* 291 */                   byte[] bArrI0000Il00O7 = iiIiIOo.I0000Il00O();
/* 297 */                   Ii0oI1O ii0oI1O = new Ii0oI1O();
/* 300 */                   ii0oI1O.I00iOIl = bArrI0000Il00O7;
/* 302 */                   VarHandle.storeStoreFence();
/* 305 */                   return ii0oI1O;
                        case PoseLandmark.LEFT_HIP:
/* 240 */                   byte[] bArrI0000Il00O8 = iiIiIOo.I0000Il00O();
/* 246 */                   I00OloOo i00OloOo = new I00OloOo();
/* 250 */                   if (bArrI0000Il00O8.length >= 2) {
/* 252 */                       i00OloOo.I00iOIl = bArrI0000Il00O8;
/* 255 */                       if (bArrI0000Il00O8.length > 0 && (b = bArrI0000Il00O8[0]) >= 48 && b <= 57 && bArrI0000Il00O8.length > 1 && (b2 = bArrI0000Il00O8[1]) >= 48 && b2 <= 57) {
/* 276 */                           VarHandle.storeStoreFence();
/* 279 */                           return i00OloOo;
                                }
/* 281 */                       str = "illegal characters in UTCTime string";
                            } else {
/* 287 */                       str = "UTCTime string too short";
                            }
/* 283 */                   I000II.I000iOII(str);
/* 7 */                     return null;
                        case PoseLandmark.RIGHT_HIP:
/* 236 */                   return new I00Io1lO(iiIiIOo.I0000Il00O());
                        case PoseLandmark.LEFT_KNEE:
/* 225 */                   return Ii0o1ll0.I001i1O0Ol(iiIiIOo.I0000Il00O());
                        case PoseLandmark.RIGHT_KNEE:
/* 206 */                   byte[] bArrI0000Il00O9 = iiIiIOo.I0000Il00O();
/* 212 */                   Ii1001ol ii1001ol = new Ii1001ol();
/* 215 */                   ii1001ol.I00iOIl = bArrI0000Il00O9;
/* 217 */                   VarHandle.storeStoreFence();
/* 220 */                   return ii1001ol;
                        case 27:
/* 191 */                   byte[] bArrI0000Il00O10 = iiIiIOo.I0000Il00O();
/* 197 */                   Ii0o1O ii0o1O = new Ii0o1O();
/* 200 */                   ii0o1O.I00iOIl = bArrI0000Il00O10;
/* 202 */                   VarHandle.storeStoreFence();
/* 205 */                   return ii0o1O;
                        case PoseLandmark.RIGHT_ANKLE:
/* 176 */                   byte[] bArrI0000Il00O11 = iiIiIOo.I0000Il00O();
/* 182 */                   Ii10000i ii10000i = new Ii10000i();
/* 185 */                   ii10000i.I00iOIl = bArrI0000Il00O11;
/* 187 */                   VarHandle.storeStoreFence();
/* 190 */                   return ii10000i;
                        case 30:
/* 25 */                    int i7 = iiIiIOo.I00iio;
/* 29 */                    if ((i7 & 1) != 0) {
/* 172 */                       IioIoO10iOiI.I000OOo1O("malformed BMPString encoding encountered");
/* 7 */                         return null;
                            }
/* 31 */                    int i8 = i7 / 2;
/* 33 */                    char[] cArr = new char[i8];
/* 37 */                    byte[] bArr2 = new byte[8];
/* 39 */                    int i9 = 0;
/* 42 */                    while (i7 >= 8) {
/* 48 */                        if (lOOllo00lO.I00000oOI(iiIiIOo, bArr2, 0, 8) != 8) {
/* 114 */                           throw new EOFException("EOF encountered in middle of BMPString");
                                }
/* 59 */                        cArr[i9] = (char) ((bArr2[0] << 8) | (bArr2[1] & 255));
/* 73 */                        cArr[i9 + 1] = (char) ((bArr2[2] << 8) | (bArr2[3] & 255));
/* 88 */                        cArr[i9 + 2] = (char) ((bArr2[4] << 8) | (bArr2[5] & 255));
/* 102 */                       cArr[i9 + 3] = (char) ((bArr2[6] << 8) | (bArr2[7] & 255));
/* 104 */                       i9 += 4;
                                i7 -= 8;
                            }
/* 115 */                   if (i7 > 0) {
/* 121 */                       if (lOOllo00lO.I00000oOI(iiIiIOo, bArr2, 0, i7) != i7) {
/* 148 */                           throw new EOFException("EOF encountered in middle of BMPString");
                                }
/* 140 */                       do {
/* 123 */                           int i10 = i3 + 1;
/* 127 */                           int i11 = bArr2[i3] << 8;
/* 128 */                           i3 += 2;
/* 137 */                           cArr[i9] = (char) ((bArr2[i10] & 255) | i11);
/* 133 */                           i9++;
/* 140 */                       } while (i3 < i7);
                            }
/* 151 */                   if (iiIiIOo.I00iio != 0 || i8 != i9) {
/* 166 */                       IOOlIIilOl0.I000iOII();
/* 7 */                         return null;
                            }
/* 157 */                   Ii0o01o0i1l ii0o01o0i1l = new Ii0o01o0i1l();
/* 160 */                   ii0o01o0i1l.I00iOIl = cArr;
/* 162 */                   VarHandle.storeStoreFence();
/* 165 */                   return ii0o01o0i1l;
                    }
                }

                public static byte[] I000II(IiIiIOo iiIiIOo, byte[][] bArr) throws IOException {
/* 1 */             int i = iiIiIOo.I00iio;
/* 4 */             if (i >= bArr.length) {
/* 6 */                 return iiIiIOo.I0000Il00O();
                    }
/* 11 */            byte[] bArr2 = bArr[i];
/* 13 */            if (bArr2 == null) {
/* 15 */                bArr2 = new byte[i];
/* 17 */                bArr[i] = bArr2;
                    }
/* 21 */            if (i != bArr2.length) {
/* 87 */                I000II.I000iOII("buffer length not right for data");
/* 20 */                return null;
                    }
/* 23 */            if (i == 0) {
/* 25 */                return bArr2;
                    }
/* 26 */            int i2 = iiIiIOo.I00iiI;
/* 28 */            if (i >= i2) {
/* 84 */                throw new IOException("corrupted stream - out of bounds length found: " + iiIiIOo.I00iio + " >= " + i2);
                    }
/* 38 */            int iI00000oOI = i - lOOllo00lO.I00000oOI(iiIiIOo.I00iOIl, bArr2, 0, bArr2.length);
/* 39 */            iiIiIOo.I00iio = iI00000oOI;
/* 41 */            if (iI00000oOI == 0) {
/* 43 */                iiIiIOo.I00000oIO();
/* 46 */                return bArr2;
                    }
/* 51 */            I000II.I0001Ioi1lo(iiIiIOo.I00iiO, iiIiIOo.I00iio);
/* 20 */            return null;
                }

                public static int I000O01llI0(InputStream inputStream, int i, boolean z) {
                    String strI000l1;
/* 1 */             int i2 = inputStream.read();
/* 7 */             if ((i2 >>> 7) == 0) {
/* 9 */                 return i2;
                    }
/* 12 */            if (128 == i2) {
/* 14 */                return -1;
                    }
/* 16 */            if (i2 < 0) {
/* 215 */               throw new EOFException("EOF found when length expected");
                    }
/* 21 */            if (255 != i2) {
/* 23 */                int i3 = i2 & 127;
/* 25 */                int i4 = 0;
/* 26 */                int i5 = 0;
                        while (true) {
/* 27 */                    int i6 = inputStream.read();
/* 31 */                    if (i6 < 0) {
/* 72 */                        throw new EOFException("EOF found reading length");
                            }
/* 35 */                    if ((i4 >>> 23) != 0) {
/* 62 */                        strI000l1 = "long form definite-length more than 31 bits";
                                break;
                            }
/* 39 */                    i4 = (i4 << 8) + i6;
/* 40 */                    i5++;
/* 42 */                    if (i5 >= i3) {
/* 44 */                        if (i4 < i || z) {
/* 61 */                            return i4;
                                }
/* 53 */                        strI000l1 = IIl001iO0Io.I000l1(i4, i, "corrupted stream - out of bounds length found: ", " >= ");
                            }
                        }
                    } else {
/* 73 */                strI000l1 = "invalid long form definite-length 0xFF";
                    }
/* 57 */            IioIoO10iOiI.I000OOo1O(strI000l1);
/* 20 */            return 0;
                }

                public static int I00100l0(InputStream inputStream, int i) {
                    String str;
/* 3 */             int i2 = i & 31;
/* 4 */             if (i2 != 31) {
/* 89 */                return i2;
                    }
/* 6 */             int i3 = inputStream.read();
/* 13 */            if (i3 >= 31) {
/* 29 */                int i4 = i3 & 127;
/* 31 */                if (i4 != 0) {
/* 35 */                    while ((i3 & Barcode.FORMAT_ITF) != 0) {
/* 39 */                        if ((i4 >>> 24) == 0) {
/* 41 */                            int i5 = i4 << 7;
/* 43 */                            int i6 = inputStream.read();
/* 47 */                            if (i6 < 0) {
/* 61 */                                throw new EOFException("EOF found inside tag value.");
                                    }
/* 51 */                            i4 = i5 | (i6 & 127);
/* 54 */                            i3 = i6;
                                } else {
/* 62 */                            str = "Tag number more than 31 bits";
                                }
                            }
/* 65 */                    return i4;
                        }
/* 66 */                str = "corrupted stream - invalid high tag number found";
                    } else {
/* 15 */                if (i3 < 0) {
/* 28 */                    throw new EOFException("EOF found inside tag value.");
                        }
/* 17 */                str = "corrupted stream - high tag number < 31 found";
                    }
/* 19 */            IioIoO10iOiI.I000OOo1O(str);
/* 10 */            return 0;
                }

                public final I00OIO1 I00000oIO(int i, int i2, int i3) throws IOException {
/* 5 */             IiIiIOo iiIiIOo = new IiIiIOo(this, i3, this.I00iOIl);
/* 10 */            if ((i & 224) == 0) {
/* 14 */                return I0000Il00O(i2, iiIiIOo, this.I00iiO);
                    }
/* 19 */            int i4 = i & 192;
/* 21 */            int i5 = 4;
/* 22 */            if (i4 != 0) {
/* 26 */                if ((i & 32) != 0) {
/* 32 */                    return I00Ol1ll1.I001i1O0Ol(i4, i2, I001i1lo1io(iiIiIOo));
                        }
/* 50 */                I1lliI1o0l i1lliI1o0l = new I1lliI1o0l(i5, i4, i2, new Ii0oii1lIil(iiIiIOo.I0000Il00O()), 2);
                        return i4 != 64 ? i1lliI1o0l : new Ii1011OI(i1lliI1o0l);
                    }
/* 67 */            int i6 = 0;
/* 68 */            if (i2 == 3) {
/* 197 */               I00IOO i00iooI001i1lo1io = I001i1lo1io(iiIiIOo);
/* 201 */               int i7 = i00iooI001i1lo1io.I00000oOI;
/* 203 */               I001lloI[] i001lloIArr = new I001lloI[i7];
/* 205 */               while (i6 != i7) {
/* 207 */                   I00IO1oi11O i00IO1oi11OI0000oI00 = i00iooI001i1lo1io.I0000oI00(i6);
/* 213 */                   if (!(i00IO1oi11OI0000oI00 instanceof I001lloI)) {
/* 228 */                       I000II.I000l1("unknown object encountered in constructed BIT STRING: ", i00IO1oi11OI0000oI00.getClass());
/* 66 */                        return null;
                            }
/* 217 */                   i001lloIArr[i6] = (I001lloI) i00IO1oi11OI0000oI00;
/* 219 */                   i6++;
                        }
/* 234 */               return new I1lioO11Il(i001lloIArr);
                    }
/* 70 */            if (i2 == 4) {
/* 152 */               I00IOO i00iooI001i1lo1io2 = I001i1lo1io(iiIiIOo);
/* 156 */               int i8 = i00iooI001i1lo1io2.I00000oOI;
/* 158 */               I00O0o1oo[] i00O0o1ooArr = new I00O0o1oo[i8];
/* 160 */               while (i6 != i8) {
/* 162 */                   I00IO1oi11O i00IO1oi11OI0000oI002 = i00iooI001i1lo1io2.I0000oI00(i6);
/* 168 */                   if (!(i00IO1oi11OI0000oI002 instanceof I00O0o1oo)) {
/* 183 */                       I000II.I000l1("unknown object encountered in constructed OCTET STRING: ", i00IO1oi11OI0000oI002.getClass());
/* 66 */                        return null;
                            }
/* 172 */                   i00O0o1ooArr[i6] = (I00O0o1oo) i00IO1oi11OI0000oI002;
/* 174 */                   i6++;
                        }
/* 193 */               return new I1ll1ioil(I1ll1ioil.I001iOo1i0O(i00O0o1ooArr), i00O0o1ooArr);
                    }
/* 74 */            if (i2 == 8) {
/* 148 */               return new Ii0o0o0O00IO(Ii10I0Ii.I00000oIO(I001i1lo1io(iiIiIOo)));
                    }
/* 78 */            if (i2 != 16) {
/* 82 */                if (i2 == 17) {
/* 88 */                    return Ii10I0Ii.I00000oOI(I001i1lo1io(iiIiIOo));
                        }
/* 101 */               IioIoO10iOiI.I000OOo1O(IIlIOloOOO.I00100l0("unknown tag ", i2, " encountered"));
/* 66 */                return null;
                    }
/* 108 */           if (iiIiIOo.I00iio < 1) {
/* 110 */               return Ii10I0Ii.I00000oIO;
                    }
/* 115 */           if (!this.I00iiI) {
/* 133 */               return Ii10I0Ii.I00000oIO(I001i1lo1io(iiIiIOo));
                    }
/* 119 */           byte[] bArrI0000Il00O = iiIiIOo.I0000Il00O();
/* 123 */           O0iol1I1Ol o0iol1I1Ol = new O0iol1I1Ol();
/* 126 */           o0iol1I1Ol.I00iiO = bArrI0000Il00O;
/* 128 */           return o0iol1I1Ol;
                }

                public final I00OIO1 I000l1() {
/* 1 */             int i = read();
/* 6 */             if (i <= 0) {
/* 8 */                 if (i != 0) {
/* 5 */                     return null;
                        }
/* 13 */                IioIoO10iOiI.I000OOo1O("unexpected end-of-contents marker");
/* 5 */                 return null;
                    }
/* 17 */            int iI00100l0 = I00100l0(this, i);
/* 21 */            int i2 = this.I00iOIl;
/* 24 */            int iI000O01llI0 = I000O01llI0(this, i2, false);
/* 28 */            if (iI000O01llI0 >= 0) {
                        try {
/* 30 */                    return I00000oIO(i, iI00100l0, iI000O01llI0);
                        } catch (IllegalArgumentException e) {
/* 43 */                    throw new I00IlilI0i0i("corrupted stream detected", e, 0);
                        }
                    }
/* 46 */            if ((i & 32) == 0) {
/* 130 */               IioIoO10iOiI.I000OOo1O("indefinite-length primitive encoding encountered");
/* 5 */                 return null;
                    }
/* 57 */            I00Ol00 i00Ol00 = new I00Ol00(new Iol0Il(this, i2), i2, this.I00iiO);
/* 60 */            int i3 = i & 192;
/* 62 */            if (i3 != 0) {
/* 64 */                return i00Ol00.I000oI1ioi(i3, iI00100l0);
                    }
/* 70 */            if (iI00100l0 == 3) {
/* 123 */               return I1lioiiOooli.I00000oIO(i00Ol00);
                    }
/* 73 */            if (iI00100l0 == 4) {
/* 118 */               return I1ll1oI.I00000oIO(i00Ol00);
                    }
/* 77 */            if (iI00100l0 == 8) {
/* 113 */               return I1llOOI.I00000oIO(i00Ol00);
                    }
/* 81 */            if (iI00100l0 == 16) {
/* 109 */               return new I1llI1Iil(i00Ol00.I001IO000());
                    }
/* 85 */            if (iI00100l0 == 17) {
/* 93 */                return new I1lli01ioi(i00Ol00.I001IO000());
                    }
/* 99 */            IioIoO10iOiI.I000OOo1O("unknown BER object encountered");
/* 5 */             return null;
                }

                public final I00IOO I001i1lo1io(IiIiIOo iiIiIOo) {
/* 1 */             int i = iiIiIOo.I00iio;
/* 5 */             if (i < 1) {
/* 9 */                 return new I00IOO(0);
                    }
/* 19 */            I00Io1o110i i00Io1o110i = new I00Io1o110i(iiIiIOo, i, this.I00iiI, this.I00iiO);
/* 22 */            I00OIO1 i00oio1I000l1 = i00Io1o110i.I000l1();
/* 26 */            if (i00oio1I000l1 == null) {
/* 30 */                return new I00IOO(0);
                    }
/* 36 */            I00IOO i00ioo = new I00IOO(0, false);
/* 46 */            do {
/* 39 */                i00ioo.I0000O(i00oio1I000l1);
/* 42 */                i00oio1I000l1 = i00Io1o110i.I000l1();
/* 46 */            } while (i00oio1I000l1 != null);
/* 49 */            return i00ioo;
                }

/* 11 */        public I00Io1o110i(ByteArrayInputStream byteArrayInputStream, int i, boolean z) {
/* 12 */            this(byteArrayInputStream, i, z, new byte[11][]);
                }

/* 12 */        public I00Io1o110i(InputStream inputStream, int i, boolean z, byte[][] bArr) {
/* 13 */            super(inputStream);
                    this.I00iOIl = i;
                    this.I00iiI = z;
                    this.I00iiO = bArr;
                }

/* 13 */        public I00Io1o110i(byte[] bArr) {
/* 14 */            this(new ByteArrayInputStream(bArr), bArr.length, false);
                }
            }
