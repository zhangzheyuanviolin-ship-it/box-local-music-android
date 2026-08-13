            package p000;

            import android.content.Context;
            import android.media.AudioRecord;
            import android.util.Log;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
/* 15 */    public final class II1iIl0Ililo extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II1iIl0Ililo(II1iIoli iI1iIoli, Context context, int i, int i2, IOoil1iiIilo iOoil1iiIilo) {
/* 13 */            super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 0;
/* 4 */             this.I00iio = iI1iIoli;
/* 6 */             this.I00ilI0I1 = context;
/* 8 */             this.I00iiI = i;
/* 10 */            this.I00iiO = i2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilI0I1;
/* 5 */             Object obj3 = this.I00iio;
                    switch (i) {
                        case 0:
/* 69 */                    return new II1iIl0Ililo((II1iIoli) obj3, (Context) obj2, this.I00iiI, this.I00iiO, iOoil1iiIilo);
                        case 1:
/* 52 */                    return new II1iIl0Ililo((List) obj3, iOoil1iiIilo, (IO01o11o0lI0) obj2, this.I00iiO);
                        case 2:
/* 40 */                    return new II1iIl0Ililo((IlooOlI) obj3, (OI10i0Il) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 29 */                    return new II1iIl0Ililo((O1oIOiI11o0) obj3, (O11iO00I1o) obj2, iOoil1iiIilo, 3);
                        default:
/* 18 */                    return new II1iIl0Ililo((I10i01) obj3, this.I00iiO, (OiiI000O) obj2, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((II1iIl0Ililo) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:71:0x011f, code lost:
                
                    if (r0 != r10) goto L73;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:90:0x017f, code lost:
                
                    if (r1.I000OOo1O(r3, r18) == r0) goto L91;
                 */
                /* JADX WARN: Removed duplicated region for block: B:144:0x0266 A[LOOP:2: B:143:0x0264->B:144:0x0266, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x013f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0085 -> B:29:0x0089). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x011f -> B:73:0x0123). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z;
                    int size;
                    int i;
                    int i2;
                    int iIntValue;
                    Object objI00000oIO;
                    Object objI00000oIO2;
                    Object obj2;
                    List list;
                    O1111lilIi0 o1111lilIi0;
/* 7 */             int i3 = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 391 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 393 */                   lIoii1l01l0i.I00000oOI(obj);
/* 408 */                   if (iOI10i0I11.I00000oIO((Context) this.I00ilI0I1, "android.permission.RECORD_AUDIO") == 0) {
/* 414 */                       int minBufferSize = AudioRecord.getMinBufferSize(WhisperEngine.SAMPLE_RATE, 16, 2);
/* 418 */                       if (minBufferSize > 0) {
/* 425 */                           int iMax = Math.max(minBufferSize, 8000);
                                    try {
/* 437 */                               AudioRecord audioRecord = new AudioRecord(6, WhisperEngine.SAMPLE_RATE, 16, 2, iMax);
/* 444 */                               if (audioRecord.getState() != 1) {
/* 446 */                                   audioRecord.release();
                                        } else {
/* 454 */                                   ((II1iIoli) this.I00iio).I00000oIO = false;
/* 460 */                                   ((II1iIoli) this.I00iio).I00000oOI = false;
/* 467 */                                   ArrayList arrayList = new ArrayList(64000);
/* 470 */                                   short[] sArr = new short[iMax];
/* 475 */                                   int i4 = (this.I00iiI * WhisperEngine.SAMPLE_RATE) / 1000;
/* 480 */                                   int i5 = (this.I00iiO * WhisperEngine.SAMPLE_RATE) / 1000;
                                            try {
/* 482 */                                       audioRecord.startRecording();
/* 485 */                                       z = false;
/* 486 */                                       int i6 = 0;
/* 491 */                                       while (arrayList.size() < i4 && !((II1iIoli) this.I00iio).I00000oIO && !((II1iIoli) this.I00iio).I00000oOI && (i2 = audioRecord.read(sArr, i3, iMax)) > 0) {
                                                    try {
/* 516 */                                               double d = 0.0d;
/* 518 */                                               while (i3 < i2) {
/* 532 */                                                   arrayList.add(new Float(sArr[i3] / 32768.0f));
/* 537 */                                                   d += r6 * r6;
/* 538 */                                                   i3++;
                                                        }
/* 557 */                                               if (Math.sqrt(d / i2) >= 0.012d) {
/* 560 */                                                   z = true;
/* 562 */                                                   i6 = 0;
                                                        } else {
/* 564 */                                                   i3 = (!z || (i6 = i6 + i2) < i5) ? 0 : 0;
                                                        }
                                                    } catch (Throwable th) {
/* 542 */                                               th = th;
                                                        try {
/* 584 */                                                   Log.e("BoxAssistAudio", "record failed", th);
/* 594 */                                                   if (!((II1iIoli) this.I00iio).I00000oOI) {
/* 606 */                                                       size = arrayList.size();
/* 610 */                                                       float[] fArr = new float[size];
/* 613 */                                                       while (i < size) {
                                                                }
/* 653 */                                                       return fArr;
                                                            }
/* 420 */                                                   return null;
                                                        } finally {
                                                            try {
/* 631 */                                                       audioRecord.stop();
                                                            } catch (Throwable unused) {
                                                            }
/* 634 */                                                   audioRecord.release();
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th2) {
/* 580 */                                       th = th2;
/* 581 */                                       z = false;
                                            }
/* 594 */                                   if (!((II1iIoli) this.I00iio).I00000oOI && !arrayList.isEmpty() && z) {
/* 606 */                                       size = arrayList.size();
/* 610 */                                       float[] fArr2 = new float[size];
/* 613 */                                       for (i = 0; i < size; i++) {
/* 625 */                                           fArr2[i] = ((Number) arrayList.get(i)).floatValue();
                                                }
/* 653 */                                       return fArr2;
                                            }
                                        }
                                    } catch (Throwable th3) {
/* 641 */                               Log.e("BoxAssistAudio", "AudioRecord create failed", th3);
                                    }
                                }
                            } else {
/* 648 */                       Log.w("BoxAssistAudio", "RECORD_AUDIO not granted");
                            }
/* 420 */                   return null;
                        case 1:
/* 323 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 325 */                   int i7 = this.I00iiI;
/* 329 */                   if (i7 == 0) {
/* 348 */                       lIoii1l01l0i.I00000oOI(obj);
/* 351 */                       l11I11lO.I0000O(3, "CXCP");
/* 356 */                       List list2 = (List) this.I00iio;
/* 360 */                       this.I00iiI = 1;
/* 366 */                       if (iOOlOiI.I00000oOI(list2, this) != ii0111o2) {
                                }
/* 386 */                       return ii0111o2;
                            }
/* 331 */                   if (i7 != 1) {
/* 333 */                       if (i7 == 2) {
/* 335 */                           lIoii1l01l0i.I00000oOI(obj);
/* 388 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 339 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 342 */                       return null;
                            }
/* 344 */                   lIoii1l01l0i.I00000oOI(obj);
/* 369 */                   l11I11lO.I0000O(3, "CXCP");
/* 374 */                   IO01o11o0lI0 iO01o11o0lI0 = (IO01o11o0lI0) this.I00ilI0I1;
/* 376 */                   int i8 = this.I00iiO;
/* 378 */                   this.I00iiI = 2;
                            break;
                        case 2:
/* 177 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 182 */                   IlooOlI ilooOlI = (IlooOlI) this.I00iio;
/* 184 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 186 */                   int i9 = this.I00iiO;
                            try {
                            } catch (Exception e) {
/* 251 */                       IIlIOloOOO.I001iOo1i0O("prompt checkStatus: ", e.getMessage(), "GeminiNanoHub");
/* 254 */                       iIntValue = 0;
                            }
/* 190 */                   if (i9 == 0) {
/* 226 */                       lIoii1l01l0i.I00000oOI(obj);
/* 229 */                       this.I00iiO = 1;
/* 231 */                       objI00000oIO2 = ilooOlI.I00000oIO(this);
/* 235 */                       if (objI00000oIO2 == ii0111o3) {
/* 290 */                           return ii0111o3;
                                }
                            } else if (i9 == 1) {
/* 218 */                       lIoii1l01l0i.I00000oOI(obj);
/* 221 */                       objI00000oIO2 = obj;
                            } else {
/* 194 */                       if (i9 != 2) {
/* 196 */                           if (i9 != 3) {
/* 206 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 209 */                               return null;
                                    }
                                    try {
/* 198 */                               lIoii1l01l0i.I00000oOI(obj);
/* 201 */                               objI00000oIO = obj;
                                    } catch (Exception e2) {
/* 305 */                               IIlIOloOOO.I001iOo1i0O("prompt checkStatus poll: ", e2.getMessage(), "GeminiNanoHub");
/* 308 */                               iIntValue = 0;
                                    }
/* 294 */                           iIntValue = ((Number) objI00000oIO).intValue();
/* 311 */                           Integer num = new Integer(iIntValue);
/* 314 */                           List list3 = Iloo0ilo.I00000oIO;
/* 316 */                           oI10i0Il.setValue(num);
/* 265 */                           if (iIntValue == 2) {
/* 320 */                               return OoiIlOl1iI.I00000oIO;
                                    }
/* 267 */                           this.I00iiI = iIntValue;
/* 269 */                           this.I00iiO = 2;
/* 277 */                           if (il0l1o1l.I00000oOI(5000L, this) != ii0111o3) {
/* 280 */                               this.I00iiI = iIntValue;
/* 282 */                               this.I00iiO = 3;
/* 284 */                               objI00000oIO = ilooOlI.I00000oIO(this);
                                        break;
                                    }
/* 290 */                           return ii0111o3;
                                }
/* 212 */                       iIntValue = this.I00iiI;
/* 214 */                       lIoii1l01l0i.I00000oOI(obj);
/* 280 */                       this.I00iiI = iIntValue;
/* 282 */                       this.I00iiO = 3;
/* 284 */                       objI00000oIO = ilooOlI.I00000oIO(this);
                            }
/* 240 */                   iIntValue = ((Number) objI00000oIO2).intValue();
/* 257 */                   Integer num2 = new Integer(iIntValue);
/* 260 */                   List list4 = Iloo0ilo.I00000oIO;
/* 262 */                   oI10i0Il.setValue(num2);
/* 265 */                   if (iIntValue == 2) {
                            }
                        case 3:
/* 73 */                    OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 79 */                    ConcurrentHashMap concurrentHashMap = ((O11iO00I1o) this.I00ilI0I1).I000O01llI0;
/* 83 */                    O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iio;
/* 85 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 87 */                    int i10 = this.I00iiO;
/* 89 */                    if (i10 == 0) {
/* 104 */                       lIoii1l01l0i.I00000oOI(obj);
/* 107 */                       obj2 = o1oIOiI11o0.I00IlilI0i0i;
/* 109 */                       String str = o1oIOiI11o0.I00000oIO;
/* 111 */                       if (obj2 == null) {
                                }
/* 143 */                       if (o1oIOiI11o0.I00IlilI0i0i != null) {
                                }
/* 172 */                       return ooiIlOl1iI;
                            }
/* 91 */                    if (i10 != 1) {
/* 99 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 102 */                       return null;
                            }
/* 93 */                    i3 = this.I00iiI;
/* 95 */                    lIoii1l01l0i.I00000oOI(obj);
/* 138 */                   i3 += 250;
/* 107 */                   obj2 = o1oIOiI11o0.I00IlilI0i0i;
/* 109 */                   String str2 = o1oIOiI11o0.I00000oIO;
/* 111 */                   if (obj2 == null || !concurrentHashMap.containsKey(str2) || i3 >= 120000) {
/* 143 */                       if (o1oIOiI11o0.I00IlilI0i0i != null && (list = (List) concurrentHashMap.remove(str2)) != null) {
/* 154 */                           O11il1ilio1o o11il1ilio1oI00000oIO = l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0);
/* 166 */                           o1111lilIi0 = !(o11il1ilio1oI00000oIO instanceof O1111lilIi0) ? (O1111lilIi0) o11il1ilio1oI00000oIO : null;
/* 167 */                           if (o1111lilIi0 != null) {
/* 169 */                               o1111lilIi0.I000OOo1O(o1oIOiI11o0, list);
                                    }
                                }
/* 172 */                       return ooiIlOl1iI;
                            }
/* 124 */                   this.I00iiI = i3;
/* 126 */                   this.I00iiO = 1;
/* 134 */                   if (il0l1o1l.I00000oOI(250L, this) == ii0111o4) {
/* 136 */                       return ii0111o4;
                            }
/* 138 */                   i3 += 250;
/* 107 */                   obj2 = o1oIOiI11o0.I00IlilI0i0i;
/* 109 */                   String str22 = o1oIOiI11o0.I00000oIO;
/* 111 */                   if (obj2 == null) {
                            }
/* 143 */                   if (o1oIOiI11o0.I00IlilI0i0i != null) {
/* 154 */                       O11il1ilio1o o11il1ilio1oI00000oIO2 = l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0);
/* 166 */                       if (!(o11il1ilio1oI00000oIO2 instanceof O1111lilIi0)) {
                                }
/* 167 */                       if (o1111lilIi0 != null) {
                                }
                            }
/* 172 */                   return ooiIlOl1iI;
                        default:
/* 14 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 16 */                    int i11 = this.I00iiI;
/* 18 */                    if (i11 == 0) {
/* 31 */                        lIoii1l01l0i.I00000oOI(obj);
/* 36 */                        I10i01 i10i01 = (I10i01) this.I00iio;
/* 42 */                        Integer num3 = new Integer(this.I00iiO);
/* 49 */                        I110IiI0o1Il i110IiI0o1Il = ((OiiI000O) this.I00ilI0I1).I00000oOI;
/* 51 */                        this.I00iiI = 1;
/* 66 */                        if (I10i01.I00000oIO(i10i01, num3, i110IiI0o1Il, null, null, this, 12) == ii0111o5) {
/* 68 */                            return ii0111o5;
                                }
                            } else {
/* 20 */                        if (i11 != 1) {
/* 26 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 29 */                            return null;
                                }
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 70 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public II1iIl0Ililo(I10i01 i10i01, int i, OiiI000O oiiI000O, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 4;
/* 17 */            this.I00iio = i10i01;
                    this.I00iiO = i;
                    this.I00ilI0I1 = oiiI000O;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public II1iIl0Ililo(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 18 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00ilI0I1 = obj2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public II1iIl0Ililo(List list, IOoil1iiIilo iOoil1iiIilo, IO01o11o0lI0 iO01o11o0lI0, int i) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 1;
/* 19 */            this.I00iio = list;
                    this.I00ilI0I1 = iO01o11o0lI0;
                    this.I00iiO = i;
                }
            }
