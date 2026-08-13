            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.database.Cursor;
            import android.net.Uri;
            import android.view.MotionEvent;
            import androidx.work.impl.model.Preference;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.ai.edge.gallery.data.local.entities.RagChunkEntity;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
/* 10 */    public final class O1lIIi implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public O1lIIi(O0oiOi o0oiOi, OilIoI11 oilIoI11) {
/* 2 */             this.I00iOIl = 0;
/* 7 */             this.I00iiI = o0oiOi;
/* 9 */             this.I00iiO = oilIoI11;
                }

                /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) throws Exception {
                    Uri data;
                    I01O1lIi i01O1lIiI000iOII;
                    int columnIndex;
                    String strI00IioO0OiOi;
                    I01O1lIi i01O1lIiI000iOII2;
/* 9 */             int i = 4;
/* 20 */            int i2 = 1;
/* 22 */            int i3 = 3;
                    switch (this.I00iOIl) {
                        case 0:
/* 1595 */                  O0oiOi o0oiOi = (O0oiOi) this.I00iiI;
/* 1599 */                  OilIoI11 oilIoI11 = (OilIoI11) this.I00iiO;
/* 1607 */                  o0oiOi.I000iOII().I00li1OI(oilIoI11);
/* 1613 */                  I1loO00 i1loO00 = new I1loO00(5);
/* 1616 */                  i1loO00.I00000oOI = o0oiOi;
/* 1618 */                  i1loO00.I0000Il00O = oilIoI11;
/* 1620 */                  VarHandle.storeStoreFence();
/* 1623 */                  return i1loO00;
                        case 1:
/* 1559 */                  O1loIO o1loIO = (O1loIO) this.I00iiI;
/* 1564 */                  Context context = (Context) this.I00iiO;
/* 1567 */                  Uri uri = (Uri) obj;
/* 1569 */                  if (uri != null) {
/* 1571 */                      IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(o1loIO);
/* 1575 */                      IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 1587 */                      iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new IiI110i1O(o1loIO, context, uri, null, 24), 2);
                            }
/* 1590 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 1500 */                  OO1io0l0 oO1io0l0 = (OO1io0l0) this.I00iiI;
/* 1504 */                  O1loIO o1loIO2 = (O1loIO) this.I00iiO;
/* 1506 */                  OIOlIiiioi oIOlIiiioi = (OIOlIiiioi) obj;
/* 1517 */                  float f = 512.0f / ((int) (((Oll1OII0o) oO1io0l0).I00olI >> 32));
/* 1526 */                  float fIntBitsToFloat = Float.intBitsToFloat((int) (oIOlIiiioi.I00000oIO >> 32)) * f;
/* 1527 */                  long j = oIOlIiiioi.I00000oIO;
/* 1531 */                  int i4 = (int) (j & 4294967295L);
/* 1550 */                  o1loIO2.I0000oI00(fIntBitsToFloat, Float.intBitsToFloat(i4) * f, Float.intBitsToFloat((int) (j >> 32)) * f, Float.intBitsToFloat(i4) * f);
/* 1553 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 1469 */                  String str = (String) this.I00iiI;
/* 1473 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 1475 */                  Oil0O0I oil0O0I = (Oil0O0I) obj;
/* 1477 */                  Oil0Io.I0000O(oil0O0I, str);
/* 1490 */                  if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 1492 */                      Oil0Io.I000II(oil0O0I, 0);
                            }
/* 1495 */                  return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 1433 */                  O1o1io0oi0ol o1o1io0oi0ol = (O1o1io0oi0ol) this.I00iiI;
/* 1438 */                  Context context2 = (Context) this.I00iiO;
/* 1441 */                  Uri uri2 = (Uri) obj;
/* 1443 */                  if (uri2 != null) {
/* 1445 */                      IOO11li1OoII iOO11li1OoIII00000oIO2 = OooiooIOO.I00000oIO(o1o1io0oi0ol);
/* 1449 */                      IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 1461 */                      iOi1II01i0.I0000O(iOO11li1OoIII00000oIO2, Ii1oo1ooill0.I00iiI, null, new IiI110i1O(o1o1io0oi0ol, context2, uri2, null, 25), 2);
                            }
/* 1464 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 1311 */                  String str2 = ((OloIl1l1oOii) this.I00iiI).I00000oIO;
/* 1316 */                  O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiO;
/* 1321 */                  OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 1323 */                  String str3 = "tts";
/* 1325 */                  String str4 = "whisper";
/* 1327 */                  Intent intent = ((I0IIOOO1O) obj).I00iiI;
/* 1329 */                  if (intent != null && (data = intent.getData()) != null) {
/* 1342 */                      if (O0000Ioio00.I0000O(str2, "whisper")) {
/* 1344 */                          o1ol100o0O.getClass();
/* 1351 */                          IoI011li ioI011li = new IoI011li(i3);
/* 1354 */                          ioI011li.I00iiI = o1ol100o0O;
/* 1356 */                          VarHandle.storeStoreFence();
/* 1359 */                          IOO11li1OoII iOO11li1OoIII00000oIO3 = OooiooIOO.I00000oIO(o1ol100o0O);
/* 1363 */                          IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 1380 */                          iOi1II01i0.I0000O(iOO11li1OoIII00000oIO3, Ii1oo1ooill0.I00iiI, null, new I0O0Ooi10l(o1ol100o0O, data, "__whisper_imports", ioI011li, str4, null, 6), 2);
                                } else if (O0000Ioio00.I0000O(str2, "tts")) {
/* 1390 */                          o1ol100o0O.getClass();
/* 1397 */                          IoI011li ioI011li2 = new IoI011li(i);
/* 1400 */                          ioI011li2.I00iiI = o1ol100o0O;
/* 1402 */                          VarHandle.storeStoreFence();
/* 1405 */                          IOO11li1OoII iOO11li1OoIII00000oIO4 = OooiooIOO.I00000oIO(o1ol100o0O);
/* 1409 */                          IiI0oillOO10 iiI0oillOO104 = IiiIil1lOIO.I00000oIO;
/* 1426 */                          iOi1II01i0.I0000O(iOO11li1OoIII00000oIO4, Ii1oo1ooill0.I00iiI, null, new I0O0Ooi10l(o1ol100o0O, data, "__tts_imports", ioI011li2, str3, null, 6), 2);
                                }
                            }
/* 1429 */                  return ooiIlOl1iI;
                        case 6:
/* 1301 */                  ((IlliIl1l11O) this.I00iiI).invoke((O1oIOiI11o0) this.I00iiO, new O1oIo0iI00(ModelDownloadStatusType.FAILED, 0L, 0L, (String) obj, 0L, 0L, 54));
/* 1304 */                  return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 1267 */                  ((OI0i0O1IiiIO) this.I00iiI).I010OIo1l((Oil1IOoo1lI) this.I00iiO, obj);
/* 1270 */                  return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 1168 */                  OI1ilOI1ioo0 oI1ilOI1ioo0 = (OI1ilOI1ioo0) this.I00iiI;
/* 1174 */                  OI1i0llli oI1i0llli = ((OI1o1o1iO1l) this.I00iiO).I00000oOI;
/* 1176 */                  OII000iIloI0 oII000iIloI0 = (OII000iIloI0) obj;
/* 1178 */                  IIOOoI iIOOoI = oII000iIloI0.I00000oIO;
/* 1180 */                  iIOOoI.I00000oOI = 0;
/* 1182 */                  iIOOoI.I0000Il00O = 0;
/* 1186 */                  if (oI1ilOI1ioo0 instanceof OI1lo1liOO) {
/* 1188 */                      int i5 = OI1ilOI1ioo0.I00ilI0I1;
/* 1194 */                      Iterator it = l1iO11O10.I00000oOI(oI1ilOI1ioo0).iterator();
                                while (true) {
/* 1202 */                          if (it.hasNext()) {
/* 1208 */                              OI1ilOI1ioo0 oI1ilOI1ioo02 = (OI1ilOI1ioo0) it.next();
/* 1210 */                              OI1ilOI1ioo0 oI1ilOI1ioo0I0001Ioi1lo = oI1i0llli.I0001Ioi1lo();
/* 1224 */                              if (O0000Ioio00.I0000O(oI1ilOI1ioo02, oI1ilOI1ioo0I0001Ioi1lo != null ? oI1ilOI1ioo0I0001Ioi1lo.I00iiO : null)) {
                                        }
                                    } else {
/* 1227 */                              int i6 = OI1lo1liOO.I00io1l;
/* 1252 */                              oII000iIloI0.I00000oOI = ((OI1ilOI1ioo0) OilO1oiooiII.I000l1(OilO1oiooiII.I000OiO(oI1i0llli.I000II(), new OI1lOo(2)))).I00iiI.I00000oOI;
/* 1254 */                              oII000iIloI0.I0000Il00O = true;
                                    }
                                }
                            }
/* 1256 */                  return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 1144 */                  OlO01l1oOil olO01l1oOil = (OlO01l1oOil) this.I00iiI;
/* 1148 */                  IOl00O1iI1Oo iOl00O1iI1Oo = (IOl00O1iI1Oo) this.I00iiO;
/* 1155 */                  I1loO00 i1loO002 = new I1loO00(7);
/* 1158 */                  i1loO002.I00000oOI = olO01l1oOil;
/* 1160 */                  i1loO002.I0000Il00O = iOl00O1iI1Oo;
/* 1162 */                  VarHandle.storeStoreFence();
/* 1165 */                  return i1loO002;
                        case 10:
/* 1093 */                  OI1o1o1iO1l oI1o1o1iO1l = (OI1o1o1iO1l) this.I00iiO;
/* 1097 */                  O0oiOi o0oiOi2 = (O0oiOi) this.I00iiI;
/* 1101 */                  OI1i0llli oI1i0llli2 = oI1o1o1iO1l.I00000oOI;
/* 1103 */                  I01oi1lO0O1o i01oi1lO0O1o = oI1i0llli2.I0010I0i;
/* 1111 */                  if (!o0oiOi2.equals(oI1i0llli2.I000o00OoI0I)) {
/* 1114 */                      O0oiOi o0oiOi3 = oI1i0llli2.I000o00OoI0I;
/* 1116 */                      if (o0oiOi3 != null && (i01O1lIiI000iOII = o0oiOi3.I000iOII()) != null) {
/* 1124 */                          i01O1lIiI000iOII.I00ooIo0(i01oi1lO0O1o);
                                }
/* 1127 */                      oI1i0llli2.I000o00OoI0I = o0oiOi2;
/* 1133 */                      o0oiOi2.I000iOII().I00li1OI(i01oi1lO0O1o);
                            }
/* 1138 */                  return new I0olliO(3);
                        case 11:
/* 1072 */                  OlIl0i olIl0i = (OlIl0i) this.I00iiI;
/* 1076 */                  OOIoOo0O oOIoOo0O = (OOIoOo0O) this.I00iiO;
/* 1080 */                  olIl0i.I000II(null);
/* 1085 */                  ((OOIoO0IIOO0) oOIoOo0O).I000lI((IOo100ol1lIo) obj);
/* 1088 */                  return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 1026 */                  OIOliI oIOliI = (OIOliI) this.I00iiI;
/* 1030 */                  OO1I0001000i oO1I0001000i = (OO1I0001000i) this.I00iiO;
/* 1032 */                  OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 1034 */                  boolean z = oIOliI.I00o101lO;
/* 1036 */                  float f2 = oIOliI.I00o0iI0io1;
/* 1038 */                  if (z) {
/* 1050 */                      OO11o0IO.I000iOII(oO11o0IO, oO1I0001000i, oO11o0IO.I00l0OO0IO(f2), oO11o0IO.I00l0OO0IO(oIOliI.I00o0l1o1o0));
                            } else {
/* 1064 */                      oO11o0IO.I000O01llI0(oO1I0001000i, oO11o0IO.I00l0OO0IO(f2), oO11o0IO.I00l0OO0IO(oIOliI.I00o0l1o1o0), 0.0f);
                            }
/* 1067 */                  return OoiIlOl1iI.I00000oIO;
                        case 13:
/* 974 */                   OIOlio0llOo oIOlio0llOo = (OIOlio0llOo) this.I00iiI;
/* 979 */                   OO1I0001000i oO1I0001000i2 = (OO1I0001000i) this.I00iiO;
/* 982 */                   OO11o0IO oO11o0IO2 = (OO11o0IO) obj;
/* 992 */                   long j2 = ((IooO0O) oIOlio0llOo.I00o0iI0io1.invoke(oO11o0IO2)).I00000oIO;
/* 996 */                   if (oIOlio0llOo.I00o0l1o1o0) {
/* 1006 */                      OO11o0IO.I000l1(oO11o0IO2, oO1I0001000i2, (int) (j2 >> 32), (int) (j2 & 4294967295L), null, 12);
                            } else {
/* 1018 */                      OO11o0IO.I0010o(oO11o0IO2, oO1I0001000i2, (int) (j2 >> 32), (int) (j2 & 4294967295L), null, 12);
                            }
/* 1021 */                  return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 782 */                   Oo0100oi oo0100oi = (Oo0100oi) this.I00iiI;
/* 786 */                   OIo1Oi1l1lI oIo1Oi1l1lI = (OIo1Oi1l1lI) this.I00iiO;
/* 788 */                   O0iiliOio o0iiliOio = (O0iiliOio) obj;
/* 796 */                   long j3 = ((Ol0i1I) oo0100oi.get()).I00000oIO;
/* 801 */                   float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
/* 807 */                   if (fIntBitsToFloat2 > 0.0f) {
/* 811 */                       float fI00i0ilIl0i = o0iiliOio.I00i0ilIl0i(4.0f);
/* 815 */                       IIolilIo iIolilIo = o0iiliOio.I00iOIl;
/* 825 */                       float fI00i0ilIl0i2 = o0iiliOio.I00i0ilIl0i(oIo1Oi1l1lI.I00000oOI(o0iiliOio.getLayoutDirection()));
/* 867 */                       float fI000II = (O1OooO0IlOo.I000II((Float.intBitsToFloat((int) (iIolilIo.I0000oI00() >> 32)) - fI00i0ilIl0i2) - o0iiliOio.I00i0ilIl0i(oIo1Oi1l1lI.I0000Il00O(o0iiliOio.getLayoutDirection()))) - O1OooO0IlOo.I000II(fIntBitsToFloat2)) / 2.0f;
/* 886 */                       float f3 = fIntBitsToFloat2 / 2.0f;
/* 887 */                       float fRound = Math.round((1.0f + (o0iiliOio.getLayoutDirection() != O0iOOoiioO.I00iOIl ? (-1.0f) * (-1.0f) : -1.0f)) * fI000II) + fI00i0ilIl0i2 + f3;
/* 890 */                       float f4 = (fRound - f3) - fI00i0ilIl0i;
/* 897 */                       float f5 = f4 < 0.0f ? 0.0f : f4;
/* 899 */                       float f6 = fRound + f3 + fI00i0ilIl0i;
/* 906 */                       float fIntBitsToFloat3 = Float.intBitsToFloat((int) (iIolilIo.I0000oI00() >> 32));
/* 917 */                       float f7 = f6 > fIntBitsToFloat3 ? fIntBitsToFloat3 : f6;
/* 922 */                       float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L));
/* 927 */                       float f8 = (-fIntBitsToFloat4) / 2.0f;
/* 929 */                       float f9 = fIntBitsToFloat4 / 2.0f;
/* 931 */                       IOO000ilo iOO000ilo = iIolilIo.I00iiI;
/* 933 */                       long jI001iOo1i0O = iOO000ilo.I001iOo1i0O();
/* 941 */                       iOO000ilo.I0010o().I000II();
                                try {
/* 951 */                           ((IIOOoll) iOO000ilo.I00iiI).I00IlilI0i0i(f5, f8, f7, f9, 0);
/* 954 */                           o0iiliOio.I00000oOI();
                                } finally {
/* 962 */                           IIlIOloOOO.I001IO000(iOO000ilo, jI001iOo1i0O);
                                }
                            } else {
/* 966 */                       o0iiliOio.I00000oOI();
                            }
/* 969 */                   return OoiIlOl1iI.I00000oIO;
                        case 15:
/* 736 */                   OIo1O01lO1 oIo1O01lO1 = (OIo1O01lO1) this.I00iiI;
/* 740 */                   OO1I0001000i oO1I0001000i3 = (OO1I0001000i) this.I00iiO;
/* 742 */                   OO11o0IO oO11o0IO3 = (OO11o0IO) obj;
/* 744 */                   boolean z2 = oIo1O01lO1.I00oII;
/* 746 */                   float f10 = oIo1O01lO1.I00o0iI0io1;
/* 748 */                   if (z2) {
/* 760 */                       OO11o0IO.I000iOII(oO11o0IO3, oO1I0001000i3, oO11o0IO3.I00l0OO0IO(f10), oO11o0IO3.I00l0OO0IO(oIo1O01lO1.I00o0l1o1o0));
                            } else {
/* 774 */                       oO11o0IO3.I000O01llI0(oO1I0001000i3, oO11o0IO3.I00l0OO0IO(f10), oO11o0IO3.I00l0OO0IO(oIo1O01lO1.I00o0l1o1o0), 0.0f);
                            }
/* 777 */                   return OoiIlOl1iI.I00000oIO;
                        case 16:
/* 728 */                   ((IlliIl1l11O) this.I00iiI).invoke(Integer.valueOf(((OOI1io1Ioo) obj).I00000oIO), Integer.valueOf(((IoIlOo1o0IIl) this.I00iiO).I001i1lo1io().I00000oOI));
/* 731 */                   return OoiIlOl1iI.I00000oIO;
                        case 17:
/* 671 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiI;
/* 675 */                   ArrayList arrayList = (ArrayList) this.I00iiO;
/* 677 */                   OO11o0IO oO11o0IO4 = (OO11o0IO) obj;
/* 681 */                   I0o0oO111 i0o0oO111 = new I0o0oO111(3);
/* 684 */                   i0o0oO111.I00iiI = arrayList;
/* 686 */                   VarHandle.storeStoreFence();
/* 689 */                   oO11o0IO4.I00iOIl = true;
/* 691 */                   i0o0oO111.invoke(oO11o0IO4);
/* 694 */                   oO11o0IO4.I00iOIl = false;
/* 696 */                   oI10i0Il2.getValue();
/* 699 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_PINKY:
/* 617 */                   OillOo0 oillOo0 = (OillOo0) this.I00iiI;
/* 621 */                   OO1ioi oO1ioi = (OO1ioi) this.I00iiO;
/* 623 */                   MotionEvent motionEvent = (MotionEvent) obj;
/* 629 */                   if (motionEvent.getActionMasked() == 0) {
/* 654 */                       oillOo0.I00iiO = ((Boolean) ((I10I00IO) oO1ioi.I000II()).invoke(motionEvent)).booleanValue() ? OO1io1OOl.I00iiI : OO1io1OOl.I00iiO;
                            } else {
/* 663 */                       ((I10I00IO) oO1ioi.I000II()).invoke(motionEvent);
                            }
/* 666 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 589 */                   I1lo10iOI i1lo10iOI = (I1lo10iOI) this.I00iiI;
/* 593 */                   IOl0OoOIliI1 iOl0OoOIliI1 = (IOl0OoOIliI1) this.I00iiO;
/* 597 */                   i1lo10iOI.I00000oIO(iOl0OoOIliI1);
/* 604 */                   I1loO00 i1loO003 = new I1loO00(9);
/* 607 */                   i1loO003.I00000oOI = i1lo10iOI;
/* 609 */                   i1loO003.I0000Il00O = iOl0OoOIliI1;
/* 611 */                   VarHandle.storeStoreFence();
/* 614 */                   return i1loO003;
                        case PoseLandmark.RIGHT_INDEX:
/* 581 */                   ((OOI01Oi0oiO) this.I00iiI).I00000oOI.I0000O((Olil0III) obj, (Preference) this.I00iiO);
/* 584 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_THUMB:
/* 563 */                   ((Ol1o1llOII) this.I00iiI).put(((OOOIIIIl) this.I00iiO).I00000oOI, (String) obj);
/* 566 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_THUMB:
/* 446 */                   OlO01l1oOil olO01l1oOil2 = (OlO01l1oOil) this.I00iiI;
/* 450 */                   OlO01l1oOil olO01l1oOil3 = (OlO01l1oOil) this.I00iiO;
/* 453 */                   IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 455 */                   float fI00i0ilIl0i3 = iilloIOOO0i.I00i0ilIl0i(2.0f);
/* 474 */                   float f11 = fI00i0ilIl0i3 / 2.0f;
/* 500 */                   IilloIOOO0i.I00iiO(iilloIOOO0i, ((IOOiio0i) olO01l1oOil2.getValue()).I00000oIO, iilloIOOO0i.I00i0ilIl0i(OOiloOlI.I0000Il00O / 2.0f) - f11, 0L, new OlOooI0l0011(fI00i0ilIl0i3, 0.0f, 0, 0, null, 30), 108);
/* 515 */                   if (Iil1010O.I00000oOI(((Iil1010O) olO01l1oOil3.getValue()).I00iOIl, 0.0f) > 0) {
/* 545 */                       IilloIOOO0i.I00iiO(iilloIOOO0i, ((IOOiio0i) olO01l1oOil2.getValue()).I00000oIO, iilloIOOO0i.I00i0ilIl0i(((Iil1010O) olO01l1oOil3.getValue()).I00iOIl) - f11, 0L, IlIl1I110o0I.I00000oIO, 108);
                            }
/* 548 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_HIP:
/* 438 */                   ((OOio1O) this.I00iiI).I00000oOI.I0000Il00O((Olil0III) obj, (List) this.I00iiO);
/* 441 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_HIP:
/* 309 */                   String str5 = (String) this.I00iiI;
/* 313 */                   List list = (List) this.I00iiO;
/* 317 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO(str5);
                            try {
/* 321 */                       Iterator it2 = list.iterator();
/* 329 */                       while (it2.hasNext()) {
/* 337 */                           oiIIl0O1l0lI00000oIO.I00Io1o110i(i2, (String) it2.next());
/* 340 */                           i2++;
                                }
/* 347 */                       int iI00000oIO = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "id");
/* 353 */                       int iI00000oIO2 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "document_id");
/* 359 */                       int iI00000oIO3 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "ordinal");
/* 365 */                       int iI00000oIO4 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "text");
/* 371 */                       int iI00000oIO5 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "embedding");
/* 377 */                       ArrayList arrayList2 = new ArrayList();
/* 384 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 412 */                           arrayList2.add(new RagChunkEntity(oiIIl0O1l0lI00000oIO.getLong(iI00000oIO), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO2), (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO3), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO4), oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO5)));
                                }
/* 416 */                       oiIIl0O1l0lI00000oIO.close();
/* 419 */                       return arrayList2;
                            } catch (Throwable th) {
/* 420 */                       oiIIl0O1l0lI00000oIO.close();
/* 423 */                       throw th;
                            }
                        case PoseLandmark.LEFT_KNEE:
/* 189 */                   Context context3 = (Context) this.I00iiI;
/* 194 */                   OOl1OlI0 oOl1OlI0 = (OOl1OlI0) this.I00iiO;
/* 197 */                   Uri uri3 = (Uri) obj;
/* 199 */                   if (uri3 != null) {
                                try {
/* 205 */                           context3.getContentResolver().takePersistableUriPermission(uri3, 1);
                                } catch (SecurityException unused) {
                                }
/* 225 */                       Cursor cursorQuery = context3.getContentResolver().query(uri3, new String[]{"_display_name"}, null, null, null);
/* 230 */                       if (cursorQuery != null) {
                                    try {
/* 236 */                               if (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) < 0) {
/* 260 */                                   cursorQuery.close();
/* 270 */                                   String lastPathSegment = uri3.getLastPathSegment();
/* 287 */                                   strI00IioO0OiOi = lastPathSegment == null ? OlOoOIi0o.I00IioO0OiOi(OlOoOIi0o.I00O0i0ii('/', lastPathSegment, lastPathSegment), ".pdf") : OlIo0Ooi1loI.I00000oIO;
/* 301 */                                   iOi1II01i0.I0000O(OooiooIOO.I00000oIO(oOl1OlI0), null, null, new OO11OilO(oOl1OlI0, uri3, strI00IioO0OiOi, null, 4), 3);
                                        } else {
/* 248 */                                   strI00IioO0OiOi = OlOoOIi0o.I00IioO0OiOi(cursorQuery.getString(columnIndex), ".pdf");
/* 252 */                                   cursorQuery.close();
/* 301 */                                   iOi1II01i0.I0000O(OooiooIOO.I00000oIO(oOl1OlI0), null, null, new OO11OilO(oOl1OlI0, uri3, strI00IioO0OiOi, null, 4), 3);
                                        }
                                    } finally {
                                    }
                                } else {
/* 270 */                           String lastPathSegment2 = uri3.getLastPathSegment();
/* 287 */                           if (lastPathSegment2 == null) {
                                    }
/* 301 */                           iOi1II01i0.I0000O(OooiooIOO.I00000oIO(oOl1OlI0), null, null, new OO11OilO(oOl1OlI0, uri3, strI00IioO0OiOi, null, 4), 3);
                                }
                            }
/* 304 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_KNEE:
/* 170 */                   IOlIOiI0iiI1 iOlIOiI0iiI1 = (IOlIOiI0iiI1) this.I00iiI;
/* 174 */                   OI10IIO oi10iio = (OI10IIO) this.I00iiO;
/* 176 */                   iOlIOiI0iiI1.I001lllioOl(obj);
/* 179 */                   if (oi10iio != null) {
/* 181 */                       oi10iio.I00000oIO(obj);
                            }
/* 184 */                   return OoiIlOl1iI.I00000oIO;
                        case 27:
/* 120 */                   OOloolilI11i oOloolilI11i = (OOloolilI11i) this.I00iiI;
/* 124 */                   Throwable th2 = (Throwable) this.I00iiO;
/* 126 */                   Throwable th3 = (Throwable) obj;
                            synchronized (oOloolilI11i.I0000Il00O) {
/* 131 */                       if (th2 == null) {
/* 149 */                           th2 = null;
                                } else if (th3 != null) {
                                    try {
/* 137 */                               if (th3 instanceof CancellationException) {
/* 140 */                                   th3 = null;
                                        }
/* 141 */                               if (th3 != null) {
/* 143 */                                   ilIilolOlIoO.I00000oIO(th2, th3);
                                        }
                                    } catch (Throwable th4) {
/* 167 */                               throw th4;
                                    }
                                }
/* 150 */                       oOloolilI11i.I0000oI00 = th2;
/* 152 */                       OlO0OIIl1 olO0OIIl1 = oOloolilI11i.I001IIilI0O;
/* 154 */                       OOloloOII0ol oOloloOII0ol = OOloloOII0ol.I00iOIl;
/* 156 */                       olO0OIIl1.getClass();
/* 159 */                       olO0OIIl1.I000lI(null, oOloloOII0ol);
                            }
/* 163 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_ANKLE:
/* 58 */                    O0oiOi o0oiOi4 = (O0oiOi) this.I00iiI;
/* 62 */                    IOioOloI0o0 iOioOloI0o0 = (IOioOloI0o0) this.I00iiO;
/* 68 */                    I01oi1lO0O1o i01oi1lO0O1o2 = new I01oi1lO0O1o(i3);
/* 71 */                    i01oi1lO0O1o2.I00iiI = iOioOloI0o0;
/* 73 */                    VarHandle.storeStoreFence();
/* 76 */                    if (o0oiOi4 != null && (i01O1lIiI000iOII2 = o0oiOi4.I000iOII()) != null) {
/* 84 */                        i01O1lIiI000iOII2.I00li1OI(i01oi1lO0O1o2);
                            }
/* 87 */                    if (o0oiOi4 == null) {
/* 89 */                        O0oOOiI0 o0oOOiI0 = O0oOOiI0.ON_RESUME;
/* 91 */                        iOioOloI0o0.getClass();
/* 98 */                        iOioOloI0o0.I00iiI = o0oOOiI0.I00000oIO();
/* 100 */                       iOioOloI0o0.I00000oIO();
                            }
/* 105 */                   I01oiO0OI0 i01oiO0OI0 = new I01oiO0OI0(i);
/* 108 */                   i01oiO0OI0.I0000Il00O = o0oiOi4;
/* 110 */                   i01oiO0OI0.I00000oOI = i01oi1lO0O1o2;
/* 112 */                   i01oiO0OI0.I0000O = iOioOloI0o0;
/* 114 */                   VarHandle.storeStoreFence();
/* 117 */                   return i01oiO0OI0;
                        default:
/* 28 */                    OI110lI01o oI110lI01o = (OI110lI01o) this.I00iiI;
/* 32 */                    i00O0OOIlOO i00o0ooiloo = (i00O0OOIlOO) this.I00iiO;
/* 38 */                    Il11OI1 il11OI1 = new Il11OI1();
/* 41 */                    il11OI1.I00000oIO = i00o0ooiloo;
/* 43 */                    il11OI1.I00000oOI = (i00O0OOIlOO) obj;
/* 45 */                    VarHandle.storeStoreFence();
/* 50 */                    oI110lI01o.I00000oIO.setValue(il11OI1);
/* 53 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

/* 11 */        public O1lIIi(int i) {
/* 12 */            this.I00iOIl = i;
                }
            }
