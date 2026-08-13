            package p000;
            
            public final class l0i111O0 extends i1oi01OllI {
                private static final l0i111O0 zzg;
                private static volatile iI0ooO1Oi000 zzh;
                private int zzb;
                private int zze;
                private int zzf;

                static {
/* 3 */             l0i111O0 l0i111o0 = new l0i111O0();
/* 6 */             zzg = l0i111o0;
/* 10 */            i1oi01OllI.I000o00OoI0I(l0i111O0.class, l0i111o0);
                }

                public static l0i0l0OoOll I00111O() {
/* 7 */             return (l0i0l0OoOll) zzg.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 91 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 85 */                return i1oi01OllI.I000oI1ioi(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", i1iOOl0o.I000OOo1O, "zzf", i1iOOl0o.I000OiO});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new l0i111O0();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new l0i0l0OoOll(zzg);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zzg;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzh;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (l0i111O0.class) {
                        try {
/* 27 */                    i1oo1lloo = zzh;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzg);
/* 38 */                        zzh = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
/* 44 */            return i1oo1lloo;
                }

                public final int I001IIilI0O() {
                    int i;
/* 1 */             int i2 = this.zze;
/* 4 */             if (i2 != 0) {
/* 6 */                 i = 2;
/* 7 */                 if (i2 != 1) {
/* 10 */                    if (i2 != 2) {
/* 12 */                        i = 4;
/* 13 */                        if (i2 != 3) {
/* 19 */                            i = i2 != 4 ? 0 : 5;
                                }
                            } else {
/* 21 */                        i = 3;
                            }
                        }
                    } else {
/* 23 */                i = 1;
                    }
/* 24 */            if (i == 0) {
/* 3 */                 return 1;
                    }
/* 55 */            return i;
                }

                public final int I001IO000() {
                    int i;
/* 1 */             int i2 = this.zzf;
/* 4 */             if (i2 != 0) {
/* 6 */                 i = 2;
/* 7 */                 if (i2 != 1) {
/* 13 */                    i = i2 != 2 ? 0 : 3;
                        }
                    } else {
/* 15 */                i = 1;
                    }
/* 16 */            if (i == 0) {
/* 3 */                 return 1;
                    }
/* 20 */            return i;
                }

                public final void I001i1O0Ol(int i) {
/* 3 */             this.zze = i - 1;
                    this.zzb |= 1;
                }

                public final void I001i1lo1io(int i) {
/* 3 */             this.zzf = i - 1;
                    this.zzb |= 2;
                }
            }
