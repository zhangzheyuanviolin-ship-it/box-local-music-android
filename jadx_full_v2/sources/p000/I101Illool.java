            package p000;

            import android.view.Choreographer;
            import java.util.ArrayList;
            
            public final class I101Illool implements Choreographer.FrameCallback, Runnable {
                public I101OO01 I00iOIl;

                @Override
                public final void doFrame(long j) {
/* 5 */             this.I00iOIl.I00iiO.removeCallbacks(this);
/* 10 */            this.I00iOIl.I00ooiO1I();
/* 13 */            I101OO01 i101oo01 = this.I00iOIl;
                    synchronized (i101oo01.I00iio) {
/* 20 */                if (i101oo01.I00l0I0l0lO1) {
/* 25 */                    i101oo01.I00l0I0l0lO1 = false;
/* 27 */                    ArrayList arrayList = i101oo01.I00ilO0;
/* 31 */                    i101oo01.I00ilO0 = i101oo01.I00io1l;
/* 33 */                    i101oo01.I00io1l = arrayList;
/* 36 */                    int size = arrayList.size();
/* 40 */                    for (int i = 0; i < size; i++) {
/* 48 */                        ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                            }
/* 54 */                    arrayList.clear();
                        }
                    }
                }

                @Override
                public final void run() {
/* 3 */             this.I00iOIl.I00ooiO1I();
/* 6 */             I101OO01 i101oo01 = this.I00iOIl;
                    synchronized (i101oo01.I00iio) {
/* 17 */                if (i101oo01.I00ilO0.isEmpty()) {
/* 21 */                    i101oo01.I00iiI.removeFrameCallback(this);
/* 25 */                    i101oo01.I00l0I0l0lO1 = false;
                        }
                    }
                }
            }
