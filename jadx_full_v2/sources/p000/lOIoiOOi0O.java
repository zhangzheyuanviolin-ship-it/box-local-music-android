            package p000;

            import java.io.IOException;
            import java.util.Collections;
            import java.util.Map;
            
            public final class lOIoiOOi0O extends i1oi01OllI {
                private static final lOIoiOOi0O zzj;
                private static volatile iI0ooO1Oi000 zzk;
                private int zzb;
                private long zzh;
                private iI0Ol0 zzi = iI0Ol0.I00iiI;
                private String zze = "";
                private i1lIIl01O zzf = i1lIIl01O.I00iiI;
                private String zzg = "";

                static {
/* 3 */             lOIoiOOi0O loioiooi0o = new lOIoiOOi0O();
/* 6 */             zzj = loioiooi0o;
/* 10 */            i1oi01OllI.I000o00OoI0I(lOIoiOOi0O.class, loioiooi0o);
                }

                public static lOIoiOOi0O I001l0I00(IOOOIO1O ioooio1o, i1o0l0i i1o0l0iVar) throws iI00lI {
/* 3 */             i1oi01OllI i1oi01olliI000O01llI0 = zzj.I000O01llI0();
                    try {
/* 13 */                iI110OIoiOl ii110oioiolI00000oIO = iI10O00O.I0000Il00O.I00000oIO(i1oi01olliI000O01llI0.getClass());
/* 21 */                ii110oioiolI00000oIO.I0001Ioi1lo(i1oi01olliI000O01llI0, IOOOi1.I01Io11IiiiO(ioooio1o), i1o0l0iVar);
/* 24 */                ii110oioiolI00000oIO.I0000Il00O(i1oi01olliI000O01llI0);
/* 27 */                i1oi01OllI.I0010I0i(i1oi01olliI000O01llI0);
/* 30 */                return (lOIoiOOi0O) i1oi01olliI000O01llI0;
                    } catch (iI00lI e) {
/* 85 */                if (e.I00iOIl) {
/* 96 */                    throw new iI00lI(e.getMessage(), e);
                        }
/* 106 */               throw e;
                    } catch (iI11ol0olo e2) {
/* 81 */                throw e2.I00000oIO();
                    } catch (IOException e3) {
/* 57 */                if (e3.getCause() instanceof iI00lI) {
/* 65 */                    throw ((iI00lI) e3.getCause());
                        }
/* 75 */                throw new iI00lI(e3.getMessage(), e3);
                    } catch (RuntimeException e4) {
/* 40 */                if (e4.getCause() instanceof iI00lI) {
/* 48 */                    throw ((iI00lI) e4.getCause());
                        }
/* 49 */                throw e4;
                    }
                }

                public static lOIoiOOi0O I001lIiIIo1O() {
/* 1 */             return zzj;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 96 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return i1oi01OllI.I000oI1ioi(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", lOIloloIlOoi.I00000oIO});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new lOIoiOOi0O();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new ioIiOO11o10(zzj);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzj;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzk;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (lOIoiOOi0O.class) {
                        try {
/* 27 */                    i1oo1lloo = zzk;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzj);
/* 38 */                        zzk = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return i1oo1lloo;
                }

                public final String I00111O() {
/* 1 */             return this.zze;
                }

                public final i1lIIl01O I001IIilI0O() {
/* 1 */             return this.zzf;
                }

                public final String I001IO000() {
/* 1 */             return this.zzg;
                }

                public final long I001i1O0Ol() {
/* 1 */             return this.zzh;
                }

                public final int I001i1lo1io() {
/* 3 */             return this.zzi.size();
                }

                public final Map I001iOo1i0O() {
/* 3 */             return Collections.unmodifiableMap(this.zzi);
                }
            }
