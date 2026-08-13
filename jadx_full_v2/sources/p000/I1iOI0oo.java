            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import android.graphics.Bitmap;
            import android.media.AudioRecord;
            import android.os.Trace;
            import android.util.Log;
            import android.view.View;
            import android.view.textclassifier.TextClassificationContext;
            import android.view.textclassifier.TextClassificationManager;
            import android.view.textclassifier.TextClassifier;
            import com.google.ai.edge.gallery.stablediffusion.StableDiffusion;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.CancellationException;
            
/* 8 */     public final class I1iOI0oo extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final Object I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1iOI0oo(IOoil1iiIilo iOoil1iiIilo, Object obj, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
                }

                /* JADX WARN: Multi-variable type inference failed */
                private final Object I00000oIO(Object obj) throws Throwable {
                    IOoil1iiIilo iOoil1iiIilo;
                    IOi10loi iOi10loiI00000oIO;
                    Object next;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             lIoii1l01l0i.I00000oOI(obj);
/* 16 */            int i = 3;
/* 17 */            if (((Ool1i0ll) this.I00iiI).I000O01llI0.I00000oOI()) {
/* 21 */                l11I11lO.I0000O(3, "CXCP");
                    } else {
/* 32 */                IIll0oO iIll0oOI00000oIO = ((Ool1i0ll) this.I00iiI).I00000oIO.I00000oIO();
/* 40 */                OolO1O oolO1O = ((Ool1i0ll) this.I00iiI).I00000oIO;
/* 48 */                oolO1O.I0000Il00O.I00000oOI = oolO1O.I00000oIO();
/* 50 */                IIo0ll0o iIo0ll0o = oolO1O.I00000oOI;
/* 52 */                IIll0oO iIll0oOI00000oIO2 = oolO1O.I00000oIO();
                        synchronized (iIo0ll0o.I00000oIO) {
                            try {
/* 65 */                        if (l11I11lO.I0000O(3, "CXCP")) {
/* 69 */                            Objects.toString(iIo0ll0o.I0000O);
/* 74 */                            String str = iIll0oOI00000oIO2.I00l0I0l0lO1.I00000oIO;
                                }
/* 81 */                        IIllOlooI iIllOlooI = iIo0ll0o.I0000oI00;
/* 83 */                        IIllOlooI iIllOlooI2 = IIllOlooI.I00iiO;
/* 85 */                        iOoil1iiIilo = null;
/* 86 */                        if (iIllOlooI != iIllOlooI2) {
/* 90 */                            iIo0ll0o.I0000Il00O(IIllOlooI.I00ilI0I1, null);
/* 93 */                            iIo0ll0o.I0000Il00O(iIllOlooI2, null);
                                }
/* 96 */                        iIo0ll0o.I0000O = iIll0oOI00000oIO2;
/* 98 */                        iIo0ll0o.I0000oI00 = iIllOlooI2;
                            } catch (Throwable th) {
/* 1261 */                      throw th;
                            }
                        }
/* 107 */               if (iIll0oOI00000oIO.I00o0iI0io1.I00000oOI()) {
/* 535 */                   IOOlIIilOl0.I0001Ioi1lo(iIll0oOI00000oIO, "Cannot start ", " after calling close()");
/* 85 */                    return null;
                        }
/* 126 */               Trace.beginSection(iIll0oOI00000oIO + "#start");
/* 135 */               StringBuilder sb = new StringBuilder("Starting ");
/* 138 */               sb.append(iIll0oOI00000oIO);
/* 145 */               Log.i("CXCP", sb.toString());
/* 148 */               Io0oi0 io0oi0 = iIll0oOI00000oIO.I00iiI;
/* 150 */               io0oi0.toString();
/* 153 */               OlO0OIIl1 olO0OIIl1 = io0oi0.I0000oI00;
/* 155 */               Io0ooIl1 io0ooIl1 = Io0ooIl1.I0000Il00O;
/* 157 */               olO0OIIl1.getClass();
/* 160 */               olO0OIIl1.I000lI(null, io0ooIl1);
/* 173 */               for (Io101ll1ol io101ll1ol : io0oi0.I0000O) {
/* 187 */                   io101ll1ol.I00000oIO.I00000oOI(io101ll1ol.I00000oIO(), io0ooIl1);
                        }
/* 191 */               IIioIlI0 iIioIlI0 = iIll0oOI00000oIO.I00ilI0I1;
                        synchronized (iIioIlI0.I000oI1ioi) {
/* 196 */                   iIioIlI0.I0000oI00();
                        }
/* 200 */               Trace.endSection();
/* 216 */               Map map = (Map) ((Ool1i0ll) this.I00iiI).I00000oIO.I0001Ioi1lo.getValue();
/* 220 */               Ool1i0ll ool1i0ll = (Ool1i0ll) this.I00iiI;
/* 228 */               Oilo101I11l0 oilo101I11l0 = (Oilo101I11l0) ool1i0ll.I000OiO.getValue();
/* 253 */               OillooOlI oillooOlI = ((Oilloi0llol1) oilo101I11l0.I0000oI00.getValue()).I0000Il00O() ? (OillooOlI) oilo101I11l0.I0001Ioi1lo.getValue() : null;
/* 254 */               if (oillooOlI != null) {
/* 261 */                   List listUnmodifiableList = Collections.unmodifiableList(oillooOlI.I000II.I00000oIO);
/* 271 */                   Iterator it = oillooOlI.I00000oOI().iterator();
                            while (true) {
/* 279 */                       if (!it.hasNext()) {
/* 295 */                           next = null;
                                    break;
                                }
/* 281 */                       next = it.next();
/* 292 */                       if (!listUnmodifiableList.contains((IiIO1ol1i1o0) next)) {
                                    break;
                                }
                            }
/* 296 */                   IiIO1ol1i1o0 iiIO1ol1i1o0 = (IiIO1ol1i1o0) next;
/* 298 */                   if (iiIO1ol1i1o0 != null) {
                            }
                        }
/* 321 */               l11I11lO.I0000O(3, "CXCP");
/* 348 */               if (((Oilloi0llol1) ((Oilo101I11l0) ((Ool1i0ll) this.I00iiI).I000OiO.getValue()).I0000oI00.getValue()).I0000Il00O()) {
/* 361 */                   OolOOl0 oolOOl0 = (OolOOl0) ((Ool1i0ll) this.I00iiI).I000OOo1O.getValue();
/* 374 */                   Oilo101I11l0 oilo101I11l02 = (Oilo101I11l0) ((Ool1i0ll) this.I00iiI).I000OiO.getValue();
                            synchronized (oolOOl0.I0000oI00) {
                                try {
/* 381 */                           if (oolOOl0.I0001Ioi1lo != null) {
/* 505 */                               throw new IllegalStateException("Surfaces should only be set up once!");
                                    }
/* 385 */                           if (oolOOl0.I000OOo1O != null) {
/* 497 */                               throw new IllegalStateException("Surfaces being setup after stopped!");
                                    }
/* 389 */                           if (oolOOl0.I000O01llI0 != null) {
/* 489 */                               throw new IllegalStateException("Check failed.");
                                    }
/* 398 */                           List list = (List) oilo101I11l02.I000II.getValue();
                                    try {
/* 400 */                               il0l111ll00o.I00000oIO(list);
/* 414 */                               IiIOIO1I iiIOIO1II00000oOI = iOi1II01i0.I00000oOI(oolOOl0.I00000oIO.I00000oIO, null, new I10i01i0Iilo(oilo101I11l02, oolOOl0, list, map, iIll0oOI00000oIO, null, 6), 3);
/* 420 */                               IO1IOO10oI0 iO1IOO10oI0 = new IO1IOO10oI0(i);
/* 423 */                               iO1IOO10oI0.I00iiI = list;
/* 425 */                               VarHandle.storeStoreFence();
/* 428 */                               iiIOIO1II00000oOI.I00iiI(iO1IOO10oI0);
/* 431 */                               oolOOl0.I0001Ioi1lo = iiIOIO1II00000oOI;
                                        iOi10loiI00000oIO = iiIOIO1II00000oOI;
                                    } catch (IiIO1IliI1Ol e) {
/* 446 */                               if (l11I11lO.I0000O(5, "CXCP")) {
/* 452 */                                   Log.w("CXCP", "Failed to increment DeferrableSurfaces: Surfaces closed");
                                        }
/* 466 */                               iOi1II01i0.I0000O(oolOOl0.I00000oIO.I00000oIO, null, null, new Ol0Oli(oilo101I11l02, e, iOoil1iiIilo, 16), 3);
/* 471 */                               iOi10loiI00000oIO = iiiO1IOliI0.I00000oIO(Boolean.FALSE);
                                    }
                                } catch (Throwable th2) {
/* 507 */                           throw th2;
                                }
                            }
/* 478 */                   iOi10loiI00000oIO.I00iiI(OoOi1I011O.I00io1l);
                        } else if (l11I11lO.I0000O(6, "CXCP")) {
/* 521 */                   Log.e("CXCP", "Unable to create capture session due to conflicting configurations");
                        }
                    }
/* 524 */           return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 286 */                   return new I1iOI0oo((I1iOI11ioi1) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 277 */                   return new I1iOI0oo((Bitmap) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 268 */                   return new I1iOI0oo((Oo1o1iil) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 259 */                   return new I1iOI0oo((II0IOO1i) obj2, iOoil1iiIilo, 3);
                        case 4:
/* 250 */                   return new I1iOI0oo((IO0Il0o1OI) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 241 */                   return new I1iOI0oo(iOoil1iiIilo, (IiIi1o) obj2, 5);
                        case 6:
/* 232 */                   return new I1iOI0oo((IiiI0l01O) obj2, iOoil1iiIilo, 6);
                        case 7:
/* 223 */                   return new I1iOI0oo((IlI00iOi1) obj2, iOoil1iiIilo, 7);
                        case 8:
/* 214 */                   return new I1iOI0oo((IlOI0O11011l) obj2, iOoil1iiIilo, 8);
                        case 9:
/* 204 */                   return new I1iOI0oo((IlIi0Il) obj2, iOoil1iiIilo, 9);
                        case 10:
/* 194 */                   return new I1iOI0oo((OOo0l0ii10l) obj2, iOoil1iiIilo, 10);
                        case 11:
/* 184 */                   return new I1iOI0oo((O1111l) obj2, iOoil1iiIilo, 11);
                        case 12:
/* 174 */                   return new I1iOI0oo((IO1Io1IOOOIi) obj2, iOoil1iiIilo, 12);
                        case 13:
/* 164 */                   return new I1iOI0oo((O1loO10Ii0I) obj2, iOoil1iiIilo, 13);
                        case 14:
/* 154 */                   return new I1iOI0oo((OIOI0I) obj2, iOoil1iiIilo, 14);
                        case 15:
/* 144 */                   return new I1iOI0oo((OO1O0I) obj2, iOoil1iiIilo, 15);
                        case 16:
/* 134 */                   return new I1iOI0oo((OOo0ooi) obj2, iOoil1iiIilo, 16);
                        case 17:
/* 124 */                   return new I1iOI0oo((OIooi1iOiOol) obj2, iOoil1iiIilo, 17);
                        case PoseLandmark.RIGHT_PINKY:
/* 114 */                   return new I1iOI0oo((OilIlo) obj2, iOoil1iiIilo, 18);
                        case PoseLandmark.LEFT_INDEX:
/* 104 */                   return new I1iOI0oo((OillooOlI) obj2, iOoil1iiIilo, 19);
                        case PoseLandmark.RIGHT_INDEX:
/* 94 */                    return new I1iOI0oo((I0IoOl) obj2, iOoil1iiIilo, 20);
                        case PoseLandmark.LEFT_THUMB:
/* 84 */                    return new I1iOI0oo((StableDiffusion) obj2, iOoil1iiIilo, 21);
                        case PoseLandmark.RIGHT_THUMB:
/* 74 */                    return new I1iOI0oo((View) obj2, iOoil1iiIilo, 22);
                        case PoseLandmark.LEFT_HIP:
/* 64 */                    return new I1iOI0oo(iOoil1iiIilo, (Ool1i0ll) obj2, 23);
                        case PoseLandmark.RIGHT_HIP:
/* 54 */                    return new I1iOI0oo((OI10llOi) obj2, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 44 */                    return new I1iOI0oo((i001ll1) obj2, iOoil1iiIilo, 25);
                        case PoseLandmark.RIGHT_KNEE:
/* 34 */                    return new I1iOI0oo((IIOo1i) obj2, iOoil1iiIilo, 26);
                        case 27:
/* 24 */                    return new I1iOI0oo((ii1iOiO) obj2, iOoil1iiIilo, 27);
                        default:
/* 14 */                    return new I1iOI0oo((Application) obj2, iOoil1iiIilo, 28);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 416 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 419 */                   return ooiIlOl1iI;
                        case 1:
/* 401 */                   return ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 2:
/* 387 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 390 */                   return ooiIlOl1iI;
                        case 3:
/* 373 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 376 */                   return ooiIlOl1iI;
                        case 4:
/* 359 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 362 */                   return ooiIlOl1iI;
                        case 5:
/* 345 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 348 */                   return ooiIlOl1iI;
                        case 6:
/* 330 */                   return ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 7:
/* 316 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 319 */                   return ooiIlOl1iI;
                        case 8:
/* 302 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 305 */                   return ooiIlOl1iI;
                        case 9:
/* 288 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 291 */                   return ooiIlOl1iI;
                        case 10:
/* 273 */                   return ((I1iOI0oo) create((String) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 11:
/* 259 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 262 */                   return ooiIlOl1iI;
                        case 12:
/* 245 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 248 */                   return ooiIlOl1iI;
                        case 13:
/* 231 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 234 */                   return ooiIlOl1iI;
                        case 14:
/* 216 */                   return ((I1iOI0oo) create((OiOI0o10) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 15:
/* 201 */                   return ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 16:
/* 187 */                   ((I1iOI0oo) create((OoiIlOl1iI) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 190 */                   return ooiIlOl1iI;
                        case 17:
/* 173 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 176 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 159 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 162 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 145 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 148 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 131 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 134 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 117 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 120 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_THUMB:
/* 103 */                   ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 106 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 89 */                    ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 92 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 75 */                    ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 78 */                    return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 61 */                    ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 64 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 47 */                    ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 50 */                    return ooiIlOl1iI;
                        case 27:
/* 33 */                    ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 36 */                    return ooiIlOl1iI;
                        default:
/* 18 */                    return ((I1iOI0oo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:193:0x03af A[LOOP:8: B:185:0x0395->B:193:0x03af, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:204:0x03d3 A[LOOP:10: B:196:0x03b9->B:204:0x03d3, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:277:0x03b2 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:281:0x03d6 A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    String str;
                    OilloOil0 oilloOil0;
/* 13 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 997 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 999 */                   lIoii1l01l0i.I00000oOI(obj);
/* 1002 */                  int minBufferSize = AudioRecord.getMinBufferSize(WhisperEngine.SAMPLE_RATE, 16, 2);
/* 1010 */                  int i = minBufferSize < 4096 ? 4096 : minBufferSize;
/* 1019 */                  AudioRecord audioRecord = new AudioRecord(1, WhisperEngine.SAMPLE_RATE, 16, 2, i);
/* 1022 */                  int i2 = i / 2;
/* 1023 */                  short[] sArr = new short[i2];
/* 1025 */                  audioRecord.startRecording();
/* 1044 */                  while (((I1iO1loOII1) ((I1iOI11ioi1) this.I00iiI).I00000oOI.getValue()).I00000oIO == I1iIll0i.I00iiI) {
/* 1046 */                      int i3 = audioRecord.read(sArr, 0, i2);
/* 1050 */                      if (i3 > 0) {
/* 1054 */                          I1iOI11ioi1 i1iOI11ioi1 = (I1iOI11ioi1) this.I00iiI;
                                    synchronized (i1iOI11ioi1.I0001Ioi1lo) {
/* 1060 */                              for (int i4 = 0; i4 < i3; i4++) {
/* 1071 */                                  i1iOI11ioi1.I0001Ioi1lo.add(new Short(sArr[i4]));
                                        }
                                    }
                                }
                            }
/* 1082 */                  audioRecord.stop();
/* 1085 */                  audioRecord.release();
/* 1088 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 796 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 798 */                   lIoii1l01l0i.I00000oOI(obj);
/* 803 */                   Bitmap bitmap = (Bitmap) this.I00iiI;
/* 814 */                   int[] iArr = new int[bitmap.getHeight() * bitmap.getWidth()];
/* 819 */                   Bitmap bitmap2 = (Bitmap) this.I00iiI;
/* 836 */                   bitmap2.getPixels(iArr, 0, bitmap2.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
/* 839 */                   int width = bitmap.getWidth();
/* 843 */                   int height = bitmap.getHeight();
/* 847 */                   int width2 = bitmap.getWidth();
/* 851 */                   int i5 = 0;
                            while (true) {
/* 852 */                       if (i5 < width2) {
/* 854 */                           int height2 = bitmap.getHeight();
/* 859 */                           for (int i6 = 0; i6 < height2; i6++) {
/* 869 */                               if (iArr[(bitmap.getWidth() * i6) + i5] == 0) {
                                        }
                                    }
/* 875 */                           i5++;
                                } else {
/* 878 */                           i5 = 0;
                                }
                            }
/* 879 */                   int height3 = bitmap.getHeight();
/* 883 */                   int i7 = 0;
                            while (true) {
/* 884 */                       if (i7 < height3) {
/* 886 */                           int width3 = bitmap.getWidth();
/* 891 */                           for (int i8 = i5; i8 < width3; i8++) {
/* 901 */                               if (iArr[(bitmap.getWidth() * i7) + i8] != 0) {
/* 903 */                                   i = i7;
                                        }
                                    }
/* 908 */                           i7++;
                                }
                            }
/* 915 */                   int width4 = bitmap.getWidth() - 1;
/* 916 */                   if (i5 <= width4) {
                                while (true) {
/* 922 */                           int height4 = bitmap.getHeight() - 1;
/* 923 */                           if (i <= height4) {
/* 933 */                               while (iArr[(bitmap.getWidth() * height4) + width4] == 0) {
/* 937 */                                   if (height4 != i) {
                                                height4--;
                                            } else if (width4 == i5) {
                                                width4--;
                                            }
                                        }
/* 935 */                               width = width4;
                                    } else if (width4 == i5) {
                                    }
                                }
                            }
/* 951 */                   int height5 = bitmap.getHeight() - 1;
/* 952 */                   if (i <= height5) {
                                while (true) {
/* 958 */                           int width5 = bitmap.getWidth() - 1;
/* 959 */                           if (i5 <= width5) {
/* 969 */                               while (iArr[(bitmap.getWidth() * height5) + width5] == 0) {
/* 973 */                                   if (width5 != i5) {
                                                width5--;
                                            } else if (height5 == i) {
                                                height5--;
                                            }
                                        }
/* 971 */                               height = height5;
                                    } else if (height5 == i) {
                                    }
                                }
                            }
/* 983 */                   int i9 = width - i5;
/* 984 */                   if (i9 < 1) {
/* 986 */                       i9 = 1;
                            }
/* 987 */                   int i10 = height - i;
/* 992 */                   return Bitmap.createBitmap(bitmap, i5, i, i9, i10 >= 1 ? i10 : 1);
                        case 2:
/* 781 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 783 */                   lIoii1l01l0i.I00000oOI(obj);
/* 790 */                   ((Oo1o1iil) this.I00iiI).I00000oIO();
/* 793 */                   return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 766 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 768 */                   lIoii1l01l0i.I00000oOI(obj);
/* 775 */                   ((II0IOO1i) this.I00iiI).I000II();
/* 778 */                   return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 751 */                   Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 753 */                   lIoii1l01l0i.I00000oOI(obj);
/* 760 */                   ((IO0Il0o1OI) this.I00iiI).I0001Ioi1lo(true);
/* 763 */                   return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 732 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 734 */                   lIoii1l01l0i.I00000oOI(obj);
/* 741 */                   OolI1lo oolI1lo = ((IiIi1o) this.I00iiI).I0000Il00O;
/* 743 */                   if (oolI1lo != null) {
/* 745 */                       oolI1lo.close();
                            }
/* 748 */                   return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 668 */                   Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 670 */                   lIoii1l01l0i.I00000oOI(obj);
/* 676 */                   IiiI0l01O iiiI0l01O = (IiiI0l01O) this.I00iiI;
                            synchronized (iiiI0l01O) {
/* 681 */                       if (!iiiI0l01O.I00ll1 || iiiI0l01O.I00lli11) {
/* 726 */                           return OoiIlOl1iI.I00000oIO;
                                }
                                try {
/* 688 */                           iiiI0l01O.I00IioO0OiOi();
                                } catch (IOException unused) {
/* 694 */                           iiiI0l01O.I00lll10 = true;
                                }
                                try {
/* 703 */                           if ((iiiI0l01O.I00l0I0l0lO1 >= 2000 ? 1 : 0) != 0) {
/* 705 */                               iiiI0l01O.I00IoiI();
                                    }
                                } catch (IOException unused2) {
/* 709 */                           iiiI0l01O.I00o0iI0io1 = true;
/* 720 */                           iiiI0l01O.I00l0OO0IO = l1l0I1OIOIO1.I00000oIO(new II0o0Oi());
                                }
/* 723 */                       return OoiIlOl1iI.I00000oIO;
                            }
                        case 7:
/* 649 */                   IlI00iOi1 ilI00iOi1 = (IlI00iOi1) this.I00iiI;
/* 651 */                   Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 653 */                   lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 656 */                       CompiledModel compiledModel = ilI00iOi1.I00000oIO;
/* 658 */                       if (compiledModel != null) {
/* 660 */                           compiledModel.close();
                                }
                            } catch (Throwable unused3) {
                            }
/* 663 */                   ilI00iOi1.I00000oIO = null;
/* 665 */                   return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 623 */                   Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 625 */                   lIoii1l01l0i.I00000oOI(obj);
/* 632 */                   Ioi11lOIIO0O ioi11lOIIO0O = ((IlOI0O11011l) this.I00iiI).I000O01llI0;
/* 634 */                   if (ioi11lOIIO0O != null) {
/* 636 */                       ioi11lOIIO0O.clear();
                            }
/* 641 */                   l11I11lO.I0000O(3, "CXCP");
/* 644 */                   return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 608 */                   Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 610 */                   lIoii1l01l0i.I00000oOI(obj);
/* 617 */                   ((IlIi0Il) this.I00iiI).invoke();
/* 620 */                   return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 591 */                   Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 593 */                   lIoii1l01l0i.I00000oOI(obj);
/* 603 */                   return Boolean.valueOf(!((OOo0l0ii10l) this.I00iiI).I00iOIl);
                        case 11:
/* 570 */                   Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 572 */                   lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 581 */                       ((O1111l) this.I00iiI).I00000oIO.prewarmHistory();
                            } catch (CancellationException e) {
/* 590 */                       throw e;
                            } catch (Exception unused4) {
                            }
/* 587 */                   return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 555 */                   Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 557 */                   lIoii1l01l0i.I00000oOI(obj);
/* 564 */                   ((IO1Io1IOOOIi) this.I00iiI).invoke();
/* 567 */                   return OoiIlOl1iI.I00000oIO;
                        case 13:
/* 534 */                   O1loO10Ii0I o1loO10Ii0I = (O1loO10Ii0I) this.I00iiI;
/* 536 */                   Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 538 */                   lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 541 */                       CompiledModel compiledModel2 = o1loO10Ii0I.I00000oIO;
/* 543 */                       if (compiledModel2 != null) {
/* 545 */                           compiledModel2.close();
                                }
                            } catch (Throwable unused5) {
                            }
/* 548 */                   o1loO10Ii0I.I00000oIO = null;
/* 550 */                   o1loO10Ii0I.I0000Il00O = null;
/* 552 */                   return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 496 */                   Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 498 */                   lIoii1l01l0i.I00000oOI(obj);
/* 501 */                   OiOI0Il oiOI0IlI001IIilI0O = OiOI0o10.I001IIilI0O();
/* 515 */                   Iterable iterable = (Iterable) ((OIOI0I) this.I00iiI).I0000oI00.getValue();
/* 517 */                   oiOI0IlI001IIilI0O.I0000O();
/* 524 */                   ((OiOI0o10) oiOI0IlI001IIilI0O.I00iiI).I0010I0i(iterable);
/* 527 */                   return oiOI0IlI001IIilI0O.I00000oOI();
                        case 15:
/* 438 */                   Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 440 */                   lIoii1l01l0i.I00000oOI(obj);
/* 445 */                   OO1O0I oo1o0i = (OO1O0I) this.I00iiI;
/* 447 */                   Context context = oo1o0i.I00000oOI;
/* 449 */                   OiiOIo1 oiiOIo1 = oo1o0i.I0000Il00O;
/* 457 */                   TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
/* 459 */                   int iOrdinal = oiiOIo1.ordinal();
/* 463 */                   if (iOrdinal == 0) {
/* 474 */                       str = "edittext";
                            } else {
/* 465 */                       if (iOrdinal != 1) {
/* 470 */                           I000II.I00000oIO();
/* 13 */                            return null;
                                }
/* 467 */                       str = "textview";
                            }
/* 489 */                   TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
/* 493 */                   oo1o0i.I0001Ioi1lo = textClassifierCreateTextClassificationSession;
/* 495 */                   return textClassifierCreateTextClassificationSession;
                        case 16:
/* 424 */                   Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 426 */                   lIoii1l01l0i.I00000oOI(obj);
/* 433 */                   ((OOo0ooi) this.I00iiI).I00iOIl = null;
/* 435 */                   return OoiIlOl1iI.I00000oIO;
                        case 17:
/* 409 */                   Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 411 */                   lIoii1l01l0i.I00000oOI(obj);
/* 418 */                   ((OIooi1iOiOol) this.I00iiI).I000O01llI0(0);
/* 421 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_PINKY:
/* 317 */                   Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 319 */                   lIoii1l01l0i.I00000oOI(obj);
/* 322 */                   int minBufferSize2 = AudioRecord.getMinBufferSize(WhisperEngine.SAMPLE_RATE, 16, 2);
/* 330 */                   int i11 = minBufferSize2 < 4096 ? 4096 : minBufferSize2;
/* 339 */                   AudioRecord audioRecord2 = new AudioRecord(1, WhisperEngine.SAMPLE_RATE, 16, 2, i11);
/* 342 */                   int i12 = i11 / 2;
/* 343 */                   short[] sArr2 = new short[i12];
/* 345 */                   audioRecord2.startRecording();
/* 362 */                   while (((OilIl00O1o) ((OilIlo) this.I00iiI).I00000oOI.getValue()).I00000oIO) {
/* 364 */                       int i13 = audioRecord2.read(sArr2, 0, i12);
/* 368 */                       if (i13 > 0) {
/* 372 */                           OilIlo oilIlo = (OilIlo) this.I00iiI;
                                    synchronized (oilIlo.I0001Ioi1lo) {
/* 378 */                               for (int i14 = 0; i14 < i13; i14++) {
/* 389 */                                   oilIlo.I0001Ioi1lo.add(new Short(sArr2[i14]));
                                        }
                                    }
                                }
                            }
/* 400 */                   audioRecord2.stop();
/* 403 */                   audioRecord2.release();
/* 406 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 296 */                   Ii0111o ii0111o20 = Ii0111o.I00iOIl;
/* 298 */                   lIoii1l01l0i.I00000oOI(obj);
/* 303 */                   OillooOlI oillooOlI = (OillooOlI) this.I00iiI;
/* 305 */                   if (oillooOlI != null && (oilloOil0 = oillooOlI.I0001Ioi1lo) != null) {
/* 311 */                       oilloOil0.I00000oIO(oillooOlI);
                            }
/* 314 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 281 */                   Ii0111o ii0111o21 = Ii0111o.I00iOIl;
/* 283 */                   lIoii1l01l0i.I00000oOI(obj);
/* 290 */                   ((I0IoOl) this.I00iiI).invoke();
/* 293 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_THUMB:
/* 234 */                   Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 236 */                   lIoii1l01l0i.I00000oOI(obj);
/* 241 */                   StableDiffusion stableDiffusion = (StableDiffusion) this.I00iiI;
/* 251 */                   if (stableDiffusion.contextHandle != 0) {
/* 1 */                         stableDiffusion.freeContextNative(stableDiffusion.contextHandle);
/* 1 */                         stableDiffusion.contextHandle = 0L;
                            }
/* 1 */                     stableDiffusion.contextHandle = stableDiffusion.loadModelNative(stableDiffusion.loadedModelPath, stableDiffusion.loadedNThreads);
/* 278 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_THUMB:
/* 209 */                   Ii0111o ii0111o23 = Ii0111o.I00iOIl;
/* 211 */                   lIoii1l01l0i.I00000oOI(obj);
/* 228 */                   ((Activity) ((View) this.I00iiI).getContext()).getWindow().setNavigationBarContrastEnforced(false);
/* 231 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_HIP:
/* 204 */                   return I00000oIO(obj);
                        case PoseLandmark.RIGHT_HIP:
/* 185 */                   Ii0111o ii0111o24 = Ii0111o.I00iOIl;
/* 187 */                   lIoii1l01l0i.I00000oOI(obj);
/* 198 */                   ((I01ii1IIl) ((OI10llOi) this.I00iiI).I00ilI0I1).invoke();
/* 201 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_KNEE:
/* 93 */                    Ii0111o ii0111o25 = Ii0111o.I00iOIl;
/* 95 */                    lIoii1l01l0i.I00000oOI(obj);
/* 98 */                    int minBufferSize3 = AudioRecord.getMinBufferSize(WhisperEngine.SAMPLE_RATE, 16, 2);
/* 106 */                   int i15 = minBufferSize3 < 4096 ? 4096 : minBufferSize3;
/* 115 */                   AudioRecord audioRecord3 = new AudioRecord(1, WhisperEngine.SAMPLE_RATE, 16, 2, i15);
/* 118 */                   int i16 = i15 / 2;
/* 119 */                   short[] sArr3 = new short[i16];
/* 121 */                   audioRecord3.startRecording();
/* 138 */                   while (((i001ilIoI) ((i001ll1) this.I00iiI).I00000oOI.getValue()).I00000oIO) {
/* 140 */                       int i17 = audioRecord3.read(sArr3, 0, i16);
/* 144 */                       if (i17 > 0) {
/* 148 */                           i001ll1 i001ll1Var = (i001ll1) this.I00iiI;
                                    synchronized (i001ll1Var.I0000oI00) {
/* 154 */                               for (int i18 = 0; i18 < i17; i18++) {
/* 165 */                                   i001ll1Var.I0000oI00.add(new Short(sArr3[i18]));
                                        }
                                    }
                                }
                            }
/* 176 */                   audioRecord3.stop();
/* 179 */                   audioRecord3.release();
/* 182 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_KNEE:
/* 72 */                    IIOo1i iIOo1i = (IIOo1i) this.I00iiI;
/* 74 */                    Ii0111o ii0111o26 = Ii0111o.I00iOIl;
/* 76 */                    lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 81 */                        CompiledModel compiledModel3 = (CompiledModel) iIOo1i.I0000Il00O;
/* 83 */                        if (compiledModel3 != null) {
/* 85 */                            compiledModel3.close();
                                }
                            } catch (Throwable unused6) {
                            }
/* 88 */                    iIOo1i.I0000Il00O = null;
/* 90 */                    return OoiIlOl1iI.I00000oIO;
                        case 27:
/* 33 */                    Ii0111o ii0111o27 = Ii0111o.I00iOIl;
/* 35 */                    lIoii1l01l0i.I00000oOI(obj);
/* 40 */                    ii1iOiO ii1ioio = (ii1iOiO) this.I00iiI;
/* 50 */                    if (!(ii1ioio.I0000Il00O.getValue() instanceof ii01O1l)) {
/* 64 */                        iOi1II01i0.I0000O(OooiooIOO.I00000oIO(ii1ioio), null, null, new O1iOlO(ii1ioio, iOoil1iiIilo, 18), 3);
                            }
/* 67 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 19 */                    Ii0111o ii0111o28 = Ii0111o.I00iOIl;
/* 21 */                    lIoii1l01l0i.I00000oOI(obj);
/* 28 */                    return ll1IoOi1l.I00000oIO((Application) this.I00iiI);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public I1iOI0oo(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 10 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                }
            }
