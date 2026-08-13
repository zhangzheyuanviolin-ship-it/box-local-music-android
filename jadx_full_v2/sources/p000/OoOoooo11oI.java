            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class OoOoooo11oI extends OOIOOo {
                public byte[] I00000oIO;
                public int I00000oOI;

                @Override
                public final Object I00000oIO() {
/* 5 */             byte[] bArrCopyOf = Arrays.copyOf(this.I00000oIO, this.I00000oOI);
/* 11 */            OoOoo0oO0 ooOoo0oO0 = new OoOoo0oO0();
/* 14 */            ooOoo0oO0.I00iOIl = bArrCopyOf;
/* 16 */            VarHandle.storeStoreFence();
/* 29 */            return ooOoo0oO0;
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
