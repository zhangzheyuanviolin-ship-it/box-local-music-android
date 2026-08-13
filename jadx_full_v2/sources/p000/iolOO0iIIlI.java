            package p000;
            
            public final class iolOO0iIIlI extends ii0OoOo10 {
                private static final iolOO0iIIlI zzb;
                private int zzd;
                private boolean zze;
                private String zzf = "";

                static {
/* 3 */             iolOO0iIIlI ioloo0iiili = new iolOO0iIIlI();
/* 6 */             zzb = ioloo0iiili;
/* 10 */            ii0OoOo10.I000lI(iolOO0iIIlI.class, ioloo0iiili);
                }

                public static io0olIo0i I00111O() {
/* 7 */             return (io0olIo0i) zzb.I0000oI00();
                }

                public static void I001IIilI0O(iolOO0iIIlI ioloo0iiili) {
                    ioloo0iiili.zzd |= 1;
/* 7 */             ioloo0iiili.zze = true;
                }

                public static void I001IO000(iolOO0iIIlI ioloo0iiili, String str) {
/* 1 */             str.getClass();
                    ioloo0iiili.zzd |= 2;
/* 10 */            ioloo0iiili.zzf = str;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 57 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 52 */                return new ii0oOi0(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new iolOO0iIIlI();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new io0olIo0i(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
