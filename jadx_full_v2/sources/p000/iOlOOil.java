            package p000;
            
            public final class iOlOOil extends ii0OoOo10 {
                private static final iOlOOil zzb;
                private int zzd;
                private ii10IO zze;
                private ii10lIloOOii zzf;
                private String zzg = "";

                static {
/* 3 */             iOlOOil iolooil = new iOlOOil();
/* 6 */             zzb = iolooil;
/* 10 */            ii0OoOo10.I000lI(iOlOOil.class, iolooil);
                }

                public static iOlOOi I00111O() {
/* 7 */             return (iOlOOi) zzb.I0000oI00();
                }

                public static iOlOOil I001IIilI0O(byte[] bArr, ii0II11oi0I ii0ii11oi0i) {
/* 7 */             return (iOlOOil) ii0OoOo10.I000O01llI0(zzb, bArr, ii0ii11oi0i);
                }

                public static void I001iOo1i0O(iOlOOil iolooil, ii10IO ii10io) {
/* 1 */             iolooil.zze = ii10io;
                    iolooil.zzd |= 1;
                }

                public static void I001l0I00(iOlOOil iolooil, ii10lIloOOii ii10liloooii) {
/* 1 */             ii10liloooii.getClass();
/* 4 */             iolooil.zzf = ii10liloooii;
                    iolooil.zzd |= 2;
                }

                public static void I001lIiIIo1O(iOlOOil iolooil, String str) {
                    iolooil.zzd |= 4;
/* 7 */             iolooil.zzg = str;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 59 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return new ii0oOi0(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new iOlOOil();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new iOlOOi(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final ii10IO I001IO000() {
/* 1 */             ii10IO ii10io = this.zze;
                    return ii10io == null ? ii10IO.I001IO000() : ii10io;
                }

                public final ii10lIloOOii I001i1O0Ol() {
/* 1 */             ii10lIloOOii ii10liloooii = this.zzf;
                    return ii10liloooii == null ? ii10lIloOOii.I00111O() : ii10liloooii;
                }

                public final String I001i1lo1io() {
/* 1 */             return this.zzg;
                }

                public final boolean I001lllioOl() {
                    return (this.zzd & 1) != 0;
                }
            }
