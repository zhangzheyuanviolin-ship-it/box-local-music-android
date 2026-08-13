            package p000;
            
            public final class l1IOl1iI00l extends i1oi01OllI {
                private static final l1IOl1iI00l zzk;
                private static volatile iI0ooO1Oi000 zzl;
                private int zzb;
                private long zze;
                private String zzf = "";
                private String zzg = "";
                private long zzh;
                private float zzi;
                private double zzj;

                static {
/* 3 */             l1IOl1iI00l l1iol1ii00l = new l1IOl1iI00l();
/* 6 */             zzk = l1iol1ii00l;
/* 10 */            i1oi01OllI.I000o00OoI0I(l1IOl1iI00l.class, l1iol1ii00l);
                }

                public static l1IIIIIl1iIO I00II0oii1o() {
/* 7 */             return (l1IIIIIl1iIO) zzk.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 96 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return i1oi01OllI.I000oI1ioi(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new l1IOl1iI00l();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new l1IIIIIl1iIO(zzk);
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
                    synchronized (l1IOl1iI00l.class) {
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

                public final long I001IIilI0O() {
/* 1 */             return this.zze;
                }

                public final String I001IO000() {
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

                public final long I001l0I00() {
/* 1 */             return this.zzh;
                }

                public final boolean I001lIiIIo1O() {
                    return (this.zzb & 16) != 0;
                }

                public final float I001lllioOl() {
/* 1 */             return this.zzi;
                }

                public final boolean I001lloI() {
                    return (this.zzb & 32) != 0;
                }

                public final double I00II0Ol1O0l() {
/* 1 */             return this.zzj;
                }

                public final void I00IO1(long j) {
                    this.zzb |= 1;
/* 7 */             this.zze = j;
                }

                public final void I00IO1oi11O(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 2;
/* 10 */            this.zzf = str;
                }

                public final void I00IOO(String str) {
                    this.zzb |= 4;
/* 7 */             this.zzg = str;
                }

                public final void I00IioO0OiOi() {
                    this.zzb &= -5;
/* 11 */            this.zzg = zzk.zzg;
                }

                public final void I00IlilI0i0i(long j) {
                    this.zzb |= 8;
/* 7 */             this.zzh = j;
                }

                public final void I00Io1lO() {
                    this.zzb &= -9;
/* 9 */             this.zzh = 0L;
                }

                public final void I00Io1o110i(double d) {
                    this.zzb |= 32;
/* 7 */             this.zzj = d;
                }

                public final void I00IoIO0lI() {
                    this.zzb &= -33;
/* 9 */             this.zzj = 0.0d;
                }
            }
