            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            
            public final class i1oO1llOO implements iI0ooO1Oi000 {
                public final i1oi01OllI I00000oIO;

                static {
/* 1 */             i1o0l0i i1o0l0iVar = i1o0l0i.I00000oIO;
/* 3 */             int i = i1ioiooIiOol.I00000oIO;
                }

                public i1oO1llOO(i1oi01OllI i1oi01olli) {
/* 4 */             this.I00000oIO = i1oi01olli;
                }

                public final i1oi01OllI I00000oIO(InputStream inputStream, i1o0l0i i1o0l0iVar) throws iI00lI {
/* 3 */             IOOOIO1O ioooio1oI00IO1oi11O = IOOOIO1O.I00IO1oi11O(inputStream, Barcode.FORMAT_AZTEC);
/* 7 */             int i = i1oi01OllI.zzd;
/* 11 */            i1oi01OllI i1oi01olliI000O01llI0 = this.I00000oIO.I000O01llI0();
                    try {
/* 21 */                iI110OIoiOl ii110oioiolI00000oIO = iI10O00O.I0000Il00O.I00000oIO(i1oi01olliI000O01llI0.getClass());
/* 29 */                ii110oioiolI00000oIO.I0001Ioi1lo(i1oi01olliI000O01llI0, IOOOi1.I01Io11IiiiO(ioooio1oI00IO1oi11O), i1o0l0iVar);
/* 32 */                ii110oioiolI00000oIO.I0000Il00O(i1oi01olliI000O01llI0);
/* 36 */                ioooio1oI00IO1oi11O.I00IoIO0lI(0);
/* 44 */                if (i1oi01OllI.I00100o1O0lo(i1oi01olliI000O01llI0, true)) {
/* 46 */                    return i1oi01olliI000O01llI0;
                        }
/* 56 */                throw new iI11ol0olo().I00000oIO();
                    } catch (iI00lI e) {
/* 109 */               if (e.I00iOIl) {
/* 120 */                   throw new iI00lI(e.getMessage(), e);
                        }
/* 332 */               throw e;
                    } catch (iI11ol0olo e2) {
/* 105 */               throw e2.I00000oIO();
                    } catch (IOException e3) {
/* 81 */                if (e3.getCause() instanceof iI00lI) {
/* 89 */                    throw ((iI00lI) e3.getCause());
                        }
/* 99 */                throw new iI00lI(e3.getMessage(), e3);
                    } catch (RuntimeException e4) {
/* 64 */                if (e4.getCause() instanceof iI00lI) {
/* 72 */                    throw ((iI00lI) e4.getCause());
                        }
/* 73 */                throw e4;
                    }
                }
            }
