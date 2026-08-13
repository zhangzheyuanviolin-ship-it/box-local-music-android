            package p000;
            
            public final class l000oiIIiIiI extends i1oi01OllI {
                private static final l000oiIIiIiI zzi;
                private static volatile iI0ooO1Oi000 zzj;
                private int zzb;
                private String zze = "";
                private boolean zzf;
                private boolean zzg;
                private int zzh;

                static {
/* 3 */             l000oiIIiIiI l000oiiiiiii = new l000oiIIiIiI();
/* 6 */             zzi = l000oiiiiiii;
/* 10 */            i1oi01OllI.I000o00OoI0I(l000oiIIiIiI.class, l000oiiiiiii);
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 91 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 85 */                return i1oi01OllI.I000oI1ioi(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new l000oiIIiIiI();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new ioooil1oIOO(zzi);
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
                    synchronized (l000oiIIiIiI.class) {
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

                public final String I00111O() {
/* 1 */             return this.zze;
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

                public final boolean I001i1lo1io() {
/* 1 */             return this.zzg;
                }

                public final boolean I001iOo1i0O() {
                    return (this.zzb & 8) != 0;
                }

                public final int I001l0I00() {
/* 1 */             return this.zzh;
                }

                public final void I001lIiIIo1O(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 1;
/* 10 */            this.zze = str;
                }
            }
