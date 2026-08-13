            package p000;
            
            public final class lO1i1Iio1OIi extends i1oi01OllI {
                private static final lO1i1Iio1OIi zzl;
                private static volatile iI0ooO1Oi000 zzm;
                private int zzb;
                private String zze = "";
                private i1lIIl01O zzf = i1lIIl01O.I00iiI;
                private String zzg = "";
                private iI00IlI1oII zzh;
                private iI00IlI1oII zzi;
                private boolean zzj;
                private long zzk;

                static {
/* 3 */             lO1i1Iio1OIi lo1i1iio1oii = new lO1i1Iio1OIi();
/* 6 */             zzl = lo1i1iio1oii;
/* 10 */            i1oi01OllI.I000o00OoI0I(lO1i1Iio1OIi.class, lo1i1iio1oii);
                }

                public lO1i1Iio1OIi() {
/* 14 */            iI10i0liO ii10i0lio = iI10i0liO.I00ilI0I1;
/* 16 */            this.zzh = ii10i0lio;
/* 18 */            this.zzi = ii10i0lio;
                }

                public static lO1OiIOIl1IO I001l0I00() {
/* 7 */             return (lO1OiIOIl1IO) zzl.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 100 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 94 */                return i1oi01OllI.I000oI1ioi(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", lO1oIIoolIO.class, "zzi", "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new lO1i1Iio1OIi();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new lO1OiIOIl1IO(zzl);
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
                    synchronized (lO1i1Iio1OIi.class) {
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

                public final String I00111O() {
/* 1 */             return this.zze;
                }

                public final boolean I001IIilI0O() {
                    return (this.zzb & 2) != 0;
                }

                public final i1lIIl01O I001IO000() {
/* 1 */             return this.zzf;
                }

                public final String I001i1O0Ol() {
/* 1 */             return this.zzg;
                }

                public final iI00IlI1oII I001i1lo1io() {
/* 1 */             return this.zzh;
                }

                public final long I001iOo1i0O() {
/* 1 */             return this.zzk;
                }

                public final void I001lIiIIo1O(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 1;
/* 10 */            this.zze = str;
                }

                public final void I001lllioOl(i1lI1O i1li1o) {
/* 1 */             i1li1o.getClass();
                    this.zzb |= 2;
/* 10 */            this.zzf = i1li1o;
                }

                public final void I001lloI(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 4;
/* 10 */            this.zzg = str;
                }

                public final void I00II0Ol1O0l(lO1oIIoolIO lo1oiioolio) {
/* 1 */             iI00IlI1oII ii00ili1oiiI000o00OoI0I = this.zzh;
/* 8 */             if (!((i1io1OO01oI) ii00ili1oiiI000o00OoI0I).I00iOIl) {
/* 10 */                ii00ili1oiiI000o00OoI0I = io1OllI.I000o00OoI0I(ii00ili1oiiI000o00OoI0I);
/* 14 */                this.zzh = ii00ili1oiiI000o00OoI0I;
                    }
/* 16 */            ii00ili1oiiI000o00OoI0I.add(lo1oiioolio);
                }

                public final void I00II0oii1o(String str) {
/* 1 */             str.getClass();
/* 4 */             iI00IlI1oII ii00ili1oiiI000o00OoI0I = this.zzi;
/* 11 */            if (!((i1io1OO01oI) ii00ili1oiiI000o00OoI0I).I00iOIl) {
/* 13 */                ii00ili1oiiI000o00OoI0I = io1OllI.I000o00OoI0I(ii00ili1oiiI000o00OoI0I);
/* 17 */                this.zzi = ii00ili1oiiI000o00OoI0I;
                    }
/* 19 */            ii00ili1oiiI000o00OoI0I.add(str);
                }

                public final void I00IO1(boolean z) {
                    this.zzb |= 8;
/* 7 */             this.zzj = z;
                }

                public final void I00IO1oi11O(long j) {
                    this.zzb |= 16;
/* 7 */             this.zzk = j;
                }
            }
