            package p000;

            import android.os.Build;
            
            public final class iiiloiIlo0o extends ii0OoOo10 {
                private static final iiiloiIlo0o zzb;
                private String zzd = "";
                private String zze = "";
                private String zzf = "";
                private String zzg = "";
                private String zzh = "";

                static {
/* 3 */             iiiloiIlo0o iiiloiilo0o = new iiiloiIlo0o();
/* 6 */             zzb = iiiloiilo0o;
/* 10 */            ii0OoOo10.I000lI(iiiloiIlo0o.class, iiiloiilo0o);
                }

                public static iiilo0I1Ool I00111O() {
/* 7 */             return (iiilo0I1Ool) zzb.I0000oI00();
                }

                public static iiiloiIlo0o I001IIilI0O() {
/* 1 */             return zzb;
                }

                public static void I001lIiIIo1O(iiiloiIlo0o iiiloiilo0o) {
/* 1 */             String str = Build.DEVICE;
/* 3 */             str.getClass();
/* 6 */             iiiloiilo0o.zzd = str;
                }

                public static void I001lllioOl(iiiloiIlo0o iiiloiilo0o) {
/* 1 */             String str = Build.MANUFACTURER;
/* 3 */             str.getClass();
/* 6 */             iiiloiilo0o.zzg = str;
                }

                public static void I001lloI(iiiloiIlo0o iiiloiilo0o) {
/* 1 */             String str = Build.BRAND;
/* 3 */             str.getClass();
/* 6 */             iiiloiilo0o.zzh = str;
                }

                public static void I00II0Ol1O0l(iiiloiIlo0o iiiloiilo0o) {
/* 1 */             String str = Build.PRODUCT;
/* 3 */             str.getClass();
/* 6 */             iiiloiilo0o.zze = str;
                }

                public static void I00II0oii1o(iiiloiIlo0o iiiloiilo0o) {
/* 1 */             String str = Build.MODEL;
/* 3 */             str.getClass();
/* 6 */             iiiloiilo0o.zzf = str;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 61 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return new ii0oOi0(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new iiiloiIlo0o();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new iiilo0I1Ool(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final String I001IO000() {
/* 1 */             return this.zzh;
                }

                public final String I001i1O0Ol() {
/* 1 */             return this.zzd;
                }

                public final String I001i1lo1io() {
/* 1 */             return this.zzg;
                }

                public final String I001iOo1i0O() {
/* 1 */             return this.zzf;
                }

                public final String I001l0I00() {
/* 1 */             return this.zze;
                }
            }
