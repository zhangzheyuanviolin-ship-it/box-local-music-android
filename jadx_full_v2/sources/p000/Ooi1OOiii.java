            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class Ooi1OOiii extends OOIOOo {
                public short[] I00000oIO;
                public int I00000oOI;

                @Override
                public final Object I00000oIO() {
/* 5 */             short[] sArrCopyOf = Arrays.copyOf(this.I00000oIO, this.I00000oOI);
/* 11 */            Ooi1Ioi10 ooi1Ioi10 = new Ooi1Ioi10();
/* 14 */            ooi1Ioi10.I00iOIl = sArrCopyOf;
/* 16 */            VarHandle.storeStoreFence();
/* 29 */            return ooi1Ioi10;
                }

                @Override
                public final void I00000oOI(int i) {
/* 1 */             short[] sArr = this.I00000oIO;
/* 4 */             if (sArr.length < i) {
/* 7 */                 int length = sArr.length * 2;
/* 9 */                 if (i < length) {
/* 11 */                    i = length;
                        }
/* 16 */                this.I00000oIO = Arrays.copyOf(sArr, i);
                    }
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I00000oOI;
                }
            }
