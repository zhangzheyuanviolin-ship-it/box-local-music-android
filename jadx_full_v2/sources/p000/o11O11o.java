            package p000;

            import java.util.Iterator;
            
/* 96 */    public final class o11O11o {
                public final int I00000oIO;

                public o11O11o(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public final void I00000oIO(o0oooliI o0ooolii, Iterator it, o1101OI1l o1101oi1l) {
                    switch (this.I00000oIO) {
                        case 0:
                            break;
                        default:
/* 8 */                     if (!o0ooolii.I0000Il00O) {
/* 50 */                        I000II.I001IO000("non repeating key");
                                break;
                            } else if (o0ooolii.I0000O && ((i1iIO0I1I00) i1iIO0I1I00.I00iiI.get()).I00iOIl > 20) {
/* 32 */                        while (it.hasNext()) {
/* 40 */                            o1101oi1l.I00000oIO(o0ooolii.I00000oIO, it.next());
                                }
                                break;
                            } else {
/* 44 */                        o0ooolii.I00000oIO(it, o1101oi1l);
                                break;
                            }
                            break;
                    }
                }

/* 97 */        private final void I00000oOI(o0oooliI o0ooolii, Iterator it, o1101OI1l o1101oi1l) {
                }
            }
