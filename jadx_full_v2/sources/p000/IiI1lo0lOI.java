            package p000;
            
            public final class IiI1lo0lOI implements Runnable {
                public final int I00iOIl;
                public Oll0I0l1i1 I00iiI;

                public IiI1lo0lOI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Oll0I0l1i1 oll0I0l1i1 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 15 */                    oll0I0l1i1.I0000Il00O();
                            break;
                        default:
/* 11 */                    oll0I0l1i1.I0001Ioi1lo.cancel(true);
                            break;
                    }
                }
            }
