            package p000;
            
            public final class lO1Iill100l1 extends i1oi01OllI {
                private static final lO1Iill100l1 zzh;
                private static volatile iI0ooO1Oi000 zzi;
                private int zzb;
                private lO11Ioi0ilo zzf;
                private String zze = "";
                private String zzg = "";

                static {
/* 3 */             lO1Iill100l1 lo1iill100l1 = new lO1Iill100l1();
/* 6 */             zzh = lo1iill100l1;
/* 10 */            i1oi01OllI.I000o00OoI0I(lO1Iill100l1.class, lo1iill100l1);
                }

                public static lO0o0o1O I001IIilI0O() {
/* 7 */             return (lO0o0o1O) zzh.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return i1oi01OllI.I000oI1ioi(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new lO1Iill100l1();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new lO0o0o1O(zzh);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zzh;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzi;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (lO1Iill100l1.class) {
                        try {
/* 27 */                    i1oo1lloo = zzi;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzh);
/* 38 */                        zzi = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
/* 44 */            return i1oo1lloo;
                }

                public final String I00111O() {
/* 1 */             return this.zze;
                }

                public final void I001IO000(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 1;
/* 10 */            this.zze = str;
                }

                public final void I001i1O0Ol(lO11Ioi0ilo lo11ioi0ilo) {
/* 1 */             this.zzf = lo11ioi0ilo;
                    this.zzb |= 2;
                }

                public final void I001i1lo1io(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 4;
/* 10 */            this.zzg = str;
                }
            }
