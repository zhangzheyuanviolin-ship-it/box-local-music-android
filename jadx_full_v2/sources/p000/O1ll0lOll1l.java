            package p000;

            import android.graphics.SurfaceTexture;
            import android.util.Size;
            import android.view.Surface;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            
            public final class O1ll0lOll1l extends Ool10o {
                public Size I0010I0i;
                public Object I0010o;
                public Oilll1I I00111O;
                public IoilI00 I001IIilI0O;

                @Override
                public final OolIl0ii1 I000II(boolean z, OolO0o0O10I oolO0o0O10I) {
/* 3 */             return new O1ll0OooIO();
                }

                @Override
                public final OolIii00oi1 I000l1(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 5 */             return new iOl0lOIi11(13);
                }

                @Override
                public final I1lIoOIi I001iOo1i0O(I1lIoOIi i1lIoOIi, I1lIoOIi i1lIoOIi2) {
/* 1 */             Size size = this.I0010I0i;
/* 15 */            I00II0Ol1O0l(Collections.singletonList(I00IO1oi11O(size).I0000Il00O()));
/* 18 */            IOiOol0 iOiOol0I00000oOI = i1lIoOIi.I00000oOI();
/* 22 */            iOiOol0I00000oOI.I00iiI = size;
/* 24 */            return iOiOol0I00000oOI.I0000O();
                }

                @Override
                public final void I001l0I00() {
/* 1 */             Oilll1I oilll1I = this.I00111O;
/* 3 */             if (oilll1I != null) {
/* 5 */                 oilll1I.I00000oOI();
                    }
/* 9 */             this.I00111O = null;
                    synchronized (this.I0010o) {
                        try {
/* 14 */                    IoilI00 ioilI00 = this.I001IIilI0O;
/* 16 */                    if (ioilI00 != null) {
/* 18 */                        ioilI00.I00000oIO();
                            }
/* 24 */                    this.I001IIilI0O = null;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final IoilI00 I00IO1(Size size) {
/* 4 */             SurfaceTexture surfaceTexture = new SurfaceTexture(0);
/* 15 */            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
/* 20 */            Surface surface = new Surface(surfaceTexture);
/* 23 */            IoilI00 ioilI00 = this.I001IIilI0O;
/* 25 */            if (ioilI00 != null) {
/* 27 */                ioilI00.I00000oIO();
                    }
/* 38 */            IoilI00 ioilI002 = new IoilI00(surface, size, this.I000OOo1O.I000o00OoI0I());
/* 41 */            this.I001IIilI0O = ioilI002;
/* 45 */            ListenableFuture listenableFutureI0000oI00 = iIllIoiiIO.I0000oI00(ioilI002.I0000oI00);
/* 53 */            Io11iII11ll io11iII11ll = new Io11iII11ll(9);
/* 56 */            io11iII11ll.I00iiI = surface;
/* 58 */            io11iII11ll.I00iiO = surfaceTexture;
/* 60 */            VarHandle.storeStoreFence();
/* 67 */            listenableFutureI0000oI00.addListener(io11iII11ll, Iii11l.I00000oIO());
/* 77 */            return ioilI002;
                }

                public final OilliIo0l0OI I00IO1oi11O(Size size) {
                    IoilI00 ioilI00I00IO1;
                    synchronized (this.I0010o) {
/* 4 */                 ioilI00I00IO1 = I00IO1(size);
                    }
/* 9 */             Oilll1I oilll1I = this.I00111O;
/* 11 */            if (oilll1I != null) {
/* 13 */                oilll1I.I00000oOI();
                    }
/* 21 */            IoOoloIoi1l ioOoloIoi1l = new IoOoloIoi1l(1);
/* 24 */            ioOoloIoi1l.I00000oOI = this;
/* 26 */            ioOoloIoi1l.I0000Il00O = size;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            Oilll1I oilll1I2 = new Oilll1I(ioOoloIoi1l);
/* 34 */            this.I00111O = oilll1I2;
/* 41 */            OilliIo0l0OI oilliIo0l0OII0000O = OilliIo0l0OI.I0000O(new O1ll0OooIO(), size);
/* 47 */            oilliIo0l0OII0000O.I00000oOI.I00iiI = 1;
/* 52 */            oilliIo0l0OII0000O.I00000oOI(ioilI00I00IO1, Iio1oiI.I0000O, -1);
/* 55 */            oilliIo0l0OII0000O.I0001Ioi1lo = oilll1I2;
/* 57 */            return oilliIo0l0OII0000O;
                }
            }
