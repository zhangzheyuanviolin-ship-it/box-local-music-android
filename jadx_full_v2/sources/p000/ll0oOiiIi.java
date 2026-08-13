            package p000;
            
            public final class ll0oOiiIi extends ilOl10 {
                private static final ll0oOiiIi zzb;
                private int zzd;
                private boolean zze;
                private String zzf = "";
                private String zzg = "";
                private int zzh;
                private float zzi;
                private int zzj;

                static {
/* 3 */             ll0oOiiIi ll0ooiiii = new ll0oOiiIi();
/* 6 */             zzb = ll0ooiiii;
/* 10 */            ilOl10.I000OOo1O(ll0oOiiIi.class, ll0ooiiii);
                }

                public static liii11Oi0O I0010I0i() {
/* 10 */            return (liii11Oi0O) ((ilOI1I0llIi) zzb.I000lI(5));
                }

                public static void I001IIilI0O(ll0oOiiIi ll0ooiiii, boolean z) {
                    ll0ooiiii.zzd |= 1;
/* 7 */             ll0ooiiii.zze = z;
                }

                public static void I001IO000(ll0oOiiIi ll0ooiiii, float f) {
                    ll0ooiiii.zzd |= 16;
/* 7 */             ll0ooiiii.zzi = f;
                }

                public static void I001i1O0Ol(ll0oOiiIi ll0ooiiii, int i) {
                    ll0ooiiii.zzd |= 32;
/* 7 */             ll0ooiiii.zzj = i;
                }

                public static void I001i1lo1io(ll0oOiiIi ll0ooiiii, String str) {
                    ll0ooiiii.zzd |= 2;
/* 7 */             ll0ooiiii.zzf = str;
                }

                public static void I001iOo1i0O(ll0oOiiIi ll0ooiiii, String str) {
/* 1 */             str.getClass();
                    ll0ooiiii.zzd |= 4;
/* 10 */            ll0ooiiii.zzg = str;
                }

                public static void I001l0I00(ll0oOiiIi ll0ooiiii, int i) {
                    ll0ooiiii.zzd |= 8;
/* 7 */             ll0ooiiii.zzh = i;
                }

                @Override
                public final Object I000lI(int i) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 64 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 58 */                return ilOl10.I000II(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ခ\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new ll0oOiiIi();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new liii11Oi0O(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final float I000oI1ioi() {
/* 1 */             return this.zzi;
                }

                public final int I00100l0() {
/* 1 */             return this.zzj;
                }

                public final int I00100o1O0lo() {
/* 1 */             return this.zzh;
                }

                public final String I0010o() {
/* 1 */             return this.zzg;
                }

                public final String I00111O() {
/* 1 */             return this.zzf;
                }

                public final boolean I001lIiIIo1O() {
/* 1 */             return this.zze;
                }
            }
