            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.os.Bundle;
            import androidx.core.content.FileProvider;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizer;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class I0iI0O1IoIoI implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public I0iI0O1IoIoI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:68:0x032a, code lost:
                
                    if (r9.I00oO101o == false) goto L74;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x032c, code lost:
                
                    r10 = (p000.OOo0IO) r9.I00oII.invoke();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x0335, code lost:
                
                    if (r10 == null) goto L74;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0340, code lost:
                
                    if (p000.IOoO1ol1.I010lI0oi(r9, r10, 0, 0, 3) != true) goto L74;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x0342, code lost:
                
                    r9.I00oO101o = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x0344, code lost:
                
                    r1.I0000oI00 = r9.I010l1O(r0, 0);
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    int i;
/* 3 */             int i2 = this.I00iOIl;
/* 7 */             int i3 = 2;
/* 8 */             int i4 = 0;
/* 10 */            int i5 = 1;
/* 11 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 12 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i2) {
                        case 0:
/* 1269 */                  I1O01ol i1O01ol = (I1O01ol) this.I00iiI;
/* 1273 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 1277 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iio;
/* 1281 */                  i1O01ol.I00000oOI.I00O10llo("");
/* 1286 */                  oI10i0Il.setValue(Boolean.FALSE);
/* 1289 */                  oI10i0Il2.setValue(null);
                            break;
                        case 1:
/* 1189 */                  I1iOI11ioi1 i1iOI11ioi1 = (I1iOI11ioi1) this.I00iiI;
/* 1194 */                  Context context = (Context) this.I00iiO;
/* 1199 */                  O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iio;
/* 1201 */                  OlO0OIIl1 olO0OIIl1 = i1iOI11ioi1.I00000oOI;
/* 1239 */                  IOoil1iiIilo iOoil1iiIilo2 = null;
/* 1240 */                  olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), I1iIll0i.I00iio, 0, null, 0, null, null, null, null, null, 0.0f, null, null, 4094));
/* 1243 */                  OlIl0i olIl0i = i1iOI11ioi1.I000II;
/* 1245 */                  if (olIl0i != null) {
/* 1247 */                      olIl0i.I000II(null);
                            }
/* 1263 */                  iOi1II01i0.I0000O(OooiooIOO.I00000oIO(i1iOI11ioi1), IiiIil1lOIO.I00000oIO, null, new I00oIiI10(i1iOI11ioi1, context, o1oIOiI11o0, iOoil1iiIilo2, 9), 2);
                            break;
                        case 2:
/* 1160 */                  Context context2 = (Context) this.I00iiI;
/* 1164 */                  I1iOI11ioi1 i1iOI11ioi12 = (I1iOI11ioi1) this.I00iiO;
/* 1168 */                  O1OIi1 o1OIi1 = (O1OIi1) this.I00iio;
/* 1176 */                  if (iOI10i0I11.I00000oIO(context2, "android.permission.RECORD_AUDIO") == 0) {
/* 1178 */                      i1iOI11ioi12.I000OOo1O();
                                break;
                            } else {
/* 1182 */                      o1OIi1.I00000oIO("android.permission.RECORD_AUDIO");
                                break;
                            }
                        case 3:
/* 1118 */                  I1lil0ol i1lil0ol = (I1lil0ol) this.I00iiI;
/* 1122 */                  I1ii1o0 i1ii1o0 = (I1ii1o0) this.I00iiO;
/* 1126 */                  OOo0ll111 oOo0ll111 = (OOo0ll111) this.I00iio;
/* 1128 */                  i1lil0ol.I00000oIO();
/* 1133 */                  I1Ooo1ii0l i1Ooo1ii0l = (I1Ooo1ii0l) i1ii1o0.I00iio;
/* 1135 */                  int i6 = oOo0ll111.I00iOIl;
/* 1155 */                  do {
/* 1137 */                      i = i1Ooo1ii0l.get();
/* 1155 */                  } while (!i1Ooo1ii0l.compareAndSet(i, ((i >>> 27) & 15) == i6 ? i - 1 : i));
                        case 4:
/* 1112 */                  iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, null, new I1o0i1((Context) this.I00iiO, (Bitmap) this.I00iio, iOoil1iiIilo, i4), 3);
                            break;
                        case 5:
/* 1065 */                  Oo1o1iil oo1o1iil = (Oo1o1iil) this.I00iiI;
/* 1069 */                  Ii0110 ii0110 = (Ii0110) this.I00iio;
/* 1073 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiO;
/* 1079 */                  if (oo1o1iil.I00000oOI()) {
/* 1086 */                      iOi1II01i0.I0000O(ii0110, null, null, new I1iOI0oo(oo1o1iil, iOoil1iiIilo, i3), 3);
/* 1091 */                      oI10i0Il3.setValue(Boolean.FALSE);
                                break;
                            }
                            break;
                        case 6:
/* 1035 */                  O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiI;
/* 1039 */                  OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiO;
/* 1043 */                  OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iio;
/* 1055 */                  if (o1ol100o0O.I001IIilI0O((String) oI10i0Il4.getValue()) != null) {
/* 1059 */                      oI10i0Il5.setValue(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 7:
/* 1018 */                  Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00iiI;
/* 1022 */                  IlIoO1ilo1 ilIoO1ilo1 = (IlIoO1ilo1) this.I00iiO;
/* 1026 */                  IlIoO1ilo1 ilIoO1ilo12 = (IlIoO1ilo1) this.I00iio;
/* 1028 */                  ol010000lo00.I0001Ioi1lo = ilIoO1ilo1;
/* 1030 */                  ol010000lo00.I000II = ilIoO1ilo12;
                            break;
                        case 8:
/* 978 */                   Ol010000lo00 ol010000lo002 = (Ol010000lo00) this.I00iiI;
/* 982 */                   Ii0110 ii01102 = (Ii0110) this.I00iiO;
/* 986 */                   Ol010000lo00 ol010000lo003 = (Ol010000lo00) this.I00iio;
/* 1002 */                  if (((Boolean) ol010000lo002.I0000Il00O.invoke(Ol010l0o0O.I00iiI)).booleanValue()) {
/* 1010 */                      iOi1II01i0.I0000O(ii01102, null, null, new II1OIi(ol010000lo003, iOoil1iiIilo, 4), 3);
                            }
                            break;
                        case 9:
/* 922 */                   III0OOl1 iII0OOl1 = (III0OOl1) this.I00iiI;
/* 932 */                   OOo0IO oOo0IOI010l1O = III0OOl1.I010l1O(iII0OOl1, (OIIlIII0Ili) this.I00iiO, (I01ii1IIl) this.I00iio);
/* 936 */                   if (oOo0IOI010l1O != null) {
/* 938 */                       IOoO1ol1 iOoO1ol1 = iII0OOl1.I00o0iI0io1;
/* 948 */                       if (IooOl0ol01.I0000Il00O(iOoO1ol1.I00oOio10iI1, -1L)) {
/* 952 */                           Ioll0IliO1l.I0000Il00O("Expected BringIntoViewRequester to not be used before parents are placed.");
                                }
                                break;
                            }
                            break;
                        case 10:
/* 916 */                   ((IlliIl1l11O) this.I00iiI).invoke((Conversation) this.I00iiO, (List) this.I00iio);
                            break;
                        case 11:
/* 849 */                   List<IOlOo10O0l0> list = (List) this.I00iiI;
/* 853 */                   Ol1o1llOII ol1o1llOII = (Ol1o1llOII) this.I00iiO;
/* 857 */                   OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iio;
/* 869 */                   for (IOlOo10O0l0 iOlOo10O0l0 : list) {
/* 879 */                       if (!(iOlOo10O0l0 instanceof O0iO0Oii0o00)) {
/* 891 */                           ol1o1llOII.put(iOlOo10O0l0.I00000oOI().I00000oOI, iOlOo10O0l0.I00000oIO());
                                }
                            }
/* 900 */                   oIooi1iOiOol.I000O01llI0(oIooi1iOiOol.I000II() + 1);
                            break;
                        case 12:
/* 730 */                   IOoO1ol1 iOoO1ol12 = (IOoO1ol1) this.I00iiI;
/* 734 */                   Ooioool0 ooioool0 = (Ooioool0) this.I00iiO;
/* 738 */                   III0liIO iII0liIO = (III0liIO) this.I00iio;
/* 740 */                   Oi00IilOloo0 oi00IilOloo0 = iOoO1ol12.I00oIiI10;
                            while (true) {
/* 744 */                       OI110O0 oi110o0 = (OI110O0) oi00IilOloo0.I00iOIl;
/* 746 */                       int i7 = oi110o0.I00iiO;
/* 748 */                       if (i7 == 0) {
                                    break;
                                } else if (i7 == 0) {
/* 805 */                           OIiilo1Ool0o.I000II("MutableVector is empty.");
                                    break;
                                } else {
/* 767 */                           OOo0IO oOo0IO = (OOo0IO) ((IOoO0I1OIoi) oi110o0.I00iOIl[i7 - 1]).I00000oIO.invoke();
/* 782 */                           if (!(oOo0IO == null ? true : IOoO1ol1.I010lI0oi(iOoO1ol12, oOo0IO, 0L, 0L, 3))) {
                                        break;
                                    } else {
/* 786 */                               OI110O0 oi110o02 = (OI110O0) oi00IilOloo0.I00iOIl;
/* 799 */                               ((IOoO0I1OIoi) oi110o02.I000l1(oi110o02.I00iiO - 1)).I00000oOI.resumeWith(ooiIlOl1iI);
                                    }
                                }
                            }
                        case 13:
/* 695 */                   OoI01iiOoo01 ooI01iiOoo01 = (OoI01iiOoo01) this.I00iiI;
/* 699 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iio;
/* 707 */                   ((OI10i0Il) this.I00iiO).setValue(Boolean.FALSE);
/* 710 */                   Ii1liIllli0 ii1liIllli0 = ooI01iiOoo01.I00000oOI;
/* 712 */                   ii1liIllli0.getClass();
/* 720 */                   iOi1IOoIO0l.I00000oOI(new Ii1l100(ii1liIllli0, iOoil1iiIilo, i4));
/* 723 */                   illOOo00lI.invoke();
                            break;
                        case 14:
/* 590 */                   O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) this.I00iiI;
/* 594 */                   iOI1I00I10 ioi1i00i10 = (iOI1I00I10) this.I00iio;
/* 598 */                   OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00iiO;
/* 605 */                   int iI001i1lo1io = OlOoOIi0o.I001i1lo1io(o1oIOiI11o02.I000O01llI0, "/resolve/", 0, false, 6);
/* 609 */                   if (iI001i1lo1io >= 0) {
/* 613 */                       String strSubstring = o1oIOiI11o02.I000O01llI0.substring(0, iI001i1lo1io);
/* 621 */                       Intent intent = new Intent("android.intent.action.VIEW");
/* 630 */                       if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
/* 634 */                           Bundle bundle = new Bundle();
/* 637 */                           bundle.putBinder("android.support.customtabs.extra.SESSION", null);
/* 640 */                           intent.putExtras(bundle);
                                }
/* 645 */                       intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
/* 653 */                       intent.putExtras(new Bundle());
/* 658 */                       intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
/* 665 */                       IIloOI iIloOI = new IIloOI(10);
/* 668 */                       iIloOI.I00iiI = intent;
/* 670 */                       VarHandle.storeStoreFence();
/* 675 */                       Intent intent2 = (Intent) iIloOI.I00iiI;
/* 681 */                       intent2.setData(Uri.parse(strSubstring));
/* 684 */                       ioi1i00i10.I00000oIO(intent2);
                            }
/* 689 */                   oI10i0Il6.setValue(Boolean.FALSE);
                            break;
                        case 15:
/* 584 */                   ((IlI1loI1lO1) this.I00iiI).I000l1((Context) this.I00iiO, !((IlI10IO) this.I00iio).I000OOo1O);
                            break;
                        case 16:
/* 535 */                   O1OIi1 o1OIi12 = (O1OIi1) this.I00iiI;
/* 539 */                   OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00iiO;
/* 543 */                   OI10i0Il oI10i0Il8 = (OI10i0Il) this.I00iio;
/* 555 */                   if (((Boolean) oI10i0Il7.getValue()).booleanValue()) {
/* 559 */                       oI10i0Il8.setValue(Boolean.TRUE);
                                break;
                            } else {
/* 565 */                       o1OIi12.I00000oIO("android.permission.CAMERA");
                                break;
                            }
                        case 17:
/* 490 */                   IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iiI;
/* 494 */                   OI10i0Il oI10i0Il9 = (OI10i0Il) this.I00iiO;
/* 498 */                   OI10i0Il oI10i0Il10 = (OI10i0Il) this.I00iio;
/* 510 */                   String string = OlOoOIi0o.I00OIo((String) oI10i0Il9.getValue()).toString();
/* 518 */                   if (string.length() > 0) {
/* 526 */                       illiIl1l11O.invoke((Conversation) oI10i0Il10.getValue(), string);
                            }
/* 529 */                   oI10i0Il10.setValue(null);
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 484 */                   Iloo0ilo.I001lIiIIo1O((Ii0110) this.I00iiI, (SpeechRecognizer) this.I00iio, (OI10i0Il) this.I00iiO);
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 468 */                   iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, null, new IiI110i1O((BoxChatDatabase) this.I00iio, (OI10i0Il) this.I00iiO, iOoil1iiIilo, 7), 3);
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 446 */                   iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, null, new Ii1O001loIoO((O1OIi1) this.I00iio, (OI10i0Il) this.I00iiO, iOoil1iiIilo, 20), 3);
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 403 */                   Ii0110 ii01103 = (Ii0110) this.I00iiI;
/* 407 */                   OI10i0Il oI10i0Il11 = (OI10i0Il) this.I00iiO;
/* 411 */                   IiloOlIoIool iiloOlIoIool = (IiloOlIoIool) this.I00iio;
/* 415 */                   oI10i0Il11.setValue(Boolean.TRUE);
/* 423 */                   iOi1II01i0.I0000O(ii01103, null, null, new IoI0iiIi(iiloOlIoIool, iOoil1iiIilo, i5), 3);
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 372 */                   Ii0110 ii01104 = (Ii0110) this.I00iiI;
/* 376 */                   IiloOlIoIool iiloOlIoIool2 = (IiloOlIoIool) this.I00iiO;
/* 380 */                   IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00iio;
/* 387 */                   iOi1II01i0.I0000O(ii01104, null, null, new IoI0iiIi(iiloOlIoIool2, iOoil1iiIilo, i3), 3);
/* 397 */                   iOi1II01i0.I0000O(ii01104, null, null, new I0II0OiI(illOOo00lI2, iOoil1iiIilo, 23), 3);
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 305 */                   OI10i0Il oI10i0Il12 = (OI10i0Il) this.I00iiO;
/* 309 */                   OI10i0Il oI10i0Il13 = (OI10i0Il) this.I00iio;
/* 313 */                   IllOOo00lI illOOo00lI3 = (IllOOo00lI) this.I00iiI;
/* 321 */                   IlliOIilI illiOIilI = (IlliOIilI) oI10i0Il12.getValue();
/* 327 */                   Function1 function1 = (Function1) oI10i0Il13.getValue();
/* 335 */                   int iIntValue = ((Number) illOOo00lI3.invoke()).intValue();
/* 339 */                   OIoI10O00OO oIoI10O00OO = new OIoI10O00OO();
/* 346 */                   I00Ol00 i00Ol00 = new I00Ol00((char) 0, 8);
/* 351 */                   OIo1oO oIo1oO = new OIo1oO();
/* 354 */                   oIo1oO.I00000oIO = function1;
/* 356 */                   oIo1oO.I00000oOI = illiOIilI;
/* 358 */                   VarHandle.storeStoreFence();
/* 361 */                   i00Ol00.I00000oIO(iIntValue, oIo1oO);
/* 364 */                   oIoI10O00OO.I00000oIO = i00Ol00;
/* 366 */                   VarHandle.storeStoreFence();
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 255 */                   IiO0o1I iiO0o1I = (IiO0o1I) this.I00iiI;
/* 259 */                   O0o0I1i0O o0o0I1i0O = (O0o0I1i0O) this.I00iiO;
/* 263 */                   O0l11l1iOO o0l11l1iOO = (O0l11l1iOO) this.I00iio;
/* 269 */                   O0lolo o0lolo = (O0lolo) iiO0o1I.getValue();
/* 283 */                   I00Ol00 i00Ol002 = new I00Ol00((IooO11l) o0o0I1i0O.I0000oI00.I0001Ioi1lo.getValue(), o0lolo);
/* 288 */                   O0loo1 o0loo1 = new O0loo1();
/* 291 */                   o0loo1.I00000oIO = o0o0I1i0O;
/* 293 */                   o0loo1.I00000oOI = o0lolo;
/* 295 */                   o0loo1.I0000Il00O = o0l11l1iOO;
/* 297 */                   o0loo1.I0000O = i00Ol002;
/* 299 */                   VarHandle.storeStoreFence();
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 237 */                   O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) this.I00iiI;
/* 241 */                   O1111l o1111l = (O1111l) this.I00iiO;
/* 245 */                   Function1 function12 = (Function1) this.I00iio;
/* 247 */                   o1oIOiI11o03.I00IlilI0i0i = o1111l;
/* 249 */                   function12.invoke("");
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 186 */                   IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) this.I00iiI;
/* 190 */                   OOo0ooi oOo0ooi = (OOo0ooi) this.I00iiO;
/* 194 */                   IoI1O1i1 ioI1O1i1 = (IoI1O1i1) this.I00iio;
/* 198 */                   O1IiO0l o1IiO0l = (O1IiO0l) oOo0ooi.I00iOIl;
/* 200 */                   OI10I1IoI0Ol oI10I1IoI0Ol = o1IiO0l.I00lli11;
/* 202 */                   if (oI10I1IoI0Ol == null) {
/* 204 */                       long[] jArr = OiO10oio.I00000oIO;
/* 208 */                       oI10I1IoI0Ol = new OI10I1IoI0Ol();
/* 211 */                       o1IiO0l.I00lli11 = oI10I1IoI0Ol;
                            }
/* 213 */                   Object objI000II = oI10I1IoI0Ol.I000II(ioI1O1i1);
/* 217 */                   if (objI000II == null) {
/* 221 */                       objI000II = new O1Ii0OO(o1IiO0l);
/* 224 */                       oI10I1IoI0Ol.I000lI(ioI1O1i1, objI000II);
                            }
/* 227 */                   O1Ii0OO o1Ii0OO = (O1Ii0OO) objI000II;
/* 229 */                   o1Ii0OO.I00iOIl = false;
/* 231 */                   illiIl1l11O2.invoke(o1Ii0OO, ioI1O1i1);
                            break;
                        case 27:
/* 141 */                   O1i1O1I o1i1O1I = (O1i1O1I) this.I00iiI;
/* 145 */                   OI10i0Il oI10i0Il14 = (OI10i0Il) this.I00iiO;
/* 149 */                   OI10i0Il oI10i0Il15 = (OI10i0Il) this.I00iio;
/* 155 */                   String str = (String) oI10i0Il14.getValue();
/* 157 */                   o1i1O1I.getClass();
/* 160 */                   IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(o1i1O1I);
/* 164 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 175 */                   iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new Ii1O001loIoO(o1i1O1I, str, iOoil1iiIilo, 29), 2);
/* 180 */                   oI10i0Il15.setValue(Boolean.FALSE);
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 135 */                   ((Function1) this.I00iiI).invoke(Boolean.valueOf(!O0000Ioio00.I0000O((String) ((OI10i0Il) this.I00iiO).getValue(), ((O1i1O1I) this.I00iio).I000II())));
                            break;
                        default:
/* 19 */                    Context context3 = (Context) this.I00iiI;
/* 23 */                    O1OIi1 o1OIi13 = (O1OIi1) this.I00iio;
/* 27 */                    OI10i0Il oI10i0Il16 = (OI10i0Il) this.I00iiO;
/* 29 */                    OIo1i1 oIo1i1 = OollloolI.I00000oIO;
/* 37 */                    String strI000iOII = IlIi0I0.I000iOII(System.currentTimeMillis(), "picture_");
/* 49 */                    File file = new File(context3.getCacheDir(), "images");
/* 52 */                    file.mkdirs();
/* 57 */                    File fileCreateTempFile = File.createTempFile(strI000iOII, ".png", file);
/* 61 */                    fileCreateTempFile.createNewFile();
/* 93 */                    Uri uriI0000Il00O = FileProvider.I0000Il00O(context3.getApplicationContext(), context3.getApplicationContext().getPackageName() + ".provider", fileCreateTempFile);
/* 97 */                    oI10i0Il16.setValue(uriI0000Il00O);
/* 100 */                   o1OIi13.I00000oIO(uriI0000Il00O);
                            break;
                    }
/* 103 */           return ooiIlOl1iI;
                }
            }
