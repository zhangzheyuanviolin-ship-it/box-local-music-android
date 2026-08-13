            package p000;
            
            public final class l0io11IIiil extends i1oi01OllI {
                private static final l0io11IIiil zzg;
                private static volatile iI0ooO1Oi000 zzh;
                private int zzb;
                private int zze;
                private long zzf;

                static {
/* 3 */             l0io11IIiil l0io11iiiil = new l0io11IIiil();
/* 6 */             zzg = l0io11iiiil;
/* 10 */            i1oi01OllI.I000o00OoI0I(l0io11IIiil.class, l0io11iiiil);
                }

                public static l0ilIi01 I001i1lo1io() {
/* 7 */             return (l0ilIi01) zzg.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return i1oi01OllI.I000oI1ioi(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new l0io11IIiil();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new l0ilIi01(zzg);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zzg;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzh;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (l0io11IIiil.class) {
                        try {
/* 27 */                    i1oo1lloo = zzh;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzg);
/* 38 */                        zzh = i1oo1lloo;
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

                public final int I001IIilI0O() {
/* 1 */             return this.zze;
                }

                public final boolean I001IO000() {
                    return (this.zzb & 2) != 0;
                }

                public final long I001i1O0Ol() {
/* 1 */             return this.zzf;
                }

                public final void I001iOo1i0O(int i) {
                    this.zzb |= 1;
/* 7 */             this.zze = i;
                }

                public final void I001l0I00(long j) {
                    this.zzb |= 2;
/* 7 */             this.zzf = j;
                }
            }
