            package p000;

            import java.io.IOException;
            
            public final class IoIOIIi extends OloIi00i {
                public final int I0000oI00;
                public final IoIOii01O I0001Ioi1lo;
                public final int I000II;
                public final int I000O01llI0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoIOIIi(String str, IoIOii01O ioIOii01O, int i, int i2, int i3) {
/* 10 */            super(str, true);
/* 1 */             this.I0000oI00 = i3;
/* 3 */             this.I0001Ioi1lo = ioIOii01O;
/* 5 */             this.I000II = i;
/* 7 */             this.I000O01llI0 = i2;
                }

                @Override
                public final long I00000oIO() {
/* 1 */             int i = this.I0000oI00;
/* 6 */             int i2 = this.I000O01llI0;
/* 8 */             int i3 = this.I000II;
/* 10 */            IoIOii01O ioIOii01O = this.I0001Ioi1lo;
                    switch (i) {
                        case 0:
                            try {
/* 29 */                        ioIOii01O.I00ol1.I00100l0(i3, i2, true);
                                break;
                            } catch (IOException e) {
/* 34 */                        ioIOii01O.I00000oIO(2, 2, e);
                                break;
                            }
                        default:
                            try {
/* 17 */                        ioIOii01O.I00ol1.I001i1lo1io(i3, i2);
                                break;
                            } catch (IOException e2) {
/* 22 */                        ioIOii01O.I00000oIO(2, 2, e2);
                                break;
                            }
                    }
/* 3 */             return -1L;
/* 3 */             return -1L;
                }
            }
