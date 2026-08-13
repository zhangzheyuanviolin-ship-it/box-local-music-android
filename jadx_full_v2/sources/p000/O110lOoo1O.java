            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O110lOoo1O implements Runnable {
                public final int I00iOIl;
                public IoIlOo1o0IIl I00iiI;

                public O110lOoo1O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IoIlOo1o0IIl ioIlOo1o0IIl = this.I00iiI;
                    switch (i) {
                        case 0:
/* 37 */                    II0OlIl iI0OlIl = (II0OlIl) ioIlOo1o0IIl.I00iio;
/* 39 */                    if (iI0OlIl != null) {
/* 45 */                        ((OI0lOii0I) ioIlOo1o0IIl.I00iiI).I000OiO(iI0OlIl);
                                break;
                            }
                            break;
                        default:
/* 10 */                    II0OlIl iI0OlIl2 = (II0OlIl) ioIlOo1o0IIl.I00iio;
/* 12 */                    if (iI0OlIl2 == null) {
/* 17 */                        iI0OlIl2 = new II0OlIl(6);
/* 20 */                        iI0OlIl2.I00iiI = ioIlOo1o0IIl;
/* 22 */                        VarHandle.storeStoreFence();
/* 25 */                        ioIlOo1o0IIl.I00iio = iI0OlIl2;
                            }
/* 31 */                    ((OI0lOii0I) ioIlOo1o0IIl.I00iiI).I0001Ioi1lo(iI0OlIl2);
                            break;
                    }
                }
            }
