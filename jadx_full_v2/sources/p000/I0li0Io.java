            package p000;

            import android.os.Trace;
            import android.view.MotionEvent;
            
            public final class I0li0Io implements Runnable {
                public final int I00iOIl;
                public I0lio1O01i01 I00iiI;

                public I0li0Io(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             I0lio1O01i01 i0lio1O01i01 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 39 */                    I1Il0loi i1Il0loi = i0lio1O01i01.I00l0I0l0lO1;
/* 43 */                    Trace.beginSection("AndroidOwner:outOfFrameExecutor");
/* 50 */                    while (!i1Il0loi.isEmpty()) {
                                try {
/* 58 */                            ((IllOOo00lI) i1Il0loi.removeLast()).invoke();
                                } finally {
/* 67 */                            Trace.endSection();
                                }
                            }
/* 65 */                    return;
                        case 1:
/* 17 */                    i0lio1O01i01.I01IlIoOI = false;
/* 19 */                    MotionEvent motionEvent = i0lio1O01i01.I011olOoO;
/* 27 */                    if (motionEvent.getActionMasked() == 10) {
/* 29 */                        i0lio1O01i01.I00IO1oi11O(motionEvent);
/* 38 */                        return;
                            } else {
/* 35 */                        I000II.I001IO000("The ACTION_HOVER_EXIT event was not cleared.");
/* 38 */                        return;
                            }
                        default:
/* 12 */                    I0lio1O01i01.I000OiO(i0lio1O01i01.getRoot());
/* 15 */                    return;
                    }
                }
            }
