            package p000;
            
            public final class i1liOiiOI extends o001IlOi0O implements o0IIiol0oIo {
                private static final i1liOiiOI zzb;
                private int zzd;
                private iI1I0l zze;
                private iI1I0l zzf;
                private iI1I0l zzg;
                private iI1I0l zzh;

                static {
/* 3 */             i1liOiiOI i1lioiioi = new i1liOiiOI();
/* 6 */             zzb = i1lioiioi;
/* 10 */            o001IlOi0O.I0001Ioi1lo(i1liOiiOI.class, i1lioiioi);
                }

                public static i1ii1o0IlIi I000oI1ioi() {
/* 7 */             return (i1ii1o0IlIi) zzb.I000lI();
                }

                public static void I00100o1O0lo(i1liOiiOI i1lioiioi, iI1I0l ii1i0l) {
/* 1 */             i1lioiioi.zze = ii1i0l;
                    i1lioiioi.zzd |= 1;
                }

                public static void I0010I0i(i1liOiiOI i1lioiioi, iI1I0l ii1i0l) {
/* 1 */             i1lioiioi.zzf = ii1i0l;
                    i1lioiioi.zzd |= 2;
                }

                public static void I0010o(i1liOiiOI i1lioiioi, iI1I0l ii1i0l) {
/* 1 */             i1lioiioi.zzg = ii1i0l;
                    i1lioiioi.zzd |= 4;
                }

                public static void I00111O(i1liOiiOI i1lioiioi, iI1I0l ii1i0l) {
/* 1 */             i1lioiioi.zzh = ii1i0l;
                    i1lioiioi.zzd |= 8;
                }

                @Override
                public final Object I000iOII(int i, o001IlOi0O o001iloi0o) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 62 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return o001IlOi0O.I0000O(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 34 */                return new i1liOiiOI();
                    }
/* 12 */            if (i2 == 4) {
/* 28 */                return new i1ii1o0IlIi(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
