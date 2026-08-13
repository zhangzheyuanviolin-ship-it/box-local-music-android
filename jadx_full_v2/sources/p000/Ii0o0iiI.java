            package p000;

            import java.io.IOException;
            
/* 27 */    public final class Ii0o0iiI extends I001lloI {
                public static Ii0o0iiI I001lIiIIo1O(Object obj) {
/* 1 */             if (obj == null || (obj instanceof Ii0o0iiI)) {
/* 84 */                return (Ii0o0iiI) obj;
                    }
/* 10 */            if (obj instanceof I001lloI) {
/* 18 */                return (Ii0o0iiI) ((I001lloI) obj).I001IIilI0O();
                    }
/* 23 */            if (!(obj instanceof byte[])) {
/* 79 */                I000II.I000iOII("illegal object in getInstance: ".concat(obj.getClass().getName()));
/* 82 */                return null;
                    }
                    try {
/* 37 */                return (Ii0o0iiI) ((I001lloI) I00OIO1.I00111O((byte[]) obj)).I001IIilI0O();
                    } catch (Exception e) {
/* 64 */                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
                    }
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) throws IOException {
/* 1 */             byte[] bArr = this.I00iOIl;
/* 8 */             int i = bArr[0] & 255;
/* 9 */             int length = bArr.length;
                    int i2 = length - 1;
/* 12 */            byte b = bArr[i2];
/* 17 */            byte b2 = (byte) ((255 << i) & b);
/* 19 */            if (b == b2) {
/* 21 */                o1OIll00i.I00Ol10(3, z, bArr);
/* 24 */                return;
                    }
/* 25 */            o1OIll00i.I00i01iIIliI(3, z);
/* 28 */            o1OIll00i.I00Oio(length);
/* 31 */            o1OIll00i.I00OilO00Il(bArr, 0, i2);
/* 34 */            o1OIll00i.I00OOll1(b2);
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
/* 28 */        public final I00OIO1 I001IIilI0O() {
/* 29 */            return this;
                }

                @Override
/* 28 */        public final I00OIO1 I001IO000() {
/* 29 */            return this;
                }
            }
