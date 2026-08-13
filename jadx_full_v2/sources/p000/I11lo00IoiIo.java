            package p000;

            import android.view.ViewGroup;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public final class I11lo00IoiIo implements Runnable {
                public final int I00iOIl;
                public I11oi01ll I00iiI;

                public I11lo00IoiIo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    ViewGroup viewGroup;
                    switch (this.I00iOIl) {
                        case 0:
/* 83 */                    I11oi01ll i11oi01ll = this.I00iiI;
/* 89 */                    if ((i11oi01ll.I0110o & 1) != 0) {
/* 91 */                        i11oi01ll.I0010o(0);
                            }
/* 98 */                    if ((i11oi01ll.I0110o & Barcode.FORMAT_AZTEC) != 0) {
/* 102 */                       i11oi01ll.I0010o(108);
                            }
/* 105 */                   i11oi01ll.I0110OiO = false;
/* 107 */                   i11oi01ll.I0110o = 0;
                            break;
                        default:
/* 7 */                     I11oi01ll i11oi01ll2 = this.I00iiI;
/* 15 */                    i11oi01ll2.I00oII.showAtLocation(i11oi01ll2.I00oI0i, 55, 0, 0);
/* 18 */                    OoolOO ooolOO = i11oi01ll2.I00oO101o;
/* 20 */                    if (ooolOO != null) {
/* 22 */                        ooolOO.I00000oOI();
                            }
/* 29 */                    if (!i11oi01ll2.I00ol1 || (viewGroup = i11oi01ll2.I00olI) == null || !viewGroup.isLaidOut()) {
/* 74 */                        i11oi01ll2.I00oI0i.setAlpha(1.0f);
/* 79 */                        i11oi01ll2.I00oI0i.setVisibility(0);
                                break;
                            } else {
/* 44 */                        i11oi01ll2.I00oI0i.setAlpha(0.0f);
/* 49 */                        OoolOO ooolOOI00000oIO = OooiOl0ioo0i.I00000oIO(i11oi01ll2.I00oI0i);
/* 53 */                        ooolOOI00000oIO.I00000oIO(1.0f);
/* 56 */                        i11oi01ll2.I00oO101o = ooolOOI00000oIO;
/* 60 */                        I11loI10l1IO i11loI10l1IO = new I11loI10l1IO(0);
/* 63 */                        i11loI10l1IO.I00000oOI = this;
/* 65 */                        VarHandle.storeStoreFence();
/* 68 */                        ooolOOI00000oIO.I0000O(i11loI10l1IO);
                                break;
                            }
                            break;
                    }
                }
            }
