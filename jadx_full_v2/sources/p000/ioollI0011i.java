            package p000;
            
            public final class ioollI0011i extends i1oi01OllI {
                private static final ioollI0011i zzh;
                private static volatile iI0ooO1Oi000 zzi;
                private int zzb;
                private String zze = "";
                private iI00IlI1oII zzf = iI10i0liO.I00ilI0I1;
                private boolean zzg;

                static {
/* 3 */             ioollI0011i ioolli0011i = new ioollI0011i();
/* 6 */             zzh = ioolli0011i;
/* 10 */            i1oi01OllI.I000o00OoI0I(ioollI0011i.class, ioolli0011i);
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 91 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 85 */                return i1oi01OllI.I000oI1ioi(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zze", "zzf", l010oo0li0.class, "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new ioollI0011i();
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
                    synchronized (ioollI0011i.class) {
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

                public final String I00111O() {
/* 1 */             return this.zze;
                }
            }
