            package p000;

            import java.util.ArrayList;
            
            public final class l0lliIlIO extends i1oi01OllI {
                private static final l0lliIlIO zzk;
                private static volatile iI0ooO1Oi000 zzl;
                private int zzb;
                private long zzg;
                private float zzh;
                private double zzi;
                private String zze = "";
                private String zzf = "";
                private iI00IlI1oII zzj = iI10i0liO.I00ilI0I1;

                static {
/* 3 */             l0lliIlIO l0lliilio = new l0lliIlIO();
/* 6 */             zzk = l0lliilio;
/* 10 */            i1oi01OllI.I000o00OoI0I(l0lliIlIO.class, l0lliilio);
                }

                public static l0lOoOo1Ioi I00IO1() {
/* 7 */             return (l0lOoOo1Ioi) zzk.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 98 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 92 */                return i1oi01OllI.I000oI1ioi(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", l0lliIlIO.class});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new l0lliIlIO();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new l0lOoOo1Ioi(zzk);
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
                    synchronized (l0lliIlIO.class) {
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

                public final String I001IIilI0O() {
/* 1 */             return this.zze;
                }

                public final boolean I001IO000() {
                    return (this.zzb & 2) != 0;
                }

                public final String I001i1O0Ol() {
/* 1 */             return this.zzf;
                }

                public final boolean I001i1lo1io() {
                    return (this.zzb & 4) != 0;
                }

                public final long I001iOo1i0O() {
/* 1 */             return this.zzg;
                }

                public final boolean I001l0I00() {
                    return (this.zzb & 8) != 0;
                }

                public final float I001lIiIIo1O() {
/* 1 */             return this.zzh;
                }

                public final boolean I001lllioOl() {
                    return (this.zzb & 16) != 0;
                }

                public final double I001lloI() {
/* 1 */             return this.zzi;
                }

                public final iI00IlI1oII I00II0Ol1O0l() {
/* 1 */             return this.zzj;
                }

                public final int I00II0oii1o() {
/* 3 */             return this.zzj.size();
                }

                public final void I00IO1oi11O(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 1;
/* 10 */            this.zze = str;
                }

                public final void I00IOO(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 2;
/* 10 */            this.zzf = str;
                }

                public final void I00IioO0OiOi() {
                    this.zzb &= -3;
/* 11 */            this.zzf = zzk.zzf;
                }

                public final void I00IlilI0i0i(long j) {
                    this.zzb |= 4;
/* 7 */             this.zzg = j;
                }

                public final void I00Io1lO() {
                    this.zzb &= -5;
/* 9 */             this.zzg = 0L;
                }

                public final void I00Io1o110i(double d) {
                    this.zzb |= 16;
/* 7 */             this.zzi = d;
                }

                public final void I00IoIO0lI() {
                    this.zzb &= -17;
/* 9 */             this.zzi = 0.0d;
                }

                public final void I00IoO0(l0lliIlIO l0lliilio) {
/* 1 */             iI00IlI1oII ii00ili1oiiI000o00OoI0I = this.zzj;
/* 8 */             if (!((i1io1OO01oI) ii00ili1oiiI000o00OoI0I).I00iOIl) {
/* 10 */                ii00ili1oiiI000o00OoI0I = io1OllI.I000o00OoI0I(ii00ili1oiiI000o00OoI0I);
/* 14 */                this.zzj = ii00ili1oiiI000o00OoI0I;
                    }
/* 16 */            ii00ili1oiiI000o00OoI0I.add(l0lliilio);
                }

                public final void I00IoiI(ArrayList arrayList) {
/* 1 */             iI00IlI1oII ii00ili1oiiI000o00OoI0I = this.zzj;
/* 8 */             if (!((i1io1OO01oI) ii00ili1oiiI000o00OoI0I).I00iOIl) {
/* 10 */                ii00ili1oiiI000o00OoI0I = io1OllI.I000o00OoI0I(ii00ili1oiiI000o00OoI0I);
/* 14 */                this.zzj = ii00ili1oiiI000o00OoI0I;
                    }
/* 16 */            i1oIooioiO.I00000oOI(arrayList, ii00ili1oiiI000o00OoI0I);
                }

                public final void I00Iooi00oi() {
/* 3 */             this.zzj = iI10i0liO.I00ilI0I1;
                }
            }
