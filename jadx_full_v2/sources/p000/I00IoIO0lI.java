            package p000;

            import java.lang.invoke.VarHandle;
            import java.math.BigInteger;
            import java.util.Arrays;
            
            public final class I00IoIO0lI extends I00OIO1 {
                public static final I001lllioOl I00iiO = new I001lllioOl(4, I00IoIO0lI.class);
                public byte[] I00iOIl;
                public int I00iiI;

                public static I00IoIO0lI I001i1O0Ol(byte[] bArr) {
/* 3 */             I00IoIO0lI i00IoIO0lI = new I00IoIO0lI();
/* 10 */            if (I001lllioOl(bArr)) {
/* 40 */                I000II.I000iOII("malformed integer");
/* 43 */                return null;
                    }
/* 12 */            i00IoIO0lI.I00iOIl = bArr;
                    int length = bArr.length - 1;
/* 17 */            int i = 0;
/* 18 */            while (i < length) {
/* 22 */                int i2 = i + 1;
/* 28 */                if (bArr[i] != (bArr[i2] >> 7)) {
                            break;
                        }
/* 30 */                i = i2;
                    }
/* 32 */            i00IoIO0lI.I00iiI = i;
/* 34 */            VarHandle.storeStoreFence();
/* 37 */            return i00IoIO0lI;
                }

                public static int I001lIiIIo1O(int i, byte[] bArr) {
/* 1 */             int length = bArr.length;
/* 4 */             int iMax = Math.max(i, length - 4);
/* 8 */             int i2 = bArr[iMax];
                    while (true) {
/* 10 */                iMax++;
/* 12 */                if (iMax >= length) {
/* 89 */                    return i2;
                        }
/* 20 */                i2 = (i2 << 8) | (bArr[iMax] & 255);
                    }
                }

                public static boolean I001lllioOl(byte[] bArr) {
/* 1 */             int length = bArr.length;
/* 3 */             if (length != 0) {
                        return (length == 1 || bArr[0] != (bArr[1] >> 7) || OOOIo1ioIi01.I00000oOI("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
                    }
/* 2 */             return true;
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 3 */             if (i00oio1 instanceof I00IoIO0lI) {
/* 13 */                return Arrays.equals(this.I00iOIl, ((I00IoIO0lI) i00oio1).I00iOIl);
                    }
/* 5 */             return false;
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) {
/* 4 */             o1OIll00i.I00Ol10(2, z, this.I00iOIl);
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return false;
                }

                @Override
                public final int I0010I0i(boolean z) {
/* 4 */             return O1OIll00i.I00O10llo(this.I00iOIl.length, z);
                }

                public final boolean I001iOo1i0O(int i) {
/* 1 */             byte[] bArr = this.I00iOIl;
/* 3 */             int length = bArr.length;
/* 4 */             int i2 = this.I00iiI;
                    return length - i2 <= 4 && I001lIiIIo1O(i2, bArr) == i;
                }

                @Override
                public final int hashCode() {
/* 3 */             return iOO1iOiOl.I00000oOI(this.I00iOIl);
                }

                public final String toString() {
/* 8 */             return new BigInteger(this.I00iOIl).toString();
                }
            }
