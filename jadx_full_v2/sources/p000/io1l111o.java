            package p000;

            import java.util.List;
            
            public final class io1l111o extends i1oi01OllI {
                private static final io1l111o zzj;
                private static volatile iI0ooO1Oi000 zzk;
                private int zzb;
                private int zze;
                private iI00IlI1oII zzf;
                private iI00IlI1oII zzg;
                private boolean zzh;
                private boolean zzi;

                static {
/* 3 */             io1l111o io1l111oVar = new io1l111o();
/* 6 */             zzj = io1l111oVar;
/* 10 */            i1oi01OllI.I000o00OoI0I(io1l111o.class, io1l111oVar);
                }

                public io1l111o() {
/* 4 */             iI10i0liO ii10i0lio = iI10i0liO.I00ilI0I1;
/* 6 */             this.zzf = ii10i0lio;
/* 8 */             this.zzg = ii10i0lio;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 98 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 92 */                return i1oi01OllI.I000oI1ioi(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", ioOIO1il0i.class, "zzg", ioI0OO10.class, "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new io1l111o();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new io1Ol11oOoi(zzj);
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
                    synchronized (io1l111o.class) {
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

                public final boolean I00111O() {
                    return (this.zzb & 1) != 0;
                }

                public final int I001IIilI0O() {
/* 1 */             return this.zze;
                }

                public final List I001IO000() {
/* 1 */             return this.zzf;
                }

                public final int I001i1O0Ol() {
/* 3 */             return this.zzf.size();
                }

                public final ioOIO1il0i I001i1lo1io(int i) {
/* 7 */             return (ioOIO1il0i) this.zzf.get(i);
                }

                public final iI00IlI1oII I001iOo1i0O() {
/* 1 */             return this.zzg;
                }

                public final int I001l0I00() {
/* 3 */             return this.zzg.size();
                }

                public final ioI0OO10 I001lIiIIo1O(int i) {
/* 7 */             return (ioI0OO10) this.zzg.get(i);
                }

                public final void I001lllioOl(int i, ioOIO1il0i iooio1il0i) {
/* 1 */             iI00IlI1oII ii00ili1oiiI000o00OoI0I = this.zzf;
/* 8 */             if (!((i1io1OO01oI) ii00ili1oiiI000o00OoI0I).I00iOIl) {
/* 10 */                ii00ili1oiiI000o00OoI0I = io1OllI.I000o00OoI0I(ii00ili1oiiI000o00OoI0I);
/* 14 */                this.zzf = ii00ili1oiiI000o00OoI0I;
                    }
/* 16 */            ii00ili1oiiI000o00OoI0I.set(i, iooio1il0i);
                }

                public final void I001lloI(int i, ioI0OO10 ioi0oo10) {
/* 1 */             iI00IlI1oII ii00ili1oiiI000o00OoI0I = this.zzg;
/* 8 */             if (!((i1io1OO01oI) ii00ili1oiiI000o00OoI0I).I00iOIl) {
/* 10 */                ii00ili1oiiI000o00OoI0I = io1OllI.I000o00OoI0I(ii00ili1oiiI000o00OoI0I);
/* 14 */                this.zzg = ii00ili1oiiI000o00OoI0I;
                    }
/* 16 */            ii00ili1oiiI000o00OoI0I.set(i, ioi0oo10);
                }
            }
