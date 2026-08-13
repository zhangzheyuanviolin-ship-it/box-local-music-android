            package p000;

            import java.io.IOException;
            import java.util.Arrays;
            
            public final class Ii0o01o0i1l extends I00OIO1 implements I00Ol10 {
                public char[] I00iOIl;

                @Override
                public final String I0000oI00() {
/* 5 */             return new String(this.I00iOIl);
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 3 */             if (i00oio1 instanceof Ii0o01o0i1l) {
/* 13 */                return Arrays.equals(this.I00iOIl, ((Ii0o01o0i1l) i00oio1).I00iOIl);
                    }
/* 5 */             return false;
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) throws IOException {
/* 1 */             char[] cArr = this.I00iOIl;
/* 3 */             int length = cArr.length;
/* 6 */             o1OIll00i.I00i01iIIliI(30, z);
/* 11 */            o1OIll00i.I00Oio(length * 2);
/* 16 */            byte[] bArr = new byte[8];
/* 18 */            int i = length & (-4);
/* 21 */            int i2 = 0;
/* 24 */            while (i2 < i) {
/* 26 */                char c = cArr[i2];
/* 30 */                char c2 = cArr[i2 + 1];
/* 34 */                char c3 = cArr[i2 + 2];
/* 38 */                char c4 = cArr[i2 + 3];
/* 40 */                i2 += 4;
/* 45 */                bArr[0] = (byte) (c >> '\b');
/* 48 */                bArr[1] = (byte) c;
/* 53 */                bArr[2] = (byte) (c2 >> '\b');
/* 57 */                bArr[3] = (byte) c2;
/* 63 */                bArr[4] = (byte) (c3 >> '\b');
/* 67 */                bArr[5] = (byte) c3;
/* 73 */                bArr[6] = (byte) (c4 >> '\b');
/* 77 */                bArr[7] = (byte) c4;
/* 79 */                o1OIll00i.I00OilO00Il(bArr, 0, 8);
                    }
/* 83 */            if (i2 < length) {
/* 85 */                int i3 = 0;
/* 100 */               do {
/* 86 */                    char c5 = cArr[i2];
/* 88 */                    i2++;
/* 89 */                    int i4 = i3 + 1;
/* 94 */                    bArr[i3] = (byte) (c5 >> '\b');
/* 96 */                    i3 += 2;
/* 98 */                    bArr[i4] = (byte) c5;
/* 100 */               } while (i2 < length);
/* 102 */               o1OIll00i.I00OilO00Il(bArr, 0, i3);
                    }
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return false;
                }

                @Override
                public final int I0010I0i(boolean z) {
/* 6 */             return O1OIll00i.I00O10llo(this.I00iOIl.length * 2, z);
                }

                @Override
                public final int hashCode() {
/* 1 */             char[] cArr = this.I00iOIl;
/* 3 */             if (cArr == null) {
/* 5 */                 return 0;
                    }
/* 7 */             int length = cArr.length;
/* 8 */             int i = length + 1;
                    while (true) {
                        length--;
/* 12 */                if (length < 0) {
/* 29 */                    return i;
                        }
/* 18 */                i = (i * 257) ^ cArr[length];
                    }
                }

                public final String toString() {
/* 1 */             return I0000oI00();
                }
            }
