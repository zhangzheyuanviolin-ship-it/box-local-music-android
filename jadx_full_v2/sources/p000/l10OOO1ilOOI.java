            package p000;
            
            public final class l10OOO1ilOOI extends i1oi01OllI {
                private static final l10OOO1ilOOI zzg;
                private static volatile iI0ooO1Oi000 zzh;
                private int zzb;
                private int zze = 1;
                private iI00IlI1oII zzf = iI10i0liO.I00ilI0I1;

                static {
/* 3 */             l10OOO1ilOOI l10ooo1ilooi = new l10OOO1ilOOI();
/* 6 */             zzg = l10ooo1ilooi;
/* 10 */            i1oi01OllI.I000o00OoI0I(l10OOO1ilOOI.class, l10ooo1ilooi);
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 91 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 85 */                return i1oi01OllI.I000oI1ioi(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zze", i1iOOl0o.I000l1, "zzf", l0lOI0i.class});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new l10OOO1ilOOI();
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
                    synchronized (l10OOO1ilOOI.class) {
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
            }
