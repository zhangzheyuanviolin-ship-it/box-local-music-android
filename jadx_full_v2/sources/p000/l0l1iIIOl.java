            package p000;

            import java.util.List;
            
            public final class l0l1iIIOl extends i1oi01OllI {
                private static final l0l1iIIOl zzm;
                private static volatile iI0ooO1Oi000 zzn;
                private int zzb;
                private iI00IlI1oII zze = iI10i0liO.I00ilI0I1;
                private String zzf = "";
                private long zzg;
                private long zzh;
                private int zzi;
                private long zzj;
                private long zzk;
                private long zzl;

                static {
/* 3 */             l0l1iIIOl l0l1iiiol = new l0l1iIIOl();
/* 6 */             zzm = l0l1iiiol;
/* 10 */            i1oi01OllI.I000o00OoI0I(l0l1iIIOl.class, l0l1iiiol);
                }

                public static l0l0O000 I00IlilI0i0i() {
/* 7 */             return (l0l0O000) zzm.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 102 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 96 */                return i1oi01OllI.I000oI1ioi(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", l0lliIlIO.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new l0l1iIIOl();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new l0l0O000(zzm);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzm;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzn;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (l0l1iIIOl.class) {
                        try {
/* 27 */                    i1oo1lloo = zzn;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzm);
/* 38 */                        zzn = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return i1oo1lloo;
                }

                public final void I00111O(long j) {
                    this.zzb |= 64;
/* 7 */             this.zzl = j;
                }

                public final void I001IIilI0O() {
/* 1 */             iI00IlI1oII ii00ili1oii = this.zze;
/* 8 */             if (((i1io1OO01oI) ii00ili1oii).I00iOIl) {
/* 20 */                return;
                    }
/* 14 */            this.zze = io1OllI.I000o00OoI0I(ii00ili1oii);
                }

                public final List I001IO000() {
/* 1 */             return this.zze;
                }

                public final int I001i1O0Ol() {
/* 3 */             return this.zze.size();
                }

                public final l0lliIlIO I001i1lo1io(int i) {
/* 7 */             return (l0lliIlIO) this.zze.get(i);
                }

                public final String I001iOo1i0O() {
/* 1 */             return this.zzf;
                }

                public final boolean I001l0I00() {
                    return (this.zzb & 2) != 0;
                }

                public final long I001lIiIIo1O() {
/* 1 */             return this.zzg;
                }

                public final boolean I001lllioOl() {
                    return (this.zzb & 4) != 0;
                }

                public final long I001lloI() {
/* 1 */             return this.zzh;
                }

                public final boolean I00II0Ol1O0l() {
                    return (this.zzb & 8) != 0;
                }

                public final int I00II0oii1o() {
/* 1 */             return this.zzi;
                }

                public final boolean I00IO1() {
                    return (this.zzb & 32) != 0;
                }

                public final long I00IO1oi11O() {
/* 1 */             return this.zzk;
                }

                public final boolean I00IOO() {
                    return (this.zzb & 64) != 0;
                }

                public final long I00IioO0OiOi() {
/* 1 */             return this.zzl;
                }

                public final void I00Io1lO(int i, l0lliIlIO l0lliilio) {
/* 1 */             I001IIilI0O();
/* 6 */             this.zze.set(i, l0lliilio);
                }

                public final void I00Io1o110i(l0lliIlIO l0lliilio) {
/* 1 */             l0lliilio.getClass();
/* 4 */             I001IIilI0O();
/* 9 */             this.zze.add(l0lliilio);
                }

                public final void I00IoIO0lI(Iterable iterable) {
/* 1 */             I001IIilI0O();
/* 6 */             i1oIooioiO.I00000oOI(iterable, this.zze);
                }

                public final void I00IoO0() {
/* 3 */             this.zze = iI10i0liO.I00ilI0I1;
                }

                public final void I00IoiI(int i) {
/* 1 */             I001IIilI0O();
/* 6 */             this.zze.remove(i);
                }

                public final void I00Iooi00oi(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 1;
/* 10 */            this.zzf = str;
                }

                public final void I00O0i0ii(long j) {
                    this.zzb |= 2;
/* 7 */             this.zzg = j;
                }

                public final void I00O0o1oo(long j) {
                    this.zzb |= 4;
/* 7 */             this.zzh = j;
                }

                public final void I00O10llo(long j) {
                    this.zzb |= 16;
/* 7 */             this.zzj = j;
                }

                public final void I00OI1(long j) {
                    this.zzb |= 32;
/* 7 */             this.zzk = j;
                }
            }
