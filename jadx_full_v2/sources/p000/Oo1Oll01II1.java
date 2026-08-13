            package p000;

            import androidx.appcompat.widget.Toolbar;
            
            public final class Oo1Oll01II1 implements Runnable {
                public final int I00iOIl;
                public Toolbar I00iiI;

                public Oo1Oll01II1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Toolbar toolbar = this.I00iiI;
                    switch (i) {
                        case 0:
/* 12 */                    Oo1OoiI oo1OoiI = toolbar.I010iIIOlo;
/* 18 */                    O1ioIIl o1ioIIl = oo1OoiI == null ? null : oo1OoiI.I00iiI;
/* 20 */                    if (o1ioIIl != null) {
/* 22 */                        o1ioIIl.collapseActionView();
                                break;
                            }
                            break;
                        default:
/* 8 */                     toolbar.I000lI();
                            break;
                    }
                }
            }
