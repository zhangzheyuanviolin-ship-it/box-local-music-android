            package p000;
            
            public final class ioIOiI extends ii0OoOo10 {
                private static final ioIOiI zzb;
                private int zzd;
                private int zze = 1;
                private boolean zzf;

                static {
/* 3 */             ioIOiI ioioii = new ioIOiI();
/* 6 */             zzb = ioioii;
/* 10 */            ii0OoOo10.I000lI(ioIOiI.class, ioioii);
                }

                public static ioIIlOOoo I00111O() {
/* 7 */             return (ioIIlOOoo) zzb.I0000oI00();
                }

                public static void I001IIilI0O(ioIOiI ioioii) {
                    ioioii.zzd |= 2;
/* 8 */             ioioii.zzf = true;
                }

                public static void I001IO000(ioIOiI ioioii, int i) {
/* 3 */             ioioii.zze = i - 1;
                    ioioii.zzd |= 1;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 59 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return new ii0oOi0(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", ili0olOo.I000iOII, "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new ioIOiI();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new ioIIlOOoo(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
