            package p000;
            
            public final class l0o0ioiIIo extends i1oi01OllI {
                private static final l0o0ioiIIo zzh;
                private static volatile iI0ooO1Oi000 zzi;
                private int zzb;
                private String zze = "";
                private String zzf = "";
                private l0IoO11IIIi zzg;

                static {
/* 3 */             l0o0ioiIIo l0o0ioiiio = new l0o0ioiIIo();
/* 6 */             zzh = l0o0ioiiio;
/* 10 */            i1oi01OllI.I000o00OoI0I(l0o0ioiIIo.class, l0o0ioiiio);
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return i1oi01OllI.I000oI1ioi(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new l0o0ioiIIo();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new ioIiOO11o10(zzh);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zzh;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzi;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (l0o0ioiIIo.class) {
                        try {
/* 27 */                    i1oo1lloo = zzi;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzh);
/* 38 */                        zzi = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
/* 44 */            return i1oo1lloo;
                }
            }
