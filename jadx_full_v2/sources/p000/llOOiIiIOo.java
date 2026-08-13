            package p000;
            
            public final class llOOiIiIOo extends i1oi01OllI {
                private static final llOOiIiIOo zzj;
                private static volatile iI0ooO1Oi000 zzk;
                private int zzb;
                private long zzh;
                private String zze = "";
                private i1lIIl01O zzf = i1lIIl01O.I00iiI;
                private String zzg = "";
                private iI00IlI1oII zzi = iI10i0liO.I00ilI0I1;

                static {
/* 3 */             llOOiIiIOo llooiiiioo = new llOOiIiIOo();
/* 6 */             zzj = llooiiiioo;
/* 10 */            i1oi01OllI.I000o00OoI0I(llOOiIiIOo.class, llooiiiioo);
                }

                public static llOIo0oi I001l0I00() {
/* 7 */             return (llOIo0oi) zzj.I000OOo1O();
                }

                public static llOOiIiIOo I001lIiIIo1O() {
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
/* 90 */                return i1oi01OllI.I000oI1ioi(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", llOlO1lIl0l.class});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new llOOiIiIOo();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new llOIo0oi(zzj);
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
                    synchronized (llOOiIiIOo.class) {
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

                public final String I00111O() {
/* 1 */             return this.zze;
                }

                public final i1lIIl01O I001IIilI0O() {
/* 1 */             return this.zzf;
                }

                public final String I001IO000() {
/* 1 */             return this.zzg;
                }

                public final long I001i1O0Ol() {
/* 1 */             return this.zzh;
                }

                public final iI00IlI1oII I001i1lo1io() {
/* 1 */             return this.zzi;
                }

                public final int I001iOo1i0O() {
/* 3 */             return this.zzi.size();
                }

                public final void I001lllioOl(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 1;
/* 10 */            this.zze = str;
                }

                public final void I001lloI(i1lIIl01O i1liil01o) {
/* 1 */             i1liil01o.getClass();
                    this.zzb |= 2;
/* 10 */            this.zzf = i1liil01o;
                }

                public final void I00II0Ol1O0l(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 4;
/* 10 */            this.zzg = str;
                }

                public final void I00II0oii1o(long j) {
                    this.zzb |= 8;
/* 7 */             this.zzh = j;
                }

                public final void I00IO1(llOlO1lIl0l llolo1lil0l) {
/* 1 */             iI00IlI1oII ii00ili1oiiI000o00OoI0I = this.zzi;
/* 8 */             if (!((i1io1OO01oI) ii00ili1oiiI000o00OoI0I).I00iOIl) {
/* 10 */                ii00ili1oiiI000o00OoI0I = io1OllI.I000o00OoI0I(ii00ili1oiiI000o00OoI0I);
/* 14 */                this.zzi = ii00ili1oiiI000o00OoI0I;
                    }
/* 16 */            ii00ili1oiiI000o00OoI0I.add(llolo1lil0l);
                }
            }
