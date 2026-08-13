            package p000;

            import java.util.List;
            
            public final class lio1IiIo extends i1oi01OllI {
                private static final lio1IiIo zze;
                private static volatile iI0ooO1Oi000 zzf;
                private iI00IlI1oII zzb = iI10i0liO.I00ilI0I1;

                static {
/* 3 */             lio1IiIo lio1iiio = new lio1IiIo();
/* 6 */             zze = lio1iiio;
/* 10 */            i1oi01OllI.I000o00OoI0I(lio1IiIo.class, lio1iiio);
                }

                public static lio1IiIo I001IIilI0O(byte[] bArr, i1o0l0i i1o0l0iVar) {
/* 7 */             return (lio1IiIo) i1oi01OllI.I0000O(zze, bArr, i1o0l0iVar);
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 83 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 77 */                return i1oi01OllI.I000oI1ioi(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new lio1IiIo();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new ioIiOO11o10(zze);
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
                    synchronized (lio1IiIo.class) {
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

                public final List I00111O() {
/* 1 */             return this.zzb;
                }
            }
