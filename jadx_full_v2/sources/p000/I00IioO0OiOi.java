            package p000;

            import java.util.Arrays;
            
            public final class I00IioO0OiOi extends I00OIO1 {
                public static final I00IioO0OiOi[] I00iiI = new I00IioO0OiOi[12];
                public final byte[] I00iOIl;

                public I00IioO0OiOi(byte[] bArr, boolean z) {
/* 9 */             if (I00IoIO0lI.I001lllioOl(bArr)) {
/* 53 */                I000II.I000iOII("malformed enumerated");
/* 89 */                throw null;
                    }
/* 11 */            int i = 0;
/* 16 */            if ((bArr[0] & 128) != 0) {
/* 47 */                I000II.I000iOII("enumerated must be non-negative");
/* 50 */                throw null;
                    }
/* 26 */            this.I00iOIl = z ? iOO1iOiOl.I00000oIO(bArr) : bArr;
                    int length = bArr.length - 1;
/* 31 */            while (i < length) {
/* 33 */                byte b = bArr[i];
/* 35 */                i++;
/* 41 */                if (b != (bArr[i] >> 7)) {
/* 44 */                    return;
                        }
                    }
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 3 */             if (i00oio1 instanceof I00IioO0OiOi) {
/* 13 */                return Arrays.equals(this.I00iOIl, ((I00IioO0OiOi) i00oio1).I00iOIl);
                    }
/* 5 */             return false;
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) {
/* 5 */             o1OIll00i.I00Ol10(10, z, this.I00iOIl);
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
            }
