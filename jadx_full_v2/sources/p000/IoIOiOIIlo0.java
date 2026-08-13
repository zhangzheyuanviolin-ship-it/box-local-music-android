            package p000;

            import java.io.IOException;
            
            public final class IoIOiOIIlo0 extends OloIi00i {
                public final IoIOii01O I0000oI00;
                public final int I0001Ioi1lo;
                public final long I000II;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoIOiOIIlo0(String str, IoIOii01O ioIOii01O, int i, long j) {
/* 8 */             super(str, true);
/* 1 */             this.I0000oI00 = ioIOii01O;
/* 3 */             this.I0001Ioi1lo = i;
/* 5 */             this.I000II = j;
                }

                @Override
                public final long I00000oIO() {
/* 1 */             IoIOii01O ioIOii01O = this.I0000oI00;
                    try {
/* 9 */                 ioIOii01O.I00ol1.I001l0I00(this.I0001Ioi1lo, this.I000II);
/* 18 */                return -1L;
                    } catch (IOException e) {
/* 15 */                ioIOii01O.I00000oIO(2, 2, e);
/* 18 */                return -1L;
                    }
                }
            }
