            package p000;

            import java.util.Arrays;
            
            public final class Ii10000i extends I00OIO1 implements I00Ol10 {
                public static final char[] I00iiI = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                public byte[] I00iOIl;

                public static void I001i1O0Ol(StringBuffer stringBuffer, int i) {
/* 5 */             char[] cArr = I00iiI;
/* 9 */             stringBuffer.append(cArr[(i >>> 4) & 15]);
/* 16 */            stringBuffer.append(cArr[i & 15]);
                }

                @Override
                public final String I0000oI00() {
                    int i;
/* 1 */             byte[] bArr = this.I00iOIl;
/* 3 */             int length = bArr.length;
/* 15 */            StringBuffer stringBuffer = new StringBuffer(((O1OIll00i.I00O0o1oo(length) + length) * 2) + 3);
/* 20 */            stringBuffer.append("#1C");
/* 25 */            if (length < 128) {
/* 27 */                I001i1O0Ol(stringBuffer, length);
                    } else {
/* 32 */                byte[] bArr2 = new byte[5];
/* 34 */                int i2 = length;
/* 35 */                int i3 = 5;
                        while (true) {
                            i = i3 - 1;
/* 39 */                    bArr2[i] = (byte) i2;
/* 41 */                    i2 >>>= 8;
/* 43 */                    if (i2 == 0) {
                                break;
                            }
/* 80 */                    i3 = i;
                        }
                        int i4 = i3 - 2;
/* 51 */                bArr2[i4] = (byte) (128 | (5 - i));
                        while (true) {
/* 53 */                    int i5 = i4 + 1;
/* 57 */                    I001i1O0Ol(stringBuffer, bArr2[i4]);
/* 60 */                    if (i5 >= 5) {
                                break;
                            }
/* 78 */                    i4 = i5;
                        }
                    }
/* 63 */            for (byte b : bArr) {
/* 67 */                I001i1O0Ol(stringBuffer, b);
                    }
/* 73 */            return stringBuffer.toString();
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 3 */             if (i00oio1 instanceof Ii10000i) {
/* 13 */                return Arrays.equals(this.I00iOIl, ((Ii10000i) i00oio1).I00iOIl);
                    }
/* 5 */             return false;
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) {
/* 5 */             o1OIll00i.I00Ol10(28, z, this.I00iOIl);
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return false;
                }

                @Override
                public final int I0010I0i(boolean z) {
/* 4 */             return O1OIll00i.I00O10llo(this.I00iOIl.length, z);
                }

                @Override
                public final int hashCode() {
/* 3 */             return iOO1iOiOl.I00000oOI(this.I00iOIl);
                }

                public final String toString() {
/* 1 */             return I0000oI00();
                }
            }
