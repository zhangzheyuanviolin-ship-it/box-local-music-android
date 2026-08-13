            package p000;
            
            public final class ii1lOIiiI0 extends ii0OoOo10 {
                private static final ii1lOIiiI0 zzb;
                private int zzd;
                private int zze;
                private int zzf;
                private int zzg;
                private int zzh;

                static {
/* 3 */             ii1lOIiiI0 ii1loiiii0 = new ii1lOIiiI0();
/* 6 */             zzb = ii1loiiii0;
/* 10 */            ii0OoOo10.I000lI(ii1lOIiiI0.class, ii1loiiii0);
                }

                public static ii1lOIiiI0 I00111O() {
/* 1 */             return zzb;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 61 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return new ii0oOi0(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new ii1lOIiiI0();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new ii11il(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final boolean I001IIilI0O() {
                    return (this.zzd & 1) != 0;
                }

                public final boolean I001IO000() {
                    return (this.zzd & 2) != 0;
                }
            }
