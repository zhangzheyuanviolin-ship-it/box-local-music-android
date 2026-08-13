            package p000;

            import java.util.Arrays;
            
            public final class O0Iii1l extends OOlo10O1I1IO {
                public final byte[] I00iOIl;

                public O0Iii1l(byte[] bArr) {
/* 4 */             this.I00iOIl = bArr;
                }

                @Override
                public final boolean I00Io1lO(Object obj) {
/* 3 */             if (obj instanceof byte[]) {
/* 9 */                 return Arrays.equals(this.I00iOIl, (byte[]) obj);
                    }
/* 16 */            if (obj instanceof O0Iil0i11IO) {
/* 22 */                return ((O0Iil0i11IO) obj).I00000oIO.equals(this);
                    }
/* 27 */            return false;
                }

                public final Object clone() {
/* 5 */             return new O0Iii1l(this.I00iOIl);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof O0Iii1l) {
/* 13 */                return Arrays.equals(this.I00iOIl, ((O0Iii1l) obj).I00iOIl);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 3 */             return iOO1iOiOl.I00000oOI(this.I00iOIl);
                }
            }
