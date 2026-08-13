            package p000;

            import java.util.List;
            
            public final class lOlIllO1 extends i1oi01OllI {
                private static final i1ooiOol1Il zzl = new o0llIi(26);
                private static final lOlIllO1 zzq;
                private static volatile iI0ooO1Oi000 zzr;
                private int zzb;
                private boolean zzf;
                private long zzh;
                private iI00IlI1oII zzi;
                private iI00IlI1oII zzj;
                private i1oo10I0OO zzk;
                private lOloI000o0 zzm;
                private boolean zzn;
                private boolean zzo;
                private lOl0ioO11 zzp;
                private i1lIIl01O zze = i1lIIl01O.I00iiI;
                private String zzg = "";

                static {
/* 12 */            lOlIllO1 lolillo1 = new lOlIllO1();
/* 15 */            zzq = lolillo1;
/* 19 */            i1oi01OllI.I000o00OoI0I(lOlIllO1.class, lolillo1);
                }

                public lOlIllO1() {
/* 12 */            iI10i0liO ii10i0lio = iI10i0liO.I00ilI0I1;
/* 14 */            this.zzi = ii10i0lio;
/* 16 */            this.zzj = ii10i0lio;
/* 20 */            this.zzk = i1oiI1lIo.I00ilI0I1;
                }

                public static lOlI0O1 I00IO1oi11O() {
/* 7 */             return (lOlI0O1) zzq.I000OOo1O();
                }

                public static lOlIllO1 I00IOO() {
/* 1 */             return zzq;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 108 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 102 */               return i1oi01OllI.I000oI1ioi(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", i1iOOl0o.I00000oOI, "zzm", "zzn", "zzo", "zzp"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new lOlIllO1();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new lOlI0O1(zzq);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzq;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzr;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (lOlIllO1.class) {
                        try {
/* 27 */                    i1oo1lloo = zzr;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzq);
/* 38 */                        zzr = i1oo1lloo;
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

                public final i1lIIl01O I001IIilI0O() {
/* 1 */             return this.zze;
                }

                public final boolean I001IO000() {
/* 1 */             return this.zzf;
                }

                public final String I001i1O0Ol() {
/* 1 */             return this.zzg;
                }

                public final long I001i1lo1io() {
/* 1 */             return this.zzh;
                }

                public final iI00IlI1oII I001iOo1i0O() {
/* 1 */             return this.zzi;
                }

                public final iI00IlI1oII I001l0I00() {
/* 1 */             return this.zzj;
                }

                public final List I001lIiIIo1O() {
/* 7 */             return new i1ool1Iooi(this.zzk, zzl);
                }

                public final boolean I001lllioOl() {
                    return (this.zzb & 16) != 0;
                }

                public final lOloI000o0 I001lloI() {
/* 1 */             lOloI000o0 loloi000o0 = this.zzm;
                    return loloi000o0 == null ? lOloI000o0.I001IO000() : loloi000o0;
                }

                public final boolean I00II0Ol1O0l() {
/* 1 */             return this.zzn;
                }

                public final boolean I00II0oii1o() {
/* 1 */             return this.zzo;
                }

                public final lOl0ioO11 I00IO1() {
/* 1 */             lOl0ioO11 lol0ioo11 = this.zzp;
                    return lol0ioo11 == null ? lOl0ioO11.I001IIilI0O() : lol0ioo11;
                }

                public final void I00IioO0OiOi(long j) {
                    this.zzb |= 8;
/* 7 */             this.zzh = j;
                }
            }
