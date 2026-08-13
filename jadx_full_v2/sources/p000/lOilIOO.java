            package p000;

            import android.os.RemoteException;
            
            public final class lOilIOO implements Runnable {
                public final int I00iOIl;
                public lOliOlO1Io I00iiI;

                public lOilIOO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 105 */                   this.I00iiI.I010l1O();
                            break;
                        case 1:
/* 55 */                    lOliOlO1Io loliolo1io = this.I00iiI;
/* 59 */                    l0olllO1i l0olllo1i = (l0olllO1i) loliolo1io.I00iOIl;
/* 61 */                    iolll0ill1i iolll0ill1iVar = loliolo1io.I00iio;
/* 63 */                    if (iolll0ill1iVar == null) {
/* 65 */                        l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 67 */                        l0olllO1i.I000II(l01o0io1ooo0);
/* 74 */                        l01o0io1ooo0.I00ilO0.I00000oOI("Failed to send Dma consent settings to service");
                                break;
                            } else {
                                try {
/* 82 */                            iolll0ill1iVar.I001IO000(loliolo1io.I011IO1I11OI(false));
/* 85 */                            loliolo1io.I0110OiO();
                                    break;
                                } catch (RemoteException e) {
/* 90 */                            l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 92 */                            l0olllO1i.I000II(l01o0io1ooo02);
/* 99 */                            l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to send Dma consent settings to the service", e);
/* 102 */                           return;
                                }
                            }
                        default:
/* 7 */                     lOliOlO1Io loliolo1io2 = this.I00iiI;
/* 11 */                    l0olllO1i l0olllo1i2 = (l0olllO1i) loliolo1io2.I00iOIl;
/* 13 */                    iolll0ill1i iolll0ill1iVar2 = loliolo1io2.I00iio;
/* 15 */                    if (iolll0ill1iVar2 == null) {
/* 17 */                        l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i2.I00ilO0;
/* 19 */                        l0olllO1i.I000II(l01o0io1ooo03);
/* 26 */                        l01o0io1ooo03.I00ilO0.I00000oOI("Failed to send storage consent settings to service");
                                break;
                            } else {
                                try {
/* 34 */                            iolll0ill1iVar2.I0010o(loliolo1io2.I011IO1I11OI(false));
/* 37 */                            loliolo1io2.I0110OiO();
                                    break;
                                } catch (RemoteException e2) {
/* 42 */                            l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i2.I00ilO0;
/* 44 */                            l0olllO1i.I000II(l01o0io1ooo04);
/* 51 */                            l01o0io1ooo04.I00ilO0.I0000Il00O("Failed to send storage consent settings to the service", e2);
                                }
                            }
                    }
                }
            }
