            package p000;

            import java.util.Arrays;
            
            public final class Il01oOi {
                public final Il0IIil I00000oIO;
                public final byte[] I00000oOI;

                public Il01oOi(Il0IIil il0IIil, byte[] bArr) {
/* 5 */             if (il0IIil == null) {
/* 22 */                IOOlIIilOl0.I000II("encoding is null");
/* 37 */                throw null;
                    }
/* 7 */             if (bArr == null) {
/* 16 */                IOOlIIilOl0.I000II("bytes is null");
/* 19 */                throw null;
                    }
/* 9 */             this.I00000oIO = il0IIil;
/* 11 */            this.I00000oOI = bArr;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Il01oOi)) {
/* 7 */                 return false;
                    }
/* 11 */            Il01oOi il01oOi = (Il01oOi) obj;
/* 21 */            if (this.I00000oIO.equals(il01oOi.I00000oIO)) {
/* 28 */                return Arrays.equals(this.I00000oOI, il01oOi.I00000oOI);
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            return Arrays.hashCode(this.I00000oOI) ^ ((this.I00000oIO.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 18 */            return "EncodedPayload{encoding=" + this.I00000oIO + ", bytes=[...]}";
                }
            }
