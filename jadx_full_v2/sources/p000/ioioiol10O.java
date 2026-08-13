            package p000;
            
            public final class ioioiol10O extends i1oi01OllI {
                private static final ioioiol10O zzg;
                private static volatile iI0ooO1Oi000 zzh;
                private int zzb;
                private int zze;
                private int zzf;

                static {
/* 3 */             ioioiol10O ioioiol10o = new ioioiol10O();
/* 6 */             zzg = ioioiol10o;
/* 10 */            i1oi01OllI.I000o00OoI0I(ioioiol10O.class, ioioiol10o);
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 71 */                i1iOOl0o i1iool0o = i1iOOl0o.I0001Ioi1lo;
/* 83 */                return i1oi01OllI.I000oI1ioi(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", i1iool0o, "zzf", i1iool0o});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new ioioiol10O();
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
                    synchronized (ioioiol10O.class) {
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

                public final int I00111O() {
/* 3 */             int iI00000oIO = liolOi0Oli.I00000oIO(this.zze);
/* 7 */             if (iI00000oIO == 0) {
/* 9 */                 return 1;
                    }
/* 20 */            return iI00000oIO;
                }

                public final int I001IIilI0O() {
/* 3 */             int iI00000oIO = liolOi0Oli.I00000oIO(this.zzf);
/* 7 */             if (iI00000oIO == 0) {
/* 9 */                 return 1;
                    }
/* 20 */            return iI00000oIO;
                }
            }
