            package p000;
            
            public final class lOl0ioO11 extends i1oi01OllI {
                private static final lOl0ioO11 zzf;
                private static volatile iI0ooO1Oi000 zzg;
                private int zzb;
                private boolean zze;

                static {
/* 3 */             lOl0ioO11 lol0ioo11 = new lOl0ioO11();
/* 6 */             zzf = lol0ioo11;
/* 10 */            i1oi01OllI.I000o00OoI0I(lOl0ioO11.class, lol0ioo11);
                }

                public static lOl0ioO11 I001IIilI0O() {
/* 1 */             return zzf;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 85 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 79 */                return i1oi01OllI.I000oI1ioi(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new lOl0ioO11();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new ioIiOO11o10(zzf);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zzf;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzg;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (lOl0ioO11.class) {
                        try {
/* 27 */                    i1oo1lloo = zzg;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzf);
/* 38 */                        zzg = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
/* 44 */            return i1oo1lloo;
                }

                public final boolean I00111O() {
/* 1 */             return this.zze;
                }
            }
