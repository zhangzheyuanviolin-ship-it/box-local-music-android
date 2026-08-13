            package p000;

            import java.util.List;
            
            public final class lOoOO01iIO1 extends i1oi01OllI {
                private static final lOoOO01iIO1 zzg;
                private static volatile iI0ooO1Oi000 zzh;
                private int zzb;
                private iI00IlI1oII zze = iI10i0liO.I00ilI0I1;
                private String zzf = "";

                static {
/* 3 */             lOoOO01iIO1 loooo01iio1 = new lOoOO01iIO1();
/* 6 */             zzg = loooo01iio1;
/* 10 */            i1oi01OllI.I000o00OoI0I(lOoOO01iIO1.class, loooo01iio1);
                }

                public static lOoOO01iIO1 I001IIilI0O() {
/* 1 */             return zzg;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return i1oi01OllI.I000oI1ioi(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new lOoOO01iIO1();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new lOoIIiI(zzg);
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
                    synchronized (lOoOO01iIO1.class) {
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

                public final void I001IO000(String str) {
/* 1 */             iI00IlI1oII ii00ili1oiiI000o00OoI0I = this.zze;
/* 8 */             if (!((i1io1OO01oI) ii00ili1oiiI000o00OoI0I).I00iOIl) {
/* 10 */                ii00ili1oiiI000o00OoI0I = io1OllI.I000o00OoI0I(ii00ili1oiiI000o00OoI0I);
/* 14 */                this.zze = ii00ili1oiiI000o00OoI0I;
                    }
/* 18 */            ii00ili1oiiI000o00OoI0I.add("");
                }

                public final void I001i1O0Ol(String str) {
                    this.zzb |= 1;
/* 9 */             this.zzf = "";
                }
            }
