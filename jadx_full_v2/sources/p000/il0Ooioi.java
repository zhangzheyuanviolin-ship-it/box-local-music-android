            package p000;
            
            public final class il0Ooioi extends ii0OoOo10 {
                private static final il0Ooioi zzb;
                private int zzd;
                private Object zzf;
                private int zze = 0;
                private String zzg = "";

                static {
/* 3 */             il0Ooioi il0ooioi = new il0Ooioi();
/* 6 */             zzb = il0ooioi;
/* 10 */            ii0OoOo10.I000lI(il0Ooioi.class, il0ooioi);
                }

                public static iiooIll0i I00111O() {
/* 7 */             return (iiooIll0i) zzb.I0000oI00();
                }

                public static void I001IIilI0O(il0Ooioi il0ooioi) {
                    il0ooioi.zzd |= 1;
/* 9 */             il0ooioi.zzg = "MobileObjectLocalizerV3_1TfLiteClient";
                }

                public static void I001IO000(il0Ooioi il0ooioi) {
/* 2 */             il0ooioi.zze = 2;
/* 11 */            il0ooioi.zzf = 300000L;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 61 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return new ii0oOi0(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", il0IoO1oIOO.class});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new il0Ooioi();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new iiooIll0i(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
