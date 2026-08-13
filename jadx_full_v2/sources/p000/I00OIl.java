            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayOutputStream;
            import java.math.BigInteger;
            
            public final class I00OIl extends I00OIO1 {
                public String I00iOIl;
                public byte[] I00iiI;

                public static boolean I001iOo1i0O(int i, String str) {
/* 1 */             int length = str.length();
/* 6 */             int i2 = 0;
                    while (true) {
                        int i3 = length - 1;
/* 12 */                if (i3 < i) {
/* 45 */                    if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                                break;
                            }
/* 11 */                    return true;
                        }
/* 14 */                char cCharAt = str.charAt(i3);
/* 20 */                if (cCharAt == '.') {
/* 22 */                    if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                                break;
                            }
/* 33 */                    i2 = 0;
/* 43 */                    length = i3;
                        } else {
/* 35 */                    if ('0' > cCharAt || cCharAt > '9') {
                                break;
                            }
/* 41 */                    i2++;
/* 43 */                    length = i3;
                        }
                    }
/* 5 */             return false;
                }

                public static void I001lIiIIo1O(ByteArrayOutputStream byteArrayOutputStream, long j) {
/* 3 */             byte[] bArr = new byte[9];
/* 9 */             int i = 8;
/* 11 */            bArr[8] = (byte) (((int) j) & 127);
/* 17 */            while (j >= 128) {
/* 20 */                j >>= 7;
                        i--;
/* 27 */                bArr[i] = (byte) (((int) j) | Barcode.FORMAT_ITF);
                    }
/* 32 */            byteArrayOutputStream.write(bArr, i, 9 - i);
                }

                public static void I001lllioOl(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
/* 8 */             int iBitLength = (bigInteger.bitLength() + 6) / 7;
/* 10 */            if (iBitLength == 0) {
/* 12 */                byteArrayOutputStream.write(0);
/* 15 */                return;
                    }
/* 16 */            byte[] bArr = new byte[iBitLength];
                    int i = iBitLength - 1;
/* 21 */            for (int i2 = i; i2 >= 0; i2--) {
/* 30 */                bArr[i2] = (byte) (bigInteger.intValue() | Barcode.FORMAT_ITF);
/* 32 */                bigInteger = bigInteger.shiftRight(7);
                    }
/* 44 */            bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
/* 46 */            byteArrayOutputStream.write(bArr, 0, iBitLength);
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 1 */             if (this == i00oio1) {
/* 3 */                 return true;
                    }
/* 7 */             if (i00oio1 instanceof I00OIl) {
/* 17 */                return this.I00iOIl.equals(((I00OIl) i00oio1).I00iOIl);
                    }
/* 9 */             return false;
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) {
/* 7 */             o1OIll00i.I00Ol10(13, z, I001i1O0Ol());
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return false;
                }

                @Override
                public final int I0010I0i(boolean z) {
/* 6 */             return O1OIll00i.I00O10llo(I001i1O0Ol().length, z);
                }

                public final synchronized byte[] I001i1O0Ol() {
                    byte[] byteArray;
                    String strSubstring;
/* 2 */             byteArray = this.I00iiI;
/* 4 */             if (byteArray == null) {
/* 8 */                 ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 11 */                String str = this.I00iOIl;
/* 13 */                int i = 0;
/* 15 */                while (i != -1) {
/* 17 */                    if (i == -1) {
/* 19 */                        strSubstring = null;
                            } else {
/* 23 */                        int iIndexOf = str.indexOf(46, i);
/* 27 */                        if (iIndexOf == -1) {
/* 29 */                            strSubstring = str.substring(i);
/* 35 */                            i = -1;
                                } else {
/* 37 */                            strSubstring = str.substring(i, iIndexOf);
/* 41 */                            i = iIndexOf + 1;
                                }
                            }
/* 50 */                    if (strSubstring.length() <= 18) {
/* 56 */                        I001lIiIIo1O(byteArrayOutputStream, Long.parseLong(strSubstring));
                            } else {
/* 65 */                        I001lllioOl(byteArrayOutputStream, new BigInteger(strSubstring));
                            }
                        }
/* 69 */                byteArray = byteArrayOutputStream.toByteArray();
/* 73 */                this.I00iiI = byteArray;
                    }
/* 79 */            return byteArray;
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                public final String toString() {
/* 1 */             return this.I00iOIl;
                }
            }
