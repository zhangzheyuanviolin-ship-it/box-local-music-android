            package p000;

            import android.os.RemoteException;
            
            public final class O10lo0O implements Runnable {
                public static final String I00iiI = IIi0oIl.I000OiO("ListenableCallbackRbl");
                public O0OIoll1 I00iOIl;

                public static void I00000oIO(IoOlo1llOO ioOlo1llOO, Throwable th) {
                    try {
/* 5 */                 ioOlo1llOO.I0010I0i(th.getMessage());
                    } catch (RemoteException e) {
/* 18 */                IIi0oIl.I000II().I0001Ioi1lo(I00iiI, "Unable to notify failures in operation", e);
                    }
                }

                public static void I00000oOI(IoOlo1llOO ioOlo1llOO, byte[] bArr) {
                    try {
/* 1 */                 ioOlo1llOO.I001lIiIIo1O(bArr);
                    } catch (RemoteException e) {
/* 14 */                IIi0oIl.I000II().I0001Ioi1lo(I00iiI, "Unable to notify successful operation", e);
                    }
                }

                @Override
                public final void run() {
/* 1 */             O0OIoll1 o0OIoll1 = this.I00iOIl;
/* 5 */             IoOlo1llOO ioOlo1llOO = (IoOlo1llOO) o0OIoll1.I0000Il00O;
                    try {
/* 21 */                I00000oOI(ioOlo1llOO, o0OIoll1.I000OOo1O(((IIiOiI0il) o0OIoll1.I0000O).I00iiI.get()));
                    } catch (Throwable th) {
/* 26 */                I00000oIO(ioOlo1llOO, th);
                    }
                }
            }
