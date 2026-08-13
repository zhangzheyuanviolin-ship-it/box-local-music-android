            package p000;
            
            public final class lO11Ioi0ilo extends i1oi01OllI {
                private static final lO11Ioi0ilo zzg;
                private static volatile iI0ooO1Oi000 zzh;
                private int zzb;
                private int zze;
                private int zzf;

                static {
/* 3 */             lO11Ioi0ilo lo11ioi0ilo = new lO11Ioi0ilo();
/* 6 */             zzg = lo11ioi0ilo;
/* 10 */            i1oi01OllI.I000o00OoI0I(lO11Ioi0ilo.class, lo11ioi0ilo);
                }

                public static lO10IO1OI1O1 I00111O() {
/* 7 */             return (lO10IO1OI1O1) zzg.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return i1oi01OllI.I000oI1ioi(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new lO11Ioi0ilo();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new lO10IO1OI1O1(zzg);
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
                    synchronized (lO11Ioi0ilo.class) {
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

                public final void I001IIilI0O(int i) {
/* 3 */             this.zze = i - 2;
                    this.zzb |= 1;
                }

                public final void I001IO000(int i) {
/* 2 */             if (i == 1) {
/* 17 */                I000II.I000iOII("Can't get the number of an unknown enum value.");
                    } else {
/* 6 */                 this.zzf = i - 2;
                        this.zzb |= 2;
                    }
                }
            }
