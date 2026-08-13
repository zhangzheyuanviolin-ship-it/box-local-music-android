            package p000;

            import java.util.List;
            
            public final class ioI0OO10 extends i1oi01OllI {
                private static final ioI0OO10 zzm;
                private static volatile iI0ooO1Oi000 zzn;
                private int zzb;
                private int zze;
                private String zzf = "";
                private iI00IlI1oII zzg = iI10i0liO.I00ilI0I1;
                private boolean zzh;
                private ioIoo01l0o zzi;
                private boolean zzj;
                private boolean zzk;
                private boolean zzl;

                static {
/* 3 */             ioI0OO10 ioi0oo10 = new ioI0OO10();
/* 6 */             zzm = ioi0oo10;
/* 10 */            i1oi01OllI.I000o00OoI0I(ioI0OO10.class, ioi0oo10);
                }

                public static io1o11llO I00IO1() {
/* 7 */             return (io1o11llO) zzm.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 102 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 96 */                return i1oi01OllI.I000oI1ioi(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", ioIO1Io0o.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new ioI0OO10();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new io1o11llO(zzm);
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
                    synchronized (ioI0OO10.class) {
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

                public final boolean I00111O() {
                    return (this.zzb & 1) != 0;
                }

                public final int I001IIilI0O() {
/* 1 */             return this.zze;
                }

                public final String I001IO000() {
/* 1 */             return this.zzf;
                }

                public final List I001i1O0Ol() {
/* 1 */             return this.zzg;
                }

                public final int I001i1lo1io() {
/* 3 */             return this.zzg.size();
                }

                public final ioIO1Io0o I001iOo1i0O(int i) {
/* 7 */             return (ioIO1Io0o) this.zzg.get(i);
                }

                public final boolean I001l0I00() {
                    return (this.zzb & 8) != 0;
                }

                public final ioIoo01l0o I001lIiIIo1O() {
/* 1 */             ioIoo01l0o ioioo01l0o = this.zzi;
                    return ioioo01l0o == null ? ioIoo01l0o.I001lloI() : ioioo01l0o;
                }

                public final boolean I001lllioOl() {
/* 1 */             return this.zzj;
                }

                public final boolean I001lloI() {
/* 1 */             return this.zzk;
                }

                public final boolean I00II0Ol1O0l() {
                    return (this.zzb & 64) != 0;
                }

                public final boolean I00II0oii1o() {
/* 1 */             return this.zzl;
                }

                public final void I00IO1oi11O(String str) {
                    this.zzb |= 2;
/* 7 */             this.zzf = str;
                }

                public final void I00IOO(int i, ioIO1Io0o ioio1io0o) {
/* 1 */             iI00IlI1oII ii00ili1oiiI000o00OoI0I = this.zzg;
/* 8 */             if (!((i1io1OO01oI) ii00ili1oiiI000o00OoI0I).I00iOIl) {
/* 10 */                ii00ili1oiiI000o00OoI0I = io1OllI.I000o00OoI0I(ii00ili1oiiI000o00OoI0I);
/* 14 */                this.zzg = ii00ili1oiiI000o00OoI0I;
                    }
/* 16 */            ii00ili1oiiI000o00OoI0I.set(i, ioio1io0o);
                }
            }
