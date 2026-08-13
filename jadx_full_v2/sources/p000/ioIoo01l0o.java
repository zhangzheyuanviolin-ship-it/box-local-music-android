            package p000;
            
            public final class ioIoo01l0o extends i1oi01OllI {
                private static final ioIoo01l0o zzj;
                private static volatile iI0ooO1Oi000 zzk;
                private int zzb;
                private int zze;
                private boolean zzf;
                private String zzg = "";
                private String zzh = "";
                private String zzi = "";

                static {
/* 3 */             ioIoo01l0o ioioo01l0o = new ioIoo01l0o();
/* 6 */             zzj = ioioo01l0o;
/* 10 */            i1oi01OllI.I000o00OoI0I(ioIoo01l0o.class, ioioo01l0o);
                }

                public static ioIoo01l0o I001lloI() {
/* 1 */             return zzj;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 96 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return i1oi01OllI.I000oI1ioi(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", i1iOOl0o.I0000Il00O, "zzf", "zzg", "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new ioIoo01l0o();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new ioIiOO11o10(zzj);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzj;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzk;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (ioIoo01l0o.class) {
                        try {
/* 27 */                    i1oo1lloo = zzk;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzj);
/* 38 */                        zzk = i1oo1lloo;
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

                public final boolean I001IO000() {
/* 1 */             return this.zzf;
                }

                public final boolean I001i1O0Ol() {
                    return (this.zzb & 4) != 0;
                }

                public final String I001i1lo1io() {
/* 1 */             return this.zzg;
                }

                public final boolean I001iOo1i0O() {
                    return (this.zzb & 8) != 0;
                }

                public final String I001l0I00() {
/* 1 */             return this.zzh;
                }

                public final boolean I001lIiIIo1O() {
                    return (this.zzb & 16) != 0;
                }

                public final String I001lllioOl() {
/* 1 */             return this.zzi;
                }

                public final int I00II0Ol1O0l() {
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
