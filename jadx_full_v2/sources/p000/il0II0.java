            package p000;
            
            public final class il0II0 implements Runnable {
                public final int I00iOIl;
                public IIiOiI0il I00iiI;

                public il0II0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 33 */                    this.I00iiI.cancel(false);
                            break;
                        case 1:
/* 27 */                    this.I00iiI.cancel(false);
                            break;
                        case 2:
/* 21 */                    this.I00iiI.cancel(false);
                            break;
                        case 3:
/* 15 */                    this.I00iiI.cancel(false);
                            break;
                        default:
/* 9 */                     this.I00iiI.cancel(false);
                            break;
                    }
                }
            }
