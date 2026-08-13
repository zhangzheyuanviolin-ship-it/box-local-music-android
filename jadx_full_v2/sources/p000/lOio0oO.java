            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.Executor;
            
            public abstract class lOio0oO {
                public static final Object I00000oIO(OloIIoII1oo oloIIoII1oo, IOoilo iOoilo) {
/* 5 */             if (oloIIoII1oo.I000O01llI0()) {
/* 7 */                 Exception excI0001Ioi1lo = oloIIoII1oo.I0001Ioi1lo();
/* 11 */                if (excI0001Ioi1lo != null) {
/* 50 */                    throw excI0001Ioi1lo;
                        }
/* 18 */                if (!((o0IiOl) oloIIoII1oo).I0000O) {
/* 20 */                    return oloIIoII1oo.I000II();
                        }
/* 49 */                throw new CancellationException("Task " + oloIIoII1oo + " was cancelled normally.");
                    }
/* 58 */            IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iOoilo));
/* 61 */            iIoOoIol0Io0.I00111O();
/* 64 */            Executor executor = Iii11l.I00iiO;
/* 68 */            iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 71 */            iiolilo0iiil.I00iOIl = iIoOoIol0Io0;
/* 73 */            VarHandle.storeStoreFence();
/* 76 */            oloIIoII1oo.I00000oOI(executor, iiolilo0iiil);
/* 79 */            Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 83 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 106 */           return objI0010I0i;
                }
            }
