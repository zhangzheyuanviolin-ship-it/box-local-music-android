            package p000;
            
            public final class l1I1OlIIlO extends i1oi01OllI {
                private static final l1I1OlIIlO zzh;
                private static volatile iI0ooO1Oi000 zzi;
                private int zzb;
                private int zze;
                private int zzf;
                private int zzg;

                static {
/* 3 */             l1I1OlIIlO l1i1oliilo = new l1I1OlIIlO();
/* 6 */             zzh = l1i1oliilo;
/* 10 */            i1oi01OllI.I000o00OoI0I(l1I1OlIIlO.class, l1i1oliilo);
                }

                public static l1110Ol01l10 I001IIilI0O() {
/* 7 */             return (l1110Ol01l10) zzh.I000OOo1O();
                }

                public static l1I1OlIIlO I001IO000() {
/* 1 */             return zzh;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 96 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return i1oi01OllI.I000oI1ioi(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", i1iOOl0o.I000oI1ioi, "zzf", i1iOOl0o.I000lI, "zzg", i1iOOl0o.I000o00OoI0I});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new l1I1OlIIlO();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new l1110Ol01l10(zzh);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzh;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzi;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (l1I1OlIIlO.class) {
                        try {
/* 27 */                    i1oo1lloo = zzi;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzh);
/* 38 */                        zzi = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return i1oo1lloo;
                }

                public final int I00111O() {
/* 3 */             int iI00000oOI = io1OllI.I00000oOI(this.zzf);
/* 7 */             if (iI00000oOI == 0) {
/* 9 */                 return 1;
                    }
/* 20 */            return iI00000oOI;
                }

                public final void I001i1O0Ol(int i) {
/* 5 */             this.zzf = io1OllI.I0000Il00O(i);
                    this.zzb |= 2;
                }

                public final int I001i1lo1io() {
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

                /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[PHI: r2
                  0x0017: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I001iOo1i0O() {
                    int i;
/* 1 */             int i2 = this.zzg;
/* 4 */             if (i2 != 0) {
/* 6 */                 i = 2;
/* 7 */                 if (i2 != 1) {
/* 9 */                     int i3 = 3;
/* 10 */                    if (i2 != 2) {
/* 12 */                        i = 4;
/* 13 */                        if (i2 != 3) {
/* 15 */                            i3 = 5;
/* 24 */                            i = i2 != 4 ? i2 != 5 ? 0 : 6 : i3;
                                }
                            }
                        }
                    } else {
/* 26 */                i = 1;
                    }
/* 27 */            if (i == 0) {
/* 3 */                 return 1;
                    }
/* 55 */            return i;
                }

                public final void I001l0I00(int i) {
/* 3 */             this.zze = i - 1;
                    this.zzb |= 1;
                }

                public final void I001lIiIIo1O(int i) {
/* 3 */             this.zzg = i - 1;
                    this.zzb |= 4;
                }
            }
