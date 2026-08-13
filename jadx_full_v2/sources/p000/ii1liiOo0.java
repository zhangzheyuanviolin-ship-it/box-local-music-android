            package p000;
            
            public final class ii1liiOo0 extends ii0OoOo10 {
                private static final ii1liiOo0 zzb;
                private int zzd;
                private ii1lOIiiI0 zze;
                private ii1lOIiiI0 zzf;
                private boolean zzg;

                static {
/* 3 */             ii1liiOo0 ii1liioo0 = new ii1liiOo0();
/* 6 */             zzb = ii1liioo0;
/* 10 */            ii0OoOo10.I000lI(ii1liiOo0.class, ii1liioo0);
                }

                public static ii1liiOo0 I001IIilI0O() {
/* 1 */             return zzb;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 59 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return new ii0oOi0(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new ii1liiOo0();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new ii11il(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final ii1lOIiiI0 I00111O() {
/* 1 */             ii1lOIiiI0 ii1loiiii0 = this.zze;
                    return ii1loiiii0 == null ? ii1lOIiiI0.I00111O() : ii1loiiii0;
                }

                public final boolean I001IO000() {
/* 1 */             return this.zzg;
                }

                public final boolean I001i1O0Ol() {
                    return (this.zzd & 2) != 0;
                }

                public final boolean I001i1lo1io() {
                    return (this.zzd & 1) != 0;
                }
            }
