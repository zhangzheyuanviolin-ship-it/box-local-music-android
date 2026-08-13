            package p000;
            
            public final class ioIO1Io0o extends i1oi01OllI {
                private static final ioIO1Io0o zzi;
                private static volatile iI0ooO1Oi000 zzj;
                private int zzb;
                private ioi0O0o zze;
                private ioIoo01l0o zzf;
                private boolean zzg;
                private String zzh = "";

                static {
/* 3 */             ioIO1Io0o ioio1io0o = new ioIO1Io0o();
/* 6 */             zzi = ioio1io0o;
/* 10 */            i1oi01OllI.I000o00OoI0I(ioIO1Io0o.class, ioio1io0o);
                }

                public static ioIO1Io0o I001lllioOl() {
/* 1 */             return zzi;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 91 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 85 */                return i1oi01OllI.I000oI1ioi(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new ioIO1Io0o();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new ioII0loiioI(zzi);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zzi;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzj;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (ioIO1Io0o.class) {
                        try {
/* 27 */                    i1oo1lloo = zzj;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzi);
/* 38 */                        zzj = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
/* 44 */            return i1oo1lloo;
                }

                public final boolean I00111O() {
                    return (this.zzb & 1) != 0;
                }

                public final ioi0O0o I001IIilI0O() {
/* 1 */             ioi0O0o ioi0o0o = this.zze;
                    return ioi0o0o == null ? ioi0O0o.I001lIiIIo1O() : ioi0o0o;
                }

                public final boolean I001IO000() {
                    return (this.zzb & 2) != 0;
                }

                public final ioIoo01l0o I001i1O0Ol() {
/* 1 */             ioIoo01l0o ioioo01l0o = this.zzf;
                    return ioioo01l0o == null ? ioIoo01l0o.I001lloI() : ioioo01l0o;
                }

                public final boolean I001i1lo1io() {
                    return (this.zzb & 4) != 0;
                }

                public final boolean I001iOo1i0O() {
/* 1 */             return this.zzg;
                }

                public final boolean I001l0I00() {
                    return (this.zzb & 8) != 0;
                }

                public final String I001lIiIIo1O() {
/* 1 */             return this.zzh;
                }

                public final void I001lloI(String str) {
                    this.zzb |= 8;
/* 7 */             this.zzh = str;
                }
            }
