            package p000;
            
            public final class ioi0O0o extends i1oi01OllI {
                private static final ioi0O0o zzi;
                private static volatile iI0ooO1Oi000 zzj;
                private int zzb;
                private int zze;
                private boolean zzg;
                private String zzf = "";
                private iI00IlI1oII zzh = iI10i0liO.I00ilI0I1;

                static {
/* 3 */             ioi0O0o ioi0o0o = new ioi0O0o();
/* 6 */             zzi = ioi0o0o;
/* 10 */            i1oi01OllI.I000o00OoI0I(ioi0O0o.class, ioi0o0o);
                }

                public static ioi0O0o I001lIiIIo1O() {
/* 1 */             return zzi;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return i1oi01OllI.I000oI1ioi(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", i1iOOl0o.I0000O, "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new ioi0O0o();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new ioIiOO11o10(zzi);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzi;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzj;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (ioi0O0o.class) {
                        try {
/* 27 */                    i1oo1lloo = zzj;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzi);
/* 38 */                        zzj = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return i1oo1lloo;
                }

                public final boolean I00111O() {
                    return (this.zzb & 1) != 0;
                }

                public final boolean I001IIilI0O() {
                    return (this.zzb & 2) != 0;
                }

                public final String I001IO000() {
/* 1 */             return this.zzf;
                }

                public final boolean I001i1O0Ol() {
                    return (this.zzb & 4) != 0;
                }

                public final boolean I001i1lo1io() {
/* 1 */             return this.zzg;
                }

                public final iI00IlI1oII I001iOo1i0O() {
/* 1 */             return this.zzh;
                }

                public final int I001l0I00() {
/* 3 */             return this.zzh.size();
                }

                public final int I001lllioOl() {
                    int i;
                    switch (this.zze) {
                        case 0:
/* 21 */                    i = 1;
                            break;
                        case 1:
/* 19 */                    i = 2;
                            break;
                        case 2:
/* 17 */                    i = 3;
                            break;
                        case 3:
/* 15 */                    i = 4;
                            break;
                        case 4:
/* 13 */                    i = 5;
                            break;
                        case 5:
/* 11 */                    i = 6;
                            break;
                        case 6:
/* 9 */                     i = 7;
                            break;
                        default:
/* 7 */                     i = 0;
                            break;
                    }
/* 22 */            if (i == 0) {
/* 3 */                 return 1;
                    }
/* 25 */            return i;
                }
            }
