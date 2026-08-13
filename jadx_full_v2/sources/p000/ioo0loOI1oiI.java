            package p000;
            
            public final class ioo0loOI1oiI extends i1oi01OllI {
                private static final ioo0loOI1oiI zzg;
                private static volatile iI0ooO1Oi000 zzh;
                private int zzb;
                private String zze = "";
                private String zzf = "";

                static {
/* 3 */             ioo0loOI1oiI ioo0looi1oii = new ioo0loOI1oiI();
/* 6 */             zzg = ioo0looi1oii;
/* 10 */            i1oi01OllI.I000o00OoI0I(ioo0loOI1oiI.class, ioo0looi1oii);
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return i1oi01OllI.I000oI1ioi(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new ioo0loOI1oiI();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new ioIiOO11o10(zzg);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zzg;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzh;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (ioo0loOI1oiI.class) {
                        try {
/* 27 */                    i1oo1lloo = zzh;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzg);
/* 38 */                        zzh = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
/* 44 */            return i1oo1lloo;
                }

                public final String I00111O() {
/* 1 */             return this.zze;
                }
            }
