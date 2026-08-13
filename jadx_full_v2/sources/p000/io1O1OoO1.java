            package p000;

            import android.os.RemoteException;
            import android.util.Log;
            
            public final class io1O1OoO1 implements Runnable {
                public final int I00iOIl;
                public iOio1i0 I00iiI;

                @Override
                public final void run() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             iOio1i0 ioio1i0 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 34 */                    if (ioio1i0 != null) {
                                try {
/* 36 */                            ioio1i0.I00000oIO();
                                    break;
                                } catch (RemoteException e) {
/* 43 */                            Log.w("ioii01Ii100", "Failed to cancel inference", e);
/* 46 */                            return;
                                }
                            }
                            break;
                        case 1:
/* 21 */                    if (ioio1i0 != null) {
                                try {
/* 23 */                            ioio1i0.I00000oIO();
                                    break;
                                } catch (RemoteException e2) {
/* 30 */                            Log.w("ioii01Ii100", "Failed to cancel preparation of inference engine", e2);
                                }
                            }
                            break;
                        default:
                            try {
/* 10 */                        ioio1i0.I00000oIO();
                                break;
                            } catch (RemoteException e3) {
/* 17 */                        Log.w("ioii01Ii100", "Failed to cancel tokenization request", e3);
/* 20 */                        return;
                            }
                    }
                }
            }
