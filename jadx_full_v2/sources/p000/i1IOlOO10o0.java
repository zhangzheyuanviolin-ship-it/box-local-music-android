            package p000;

            import android.util.Log;
            import java.io.IOException;
            import java.util.concurrent.TimeoutException;
            
            public final class i1IOlOO10o0 implements Runnable {
                public final int I00iOIl;
                public OloIlI0ll I00iiI;

                public i1IOlOO10o0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 30 */                    if (this.I00iiI.I0000Il00O(new IOException("TIMEOUT"))) {
/* 36 */                        Log.w("Rpc", "No response");
                                break;
                            }
                            break;
                        default:
/* 13 */                    this.I00iiI.I0000Il00O(new TimeoutException());
                            break;
                    }
                }
            }
