            package p000;

            import android.util.Log;
            import android.widget.Magnifier;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizer;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.google.mlkit.vision.segmentation.subject.SubjectSegmenter;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
/* 12 */    public final class I0II0OiI extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Object I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0II0OiI(O0l101IIlOI0 o0l101IIlOI0, int i, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 3 */             this.I00iOIl = 25;
/* 5 */             this.I00iiO = o0l101IIlOI0;
/* 7 */             this.I00iiI = i;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 296 */                   return new I0II0OiI((I0II0i00l) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 287 */                   return new I0II0OiI((IIiI1II) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 278 */                   return new I0II0OiI((I1Oo1iio0) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 269 */                   return new I0II0OiI((OIooO1iiliI) obj2, iOoil1iiIilo, 3);
                        case 4:
/* 260 */                   return new I0II0OiI((I1iOI11ioi1) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 251 */                   return new I0II0OiI((I1o1Ii0I) obj2, iOoil1iiIilo, 5);
                        case 6:
/* 242 */                   return new I0II0OiI((IIIoloiiI1) obj2, iOoil1iiIilo, 6);
                        case 7:
/* 233 */                   return new I0II0OiI((I10i01) obj2, iOoil1iiIilo, 7);
                        case 8:
/* 224 */                   return new I0II0OiI((IIioo1) obj2, iOoil1iiIilo, 8);
                        case 9:
/* 214 */                   return new I0II0OiI((IIl10ilil1) obj2, iOoil1iiIilo, 9);
                        case 10:
/* 204 */                   return new I0II0OiI((IIo11l1iO) obj2, iOoil1iiIilo, 10);
                        case 11:
/* 194 */                   return new I0II0OiI((I0lIllO) obj2, iOoil1iiIilo, 11);
                        case 12:
/* 184 */                   return new I0II0OiI((Oi10ili0) obj2, iOoil1iiIilo, 12);
                        case 13:
/* 174 */                   return new I0II0OiI((IO1OIo01l1) obj2, iOoil1iiIilo, 13);
                        case 14:
/* 164 */                   return new I0II0OiI((IiIOI1ol0o) obj2, iOoil1iiIilo, 14);
                        case 15:
/* 154 */                   return new I0II0OiI((Ii1llll) obj2, iOoil1iiIilo, 15);
                        case 16:
/* 144 */                   return new I0II0OiI((OI11ol) obj2, iOoil1iiIilo, 16);
                        case 17:
/* 134 */                   return new I0II0OiI((IlOil1ii) obj2, iOoil1iiIilo, 17);
                        case PoseLandmark.RIGHT_PINKY:
/* 124 */                   return new I0II0OiI((IliIlIlo1i1) obj2, iOoil1iiIilo, 18);
                        case PoseLandmark.LEFT_INDEX:
/* 114 */                   return new I0II0OiI((I1Oli1lO0IoO) obj2, iOoil1iiIilo, 19);
                        case PoseLandmark.RIGHT_INDEX:
/* 104 */                   return new I0II0OiI((SpeechRecognizer) obj2, iOoil1iiIilo, 20);
                        case PoseLandmark.LEFT_THUMB:
/* 94 */                    return new I0II0OiI((Io0li1o0) obj2, iOoil1iiIilo, 21);
                        case PoseLandmark.RIGHT_THUMB:
/* 84 */                    return new I0II0OiI((Io1o01Ol0i01) obj2, iOoil1iiIilo, 22);
                        case PoseLandmark.LEFT_HIP:
/* 74 */                    return new I0II0OiI((IllOOo00lI) obj2, iOoil1iiIilo, 23);
                        case PoseLandmark.RIGHT_HIP:
/* 64 */                    return new I0II0OiI((O00lOo) obj2, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 54 */                    return new I0II0OiI((O0l101IIlOI0) obj2, this.I00iiI, iOoil1iiIilo);
                        case PoseLandmark.RIGHT_KNEE:
/* 44 */                    return new I0II0OiI((OlOO1i11110) obj2, iOoil1iiIilo, 26);
                        case 27:
/* 34 */                    return new I0II0OiI((O010OIi) obj2, iOoil1iiIilo, 27);
                        case PoseLandmark.RIGHT_ANKLE:
/* 24 */                    return new I0II0OiI((O1O1oI0i1) obj2, iOoil1iiIilo, 28);
                        default:
/* 14 */                    return new I0II0OiI((O1i1O1I) obj2, iOoil1iiIilo, 29);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
/* 409 */                   ((I0II0OiI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            break;
                        case 10:
                            break;
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        case 14:
                            break;
                        case 15:
                            break;
                        case 16:
                            break;
                        case 17:
                            break;
                        case PoseLandmark.RIGHT_PINKY:
                            break;
                        case PoseLandmark.LEFT_INDEX:
                            break;
                        case PoseLandmark.RIGHT_INDEX:
                            break;
                        case PoseLandmark.LEFT_THUMB:
                            break;
                        case PoseLandmark.RIGHT_THUMB:
                            break;
                        case PoseLandmark.LEFT_HIP:
                            break;
                        case PoseLandmark.RIGHT_HIP:
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 80 */                    ((I0II0OiI) create((OiOiliiO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case PoseLandmark.RIGHT_KNEE:
                            break;
                        case 27:
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 34 */                    ((I0II0OiI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((I0II0OiI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return Ii0111o.I00iOIl;
                }

                /* JADX WARN: Code restructure failed: missing block: B:111:0x01e9, code lost:
                
                    if (r0 == r2) goto L112;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:239:0x03fe, code lost:
                
                    if (p000.il0l1o1l.I00000oOI(2000, r24) == r0) goto L240;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
                
                    if (p000.l1i0lii.I00000oOI(r2, r24) == r1) goto L28;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Path cross not found for [B:21:0x0060, B:24:0x0069], limit reached: 421 */
                /* JADX WARN: Path cross not found for [B:24:0x0069, B:21:0x0060], limit reached: 421 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:314:0x05d6  */
                /* JADX WARN: Removed duplicated region for block: B:318:0x060e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006b -> B:19:0x005c). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007a -> B:30:0x007e). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:315:0x05de -> B:317:0x05e2). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    I1i1OOi1iIo i1i1OOi1iIo;
                    Object objI0010I0i;
                    Object objI00000oOI;
                    OIi0ooOoOOo0 oIi0ooOoOOo0;
                    Object objI0000Il00O;
                    IIIII1OI1 iiiii1oi1;
/* 6 */             int i = 3;
/* 7 */             boolean z = false;
/* 7 */             Object[] objArr = 0;
/* 8 */             int i2 = 2;
/* 11 */            int i3 = 1;
/* 12 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 1734 */                  I0II0i00l i0II0i00l = (I0II0i00l) this.I00iiO;
/* 1736 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 1738 */                  int i4 = this.I00iiI;
/* 1740 */                  if (i4 == 0) {
/* 1752 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1757 */                      OlO0OIIl1 olO0OIIl1 = i0II0i00l.I00000oIO.I00111O;
/* 1761 */                      I0I1oi i0I1oi = new I0I1oi(i2, iOoil1iiIilo, objArr == true ? 1 : 0);
/* 1764 */                      this.I00iiI = 1;
/* 1770 */                      if (ilOoO00.I00000oOI(olO0OIIl1, i0I1oi, this) == ii0111o) {
/* 1772 */                          return ii0111o;
                                }
                            } else {
/* 1742 */                      if (i4 != 1) {
/* 1748 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 1744 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1776 */                  i0II0i00l.I0000O.I0000Il00O();
/* 1779 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 1677 */                  IOi10loi iOi10loi = ((IIiI1II) this.I00iiO).I0000O;
/* 1679 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 1681 */                  int i5 = this.I00iiI;
/* 1683 */                  if (i5 == 0) {
/* 1695 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1698 */                      this.I00iiI = 1;
/* 1707 */                      if (il0l1o1l.I00000oOI(60000L, this) == ii0111o2) {
/* 1709 */                          return ii0111o2;
                                }
                            } else {
/* 1685 */                      if (i5 != 1) {
/* 1691 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 1687 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1715 */                  if (!iOi10loi.I00oII()) {
/* 1721 */                      Log.e("AGAgentChatScreen", "JS Execution timed out, completing with error.");
/* 1726 */                      iOi10loi.I00O10llo("{\"error\": \"Skill execution timed out. Please check network connection.\"}");
                            }
/* 1729 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 1596 */                  I1Oo1iio0 i1Oo1iio0 = (I1Oo1iio0) this.I00iiO;
/* 1598 */                  Object obj2 = Ii0111o.I00iOIl;
/* 1600 */                  int i6 = this.I00iiI;
/* 1602 */                  if (i6 == 0) {
/* 1614 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1622 */                      Ii1Io1loiI ii1Io1loiII0000Il00O = lOIoiooI1i01.I0000Il00O(new I10oIiiliil(i1Oo1iio0, i3));
/* 1630 */                      I00oI0i i00oI0i = new I00oI0i(i1Oo1iio0, iOoil1iiIilo, 8);
/* 1633 */                      int i7 = IlOlliIl1l10.I00000oIO;
/* 1647 */                      IO10i01 iO10i01 = new IO10i01(new I0i11IIo(i00oI0i, iOoil1iiIilo, i3), ii1Io1loiII0000Il00O, Il00o11.I00iOIl, -2, IIII0i.I00iOIl);
/* 1652 */                      I1Oo10iO i1Oo10iO = new I1Oo10iO();
/* 1655 */                      i1Oo10iO.I00iOIl = i1Oo1iio0;
/* 1657 */                      VarHandle.storeStoreFence();
/* 1660 */                      this.I00iiI = 1;
/* 1666 */                      if (iO10i01.I00000oIO(i1Oo10iO, this) == obj2) {
/* 1668 */                          return obj2;
                                }
                            } else {
/* 1604 */                      if (i6 != 1) {
/* 1610 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 1606 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1670 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 1554 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 1556 */                  int i8 = this.I00iiI;
/* 1558 */                  if (i8 != 0 && i8 != 1) {
/* 1563 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 1567 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1590 */                  do {
/* 1572 */                      OIooO1iiliI oIooO1iiliI = (OIooO1iiliI) this.I00iiO;
/* 1576 */                      i1i1OOi1iIo = new I1i1OOi1iIo(i3);
/* 1579 */                      i1i1OOi1iIo.I00iiI = oIooO1iiliI;
/* 1581 */                      VarHandle.storeStoreFence();
/* 1584 */                      this.I00iiI = 1;
/* 1590 */                  } while (l1i0lii.I00000oOI(i1i1OOi1iIo, this) != ii0111o3);
/* 1592 */                  return ii0111o3;
                        case 4:
/* 1462 */                  OlO0OIIl1 olO0OIIl12 = ((I1iOI11ioi1) this.I00iiO).I00000oOI;
/* 1464 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 1466 */                  int i9 = this.I00iiI;
/* 1468 */                  if (i9 == 0) {
/* 1480 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1493 */                      if (((I1iO1loOII1) olO0OIIl12.getValue()).I00000oIO == I1iIll0i.I00iiI) {
                                }
                            } else {
/* 1470 */                      if (i9 != 1) {
/* 1476 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 1472 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1547 */                      olO0OIIl12.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl12.getValue(), null, ((I1iO1loOII1) olO0OIIl12.getValue()).I00000oOI + 1, null, 0, null, null, null, null, null, 0.0f, null, null, 4093));
/* 1493 */                      if (((I1iO1loOII1) olO0OIIl12.getValue()).I00000oIO == I1iIll0i.I00iiI) {
/* 1495 */                          this.I00iiI = 1;
/* 1503 */                          if (il0l1o1l.I00000oOI(1000L, this) == ii0111o4) {
/* 1505 */                              return ii0111o4;
                                    }
/* 1547 */                          olO0OIIl12.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl12.getValue(), null, ((I1iO1loOII1) olO0OIIl12.getValue()).I00000oOI + 1, null, 0, null, null, null, null, null, 0.0f, null, null, 4093));
/* 1493 */                          if (((I1iO1loOII1) olO0OIIl12.getValue()).I00000oIO == I1iIll0i.I00iiI) {
/* 1551 */                              return OoiIlOl1iI.I00000oIO;
                                    }
                                }
                            }
                        case 5:
/* 1269 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 1271 */                  int i10 = this.I00iiI;
/* 1273 */                  if (i10 == 0) {
/* 1289 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1298 */                      if (((I1o1Ii0I) this.I00iiO).I0000oI00) {
/* 1300 */                          return Boolean.TRUE;
                                }
/* 1310 */                      if (((I1o1Ii0I) this.I00iiO).I0001Ioi1lo) {
/* 1312 */                          return Boolean.FALSE;
                                }
/* 1320 */                      ((I1o1Ii0I) this.I00iiO).I0001Ioi1lo = true;
/* 1324 */                      I1o1Ii0I i1o1Ii0I = (I1o1Ii0I) this.I00iiO;
/* 1326 */                      this.I00iiI = 1;
/* 1328 */                      i1o1Ii0I.getClass();
/* 1337 */                      IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(this));
/* 1340 */                      iIoOoIol0Io0.I00111O();
/* 1345 */                      ArrayList arrayList = new ArrayList();
/* 1356 */                      arrayList.add((SubjectSegmenter) i1o1Ii0I.I0000O.getValue());
/* 1361 */                      Io1IlO1I1i io1IlO1I1i = new Io1IlO1I1i();
/* 1371 */                      lII0I0I000I.I00000oIO("APIs must not be empty.", true ^ arrayList.isEmpty());
/* 1374 */                      io1IlO1I1i.I00000oIO = arrayList;
/* 1376 */                      VarHandle.storeStoreFence();
/* 1387 */                      o0IiOl o0iiolI0000O = ((i0i0iII) i1o1Ii0I.I0000Il00O.getValue()).I0000O(io1IlO1I1i);
/* 1394 */                      I01i01OoI i01i01OoI = new I01i01OoI(6);
/* 1397 */                      i01i01OoI.I00iiI = iIoOoIol0Io0;
/* 1399 */                      i01i01OoI.I00iiO = i1o1Ii0I;
/* 1401 */                      VarHandle.storeStoreFence();
/* 1406 */                      OIi0Oi1lOoo i0IIiO0iI = new I0IIiO0iI(i01i01OoI, i);
/* 1409 */                      o0iiolI0000O.getClass();
/* 1414 */                      o0iiolI0000O.I0000oI00(OloIo0oOIO0.I00000oIO, i0IIiO0iI);
/* 1419 */                      Oi0Oooi oi0Oooi = new Oi0Oooi(i, z);
/* 1422 */                      oi0Oooi.I00iiI = iIoOoIol0Io0;
/* 1424 */                      VarHandle.storeStoreFence();
/* 1427 */                      o0iiolI0000O.I0000Il00O(oi0Oooi);
/* 1430 */                      objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 1434 */                      if (objI0010I0i == ii0111o5) {
/* 1436 */                          return ii0111o5;
                                }
                            } else {
/* 1275 */                      if (i10 != 1) {
/* 1284 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 1277 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1280 */                      objI0010I0i = obj;
                            }
/* 1439 */                  Boolean bool = (Boolean) objI0010I0i;
/* 1441 */                  boolean zBooleanValue = bool.booleanValue();
/* 1449 */                  ((I1o1Ii0I) this.I00iiO).I0001Ioi1lo = false;
/* 1455 */                  ((I1o1Ii0I) this.I00iiO).I0000oI00 = zBooleanValue;
/* 1457 */                  return bool;
                        case 6:
/* 1230 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 1232 */                  int i11 = this.I00iiI;
/* 1234 */                  if (i11 != 0) {
/* 1236 */                      if (i11 == 1) {
/* 1238 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1241 */                          return obj;
                                }
/* 1244 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 1249 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1254 */                  IIIoloiiI1 iIIoloiiI1 = (IIIoloiiI1) this.I00iiO;
/* 1256 */                  this.I00iiI = 1;
/* 1258 */                  IIIolloil iIIolloil = IIIoloiiI1.I00000oIO;
/* 1260 */                  Object objI0001Ioi1lo = iIIoloiiI1.I0001Ioi1lo(1, this);
                            return objI0001Ioi1lo == ii0111o6 ? ii0111o6 : objI0001Ioi1lo;
                        case 7:
/* 1183 */                  Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 1185 */                  int i12 = this.I00iiI;
/* 1187 */                  if (i12 == 0) {
/* 1199 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1204 */                      I10i01 i10i01 = (I10i01) this.I00iiO;
/* 1208 */                      Float f = new Float(0.0f);
/* 1211 */                      this.I00iiI = 1;
/* 1223 */                      if (I10i01.I00000oIO(i10i01, f, null, null, null, this, 14) == ii0111o7) {
/* 1225 */                          return ii0111o7;
                                }
                            } else {
/* 1189 */                      if (i12 != 1) {
/* 1195 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 1191 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1227 */                  return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 1135 */                  Object obj3 = Ii0111o.I00iOIl;
/* 1137 */                  int i13 = this.I00iiI;
/* 1139 */                  if (i13 == 0) {
/* 1151 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1156 */                      IIioo1 iIioo1 = (IIioo1) this.I00iiO;
/* 1158 */                      IIiOO0o iIiOO0o = iIioo1.I00l0OO0IO;
/* 1162 */                      I0oOII1l i0oOII1l = new I0oOII1l(i2);
/* 1165 */                      i0oOII1l.I00iiI = iIioo1;
/* 1167 */                      VarHandle.storeStoreFence();
/* 1170 */                      this.I00iiI = 1;
/* 1176 */                      if (iIiOO0o.I00000oIO(i0oOII1l, this) == obj3) {
/* 1178 */                          return obj3;
                                }
                            } else {
/* 1141 */                      if (i13 != 1) {
/* 1147 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 1143 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1180 */                  return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 1030 */                  OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 1032 */                  Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 1034 */                  int i14 = this.I00iiI;
/* 1036 */                  if (i14 == 0) {
/* 1049 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1054 */                      IIl10ilil1 iIl10ilil1 = (IIl10ilil1) this.I00iiO;
/* 1056 */                      this.I00iiI = 1;
/* 1058 */                      LinkedHashMap linkedHashMap = iIl10ilil1.I0000Il00O;
/* 1066 */                      ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
/* 1073 */                      Iterator it = linkedHashMap.entrySet().iterator();
/* 1081 */                      while (it.hasNext()) {
/* 1093 */                          IIil1o0olooo iIil1o0olooo = (IIil1o0olooo) ((Map.Entry) it.next()).getValue();
/* 1099 */                          il001oo1.I00000oOI(iIil1o0olooo.I00000oOI.I0000oI00, null);
/* 1117 */                          arrayList2.add(iOi1II01i0.I00000oOI(iIil1o0olooo.I00000oIO.I00000oIO, null, new I00oIiI10(iIil1o0olooo, iOoil1iiIilo, 18), 3));
                                }
/* 1121 */                      Object objI00000oOI2 = iOOlOiI.I00000oOI(arrayList2, this);
/* 1127 */                      if (objI00000oOI2 != Ii0111o.I00iOIl) {
/* 1130 */                          objI00000oOI2 = ooiIlOl1iI;
                                }
/* 1131 */                      if (objI00000oOI2 == ii0111o8) {
/* 1133 */                          return ii0111o8;
                                }
                            } else {
/* 1038 */                      if (i14 != 1) {
/* 1045 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 1040 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1043 */                  return ooiIlOl1iI;
                        case 10:
/* 973 */                   Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 975 */                   int i15 = this.I00iiI;
/* 977 */                   if (i15 == 0) {
/* 995 */                       lIoii1l01l0i.I00000oOI(obj);
/* 1004 */                      IOi10loi iOi10loi2 = (IOi10loi) ((IIo11l1iO) this.I00iiO).I00ioIO;
/* 1006 */                      this.I00iiI = 1;
/* 1012 */                      if (iOi10loi2.I0010o(this) != ii0111o9) {
                                }
/* 1025 */                      return ii0111o9;
                            }
/* 979 */                   if (i15 != 1) {
/* 981 */                       if (i15 == 2) {
/* 983 */                           lIoii1l01l0i.I00000oOI(obj);
/* 1027 */                          return OoiIlOl1iI.I00000oIO;
                                }
/* 987 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 991 */                   lIoii1l01l0i.I00000oOI(obj);
/* 1015 */                  this.I00iiI = 2;
                            break;
                        case 11:
/* 869 */                   I0lIllO i0lIllO = (I0lIllO) this.I00iiO;
/* 871 */                   Object oIi0ooOoOOo02 = Ii0111o.I00iOIl;
/* 873 */                   int i16 = this.I00iiI;
/* 875 */                   if (i16 == 0) {
/* 889 */                       lIoii1l01l0i.I00000oOI(obj);
/* 892 */                       OlO0OIIl1 olO0OIIl13 = i0lIllO.I00111O;
/* 896 */                       I0I1oi i0I1oi2 = new I0I1oi(i2, iOoil1iiIilo, i);
/* 899 */                       this.I00iiI = 1;
/* 901 */                       objI00000oOI = ilOoO00.I00000oOI(olO0OIIl13, i0I1oi2, this);
/* 905 */                       if (objI00000oOI != oIi0ooOoOOo02) {
                                }
/* 907 */                       return oIi0ooOoOOo02;
                            }
/* 877 */                   if (i16 != 1) {
/* 885 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 879 */                   lIoii1l01l0i.I00000oOI(obj);
/* 882 */                   objI00000oOI = obj;
/* 909 */                   IIo0l10O01O0 iIo0l10O01O0 = (IIo0l10O01O0) objI00000oOI;
/* 913 */                   if (iIo0l10O01O0 instanceof IIo0olOi0li) {
/* 917 */                       oIi0ooOoOOo02 = new OIi0ooOoOOo0(i0lIllO, null, 2);
/* 907 */                       return oIi0ooOoOOo02;
                            }
/* 923 */                   if (iIo0l10O01O0 instanceof IIo0oOllO) {
/* 925 */                       i0lIllO.I00000oIO();
/* 934 */                       oIi0ooOoOOo0 = new OIi0ooOoOOo0(null, ((IIo0oOllO) iIo0l10O01O0).I00000oIO, 1);
                            } else {
/* 941 */                       if (!(iIo0l10O01O0 instanceof IIo0oOi01o1)) {
/* 958 */                           if (!(iIo0l10O01O0 instanceof IIo1II11)) {
/* 969 */                               I000II.I00000oIO();
/* 12 */                                return null;
                                    }
/* 960 */                           i0lIllO.I00000oIO();
/* 965 */                           IoOOl0iOl1io.I000OOo1O("Unexpected CameraState: ", iIo0l10O01O0);
/* 12 */                            return null;
                                }
/* 943 */                       i0lIllO.I00000oIO();
/* 952 */                       oIi0ooOoOOo0 = new OIi0ooOoOOo0(null, ((IIo0oOi01o1) iIo0l10O01O0).I000OOo1O, 1);
                            }
/* 937 */                   return oIi0ooOoOOo0;
                        case 12:
/* 828 */                   Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 830 */                   int i17 = this.I00iiI;
/* 832 */                   if (i17 != 0) {
/* 834 */                       if (i17 == 1) {
/* 836 */                           lIoii1l01l0i.I00000oOI(obj);
/* 839 */                           return obj;
                                }
/* 842 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 847 */                   lIoii1l01l0i.I00000oOI(obj);
/* 854 */                   IOi10loi iOi10loi3 = ((Oi10ili0) this.I00iiO).I00iiO;
/* 856 */                   this.I00iiI = 1;
/* 858 */                   Object objI0010o = iOi10loi3.I0010o(this);
                            return objI0010o == ii0111o10 ? ii0111o10 : objI0010o;
                        case 13:
/* 790 */                   Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 792 */                   int i18 = this.I00iiI;
/* 794 */                   if (i18 == 0) {
/* 806 */                       lIoii1l01l0i.I00000oOI(obj);
/* 813 */                       IO1loOo1o iO1loOo1o = ((IO1OIo01l1) this.I00iiO).I00000oOI;
/* 815 */                       this.I00iiI = 1;
/* 821 */                       if (iO1loOo1o.I00000oOI(this) == ii0111o11) {
/* 823 */                           return ii0111o11;
                                }
                            } else {
/* 796 */                       if (i18 != 1) {
/* 802 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 798 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 825 */                   return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 753 */                   Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 755 */                   int i19 = this.I00iiI;
/* 757 */                   if (i19 != 0) {
/* 759 */                       if (i19 == 1) {
/* 761 */                           lIoii1l01l0i.I00000oOI(obj);
/* 764 */                           return obj;
                                }
/* 767 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 772 */                   lIoii1l01l0i.I00000oOI(obj);
/* 777 */                   IiIOI1ol0o iiIOI1ol0o = (IiIOI1ol0o) this.I00iiO;
/* 779 */                   this.I00iiI = 1;
/* 781 */                   Object objI00o0iI0io1 = iiIOI1ol0o.I00o0iI0io1(this);
                            return objI00o0iI0io1 == ii0111o12 ? ii0111o12 : objI00o0iI0io1;
                        case 15:
/* 683 */                   Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 685 */                   int i20 = this.I00iiI;
/* 687 */                   if (i20 != 0) {
/* 689 */                       if (i20 == 1) {
/* 691 */                           lIoii1l01l0i.I00000oOI(obj);
/* 694 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 697 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 701 */                   lIoii1l01l0i.I00000oOI(obj);
/* 706 */                   OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 711 */                   OOo0ll111 oOo0ll1112 = new OOo0ll111();
/* 716 */                   OOo0ll111 oOo0ll1113 = new OOo0ll111();
/* 721 */                   Ii1llll ii1llll = (Ii1llll) this.I00iiO;
/* 725 */                   Oiolio oiolio = ii1llll.I00o0iI0io1.I00000oIO;
/* 729 */                   I00100o1O0lo i00100o1O0lo = new I00100o1O0lo(i);
/* 732 */                   i00100o1O0lo.I00iiI = oOo0ll111;
/* 734 */                   i00100o1O0lo.I00iiO = oOo0ll1112;
/* 736 */                   i00100o1O0lo.I00iio = oOo0ll1113;
/* 738 */                   i00100o1O0lo.I00ilI0I1 = ii1llll;
/* 740 */                   VarHandle.storeStoreFence();
/* 743 */                   this.I00iiI = 1;
/* 745 */                   oiolio.getClass();
/* 748 */                   Oiolio.I000lI(oiolio, i00100o1O0lo, this);
/* 751 */                   return ii0111o13;
                        case 16:
/* 647 */                   Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 649 */                   int i21 = this.I00iiI;
/* 651 */                   if (i21 == 0) {
/* 663 */                       lIoii1l01l0i.I00000oOI(obj);
/* 668 */                       OI11ol oI11ol = (OI11ol) this.I00iiO;
/* 670 */                       this.I00iiI = 1;
/* 676 */                       if (oI11ol.I00000oIO(this) == ii0111o14) {
/* 678 */                           return ii0111o14;
                                }
                            } else {
/* 653 */                       if (i21 != 1) {
/* 659 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 655 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 680 */                   return Boolean.TRUE;
                        case 17:
/* 604 */                   OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 606 */                   Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 608 */                   int i22 = this.I00iiI;
/* 610 */                   if (i22 == 0) {
/* 622 */                       lIoii1l01l0i.I00000oOI(obj);
/* 627 */                       IlOil1ii ilOil1ii = (IlOil1ii) this.I00iiO;
/* 629 */                       this.I00iiI = 1;
/* 633 */                       Object objI00000oIO = ilOil1ii.I00000oIO(OIIoiOooI1.I00iOIl, this);
/* 637 */                       if (objI00000oIO != ii0111o15) {
/* 640 */                           objI00000oIO = ooiIlOl1iI2;
                                }
/* 641 */                       if (objI00000oIO == ii0111o15) {
/* 643 */                           return ii0111o15;
                                }
                            } else {
/* 612 */                       if (i22 != 1) {
/* 618 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 614 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 645 */                   return ooiIlOl1iI2;
                        case PoseLandmark.RIGHT_PINKY:
/* 568 */                   Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 570 */                   int i23 = this.I00iiI;
/* 572 */                   if (i23 == 0) {
/* 584 */                       lIoii1l01l0i.I00000oOI(obj);
/* 589 */                       IliIlIlo1i1 iliIlIlo1i1 = (IliIlIlo1i1) this.I00iiO;
/* 591 */                       this.I00iiI = 1;
/* 597 */                       if (iOi10ioilO0.I00000oIO(iliIlIlo1i1, null, this) == ii0111o16) {
/* 599 */                           return ii0111o16;
                                }
                            } else {
/* 574 */                       if (i23 != 1) {
/* 580 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 576 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 601 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 532 */                   Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 534 */                   int i24 = this.I00iiI;
/* 536 */                   if (i24 == 0) {
/* 548 */                       lIoii1l01l0i.I00000oOI(obj);
/* 553 */                       I1Oli1lO0IoO i1Oli1lO0IoO = (I1Oli1lO0IoO) this.I00iiO;
/* 555 */                       this.I00iiI = 1;
/* 561 */                       if (i1Oli1lO0IoO.I00000oIO(this) == ii0111o17) {
/* 563 */                           return ii0111o17;
                                }
                            } else {
/* 538 */                       if (i24 != 1) {
/* 544 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 540 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 565 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 496 */                   Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 498 */                   int i25 = this.I00iiI;
/* 500 */                   if (i25 == 0) {
/* 512 */                       lIoii1l01l0i.I00000oOI(obj);
/* 517 */                       SpeechRecognizer speechRecognizer = (SpeechRecognizer) this.I00iiO;
/* 519 */                       this.I00iiI = 1;
/* 525 */                       if (speechRecognizer.stopRecognition(this) == ii0111o18) {
/* 527 */                           return ii0111o18;
                                }
                            } else {
/* 502 */                       if (i25 != 1) {
/* 508 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 504 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 529 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_THUMB:
/* 438 */                   OoiIlOl1iI ooiIlOl1iI3 = OoiIlOl1iI.I00000oIO;
/* 442 */                   Io0li1o0 io0li1o0 = (Io0li1o0) this.I00iiO;
/* 444 */                   Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 446 */                   int i26 = this.I00iiI;
/* 448 */                   if (i26 == 0) {
/* 466 */                       lIoii1l01l0i.I00000oOI(obj);
/* 469 */                       I0oiil10Ili i0oiil10Ili = io0li1o0.I00000oIO;
/* 471 */                       if (i0oiil10Ili != null) {
/* 473 */                           this.I00iiI = 1;
/* 475 */                           i0oiil10Ili.I001lllioOl();
/* 478 */                           if (ooiIlOl1iI3 != ii0111o19) {
                                    }
/* 492 */                           return ii0111o19;
                                }
                            } else {
/* 450 */                       if (i26 != 1) {
/* 452 */                           if (i26 == 2) {
/* 454 */                               lIoii1l01l0i.I00000oOI(obj);
/* 494 */                               return ooiIlOl1iI3;
                                    }
/* 458 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 462 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 481 */                   I0oiil10Ili i0oiil10Ili2 = io0li1o0.I00000oOI;
/* 483 */                   if (i0oiil10Ili2 != null) {
/* 485 */                       this.I00iiI = 2;
/* 487 */                       i0oiil10Ili2.I001lllioOl();
                                break;
                            }
/* 494 */                   return ooiIlOl1iI3;
                        case PoseLandmark.RIGHT_THUMB:
/* 394 */                   Io1o01Ol0i01 io1o01Ol0i01 = (Io1o01Ol0i01) this.I00iiO;
/* 396 */                   Ii0111o ii0111o20 = Ii0111o.I00iOIl;
/* 398 */                   int i27 = this.I00iiI;
/* 400 */                   if (i27 == 0) {
/* 412 */                       lIoii1l01l0i.I00000oOI(obj);
/* 415 */                       this.I00iiI = 1;
/* 423 */                       if (il0l1o1l.I00000oOI(500L, this) == ii0111o20) {
/* 425 */                           return ii0111o20;
                                }
                            } else {
/* 402 */                       if (i27 != 1) {
/* 408 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 404 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 429 */                   io1o01Ol0i01.I0000O.stopListening();
/* 432 */                   io1o01Ol0i01.I0001Ioi1lo(false);
/* 435 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_HIP:
/* 351 */                   Ii0111o ii0111o21 = Ii0111o.I00iOIl;
/* 353 */                   int i28 = this.I00iiI;
/* 355 */                   if (i28 == 0) {
/* 367 */                       lIoii1l01l0i.I00000oOI(obj);
/* 370 */                       this.I00iiI = 1;
/* 378 */                       if (il0l1o1l.I00000oOI(50L, this) == ii0111o21) {
/* 380 */                           return ii0111o21;
                                }
                            } else {
/* 357 */                       if (i28 != 1) {
/* 363 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 359 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 386 */                   ((IllOOo00lI) this.I00iiO).invoke();
/* 389 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_HIP:
/* 298 */                   Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 300 */                   int i29 = this.I00iiI;
/* 302 */                   if (i29 == 0) {
/* 316 */                       lIoii1l01l0i.I00000oOI(obj);
/* 325 */                       IlOil1ii data = ((O00lOo) this.I00iiO).I0000Il00O.getData();
/* 329 */                       this.I00iiI = 1;
/* 331 */                       objI0000Il00O = ilOoO00.I0000Il00O(data, this);
/* 335 */                       if (objI0000Il00O == ii0111o22) {
/* 337 */                           return ii0111o22;
                                }
                            } else {
/* 304 */                       if (i29 != 1) {
/* 312 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 306 */                       lIoii1l01l0i.I00000oOI(obj);
/* 309 */                       objI0000Il00O = obj;
                            }
/* 339 */                   OI0ooi10l oI0ooi10l = (OI0ooi10l) objI0000Il00O;
                            return oI0ooi10l != null ? oI0ooi10l.I00000oIO() : Il011I1OiO0I.I00iOIl;
                        case PoseLandmark.LEFT_KNEE:
/* 242 */                   Ii0111o ii0111o23 = Ii0111o.I00iOIl;
/* 244 */                   lIoii1l01l0i.I00000oOI(obj);
/* 249 */                   O0l101IIlOI0 o0l101IIlOI0 = (O0l101IIlOI0) this.I00iiO;
/* 251 */                   int i30 = this.I00iiI;
/* 253 */                   O0l0ioOlollO o0l0ioOlollO = o0l101IIlOI0.I0000O;
/* 261 */                   if (o0l0ioOlollO.I00000oOI.I000II() != i30 || o0l0ioOlollO.I0000Il00O.I000II() != 0) {
/* 271 */                       O0li0o o0li0o = o0l101IIlOI0.I000lI;
/* 273 */                       o0li0o.I0000oI00();
/* 276 */                       o0li0o.I00000oOI = null;
/* 279 */                       o0li0o.I0000Il00O = -1;
/* 281 */                       Ii1ooOol1i ii1ooOol1i = o0l101IIlOI0.I00000oIO;
                            }
/* 283 */                   o0l0ioOlollO.I00000oIO(i30, 0);
/* 286 */                   o0l0ioOlollO.I0000oI00 = null;
/* 288 */                   O0iiOioolIi o0iiOioolIi = o0l101IIlOI0.I000OiO;
/* 290 */                   if (o0iiOioolIi != null) {
/* 292 */                       o0iiOioolIi.I000iOII();
                            }
/* 295 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_KNEE:
/* 175 */                   Ii0111o ii0111o24 = Ii0111o.I00iOIl;
/* 177 */                   int i31 = this.I00iiI;
/* 179 */                   if (i31 == 0) {
/* 191 */                       lIoii1l01l0i.I00000oOI(obj);
/* 200 */                       I110IiI1I1 i110IiI1I1 = (I110IiI1I1) ((OlOO1i11110) this.I00iiO).I00iiO;
/* 204 */                       Float f2 = new Float(0.0f);
/* 216 */                       OlIOiI1iI1 olIOiI1iI1I0000Il00O = iOO01lio0.I0000Il00O(0.0f, 400.0f, new Float(0.5f), 1);
/* 220 */                       this.I00iiI = 1;
/* 235 */                       if (lOiIo0.I0001Ioi1lo(i110IiI1I1, f2, olIOiI1iI1I0000Il00O, true, null, this, 8) == ii0111o24) {
/* 237 */                           return ii0111o24;
                                }
                            } else {
/* 181 */                       if (i31 != 1) {
/* 187 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 183 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 239 */                   return OoiIlOl1iI.I00000oIO;
                        case 27:
/* 139 */                   Ii0111o ii0111o25 = Ii0111o.I00iOIl;
/* 141 */                   int i32 = this.I00iiI;
/* 143 */                   if (i32 == 0) {
/* 155 */                       lIoii1l01l0i.I00000oOI(obj);
/* 160 */                       O010OIi o010OIi = (O010OIi) this.I00iiO;
/* 162 */                       this.I00iiI = 1;
/* 168 */                       if (o010OIi.I001l0I00(this) == ii0111o25) {
/* 170 */                           return ii0111o25;
                                }
                            } else {
/* 145 */                       if (i32 != 1) {
/* 151 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 147 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 172 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_ANKLE:
/* 66 */                    O1O1oI0i1 o1O1oI0i1 = (O1O1oI0i1) this.I00iiO;
/* 68 */                    Ii0111o ii0111o26 = Ii0111o.I00iOIl;
/* 70 */                    int i33 = this.I00iiI;
/* 72 */                    if (i33 == 0) {
/* 90 */                        lIoii1l01l0i.I00000oOI(obj);
/* 93 */                        iiiii1oi1 = o1O1oI0i1.I0100i;
/* 95 */                        if (iiiii1oi1 != null) {
                                }
/* 108 */                       if (o1O1oI0i1.I00oliIiO01i == null) {
                                }
/* 125 */                       return ii0111o26;
                            }
/* 74 */                    if (i33 == 1) {
/* 86 */                        lIoii1l01l0i.I00000oOI(obj);
/* 108 */                       if (o1O1oI0i1.I00oliIiO01i == null) {
                                }
/* 125 */                       return ii0111o26;
                            }
/* 76 */                    if (i33 != 2) {
/* 82 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 78 */                    lIoii1l01l0i.I00000oOI(obj);
/* 127 */                   IIloOI iIloOI = o1O1oI0i1.I00oliIiO01i;
/* 129 */                   if (iIloOI != null) {
/* 135 */                       ((Magnifier) iIloOI.I00iiI).update();
                            }
/* 93 */                    iiiii1oi1 = o1O1oI0i1.I0100i;
/* 95 */                    if (iiiii1oi1 != null) {
/* 97 */                        this.I00iiI = 1;
/* 103 */                       if (iiiii1oi1.I000iOII(this) != ii0111o26) {
                                }
/* 125 */                       return ii0111o26;
                            }
/* 108 */                   if (o1O1oI0i1.I00oliIiO01i == null) {
/* 114 */                       O0o01OIl o0o01OIl = new O0o01OIl(10);
/* 117 */                       this.I00iiI = 2;
                                break;
                            } else {
/* 93 */                        iiiii1oi1 = o1O1oI0i1.I0100i;
/* 95 */                        if (iiiii1oi1 != null) {
                                }
/* 108 */                       if (o1O1oI0i1.I00oliIiO01i == null) {
                                }
                            }
/* 125 */                   return ii0111o26;
                        default:
/* 16 */                    Ii0111o ii0111o27 = Ii0111o.I00iOIl;
/* 18 */                    int i34 = this.I00iiI;
/* 20 */                    if (i34 != 0) {
/* 22 */                        if (i34 != 1) {
/* 24 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 28 */                        lIoii1l01l0i.I00000oOI(obj);
/* 31 */                        IOOlIIilOl0.I0000Il00O();
/* 12 */                        return null;
                            }
/* 35 */                    lIoii1l01l0i.I00000oOI(obj);
/* 38 */                    OOli1O oOli1O = O1i1oIi1il.I00000oOI;
/* 44 */                    O1i1O1I o1i1O1I = (O1i1O1I) this.I00iiO;
/* 47 */                    I0oOII1l i0oOII1l2 = new I0oOII1l(5);
/* 50 */                    i0oOII1l2.I00iiI = o1i1O1I;
/* 52 */                    VarHandle.storeStoreFence();
/* 55 */                    this.I00iiI = 1;
/* 59 */                    oOli1O.I00iOIl.I00000oIO(i0oOII1l2, this);
/* 62 */                    return ii0111o27;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public I0II0OiI(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 14 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                }
            }
