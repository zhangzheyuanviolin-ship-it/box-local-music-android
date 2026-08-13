            package p000;

            import android.media.MediaPlayer;
            import java.lang.invoke.VarHandle;
            
            public final class OlI1I0ll implements IllOOo00lI {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public OI10i0Il I00iiO;
                public String I00iio;

                public OlI1I0ll(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    Object objI00000oIO;
                    Object objI00000oIO2;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 79 */                    OI10i0Il oI10i0Il = this.I00iiI;
/* 81 */                    OI10i0Il oI10i0Il2 = this.I00iiO;
/* 83 */                    String str = this.I00iio;
/* 95 */                    if (!((Boolean) oI10i0Il.getValue()).booleanValue()) {
                                try {
/* 103 */                           MediaPlayer mediaPlayer = new MediaPlayer();
/* 106 */                           mediaPlayer.setDataSource(str);
/* 112 */                           OlI1IIoOl olI1IIoOl = new OlI1IIoOl(0);
/* 115 */                           olI1IIoOl.I00000oOI = oI10i0Il2;
/* 117 */                           olI1IIoOl.I0000Il00O = oI10i0Il;
/* 119 */                           VarHandle.storeStoreFence();
/* 122 */                           mediaPlayer.setOnCompletionListener(olI1IIoOl);
/* 125 */                           mediaPlayer.prepare();
/* 128 */                           mediaPlayer.start();
/* 131 */                           oI10i0Il2.setValue(mediaPlayer);
/* 136 */                           oI10i0Il.setValue(Boolean.TRUE);
/* 139 */                           objI00000oIO = ooiIlOl1iI;
                                } catch (Throwable th) {
/* 142 */                           objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                                }
/* 146 */                       Oi10ii.I00000oIO(objI00000oIO);
                                break;
                            } else {
/* 97 */                        iO10II1oIll0.I00000oOI(oI10i0Il2, oI10i0Il);
                                break;
                            }
                        default:
/* 8 */                     OI10i0Il oI10i0Il3 = this.I00iiI;
/* 10 */                    OI10i0Il oI10i0Il4 = this.I00iiO;
/* 12 */                    String str2 = this.I00iio;
/* 24 */                    if (!((Boolean) oI10i0Il3.getValue()).booleanValue()) {
                                try {
/* 32 */                            MediaPlayer mediaPlayer2 = new MediaPlayer();
/* 35 */                            mediaPlayer2.setDataSource(str2);
/* 41 */                            OlI1IIoOl olI1IIoOl2 = new OlI1IIoOl(1);
/* 44 */                            olI1IIoOl2.I00000oOI = oI10i0Il4;
/* 46 */                            olI1IIoOl2.I0000Il00O = oI10i0Il3;
/* 48 */                            VarHandle.storeStoreFence();
/* 51 */                            mediaPlayer2.setOnCompletionListener(olI1IIoOl2);
/* 54 */                            mediaPlayer2.prepare();
/* 57 */                            mediaPlayer2.start();
/* 60 */                            oI10i0Il4.setValue(mediaPlayer2);
/* 65 */                            oI10i0Il3.setValue(Boolean.TRUE);
/* 68 */                            objI00000oIO2 = ooiIlOl1iI;
                                } catch (Throwable th2) {
/* 71 */                            objI00000oIO2 = lIoii1l01l0i.I00000oIO(th2);
                                }
/* 75 */                        Oi10ii.I00000oIO(objI00000oIO2);
                                break;
                            } else {
/* 26 */                        iO10OIiI0i.I00000oOI(oI10i0Il4, oI10i0Il3);
                                break;
                            }
                    }
/* 78 */            return ooiIlOl1iI;
                }
            }
