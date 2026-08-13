            package p000;

            import java.util.Arrays;
            
            public final class OOIiilIiOo implements Comparable {
                public final byte[] I00iOIl;

                public OOIiilIiOo(byte[] bArr) {
/* 9 */             this.I00iOIl = Arrays.copyOf(bArr, bArr.length);
                }

                @Override
                public final int compareTo(Object obj) {
/* 1 */             OOIiilIiOo oOIiilIiOo = (OOIiilIiOo) obj;
/* 3 */             byte[] bArr = this.I00iOIl;
/* 5 */             int length = bArr.length;
/* 6 */             byte[] bArr2 = oOIiilIiOo.I00iOIl;
/* 9 */             if (length != bArr2.length) {
/* 13 */                return bArr.length - bArr2.length;
                    }
/* 18 */            for (int i = 0; i < bArr.length; i++) {
/* 20 */                byte b = bArr[i];
/* 24 */                byte b2 = oOIiilIiOo.I00iOIl[i];
/* 26 */                if (b != b2) {
/* 28 */                    return b - b2;
                        }
                    }
/* 15 */            return 0;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof OOIiilIiOo) {
/* 13 */                return Arrays.equals(this.I00iOIl, ((OOIiilIiOo) obj).I00iOIl);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 3 */             return Arrays.hashCode(this.I00iOIl);
                }

                public final String toString() {
/* 3 */             return ilo01iOOoO0l.I00000oOI(this.I00iOIl);
                }
            }
