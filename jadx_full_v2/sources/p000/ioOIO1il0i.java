            package p000;
            
            public final class ioOIO1il0i extends i1oi01OllI {
                private static final ioOIO1il0i zzk;
                private static volatile iI0ooO1Oi000 zzl;
                private int zzb;
                private int zze;
                private String zzf = "";
                private ioIO1Io0o zzg;
                private boolean zzh;
                private boolean zzi;
                private boolean zzj;

                static {
/* 3 */             ioOIO1il0i iooio1il0i = new ioOIO1il0i();
/* 6 */             zzk = iooio1il0i;
/* 10 */            i1oi01OllI.I000o00OoI0I(ioOIO1il0i.class, iooio1il0i);
                }

                public static ioO0iOoIi I001lllioOl() {
/* 7 */             return (ioO0iOoIi) zzk.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 96 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return i1oi01OllI.I000oI1ioi(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new ioOIO1il0i();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new ioO0iOoIi(zzk);
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
                    synchronized (ioOIO1il0i.class) {
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

                public final boolean I00111O() {
                    return (this.zzb & 1) != 0;
                }

                public final int I001IIilI0O() {
/* 1 */             return this.zze;
                }

                public final String I001IO000() {
/* 1 */             return this.zzf;
                }

                public final ioIO1Io0o I001i1O0Ol() {
/* 1 */             ioIO1Io0o ioio1io0o = this.zzg;
                    return ioio1io0o == null ? ioIO1Io0o.I001lllioOl() : ioio1io0o;
                }

                public final boolean I001i1lo1io() {
/* 1 */             return this.zzh;
                }

                public final boolean I001iOo1i0O() {
/* 1 */             return this.zzi;
                }

                public final boolean I001l0I00() {
                    return (this.zzb & 32) != 0;
                }

                public final boolean I001lIiIIo1O() {
/* 1 */             return this.zzj;
                }

                public final void I001lloI(String str) {
                    this.zzb |= 2;
/* 7 */             this.zzf = str;
                }
            }
