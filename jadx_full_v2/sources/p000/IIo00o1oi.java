            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.Executor;
            
            public final class IIo00o1oi implements Runnable {
                public final int I00iOIl;
                public IIo0IOlilI I00iiI;
                public List I00iiO;
                public int I00iio;

                public IIo00o1oi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 33 */                    IIo0IOlilI iIo0IOlilI = this.I00iiI;
/* 35 */                    List list = this.I00iiO;
/* 37 */                    int i = this.I00iio;
/* 45 */                    if (iIo0IOlilI.I000l1.get() && O0000Ioio00.I0000O(iIo0IOlilI.I000iOII, list)) {
/* 59 */                        l11I11lO.I0000O(3, "CameraPresencePrvdr");
/* 62 */                        OoIlIoo1oiOo ooIlIoo1oiOo = iIo0IOlilI.I000O01llI0;
/* 64 */                        if (ooIlIoo1oiOo != null) {
/* 70 */                            I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(23);
/* 73 */                            i0IOIlIOIII.I00iiI = ooIlIoo1oiOo;
/* 75 */                            VarHandle.storeStoreFence();
/* 78 */                            iOiiloIII0O.I00000oIO(i0IOIlIOIII);
                                }
/* 83 */                        iIo0IOlilI.I0000O(i - 1, list);
                                break;
                            }
                            break;
                        default:
/* 6 */                     IIo0IOlilI iIo0IOlilI2 = this.I00iiI;
/* 8 */                     List list2 = this.I00iiO;
/* 10 */                    int i2 = this.I00iio;
/* 12 */                    Executor executor = iIo0IOlilI2.I00000oIO;
/* 17 */                    IIo00o1oi iIo00o1oi = new IIo00o1oi(0);
/* 20 */                    iIo00o1oi.I00iiI = iIo0IOlilI2;
/* 22 */                    iIo00o1oi.I00iiO = list2;
/* 24 */                    iIo00o1oi.I00iio = i2;
/* 26 */                    VarHandle.storeStoreFence();
/* 29 */                    executor.execute(iIo00o1oi);
                            break;
                    }
                }
            }
