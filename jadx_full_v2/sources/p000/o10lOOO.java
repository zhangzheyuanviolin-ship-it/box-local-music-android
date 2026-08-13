            package p000;
            
            public final class o10lOOO extends o001IlOi0O implements o0IIiol0oIo {
                private static final o10lOOO zzb;
                private int zzd;
                private iI1I0l zze;
                private iI1I0l zzf;
                private iI1I0l zzg;
                private iI1I0l zzh;

                static {
/* 3 */             o10lOOO o10looo = new o10lOOO();
/* 6 */             zzb = o10looo;
/* 10 */            o001IlOi0O.I0001Ioi1lo(o10lOOO.class, o10looo);
                }

                public static o0oIIo01 I000oI1ioi() {
/* 7 */             return (o0oIIo01) zzb.I000lI();
                }

                public static void I00100l0(o10lOOO o10looo, iI1I0l ii1i0l) {
/* 1 */             o10looo.zze = ii1i0l;
                    o10looo.zzd |= 1;
                }

                public static void I00100o1O0lo(o10lOOO o10looo, iI1I0l ii1i0l) {
/* 1 */             o10looo.zzf = ii1i0l;
                    o10looo.zzd |= 2;
                }

                public static void I0010I0i(o10lOOO o10looo, iI1I0l ii1i0l) {
/* 1 */             o10looo.zzg = ii1i0l;
                    o10looo.zzd |= 4;
                }

                public static void I0010o(o10lOOO o10looo, iI1I0l ii1i0l) {
/* 1 */             o10looo.zzh = ii1i0l;
                    o10looo.zzd |= 8;
                }

                @Override
                public final Object I000iOII(int i, o001IlOi0O o001iloi0o) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 60 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return o001IlOi0O.I0000O(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new o10lOOO();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new o0oIIo01(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
