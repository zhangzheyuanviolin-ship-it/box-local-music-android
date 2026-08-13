            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.hardware.camera2.CameraManager;
            import android.os.Bundle;
            import android.view.KeyEvent;
            import android.view.accessibility.AccessibilityManager;
            import androidx.work.impl.WorkDatabase;
            import com.google.ai.edge.gallery.data.AllowedSkill;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.UUID;
            import kotlin.jvm.functions.Function1;
            
            public final class I01ii1IIl implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public I01ii1IIl(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    Oil000 oil000;
                    O0iiOioolIi o0iiOioolIi;
                    OOo0IO oOo0IO;
/* 9 */             int i = 0;
/* 12 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 1085 */                  IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iiI;
/* 1089 */                  OIOo1iiI oIOo1iiI = (OIOo1iiI) this.I00iiO;
/* 1091 */                  illOOo00lI.invoke();
/* 1094 */                  oIOo1iiI.invoke();
/* 1097 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 1054 */                  O10oloo01 o10oloo01 = (O10oloo01) this.I00iiI;
/* 1058 */                  AccessibilityManager accessibilityManager = (AccessibilityManager) this.I00iiO;
/* 1060 */                  o10oloo01.getClass();
/* 1063 */                  accessibilityManager.removeAccessibilityStateChangeListener(o10oloo01);
/* 1066 */                  O10ol0 o10ol0 = o10oloo01.I00iio;
/* 1068 */                  if (o10ol0 != null) {
/* 1070 */                      accessibilityManager.removeTouchExplorationStateChangeListener(o10ol0);
                            }
/* 1073 */                  O10oilolI o10oilolI = o10oloo01.I00ilI0I1;
/* 1075 */                  if (o10oilolI != null) {
/* 1077 */                      accessibilityManager.removeAccessibilityServicesStateChangeListener(o10oilolI);
                            }
/* 1080 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 1046 */                  ((OIoO1Ol) this.I00iiI).invoke((I0II0i00l) this.I00iiO);
/* 1049 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 1023 */                  O1i1O1I o1i1O1I = (O1i1O1I) this.I00iiO;
/* 1027 */                  IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00iiI;
/* 1029 */                  o1i1O1I.I0001Ioi1lo();
/* 1032 */                  illOOo00lI2.invoke();
/* 1035 */                  return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 998 */                   O1i1O1I o1i1O1I2 = (O1i1O1I) this.I00iiI;
/* 1012 */                  ((OI10i0Il) this.I00iiO).setValue(new Oo0OI01Il(6, 0L, ""));
/* 1015 */                  o1i1O1I2.I0001Ioi1lo();
/* 1018 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 990 */                   ((I101liloIo1) this.I00iiI).I00000oIO(((AllowedSkill) this.I00iiO).getAttributionUrl());
/* 993 */                   return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 972 */                   ((Function1) this.I00iiI).invoke((AllowedSkill) this.I00iiO);
/* 975 */                   return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 959 */                   return Boolean.valueOf(I0lio1O01i01.I0001Ioi1lo((I0lio1O01i01) this.I00iiI, (KeyEvent) this.I00iiO));
                        case 8:
/* 749 */                   OiOilOo0io oiOilOo0io = (OiOilOo0io) this.I00iiI;
/* 753 */                   I0ll1oo i0ll1oo = (I0ll1oo) this.I00iiO;
/* 755 */                   OiOi0l oiOi0l = oiOilOo0io.I00ilI0I1;
/* 757 */                   OiOi0l oiOi0l2 = oiOilOo0io.I00ilO0;
/* 759 */                   Float f = oiOilOo0io.I00iiO;
/* 761 */                   Float f2 = oiOilOo0io.I00iio;
/* 785 */                   float fFloatValue = (oiOi0l == null || f == null) ? 0.0f : ((Number) oiOi0l.I00000oIO.invoke()).floatValue() - f.floatValue();
/* 808 */                   float fFloatValue2 = (oiOi0l2 == null || f2 == null) ? 0.0f : ((Number) oiOi0l2.I00000oIO.invoke()).floatValue() - f2.floatValue();
/* 811 */                   if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
/* 820 */                       int iI001i1O0Ol = i0ll1oo.I001i1O0Ol(oiOilOo0io.I00iOIl);
/* 834 */                       Oil00l oil00l = (Oil00l) i0ll1oo.I000o00OoI0I().I00000oOI(i0ll1oo.I00li1OI);
/* 836 */                       if (oil00l != null) {
                                    try {
/* 838 */                               I01oII0IOOO i01oII0IOOO = i0ll1oo.I00lli11;
/* 840 */                               if (i01oII0IOOO != null) {
/* 848 */                                   i01oII0IOOO.I00000oIO.setBoundsInScreen(i0ll1oo.I0001Ioi1lo(oil00l));
                                        }
                                    } catch (IllegalStateException unused) {
                                    }
                                }
/* 861 */                       Oil00l oil00l2 = (Oil00l) i0ll1oo.I000o00OoI0I().I00000oOI(i0ll1oo.I00ll1);
/* 863 */                       if (oil00l2 != null) {
                                    try {
/* 865 */                               I01oII0IOOO i01oII0IOOO2 = i0ll1oo.I00lll10;
/* 867 */                               if (i01oII0IOOO2 != null) {
/* 875 */                                   i01oII0IOOO2.I00000oIO.setBoundsInScreen(i0ll1oo.I0001Ioi1lo(oil00l2));
                                        }
                                    } catch (IllegalStateException unused2) {
                                    }
                                }
/* 880 */                       i0ll1oo.I00iio.invalidate();
/* 891 */                       Oil00l oil00l3 = (Oil00l) i0ll1oo.I000o00OoI0I().I00000oOI(iI001i1O0Ol);
/* 893 */                       if (oil00l3 != null && (oil000 = oil00l3.I00000oIO) != null && (o0iiOioolIi = oil000.I0000Il00O) != null) {
/* 903 */                           if (oiOi0l != null) {
/* 907 */                               i0ll1oo.I00o0l1o1o0.I000OOo1O(iI001i1O0Ol, oiOi0l);
                                    }
/* 910 */                           if (oiOi0l2 != null) {
/* 914 */                               i0ll1oo.I00o101lO.I000OOo1O(iI001i1O0Ol, oiOi0l2);
                                    }
/* 917 */                           i0ll1oo.I0010I0i(o0iiOioolIi);
                                }
                            }
/* 920 */                   if (oiOi0l != null) {
/* 930 */                       oiOilOo0io.I00iiO = (Float) oiOi0l.I00000oIO.invoke();
                            }
/* 932 */                   if (oiOi0l2 != null) {
/* 942 */                       oiOilOo0io.I00iio = (Float) oiOi0l2.I00000oIO.invoke();
                            }
/* 944 */                   return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 742 */                   ((OOo0ooi) this.I00iiO).I00iOIl = ((IllOOo00lI) this.I00iiI).invoke();
/* 744 */                   return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 724 */                   ((IO1010) this.I00iiI).I000lI(this.I00iiO);
/* 727 */                   return OoiIlOl1iI.I00000oIO;
                        case 11:
/* 701 */                   OIooO1iiliI oIooO1iiliI = (OIooO1iiliI) this.I00iiI;
/* 705 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 707 */                   oIooO1iiliI.I000O01llI0(0.0f);
/* 712 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 715 */                   return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 694 */                   ((IOioOOiI0l00) this.I00iiO).I0000Il00O = (IllOOo00lI) this.I00iiI;
/* 696 */                   return OoiIlOl1iI.I00000oIO;
                        case 13:
/* 659 */                   I1o01l i1o01l = (I1o01l) this.I00iiI;
/* 663 */                   O0iiliOio o0iiliOio = (O0iiliOio) this.I00iiO;
/* 681 */                   i1o01l.I00ol1 = i1o01l.I00oI0i.I00000oIO(o0iiliOio.I00iOIl.I0000oI00(), o0iiliOio.getLayoutDirection(), o0iiliOio);
/* 683 */                   return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 605 */                   I1ool0o i1ool0o = (I1ool0o) this.I00iiI;
/* 609 */                   I1oI11I i1oI11I = (I1oI11I) this.I00iiO;
/* 611 */                   I1oolIoOllO i1oolIoOllO = i1ool0o.I00000oIO;
                            synchronized (i1oolIoOllO.I0000Il00O) {
/* 622 */                       if (i1oolIoOllO.I0000O.remove(i1oI11I) && i1oolIoOllO.I0000O.isEmpty()) {
/* 632 */                           IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 636 */                           int i2 = III11I000O.I00000oIO;
/* 638 */                           iIi0oIlI000II.getClass();
/* 645 */                           i1oolIoOllO.I00000oOI.unregisterReceiver(i1oolIoOllO.I0001Ioi1lo);
                                }
                            }
/* 652 */                   return OoiIlOl1iI.I00000oIO;
                        case 15:
/* 559 */                   Oo0OI01Il oo0OI01Il = (Oo0OI01Il) this.I00iiI;
/* 563 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 579 */                   if (!Oo0lI00l.I0000Il00O(oo0OI01Il.I00000oOI, ((Oo0OI01Il) oI10i0Il2.getValue()).I00000oOI) || !O0000Ioio00.I0000O(oo0OI01Il.I0000Il00O, ((Oo0OI01Il) oI10i0Il2.getValue()).I0000Il00O)) {
/* 597 */                       oI10i0Il2.setValue(oo0OI01Il);
                            }
/* 600 */                   return OoiIlOl1iI.I00000oIO;
                        case 16:
/* 499 */                   Oo0io0 oo0io0 = (Oo0io0) this.I00iiI;
/* 503 */                   I1111OO10i i1111OO10i = (I1111OO10i) this.I00iiO;
/* 505 */                   if (oo0io0 == null) {
/* 556 */                       return i1111OO10i;
                            }
/* 507 */                   Ol1o0O0O0 ol1o0O0O0 = oo0io0.I0000Il00O;
/* 509 */                   boolean zIsEmpty = ol1o0O0O0.isEmpty();
/* 513 */                   I1111OO10i i1111OO10i2 = oo0io0.I00000oOI;
/* 515 */                   if (!zIsEmpty) {
/* 520 */                       OloOoi0oolOl oloOoi0oolOl = new OloOoi0oolOl();
/* 523 */                       oloOoi0oolOl.I00000oIO = i1111OO10i2;
/* 525 */                       oloOoi0oolOl.I00000oOI = i1111OO10i2;
/* 527 */                       VarHandle.storeStoreFence();
/* 530 */                       int size = ol1o0O0O0.size();
/* 534 */                       while (i < size) {
/* 542 */                           ((Function1) ol1o0O0O0.get(i)).invoke(oloOoi0oolOl);
/* 545 */                           i++;
                                }
/* 548 */                       i1111OO10i2 = oloOoi0oolOl.I00000oOI;
                            }
/* 550 */                   oo0io0.I00000oOI = i1111OO10i2;
                            return i1111OO10i2 == null ? i1111OO10i : i1111OO10i2;
                        case 17:
/* 491 */                   iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, null, new I1oloI((Oo1o1iil) this.I00iiO, iOoil1iiIilo, i), 3);
/* 494 */                   return Boolean.TRUE;
                        case PoseLandmark.RIGHT_PINKY:
/* 430 */                   II0IOO1i iI0IOO1i = (II0IOO1i) this.I00iiI;
/* 434 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiO;
/* 436 */                   iI0IOO1i.I000lI(true);
/* 439 */                   FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 443 */                   if (firebaseAnalyticsI00000oIO != null) {
/* 445 */                       Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 451 */                       Bundle bundle = new Bundle();
/* 458 */                       bundle.putString("event_type", "view_benchmark_results");
/* 469 */                       bundle.putString("model_id", (String) oI10i0Il3.getValue());
/* 472 */                       firebaseAnalyticsI00000oIO.I00000oIO("button_clicked", bundle);
                            }
/* 475 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 301 */                   II10oli iI10oli = (II10oli) this.I00iiI;
/* 305 */                   O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iiO;
/* 307 */                   OlO0OIIl1 olO0OIIl1 = iI10oli.I00000oOI;
/* 309 */                   Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 313 */                   IOoil1iiIilo iOoil1iiIilo2 = null;
/* 320 */                   II10ili1 iI10ili1 = obj instanceof II10ili1 ? (II10ili1) obj : null;
/* 321 */                   if (iI10ili1 == null) {
/* 344 */                       olO0OIIl1.I000lI(null, II10ol01.I00000oIO((II10ol01) olO0OIIl1.getValue(), null, false, null, 0.0f, null, "Model not loaded — try re-initializing it.", false, 95));
                            } else {
/* 360 */                       String string = OlOoOIi0o.I00OIo(((II10ol01) olO0OIIl1.getValue()).I00000oIO).toString();
/* 368 */                       if (string.length() != 0 && !((II10ol01) olO0OIIl1.getValue()).I00000oOI) {
/* 404 */                           olO0OIIl1.I000lI(null, II10ol01.I00000oIO((II10ol01) olO0OIIl1.getValue(), null, true, "Starting", 0.0f, null, null, false, 1));
/* 423 */                           iI10oli.I0000O = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(iI10oli), IiiIil1lOIO.I00000oIO, null, new I0O0il1iIl(iI10ili1, string, iI10oli, iOoil1iiIilo2, 4), 2);
                                }
                            }
/* 425 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 257 */                   II10oli iI10oli2 = (II10oli) this.I00iiI;
/* 262 */                   Context context = (Context) this.I00iiO;
/* 272 */                   Bitmap bitmap = ((II10ol01) iI10oli2.I00000oOI.getValue()).I0000oI00;
/* 274 */                   if (bitmap != null) {
/* 277 */                       IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(iI10oli2);
/* 281 */                       IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 292 */                       iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new I0O0il1iIl(context, iI10oli2, bitmap, (IOoil1iiIilo) null, 5), 2);
                            }
/* 295 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_THUMB:
/* 220 */                   Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00iiI;
/* 224 */                   Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 240 */                   if (((Boolean) ol010000lo00.I0000Il00O.invoke(Ol010l0o0O.I00iiO)).booleanValue()) {
/* 248 */                       iOi1II01i0.I0000O(ii0110, null, null, new II1OIi(ol010000lo00, iOoil1iiIilo, 5), 3);
                            }
/* 251 */                   return Boolean.TRUE;
                        case PoseLandmark.RIGHT_THUMB:
/* 188 */                   OOo0lO oOo0lO = (OOo0lO) this.I00iiI;
/* 192 */                   II1o0111IO0 iI1o0111IO0 = (II1o0111IO0) this.I00iiO;
/* 194 */                   float f3 = oOo0lO.I00iOIl;
/* 200 */                   if (f3 <= -140.0f) {
/* 202 */                       iI1o0111IO0.I000O01llI0(true);
                            } else if (f3 >= 140.0f) {
/* 212 */                       iI1o0111IO0.I000O01llI0(false);
                            }
/* 215 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_HIP:
/* 144 */                   IllOOo00lI illOOo00lI3 = (IllOOo00lI) this.I00iiI;
/* 148 */                   OIIlIII0Ili oIIlIII0Ili = (OIIlIII0Ili) this.I00iiO;
/* 150 */                   if (illOOo00lI3 != null && (oOo0IO = (OOo0IO) illOOo00lI3.invoke()) != null) {
/* 161 */                       return oOo0IO;
                            }
/* 169 */                   if (!oIIlIII0Ili.I0110OiO().I00lll10) {
/* 172 */                       oIIlIII0Ili = null;
                            }
/* 173 */                   if (oIIlIII0Ili != null) {
/* 181 */                       return lIl0looO.I00000oIO(0L, l000O1l.I00000oOI(oIIlIII0Ili.I00iiO));
                            }
/* 12 */                    return null;
                        case PoseLandmark.RIGHT_HIP:
/* 136 */                   ((IIi111) this.I00iiI).I00o101lO.invoke((IIi11Illi1I) this.I00iiO);
/* 139 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_KNEE:
/* 120 */                   ((CameraManager) this.I00iiI).unregisterAvailabilityCallback((IIilI0OO) this.I00iiO);
/* 123 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_KNEE:
/* 106 */                   ((IIioo1) this.I00iiI).I00iiO.unregisterAvailabilityCallback((IIioliiI) this.I00iiO);
/* 109 */                   return OoiIlOl1iI.I00000oIO;
                        case 27:
/* 90 */                    ((CameraManager) this.I00iiI).unregisterAvailabilityCallback((IIioliiI) this.I00iiO);
/* 93 */                    return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_ANKLE:
/* 45 */                    i01IlOO i01iloo = (i01IlOO) this.I00iiI;
/* 49 */                    UUID uuid = (UUID) this.I00iiO;
/* 51 */                    WorkDatabase workDatabase = i01iloo.I0000Il00O;
/* 57 */                    I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(15);
/* 60 */                    i0iOo0oioiO.I00iiI = i01iloo;
/* 62 */                    i0iOo0oioiO.I00iiO = uuid;
/* 64 */                    VarHandle.storeStoreFence();
/* 67 */                    workDatabase.I0010I0i(i0iOo0oioiO);
/* 76 */                    OiOIOI.I00000oOI(i01iloo.I00000oOI, i01iloo.I0000Il00O, i01iloo.I0000oI00);
/* 79 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 18 */                    IO1OIo01l1 iO1OIo01l1 = (IO1OIo01l1) this.I00iiI;
/* 22 */                    Context context2 = (Context) this.I00iiO;
/* 24 */                    IOO11li1OoII iOO11li1OoIII00000oIO2 = OooiooIOO.I00000oIO(iO1OIo01l1);
/* 28 */                    IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 37 */                    iOi1II01i0.I0000O(iOO11li1OoIII00000oIO2, Ii1oo1ooill0.I00iiI, null, new IO1OIi1110(iO1OIo01l1, context2, null), 2);
/* 40 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
