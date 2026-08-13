            package p000;
            
            public final class l0IoOi01liI extends ii0OoOo10 {
                private static final l0IoOi01liI zzb;
                private int zzd;
                private String zze = "";
                private float zzf;

                static {
/* 3 */             l0IoOi01liI l0iooi01lii = new l0IoOi01liI();
/* 6 */             zzb = l0iooi01lii;
/* 10 */            ii0OoOo10.I000lI(l0IoOi01liI.class, l0iooi01lii);
                }

                public static l0IoI0iII1 I00111O() {
/* 7 */             return (l0IoI0iII1) zzb.I0000oI00();
                }

                public static void I001IIilI0O(l0IoOi01liI l0iooi01lii) {
                    l0iooi01lii.zzd |= 1;
/* 9 */             l0iooi01lii.zze = "/m/0bl9f";
                }

                public static void I001IO000(l0IoOi01liI l0iooi01lii) {
                    l0iooi01lii.zzd |= 2;
/* 10 */            l0iooi01lii.zzf = 0.46f;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 57 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 52 */                return new ii0oOi0(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"zzd", "zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new l0IoOi01liI();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new l0IoI0iII1(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
