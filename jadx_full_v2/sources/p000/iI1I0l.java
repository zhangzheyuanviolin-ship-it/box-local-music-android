            package p000;
            
            public final class iI1I0l extends o001IlOi0O implements o0IIiol0oIo {
                private static final iI1I0l zzb;
                private int zzd;
                private lol1I010 zze = lol1I010.I00iiI;
                private String zzf = "";
                private String zzg = "";

                static {
/* 3 */             iI1I0l ii1i0l = new iI1I0l();
/* 6 */             zzb = ii1i0l;
/* 10 */            o001IlOi0O.I0001Ioi1lo(iI1I0l.class, ii1i0l);
                }

                public static iI0iI1lIo I000oI1ioi() {
/* 7 */             return (iI0iI1lIo) zzb.I000lI();
                }

                public static void I00100l0(iI1I0l ii1i0l, String str) {
                    ii1i0l.zzd |= 2;
/* 7 */             ii1i0l.zzf = str;
                }

                public static void I00100o1O0lo(iI1I0l ii1i0l, String str) {
                    ii1i0l.zzd |= 4;
/* 7 */             ii1i0l.zzg = str;
                }

                @Override
                public final Object I000iOII(int i, o001IlOi0O o001iloi0o) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 58 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 52 */                return o001IlOi0O.I0000O(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new iI1I0l();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new iI0iI1lIo(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
