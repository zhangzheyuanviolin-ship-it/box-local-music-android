            package p000;

            import android.os.RemoteException;
            import android.util.Log;
            
            public final class iiI1IlI implements Runnable {
                public final int I00iOIl;
                public liiiOl01O I00iiI;

                @Override
                public final void run() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             liiiOl01O liiiol01o = this.I00iiI;
                    switch (i) {
                        case 0:
                            try {
/* 21 */                        liiiol01o.I000O01llI0();
                                break;
                            } catch (RemoteException e) {
/* 28 */                        Log.w("ilOI1I0lloOl", "Failed to cancel preparation of inference engine", e);
/* 31 */                        return;
                            }
                        default:
                            try {
/* 10 */                        liiiol01o.I000O01llI0();
                                break;
                            } catch (RemoteException e2) {
/* 17 */                        Log.w("ilOI1I0lloOl", "Failed to cancel inference", e2);
                            }
                    }
                }
            }
