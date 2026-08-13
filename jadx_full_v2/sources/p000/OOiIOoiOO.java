            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class OOiIOoiOO {
                public O0oI01l I00000oIO;

                public OOiIOoiOO(IllOOo00lI illOOo00lI) {
/* 6 */             O0oI01l o0oI01l = new O0oI01l();
/* 14 */            o0oI01l.I00000oIO = new OllO00oiil(illOOo00lI);
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            this.I00000oIO = o0oI01l;
                }

                public abstract OOiIo1lll I00000oIO(Object obj);

                public OoloiloOIo I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                public final OOiIo1lll I0000Il00O(Function1 function1) {
/* 9 */             return new OOiIo1lll(this, null, false, null, function1, false);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[PHI: r4
                  0x0034: PHI (r4v2 IioI11ioo1) = (r4v6 IioI11ioo1), (r4v7 IioI11ioo1) binds: [B:21:0x0040, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OoloiloOIo I0000O(OOiIo1lll oOiIo1lll, OoloiloOIo ooloiloOIo) {
                    IioI11ioo1 iioI11ioo1;
/* 3 */             IioI11ioo1 iioI11ioo12 = null;
/* 4 */             if (ooloiloOIo instanceof IioI11ioo1) {
/* 8 */                 if (oOiIo1lll.I0000oI00) {
/* 11 */                    iioI11ioo12 = (IioI11ioo1) ooloiloOIo;
/* 19 */                    iioI11ioo12.I00000oIO.setValue(oOiIo1lll.I00000oIO());
                        }
                    } else if (ooloiloOIo instanceof OlO1liIII) {
/* 29 */                if ((oOiIo1lll.I00000oOI || oOiIo1lll.I0001Ioi1lo != null) && !oOiIo1lll.I0000oI00) {
/* 43 */                    OlO1liIII olO1liIII = (OlO1liIII) ooloiloOIo;
/* 47 */                    boolean zI0000O = O0000Ioio00.I0000O(oOiIo1lll.I00000oIO(), olO1liIII.I00000oIO);
                            iioI11ioo1 = olO1liIII;
/* 51 */                    if (zI0000O) {
/* 53 */                        iioI11ioo12 = iioI11ioo1;
                            }
                        }
                    } else if (ooloiloOIo instanceof IOlO1lli) {
/* 59 */                Function1 function1 = oOiIo1lll.I0000O;
/* 61 */                IOlO1lli iOlO1lli = (IOlO1lli) ooloiloOIo;
/* 63 */                Function1 function12 = iOlO1lli.I00000oIO;
                        iioI11ioo1 = iOlO1lli;
/* 65 */                if (function1 == function12) {
                        }
                    }
/* 68 */            if (iioI11ioo12 != null) {
/* 332 */               return iioI11ioo12;
                    }
/* 72 */            if (!oOiIo1lll.I0000oI00) {
/* 98 */                Function1 function13 = oOiIo1lll.I0000O;
                        return function13 != null ? new IOlO1lli(function13) : new OlO1liIII(oOiIo1lll.I00000oIO());
                    }
/* 76 */            Object obj = oOiIo1lll.I0001Ioi1lo;
/* 78 */            Ol1lllIil ol1lllIil = oOiIo1lll.I0000Il00O;
/* 80 */            if (ol1lllIil == null) {
/* 82 */                ol1lllIil = Io1Oioii1111.I00ilO0;
                    }
/* 86 */            OIooliIO0 oIooliIO0 = new OIooliIO0(obj, ol1lllIil);
/* 89 */            IioI11ioo1 iioI11ioo13 = new IioI11ioo1();
/* 92 */            iioI11ioo13.I00000oIO = oIooliIO0;
/* 94 */            VarHandle.storeStoreFence();
/* 97 */            return iioI11ioo13;
                }
            }
