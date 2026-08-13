            package p000;

            import java.io.IOException;
            
            public final class I00II0oii1o extends I00OIO1 {
                public static final I00II0oii1o I00iiI;
                public static final I00II0oii1o I00iiO;
                public final byte I00iOIl;

                static {
/* 6 */             new I001lllioOl(1, I00II0oii1o.class);
/* 15 */            I00iiI = new I00II0oii1o((byte) 0);
/* 23 */            I00iiO = new I00II0oii1o((byte) -1);
                }

                public I00II0oii1o(byte b) {
/* 4 */             this.I00iOIl = b;
                }

                public static I00II0oii1o I001i1O0Ol(byte[] bArr) {
/* 3 */             if (bArr.length == 1) {
/* 6 */                 byte b = bArr[0];
                        return b != -1 ? b != 0 ? new I00II0oii1o(b) : I00iiI : I00iiO;
                    }
/* 27 */            I000II.I000iOII("BOOLEAN value should have 1 byte in it");
/* 30 */            return null;
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
                    return (i00oio1 instanceof I00II0oii1o) && I001iOo1i0O() == ((I00II0oii1o) i00oio1).I001iOo1i0O();
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) throws IOException {
/* 2 */             o1OIll00i.I00i01iIIliI(1, z);
/* 5 */             o1OIll00i.I00Oio(1);
/* 10 */            o1OIll00i.I00OOll1(this.I00iOIl);
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return false;
                }

                @Override
                public final int I0010I0i(boolean z) {
/* 2 */             return O1OIll00i.I00O10llo(1, z);
                }

                @Override
                public final I00OIO1 I001IIilI0O() {
                    return I001iOo1i0O() ? I00iiO : I00iiI;
                }

                public final boolean I001iOo1i0O() {
                    return this.I00iOIl != 0;
                }

                @Override
                public final int hashCode() {
                    return I001iOo1i0O() ? 1 : 0;
                }

                public final String toString() {
                    return I001iOo1i0O() ? "TRUE" : "FALSE";
                }
            }
