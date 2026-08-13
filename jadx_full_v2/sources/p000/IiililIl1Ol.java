            package p000;

            import java.util.Arrays;
            
            public final class IiililIl1Ol extends OOIOOo {
                public double[] I00000oIO;
                public int I00000oOI;

                @Override
                public final Object I00000oIO() {
/* 5 */             return Arrays.copyOf(this.I00000oIO, this.I00000oOI);
                }

                @Override
                public final void I00000oOI(int i) {
/* 1 */             double[] dArr = this.I00000oIO;
/* 4 */             if (dArr.length < i) {
/* 7 */                 int length = dArr.length * 2;
/* 9 */                 if (i < length) {
/* 11 */                    i = length;
                        }
/* 16 */                this.I00000oIO = Arrays.copyOf(dArr, i);
                    }
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I00000oOI;
                }
            }
