            package p000;
            
            public final class l01l00o extends i1oi01OllI {
                private static final l01l00o zzj;
                private static volatile iI0ooO1Oi000 zzk;
                private int zzb;
                private int zzh;
                private String zze = "";
                private String zzf = "";
                private String zzg = "";
                private String zzi = "";

                static {
/* 3 */             l01l00o l01l00oVar = new l01l00o();
/* 6 */             zzj = l01l00oVar;
/* 10 */            i1oi01OllI.I000o00OoI0I(l01l00o.class, l01l00oVar);
                }

                public static l01l00o I001IO000() {
/* 1 */             return zzj;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return i1oi01OllI.I000oI1ioi(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new l01l00o();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new ioIiOO11o10(zzj);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzj;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzk;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (l01l00o.class) {
                        try {
/* 27 */                    i1oo1lloo = zzk;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzj);
/* 38 */                        zzk = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return i1oo1lloo;
                }

                public final int I00111O() {
/* 1 */             return this.zzh;
                }

                public final String I001IIilI0O() {
/* 1 */             return this.zzi;
                }
            }
