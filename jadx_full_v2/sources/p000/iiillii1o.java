            package p000;
            
            public final class iiillii1o extends ii0OoOo10 {
                private static final iiillii1o zzb;
                private int zzd;
                private iiiloiIlo0o zze;
                private iiiliI1oIii0 zzf;
                private String zzg = "";

                static {
/* 3 */             iiillii1o iiillii1oVar = new iiillii1o();
/* 6 */             zzb = iiillii1oVar;
/* 10 */            ii0OoOo10.I000lI(iiillii1o.class, iiillii1oVar);
                }

                public static iiillIOI0i1I I001IIilI0O() {
/* 7 */             return (iiillIOI0i1I) zzb.I0000oI00();
                }

                public static void I001i1lo1io(iiillii1o iiillii1oVar, iiiloiIlo0o iiiloiilo0o) {
/* 1 */             iiillii1oVar.zze = iiiloiilo0o;
                    iiillii1oVar.zzd |= 1;
                }

                public static void I001iOo1i0O(iiillii1o iiillii1oVar, iiiliI1oIii0 iiilii1oiii0) {
/* 1 */             iiillii1oVar.zzf = iiilii1oiii0;
                    iiillii1oVar.zzd |= 2;
                }

                public static void I001l0I00(iiillii1o iiillii1oVar, String str) {
/* 1 */             str.getClass();
/* 4 */             iiillii1oVar.zzg = str;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 59 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return new ii0oOi0(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new iiillii1o();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new iiillIOI0i1I(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final iiiliI1oIii0 I00111O() {
/* 1 */             iiiliI1oIii0 iiilii1oiii0 = this.zzf;
                    return iiilii1oiii0 == null ? iiiliI1oIii0.I001IO000() : iiilii1oiii0;
                }

                public final iiiloiIlo0o I001IO000() {
/* 1 */             iiiloiIlo0o iiiloiilo0o = this.zze;
                    return iiiloiilo0o == null ? iiiloiIlo0o.I001IIilI0O() : iiiloiilo0o;
                }

                public final String I001i1O0Ol() {
/* 1 */             return this.zzg;
                }
            }
