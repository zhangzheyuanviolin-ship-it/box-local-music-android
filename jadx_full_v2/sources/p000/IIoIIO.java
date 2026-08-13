            package p000;

            import android.app.Activity;
            import android.graphics.SurfaceTexture;
            import android.view.Surface;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class IIoIIO implements IOo1llI {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                public IIoIIO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final void accept(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 117 */                   Surface surface = (Surface) this.I00000oOI;
/* 121 */                   SurfaceTexture surfaceTexture = (SurfaceTexture) this.I0000Il00O;
/* 125 */                   surface.release();
/* 128 */                   surfaceTexture.release();
                            break;
                        case 1:
/* 74 */                    IiI1oOoo iiI1oOoo = (IiI1oOoo) this.I00000oOI;
/* 78 */                    OliolIlIO oliolIlIO = (OliolIlIO) this.I0000Il00O;
/* 82 */                    oliolIlIO.close();
/* 91 */                    Surface surface2 = (Surface) iiI1oOoo.I000O01llI0.remove(oliolIlIO);
/* 93 */                    if (surface2 != null) {
/* 95 */                        OIi0ooo0l1 oIi0ooo0l1 = iiI1oOoo.I00000oIO;
/* 101 */                       Ilo0O01IO.I0000O((AtomicBoolean) oIi0ooo0l1.I00iiO, true);
/* 108 */                       Ilo0O01IO.I0000Il00O((Thread) oIi0ooo0l1.I00ilI0I1);
/* 111 */                       oIi0ooo0l1.I000o00OoI0I(surface2, true);
                                break;
                            }
                            break;
                        case 2:
/* 31 */                    Iio1000IOoi1 iio1000IOoi1 = (Iio1000IOoi1) this.I00000oOI;
/* 35 */                    OliolIlIO oliolIlIO2 = (OliolIlIO) this.I0000Il00O;
/* 39 */                    oliolIlIO2.close();
/* 48 */                    Surface surface3 = (Surface) iio1000IOoi1.I000O01llI0.remove(oliolIlIO2);
/* 50 */                    if (surface3 != null) {
/* 52 */                        Iio0oli1Ool iio0oli1Ool = iio1000IOoi1.I00000oIO;
/* 58 */                        Ilo0O01IO.I0000O((AtomicBoolean) iio0oli1Ool.I00iiO, true);
/* 65 */                        Ilo0O01IO.I0000Il00O((Thread) iio0oli1Ool.I00ilI0I1);
/* 68 */                        iio0oli1Ool.I000o00OoI0I(surface3, true);
                                break;
                            }
                            break;
                        default:
/* 9 */                     Ol0I0o1OI1i ol0I0o1OI1i = (Ol0I0o1OI1i) this.I00000oOI;
/* 13 */                    Activity activity = (Activity) this.I0000Il00O;
/* 17 */                    IoIlOo1o0IIl ioIlOo1o0IIl = ol0I0o1OI1i.I0000oI00;
/* 19 */                    if (ioIlOo1o0IIl != null) {
/* 25 */                        ioIlOo1o0IIl.I00IO1oi11O(activity, ol0I0o1OI1i.I00000oIO(activity));
                                break;
                            }
                            break;
                    }
                }
            }
