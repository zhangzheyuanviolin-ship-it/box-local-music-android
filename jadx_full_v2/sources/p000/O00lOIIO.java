            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.hardware.camera2.CameraManager;
            import android.util.Log;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.ai.edge.litert.TensorBuffer;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.k2fsa.sherpa.onnx.OfflineRecognizer;
            import com.k2fsa.sherpa.onnx.OfflineRecognizerResult;
            import com.k2fsa.sherpa.onnx.OfflineStream;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import java.util.regex.Pattern;
            
/* 10 */    public final class O00lOIIO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public final Object I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O00lOIIO(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
/* 5 */             this.I00iiO = obj2;
                }

                private final Object I00000oIO(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             lIoii1l01l0i.I00000oOI(obj);
/* 10 */            OfflineRecognizer offlineRecognizer = ((Oil1lO) this.I00iiI).I00000oIO;
/* 12 */            if (offlineRecognizer == null) {
/* 16 */                return new Oil1oo000i();
                    }
                    try {
/* 20 */                OfflineStream offlineStreamCreateStream = offlineRecognizer.createStream();
/* 30 */                offlineStreamCreateStream.acceptWaveform((float[]) this.I00iiO, WhisperEngine.SAMPLE_RATE);
/* 33 */                offlineRecognizer.decode(offlineStreamCreateStream);
/* 36 */                OfflineRecognizerResult result = offlineRecognizer.getResult(offlineStreamCreateStream);
/* 40 */                offlineStreamCreateStream.release();
/* 45 */                List list = Oil1lO.I00000oOI;
/* 91 */                return new Oil1oo000i(OlOoOIi0o.I00OIo(Oil1lO.I0000Il00O.I0000oI00(result.getText(), "")).toString(), lO1iiI1Oil.I00000oIO(result.getEmotion()), lO1iiI1Oil.I00000oIO(result.getEvent()), lO1iiI1Oil.I00000oIO(result.getLang()));
                    } catch (Throwable th) {
/* 100 */               Log.e("SenseVoiceEngine", "transcribe failed", th);
/* 105 */               return new Oil1oo000i();
                    }
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 402 */                   O00lOIIO o00lOIIO = new O00lOIIO((Long) obj2, iOoil1iiIilo, 0);
/* 405 */                   o00lOIIO.I00iiI = obj;
/* 407 */                   return o00lOIIO;
                        case 1:
/* 391 */                   O00lOIIO o00lOIIO2 = new O00lOIIO((O0oi00O1l) obj2, iOoil1iiIilo, 1);
/* 394 */                   o00lOIIO2.I00iiI = obj;
/* 396 */                   return o00lOIIO2;
                        case 2:
/* 382 */                   return new O00lOIIO((II0O1i0I1) this.I00iiI, (Exception) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 369 */                   return new O00lOIIO((O1111l) this.I00iiI, (I0iI0O1IoIoI) obj2, iOoil1iiIilo, 3);
                        case 4:
/* 356 */                   return new O00lOIIO((II0O1i0I1) this.I00iiI, (Exception) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 343 */                   return new O00lOIIO((I000l1) this.I00iiI, (Exception) obj2, iOoil1iiIilo, 5);
                        case 6:
/* 330 */                   return new O00lOIIO((O11l1I) this.I00iiI, (O1oIOiI11o0) obj2, iOoil1iiIilo, 6);
                        case 7:
/* 317 */                   return new O00lOIIO((O1Iioo1) this.I00iiI, (List) obj2, iOoil1iiIilo, 7);
                        case 8:
/* 304 */                   return new O00lOIIO((O1i1O1I) this.I00iiI, (OI10i0Il) obj2, iOoil1iiIilo, 8);
                        case 9:
/* 290 */                   return new O00lOIIO((List) this.I00iiI, (List) obj2, iOoil1iiIilo, 9);
                        case 10:
/* 274 */                   O00lOIIO o00lOIIO3 = new O00lOIIO((O1iOli000lI) obj2, iOoil1iiIilo, 10);
/* 277 */                   o00lOIIO3.I00iiI = obj;
/* 279 */                   return o00lOIIO3;
                        case 11:
/* 264 */                   return new O00lOIIO((Context) this.I00iiI, (OI10i0Il) obj2, iOoil1iiIilo, 11);
                        case 12:
/* 250 */                   return new O00lOIIO((OIoi0IIoi) this.I00iiI, (OI10i0Il) obj2, iOoil1iiIilo, 12);
                        case 13:
/* 236 */                   return new O00lOIIO((O1lo00) this.I00iiI, (O1oiilO) obj2, iOoil1iiIilo, 13);
                        case 14:
/* 222 */                   return new O00lOIIO((O1loO10Ii0I) this.I00iiI, (Bitmap) obj2, iOoil1iiIilo, 14);
                        case 15:
/* 208 */                   return new O00lOIIO((O1o1IiIllOI) this.I00iiI, (Bitmap) obj2, iOoil1iiIilo, 15);
                        case 16:
/* 194 */                   return new O00lOIIO((O1oIOiI11o0) this.I00iiI, (O1oiilO) obj2, iOoil1iiIilo, 16);
                        case 17:
/* 180 */                   return new O00lOIIO((IllOOo00lI) this.I00iiI, (OlO01l1oOil) obj2, iOoil1iiIilo, 17);
                        case PoseLandmark.RIGHT_PINKY:
/* 166 */                   return new O00lOIIO((ArrayList) this.I00iiI, (Ol1o0O0O0) obj2, iOoil1iiIilo, 18);
                        case PoseLandmark.LEFT_INDEX:
/* 152 */                   return new O00lOIIO((IiloOlIoIool) this.I00iiI, (Ili1lII) obj2, iOoil1iiIilo, 19);
                        case PoseLandmark.RIGHT_INDEX:
/* 138 */                   return new O00lOIIO((OoIlIoo1oiOo) this.I00iiI, (IIiOOI) obj2, iOoil1iiIilo, 20);
                        case PoseLandmark.LEFT_THUMB:
/* 124 */                   return new O00lOIIO((OO1I0o) this.I00iiI, (Bitmap) obj2, iOoil1iiIilo, 21);
                        case PoseLandmark.RIGHT_THUMB:
/* 108 */                   O00lOIIO o00lOIIO4 = new O00lOIIO((OIoO1Ol) obj2, iOoil1iiIilo, 22);
/* 111 */                   o00lOIIO4.I00iiI = obj;
/* 113 */                   return o00lOIIO4;
                        case PoseLandmark.LEFT_HIP:
/* 96 */                    O00lOIIO o00lOIIO5 = new O00lOIIO((iOliil) obj2, iOoil1iiIilo, 23);
/* 99 */                    o00lOIIO5.I00iiI = obj;
/* 101 */                   return o00lOIIO5;
                        case PoseLandmark.RIGHT_HIP:
/* 86 */                    return new O00lOIIO((OOl0lll0li0) this.I00iiI, (InputStream) obj2, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 72 */                    return new O00lOIIO((IOioOloI0o0) this.I00iiI, (O0oOi0I) obj2, iOoil1iiIilo, 25);
                        case PoseLandmark.RIGHT_KNEE:
/* 56 */                    O00lOIIO o00lOIIO6 = new O00lOIIO((IlliIl1l11O) obj2, iOoil1iiIilo, 26);
/* 59 */                    o00lOIIO6.I00iiI = obj;
/* 61 */                    return o00lOIIO6;
                        case 27:
/* 46 */                    return new O00lOIIO((Oil1lO) this.I00iiI, (float[]) obj2, iOoil1iiIilo, 27);
                        case PoseLandmark.RIGHT_ANKLE:
/* 32 */                    return new O00lOIIO((Oil1lO) this.I00iiI, (O1oiilO) obj2, iOoil1iiIilo, 28);
                        default:
/* 18 */                    return new O00lOIIO((OiolI10I1oOO) this.I00iiI, (OiolIO0Il) obj2, iOoil1iiIilo, 29);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 431 */                   ((O00lOIIO) create((OI0ooi10l) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 434 */                   return ooiIlOl1iI;
                        case 1:
/* 417 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 420 */                   return ooiIlOl1iI;
                        case 2:
/* 403 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 406 */                   return ooiIlOl1iI;
                        case 3:
/* 389 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 392 */                   return ooiIlOl1iI;
                        case 4:
/* 375 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 378 */                   return ooiIlOl1iI;
                        case 5:
/* 361 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 364 */                   return ooiIlOl1iI;
                        case 6:
/* 347 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 350 */                   return ooiIlOl1iI;
                        case 7:
/* 332 */                   return ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 8:
/* 318 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 321 */                   return ooiIlOl1iI;
                        case 9:
/* 303 */                   return ((O00lOIIO) create((O1i1liOl) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 10:
/* 288 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 292 */                   throw null;
                        case 11:
/* 274 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 277 */                   return ooiIlOl1iI;
                        case 12:
/* 260 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 263 */                   return ooiIlOl1iI;
                        case 13:
/* 246 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 249 */                   return ooiIlOl1iI;
                        case 14:
/* 231 */                   return ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 15:
/* 216 */                   return ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 16:
/* 202 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 205 */                   return ooiIlOl1iI;
                        case 17:
/* 188 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 191 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 174 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 177 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 160 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 163 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 146 */                   ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 149 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 131 */                   return ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_THUMB:
/* 117 */                   ((O00lOIIO) create((O00i1OoOll1I) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 120 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 103 */                   ((O00lOIIO) create(obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 106 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 90 */                    return ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_KNEE:
/* 76 */                    ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 79 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 61 */                    return ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 27:
/* 46 */                    return ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_ANKLE:
/* 32 */                    ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 35 */                    return ooiIlOl1iI;
                        default:
/* 18 */                    ((O00lOIIO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 21 */                    return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:179:0x0514 A[Catch: all -> 0x044d, TryCatch #8 {all -> 0x044d, blocks: (B:151:0x03f1, B:155:0x0413, B:161:0x047a, B:163:0x04ad, B:167:0x04ba, B:168:0x04e4, B:170:0x04ea, B:172:0x0500, B:174:0x050a, B:180:0x0525, B:179:0x0514, B:160:0x0453), top: B:279:0x03f1 }] */
                /* JADX WARN: Removed duplicated region for block: B:87:0x02c9 A[Catch: all -> 0x0201, TryCatch #1 {all -> 0x0201, blocks: (B:53:0x0181, B:55:0x01c2, B:58:0x0204, B:75:0x0271, B:76:0x029b, B:78:0x02a1, B:80:0x02b5, B:82:0x02bf, B:88:0x02da, B:87:0x02c9, B:61:0x0232, B:63:0x023c, B:64:0x024a, B:69:0x025b, B:71:0x0262, B:73:0x0268), top: B:265:0x0181 }] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    String string;
                    IIllII iIllIII00000oIO;
                    String string2;
/* 3 */             int i = this.I00iOIl;
/* 9 */             Il01100l il01100l = Il01100l.I00iOIl;
/* 18 */            int i2 = 2;
/* 20 */            int i3 = 0;
/* 21 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 22 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 26 */            Object obj2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 1897 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 1899 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1910 */                  ((OI0ooi10l) this.I00iiI).I0000O(Io1Ooo1.I00000oOI, (Long) obj2);
/* 1913 */                  return ooiIlOl1iI;
                        case 1:
/* 1860 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 1862 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1867 */                  Ii0110 ii0110 = (Ii0110) this.I00iiI;
/* 1869 */                  O0oi00O1l o0oi00O1l = (O0oi00O1l) obj2;
/* 1871 */                  I01O1lIi i01O1lIi = o0oi00O1l.I00iOIl;
/* 1883 */                  if (i01O1lIi.I00ol1().compareTo(O0oOi0I.I00iiI) >= 0) {
/* 1885 */                      i01O1lIi.I00li1OI(o0oi00O1l);
                            } else {
/* 1893 */                      l01oO1iOo.I00000oOI(ii0110.I00000oIO(), null);
                            }
/* 1896 */                  return ooiIlOl1iI;
                        case 2:
/* 1845 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 1847 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1856 */                  ((II0O1i0I1) this.I00iiI).invoke((Exception) obj2);
/* 1859 */                  return ooiIlOl1iI;
                        case 3:
/* 1825 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 1827 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1836 */                  ((O1111l) this.I00iiI).I000OOo1O.set(true);
/* 1841 */                  ((I0iI0O1IoIoI) obj2).invoke();
/* 1844 */                  return ooiIlOl1iI;
                        case 4:
/* 1810 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 1812 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1821 */                  ((II0O1i0I1) this.I00iiI).invoke((Exception) obj2);
/* 1824 */                  return ooiIlOl1iI;
                        case 5:
/* 1795 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 1797 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1806 */                  ((I000l1) this.I00iiI).invoke((Exception) obj2);
/* 1809 */                  return ooiIlOl1iI;
                        case 6:
/* 1773 */                  Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 1775 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1782 */                  ((O11l1I) this.I00iiI).I0000oI00(false);
/* 1785 */                  O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) obj2;
/* 1791 */                  l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0).I0000oI00(o1oIOiI11o0);
/* 1794 */                  return ooiIlOl1iI;
                        case 7:
/* 1704 */                  Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 1706 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1715 */                  Oilloi0llol1 oilloi0llol1 = new Oilloi0llol1();
/* 1720 */                  Iterator it = ((List) obj2).iterator();
/* 1728 */                  while (it.hasNext()) {
/* 1738 */                      oilloi0llol1.I00000oIO(((Ool10o) it.next()).I00100l0);
                            }
/* 1768 */                  return Boolean.valueOf(((Number) oilloi0llol1.I00000oOI().I000II.I00000oIO().getUpper()).intValue() > 30);
                        case 8:
/* 1685 */                  Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 1687 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1700 */                  ((OI10i0Il) obj2).setValue(((O1i1O1I) this.I00iiI).I000II());
/* 1703 */                  return ooiIlOl1iI;
                        case 9:
/* 1602 */                  Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 1604 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1607 */                  O1i1l1 o1i1l1I001IIilI0O = O1i1liOl.I001IIilI0O();
/* 1613 */                  List list = (List) this.I00iiI;
/* 1617 */                  List list2 = (List) obj2;
/* 1625 */                  ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 1636 */                  for (Object obj3 : list) {
/* 1642 */                      int i4 = i3 + 1;
/* 1644 */                      if (i3 < 0) {
/* 1666 */                          IOOi1I.I000lI();
/* 1669 */                          throw null;
                                }
/* 1646 */                      O1i1Ooo0ll o1i1Ooo0ll = (O1i1Ooo0ll) obj3;
/* 1661 */                      arrayList.add(o1i1Ooo0ll.I0000Il00O != null ? (O1i1OolO) list2.get(i3) : o1i1Ooo0ll.I00000oIO);
/* 1664 */                      i3 = i4;
                            }
/* 1670 */                  o1i1l1I001IIilI0O.I0000O();
/* 1677 */                  ((O1i1liOl) o1i1l1I001IIilI0O.I00iiI).I0010I0i(arrayList);
/* 1680 */                  return o1i1l1I001IIilI0O.I00000oOI();
                        case 10:
/* 1592 */                  Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 1594 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1601 */                  throw null;
                        case 11:
/* 1542 */                  Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 1544 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1549 */                  Context context = (Context) this.I00iiI;
/* 1557 */                  O1i0lolo o1i0lolo = new O1i0lolo(i2);
/* 1560 */                  o1i0lolo.I00iiI = (OI10i0Il) obj2;
/* 1562 */                  VarHandle.storeStoreFence();
/* 1565 */                  OOIl1Io0 oOIl1Io0 = OOIl1Io0.I00000oOI;
/* 1567 */                  IO0oo1I0oIO iO0oo1I0oIOI00000oIO = lIIOO11.I00000oIO(context);
/* 1574 */                  Io11iII11ll io11iII11ll = new Io11iII11ll(7);
/* 1577 */                  io11iII11ll.I00iiI = iO0oo1I0oIOI00000oIO;
/* 1579 */                  io11iII11ll.I00iiO = o1i0lolo;
/* 1581 */                  VarHandle.storeStoreFence();
/* 1588 */                  iO0oo1I0oIOI00000oIO.addListener(io11iII11ll, context.getMainExecutor());
/* 1591 */                  return ooiIlOl1iI;
                        case 12:
/* 1525 */                  Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 1527 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1536 */                  ((OI10i0Il) obj2).setValue((OIoi0IIoi) this.I00iiI);
/* 1539 */                  return ooiIlOl1iI;
                        case 13:
/* 1501 */                  Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 1503 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1508 */                  O1lo00 o1lo00 = (O1lo00) this.I00iiI;
                            try {
/* 1510 */                      CompiledModel compiledModel = o1lo00.I00000oIO;
/* 1512 */                      if (compiledModel != null) {
/* 1514 */                          compiledModel.close();
                                }
                            } catch (Throwable unused) {
                            }
/* 1517 */                  o1lo00.I00000oIO = null;
/* 1521 */                  ((O1oiilO) obj2).invoke();
/* 1524 */                  return ooiIlOl1iI;
                        case 14:
/* 1343 */                  Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 1345 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1351 */                  O1loO10Ii0I o1loO10Ii0I = (O1loO10Ii0I) this.I00iiI;
/* 1353 */                  CompiledModel compiledModel2 = o1loO10Ii0I.I00000oIO;
/* 1355 */                  if (compiledModel2 == null) {
/* 1357 */                      return Boolean.FALSE;
                            }
                            try {
/* 1363 */                      float[] fArrI00000oIO = O1loO10Ii0I.I00000oIO((Bitmap) obj2);
/* 1367 */                      List listCreateInputBuffers$default = CompiledModel.createInputBuffers$default(compiledModel2, 0, 1, null);
/* 1371 */                      List listCreateOutputBuffers$default = CompiledModel.createOutputBuffers$default(compiledModel2, 0, 1, null);
/* 1381 */                      ((TensorBuffer) listCreateInputBuffers$default.get(0)).writeFloat(fArrI00000oIO);
/* 1387 */                      CompiledModel.run$default(compiledModel2, listCreateInputBuffers$default, listCreateOutputBuffers$default, 0, 4, (Object) null);
/* 1396 */                      float[] fArr = ((TensorBuffer) listCreateOutputBuffers$default.get(0)).readFloat();
/* 1402 */                      if (!o1loO10Ii0I.I00000oOI) {
/* 1404 */                          o1loO10Ii0I.I00000oOI = true;
/* 1424 */                          Log.i("BoxAssistMidas", "MiDaS output floats=" + fArr.length + " (expected 65536). Verify on device.");
                                }
/* 1440 */                      int iRound = (int) Math.round(Math.sqrt(fArr.length));
/* 1441 */                      if (iRound < 1) {
/* 1443 */                          iRound = 1;
                                }
/* 1444 */                      o1loO10Ii0I.I0000O = iRound;
/* 1447 */                      float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
/* 1452 */                      if (fArrCopyOf.length > 1) {
/* 1454 */                          Arrays.sort(fArrCopyOf);
                                }
/* 1457 */                      int length = fArrCopyOf.length;
                                float f = length;
/* 1464 */                      int i5 = length - 1;
/* 1471 */                      o1loO10Ii0I.I0000oI00 = fArrCopyOf[lIiioliIlo.I0000Il00O((int) (0.85f * f), 0, i5)];
/* 1483 */                      o1loO10Ii0I.I0001Ioi1lo = fArrCopyOf[lIiioliIlo.I0000Il00O((int) (f * 0.5f), 0, i5)];
/* 1485 */                      o1loO10Ii0I.I0000Il00O = fArr;
                            } catch (Throwable th) {
/* 1490 */                      Log.e("BoxAssistMidas", "infer failed", th);
/* 1493 */                      o1loO10Ii0I.I0000Il00O = null;
/* 1495 */                      z = false;
                            }
/* 1496 */                  return Boolean.valueOf(z);
                        case 15:
/* 995 */                   Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 997 */                   lIoii1l01l0i.I00000oOI(obj);
/* 1002 */                  O1o1IiIllOI o1o1IiIllOI = (O1o1IiIllOI) this.I00iiI;
/* 1004 */                  CompiledModel compiledModel3 = o1o1IiIllOI.I00000oIO;
/* 1006 */                  if (compiledModel3 == null) {
/* 1338 */                      return il01100l;
                            }
                            try {
/* 1012 */                      Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) obj2, 224, 224, true);
/* 1016 */                      int[] iArr = new int[50176];
/* 1032 */                      bitmapCreateScaledBitmap.getPixels(iArr, 0, 224, 0, 0, 224, 224);
/* 1035 */                      float[] fArr2 = new float[150528];
/* 1039 */                      if (o1o1IiIllOI.I0000O) {
/* 1042 */                          for (int i6 = 0; i6 < 50176; i6++) {
/* 1044 */                              int i7 = iArr[i6];
/* 1061 */                              fArr2[i6] = ((((i7 >> 16) & 255) / 255.0f) - 0.485f) / 0.229f;
/* 1080 */                              fArr2[50176 + i6] = ((((i7 >> 8) & 255) / 255.0f) - 0.456f) / 0.224f;
/* 1097 */                              fArr2[100352 + i6] = (((i7 & 255) / 255.0f) - 0.406f) / 0.225f;
                                    }
                                } else {
/* 1106 */                          for (int i8 = 0; i8 < 50176; i8++) {
/* 1108 */                              int i9 = iArr[i8];
/* 1120 */                              fArr2[i8] = (((i9 >> 16) & 255) / 127.5f) - 1.0f;
/* 1132 */                              fArr2[50176 + i8] = (((i9 >> 8) & 255) / 127.5f) - 1.0f;
/* 1142 */                              fArr2[100352 + i8] = ((i9 & 255) / 127.5f) - 1.0f;
                                    }
                                }
/* 1147 */                      List listCreateInputBuffers$default2 = CompiledModel.createInputBuffers$default(compiledModel3, 0, 1, null);
/* 1151 */                      List listCreateOutputBuffers$default2 = CompiledModel.createOutputBuffers$default(compiledModel3, 0, 1, null);
/* 1161 */                      ((TensorBuffer) listCreateInputBuffers$default2.get(0)).writeFloat(fArr2);
/* 1174 */                      CompiledModel.run$default(compiledModel3, listCreateInputBuffers$default2, listCreateOutputBuffers$default2, 0, 4, (Object) null);
/* 1189 */                      float[] fArrI0000Il00O = O1o1IiIllOI.I0000Il00O(((TensorBuffer) listCreateOutputBuffers$default2.get(0)).readFloat());
/* 1210 */                      int i10 = (fArrI0000Il00O.length == 1000 && o1o1IiIllOI.I0000Il00O.size() == 1001) ? 1 : 0;
/* 1215 */                      IooO11l iooO11l = new IooO11l(0, fArrI0000Il00O.length - 1, 1);
/* 1220 */                      O1o10o o1o10o = new O1o10o(0);
/* 1223 */                      o1o10o.I00iiI = fArrI0000Il00O;
/* 1225 */                      VarHandle.storeStoreFence();
/* 1234 */                      List listI00i01iIIliI = IOOi0Ool1i.I00i01iIIliI(IOOi0Ool1i.I00Ol1ll1(iooO11l, o1o10o), 5);
/* 1246 */                      ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI00i01iIIliI, 10));
/* 1249 */                      Iterator it2 = listI00i01iIIliI.iterator();
/* 1257 */                      while (it2.hasNext()) {
/* 1265 */                          int iIntValue = ((Number) it2.next()).intValue();
/* 1277 */                          String str = (String) IOOi0Ool1i.I00II0oii1o(iIntValue + i10, o1o1IiIllOI.I0000Il00O);
/* 1279 */                          if (str == null || (string = OlOoOIi0o.I00OIo(str).toString()) == null) {
/* 1314 */                              string = "Class " + iIntValue;
                                    } else {
/* 1295 */                              if (string.length() <= 0) {
/* 1298 */                                  string = null;
                                        }
/* 1299 */                              if (string == null) {
                                        }
                                    }
/* 1325 */                          arrayList2.add(new OOI00IlO0(string, fArrI0000Il00O[iIntValue]));
                                }
/* 1329 */                      return arrayList2;
                            } catch (Throwable th2) {
/* 1335 */                      Log.e("MobileNetEngine", "classify failed", th2);
/* 1338 */                      return il01100l;
                            }
                        case 16:
/* 932 */                   Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 934 */                   lIoii1l01l0i.I00000oOI(obj);
/* 941 */                   Object obj4 = ((O1oIOiI11o0) this.I00iiI).I00IlilI0i0i;
/* 945 */                   if (obj4 instanceof O1o1IiIllOI) {
/* 949 */                       ((O1o1IiIllOI) obj4).I00000oIO();
                            } else if (obj4 instanceof OO1I0o) {
/* 957 */                       OO1I0o oO1I0o = (OO1I0o) obj4;
                                try {
/* 959 */                           CompiledModel compiledModel4 = oO1I0o.I00000oIO;
/* 961 */                           if (compiledModel4 != null) {
/* 963 */                               compiledModel4.close();
                                    }
                                } catch (Throwable unused2) {
                                }
/* 966 */                       oO1I0o.I00000oIO = null;
                            } else if (obj4 instanceof IiilI0lIiol) {
/* 973 */                       IiilI0lIiol iiilI0lIiol = (IiilI0lIiol) obj4;
                                try {
/* 975 */                           CompiledModel compiledModel5 = iiilI0lIiol.I00000oIO;
/* 977 */                           if (compiledModel5 != null) {
/* 979 */                               compiledModel5.close();
                                    }
                                } catch (Throwable unused3) {
                                }
/* 982 */                       iiilI0lIiol.I00000oIO = null;
                            }
/* 986 */                   ((O1oiilO) obj2).invoke();
/* 989 */                   return ooiIlOl1iI;
                        case 17:
/* 905 */                   Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 907 */                   lIoii1l01l0i.I00000oOI(obj);
/* 922 */                   if (((Number) ((OlO01l1oOil) obj2).getValue()).intValue() == 0) {
/* 928 */                       ((IllOOo00lI) this.I00iiI).invoke();
                            }
/* 931 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 864 */                   Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 866 */                   lIoii1l01l0i.I00000oOI(obj);
/* 871 */                   ArrayList arrayList3 = (ArrayList) this.I00iiI;
/* 873 */                   Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) obj2;
/* 875 */                   int size = arrayList3.size();
/* 879 */                   while (i3 < size) {
/* 885 */                       if (arrayList3.get(i3) != null) {
/* 899 */                           OIiilo1Ool0o.I00000oIO();
/* 21 */                            return null;
                                }
/* 891 */                       if (!ol1o0O0O0.contains(null)) {
/* 893 */                           ol1o0O0O0.add(null);
                                }
/* 896 */                       i3++;
                            }
/* 903 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 843 */                   Ii0111o ii0111o20 = Ii0111o.I00iOIl;
/* 845 */                   lIoii1l01l0i.I00000oOI(obj);
/* 856 */                   if (((IiloOlIoIool) this.I00iiI).I0000Il00O()) {
/* 860 */                       Ili1lII.I00000oIO((Ili1lII) obj2);
                            }
/* 863 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 752 */                   IIiOOI iIiOOI = (IIiOOI) obj2;
/* 759 */                   OoIlIoo1oiOo ooIlIoo1oiOo = (OoIlIoo1oiOo) this.I00iiI;
/* 761 */                   Ii0111o ii0111o21 = Ii0111o.I00iOIl;
/* 763 */                   lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 770 */                       String[] cameraIdList = ((CameraManager) ooIlIoo1oiOo.I00li1OI).getCameraIdList();
/* 776 */                       ArrayList arrayList4 = new ArrayList();
/* 779 */                       int length2 = cameraIdList.length;
/* 780 */                       while (i3 < length2) {
/* 782 */                           String str2 = cameraIdList[i3];
                                    try {
/* 784 */                               iIllIII00000oIO = iOillilIolO.I00000oIO(str2, null, null);
                                    } catch (IllegalArgumentException e) {
/* 809 */                               Log.w("PipePresenceSrc", "Could not create CameraIdentifier for system ID: " + str2, e);
/* 812 */                               iIllIII00000oIO = null;
                                    }
/* 813 */                           if (iIllIII00000oIO != null) {
/* 815 */                               arrayList4.add(iIllIII00000oIO);
                                    }
/* 818 */                           i3++;
                                }
/* 821 */                       arrayList4.toString();
/* 824 */                       ooIlIoo1oiOo.I000oI1ioi(arrayList4, null);
/* 827 */                       iIiOOI.I00000oOI(arrayList4);
                            } catch (Exception e2) {
/* 833 */                       Log.e("PipePresenceSrc", "[FetchData] Failed to refresh camera list from hardware.", e2);
/* 836 */                       ooIlIoo1oiOo.I000oI1ioi(null, e2);
/* 839 */                       iIiOOI.I0000O(e2);
                            }
/* 842 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 371 */                   Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 373 */                   lIoii1l01l0i.I00000oOI(obj);
/* 378 */                   OO1I0o oO1I0o2 = (OO1I0o) this.I00iiI;
/* 380 */                   CompiledModel compiledModel6 = oO1I0o2.I00000oIO;
/* 382 */                   if (compiledModel6 == null) {
/* 751 */                       return il01100l;
                            }
                            try {
/* 386 */                       Bitmap bitmap = (Bitmap) obj2;
/* 399 */                       int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
/* 423 */                       Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iMin) / 2, (bitmap.getHeight() - iMin) / 2, iMin, iMin), 224, 224, true);
/* 427 */                       int[] iArr2 = new int[50176];
/* 443 */                       bitmapCreateScaledBitmap2.getPixels(iArr2, 0, 224, 0, 0, 224, 224);
/* 446 */                       float[] fArr3 = new float[150528];
/* 448 */                       int i11 = 0;
/* 449 */                       while (i11 < 50176) {
/* 451 */                           int i12 = iArr2[i11];
/* 460 */                           float[] fArr4 = iO01iIiOIl.I00000oIO;
/* 464 */                           float f2 = (((i12 >> 16) & 255) / 255.0f) - fArr4[0];
/* 465 */                           float[] fArr5 = iO01iIiOIl.I00000oOI;
/* 471 */                           fArr3[i11] = f2 / fArr5[0];
/* 475 */                           int i13 = i2;
/* 492 */                           fArr3[50176 + i11] = ((((i12 >> 8) & 255) / 255.0f) - fArr4[1]) / fArr5[1];
/* 507 */                           fArr3[100352 + i11] = (((i12 & 255) / 255.0f) - fArr4[i13]) / fArr5[i13];
/* 509 */                           i11++;
/* 511 */                           i2 = i13;
                                }
/* 517 */                       List listCreateInputBuffers$default3 = CompiledModel.createInputBuffers$default(compiledModel6, 0, 1, null);
/* 521 */                       List listCreateOutputBuffers$default3 = CompiledModel.createOutputBuffers$default(compiledModel6, 0, 1, null);
/* 531 */                       ((TensorBuffer) listCreateInputBuffers$default3.get(0)).writeFloat(fArr3);
/* 544 */                       CompiledModel.run$default(compiledModel6, listCreateInputBuffers$default3, listCreateOutputBuffers$default3, 0, 4, (Object) null);
/* 555 */                       float[] fArr6 = ((TensorBuffer) listCreateOutputBuffers$default3.get(0)).readFloat();
/* 560 */                       if (fArr6.length != 0) {
/* 563 */                           float fI00II0Ol1O0l = I1IoiO1l.I00II0Ol1O0l(fArr6);
/* 567 */                           int length3 = fArr6.length;
/* 568 */                           float[] fArr7 = new float[length3];
/* 571 */                           for (int i14 = 0; i14 < length3; i14++) {
/* 582 */                               fArr7[i14] = (float) Math.exp(fArr6[i14] - fI00II0Ol1O0l);
                                    }
/* 587 */                           float fI00IO1 = I1IoiO1l.I00IO1(fArr7);
/* 591 */                           Float fValueOf = Float.valueOf(fI00IO1);
/* 598 */                           if (fI00IO1 <= 0.0f) {
/* 601 */                               fValueOf = null;
                                    }
/* 609 */                           float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
/* 611 */                           int length4 = fArr6.length;
/* 612 */                           float[] fArr8 = new float[length4];
/* 615 */                           for (int i15 = 0; i15 < length4; i15++) {
/* 620 */                               fArr8[i15] = fArr7[i15] / fFloatValue;
                                    }
/* 625 */                           fArr6 = fArr8;
                                }
/* 630 */                       IooO11l iooO11l2 = new IooO11l(0, fArr6.length - 1, 1);
/* 635 */                       O1o10o o1o10o2 = new O1o10o(1);
/* 638 */                       o1o10o2.I00iiI = fArr6;
/* 640 */                       VarHandle.storeStoreFence();
/* 649 */                       List listI00i01iIIliI2 = IOOi0Ool1i.I00i01iIIliI(IOOi0Ool1i.I00Ol1ll1(iooO11l2, o1o10o2), 5);
/* 661 */                       ArrayList arrayList5 = new ArrayList(IOOi1I.I0000O(listI00i01iIIliI2, 10));
/* 664 */                       Iterator it3 = listI00i01iIIliI2.iterator();
/* 672 */                       while (it3.hasNext()) {
/* 680 */                           int iIntValue2 = ((Number) it3.next()).intValue();
/* 690 */                           String str3 = (String) IOOi0Ool1i.I00II0oii1o(iIntValue2, oO1I0o2.I00000oOI);
/* 692 */                           if (str3 == null || (string2 = OlOoOIi0o.I00OIo(str3).toString()) == null) {
/* 727 */                               string2 = "Species " + iIntValue2;
                                    } else {
/* 708 */                               if (string2.length() <= 0) {
/* 711 */                                   string2 = null;
                                        }
/* 712 */                               if (string2 == null) {
                                        }
                                    }
/* 738 */                           arrayList5.add(new OOI00IlO0(string2, fArr6[iIntValue2]));
                                }
/* 742 */                       return arrayList5;
                            } catch (Throwable th3) {
/* 748 */                       Log.e("PlantRecogniseEngine", "identify failed", th3);
/* 751 */                       return il01100l;
                            }
                        case PoseLandmark.RIGHT_THUMB:
/* 320 */                   O00i1OoOll1I o00i1OoOll1I = (O00i1OoOll1I) this.I00iiI;
/* 322 */                   Ii0111o ii0111o23 = Ii0111o.I00iOIl;
/* 324 */                   lIoii1l01l0i.I00000oOI(obj);
/* 329 */                   O011OoiO1 o011OoiO1I00000oIO = O01oO1I1O.I00000oIO();
/* 333 */                   O011OoiO1 o011OoiO1I00000oIO2 = O01oO1I1O.I00000oIO();
/* 337 */                   i1i0olI i1i0oli = o011OoiO1I00000oIO2.I00000oOI;
/* 347 */                   O01O0o1iI o01O0o1iII0000Il00O = o011OoiO1I00000oIO2.I0000Il00O(O00i1OoOll1I.Companion.serializer(), o00i1OoOll1I);
/* 351 */                   i1i0olI i1i0oli2 = o011OoiO1I00000oIO.I00000oOI;
/* 367 */                   ((OIoO1Ol) obj2).invoke((OIO0ii) o011OoiO1I00000oIO.I00000oIO(OIO0ii.Companion.serializer(), o01O0o1iII0000Il00O));
/* 370 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 268 */                   Ii0111o ii0111o24 = Ii0111o.I00iOIl;
/* 270 */                   lIoii1l01l0i.I00000oOI(obj);
/* 273 */                   Object obj5 = this.I00iiI;
/* 275 */                   iOliil ioliil = (iOliil) obj2;
/* 279 */                   I1Il0loi i1Il0loi = (I1Il0loi) ioliil.I00ilI0I1;
/* 281 */                   i1Il0loi.addLast(obj5);
/* 286 */                   IIIII1OI1 iiiii1oi1 = (IIIII1OI1) ioliil.I00iio;
/* 294 */                   for (Object objI0000oI00 = iiiii1oi1.I0000oI00(); !(objI0000oI00 instanceof IO10l0l0); objI0000oI00 = iiiii1oi1.I0000oI00()) {
/* 296 */                       IO10lIoiO.I0000O(objI0000oI00);
/* 299 */                       i1Il0loi.addLast(objI0000oI00);
                            }
/* 307 */                   Objects.toString(i1Il0loi);
/* 314 */                   ((I00oII) ioliil.I00iiI).invoke(i1Il0loi);
/* 317 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 169 */                   Ii0111o ii0111o25 = Ii0111o.I00iOIl;
/* 171 */                   lIoii1l01l0i.I00000oOI(obj);
/* 174 */                   InputStream inputStream = (InputStream) obj2;
                            try {
/* 176 */                       OIliOo11 oIliOo11I0000Il00O = OIliOo11.I0000Il00O(inputStream);
                                try {
/* 192 */                           oIliOo11I0000Il00O.I00000oIO().I000O01llI0().I00iOIl.I00oooO(IIi0I0I0o.I011IOil, null, 0);
/* 200 */                           String strI000l1 = new OIll0O().I000l1(oIliOo11I0000Il00O);
/* 204 */                           oIliOo11I0000Il00O.close();
/* 207 */                           inputStream.close();
/* 246 */                           return OlOoOIi0o.I00OIo(Pattern.compile("\n{3,}").matcher(Pattern.compile("[ \t]+").matcher(strI000l1).replaceAll(" ")).replaceAll("\n\n")).toString();
                                } finally {
                                }
                            } catch (Throwable th4) {
                                try {
/* 262 */                           throw th4;
                                } catch (Throwable th5) {
/* 264 */                           ii1OOii.I00000oIO(inputStream, th4);
/* 267 */                           throw th5;
                                }
                            }
                        case PoseLandmark.LEFT_KNEE:
/* 152 */                   Ii0111o ii0111o26 = Ii0111o.I00iOIl;
/* 154 */                   lIoii1l01l0i.I00000oOI(obj);
/* 159 */                   IOioOloI0o0 iOioOloI0o0 = (IOioOloI0o0) this.I00iiI;
/* 163 */                   iOioOloI0o0.I00iiO = (O0oOi0I) obj2;
/* 165 */                   iOioOloI0o0.I00000oIO();
/* 168 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 89 */                    Ii0111o ii0111o27 = Ii0111o.I00iOIl;
/* 91 */                    lIoii1l01l0i.I00000oOI(obj);
/* 108 */                   Ii00lIOoi ii00lIOoi = (Ii00lIOoi) ((Ii0110) this.I00iiI).I00000oIO().I00lli11(o0iOli.I00iiO);
/* 112 */                   IOi10loi iOi10loi = new IOi10loi();
/* 128 */                   iOi1II01i0.I0000Il00O(Io0IoOIl1o.I00iOIl, ii00lIOoi, Ii01I10.I00iio, new OO11OilO(iOi10loi, (IlliIl1l11O) obj2, iOoil1iiIilo, 9));
/* 135 */                   while (!iOi10loi.I00oII()) {
                                try {
/* 142 */                           return iOi1IOoIO0l.I00000oIO(ii00lIOoi, new IIillIIO(iOi10loi, iOoil1iiIilo, i2));
                                } catch (InterruptedException unused4) {
                                }
                            }
/* 147 */                   return iOi10loi.I00II0Ol1O0l();
                        case 27:
/* 84 */                    return I00000oIO(obj);
                        case PoseLandmark.RIGHT_ANKLE:
/* 60 */                    Ii0111o ii0111o28 = Ii0111o.I00iOIl;
/* 62 */                    lIoii1l01l0i.I00000oOI(obj);
/* 67 */                    Oil1lO oil1lO = (Oil1lO) this.I00iiI;
/* 69 */                    OfflineRecognizer offlineRecognizer = oil1lO.I00000oIO;
/* 71 */                    if (offlineRecognizer != null) {
/* 73 */                        offlineRecognizer.release();
                            }
/* 76 */                    oil1lO.I00000oIO = null;
/* 80 */                    ((O1oiilO) obj2).invoke();
/* 83 */                    return ooiIlOl1iI;
                        default:
/* 31 */                    Ii0111o ii0111o29 = Ii0111o.I00iOIl;
/* 33 */                    lIoii1l01l0i.I00000oOI(obj);
/* 38 */                    OiolI10I1oOO oiolI10I1oOO = (OiolI10I1oOO) this.I00iiI;
/* 48 */                    if (oiolI10I1oOO.I00000oOI().isEmpty()) {
/* 56 */                        oiolI10I1oOO.I00000oOI.I00l0I0l0lO1.remove(oiolI10I1oOO.I00000oIO);
                            }
/* 59 */                    return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public O00lOIIO(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 12 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                }
            }
