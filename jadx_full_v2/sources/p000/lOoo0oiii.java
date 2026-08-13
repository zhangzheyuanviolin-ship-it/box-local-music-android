            package p000;
            
            public final class lOoo0oiii extends i1oi01OllI {
                private static final lOoo0oiii zze;
                private static volatile iI0ooO1Oi000 zzf;
                private iI0Ol0 zzb = iI0Ol0.I00iiI;

                static {
/* 3 */             lOoo0oiii looo0oiii = new lOoo0oiii();
/* 6 */             zze = looo0oiii;
/* 10 */            i1oi01OllI.I000o00OoI0I(lOoo0oiii.class, looo0oiii);
                }

                public static lOoo0oiii I001IIilI0O() {
/* 1 */             return zze;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 85 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 79 */                return i1oi01OllI.I000oI1ioi(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", lOoii0o1.I00000oIO});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new lOoo0oiii();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new lOolOO(zze);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zze;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzf;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (lOoo0oiii.class) {
                        try {
/* 27 */                    i1oo1lloo = zzf;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zze);
/* 38 */                        zzf = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
/* 44 */            return i1oo1lloo;
                }

                public final lOoOO01iIO1 I00111O(String str, lOoOO01iIO1 loooo01iio1) {
/* 1 */             str.getClass();
/* 10 */            lOoOO01iIO1 loooo01iio12 = (lOoOO01iIO1) this.zzb.get(str);
                    return loooo01iio12 != null ? loooo01iio12 : loooo01iio1;
                }

                public final iI0Ol0 I001IO000() {
/* 1 */             iI0Ol0 ii0ol0 = this.zzb;
/* 5 */             if (ii0ol0.I00iOIl) {
/* 20 */                return ii0ol0;
                    }
/* 7 */             iI0Ol0 ii0ol0I00000oIO = ii0ol0.I00000oIO();
/* 11 */            this.zzb = ii0ol0I00000oIO;
/* 20 */            return ii0ol0I00000oIO;
                }
            }
