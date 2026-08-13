            package p000;

            import android.graphics.Path;
            import android.graphics.RectF;
            import android.os.Bundle;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizer;
            import com.google.mlkit.vision.barcode.BarcodeScanner;
            import com.google.mlkit.vision.face.FaceDetector;
            import com.google.mlkit.vision.facemesh.FaceMeshDetector;
            import com.google.mlkit.vision.label.ImageLabeler;
            import com.google.mlkit.vision.pose.PoseDetector;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.google.mlkit.vision.text.TextRecognizer;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public final class Iil1olo implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;

                public Iil1olo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    String strConcat;
                    int length;
                    int i;
                    String str;
/* 5 */             int i2 = this.I00iOIl;
/* 7 */             int i3 = 17;
/* 12 */            int i4 = 0;
/* 14 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 16 */            Object obj2 = this.I00iiI;
                    switch (i2) {
                        case 0:
/* 1249 */                  I0IIiO0iI i0IIiO0iI = (I0IIiO0iI) obj2;
/* 1251 */                  IilI0O iilI0O = (IilI0O) obj;
/* 1257 */                  if (!iilI0O.I00iOIl.I00lll10) {
/* 1259 */                      return OoIOloOIOI1l.I00iiI;
                            }
/* 1262 */                  IilI0O iilI0O2 = iilI0O.I00o101lO;
/* 1264 */                  if (iilI0O2 != null) {
/* 1268 */                      Iil1olo iil1olo = new Iil1olo(i4);
/* 1271 */                      iil1olo.I00iiI = i0IIiO0iI;
/* 1273 */                      VarHandle.storeStoreFence();
/* 1282 */                      if (iil1olo.invoke(iilI0O2) == OoIOloOIOI1l.I00iOIl) {
/* 1285 */                          lOo1ii0o1.I0000oI00(iilI0O2, iil1olo);
                                }
                            }
/* 1288 */                  iilI0O.I00o101lO = null;
/* 1290 */                  iilI0O.I00o0l1o1o0 = null;
/* 1292 */                  return OoIOloOIOI1l.I00iOIl;
                        case 1:
/* 1226 */                  OO1il00lI oO1il00lI = (OO1il00lI) obj;
/* 1242 */                  ((IlliIl1l11O) obj2).invoke(oO1il00lI, Float.valueOf(Float.intBitsToFloat((int) (lI1Ol11OOlll.I0001Ioi1lo(oO1il00lI, false) >> 32))));
/* 1245 */                  oO1il00lI.I00000oIO();
/* 1248 */                  return ooiIlOl1iI;
                        case 2:
/* 1203 */                  Io011oOlO01 io011oOlO01 = (Io011oOlO01) obj;
/* 1219 */                  return Boolean.valueOf(io011oOlO01 instanceof Iill1Iloi0 ? ((Boolean) ((II1O00ioi) obj2).invoke(io011oOlO01)).booleanValue() : true);
                        case 3:
/* 1059 */                  Iioi1O iioi1O = (Iioi1O) obj;
/* 1066 */                  String str2 = ((Iioi1O) obj2) == iioi1O ? " > " : "   ";
/* 1074 */                  if (iioi1O instanceof IOi0OoOOIlli) {
/* 1076 */                      IOi0OoOOIlli iOi0OoOOIlli = (IOi0OoOOIlli) iioi1O;
/* 1082 */                      length = iOi0OoOOIlli.I00000oIO.I00iiI.length();
/* 1086 */                      i = iOi0OoOOIlli.I00000oOI;
/* 1088 */                      str = "CommitTextCommand(text.length=";
                            } else {
/* 1097 */                      if (!(iioi1O instanceof OilooOiOolI1)) {
/* 1116 */                          if (iioi1O instanceof Oiloo1i01) {
/* 1120 */                              strConcat = ((Oiloo1i01) iioi1O).toString();
                                    } else if (iioi1O instanceof IiIo10oo1il) {
/* 1131 */                              strConcat = ((IiIo10oo1il) iioi1O).toString();
                                    } else if (iioi1O instanceof IiIoi00ooIo) {
/* 1142 */                              strConcat = ((IiIoi00ooIo) iioi1O).toString();
                                    } else if (iioi1O instanceof Oio0ilI1l) {
/* 1153 */                              strConcat = ((Oio0ilI1l) iioi1O).toString();
                                    } else if (iioi1O instanceof IlIoI1iIOoO0) {
/* 1162 */                              strConcat = "FinishComposingTextCommand()";
                                    } else if (iioi1O instanceof IiIlooOOiii) {
/* 1169 */                              strConcat = "DeleteAllCommand()";
                                    } else {
/* 1182 */                              String strI000oI1ioi = OOoOl0i.I00000oIO.I00000oOI(iioi1O.getClass()).I000oI1ioi();
/* 1186 */                              if (strI000oI1ioi == null) {
/* 1188 */                                  strI000oI1ioi = "{anonymous EditCommand}";
                                        }
/* 1192 */                              strConcat = "Unknown EditCommand: ".concat(strI000oI1ioi);
                                    }
/* 1196 */                          return str2.concat(strConcat);
                                }
/* 1099 */                      OilooOiOolI1 oilooOiOolI1 = (OilooOiOolI1) iioi1O;
/* 1105 */                      length = oilooOiOolI1.I00000oIO.I00iiI.length();
/* 1109 */                      i = oilooOiOolI1.I00000oOI;
/* 1111 */                      str = "SetComposingTextCommand(text.length=";
                            }
/* 1090 */                  strConcat = Oi010OO0.I0010o(str, length, ", newCursorPosition=", i, ")");
/* 1196 */                  return str2.concat(strConcat);
                        case 4:
/* 981 */                   I1I0i0Ilo1Oi i1I0i0Ilo1Oi = (I1I0i0Ilo1Oi) obj2;
/* 997 */                   Object obj3 = ((LinkedHashMap) i1I0i0Ilo1Oi.I00iiI).get(OOoOl0i.I00000oIO.I00000oOI(obj.getClass()));
/* 1008 */                  Il0lI0ool il0lI0ool = obj3 instanceof Il0lI0ool ? (Il0lI0ool) obj3 : null;
/* 1013 */                  ((LinkedHashMap) i1I0i0Ilo1Oi.I00iiO).get(obj);
/* 1016 */                  if (il0lI0ool != null) {
/* 1036 */                      return new OI1llOooOl1(obj, il0lI0ool.I00000oOI.invoke(obj), (Map) il0lI0ool.I0000Il00O.invoke(obj), il0lI0ool.I0000O);
                            }
/* 1040 */                  Objects.toString(obj);
/* 1053 */                  I000II.I001IO000("Unknown screen ".concat(String.valueOf(obj)));
/* 13 */                    return null;
                        case 5:
/* 906 */                   OO0l00Ii10 oO0l00Ii10 = (OO0l00Ii10) obj;
/* 908 */                   OlO0OIIl1 olO0OIIl1 = ((IlI1loI1lO1) obj2).I00000oOI;
/* 915 */                   IlI10IO ilI10IO = (IlI10IO) olO0OIIl1.getValue();
/* 923 */                   List list = ((IlI10IO) olO0OIIl1.getValue()).I0001Ioi1lo;
/* 929 */                   ArrayList arrayList = new ArrayList();
/* 940 */                   for (Object obj4 : list) {
/* 949 */                       if (((OO0l00Ii10) obj4) != oO0l00Ii10) {
/* 952 */                           arrayList.add(obj4);
                                }
                            }
/* 977 */                   olO0OIIl1.I000lI(null, IlI10IO.I00000oIO(ilI10IO, null, false, null, null, null, arrayList, null, 0.0f, false, false, false, 2015));
/* 980 */                   return ooiIlOl1iI;
                        case 6:
/* 883 */                   OI110O0 oi110o0 = (OI110O0) obj2;
/* 887 */                   Object[] objArr = oi110o0.I00iOIl;
/* 889 */                   int i5 = oi110o0.I00iiO;
/* 891 */                   while (i4 < i5) {
/* 897 */                       ((O1iOIo0o0) objArr[i4]).I00000oIO();
/* 900 */                       i4++;
                            }
/* 903 */                   return ooiIlOl1iI;
                        case 7:
/* 857 */                   OlO0OIIl1 olO0OIIl12 = ((Ili0IOilll10) obj2).I00000oOI;
/* 879 */                   olO0OIIl12.I000lI(null, Ili00oiIllI.I00000oIO((Ili00oiIllI) olO0OIIl12.getValue(), (String) obj, false, null, 0.0f, null, null, false, 126));
/* 882 */                   return ooiIlOl1iI;
                        case 8:
/* 827 */                   OoOlII ooOlII = (OoOlII) obj;
/* 847 */                   return ((IliOI01OIIII) obj2).I00000oIO(new OoOlII(null, ooOlII.I00000oOI, ooOlII.I0000Il00O, ooOlII.I0000O, ooOlII.I0000oI00)).getValue();
                        case 9:
/* 764 */                   OI1o1o1iO1l oI1o1o1iO1l = (OI1o1o1iO1l) obj2;
/* 768 */                   String str3 = ((O1oIOiI11o0) obj).I00000oIO;
/* 770 */                   FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 774 */                   if (firebaseAnalyticsI00000oIO != null) {
/* 776 */                       Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 780 */                       Bundle bundle = new Bundle();
/* 799 */                       bundle.putString("capability_name", "benchmark_" + str3);
/* 804 */                       firebaseAnalyticsI00000oIO.I00000oIO("capability_select", bundle);
                            }
/* 821 */                   OI1o1o1iO1l.I0000Il00O(oI1o1o1iO1l, "benchmark/" + str3);
/* 824 */                   return ooiIlOl1iI;
                        case 10:
/* 755 */                   I0IOIo0 i0IOIo0 = new I0IOIo0(12);
/* 758 */                   i0IOIo0.I00000oOI = (ImageLabeler) obj2;
/* 760 */                   VarHandle.storeStoreFence();
/* 763 */                   return i0IOIo0;
                        case 11:
/* 738 */                   I0IOIo0 i0IOIo02 = new I0IOIo0(10);
/* 741 */                   i0IOIo02.I00000oOI = (FaceMeshDetector) obj2;
/* 743 */                   VarHandle.storeStoreFence();
/* 746 */                   return i0IOIo02;
                        case 12:
/* 721 */                   I0IOIo0 i0IOIo03 = new I0IOIo0(i3);
/* 724 */                   i0IOIo03.I00000oOI = (TextRecognizer) obj2;
/* 726 */                   VarHandle.storeStoreFence();
/* 729 */                   return i0IOIo03;
                        case 13:
/* 706 */                   I0IOIo0 i0IOIo04 = new I0IOIo0(16);
/* 709 */                   i0IOIo04.I00000oOI = (BarcodeScanner) obj2;
/* 711 */                   VarHandle.storeStoreFence();
/* 714 */                   return i0IOIo04;
                        case 14:
/* 689 */                   I0IOIo0 i0IOIo05 = new I0IOIo0(9);
/* 692 */                   i0IOIo05.I00000oOI = (FaceDetector) obj2;
/* 694 */                   VarHandle.storeStoreFence();
/* 697 */                   return i0IOIo05;
                        case 15:
/* 672 */                   I0IOIo0 i0IOIo06 = new I0IOIo0(18);
/* 675 */                   i0IOIo06.I00000oOI = (SpeechRecognizer) obj2;
/* 677 */                   VarHandle.storeStoreFence();
/* 680 */                   return i0IOIo06;
                        case 16:
/* 655 */                   I0IOIo0 i0IOIo07 = new I0IOIo0(13);
/* 658 */                   i0IOIo07.I00000oOI = (PoseDetector) obj2;
/* 660 */                   VarHandle.storeStoreFence();
/* 663 */                   return i0IOIo07;
                        case 17:
/* 633 */                   IIIII1OI1 iiiii1oi1 = (IIIII1OI1) obj2;
/* 641 */                   if (Io0O0Ol.I00000oOI.compareAndSet(false, true)) {
/* 643 */                       iiiii1oi1.I000lI(ooiIlOl1iI);
                            }
/* 646 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 607 */                   IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 613 */                   IIolOo iIolOoI0010o = iilloIOOO0i.I00iiI().I0010o();
/* 617 */                   IlliIl1l11O illiIl1l11O = ((Io10OIiiOll) obj2).I00iio;
/* 619 */                   if (illiIl1l11O != null) {
/* 629 */                       illiIl1l11O.invoke(iIolOoI0010o, (Io10IOI) iilloIOOO0i.I00iiI().I00iiO);
                            }
/* 632 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 590 */                   Io10liI0o io10liI0o = (Io10liI0o) obj2;
/* 592 */                   Oolo0Oli0lOo oolo0Oli0lOo = (Oolo0Oli0lOo) obj;
/* 594 */                   io10liI0o.I000II(oolo0Oli0lOo);
/* 597 */                   Function1 function1 = io10liI0o.I000OOo1O;
/* 599 */                   if (function1 != null) {
/* 601 */                       function1.invoke(oolo0Oli0lOo);
                            }
/* 604 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 483 */                   OI0ooi10l oI0ooi10l = (OI0ooi10l) obj;
/* 485 */                   ((Io1Ooo1) obj2).getClass();
/* 488 */                   Map mapI00000oIO = oI0ooi10l.I00000oIO();
/* 492 */                   LinkedHashMap linkedHashMap = oI0ooi10l.I00000oIO;
/* 504 */                   long j = 0;
/* 509 */                   for (Map.Entry entry : mapI00000oIO.entrySet()) {
/* 523 */                       if (entry.getValue() instanceof Set) {
/* 529 */                           OOI0IO111Ii oOI0IO111Ii = (OOI0IO111Ii) entry.getKey();
/* 535 */                           Set set = (Set) entry.getValue();
/* 541 */                           String strI00000oOI = Io1Ooo1.I00000oOI(System.currentTimeMillis());
/* 549 */                           if (set.contains(strI00000oOI)) {
/* 555 */                               oI0ooi10l.I0000O(oOI0IO111Ii, Set.of(strI00000oOI));
/* 560 */                               j++;
                                    } else {
/* 562 */                               oI0ooi10l.I00000oOI();
/* 565 */                               linkedHashMap.remove(oOI0IO111Ii);
                                    }
                                }
                            }
/* 571 */                   OOI0IO111Ii oOI0IO111Ii2 = Io1Ooo1.I0000Il00O;
/* 573 */                   if (j == 0) {
/* 575 */                       oI0ooi10l.I00000oOI();
/* 578 */                       linkedHashMap.remove(oOI0IO111Ii2);
                            } else {
/* 586 */                       oI0ooi10l.I0000O(oOI0IO111Ii2, Long.valueOf(j));
                            }
/* 13 */                    return null;
                        case PoseLandmark.LEFT_THUMB:
/* 444 */                   I0lOIOI11OIl i0lOIOI11OIl = (I0lOIOI11OIl) obj2;
/* 446 */                   Throwable th = (Throwable) obj;
/* 454 */                   if (IoIll0l.I00iiO.decrementAndGet(i0lOIOI11OIl) <= 0) {
/* 456 */                       if (th == null) {
/* 458 */                           i0lOIOI11OIl.close();
                                } else {
/* 467 */                           CancellationException cancellationExceptionI00000oIO = th instanceof CancellationException ? (CancellationException) th : null;
/* 469 */                           if (cancellationExceptionI00000oIO == null) {
/* 473 */                               cancellationExceptionI00000oIO = ilIiOIi0I.I00000oIO("Client scope is canceled", th);
                                    }
/* 477 */                           il001oo1.I00000oOI(i0lOIOI11OIl, cancellationExceptionI00000oIO);
                                }
                            }
/* 480 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_THUMB:
/* 393 */                   IoIo10lOo1 ioIo10lOo1 = (IoIo10lOo1) obj2;
/* 395 */                   IoIlI1oli ioIlI1oli = (IoIlI1oli) obj;
/* 411 */                   IOlOl10 iOlOl10 = (IOlOl10) ioIlI1oli.I00ioIO.I00000oIO(IoIo11O01ii.I00000oIO, new Iloi111(6));
/* 429 */                   Object objI000O01llI0 = ioIo10lOo1.I000O01llI0((Function1) ((LinkedHashMap) ioIlI1oli.I00l0OO0IO.I00iiO).get(ioIo10lOo1.getKey()));
/* 433 */                   ioIo10lOo1.I000II(objI000O01llI0, ioIlI1oli);
/* 440 */                   iOlOl10.I0000oI00(ioIo10lOo1.getKey(), objI000O01llI0);
/* 443 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 379 */                   IoIlI1oli ioIlI1oli2 = (IoIlI1oli) obj2;
/* 383 */                   if (((Throwable) obj) != null) {
/* 389 */                       ioIlI1oli2.I00l0I0l0lO1.I00100o1O0lo(IOIoi11o.I0000oI00);
                            }
/* 392 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 335 */                   Oliiii0 oliiii0 = (Oliiii0) obj2;
/* 337 */                   Throwable th2 = (Throwable) obj;
/* 339 */                   O1I1OOiol o1I1OOiol = IoO11I1oI.I00000oIO;
/* 341 */                   if (th2 != null) {
/* 357 */                       o1I1OOiol.I000o00OoI0I("Cancelling request because engine Job failed with error: " + th2);
/* 366 */                       oliiii0.I000II(ilIiOIi0I.I00000oIO("Engine failed", th2));
                            } else {
/* 372 */                       o1I1OOiol.I000o00OoI0I("Cancelling request because engine Job completed");
/* 375 */                       oliiii0.I00iIO();
                            }
/* 378 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 331 */                   ((IiiOlIiio) obj2).I00000oOI();
/* 334 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 308 */                   Throwable th3 = (Throwable) obj;
/* 310 */                   Oliiii0 oliiii02 = ((IoO10oI0o) obj2).I0000oI00;
/* 312 */                   if (th3 == null) {
/* 314 */                       oliiii02.I00iIO();
                            } else {
/* 323 */                       oliiii02.I00O10llo(new IOiIII1I(false, th3));
                            }
/* 326 */                   return ooiIlOl1iI;
                        case 27:
/* 302 */                   ((OlIl0i) obj2).I000II(null);
/* 305 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_ANKLE:
/* 74 */                    Iol1I0loo0 iol1I0loo0 = (Iol1I0loo0) obj2;
/* 76 */                    IIi11Illi1I iIi11Illi1I = (IIi11Illi1I) obj;
/* 92 */                    float fI00000oIO = iIi11Illi1I.I00000oIO() * ((Iil1010O) iol1I0loo0.I00oliIiO01i.I0000O()).I00iOIl;
/* 93 */                    I0ol0lI i0ol0lII00000oIO = I0olIlI11.I00000oIO();
/* 97 */                    OioOIi1o0I oioOIi1o0II00000oIO = iol1I0loo0.I00oli;
/* 99 */                    if (oioOIi1o0II00000oIO == null) {
/* 113 */                       oioOIi1o0II00000oIO = Oiol0Ol0li0.I00000oIO(((O1OoiOIi1ooi) iiliIooIliOo.I00000oIO(iol1I0loo0, O1OoilIO.I00000oOI)).I0000Il00O, IlIlOOO.I0000O);
                            }
/* 129 */                   l1lOoiII1l l1looiii1lI00000oIO = oioOIi1o0II00000oIO.I00000oIO(iIi11Illi1I.I00iOIl.I0000oI00(), iIi11Illi1I.I00iOIl.getLayoutDirection(), iIi11Illi1I);
/* 135 */                   if (l1looiii1lI00000oIO instanceof OIioiIl) {
/* 141 */                       I0ol0lI.I00000oOI(i0ol0lII00000oIO, ((OIioiIl) l1looiii1lI00000oIO).I00000oIO);
                            } else if (l1looiii1lI00000oIO instanceof OIiolOlo1iI) {
/* 153 */                       I0ol0lI.I0000Il00O(i0ol0lII00000oIO, ((OIiolOlo1iI) l1looiii1lI00000oIO).I00000oIO);
                            } else {
/* 159 */                       if (!(l1looiii1lI00000oIO instanceof OIio1O0ll0I)) {
/* 294 */                           I000II.I00000oIO();
/* 13 */                            return null;
                                }
/* 165 */                       I0ol0lI.I00000oIO(i0ol0lII00000oIO, ((OIio1O0ll0I) l1looiii1lI00000oIO).I00000oIO);
                            }
/* 168 */                   I0ol0lI i0ol0lII00000oIO2 = I0olIlI11.I00000oIO();
/* 189 */                   float fIntBitsToFloat = Float.intBitsToFloat((int) (iIi11Illi1I.I00iOIl.I0000oI00() & 4294967295L)) - fI00000oIO;
/* 198 */                   float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iIi11Illi1I.I00iOIl.I0000oI00() >> 32));
/* 211 */                   float fIntBitsToFloat3 = Float.intBitsToFloat((int) (iIi11Illi1I.I00iOIl.I0000oI00() & 4294967295L));
/* 215 */                   OO0I1o1I[] oO0I1o1IArr = OO0I1o1I.I00iOIl;
/* 222 */                   if (Float.isNaN(0.0f) || Float.isNaN(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat3)) {
/* 244 */                       I0olIlI11.I00000oOI("Invalid rectangle, make sure no value is NaN");
                            }
/* 247 */                   RectF rectF = i0ol0lII00000oIO2.I00000oOI;
/* 249 */                   if (rectF == null) {
/* 253 */                       rectF = new RectF();
/* 256 */                       i0ol0lII00000oIO2.I00000oOI = rectF;
                            }
/* 258 */                   rectF.set(0.0f, fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3);
/* 267 */                   i0ol0lII00000oIO2.I00000oIO.addRect(i0ol0lII00000oIO2.I00000oOI, Path.Direction.CCW);
/* 270 */                   I0ol0lI i0ol0lII00000oIO3 = I0olIlI11.I00000oIO();
/* 274 */                   i0ol0lII00000oIO3.I000II(i0ol0lII00000oIO2, i0ol0lII00000oIO, 1);
/* 279 */                   IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(i3);
/* 282 */                   iiioilIl1Il.I00iiI = i0ol0lII00000oIO3;
/* 284 */                   iiioilIl1Il.I00iiO = iol1I0loo0;
/* 286 */                   VarHandle.storeStoreFence();
/* 289 */                   return iIi11Illi1I.I00000oOI(iiioilIl1Il);
                        default:
/* 21 */                    IoloiIIo0l ioloiIIo0l = (IoloiIIo0l) obj2;
/* 25 */                    OIOOl1i101lO oIOOl1i101lO = (OIOOl1i101lO) ((OIOOiOOI0oOi) obj);
/* 27 */                    OOo010ill oOo010ill = oIOOl1i101lO.I00000oOI;
/* 29 */                    if (oOo010ill != null) {
/* 31 */                        oOo010ill.closeConnection();
/* 34 */                        oIOOl1i101lO.I00000oOI = null;
                            }
/* 36 */                    OI110O0 oi110o02 = ioloiIIo0l.I0000O;
/* 38 */                    Object[] objArr2 = oi110o02.I00iOIl;
/* 40 */                    int i6 = oi110o02.I00iiO;
                            while (true) {
/* 42 */                        if (i4 >= i6) {
/* 58 */                            i4 = -1;
                                } else if (!O0000Ioio00.I0000O((i000iilOi) objArr2[i4], oIOOl1i101lO)) {
/* 55 */                            i4++;
                                }
                            }
/* 59 */                    if (i4 >= 0) {
/* 61 */                        oi110o02.I000l1(i4);
                            }
/* 66 */                    if (oi110o02.I00iiO == 0) {
/* 70 */                        ioloiIIo0l.I00000oOI.invoke();
                            }
/* 73 */                    return ooiIlOl1iI;
                    }
                }
            }
