            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class Ooi0IiO0oIol extends OOIOOo {
                public int[] I00000oIO;
                public int I00000oOI;

                @Override
                public final Object I00000oIO() {
/* 5 */             int[] iArrCopyOf = Arrays.copyOf(this.I00000oIO, this.I00000oOI);
/* 11 */            Ooi0IOoioOOl ooi0IOoioOOl = new Ooi0IOoioOOl();
/* 14 */            ooi0IOoioOOl.I00iOIl = iArrCopyOf;
/* 16 */            VarHandle.storeStoreFence();
/* 29 */            return ooi0IOoioOOl;
                }

                @Override
                public final void I00000oOI(int i) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             if (iArr.length < i) {
/* 7 */                 int length = iArr.length * 2;
/* 9 */                 if (i < length) {
/* 11 */                    i = length;
                        }
/* 16 */                this.I00000oIO = Arrays.copyOf(iArr, i);
                    }
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I00000oOI;
                }
            }
