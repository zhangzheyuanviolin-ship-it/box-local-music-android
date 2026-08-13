            package p000;

            import android.app.Application;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CaptureRequest;
            import android.util.Log;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.k2fsa.sherpa.onnx.OfflineTts;
            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Set;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.tensorflow.lite.I00000oIO;
            
/* 10 */    public final class Ol0Oli extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final Object I00iiI;
                public Object I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ol0Oli(IOoil1iiIilo iOoil1iiIilo, Object obj, Object obj2, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = obj;
/* 5 */             this.I00iiI = obj2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 300 */                   return new Ol0Oli((OOOIIIIl) this.I00iiO, (OI10i0Il) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 287 */                   return new Ol0Oli((OlO01l1oOil) this.I00iiO, (OI10i0Il) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 274 */                   return new Ol0Oli((OOo0ooi) this.I00iiO, (Ol0o1OiOIIIl) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 261 */                   return new Ol0Oli((Ol0o1OiOIIIl) this.I00iiO, (Ol0ioI1iI) obj2, iOoil1iiIilo, 3);
                        case 4:
/* 248 */                   return new Ol0Oli((I0Iol0OOiO) this.I00iiO, (LinkedHashMap) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 235 */                   return new Ol0Oli((OlI0iOo) this.I00iiO, (O1oiilO) obj2, iOoil1iiIilo, 5);
                        case 6:
/* 222 */                   return new Ol0Oli(iOoil1iiIilo, (Set) this.I00iiO, (OlO01I1) obj2, 6);
                        case 7:
/* 209 */                   return new Ol0Oli(iOoil1iiIilo, (OlO01I1) this.I00iiO, (OOo0o0oO) obj2, 7);
                        case 8:
/* 196 */                   return new Ol0Oli((OliiOI) this.I00iiO, (O1oiilO) obj2, iOoil1iiIilo, 8);
                        case 9:
/* 182 */                   return new Ol0Oli((Oll1l0IOli) this.I00iiO, (Function1) obj2, iOoil1iiIilo, 9);
                        case 10:
/* 168 */                   return new Ol0Oli((Oo0oIo00ioo) this.I00iiO, (String) obj2, iOoil1iiIilo, 10);
                        case 11:
/* 154 */                   return new Ol0Oli((OoIO11oiiiil) this.I00iiO, (Context) obj2, iOoil1iiIilo, 11);
                        case 12:
/* 138 */                   Ol0Oli ol0Oli = new Ol0Oli((O1oIOiI11o0) obj2, iOoil1iiIilo, 12);
/* 141 */                   ol0Oli.I00iiO = obj;
/* 143 */                   return ol0Oli;
                        case 13:
/* 128 */                   return new Ol0Oli((O1oIOiI11o0) this.I00iiO, (OoIoI0iii0) obj2, iOoil1iiIilo, 13);
                        case 14:
/* 114 */                   return new Ol0Oli((II1olI) this.I00iiO, (O1oiilO) obj2, iOoil1iiIilo, 14);
                        case 15:
/* 100 */                   return new Ol0Oli((Ool0OI) this.I00iiO, (O1oiilO) obj2, iOoil1iiIilo, 15);
                        case 16:
/* 86 */                    return new Ol0Oli((Oilo101I11l0) this.I00iiO, (IiIO1IliI1Ol) obj2, iOoil1iiIilo, 16);
                        case 17:
/* 72 */                    return new Ol0Oli((WhisperEngine) this.I00iiO, (String) obj2, iOoil1iiIilo, 17);
                        case PoseLandmark.RIGHT_PINKY:
/* 58 */                    return new Ol0Oli((i0I00l) this.I00iiO, (O1oiilO) obj2, iOoil1iiIilo, 18);
                        case PoseLandmark.LEFT_INDEX:
/* 44 */                    return new Ol0Oli((Application) this.I00iiO, (o00i1olooO) obj2, iOoil1iiIilo, 19);
                        case PoseLandmark.RIGHT_INDEX:
/* 28 */                    Ol0Oli ol0Oli2 = new Ol0Oli((Map) obj2, iOoil1iiIilo, 20);
/* 31 */                    ol0Oli2.I00iiO = obj;
/* 33 */                    return ol0Oli2;
                        default:
/* 18 */                    return new Ol0Oli((IOiOol0) this.I00iiO, (Context) obj2, iOoil1iiIilo, 21);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 317 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 320 */                   return ooiIlOl1iI;
                        case 1:
/* 303 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 306 */                   return ooiIlOl1iI;
                        case 2:
/* 289 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 292 */                   return ooiIlOl1iI;
                        case 3:
/* 275 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 278 */                   return ooiIlOl1iI;
                        case 4:
/* 261 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 264 */                   return ooiIlOl1iI;
                        case 5:
/* 247 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 250 */                   return ooiIlOl1iI;
                        case 6:
/* 233 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 236 */                   return ooiIlOl1iI;
                        case 7:
/* 219 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 222 */                   return ooiIlOl1iI;
                        case 8:
/* 205 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 208 */                   return ooiIlOl1iI;
                        case 9:
/* 191 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 194 */                   return ooiIlOl1iI;
                        case 10:
/* 176 */                   return ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 11:
/* 162 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 165 */                   return ooiIlOl1iI;
                        case 12:
/* 147 */                   return ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 13:
/* 133 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 136 */                   return ooiIlOl1iI;
                        case 14:
/* 119 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 122 */                   return ooiIlOl1iI;
                        case 15:
/* 105 */                   ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 108 */                   return ooiIlOl1iI;
                        case 16:
/* 91 */                    ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 94 */                    return ooiIlOl1iI;
                        case 17:
/* 76 */                    return ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_PINKY:
/* 62 */                    ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 65 */                    return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 47 */                    return ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_INDEX:
/* 33 */                    ((Ol0Oli) create((Map) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 36 */                    return ooiIlOl1iI;
                        default:
/* 18 */                    return ((Ol0Oli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:204:0x04d7  */
                /* JADX WARN: Removed duplicated region for block: B:244:0x057c  */
                /* JADX WARN: Removed duplicated region for block: B:284:0x050a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    OlO01I1 olO01I1;
                    boolean z;
                    int i;
                    int i2;
                    boolean z2;
                    Integer num;
                    Integer num2;
                    List listI00iIi0i1o;
                    List<String> listSingletonList;
                    Object next;
                    Object next2;
                    Object objI00000oIO;
/* 5 */             float f = 0.0f;
/* 6 */             boolean z3 = false;
/* 6 */             int i3 = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 1569 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 1571 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1584 */                  ((OI10i0Il) this.I00iiI).setValue(((OOOIIIIl) this.I00iiO).I0000O);
/* 1587 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 1532 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 1534 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1539 */                  OlO01l1oOil olO01l1oOil = (OlO01l1oOil) this.I00iiO;
/* 1541 */                  List list = Ol0lllilO0Ol.I00000oIO;
/* 1555 */                  if (((Number) olO01l1oOil.getValue()).intValue() > 15) {
/* 1563 */                      ((OI10i0Il) this.I00iiI).setValue(Boolean.TRUE);
                            }
/* 1566 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 1510 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 1512 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1527 */                  ((OOo0ooi) this.I00iiO).I00iOIl = ((Ol0o1OiOIIIl) this.I00iiI).I000iOII();
/* 1529 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 1480 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 1482 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1489 */                  Ii1liIllli0 ii1liIllli0 = ((Ol0o1OiOIIIl) this.I00iiO).I00000oOI;
/* 1493 */                  Ol0ioI1iI ol0ioI1iI = (Ol0ioI1iI) this.I00iiI;
/* 1495 */                  ii1liIllli0.getClass();
/* 1504 */                  iOi1IOoIO0l.I00000oOI(new Ii1O001loIoO(ii1liIllli0, ol0ioI1iI, false ? 1 : 0, 5));
/* 1507 */                  return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 1461 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 1463 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1474 */                  ((I0Iol0OOiO) this.I00iiO).invoke((LinkedHashMap) this.I00iiI);
/* 1477 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 1439 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 1441 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1448 */                  ((OlI0iOo) this.I00iiO).I00000oOI();
/* 1455 */                  ((O1oiilO) this.I00iiI).invoke();
/* 1458 */                  return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 1334 */                  Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 1336 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1347 */                  if (!((Set) this.I00iiO).isEmpty()) {
/* 1357 */                      Oilo101I11l0 oilo101I11l0 = new Oilo101I11l0((Set) this.I00iiO, true);
/* 1383 */                      OillooOlI oillooOlI = ((Oilloi0llol1) oilo101I11l0.I0000oI00.getValue()).I0000Il00O() ? (OillooOlI) oilo101I11l0.I0001Ioi1lo.getValue() : null;
/* 1384 */                      if (oillooOlI != null) {
/* 1388 */                          int i4 = oillooOlI.I000II.I0000Il00O;
/* 1395 */                          Integer numValueOf = i4 != -1 ? Integer.valueOf(i4) : null;
/* 1405 */                          int iIntValue = numValueOf != null ? numValueOf.intValue() : 1;
                                    synchronized (((OlO01I1) this.I00iiI).I0000O) {
/* 1415 */                              olO01I1 = (OlO01I1) this.I00iiI;
/* 1419 */                              if (olO01I1.I000OOo1O != iIntValue) {
/* 1421 */                                  olO01I1.I000OOo1O = iIntValue;
/* 1423 */                                  z3 = true;
                                        }
                                    }
/* 1428 */                          if (z3) {
/* 1430 */                              olO01I1.I0001Ioi1lo();
                                    }
                                }
                            }
/* 1436 */                  return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 1046 */                  Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 1048 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1053 */                  OlO01I1 olO01I12 = (OlO01I1) this.I00iiO;
/* 1059 */                  long j = ((OOo0o0oO) this.I00iiI).I00iOIl;
/* 1065 */                  Ool1lo ool1lo = olO01I12.I0000oI00;
/* 1067 */                  if (ool1lo == null) {
/* 1076 */                      olO01I12.I0000Il00O(new I1o1lOlooI1("Camera is not active.", 1));
                            } else {
                                synchronized (olO01I12.I0000O) {
/* 1092 */                          z = j == olO01I12.I000II;
                                }
/* 1094 */                      if (z) {
                                    synchronized (olO01I12.I0000O) {
/* 1101 */                              i = olO01I12.I000O01llI0;
/* 1103 */                              i2 = olO01I12.I000OOo1O;
/* 1105 */                              z2 = olO01I12.I000OiO;
/* 1107 */                              num = olO01I12.I000iOII;
/* 1109 */                              num2 = olO01I12.I000l1;
                                    }
/* 1112 */                          int iI0000O = olO01I12.I0000O(i, z2, num);
/* 1116 */                          int i5 = 4;
/* 1131 */                          int iIntValue2 = num2 != null ? num2.intValue() : (i2 == 1 || i2 != 3) ? 4 : 3;
/* 1148 */                          OIoi0IIoi oIoi0IIoi = new OIoi0IIoi(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(iOiloi0oOI1.I00000oOI(olO01I12.I00000oIO.I00000oOI, iI0000O)));
/* 1151 */                          CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
/* 1155 */                          IIlo0i0ll iIlo0i0ll = olO01I12.I00000oIO.I00000oOI;
/* 1169 */                          if (iOiloi0oOI1.I00000oIO(iIlo0i0ll).contains(Integer.valueOf(iIntValue2))) {
/* 1171 */                              i5 = iIntValue2;
                                    } else if (!iOiloi0oOI1.I00000oIO(iIlo0i0ll).contains(4)) {
/* 1200 */                              i5 = iOiloi0oOI1.I00000oIO(iIlo0i0ll).contains(1) ? 1 : 0;
                                    }
/* 1207 */                          OIoi0IIoi oIoi0IIoi2 = new OIoi0IIoi(key, Integer.valueOf(i5));
/* 1210 */                          CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
/* 1214 */                          IIlo0i0ll iIlo0i0ll2 = olO01I12.I00000oIO.I00000oOI;
/* 1216 */                          CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES;
/* 1218 */                          int[] iArr = {0};
/* 1222 */                          IIioli iIioli = (IIioli) iIlo0i0ll2;
/* 1224 */                          Object objI0000O = iIioli.I0000O(key3);
/* 1228 */                          if (objI0000O != 0) {
/* 1231 */                              iArr = objI0000O;
                                    }
/* 1238 */                          if (I1IoiO1l.I0000oI00(iArr, 1)) {
/* 1240 */                              i3 = 1;
                                        try {
/* 1284 */                                  O010OIi o010OIiI000iOII = ool1lo.I000iOII(O1Oii0O0loo.I0000O(oIoi0IIoi, oIoi0IIoi2, new OIoi0IIoi(key2, Integer.valueOf(i3))), Ool1iI0OiI.I00iiI, Ool1i1IO.I00000oOI);
                                            synchronized (olO01I12.I0000O) {
/* 1293 */                                      listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(olO01I12.I0001Ioi1lo);
                                            }
/* 1301 */                                  OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(6);
/* 1304 */                                  oiOi011iI1ol.I00iiI = listI00iIi0i1o;
/* 1306 */                                  oiOi011iI1ol.I00iiO = olO01I12;
/* 1308 */                                  VarHandle.storeStoreFence();
/* 1313 */                                  ((O011OOl11) o010OIiI000iOII).I00iiI(oiOi011iI1ol);
                                        } catch (Exception e) {
/* 1322 */                                  olO01I12.I0000Il00O(e);
                                        }
                                    } else {
/* 1246 */                              Object objI0000O2 = iIioli.I0000O(key3);
/* 1242 */                              Object obj2 = {0};
/* 1250 */                              if (objI0000O2 != null) {
/* 1253 */                                  obj2 = objI0000O2;
                                        }
/* 1260 */                              if (I1IoiO1l.I0000oI00((int[]) obj2, 1)) {
                                        }
/* 1284 */                              O010OIi o010OIiI000iOII2 = ool1lo.I000iOII(O1Oii0O0loo.I0000O(oIoi0IIoi, oIoi0IIoi2, new OIoi0IIoi(key2, Integer.valueOf(i3))), Ool1iI0OiI.I00iiI, Ool1i1IO.I00000oOI);
                                        synchronized (olO01I12.I0000O) {
                                        }
                                    }
                                }
                            }
/* 1325 */                  return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 1018 */                  Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 1020 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1025 */                  OliiOI oliiOI = (OliiOI) this.I00iiO;
                            try {
/* 1027 */                      OfflineTts offlineTts = oliiOI.I00000oIO;
/* 1029 */                      if (offlineTts != null) {
/* 1031 */                          offlineTts.release();
                                }
                            } catch (Throwable unused) {
                            }
/* 1034 */                  oliiOI.I00000oIO = null;
/* 1040 */                  ((O1oiilO) this.I00iiI).invoke();
/* 1043 */                  return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 936 */                   Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 938 */                   lIoii1l01l0i.I00000oOI(obj);
/* 943 */                   Oll1l0IOli oll1l0IOli = (Oll1l0IOli) this.I00iiO;
/* 945 */                   I0l1OOl1l10 i0l1OOl1l10 = oll1l0IOli.I00000oIO;
/* 947 */                   I0l1OOl1l10 i0l1OOl1l102 = oll1l0IOli.I00000oIO;
/* 957 */                   Oll1lO oll1lO = (Oll1lO) ((OIooliIO0) i0l1OOl1l10.I000O01llI0).getValue();
/* 959 */                   Oll1lO oll1lO2 = Oll1lO.I00iiO;
/* 961 */                   if (oll1lO != oll1lO2) {
/* 965 */                       Function1 function1 = (Function1) this.I00iiI;
/* 977 */                       if (((OIooO1iiliI) i0l1OOl1l102.I000l1).I000II() != 0.0f && !Float.isNaN(((OIooO1iiliI) i0l1OOl1l102.I000l1).I000II())) {
/* 1010 */                          oll1lO2 = ((OIooO1iiliI) i0l1OOl1l102.I000l1).I000II() > 0.0f ? Oll1lO.I00iOIl : Oll1lO.I00iiI;
                                }
/* 1012 */                      function1.invoke(oll1lO2);
                            }
/* 1015 */                  return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 568 */                   Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 570 */                   lIoii1l01l0i.I00000oOI(obj);
/* 575 */                   Oo0oIo00ioo oo0oIo00ioo = (Oo0oIo00ioo) this.I00iiO;
/* 579 */                   String str = (String) this.I00iiI;
/* 581 */                   OllO00oiil ollO00oiil = oo0oIo00ioo.I00000oOI;
/* 595 */                   Integer num3 = (Integer) ((Map) ollO00oiil.getValue()).get("[CLS]");
/* 604 */                   int iIntValue3 = num3 != null ? num3.intValue() : 101;
/* 618 */                   Integer num4 = (Integer) ((Map) ollO00oiil.getValue()).get("[SEP]");
/* 627 */                   int iIntValue4 = num4 != null ? num4.intValue() : 102;
/* 641 */                   Integer num5 = (Integer) ((Map) ollO00oiil.getValue()).get("[UNK]");
/* 650 */                   int iIntValue5 = num5 != null ? num5.intValue() : 100;
/* 660 */                   ArrayList arrayListI000OiO = IOOi1I.I000OiO(Integer.valueOf(iIntValue3));
/* 666 */                   String lowerCase = str.toLowerCase(Locale.ROOT);
/* 672 */                   Pattern patternCompile = Pattern.compile("[\\s\\p{Punct}]+");
/* 676 */                   OlOoOIi0o.I00IlilI0i0i(0);
/* 679 */                   Matcher matcher = patternCompile.matcher(lowerCase);
/* 687 */                   if (matcher.find()) {
/* 702 */                       ArrayList arrayList = new ArrayList(10);
/* 705 */                       int iEnd = 0;
/* 729 */                       do {
/* 718 */                           arrayList.add(lowerCase.subSequence(iEnd, matcher.start()).toString());
/* 721 */                           iEnd = matcher.end();
/* 729 */                       } while (matcher.find());
/* 743 */                       arrayList.add(lowerCase.subSequence(iEnd, lowerCase.length()).toString());
/* 746 */                       listSingletonList = arrayList;
                            } else {
/* 693 */                       listSingletonList = Collections.singletonList(lowerCase.toString());
                            }
/* 757 */                   for (String str2 : listSingletonList) {
/* 769 */                       if (str2.length() > 0) {
/* 781 */                           Integer num6 = (Integer) ((Map) ollO00oiil.getValue()).get(str2);
/* 795 */                           arrayListI000OiO.add(Integer.valueOf(num6 != null ? num6.intValue() : iIntValue5));
                                }
                            }
/* 803 */                   arrayListI000OiO.add(Integer.valueOf(iIntValue4));
/* 812 */                   while (arrayListI000OiO.size() < 128) {
/* 818 */                       arrayListI000OiO.add(0);
                            }
/* 832 */                   int[][] iArr2 = {IOOi0Ool1i.I00iIO(IOOi0Ool1i.I00i01iIIliI(arrayListI000OiO, Barcode.FORMAT_ITF))};
/* 838 */                   int length = iArr2[0].length;
/* 839 */                   int[] iArr3 = new int[length];
/* 842 */                   for (int i6 = 0; i6 < length; i6++) {
/* 853 */                       iArr3[i6] = iArr2[0][i6] != 0 ? 1 : 0;
                            }
/* 866 */                   float[][] fArr = {new float[384]};
/* 891 */                   ((I00000oIO) oo0oIo00ioo.I0000Il00O.getValue()).I00000oIO(new int[][][]{iArr2, new int[][]{iArr3}}, Collections.singletonMap(new Integer(0), fArr));
/* 894 */                   float[] fArr2 = fArr[0];
/* 898 */                   for (float f2 : fArr2) {
/* 903 */                       f += f2 * f2;
                            }
/* 912 */                   float fSqrt = (float) Math.sqrt(f);
/* 913 */                   int length2 = fArr2.length;
/* 914 */                   float[] fArr3 = new float[length2];
/* 916 */                   for (int i7 = 0; i7 < length2; i7++) {
/* 918 */                       float f3 = fArr2[i7];
/* 920 */                       float f4 = 1.0E-9f;
/* 925 */                       if (fSqrt >= 1.0E-9f) {
/* 928 */                           f4 = fSqrt;
                                }
/* 930 */                       fArr3[i7] = f3 / f4;
                            }
/* 935 */                   return fArr3;
                        case 11:
/* 406 */                   Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 408 */                   lIoii1l01l0i.I00000oOI(obj);
/* 413 */                   OoIO11oiiiil ooIO11oiiiil = (OoIO11oiiiil) this.I00iiO;
/* 417 */                   Context context = (Context) this.I00iiI;
/* 419 */                   OlO0OIIl1 olO0OIIl1 = ooIO11oiiiil.I00000oOI;
/* 425 */                   ooIO11oiiiil.I0001Ioi1lo = context.getApplicationContext();
/* 429 */                   SharedPreferences sharedPreferences = context.getSharedPreferences("box_settings", 0);
/* 437 */                   Iterator it = OoIO1Oli1.I00000oIO.iterator();
                            while (true) {
/* 445 */                       if (it.hasNext()) {
/* 447 */                           next = it.next();
/* 466 */                           if (((OoI1lOl) next).I00000oOI.equals(sharedPreferences.getString("translator_lang_a", null))) {
                                    }
                                } else {
/* 469 */                           next = null;
                                }
                            }
/* 470 */                   OoI1lOl ooI1lOl = (OoI1lOl) next;
/* 476 */                   Iterator it2 = OoIO1Oli1.I00000oIO.iterator();
                            while (true) {
/* 484 */                       if (it2.hasNext()) {
/* 486 */                           next2 = it2.next();
/* 505 */                           if (((OoI1lOl) next2).I00000oOI.equals(sharedPreferences.getString("translator_lang_b", null))) {
                                    }
                                } else {
/* 508 */                           next2 = null;
                                }
                            }
/* 509 */                   OoI1lOl ooI1lOl2 = (OoI1lOl) next2;
/* 516 */                   OoIIo0oOI1 ooIIo0oOI1 = (OoIIo0oOI1) olO0OIIl1.getValue();
/* 518 */                   if (ooI1lOl == null) {
/* 526 */                       ooI1lOl = ((OoIIo0oOI1) olO0OIIl1.getValue()).I00000oIO;
                            }
/* 528 */                   OoI1lOl ooI1lOl3 = ooI1lOl;
/* 529 */                   if (ooI1lOl2 == null) {
/* 537 */                       ooI1lOl2 = ((OoIIo0oOI1) olO0OIIl1.getValue()).I00000oOI;
                            }
/* 562 */                   olO0OIIl1.I000lI(null, OoIIo0oOI1.I00000oIO(ooIIo0oOI1, ooI1lOl3, ooI1lOl2, null, null, null, null, sharedPreferences.getBoolean("translator_auto", false), sharedPreferences.getBoolean("translator_speak", true), 60));
/* 565 */                   return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 356 */                   Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 358 */                   lIoii1l01l0i.I00000oOI(obj);
/* 364 */                   O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iiI;
                            try {
/* 377 */                       O11il1ilio1o.I000O01llI0(l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0), o1oIOiI11o0, false, true, null, null, false, 122);
/* 380 */                       objI00000oIO = OoiIlOl1iI.I00000oIO;
                            } catch (Throwable th) {
/* 384 */                       objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                            }
/* 388 */                   Throwable thI00000oOI = Oi10ii.I00000oOI(objI00000oIO);
/* 392 */                   if (thI00000oOI != null) {
/* 398 */                       Log.w("AGTranslatorViewModel", "resetConversation failed", thI00000oOI);
                            }
/* 401 */                   return Oi10ii.I00000oIO(objI00000oIO);
                        case 13:
/* 284 */                   OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 286 */                   Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 288 */                   lIoii1l01l0i.I00000oOI(obj);
/* 295 */                   Object obj3 = ((O1oIOiI11o0) this.I00iiO).I00IlilI0i0i;
/* 304 */                   II1olI iI1olI = obj3 instanceof II1olI ? (II1olI) obj3 : null;
/* 305 */                   if (iI1olI != null && iI1olI.I00000oIO != null) {
/* 316 */                       OlO0OIIl1 olO0OIIl12 = ((OoIoI0iii0) this.I00iiI).I00000oOI;
/* 323 */                       OoIo10100O1 ooIo10100O1 = (OoIo10100O1) olO0OIIl12.getValue();
/* 325 */                       OfflineTts offlineTts2 = iI1olI.I00000oIO;
/* 348 */                       olO0OIIl12.I000lI(null, OoIo10100O1.I00000oIO(ooIo10100O1, null, false, 0, 0.0f, offlineTts2 != null ? offlineTts2.numSpeakers() : 1, null, false, 0.0f, null, 495));
                            }
/* 351 */                   return ooiIlOl1iI;
                        case 14:
/* 256 */                   Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 258 */                   lIoii1l01l0i.I00000oOI(obj);
/* 263 */                   II1olI iI1olI2 = (II1olI) this.I00iiO;
                            try {
/* 265 */                       OfflineTts offlineTts3 = iI1olI2.I00000oIO;
/* 267 */                       if (offlineTts3 != null) {
/* 269 */                           offlineTts3.release();
                                }
                            } catch (Throwable unused2) {
                            }
/* 272 */                   iI1olI2.I00000oIO = null;
/* 278 */                   ((O1oiilO) this.I00iiI).invoke();
/* 281 */                   return OoiIlOl1iI.I00000oIO;
                        case 15:
/* 228 */                   Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 230 */                   lIoii1l01l0i.I00000oOI(obj);
/* 235 */                   Ool0OI ool0OI = (Ool0OI) this.I00iiO;
                            try {
/* 237 */                       CompiledModel compiledModel = ool0OI.I00000oIO;
/* 239 */                       if (compiledModel != null) {
/* 241 */                           compiledModel.close();
                                }
                            } catch (Throwable unused3) {
                            }
/* 244 */                   ool0OI.I00000oIO = null;
/* 250 */                   ((O1oiilO) this.I00iiI).invoke();
/* 253 */                   return OoiIlOl1iI.I00000oIO;
                        case 16:
/* 207 */                   Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 209 */                   lIoii1l01l0i.I00000oOI(obj);
/* 222 */                   ((Oilo101I11l0) this.I00iiO).I00000oIO(((IiIO1IliI1Ol) this.I00iiI).I00iOIl);
/* 225 */                   return OoiIlOl1iI.I00000oIO;
                        case 17:
/* 160 */                   Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 162 */                   lIoii1l01l0i.I00000oOI(obj);
/* 167 */                   WhisperEngine whisperEngine = (WhisperEngine) this.I00iiO;
/* 177 */                   if (whisperEngine.contextHandle != 0) {
/* 179 */                       whisperEngine.freeModel();
                            }
/* 1 */                     whisperEngine.contextHandle = whisperEngine.loadModelNative((String) this.I00iiI);
/* 202 */                   return Boolean.valueOf(whisperEngine.contextHandle != 0);
                        case PoseLandmark.RIGHT_PINKY:
/* 132 */                   Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 134 */                   lIoii1l01l0i.I00000oOI(obj);
/* 141 */                   ((i0I00l) this.I00iiO).I000O01llI0 = true;
/* 147 */                   ((i0I00l) this.I00iiO).I0000Il00O();
/* 154 */                   ((O1oiilO) this.I00iiI).invoke();
/* 157 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 108 */                   Ii0111o ii0111o20 = Ii0111o.I00iOIl;
/* 110 */                   lIoii1l01l0i.I00000oOI(obj);
/* 115 */                   Application application = (Application) this.I00iiO;
/* 119 */                   o00i1olooO o00i1olooo = (o00i1olooO) this.I00iiI;
/* 127 */                   return ll1IoOi1l.I00000oOI(application, "third_party_licenses", o00i1olooo.I00iiI, o00i1olooo.I00iiO);
                        case PoseLandmark.RIGHT_INDEX:
/* 86 */                    Ii0111o ii0111o21 = Ii0111o.I00iOIl;
/* 88 */                    lIoii1l01l0i.I00000oOI(obj);
/* 93 */                    Map map = (Map) this.I00iiO;
/* 95 */                    map.clear();
/* 102 */                   map.putAll((Map) this.I00iiI);
/* 105 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 14 */                    Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 16 */                    Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 18 */                    lIoii1l01l0i.I00000oOI(obj);
/* 23 */                    IOiOol0 iOiOol0 = (IOiOol0) this.I00iiO;
/* 37 */                    File file = new File(iOiOol0.I00Ol10((Context) this.I00iiI), "index");
/* 44 */                    if (!file.exists()) {
/* 85 */                        return il011I1OiO0I;
                            }
                            try {
/* 47 */                        String strI000OOo1O = IlIl10.I000OOo1O(file);
                                return !OlOoOIi0o.I001l0I00(strI000OOo1O) ? IOiOol0.I00OIl(iOiOol0, new JSONArray(strI000OOo1O)) : il011I1OiO0I;
                            } catch (IOException e2) {
/* 82 */                        Log.e("CacheFileManager", "Failed to read cache index file.", e2);
/* 85 */                        return il011I1OiO0I;
                            } catch (JSONException e3) {
/* 73 */                        Log.e("CacheFileManager", "Cache index file is corrupted.", e3);
/* 76 */                        file.delete();
/* 85 */                        return il011I1OiO0I;
                            }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public Ol0Oli(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 12 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public Ol0Oli(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 13 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iiI = obj2;
                }
            }
