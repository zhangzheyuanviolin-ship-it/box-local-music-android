            package p000;
            
            public final class io1IOIIOIo0O extends i1oi01OllI {
                private static final io1IOIIOIo0O zzi;
                private static volatile iI0ooO1Oi000 zzj;
                private int zzb;
                private boolean zzf;
                private long zzh;
                private String zze = "";
                private String zzg = "";

                static {
/* 3 */             io1IOIIOIo0O io1ioiioio0o = new io1IOIIOIo0O();
/* 6 */             zzi = io1ioiioio0o;
/* 10 */            i1oi01OllI.I000o00OoI0I(io1IOIIOIo0O.class, io1ioiioio0o);
                }

                public static io11l0100ill I00111O() {
/* 7 */             return (io11l0100ill) zzi.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 91 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 85 */                return i1oi01OllI.I000oI1ioi(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new io1IOIIOIo0O();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new io11l0100ill(zzi);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zzi;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzj;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (io1IOIIOIo0O.class) {
                        try {
/* 27 */                    i1oo1lloo = zzj;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzi);
/* 38 */                        zzj = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
/* 44 */            return i1oo1lloo;
                }

                public final void I001IIilI0O(String str) {
                    this.zzb |= 1;
/* 7 */             this.zze = str;
                }

                public final void I001IO000() {
                    this.zzb |= 2;
/* 8 */             this.zzf = true;
                }

                public final void I001i1O0Ol(String str) {
                    this.zzb |= 4;
/* 7 */             this.zzg = str;
                }

                public final void I001i1lo1io(long j) {
                    this.zzb |= 8;
/* 7 */             this.zzh = j;
                }
            }
