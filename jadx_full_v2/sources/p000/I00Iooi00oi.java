            package p000;

            import java.util.Arrays;
            
            public final class I00Iooi00oi {
                public final int I00000oIO;
                public final byte[] I00000oOI;

                public I00Iooi00oi(byte[] bArr) {
/* 8 */             this.I00000oIO = iOO1iOiOl.I00000oOI(bArr);
/* 10 */            this.I00000oOI = bArr;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof I00Iooi00oi)) {
/* 16 */                return false;
                    }
/* 11 */            return Arrays.equals(this.I00000oOI, ((I00Iooi00oi) obj).I00000oOI);
                }

                public final int hashCode() {
/* 1 */             return this.I00000oIO;
                }
            }
