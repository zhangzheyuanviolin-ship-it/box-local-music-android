            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class lOlo0o {
                public static final Object I00000oIO(Oo11i0liooOo oo11i0liooOo, IlliIl1l11O illiIl1l11O) {
/* 15 */            IiiOlIiio iiiOlIiioI00000oIO = il0l1o1l.I0000Il00O(oo11i0liooOo.I00ilI0I1.getContext()).I00000oIO(oo11i0liooOo.I00ilO0, oo11i0liooOo, oo11i0liooOo.I00iio);
/* 21 */            IiiiI1OO1l iiiiI1OO1l = new IiiiI1OO1l();
/* 24 */            iiiiI1OO1l.I00ilI0I1 = iiiOlIiioI00000oIO;
/* 26 */            VarHandle.storeStoreFence();
/* 30 */            l01oO1iOo.I0001Ioi1lo(oo11i0liooOo, true, iiiiI1OO1l);
/* 34 */            return li0011.I00000oIO(oo11i0liooOo, false, oo11i0liooOo, illiIl1l11O);
                }

                public static final Object I00000oOI(long j, IlliIl1l11O illiIl1l11O, IOoilo iOoilo) {
/* 5 */             if (j <= 0) {
/* 215 */               throw new Oo11Oo("Timed out immediately", null);
                    }
/* 13 */            Oo11i0liooOo oo11i0liooOo = new Oo11i0liooOo(iOoilo, iOoilo.getContext());
/* 16 */            oo11i0liooOo.I00ilO0 = j;
/* 18 */            Object objI00000oIO = I00000oIO(oo11i0liooOo, illiIl1l11O);
/* 22 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 24 */            return objI00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000Il00O(long j, IlliIl1l11O illiIl1l11O, IOoilo iOoilo) throws Throwable {
                    Oo11iIi oo11iIi;
                    OOo0ooi oOo0ooi;
/* 3 */             if (iOoilo instanceof Oo11iIi) {
/* 6 */                 oo11iIi = (Oo11iIi) iOoilo;
/* 8 */                 int i = oo11iIi.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oo11iIi.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oo11iIi = new Oo11iIi(iOoilo);
                        }
                    }
/* 25 */            Object obj = oo11iIi.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oo11iIi.I00iiO;
/* 33 */            if (i2 == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(obj);
/* 58 */                if (j > 0) {
/* 63 */                    OOo0ooi oOo0ooi2 = new OOo0ooi();
                            try {
/* 66 */                        oo11iIi.I00iOIl = oOo0ooi2;
/* 68 */                        oo11iIi.I00iiO = 1;
                                try {
/* 76 */                            Oo11i0liooOo oo11i0liooOo = new Oo11i0liooOo(oo11iIi, oo11iIi.getContext());
/* 79 */                            oo11i0liooOo.I00ilO0 = j;
/* 81 */                            VarHandle.storeStoreFence();
/* 84 */                            oOo0ooi2.I00iOIl = oo11i0liooOo;
/* 86 */                            Object objI00000oIO = I00000oIO(oo11i0liooOo, illiIl1l11O);
                                    return objI00000oIO == ii0111o ? ii0111o : objI00000oIO;
                                } catch (Oo11Oo e) {
/* 97 */                            e = e;
/* 95 */                            oOo0ooi = oOo0ooi2;
/* 105 */                           if (e.I00iOIl != oOo0ooi.I00iOIl) {
                                    }
/* 31 */                            return null;
                                }
                            } catch (Oo11Oo e2) {
/* 94 */                        e = e2;
                            }
                        }
/* 31 */                return null;
                    }
/* 35 */            if (i2 != 1) {
/* 47 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    }
/* 37 */            oOo0ooi = oo11iIi.I00iOIl;
                    try {
/* 39 */                lIoii1l01l0i.I00000oOI(obj);
/* 42 */                return obj;
                    } catch (Oo11Oo e3) {
/* 43 */                e = e3;
                    }
/* 105 */           if (e.I00iOIl != oOo0ooi.I00iOIl) {
/* 215 */               throw e;
                    }
/* 31 */            return null;
                }
            }
