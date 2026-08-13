            package p000;

            import java.util.List;
            
            public final class l1IolOll extends i1oi01OllI {
                private static final l1IolOll zzg;
                private static volatile iI0ooO1Oi000 zzh;
                private int zzb;
                private String zze = "";
                private iI00IlI1oII zzf = iI10i0liO.I00ilI0I1;

                static {
/* 3 */             l1IolOll l1iololl = new l1IolOll();
/* 6 */             zzg = l1iololl;
/* 10 */            i1oi01OllI.I000o00OoI0I(l1IolOll.class, l1iololl);
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return i1oi01OllI.I000oI1ioi(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", l1OoioI11o1l.class});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new l1IolOll();
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
                    synchronized (l1IolOll.class) {
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

                public final List I001IIilI0O() {
/* 1 */             return this.zzf;
                }
            }
