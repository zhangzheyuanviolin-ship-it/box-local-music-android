            package p000;
            
            public final class ii10IO extends ii0OoOo10 {
                private static final ii10IO zzb;
                private long zzd;
                private int zze;

                static {
/* 3 */             ii10IO ii10io = new ii10IO();
/* 6 */             zzb = ii10io;
/* 10 */            ii0OoOo10.I000lI(ii10IO.class, ii10io);
                }

                public static ii101o I001IIilI0O() {
/* 7 */             return (ii101o) zzb.I0000oI00();
                }

                public static ii10IO I001IO000() {
/* 1 */             return zzb;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 55 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 50 */                return new ii0oOi0(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new ii10IO();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new ii101o(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final long I00111O() {
/* 1 */             return this.zzd;
                }
            }
