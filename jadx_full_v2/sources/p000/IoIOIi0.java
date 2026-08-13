            package p000;

            import java.io.IOException;
            
            public final class IoIOIi0 extends OloIi00i {
                public final IoIOii01O I0000oI00;
                public final int I0001Ioi1lo;
                public final III1o0lOio0 I000II;
                public final int I000O01llI0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoIOIi0(String str, IoIOii01O ioIOii01O, int i, III1o0lOio0 iII1o0lOio0, int i2, boolean z) {
/* 10 */            super(str, true);
/* 1 */             this.I0000oI00 = ioIOii01O;
/* 3 */             this.I0001Ioi1lo = i;
/* 5 */             this.I000II = iII1o0lOio0;
/* 7 */             this.I000O01llI0 = i2;
                }

                @Override
                public final long I00000oIO() {
                    try {
/* 3 */                 o0llIi o0llii = this.I0000oI00.I00li1OI;
/* 5 */                 III1o0lOio0 iII1o0lOio0 = this.I000II;
/* 7 */                 int i = this.I000O01llI0;
/* 9 */                 o0llii.getClass();
/* 13 */                iII1o0lOio0.skip(i);
/* 24 */                this.I0000oI00.I00ol1.I001i1lo1io(this.I0001Ioi1lo, 9);
                        synchronized (this.I0000oI00) {
/* 40 */                    this.I0000oI00.I00oli.remove(Integer.valueOf(this.I0001Ioi1lo));
                        }
/* 48 */                return -1L;
                    } catch (IOException unused) {
/* 48 */                return -1L;
                    }
                }
            }
