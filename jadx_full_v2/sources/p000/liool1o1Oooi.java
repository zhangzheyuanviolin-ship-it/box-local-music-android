            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            
            public final class liool1o1Oooi extends i1oi01OllI {
                private static final liool1o1Oooi zzl;
                private static volatile iI0ooO1Oi000 zzm;
                private int zzb;
                private boolean zzf;
                private int zzh;
                private boolean zzi;
                private boolean zzj;
                private boolean zzk;
                private String zze = "";
                private iI00IlI1oII zzg = iI10i0liO.I00ilI0I1;

                static {
/* 3 */             liool1o1Oooi liool1o1oooi = new liool1o1Oooi();
/* 6 */             zzl = liool1o1oooi;
/* 10 */            i1oi01OllI.I000o00OoI0I(liool1o1Oooi.class, liool1o1oooi);
                }

                public static liool1o1Oooi I001IO000(InputStream inputStream, i1o0l0i i1o0l0iVar) throws iI00lI {
/* 1 */             liool1o1Oooi liool1o1oooi = zzl;
/* 5 */             IOOOIO1O ioooio1oI00IO1oi11O = IOOOIO1O.I00IO1oi11O(inputStream, Barcode.FORMAT_AZTEC);
/* 9 */             i1oi01OllI i1oi01olliI000O01llI0 = liool1o1oooi.I000O01llI0();
                    try {
/* 19 */                iI110OIoiOl ii110oioiolI00000oIO = iI10O00O.I0000Il00O.I00000oIO(i1oi01olliI000O01llI0.getClass());
/* 27 */                ii110oioiolI00000oIO.I0001Ioi1lo(i1oi01olliI000O01llI0, IOOOi1.I01Io11IiiiO(ioooio1oI00IO1oi11O), i1o0l0iVar);
/* 30 */                ii110oioiolI00000oIO.I0000Il00O(i1oi01olliI000O01llI0);
/* 33 */                i1oi01OllI.I0010I0i(i1oi01olliI000O01llI0);
/* 36 */                return (liool1o1Oooi) i1oi01olliI000O01llI0;
                    } catch (iI00lI e) {
/* 91 */                if (e.I00iOIl) {
/* 102 */                   throw new iI00lI(e.getMessage(), e);
                        }
/* 106 */               throw e;
                    } catch (iI11ol0olo e2) {
/* 87 */                throw e2.I00000oIO();
                    } catch (IOException e3) {
/* 63 */                if (e3.getCause() instanceof iI00lI) {
/* 71 */                    throw ((iI00lI) e3.getCause());
                        }
/* 81 */                throw new iI00lI(e3.getMessage(), e3);
                    } catch (RuntimeException e4) {
/* 46 */                if (e4.getCause() instanceof iI00lI) {
/* 54 */                    throw ((iI00lI) e4.getCause());
                        }
/* 55 */                throw e4;
                    }
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 100 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 94 */                return i1oi01OllI.I000oI1ioi(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", i1iOOl0o.I00000oOI, "zzi", "zzk", "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new liool1o1Oooi();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new ioIiOO11o10(zzl);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzl;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzm;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (liool1o1Oooi.class) {
                        try {
/* 27 */                    i1oo1lloo = zzm;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzl);
/* 38 */                        zzm = i1oo1lloo;
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

                public final boolean I001IIilI0O() {
/* 1 */             return this.zzf;
                }
            }
