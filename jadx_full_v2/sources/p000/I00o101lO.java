            package p000;

            import android.content.Context;
            import android.view.accessibility.AccessibilityManager;
            import android.webkit.ConsoleMessage;
            import android.widget.Toast;
            import androidx.work.impl.model.Dependency;
            import com.google.ai.edge.gallery.customtasks.agentchat.AgentTools;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public final class I00o101lO implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public I00o101lO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    Object value;
                    int iNextIndex;
/* 3 */             int i = this.I00iOIl;
/* 5 */             boolean zBooleanValue = true;
/* 6 */             int i2 = 2;
/* 8 */             int i3 = 0;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 1168 */                  ((OI0lOIiOIOOo) this.I00iiI).I00000oOI((OOIII1l) this.I00iiO);
                            break;
                        case 1:
/* 1139 */                  Function1 function1 = (Function1) this.I00iiI;
/* 1143 */                  OI1lOo oI1lOo = (OI1lOo) this.I00iiO;
/* 1147 */                  Throwable th = (Throwable) obj;
/* 1149 */                  function1.invoke(th);
/* 1152 */                  oI1lOo.invoke(th);
                            break;
                        case 2:
/* 1050 */                  O10oloo01 o10oloo01 = (O10oloo01) this.I00iiI;
/* 1054 */                  AccessibilityManager accessibilityManager = (AccessibilityManager) this.I00iiO;
/* 1062 */                  if (((O0oOOiI0) obj) == O0oOOiI0.ON_RESUME) {
/* 1064 */                      o10oloo01.getClass();
/* 1077 */                      o10oloo01.I00iiO.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
/* 1080 */                      accessibilityManager.addAccessibilityStateChangeListener(o10oloo01);
/* 1083 */                      O10ol0 o10ol0 = o10oloo01.I00iio;
/* 1085 */                      if (o10ol0 != null) {
/* 1097 */                          o10ol0.I00iOIl.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
/* 1100 */                          accessibilityManager.addTouchExplorationStateChangeListener(o10ol0);
                                }
/* 1103 */                      O10oilolI o10oilolI = o10oloo01.I00ilI0I1;
/* 1105 */                      if (o10oilolI != null) {
/* 1117 */                          o10oilolI.I00000oIO.setValue(Boolean.valueOf(O10oloo01.I00000oIO(accessibilityManager)));
/* 1130 */                          o10oilolI.I00000oOI.setValue(Boolean.valueOf(O10oloo01.I00000oOI(accessibilityManager)));
/* 1133 */                          accessibilityManager.addAccessibilityServicesStateChangeListener(o10oilolI);
                                    break;
                                }
                            }
                            break;
                        case 3:
/* 1011 */                  O1i1O1I o1i1O1I = (O1i1O1I) this.I00iiI;
/* 1015 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 1019 */                  Oo0OI01Il oo0OI01Il = (Oo0OI01Il) obj;
/* 1029 */                  String str = ((Oo0OI01Il) oI10i0Il.getValue()).I00000oIO.I00iiI;
/* 1031 */                  oI10i0Il.setValue(oo0OI01Il);
/* 1042 */                  if (!O0000Ioio00.I0000O(oo0OI01Il.I00000oIO.I00iiI, str)) {
/* 1044 */                      o1i1O1I.I0001Ioi1lo();
                                break;
                            }
                            break;
                        case 4:
/* 993 */                   String str2 = (String) this.I00iiI;
/* 997 */                   IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iiO;
/* 1001 */                  String str3 = (String) obj;
/* 1003 */                  if (str2 != null) {
/* 1005 */                      illiIl1l11O.invoke(str2, str3);
                                break;
                            }
                            break;
                        case 5:
/* 954 */                   Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00iiI;
/* 958 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 962 */                   Oo0OI01Il oo0OI01Il2 = (Oo0OI01Il) obj;
/* 972 */                   String str4 = ((Oo0OI01Il) oI10i0Il2.getValue()).I00000oIO.I00iiI;
/* 974 */                   oI10i0Il2.setValue(oo0OI01Il2);
/* 985 */                   if (!O0000Ioio00.I0000O(oo0OI01Il2.I00000oIO.I00iiI, str4)) {
/* 987 */                       ol0o1OiOIIIl.I00100o1O0lo(null);
                                break;
                            }
                            break;
                        case 6:
/* 715 */                   O11OliOlOII o11OliOlOII = (O11OliOlOII) this.I00iiI;
/* 719 */                   O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iiO;
/* 723 */                   ConsoleMessage consoleMessage = (ConsoleMessage) obj;
/* 725 */                   if (consoleMessage != null) {
/* 729 */                       ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
/* 744 */                       int i4 = messageLevel == null ? -1 : I0iO1Ioo.I00000oIO[messageLevel.ordinal()];
/* 762 */                       O1I10OIO o1i10oio = i4 != 1 ? i4 != 2 ? i4 != 3 ? O1I10OIO.I00iOIl : O1I10OIO.I00iiI : O1I10OIO.I00iiO : O1I10OIO.I00iOIl;
/* 764 */                       String strSourceId = consoleMessage.sourceId();
/* 768 */                       int iLineNumber = consoleMessage.lineNumber();
/* 772 */                       String strMessage = consoleMessage.message();
/* 776 */                       O1I10Iii0l o1I10Iii0l = new O1I10Iii0l();
/* 779 */                       o1I10Iii0l.I00000oIO = o1i10oio;
/* 781 */                       o1I10Iii0l.I00000oOI = strSourceId;
/* 783 */                       o1I10Iii0l.I0000Il00O = iLineNumber;
/* 785 */                       o1I10Iii0l.I0000O = strMessage;
/* 787 */                       VarHandle.storeStoreFence();
/* 790 */                       OlO0OIIl1 olO0OIIl1 = o11OliOlOII.I00000oOI;
/* 802 */                       LinkedHashMap linkedHashMap = new LinkedHashMap(((IO1looOIi) olO0OIIl1.getValue()).I0000O);
/* 805 */                       String str5 = o1oIOiI11o0.I00000oIO;
/* 811 */                       List list = (List) linkedHashMap.get(str5);
/* 825 */                       ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
/* 832 */                       if (!arrayList.isEmpty()) {
/* 838 */                           ListIterator listIterator = arrayList.listIterator(arrayList.size());
                                    while (true) {
/* 846 */                               if (!listIterator.hasPrevious()) {
/* 863 */                                   iNextIndex = -1;
                                        } else if (((IO1OO01i0) listIterator.previous()) instanceof IO1OioOO1III) {
/* 858 */                                   iNextIndex = listIterator.nextIndex();
                                        }
                                    }
/* 864 */                           if (iNextIndex != -1) {
/* 870 */                               IO1OioOO1III iO1OioOO1III = (IO1OioOO1III) arrayList.get(iNextIndex);
/* 907 */                               arrayList.set(iNextIndex, new IO1OioOO1III(iO1OioOO1III.I000II, iO1OioOO1III.I000O01llI0, iO1OioOO1III.I000OOo1O, iO1OioOO1III.I000OiO, iO1OioOO1III.I000iOII, IOOi0Ool1i.I00OI1(iO1OioOO1III.I000l1, o1I10Iii0l), iO1OioOO1III.I000lI));
                                    }
                                }
/* 910 */                       linkedHashMap.put(str5, arrayList);
/* 940 */                       do {
/* 913 */                           value = olO0OIIl1.getValue();
/* 940 */                       } while (!olO0OIIl1.I000iOII(value, IO1looOIi.I00000oIO((IO1looOIi) olO0OIIl1.getValue(), false, false, false, linkedHashMap, 23)));
/* 942 */                       consoleMessage.message();
/* 945 */                       consoleMessage.lineNumber();
/* 948 */                       consoleMessage.sourceId();
                                break;
                            }
                            break;
                        case 7:
/* 709 */                   ((O11OliOlOII) this.I00iiI).I0000oI00((O1oIOiI11o0) obj, new IO1i10ilI((String) this.I00iiO));
                            break;
                        case 8:
/* 673 */                   I1O0IlI1 i1O0IlI1 = (I1O0IlI1) this.I00iiI;
/* 677 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiO;
/* 685 */                   i1O0IlI1.I0000Il00O.I00O10llo((OO0l0IioO1) obj);
/* 688 */                   oI10i0Il3.setValue(null);
                            break;
                        case 9:
/* 667 */                   IO0O0o0O1Ol.I0000oI00((O11OliOlOII) this.I00iiI, (O1oIOiI11o0) obj, (AgentTools) this.I00iiO);
                            break;
                        case 10:
/* 572 */                   I0l10OiIOil i0l10OiIOil = (I0l10OiIOil) this.I00iiI;
/* 576 */                   I0l1I0I0i10I i0l1I0I0i10I = (I0l1I0I0i10I) this.I00iiO;
/* 582 */                   long j = ((IilIiOlii) obj).I00000oIO;
/* 584 */                   Boolean bool = i0l10OiIOil.I010i10l;
/* 586 */                   if (bool != null) {
/* 607 */                       zBooleanValue = bool.booleanValue();
                            } else if (il0lI1i1olii.I000O01llI0(i0l10OiIOil).I00oo1iO0ll != O0iOOoiioO.I00iiI || i0l10OiIOil.I00o101lO != OIilII.I00iiI) {
/* 605 */                       zBooleanValue = false;
                            }
/* 615 */                   long jI000O01llI0 = OIOlIiiioi.I000O01llI0(zBooleanValue ? -1.0f : 1.0f, j);
/* 2 */                     i0l1I0I0i10I.I00000oIO(i0l10OiIOil.I010OIo1l.I0000oI00(Float.intBitsToFloat((int) (i0l10OiIOil.I00o101lO == OIilII.I00iOIl ? jI000O01llI0 & 4294967295L : jI000O01llI0 >> 32))), 0.0f);
                            break;
                        case 11:
/* 519 */                   O0oIo1 o0oIo1 = (O0oIo1) this.I00iiI;
/* 523 */                   I0olOi00O i0olOi00O = (I0olOi00O) this.I00iiO;
/* 533 */                   I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(i2);
/* 536 */                   i0OIOO00l0O.I00iiI = i0olOi00O;
/* 538 */                   VarHandle.storeStoreFence();
/* 541 */                   IoloiIIo0l ioloiIIo0l = new IoloiIIo0l();
/* 544 */                   ioloiIIo0l.I00000oIO = o0oIo1;
/* 546 */                   ioloiIIo0l.I00000oOI = i0OIOO00l0O;
/* 553 */                   ioloiIIo0l.I0000Il00O = new Object();
/* 564 */                   ioloiIIo0l.I0000O = new OI110O0(new i000iilOi[16]);
/* 566 */                   VarHandle.storeStoreFence();
                            break;
                        case 12:
/* 495 */                   OO1lio oO1lio = (OO1lio) this.I00iiI;
/* 505 */                   oO1lio.setPositionProvider((OO1ll1) this.I00iiO);
/* 508 */                   oO1lio.I0010o();
                            break;
                        case 13:
/* 489 */                   ((O0iiOioolIi) this.I00iiI).I00iIO(((O1ooiI111i) obj).I0000O((O1ooiI111i) this.I00iiO));
                            break;
                        case 14:
/* 443 */                   I1iOI11ioi1 i1iOI11ioi1 = (I1iOI11ioi1) this.I00iiI;
/* 447 */                   Context context = (Context) this.I00iiO;
/* 457 */                   if (!((Boolean) obj).booleanValue()) {
/* 469 */                       Toast.makeText(context, "Microphone permission required", 0).show();
                                break;
                            } else {
/* 459 */                       i1iOI11ioi1.I000OOo1O();
                                break;
                            }
                        case 15:
/* 412 */                   I1liOilllO i1liOilllO = (I1liOilllO) this.I00iiI;
/* 416 */                   I1liOl0 i1liOl0 = (I1liOl0) this.I00iiO;
/* 422 */                   Oo10Oioll0 oo10Oioll0 = i1liOilllO.I00o0iI0io1;
/* 424 */                   if (oo10Oioll0 != null) {
/* 426 */                       oo10Oioll0.I00000oOI();
                            }
/* 429 */                   i1liOilllO.I00o0iI0io1 = null;
/* 431 */                   IOi10loi iOi10loi = i1liOl0.I00000oOI;
/* 433 */                   if (iOi10loi != null) {
/* 435 */                       iOi10loi.I00O10llo(ooiIlOl1iI);
                            }
/* 438 */                   i1liOl0.I00000oOI = null;
                            break;
                        case 16:
/* 384 */                   I1lo10iOI i1lo10iOI = (I1lo10iOI) this.I00iiI;
/* 388 */                   IOioOOiI0l00 iOioOOiI0l00 = (IOioOOiI0l00) this.I00iiO;
/* 394 */                   i1lo10iOI.I00000oIO(iOioOOiI0l00);
/* 399 */                   I1loO00 i1loO00 = new I1loO00(i3);
/* 402 */                   i1loO00.I00000oOI = i1lo10iOI;
/* 404 */                   i1loO00.I0000Il00O = iOioOOiI0l00;
/* 406 */                   VarHandle.storeStoreFence();
                            break;
                        case 17:
/* 355 */                   Ii0l0Olio10 ii0l0Olio10 = (Ii0l0Olio10) this.I00iiI;
/* 359 */                   I1o1Ii0I i1o1Ii0I = (I1o1Ii0I) this.I00iiO;
/* 367 */                   ii0l0Olio10.I0000oI00.invoke(null);
/* 373 */                   I0IOIo0 i0IOIo0 = new I0IOIo0(4);
/* 376 */                   i0IOIo0.I00000oOI = i1o1Ii0I;
/* 378 */                   VarHandle.storeStoreFence();
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 333 */                   Oo0OI01Il oo0OI01Il3 = (Oo0OI01Il) this.I00iiI;
/* 337 */                   Function1 function12 = (Function1) this.I00iiO;
/* 341 */                   Oo0OI01Il oo0OI01Il4 = (Oo0OI01Il) obj;
/* 347 */                   if (!O0000Ioio00.I0000O(oo0OI01Il3, oo0OI01Il4)) {
/* 349 */                       function12.invoke(oo0OI01Il4);
                                break;
                            }
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 327 */                   OO11o0IO.I0010o((OO11o0IO) obj, (OO1I0001000i) this.I00iiI, 0, 0, ((II0oOiiIO) this.I00iiO).I00o0iI0io1, 4);
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 286 */                   I0ol0lI i0ol0lI = (I0ol0lI) this.I00iiI;
/* 291 */                   OlI00IIlOO olI00IIlOO = (OlI00IIlOO) this.I00iiO;
/* 295 */                   O0iiliOio o0iiliOio = (O0iiliOio) obj;
/* 297 */                   o0iiliOio.I00000oOI();
/* 305 */                   IilloIOOO0i.I00OIo(o0iiliOio, i0ol0lI, olI00IIlOO, 0.0f, null, null, 60);
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 258 */                   OIio1O0ll0I oIio1O0ll0I = (OIio1O0ll0I) this.I00iiI;
/* 263 */                   OlI00IIlOO olI00IIlOO2 = (OlI00IIlOO) this.I00iiO;
/* 267 */                   O0iiliOio o0iiliOio2 = (O0iiliOio) obj;
/* 269 */                   o0iiliOio2.I00000oOI();
/* 279 */                   IilloIOOO0i.I00OIo(o0iiliOio2, oIio1O0ll0I.I00000oIO, olI00IIlOO2, 0.0f, null, null, 60);
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 252 */                   ((OI110O0) ((Oi00IilOloo0) this.I00iiI).I00iOIl).I000iOII((IOoO0I1OIoi) this.I00iiO);
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 204 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiI;
/* 208 */                   OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iiO;
/* 212 */                   Boolean bool2 = (Boolean) obj;
/* 214 */                   bool2.getClass();
/* 217 */                   oI10i0Il4.setValue(bool2);
/* 230 */                   if (!((Boolean) oI10i0Il4.getValue()).booleanValue()) {
/* 232 */                       oIooi1iOiOol.I000O01llI0(0);
                                break;
                            }
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 198 */                   ((O11iO00I1o) this.I00iiI).I0000oI00((O1oIOiI11o0) this.I00iiO, new IO1i10ilI(Oi010OO0.I000oI1ioi(((Integer) obj).intValue(), "Live camera session ended. Average FPS: ")));
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 150 */                   Ol1o1llOII ol1o1llOII = (Ol1o1llOII) this.I00iiI;
/* 154 */                   II11OlOIOOOl iI11OlOIOOOl = (II11OlOIOOOl) this.I00iiO;
/* 158 */                   Boolean bool3 = (Boolean) obj;
/* 160 */                   bool3.getClass();
/* 167 */                   ol1o1llOII.put(iI11OlOIOOOl.I0000Il00O.I00000oOI, bool3);
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 91 */                    O0oIlOolIO o0oIlOolIO = (O0oIlOolIO) this.I00iiI;
/* 96 */                    III11l1I iII11l1I = (III11l1I) this.I00iiO;
/* 100 */                   O0iiliOio o0iiliOio3 = (O0iiliOio) obj;
/* 102 */                   o0iiliOio3.I00000oOI();
/* 117 */                   if (((Boolean) o0oIlOolIO.I0010o.getValue()).booleanValue() || ((Boolean) o0oIlOolIO.I00111O.getValue()).booleanValue()) {
/* 144 */                       IilloIOOO0i.I00oII(o0iiliOio3, iII11l1I, 0L, 0L, 0.0f, null, null, 0, 126);
                                break;
                            }
                            break;
                        case 27:
/* 57 */                    IIiOOI iIiOOI = (IIiOOI) this.I00iiI;
/* 61 */                    IOi10loi iOi10loi2 = (IOi10loi) this.I00iiO;
/* 65 */                    Throwable th2 = (Throwable) obj;
/* 67 */                    if (th2 == null) {
/* 85 */                        iIiOOI.I00000oOI(iOi10loi2.I00II0Ol1O0l());
                                break;
                            } else if (!(th2 instanceof CancellationException)) {
/* 77 */                        iIiOOI.I0000O(th2);
                                break;
                            } else {
/* 73 */                        iIiOOI.I0000Il00O();
                                break;
                            }
                        case PoseLandmark.RIGHT_ANKLE:
/* 34 */                    Function1 function13 = (Function1) this.I00iiI;
/* 42 */                    Oo0OI01Il oo0OI01Il5 = (Oo0OI01Il) obj;
/* 44 */                    ((OI10i0Il) this.I00iiO).setValue(oo0OI01Il5);
/* 51 */                    function13.invoke(oo0OI01Il5.I00000oIO.I00iiI);
                            break;
                        default:
/* 28 */                    ((IiO010ll00Oi) this.I00iiI).I00000oOI.I0000O((Olil0III) obj, (Dependency) this.I00iiO);
                            break;
                    }
/* 31 */            return ooiIlOl1iI;
                }
            }
