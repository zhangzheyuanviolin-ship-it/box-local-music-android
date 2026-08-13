            package p000;

            import java.io.ByteArrayOutputStream;
            import java.lang.invoke.VarHandle;
            import java.math.BigInteger;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class I00O0i0ii extends I00OIO1 {
                public static final ConcurrentHashMap I00iiO;
                public String I00iOIl;
                public byte[] I00iiI;

                static {
/* 6 */             new I001lllioOl(5, I00O0i0ii.class);
/* 14 */            I00iiO = new ConcurrentHashMap();
                }

                public I00O0i0ii(String str) {
                    char cCharAt;
/* 9 */             boolean zI001iOo1i0O = false;
/* 10 */            if (str.length() >= 3 && str.charAt(1) == '.' && (cCharAt = str.charAt(0)) >= '0' && cCharAt <= '2') {
/* 36 */                zI001iOo1i0O = I00OIl.I001iOo1i0O(2, str);
                    }
/* 40 */            if (zI001iOo1i0O) {
/* 42 */                this.I00iOIl = str;
                    } else {
/* 53 */                I000II.I000iOII(IlIi0I0.I000lI("string ", str, " not an OID"));
/* 186 */               throw null;
                    }
                }

                public static I00O0i0ii I001iOo1i0O(byte[] bArr, boolean z) {
                    boolean z2;
/* 1 */             byte[] bArrI00000oIO = bArr;
/* 14 */            I00O0i0ii i00O0i0ii = (I00O0i0ii) I00iiO.get(new I00Iooi00oi(bArrI00000oIO));
/* 16 */            if (i00O0i0ii == null) {
/* 20 */                i00O0i0ii = new I00O0i0ii();
/* 25 */                StringBuffer stringBuffer = new StringBuffer();
/* 28 */                boolean z3 = true;
/* 31 */                long j = 0;
/* 33 */                BigInteger bigIntegerShiftLeft = null;
/* 35 */                for (int i = 0; i != bArrI00000oIO.length; i++) {
/* 37 */                    byte b = bArrI00000oIO[i];
/* 53 */                    if (j <= 72057594037927808L) {
/* 57 */                        z2 = z3;
/* 60 */                        long j2 = j + (b & Byte.MAX_VALUE);
/* 63 */                        if ((b & 128) == 0) {
/* 65 */                            if (z2) {
/* 71 */                                if (j2 < 40) {
/* 75 */                                    stringBuffer.append('0');
                                        } else if (j2 < 80) {
/* 85 */                                    stringBuffer.append('1');
/* 88 */                                    j2 -= 40;
                                        } else {
/* 90 */                                    stringBuffer.append('2');
/* 93 */                                    j2 -= 80;
                                        }
/* 95 */                                z3 = false;
                                    } else {
/* 97 */                                z3 = z2;
                                    }
/* 99 */                            stringBuffer.append('.');
/* 102 */                           stringBuffer.append(j2);
/* 105 */                           j = 0;
                                } else {
/* 108 */                           j = j2 << 7;
/* 109 */                           z3 = z2;
                                }
                            } else {
/* 112 */                       z2 = z3;
/* 114 */                       if (bigIntegerShiftLeft == null) {
/* 116 */                           bigIntegerShiftLeft = BigInteger.valueOf(j);
                                }
/* 127 */                       BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b & Byte.MAX_VALUE));
/* 133 */                       if ((b & 128) == 0) {
/* 135 */                           if (z2) {
/* 137 */                               stringBuffer.append('2');
/* 144 */                               bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
/* 148 */                               z3 = false;
                                    } else {
/* 150 */                               z3 = z2;
                                    }
/* 152 */                           stringBuffer.append('.');
/* 155 */                           stringBuffer.append(bigIntegerOr);
/* 158 */                           j = 0;
/* 160 */                           bigIntegerShiftLeft = null;
                                } else {
/* 162 */                           bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
/* 109 */                           z3 = z2;
                                }
                            }
                        }
/* 175 */               i00O0i0ii.I00iOIl = stringBuffer.toString();
/* 177 */               if (z) {
/* 179 */                   bArrI00000oIO = iOO1iOiOl.I00000oIO(bArrI00000oIO);
                        }
/* 183 */               i00O0i0ii.I00iiI = bArrI00000oIO;
/* 185 */               VarHandle.storeStoreFence();
                    }
/* 551 */           return i00O0i0ii;
                }

                public static I00O0i0ii I001lloI(I00IO1oi11O i00IO1oi11O) {
/* 1 */             if (i00IO1oi11O == null || (i00IO1oi11O instanceof I00O0i0ii)) {
/* 38 */                return (I00O0i0ii) i00IO1oi11O;
                    }
/* 8 */             I00OIO1 i00oio1I0000O = i00IO1oi11O.I0000O();
/* 14 */            if (i00oio1I0000O instanceof I00O0i0ii) {
/* 16 */                return (I00O0i0ii) i00oio1I0000O;
                    }
/* 33 */            I000II.I000iOII("illegal object in getInstance: ".concat(i00IO1oi11O.getClass().getName()));
/* 36 */            return null;
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 1 */             if (i00oio1 == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (i00oio1 instanceof I00O0i0ii) {
/* 17 */                return this.I00iOIl.equals(((I00O0i0ii) i00oio1).I00iOIl);
                    }
/* 9 */             return false;
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) {
/* 6 */             o1OIll00i.I00Ol10(6, z, I001lllioOl());
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return false;
                }

                @Override
                public final int I0010I0i(boolean z) {
/* 6 */             return O1OIll00i.I00O10llo(I001lllioOl().length, z);
                }

                public final I00O0i0ii I001i1O0Ol(String str) {
/* 3 */             I00O0i0ii i00O0i0ii = new I00O0i0ii();
/* 11 */            if (I00OIl.I001iOo1i0O(0, str)) {
/* 26 */                i00O0i0ii.I00iOIl = IIlIOloOOO.I0010I0i(new StringBuilder(), this.I00iOIl, ".", str);
/* 28 */                return i00O0i0ii;
                    }
/* 37 */            I000II.I000iOII(IlIi0I0.I000lI("string ", str, " not a valid OID branch"));
/* 40 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0079 -> B:16:0x0044). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I001lIiIIo1O(ByteArrayOutputStream byteArrayOutputStream) throws NumberFormatException {
                    String strSubstring;
                    int i;
                    String strSubstring2;
                    int i2;
                    String strSubstring3;
/* 1 */             String str = this.I00iOIl;
/* 6 */             int iIndexOf = str.indexOf(46, 0);
/* 11 */            if (iIndexOf == -1) {
/* 13 */                strSubstring = str.substring(0);
/* 17 */                i = -1;
                    } else {
/* 19 */                strSubstring = str.substring(0, iIndexOf);
/* 23 */                i = iIndexOf + 1;
                    }
/* 29 */            int i3 = Integer.parseInt(strSubstring) * 40;
/* 32 */            if (i == -1) {
/* 34 */                i2 = i;
/* 35 */                strSubstring2 = null;
                    } else {
/* 37 */                int iIndexOf2 = str.indexOf(46, i);
/* 41 */                if (iIndexOf2 == -1) {
/* 43 */                    strSubstring2 = str.substring(i);
/* 47 */                    i2 = -1;
                        } else {
/* 49 */                    strSubstring2 = str.substring(i, iIndexOf2);
/* 53 */                    i2 = iIndexOf2 + 1;
                        }
                    }
/* 61 */            if (strSubstring2.length() > 18) {
/* 87 */                I00OIl.I001lllioOl(byteArrayOutputStream, new BigInteger(strSubstring2).add(BigInteger.valueOf(i3)));
/* 90 */                while (i2 != -1) {
                        }
                    }
/* 68 */            long j = Long.parseLong(strSubstring2) + i3;
/* 69 */            I00OIl.I001lIiIIo1O(byteArrayOutputStream, j);
/* 90 */            while (i2 != -1) {
/* 92 */                if (i2 != -1) {
/* 96 */                    int iIndexOf3 = str.indexOf(46, i2);
/* 100 */                   if (iIndexOf3 == -1) {
/* 102 */                       strSubstring3 = str.substring(i2);
/* 106 */                       i2 = -1;
                            } else {
/* 108 */                       String strSubstring4 = str.substring(i2, iIndexOf3);
/* 112 */                       i2 = iIndexOf3 + 1;
/* 115 */                       strSubstring3 = strSubstring4;
                            }
                        } else {
/* 94 */                    strSubstring3 = null;
                        }
/* 120 */               if (strSubstring3.length() <= 18) {
/* 122 */                   j = Long.parseLong(strSubstring3);
/* 69 */                    I00OIl.I001lIiIIo1O(byteArrayOutputStream, j);
/* 90 */                    while (i2 != -1) {
                            }
                        } else {
/* 132 */                   I00OIl.I001lllioOl(byteArrayOutputStream, new BigInteger(strSubstring3));
                        }
                    }
                }

                public final synchronized byte[] I001lllioOl() {
                    byte[] byteArray;
/* 2 */             byteArray = this.I00iiI;
/* 4 */             if (byteArray == null) {
/* 8 */                 ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 11 */                I001lIiIIo1O(byteArrayOutputStream);
/* 14 */                byteArray = byteArrayOutputStream.toByteArray();
/* 18 */                this.I00iiI = byteArray;
                    }
/* 24 */            return byteArray;
                }

                public final I00O0i0ii I00II0Ol1O0l() {
/* 7 */             I00Iooi00oi i00Iooi00oi = new I00Iooi00oi(I001lllioOl());
/* 10 */            ConcurrentHashMap concurrentHashMap = I00iiO;
/* 16 */            I00O0i0ii i00O0i0ii = (I00O0i0ii) concurrentHashMap.get(i00Iooi00oi);
/* 18 */            if (i00O0i0ii != null) {
/* 113 */               return i00O0i0ii;
                    }
/* 24 */            I00O0i0ii i00O0i0ii2 = (I00O0i0ii) concurrentHashMap.putIfAbsent(i00Iooi00oi, this);
                    return i00O0i0ii2 == null ? this : i00O0i0ii2;
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                public final String toString() {
/* 1 */             return this.I00iOIl;
                }
            }
