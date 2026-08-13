            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class Ooi0l11io0oI extends OOIOOo {
                public long[] I00000oIO;
                public int I00000oOI;

                @Override
                public final Object I00000oIO() {
/* 5 */             long[] jArrCopyOf = Arrays.copyOf(this.I00000oIO, this.I00000oOI);
/* 11 */            Ooi0l101o ooi0l101o = new Ooi0l101o();
/* 14 */            ooi0l101o.I00iOIl = jArrCopyOf;
/* 16 */            VarHandle.storeStoreFence();
/* 29 */            return ooi0l101o;
                }

                @Override
                public final void I00000oOI(int i) {
/* 1 */             long[] jArr = this.I00000oIO;
/* 4 */             if (jArr.length < i) {
/* 7 */                 int length = jArr.length * 2;
/* 9 */                 if (i < length) {
/* 11 */                    i = length;
                        }
/* 16 */                this.I00000oIO = Arrays.copyOf(jArr, i);
                    }
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I00000oOI;
                }
            }
