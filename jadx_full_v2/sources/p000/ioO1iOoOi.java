            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.drawable.Drawable;
            import android.net.ConnectivityManager;
            import android.net.NetworkRequest;
            import android.net.Uri;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public abstract class ioO1iOoOi {
                /* JADX WARN: Multi-variable type inference failed */
                public static final OOllOII I00000oIO(Context context) {
                    i1O01oOIoI0I i1o01ooioi0i;
/* 3 */             IoiIlI1oOO ioiIlI1oOO = new IoiIlI1oOO();
/* 6 */             Context applicationContext = context.getApplicationContext();
/* 10 */            ioiIlI1oOO.I00iOIl = applicationContext;
/* 12 */            IiI0llI1IoIi iiI0llI1IoIi = I0001Ioi1lo.I00000oIO;
/* 16 */            Il1O00 il1O00 = Il1O00.I00iOIl;
/* 20 */            I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(13);
/* 23 */            i0IIiO0iI.I00iiI = il1O00;
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            VarHandle.storeStoreFence();
/* 41 */            OllO00oiil ollO00oiil = new OllO00oiil(new IoiIl0(ioiIlI1oOO, 0));
/* 52 */            OllO00oiil ollO00oiil2 = new OllO00oiil(new IoiIl0(ioiIlI1oOO, 1));
/* 59 */            OllO00oiil ollO00oiil3 = new OllO00oiil(IiIOOioOO.I00ilI0I1);
/* 64 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 70 */            IOiOll1i iOiOll1i = new IOiOll1i(il01100l, il01100l, il01100l, il01100l, il01100l);
/* 73 */            OOllOII oOllOII = new OOllOII();
/* 76 */            oOllOII.I00000oIO = iiI0llI1IoIi;
/* 78 */            oOllOII.I00000oOI = ollO00oiil;
/* 80 */            oOllOII.I0000Il00O = ollO00oiil2;
/* 82 */            oOllOII.I0000O = ollO00oiil3;
/* 84 */            oOllOII.I0000oI00 = iOiOll1i;
/* 86 */            oOllOII.I0001Ioi1lo = i0IIiO0iI;
/* 88 */            Oliiii0 oliiii0I00000oIO = lOi1li0o0.I00000oIO();
/* 92 */            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 111 */           il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(oliiii0I00000oIO, O1OI1l011OO1.I00000oIO.I00ilI0I1).I00ioIO(new Ii01OiI(oOllOII)));
/* 116 */           OllO11Iooi ollO11Iooi = new OllO11Iooi();
/* 119 */           ollO11Iooi.I00iOIl = applicationContext;
/* 126 */           ollO11Iooi.I00iiI = new WeakReference(oOllOII);
/* 134 */           ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
/* 136 */           int i = 11;
/* 142 */           if (connectivityManager == null || iOI10i0I11.I00000oIO(applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
/* 196 */               i1o01ooioi0i = new i1O01oOIoI0I(i);
                    } else {
                        try {
/* 154 */                   IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(24, false);
/* 157 */                   ioIlOo1o0IIl.I00iiI = connectivityManager;
/* 159 */                   ioIlOo1o0IIl.I00iiO = ollO11Iooi;
/* 163 */                   OOllio0oI oOllio0oI = new OOllio0oI(ioIlOo1o0IIl);
/* 166 */                   ioIlOo1o0IIl.I00iio = oOllio0oI;
/* 181 */                   connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), oOllio0oI);
/* 184 */                   VarHandle.storeStoreFence();
                            i1o01ooioi0i = ioIlOo1o0IIl;
                        } catch (Exception unused) {
/* 190 */                   i1o01ooioi0i = new i1O01oOIoI0I(i);
                        }
                    }
/* 199 */           ollO11Iooi.I00iiO = i1o01ooioi0i;
/* 205 */           ollO11Iooi.I00iio = i1o01ooioi0i.I0000Il00O();
/* 212 */           ollO11Iooi.I00ilI0I1 = new AtomicBoolean(false);
/* 214 */           VarHandle.storeStoreFence();
/* 219 */           I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(24);
/* 222 */           i1I0i0Ilo1Oi.I00iiI = ollO11Iooi;
/* 229 */           i1I0i0Ilo1Oi.I00iiO = new l1I0oI(12);
/* 231 */           VarHandle.storeStoreFence();
/* 234 */           oOllOII.I000II = i1I0i0Ilo1Oi;
/* 236 */           IOiOll1i iOiOll1i2 = oOllOII.I0000oI00;
/* 241 */           I1ii1o0 i1ii1o0 = new I1ii1o0(6, false);
/* 253 */           i1ii1o0.I00iiI = new ArrayList(iOiOll1i2.I00000oIO);
/* 264 */           i1ii1o0.I00iiO = new ArrayList(iOiOll1i2.I00000oOI);
/* 275 */           i1ii1o0.I00iio = new ArrayList(iOiOll1i2.I0000Il00O);
/* 286 */           i1ii1o0.I00ilI0I1 = new ArrayList(iOiOll1i2.I0000O);
/* 297 */           i1ii1o0.I00ilO0 = new ArrayList(iOiOll1i2.I0000oI00);
/* 299 */           VarHandle.storeStoreFence();
/* 310 */           i1ii1o0.I000o00OoI0I(new IIIiOOOloI(2), IoOi01OlIl1o.class);
/* 321 */           i1ii1o0.I000o00OoI0I(new IIIiOOOloI(5), String.class);
/* 331 */           i1ii1o0.I000o00OoI0I(new IIIiOOOloI(1), Uri.class);
/* 340 */           i1ii1o0.I000o00OoI0I(new IIIiOOOloI(4), Uri.class);
/* 351 */           i1ii1o0.I000o00OoI0I(new IIIiOOOloI(3), Integer.class);
/* 361 */           i1ii1o0.I000o00OoI0I(new IIIiOOOloI(0), byte[].class);
/* 378 */           ((ArrayList) i1ii1o0.I00iio).add(new OIoi0IIoi(new IlIOo1ol0lo(1), Uri.class));
/* 385 */           oOllOII.I0001Ioi1lo.getClass();
/* 388 */           IlIOo1ol0lo ilIOo1ol0lo = new IlIOo1ol0lo(0);
/* 391 */           VarHandle.storeStoreFence();
/* 405 */           ((ArrayList) i1ii1o0.I00iio).add(new OIoi0IIoi(ilIOo1ol0lo, File.class));
/* 410 */           OllO00oiil ollO00oiil4 = oOllOII.I0000O;
/* 412 */           OllO00oiil ollO00oiil5 = oOllOII.I0000Il00O;
/* 416 */           oOllOII.I0001Ioi1lo.getClass();
/* 419 */           IoOOIiIoI0 ioOOIiIoI0 = new IoOOIiIoI0();
/* 422 */           ioOOIiIoI0.I00000oIO = ollO00oiil4;
/* 424 */           ioOOIiIoI0.I00000oOI = ollO00oiil5;
/* 426 */           VarHandle.storeStoreFence();
/* 429 */           i1ii1o0.I000oI1ioi(ioOOIiIoI0, Uri.class);
/* 437 */           i1ii1o0.I000oI1ioi(new I1O1Ii(5), File.class);
/* 445 */           i1ii1o0.I000oI1ioi(new I1O1Ii(0), Uri.class);
/* 453 */           i1ii1o0.I000oI1ioi(new I1O1Ii(3), Uri.class);
/* 461 */           i1ii1o0.I000oI1ioi(new I1O1Ii(6), Uri.class);
/* 471 */           i1ii1o0.I000oI1ioi(new I1O1Ii(4), Drawable.class);
/* 481 */           i1ii1o0.I000oI1ioi(new I1O1Ii(1), Bitmap.class);
/* 492 */           i1ii1o0.I000oI1ioi(new I1O1Ii(2), ByteBuffer.class);
/* 497 */           I0IIiO0iI i0IIiO0iI2 = oOllOII.I0001Ioi1lo;
/* 499 */           i0IIiO0iI2.getClass();
/* 504 */           Il1O00 il1O002 = (Il1O00) i0IIiO0iI2.I00iiI;
/* 506 */           II0llOIO iI0llOIO = new II0llOIO();
/* 509 */           iI0llOIO.I00000oIO = il1O002;
/* 511 */           int i2 = Oil0oilOiO.I00000oIO;
/* 518 */           iI0llOIO.I00000oOI = new Oil0oOll1(4);
/* 520 */           VarHandle.storeStoreFence();
/* 527 */           ((ArrayList) i1ii1o0.I00ilO0).add(iI0llOIO);
/* 572 */           IOiOll1i iOiOll1i3 = new IOiOll1i(iO1o1Io1.I00000oIO((ArrayList) i1ii1o0.I00iiI), iO1o1Io1.I00000oIO((ArrayList) i1ii1o0.I00iiO), iO1o1Io1.I00000oIO((ArrayList) i1ii1o0.I00iio), iO1o1Io1.I00000oIO((ArrayList) i1ii1o0.I00ilI0I1), iO1o1Io1.I00000oIO((ArrayList) i1ii1o0.I00ilO0));
/* 575 */           oOllOII.I000O01llI0 = iOiOll1i3;
/* 577 */           List list = iOiOll1i3.I00000oIO;
/* 583 */           Il0OiIi il0OiIi = new Il0OiIi();
/* 586 */           il0OiIi.I00000oIO = oOllOII;
/* 588 */           il0OiIi.I00000oOI = i1I0i0Ilo1Oi;
/* 592 */           iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 595 */           iiolilo0iiil.I00iOIl = oOllOII;
/* 597 */           VarHandle.storeStoreFence();
/* 600 */           il0OiIi.I0000Il00O = iiolilo0iiil;
/* 602 */           VarHandle.storeStoreFence();
/* 609 */           oOllOII.I000OOo1O = IOOi0Ool1i.I00OI1(list, il0OiIi);
/* 613 */           new AtomicBoolean(false);
/* 618 */           ollO11Iooi.I00iOIl.registerComponentCallbacks(ollO11Iooi);
/* 621 */           VarHandle.storeStoreFence();
/* 1261 */          return oOllOII;
                }
            }
