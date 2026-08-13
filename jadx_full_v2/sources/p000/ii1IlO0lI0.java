            package p000;

            import java.util.Iterator;
            
/* 96 */    public final class ii1IlO0lI0 {
                public final int I00000oIO;

                public ii1IlO0lI0(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public final void I00000oIO(iIIoI1 iiioi1, Iterator it, iOoO1O iooo1o) {
                    switch (this.I00000oIO) {
                        case 0:
                            break;
                        default:
/* 8 */                     if (!iiioi1.I0000Il00O) {
/* 50 */                        I000II.I001IO000("non repeating key");
                                break;
                            } else if (iiioi1.I0000O && ((iliiOOl1Oll0) iliiOOl1Oll0.I00iiI.get()).I00iOIl > 20) {
/* 32 */                        while (it.hasNext()) {
/* 40 */                            iooo1o.I00000oIO(iiioi1.I00000oIO, it.next());
                                }
                                break;
                            } else {
/* 44 */                        iiioi1.I00000oIO(it, iooo1o);
                                break;
                            }
                            break;
                    }
                }

/* 97 */        private final void I00000oOI(iIIoI1 iiioi1, Iterator it, iOoO1O iooo1o) {
                }
            }
