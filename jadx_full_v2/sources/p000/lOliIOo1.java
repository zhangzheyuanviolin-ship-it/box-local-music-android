            package p000;
            
            public final class lOliIOo1 extends i1oi01OllI {
                private static final lOliIOo1 zzo;
                private static volatile iI0ooO1Oi000 zzp;
                private int zzb;
                private boolean zzf;
                private iI00IlI1oII zzh;
                private iI00IlI1oII zzi;
                private i1oo10I0OO zzj;
                private lOloI000o0 zzk;
                private boolean zzl;
                private boolean zzm;
                private lOl0ioO11 zzn;
                private i1lIIl01O zze = i1lIIl01O.I00iiI;
                private String zzg = "";

                static {
/* 3 */             lOliIOo1 loliioo1 = new lOliIOo1();
/* 6 */             zzo = loliioo1;
/* 10 */            i1oi01OllI.I000o00OoI0I(lOliIOo1.class, loliioo1);
                }

                public lOliIOo1() {
/* 12 */            iI10i0liO ii10i0lio = iI10i0liO.I00ilI0I1;
/* 14 */            this.zzh = ii10i0lio;
/* 16 */            this.zzi = ii10i0lio;
/* 20 */            this.zzj = i1oiI1lIo.I00ilI0I1;
                }

                public static lOliIOo1 I00111O() {
/* 1 */             return zzo;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 106 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 100 */               return i1oi01OllI.I000oI1ioi(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", i1iOOl0o.I00000oOI, "zzk", "zzl", "zzm", "zzn"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new lOliIOo1();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new ioIiOO11o10(zzo);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzo;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzp;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (lOliIOo1.class) {
                        try {
/* 27 */                    i1oo1lloo = zzp;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzo);
/* 38 */                        zzp = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return i1oo1lloo;
                }
            }
