            package p000;

            import android.os.RemoteException;
            import android.util.Log;
            
            public final class iiIiOlII01o1 implements Runnable {
                public final int I00iOIl;
                public liiiO1I1IlI I00iiI;

                @Override
                public final void run() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             liiiO1I1IlI liiio1i1ili = this.I00iiI;
                    switch (i) {
                        case 0:
                            try {
/* 21 */                        liiio1i1ili.I00000oIO();
                                break;
                            } catch (RemoteException e) {
/* 28 */                        Log.w("ilIoi0", "Failed to cancel preparation of inference engine", e);
/* 31 */                        return;
                            }
                        default:
                            try {
/* 10 */                        liiio1i1ili.I00000oIO();
                                break;
                            } catch (RemoteException e2) {
/* 17 */                        Log.w("ilIoi0", "Failed to cancel inference", e2);
                            }
                    }
                }
            }
