            package p000;

            import java.util.List;
            
            public final class iooOiIloili extends i1oi01OllI {
                private static final iooOiIloili zzj;
                private static volatile iI0ooO1Oi000 zzk;
                private int zzb;
                private iI00IlI1oII zze;
                private iI00IlI1oII zzf;
                private iI00IlI1oII zzg;
                private boolean zzh;
                private iI00IlI1oII zzi;

                static {
/* 3 */             iooOiIloili ioooiiloili = new iooOiIloili();
/* 6 */             zzj = ioooiiloili;
/* 10 */            i1oi01OllI.I000o00OoI0I(iooOiIloili.class, ioooiiloili);
                }

                public iooOiIloili() {
/* 4 */             iI10i0liO ii10i0lio = iI10i0liO.I00ilI0I1;
/* 6 */             this.zze = ii10i0lio;
/* 8 */             this.zzf = ii10i0lio;
/* 10 */            this.zzg = ii10i0lio;
/* 12 */            this.zzi = ii10i0lio;
                }

                public static iooOiIloili I001l0I00() {
/* 1 */             return zzj;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 101 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 95 */                return i1oi01OllI.I000oI1ioi(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", ioiOO11II0O0.class, "zzf", ioioiol10O.class, "zzg", ioo0loOI1oiI.class, "zzh", "zzi", ioiOO11II0O0.class});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new iooOiIloili();
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
                    synchronized (iooOiIloili.class) {
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

                public final List I00111O() {
/* 1 */             return this.zze;
                }

                public final List I001IIilI0O() {
/* 1 */             return this.zzf;
                }

                public final List I001IO000() {
/* 1 */             return this.zzg;
                }

                public final boolean I001i1O0Ol() {
                    return (this.zzb & 1) != 0;
                }

                public final boolean I001i1lo1io() {
/* 1 */             return this.zzh;
                }

                public final iI00IlI1oII I001iOo1i0O() {
/* 1 */             return this.zzi;
                }
            }
