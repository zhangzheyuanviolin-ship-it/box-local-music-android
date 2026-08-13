            package p000;
            
            public final class ioiOO11II0O0 extends i1oi01OllI {
                private static final ioiOO11II0O0 zzh;
                private static volatile iI0ooO1Oi000 zzi;
                private int zzb;
                private int zze;
                private int zzf;
                private int zzg;

                static {
/* 3 */             ioiOO11II0O0 ioioo11ii0o0 = new ioiOO11II0O0();
/* 6 */             zzh = ioioo11ii0o0;
/* 10 */            i1oi01OllI.I000o00OoI0I(ioiOO11II0O0.class, ioioo11ii0o0);
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 96 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return i1oi01OllI.I000oI1ioi(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", i1iOOl0o.I0001Ioi1lo, "zzf", i1iOOl0o.I0000oI00, "zzg", i1iOOl0o.I000II});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new ioiOO11II0O0();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new ioIiOO11o10(zzh);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzh;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzi;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (ioiOO11II0O0.class) {
                        try {
/* 27 */                    i1oo1lloo = zzi;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzh);
/* 38 */                        zzi = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return i1oo1lloo;
                }

                public final int I00111O() {
/* 3 */             int iI00000oIO = liolOi0Oli.I00000oIO(this.zze);
/* 7 */             if (iI00000oIO == 0) {
/* 9 */                 return 1;
                    }
/* 20 */            return iI00000oIO;
                }

                public final int I001IIilI0O() {
                    int i;
/* 1 */             int i2 = this.zzf;
/* 4 */             if (i2 != 0) {
/* 6 */                 i = 2;
/* 7 */                 if (i2 != 1) {
/* 13 */                    i = i2 != 2 ? 0 : 3;
                        }
                    } else {
/* 15 */                i = 1;
                    }
/* 16 */            if (i == 0) {
/* 3 */                 return 1;
                    }
/* 20 */            return i;
                }

                public final int I001IO000() {
                    int i;
/* 1 */             int i2 = this.zzg;
/* 4 */             if (i2 != 0) {
/* 6 */                 i = 2;
/* 7 */                 if (i2 != 1) {
/* 13 */                    i = i2 != 2 ? 0 : 3;
                        }
                    } else {
/* 15 */                i = 1;
                    }
/* 16 */            if (i == 0) {
/* 3 */                 return 1;
                    }
/* 20 */            return i;
                }
            }
