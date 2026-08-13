            package p000;

            import android.content.ContentValues;
            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.os.Environment;
            import android.provider.MediaStore;
            import android.util.Log;
            import com.google.ai.edge.gallery.stablediffusion.StableDiffusion;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.ai.edge.litert.TensorBuffer;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.jegly.offlineLLM.smollm.GGUFReader;
            import com.k2fsa.sherpa.onnx.FastClusteringConfig;
            import com.k2fsa.sherpa.onnx.OfflineSpeakerDiarization;
            import com.k2fsa.sherpa.onnx.OfflineSpeakerDiarizationConfig;
            import com.k2fsa.sherpa.onnx.OfflineSpeakerDiarizationSegment;
            import com.k2fsa.sherpa.onnx.OfflineSpeakerSegmentationModelConfig;
            import com.k2fsa.sherpa.onnx.OfflineSpeakerSegmentationPyannoteModelConfig;
            import com.k2fsa.sherpa.onnx.SpeakerEmbeddingExtractorConfig;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            import sun.misc.Unsafe;
            
/* 10 */    public final class I1iIil1I extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final Object I00iiI;
                public Object I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1iIil1I(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
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
/* 402 */                   return new I1iIil1I((I0lIi00oO) this.I00iiO, (I1iIilil) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 389 */                   return new I1iIil1I((I1iIilO0io01) this.I00iiO, (I1iIilil) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 376 */                   return new I1iIil1I((I1iOI11ioi1) this.I00iiO, (float[]) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 363 */                   return new I1iIil1I((I1iOI11ioi1) this.I00iiO, (Context) obj2, iOoil1iiIilo, 3);
                        case 4:
/* 350 */                   return new I1iIil1I((Context) this.I00iiO, (Bitmap) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 337 */                   return new I1iIil1I((Context) this.I00iiO, (Intent) obj2, iOoil1iiIilo, 5);
                        case 6:
/* 324 */                   return new I1iIil1I((II10ili1) this.I00iiO, (O1oiilO) obj2, iOoil1iiIilo, 6);
                        case 7:
/* 311 */                   return new I1iIil1I((IO0Il0o1OI) this.I00iiO, (OoooIIOo10) obj2, iOoil1iiIilo, 7);
                        case 8:
/* 298 */                   return new I1iIil1I((IIl0oO) this.I00iiO, (String) obj2, iOoil1iiIilo, 8);
                        case 9:
/* 284 */                   return new I1iIil1I((Oil1Oil1i01l) this.I00iiO, (IlliIl1l11O) obj2, iOoil1iiIilo, 9);
                        case 10:
/* 268 */                   I1iIil1I i1iIil1I = new I1iIil1I((Ii0i1Iolo) obj2, iOoil1iiIilo, 10);
/* 271 */                   i1iIil1I.I00iiO = obj;
/* 273 */                   return i1iIil1I;
                        case 11:
/* 258 */                   return new I1iIil1I((String) this.I00iiO, (OI10i0Il) obj2, iOoil1iiIilo, 11);
                        case 12:
/* 242 */                   I1iIil1I i1iIil1I2 = new I1iIil1I((OlO00iO01io) obj2, iOoil1iiIilo, 12);
/* 245 */                   i1iIil1I2.I00iiO = obj;
/* 247 */                   return i1iIil1I2;
                        case 13:
/* 230 */                   I1iIil1I i1iIil1I3 = new I1iIil1I((II00OOlli) obj2, iOoil1iiIilo, 13);
/* 233 */                   i1iIil1I3.I00iiO = obj;
/* 235 */                   return i1iIil1I3;
                        case 14:
/* 218 */                   I1iIil1I i1iIil1I4 = new I1iIil1I((Ol0ioI1iI) obj2, iOoil1iiIilo, 14);
/* 221 */                   i1iIil1I4.I00iiO = obj;
/* 223 */                   return i1iIil1I4;
                        case 15:
/* 206 */                   I1iIil1I i1iIil1I5 = new I1iIil1I((List) obj2, iOoil1iiIilo, 15);
/* 209 */                   i1iIil1I5.I00iiO = obj;
/* 211 */                   return i1iIil1I5;
                        case 16:
/* 194 */                   I1iIil1I i1iIil1I6 = new I1iIil1I((Oo0oOoIo0ol) obj2, iOoil1iiIilo, 16);
/* 197 */                   i1iIil1I6.I00iiO = obj;
/* 199 */                   return i1iIil1I6;
                        case 17:
/* 184 */                   return new I1iIil1I((IiilI0lIiol) this.I00iiO, (Bitmap) obj2, iOoil1iiIilo, 17);
                        case PoseLandmark.RIGHT_PINKY:
/* 170 */                   return new I1iIil1I((Function1) this.I00iiO, (O1ol100o0O) obj2, iOoil1iiIilo, 18);
                        case PoseLandmark.LEFT_INDEX:
/* 156 */                   return new I1iIil1I((Function1) this.I00iiO, (Oo1O0Ol0ll) obj2, iOoil1iiIilo, 19);
                        case PoseLandmark.RIGHT_INDEX:
/* 142 */                   return new I1iIil1I((IlI00iOi1) this.I00iiO, (Bitmap) obj2, iOoil1iiIilo, 20);
                        case PoseLandmark.LEFT_THUMB:
/* 128 */                   return new I1iIil1I((IlI1loI1lO1) this.I00iiO, (Context) obj2, iOoil1iiIilo, 21);
                        case PoseLandmark.RIGHT_THUMB:
/* 114 */                   return new I1iIil1I((Ili000) this.I00iiO, (O1oiilO) obj2, iOoil1iiIilo, 22);
                        case PoseLandmark.LEFT_HIP:
/* 100 */                   return new I1iIil1I((GGUFReader) this.I00iiO, (String) obj2, iOoil1iiIilo, 23);
                        case PoseLandmark.RIGHT_HIP:
/* 86 */                    return new I1iIil1I((Ii0l0Olio10) this.I00iiO, (OI10i0Il) obj2, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 72 */                    return new I1iIil1I((O1ol100o0O) this.I00iiO, (OI10i0Il) obj2, iOoil1iiIilo, 25);
                        case PoseLandmark.RIGHT_KNEE:
/* 58 */                    return new I1iIil1I((IiI0O1Io) this.I00iiO, (OIooi1iOiOol) obj2, iOoil1iiIilo, 26);
                        case 27:
/* 44 */                    return new I1iIil1I((IoiIII) this.I00iiO, (O1oIOiI11o0) obj2, iOoil1iiIilo, 27);
                        case PoseLandmark.RIGHT_ANKLE:
/* 30 */                    return new I1iIil1I((StableDiffusion) this.I00iiO, (O1oiilO) obj2, iOoil1iiIilo, 28);
                        default:
/* 14 */                    I1iIil1I i1iIil1I7 = new I1iIil1I((I10oIiiliil) obj2, iOoil1iiIilo, 29);
/* 17 */                    i1iIil1I7.I00iiO = obj;
/* 19 */                    return i1iIil1I7;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 437 */                   ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 440 */                   return ooiIlOl1iI;
                        case 1:
/* 423 */                   ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 426 */                   return ooiIlOl1iI;
                        case 2:
/* 408 */                   return ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 3:
/* 393 */                   return ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 4:
/* 378 */                   return ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 5:
/* 364 */                   ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 367 */                   return ooiIlOl1iI;
                        case 6:
/* 350 */                   ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 353 */                   return ooiIlOl1iI;
                        case 7:
/* 336 */                   ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 339 */                   return ooiIlOl1iI;
                        case 8:
/* 321 */                   return ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 9:
/* 307 */                   ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 310 */                   return ooiIlOl1iI;
                        case 10:
/* 292 */                   return ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 11:
/* 278 */                   ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 281 */                   return ooiIlOl1iI;
                        case 12:
/* 263 */                   return ((I1iIil1I) create((OlO00iO01io) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 13:
/* 248 */                   return ((I1iIil1I) create((II00iIliI0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 14:
/* 233 */                   return ((I1iIil1I) create((Ol0olo0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 15:
/* 218 */                   return ((I1iIil1I) create((Oio11o) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 16:
/* 203 */                   return ((I1iIil1I) create((Oio11o) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 17:
/* 188 */                   return ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_PINKY:
/* 174 */                   ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 177 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 160 */                   ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 163 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 145 */                   return ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_THUMB:
/* 131 */                   ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 134 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_THUMB:
/* 117 */                   ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 120 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 103 */                   ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 106 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 89 */                    ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 92 */                    return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 75 */                    ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 78 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 61 */                    ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 64 */                    return ooiIlOl1iI;
                        case 27:
/* 47 */                    ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 50 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_ANKLE:
/* 33 */                    ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 36 */                    return ooiIlOl1iI;
                        default:
/* 18 */                    return ((I1iIil1I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
                
                    return r0.invoke();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
                
                    r9.I00100l0();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
                
                    throw r0;
                 */
                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:186:0x0641  */
                /* JADX WARN: Removed duplicated region for block: B:229:0x06e3  */
                /* JADX WARN: Removed duplicated region for block: B:230:0x06e7  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    Object[] objArr;
                    OloI1ool0Ilo oloI1ool0Ilo;
                    OloI1l oloI1lI000l1;
                    Uri uriInsert;
                    Object next;
                    Object next2;
/* 9 */             z = false;
/* 9 */             boolean z = false;
/* 9 */             boolean z2 = false;
/* 9 */             z = false;
/* 9 */             z = false;
/* 9 */             boolean z3 = false;
/* 10 */            IloOi11lo iloOi11lo = null;
/* 10 */            Object[] objArr2 = 0;
/* 10 */            Object[] objArr3 = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 2000 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 2002 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2015 */                  ((I0lIi00oO) this.I00iiO).I001l0I00(((I1iIilil) this.I00iiI).I00000oIO);
/* 2018 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 1960 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 1962 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1971 */                  Iterator it = ((I1iIilO0io01) this.I00iiO).I0000oI00.iterator();
/* 1979 */                  while (it.hasNext()) {
/* 1993 */                      ((IIlOl1oOlo1o) it.next()).I001l0I00(((I1iIilil) this.I00iiI).I00000oIO);
                            }
/* 1997 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 1783 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 1785 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1790 */                  I1iOI11ioi1 i1iOI11ioi1 = (I1iOI11ioi1) this.I00iiO;
/* 1792 */                  IIlio101Io iIlio101Io = i1iOI11ioi1.I0000O;
/* 1796 */                  float[] fArr = (float[]) this.I00iiI;
/* 1806 */                  int i = ((I1iO1loOII1) i1iOI11ioi1.I00000oOI.getValue()).I0000O;
/* 1808 */                  Il01100l il01100l = Il01100l.I00iOIl;
/* 1818 */                  if (((String) iIlio101Io.I00iiI).length() <= 0 || ((String) iIlio101Io.I00iiO).length() <= 0) {
/* 1959 */                      return il01100l;
                            }
                            try {
/* 1897 */                      OfflineSpeakerDiarization offlineSpeakerDiarization = new OfflineSpeakerDiarization(null, new OfflineSpeakerDiarizationConfig(new OfflineSpeakerSegmentationModelConfig(new OfflineSpeakerSegmentationPyannoteModelConfig((String) iIlio101Io.I00iiI), 0, false, null, 14, null), new SpeakerEmbeddingExtractorConfig((String) iIlio101Io.I00iiO, 0, false, null, 14, null), new FastClusteringConfig(i > 0 ? i : -1, i > 0 ? -1.0f : 0.9f), 0.2f, 0.5f));
/* 1900 */                      OfflineSpeakerDiarizationSegment[] offlineSpeakerDiarizationSegmentArrProcess = offlineSpeakerDiarization.process(fArr);
/* 1904 */                      offlineSpeakerDiarization.release();
/* 1910 */                      ArrayList arrayList = new ArrayList(offlineSpeakerDiarizationSegmentArrProcess.length);
/* 1914 */                      for (OfflineSpeakerDiarizationSegment offlineSpeakerDiarizationSegment : offlineSpeakerDiarizationSegmentArrProcess) {
/* 1920 */                          float start = offlineSpeakerDiarizationSegment.getStart();
/* 1924 */                          float end = offlineSpeakerDiarizationSegment.getEnd();
/* 1928 */                          int speaker = offlineSpeakerDiarizationSegment.getSpeaker();
/* 1932 */                          Iii0ooll iii0ooll = new Iii0ooll();
/* 1935 */                          iii0ooll.I00000oIO = start;
/* 1937 */                          iii0ooll.I00000oOI = end;
/* 1939 */                          iii0ooll.I0000Il00O = speaker;
/* 1941 */                          VarHandle.storeStoreFence();
/* 1944 */                          arrayList.add(iii0ooll);
                                }
/* 1952 */                      return arrayList;
                            } catch (Throwable th) {
/* 1956 */                      Log.e("DiarizationEngine", "Diarization failed", th);
/* 1959 */                      return il01100l;
                            }
                        case 3:
/* 1507 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 1509 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1514 */                  I1iOI11ioi1 i1iOI11ioi12 = (I1iOI11ioi1) this.I00iiO;
/* 1516 */                  IIlio101Io iIlio101Io2 = i1iOI11ioi12.I0000O;
/* 1520 */                  Context context = (Context) this.I00iiI;
/* 1524 */                  I1iO0i1ii i1iO0i1ii = new I1iO0i1ii(1);
/* 1527 */                  i1iO0i1ii.I00iiI = i1iOI11ioi12;
/* 1529 */                  VarHandle.storeStoreFence();
/* 1532 */                  iIlio101Io2.getClass();
/* 1543 */                  File file = new File(context.getExternalFilesDir(null), "__diar_models");
/* 1546 */                  file.mkdirs();
/* 1553 */                  File file2 = new File(file, "seg.onnx");
/* 1560 */                  File file3 = new File(file, "emb.onnx");
/* 1567 */                  if (!file3.exists()) {
/* 1576 */                      i1iO0i1ii.invoke(Float.valueOf(0.05f));
/* 1581 */                      Iii100III1Ol iii100III1Ol = new Iii100III1Ol(0);
/* 1584 */                      iii100III1Ol.I00iiI = i1iO0i1ii;
/* 1586 */                      VarHandle.storeStoreFence();
/* 1595 */                      if (!IIlio101Io.I00o0iI0io1("https://github.com/k2-fsa/sherpa-onnx/releases/download/speaker-recongition-models/3dspeaker_speech_eres2net_base_sv_zh-cn_3dspeaker_16k.onnx", file3, iii100III1Ol)) {
/* 1597 */                          file3.delete();
                                } else if (!file2.exists()) {
/* 1614 */                          i1iO0i1ii.invoke(Float.valueOf(0.5f));
/* 1621 */                          File file4 = new File(file, "seg_tmp.tar.bz2");
/* 1626 */                          Iii100III1Ol iii100III1Ol2 = new Iii100III1Ol(1);
/* 1629 */                          iii100III1Ol2.I00iiI = i1iO0i1ii;
/* 1631 */                          VarHandle.storeStoreFence();
/* 1640 */                          if (IIlio101Io.I00o0iI0io1("https://github.com/k2-fsa/sherpa-onnx/releases/download/speaker-segmentation-models/sherpa-onnx-reverb-diarization-v1.tar.bz2", file4, iii100III1Ol2)) {
/* 1654 */                              i1iO0i1ii.invoke(Float.valueOf(0.92f));
                                        try {
/* 1669 */                                  oloI1ool0Ilo = new OloI1ool0Ilo(new I1lllO(new FileInputStream(file4)));
                                            try {
                                            } catch (Throwable th2) {
                                                try {
/* 1747 */                                          throw th2;
                                                } catch (Throwable th3) {
/* 1749 */                                          ii1OOii.I00000oIO(oloI1ool0Ilo, th2);
/* 1752 */                                          throw th3;
                                                }
                                            }
                                        } catch (Throwable th4) {
/* 1755 */                                  Log.e("DiarizationEngine", "Tarball extraction failed", th4);
                                        }
/* 1676 */                              for (oloI1lI000l1 = oloI1ool0Ilo.I000l1(); oloI1lI000l1 != null; oloI1lI000l1 = oloI1ool0Ilo.I000l1()) {
/* 1682 */                                  if (!oloI1lI000l1.I00000oOI() && OlOolloIIOl0.I000II(oloI1lI000l1.I00000oIO, "model.onnx", false)) {
/* 1694 */                                      File parentFile = file2.getParentFile();
/* 1698 */                                      if (parentFile != null) {
/* 1700 */                                          parentFile.mkdirs();
                                                }
/* 1709 */                                      FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                try {
/* 1712 */                                          iOiOlIoI.I00000oIO(oloI1ool0Ilo, fileOutputStream);
/* 1715 */                                          fileOutputStream.close();
/* 1718 */                                          oloI1ool0Ilo.close();
/* 1721 */                                          objArr = true;
/* 1759 */                                          file4.delete();
/* 1762 */                                          if (objArr == true) {
/* 1764 */                                              file2.delete();
                                                    } else {
/* 1774 */                                              i1iO0i1ii.invoke(Float.valueOf(1.0f));
/* 1777 */                                              z3 = true;
                                                    }
                                                } finally {
                                                }
                                            }
                                        }
/* 1740 */                              Log.e("DiarizationEngine", "model.onnx not found in tarball");
/* 1743 */                              oloI1ool0Ilo.close();
/* 1758 */                              objArr = false;
/* 1759 */                              file4.delete();
/* 1762 */                              if (objArr == true) {
                                        }
                                    } else {
/* 1642 */                              file4.delete();
                                    }
                                }
                            }
/* 1778 */                  return Boolean.valueOf(z3);
                        case 4:
/* 1399 */                  Context context2 = (Context) this.I00iiO;
/* 1403 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 1405 */                  lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 1410 */                      ContentValues contentValues = new ContentValues();
/* 1436 */                      contentValues.put("_display_name", "bgremoval_" + System.currentTimeMillis() + ".png");
/* 1443 */                      contentValues.put("mime_type", "image/png");
/* 1450 */                      contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
/* 1459 */                      uriInsert = context2.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            } catch (Exception unused) {
                            }
/* 1463 */                  if (uriInsert == null) {
/* 1465 */                      return Boolean.FALSE;
                            }
/* 1472 */                  OutputStream outputStreamOpenOutputStream = context2.getContentResolver().openOutputStream(uriInsert);
/* 1476 */                  if (outputStreamOpenOutputStream != null) {
                                try {
/* 1486 */                          ((Bitmap) this.I00iiI).compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
/* 1489 */                          outputStreamOpenOutputStream.close();
                                } finally {
                                }
                            }
/* 1501 */                  z2 = true;
/* 1502 */                  return Boolean.valueOf(z2);
                        case 5:
/* 1372 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 1374 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1391 */                  ((Context) this.I00iiO).startActivity(Intent.createChooser((Intent) this.I00iiI, "Share image"));
/* 1394 */                  return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 1344 */                  Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 1346 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1353 */                  ((II10ili1) this.I00iiO).I000O01llI0 = true;
/* 1359 */                  ((II10ili1) this.I00iiO).I0000Il00O();
/* 1366 */                  ((O1oiilO) this.I00iiI).invoke();
/* 1369 */                  return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 1318 */                  Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 1320 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1325 */                  IO0Il0o1OI iO0Il0o1OI = (IO0Il0o1OI) this.I00iiO;
/* 1327 */                  if (iO0Il0o1OI != null) {
/* 1329 */                      iO0Il0o1OI.I000iOII();
                            }
/* 1334 */                  OoooIIOo10 ooooIIOo10 = (OoooIIOo10) this.I00iiI;
/* 1336 */                  if (ooooIIOo10 != null) {
/* 1338 */                      ooooIIOo10.I00000oIO(null);
                            }
/* 1341 */                  return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 1300 */                  Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 1302 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1313 */                  return ((IIl0oO) this.I00iiO).I00000oIO((String) this.I00iiI);
                        case 9:
/* 1275 */                  Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 1277 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1282 */                  Oil1Oil1i01l oil1Oil1i01l = (Oil1Oil1i01l) this.I00iiO;
/* 1284 */                  if (oil1Oil1i01l != null) {
/* 1294 */                      ((IlliIl1l11O) this.I00iiI).invoke(oil1Oil1i01l.I00000oIO, oil1Oil1i01l.I00000oOI);
                            }
/* 1297 */                  return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 1232 */                  Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 1234 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1239 */                  Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 1243 */                  Ii0i1Iolo ii0i1Iolo = (Ii0i1Iolo) this.I00iiI;
/* 1270 */                  return Boolean.valueOf(ii0i1Iolo.I00000oOI.compareAndSet(null, iOi1II01i0.I0000O(ii0110, null, null, new I00oI0i((O010OIi) ii0i1Iolo.I00000oOI.getAndSet(null), ii0i1Iolo, objArr2 == true ? 1 : 0, 27), 3)));
                        case 11:
/* 1170 */                  Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 1172 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1177 */                  String str = (String) this.I00iiO;
/* 1181 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 1197 */                  if (!O0000Ioio00.I0000O(str, ((Oo0OI01Il) oI10i0Il.getValue()).I00000oIO.I00iiI)) {
/* 1226 */                      oI10i0Il.setValue(Oo0OI01Il.I00000oOI((Oo0OI01Il) oI10i0Il.getValue(), str, lOliOi0Oi.I00000oOI(str.length(), ((Oo0OI01Il) oI10i0Il.getValue()).I00000oOI), 4));
                            }
/* 1229 */                  return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 1137 */                  Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 1139 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1144 */                  OlO00iO01io olO00iO01io = (OlO00iO01io) this.I00iiO;
/* 1148 */                  if ((olO00iO01io instanceof Ii11I1iOiIo) && ((Ii11I1iOiIo) olO00iO01io).I00000oIO <= ((Ii11I1iOiIo) ((OlO00iO01io) this.I00iiI)).I00000oIO) {
/* 1164 */                      z = true;
                            }
/* 1165 */                  return Boolean.valueOf(z);
                        case 13:
/* 1105 */                  II00iIliI0 iI00iIliI0 = (II00iIliI0) this.I00iiO;
/* 1107 */                  Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 1109 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1116 */                  II00i0I1io iI00i0I1io = (II00i0I1io) iI00iIliI0.I00100o1O0lo();
/* 1120 */                  II00OOlli iI00OOlli = (II00OOlli) this.I00iiI;
/* 1122 */                  iI00i0I1io.I0000O();
/* 1129 */                  ((II00iIliI0) iI00i0I1io.I00iiI).I0010I0i(iI00OOlli);
/* 1132 */                  return iI00i0I1io.I00000oOI();
                        case 14:
/* 1050 */                  Ol0olo0 ol0olo0 = (Ol0olo0) this.I00iiO;
/* 1052 */                  Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 1054 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1059 */                  Ol0ioI1iI ol0ioI1iI = (Ol0ioI1iI) this.I00iiI;
/* 1061 */                  O101lO1 o101lO1I0000oI00 = IOOi1I.I0000oI00();
/* 1065 */                  o101lO1I0000oI00.add(ol0ioI1iI);
/* 1072 */                  o101lO1I0000oI00.addAll(ol0olo0.I001IIilI0O());
/* 1075 */                  O101lO1 o101lO1I0000Il00O = IOOi1I.I0000Il00O(o101lO1I0000oI00);
/* 1083 */                  Ol0olO ol0olO = (Ol0olO) ol0olo0.I00100o1O0lo();
/* 1085 */                  ol0olO.I0000O();
/* 1092 */                  ((Ol0olo0) ol0olO.I00iiI).I0010o();
/* 1095 */                  ol0olO.I000II(o101lO1I0000Il00O);
/* 1098 */                  return ol0olO.I00000oOI();
                        case 15:
/* 1004 */                  Oio11o oio11o = (Oio11o) this.I00iiO;
/* 1006 */                  Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 1008 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1015 */                  Oio0ooOi0 oio0ooOi0 = (Oio0ooOi0) oio11o.I00100o1O0lo();
/* 1017 */                  oio0ooOi0.I0000O();
/* 1024 */                  ((Oio11o) oio0ooOi0.I00iiI).I001IIilI0O();
/* 1029 */                  List list = (List) this.I00iiI;
/* 1033 */                  oio0ooOi0.I0000O();
/* 1040 */                  ((Oio11o) oio0ooOi0.I00iiI).I0010o(list);
/* 1043 */                  return oio0ooOi0.I00000oOI();
                        case 16:
/* 970 */                   Oio11o oio11o2 = (Oio11o) this.I00iiO;
/* 972 */                   Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 974 */                   lIoii1l01l0i.I00000oOI(obj);
/* 981 */                   Oio0ooOi0 oio0ooOi02 = (Oio0ooOi0) oio11o2.I00100o1O0lo();
/* 985 */                   Oo0oOoIo0ol oo0oOoIo0ol = (Oo0oOoIo0ol) this.I00iiI;
/* 987 */                   oio0ooOi02.I0000O();
/* 994 */                   ((Oio11o) oio0ooOi02.I00iiI).I00IlilI0i0i(oo0oOoIo0ol);
/* 997 */                   return oio0ooOi02.I00000oOI();
                        case 17:
/* 810 */                   Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 812 */                   lIoii1l01l0i.I00000oOI(obj);
/* 819 */                   CompiledModel compiledModel = ((IiilI0lIiol) this.I00iiO).I00000oIO;
/* 821 */                   if (compiledModel == null) {
/* 10 */                        return null;
                            }
                            try {
/* 837 */                       int[] iArr = new int[262144];
/* 848 */                       Bitmap.createScaledBitmap((Bitmap) this.I00iiI, Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A, true).getPixels(iArr, 0, Barcode.FORMAT_UPC_A, 0, 0, Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A);
/* 853 */                       float[] fArr2 = new float[786432];
/* 856 */                       for (int i2 = 0; i2 < 262144; i2++) {
/* 858 */                           int i3 = iArr[i2];
/* 868 */                           float[] fArr3 = iIIo11.I00000oIO;
/* 872 */                           float f = (((i3 >> 16) & 255) / 255.0f) - fArr3[0];
/* 873 */                           float[] fArr4 = iIIo11.I00000oOI;
/* 878 */                           fArr2[i2] = f / fArr4[0];
/* 894 */                           fArr2[262144 + i2] = ((((i3 >> 8) & 255) / 255.0f) - fArr3[1]) / fArr4[1];
/* 909 */                           fArr2[524288 + i2] = (((i3 & 255) / 255.0f) - fArr3[2]) / fArr4[2];
                                }
/* 916 */                       List listCreateInputBuffers$default = CompiledModel.createInputBuffers$default(compiledModel, 0, 1, null);
/* 920 */                       List listCreateOutputBuffers$default = CompiledModel.createOutputBuffers$default(compiledModel, 0, 1, null);
/* 930 */                       ((TensorBuffer) listCreateInputBuffers$default.get(0)).writeFloat(fArr2);
/* 936 */                       CompiledModel.run$default(compiledModel, listCreateInputBuffers$default, listCreateOutputBuffers$default, 0, 4, (Object) null);
/* 955 */                       return new Float(I1IoiO1l.I00IO1(((TensorBuffer) listCreateOutputBuffers$default.get(0)).readFloat()));
                            } catch (Throwable th5) {
/* 964 */                       Log.e("DmCountEngine", "count failed", th5);
/* 10 */                        return null;
                            }
                        case PoseLandmark.RIGHT_PINKY:
/* 789 */                   Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 791 */                   lIoii1l01l0i.I00000oOI(obj);
/* 804 */                   ((Function1) this.I00iiO).invoke(((O1ol100o0O) this.I00iiI).I000iOII);
/* 807 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 764 */                   Ii0111o ii0111o20 = Ii0111o.I00iOIl;
/* 766 */                   lIoii1l01l0i.I00000oOI(obj);
/* 783 */                   ((Function1) this.I00iiO).invoke(((Oo1O0Ol0ll) this.I00iiI).I00000oOI.I0010I0i());
/* 786 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 575 */                   Bitmap bitmapCreateScaledBitmap = (Bitmap) this.I00iiI;
/* 577 */                   Ii0111o ii0111o21 = Ii0111o.I00iOIl;
/* 579 */                   lIoii1l01l0i.I00000oOI(obj);
/* 586 */                   CompiledModel compiledModel2 = ((IlI00iOi1) this.I00iiO).I00000oIO;
/* 588 */                   if (compiledModel2 == null) {
/* 10 */                        return null;
                            }
                            try {
/* 598 */                       if (bitmapCreateScaledBitmap.getWidth() != 112 || bitmapCreateScaledBitmap.getHeight() != 112) {
/* 611 */                           bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, 112, 112, true);
                                }
/* 618 */                       int[] iArr2 = new int[12544];
/* 629 */                       bitmapCreateScaledBitmap.getPixels(iArr2, 0, 112, 0, 0, 112, 112);
/* 635 */                       float[] fArr5 = new float[37632];
/* 638 */                       for (int i4 = 0; i4 < 12544; i4++) {
/* 640 */                           int i5 = iArr2[i4];
/* 642 */                           int i6 = i4 * 3;
/* 655 */                           fArr5[i6] = (((i5 >> 16) & 255) - 127.5f) / 128.0f;
/* 666 */                           fArr5[i6 + 1] = (((i5 >> 8) & 255) - 127.5f) / 128.0f;
/* 675 */                           fArr5[i6 + 2] = ((i5 & 255) - 127.5f) / 128.0f;
                                }
/* 680 */                       List listCreateInputBuffers$default2 = CompiledModel.createInputBuffers$default(compiledModel2, 0, 1, null);
/* 684 */                       List listCreateOutputBuffers$default2 = CompiledModel.createOutputBuffers$default(compiledModel2, 0, 1, null);
/* 694 */                       ((TensorBuffer) listCreateInputBuffers$default2.get(0)).writeFloat(fArr5);
/* 700 */                       CompiledModel.run$default(compiledModel2, listCreateInputBuffers$default2, listCreateOutputBuffers$default2, 0, 4, (Object) null);
/* 703 */                       Il11ooO1o il11ooO1o = IlI00iOi1.I00000oOI;
/* 711 */                       float[] fArr6 = ((TensorBuffer) listCreateOutputBuffers$default2.get(0)).readFloat();
/* 717 */                       float f2 = 0.0f;
/* 719 */                       for (float f3 : fArr6) {
/* 724 */                           f2 += f3 * f3;
                                }
/* 733 */                       float fSqrt = (float) Math.sqrt(f2);
/* 736 */                       if (fSqrt == 0.0f) {
/* 738 */                           return fArr6;
                                }
/* 741 */                       float[] fArr7 = new float[fArr6.length];
/* 743 */                       int length = fArr6.length;
/* 744 */                       for (int i7 = 0; i7 < length; i7++) {
/* 749 */                           fArr7[i7] = fArr6[i7] / fSqrt;
                                }
/* 754 */                       return fArr7;
                            } catch (Throwable th6) {
/* 760 */                       Log.e("FaceEmbedEngine", "embed failed", th6);
/* 10 */                        return null;
                            }
                        case PoseLandmark.LEFT_THUMB:
/* 496 */                   Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 498 */                   lIoii1l01l0i.I00000oOI(obj);
/* 503 */                   IlI1loI1lO1 ilI1loI1lO1 = (IlI1loI1lO1) this.I00iiO;
/* 507 */                   Context context3 = (Context) this.I00iiI;
/* 509 */                   ilI1loI1lO1.I000OiO(context3);
/* 514 */                   SharedPreferences sharedPreferences = context3.getSharedPreferences("facerec_prefs", 0);
/* 518 */                   OlO0OIIl1 olO0OIIl1 = ilI1loI1lO1.I00000oOI;
/* 567 */                   olO0OIIl1.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl1.getValue(), null, false, null, null, null, null, null, sharedPreferences.getFloat("threshold", 0.55f), sharedPreferences.getBoolean("frontCamera", true), sharedPreferences.getBoolean("showPercent", true), sharedPreferences.getBoolean("showMesh", false), 127));
/* 570 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_THUMB:
/* 468 */                   Ii0111o ii0111o23 = Ii0111o.I00iOIl;
/* 470 */                   lIoii1l01l0i.I00000oOI(obj);
/* 477 */                   ((Ili000) this.I00iiO).I000o00OoI0I = true;
/* 483 */                   ((Ili000) this.I00iiO).I00000oIO();
/* 490 */                   ((O1oiilO) this.I00iiI).invoke();
/* 493 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_HIP:
/* 445 */                   Ii0111o ii0111o24 = Ii0111o.I00iOIl;
/* 447 */                   lIoii1l01l0i.I00000oOI(obj);
/* 452 */                   GGUFReader gGUFReader = (GGUFReader) this.I00iiO;
/* 1 */                     gGUFReader.nativeHandle = gGUFReader.getGGUFContextNativeHandle((String) this.I00iiI);
/* 465 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_HIP:
/* 402 */                   Ii0111o ii0111o25 = Ii0111o.I00iOIl;
/* 404 */                   lIoii1l01l0i.I00000oOI(obj);
/* 411 */                   Function1 function1 = ((Ii0l0Olio10) this.I00iiO).I0000oI00;
/* 415 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiI;
/* 417 */                   List list2 = Iloo0ilo.I00000oIO;
/* 425 */                   if (((OI1O101) oI10i0Il2.getValue()) != null) {
/* 431 */                       iloOi11lo = new IloOi11lo(17);
/* 434 */                       iloOi11lo.I00iiI = oI10i0Il2;
/* 436 */                       VarHandle.storeStoreFence();
                            }
/* 439 */                   function1.invoke(iloOi11lo);
/* 442 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_KNEE:
/* 352 */                   Ii0111o ii0111o26 = Ii0111o.I00iOIl;
/* 354 */                   lIoii1l01l0i.I00000oOI(obj);
/* 359 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiI;
/* 365 */                   Ii1liIllli0 ii1liIllli0 = ((O1ol100o0O) this.I00iiO).I0000Il00O;
/* 367 */                   ii1liIllli0.getClass();
                            boolean z4 = !((Boolean) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new Ii1l100(ii1liIllli0, objArr3 == true ? 1 : 0, 10))).booleanValue();
/* 390 */                   List list3 = Io0IlOI0l.I00000oIO;
/* 396 */                   oI10i0Il3.setValue(Boolean.valueOf(z4));
/* 399 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_KNEE:
/* 327 */                   Ii0111o ii0111o27 = Ii0111o.I00iOIl;
/* 329 */                   lIoii1l01l0i.I00000oOI(obj);
/* 334 */                   OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iiI;
/* 340 */                   int iI00100o1O0lo = ((IiI0O1Io) this.I00iiO).I00100o1O0lo();
/* 344 */                   List list4 = IoI0lol0i1i.I00000oIO;
/* 346 */                   oIooi1iOiOol.I000O01llI0(iI00100o1O0lo);
/* 349 */                   return OoiIlOl1iI.I00000oIO;
                        case 27:
/* 130 */                   Ii0111o ii0111o28 = Ii0111o.I00iOIl;
/* 132 */                   lIoii1l01l0i.I00000oOI(obj);
/* 137 */                   IoiIII ioiIII = (IoiIII) this.I00iiO;
/* 141 */                   O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iiI;
/* 143 */                   List list5 = o1oIOiI11o0.I0000O;
/* 149 */                   ArrayList arrayList2 = new ArrayList();
/* 160 */                   for (Object obj2 : list5) {
/* 168 */                       if (obj2 instanceof OIOOoO1O1oO) {
/* 170 */                           arrayList2.add(obj2);
                                }
                            }
/* 174 */                   Iterator it2 = arrayList2.iterator();
                            while (true) {
/* 182 */                       if (it2.hasNext()) {
/* 184 */                           next = it2.next();
/* 201 */                           if (((OIOOoO1O1oO) next).I0000Il00O.I00000oIO.equals("sd_steps")) {
                                    }
                                } else {
/* 204 */                           next = null;
                                }
                            }
/* 205 */                   OIOOoO1O1oO oIOOoO1O1oO = (OIOOoO1O1oO) next;
/* 207 */                   List list6 = o1oIOiI11o0.I0000O;
/* 213 */                   ArrayList arrayList3 = new ArrayList();
/* 224 */                   for (Object obj3 : list6) {
/* 232 */                       if (obj3 instanceof OIOOoO1O1oO) {
/* 234 */                           arrayList3.add(obj3);
                                }
                            }
/* 238 */                   Iterator it3 = arrayList3.iterator();
                            while (true) {
/* 246 */                       if (it3.hasNext()) {
/* 248 */                           next2 = it3.next();
/* 265 */                           if (((OIOOoO1O1oO) next2).I0000Il00O.I00000oIO.equals("sd_cfg")) {
                                    }
                                } else {
/* 268 */                           next2 = null;
                                }
                            }
/* 269 */                   OIOOoO1O1oO oIOOoO1O1oO2 = (OIOOoO1O1oO) next2;
/* 271 */                   OlO0OIIl1 olO0OIIl12 = ioiIII.I00000oOI;
/* 321 */                   olO0OIIl12.I000lI(null, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl12.getValue(), null, null, oIOOoO1O1oO != null ? (int) oIOOoO1O1oO.I0001Ioi1lo : 20, oIOOoO1O1oO2 != null ? oIOOoO1O1oO2.I0001Ioi1lo : 7.5f, null, false, 0, 0, null, null, false, 0.0f, false, 8179));
/* 324 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_ANKLE:
/* 108 */                   Ii0111o ii0111o29 = Ii0111o.I00iOIl;
/* 110 */                   lIoii1l01l0i.I00000oOI(obj);
/* 117 */                   ((StableDiffusion) this.I00iiO).freeModel();
/* 124 */                   ((O1oiilO) this.I00iiI).invoke();
/* 127 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 17 */                    Ii0110 ii01102 = (Ii0110) this.I00iiO;
/* 19 */                    Ii0111o ii0111o30 = Ii0111o.I00iOIl;
/* 21 */                    lIoii1l01l0i.I00000oOI(obj);
/* 24 */                    Ii00l101O ii00l101OI00000oIO = ii01102.I00000oIO();
/* 30 */                    I10oIiiliil i10oIiiliil = (I10oIiiliil) this.I00iiI;
                            try {
/* 34 */                        Oo10Iiil1lO oo10Iiil1lO = new Oo10Iiil1lO();
/* 41 */                        oo10Iiil1lO.I00ilI0I1 = Thread.currentThread();
/* 43 */                        VarHandle.storeStoreFence();
/* 54 */                        oo10Iiil1lO.I00ilO0 = l01oO1iOo.I0001Ioi1lo(l01oO1iOo.I0000oI00(ii00l101OI00000oIO), true, oo10Iiil1lO);
                                while (true) {
/* 56 */                            Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 58 */                            long j = Oo10Iiil1lO.I00io1l;
/* 60 */                            int intVolatile = unsafe.getIntVolatile(oo10Iiil1lO, j);
/* 64 */                            if (intVolatile != 0) {
/* 66 */                                if (intVolatile != 2 && intVolatile != 3) {
/* 71 */                                    Oo10Iiil1lO.I00100o1O0lo(intVolatile);
/* 74 */                                    throw null;
                                        }
                                    } else if (!unsafe.compareAndSwapInt(oo10Iiil1lO, j, intVolatile, 0)) {
                                    }
                                }
                            } catch (InterruptedException e) {
/* 107 */                       throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                            }
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public I1iIil1I(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 12 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                }
            }
