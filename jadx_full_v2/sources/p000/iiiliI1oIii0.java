            package p000;

            import android.os.Build;
            
            public final class iiiliI1oIii0 extends ii0OoOo10 {
                private static final iiiliI1oIii0 zzb;
                private int zzf;
                private String zzd = "";
                private String zze = "";
                private String zzg = "";

                static {
/* 3 */             iiiliI1oIii0 iiilii1oiii0 = new iiiliI1oIii0();
/* 6 */             zzb = iiilii1oiii0;
/* 10 */            ii0OoOo10.I000lI(iiiliI1oIii0.class, iiilii1oiii0);
                }

                public static iiilOo0lill I001IIilI0O() {
/* 7 */             return (iiilOo0lill) zzb.I0000oI00();
                }

                public static iiiliI1oIii0 I001IO000() {
/* 1 */             return zzb;
                }

                public static void I001l0I00(iiiliI1oIii0 iiilii1oiii0) {
/* 1 */             String str = Build.VERSION.SDK;
/* 3 */             str.getClass();
/* 6 */             iiilii1oiii0.zzd = str;
                }

                public static void I001lIiIIo1O(iiiliI1oIii0 iiilii1oiii0) {
/* 1 */             String str = Build.TYPE;
/* 3 */             str.getClass();
/* 6 */             iiilii1oiii0.zze = str;
                }

                public static void I001lloI(iiiliI1oIii0 iiilii1oiii0) {
/* 1 */             String str = Build.ID;
/* 3 */             str.getClass();
/* 6 */             iiilii1oiii0.zzg = str;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 59 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return new ii0oOi0(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new iiiliI1oIii0();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new iiilOo0lill(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final int I00111O() {
/* 1 */             return this.zzf;
                }

                public final String I001i1O0Ol() {
/* 1 */             return this.zzg;
                }

                public final String I001i1lo1io() {
/* 1 */             return this.zze;
                }

                public final String I001iOo1i0O() {
/* 1 */             return this.zzd;
                }
            }
