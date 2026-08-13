            package p000;
            
            public final class lIOioi0II0o extends o001IlOi0O implements o0IIiol0oIo {
                private static final lIOioi0II0o zzb;
                private int zzd;
                private iI1I0l zze;
                private iI1I0l zzf;

                static {
/* 3 */             lIOioi0II0o lioioi0ii0o = new lIOioi0II0o();
/* 6 */             zzb = lioioi0ii0o;
/* 10 */            o001IlOi0O.I0001Ioi1lo(lIOioi0II0o.class, lioioi0ii0o);
                }

                public static l1olI0l1 I000oI1ioi() {
/* 7 */             return (l1olI0l1) zzb.I000lI();
                }

                public static void I00100l0(lIOioi0II0o lioioi0ii0o, iI1I0l ii1i0l) {
/* 1 */             lioioi0ii0o.zze = ii1i0l;
                    lioioi0ii0o.zzd |= 1;
                }

                public static void I00100o1O0lo(lIOioi0II0o lioioi0ii0o, iI1I0l ii1i0l) {
/* 1 */             lioioi0ii0o.zzf = ii1i0l;
                    lioioi0ii0o.zzd |= 2;
                }

                @Override
                public final Object I000iOII(int i, o001IlOi0O o001iloi0o) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 56 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 50 */                return o001IlOi0O.I0000O(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new lIOioi0II0o();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new l1olI0l1(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
