            package p000;
            
            public final class l0IIOo extends o001IlOi0O implements o0IIiol0oIo {
                private static final l0IIOo zzb;
                private int zzd;
                private int zze;
                private int zzf;
                private int zzg;
                private int zzh;
                private boolean zzi;
                private long zzj;
                private String zzk = "";

                static {
/* 3 */             l0IIOo l0iioo = new l0IIOo();
/* 6 */             zzb = l0iioo;
/* 10 */            o001IlOi0O.I0001Ioi1lo(l0IIOo.class, l0iioo);
                }

                public static iolIo0O01 I000oI1ioi() {
/* 7 */             return (iolIo0O01) zzb.I000lI();
                }

                public static void I00100l0(l0IIOo l0iioo, int i) {
                    l0iioo.zzd |= 1;
/* 7 */             l0iioo.zze = i;
                }

                public static void I00100o1O0lo(l0IIOo l0iioo, long j) {
                    l0iioo.zzd |= 32;
/* 7 */             l0iioo.zzj = j;
                }

                public static void I0010I0i(l0IIOo l0iioo, int i) {
                    l0iioo.zzd |= 2;
/* 7 */             l0iioo.zzf = i;
                }

                public static void I0010o(l0IIOo l0iioo, int i) {
/* 3 */             l0iioo.zzg = i - 1;
                    l0iioo.zzd |= 4;
                }

                public static void I00111O(l0IIOo l0iioo, int i) {
/* 3 */             l0iioo.zzh = i - 1;
                    l0iioo.zzd |= 8;
                }

                @Override
                public final Object I000iOII(int i, o001IlOi0O o001iloi0o) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 70 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 64 */                return o001IlOi0O.I0000O(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", i1IOi0lOi1II.I0000O, "zzh", i1IOi0lOi1II.I0000oI00, "zzi", "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new l0IIOo();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new iolIo0O01(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
