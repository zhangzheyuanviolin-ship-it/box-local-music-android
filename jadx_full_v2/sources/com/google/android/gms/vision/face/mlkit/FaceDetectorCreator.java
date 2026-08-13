            package com.google.android.gms.vision.face.mlkit;

            import android.content.Context;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.util.Log;
            import com.google.android.gms.vision.face.FaceDetectorV2Jni;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.IIOO01;
            import p000.IOi0li0I0;
            import p000.IioIii0IO;
            import p000.Il0IIil;
            import p000.Io11llo0i;
            import p000.IoOlilli0ol;
            import p000.O0ioIo1O0lO;
            import p000.OIOiOlIO01;
            import p000.Oi1ol0llI;
            import p000.Oioo1I0o;
            import p000.OloOII1ioI1l;
            import p000.OoIOil1iIO;
            import p000.OoIOlo1001I;
            import p000.OoIol00Ool;
            import p000.i0O1lIi1O0IO;
            import p000.i1II10ol0;
            import p000.i1IiIOI0IlO;
            import p000.i1ii1o0IlIi;
            import p000.i1liOiiOI;
            import p000.iI0iI1lIo;
            import p000.iI1I0l;
            import p000.iOloOIOIII0;
            import p000.ii01iIOliOOI;
            import p000.iiOlilo0IIIl;
            import p000.l1olI0l1;
            import p000.lIOioi0II0o;
            import p000.lOio11O;
            import p000.lOl1IOlo;
            import p000.lOl1ol1OOO;
            import p000.lo011oll0;
            import p000.lo0iO1OO;
            import p000.lo1iloiI1;
            import p000.loI1oilO;
            import p000.loIol0iOiooO;
            import p000.loOI100O;
            import p000.o0IiO00l;
            import p000.o0iIO111;
            import p000.o0oIIo01;
            import p000.o10lOOO;
            
            public class FaceDetectorCreator extends loOI100O {
                @Override
                public loIol0iOiooO newFaceDetector(IoOlilli0ol ioOlilli0ol, loI1oilO loi1oilo) throws RemoteException {
/* 1 */             SystemClock.elapsedRealtime();
/* 8 */             Context context = (Context) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 13 */            i0O1lIi1O0IO i0o1lii1o0io = new i0O1lIi1O0IO(5);
/* 22 */            Oioo1I0o oioo1I0o = new Oioo1I0o(context);
/* 27 */            boolean z = false;
/* 28 */            lo011oll0 lo011oll0Var = new lo011oll0(0);
/* 33 */            ArrayList arrayList = new ArrayList();
/* 36 */            lo011oll0Var.I00000oOI = arrayList;
/* 41 */            lo011oll0 lo011oll0Var2 = new lo011oll0(1);
/* 44 */            IIOO01 iioo01 = IIOO01.I0000oI00;
/* 46 */            OoIOlo1001I.I00000oOI(context);
/* 53 */            OoIOil1iIO ooIOil1iIOI0000Il00O = OoIOlo1001I.I00000oIO().I0000Il00O(iioo01);
/* 70 */            if (IIOO01.I0000O.contains(Il0IIil.I00000oIO("json"))) {
/* 76 */                iOloOIOIII0 iolooioiii0 = new iOloOIOIII0(6);
/* 79 */                iolooioiii0.I00000oOI = ooIOil1iIOI0000Il00O;
/* 81 */                VarHandle.storeStoreFence();
/* 84 */                new O0ioIo1O0lO(iolooioiii0);
                    }
/* 92 */            iOloOIOIII0 iolooioiii02 = new iOloOIOIII0(7);
/* 95 */            iolooioiii02.I00000oOI = ooIOil1iIOI0000Il00O;
/* 97 */            VarHandle.storeStoreFence();
/* 103 */           lo011oll0Var2.I00000oOI = new O0ioIo1O0lO(iolooioiii02);
/* 105 */           VarHandle.storeStoreFence();
/* 108 */           arrayList.add(lo011oll0Var2);
/* 111 */           VarHandle.storeStoreFence();
/* 114 */           lo0iO1OO lo0io1oo = new lo0iO1OO();
/* 122 */           lo0io1oo.I000OOo1O = new HashMap();
/* 126 */           new HashMap();
/* 133 */           lo0io1oo.I00000oIO = context.getPackageName();
/* 139 */           lo0io1oo.I00000oOI = IOi0li0I0.I00000oIO(context);
/* 141 */           lo0io1oo.I0000O = oioo1I0o;
/* 143 */           lo0io1oo.I0000Il00O = lo011oll0Var;
/* 145 */           lo1iloiI1.I000II();
/* 150 */           lo0io1oo.I000II = "optional-module-face";
/* 152 */           iiOlilo0IIIl.I001IO000();
/* 159 */           Io11llo0i io11llo0i = new Io11llo0i(10);
/* 162 */           io11llo0i.I00000oOI = lo0io1oo;
/* 164 */           VarHandle.storeStoreFence();
/* 171 */           lo0io1oo.I0000oI00 = iiOlilo0IIIl.I00Io1o110i(io11llo0i);
/* 173 */           iiOlilo0IIIl.I001IO000();
/* 178 */           i1IiIOI0IlO i1iiioi0ilo = new i1IiIOI0IlO(6);
/* 181 */           i1iiioi0ilo.I00000oOI = oioo1I0o;
/* 183 */           VarHandle.storeStoreFence();
/* 190 */           lo0io1oo.I0001Ioi1lo = iiOlilo0IIIl.I00Io1o110i(i1iiioi0ilo);
/* 192 */           ii01iIOliOOI ii01iioliooi = lo0iO1OO.I000iOII;
/* 212 */           lo0io1oo.I000O01llI0 = ii01iioliooi.containsKey("optional-module-face") ? IioIii0IO.I0000O(context, (String) ii01iioliooi.get("optional-module-face"), false) : -1;
/* 214 */           VarHandle.storeStoreFence();
/* 219 */           Oi1ol0llI oi1ol0llI = new Oi1ol0llI(25, false);
/* 222 */           oi1ol0llI.I00iiI = lo0io1oo;
/* 224 */           VarHandle.storeStoreFence();
/* 227 */           i0o1lii1o0io.I00iiI = oi1ol0llI;
/* 229 */           VarHandle.storeStoreFence();
                    try {
/* 234 */               System.loadLibrary("face_detector_v2_jni");
/* 237 */               SystemClock.elapsedRealtime();
/* 244 */               oi1ol0llI.I00100l0(loi1oilo, lOl1ol1OOO.OPTIONAL_MODULE_FACE_DETECTION_CREATE, lOl1IOlo.NO_ERROR);
/* 251 */               FaceDetectorV2Jni faceDetectorV2Jni = new FaceDetectorV2Jni();
/* 254 */               i1II10ol0 i1ii10ol0 = new i1II10ol0();
/* 259 */               i1ii10ol0.I000lI = -1L;
/* 261 */               i1ii10ol0.I000II = context;
/* 263 */               i1ii10ol0.I000O01llI0 = loi1oilo;
/* 265 */               int i = loi1oilo.I00iio;
/* 267 */               iI0iI1lIo ii0ii1lioI000oI1ioi = iI1I0l.I000oI1ioi();
/* 273 */               ii0ii1lioI000oI1ioi.I0001Ioi1lo("models");
/* 280 */               iI1I0l ii1i0l = (iI1I0l) ii0ii1lioI000oI1ioi.I00000oIO();
/* 282 */               o0IiO00l o0iio00lI000oI1ioi = o0iIO111.I000oI1ioi();
/* 286 */               o0oIIo01 o0oiio01I000oI1ioi = o10lOOO.I000oI1ioi();
/* 290 */               o0oiio01I000oI1ioi.I0000O();
/* 297 */               o10lOOO.I00100l0((o10lOOO) o0oiio01I000oI1ioi.I00iiI, ii1i0l);
/* 300 */               o0oiio01I000oI1ioi.I0000O();
/* 307 */               o10lOOO.I00100o1O0lo((o10lOOO) o0oiio01I000oI1ioi.I00iiI, ii1i0l);
/* 310 */               o0oiio01I000oI1ioi.I0000O();
/* 317 */               o10lOOO.I0010I0i((o10lOOO) o0oiio01I000oI1ioi.I00iiI, ii1i0l);
/* 320 */               o0iio00lI000oI1ioi.I0000O();
/* 333 */               o0iIO111.I0010o((o0iIO111) o0iio00lI000oI1ioi.I00iiI, (o10lOOO) o0oiio01I000oI1ioi.I00000oIO());
/* 336 */               l1olI0l1 l1oli0l1I000oI1ioi = lIOioi0II0o.I000oI1ioi();
/* 340 */               l1oli0l1I000oI1ioi.I0000O();
/* 347 */               lIOioi0II0o.I00100l0((lIOioi0II0o) l1oli0l1I000oI1ioi.I00iiI, ii1i0l);
/* 350 */               l1oli0l1I000oI1ioi.I0000O();
/* 357 */               lIOioi0II0o.I00100o1O0lo((lIOioi0II0o) l1oli0l1I000oI1ioi.I00iiI, ii1i0l);
/* 360 */               o0iio00lI000oI1ioi.I0000O();
/* 373 */               o0iIO111.I00111O((o0iIO111) o0iio00lI000oI1ioi.I00iiI, (lIOioi0II0o) l1oli0l1I000oI1ioi.I00000oIO());
/* 376 */               i1ii1o0IlIi i1ii1o0iliiI000oI1ioi = i1liOiiOI.I000oI1ioi();
/* 380 */               i1ii1o0iliiI000oI1ioi.I0000O();
/* 387 */               i1liOiiOI.I00100o1O0lo((i1liOiiOI) i1ii1o0iliiI000oI1ioi.I00iiI, ii1i0l);
/* 390 */               i1ii1o0iliiI000oI1ioi.I0000O();
/* 397 */               i1liOiiOI.I0010I0i((i1liOiiOI) i1ii1o0iliiI000oI1ioi.I00iiI, ii1i0l);
/* 400 */               i1ii1o0iliiI000oI1ioi.I0000O();
/* 407 */               i1liOiiOI.I0010o((i1liOiiOI) i1ii1o0iliiI000oI1ioi.I00iiI, ii1i0l);
/* 410 */               i1ii1o0iliiI000oI1ioi.I0000O();
/* 417 */               i1liOiiOI.I00111O((i1liOiiOI) i1ii1o0iliiI000oI1ioi.I00iiI, ii1i0l);
/* 420 */               o0iio00lI000oI1ioi.I0000O();
/* 433 */               o0iIO111.I001IIilI0O((o0iIO111) o0iio00lI000oI1ioi.I00iiI, (i1liOiiOI) i1ii1o0iliiI000oI1ioi.I00000oIO());
/* 441 */               boolean z2 = i == 2;
/* 442 */               o0iio00lI000oI1ioi.I0000O();
/* 449 */               o0iIO111.I001IO000((o0iIO111) o0iio00lI000oI1ioi.I00iiI, z2);
/* 452 */               if (!z2 && loi1oilo.I00ilI0I1) {
/* 458 */                   z = true;
                        }
/* 459 */               o0iio00lI000oI1ioi.I0000O();
/* 466 */               o0iIO111.I00100o1O0lo((o0iIO111) o0iio00lI000oI1ioi.I00iiI, z);
/* 469 */               float f = loi1oilo.I00ilO0;
/* 471 */               o0iio00lI000oI1ioi.I0000O();
/* 478 */               o0iIO111.I00100l0((o0iIO111) o0iio00lI000oI1ioi.I00iiI, f);
/* 481 */               o0iio00lI000oI1ioi.I0000O();
/* 488 */               o0iIO111.I0010I0i((o0iIO111) o0iio00lI000oI1ioi.I00iiI);
/* 491 */               if (z2) {
/* 494 */                   o0iio00lI000oI1ioi.I000II(4);
/* 497 */                   o0iio00lI000oI1ioi.I0001Ioi1lo(4);
                        } else {
/* 501 */                   int i2 = loi1oilo.I00iOIl;
/* 504 */                   if (i2 == 1) {
/* 513 */                       o0iio00lI000oI1ioi.I000II(2);
                            } else if (i2 == 2) {
/* 509 */                       o0iio00lI000oI1ioi.I000II(3);
                            }
/* 516 */                   int i3 = loi1oilo.I00iiI;
/* 518 */                   if (i3 == 1) {
/* 527 */                       o0iio00lI000oI1ioi.I0001Ioi1lo(2);
                            } else if (i3 == 2) {
/* 523 */                       o0iio00lI000oI1ioi.I0001Ioi1lo(3);
                            }
/* 530 */                   int i4 = loi1oilo.I00iiO;
/* 532 */                   if (i4 == 1) {
/* 548 */                       o0iio00lI000oI1ioi.I0000O();
/* 555 */                       o0iIO111.I001l0I00((o0iIO111) o0iio00lI000oI1ioi.I00iiI, 2);
                            } else if (i4 == 2) {
/* 537 */                       o0iio00lI000oI1ioi.I0000O();
/* 544 */                       o0iIO111.I001l0I00((o0iIO111) o0iio00lI000oI1ioi.I00iiI, 3);
                            }
                        }
/* 564 */               i1ii10ol0.I000OOo1O = (o0iIO111) o0iio00lI000oI1ioi.I00000oIO();
/* 566 */               i1ii10ol0.I000OiO = faceDetectorV2Jni;
/* 568 */               i1ii10ol0.I000iOII = i0o1lii1o0io;
/* 574 */               OoIol00Ool ooIol00Ool = new OoIol00Ool(14);
/* 582 */               ooIol00Ool.I00iiO = new AtomicLong(-1L);
/* 586 */               OloOII1ioI1l oloOII1ioI1l = new OloOII1ioI1l();
/* 591 */               oloOII1ioI1l.I00000oOI = "mlkit:vision";
/* 593 */               VarHandle.storeStoreFence();
/* 600 */               ooIol00Ool.I00iiI = lOio11O.I00000oIO(context, oloOII1ioI1l);
/* 602 */               VarHandle.storeStoreFence();
/* 605 */               i1ii10ol0.I000l1 = ooIol00Ool;
/* 607 */               VarHandle.storeStoreFence();
/* 610 */               return i1ii10ol0;
                    } catch (UnsatisfiedLinkError e) {
/* 616 */               Log.e("FaceDetectorCreator", "Failed to load library face_detector_v2_jni");
/* 619 */               SystemClock.elapsedRealtime();
/* 630 */               ((Oi1ol0llI) i0o1lii1o0io.I00iiI).I00100l0(loi1oilo, lOl1ol1OOO.OPTIONAL_MODULE_FACE_DETECTION_CREATE, lOl1IOlo.OPTIONAL_MODULE_CREATE_ERROR);
/* 900 */               throw ((RemoteException) new RemoteException("Failed to load library face_detector_v2_jni").initCause(e));
                    }
                }
            }
