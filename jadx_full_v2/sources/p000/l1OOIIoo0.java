            package p000;

            import java.util.List;
            
            public final class l1OOIIoo0 extends i1oi01OllI {
                private static final l1OOIIoo0 zzg;
                private static volatile iI0ooO1Oi000 zzh;
                private int zzb;
                private iI00IlI1oII zze = iI10i0liO.I00ilI0I1;
                private l1IlII011l zzf;

                static {
/* 3 */             l1OOIIoo0 l1ooiioo0 = new l1OOIIoo0();
/* 6 */             zzg = l1ooiioo0;
/* 10 */            i1oi01OllI.I000o00OoI0I(l1OOIIoo0.class, l1ooiioo0);
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return i1oi01OllI.I000oI1ioi(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", l1OoioI11o1l.class, "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new l1OOIIoo0();
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
                    synchronized (l1OOIIoo0.class) {
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

                public final List I00111O() {
/* 1 */             return this.zze;
                }

                public final l1IlII011l I001IIilI0O() {
/* 1 */             l1IlII011l l1ilii011l = this.zzf;
                    return l1ilii011l == null ? l1IlII011l.I001IO000() : l1ilii011l;
                }
            }
