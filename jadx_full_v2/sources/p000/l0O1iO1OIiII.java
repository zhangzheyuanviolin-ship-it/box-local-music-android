            package p000;
            
            public final class l0O1iO1OIiII extends i1oi01OllI {
                private static final l0O1iO1OIiII zzl;
                private static volatile iI0ooO1Oi000 zzm;
                private int zzb;
                private boolean zze;
                private boolean zzf;
                private boolean zzg;
                private boolean zzh;
                private boolean zzi;
                private boolean zzj;
                private boolean zzk;

                static {
/* 3 */             l0O1iO1OIiII l0o1io1oiiii = new l0O1iO1OIiII();
/* 6 */             zzl = l0o1io1oiiii;
/* 10 */            i1oi01OllI.I000o00OoI0I(l0O1iO1OIiII.class, l0o1io1oiiii);
                }

                public static l0O01OlI I001lIiIIo1O() {
/* 7 */             return (l0O01OlI) zzl.I000OOo1O();
                }

                public static l0O1iO1OIiII I001lllioOl() {
/* 1 */             return zzl;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 98 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 92 */                return i1oi01OllI.I000oI1ioi(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new l0O1iO1OIiII();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new l0O01OlI(zzl);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzl;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzm;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (l0O1iO1OIiII.class) {
                        try {
/* 27 */                    i1oo1lloo = zzm;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzl);
/* 38 */                        zzm = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return i1oo1lloo;
                }

                public final boolean I00111O() {
/* 1 */             return this.zze;
                }

                public final boolean I001IIilI0O() {
/* 1 */             return this.zzf;
                }

                public final boolean I001IO000() {
/* 1 */             return this.zzg;
                }

                public final boolean I001i1O0Ol() {
/* 1 */             return this.zzh;
                }

                public final boolean I001i1lo1io() {
/* 1 */             return this.zzi;
                }

                public final boolean I001iOo1i0O() {
/* 1 */             return this.zzj;
                }

                public final boolean I001l0I00() {
/* 1 */             return this.zzk;
                }

                public final void I001lloI(boolean z) {
                    this.zzb |= 1;
/* 7 */             this.zze = z;
                }

                public final void I00II0Ol1O0l(boolean z) {
                    this.zzb |= 2;
/* 7 */             this.zzf = z;
                }

                public final void I00II0oii1o(boolean z) {
                    this.zzb |= 4;
/* 7 */             this.zzg = z;
                }

                public final void I00IO1(boolean z) {
                    this.zzb |= 8;
/* 7 */             this.zzh = z;
                }

                public final void I00IO1oi11O(boolean z) {
                    this.zzb |= 16;
/* 7 */             this.zzi = z;
                }

                public final void I00IOO(boolean z) {
                    this.zzb |= 32;
/* 7 */             this.zzj = z;
                }

                public final void I00IioO0OiOi(boolean z) {
                    this.zzb |= 64;
/* 7 */             this.zzk = z;
                }
            }
