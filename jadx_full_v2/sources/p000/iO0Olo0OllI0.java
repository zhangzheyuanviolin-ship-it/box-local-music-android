            package p000;
            
            public final class iO0Olo0OllI0 extends illOil implements ioOI1Io1oo {
                private static final iO0Olo0OllI0 zzb;
                private int zzd;
                private int zzf;
                private boolean zzh;
                private byte zzi = 2;
                private String zze = "";
                private String zzg = "";

                static {
/* 3 */             iO0Olo0OllI0 io0olo0olli0 = new iO0Olo0OllI0();
/* 6 */             zzb = io0olo0olli0;
/* 10 */            illOil.I000OiO(iO0Olo0OllI0.class, io0olo0olli0);
                }

                public static iO0Olo0OllI0 I00100l0() {
/* 1 */             return zzb;
                }

                @Override
                public final Object I000oI1ioi(int i, illOil illoil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 72 */                return Byte.valueOf(this.zzi);
                    }
/* 6 */             if (i2 == 2) {
/* 65 */                return illOil.I000O01llI0(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", iI1Il0l1O.I0000O, "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 41 */                return new iO0Olo0OllI0();
                    }
/* 12 */            if (i2 == 4) {
/* 35 */                return new l1o0IOI0OO(8, zzb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzb;
                    }
/* 22 */            this.zzi = illoil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }

                public final String I00100o1O0lo() {
/* 1 */             return this.zzg;
                }

                public final String I0010I0i() {
/* 1 */             return this.zze;
                }

                public final int I0010o() {
                    int i;
/* 1 */             int i2 = this.zzf;
/* 4 */             if (i2 != 0) {
/* 6 */                 i = 2;
/* 7 */                 if (i2 != 1) {
/* 10 */                    if (i2 != 2) {
/* 12 */                        i = 4;
/* 13 */                        if (i2 != 3) {
/* 19 */                            i = i2 != 4 ? 0 : 5;
                                }
                            } else {
/* 21 */                        i = 3;
                            }
                        }
                    } else {
/* 23 */                i = 1;
                    }
/* 24 */            if (i == 0) {
/* 3 */                 return 1;
                    }
/* 29 */            return i;
                }
            }
