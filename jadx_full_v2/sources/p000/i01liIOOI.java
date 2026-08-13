            package p000;

            import java.io.IOException;
            import java.math.BigInteger;
            import java.util.Arrays;
            
            public final class i01liIOOI implements OiioOoliI {
                public final byte[] I00iOIl;
                public final i01lOO0li I00iiI;
                public final BigInteger I00iiO;

                public i01liIOOI(i01lOO0li i01loo0li, BigInteger bigInteger, byte[] bArr) {
/* 4 */             this.I00iiI = i01loo0li;
/* 6 */             this.I00iiO = bigInteger;
/* 8 */             this.I00iOIl = bArr;
                }

                @Override
                public final boolean I00Io1lO(Object obj) {
/* 1 */             boolean z = obj instanceof i01li0iOiO;
/* 4 */             byte[] bArr = this.I00iOIl;
/* 6 */             if (z) {
/* 8 */                 i01li0iOiO i01li0ioio = (i01li0iOiO) obj;
/* 11 */                BigInteger bigInteger = this.I00iiO;
/* 13 */                if (bigInteger != null) {
/* 17 */                    OlliI1olI olliI1olI = i01li0ioio.I00iOIl.I00iiI;
/* 19 */                    i01lOO0li i01loo0li = olliI1olI.I00ilI0I1;
/* 21 */                    I00IoIO0lI i00IoIO0lI = olliI1olI.I00iiO;
/* 29 */                    if (i01loo0li.equals(this.I00iiI)) {
/* 43 */                        if (I00IoIO0lI.I001lIiIIo1O(i00IoIO0lI.I00iiI, i00IoIO0lI.I00iOIl) == bigInteger.intValue() && new BigInteger(i00IoIO0lI.I00iOIl).equals(bigInteger)) {
/* 10 */                            return true;
                                }
                            }
                        } else if (bArr != null) {
/* 61 */                    I00O0i0ii i00O0i0ii = Il1l1ooI.I00iio;
/* 63 */                    Il1oi01OOI1 il1oi01OOI1 = i01li0ioio.I00iiI;
/* 76 */                    Il1l1ooI il1l1ooI = il1oi01OOI1 != null ? (Il1l1ooI) il1oi01OOI1.I00iOIl.get(i00O0i0ii) : null;
/* 77 */                    if (il1l1ooI != null) {
                                try {
/* 259 */                           return Arrays.equals(bArr, I00O0o1oo.I001i1O0Ol(I00OIO1.I00111O(il1l1ooI.I00iiO.I00iOIl)).I00iOIl);
                                } catch (IOException e) {
/* 267 */                           IioIoO10iOiI.I000OiO("can't convert extension: ", e);
/* 3 */                             return false;
                                }
                            }
/* 83 */                    OliI1l0l oliI1l0l = i01li0ioio.I00iOIl.I00iiI.I00l0I0l0lO1;
/* 87 */                    O1Il11 o1Il11 = new O1Il11();
/* 93 */                    o1Il11.I00000oIO = new byte[4];
/* 95 */                    o1Il11.I00000oOI = 0;
/* 101 */                   o1Il11.I000OOo1O = new int[80];
/* 103 */                   o1Il11.I0000Il00O();
/* 108 */                   byte[] bArr2 = new byte[20];
                            try {
/* 110 */                       byte[] bArrI000lI = oliI1l0l.I000lI();
/* 114 */                       int length = bArrI000lI.length;
/* 115 */                       int i = 0;
/* 118 */                       while (o1Il11.I00000oOI != 0 && length > 0) {
/* 124 */                           o1Il11.I0000O(bArrI000lI[i]);
/* 127 */                           i++;
                                    length--;
                                }
/* 132 */                       while (length > 4) {
/* 134 */                           o1Il11.I00000oOI(i, bArrI000lI);
/* 137 */                           i += 4;
                                    length -= 4;
                                    o1Il11.I0000Il00O += 4;
                                }
/* 149 */                       while (length > 0) {
/* 153 */                           o1Il11.I0000O(bArrI000lI[i]);
/* 156 */                           i++;
                                    length--;
                                }
/* 163 */                       long j = o1Il11.I0000Il00O << 3;
/* 166 */                       o1Il11.I0000O(Byte.MIN_VALUE);
/* 171 */                       while (o1Il11.I00000oOI != 0) {
/* 173 */                           o1Il11.I0000O((byte) 0);
                                }
/* 181 */                       if (o1Il11.I000OiO > 14) {
/* 183 */                           o1Il11.I00000oIO();
                                }
/* 186 */                       int[] iArr = o1Il11.I000OOo1O;
/* 193 */                       iArr[14] = (int) (j >>> 32);
/* 198 */                       iArr[15] = (int) j;
/* 200 */                       o1Il11.I00000oIO();
/* 205 */                       l1llool.I00000oIO(bArr2, o1Il11.I0000O, 0);
/* 210 */                       l1llool.I00000oIO(bArr2, o1Il11.I0000oI00, 4);
/* 217 */                       l1llool.I00000oIO(bArr2, o1Il11.I0001Ioi1lo, 8);
/* 224 */                       l1llool.I00000oIO(bArr2, o1Il11.I000II, 12);
/* 231 */                       l1llool.I00000oIO(bArr2, o1Il11.I000O01llI0, 16);
/* 234 */                       o1Il11.I0000Il00O();
                            } catch (IOException unused) {
/* 238 */                       bArr2 = new byte[0];
                            }
/* 240 */                   return Arrays.equals(bArr, bArr2);
                        }
                    } else if (obj instanceof byte[]) {
/* 277 */               return Arrays.equals(bArr, (byte[]) obj);
                    }
/* 3 */             return false;
                }

                public final Object clone() {
/* 9 */             return new i01liIOOI(this.I00iiI, this.I00iiO, this.I00iOIl);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof i01liIOOI) {
/* 7 */                 i01liIOOI i01liiooi = (i01liIOOI) obj;
/* 17 */                if (Arrays.equals(this.I00iOIl, i01liiooi.I00iOIl)) {
/* 19 */                    BigInteger bigInteger = i01liiooi.I00iiO;
/* 22 */                    BigInteger bigInteger2 = this.I00iiO;
/* 36 */                    if (bigInteger2 != null ? bigInteger2.equals(bigInteger) : bigInteger == null) {
/* 38 */                        i01lOO0li i01loo0li = i01liiooi.I00iiI;
/* 40 */                        i01lOO0li i01loo0li2 = this.I00iiI;
/* 54 */                        if (i01loo0li2 != null ? i01loo0li2.equals(i01loo0li) : i01loo0li == null) {
/* 21 */                            return true;
                                }
                            }
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 3 */             int iI00000oOI = iOO1iOiOl.I00000oOI(this.I00iOIl);
/* 7 */             BigInteger bigInteger = this.I00iiO;
/* 9 */             if (bigInteger != null) {
/* 15 */                iI00000oOI ^= bigInteger.hashCode();
                    }
/* 16 */            i01lOO0li i01loo0li = this.I00iiI;
                    return i01loo0li != null ? i01loo0li.hashCode() ^ iI00000oOI : iI00000oOI;
                }
            }
