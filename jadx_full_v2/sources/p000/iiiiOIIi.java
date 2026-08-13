            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class iiiiOIIi extends ii0OoOo10 {
                private static final iiiiOIIi zzb;
                private int zzd;
                private int zze = -1;
                private float zzf = 0.3f;
                private int zzg = 5;
                private float zzh = 0.5f;
                private int zzi = 1;
                private boolean zzj = true;
                private float zzk = 0.85f;
                private boolean zzl = true;
                private float zzm;

                static {
/* 3 */             iiiiOIIi iiiioiii = new iiiiOIIi();
/* 6 */             zzb = iiiioiii;
/* 10 */            ii0OoOo10.I000lI(iiiiOIIi.class, iiiioiii);
                }

                public static iii11Ooi0 I00111O() {
/* 7 */             return (iii11Ooi0) zzb.I0000oI00();
                }

                public static void I001IIilI0O(iiiiOIIi iiiioiii) {
                    iiiioiii.zzd |= 64;
/* 8 */             iiiioiii.zzk = 0.0f;
                }

                public static void I001IO000(iiiiOIIi iiiioiii) {
                    iiiioiii.zzd |= Barcode.FORMAT_ITF;
/* 8 */             iiiioiii.zzl = false;
                }

                public static void I001i1O0Ol(iiiiOIIi iiiioiii, int i) {
                    iiiioiii.zzd |= 4;
/* 7 */             iiiioiii.zzg = i;
                }

                public static void I001i1lo1io(iiiiOIIi iiiioiii) {
                    iiiioiii.zzd |= 8;
/* 10 */            iiiioiii.zzh = 0.2f;
                }

                public static void I001iOo1i0O(iiiiOIIi iiiioiii) {
/* 2 */             iiiioiii.zzi = 2;
                    iiiioiii.zzd |= 16;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 73 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 68 */                return new ii0oOi0(zzb, "\u0004\t\u0000\u0001\u0001\u0011\t\u0000\u0000\u0000\u0001င\u0000\u0005ခ\u0001\u0006င\u0002\u0007ခ\u0003\f᠌\u0004\u000eဇ\u0005\u000fခ\u0006\u0010ဇ\u0007\u0011ခ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", iiII1i00iIOo.I001i1O0Ol, "zzj", "zzk", "zzl", "zzm"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new iiiiOIIi();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new iii11Ooi0(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
