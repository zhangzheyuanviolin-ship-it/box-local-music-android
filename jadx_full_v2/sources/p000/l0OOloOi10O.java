            package p000;
            
            public final class l0OOloOi10O extends i1oi01OllI {
                private static final l0OOloOi10O zzi;
                private static volatile iI0ooO1Oi000 zzj;
                private int zzb;
                private int zze;
                private l10lii1 zzf;
                private l10lii1 zzg;
                private boolean zzh;

                static {
/* 3 */             l0OOloOi10O l0oolooi10o = new l0OOloOi10O();
/* 6 */             zzi = l0oolooi10o;
/* 10 */            i1oi01OllI.I000o00OoI0I(l0OOloOi10O.class, l0oolooi10o);
                }

                public static l0OIio0i I001lIiIIo1O() {
/* 7 */             return (l0OIio0i) zzi.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 91 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 85 */                return i1oi01OllI.I000oI1ioi(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new l0OOloOi10O();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new l0OIio0i(zzi);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zzi;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzj;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (l0OOloOi10O.class) {
                        try {
/* 27 */                    i1oo1lloo = zzj;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzi);
/* 38 */                        zzj = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
/* 44 */            return i1oo1lloo;
                }

                public final boolean I00111O() {
                    return (this.zzb & 1) != 0;
                }

                public final int I001IIilI0O() {
/* 1 */             return this.zze;
                }

                public final l10lii1 I001IO000() {
/* 1 */             l10lii1 l10lii1Var = this.zzf;
                    return l10lii1Var == null ? l10lii1.I001lloI() : l10lii1Var;
                }

                public final boolean I001i1O0Ol() {
                    return (this.zzb & 4) != 0;
                }

                public final l10lii1 I001i1lo1io() {
/* 1 */             l10lii1 l10lii1Var = this.zzg;
                    return l10lii1Var == null ? l10lii1.I001lloI() : l10lii1Var;
                }

                public final boolean I001iOo1i0O() {
                    return (this.zzb & 8) != 0;
                }

                public final boolean I001l0I00() {
/* 1 */             return this.zzh;
                }

                public final void I001lllioOl(int i) {
                    this.zzb |= 1;
/* 7 */             this.zze = i;
                }

                public final void I001lloI(l10lii1 l10lii1Var) {
/* 1 */             this.zzf = l10lii1Var;
                    this.zzb |= 2;
                }

                public final void I00II0Ol1O0l(l10lii1 l10lii1Var) {
/* 1 */             this.zzg = l10lii1Var;
                    this.zzb |= 4;
                }

                public final void I00II0oii1o(boolean z) {
                    this.zzb |= 8;
/* 7 */             this.zzh = z;
                }
            }
