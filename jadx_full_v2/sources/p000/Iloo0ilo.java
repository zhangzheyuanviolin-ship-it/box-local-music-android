            package p000;

            import android.content.Context;
            import android.database.Cursor;
            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.imagedescription.ImageDescriber;
            import com.google.mlkit.genai.imagedescription.ImageDescriberOptions;
            import com.google.mlkit.genai.imagedescription.ImageDescription;
            import com.google.mlkit.genai.proofreading.Proofreader;
            import com.google.mlkit.genai.proofreading.ProofreaderOptions;
            import com.google.mlkit.genai.proofreading.Proofreading;
            import com.google.mlkit.genai.rewriting.Rewriter;
            import com.google.mlkit.genai.rewriting.RewriterOptions;
            import com.google.mlkit.genai.rewriting.Rewriting;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizer;
            import com.google.mlkit.genai.summarization.Summarization;
            import com.google.mlkit.genai.summarization.Summarizer;
            import com.google.mlkit.genai.summarization.SummarizerOptions;
            import com.google.mlkit.vision.barcode.BarcodeScanner;
            import com.google.mlkit.vision.barcode.BarcodeScanning;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.face.Face;
            import com.google.mlkit.vision.face.FaceDetection;
            import com.google.mlkit.vision.face.FaceDetector;
            import com.google.mlkit.vision.face.FaceDetectorOptions;
            import com.google.mlkit.vision.facemesh.FaceMesh;
            import com.google.mlkit.vision.facemesh.FaceMeshDetection;
            import com.google.mlkit.vision.facemesh.FaceMeshDetector;
            import com.google.mlkit.vision.facemesh.FaceMeshPoint;
            import com.google.mlkit.vision.label.ImageLabeler;
            import com.google.mlkit.vision.label.ImageLabeling;
            import com.google.mlkit.vision.label.defaults.ImageLabelerOptions;
            import com.google.mlkit.vision.pose.Pose;
            import com.google.mlkit.vision.pose.PoseDetection;
            import com.google.mlkit.vision.pose.PoseDetector;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.google.mlkit.vision.pose.defaults.PoseDetectorOptions;
            import com.google.mlkit.vision.text.TextRecognition;
            import com.google.mlkit.vision.text.TextRecognizer;
            import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.Executors;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public abstract class Iloo0ilo {
                public static final List I00000oIO = IOOi1I.I000O01llI0(new OIoi0IIoi(11, 12), new OIoi0IIoi(11, 23), new OIoi0IIoi(12, 24), new OIoi0IIoi(23, 24), new OIoi0IIoi(11, 13), new OIoi0IIoi(13, 15), new OIoi0IIoi(12, 14), new OIoi0IIoi(14, 16), new OIoi0IIoi(23, 25), new OIoi0IIoi(25, 27), new OIoi0IIoi(24, 26), new OIoi0IIoi(26, 28));

                /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(Ioi1Io1o ioi1Io1o, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(1604803488);
/* 16 */            int i2 = i | (iloI0lOlll1.I000OOo1O(ioi1Io1o) ? 4 : 2);
/* 32 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 48 */                Object obj = (O0oiOi) iloI0lOlll1.I000iOII(O11looOii.I00000oIO);
/* 58 */                boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj) | iloI0lOlll1.I000OOo1O(ioi1Io1o);
/* 59 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 63 */                if (!zI000OOo1O) {
                            Object obj2 = objI00O0i0ii;
/* 67 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 73 */                        IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(10);
/* 76 */                        iiioilIl1Il.I00iiI = obj;
/* 78 */                        iiioilIl1Il.I00iiO = ioi1Io1o;
/* 80 */                        VarHandle.storeStoreFence();
/* 83 */                        iloI0lOlll1.I00iio(iiioilIl1Il);
                                obj2 = iiioilIl1Il;
                            }
/* 91 */                    O0000Ioio00.I00000oIO((Function1) obj2, o1ooiI111i, null, iloI0lOlll1, 48);
                        }
                    } else {
/* 95 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 98 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 102 */           if (oOloioIlI001IO000 != null) {
/* 107 */               Ilo0lI ilo0lI = new Ilo0lI(3);
/* 110 */               ilo0lI.I00iiI = ioi1Io1o;
/* 112 */               ilo0lI.I00iiO = o1ooiI111i;
/* 114 */               VarHandle.storeStoreFence();
/* 117 */               oOloioIlI001IO000.I0000O = ilo0lI;
                    }
                }

                public static final void I00000oOI(Ii0l0Olio10 ii0l0Olio10, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-637355019);
/* 17 */            int i2 = (iloI0lOlll1.I000OOo1O(ii0l0Olio10) ? 4 : 2) | i;
/* 20 */            int i3 = 0;
/* 21 */            int i4 = 1;
/* 32 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 34 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 38 */                IOoil1iiIilo iOoil1iiIilo = null;
/* 39 */                IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 41 */                if (objI00O0i0ii == iOO0o0I1l) {
/* 43 */                    objI00O0i0ii = lOO00IiI0li.I00000oIO(null);
/* 47 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 50 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii;
/* 58 */                Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 64 */                OI1O101 oi1o101 = (OI1O101) oI10i0Il.getValue();
/* 66 */                boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(ii0l0Olio10);
/* 70 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 74 */                if (zI000OOo1O || objI00O0i0ii2 == iOO0o0I1l) {
/* 82 */                    objI00O0i0ii2 = new I1iIil1I(ii0l0Olio10, oI10i0Il, iOoil1iiIilo, 24);
/* 85 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 90 */                iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii2, iloI0lOlll1, oi1o101);
/* 97 */                OI1O101 oi1o1012 = (OI1O101) oI10i0Il.getValue();
/* 101 */               IloIIolo0oi iloIIolo0oi = new IloIIolo0oi(i3);
/* 104 */               iloIIolo0oi.I00iiO = ii0l0Olio10;
/* 106 */               iloIIolo0oi.I00iio = context;
/* 108 */               iloIIolo0oi.I00iiI = oI10i0Il;
/* 110 */               VarHandle.storeStoreFence();
/* 133 */               O1OIIoio0i1.I00000oOI(oi1o1012, null, null, null, "nano-feature", null, iiioOl1O.I00000oOI(271612978, iloIIolo0oi, iloI0lOlll1), iloI0lOlll1, 1597440, 46);
                    } else {
/* 137 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 140 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 144 */           if (oOloioIlI001IO000 != null) {
/* 148 */               I1o0OI0OoI0 i1o0OI0OoI0 = new I1o0OI0OoI0(i4);
/* 151 */               i1o0OI0OoI0.I00iiI = ii0l0Olio10;
/* 153 */               VarHandle.storeStoreFence();
/* 156 */               oOloioIlI001IO000.I0000O = i1o0OI0OoI0;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0196  */
                /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(OI1O0o0 oI1O0o0, boolean z, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    boolean z2;
                    OOloioIl oOloioIlI001IO000;
                    long j;
                    boolean z3;
                    long j2;
                    boolean z4;
                    boolean z5;
                    Object obj;
/* 10 */            iloI0lOlll1.I00i0O(-19683420);
/* 22 */            int i3 = (iloI0lOlll1.I000II(oI1O0o0) ? 4 : 2) | i;
/* 23 */            int i4 = i2 & 2;
/* 25 */            if (i4 == 0) {
/* 34 */                if ((i & 48) == 0) {
/* 36 */                    z2 = z;
/* 49 */                    i3 |= iloI0lOlll1.I000O01llI0(z2) ? 32 : 16;
                        }
/* 66 */                if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) == 18)) {
/* 398 */                   iloI0lOlll1.I00OilO00Il();
                        } else {
/* 72 */                    boolean z6 = i4 != 0 ? false : z2;
/* 79 */                    Object obj2 = (IOO0i0o1O0l) iloI0lOlll1.I000iOII(IOlO0o100i1i.I0000oI00);
/* 81 */                    boolean z7 = oI1O0o0.I00000oIO;
/* 88 */                    I1IiOI0 i1IiOI0 = z7 ? I1IiooiI1IlO.I00000oOI : I1IiooiI1IlO.I00000oIO;
/* 90 */                    if (z7) {
/* 95 */                        iloI0lOlll1.I00i01iIIliI(-1735889173);
/* 102 */                       j = liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I00000oIO;
                            } else {
/* 111 */                       iloI0lOlll1.I00i01iIIliI(-1735887912);
/* 118 */                       j = liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I00IO1oi11O;
                            }
/* 104 */                   iloI0lOlll1.I0010I0i(false);
/* 121 */                   if (z7) {
/* 126 */                       iloI0lOlll1.I00i01iIIliI(-1735885267);
/* 133 */                       z3 = z6;
/* 135 */                       j2 = liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I00000oOI;
                            } else {
/* 141 */                       z3 = z6;
/* 146 */                       iloI0lOlll1.I00i01iIIliI(-1735883955);
/* 153 */                       j2 = liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I00100o1O0lo;
                            }
/* 137 */                   iloI0lOlll1.I0010I0i(false);
/* 165 */                   float f = z7 ? 48.0f : 0.0f;
/* 172 */                   float f2 = z7 ? 0.0f : 48.0f;
/* 176 */                   O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 188 */                   O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), f, 0.0f, f2, 0.0f, 10);
/* 194 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(i1IiOI0, i1O01oOIoI0I.I00ll1, iloI0lOlll1, 0);
/* 202 */                   int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 206 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 210 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000OiO);
/* 216 */                   IOl0oi0lOl1.I000lI.getClass();
/* 219 */                   iloI0lOlll1.I00i0oil();
/* 224 */                   if (iloI0lOlll1.I00O10llo) {
/* 228 */                       iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                            } else {
/* 232 */                       iloI0lOlll1.I00io1l();
                            }
/* 237 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 242 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 251 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 254 */                   li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 259 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 264 */                   OiI111I oiI111II00000oOI = OiI11O1i1.I00000oOI(16.0f);
/* 293 */                   boolean zI000OOo1O = ((i3 & 14) == 4) | ((i3 & 112) == 32) | iloI0lOlll1.I000OOo1O(obj2);
/* 294 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 298 */                   Object obj3 = IOl11li.I00000oIO;
/* 300 */                   if (zI000OOo1O || objI00O0i0ii == obj3) {
/* 311 */                       z4 = true;
/* 312 */                       Iiii11o0 iiii11o0 = new Iiii11o0(1);
/* 315 */                       z5 = z3;
/* 317 */                       iiii11o0.I00iiI = z5;
/* 319 */                       iiii11o0.I00iiO = obj2;
/* 321 */                       iiii11o0.I00iio = oI1O0o0;
/* 323 */                       VarHandle.storeStoreFence();
/* 326 */                       iloI0lOlll1.I00iio(iiii11o0);
                                obj = iiii11o0;
                            } else {
/* 305 */                       z5 = z3;
/* 307 */                       z4 = true;
                                obj = objI00O0i0ii;
                            }
/* 329 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) obj;
/* 331 */                   Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 335 */                   if (objI00O0i0ii2 == obj3) {
/* 339 */                       objI00O0i0ii2 = new Iloi111(0);
/* 342 */                       iloI0lOlll1.I00iio(objI00O0i0ii2);
                            }
/* 347 */                   O1ooiI111i o1ooiI111iI0000Il00O2 = i1Ioo1o0.I0000Il00O(o1ooIo101ll, illOOo00lI, (IllOOo00lI) objI00O0i0ii2);
/* 353 */                   Iloi1OI01 iloi1OI01 = new Iloi1OI01();
/* 356 */                   iloi1OI01.I00iOIl = oI1O0o0;
/* 358 */                   iloi1OI01.I00iiI = z5;
/* 360 */                   iloi1OI01.I00iiO = j2;
/* 362 */                   VarHandle.storeStoreFence();
/* 389 */                   OlioioOl0O.I00000oIO(o1ooiI111iI0000Il00O2, oiI111II00000oOI, j, 0L, 0.0f, 0.0f, null, iiioOl1O.I00000oOI(-87163549, iloi1OI01, iloI0lOlll1), iloI0lOlll1, 12582912, 120);
/* 392 */                   iloI0lOlll1.I0010I0i(z4);
/* 395 */                   z2 = z5;
                        }
/* 401 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 405 */               if (oOloioIlI001IO000 == null) {
/* 410 */                   I1IO0OIlo i1IO0OIlo = new I1IO0OIlo(2);
/* 413 */                   i1IO0OIlo.I00iiO = oI1O0o0;
/* 415 */                   i1IO0OIlo.I00iiI = z2;
/* 417 */                   i1IO0OIlo.I00iio = i;
/* 421 */                   i1IO0OIlo.I00ilI0I1 = i2;
/* 423 */                   VarHandle.storeStoreFence();
/* 426 */                   oOloioIlI001IO000.I0000O = i1IO0OIlo;
/* 2230 */                  return;
                        }
/* 2230 */              return;
                    }
/* 27 */            i3 |= 48;
/* 29 */            z2 = z;
/* 66 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) == 18)) {
                    }
/* 401 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 405 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                public static final void I0000O(IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-1548192028);
/* 23 */            int i2 = 13;
/* 25 */            if (iloI0lOlll1.I00OIl(i & 1, (i & 3) != 2)) {
/* 33 */                Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 35 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 39 */                Object obj = IOl11li.I00000oIO;
/* 41 */                if (objI00O0i0ii == obj) {
/* 45 */                    objI00O0i0ii = BoxChatDatabase.I000l1.I000OiO(context);
/* 49 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 52 */                BoxChatDatabase boxChatDatabase = (BoxChatDatabase) objI00O0i0ii;
/* 54 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 58 */                if (objI00O0i0ii2 == obj) {
/* 60 */                    objI00O0i0ii2 = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 64 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 67 */                Object obj2 = (Ii0110) objI00O0i0ii2;
/* 69 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 73 */                if (objI00O0i0ii3 == obj) {
/* 76 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO(null);
/* 80 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 83 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii3;
/* 91 */                int i3 = 14;
/* 95 */                if (((Conversation) oI10i0Il.getValue()) == null) {
/* 100 */                   iloI0lOlll1.I00i01iIIliI(1465402139);
/* 123 */                   List list = (List) lOIoiooI1i01.I00000oIO(boxChatDatabase.I001IIilI0O().getConversationsByTask("nano_chat"), Il01100l.I00iOIl, iloI0lOlll1, 48, 2).getValue();
/* 133 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj2) | iloI0lOlll1.I000OOo1O(boxChatDatabase);
/* 134 */                   Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 138 */                   int i4 = 19;
                            Object obj3 = objI00O0i0ii4;
/* 140 */                   if (zI000OOo1O || objI00O0i0ii4 == obj) {
/* 146 */                       I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(i4);
/* 149 */                       i0iI0O1IoIoI.I00iiI = obj2;
/* 151 */                       i0iI0O1IoIoI.I00iio = boxChatDatabase;
/* 153 */                       i0iI0O1IoIoI.I00iiO = oI10i0Il;
/* 155 */                       VarHandle.storeStoreFence();
/* 158 */                       iloI0lOlll1.I00iio(i0iI0O1IoIoI);
                                obj3 = i0iI0O1IoIoI;
                            }
/* 161 */                   IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj3;
/* 163 */                   Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                            Object obj4 = objI00O0i0ii5;
/* 167 */                   if (objI00O0i0ii5 == obj) {
/* 171 */                       IlI0iIl011 ilI0iIl011 = new IlI0iIl011(i4);
/* 174 */                       ilI0iIl011.I00iiI = oI10i0Il;
/* 176 */                       VarHandle.storeStoreFence();
/* 179 */                       iloI0lOlll1.I00iio(ilI0iIl011);
                                obj4 = ilI0iIl011;
                            }
/* 182 */                   Function1 function1 = (Function1) obj4;
/* 192 */                   boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(obj2) | iloI0lOlll1.I000OOo1O(boxChatDatabase);
/* 193 */                   Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                            Object obj5 = objI00O0i0ii6;
/* 197 */                   if (zI000OOo1O2 || objI00O0i0ii6 == obj) {
/* 203 */                       IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(i3);
/* 206 */                       iiioilIl1Il.I00iiI = obj2;
/* 208 */                       iiioilIl1Il.I00iiO = boxChatDatabase;
/* 210 */                       VarHandle.storeStoreFence();
/* 213 */                       iloI0lOlll1.I00iio(iiioilIl1Il);
                                obj5 = iiioilIl1Il;
                            }
/* 216 */                   Function1 function12 = (Function1) obj5;
/* 226 */                   boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(obj2) | iloI0lOlll1.I000OOo1O(boxChatDatabase);
/* 227 */                   Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                            Object obj6 = objI00O0i0ii7;
/* 231 */                   if (zI000OOo1O3 || objI00O0i0ii7 == obj) {
/* 238 */                       Ilo0lI ilo0lI = new Ilo0lI(4);
/* 241 */                       ilo0lI.I00iiI = obj2;
/* 243 */                       ilo0lI.I00iiO = boxChatDatabase;
/* 245 */                       VarHandle.storeStoreFence();
/* 248 */                       iloI0lOlll1.I00iio(ilo0lI);
                                obj6 = ilo0lI;
                            }
/* 262 */                   I0001Ioi1lo(list, illOOo00lI2, function1, function12, (IlliIl1l11O) obj6, illOOo00lI, iloI0lOlll1, 196992);
/* 265 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 272 */                   iloI0lOlll1.I00i01iIIliI(1466278261);
/* 275 */                   Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                            Object obj7 = objI00O0i0ii8;
/* 279 */                   if (objI00O0i0ii8 == obj) {
/* 283 */                       IloOi11lo iloOi11lo = new IloOi11lo(13);
/* 286 */                       iloOi11lo.I00iiI = oI10i0Il;
/* 288 */                       VarHandle.storeStoreFence();
/* 291 */                       iloI0lOlll1.I00iio(iloOi11lo);
                                obj7 = iloOi11lo;
                            }
/* 296 */                   iOOloIo.I00000oIO(48, 1, (IllOOo00lI) obj7, iloI0lOlll1, false);
/* 303 */                   Conversation conversation = (Conversation) oI10i0Il.getValue();
/* 305 */                   Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
                            Object obj8 = objI00O0i0ii9;
/* 309 */                   if (objI00O0i0ii9 == obj) {
/* 313 */                       IloOi11lo iloOi11lo2 = new IloOi11lo(14);
/* 316 */                       iloOi11lo2.I00iiI = oI10i0Il;
/* 318 */                       VarHandle.storeStoreFence();
/* 321 */                       iloI0lOlll1.I00iio(iloOi11lo2);
                                obj8 = iloOi11lo2;
                            }
/* 328 */                   I0000oI00(conversation, boxChatDatabase, (IllOOo00lI) obj8, iloI0lOlll1, 384);
/* 331 */                   iloI0lOlll1.I0010I0i(false);
                        }
                    } else {
/* 335 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 338 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 342 */           if (oOloioIlI001IO000 != null) {
/* 346 */               I0IilI00l i0IilI00l = new I0IilI00l(i2);
/* 349 */               i0IilI00l.I00iiI = illOOo00lI;
/* 351 */               VarHandle.storeStoreFence();
/* 354 */               oOloioIlI001IO000.I0000O = i0IilI00l;
                    }
                }

                public static final void I0000oI00(Conversation conversation, BoxChatDatabase boxChatDatabase, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    BoxChatDatabase boxChatDatabase2;
                    Conversation conversation2;
                    Object i0iOlI010ii;
                    OI10i0Il oI10i0Il;
                    Ol1o0O0O0 ol1o0O0O0;
                    OI10i0Il oI10i0Il2;
                    OI10i0Il oI10i0Il3;
                    BoxChatDatabase boxChatDatabase3;
                    Conversation conversation3;
                    OI10i0Il oI10i0Il4;
                    Object iiI110i1O;
                    OI10i0Il oI10i0Il5;
                    Ol1o0O0O0 ol1o0O0O02;
                    OI10i0Il oI10i0Il6;
/* 10 */            iloI0lOlll1.I00i0O(-812487609);
/* 36 */            int i2 = i | (iloI0lOlll1.I000II(conversation) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(boxChatDatabase) ? 32 : 16);
/* 53 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 55 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 59 */                Object obj = IOl11li.I00000oIO;
/* 61 */                if (objI00O0i0ii == obj) {
/* 63 */                    objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 67 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 71 */                Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 73 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 77 */                if (objI00O0i0ii2 == obj) {
/* 81 */                    objI00O0i0ii2 = new IlooOlI();
/* 84 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 87 */                IlooOlI ilooOlI = (IlooOlI) objI00O0i0ii2;
/* 89 */                boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(ilooOlI);
/* 93 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii3;
/* 97 */                if (zI000OOo1O || objI00O0i0ii3 == obj) {
/* 103 */                   IloIlI iloIlI = new IloIlI(0);
/* 106 */                   iloIlI.I00iiI = ilooOlI;
/* 108 */                   VarHandle.storeStoreFence();
/* 111 */                   iloI0lOlll1.I00iio(iloIlI);
                            obj2 = iloIlI;
                        }
/* 118 */               iIO0iiOiOl0l.I00000oOI(OoiIlOl1iI.I00000oIO, (Function1) obj2, iloI0lOlll1);
/* 121 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 125 */               if (objI00O0i0ii4 == obj) {
/* 129 */                   objI00O0i0ii4 = new Ol1OlloIO();
/* 132 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 136 */               Ol1OlloIO ol1OlloIO = (Ol1OlloIO) objI00O0i0ii4;
/* 138 */               Object objI00000oIO = O0o0i1Oo010.I00000oIO(iloI0lOlll1);
/* 142 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 146 */               IOoil1iiIilo iOoil1iiIilo = null;
/* 148 */               if (objI00O0i0ii5 == obj) {
/* 150 */                   objI00O0i0ii5 = lOO00IiI0li.I00000oIO(null);
/* 154 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 157 */               OI10i0Il oI10i0Il7 = (OI10i0Il) objI00O0i0ii5;
/* 159 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 163 */               if (objI00O0i0ii6 == obj) {
/* 167 */                   objI00O0i0ii6 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 171 */                   iloI0lOlll1.I00iio(objI00O0i0ii6);
                        }
/* 175 */               OI10i0Il oI10i0Il8 = (OI10i0Il) objI00O0i0ii6;
/* 177 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 183 */               if (objI00O0i0ii7 == obj) {
/* 185 */                   objI00O0i0ii7 = lOO00IiI0li.I00000oIO("");
/* 189 */                   iloI0lOlll1.I00iio(objI00O0i0ii7);
                        }
/* 192 */               OI10i0Il oI10i0Il9 = (OI10i0Il) objI00O0i0ii7;
/* 194 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
/* 198 */               if (objI00O0i0ii8 == obj) {
/* 200 */                   objI00O0i0ii8 = lOO00IiI0li.I00000oIO("");
/* 204 */                   iloI0lOlll1.I00iio(objI00O0i0ii8);
                        }
/* 209 */               OI10i0Il oI10i0Il10 = (OI10i0Il) objI00O0i0ii8;
/* 211 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
/* 215 */               if (objI00O0i0ii9 == obj) {
/* 219 */                   objI00O0i0ii9 = new Ol1o0O0O0();
/* 222 */                   iloI0lOlll1.I00iio(objI00O0i0ii9);
                        }
/* 226 */               Ol1o0O0O0 ol1o0O0O03 = (Ol1o0O0O0) objI00O0i0ii9;
/* 228 */               Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
/* 232 */               if (objI00O0i0ii10 == obj) {
/* 236 */                   objI00O0i0ii10 = lOO00IiI0li.I00000oIO(Boolean.TRUE);
/* 240 */                   iloI0lOlll1.I00iio(objI00O0i0ii10);
                        }
/* 243 */               OI10i0Il oI10i0Il11 = (OI10i0Il) objI00O0i0ii10;
/* 245 */               String id = conversation.getId();
/* 266 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(boxChatDatabase) | ((i2 & 14) == 4) | iloI0lOlll1.I000OOo1O(ilooOlI);
/* 267 */               Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
/* 271 */               if (zI000OOo1O2 || objI00O0i0ii11 == obj) {
/* 292 */                   oI10i0Il = oI10i0Il9;
/* 293 */                   ol1o0O0O0 = ol1o0O0O03;
/* 297 */                   oI10i0Il2 = oI10i0Il7;
/* 298 */                   oI10i0Il3 = oI10i0Il11;
/* 300 */                   i0iOlI010ii = new I0iOlI010ii(boxChatDatabase, conversation, ol1o0O0O0, ilooOlI, oI10i0Il3, oI10i0Il2, null);
/* 305 */                   boxChatDatabase3 = boxChatDatabase;
/* 306 */                   conversation3 = conversation;
/* 308 */                   iloI0lOlll1.I00iio(i0iOlI010ii);
                        } else {
/* 277 */                   boxChatDatabase3 = boxChatDatabase;
/* 278 */                   conversation3 = conversation;
/* 280 */                   oI10i0Il2 = oI10i0Il7;
/* 281 */                   oI10i0Il3 = oI10i0Il11;
/* 282 */                   i0iOlI010ii = objI00O0i0ii11;
/* 283 */                   ol1o0O0O0 = ol1o0O0O03;
/* 284 */                   oI10i0Il = oI10i0Il9;
                        }
/* 313 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) i0iOlI010ii, iloI0lOlll1, id);
/* 320 */               Integer numValueOf = Integer.valueOf(ol1o0O0O0.size());
/* 328 */               String str = (String) oI10i0Il10.getValue();
/* 330 */               boolean zI000II = iloI0lOlll1.I000II(objI00000oIO);
/* 334 */               Ol1o0O0O0 ol1o0O0O04 = ol1o0O0O0;
/* 336 */               Object objI00O0i0ii12 = iloI0lOlll1.I00O0i0ii();
/* 340 */               if (zI000II || objI00O0i0ii12 == obj) {
/* 344 */                   oI10i0Il4 = oI10i0Il8;
/* 359 */                   oI10i0Il5 = oI10i0Il;
/* 360 */                   ol1o0O0O02 = ol1o0O0O04;
/* 362 */                   iiI110i1O = new IiI110i1O(ol1o0O0O02, objI00000oIO, oI10i0Il10, iOoil1iiIilo, 9);
/* 365 */                   oI10i0Il6 = oI10i0Il10;
/* 367 */                   iloI0lOlll1.I00iio(iiI110i1O);
                        } else {
/* 347 */                   iiI110i1O = objI00O0i0ii12;
/* 348 */                   oI10i0Il4 = oI10i0Il8;
/* 349 */                   oI10i0Il5 = oI10i0Il;
/* 350 */                   oI10i0Il6 = oI10i0Il10;
/* 352 */                   ol1o0O0O02 = ol1o0O0O04;
                        }
/* 372 */               iIO0iiOiOl0l.I0000oI00(numValueOf, str, (IlliIl1l11O) iiI110i1O, iloI0lOlll1);
/* 375 */               String title = conversation3.getTitle();
/* 383 */               Integer num = (Integer) oI10i0Il2.getValue();
/* 391 */               boolean zBooleanValue = ((Boolean) oI10i0Il4.getValue()).booleanValue();
/* 402 */               IloIlIoo iloIlIoo = new IloIlIoo(0);
/* 405 */               iloIlIoo.I00l0I0l0lO1 = objI00000oIO;
/* 407 */               iloIlIoo.I00iiI = oI10i0Il3;
/* 409 */               iloIlIoo.I00l0OO0IO = ol1o0O0O02;
/* 411 */               iloIlIoo.I00iiO = oI10i0Il6;
/* 413 */               iloIlIoo.I00ilI0I1 = oI10i0Il4;
/* 415 */               iloIlIoo.I00iio = ii0110;
/* 417 */               iloIlIoo.I00li1OI = boxChatDatabase3;
/* 419 */               iloIlIoo.I00ll1 = conversation3;
/* 421 */               iloIlIoo.I00lli11 = ilooOlI;
/* 423 */               iloIlIoo.I00ilO0 = oI10i0Il5;
/* 425 */               iloIlIoo.I00io1l = oI10i0Il2;
/* 427 */               iloIlIoo.I00ioIO = ol1OlloIO;
/* 429 */               VarHandle.storeStoreFence();
/* 446 */               boxChatDatabase2 = boxChatDatabase3;
/* 450 */               conversation2 = conversation3;
/* 453 */               I000lI(title, num, zBooleanValue, illOOo00lI, ol1OlloIO, iiioOl1O.I00000oOI(1225138975, iloIlIoo, iloI0lOlll1), iloI0lOlll1, 224256);
                    } else {
/* 457 */               boxChatDatabase2 = boxChatDatabase;
/* 458 */               conversation2 = conversation;
/* 459 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 462 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 466 */           if (oOloioIlI001IO000 != null) {
/* 472 */               I01oi1lIIO i01oi1lIIO = new I01oi1lIIO(12);
/* 475 */               i01oi1lIIO.I00iiI = conversation2;
/* 477 */               i01oi1lIIO.I00iiO = boxChatDatabase2;
/* 481 */               i01oi1lIIO.I00iio = illOOo00lI;
/* 483 */               VarHandle.storeStoreFence();
/* 486 */               oOloioIlI001IO000.I0000O = i01oi1lIIO;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v1 */
                /* JADX WARN: Type inference failed for: r15v10 */
                /* JADX WARN: Type inference failed for: r15v2, types: [int] */
                public static final void I0001Ioi1lo(List list, IllOOo00lI illOOo00lI, Function1 function1, Function1 function12, IlliIl1l11O illiIl1l11O, IllOOo00lI illOOo00lI2, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    ?? r15;
                    IloI0lOlll1 iloI0lOlll12;
                    int i3;
                    boolean z;
                    Object obj;
                    IloI0lOlll1 iloI0lOlll13;
/* 13 */            IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 20 */            iloI0lOlll14.I00i0O(-1523674681);
/* 25 */            int i4 = 2;
/* 26 */            if ((i & 6) == 0) {
/* 37 */                i2 = (iloI0lOlll14.I000OOo1O(list) ? 4 : 2) | i;
                    } else {
/* 39 */                i2 = i;
                    }
/* 42 */            if ((i & 48) == 0) {
/* 55 */                i2 |= iloI0lOlll14.I000OOo1O(illOOo00lI) ? 32 : 16;
                    }
/* 58 */            if ((i & 384) == 0) {
/* 71 */                i2 |= iloI0lOlll14.I000OOo1O(function1) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 74 */            if ((i & 3072) == 0) {
/* 87 */                i2 |= iloI0lOlll14.I000OOo1O(function12) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 90 */            if ((i & 24576) == 0) {
/* 103 */               i2 |= iloI0lOlll14.I000OOo1O(illiIl1l11O) ? 16384 : 8192;
                    }
/* 107 */           if ((196608 & i) == 0) {
/* 120 */               i2 |= iloI0lOlll14.I000OOo1O(illOOo00lI2) ? 131072 : 65536;
                    }
/* 121 */           int i5 = i2;
/* 140 */           if (iloI0lOlll14.I00OIl(i5 & 1, (74899 & i5) != 74898)) {
/* 142 */               Object objI00O0i0ii = iloI0lOlll14.I00O0i0ii();
/* 146 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 148 */               if (objI00O0i0ii == iOO0o0I1l) {
/* 151 */                   objI00O0i0ii = lOO00IiI0li.I00000oIO(null);
/* 155 */                   iloI0lOlll14.I00iio(objI00O0i0ii);
                        }
/* 158 */               OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii;
/* 160 */               Object objI00O0i0ii2 = iloI0lOlll14.I00O0i0ii();
/* 164 */               if (objI00O0i0ii2 == iOO0o0I1l) {
/* 168 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO("");
/* 172 */                   iloI0lOlll14.I00iio(objI00O0i0ii2);
                        }
/* 175 */               OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii2;
/* 183 */               int i6 = 14;
/* 185 */               if (((Conversation) oI10i0Il.getValue()) != null) {
/* 190 */                   iloI0lOlll14.I00i01iIIliI(1717402784);
/* 193 */                   Object objI00O0i0ii3 = iloI0lOlll14.I00O0i0ii();
                            Object obj2 = objI00O0i0ii3;
/* 197 */                   if (objI00O0i0ii3 == iOO0o0I1l) {
/* 203 */                       IOli1iO1Ii iOli1iO1Ii = new IOli1iO1Ii(27);
/* 206 */                       iOli1iO1Ii.I00iiI = oI10i0Il;
/* 208 */                       VarHandle.storeStoreFence();
/* 211 */                       iloI0lOlll14.I00iio(iOli1iO1Ii);
                                obj2 = iOli1iO1Ii;
                            }
/* 216 */                   IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj2;
/* 220 */                   I01oi1lIIO i01oi1lIIO = new I01oi1lIIO(i6);
/* 223 */                   i01oi1lIIO.I00iiI = illiIl1l11O;
/* 225 */                   i01oi1lIIO.I00iiO = oI10i0Il2;
/* 227 */                   i01oi1lIIO.I00iio = oI10i0Il;
/* 229 */                   VarHandle.storeStoreFence();
/* 235 */                   IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(1501564378, i01oi1lIIO, iloI0lOlll14);
/* 241 */                   IloIlOOIi iloIlOOIi = new IloIlOOIi(i4);
/* 244 */                   iloIlOOIi.I00iiI = oI10i0Il;
/* 246 */                   VarHandle.storeStoreFence();
/* 252 */                   IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(1253596184, iloIlOOIi, iloI0lOlll14);
/* 259 */                   IloIlOOIi iloIlOOIi2 = new IloIlOOIi(3);
/* 262 */                   iloIlOOIi2.I00iiI = oI10i0Il2;
/* 264 */                   VarHandle.storeStoreFence();
/* 299 */                   iOIil10l.I00000oIO(illOOo00lI3, iOii1lI00000oOI, null, iOii1lI00000oOI2, null, i1i0IooiOOI.I00IO1oi11O, iiioOl1O.I00000oOI(-1265839755, iloIlOOIi2, iloI0lOlll14), null, 0L, 0L, 0L, 0L, null, iloI0lOlll14, 1772598, 16276);
/* 302 */                   i3 = 0;
/* 303 */                   iloI0lOlll14.I0010I0i(false);
                        } else {
/* 307 */                   i3 = 0;
/* 312 */                   iloI0lOlll14.I00i01iIIliI(1718351291);
/* 315 */                   iloI0lOlll14.I0010I0i(false);
                        }
/* 318 */               IlIl1Io0lii1 ilIl1Io0lii1 = Ol0iOOO0.I0000Il00O;
/* 324 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll14, i3);
/* 331 */               int iHashCode = Long.hashCode(iloI0lOlll14.I00OI1);
/* 335 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll14.I000lI();
/* 341 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll14, ilIl1Io0lii1);
/* 347 */               IOl0oi0lOl1.I000lI.getClass();
/* 350 */               iloI0lOlll14.I00i0oil();
/* 355 */               boolean z2 = iloI0lOlll14.I00O10llo;
/* 359 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 361 */               if (z2) {
/* 363 */                   iloI0lOlll14.I000l1(iloi111);
                        } else {
/* 367 */                   iloI0lOlll14.I00io1l();
                        }
/* 370 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 372 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, iOOlo1O01OI00000oIO);
/* 375 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 377 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI);
/* 380 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 384 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 386 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll14, numValueOf);
/* 389 */               li01Ooiio01.I00000oOI(iloI0lOlll14);
/* 392 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 394 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O);
/* 401 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 403 */               O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 410 */               I0IioOOOlOO0 i0IioOOOlOO0 = new I0IioOOOlOO0(1);
/* 413 */               i0IioOOOlOO0.I00iiI = illOOo00lI;
/* 415 */               i0IioOOOlOO0.I00iiO = illOOo00lI2;
/* 417 */               VarHandle.storeStoreFence();
/* 446 */               OlioioOl0O.I00000oIO(o1ooiI111iI0000oI00, null, 0L, 0L, 2.0f, 0.0f, null, iiioOl1O.I00000oOI(-1978194856, i0IioOOOlOO0, iloI0lOlll14), iloI0lOlll14, 12607494, 110);
/* 453 */               if (list.isEmpty()) {
/* 458 */                   iloI0lOlll14.I00i01iIIliI(-603003554);
/* 464 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00io1l, false);
/* 474 */                   int iHashCode2 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 478 */                   OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll14.I000lI();
/* 482 */                   O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll14, ilIl1Io0lii1);
/* 486 */                   iloI0lOlll14.I00i0oil();
/* 491 */                   if (iloI0lOlll14.I00O10llo) {
/* 493 */                       iloI0lOlll14.I000l1(iloi111);
                            } else {
/* 497 */                       iloI0lOlll14.I00io1l();
                            }
/* 500 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, o1iOIl0o10I0000Il00O);
/* 503 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI2);
/* 508 */                   IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll14, iOioOOi0I3, iloI0lOlll14);
/* 511 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O2);
/* 522 */                   IOOlo1O01O iOOlo1O01OI00000oIO2 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(12.0f), i1O01oOIoI0I.I00o0l1o1o0, iloI0lOlll14, 54);
/* 528 */                   int iHashCode3 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 532 */                   OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll14.I000lI();
/* 536 */                   O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooIo101ll);
/* 540 */                   iloI0lOlll14.I00i0oil();
/* 545 */                   if (iloI0lOlll14.I00O10llo) {
/* 547 */                       iloI0lOlll14.I000l1(iloi111);
                            } else {
/* 551 */                       iloI0lOlll14.I00io1l();
                            }
/* 554 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, iOOlo1O01OI00000oIO2);
/* 557 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI3);
/* 560 */                   IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll14, iOioOOi0I3, iloI0lOlll14);
/* 563 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O3);
/* 566 */                   IoiOolO1iOo ioiOolO1iOoI00000oIO = ililO0OIOo1I.I00000oIO();
/* 572 */                   O1ooiI111i o1ooiI111iI000lI = Ol0iOOO0.I000lI(o1ooIo101ll, 48.0f);
/* 576 */                   OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 597 */                   z = true;
/* 600 */                   IoOoiI1II00i.I00000oIO(ioiOolO1iOoI00000oIO, null, o1ooiI111iI000lI, ((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o, iloI0lOlll1, 432, 0);
/* 667 */                   Oo0i1oIIoOO.I00000oOI("No conversations yet", null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000O01llI0, iloI0lOlll1, 6, 0, 131066);
/* 691 */                   IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 693 */                   iOiO0o0oi.I00000oIO(illOOo00lI, null, false, null, null, null, null, null, i1i0IooiOOI.I00Io1lO, iloI0lOlll15, ((i5 >> 3) & 14) | 805306368, 510);
/* 696 */                   Oi010OO0.I001l0I00(iloI0lOlll15, true, true, false);
                            iloI0lOlll13 = iloI0lOlll15;
                        } else {
/* 702 */                   z = true;
/* 708 */                   iloI0lOlll14.I00i01iIIliI(-602287485);
/* 715 */                   OIo1i1 oIo1i1 = new OIo1i1(12.0f, 12.0f, 12.0f, 12.0f);
/* 720 */                   I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(8.0f);
/* 747 */                   boolean zI000OOo1O = iloI0lOlll14.I000OOo1O(list) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048);
/* 748 */                   Object objI00O0i0ii4 = iloI0lOlll14.I00O0i0ii();
/* 752 */                   if (zI000OOo1O || objI00O0i0ii4 == iOO0o0I1l) {
/* 763 */                       I0IO1io0I i0IO1io0I = new I0IO1io0I(6);
/* 766 */                       i0IO1io0I.I00iiO = list;
/* 768 */                       i0IO1io0I.I00iio = function1;
/* 772 */                       i0IO1io0I.I00ilI0I1 = function12;
/* 776 */                       i0IO1io0I.I00iiI = oI10i0Il;
/* 780 */                       i0IO1io0I.I00ilO0 = oI10i0Il2;
/* 782 */                       VarHandle.storeStoreFence();
/* 785 */                       iloI0lOlll14.I00iio(i0IO1io0I);
                                obj = i0IO1io0I;
                            } else {
                                obj = objI00O0i0ii4;
                            }
/* 801 */                   l0oIiiI1O0o.I00000oIO(ilIl1Io0lii1, null, oIo1i1, i1IioII0000oI00, null, null, false, null, (Function1) obj, iloI0lOlll14, 24966, 490);
/* 804 */                   iloI0lOlll14.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll14;
                        }
/* 807 */               iloI0lOlll13.I0010I0i(z);
                        iloI0lOlll12 = iloI0lOlll13;
                        r15 = z;
                    } else {
/* 811 */               r15 = 1;
/* 812 */               iloI0lOlll14.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll14;
                    }
/* 815 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 819 */           if (oOloioIlI001IO000 != null) {
/* 823 */               IOii0100lIi0 iOii0100lIi0 = new IOii0100lIi0(r15);
/* 826 */               iOii0100lIi0.I00iiO = list;
/* 830 */               iOii0100lIi0.I00iio = illOOo00lI;
/* 832 */               iOii0100lIi0.I00ilI0I1 = function1;
/* 836 */               iOii0100lIi0.I00ilO0 = function12;
/* 840 */               iOii0100lIi0.I00io1l = illiIl1l11O;
/* 844 */               iOii0100lIi0.I00ioIO = illOOo00lI2;
/* 848 */               iOii0100lIi0.I00iiI = i;
/* 850 */               VarHandle.storeStoreFence();
/* 853 */               oOloioIlI001IO000.I0000O = iOii0100lIi0;
                    }
                }

                public static final void I000II(Context context, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 6 */             iloI0lOlll1.I00i0O(287258153);
/* 13 */            int i2 = 4;
/* 20 */            int i3 = i | (iloI0lOlll1.I000OOo1O(context) ? 4 : 2);
/* 26 */            int i4 = 0;
/* 38 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 40 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 44 */                Object obj = IOl11li.I00000oIO;
/* 46 */                if (objI00O0i0ii == obj) {
/* 48 */                    objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 52 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 55 */                Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 57 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 61 */                if (objI00O0i0ii2 == obj) {
/* 64 */                    objI00O0i0ii2 = lOO00IiI0li.I00000oIO(null);
/* 68 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 71 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii2;
/* 73 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 77 */                if (objI00O0i0ii3 == obj) {
/* 81 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO("");
/* 85 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 88 */                OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii3;
/* 90 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 94 */                if (objI00O0i0ii4 == obj) {
/* 98 */                    objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 102 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 105 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii4;
/* 107 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 111 */               if (objI00O0i0ii5 == obj) {
/* 134 */                   objI00O0i0ii5 = FaceDetection.getClient(new FaceDetectorOptions.Builder().setPerformanceMode(2).setLandmarkMode(2).setClassificationMode(2).build());
/* 138 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 141 */               Object obj2 = (FaceDetector) objI00O0i0ii5;
/* 143 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj2);
/* 147 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii6;
/* 151 */               if (zI000OOo1O || objI00O0i0ii6 == obj) {
/* 159 */                   Iil1olo iil1olo = new Iil1olo(14);
/* 162 */                   iil1olo.I00iiI = obj2;
/* 164 */                   VarHandle.storeStoreFence();
/* 167 */                   iloI0lOlll1.I00iio(iil1olo);
                            obj3 = iil1olo;
                        }
/* 174 */               iIO0iiOiOl0l.I00000oOI(OoiIlOl1iI.I00000oIO, (Function1) obj3, iloI0lOlll1);
/* 179 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(i4);
/* 190 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(context);
/* 191 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii7;
/* 195 */               if (zI000OOo1O2 || objI00O0i0ii7 == obj) {
/* 201 */                   IloIiOoio iloIiOoio = new IloIiOoio(i2);
/* 204 */                   iloIiOoio.I00iiI = ii0110;
/* 206 */                   iloIiOoio.I00iiO = context;
/* 208 */                   iloIiOoio.I00iio = oI10i0Il;
/* 210 */                   iloIiOoio.I00ilI0I1 = oI10i0Il2;
/* 212 */                   VarHandle.storeStoreFence();
/* 215 */                   iloI0lOlll1.I00iio(iloIiOoio);
                            obj4 = iloIiOoio;
                        }
/* 220 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj4, iloI0lOlll1, 0);
/* 228 */               Bitmap bitmap = (Bitmap) oI10i0Il.getValue();
/* 234 */               String str = (String) oI10i0Il2.getValue();
/* 242 */               boolean zBooleanValue = ((Boolean) oI10i0Il3.getValue()).booleanValue();
/* 246 */               boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(o1OIi1I00000oIO);
/* 250 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii8;
/* 254 */               if (zI000OOo1O3 || objI00O0i0ii8 == obj) {
/* 262 */                   I0O1I11 i0o1i11 = new I0O1I11(12);
/* 265 */                   i0o1i11.I00iiI = o1OIi1I00000oIO;
/* 267 */                   VarHandle.storeStoreFence();
/* 270 */                   iloI0lOlll1.I00iio(i0o1i11);
                            obj5 = i0o1i11;
                        }
/* 273 */               IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj5;
/* 283 */               boolean zI000OOo1O4 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(obj2);
/* 284 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
/* 288 */               int i5 = 10;
                        Object obj6 = objI00O0i0ii9;
/* 290 */               if (zI000OOo1O4 || objI00O0i0ii9 == obj) {
/* 296 */                   I0IoOl i0IoOl = new I0IoOl(i5);
/* 299 */                   i0IoOl.I00iio = ii0110;
/* 301 */                   i0IoOl.I00iiI = oI10i0Il;
/* 303 */                   i0IoOl.I00ilI0I1 = oI10i0Il3;
/* 305 */                   i0IoOl.I00ilO0 = oI10i0Il2;
/* 307 */                   i0IoOl.I00iiO = obj2;
/* 309 */                   VarHandle.storeStoreFence();
/* 312 */                   iloI0lOlll1.I00iio(i0IoOl);
                            obj6 = i0IoOl;
                        }
/* 315 */               IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj6;
/* 317 */               Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                        Object obj7 = objI00O0i0ii10;
/* 321 */               if (objI00O0i0ii10 == obj) {
/* 325 */                   IloOi11lo iloOi11lo = new IloOi11lo(10);
/* 328 */                   iloOi11lo.I00iiI = oI10i0Il2;
/* 330 */                   VarHandle.storeStoreFence();
/* 333 */                   iloI0lOlll1.I00iio(iloOi11lo);
                            obj7 = iloOi11lo;
                        }
/* 337 */               IllOOo00lI illOOo00lI4 = (IllOOo00lI) obj7;
/* 339 */               boolean zI000OOo1O5 = iloI0lOlll1.I000OOo1O(obj2);
/* 343 */               Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
                        Object obj8 = objI00O0i0ii11;
/* 347 */               if (zI000OOo1O5 || objI00O0i0ii11 == obj) {
/* 355 */                   IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(13);
/* 358 */                   iiioilIl1Il.I00iiI = obj2;
/* 360 */                   iiioilIl1Il.I00iiO = oI10i0Il2;
/* 362 */                   VarHandle.storeStoreFence();
/* 365 */                   iloI0lOlll1.I00iio(iiioilIl1Il);
                            obj8 = iiioilIl1Il;
                        }
/* 385 */               I00II0oii1o("Detect Faces", bitmap, str, zBooleanValue, illOOo00lI, illOOo00lI2, illOOo00lI3, illOOo00lI4, (Function1) obj8, null, iloI0lOlll1, 12607494, Barcode.FORMAT_UPC_A);
                    } else {
/* 389 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 392 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 396 */           if (oOloioIlI001IO000 != null) {
/* 402 */               IloIOOlOOIl0 iloIOOlOOIl0 = new IloIOOlOOIl0(8);
/* 405 */               iloIOOlOOIl0.I00iiI = context;
/* 407 */               iloIOOlOOIl0.I00iiO = illOOo00lI;
/* 409 */               VarHandle.storeStoreFence();
/* 412 */               oOloioIlI001IO000.I0000O = iloIOOlOOIl0;
                    }
                }

                public static final String I000O01llI0(List list) {
/* 5 */             if (list.isEmpty()) {
/* 7 */                 return "No faces detected.";
                    }
/* 10 */            List list2 = list;
/* 20 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 27 */            int i = 0;
/* 32 */            for (Object obj : list2) {
/* 38 */                int i2 = i + 1;
/* 40 */                if (i < 0) {
/* 169 */                   IOOi1I.I000lI();
/* 173 */                   throw null;
                        }
/* 42 */                Face face = (Face) obj;
/* 54 */                StringBuilder sb = new StringBuilder(IIlIOloOOO.I00100l0("Face ", i2, ": "));
/* 57 */                Float smilingProbability = face.getSmilingProbability();
/* 65 */                if (smilingProbability != null) {
/* 90 */                    sb.append("smiling " + ((int) (smilingProbability.floatValue() * 100.0f)) + "%  ");
                        }
/* 93 */                Float leftEyeOpenProbability = face.getLeftEyeOpenProbability();
/* 97 */                if (leftEyeOpenProbability != null) {
/* 122 */                   sb.append("left eye " + ((int) (leftEyeOpenProbability.floatValue() * 100.0f)) + "%  ");
                        }
/* 125 */               Float rightEyeOpenProbability = face.getRightEyeOpenProbability();
/* 129 */               if (rightEyeOpenProbability != null) {
/* 156 */                   sb.append("right eye " + ((int) (rightEyeOpenProbability.floatValue() * 100.0f)) + "%");
                        }
/* 163 */               arrayList.add(sb.toString());
/* 166 */               i = i2;
                    }
/* 181 */           return IOOi0Ool1i.I00IlilI0i0i(arrayList, "\n", null, null, null, 62);
                }

                public static final void I000OOo1O(Context context, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 8 */             iloI0lOlll1.I00i0O(1389850355);
/* 20 */            int i2 = i | (iloI0lOlll1.I000OOo1O(context) ? 4 : 2);
/* 26 */            int i3 = 0;
/* 38 */            int i4 = 3;
/* 39 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 41 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 45 */                Object obj = IOl11li.I00000oIO;
/* 47 */                if (objI00O0i0ii == obj) {
/* 49 */                    objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 53 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 56 */                Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 58 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 63 */                if (objI00O0i0ii2 == obj) {
/* 65 */                    objI00O0i0ii2 = lOO00IiI0li.I00000oIO(null);
/* 69 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 72 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii2;
/* 74 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 78 */                if (objI00O0i0ii3 == obj) {
/* 82 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO("");
/* 86 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 89 */                OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii3;
/* 91 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 95 */                if (objI00O0i0ii4 == obj) {
/* 99 */                    objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 103 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 106 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii4;
/* 108 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 112 */               if (objI00O0i0ii5 == obj) {
/* 114 */                   objI00O0i0ii5 = lOO00IiI0li.I00000oIO(null);
/* 118 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 121 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii5;
/* 123 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 127 */               if (objI00O0i0ii6 == obj) {
/* 129 */                   objI00O0i0ii6 = FaceMeshDetection.getClient();
/* 133 */                   iloI0lOlll1.I00iio(objI00O0i0ii6);
                        }
/* 136 */               Object obj2 = (FaceMeshDetector) objI00O0i0ii6;
/* 138 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj2);
/* 142 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii7;
/* 146 */               if (zI000OOo1O || objI00O0i0ii7 == obj) {
/* 154 */                   Iil1olo iil1olo = new Iil1olo(11);
/* 157 */                   iil1olo.I00iiI = obj2;
/* 159 */                   VarHandle.storeStoreFence();
/* 162 */                   iloI0lOlll1.I00iio(iil1olo);
                            obj3 = iil1olo;
                        }
/* 169 */               iIO0iiOiOl0l.I00000oOI(OoiIlOl1iI.I00000oIO, (Function1) obj3, iloI0lOlll1);
/* 174 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(i3);
/* 185 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(context);
/* 186 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii8;
/* 190 */               if (zI000OOo1O2 || objI00O0i0ii8 == obj) {
/* 196 */                   I1o0IiiI0il i1o0IiiI0il = new I1o0IiiI0il(i4);
/* 199 */                   i1o0IiiI0il.I00iiI = ii0110;
/* 201 */                   i1o0IiiI0il.I00iiO = context;
/* 203 */                   i1o0IiiI0il.I00iio = oI10i0Il;
/* 205 */                   i1o0IiiI0il.I00ilI0I1 = oI10i0Il2;
/* 207 */                   i1o0IiiI0il.I00ilO0 = oI10i0Il4;
/* 209 */                   VarHandle.storeStoreFence();
/* 212 */                   iloI0lOlll1.I00iio(i1o0IiiI0il);
                            obj4 = i1o0IiiI0il;
                        }
/* 217 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj4, iloI0lOlll1, 0);
/* 225 */               Bitmap bitmap = (Bitmap) oI10i0Il.getValue();
/* 231 */               String str = (String) oI10i0Il2.getValue();
/* 239 */               boolean zBooleanValue = ((Boolean) oI10i0Il3.getValue()).booleanValue();
/* 247 */               OI1OIlllll0 oI1OIlllll0 = (OI1OIlllll0) oI10i0Il4.getValue();
/* 249 */               boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(o1OIi1I00000oIO);
/* 253 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii9;
/* 257 */               if (zI000OOo1O3 || objI00O0i0ii9 == obj) {
/* 265 */                   I0O1I11 i0o1i11 = new I0O1I11(9);
/* 268 */                   i0o1i11.I00iiI = o1OIi1I00000oIO;
/* 270 */                   VarHandle.storeStoreFence();
/* 273 */                   iloI0lOlll1.I00iio(i0o1i11);
                            obj5 = i0o1i11;
                        }
/* 276 */               IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj5;
/* 286 */               boolean zI000OOo1O4 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(obj2);
/* 287 */               Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                        Object obj6 = objI00O0i0ii10;
/* 291 */               if (zI000OOo1O4 || objI00O0i0ii10 == obj) {
/* 298 */                   I0iI0llll1 i0iI0llll1 = new I0iI0llll1(1);
/* 301 */                   i0iI0llll1.I00ilI0I1 = ii0110;
/* 303 */                   i0iI0llll1.I00iiI = oI10i0Il;
/* 305 */                   i0iI0llll1.I00iiO = oI10i0Il3;
/* 307 */                   i0iI0llll1.I00iio = oI10i0Il2;
/* 309 */                   i0iI0llll1.I00ilO0 = obj2;
/* 311 */                   i0iI0llll1.I00io1l = oI10i0Il4;
/* 313 */                   VarHandle.storeStoreFence();
/* 316 */                   iloI0lOlll1.I00iio(i0iI0llll1);
                            obj6 = i0iI0llll1;
                        }
/* 319 */               IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj6;
/* 321 */               Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
                        Object obj7 = objI00O0i0ii11;
/* 325 */               if (objI00O0i0ii11 == obj) {
/* 331 */                   I0IlOO10Ii1 i0IlOO10Ii1 = new I0IlOO10Ii1(14);
/* 334 */                   i0IlOO10Ii1.I00iiI = oI10i0Il2;
/* 336 */                   i0IlOO10Ii1.I00iiO = oI10i0Il4;
/* 338 */                   VarHandle.storeStoreFence();
/* 341 */                   iloI0lOlll1.I00iio(i0IlOO10Ii1);
                            obj7 = i0IlOO10Ii1;
                        }
/* 345 */               IllOOo00lI illOOo00lI4 = (IllOOo00lI) obj7;
/* 347 */               boolean zI000OOo1O5 = iloI0lOlll1.I000OOo1O(obj2);
/* 351 */               Object objI00O0i0ii12 = iloI0lOlll1.I00O0i0ii();
                        Object obj8 = objI00O0i0ii12;
/* 355 */               if (zI000OOo1O5 || objI00O0i0ii12 == obj) {
/* 363 */                   I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(22);
/* 366 */                   i01oIoOI01l.I00iiI = obj2;
/* 368 */                   i01oIoOI01l.I00iiO = oI10i0Il2;
/* 370 */                   i01oIoOI01l.I00iio = oI10i0Il4;
/* 372 */                   VarHandle.storeStoreFence();
/* 375 */                   iloI0lOlll1.I00iio(i01oIoOI01l);
                            obj8 = i01oIoOI01l;
                        }
/* 395 */               I00II0oii1o("Face Mesh", bitmap, str, zBooleanValue, illOOo00lI, illOOo00lI2, illOOo00lI3, illOOo00lI4, (Function1) obj8, oI1OIlllll0, iloI0lOlll1, 12607494, 0);
                    } else {
/* 399 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 402 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 406 */           if (oOloioIlI001IO000 != null) {
/* 411 */               IloIOOlOOIl0 iloIOOlOOIl0 = new IloIOOlOOIl0(3);
/* 414 */               iloIOOlOOIl0.I00iiI = context;
/* 418 */               iloIOOlOOIl0.I00iiO = illOOo00lI;
/* 420 */               VarHandle.storeStoreFence();
/* 423 */               oOloioIlI001IO000.I0000O = iloIOOlOOIl0;
                    }
                }

                public static final String I000OiO(List list) {
                    List<FaceMeshPoint> allPoints;
/* 5 */             if (list.isEmpty()) {
/* 7 */                 return "No faces detected.";
                    }
/* 10 */            int size = list.size();
/* 18 */            FaceMesh faceMesh = (FaceMesh) IOOi0Ool1i.I00II0Ol1O0l(list);
/* 55 */            return size + " face(s) · " + ((faceMesh == null || (allPoints = faceMesh.getAllPoints()) == null) ? 0 : allPoints.size()) + " mesh points each.";
                }

                public static final OI1OIlllll0 I000iOII(int i, int i2, List list) {
/* 1 */             List list2 = list;
/* 11 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 14 */            Iterator it = list2.iterator();
/* 22 */            while (it.hasNext()) {
/* 30 */                List<FaceMeshPoint> allPoints = ((FaceMesh) it.next()).getAllPoints();
/* 42 */                ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(allPoints, 10));
/* 53 */                for (FaceMeshPoint faceMeshPoint : allPoints) {
/* 65 */                    float x = faceMeshPoint.getPosition().getX();
/* 73 */                    float y = faceMeshPoint.getPosition().getY();
/* 103 */                   arrayList2.add(OIOlIiiioi.I00000oIO((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)));
                        }
/* 107 */               arrayList.add(arrayList2);
                    }
/* 113 */           OI1O1i oI1O1i = new OI1O1i();
/* 116 */           oI1O1i.I00000oIO = arrayList;
/* 118 */           VarHandle.storeStoreFence();
/* 123 */           return new OI1OIlllll0(oI1O1i, i, i2);
                }

                public static final void I000l1(OI1O101 oi1o101, O1ooiI111i o1ooiI111i, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-45398846);
/* 44 */            int i2 = (iloI0lOlll1.I0000oI00(oi1o101.ordinal()) ? 4 : 2) | i | (iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 60 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 74 */                IO0i0i iO0i0iI00000oIO = iOl10Oi0oo0.I00000oIO(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00IO1oi11O, iloI0lOlll1);
/* 80 */                OiI111I oiI111II00000oOI = OiI11O1i1.I00000oOI(12.0f);
/* 88 */                I0iII1i10I i0iII1i10I = new I0iII1i10I(10);
/* 91 */                i0iII1i10I.I00iiI = oi1o101;
/* 93 */                VarHandle.storeStoreFence();
/* 121 */               iOl111l1l.I00000oIO(illOOo00lI, o1ooiI111i, false, oiI111II00000oOI, iO0i0iI00000oIO, null, iiioOl1O.I00000oOI(-443440713, i0iII1i10I, iloI0lOlll1), iloI0lOlll1, ((i2 >> 6) & 14) | 100663296 | (i2 & 112), 228);
                    } else {
/* 125 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 128 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 132 */           if (oOloioIlI001IO000 != null) {
/* 138 */               I01oi1lIIO i01oi1lIIO = new I01oi1lIIO(15);
/* 141 */               i01oi1lIIO.I00iiI = oi1o101;
/* 143 */               i01oi1lIIO.I00iiO = o1ooiI111i;
/* 145 */               i01oi1lIIO.I00iio = illOOo00lI;
/* 147 */               VarHandle.storeStoreFence();
/* 150 */               oOloioIlI001IO000.I0000O = i01oi1lIIO;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:69:0x0213  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0237  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I000lI(String str, Integer num, boolean z, IllOOo00lI illOOo00lI, Ol1OlloIO ol1OlloIO, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    boolean z2;
                    boolean z3;
/* 18 */            iloI0lOlll1.I00i0O(1256781410);
/* 23 */            if ((i & 6) == 0) {
/* 34 */                i2 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i;
                    } else {
/* 36 */                i2 = i;
                    }
/* 39 */            if ((i & 48) == 0) {
/* 52 */                i2 |= iloI0lOlll1.I000II(num) ? 32 : 16;
                    }
/* 55 */            if ((i & 3072) == 0) {
/* 68 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 71 */            if ((i & 24576) == 0) {
/* 84 */                i2 |= iloI0lOlll1.I000II(ol1OlloIO) ? 16384 : 8192;
                    }
/* 88 */            if ((196608 & i) == 0) {
/* 101 */               i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 131072 : 65536;
                    }
/* 102 */           int i3 = i2;
/* 124 */           if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 74771) != 74770)) {
/* 126 */               IlIl1Io0lii1 ilIl1Io0lii1 = Ol0iOOO0.I0000Il00O;
/* 130 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 136 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 140 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 144 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, ilIl1Io0lii1);
/* 150 */               IOl0oi0lOl1.I000lI.getClass();
/* 153 */               iloI0lOlll1.I00i0oil();
/* 156 */               boolean z4 = iloI0lOlll1.I00O10llo;
/* 158 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 160 */               if (z4) {
/* 162 */                   iloI0lOlll1.I000l1(iloi111);
                        } else {
/* 166 */                   iloI0lOlll1.I00io1l();
                        }
/* 169 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 171 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 174 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 176 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI);
/* 179 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 183 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 185 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, numValueOf);
/* 188 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 191 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 193 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 200 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll1, 0);
/* 208 */               int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 212 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 216 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, ilIl1Io0lii1);
/* 220 */               iloI0lOlll1.I00i0oil();
/* 225 */               if (iloI0lOlll1.I00O10llo) {
/* 227 */                   iloI0lOlll1.I000l1(iloi111);
                        } else {
/* 233 */                   iloI0lOlll1.I00io1l();
                        }
/* 237 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, iOOlo1O01OI00000oIO);
/* 240 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 243 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 246 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 249 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 253 */               O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 260 */               Il0oOOll1 il0oOOll1 = new Il0oOOll1(1);
/* 263 */               il0oOOll1.I00iiI = illOOo00lI;
/* 265 */               il0oOOll1.I00iiO = str;
/* 267 */               VarHandle.storeStoreFence();
/* 308 */               OlioioOl0O.I00000oIO(o1ooiI111iI0000oI00, null, 0L, 0L, 2.0f, 0.0f, null, iiioOl1O.I00000oOI(-876313927, il0oOOll1, iloI0lOlll1), iloI0lOlll1, 12607494, 110);
/* 311 */               if (num == null) {
/* 316 */                   iloI0lOlll1.I00i01iIIliI(-2130862695);
/* 331 */                   OOO0iOio0oil.I0000O(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 0L, 0L, 0, 0.0f, iloI0lOlll1, 6);
/* 335 */                   iloI0lOlll1.I0010I0i(false);
/* 338 */                   z3 = false;
                        } else if (num.intValue() == 0) {
/* 352 */                   iloI0lOlll1.I00i01iIIliI(-1632119868);
/* 386 */                   z3 = false;
/* 388 */                   OlioioOl0O.I00000oIO(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I001iOo1i0O, 0L, 0.0f, 0.0f, null, i1i0IooiOOI.I000OiO, iloI0lOlll1, 12582918, 122);
/* 391 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 402 */                   if (num.intValue() == 1) {
/* 407 */                       iloI0lOlll1.I00i01iIIliI(-1631570145);
/* 442 */                       z3 = false;
/* 444 */                       z2 = true;
/* 446 */                       OlioioOl0O.I00000oIO(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I000O01llI0, 0L, 0.0f, 0.0f, null, i1i0IooiOOI.I000iOII, iloI0lOlll1, 12582918, 122);
/* 449 */                       iloI0lOlll1.I0010I0i(false);
                            } else {
/* 453 */                       z2 = true;
/* 459 */                       if (num.intValue() == 2) {
/* 464 */                           iloI0lOlll1.I00i01iIIliI(-1631041812);
/* 496 */                           z3 = false;
/* 498 */                           OlioioOl0O.I00000oIO(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I000O01llI0, 0L, 0.0f, 0.0f, null, i1i0IooiOOI.I000l1, iloI0lOlll1, 12582918, 122);
/* 501 */                           iloI0lOlll1.I0010I0i(false);
                                } else {
/* 505 */                           z3 = false;
/* 510 */                           iloI0lOlll1.I00i01iIIliI(-1630393788);
/* 513 */                           iloI0lOlll1.I0010I0i(false);
                                }
                            }
/* 524 */                   iOii1l.invoke(iloI0lOlll1, Integer.valueOf((i3 >> 15) & 14));
/* 527 */                   iloI0lOlll1.I0010I0i(z2);
/* 530 */                   if (ol1OlloIO == null) {
/* 535 */                       iloI0lOlll1.I00i01iIIliI(1378802673);
/* 561 */                       lOIli1Ol.I00000oOI(ol1OlloIO, iO01II.I000OiO(II1oili.I00000oIO.I00000oOI(o1ooIo101ll, i1O01oOIoI0I.I00l0OO0IO), 0.0f, 0.0f, 0.0f, 16.0f, 7), null, iloI0lOlll1, (i3 >> 12) & 14);
/* 564 */                       iloI0lOlll1.I0010I0i(z3);
                            } else {
/* 571 */                       iloI0lOlll1.I00i01iIIliI(1378965082);
/* 574 */                       iloI0lOlll1.I0010I0i(z3);
                            }
/* 577 */                   iloI0lOlll1.I0010I0i(z2);
                        }
/* 339 */               z2 = true;
/* 524 */               iOii1l.invoke(iloI0lOlll1, Integer.valueOf((i3 >> 15) & 14));
/* 527 */               iloI0lOlll1.I0010I0i(z2);
/* 530 */               if (ol1OlloIO == null) {
                        }
/* 577 */               iloI0lOlll1.I0010I0i(z2);
                    } else {
/* 581 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 584 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 588 */           if (oOloioIlI001IO000 != null) {
/* 593 */               I1ollooOoi i1ollooOoi = new I1ollooOoi(3);
/* 598 */               i1ollooOoi.I00iio = str;
/* 602 */               i1ollooOoi.I00ilI0I1 = num;
/* 606 */               i1ollooOoi.I00iiI = z;
/* 610 */               i1ollooOoi.I00ilO0 = illOOo00lI;
/* 612 */               i1ollooOoi.I00io1l = ol1OlloIO;
/* 614 */               i1ollooOoi.I00ioIO = iOii1l;
/* 618 */               i1ollooOoi.I00iiO = i;
/* 620 */               VarHandle.storeStoreFence();
/* 623 */               oOloioIlI001IO000.I0000O = i1ollooOoi;
                    }
                }

                public static final void I000o00OoI0I(Function1 function1, float f, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-477516782);
/* 18 */            int i2 = i | (iloI0lOlll1.I0000O(f) ? 32 : 16);
/* 35 */            int i3 = 2;
/* 36 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 44 */                Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 46 */                boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(context);
/* 50 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 54 */                Object obj = IOl11li.I00000oIO;
/* 56 */                if (zI000OOo1O || objI00O0i0ii == obj) {
/* 63 */                    objI00O0i0ii = new IO1OI110o1(context, null, 2);
/* 66 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 73 */                iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii, iloI0lOlll1, OoiIlOl1iI.I00000oIO);
/* 76 */                Il0li01oOil il0li01oOil = OI1O101.I00ilO0;
/* 80 */                ArrayList arrayList = new ArrayList();
/* 83 */                il0li01oOil.getClass();
/* 88 */                I01I0Iioooo0 i01I0Iioooo0 = new I01I0Iioooo0(il0li01oOil);
/* 95 */                while (i01I0Iioooo0.hasNext()) {
/* 97 */                    Object next = i01I0Iioooo0.next();
/* 106 */                   if (((OI1O101) next).I00iio) {
/* 108 */                       arrayList.add(next);
                            }
                        }
/* 112 */               Il0li01oOil il0li01oOil2 = OI1O101.I00ilO0;
/* 116 */               ArrayList arrayList2 = new ArrayList();
/* 119 */               il0li01oOil2.getClass();
/* 124 */               I01I0Iioooo0 i01I0Iioooo02 = new I01I0Iioooo0(il0li01oOil2);
/* 131 */               while (i01I0Iioooo02.hasNext()) {
/* 133 */                   Object next2 = i01I0Iioooo02.next();
/* 142 */                   if (!((OI1O101) next2).I00iio) {
/* 144 */                       arrayList2.add(next2);
                            }
                        }
/* 154 */               OIo1i1 oIo1i1 = new OIo1i1(12.0f, 12.0f, 12.0f, f + 12.0f);
/* 159 */               I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(8.0f);
/* 176 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(arrayList) | iloI0lOlll1.I000OOo1O(context) | iloI0lOlll1.I000OOo1O(arrayList2);
/* 177 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii2;
/* 181 */               if (zI000OOo1O2 || objI00O0i0ii2 == obj) {
/* 189 */                   I0O1IO i0o1io = new I0O1IO(8);
/* 192 */                   i0o1io.I00iiI = arrayList;
/* 194 */                   i0o1io.I00iiO = arrayList2;
/* 196 */                   i0o1io.I00iio = function1;
/* 198 */                   i0o1io.I00ilI0I1 = context;
/* 200 */                   VarHandle.storeStoreFence();
/* 203 */                   iloI0lOlll1.I00iio(i0o1io);
                            obj2 = i0o1io;
                        }
/* 222 */               l0oIiiI1O0o.I00000oIO(null, null, oIo1i1, i1IioII0000oI00, null, null, false, null, (Function1) obj2, iloI0lOlll1, 24576, 491);
                    } else {
/* 226 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 229 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 233 */           if (oOloioIlI001IO000 != null) {
/* 237 */               I0ilioi0II i0ilioi0II = new I0ilioi0II(i3);
/* 240 */               i0ilioi0II.I00iiO = function1;
/* 242 */               i0ilioi0II.I00iiI = f;
/* 244 */               VarHandle.storeStoreFence();
/* 247 */               oOloioIlI001IO000.I0000O = i0ilioi0II;
                    }
                }

                public static final void I000oI1ioi(Context context, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    Ioi1Io1o ioi1Io1o;
/* 8 */             iloI0lOlll1.I00i0O(-1458499957);
/* 20 */            int i2 = i | (iloI0lOlll1.I000OOo1O(context) ? 4 : 2);
/* 26 */            int i3 = 0;
/* 38 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 40 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 44 */                Object obj = IOl11li.I00000oIO;
/* 46 */                if (objI00O0i0ii == obj) {
/* 48 */                    objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 52 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 55 */                Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 57 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 61 */                if (objI00O0i0ii2 == obj) {
/* 65 */                    objI00O0i0ii2 = new Ol1OlloIO();
/* 68 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 71 */                Ol1OlloIO ol1OlloIO = (Ol1OlloIO) objI00O0i0ii2;
/* 79 */                IOO0i0o1O0l iOO0i0o1O0l = (IOO0i0o1O0l) iloI0lOlll1.I000iOII(IOlO0o100i1i.I0000oI00);
/* 81 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 86 */                if (objI00O0i0ii3 == obj) {
/* 88 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO(null);
/* 92 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 95 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii3;
/* 97 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 101 */               if (objI00O0i0ii4 == obj) {
/* 103 */                   objI00O0i0ii4 = lOO00IiI0li.I00000oIO(null);
/* 107 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 110 */               OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii4;
/* 112 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 116 */               if (objI00O0i0ii5 == obj) {
/* 120 */                   objI00O0i0ii5 = lOO00IiI0li.I00000oIO("");
/* 124 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 127 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii5;
/* 129 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 133 */               if (objI00O0i0ii6 == obj) {
/* 137 */                   objI00O0i0ii6 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 141 */                   iloI0lOlll1.I00iio(objI00O0i0ii6);
                        }
/* 144 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii6;
/* 146 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 150 */               if (objI00O0i0ii7 == obj) {
/* 154 */                   objI00O0i0ii7 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 158 */                   iloI0lOlll1.I00iio(objI00O0i0ii7);
                        }
/* 161 */               OI10i0Il oI10i0Il5 = (OI10i0Il) objI00O0i0ii7;
/* 163 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
/* 167 */               if (objI00O0i0ii8 == obj) {
/* 176 */                   objI00O0i0ii8 = new Oi0Oooi(12).I000OiO();
/* 180 */                   iloI0lOlll1.I00iio(objI00O0i0ii8);
                        }
/* 183 */               Ioi1Io1o ioi1Io1o2 = (Ioi1Io1o) objI00O0i0ii8;
/* 185 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
/* 189 */               if (objI00O0i0ii9 == obj) {
/* 199 */                   objI00O0i0ii9 = ImageDescription.getClient(ImageDescriberOptions.builder(context).build());
/* 203 */                   iloI0lOlll1.I00iio(objI00O0i0ii9);
                        }
/* 206 */               ImageDescriber imageDescriber = (ImageDescriber) objI00O0i0ii9;
/* 208 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(imageDescriber);
/* 212 */               Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii10;
/* 216 */               if (zI000OOo1O || objI00O0i0ii10 == obj) {
/* 222 */                   Iloi1i0I iloi1i0I = new Iloi1i0I(i3);
/* 225 */                   iloi1i0I.I00iiI = imageDescriber;
/* 227 */                   VarHandle.storeStoreFence();
/* 230 */                   iloI0lOlll1.I00iio(iloi1i0I);
                            obj2 = iloi1i0I;
                        }
/* 235 */               OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 237 */               iIO0iiOiOl0l.I00000oOI(ooiIlOl1iI, (Function1) obj2, iloI0lOlll1);
/* 240 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(imageDescriber);
/* 244 */               Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
/* 248 */               if (zI000OOo1O2 || objI00O0i0ii11 == obj) {
/* 260 */                   ioi1Io1o = ioi1Io1o2;
/* 263 */                   objI00O0i0ii11 = new Ii1O001loIoO(imageDescriber, oI10i0Il, null, 15);
/* 266 */                   iloI0lOlll1.I00iio(objI00O0i0ii11);
                        } else {
/* 253 */                   ioi1Io1o = ioi1Io1o2;
                        }
/* 271 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii11, iloI0lOlll1, ooiIlOl1iI);
/* 277 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(0);
/* 288 */               boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(context);
/* 289 */               Object objI00O0i0ii12 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii12;
/* 293 */               if (zI000OOo1O3 || objI00O0i0ii12 == obj) {
/* 300 */                   IloIiOoio iloIiOoio = new IloIiOoio(1);
/* 303 */                   iloIiOoio.I00iiI = ii0110;
/* 305 */                   iloIiOoio.I00iiO = context;
/* 307 */                   iloIiOoio.I00iio = oI10i0Il2;
/* 309 */                   iloIiOoio.I00ilI0I1 = oI10i0Il3;
/* 311 */                   VarHandle.storeStoreFence();
/* 314 */                   iloI0lOlll1.I00iio(iloIiOoio);
                            obj3 = iloIiOoio;
                        }
/* 320 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj3, iloI0lOlll1, 0);
/* 328 */               Integer num = (Integer) oI10i0Il.getValue();
/* 336 */               boolean zBooleanValue = ((Boolean) oI10i0Il4.getValue()).booleanValue();
/* 343 */               IloIlIoo iloIlIoo = new IloIlIoo(1);
/* 346 */               iloIlIoo.I00iiI = oI10i0Il5;
/* 348 */               iloIlIoo.I00iiO = oI10i0Il3;
/* 350 */               iloIlIoo.I00l0I0l0lO1 = o1OIi1I00000oIO;
/* 352 */               iloIlIoo.I00iio = ii0110;
/* 354 */               iloIlIoo.I00l0OO0IO = imageDescriber;
/* 356 */               iloIlIoo.I00ilI0I1 = oI10i0Il2;
/* 358 */               iloIlIoo.I00li1OI = iOO0i0o1O0l;
/* 360 */               iloIlIoo.I00ilO0 = oI10i0Il;
/* 362 */               iloIlIoo.I00io1l = oI10i0Il4;
/* 364 */               iloIlIoo.I00ioIO = ol1OlloIO;
/* 368 */               iloIlIoo.I00ll1 = ioi1Io1o;
/* 370 */               iloIlIoo.I00lli11 = context;
/* 372 */               VarHandle.storeStoreFence();
/* 393 */               I000lI("Describe Image", num, zBooleanValue, illOOo00lI, ol1OlloIO, iiioOl1O.I00000oOI(-1369319757, iloIlIoo, iloI0lOlll1), iloI0lOlll1, 224262);
                    } else {
/* 397 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 400 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 404 */           if (oOloioIlI001IO000 != null) {
/* 409 */               IloIOOlOOIl0 iloIOOlOOIl0 = new IloIOOlOOIl0(4);
/* 412 */               iloIOOlOOIl0.I00iiI = context;
/* 416 */               iloIOOlOOIl0.I00iiO = illOOo00lI;
/* 418 */               VarHandle.storeStoreFence();
/* 421 */               oOloioIlI001IO000.I0000O = iloIOOlOOIl0;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x018b  */
                /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00100l0(Bitmap bitmap, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, Function3 function3, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    IllOOo00lI illOOo00lI3;
                    int i4;
                    Function3 function32;
                    int i5;
                    int i6;
                    OOloioIl oOloioIlI001IO000;
                    IllOOo00lI illOOo00lI4;
                    Function3 function33;
/* 5 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 12 */            iloI0lOlll12.I00i0O(-767599957);
/* 17 */            if ((i & 6) == 0) {
/* 28 */                i3 = (iloI0lOlll12.I000OOo1O(bitmap) ? 4 : 2) | i;
                    } else {
/* 30 */                i3 = i;
                    }
/* 33 */            if ((i & 48) == 0) {
/* 46 */                i3 |= iloI0lOlll12.I000OOo1O(illOOo00lI) ? 32 : 16;
                    }
/* 47 */            int i7 = i2 & 4;
/* 49 */            if (i7 != 0) {
/* 51 */                i3 |= 384;
                    } else {
/* 58 */                if ((i & 384) == 0) {
/* 60 */                    illOOo00lI3 = illOOo00lI2;
/* 73 */                    i3 |= iloI0lOlll12.I000OOo1O(illOOo00lI3) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 74 */                i4 = i2 & 8;
/* 76 */                if (i4 != 0) {
/* 86 */                    if ((i & 3072) == 0) {
/* 88 */                        function32 = function3;
/* 101 */                       i3 |= iloI0lOlll12.I000OOo1O(function32) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                            }
/* 82 */                    i5 = i3;
/* 120 */                   if (iloI0lOlll12.I00OIl(i5 & 1, (i5 & 1171) != 1170)) {
/* 128 */                       IllOOo00lI illOOo00lI5 = i7 != 0 ? null : illOOo00lI3;
/* 135 */                       Function3 function34 = i4 != 0 ? i1i0IooiOOI.I00i0ilIl0i : function32;
/* 138 */                       O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 140 */                       if (bitmap != null) {
/* 145 */                           iloI0lOlll12.I00i01iIIliI(-1164232930);
/* 150 */                           O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 156 */                           int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 160 */                           OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 164 */                           O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooIo101ll);
/* 170 */                           IOl0oi0lOl1.I000lI.getClass();
/* 173 */                           iloI0lOlll12.I00i0oil();
/* 178 */                           if (iloI0lOlll12.I00O10llo) {
/* 182 */                               iloI0lOlll12.I000l1(O0iiOioolIi.I01101IOlO);
                                    } else {
/* 186 */                               iloI0lOlll12.I00io1l();
                                    }
/* 191 */                           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll12, o1iOIl0o10I0000Il00O);
/* 196 */                           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll12, oO0lO0l0I000lI);
/* 205 */                           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll12, Integer.valueOf(iHashCode));
/* 208 */                           li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 213 */                           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 216 */                           Function3 function35 = function34;
/* 250 */                           ioO0II.I00000oOI(new I0oO00o(bitmap), null, ii0OOOOo0i.I00000oIO(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), OiI11O1i1.I00000oOI(8.0f)), null, iloI0lOlll12, 48, 248);
/* 254 */                           int i8 = i5 >> 6;
/* 259 */                           Integer numValueOf = Integer.valueOf(6 | (i8 & 112));
/* 263 */                           II1oili iI1oili = II1oili.I00000oIO;
/* 265 */                           function35.invoke(iI1oili, iloI0lOlll12, numValueOf);
/* 268 */                           if (illOOo00lI5 != null) {
/* 273 */                               iloI0lOlll12.I00i01iIIliI(503600844);
/* 297 */                               IllOOo00lI illOOo00lI6 = illOOo00lI5;
/* 299 */                               function33 = function35;
/* 301 */                               iloI0lOlll12 = iloI0lOlll1;
/* 303 */                               iOiO0o0oi.I0000O(illOOo00lI6, iI1oili.I00000oOI(o1ooIo101ll, i1O01oOIoI0I.I00ilI0I1), false, null, null, null, i1i0IooiOOI.I00i0oil, iloI0lOlll12, (i8 & 14) | 805306368, 508);
/* 306 */                               illOOo00lI4 = illOOo00lI6;
/* 308 */                               iloI0lOlll12.I0010I0i(false);
                                    } else {
/* 312 */                               illOOo00lI4 = illOOo00lI5;
/* 314 */                               function33 = function35;
/* 316 */                               iloI0lOlll12 = iloI0lOlll12;
/* 320 */                               iloI0lOlll12.I00i01iIIliI(503794966);
/* 323 */                               iloI0lOlll12.I0010I0i(false);
                                    }
/* 326 */                           iloI0lOlll12.I0010I0i(true);
/* 329 */                           iloI0lOlll12.I0010I0i(false);
/* 332 */                           i6 = 3;
                                } else {
/* 335 */                           illOOo00lI4 = illOOo00lI5;
/* 337 */                           function33 = function34;
/* 342 */                           iloI0lOlll12.I00i01iIIliI(-1163738604);
/* 372 */                           i6 = 3;
/* 374 */                           iOiO0o0oi.I00000oIO(illOOo00lI, Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), false, null, null, null, null, null, i1i0IooiOOI.I00iIO, iloI0lOlll1, ((i5 >> 3) & 14) | 805306416, 508);
/* 377 */                           iloI0lOlll12 = iloI0lOlll1;
/* 378 */                           iloI0lOlll12.I0010I0i(false);
                                }
/* 381 */                       function32 = function33;
/* 383 */                       illOOo00lI3 = illOOo00lI4;
                            } else {
/* 386 */                       i6 = 3;
/* 387 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 390 */                   oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 394 */                   if (oOloioIlI001IO000 != null) {
/* 398 */                       I0oliIo i0oliIo = new I0oliIo(i6);
/* 401 */                       i0oliIo.I00iio = bitmap;
/* 403 */                       i0oliIo.I00ilI0I1 = illOOo00lI;
/* 405 */                       i0oliIo.I00ilO0 = illOOo00lI3;
/* 407 */                       i0oliIo.I00io1l = function32;
/* 409 */                       i0oliIo.I00iiI = i;
/* 413 */                       i0oliIo.I00iiO = i2;
/* 415 */                       VarHandle.storeStoreFence();
/* 418 */                       oOloioIlI001IO000.I0000O = i0oliIo;
/* 965 */                       return;
                            }
/* 965 */                   return;
                        }
/* 78 */                i3 |= 3072;
/* 80 */                function32 = function3;
/* 82 */                i5 = i3;
/* 120 */               if (iloI0lOlll12.I00OIl(i5 & 1, (i5 & 1171) != 1170)) {
                        }
/* 390 */               oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 394 */               if (oOloioIlI001IO000 != null) {
                        }
                    }
/* 53 */            illOOo00lI3 = illOOo00lI2;
/* 74 */            i4 = i2 & 8;
/* 76 */            if (i4 != 0) {
                    }
/* 80 */            function32 = function3;
/* 82 */            i5 = i3;
/* 120 */           if (iloI0lOlll12.I00OIl(i5 & 1, (i5 & 1171) != 1170)) {
                    }
/* 390 */           oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 394 */           if (oOloioIlI001IO000 != null) {
                    }
                }

                public static final void I00100o1O0lo(Context context, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 6 */             iloI0lOlll1.I00i0O(1530795600);
/* 18 */            int i2 = i | (iloI0lOlll1.I000OOo1O(context) ? 4 : 2);
/* 24 */            int i3 = 0;
/* 25 */            int i4 = 1;
/* 36 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 38 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 42 */                Object obj = IOl11li.I00000oIO;
/* 44 */                if (objI00O0i0ii == obj) {
/* 46 */                    objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 50 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 53 */                Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 55 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 59 */                if (objI00O0i0ii2 == obj) {
/* 62 */                    objI00O0i0ii2 = lOO00IiI0li.I00000oIO(null);
/* 66 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 69 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii2;
/* 71 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 75 */                if (objI00O0i0ii3 == obj) {
/* 79 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO("");
/* 83 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 86 */                OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii3;
/* 88 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 92 */                if (objI00O0i0ii4 == obj) {
/* 96 */                    objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 100 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 103 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii4;
/* 105 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 109 */               if (objI00O0i0ii5 == obj) {
/* 113 */                   objI00O0i0ii5 = ImageLabeling.getClient(ImageLabelerOptions.DEFAULT_OPTIONS);
/* 117 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 120 */               Object obj2 = (ImageLabeler) objI00O0i0ii5;
/* 122 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj2);
/* 126 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii6;
/* 130 */               if (zI000OOo1O || objI00O0i0ii6 == obj) {
/* 138 */                   Iil1olo iil1olo = new Iil1olo(10);
/* 141 */                   iil1olo.I00iiI = obj2;
/* 143 */                   VarHandle.storeStoreFence();
/* 146 */                   iloI0lOlll1.I00iio(iil1olo);
                            obj3 = iil1olo;
                        }
/* 153 */               iIO0iiOiOl0l.I00000oOI(OoiIlOl1iI.I00000oIO, (Function1) obj3, iloI0lOlll1);
/* 158 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(i3);
/* 169 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(context);
/* 170 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii7;
/* 174 */               if (zI000OOo1O2 || objI00O0i0ii7 == obj) {
/* 180 */                   IloIiOoio iloIiOoio = new IloIiOoio(i3);
/* 183 */                   iloIiOoio.I00iiI = ii0110;
/* 185 */                   iloIiOoio.I00iiO = context;
/* 187 */                   iloIiOoio.I00iio = oI10i0Il;
/* 189 */                   iloIiOoio.I00ilI0I1 = oI10i0Il2;
/* 191 */                   VarHandle.storeStoreFence();
/* 194 */                   iloI0lOlll1.I00iio(iloIiOoio);
                            obj4 = iloIiOoio;
                        }
/* 199 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj4, iloI0lOlll1, 0);
/* 207 */               Bitmap bitmap = (Bitmap) oI10i0Il.getValue();
/* 213 */               String str = (String) oI10i0Il2.getValue();
/* 221 */               boolean zBooleanValue = ((Boolean) oI10i0Il3.getValue()).booleanValue();
/* 225 */               boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(o1OIi1I00000oIO);
/* 229 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii8;
/* 233 */               if (zI000OOo1O3 || objI00O0i0ii8 == obj) {
/* 240 */                   I0O1I11 i0o1i11 = new I0O1I11(6);
/* 243 */                   i0o1i11.I00iiI = o1OIi1I00000oIO;
/* 245 */                   VarHandle.storeStoreFence();
/* 248 */                   iloI0lOlll1.I00iio(i0o1i11);
                            obj5 = i0o1i11;
                        }
/* 251 */               IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj5;
/* 261 */               boolean zI000OOo1O4 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(obj2);
/* 262 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
                        Object obj6 = objI00O0i0ii9;
/* 266 */               if (zI000OOo1O4 || objI00O0i0ii9 == obj) {
/* 273 */                   I0IoOl i0IoOl = new I0IoOl(7);
/* 276 */                   i0IoOl.I00iio = ii0110;
/* 278 */                   i0IoOl.I00iiI = oI10i0Il;
/* 280 */                   i0IoOl.I00ilI0I1 = oI10i0Il3;
/* 282 */                   i0IoOl.I00ilO0 = oI10i0Il2;
/* 284 */                   i0IoOl.I00iiO = obj2;
/* 286 */                   VarHandle.storeStoreFence();
/* 289 */                   iloI0lOlll1.I00iio(i0IoOl);
                            obj6 = i0IoOl;
                        }
/* 292 */               IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj6;
/* 294 */               Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                        Object obj7 = objI00O0i0ii10;
/* 298 */               if (objI00O0i0ii10 == obj) {
/* 304 */                   IOli1iO1Ii iOli1iO1Ii = new IOli1iO1Ii(17);
/* 307 */                   iOli1iO1Ii.I00iiI = oI10i0Il2;
/* 309 */                   VarHandle.storeStoreFence();
/* 312 */                   iloI0lOlll1.I00iio(iOli1iO1Ii);
                            obj7 = iOli1iO1Ii;
                        }
/* 315 */               IllOOo00lI illOOo00lI4 = (IllOOo00lI) obj7;
/* 317 */               boolean zI000OOo1O5 = iloI0lOlll1.I000OOo1O(obj2);
/* 321 */               Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
                        Object obj8 = objI00O0i0ii11;
/* 325 */               if (zI000OOo1O5 || objI00O0i0ii11 == obj) {
/* 333 */                   IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(9);
/* 336 */                   iiioilIl1Il.I00iiI = obj2;
/* 338 */                   iiioilIl1Il.I00iiO = oI10i0Il2;
/* 340 */                   VarHandle.storeStoreFence();
/* 343 */                   iloI0lOlll1.I00iio(iiioilIl1Il);
                            obj8 = iiioilIl1Il;
                        }
/* 364 */               I00II0oii1o("Label Image", bitmap, str, zBooleanValue, illOOo00lI, illOOo00lI2, illOOo00lI3, illOOo00lI4, (Function1) obj8, null, iloI0lOlll1, 12607494, Barcode.FORMAT_UPC_A);
                    } else {
/* 368 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 371 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 375 */           if (oOloioIlI001IO000 != null) {
/* 379 */               IloIOOlOOIl0 iloIOOlOOIl0 = new IloIOOlOOIl0(i4);
/* 382 */               iloIOOlOOIl0.I00iiI = context;
/* 384 */               iloIOOlOOIl0.I00iiO = illOOo00lI;
/* 386 */               VarHandle.storeStoreFence();
/* 389 */               oOloioIlI001IO000.I0000O = iloIOOlOOIl0;
                    }
                }

                public static final void I0010I0i(Context context, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 8 */             iloI0lOlll1.I00i0O(2008311069);
/* 20 */            int i2 = i | (iloI0lOlll1.I000OOo1O(context) ? 4 : 2);
/* 26 */            int i3 = 0;
/* 38 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 40 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 44 */                Object obj = IOl11li.I00000oIO;
/* 46 */                if (objI00O0i0ii == obj) {
/* 48 */                    objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 52 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 55 */                Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 57 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 62 */                if (objI00O0i0ii2 == obj) {
/* 64 */                    objI00O0i0ii2 = lOO00IiI0li.I00000oIO(null);
/* 68 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 71 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii2;
/* 73 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 77 */                if (objI00O0i0ii3 == obj) {
/* 81 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO("");
/* 85 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 88 */                OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii3;
/* 90 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 94 */                if (objI00O0i0ii4 == obj) {
/* 98 */                    objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 102 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 105 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii4;
/* 107 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 111 */               if (objI00O0i0ii5 == obj) {
/* 113 */                   objI00O0i0ii5 = lOO00IiI0li.I00000oIO(null);
/* 117 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 120 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii5;
/* 122 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 126 */               if (objI00O0i0ii6 == obj) {
/* 141 */                   objI00O0i0ii6 = PoseDetection.getClient(new PoseDetectorOptions.Builder().setDetectorMode(1).build());
/* 145 */                   iloI0lOlll1.I00iio(objI00O0i0ii6);
                        }
/* 148 */               Object obj2 = (PoseDetector) objI00O0i0ii6;
/* 150 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj2);
/* 154 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 158 */               int i4 = 16;
                        Object obj3 = objI00O0i0ii7;
/* 160 */               if (zI000OOo1O || objI00O0i0ii7 == obj) {
/* 166 */                   Iil1olo iil1olo = new Iil1olo(i4);
/* 169 */                   iil1olo.I00iiI = obj2;
/* 171 */                   VarHandle.storeStoreFence();
/* 174 */                   iloI0lOlll1.I00iio(iil1olo);
                            obj3 = iil1olo;
                        }
/* 181 */               iIO0iiOiOl0l.I00000oOI(OoiIlOl1iI.I00000oIO, (Function1) obj3, iloI0lOlll1);
/* 186 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(i3);
/* 197 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(context);
/* 198 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii8;
/* 202 */               if (zI000OOo1O2 || objI00O0i0ii8 == obj) {
/* 209 */                   I1o0IiiI0il i1o0IiiI0il = new I1o0IiiI0il(6);
/* 212 */                   i1o0IiiI0il.I00iiI = ii0110;
/* 214 */                   i1o0IiiI0il.I00iiO = context;
/* 216 */                   i1o0IiiI0il.I00iio = oI10i0Il;
/* 218 */                   i1o0IiiI0il.I00ilI0I1 = oI10i0Il2;
/* 220 */                   i1o0IiiI0il.I00ilO0 = oI10i0Il4;
/* 222 */                   VarHandle.storeStoreFence();
/* 225 */                   iloI0lOlll1.I00iio(i1o0IiiI0il);
                            obj4 = i1o0IiiI0il;
                        }
/* 230 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj4, iloI0lOlll1, 0);
/* 238 */               Bitmap bitmap = (Bitmap) oI10i0Il.getValue();
/* 244 */               String str = (String) oI10i0Il2.getValue();
/* 252 */               boolean zBooleanValue = ((Boolean) oI10i0Il3.getValue()).booleanValue();
/* 260 */               OI1OIlllll0 oI1OIlllll0 = (OI1OIlllll0) oI10i0Il4.getValue();
/* 262 */               boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(o1OIi1I00000oIO);
/* 266 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii9;
/* 270 */               if (zI000OOo1O3 || objI00O0i0ii9 == obj) {
/* 278 */                   I0O1I11 i0o1i11 = new I0O1I11(14);
/* 281 */                   i0o1i11.I00iiI = o1OIi1I00000oIO;
/* 283 */                   VarHandle.storeStoreFence();
/* 286 */                   iloI0lOlll1.I00iio(i0o1i11);
                            obj5 = i0o1i11;
                        }
/* 289 */               IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj5;
/* 299 */               boolean zI000OOo1O4 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(obj2);
/* 300 */               Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                        Object obj6 = objI00O0i0ii10;
/* 304 */               if (zI000OOo1O4 || objI00O0i0ii10 == obj) {
/* 311 */                   I0iI0llll1 i0iI0llll1 = new I0iI0llll1(3);
/* 314 */                   i0iI0llll1.I00ilI0I1 = ii0110;
/* 316 */                   i0iI0llll1.I00iiI = oI10i0Il;
/* 318 */                   i0iI0llll1.I00iiO = oI10i0Il3;
/* 320 */                   i0iI0llll1.I00iio = oI10i0Il2;
/* 322 */                   i0iI0llll1.I00ilO0 = obj2;
/* 324 */                   i0iI0llll1.I00io1l = oI10i0Il4;
/* 326 */                   VarHandle.storeStoreFence();
/* 329 */                   iloI0lOlll1.I00iio(i0iI0llll1);
                            obj6 = i0iI0llll1;
                        }
/* 333 */               IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj6;
/* 335 */               Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
                        Object obj7 = objI00O0i0ii11;
/* 339 */               if (objI00O0i0ii11 == obj) {
/* 345 */                   I0IlOO10Ii1 i0IlOO10Ii1 = new I0IlOO10Ii1(16);
/* 348 */                   i0IlOO10Ii1.I00iiI = oI10i0Il2;
/* 350 */                   i0IlOO10Ii1.I00iiO = oI10i0Il4;
/* 352 */                   VarHandle.storeStoreFence();
/* 355 */                   iloI0lOlll1.I00iio(i0IlOO10Ii1);
                            obj7 = i0IlOO10Ii1;
                        }
/* 358 */               IllOOo00lI illOOo00lI4 = (IllOOo00lI) obj7;
/* 360 */               boolean zI000OOo1O5 = iloI0lOlll1.I000OOo1O(obj2);
/* 364 */               Object objI00O0i0ii12 = iloI0lOlll1.I00O0i0ii();
                        Object obj8 = objI00O0i0ii12;
/* 368 */               if (zI000OOo1O5 || objI00O0i0ii12 == obj) {
/* 376 */                   I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(23);
/* 379 */                   i01oIoOI01l.I00iiI = obj2;
/* 381 */                   i01oIoOI01l.I00iiO = oI10i0Il2;
/* 383 */                   i01oIoOI01l.I00iio = oI10i0Il4;
/* 385 */                   VarHandle.storeStoreFence();
/* 388 */                   iloI0lOlll1.I00iio(i01oIoOI01l);
                            obj8 = i01oIoOI01l;
                        }
/* 408 */               I00II0oii1o("Pose Detection", bitmap, str, zBooleanValue, illOOo00lI, illOOo00lI2, illOOo00lI3, illOOo00lI4, (Function1) obj8, oI1OIlllll0, iloI0lOlll1, 12607494, 0);
                    } else {
/* 412 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 415 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 419 */           if (oOloioIlI001IO000 != null) {
/* 424 */               IloIOOlOOIl0 iloIOOlOOIl0 = new IloIOOlOOIl0(0);
/* 427 */               iloIOOlOOIl0.I00iiI = context;
/* 431 */               iloIOOlOOIl0.I00iiO = illOOo00lI;
/* 433 */               VarHandle.storeStoreFence();
/* 436 */               oOloioIlI001IO000.I0000O = iloIOOlOOIl0;
                    }
                }

                public static final String I0010o(Pose pose) {
/* 1 */             List<PoseLandmark> allPoseLandmarks = pose.getAllPoseLandmarks();
/* 9 */             int i = 0;
/* 10 */            if (!(allPoseLandmarks instanceof Collection) || !allPoseLandmarks.isEmpty()) {
/* 22 */                Iterator<T> it = allPoseLandmarks.iterator();
/* 30 */                while (it.hasNext()) {
/* 46 */                    if (((PoseLandmark) it.next()).getInFrameLikelihood() > 0.5f && (i = i + 1) < 0) {
/* 53 */                        IOOi1I.I000l1();
/* 57 */                        throw null;
                            }
                        }
                    }
                    return i == 0 ? "No pose detected." : IIlIOloOOO.I00100l0("Pose detected — ", i, " / 33 body landmarks tracked.");
                }

                public static final OI1OIlllll0 I00111O(Pose pose, int i, int i2) {
/* 1 */             List<PoseLandmark> allPoseLandmarks = pose.getAllPoseLandmarks();
/* 15 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(allPoseLandmarks, 10));
/* 26 */            for (PoseLandmark poseLandmark : allPoseLandmarks) {
/* 36 */                int landmarkType = poseLandmark.getLandmarkType();
/* 44 */                float f = poseLandmark.getPosition().x;
/* 50 */                float f2 = poseLandmark.getPosition().y;
/* 52 */                float inFrameLikelihood = poseLandmark.getInFrameLikelihood();
/* 56 */                OI1O1lOIio0 oI1O1lOIio0 = new OI1O1lOIio0();
/* 59 */                oI1O1lOIio0.I00000oIO = landmarkType;
/* 61 */                oI1O1lOIio0.I00000oOI = f;
/* 63 */                oI1O1lOIio0.I0000Il00O = f2;
/* 65 */                oI1O1lOIio0.I0000O = inFrameLikelihood;
/* 67 */                VarHandle.storeStoreFence();
/* 70 */                arrayList.add(oI1O1lOIio0);
                    }
/* 76 */            OI1O1iOo00i0 oI1O1iOo00i0 = new OI1O1iOo00i0();
/* 79 */            oI1O1iOo00i0.I00000oIO = arrayList;
/* 81 */            VarHandle.storeStoreFence();
/* 86 */            return new OI1OIlllll0(oI1O1iOo00i0, i, i2);
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                    */
                public static final void I001IIilI0O(p000.IllOOo00lI r51, p000.IloI0lOlll1 r52, int r53) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*  JADX ERROR: Type inference failed
                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /*
                        Method dump skipped, instructions count: 1732
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.Iloo0ilo.I001IIilI0O(IllOOo00lI, IloI0lOlll1, int):void");
                }

                public static final void I001IO000(Context context, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 8 */             iloI0lOlll1.I00i0O(-1508900577);
/* 20 */            int i2 = i | (iloI0lOlll1.I000OOo1O(context) ? 4 : 2);
/* 26 */            int i3 = 0;
/* 27 */            int i4 = 1;
/* 38 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 40 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 44 */                Object obj = IOl11li.I00000oIO;
/* 46 */                if (objI00O0i0ii == obj) {
/* 48 */                    objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 52 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 55 */                Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 57 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 61 */                if (objI00O0i0ii2 == obj) {
/* 65 */                    objI00O0i0ii2 = new Ol1OlloIO();
/* 68 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 71 */                Ol1OlloIO ol1OlloIO = (Ol1OlloIO) objI00O0i0ii2;
/* 73 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 78 */                if (objI00O0i0ii3 == obj) {
/* 80 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO(null);
/* 84 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 87 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii3;
/* 89 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 95 */                if (objI00O0i0ii4 == obj) {
/* 97 */                    objI00O0i0ii4 = lOO00IiI0li.I00000oIO("");
/* 101 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 104 */               OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii4;
/* 106 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 110 */               if (objI00O0i0ii5 == obj) {
/* 112 */                   objI00O0i0ii5 = lOO00IiI0li.I00000oIO("");
/* 116 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 119 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii5;
/* 121 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 125 */               if (objI00O0i0ii6 == obj) {
/* 129 */                   objI00O0i0ii6 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 133 */                   iloI0lOlll1.I00iio(objI00O0i0ii6);
                        }
/* 136 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii6;
/* 138 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 142 */               if (objI00O0i0ii7 == obj) {
/* 144 */                   objI00O0i0ii7 = lOO00IiI0li.I00000oIO("");
/* 148 */                   iloI0lOlll1.I00iio(objI00O0i0ii7);
                        }
/* 151 */               OI10i0Il oI10i0Il5 = (OI10i0Il) objI00O0i0ii7;
/* 153 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
/* 157 */               if (objI00O0i0ii8 == obj) {
/* 159 */                   objI00O0i0ii8 = lOO00IiI0li.I00000oIO("");
/* 163 */                   iloI0lOlll1.I00iio(objI00O0i0ii8);
                        }
/* 166 */               OI10i0Il oI10i0Il6 = (OI10i0Il) objI00O0i0ii8;
/* 168 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
/* 172 */               if (objI00O0i0ii9 == obj) {
/* 190 */                   objI00O0i0ii9 = Proofreading.getClient(ProofreaderOptions.builder(context).setInputType(1).setLanguage(0).build());
/* 194 */                   iloI0lOlll1.I00iio(objI00O0i0ii9);
                        }
/* 197 */               Proofreader proofreader = (Proofreader) objI00O0i0ii9;
/* 199 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(proofreader);
/* 203 */               Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii10;
/* 207 */               if (zI000OOo1O || objI00O0i0ii10 == obj) {
/* 213 */                   IloiII0o1l iloiII0o1l = new IloiII0o1l(i3);
/* 216 */                   iloiII0o1l.I00iiI = proofreader;
/* 218 */                   VarHandle.storeStoreFence();
/* 221 */                   iloI0lOlll1.I00iio(iloiII0o1l);
                            obj2 = iloiII0o1l;
                        }
/* 226 */               OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 228 */               iIO0iiOiOl0l.I00000oOI(ooiIlOl1iI, (Function1) obj2, iloI0lOlll1);
/* 233 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(i4);
/* 244 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(context);
/* 246 */               Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii11;
/* 250 */               if (zI000OOo1O2 || objI00O0i0ii11 == obj) {
/* 257 */                   I1o0IiiI0il i1o0IiiI0il = new I1o0IiiI0il(5);
/* 260 */                   i1o0IiiI0il.I00iiI = ii0110;
/* 262 */                   i1o0IiiI0il.I00iiO = context;
/* 264 */                   i1o0IiiI0il.I00iio = oI10i0Il6;
/* 266 */                   i1o0IiiI0il.I00ilI0I1 = oI10i0Il2;
/* 268 */                   i1o0IiiI0il.I00ilO0 = oI10i0Il5;
/* 270 */                   VarHandle.storeStoreFence();
/* 273 */                   iloI0lOlll1.I00iio(i1o0IiiI0il);
                            obj3 = i1o0IiiI0il;
                        }
/* 279 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj3, iloI0lOlll1, 0);
/* 283 */               boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(proofreader);
/* 287 */               Object objI00O0i0ii12 = iloI0lOlll1.I00O0i0ii();
/* 291 */               if (zI000OOo1O3 || objI00O0i0ii12 == obj) {
/* 300 */                   objI00O0i0ii12 = new Ii1O001loIoO(proofreader, oI10i0Il, null, 16);
/* 303 */                   iloI0lOlll1.I00iio(objI00O0i0ii12);
                        }
/* 308 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii12, iloI0lOlll1, ooiIlOl1iI);
/* 315 */               Integer num = (Integer) oI10i0Il.getValue();
/* 323 */               boolean zBooleanValue = ((Boolean) oI10i0Il4.getValue()).booleanValue();
/* 330 */               IloO011Io1lo iloO011Io1lo = new IloO011Io1lo(2);
/* 333 */               iloO011Io1lo.I00iiI = ii0110;
/* 335 */               iloO011Io1lo.I00ioIO = proofreader;
/* 337 */               iloO011Io1lo.I00iiO = oI10i0Il2;
/* 339 */               iloO011Io1lo.I00iio = oI10i0Il5;
/* 341 */               iloO011Io1lo.I00ilI0I1 = oI10i0Il3;
/* 343 */               iloO011Io1lo.I00ilO0 = oI10i0Il4;
/* 345 */               iloO011Io1lo.I00l0I0l0lO1 = oI10i0Il;
/* 347 */               iloO011Io1lo.I00io1l = ol1OlloIO;
/* 349 */               iloO011Io1lo.I00l0OO0IO = o1OIi1I00000oIO;
/* 351 */               iloO011Io1lo.I00li1OI = oI10i0Il6;
/* 353 */               VarHandle.storeStoreFence();
/* 373 */               I000lI("Proofread", num, zBooleanValue, illOOo00lI, ol1OlloIO, iiioOl1O.I00000oOI(471539015, iloO011Io1lo, iloI0lOlll1), iloI0lOlll1, 224262);
                    } else {
/* 377 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 380 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 384 */           if (oOloioIlI001IO000 != null) {
/* 390 */               IloIOOlOOIl0 iloIOOlOOIl0 = new IloIOOlOOIl0(9);
/* 393 */               iloIOOlOOIl0.I00iiI = context;
/* 397 */               iloIOOlOOIl0.I00iiO = illOOo00lI;
/* 399 */               VarHandle.storeStoreFence();
/* 402 */               oOloioIlI001IO000.I0000O = iloIOOlOOIl0;
                    }
                }

                public static final void I001i1O0Ol(Context context, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    Ol1OlloIO ol1OlloIO;
                    Object obj;
/* 8 */             iloI0lOlll1.I00i0O(554630993);
/* 20 */            int i3 = i | (iloI0lOlll1.I000OOo1O(context) ? 4 : 2);
/* 37 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 39 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 43 */                Object obj2 = IOl11li.I00000oIO;
/* 45 */                if (objI00O0i0ii == obj2) {
/* 47 */                    objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 51 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 54 */                Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 56 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 60 */                if (objI00O0i0ii2 == obj2) {
/* 64 */                    objI00O0i0ii2 = new Ol1OlloIO();
/* 67 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 70 */                Ol1OlloIO ol1OlloIO2 = (Ol1OlloIO) objI00O0i0ii2;
/* 72 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 77 */                if (objI00O0i0ii3 == obj2) {
/* 79 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO(null);
/* 83 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 86 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii3;
/* 88 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 94 */                if (objI00O0i0ii4 == obj2) {
/* 96 */                    objI00O0i0ii4 = lOO00IiI0li.I00000oIO("");
/* 100 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 103 */               OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii4;
/* 105 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 109 */               if (objI00O0i0ii5 == obj2) {
/* 111 */                   objI00O0i0ii5 = lOO00IiI0li.I00000oIO("");
/* 115 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 118 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii5;
/* 120 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 124 */               if (objI00O0i0ii6 == obj2) {
/* 128 */                   objI00O0i0ii6 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 132 */                   iloI0lOlll1.I00iio(objI00O0i0ii6);
                        }
/* 135 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii6;
/* 137 */               i2 = 6;
/* 139 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 143 */               if (objI00O0i0ii7 == obj2) {
/* 145 */                   objI00O0i0ii7 = lOO00IiI0li.I00000oIO("");
/* 149 */                   iloI0lOlll1.I00iio(objI00O0i0ii7);
                        }
/* 152 */               OI10i0Il oI10i0Il5 = (OI10i0Il) objI00O0i0ii7;
/* 154 */               int i4 = 2;
/* 156 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
/* 160 */               if (objI00O0i0ii8 == obj2) {
/* 162 */                   objI00O0i0ii8 = lOO00IiI0li.I00000oIO("");
/* 166 */                   iloI0lOlll1.I00iio(objI00O0i0ii8);
                        }
/* 169 */               OI10i0Il oI10i0Il6 = (OI10i0Il) objI00O0i0ii8;
/* 177 */               int i5 = 4;
/* 257 */               List listI000O01llI0 = IOOi1I.I000O01llI0(new OIoi0IIoi("Elaborate", 1), new OIoi0IIoi("Shorten", 3), new OIoi0IIoi("Friendly", 4), new OIoi0IIoi("Professional", 5), new OIoi0IIoi("Rephrase", 6), new OIoi0IIoi("Emojify", 2));
/* 261 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
/* 265 */               if (objI00O0i0ii9 == obj2) {
/* 270 */                   objI00O0i0ii9 = new OIooi1iOiOol(0);
/* 273 */                   iloI0lOlll1.I00iio(objI00O0i0ii9);
                        }
/* 276 */               OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) objI00O0i0ii9;
/* 282 */               boolean zI0000oI00 = iloI0lOlll1.I0000oI00(oIooi1iOiOol.I000II());
/* 286 */               Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
/* 290 */               if (zI0000oI00 || objI00O0i0ii10 == obj2) {
/* 329 */                   objI00O0i0ii10 = Rewriting.getClient(RewriterOptions.builder(context).setOutputType(((Number) ((OIoi0IIoi) listI000O01llI0.get(oIooi1iOiOol.I000II())).I00iiI).intValue()).setLanguage(0).build());
/* 333 */                   iloI0lOlll1.I00iio(objI00O0i0ii10);
                        }
/* 336 */               Rewriter rewriter = (Rewriter) objI00O0i0ii10;
/* 338 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(rewriter);
/* 342 */               Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii11;
/* 346 */               if (zI000OOo1O || objI00O0i0ii11 == obj2) {
/* 353 */                   IloiI0Io iloiI0Io = new IloiI0Io(0);
/* 356 */                   iloiI0Io.I00iiI = rewriter;
/* 358 */                   VarHandle.storeStoreFence();
/* 361 */                   iloI0lOlll1.I00iio(iloiI0Io);
                            obj3 = iloiI0Io;
                        }
/* 366 */               iIO0iiOiOl0l.I00000oOI(rewriter, (Function1) obj3, iloI0lOlll1);
/* 372 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(1);
/* 383 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(context);
/* 387 */               Object objI00O0i0ii12 = iloI0lOlll1.I00O0i0ii();
/* 391 */               if (zI000OOo1O2 || objI00O0i0ii12 == obj2) {
/* 401 */                   ol1OlloIO = ol1OlloIO2;
/* 405 */                   I1o0IiiI0il i1o0IiiI0il = new I1o0IiiI0il(i5);
/* 408 */                   i1o0IiiI0il.I00iiI = ii0110;
/* 410 */                   i1o0IiiI0il.I00iiO = context;
/* 412 */                   i1o0IiiI0il.I00iio = oI10i0Il6;
/* 414 */                   i1o0IiiI0il.I00ilI0I1 = oI10i0Il2;
/* 416 */                   i1o0IiiI0il.I00ilO0 = oI10i0Il5;
/* 418 */                   VarHandle.storeStoreFence();
/* 421 */                   iloI0lOlll1.I00iio(i1o0IiiI0il);
                            obj = i1o0IiiI0il;
                        } else {
/* 396 */                   ol1OlloIO = ol1OlloIO2;
                            obj = objI00O0i0ii12;
                        }
/* 427 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj, iloI0lOlll1, 0);
/* 435 */               Integer numValueOf = Integer.valueOf(oIooi1iOiOol.I000II());
/* 439 */               boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(rewriter);
/* 445 */               Object objI00O0i0ii13 = iloI0lOlll1.I00O0i0ii();
/* 449 */               if (zI000OOo1O3 || objI00O0i0ii13 == obj2) {
/* 458 */                   objI00O0i0ii13 = new Ii1O001loIoO(rewriter, oI10i0Il, null, 17);
/* 461 */                   iloI0lOlll1.I00iio(objI00O0i0ii13);
                        }
/* 466 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii13, iloI0lOlll1, numValueOf);
/* 473 */               Integer num = (Integer) oI10i0Il.getValue();
/* 481 */               boolean zBooleanValue = ((Boolean) oI10i0Il4.getValue()).booleanValue();
/* 489 */               IloIlIoo iloIlIoo = new IloIlIoo(i4);
/* 492 */               iloIlIoo.I00iio = ii0110;
/* 494 */               iloIlIoo.I00l0I0l0lO1 = rewriter;
/* 496 */               iloIlIoo.I00l0OO0IO = listI000O01llI0;
/* 498 */               iloIlIoo.I00li1OI = oIooi1iOiOol;
/* 500 */               iloIlIoo.I00iiI = oI10i0Il3;
/* 502 */               iloIlIoo.I00iiO = oI10i0Il2;
/* 504 */               iloIlIoo.I00ilI0I1 = oI10i0Il5;
/* 506 */               iloIlIoo.I00ilO0 = oI10i0Il4;
/* 508 */               iloIlIoo.I00io1l = oI10i0Il;
/* 512 */               iloIlIoo.I00ioIO = ol1OlloIO;
/* 514 */               iloIlIoo.I00ll1 = o1OIi1I00000oIO;
/* 516 */               iloIlIoo.I00lli11 = oI10i0Il6;
/* 518 */               VarHandle.storeStoreFence();
/* 539 */               I000lI("Rewrite", num, zBooleanValue, illOOo00lI, ol1OlloIO, iiioOl1O.I00000oOI(-2080176775, iloIlIoo, iloI0lOlll1), iloI0lOlll1, 224262);
                    } else {
/* 543 */               i2 = 6;
/* 545 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 548 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 552 */           if (oOloioIlI001IO000 != null) {
/* 558 */               IloIOOlOOIl0 iloIOOlOOIl0 = new IloIOOlOOIl0(i2);
/* 563 */               iloIOOlOOIl0.I00iiI = context;
/* 567 */               iloIOOlOOIl0.I00iiO = illOOo00lI;
/* 569 */               VarHandle.storeStoreFence();
/* 572 */               oOloioIlI001IO000.I0000O = iloIOOlOOIl0;
                    }
                }

                public static final void I001i1lo1io(Context context, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 6 */             iloI0lOlll1.I00i0O(-114465016);
/* 18 */            int i2 = i | (iloI0lOlll1.I000OOo1O(context) ? 4 : 2);
/* 24 */            int i3 = 0;
/* 36 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 38 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 42 */                Object obj = IOl11li.I00000oIO;
/* 44 */                if (objI00O0i0ii == obj) {
/* 46 */                    objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 50 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 53 */                Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 55 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 59 */                if (objI00O0i0ii2 == obj) {
/* 62 */                    objI00O0i0ii2 = lOO00IiI0li.I00000oIO(null);
/* 66 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 69 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii2;
/* 71 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 75 */                if (objI00O0i0ii3 == obj) {
/* 79 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO("");
/* 83 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 86 */                OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii3;
/* 88 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 92 */                if (objI00O0i0ii4 == obj) {
/* 96 */                    objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 100 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 103 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii4;
/* 105 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 109 */               if (objI00O0i0ii5 == obj) {
/* 111 */                   objI00O0i0ii5 = BarcodeScanning.getClient();
/* 115 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 118 */               Object obj2 = (BarcodeScanner) objI00O0i0ii5;
/* 120 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj2);
/* 124 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii6;
/* 128 */               if (zI000OOo1O || objI00O0i0ii6 == obj) {
/* 136 */                   Iil1olo iil1olo = new Iil1olo(13);
/* 139 */                   iil1olo.I00iiI = obj2;
/* 141 */                   VarHandle.storeStoreFence();
/* 144 */                   iloI0lOlll1.I00iio(iil1olo);
                            obj3 = iil1olo;
                        }
/* 151 */               iIO0iiOiOl0l.I00000oOI(OoiIlOl1iI.I00000oIO, (Function1) obj3, iloI0lOlll1);
/* 156 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(i3);
/* 167 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(context);
/* 168 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii7;
/* 172 */               if (zI000OOo1O2 || objI00O0i0ii7 == obj) {
/* 179 */                   IloIiOoio iloIiOoio = new IloIiOoio(3);
/* 182 */                   iloIiOoio.I00iiI = ii0110;
/* 184 */                   iloIiOoio.I00iiO = context;
/* 186 */                   iloIiOoio.I00iio = oI10i0Il;
/* 188 */                   iloIiOoio.I00ilI0I1 = oI10i0Il2;
/* 190 */                   VarHandle.storeStoreFence();
/* 193 */                   iloI0lOlll1.I00iio(iloIiOoio);
                            obj4 = iloIiOoio;
                        }
/* 198 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj4, iloI0lOlll1, 0);
/* 206 */               Bitmap bitmap = (Bitmap) oI10i0Il.getValue();
/* 212 */               String str = (String) oI10i0Il2.getValue();
/* 220 */               boolean zBooleanValue = ((Boolean) oI10i0Il3.getValue()).booleanValue();
/* 224 */               boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(o1OIi1I00000oIO);
/* 228 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii8;
/* 232 */               if (zI000OOo1O3 || objI00O0i0ii8 == obj) {
/* 240 */                   I0O1I11 i0o1i11 = new I0O1I11(11);
/* 243 */                   i0o1i11.I00iiI = o1OIi1I00000oIO;
/* 245 */                   VarHandle.storeStoreFence();
/* 248 */                   iloI0lOlll1.I00iio(i0o1i11);
                            obj5 = i0o1i11;
                        }
/* 251 */               IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj5;
/* 261 */               boolean zI000OOo1O4 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(obj2);
/* 262 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
/* 266 */               int i4 = 9;
                        Object obj6 = objI00O0i0ii9;
/* 268 */               if (zI000OOo1O4 || objI00O0i0ii9 == obj) {
/* 274 */                   I0IoOl i0IoOl = new I0IoOl(i4);
/* 277 */                   i0IoOl.I00iio = ii0110;
/* 279 */                   i0IoOl.I00iiI = oI10i0Il;
/* 281 */                   i0IoOl.I00ilI0I1 = oI10i0Il3;
/* 283 */                   i0IoOl.I00ilO0 = oI10i0Il2;
/* 285 */                   i0IoOl.I00iiO = obj2;
/* 287 */                   VarHandle.storeStoreFence();
/* 290 */                   iloI0lOlll1.I00iio(i0IoOl);
                            obj6 = i0IoOl;
                        }
/* 293 */               IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj6;
/* 295 */               Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                        Object obj7 = objI00O0i0ii10;
/* 299 */               if (objI00O0i0ii10 == obj) {
/* 303 */                   IloOi11lo iloOi11lo = new IloOi11lo(9);
/* 306 */                   iloOi11lo.I00iiI = oI10i0Il2;
/* 308 */                   VarHandle.storeStoreFence();
/* 311 */                   iloI0lOlll1.I00iio(iloOi11lo);
                            obj7 = iloOi11lo;
                        }
/* 314 */               IllOOo00lI illOOo00lI4 = (IllOOo00lI) obj7;
/* 316 */               boolean zI000OOo1O5 = iloI0lOlll1.I000OOo1O(obj2);
/* 320 */               Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
                        Object obj8 = objI00O0i0ii11;
/* 324 */               if (zI000OOo1O5 || objI00O0i0ii11 == obj) {
/* 332 */                   IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(12);
/* 335 */                   iiioilIl1Il.I00iiI = obj2;
/* 337 */                   iiioilIl1Il.I00iiO = oI10i0Il2;
/* 339 */                   VarHandle.storeStoreFence();
/* 342 */                   iloI0lOlll1.I00iio(iiioilIl1Il);
                            obj8 = iiioilIl1Il;
                        }
/* 363 */               I00II0oii1o("Scan Barcode", bitmap, str, zBooleanValue, illOOo00lI, illOOo00lI2, illOOo00lI3, illOOo00lI4, (Function1) obj8, null, iloI0lOlll1, 12607494, Barcode.FORMAT_UPC_A);
                    } else {
/* 367 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 370 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 374 */           if (oOloioIlI001IO000 != null) {
/* 379 */               IloIOOlOOIl0 iloIOOlOOIl0 = new IloIOOlOOIl0(7);
/* 382 */               iloIOOlOOIl0.I00iiI = context;
/* 384 */               iloIOOlOOIl0.I00iiO = illOOo00lI;
/* 386 */               VarHandle.storeStoreFence();
/* 389 */               oOloioIlI001IO000.I0000O = iloIOOlOOIl0;
                    }
                }

                public static final void I001iOo1i0O(Context context, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 5 */             iloI0lOlll1.I00i0O(-1047159213);
/* 12 */            int i2 = 2;
/* 18 */            int i3 = i | (iloI0lOlll1.I000OOo1O(context) ? 4 : 2);
/* 24 */            int i4 = 0;
/* 36 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 38 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 42 */                Object obj = IOl11li.I00000oIO;
/* 44 */                if (objI00O0i0ii == obj) {
/* 46 */                    objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 50 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 53 */                Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 55 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 59 */                if (objI00O0i0ii2 == obj) {
/* 62 */                    objI00O0i0ii2 = lOO00IiI0li.I00000oIO(null);
/* 66 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 69 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii2;
/* 71 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 75 */                if (objI00O0i0ii3 == obj) {
/* 79 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO("");
/* 83 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 86 */                OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii3;
/* 88 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 92 */                if (objI00O0i0ii4 == obj) {
/* 96 */                    objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 100 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 103 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii4;
/* 105 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 109 */               if (objI00O0i0ii5 == obj) {
/* 113 */                   objI00O0i0ii5 = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
/* 117 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 120 */               Object obj2 = (TextRecognizer) objI00O0i0ii5;
/* 122 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj2);
/* 126 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii6;
/* 130 */               if (zI000OOo1O || objI00O0i0ii6 == obj) {
/* 138 */                   Iil1olo iil1olo = new Iil1olo(12);
/* 141 */                   iil1olo.I00iiI = obj2;
/* 143 */                   VarHandle.storeStoreFence();
/* 146 */                   iloI0lOlll1.I00iio(iil1olo);
                            obj3 = iil1olo;
                        }
/* 153 */               iIO0iiOiOl0l.I00000oOI(OoiIlOl1iI.I00000oIO, (Function1) obj3, iloI0lOlll1);
/* 158 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(i4);
/* 169 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(context);
/* 170 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii7;
/* 174 */               if (zI000OOo1O2 || objI00O0i0ii7 == obj) {
/* 180 */                   IloIiOoio iloIiOoio = new IloIiOoio(i2);
/* 183 */                   iloIiOoio.I00iiI = ii0110;
/* 185 */                   iloIiOoio.I00iiO = context;
/* 187 */                   iloIiOoio.I00iio = oI10i0Il;
/* 189 */                   iloIiOoio.I00ilI0I1 = oI10i0Il2;
/* 191 */                   VarHandle.storeStoreFence();
/* 194 */                   iloI0lOlll1.I00iio(iloIiOoio);
                            obj4 = iloIiOoio;
                        }
/* 199 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj4, iloI0lOlll1, 0);
/* 207 */               Bitmap bitmap = (Bitmap) oI10i0Il.getValue();
/* 213 */               String str = (String) oI10i0Il2.getValue();
/* 221 */               boolean zBooleanValue = ((Boolean) oI10i0Il3.getValue()).booleanValue();
/* 225 */               boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(o1OIi1I00000oIO);
/* 229 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii8;
/* 233 */               if (zI000OOo1O3 || objI00O0i0ii8 == obj) {
/* 241 */                   I0O1I11 i0o1i11 = new I0O1I11(10);
/* 244 */                   i0o1i11.I00iiI = o1OIi1I00000oIO;
/* 246 */                   VarHandle.storeStoreFence();
/* 249 */                   iloI0lOlll1.I00iio(i0o1i11);
                            obj5 = i0o1i11;
                        }
/* 252 */               IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj5;
/* 262 */               boolean zI000OOo1O4 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(obj2);
/* 263 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
                        Object obj6 = objI00O0i0ii9;
/* 267 */               if (zI000OOo1O4 || objI00O0i0ii9 == obj) {
/* 275 */                   I0IoOl i0IoOl = new I0IoOl(8);
/* 278 */                   i0IoOl.I00iio = ii0110;
/* 280 */                   i0IoOl.I00iiI = oI10i0Il;
/* 282 */                   i0IoOl.I00ilI0I1 = oI10i0Il3;
/* 284 */                   i0IoOl.I00ilO0 = oI10i0Il2;
/* 286 */                   i0IoOl.I00iiO = obj2;
/* 288 */                   VarHandle.storeStoreFence();
/* 291 */                   iloI0lOlll1.I00iio(i0IoOl);
                            obj6 = i0IoOl;
                        }
/* 295 */               IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj6;
/* 297 */               Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                        Object obj7 = objI00O0i0ii10;
/* 301 */               if (objI00O0i0ii10 == obj) {
/* 306 */                   IloOi11lo iloOi11lo = new IloOi11lo(6);
/* 309 */                   iloOi11lo.I00iiI = oI10i0Il2;
/* 311 */                   VarHandle.storeStoreFence();
/* 314 */                   iloI0lOlll1.I00iio(iloOi11lo);
                            obj7 = iloOi11lo;
                        }
/* 317 */               IllOOo00lI illOOo00lI4 = (IllOOo00lI) obj7;
/* 319 */               boolean zI000OOo1O5 = iloI0lOlll1.I000OOo1O(obj2);
/* 323 */               Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
                        Object obj8 = objI00O0i0ii11;
/* 327 */               if (zI000OOo1O5 || objI00O0i0ii11 == obj) {
/* 335 */                   IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(11);
/* 338 */                   iiioilIl1Il.I00iiI = obj2;
/* 340 */                   iiioilIl1Il.I00iiO = oI10i0Il2;
/* 342 */                   VarHandle.storeStoreFence();
/* 345 */                   iloI0lOlll1.I00iio(iiioilIl1Il);
                            obj8 = iiioilIl1Il;
                        }
/* 365 */               I00II0oii1o("Scan Text", bitmap, str, zBooleanValue, illOOo00lI, illOOo00lI2, illOOo00lI3, illOOo00lI4, (Function1) obj8, null, iloI0lOlll1, 12607494, Barcode.FORMAT_UPC_A);
                    } else {
/* 369 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 372 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 376 */           if (oOloioIlI001IO000 != null) {
/* 381 */               IloIOOlOOIl0 iloIOOlOOIl0 = new IloIOOlOOIl0(5);
/* 384 */               iloIOOlOOIl0.I00iiI = context;
/* 386 */               iloIOOlOOIl0.I00iiO = illOOo00lI;
/* 388 */               VarHandle.storeStoreFence();
/* 391 */               oOloioIlI001IO000.I0000O = iloIOOlOOIl0;
                    }
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                    */
                public static final void I001l0I00(p000.IllOOo00lI r61, p000.IloI0lOlll1 r62, int r63) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*  JADX ERROR: Type inference failed
                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /*
                        Method dump skipped, instructions count: 1790
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.Iloo0ilo.I001l0I00(IllOOo00lI, IloI0lOlll1, int):void");
                }

                public static final void I001lIiIIo1O(Ii0110 ii0110, SpeechRecognizer speechRecognizer, OI10i0Il oI10i0Il) {
/* 10 */            iOi1II01i0.I0000O(ii0110, null, null, new I0II0OiI(speechRecognizer, (IOoil1iiIilo) null, 20), 3);
/* 15 */            oI10i0Il.setValue(Boolean.FALSE);
                }

                public static final void I001lllioOl(Context context, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 8 */             iloI0lOlll1.I00i0O(443473542);
/* 20 */            int i2 = i | (iloI0lOlll1.I000OOo1O(context) ? 4 : 2);
/* 26 */            int i3 = 0;
/* 27 */            int i4 = 1;
/* 38 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 40 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 44 */                Object obj = IOl11li.I00000oIO;
/* 46 */                if (objI00O0i0ii == obj) {
/* 48 */                    objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 52 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 55 */                Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 57 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 61 */                if (objI00O0i0ii2 == obj) {
/* 65 */                    objI00O0i0ii2 = new Ol1OlloIO();
/* 68 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 71 */                Ol1OlloIO ol1OlloIO = (Ol1OlloIO) objI00O0i0ii2;
/* 73 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 78 */                if (objI00O0i0ii3 == obj) {
/* 80 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO(null);
/* 84 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 87 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii3;
/* 89 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 95 */                if (objI00O0i0ii4 == obj) {
/* 97 */                    objI00O0i0ii4 = lOO00IiI0li.I00000oIO("");
/* 101 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 104 */               OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii4;
/* 106 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 110 */               if (objI00O0i0ii5 == obj) {
/* 112 */                   objI00O0i0ii5 = lOO00IiI0li.I00000oIO("");
/* 116 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 119 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii5;
/* 121 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 125 */               if (objI00O0i0ii6 == obj) {
/* 129 */                   objI00O0i0ii6 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 133 */                   iloI0lOlll1.I00iio(objI00O0i0ii6);
                        }
/* 136 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii6;
/* 138 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 142 */               if (objI00O0i0ii7 == obj) {
/* 144 */                   objI00O0i0ii7 = lOO00IiI0li.I00000oIO("");
/* 148 */                   iloI0lOlll1.I00iio(objI00O0i0ii7);
                        }
/* 151 */               OI10i0Il oI10i0Il5 = (OI10i0Il) objI00O0i0ii7;
/* 153 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
/* 157 */               if (objI00O0i0ii8 == obj) {
/* 159 */                   objI00O0i0ii8 = lOO00IiI0li.I00000oIO("");
/* 163 */                   iloI0lOlll1.I00iio(objI00O0i0ii8);
                        }
/* 166 */               OI10i0Il oI10i0Il6 = (OI10i0Il) objI00O0i0ii8;
/* 168 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
/* 172 */               if (objI00O0i0ii9 == obj) {
/* 195 */                   objI00O0i0ii9 = Summarization.getClient(SummarizerOptions.builder(context).setInputType(1).setOutputType(3).setLanguage(0).build());
/* 199 */                   iloI0lOlll1.I00iio(objI00O0i0ii9);
                        }
/* 202 */               Summarizer summarizer = (Summarizer) objI00O0i0ii9;
/* 204 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(summarizer);
/* 208 */               Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii10;
/* 212 */               if (zI000OOo1O || objI00O0i0ii10 == obj) {
/* 218 */                   Iloi1Oi0oIoi iloi1Oi0oIoi = new Iloi1Oi0oIoi(i3);
/* 221 */                   iloi1Oi0oIoi.I00iiI = summarizer;
/* 223 */                   VarHandle.storeStoreFence();
/* 226 */                   iloI0lOlll1.I00iio(iloi1Oi0oIoi);
                            obj2 = iloi1Oi0oIoi;
                        }
/* 231 */               OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 233 */               iIO0iiOiOl0l.I00000oOI(ooiIlOl1iI, (Function1) obj2, iloI0lOlll1);
/* 238 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(i4);
/* 249 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(context);
/* 251 */               Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii11;
/* 255 */               if (zI000OOo1O2 || objI00O0i0ii11 == obj) {
/* 262 */                   I1o0IiiI0il i1o0IiiI0il = new I1o0IiiI0il(2);
/* 265 */                   i1o0IiiI0il.I00iiI = ii0110;
/* 267 */                   i1o0IiiI0il.I00iiO = context;
/* 269 */                   i1o0IiiI0il.I00iio = oI10i0Il6;
/* 271 */                   i1o0IiiI0il.I00ilI0I1 = oI10i0Il2;
/* 273 */                   i1o0IiiI0il.I00ilO0 = oI10i0Il5;
/* 275 */                   VarHandle.storeStoreFence();
/* 278 */                   iloI0lOlll1.I00iio(i1o0IiiI0il);
                            obj3 = i1o0IiiI0il;
                        }
/* 284 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj3, iloI0lOlll1, 0);
/* 288 */               boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(summarizer);
/* 292 */               Object objI00O0i0ii12 = iloI0lOlll1.I00O0i0ii();
/* 296 */               if (zI000OOo1O3 || objI00O0i0ii12 == obj) {
/* 305 */                   objI00O0i0ii12 = new Ii1O001loIoO(summarizer, oI10i0Il, null, 19);
/* 308 */                   iloI0lOlll1.I00iio(objI00O0i0ii12);
                        }
/* 313 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii12, iloI0lOlll1, ooiIlOl1iI);
/* 320 */               Integer num = (Integer) oI10i0Il.getValue();
/* 328 */               boolean zBooleanValue = ((Boolean) oI10i0Il4.getValue()).booleanValue();
/* 335 */               IloO011Io1lo iloO011Io1lo = new IloO011Io1lo(1);
/* 338 */               iloO011Io1lo.I00iiI = ii0110;
/* 340 */               iloO011Io1lo.I00ioIO = summarizer;
/* 342 */               iloO011Io1lo.I00iiO = oI10i0Il2;
/* 344 */               iloO011Io1lo.I00iio = oI10i0Il5;
/* 346 */               iloO011Io1lo.I00ilI0I1 = oI10i0Il3;
/* 348 */               iloO011Io1lo.I00ilO0 = oI10i0Il4;
/* 350 */               iloO011Io1lo.I00l0I0l0lO1 = oI10i0Il;
/* 352 */               iloO011Io1lo.I00io1l = ol1OlloIO;
/* 354 */               iloO011Io1lo.I00l0OO0IO = o1OIi1I00000oIO;
/* 356 */               iloO011Io1lo.I00li1OI = oI10i0Il6;
/* 358 */               VarHandle.storeStoreFence();
/* 378 */               I000lI("Summarize", num, zBooleanValue, illOOo00lI, ol1OlloIO, iiioOl1O.I00000oOI(-1871054162, iloO011Io1lo, iloI0lOlll1), iloI0lOlll1, 224262);
                    } else {
/* 382 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 385 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 389 */           if (oOloioIlI001IO000 != null) {
/* 394 */               IloIOOlOOIl0 iloIOOlOOIl0 = new IloIOOlOOIl0(2);
/* 397 */               iloIOOlOOIl0.I00iiI = context;
/* 401 */               iloIOOlOOIl0.I00iiO = illOOo00lI;
/* 403 */               VarHandle.storeStoreFence();
/* 406 */               oOloioIlI001IO000.I0000O = iloIOOlOOIl0;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0253  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x025d  */
                /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I001lloI(String str, Function1 function1, String str2, String str3, boolean z, boolean z2, IllOOo00lI illOOo00lI, boolean z3, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    boolean z4;
                    int i3;
                    boolean z5;
                    OOloioIl oOloioIlI001IO000;
                    O1ooiI111i o1ooiI111iI0001Ioi1lo;
                    boolean z6;
                    O1ooIo101ll o1ooIo101ll;
                    boolean z7;
                    float f;
                    O1ooIo101ll o1ooIo101ll2;
/* 9 */             boolean z8 = z2;
/* 11 */            IllOOo00lI illOOo00lI2 = illOOo00lI;
/* 15 */            IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 22 */            iloI0lOlll12.I00i0O(-203951770);
/* 83 */            int i4 = i | (iloI0lOlll12.I000II(str) ? 4 : 2) | (iloI0lOlll12.I000II(str3) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll12.I000O01llI0(z) ? 16384 : 8192) | (iloI0lOlll12.I000O01llI0(z8) ? 131072 : 65536) | (iloI0lOlll12.I000OOo1O(illOOo00lI2) ? 1048576 : 524288);
/* 84 */            int i5 = i2 & Barcode.FORMAT_ITF;
/* 88 */            if (i5 == 0) {
/* 98 */                if ((i & 12582912) == 0) {
/* 100 */                   z4 = z3;
/* 113 */                   i4 |= iloI0lOlll12.I000O01llI0(z4) ? 8388608 : 4194304;
                        }
/* 93 */                i3 = i4;
/* 136 */               if (iloI0lOlll12.I00OIl(i3 & 1, (i3 & 38347923) == 38347922)) {
/* 596 */                   z5 = z;
/* 597 */                   iloI0lOlll12.I00OilO00Il();
                        } else {
/* 143 */                   boolean z9 = i5 != 0 ? false : z4;
/* 151 */                   IOO0i0o1O0l iOO0i0o1O0l = (IOO0i0o1O0l) iloI0lOlll12.I000iOII(IOlO0o100i1i.I0000oI00);
/* 153 */                   O1ooIo101ll o1ooIo101ll3 = O1ooIo101ll.I00000oIO;
/* 155 */                   if (z9) {
/* 160 */                       iloI0lOlll12.I00i01iIIliI(1570856398);
/* 163 */                       iloI0lOlll12.I0010I0i(false);
/* 166 */                       o1ooiI111iI0001Ioi1lo = o1ooIo101ll3;
                            } else {
/* 171 */                       iloI0lOlll12.I00i01iIIliI(1570858804);
/* 186 */                       o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(iO0l10O.I0000Il00O(Ol0iOOO0.I0000Il00O, iO0l10O.I00000oOI(iloI0lOlll12), true), 12.0f);
/* 190 */                       iloI0lOlll12.I0010I0i(false);
                            }
/* 202 */                   IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(10.0f), i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll12, 6);
/* 210 */                   int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 214 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 218 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI0001Ioi1lo);
/* 224 */                   IOl0oi0lOl1.I000lI.getClass();
/* 227 */                   iloI0lOlll12.I00i0oil();
/* 232 */                   if (iloI0lOlll12.I00O10llo) {
/* 236 */                       iloI0lOlll12.I000l1(O0iiOioolIi.I01101IOlO);
                            } else {
/* 240 */                       iloI0lOlll12.I00io1l();
                            }
/* 245 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll12, iOOlo1O01OI00000oIO);
/* 250 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll12, oO0lO0l0I000lI);
/* 259 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll12, Integer.valueOf(iHashCode));
/* 262 */                   li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 267 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 270 */                   if (illiIl1l11O == null) {
/* 275 */                       iloI0lOlll12.I00i01iIIliI(1958092605);
/* 278 */                       z6 = false;
                            } else {
/* 283 */                       z6 = false;
/* 287 */                       iloI0lOlll12.I00i01iIIliI(-1599403708);
/* 294 */                       illiIl1l11O.invoke(iloI0lOlll12, 6);
                            }
/* 279 */                   iloI0lOlll12.I0010I0i(z6);
/* 300 */                   O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll3, 1.0f);
/* 307 */                   I0Iooi0i1l0l i0Iooi0i1l0l = new I0Iooi0i1l0l(7);
/* 310 */                   i0Iooi0i1l0l.I00iiI = str2;
/* 312 */                   VarHandle.storeStoreFence();
/* 381 */                   l1liIOil0i1o.I00000oOI(str, function1, o1ooiI111iI0000oI00, false, false, null, null, iiioOl1O.I00000oOI(700638421, i0Iooi0i1l0l, iloI0lOlll12), null, null, null, false, null, null, null, false, 10, 4, null, null, iloI0lOlll1, (i3 & 14) | 12583344, 905969664, 7602040);
/* 384 */                   z5 = z;
/* 386 */                   IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 388 */                   if (z5) {
/* 393 */                       iloI0lOlll13.I00i01iIIliI(-1599394121);
/* 396 */                       o1ooIo101ll = o1ooIo101ll3;
/* 398 */                       f = 1.0f;
/* 411 */                       OOO0iOio0oil.I0000O(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 0L, 0L, 0, 0.0f, iloI0lOlll13, 6);
/* 414 */                       z7 = false;
                            } else {
/* 419 */                       o1ooIo101ll = o1ooIo101ll3;
/* 421 */                       z7 = false;
/* 422 */                       f = 1.0f;
/* 427 */                       iloI0lOlll13.I00i01iIIliI(1958446502);
                            }
/* 415 */                   iloI0lOlll13.I0010I0i(z7);
/* 435 */                   if (str3.length() > 0) {
/* 440 */                       iloI0lOlll13.I00i01iIIliI(1958529365);
/* 453 */                       long j = ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00IioO0OiOi;
/* 457 */                       OiI111I oiI111II00000oOI = OiI11O1i1.I00000oOI(8.0f);
/* 461 */                       boolean z10 = z7;
/* 463 */                       O1ooiI111i o1ooiI111iI0000oI002 = Ol0iOOO0.I0000oI00(o1ooIo101ll, f);
/* 470 */                       IloIll1ol0oI iloIll1ol0oI = new IloIll1ol0oI(1);
/* 475 */                       iloIll1ol0oI.I00iiI = str3;
/* 479 */                       iloIll1ol0oI.I00iiO = iOO0i0o1O0l;
/* 481 */                       VarHandle.storeStoreFence();
/* 508 */                       o1ooIo101ll2 = o1ooIo101ll;
/* 512 */                       OlioioOl0O.I00000oIO(o1ooiI111iI0000oI002, oiI111II00000oOI, j, 0L, 0.0f, 0.0f, null, iiioOl1O.I00000oOI(374407945, iloIll1ol0oI, iloI0lOlll13), iloI0lOlll1, 12582918, 120);
/* 515 */                       iloI0lOlll13 = iloI0lOlll1;
/* 516 */                       iloI0lOlll13.I0010I0i(z10);
                            } else {
/* 523 */                       o1ooIo101ll2 = o1ooIo101ll;
/* 527 */                       iloI0lOlll13.I00i01iIIliI(1959631942);
/* 530 */                       iloI0lOlll13.I0010I0i(z7);
                            }
/* 534 */                   O1ooiI111i o1ooiI111iI0000oI003 = Ol0iOOO0.I0000oI00(o1ooIo101ll2, 1.0f);
/* 541 */                   I1IO0lO1iI i1IO0lO1iI = new I1IO0lO1iI(4);
/* 544 */                   i1IO0lO1iI.I00iiI = z5;
/* 546 */                   VarHandle.storeStoreFence();
/* 583 */                   iOiO0o0oi.I00000oIO(illOOo00lI, o1ooiI111iI0000oI003, z2, null, null, null, null, null, iiioOl1O.I00000oOI(-1331764916, i1IO0lO1iI, iloI0lOlll13), iloI0lOlll1, ((i3 >> 18) & 14) | 805306416 | ((i3 >> 9) & 896), 504);
/* 586 */                   illOOo00lI2 = illOOo00lI;
/* 587 */                   z8 = z2;
/* 588 */                   iloI0lOlll12 = iloI0lOlll1;
/* 590 */                   iloI0lOlll12.I0010I0i(true);
/* 593 */                   z4 = z9;
                        }
/* 600 */               oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 604 */               if (oOloioIlI001IO000 == null) {
/* 608 */                   IloIolI iloIolI = new IloIolI();
/* 613 */                   iloIolI.I00iOIl = str;
/* 617 */                   iloIolI.I00iiI = function1;
/* 621 */                   iloIolI.I00iiO = str2;
/* 625 */                   iloIolI.I00iio = str3;
/* 627 */                   iloIolI.I00ilI0I1 = z5;
/* 629 */                   iloIolI.I00ilO0 = z8;
/* 631 */                   iloIolI.I00io1l = illOOo00lI2;
/* 633 */                   iloIolI.I00ioIO = z4;
/* 637 */                   iloIolI.I00l0I0l0lO1 = illiIl1l11O;
/* 641 */                   iloIolI.I00l0OO0IO = i;
/* 645 */                   iloIolI.I00li1OI = i2;
/* 647 */                   VarHandle.storeStoreFence();
/* 650 */                   oOloioIlI001IO000.I0000O = iloIolI;
/* 1925 */                  return;
                        }
/* 1925 */              return;
                    }
/* 90 */            i4 |= 12582912;
/* 91 */            z4 = z3;
/* 93 */            i3 = i4;
/* 136 */           if (iloI0lOlll12.I00OIl(i3 & 1, (i3 & 38347923) == 38347922)) {
                    }
/* 600 */           oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 604 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00II0Ol1O0l(OI1OIlllll0 oI1OIlllll0, boolean z, boolean z2, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 16 */            iloI0lOlll1.I00i0O(2001035399);
/* 22 */            if ((i & 6) == 0) {
/* 42 */                i2 = ((i & 8) == 0 ? iloI0lOlll1.I000II(oI1OIlllll0) : iloI0lOlll1.I000OOo1O(oI1OIlllll0) ? 4 : 2) | i;
                    } else {
/* 44 */                i2 = i;
                    }
/* 49 */            if ((i & 48) == 0) {
/* 61 */                i2 |= iloI0lOlll1.I000O01llI0(z) ? 32 : 16;
                    }
/* 64 */            if ((i & 384) == 0) {
/* 77 */                i2 |= iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 80 */            if ((i & 3072) == 0) {
/* 93 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 109 */           if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 1171) != 1170)) {
/* 111 */               OOiIOoiOO oOiIOoiOO = O1OoilIO.I00000oOI;
/* 121 */               long j = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I00000oIO.I00000oIO;
/* 131 */               long j2 = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I00000oIO.I000OiO;
/* 141 */               long j3 = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I00000oIO.I00000oIO;
/* 196 */               boolean zI0001Ioi1lo = ((i2 & 14) == 4 || ((i2 & 8) != 0 && iloI0lOlll1.I000OOo1O(oI1OIlllll0))) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | iloI0lOlll1.I0001Ioi1lo(j) | iloI0lOlll1.I0001Ioi1lo(j2) | iloI0lOlll1.I0001Ioi1lo(j3);
/* 197 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 201 */               if (!zI0001Ioi1lo) {
                            Object obj = objI00O0i0ii;
/* 205 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 209 */                       IloOI1OiI1l iloOI1OiI1l = new IloOI1OiI1l();
/* 212 */                       iloOI1OiI1l.I00iOIl = oI1OIlllll0;
/* 214 */                       iloOI1OiI1l.I00iiI = z;
/* 216 */                       iloOI1OiI1l.I00iiO = j;
/* 218 */                       iloOI1OiI1l.I00iio = z2;
/* 220 */                       iloOI1OiI1l.I00ilI0I1 = j2;
/* 222 */                       iloOI1OiI1l.I00ilO0 = j3;
/* 224 */                       VarHandle.storeStoreFence();
/* 227 */                       iloI0lOlll1.I00iio(iloOI1OiI1l);
                                obj = iloOI1OiI1l;
                            }
/* 236 */                   iOl0ilO1.I00000oIO(o1ooiI111i, (Function1) obj, iloI0lOlll1, (i2 >> 9) & 14);
                        }
                    } else {
/* 240 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 243 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 247 */           if (oOloioIlI001IO000 != null) {
/* 252 */               IloOIOoo0Il1 iloOIOoo0Il1 = new IloOIOoo0Il1(0);
/* 255 */               iloOIOoo0Il1.I00ilI0I1 = oI1OIlllll0;
/* 257 */               iloOIOoo0Il1.I00iiI = z;
/* 259 */               iloOIOoo0Il1.I00iiO = z2;
/* 261 */               iloOIOoo0Il1.I00ilO0 = o1ooiI111i;
/* 263 */               iloOIOoo0Il1.I00iio = i;
/* 265 */               VarHandle.storeStoreFence();
/* 268 */               oOloioIlI001IO000.I0000O = iloOIOoo0Il1;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v9, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r47v0, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r6v10 */
                /* JADX WARN: Type inference failed for: r6v11, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r6v12 */
                /* JADX WARN: Type inference failed for: r8v1 */
                /* JADX WARN: Type inference failed for: r8v2, types: [int] */
                /* JADX WARN: Type inference failed for: r8v8 */
                public static final void I00II0oii1o(String str, Bitmap bitmap, String str2, boolean z, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, IllOOo00lI illOOo00lI3, IllOOo00lI illOOo00lI4, Function1 function1, OI1OIlllll0 oI1OIlllll0, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    int i4;
                    int i5;
                    IllOOo00lI illOOo00lI5;
                    Function1 function12;
                    String str3;
                    ?? r8;
                    OI1OIlllll0 oI1OIlllll02;
                    IloI0lOlll1 iloI0lOlll12;
                    OI1OIlllll0 oI1OIlllll03;
                    boolean z2;
                    ?? r6;
                    IloI0lOlll1 iloI0lOlll13;
                    OI1OIlllll0 oI1OIlllll04;
                    OI10i0Il oI10i0Il;
                    Object obj;
                    OI10i0Il oI10i0Il2;
                    Object obj2;
                    boolean z3;
                    long jI0000Il00O;
                    IllOOo00lI illOOo00lI6;
                    boolean z4;
/* 3 */             Bitmap bitmap2 = bitmap;
/* 11 */            IllOOo00lI illOOo00lI7 = illOOo00lI2;
/* 13 */            IllOOo00lI illOOo00lI8 = illOOo00lI3;
/* 30 */            iloI0lOlll1.I00i0O(266570598);
/* 35 */            if ((i & 6) == 0) {
/* 46 */                i3 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i;
                    } else {
/* 48 */                i3 = i;
                    }
/* 51 */            if ((i & 48) == 0) {
/* 64 */                i3 |= iloI0lOlll1.I000OOo1O(bitmap2) ? 32 : 16;
                    }
/* 67 */            if ((i & 384) == 0) {
/* 80 */                i3 |= iloI0lOlll1.I000II(str2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 83 */            if ((i & 3072) == 0) {
/* 96 */                i3 |= iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 99 */            if ((i & 24576) == 0) {
/* 112 */               i3 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 16384 : 8192;
                    }
/* 116 */           if ((196608 & i) == 0) {
/* 129 */               i3 |= iloI0lOlll1.I000OOo1O(illOOo00lI7) ? 131072 : 65536;
                    }
/* 133 */           if ((1572864 & i) == 0) {
/* 146 */               i3 |= iloI0lOlll1.I000OOo1O(illOOo00lI8) ? 1048576 : 524288;
                    }
/* 150 */           if ((12582912 & i) == 0) {
/* 163 */               i3 |= iloI0lOlll1.I000OOo1O(illOOo00lI4) ? 8388608 : 4194304;
                    }
/* 167 */           if ((100663296 & i) == 0) {
/* 180 */               i3 |= iloI0lOlll1.I000OOo1O(function1) ? 67108864 : 33554432;
                    }
/* 181 */           int i6 = i2 & Barcode.FORMAT_UPC_A;
/* 183 */           int i7 = 805306368;
/* 185 */           if (i6 != 0) {
/* 187 */               i3 |= i7;
                    } else if ((805306368 & i) == 0) {
/* 213 */               i7 = (1073741824 & i) == 0 ? iloI0lOlll1.I000II(oI1OIlllll0) : iloI0lOlll1.I000OOo1O(oI1OIlllll0) ? 536870912 : 268435456;
/* 187 */               i3 |= i7;
                    }
/* 188 */           int i8 = i3;
/* 235 */           if (iloI0lOlll1.I00OIl(i8 & 1, (i8 & 306783379) != 306783378)) {
/* 241 */               OI1OIlllll0 oI1OIlllll05 = i6 != 0 ? null : oI1OIlllll0;
/* 249 */               Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 257 */               IOO0i0o1O0l iOO0i0o1O0l = (IOO0i0o1O0l) iloI0lOlll1.I000iOII(IOlO0o100i1i.I0000oI00);
/* 259 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 263 */               Object obj3 = IOl11li.I00000oIO;
/* 265 */               if (objI00O0i0ii == obj3) {
/* 269 */                   objI00O0i0ii = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 273 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 276 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii;
/* 278 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 282 */               if (objI00O0i0ii2 == obj3) {
/* 286 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 290 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 293 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii2;
/* 295 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 299 */               if (objI00O0i0ii3 == obj3) {
/* 303 */                   objI00O0i0ii3 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 307 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 310 */               OI10i0Il oI10i0Il5 = (OI10i0Il) objI00O0i0ii3;
/* 320 */               long jLongValue = ((Number) OI1OO1oo.I00000oOI.getValue()).longValue();
/* 324 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 328 */               if (objI00O0i0ii4 == obj3) {
/* 345 */                   objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.valueOf(iOI10i0I11.I00000oIO(context, "android.permission.CAMERA") == 0));
/* 349 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 352 */               OI10i0Il oI10i0Il6 = (OI10i0Il) objI00O0i0ii4;
/* 356 */               OI1OIlllll0 oI1OIlllll06 = oI1OIlllll05;
/* 359 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(5);
/* 362 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 366 */               int i9 = 6;
                        Object obj4 = objI00O0i0ii5;
/* 367 */               if (objI00O0i0ii5 == obj3) {
/* 371 */                   I0IoiIiOoi i0IoiIiOoi = new I0IoiIiOoi(i9);
/* 374 */                   i0IoiIiOoi.I00iiI = oI10i0Il6;
/* 376 */                   i0IoiIiOoi.I00iiO = oI10i0Il3;
/* 378 */                   VarHandle.storeStoreFence();
/* 381 */                   iloI0lOlll1.I00iio(i0IoiIiOoi);
                            obj4 = i0IoiIiOoi;
                        }
/* 390 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj4, iloI0lOlll1, 48);
/* 394 */               IlIl1Io0lii1 ilIl1Io0lii1 = Ol0iOOO0.I0000Il00O;
/* 398 */               II0IlloOiO0i iI0IlloOiO0i = i1O01oOIoI0I.I00o0iI0io1;
/* 405 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, iI0IlloOiO0i, iloI0lOlll1, 0);
/* 412 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 416 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 422 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, ilIl1Io0lii1);
/* 428 */               IOl0oi0lOl1.I000lI.getClass();
/* 431 */               iloI0lOlll1.I00i0oil();
/* 436 */               boolean z5 = iloI0lOlll1.I00O10llo;
/* 440 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 442 */               if (z5) {
/* 444 */                   iloI0lOlll1.I000l1(iloi111);
                        } else {
/* 448 */                   iloI0lOlll1.I00io1l();
                        }
/* 451 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 453 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, iOOlo1O01OI00000oIO);
/* 456 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 458 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI);
/* 461 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 467 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 469 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, numValueOf);
/* 472 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 475 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 477 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 480 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 488 */               O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 497 */               O1i0oIO o1i0oIO = new O1i0oIO(3);
/* 500 */               o1i0oIO.I00iiI = illOOo00lI;
/* 502 */               o1i0oIO.I00iiO = str;
/* 504 */               o1i0oIO.I00iio = function1;
/* 506 */               o1i0oIO.I00io1l = o1OIi1I00000oIO;
/* 508 */               o1i0oIO.I00ilI0I1 = oI10i0Il3;
/* 510 */               o1i0oIO.I00ilO0 = oI10i0Il6;
/* 512 */               VarHandle.storeStoreFence();
/* 550 */               OlioioOl0O.I00000oIO(o1ooiI111iI0000oI00, null, 0L, 0L, 2.0f, 0.0f, null, iiioOl1O.I00000oOI(-334857993, o1i0oIO, iloI0lOlll1), iloI0lOlll1, 12607494, 110);
/* 567 */               if (((Boolean) oI10i0Il3.getValue()).booleanValue() && ((Boolean) oI10i0Il6.getValue()).booleanValue() && function1 != null) {
/* 586 */                   iloI0lOlll1.I00i01iIIliI(-1171320615);
/* 592 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 598 */                   int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 602 */                   OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 606 */                   O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, ilIl1Io0lii1);
/* 610 */                   iloI0lOlll1.I00i0oil();
/* 617 */                   if (iloI0lOlll1.I00O10llo) {
/* 619 */                       iloI0lOlll1.I000l1(iloi111);
                            } else {
/* 623 */                       iloI0lOlll1.I00io1l();
                            }
/* 626 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 629 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 632 */                   IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 635 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 642 */                   Boolean bool = (Boolean) oI10i0Il5.getValue();
/* 644 */                   bool.booleanValue();
/* 650 */                   iloI0lOlll1.I00Ol1ll1(1755529632, bool);
/* 701 */                   I00IO1(ilIl1Io0lii1, function1, jLongValue, ((Boolean) oI10i0Il4.getValue()).booleanValue(), ((Boolean) oI10i0Il5.getValue()).booleanValue() ? IIo0l1.I00000oOI : IIo0l1.I0000Il00O, iloI0lOlll1, ((i8 >> 21) & 112) | 6);
/* 705 */                   iloI0lOlll1.I0010I0i(false);
/* 708 */                   II1oili iI1oili = II1oili.I00000oIO;
/* 710 */                   if (oI1OIlllll06 != null) {
/* 715 */                       iloI0lOlll1.I00i01iIIliI(-1412676405);
/* 739 */                       oI1OIlllll04 = oI1OIlllll06;
/* 743 */                       I00II0Ol1O0l(oI1OIlllll04, true, ((Boolean) oI10i0Il5.getValue()).booleanValue(), iI1oili.I00000oIO(), iloI0lOlll1, ((i8 >> 27) & 14) | 48);
/* 747 */                       iloI0lOlll1.I0010I0i(false);
                            } else {
/* 751 */                       oI1OIlllll04 = oI1OIlllll06;
/* 757 */                       iloI0lOlll1.I00i01iIIliI(-1412405403);
/* 760 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 769 */                   O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(iI1oili.I00000oOI(o1ooIo101ll, i1O01oOIoI0I.I00ilI0I1), 12.0f);
/* 779 */                   OI1OIlllll0 oI1OIlllll07 = oI1OIlllll04;
/* 783 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), i1O01oOIoI0I.I00ll1, iloI0lOlll1, 6);
/* 793 */                   int iHashCode3 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 797 */                   OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll1.I000lI();
/* 801 */                   O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0001Ioi1lo);
/* 805 */                   iloI0lOlll1.I00i0oil();
/* 810 */                   if (iloI0lOlll1.I00O10llo) {
/* 812 */                       iloI0lOlll1.I000l1(iloi111);
                            } else {
/* 816 */                       iloI0lOlll1.I00io1l();
                            }
/* 819 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 822 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI3);
/* 825 */                   IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 828 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O3);
/* 831 */                   Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 835 */                   if (objI00O0i0ii6 == obj3) {
/* 841 */                       IOli1iO1Ii iOli1iO1Ii = new IOli1iO1Ii(23);
/* 844 */                       oI10i0Il = oI10i0Il5;
/* 846 */                       iOli1iO1Ii.I00iiI = oI10i0Il;
/* 848 */                       VarHandle.storeStoreFence();
/* 851 */                       iloI0lOlll1.I00iio(iOli1iO1Ii);
                                obj = iOli1iO1Ii;
                            } else {
/* 855 */                       oI10i0Il = oI10i0Il5;
                                obj = objI00O0i0ii6;
                            }
/* 862 */                   OiI111I oiI111II00000oIO = OiI11O1i1.I00000oIO(50);
/* 866 */                   OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 881 */                   long jI0000Il00O2 = IOOiio0i.I0000Il00O(0.85f, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I00IO1oi11O);
/* 888 */                   IloIlOOIi iloIlOOIi = new IloIlOOIi(0);
/* 891 */                   iloIlOOIi.I00iiI = oI10i0Il;
/* 893 */                   VarHandle.storeStoreFence();
/* 923 */                   OlioioOl0O.I0000Il00O((IllOOo00lI) obj, null, false, oiI111II00000oIO, jI0000Il00O2, 0L, 0.0f, 0.0f, null, null, iiioOl1O.I00000oOI(651277100, iloIlOOIi, iloI0lOlll1), iloI0lOlll1, 6, 998);
/* 926 */                   Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 930 */                   if (objI00O0i0ii7 == obj3) {
/* 936 */                       IOli1iO1Ii iOli1iO1Ii2 = new IOli1iO1Ii(24);
/* 939 */                       oI10i0Il2 = oI10i0Il4;
/* 941 */                       iOli1iO1Ii2.I00iiI = oI10i0Il2;
/* 943 */                       VarHandle.storeStoreFence();
/* 946 */                       iloI0lOlll1.I00iio(iOli1iO1Ii2);
                                obj2 = iOli1iO1Ii2;
                            } else {
/* 950 */                       oI10i0Il2 = oI10i0Il4;
                                obj2 = objI00O0i0ii7;
                            }
/* 953 */                   IllOOo00lI illOOo00lI9 = (IllOOo00lI) obj2;
/* 955 */                   OiI111I oiI111II00000oIO2 = OiI11O1i1.I00000oIO(50);
/* 969 */                   if (((Boolean) oI10i0Il2.getValue()).booleanValue()) {
/* 974 */                       iloI0lOlll1.I00i01iIIliI(-456725368);
/* 985 */                       jI0000Il00O = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I00000oIO;
/* 987 */                       z3 = false;
                            } else {
/* 994 */                       z3 = false;
/* 998 */                       iloI0lOlll1.I00i01iIIliI(-456723436);
/* 1011 */                      jI0000Il00O = IOOiio0i.I0000Il00O(0.85f, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I00IO1oi11O);
                            }
/* 988 */                   iloI0lOlll1.I0010I0i(z3);
/* 991 */                   long j = jI0000Il00O;
/* 1019 */                  IloIlOOIi iloIlOOIi2 = new IloIlOOIi(1);
/* 1022 */                  iloIlOOIi2.I00iiI = oI10i0Il2;
/* 1024 */                  VarHandle.storeStoreFence();
/* 1052 */                  OlioioOl0O.I0000Il00O(illOOo00lI9, null, false, oiI111II00000oIO2, j, 0L, 0.0f, 0.0f, null, null, iiioOl1O.I00000oOI(-1298053149, iloIlOOIi2, iloI0lOlll1), iloI0lOlll1, 6, 998);
/* 1056 */                  iloI0lOlll1.I0010I0i(true);
/* 1063 */                  if (str2.length() > 0) {
/* 1068 */                      iloI0lOlll1.I00i01iIIliI(-1410475963);
/* 1087 */                      O1ooiI111i o1ooiI111iI0001Ioi1lo2 = iO01II.I0001Ioi1lo(Ol0iOOO0.I0000oI00(iI1oili.I00000oOI(o1ooIo101ll, i1O01oOIoI0I.I00l0OO0IO), 1.0f), 12.0f);
/* 1099 */                      long j2 = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I00IO1oi11O;
/* 1101 */                      OiI111I oiI111II00000oOI = OiI11O1i1.I00000oOI(12.0f);
/* 1109 */                      I01oi1lIIO i01oi1lIIO = new I01oi1lIIO(13);
/* 1112 */                      str3 = str2;
/* 1114 */                      i01oi1lIIO.I00iiI = str3;
/* 1118 */                      i01oi1lIIO.I00iiO = iOO0i0o1O0l;
/* 1120 */                      illOOo00lI6 = illOOo00lI4;
/* 1122 */                      i01oi1lIIO.I00iio = illOOo00lI6;
/* 1124 */                      VarHandle.storeStoreFence();
/* 1150 */                      OlioioOl0O.I00000oIO(o1ooiI111iI0001Ioi1lo2, oiI111II00000oOI, j2, 0L, 4.0f, 0.0f, null, iiioOl1O.I00000oOI(181191338, i01oi1lIIO, iloI0lOlll1), iloI0lOlll1, 12607488, 104);
/* 1153 */                      z4 = false;
/* 1154 */                      iloI0lOlll1.I0010I0i(false);
                            } else {
/* 1159 */                      str3 = str2;
/* 1161 */                      illOOo00lI6 = illOOo00lI4;
/* 1163 */                      z4 = false;
/* 1167 */                      iloI0lOlll1.I00i01iIIliI(-1409320283);
/* 1170 */                      iloI0lOlll1.I0010I0i(false);
                            }
/* 1174 */                  iloI0lOlll1.I0010I0i(true);
/* 1177 */                  iloI0lOlll1.I0010I0i(z4);
/* 1180 */                  illOOo00lI7 = illOOo00lI2;
/* 1182 */                  illOOo00lI8 = illOOo00lI3;
/* 1184 */                  i5 = i2;
/* 1186 */                  z2 = true;
/* 1187 */                  oI1OIlllll03 = oI1OIlllll07;
/* 1189 */                  illOOo00lI5 = illOOo00lI6;
/* 1190 */                  iloI0lOlll13 = iloI0lOlll1;
/* 1191 */                  bitmap2 = bitmap;
/* 1193 */                  function12 = function1;
/* 1195 */                  i4 = i;
                        } else {
/* 1209 */                  iloI0lOlll1.I00i01iIIliI(-1167328776);
/* 1222 */                  O1ooiI111i o1ooiI111iI0001Ioi1lo3 = iO01II.I0001Ioi1lo(iO0l10O.I0000Il00O(ilIl1Io0lii1, iO0l10O.I00000oOI(iloI0lOlll1), true), 12.0f);
/* 1235 */                  IOOlo1O01O iOOlo1O01OI00000oIO2 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(10.0f), iI0IlloOiO0i, iloI0lOlll1, 6);
/* 1243 */                  int iHashCode4 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 1247 */                  OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll1.I000lI();
/* 1251 */                  O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0001Ioi1lo3);
/* 1255 */                  iloI0lOlll1.I00i0oil();
/* 1260 */                  if (iloI0lOlll1.I00O10llo) {
/* 1262 */                      iloI0lOlll1.I000l1(iloi111);
                            } else {
/* 1266 */                      iloI0lOlll1.I00io1l();
                            }
/* 1269 */                  li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, iOOlo1O01OI00000oIO2);
/* 1272 */                  li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI4);
/* 1275 */                  IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 1278 */                  li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O4);
/* 1285 */                  I0iII1i10I i0iII1i10I = new I0iII1i10I(9);
/* 1288 */                  i0iII1i10I.I00iiI = oI1OIlllll06;
/* 1290 */                  VarHandle.storeStoreFence();
/* 1314 */                  illOOo00lI7 = illOOo00lI2;
/* 1318 */                  oI1OIlllll03 = oI1OIlllll06;
/* 1322 */                  z2 = true;
/* 1328 */                  bitmap2 = bitmap;
/* 1330 */                  I00100l0(bitmap2, illOOo00lI7, null, iiioOl1O.I00000oOI(-887917530, i0iII1i10I, iloI0lOlll1), iloI0lOlll1, ((i8 >> 3) & 14) | 3072 | ((i8 >> 12) & 112), 4);
/* 1334 */                  if (z) {
/* 1339 */                      iloI0lOlll1.I00i01iIIliI(-1981157423);
/* 1356 */                      str3 = str2;
/* 1360 */                      r6 = 0;
/* 1362 */                      OOO0iOio0oil.I0000O(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 0L, 0L, 0, 0.0f, iloI0lOlll1, 6);
                            } else {
/* 1369 */                      str3 = str2;
/* 1371 */                      r6 = 0;
/* 1376 */                      iloI0lOlll1.I00i01iIIliI(-1286281268);
                            }
/* 1365 */                  iloI0lOlll1.I0010I0i(r6);
/* 1384 */                  if (str3.length() > 0) {
/* 1389 */                      iloI0lOlll1.I00i01iIIliI(-1286184269);
/* 1402 */                      long j3 = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00IioO0OiOi;
/* 1404 */                      OiI111I oiI111II00000oOI2 = OiI11O1i1.I00000oOI(8.0f);
/* 1408 */                      O1ooiI111i o1ooiI111iI0000oI002 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 1414 */                      IloIll1ol0oI iloIll1ol0oI = new IloIll1ol0oI(r6);
/* 1417 */                      iloIll1ol0oI.I00iiI = str3;
/* 1419 */                      iloIll1ol0oI.I00iiO = iOO0i0o1O0l;
/* 1421 */                      VarHandle.storeStoreFence();
/* 1447 */                      OlioioOl0O.I00000oIO(o1ooiI111iI0000oI002, oiI111II00000oOI2, j3, 0L, 0.0f, 0.0f, null, iiioOl1O.I00000oOI(1563476451, iloIll1ol0oI, iloI0lOlll1), iloI0lOlll1, 12582918, 120);
/* 1450 */                      iloI0lOlll1.I0010I0i(r6);
                            } else {
/* 1457 */                      iloI0lOlll1.I00i01iIIliI(-1285127572);
/* 1460 */                      iloI0lOlll1.I0010I0i(r6);
                            }
/* 1495 */                  illOOo00lI8 = illOOo00lI3;
/* 1497 */                  illOOo00lI5 = illOOo00lI4;
/* 1499 */                  function12 = function1;
/* 1501 */                  i5 = i2;
/* 1505 */                  i4 = i;
/* 1507 */                  iOiO0o0oi.I00000oIO(illOOo00lI8, Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), (bitmap2 == null || z) ? r6 : true, null, null, null, null, null, i1i0IooiOOI.I00i01iIIliI, iloI0lOlll1, ((i8 >> 18) & 14) | 805306416, 504);
/* 1510 */                  ?? r12 = iloI0lOlll1;
/* 1512 */                  r12.I0010I0i(true);
/* 1515 */                  r12.I0010I0i(r6);
                            iloI0lOlll13 = r12;
                        }
/* 1518 */              iloI0lOlll13.I0010I0i(z2);
/* 1521 */              oI1OIlllll02 = oI1OIlllll03;
                        r8 = z2;
                        iloI0lOlll12 = iloI0lOlll13;
                    } else {
/* 1524 */              i4 = i;
/* 1525 */              i5 = i2;
/* 1526 */              illOOo00lI5 = illOOo00lI4;
/* 1527 */              function12 = function1;
/* 1528 */              IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 1529 */              str3 = str2;
/* 1530 */              r8 = 1;
/* 1531 */              iloI0lOlll14.I00OilO00Il();
/* 1534 */              oI1OIlllll02 = oI1OIlllll0;
                        iloI0lOlll12 = iloI0lOlll14;
                    }
/* 1536 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1540 */          if (oOloioIlI001IO000 != null) {
/* 1544 */              IOIIIO ioiiio = new IOIIIO(r8);
/* 1547 */              ioiiio.I00ilO0 = str;
/* 1549 */              ioiiio.I00io1l = bitmap2;
/* 1551 */              ioiiio.I00ioIO = str3;
/* 1555 */              ioiiio.I00iiI = z;
/* 1557 */              ioiiio.I00iiO = illOOo00lI;
/* 1559 */              ioiiio.I00l0I0l0lO1 = illOOo00lI7;
/* 1561 */              ioiiio.I00l0OO0IO = illOOo00lI8;
/* 1563 */              ioiiio.I00li1OI = illOOo00lI5;
/* 1565 */              ioiiio.I00ll1 = function12;
/* 1567 */              ioiiio.I00lli11 = oI1OIlllll02;
/* 1569 */              ioiiio.I00iio = i4;
/* 1571 */              ioiiio.I00ilI0I1 = i5;
/* 1573 */              VarHandle.storeStoreFence();
/* 1576 */              oOloioIlI001IO000.I0000O = ioiiio;
                    }
                }

                public static final void I00IO1(O1ooiI111i o1ooiI111i, Function1 function1, long j, boolean z, IIo0l1 iIo0l1, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    int i3;
/* 18 */            iloI0lOlll1.I00i0O(-2003034552);
/* 23 */            if ((i & 6) == 0) {
/* 34 */                i2 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 36 */                i2 = i;
                    }
/* 39 */            if ((i & 48) == 0) {
/* 52 */                i2 |= iloI0lOlll1.I000OOo1O(function1) ? 32 : 16;
                    }
/* 55 */            if ((i & 384) == 0) {
/* 68 */                i2 |= iloI0lOlll1.I0001Ioi1lo(j) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 71 */            if ((i & 3072) == 0) {
/* 84 */                i2 |= iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 87 */            if ((i & 24576) == 0) {
/* 100 */               i2 |= iloI0lOlll1.I000OOo1O(iIo0l1) ? 16384 : 8192;
                    }
/* 117 */           if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 9363) != 9362)) {
/* 119 */               iloI0lOlll1.I00Ol00();
/* 124 */               if ((i & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 133 */                   iloI0lOlll1.I00OilO00Il();
                        }
/* 136 */               iloI0lOlll1.I0010o();
/* 153 */               Object obj = (O0oiOi) iloI0lOlll1.I000iOII(O11looOii.I00000oIO);
/* 155 */               Object objI00000oOI = lOO00IiI0li.I00000oOI(function1, iloI0lOlll1);
/* 163 */               Object objI00000oOI2 = lOO00IiI0li.I00000oOI(Long.valueOf(j), iloI0lOlll1);
/* 171 */               Object objI00000oOI3 = lOO00IiI0li.I00000oOI(Boolean.valueOf(z), iloI0lOlll1);
/* 175 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 179 */               i3 = 0;
/* 181 */               Object obj2 = IOl11li.I00000oIO;
                        Object obj3 = objI00O0i0ii;
/* 183 */               if (objI00O0i0ii == obj2) {
/* 185 */                   long[] jArr = {0};
/* 191 */                   iloI0lOlll1.I00iio(jArr);
                            obj3 = jArr;
                        }
/* 194 */               Object obj4 = (long[]) obj3;
/* 228 */               boolean zI000II = iloI0lOlll1.I000II(objI00000oOI3) | iloI0lOlll1.I000OOo1O(obj4) | iloI0lOlll1.I000II(objI00000oOI2) | iloI0lOlll1.I000II(objI00000oOI) | iloI0lOlll1.I000OOo1O(obj) | iloI0lOlll1.I000OOo1O(iIo0l1);
/* 230 */               int i4 = i2;
/* 232 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii2;
/* 236 */               if (zI000II || objI00O0i0ii2 == obj2) {
/* 243 */                   I0O0o00OlIoi i0O0o00OlIoi = new I0O0o00OlIoi(7);
/* 246 */                   i0O0o00OlIoi.I00iiO = obj;
/* 248 */                   i0O0o00OlIoi.I00iio = iIo0l1;
/* 250 */                   i0O0o00OlIoi.I00iiI = objI00000oOI3;
/* 252 */                   i0O0o00OlIoi.I00ilI0I1 = obj4;
/* 254 */                   i0O0o00OlIoi.I00io1l = objI00000oOI2;
/* 256 */                   i0O0o00OlIoi.I00ilO0 = objI00000oOI;
/* 258 */                   VarHandle.storeStoreFence();
/* 261 */                   iloI0lOlll1.I00iio(i0O0o00OlIoi);
                            obj5 = i0O0o00OlIoi;
                        }
/* 271 */               O0000Ioio00.I00000oIO((Function1) obj5, o1ooiI111i, null, iloI0lOlll1, (i4 << 3) & 112);
                    } else {
/* 275 */               i3 = 0;
/* 277 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 280 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 284 */           if (oOloioIlI001IO000 != null) {
/* 290 */               IloOilOi0iil iloOilOi0iil = new IloOilOi0iil(i3);
/* 293 */               iloOilOi0iil.I00iiI = o1ooiI111i;
/* 295 */               iloOilOi0iil.I00ilO0 = function1;
/* 297 */               iloOilOi0iil.I00iio = j;
/* 299 */               iloOilOi0iil.I00iiO = z;
/* 301 */               iloOilOi0iil.I00io1l = iIo0l1;
/* 303 */               iloOilOi0iil.I00ilI0I1 = i;
/* 305 */               VarHandle.storeStoreFence();
/* 308 */               oOloioIlI001IO000.I0000O = iloOilOi0iil;
                    }
                }

                public static final Object I00IO1oi11O(Function1 function1, Iloo0ii1 iloo0ii1) {
/* 8 */             IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iloo0ii1));
/* 11 */            iIoOoIol0Io0.I00111O();
/* 16 */            Iloo00O1 iloo00O1 = new Iloo00O1();
/* 19 */            iloo00O1.I00000oIO = iIoOoIol0Io0;
/* 21 */            VarHandle.storeStoreFence();
/* 28 */            ListenableFuture listenableFuture = (ListenableFuture) function1.invoke(iloo00O1);
/* 32 */            l0001OI0 l0001oi0 = new l0001OI0(1);
/* 35 */            l0001oi0.I00iiI = listenableFuture;
/* 37 */            l0001oi0.I00iiO = iIoOoIol0Io0;
/* 39 */            VarHandle.storeStoreFence();
/* 46 */            listenableFuture.addListener(l0001oi0, Executors.newSingleThreadExecutor());
/* 49 */            Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
                    return objI0010I0i == Ii0111o.I00iOIl ? objI0010I0i : OoiIlOl1iI.I00000oIO;
                }

                public static final String I00IOO(String str, List list) {
/* 5 */             StringBuilder sb = new StringBuilder("You are a helpful AI assistant. Continue the conversation below.\n\n");
/* 8 */             Iterator it = list.iterator();
/* 16 */            while (it.hasNext()) {
/* 22 */                OI1O0o0 oI1O0o0 = (OI1O0o0) it.next();
/* 31 */                String str2 = oI1O0o0.I00000oIO ? "User" : "Assistant";
/* 52 */                sb.append(str2 + ": " + oI1O0o0.I00000oOI);
/* 57 */                sb.append('\n');
                    }
/* 67 */            sb.append("User: ".concat(str));
/* 72 */            sb.append("\nAssistant:");
/* 75 */            return sb.toString();
                }

                public static final Object I00IioO0OiOi(Context context, Uri uri, Oll0io oll0io) {
/* 1 */             IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 12 */            return iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new I1o0lo01(context, uri, null, 2), oll0io);
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0094 -> B:30:0x0097). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00IlilI0i0i(SpeechRecognizer speechRecognizer, Function1 function1, IOoilo iOoilo) throws Throwable {
                    Iloo0IO iloo0IO;
                    Iloo0IO iloo0IO2;
                    int i;
                    Function1 function12;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    SpeechRecognizer speechRecognizer2;
                    Function1 function13;
/* 3 */             if (iOoilo instanceof Iloo0IO) {
/* 6 */                 iloo0IO = (Iloo0IO) iOoilo;
/* 8 */                 int i6 = iloo0IO.I00ioIO;
/* 14 */                if ((i6 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iloo0IO.I00ioIO = i6 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iloo0IO = new Iloo0IO(iOoilo);
                        }
                    }
/* 25 */            Object objCheckStatus = iloo0IO.I00io1l;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i7 = iloo0IO.I00ioIO;
/* 33 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 36 */            if (i7 != 0) {
/* 38 */                if (i7 == 1) {
/* 68 */                    int i8 = iloo0IO.I00ilO0;
/* 70 */                    int i9 = iloo0IO.I00ilI0I1;
/* 72 */                    int i10 = iloo0IO.I00iio;
/* 74 */                    int i11 = iloo0IO.I00iiO;
/* 76 */                    function13 = iloo0IO.I00iiI;
/* 78 */                    speechRecognizer2 = iloo0IO.I00iOIl;
/* 80 */                    lIoii1l01l0i.I00000oOI(objCheckStatus);
/* 83 */                    i3 = i9;
/* 84 */                    i4 = i8;
/* 85 */                    i5 = i10;
/* 86 */                    iloo0IO2 = iloo0IO;
/* 87 */                    i = i11;
/* 128 */                   iloo0IO2.I00iOIl = speechRecognizer2;
/* 130 */                   iloo0IO2.I00iiI = function13;
/* 132 */                   iloo0IO2.I00iiO = i;
/* 134 */                   iloo0IO2.I00iio = i5;
/* 136 */                   iloo0IO2.I00ilI0I1 = i3;
/* 138 */                   iloo0IO2.I00ilO0 = i4;
/* 140 */                   iloo0IO2.I00ioIO = 2;
/* 142 */                   objCheckStatus = speechRecognizer2.checkStatus(iloo0IO2);
/* 146 */                   if (objCheckStatus != ii0111o) {
                            }
/* 148 */                   return ii0111o;
                        }
/* 40 */                if (i7 != 2) {
/* 63 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 66 */                    return null;
                        }
/* 42 */                i5 = iloo0IO.I00iio;
/* 44 */                int i12 = iloo0IO.I00iiO;
/* 46 */                Function1 function14 = iloo0IO.I00iiI;
/* 48 */                SpeechRecognizer speechRecognizer3 = iloo0IO.I00iOIl;
                        try {
/* 50 */                    lIoii1l01l0i.I00000oOI(objCheckStatus);
/* 53 */                    Iloo0IO iloo0IO3 = iloo0IO;
/* 54 */                    i = i12;
/* 55 */                    Iloo0IO iloo0IO4 = iloo0IO3;
/* 154 */                   int iIntValue = ((Number) objCheckStatus).intValue();
/* 163 */                   function14.invoke(new Integer(iIntValue));
/* 166 */                   if (iIntValue != 0 || iIntValue == 3) {
/* 177 */                       return ooiIlOl1iI;
                            }
/* 172 */                   function12 = function14;
/* 173 */                   iloo0IO2 = iloo0IO4;
/* 171 */                   i2 = i5 + 1;
/* 175 */                   speechRecognizer = speechRecognizer3;
/* 98 */                    if (i2 < i) {
/* 207 */                       function12.invoke(new Integer(1));
/* 408 */                       return ooiIlOl1iI;
                            }
/* 100 */                   iloo0IO2.I00iOIl = speechRecognizer;
/* 102 */                   iloo0IO2.I00iiI = function12;
/* 104 */                   iloo0IO2.I00iiO = i;
/* 106 */                   iloo0IO2.I00iio = i2;
/* 108 */                   iloo0IO2.I00ilI0I1 = i2;
/* 110 */                   iloo0IO2.I00ilO0 = 0;
/* 112 */                   iloo0IO2.I00ioIO = 1;
/* 120 */                   if (il0l1o1l.I00000oOI(2000L, iloo0IO2) != ii0111o) {
/* 123 */                       speechRecognizer2 = speechRecognizer;
/* 124 */                       i5 = i2;
/* 125 */                       function13 = function12;
/* 126 */                       i3 = i5;
/* 127 */                       i4 = 0;
/* 128 */                       iloo0IO2.I00iOIl = speechRecognizer2;
/* 130 */                       iloo0IO2.I00iiI = function13;
/* 132 */                       iloo0IO2.I00iiO = i;
/* 134 */                       iloo0IO2.I00iio = i5;
/* 136 */                       iloo0IO2.I00ilI0I1 = i3;
/* 138 */                       iloo0IO2.I00ilO0 = i4;
/* 140 */                       iloo0IO2.I00ioIO = 2;
/* 142 */                       objCheckStatus = speechRecognizer2.checkStatus(iloo0IO2);
/* 146 */                       if (objCheckStatus != ii0111o) {
/* 149 */                           iloo0IO4 = iloo0IO2;
/* 150 */                           function14 = function13;
/* 151 */                           speechRecognizer3 = speechRecognizer2;
/* 154 */                           int iIntValue2 = ((Number) objCheckStatus).intValue();
/* 163 */                           function14.invoke(new Integer(iIntValue2));
/* 166 */                           if (iIntValue2 != 0) {
                                    }
/* 177 */                           return ooiIlOl1iI;
                                }
                            }
/* 148 */                   return ii0111o;
                        } catch (Exception e) {
/* 198 */                   Log.w("GeminiNanoHub", "speech poll checkStatus: " + e.getMessage());
/* 201 */                   return ooiIlOl1iI;
                        }
                    }
/* 89 */            lIoii1l01l0i.I00000oOI(objCheckStatus);
/* 94 */            iloo0IO2 = iloo0IO;
/* 95 */            i = 120;
/* 96 */            function12 = function1;
/* 97 */            i2 = 0;
/* 98 */            if (i2 < i) {
                    }
                }

                public static final String I00Io1lO(Context context, Uri uri) throws IOException {
                    int columnIndex;
/* 15 */            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
/* 19 */            if (cursorQuery != null) {
                        try {
/* 25 */                    if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_display_name")) >= 0) {
/* 33 */                        String string = cursorQuery.getString(columnIndex);
/* 37 */                        cursorQuery.close();
/* 40 */                        return string;
                            }
/* 44 */                    cursorQuery.close();
                        } finally {
                        }
                    }
/* 54 */            String lastPathSegment = uri.getLastPathSegment();
                    return lastPathSegment != null ? OlOoOIi0o.I00O0i0ii('/', lastPathSegment, lastPathSegment) : "document";
                }

                public static final String I00Io1o110i(String str) {
/* 49 */            List listI00II0Ol1O0l = OlOoOIi0o.I00II0Ol1O0l(Pattern.compile("\\n{3,}").matcher(Pattern.compile("[ \\t]+").matcher(Pattern.compile("[\\x00-\\x08\\x0B\\x0C\\x0E-\\x1F\\x7F]").matcher(str).replaceAll("")).replaceAll(" ")).replaceAll("\n\n"));
/* 57 */            ArrayList arrayList = new ArrayList();
/* 68 */            for (Object obj : listI00II0Ol1O0l) {
/* 75 */                String str2 = (String) obj;
/* 78 */                int i = 0;
/* 83 */                for (int i2 = 0; i2 < str2.length(); i2++) {
/* 93 */                    if (Character.isLetterOrDigit(str2.charAt(i2))) {
/* 95 */                        i++;
                            }
                        }
/* 104 */               if (!OlOoOIi0o.I001l0I00(str2)) {
                            double d = i;
/* 107 */                   int length = str2.length();
/* 112 */                   if (length < 1) {
/* 114 */                       length = 1;
                            }
/* 121 */                   if (d / length > 0.25d) {
                            }
                        }
/* 123 */               arrayList.add(obj);
                    }
/* 142 */           return OlOoOIi0o.I00OIo(IOOi0Ool1i.I00IlilI0i0i(arrayList, "\n", null, null, null, 62)).toString();
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00IoIO0lI(Function1 function1, Function1 function12, Function1 function13, IOoilo iOoilo) throws Exception {
                    Iloo0ii1 iloo0ii1;
                    Function1 function14;
/* 3 */             if (iOoilo instanceof Iloo0ii1) {
/* 6 */                 iloo0ii1 = (Iloo0ii1) iOoilo;
/* 8 */                 int i = iloo0ii1.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iloo0ii1.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iloo0ii1 = new Iloo0ii1(iOoilo);
                        }
                    }
/* 25 */            Object objInvoke = iloo0ii1.I00iiO;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i2 = iloo0ii1.I00iio;
                    try {
/* 35 */                if (i2 == 0) {
/* 61 */                    lIoii1l01l0i.I00000oOI(objInvoke);
/* 64 */                    iloo0ii1.I00iOIl = function12;
/* 66 */                    iloo0ii1.I00iiI = function13;
/* 68 */                    iloo0ii1.I00iio = 1;
/* 70 */                    objInvoke = function1.invoke(iloo0ii1);
/* 74 */                    if (objInvoke != obj) {
                            }
/* 123 */                   return obj;
                        }
/* 37 */                if (i2 != 1) {
/* 39 */                    if (i2 != 2) {
/* 49 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 32 */                        return null;
                            }
/* 41 */                    function14 = iloo0ii1.I00iiI;
/* 43 */                    lIoii1l01l0i.I00000oOI(objInvoke);
/* 130 */                   function14.invoke(new Integer(3));
/* 133 */                   return Boolean.TRUE;
                        }
/* 53 */                function13 = iloo0ii1.I00iiI;
/* 55 */                function12 = iloo0ii1.I00iOIl;
/* 57 */                lIoii1l01l0i.I00000oOI(objInvoke);
/* 79 */                int iIntValue = ((Number) objInvoke).intValue();
/* 88 */                function13.invoke(new Integer(iIntValue));
/* 91 */                if (iIntValue == 3) {
/* 93 */                    return Boolean.TRUE;
                        }
/* 96 */                if (iIntValue == 0) {
/* 98 */                    return Boolean.FALSE;
                        }
/* 101 */               if (iIntValue != 1) {
/* 161 */                   return Boolean.TRUE;
                        }
/* 108 */               function13.invoke(new Integer(2));
/* 111 */               iloo0ii1.I00iOIl = null;
/* 113 */               iloo0ii1.I00iiI = function13;
/* 115 */               iloo0ii1.I00iio = 2;
/* 121 */               if (I00IO1oi11O(function12, iloo0ii1) != obj) {
/* 124 */                   function14 = function13;
/* 130 */                   function14.invoke(new Integer(3));
/* 133 */                   return Boolean.TRUE;
                        }
/* 123 */               return obj;
                    } catch (Exception e) {
/* 157 */               Log.w("GeminiNanoHub", "download failed: " + e.getMessage());
/* 160 */               throw e;
                    }
                }
            }
