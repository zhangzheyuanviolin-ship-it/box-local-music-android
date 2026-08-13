            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.local.dao.RagChunkDao;
            import com.google.ai.edge.gallery.data.local.entities.RagChunkEntity;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.jegly.offlineLLM.smollm.SmolLM;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.FloatBuffer;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.jvm.functions.Function1;
            
/* 12 */    public final class OO11OilO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OO11OilO(Object obj, Object obj2, Object obj3, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = obj;
/* 5 */             this.I00iio = obj2;
/* 7 */             this.I00ilI0I1 = obj3;
                }

                private final Object I00000oIO(Object obj) throws Throwable {
                    OI1I0OoOl oI1I0OoOl;
/* 3 */             I01O1lIi i01O1lIi = (I01O1lIi) this.I00ilI0I1;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiI;
/* 11 */            if (i == 0) {
/* 33 */                lIoii1l01l0i.I00000oOI(obj);
/* 37 */                Oii110oOoO oii110oOoO = (Oii110oOoO) i01O1lIi;
/* 39 */                Ol1olI0o1I01 ol1olI0o1I01 = oii110oOoO.I00ioIO;
/* 41 */                if (ol1olI0o1I01 != null) {
/* 47 */                    ol1olI0o1I01.I0000oI00(oii110oOoO, iO1IIloiOoiO.I00000oIO, oii110oOoO.I00io1l);
                        }
/* 50 */                OI1I0OoOl oI1I0OoOl2 = oii110oOoO.I00li1OI;
/* 52 */                this.I00iiO = oI1I0OoOl2;
/* 54 */                this.I00iio = i01O1lIi;
/* 56 */                this.I00iiI = 1;
/* 62 */                if (oI1I0OoOl2.I00000oIO(this) == ii0111o) {
/* 64 */                    return ii0111o;
                        }
/* 65 */                oI1I0OoOl = oI1I0OoOl2;
                    } else {
/* 13 */                if (i != 1) {
/* 29 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                    return null;
                        }
/* 17 */                i01O1lIi = (I01O1lIi) this.I00iio;
/* 21 */                oI1I0OoOl = (OI1I0OoOl) this.I00iiO;
/* 23 */                lIoii1l01l0i.I00000oOI(obj);
                    }
                    try {
/* 78 */                ((Oii110oOoO) i01O1lIi).I00iio = ((Oii110oOoO) i01O1lIi).I00iiI.getValue();
/* 83 */                IIoOoIol0Io0 iIoOoIol0Io0 = ((Oii110oOoO) i01O1lIi).I00l0OO0IO;
/* 85 */                if (iIoOoIol0Io0 != null) {
/* 96 */                    iIoOoIol0Io0.resumeWith(((Oii110oOoO) i01O1lIi).I00iiI.getValue());
                        }
/* 104 */               ((Oii110oOoO) i01O1lIi).I00l0OO0IO = null;
/* 106 */               oI1I0OoOl.I00000oOI(null);
/* 109 */               return OoiIlOl1iI.I00000oIO;
                    } catch (Throwable th) {
/* 112 */               oI1I0OoOl.I00000oOI(null);
/* 168 */               throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:74:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I000II(Object obj) throws Throwable {
                    OO01Ol oO01Ol;
                    Object objI0000Il00O;
                    OIOiiiloOio oIOiiiloOio;
                    ReentrantLock reentrantLock;
                    OIOii1iO1[] oIOii1iO1Arr;
                    OIOii1iO1 oIOii1iO1;
                    OIOiiiloOio oIOiiiloOio2;
                    ReentrantLock reentrantLock2;
                    boolean z;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiI;
/* 11 */            boolean z2 = false;
/* 13 */            if (i == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(obj);
/* 58 */                oO01Ol = (OO01Ol) this.I00iiO;
/* 60 */                this.I00iiO = oO01Ol;
/* 62 */                this.I00iiI = 1;
/* 64 */                objI0000Il00O = oO01Ol.I0000Il00O(this);
/* 68 */                if (objI0000Il00O != ii0111o) {
                        }
/* 191 */               return ii0111o;
                    }
/* 15 */            if (i != 1) {
/* 17 */                if (i != 2) {
/* 39 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                    return null;
                        }
/* 21 */                reentrantLock2 = (ReentrantLock) this.I00iio;
/* 26 */                oIOiiiloOio2 = (OIOiiiloOio) this.I00iiO;
                        try {
/* 28 */                    lIoii1l01l0i.I00000oOI(obj);
/* 194 */                   reentrantLock = reentrantLock2;
/* 195 */                   oIOiiiloOio = oIOiiiloOio2;
/* 208 */                   oIOiiiloOio.I0001Ioi1lo = false;
/* 210 */                   reentrantLock.unlock();
/* 213 */                   return ooiIlOl1iI;
                        } catch (Throwable th) {
/* 33 */                    th = th;
/* 34 */                    z = false;
                            try {
/* 202 */                       oIOiiiloOio2.I0001Ioi1lo = z;
/* 204 */                       throw th;
                            } catch (Throwable th2) {
/* 205 */                       th = th2;
/* 206 */                       reentrantLock = reentrantLock2;
/* 220 */                       reentrantLock.unlock();
/* 437 */                       throw th;
                            }
                        }
                    }
/* 45 */            oO01Ol = (OO01Ol) this.I00iiO;
/* 47 */            lIoii1l01l0i.I00000oOI(obj);
/* 50 */            objI0000Il00O = obj;
/* 78 */            if (((Boolean) objI0000Il00O).booleanValue()) {
/* 80 */                return ooiIlOl1iI;
                    }
/* 83 */            OoIlIoo1oiOo ooIlIoo1oiOo = (OoIlIoo1oiOo) this.I00ilI0I1;
/* 87 */            oIOiiiloOio = (OIOiiiloOio) ooIlIoo1oiOo.I00ioIO;
/* 89 */            reentrantLock = oIOiiiloOio.I0000oI00;
/* 91 */            reentrantLock.lock();
                    try {
/* 94 */                oIOiiiloOio.I0001Ioi1lo = true;
/* 96 */                ReentrantLock reentrantLock3 = oIOiiiloOio.I00000oIO;
/* 98 */                reentrantLock3.lock();
                        try {
/* 103 */                   if (oIOiiiloOio.I0000O) {
/* 107 */                       oIOiiiloOio.I0000O = false;
/* 111 */                       int length = oIOiiiloOio.I00000oOI.length;
/* 112 */                       oIOii1iO1Arr = new OIOii1iO1[length];
/* 114 */                       int i2 = 0;
/* 115 */                       boolean z3 = false;
/* 116 */                       while (i2 < length) {
/* 130 */                           boolean z4 = oIOiiiloOio.I00000oOI[i2] > 0 ? true : z2;
/* 131 */                           boolean[] zArr = oIOiiiloOio.I0000Il00O;
/* 135 */                           if (z4 != zArr[i2]) {
/* 137 */                               zArr[i2] = z4;
/* 147 */                               oIOii1iO1 = z4 ? OIOii1iO1.I00iiI : OIOii1iO1.I00iiO;
/* 143 */                               z3 = true;
                                    } else {
/* 150 */                               oIOii1iO1 = OIOii1iO1.I00iOIl;
                                    }
/* 152 */                           oIOii1iO1Arr[i2] = oIOii1iO1;
/* 154 */                           i2++;
/* 157 */                           z2 = false;
                                }
/* 160 */                       if (!z3) {
                                }
/* 165 */                       if (oIOii1iO1Arr != null) {
                                    try {
/* 168 */                               if (oIOii1iO1Arr.length != 0) {
/* 171 */                                   OoI0Oii0Ol00 ooI0Oii0Ol00 = OoI0Oii0Ol00.I00iiI;
/* 175 */                                   OoIlI111 ooIlI111 = new OoIlI111(oIOii1iO1Arr, ooIlIoo1oiOo, oO01Ol, null);
/* 178 */                                   this.I00iiO = oIOiiiloOio;
/* 180 */                                   this.I00iio = reentrantLock;
/* 183 */                                   this.I00iiI = 2;
/* 189 */                                   if (oO01Ol.I0000oI00(ooI0Oii0Ol00, ooIlI111, this) != ii0111o) {
/* 192 */                                       oIOiiiloOio2 = oIOiiiloOio;
/* 193 */                                       reentrantLock2 = reentrantLock;
/* 194 */                                       reentrantLock = reentrantLock2;
/* 195 */                                       oIOiiiloOio = oIOiiiloOio2;
                                            }
/* 191 */                                   return ii0111o;
                                        }
                                    } catch (Throwable th3) {
/* 198 */                               th = th3;
/* 199 */                               oIOiiiloOio2 = oIOiiiloOio;
/* 200 */                               reentrantLock2 = reentrantLock;
/* 201 */                               z = false;
/* 202 */                               oIOiiiloOio2.I0001Ioi1lo = z;
/* 204 */                               throw th;
                                    }
                                }
/* 208 */                       oIOiiiloOio.I0001Ioi1lo = false;
/* 210 */                       reentrantLock.unlock();
/* 213 */                       return ooiIlOl1iI;
                            }
/* 105 */                   oIOii1iO1Arr = null;
/* 165 */                   if (oIOii1iO1Arr != null) {
                            }
/* 208 */                   oIOiiiloOio.I0001Ioi1lo = false;
/* 210 */                   reentrantLock.unlock();
/* 213 */                   return ooiIlOl1iI;
                        } finally {
/* 216 */                   reentrantLock3.unlock();
                        }
                    } catch (Throwable th4) {
/* 214 */               th = th4;
/* 220 */               reentrantLock.unlock();
/* 437 */               throw th;
                    }
                }

                private final Object I000O01llI0(Object obj) throws Throwable {
/* 3 */             Ool0lIIlll ool0lIIlll = (Ool0lIIlll) this.I00iiO;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiI;
/* 11 */            if (i == 0) {
/* 25 */                lIoii1l01l0i.I00000oOI(obj);
/* 30 */                Context context = (Context) this.I00iio;
/* 34 */                Uri uri = (Uri) this.I00ilI0I1;
/* 36 */                this.I00iiI = 1;
/* 38 */                IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 48 */                obj = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new I1o0lo01(context, uri, null, 5), this);
/* 52 */                if (obj == ii0111o) {
/* 54 */                    return ii0111o;
                        }
                    } else {
/* 13 */                if (i != 1) {
/* 21 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                     return null;
                        }
/* 15 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 56 */            Bitmap bitmap = (Bitmap) obj;
/* 58 */            OlO0OIIl1 olO0OIIl1 = ool0lIIlll.I00000oOI;
/* 99 */            Ool0l1o1 ool0l1o1I00000oIO = bitmap != null ? Ool0l1o1.I00000oIO((Ool0l1o1) olO0OIIl1.getValue(), bitmap, null, false, 0.0f, false, false, null, 20) : Ool0l1o1.I00000oIO((Ool0l1o1) olO0OIIl1.getValue(), null, null, false, 0.0f, false, false, "Couldn't read that image", 63);
/* 103 */           olO0OIIl1.getClass();
/* 106 */           olO0OIIl1.I000lI(null, ool0l1o1I00000oIO);
/* 109 */           return OoiIlOl1iI.I00000oIO;
                }

                private final Object I000iOII(Object obj) throws Throwable {
                    Object objI0000oI00;
/* 5 */             Ool0lIIlll ool0lIIlll = (Ool0lIIlll) this.I00ilI0I1;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i = this.I00iiI;
/* 11 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 13 */            if (i == 0) {
/* 30 */                lIoii1l01l0i.I00000oOI(obj);
/* 36 */                Ool0OI ool0OI = (Ool0OI) this.I00iiO;
/* 41 */                Bitmap bitmap = (Bitmap) this.I00iio;
/* 47 */                Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(17);
/* 50 */                ol1OiIli00Ii.I00iiI = ool0lIIlll;
/* 52 */                VarHandle.storeStoreFence();
/* 55 */                this.I00iiI = 1;
/* 65 */                objI0000oI00 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new OOl11O0ii0II(ool0OI, bitmap, ol1OiIli00Ii, iOoil1iiIilo, 2), this);
/* 69 */                if (objI0000oI00 == ii0111o) {
/* 71 */                    return ii0111o;
                        }
                    } else {
/* 15 */                if (i != 1) {
/* 25 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 28 */                    return null;
                        }
/* 17 */                lIoii1l01l0i.I00000oOI(obj);
/* 20 */                objI0000oI00 = obj;
                    }
/* 73 */            Bitmap bitmap2 = (Bitmap) objI0000oI00;
/* 75 */            OlO0OIIl1 olO0OIIl1 = ool0lIIlll.I00000oOI;
/* 118 */           Ool0l1o1 ool0l1o1I00000oIO = bitmap2 != null ? Ool0l1o1.I00000oIO((Ool0l1o1) olO0OIIl1.getValue(), null, bitmap2, false, 1.0f, false, false, null, 113) : Ool0l1o1.I00000oIO((Ool0l1o1) olO0OIIl1.getValue(), null, null, false, 0.0f, false, false, "Upscaling failed — check logcat for details", 59);
/* 122 */           olO0OIIl1.getClass();
/* 125 */           olO0OIIl1.I000lI(null, ool0l1o1I00000oIO);
/* 128 */           return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 537 */                   OO11OilO oO11OilO = new OO11OilO((OoIlIoo1oiOo) this.I00iio, (OOo0l0ii10l) obj2, iOoil1iiIilo, 0);
/* 540 */                   oO11OilO.I00iiO = obj;
/* 542 */                   return oO11OilO;
                        case 1:
/* 523 */                   return new OO11OilO((OOiIOI10OOIi) this.I00iiO, (O00iOil) this.I00iio, (Oi0IO111o10) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 500 */                   OO11OilO oO11OilO2 = new OO11OilO((iOliil) obj2, iOoil1iiIilo, 2);
/* 503 */                   oO11OilO2.I00iiO = obj;
/* 505 */                   return oO11OilO2;
                        case 3:
/* 490 */                   return new OO11OilO((List) this.I00iiO, (OOl0lo) this.I00iio, (float[]) obj2, iOoil1iiIilo, 3);
                        case 4:
/* 469 */                   return new OO11OilO((OOl1OlI0) this.I00iiO, (Uri) this.I00iio, (String) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 446 */                   OO11OilO oO11OilO3 = new OO11OilO((IoiOl011o) this.I00iio, (OOllOII) obj2, iOoil1iiIilo, 5);
/* 449 */                   oO11OilO3.I00iiO = obj;
/* 451 */                   return oO11OilO3;
                        case 6:
/* 430 */                   OO11OilO oO11OilO4 = new OO11OilO((OOlooO1oiOlo) this.I00iio, (I101iI1i) obj2, iOoil1iiIilo, 6);
/* 433 */                   oO11OilO4.I00iiO = obj;
/* 435 */                   return oO11OilO4;
                        case 7:
/* 416 */                   return new OO11OilO((Illill0o) this.I00iio, (Oll0oO) obj2, iOoil1iiIilo, 7);
                        case 8:
/* 402 */                   return new OO11OilO((IiI0O1Io) this.I00iiO, (OloIl1l1oOii) this.I00iio, (O1oIOiI11o0) obj2, iOoil1iiIilo, 8);
                        case 9:
/* 378 */                   OO11OilO oO11OilO5 = new OO11OilO((IOi10loi) this.I00iio, (IlliIl1l11O) obj2, iOoil1iiIilo, 9);
/* 381 */                   oO11OilO5.I00iiO = obj;
/* 383 */                   return oO11OilO5;
                        case 10:
/* 361 */                   OO11OilO oO11OilO6 = new OO11OilO((Iililo00OiO) this.I00iio, (Oii00o1ll) obj2, iOoil1iiIilo, 10);
/* 364 */                   oO11OilO6.I00iiO = obj;
/* 366 */                   return oO11OilO6;
                        case 11:
/* 344 */                   OO11OilO oO11OilO7 = new OO11OilO((Oii00o1ll) this.I00iio, (IlliIl1l11O) obj2, iOoil1iiIilo, 11);
/* 347 */                   oO11OilO7.I00iiO = obj;
/* 349 */                   return oO11OilO7;
                        case 12:
/* 327 */                   OO11OilO oO11OilO8 = new OO11OilO((OlO01l1oOil) this.I00iio, (I10i01) obj2, iOoil1iiIilo, 12);
/* 330 */                   oO11OilO8.I00iiO = obj;
/* 332 */                   return oO11OilO8;
                        case 13:
/* 312 */                   return new OO11OilO((OI10i0Il) this.I00iio, (OI10i0Il) obj2, iOoil1iiIilo, 13);
                        case 14:
/* 297 */                   return new OO11OilO((ArrayList) this.I00iiO, (Ol0o1OiOIIIl) this.I00iio, (Set) obj2, iOoil1iiIilo, 14);
                        case 15:
/* 275 */                   return new OO11OilO((Ol0ioI1iI) this.I00iiO, (Ol0o1OiOIIIl) this.I00iio, (I0Iol0OOiO) obj2, iOoil1iiIilo, 15);
                        case 16:
/* 253 */                   return new OO11OilO((OO1io0l0) this.I00iiO, (OI0lOIiOIOOo) this.I00iio, (Ol111o0) obj2, iOoil1iiIilo, 16);
                        case 17:
/* 229 */                   OO11OilO oO11OilO9 = new OO11OilO((SmolLM) this.I00iio, (String) obj2, iOoil1iiIilo, 17);
/* 232 */                   oO11OilO9.I00iiO = obj;
/* 234 */                   return oO11OilO9;
                        case PoseLandmark.RIGHT_PINKY:
/* 212 */                   OO11OilO oO11OilO10 = new OO11OilO((Ii00l101O) this.I00iio, (IlOil1ii) obj2, iOoil1iiIilo, 18);
/* 215 */                   oO11OilO10.I00iiO = obj;
/* 217 */                   return oO11OilO10;
                        case PoseLandmark.LEFT_INDEX:
/* 197 */                   return new OO11OilO((OlOI1O) obj2, iOoil1iiIilo, 19);
                        case PoseLandmark.RIGHT_INDEX:
/* 186 */                   return new OO11OilO((Ii10ioolOI) this.I00iiO, (Oi0IO1ii011) this.I00iio, (Function1) obj2, iOoil1iiIilo, 20);
                        case PoseLandmark.LEFT_THUMB:
/* 164 */                   return new OO11OilO((Oo0I0O1Ii0o0) this.I00iiO, (OOIII0OOoOi1) this.I00iio, (OO1il00lI) obj2, iOoil1iiIilo, 21);
                        case PoseLandmark.RIGHT_THUMB:
/* 140 */                   OO11OilO oO11OilO11 = new OO11OilO((O010OIi) this.I00iio, (IlliIl1l11O) obj2, iOoil1iiIilo, 22);
/* 143 */                   oO11OilO11.I00iiO = obj;
/* 145 */                   return oO11OilO11;
                        case PoseLandmark.LEFT_HIP:
/* 125 */                   return new OO11OilO((Oloo0l1lIl) this.I00iio, (Ololli) obj2, iOoil1iiIilo, 23);
                        case PoseLandmark.RIGHT_HIP:
/* 110 */                   return new OO11OilO((Ol010000lo00) this.I00iiO, (IllOOo00lI) this.I00iio, (IllOOo00lI) obj2, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 88 */                    return new OO11OilO((I01O1lIi) obj2, iOoil1iiIilo, 25);
                        case PoseLandmark.RIGHT_KNEE:
/* 75 */                    OO11OilO oO11OilO12 = new OO11OilO((OoIlIoo1oiOo) obj2, iOoil1iiIilo, 26);
/* 78 */                    oO11OilO12.I00iiO = obj;
/* 80 */                    return oO11OilO12;
                        case 27:
/* 64 */                    return new OO11OilO((Ool0lIIlll) this.I00iiO, (Context) this.I00iio, (Uri) obj2, iOoil1iiIilo, 27);
                        case PoseLandmark.RIGHT_ANKLE:
/* 42 */                    return new OO11OilO((Ool0OI) this.I00iiO, (Bitmap) this.I00iio, (Ool0lIIlll) obj2, iOoil1iiIilo, 28);
                        default:
/* 18 */                    OO11OilO oO11OilO13 = new OO11OilO((i001ll1) this.I00iio, (O1oIOiI11o0) obj2, iOoil1iiIilo, 29);
/* 21 */                    oO11OilO13.I00iiO = obj;
/* 23 */                    return oO11OilO13;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                    }
/* 18 */            return ((OO11OilO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:113:0x0219, code lost:
                
                    if (r2.invoke(r1, r20) == r0) goto L114;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:170:0x0322, code lost:
                
                    if (r0.I00000oIO(r1, r20) == r2) goto L174;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:173:0x0330, code lost:
                
                    if (p000.iOi1II01i0.I0000oI00(r1, r5, r20) == r2) goto L174;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:212:0x0416, code lost:
                
                    if (p000.iOi1II01i0.I0000oI00(r0, r1, r20) == r12) goto L240;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:236:0x04b6, code lost:
                
                    if (p000.iOi1II01i0.I0000oI00(r0, r1, r20) == r12) goto L240;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:239:0x04e8, code lost:
                
                    if (p000.iOi1II01i0.I0000oI00(r0, r1, r20) == r12) goto L240;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:241:0x04eb, code lost:
                
                    return r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
                
                    if (r0 == r10) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:389:0x0842, code lost:
                
                    if (r2 == r1) goto L394;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:393:0x0850, code lost:
                
                    if (r2 == r1) goto L394;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:497:0x0981, code lost:
                
                    if (r9.I0000O(r20) == r5) goto L433;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:539:?, code lost:
                
                    return r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:92:0x01c4, code lost:
                
                    if (r0.invoke(r20) == r2) goto L99;
                 */
                /* JADX WARN: Path cross not found for [B:436:0x0987, B:438:0x098b], limit reached: 552 */
                /* JADX WARN: Removed duplicated region for block: B:185:0x0372  */
                /* JADX WARN: Removed duplicated region for block: B:189:0x0387  */
                /* JADX WARN: Removed duplicated region for block: B:323:0x06bb  */
                /* JADX WARN: Removed duplicated region for block: B:324:0x06bf  */
                /* JADX WARN: Removed duplicated region for block: B:425:0x0933 A[Catch: all -> 0x0911, CancellationException -> 0x09ba, TRY_ENTER, TryCatch #9 {CancellationException -> 0x09ba, all -> 0x0911, blocks: (B:416:0x090c, B:425:0x0933, B:427:0x0953, B:428:0x0962, B:430:0x0974, B:431:0x0979), top: B:495:0x090c }] */
                /* JADX WARN: Removed duplicated region for block: B:449:0x09d0  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x01be  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x037a -> B:188:0x037e). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Ii0110 ii0110;
                    OOo0ooi oOo0ooi;
                    Object all;
                    Object forDocuments;
                    List list;
                    Object objI00000oIO;
                    Illill0o illill0o;
                    IOi10loi iOi10loi;
                    IOi10loi iOi10loi2;
                    Object objInvoke;
                    Throwable thI00000oOI;
                    Object objI0000oI00;
                    OI10i0Il oI10i0Il;
                    String strCompletionLoop;
                    OlOI1O olOI1O;
                    OI1I0OoOl oI1I0OoOl;
                    Ii0110 ii01102;
                    Function1 function1;
                    float[] fArrI00000oIO;
                    Object objTranscribe$default;
/* 5 */             int i = 23;
/* 7 */             int i2 = 6;
/* 9 */             int i3 = 3;
/* 10 */            boolean z = false;
/* 11 */            int i4 = 2;
/* 12 */            int i5 = 1;
/* 13 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 2587 */                  OOo0l0ii10l oOo0l0ii10l = (OOo0l0ii10l) this.I00ilI0I1;
/* 2591 */                  OoIlIoo1oiOo ooIlIoo1oiOo = (OoIlIoo1oiOo) this.I00iio;
/* 2593 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 2595 */                  int i6 = this.I00iiI;
/* 2597 */                  if (i6 == 0) {
/* 2613 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2618 */                      List list2 = (List) this.I00iiO;
/* 2629 */                      IOOi0Ool1i.I00IlilI0i0i(list2, null, null, null, null, 63);
/* 2640 */                      if (!((AtomicBoolean) ooIlIoo1oiOo.I00l0OO0IO).get()) {
/* 2689 */                          iOi100.I00000oIO(Log.d("PipePresenceSrc", "Ignoring camera update because monitoring is stopped."));
                                } else if (oOo0l0ii10l.I00iOIl) {
/* 2648 */                          Log.i("PipePresenceSrc", "Handling first camera set, triggering fresh query.");
/* 2653 */                          I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(i);
/* 2656 */                          i0IOIlIOIII.I00iiI = ooIlIoo1oiOo;
/* 2658 */                          VarHandle.storeStoreFence();
/* 2661 */                          IIiOiI0il iIiOiI0ilI00000oIO = iOiiloIII0O.I00000oIO(i0IOIlIOIII);
/* 2665 */                          this.I00iiI = 1;
/* 2671 */                          if (l10oIiO1Il.I00000oIO(iIiOiI0ilI00000oIO, this) == ii0111o) {
/* 2673 */                              return ii0111o;
                                    }
                                } else {
/* 2679 */                          ooIlIoo1oiOo.I000oI1ioi(list2, null);
                                }
/* 2692 */                      return OoiIlOl1iI.I00000oIO;
                            }
/* 2599 */                  if (i6 != 1) {
/* 2608 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 2611 */                      return null;
                            }
/* 2601 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2675 */                  oOo0l0ii10l.I00iOIl = false;
/* 2692 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 2514 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 2516 */                  int i7 = this.I00iiI;
/* 2518 */                  if (i7 != 0) {
/* 2520 */                      if (i7 == 1) {
/* 2522 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2580 */                          return OoiIlOl1iI.I00000oIO;
                                }
/* 2528 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 2531 */                      return null;
                            }
/* 2533 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2536 */                  O0Iioo1lO0o o0Iioo1lO0o = OOiIOloo0.I00000oIO;
/* 2540 */                  Oi0IO111o10 oi0IO111o10 = (Oi0IO111o10) this.I00ilI0I1;
/* 2546 */                  OIOo1iiI oIOo1iiI = new OIOo1iiI(12);
/* 2549 */                  oIOo1iiI.I00iiI = oi0IO111o10;
/* 2551 */                  VarHandle.storeStoreFence();
/* 2554 */                  o0Iioo1lO0o.I00000oOI(oIOo1iiI);
/* 2561 */                  Ii10ioolOI ii10ioolOI = ((OOiIOI10OOIi) this.I00iiO).I00000oOI;
/* 2563 */                  if (ii10ioolOI != null) {
/* 2567 */                      O00iOil o00iOil = (O00iOil) this.I00iio;
/* 2569 */                      this.I00iiI = 1;
/* 2576 */                      if (ii10ioolOI.I0001Ioi1lo(o00iOil, null, this) == ii0111o2) {
/* 2578 */                          return ii0111o2;
                                }
/* 2580 */                      return OoiIlOl1iI.I00000oIO;
                            }
/* 2531 */                  return null;
                        case 2:
/* 2295 */                  iOliil ioliil = (iOliil) this.I00ilI0I1;
/* 2299 */                  I1Il0loi i1Il0loi = (I1Il0loi) ioliil.I00ilI0I1;
/* 2301 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 2303 */                  int i8 = this.I00iiI;
/* 2305 */                  if (i8 == 0) {
/* 2333 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2338 */                      ii0110 = (Ii0110) this.I00iiO;
/* 2342 */                      oOo0ooi = new OOo0ooi();
/* 2354 */                      if (il001oo1.I0000O(ii0110)) {
                                }
/* 2491 */                      th = null;
/* 2505 */                      ioliil.I000oI1ioi(th);
/* 2508 */                      if (th != null) {
                                }
/* 2330 */                      return null;
                            }
/* 2307 */                  if (i8 != 1) {
/* 2327 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 2330 */                      return null;
                            }
/* 2311 */                  oOo0ooi = (OOo0ooi) this.I00iio;
/* 2315 */                  ii0110 = (Ii0110) this.I00iiO;
                            try {
/* 2317 */                      lIoii1l01l0i.I00000oOI(obj);
                            } catch (CancellationException unused) {
                            } catch (Throwable th) {
/* 2322 */                      th = th;
/* 2502 */                      Log.e("CXCP", "Encountered exception during processing", th);
                            }
/* 2438 */                  if (i1Il0loi.isEmpty() && oOo0ooi.I00iOIl == null) {
/* 2446 */                      Object objFirst = i1Il0loi.first();
/* 2459 */                      IiIOIO1I iiIOIO1II00000oOI = iOi1II01i0.I00000oOI(ii0110, null, new O1iIlllIoo(ioliil, objFirst, null, 14), 3);
/* 2467 */                      if (iiIOIO1II00000oOI.isCancelled()) {
/* 2488 */                          Log.i("CXCP", "Unable to process " + objFirst + " due to Job cancellation");
/* 2491 */                          th = null;
/* 2505 */                          ioliil.I000oI1ioi(th);
/* 2508 */                          if (th != null) {
/* 2513 */                              throw th;
                                    }
/* 2330 */                          return null;
                                }
/* 2493 */                      i1Il0loi.removeFirst();
/* 2496 */                      oOo0ooi.I00iOIl = iiIOIO1II00000oOI;
                            }
/* 2354 */                  if (il001oo1.I0000O(ii0110)) {
/* 2362 */                      OiiIl0O1I11 oiiIl0O1I11 = new OiiIl0O1I11(getContext());
/* 2379 */                      oiiIl0O1I11.I0001Ioi1lo(((IIIII1OI1) ioliil.I00iio).I00100o1O0lo(), new O00lOIIO(ioliil, null, i));
/* 2384 */                      IiIOI1ol0o iiIOI1ol0o = (IiIOI1ol0o) oOo0ooi.I00iOIl;
/* 2386 */                      if (iiIOI1ol0o != null) {
/* 2400 */                          oiiIl0O1I11.I0001Ioi1lo(iiIOI1ol0o.I00100l0(), new I1iOI0oo(oOo0ooi, (IOoil1iiIilo) null, 16));
                                }
/* 2403 */                      this.I00iiO = ii0110;
/* 2405 */                      this.I00iio = oOo0ooi;
/* 2407 */                      this.I00iiI = 1;
/* 2419 */                      if (!(I1Ioolli0l0o.I00000oIO.getObjectVolatile(oiiIl0O1I11, OiiIl0O1I11.I00ilO0) instanceof OiiIOiI1oi)) {
                                    break;
                                } else if (oiiIl0O1I11.I0000Il00O(this) == ii0111o3) {
/* 2432 */                          return ii0111o3;
                                }
/* 2438 */                      if (i1Il0loi.isEmpty()) {
                                }
/* 2354 */                      if (il001oo1.I0000O(ii0110)) {
                                }
                            }
/* 2491 */                  th = null;
/* 2505 */                  ioliil.I000oI1ioi(th);
/* 2508 */                  if (th != null) {
                            }
/* 2330 */                  return null;
                        case 3:
/* 2066 */                  OOl0lo oOl0lo = (OOl0lo) this.I00iio;
/* 2068 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 2070 */                  int i9 = this.I00iiI;
/* 2072 */                  if (i9 == 0) {
/* 2098 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2103 */                      List<String> list3 = (List) this.I00iiO;
/* 2105 */                      if (list3 != null) {
/* 2107 */                          RagChunkDao ragChunkDao = oOl0lo.I00000oIO;
/* 2109 */                          this.I00iiI = 1;
/* 2111 */                          forDocuments = ragChunkDao.getForDocuments(list3, this);
                                    break;
                                } else {
/* 2121 */                          RagChunkDao ragChunkDao2 = oOl0lo.I00000oIO;
/* 2123 */                          this.I00iiI = 2;
/* 2125 */                          all = ragChunkDao2.getAll(this);
                                    break;
                                }
/* 2131 */                      return ii0111o4;
                            }
/* 2074 */                  if (i9 == 1) {
/* 2092 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2095 */                      forDocuments = obj;
/* 2118 */                      list = (List) forDocuments;
                            } else {
/* 2076 */                      if (i9 != 2) {
/* 2086 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 2089 */                          return null;
                                }
/* 2078 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2081 */                      all = obj;
/* 2134 */                      list = (List) all;
                            }
/* 2136 */                  List<RagChunkEntity> list4 = list;
/* 2140 */                  float[] fArr = (float[]) this.I00ilI0I1;
/* 2150 */                  ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list4, 10));
/* 2161 */                  for (RagChunkEntity ragChunkEntity : list4) {
/* 2171 */                      String text = ragChunkEntity.getText();
/* 2175 */                      String documentId = ragChunkEntity.getDocumentId();
/* 2179 */                      byte[] embedding = ragChunkEntity.getEmbedding();
/* 2183 */                      oOl0lo.getClass();
/* 2190 */                      FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.wrap(embedding).asFloatBuffer();
/* 2194 */                      int iRemaining = floatBufferAsFloatBuffer.remaining();
/* 2198 */                      float[] fArr2 = new float[iRemaining];
/* 2201 */                      for (int i10 = 0; i10 < iRemaining; i10++) {
/* 2207 */                          fArr2[i10] = floatBufferAsFloatBuffer.get();
                                }
/* 2212 */                      int length = fArr.length;
/* 2213 */                      float f = 0.0f;
/* 2214 */                      float f2 = 0.0f;
/* 2215 */                      float f3 = 0.0f;
/* 2216 */                      float f4 = 0.0f;
/* 2218 */                      for (int i11 = 0; i11 < length; i11++) {
/* 2220 */                          float f5 = fArr[i11];
/* 2222 */                          float f6 = fArr2[i11];
/* 2226 */                          f4 = (f5 * f6) + f4;
/* 2229 */                          f2 += f5 * f5;
/* 2231 */                          f3 += f6 * f6;
                                }
/* 2247 */                      float fSqrt = ((float) Math.sqrt(f2)) * ((float) Math.sqrt(f3));
/* 2250 */                      if (fSqrt != 0.0f) {
/* 2253 */                          f = f4 / fSqrt;
                                }
/* 2255 */                      Oi10ooi oi10ooi = new Oi10ooi();
/* 2258 */                      oi10ooi.I00000oIO = text;
/* 2260 */                      oi10ooi.I00000oOI = documentId;
/* 2262 */                      oi10ooi.I0000Il00O = f;
/* 2264 */                      VarHandle.storeStoreFence();
/* 2267 */                      arrayList.add(oi10ooi);
                            }
/* 2285 */                  return IOOi0Ool1i.I00i01iIIliI(IOOi0Ool1i.I00Ol1ll1(arrayList, new IliIiio1(28)), 4);
                        case 4:
/* 1950 */                  OOl1OlI0 oOl1OlI0 = (OOl1OlI0) this.I00iiO;
/* 1952 */                  OlO0OIIl1 olO0OIIl1 = oOl1OlI0.I000II;
/* 1954 */                  Object obj2 = Ii0111o.I00iOIl;
/* 1956 */                  int i12 = this.I00iiI;
/* 1958 */                  if (i12 == 0) {
/* 1973 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1976 */                      OOiool1 oOiool1 = oOl1OlI0.I0000Il00O;
/* 1982 */                      String string = ((Uri) this.I00iio).toString();
/* 1988 */                      String str = (String) this.I00ilI0I1;
/* 1990 */                      oOiool1.getClass();
/* 2008 */                      IlOioIoiI ilOioIoiII00000oIO = ilOo1lI1o10.I00000oIO(ilOl0O00Il0i.I00000oOI(new OOioioOOo1(oOiool1, string, str, null)), new I0i11IIlO(string, (IOoil1iiIilo) null, i2));
/* 2012 */                      IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 2016 */                      IlOil1ii ilOil1iiI00000oOI = ilOlOoO1lO.I00000oOI(ilOioIoiII00000oIO, Ii1oo1ooill0.I00iiI);
/* 2023 */                      OOl1Io0Ol oOl1Io0Ol = new OOl1Io0Ol(0);
/* 2026 */                      oOl1Io0Ol.I00iiI = oOl1OlI0;
/* 2028 */                      VarHandle.storeStoreFence();
/* 2031 */                      this.I00iiI = 1;
/* 2037 */                      if (ilOil1iiI00000oOI.I00000oIO(oOl1Io0Ol, this) == obj2) {
/* 2039 */                          return obj2;
                                }
                            } else {
/* 1960 */                      if (i12 != 1) {
/* 1968 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1971 */                          return null;
                                }
/* 1962 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2047 */                  if ((olO0OIIl1.getValue() instanceof OOl0Oll) || (olO0OIIl1.getValue() instanceof OOl0liilI11)) {
/* 2058 */                      olO0OIIl1.I000l1(null);
                            }
/* 2061 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 1886 */                  IoiOl011o ioiOl011o = (IoiOl011o) this.I00iio;
/* 1888 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 1890 */                  int i13 = this.I00iiI;
/* 1892 */                  if (i13 != 0) {
/* 1894 */                      if (i13 == 1) {
/* 1896 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1899 */                          return obj;
                                }
/* 1904 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1907 */                      return null;
                            }
/* 1909 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1914 */                  Ii0110 ii01103 = (Ii0110) this.I00iiO;
/* 1916 */                  IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 1934 */                  IiIOIO1I iiIOIO1II00000oOI2 = iOi1II01i0.I00000oOI(ii01103, O1OI1l011OO1.I00000oIO.I00ilI0I1, new O1iIlllIoo((OOllOII) this.I00ilI0I1, ioiOl011o, null, 17), 2);
/* 1938 */                  this.I00iiI = 1;
/* 1940 */                  Object objI0010o = iiIOIO1II00000oOI2.I0010o(this);
                            return objI0010o == ii0111o5 ? ii0111o5 : objI0010o;
                        case 6:
/* 1841 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 1843 */                  int i14 = this.I00iiI;
/* 1845 */                  if (i14 != 0) {
/* 1847 */                      if (i14 == 1) {
/* 1849 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1852 */                          return OoiIlOl1iI.I00000oIO;
                                }
/* 1857 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1860 */                      return null;
                            }
/* 1862 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1867 */                  Ii0110 ii01104 = (Ii0110) this.I00iiO;
/* 1871 */                  OOlooO1oiOlo oOlooO1oiOlo = (OOlooO1oiOlo) this.I00iio;
/* 1875 */                  I101iI1i i101iI1i = (I101iI1i) this.I00ilI0I1;
/* 1877 */                  this.I00iiI = 1;
/* 1879 */                  oOlooO1oiOlo.invoke(ii01104, i101iI1i, this);
/* 1882 */                  return ii0111o6;
                        case 7:
/* 1787 */                  Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 1789 */                  int i15 = this.I00iiI;
/* 1791 */                  if (i15 == 0) {
/* 1812 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1817 */                      Illill0o illill0o2 = (Illill0o) this.I00iio;
/* 1821 */                      Oll0oO oll0oO = (Oll0oO) this.I00ilI0I1;
/* 1823 */                      this.I00iiO = illill0o2;
/* 1825 */                      this.I00iiI = 1;
/* 1827 */                      objI00000oIO = l10oIiO1Il.I00000oIO(oll0oO, this);
/* 1831 */                      if (objI00000oIO == ii0111o7) {
/* 1833 */                          return ii0111o7;
                                }
/* 1835 */                      illill0o = illill0o2;
                            } else {
/* 1793 */                      if (i15 != 1) {
/* 1807 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1810 */                          return null;
                                }
/* 1797 */                      illill0o = (Illill0o) this.I00iiO;
/* 1799 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1802 */                      objI00000oIO = obj;
                            }
/* 1836 */                  return illill0o.apply(objI00000oIO);
                        case 8:
/* 1734 */                  Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 1736 */                  int i16 = this.I00iiI;
/* 1738 */                  if (i16 == 0) {
/* 1753 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1758 */                      IiI0O1Io iiI0O1Io = (IiI0O1Io) this.I00iiO;
/* 1770 */                      int iIndexOf = ((OloIl1l1oOii) this.I00iio).I000OiO.indexOf((O1oIOiI11o0) this.I00ilI0I1);
/* 1774 */                      this.I00iiI = 1;
/* 1780 */                      if (iiI0O1Io.I0001Ioi1lo(iIndexOf, iOO01lio0.I0000Il00O(0.0f, 0.0f, null, 7), this) == ii0111o8) {
/* 1782 */                          return ii0111o8;
                                }
                            } else {
/* 1740 */                      if (i16 != 1) {
/* 1748 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1751 */                          return null;
                                }
/* 1742 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1784 */                  return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 1654 */                  Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 1656 */                  int i17 = this.I00iiI;
/* 1658 */                  if (i17 == 0) {
/* 1683 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1688 */                      Ii0110 ii01105 = (Ii0110) this.I00iiO;
/* 1692 */                      iOi10loi = (IOi10loi) this.I00iio;
/* 1696 */                      IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00ilI0I1;
                                try {
/* 1698 */                          this.I00iiO = iOi10loi;
/* 1700 */                          this.I00iiI = 1;
/* 1702 */                          objInvoke = illiIl1l11O.invoke(ii01105, this);
/* 1706 */                          if (objInvoke == ii0111o9) {
/* 1708 */                              return ii0111o9;
                                    }
                                } catch (Throwable th2) {
/* 1710 */                          th = th2;
/* 1711 */                          iOi10loi2 = iOi10loi;
/* 1716 */                          iOi10loi = iOi10loi2;
/* 1712 */                          objInvoke = lIoii1l01l0i.I00000oIO(th);
/* 1718 */                          thI00000oOI = Oi10ii.I00000oOI(objInvoke);
/* 1722 */                          if (thI00000oOI == null) {
                                    }
/* 1731 */                          return OoiIlOl1iI.I00000oIO;
                                }
                            } else {
/* 1660 */                      if (i17 != 1) {
/* 1678 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1681 */                          return null;
                                }
/* 1665 */                      iOi10loi2 = (IOi10loi) this.I00iiO;
                                try {
/* 1667 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1670 */                          iOi10loi = iOi10loi2;
/* 1671 */                          objInvoke = obj;
                                } catch (Throwable th3) {
/* 1674 */                          th = th3;
/* 1716 */                          iOi10loi = iOi10loi2;
/* 1712 */                          objInvoke = lIoii1l01l0i.I00000oIO(th);
/* 1718 */                          thI00000oOI = Oi10ii.I00000oOI(objInvoke);
/* 1722 */                          if (thI00000oOI == null) {
                                    }
/* 1731 */                          return OoiIlOl1iI.I00000oIO;
                                }
                            }
/* 1718 */                  thI00000oOI = Oi10ii.I00000oOI(objInvoke);
/* 1722 */                  if (thI00000oOI == null) {
/* 1724 */                      iOi10loi.I00O10llo(objInvoke);
                            } else {
/* 1728 */                      iOi10loi.I00iIO(thI00000oOI);
                            }
/* 1731 */                  return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 1595 */                  Object obj3 = Ii0111o.I00iOIl;
/* 1597 */                  int i18 = this.I00iiI;
/* 1599 */                  if (i18 == 0) {
/* 1614 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1619 */                      OiOol0il0il oiOol0il0il = (OiOol0il0il) this.I00iiO;
/* 1623 */                      Iililo00OiO iililo00OiO = (Iililo00OiO) this.I00iio;
/* 1627 */                      Oii00o1ll oii00o1ll = (Oii00o1ll) this.I00ilI0I1;
/* 1631 */                      OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(i5);
/* 1634 */                      oiOi011iI1ol.I00iiI = oiOol0il0il;
/* 1636 */                      oiOi011iI1ol.I00iiO = oii00o1ll;
/* 1638 */                      VarHandle.storeStoreFence();
/* 1641 */                      this.I00iiI = 1;
/* 1647 */                      if (iililo00OiO.invoke(oiOi011iI1ol, this) == obj3) {
/* 1649 */                          return obj3;
                                }
                            } else {
/* 1601 */                      if (i18 != 1) {
/* 1609 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1612 */                          return null;
                                }
/* 1603 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1651 */                  return OoiIlOl1iI.I00000oIO;
                        case 11:
/* 1544 */                  Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 1546 */                  int i19 = this.I00iiI;
/* 1548 */                  if (i19 == 0) {
/* 1563 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1568 */                      OiOiliiO oiOiliiO = (OiOiliiO) this.I00iiO;
/* 1572 */                      Oii00o1ll oii00o1ll2 = (Oii00o1ll) this.I00iio;
/* 1574 */                      oii00o1ll2.I000iOII = oiOiliiO;
/* 1578 */                      IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) this.I00ilI0I1;
/* 1580 */                      OiOol0il0il oiOol0il0il2 = oii00o1ll2.I000l1;
/* 1582 */                      this.I00iiI = 1;
/* 1588 */                      if (illiIl1l11O2.invoke(oiOol0il0il2, this) == ii0111o10) {
/* 1590 */                          return ii0111o10;
                                }
                            } else {
/* 1550 */                      if (i19 != 1) {
/* 1558 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1561 */                          return null;
                                }
/* 1552 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1592 */                  return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 1471 */                  Object obj4 = Ii0111o.I00iOIl;
/* 1473 */                  int i20 = this.I00iiI;
/* 1475 */                  if (i20 == 0) {
/* 1490 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1495 */                      Ii0110 ii01106 = (Ii0110) this.I00iiO;
/* 1499 */                      OlO01l1oOil olO01l1oOil = (OlO01l1oOil) this.I00iio;
/* 1503 */                      Io1ollO io1ollO = new Io1ollO(2);
/* 1506 */                      io1ollO.I00iiI = olO01l1oOil;
/* 1508 */                      VarHandle.storeStoreFence();
/* 1511 */                      Ii1Io1loiI ii1Io1loiII0000Il00O = lOIoiooI1i01.I0000Il00O(io1ollO);
/* 1519 */                      I10i01 i10i01 = (I10i01) this.I00ilI0I1;
/* 1521 */                      IIilO0 iIilO0 = new IIilO0(i2);
/* 1524 */                      iIilO0.I00iiI = i10i01;
/* 1526 */                      iIilO0.I00iiO = ii01106;
/* 1528 */                      VarHandle.storeStoreFence();
/* 1531 */                      this.I00iiI = 1;
/* 1537 */                      if (ii1Io1loiII0000Il00O.I00000oIO(iIilO0, this) == obj4) {
/* 1539 */                          return obj4;
                                }
                            } else {
/* 1477 */                      if (i20 != 1) {
/* 1485 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1488 */                          return null;
                                }
/* 1479 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1541 */                  return OoiIlOl1iI.I00000oIO;
                        case 13:
/* 1397 */                  Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 1399 */                  int i21 = this.I00iiI;
/* 1401 */                  if (i21 == 0) {
/* 1422 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1427 */                      OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iio;
/* 1429 */                      this.I00iiO = oI10i0Il2;
/* 1431 */                      this.I00iiI = 1;
/* 1433 */                      IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 1443 */                      objI0000oI00 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new I01ii1i(i4, null, i4), this);
/* 1447 */                      if (objI0000oI00 == ii0111o11) {
/* 1449 */                          return ii0111o11;
                                }
/* 1451 */                      oI10i0Il = oI10i0Il2;
                            } else {
/* 1403 */                      if (i21 != 1) {
/* 1417 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1420 */                          return null;
                                }
/* 1407 */                      oI10i0Il = (OI10i0Il) this.I00iiO;
/* 1409 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1412 */                      objI0000oI00 = obj;
                            }
/* 1454 */                  List list5 = OioIlii1iOO.I00000oIO;
/* 1456 */                  oI10i0Il.setValue((Ool01o0) objI0000oI00);
/* 1465 */                  ((OI10i0Il) this.I00ilI0I1).setValue(Boolean.FALSE);
/* 1468 */                  return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 1261 */                  OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 1266 */                  Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00iio;
/* 1268 */                  Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 1270 */                  int i22 = this.I00iiI;
/* 1272 */                  if (i22 == 0) {
/* 1289 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1296 */                      Iterator it = ((ArrayList) this.I00iiO).iterator();
/* 1304 */                      while (it.hasNext()) {
/* 1311 */                          Ol0ioI1iI ol0ioI1iI = (Ol0ioI1iI) it.next();
/* 1321 */                          if (ol0ioI1iI.I001IIilI0O().length() > 0) {
                                        try {
/* 1337 */                                  IlIl10.I0000O(IlIl10.I000iOII(ol0o1OiOIIIl.I0000Il00O.getFilesDir(), ol0ioI1iI.I001IIilI0O()));
                                        } catch (Exception e) {
/* 1362 */                                  Log.w("AGSkillManagerVM", "Failed to delete skill directory: " + ol0ioI1iI.I001IIilI0O(), e);
                                        }
                                    }
                                }
/* 1366 */                      Ii1liIllli0 ii1liIllli0 = ol0o1OiOIIIl.I00000oOI;
/* 1370 */                      Set set = (Set) this.I00ilI0I1;
/* 1372 */                      this.I00iiI = 1;
/* 1383 */                      Object objI00000oIO2 = ii1liIllli0.I0000O.I00000oIO(new Ii1lIO(set, null, 0), this);
/* 1389 */                      if (objI00000oIO2 != Ii0111o.I00iOIl) {
/* 1392 */                          objI00000oIO2 = ooiIlOl1iI;
                                }
/* 1393 */                      if (objI00000oIO2 == ii0111o12) {
/* 1395 */                          return ii0111o12;
                                }
                            } else {
/* 1274 */                      if (i22 != 1) {
/* 1284 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1287 */                          return null;
                                }
/* 1276 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1279 */                  return ooiIlOl1iI;
                        case 15:
/* 984 */                   OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 989 */                   I0Iol0OOiO i0Iol0OOiO = (I0Iol0OOiO) this.I00ilI0I1;
/* 994 */                   Ol0ioI1iI ol0ioI1iI2 = (Ol0ioI1iI) this.I00iiO;
/* 996 */                   Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 998 */                   int i23 = this.I00iiI;
/* 1000 */                  if (i23 == 0) {
/* 1021 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1032 */                      if (ol0ioI1iI2.I001IIilI0O().length() == 0) {
/* 1034 */                          IiI0oillOO10 iiI0oillOO104 = IiiIil1lOIO.I00000oIO;
/* 1038 */                          Ol0o0lOll ol0o0lOll = new Ol0o0lOll(i0Iol0OOiO, null, 0);
/* 1041 */                          this.I00iiI = 1;
                                    break;
                                } else {
/* 1073 */                          File file = new File(IlIl10.I000iOII(((Ol0o1OiOIIIl) this.I00iio).I0000Il00O.getFilesDir(), ol0ioI1iI2.I001IIilI0O()), "scripts");
/* 1080 */                          if (!file.exists() || !file.isDirectory()) {
/* 1240 */                              Log.w("AGSkillManagerVM", "Script directory not found for skill " + ol0ioI1iI2.I001i1O0Ol() + ": " + file.getPath());
/* 1243 */                              IiI0oillOO10 iiI0oillOO105 = IiiIil1lOIO.I00000oIO;
/* 1248 */                              Ol0o0lOll ol0o0lOll2 = new Ol0o0lOll(i0Iol0OOiO, null, 1);
/* 1251 */                              this.I00iiI = 2;
                                        break;
                                    } else {
/* 1092 */                              LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 1095 */                              File[] fileArrListFiles = file.listFiles();
/* 1099 */                              if (fileArrListFiles == null) {
/* 1101 */                                  fileArrListFiles = new File[0];
                                        }
/* 1103 */                              File[] fileArr = fileArrListFiles;
/* 1104 */                              int length2 = fileArr.length;
/* 1105 */                              int i24 = 0;
/* 1106 */                              while (i24 < length2) {
/* 1108 */                                  File file2 = fileArr[i24];
/* 1114 */                                  if (file2.isFile() && (OlOolloIIOl0.I000II(file2.getName(), ".html", z) || OlOolloIIOl0.I000II(file2.getName(), ".js", z))) {
                                                try {
/* 1148 */                                          linkedHashMap.put(file2.getName(), IlIl10.I000OOo1O(file2));
/* 1151 */                                          file2.getName();
                                                } catch (Exception e2) {
/* 1172 */                                          Log.e("AGSkillManagerVM", IIl001iO0Io.I000oI1ioi("Error reading script file ", file2.getName(), " for skill ", ol0ioI1iI2.I001i1O0Ol()), e2);
/* 1181 */                                          linkedHashMap.put(file2.getName(), "");
                                                }
                                            }
/* 1184 */                                  i24++;
/* 1188 */                                  z = false;
                                        }
/* 1191 */                              IiI0oillOO10 iiI0oillOO106 = IiiIil1lOIO.I00000oIO;
/* 1197 */                              Ol0Oli ol0Oli = new Ol0Oli(i0Iol0OOiO, linkedHashMap, (IOoil1iiIilo) null, 4);
/* 1201 */                              this.I00iiI = 3;
                                        break;
                                    }
                                }
                            } else {
/* 1002 */                      if (i23 != 1 && i23 != 2 && i23 != 3) {
/* 1016 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1008 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1011 */                  return ooiIlOl1iI2;
                        case 16:
/* 916 */                   Ol111o0 ol111o0 = (Ol111o0) this.I00ilI0I1;
/* 918 */                   Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 920 */                   int i25 = this.I00iiI;
/* 922 */                   if (i25 == 0) {
/* 936 */                       lIoii1l01l0i.I00000oOI(obj);
/* 941 */                       OO1io0l0 oO1io0l0 = (OO1io0l0) this.I00iiO;
/* 949 */                       Ol10oiIOOi ol10oiIOOi = new Ol10oiIOOi((OI0lOIiOIOOo) this.I00iio, ol111o0, null);
/* 954 */                       Ol10i1Oooo ol10i1Oooo = new Ol10i1Oooo(i3);
/* 957 */                       ol10i1Oooo.I00iiI = ol111o0;
/* 959 */                       VarHandle.storeStoreFence();
/* 962 */                       this.I00iiI = 1;
/* 975 */                       if (OloI0l1i1oO.I0000oI00(oO1io0l0, null, null, ol10oiIOOi, ol10i1Oooo, this, 3) == ii0111o14) {
/* 977 */                           return ii0111o14;
                                }
                            } else {
/* 924 */                       if (i25 != 1) {
/* 932 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 926 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 979 */                   return OoiIlOl1iI.I00000oIO;
                        case 17:
/* 826 */                   SmolLM smolLM = (SmolLM) this.I00iio;
/* 830 */                   IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.I00iiO;
/* 832 */                   Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 834 */                   int i26 = this.I00iiI;
/* 836 */                   if (i26 == 0) {
/* 850 */                       lIoii1l01l0i.I00000oOI(obj);
/* 1 */                         smolLM.verifyHandle();
/* 1 */                         smolLM.startCompletion(smolLM.nativePtr, (String) this.I00ilI0I1);
/* 1 */                         strCompletionLoop = smolLM.completionLoop(smolLM.nativePtr);
/* 881 */                       if (!O0000Ioio00.I0000O(strCompletionLoop, "[EOG]")) {
                                }
                            } else {
/* 838 */                       if (i26 != 1) {
/* 846 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 840 */                       lIoii1l01l0i.I00000oOI(obj);
/* 1 */                         strCompletionLoop = smolLM.completionLoop(smolLM.nativePtr);
/* 881 */                       if (!O0000Ioio00.I0000O(strCompletionLoop, "[EOG]")) {
/* 883 */                           this.I00iiO = ilOil1iooOO0;
/* 885 */                           this.I00iiI = 1;
/* 891 */                           if (ilOil1iooOO0.emit(strCompletionLoop, this) == ii0111o15) {
/* 893 */                               return ii0111o15;
                                    }
/* 1 */                             strCompletionLoop = smolLM.completionLoop(smolLM.nativePtr);
/* 881 */                           if (!O0000Ioio00.I0000O(strCompletionLoop, "[EOG]")) {
/* 1 */                                 smolLM.stopCompletion(smolLM.nativePtr);
/* 911 */                               return OoiIlOl1iI.I00000oIO;
                                    }
                                }
                            }
                        case PoseLandmark.RIGHT_PINKY:
/* 745 */                   IlOil1ii ilOil1ii = (IlOil1ii) this.I00ilI0I1;
/* 749 */                   Ii00l101O ii00l101O = (Ii00l101O) this.I00iio;
/* 751 */                   Object obj5 = Ii0111o.I00iOIl;
/* 753 */                   int i27 = this.I00iiI;
/* 755 */                   if (i27 == 0) {
/* 772 */                       lIoii1l01l0i.I00000oOI(obj);
/* 777 */                       OOIoIlO oOIoIlO = (OOIoIlO) this.I00iiO;
/* 785 */                       if (O0000Ioio00.I0000O(ii00l101O, Il00o11.I00iOIl)) {
/* 789 */                           Ol1o00lOl1 ol1o00lOl1 = new Ol1o00lOl1(0);
/* 792 */                           ol1o00lOl1.I00iiI = oOIoIlO;
/* 794 */                           VarHandle.storeStoreFence();
/* 797 */                           this.I00iiI = 1;
                                    break;
                                } else {
/* 808 */                           Ol110ii1I ol110ii1I = new Ol110ii1I(ilOil1ii, oOIoIlO, iOoil1iiIilo, i4);
/* 811 */                           this.I00iiI = 2;
                                    break;
                                }
                            } else {
/* 757 */                       if (i27 != 1 && i27 != 2) {
/* 764 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 768 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 821 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 649 */                   Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 651 */                   int i28 = this.I00iiI;
/* 653 */                   if (i28 == 0) {
/* 675 */                       lIoii1l01l0i.I00000oOI(obj);
/* 680 */                       OlOI1O olOI1O2 = (OlOI1O) this.I00ilI0I1;
/* 682 */                       OI1I0OoOl oI1I0OoOl2 = olOI1O2.I0000Il00O;
/* 684 */                       this.I00iiO = oI1I0OoOl2;
/* 686 */                       this.I00iio = olOI1O2;
/* 688 */                       this.I00iiI = 1;
/* 694 */                       if (oI1I0OoOl2.I00000oIO(this) == ii0111o16) {
/* 696 */                           return ii0111o16;
                                }
/* 698 */                       olOI1O = olOI1O2;
/* 699 */                       oI1I0OoOl = oI1I0OoOl2;
                            } else {
/* 655 */                       if (i28 != 1) {
/* 671 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 659 */                       olOI1O = (OlOI1O) this.I00iio;
/* 663 */                       oI1I0OoOl = (OI1I0OoOl) this.I00iiO;
/* 665 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 706 */                   while (!olOI1O.I0000oI00.isEmpty()) {
                                try {
/* 714 */                           OlO1ooI0i olO1ooI0i = (OlO1ooI0i) olOI1O.I0000oI00.poll();
/* 716 */                           if (olO1ooI0i != null) {
/* 727 */                               olO1ooI0i.I0000O.I00iIO(new Ioi1lIO("Capture request is cancelled due to a reset", null, 3));
                                    }
                                } catch (Throwable th4) {
/* 739 */                           oI1I0OoOl.I00000oOI(null);
/* 742 */                           throw th4;
                                }
                            }
/* 733 */                   oI1I0OoOl.I00000oOI(null);
/* 736 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 597 */                   Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 599 */                   int i29 = this.I00iiI;
/* 601 */                   if (i29 == 0) {
/* 615 */                       lIoii1l01l0i.I00000oOI(obj);
/* 620 */                       Ii10ioolOI ii10ioolOI2 = (Ii10ioolOI) this.I00iiO;
/* 624 */                       IOO01l iOO01l = (IOO01l) ii10ioolOI2.I000OiO;
/* 626 */                       if (iOO01l != null) {
/* 630 */                           Oi0IO1ii011 oi0IO1ii011 = (Oi0IO1ii011) this.I00iio;
/* 634 */                           Function1 function12 = (Function1) this.I00ilI0I1;
/* 636 */                           this.I00iiI = 1;
/* 642 */                           if (ii10ioolOI2.I00000oOI(iOO01l, oi0IO1ii011, function12, this) == ii0111o17) {
/* 644 */                               return ii0111o17;
                                    }
                                }
                            } else {
/* 603 */                       if (i29 != 1) {
/* 611 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 605 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 646 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_THUMB:
/* 545 */                   Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 547 */                   int i30 = this.I00iiI;
/* 549 */                   if (i30 == 0) {
/* 563 */                       lIoii1l01l0i.I00000oOI(obj);
/* 568 */                       Oo0I0O1Ii0o0 oo0I0O1Ii0o0 = (Oo0I0O1Ii0o0) this.I00iiO;
/* 572 */                       OOIII0OOoOi1 oOIII0OOoOi1 = (OOIII0OOoOi1) this.I00iio;
/* 580 */                       OIOlIiiioi oIOlIiiioiI00000oIO = OIOlIiiioi.I00000oIO(((OO1il00lI) this.I00ilI0I1).I0000Il00O);
/* 584 */                       this.I00iiI = 1;
/* 590 */                       if (oo0I0O1Ii0o0.invoke(oOIII0OOoOi1, oIOlIiiioiI00000oIO, this) == ii0111o18) {
/* 592 */                           return ii0111o18;
                                }
                            } else {
/* 551 */                       if (i30 != 1) {
/* 559 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 553 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 594 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_THUMB:
/* 476 */                   Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 478 */                   int i31 = this.I00iiI;
/* 480 */                   if (i31 == 0) {
/* 504 */                       lIoii1l01l0i.I00000oOI(obj);
/* 509 */                       ii01102 = (Ii0110) this.I00iiO;
/* 513 */                       O010OIi o010OIi = (O010OIi) this.I00iio;
/* 515 */                       this.I00iiO = ii01102;
/* 517 */                       this.I00iiI = 1;
/* 523 */                       if (o010OIi.I001l0I00(this) != ii0111o19) {
                                }
/* 540 */                       return ii0111o19;
                            }
/* 482 */                   if (i31 != 1) {
/* 484 */                       if (i31 == 2) {
/* 486 */                           lIoii1l01l0i.I00000oOI(obj);
/* 542 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 492 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 498 */                   ii01102 = (Ii0110) this.I00iiO;
/* 500 */                   lIoii1l01l0i.I00000oOI(obj);
/* 528 */                   IlliIl1l11O illiIl1l11O3 = (IlliIl1l11O) this.I00ilI0I1;
/* 530 */                   this.I00iiO = null;
/* 532 */                   this.I00iiI = 2;
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 370 */                   Oloo0l1lIl oloo0l1lIl = (Oloo0l1lIl) this.I00iio;
/* 372 */                   Ii0111o ii0111o20 = Ii0111o.I00iOIl;
/* 374 */                   int i32 = this.I00iiI;
                            try {
                            } catch (Throwable th5) {
/* 459 */                       Function1 function13 = oloo0l1lIl.I00oII;
/* 461 */                       if (function13 == null) {
/* 475 */                           throw th5;
                                }
/* 463 */                       this.I00iiO = th5;
/* 465 */                       this.I00iiI = 4;
/* 471 */                       if (function13.invoke(this) != ii0111o20) {
/* 475 */                           throw th5;
                                }
                            }
/* 376 */                   if (i32 == 0) {
/* 414 */                       lIoii1l01l0i.I00000oOI(obj);
/* 417 */                       Function1 function14 = oloo0l1lIl.I00oI0i;
/* 419 */                       if (function14 != null) {
/* 421 */                           this.I00iiI = 1;
/* 427 */                           if (function14.invoke(this) == ii0111o20) {
                                    }
/* 473 */                           return ii0111o20;
                                }
                            } else {
/* 378 */                       if (i32 != 1) {
/* 380 */                           if (i32 == 2) {
/* 404 */                               lIoii1l01l0i.I00000oOI(obj);
/* 443 */                               function1 = oloo0l1lIl.I00oII;
/* 445 */                               if (function1 != null) {
/* 447 */                                   this.I00iiI = 3;
                                            break;
                                        }
/* 456 */                               return OoiIlOl1iI.I00000oIO;
                                    }
/* 382 */                           if (i32 == 3) {
/* 400 */                               lIoii1l01l0i.I00000oOI(obj);
/* 456 */                               return OoiIlOl1iI.I00000oIO;
                                    }
/* 384 */                           if (i32 != 4) {
/* 388 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                return null;
                                    }
/* 394 */                           Throwable th6 = (Throwable) this.I00iiO;
/* 396 */                           lIoii1l01l0i.I00000oOI(obj);
/* 475 */                           throw th6;
                                }
/* 410 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 432 */                   Ololli ololli = (Ololli) this.I00ilI0I1;
/* 434 */                   this.I00iiI = 2;
/* 440 */                   if (ololli.I00000oIO(oloo0l1lIl, this) != ii0111o20) {
/* 443 */                       function1 = oloo0l1lIl.I00oII;
/* 445 */                       if (function1 != null) {
                                }
/* 456 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 473 */                   return ii0111o20;
                        case PoseLandmark.RIGHT_HIP:
/* 315 */                   Ii0111o ii0111o21 = Ii0111o.I00iOIl;
/* 317 */                   int i33 = this.I00iiI;
/* 319 */                   if (i33 == 0) {
/* 333 */                       lIoii1l01l0i.I00000oOI(obj);
/* 338 */                       Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00iiO;
/* 340 */                       this.I00iiI = 1;
/* 346 */                       if (ol010000lo00.I0000O(this) == ii0111o21) {
/* 348 */                           return ii0111o21;
                                }
                            } else {
/* 321 */                       if (i33 != 1) {
/* 329 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 323 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 354 */                   ((IllOOo00lI) this.I00iio).invoke();
/* 361 */                   ((IllOOo00lI) this.I00ilI0I1).invoke();
/* 364 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_KNEE:
/* 310 */                   return I00000oIO(obj);
                        case PoseLandmark.RIGHT_KNEE:
/* 305 */                   return I000II(obj);
                        case 27:
/* 300 */                   return I000O01llI0(obj);
                        case PoseLandmark.RIGHT_ANKLE:
/* 295 */                   return I000iOII(obj);
                        default:
/* 19 */                    Ii0110 ii01107 = (Ii0110) this.I00iiO;
/* 21 */                    Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 23 */                    int i34 = this.I00iiI;
/* 25 */                    if (i34 == 0) {
/* 49 */                        lIoii1l01l0i.I00000oOI(obj);
/* 56 */                        OlIl0i olIl0i = ((i001ll1) this.I00iio).I0000O;
/* 58 */                        if (olIl0i != null) {
/* 60 */                            this.I00iiO = ii01107;
/* 62 */                            this.I00iiI = 1;
/* 68 */                            if (olIl0i.I001l0I00(this) != ii0111o22) {
                                    }
/* 222 */                           return ii0111o22;
                                }
                            } else {
/* 27 */                        if (i34 != 1) {
/* 29 */                            if (i34 != 2) {
/* 40 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                return null;
                                    }
/* 31 */                            lIoii1l01l0i.I00000oOI(obj);
/* 34 */                            objTranscribe$default = obj;
/* 224 */                           String str2 = (String) objTranscribe$default;
/* 230 */                           OlO0OIIl1 olO0OIIl12 = ((i001ll1) this.I00iio).I00000oOI;
/* 286 */                           olO0OIIl12.I000lI(null, i001ilIoI.I00000oIO((i001ilIoI) olO0OIIl12.getValue(), false, false, str2.length() == 0 ? ((i001ilIoI) ((i001ll1) this.I00iio).I00000oOI.getValue()).I0000Il00O : str2, str2.length() == 0 ? "Could not transcribe audio" : null, false, 0.0f, null, 113));
/* 289 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 45 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 74 */                    i001ll1 i001ll1Var = (i001ll1) this.I00iio;
                            synchronized (i001ll1Var.I0000oI00) {
/* 79 */                        ArrayList arrayList2 = i001ll1Var.I0000oI00;
/* 85 */                        short[] sArr = new short[arrayList2.size()];
/* 87 */                        int size = arrayList2.size();
/* 91 */                        for (int i35 = 0; i35 < size; i35++) {
/* 103 */                           sArr[i35] = ((Number) arrayList2.get(i35)).shortValue();
                                }
/* 108 */                       fArrI00000oIO = liI0oli01O0.I00000oIO(sArr);
/* 114 */                       i001ll1Var.I0000oI00.clear();
                            }
/* 119 */                   if (fArrI00000oIO.length == 0) {
/* 125 */                       OlO0OIIl1 olO0OIIl13 = ((i001ll1) this.I00iio).I00000oOI;
/* 150 */                       olO0OIIl13.I000lI(null, i001ilIoI.I00000oIO((i001ilIoI) olO0OIIl13.getValue(), false, false, null, "No audio recorded", false, 0.0f, null, 117));
/* 153 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 161 */                   Object obj6 = ((O1oIOiI11o0) this.I00ilI0I1).I00IlilI0i0i;
/* 170 */                   WhisperEngine whisperEngine = obj6 instanceof WhisperEngine ? (WhisperEngine) obj6 : null;
/* 171 */                   if (whisperEngine == null) {
/* 177 */                       OlO0OIIl1 olO0OIIl14 = ((i001ll1) this.I00iio).I00000oOI;
/* 202 */                       olO0OIIl14.I000lI(null, i001ilIoI.I00000oIO((i001ilIoI) olO0OIIl14.getValue(), false, false, null, "Model not loaded", false, 0.0f, null, 117));
/* 205 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 208 */                   this.I00iiO = null;
/* 210 */                   this.I00iiI = 2;
/* 216 */                   objTranscribe$default = WhisperEngine.transcribe$default(whisperEngine, fArrI00000oIO, null, this, 2, null);
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public OO11OilO(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 14 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00ilI0I1 = obj2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public OO11OilO(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 15 */            this.I00iOIl = i;
                    this.I00ilI0I1 = obj;
                }
            }
