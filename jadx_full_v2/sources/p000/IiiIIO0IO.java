            package p000;
            
            public abstract class IiiIIO0IO {
                public static final I0OooiI1I I00000oIO;
                public static final I0OooiI1I I00000oOI;

                static {
/* 5 */             int i = 3;
/* 9 */             I00000oIO = new I0OooiI1I("UNDEFINED", i);
/* 18 */            I00000oOI = new I0OooiI1I("REUSABLE_CLAIMED", i);
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IOoil1iiIilo iOoil1iiIilo, Object obj) throws IiiI1OOll0l1 {
                    O010OIi o010OIi;
/* 3 */             if (!(iOoil1iiIilo instanceof IiiI1lIo)) {
/* 175 */               iOoil1iiIilo.resumeWith(obj);
/* 551 */               return;
                    }
/* 5 */             IiiI1lIo iiiI1lIo = (IiiI1lIo) iOoil1iiIilo;
/* 7 */             Ii00lIOoi ii00lIOoi = iiiI1lIo.I00iio;
/* 9 */             IOoilo iOoilo = iiiI1lIo.I00ilI0I1;
/* 11 */            Throwable thI00000oOI = Oi10ii.I00000oOI(obj);
/* 22 */            Object iOiIII1I = thI00000oOI == null ? obj : new IOiIII1I(false, thI00000oOI);
/* 34 */            if (I0000Il00O(ii00lIOoi, iOoilo.getContext())) {
/* 36 */                iiiI1lIo.I00ilO0 = iOiIII1I;
/* 38 */                iiiI1lIo.I00iiO = 1;
/* 44 */                I00000oOI(ii00lIOoi, iOoilo.getContext(), iiiI1lIo);
/* 47 */                return;
                    }
/* 48 */            Il10o00 il10o00I00000oIO = Oo100i0OO.I00000oIO();
/* 61 */            if (il10o00I00000oIO.I00iiI >= 4294967296L) {
/* 63 */                iiiI1lIo.I00ilO0 = iOiIII1I;
/* 65 */                iiiI1lIo.I00iiO = 1;
/* 67 */                il10o00I00000oIO.I00oooO(iiiI1lIo);
/* 169 */               return;
                    }
/* 71 */            il10o00I00000oIO.I010II(true);
                    try {
/* 84 */                o010OIi = (O010OIi) iOoilo.getContext().I00lli11(Iioi0lilII.I00iio);
                    } finally {
                        try {
                        } finally {
                        }
                    }
/* 86 */            if (o010OIi == null || o010OIi.I0000Il00O()) {
/* 108 */               Object obj2 = iiiI1lIo.I00io1l;
/* 110 */               Ii00l101O context = iOoilo.getContext();
/* 114 */               Object objI00000oOI = Oo0ooOi10I.I00000oOI(context, obj2);
/* 127 */               OoiI00olo ooiI00oloI0000Il00O = objI00000oOI != Oo0ooOi10I.I00000oIO ? iioloOl.I0000Il00O(iOoilo, context, objI00000oOI) : null;
                        try {
/* 128 */                   iOoilo.resumeWith(obj);
                        } finally {
/* 153 */                   if (ooiI00oloI0000Il00O == null || ooiI00oloI0000Il00O.I00ilI0I1()) {
/* 161 */                       Oo0ooOi10I.I00000oIO(context, objI00000oOI);
                            }
                        }
                    }
/* 102 */           iiiI1lIo.resumeWith(lIoii1l01l0i.I00000oIO(o010OIi.I00Io1lO()));
/* 146 */           while (il10o00I00000oIO.I010iIIOlo()) {
                    }
                }

                public static final void I00000oOI(Ii00lIOoi ii00lIOoi, Ii00l101O ii00l101O, Runnable runnable) throws IiiI1OOll0l1 {
                    try {
/* 1 */                 ii00lIOoi.I00iOIl(ii00l101O, runnable);
                    } catch (Throwable th) {
/* 215 */               throw new IiiI1OOll0l1(th, ii00lIOoi, ii00l101O);
                    }
                }

                public static final boolean I0000Il00O(Ii00lIOoi ii00lIOoi, Ii00l101O ii00l101O) throws IiiI1OOll0l1 {
                    try {
/* 1 */                 return ii00lIOoi.I00oo1iO0ll(ii00l101O);
                    } catch (Throwable th) {
/* 89 */                throw new IiiI1OOll0l1(th, ii00lIOoi, ii00l101O);
                    }
                }
            }
