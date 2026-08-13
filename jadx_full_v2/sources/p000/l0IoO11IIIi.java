            package p000;
            
            public final class l0IoO11IIIi extends i1oi01OllI {
                private static final l0IoO11IIIi zzl;
                private static volatile iI0ooO1Oi000 zzm;
                private int zzb;
                private String zze = "";
                private String zzf = "";
                private String zzg = "";
                private String zzh = "";
                private String zzi = "";
                private String zzj = "";
                private String zzk = "";

                static {
/* 3 */             l0IoO11IIIi l0ioo11iiii = new l0IoO11IIIi();
/* 6 */             zzl = l0ioo11iiii;
/* 10 */            i1oi01OllI.I000o00OoI0I(l0IoO11IIIi.class, l0ioo11iiii);
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 98 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 92 */                return i1oi01OllI.I000oI1ioi(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new l0IoO11IIIi();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new ioIiOO11o10(zzl);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzl;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzm;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (l0IoO11IIIi.class) {
                        try {
/* 27 */                    i1oo1lloo = zzm;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzl);
/* 38 */                        zzm = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return i1oo1lloo;
                }
            }
