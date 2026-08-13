            package p000;

            import java.io.IOException;
            import java.util.List;
            
/* 13 */    public final class IoIOO1 extends OloIi00i {
                public final int I0000oI00 = 1;
                public final IoIOii01O I0001Ioi1lo;
                public final int I000II;
                public final List I000O01llI0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoIOO1(String str, IoIOii01O ioIOii01O, int i, List list, boolean z) {
/* 11 */            super(str, true);
/* 4 */             this.I0001Ioi1lo = ioIOii01O;
/* 6 */             this.I000II = i;
/* 8 */             this.I000O01llI0 = list;
                }

                @Override
                public final long I00000oIO() {
                    switch (this.I0000oI00) {
                        case 0:
/* 52 */                    this.I0001Ioi1lo.I00li1OI.getClass();
                            try {
/* 61 */                        this.I0001Ioi1lo.I00ol1.I001i1lo1io(this.I000II, 9);
                                synchronized (this.I0001Ioi1lo) {
/* 77 */                            this.I0001Ioi1lo.I00oli.remove(Integer.valueOf(this.I000II));
                                }
                            } catch (IOException unused) {
                            }
/* 3 */                     return -1L;
                        default:
/* 14 */                    this.I0001Ioi1lo.I00li1OI.getClass();
                            try {
/* 23 */                        this.I0001Ioi1lo.I00ol1.I001i1lo1io(this.I000II, 9);
                                synchronized (this.I0001Ioi1lo) {
/* 39 */                            this.I0001Ioi1lo.I00oli.remove(Integer.valueOf(this.I000II));
                                }
                            } catch (IOException unused2) {
                            }
/* 3 */                     return -1L;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public IoIOO1(String str, IoIOii01O ioIOii01O, int i, List list) {
/* 15 */            super(str, true);
                    this.I0001Ioi1lo = ioIOii01O;
                    this.I000II = i;
                    this.I000O01llI0 = list;
                }
            }
