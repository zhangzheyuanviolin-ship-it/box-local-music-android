            package p000;

            import java.util.List;
            
            public final class l1OoioI11o1l extends i1oi01OllI {
                private static final l1OoioI11o1l zzk;
                private static volatile iI0ooO1Oi000 zzl;
                private int zzb;
                private int zze;
                private iI00IlI1oII zzf = iI10i0liO.I00ilI0I1;
                private String zzg = "";
                private String zzh = "";
                private boolean zzi;
                private double zzj;

                static {
/* 3 */             l1OoioI11o1l l1ooioi11o1l = new l1OoioI11o1l();
/* 6 */             zzk = l1ooioi11o1l;
/* 10 */            i1oi01OllI.I000o00OoI0I(l1OoioI11o1l.class, l1ooioi11o1l);
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 100 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 94 */                return i1oi01OllI.I000oI1ioi(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", i1iOOl0o.I00100l0, "zzf", l1OoioI11o1l.class, "zzg", "zzh", "zzi", "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new l1OoioI11o1l();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new ioIiOO11o10(zzk);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzk;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzl;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (l1OoioI11o1l.class) {
                        try {
/* 27 */                    i1oo1lloo = zzl;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzk);
/* 38 */                        zzl = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return i1oo1lloo;
                }

                public final List I00111O() {
/* 1 */             return this.zzf;
                }

                public final String I001IIilI0O() {
/* 1 */             return this.zzg;
                }

                public final boolean I001IO000() {
                    return (this.zzb & 4) != 0;
                }

                public final String I001i1O0Ol() {
/* 1 */             return this.zzh;
                }

                public final boolean I001i1lo1io() {
                    return (this.zzb & 8) != 0;
                }

                public final boolean I001iOo1i0O() {
/* 1 */             return this.zzi;
                }

                public final boolean I001l0I00() {
                    return (this.zzb & 16) != 0;
                }

                public final double I001lIiIIo1O() {
/* 1 */             return this.zzj;
                }

                public final int I001lllioOl() {
                    int i;
/* 1 */             int i2 = this.zze;
/* 4 */             if (i2 != 0) {
/* 6 */                 i = 2;
/* 7 */                 if (i2 != 1) {
/* 10 */                    if (i2 != 2) {
/* 12 */                        i = 4;
/* 13 */                        if (i2 != 3) {
/* 19 */                            i = i2 != 4 ? 0 : 5;
                                }
                            } else {
/* 21 */                        i = 3;
                            }
                        }
                    } else {
/* 23 */                i = 1;
                    }
/* 24 */            if (i == 0) {
/* 3 */                 return 1;
                    }
/* 55 */            return i;
                }
            }
