            package p000;

            import java.util.Arrays;
            
            public final class IIIiOO1ol extends OOIOOo {
                public byte[] I00000oIO;
                public int I00000oOI;

                @Override
                public final Object I00000oIO() {
/* 5 */             return Arrays.copyOf(this.I00000oIO, this.I00000oOI);
                }

                @Override
                public final void I00000oOI(int i) {
/* 1 */             byte[] bArr = this.I00000oIO;
/* 4 */             if (bArr.length < i) {
/* 7 */                 int length = bArr.length * 2;
/* 9 */                 if (i < length) {
/* 11 */                    i = length;
                        }
/* 16 */                this.I00000oIO = Arrays.copyOf(bArr, i);
                    }
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I00000oOI;
                }
            }
