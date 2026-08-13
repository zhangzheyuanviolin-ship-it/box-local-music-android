            package p000;

            import android.os.RemoteException;
            import android.util.Log;
            
            public final class iiIii011OlI implements Runnable {
                public final int I00iOIl;
                public liiiOiOilI0l I00iiI;

                @Override
                public final void run() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             liiiOiOilI0l liiioioili0l = this.I00iiI;
                    switch (i) {
                        case 0:
                            try {
/* 21 */                        liiioioili0l.I00000oIO();
                                break;
                            } catch (RemoteException e) {
/* 28 */                        Log.w("ilIoii01i", "Failed to cancel preparation of inference engine", e);
/* 31 */                        return;
                            }
                        default:
                            try {
/* 10 */                        liiioioili0l.I00000oIO();
                                break;
                            } catch (RemoteException e2) {
/* 17 */                        Log.w("ilIoii01i", "Failed to cancel inference", e2);
                            }
                    }
                }
            }
