            package p000;

            import java.util.Arrays;
            
            public final class Ii0ooIiI extends I00OIO1 implements I00Ol10 {
                public byte[] I00iOIl;

                @Override
                public final String I0000oI00() {
/* 1 */             byte[] bArr = this.I00iOIl;
/* 3 */             int i = OlOoIoi11.I00000oIO;
/* 5 */             int length = bArr.length;
/* 6 */             char[] cArr = new char[length];
/* 8 */             short[] sArr = Ooi1lIi1.I00000oIO;
/* 10 */            int length2 = bArr.length;
/* 12 */            int i2 = 0;
/* 13 */            int i3 = 0;
/* 14 */            loop0: while (i2 < length2) {
/* 16 */                int i4 = i2 + 1;
/* 18 */                byte b = bArr[i2];
/* 20 */                if (b < 0) {
/* 37 */                    short s = Ooi1lIi1.I00000oIO[b & Byte.MAX_VALUE];
/* 39 */                    int i5 = s >>> 8;
/* 41 */                    byte b2 = (byte) s;
                            while (true) {
/* 42 */                        if (b2 >= 0) {
/* 45 */                            if (i4 >= bArr.length) {
                                        break loop0;
                                    }
/* 48 */                            int i6 = i4 + 1;
/* 50 */                            byte b3 = bArr[i4];
/* 56 */                            i5 = (i5 << 6) | (b3 & 63);
/* 64 */                            b2 = Ooi1lIi1.I00000oOI[b2 + ((b3 & 255) >>> 4)];
/* 66 */                            i4 = i6;
                                } else if (b2 != -2) {
/* 75 */                            if (i5 <= 65535) {
/* 77 */                                if (i3 < length) {
/* 83 */                                    cArr[i3] = (char) i5;
/* 80 */                                    i3++;
/* 115 */                                   i2 = i4;
                                        }
                                    } else if (i3 < length - 1) {
/* 93 */                                int i7 = i3 + 1;
/* 102 */                               cArr[i3] = (char) ((i5 >>> 10) + 55232);
/* 104 */                               i3 += 2;
/* 113 */                               cArr[i7] = (char) ((i5 & 1023) | 56320);
/* 115 */                               i2 = i4;
                                    }
                                }
                            }
/* 91 */                    i3 = -1;
                            break;
                        }
/* 22 */                if (i3 >= length) {
/* 91 */                    i3 = -1;
                            break;
                        }
/* 28 */                cArr[i3] = (char) b;
/* 30 */                i2 = i4;
/* 25 */                i3++;
                    }
/* 117 */           if (i3 >= 0) {
/* 121 */               return new String(cArr, 0, i3);
                    }
/* 127 */           I000II.I000iOII("Invalid UTF-8 input");
/* 130 */           return null;
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 3 */             if (i00oio1 instanceof Ii0ooIiI) {
/* 13 */                return Arrays.equals(this.I00iOIl, ((Ii0ooIiI) i00oio1).I00iOIl);
                    }
/* 5 */             return false;
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) {
/* 5 */             o1OIll00i.I00Ol10(12, z, this.I00iOIl);
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
