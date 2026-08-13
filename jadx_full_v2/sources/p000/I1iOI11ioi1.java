            package p000;

            import android.content.Context;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI1iOI11ioi1;", "LOooioIIoi0O;", "<init>", "()V", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class I1iOI11ioi1 extends OooioIIoi0O {
                public final OlO0OIIl1 I00000oOI;
                public final OOli1O I0000Il00O;
                public final IIlio101Io I0000O;
                public OlIl0i I0000oI00;
                public final ArrayList I0001Ioi1lo;
                public OlIl0i I000II;

                public I1iOI11ioi1() {
/* 28 */            OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(new I1iO1loOII1(I1iIll0i.I00iOIl, 0, I1iIioiI0.I00iOIl, 0, "auto", "", Il01100l.I00iOIl, Il011I1OiO0I.I00iOIl, Iii0ool1Io0.I00iOIl, 0.0f, "", null));
/* 32 */            this.I00000oOI = olO0OIIl1I00000oIO;
/* 38 */            this.I0000Il00O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
/* 44 */            IIlio101Io iIlio101Io = new IIlio101Io(10);
/* 49 */            iIlio101Io.I00iiI = "";
/* 51 */            iIlio101Io.I00iiO = "";
/* 53 */            this.I0000O = iIlio101Io;
/* 60 */            this.I0001Ioi1lo = new ArrayList();
                }

                public static String I0001Ioi1lo(List list, Map map) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Iterator it = list.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                O0iO0ll1IOO o0iO0ll1IOO = (O0iO0ll1IOO) it.next();
/* 22 */                String str = o0iO0ll1IOO.I0000O;
/* 24 */                String str2 = o0iO0ll1IOO.I0000Il00O;
/* 30 */                if (!OlOoOIi0o.I001l0I00(str)) {
/* 36 */                    String str3 = (String) map.get(str2);
/* 38 */                    if (str3 != null) {
/* 41 */                        str2 = str3;
                            }
/* 46 */                    if (arrayList.isEmpty() || !O0000Ioio00.I0000O(((OIoi0IIoi) IOOi0Ool1i.I00Io1o110i(arrayList)).I00iOIl, str2)) {
/* 89 */                        arrayList.add(new OIoi0IIoi(str2, IOOi1I.I000OiO(str)));
                            } else {
/* 72 */                        ((List) ((OIoi0IIoi) IOOi0Ool1i.I00Io1o110i(arrayList)).I00iiI).add(str);
                            }
                        }
                    }
/* 105 */           return IOOi0Ool1i.I00IlilI0i0i(arrayList, "\n\n", null, null, new I10I0o1ii10(6), 30);
                }

                public final void I0000oI00(String str) {
/* 3 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 34 */            olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), I1iIll0i.I00io1l, 0, null, 0, null, null, null, null, null, 0.0f, "", str, 1022));
                }

                /* JADX WARN: Removed duplicated region for block: B:118:0x041c A[LOOP:4: B:116:0x0416->B:118:0x041c, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:121:0x043e  */
                /* JADX WARN: Removed duplicated region for block: B:125:0x044c A[LOOP:5: B:123:0x0446->B:125:0x044c, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:55:0x01ce  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x01fd  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0231  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0282  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x02a0  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(Context context, float[] fArr, O1oIOiI11o0 o1oIOiI11o0, IOoilo iOoilo) throws Throwable {
                    I1iOI0O1OOO i1iOI0O1OOO;
                    Context context2;
                    List list;
                    float[] fArr2;
                    List list2;
                    Context context3;
                    Object objI0000oI00;
                    List list3;
                    Iterator it;
                    int iI00000oIO;
                    Object next;
                    float f;
                    String strI000o00OoI0I;
                    Object next2;
/* 3 */             float[] fArr3 = fArr;
/* 9 */             if (iOoilo instanceof I1iOI0O1OOO) {
/* 12 */                i1iOI0O1OOO = (I1iOI0O1OOO) iOoilo;
/* 14 */                int i = i1iOI0O1OOO.I00ilO0;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    i1iOI0O1OOO.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    i1iOI0O1OOO = new I1iOI0O1OOO(this, iOoilo);
                        }
                    }
/* 31 */            Object objTranscribeWithSegments = i1iOI0O1OOO.I00iio;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i2 = i1iOI0O1OOO.I00ilO0;
/* 43 */            int i3 = 3;
/* 45 */            IIlio101Io iIlio101Io = this.I0000O;
/* 48 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 50 */            OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 52 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 53 */            if (i2 == 0) {
/* 98 */                lIoii1l01l0i.I00000oOI(objTranscribeWithSegments);
/* 103 */               Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 112 */               WhisperEngine whisperEngine = obj instanceof WhisperEngine ? (WhisperEngine) obj : null;
/* 113 */               if (whisperEngine == null) {
/* 117 */                   I0000oI00("Whisper model not loaded");
/* 120 */                   return ooiIlOl1iI;
                        }
/* 127 */               String str = ((I1iO1loOII1) olO0OIIl1.getValue()).I0000oI00;
/* 133 */               if (OlOoOIi0o.I001l0I00(str)) {
/* 135 */                   str = "auto";
                        }
/* 175 */               olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), I1iIll0i.I00iio, 0, null, 0, null, null, null, null, null, 0.0f, "Transcribing…", null, 3070));
/* 178 */               context2 = context;
/* 180 */               i1iOI0O1OOO.I00iOIl = context2;
/* 182 */               i1iOI0O1OOO.I00iiI = fArr3;
/* 184 */               i1iOI0O1OOO.I00ilO0 = 1;
/* 186 */               objTranscribeWithSegments = whisperEngine.transcribeWithSegments(fArr3, str, i1iOI0O1OOO);
/* 190 */               if (objTranscribeWithSegments != ii0111o) {
                        }
/* 642 */               return ii0111o;
                    }
/* 55 */            if (i2 != 1) {
/* 57 */                if (i2 == 2) {
/* 76 */                    list2 = i1iOI0O1OOO.I00iiO;
/* 80 */                    fArr2 = i1iOI0O1OOO.I00iiI;
/* 82 */                    context3 = i1iOI0O1OOO.I00iOIl;
/* 84 */                    lIoii1l01l0i.I00000oOI(objTranscribeWithSegments);
/* 461 */                   if (((Boolean) objTranscribeWithSegments).booleanValue()) {
/* 501 */                       olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), null, 0, null, 0, null, null, null, null, Iii0ool1Io0.I00iio, 0.0f, null, null, 3839));
/* 506 */                       I0000oI00("Failed to download diarization models");
/* 509 */                       return ooiIlOl1iI;
                            }
/* 510 */                   list = list2;
/* 511 */                   fArr3 = fArr2;
/* 512 */                   context2 = context3;
/* 513 */                   iIlio101Io.getClass();
/* 522 */                   File file = new File(context2.getExternalFilesDir(null), "__diar_models");
/* 534 */                   iIlio101Io.I00iiI = new File(file, "seg.onnx").getAbsolutePath();
/* 545 */                   iIlio101Io.I00iiO = new File(file, "emb.onnx").getAbsolutePath();
/* 560 */                   if (new File((String) iIlio101Io.I00iiI).exists()) {
/* 571 */                       new File((String) iIlio101Io.I00iiO).exists();
                            }
/* 613 */                   olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), null, 0, null, 0, null, null, null, null, Iii0ool1Io0.I00iiO, 0.0f, null, null, 3839));
/* 616 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 621 */                   I1iIil1I i1iIil1I = new I1iIil1I(this, fArr3, iOoil1iiIilo, 2);
/* 624 */                   i1iOI0O1OOO.I00iOIl = null;
/* 626 */                   i1iOI0O1OOO.I00iiI = null;
/* 631 */                   i1iOI0O1OOO.I00iiO = list;
/* 634 */                   i1iOI0O1OOO.I00ilO0 = 3;
/* 636 */                   objI0000oI00 = iOi1II01i0.I0000oI00(iiI0oillOO10, i1iIil1I, i1iOI0O1OOO);
/* 640 */                   if (objI0000oI00 != ii0111o) {
/* 643 */                       List list4 = list;
/* 645 */                       objTranscribeWithSegments = objI0000oI00;
/* 646 */                       list3 = list4;
/* 648 */                       List<Iii0ooll> list5 = (List) objTranscribeWithSegments;
/* 650 */                       List<i001iI0o1iOo> list6 = list3;
/* 660 */                       ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list6, 10));
/* 671 */                       while (r0.hasNext()) {
                                }
/* 1040 */                      ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 1043 */                      it = arrayList.iterator();
/* 1051 */                      while (it.hasNext()) {
                                }
/* 1065 */                      List listI001i1lo1io = IOOi0Ool1i.I001i1lo1io(arrayList2);
/* 1079 */                      iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(listI001i1lo1io, 10));
/* 1085 */                      if (iI00000oIO < 16) {
                                }
/* 1088 */                      LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 1099 */                      while (r0.hasNext()) {
                                }
/* 1153 */                      olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), I1iIll0i.I00ilO0, 0, null, 0, null, I0001Ioi1lo(arrayList, linkedHashMap), arrayList, linkedHashMap, null, 0.0f, "", null, 2846));
/* 1182 */                      return ooiIlOl1iI;
                            }
/* 642 */                   return ii0111o;
                        }
/* 59 */                if (i2 != 3) {
/* 72 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 52 */                    return null;
                        }
/* 61 */                list3 = i1iOI0O1OOO.I00iiO;
/* 65 */                lIoii1l01l0i.I00000oOI(objTranscribeWithSegments);
/* 648 */               List<Iii0ooll> list52 = (List) objTranscribeWithSegments;
/* 650 */               List<i001iI0o1iOo> list62 = list3;
/* 660 */               ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(list62, 10));
/* 671 */               for (i001iI0o1iOo i001ii0o1ioo : list62) {
/* 679 */                   long j = i001ii0o1ioo.I00000oIO;
/* 681 */                   long j2 = i001ii0o1ioo.I00000oOI;
/* 686 */                   float f2 = j / 1000.0f;
/* 688 */                   float f3 = j2 / 1000.0f;
/* 691 */                   LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 702 */                   for (Iii0ooll iii0ooll : list52) {
/* 710 */                       float f4 = iii0ooll.I00000oOI;
/* 712 */                       int i4 = iii0ooll.I0000Il00O;
/* 726 */                       float fMax = Math.max(0.0f, Math.min(f3, f4) - Math.max(f2, iii0ooll.I00000oIO));
/* 732 */                       if (fMax > 0.0f) {
/* 734 */                           Integer numValueOf = Integer.valueOf(i4);
/* 746 */                           Float f5 = (Float) linkedHashMap2.get(Integer.valueOf(i4));
/* 761 */                           linkedHashMap2.put(numValueOf, Float.valueOf((f5 != null ? f5.floatValue() : 0.0f) + fMax));
                                }
                            }
/* 772 */                   if (linkedHashMap2.isEmpty()) {
/* 876 */                       float f6 = 2.0f;
/* 878 */                       float f7 = (f2 + f3) / 2.0f;
/* 882 */                       Iterator it2 = list52.iterator();
/* 890 */                       if (it2.hasNext()) {
/* 896 */                           next = it2.next();
/* 904 */                           if (it2.hasNext()) {
/* 910 */                               Iii0ooll iii0ooll2 = (Iii0ooll) next;
/* 919 */                               float fAbs = Math.abs(((iii0ooll2.I00000oIO + iii0ooll2.I00000oOI) / 2.0f) - f7);
                                        while (true) {
/* 923 */                                   Object next3 = it2.next();
/* 927 */                                   f = f6;
/* 930 */                                   Iii0ooll iii0ooll3 = (Iii0ooll) next3;
/* 940 */                                   float fAbs2 = Math.abs(((iii0ooll3.I00000oIO + iii0ooll3.I00000oOI) / f) - f7);
/* 948 */                                   if (Float.compare(fAbs, fAbs2) > 0) {
/* 950 */                                       fAbs = fAbs2;
/* 951 */                                       next = next3;
                                            }
/* 956 */                                   if (!it2.hasNext()) {
                                                break;
                                            }
/* 1029 */                                  f6 = f;
                                        }
                                    } else {
/* 906 */                               f = 2.0f;
                                    }
                                } else {
/* 892 */                           f = 2.0f;
/* 894 */                           next = null;
                                }
/* 958 */                       Iii0ooll iii0ooll4 = (Iii0ooll) next;
/* 997 */                       strI000o00OoI0I = (iii0ooll4 == null || Math.abs(((iii0ooll4.I00000oIO + iii0ooll4.I00000oOI) / f) - f7) > 3.0f) ? "SPEAKER_??" : IIl001iO0Io.I000o00OoI0I("SPEAKER_", OlOoOIi0o.I00IO1(2, String.valueOf(iii0ooll4.I0000Il00O)));
                            } else {
/* 780 */                       Iterator it3 = linkedHashMap2.entrySet().iterator();
/* 788 */                       if (it3.hasNext()) {
/* 792 */                           next2 = it3.next();
/* 800 */                           if (it3.hasNext()) {
/* 812 */                               float fFloatValue = ((Number) ((Map.Entry) next2).getValue()).floatValue();
/* 845 */                               do {
/* 816 */                                   Object next4 = it3.next();
/* 829 */                                   float fFloatValue2 = ((Number) ((Map.Entry) next4).getValue()).floatValue();
/* 837 */                                   if (Float.compare(fFloatValue, fFloatValue2) < 0) {
/* 839 */                                       next2 = next4;
/* 840 */                                       fFloatValue = fFloatValue2;
                                            }
/* 845 */                               } while (it3.hasNext());
                                    }
                                } else {
/* 790 */                           next2 = null;
                                }
/* 868 */                       strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("SPEAKER_", OlOoOIi0o.I00IO1(2, String.valueOf(((Number) ((Map.Entry) next2).getKey()).intValue())));
                            }
/* 1001 */                  long j3 = i001ii0o1ioo.I00000oIO;
/* 1003 */                  String str2 = i001ii0o1ioo.I0000Il00O;
/* 1005 */                  O0iO0ll1IOO o0iO0ll1IOO = new O0iO0ll1IOO();
/* 1008 */                  o0iO0ll1IOO.I00000oIO = j3;
/* 1010 */                  o0iO0ll1IOO.I00000oOI = j2;
/* 1012 */                  o0iO0ll1IOO.I0000Il00O = strI000o00OoI0I;
/* 1014 */                  o0iO0ll1IOO.I0000O = str2;
/* 1016 */                  VarHandle.storeStoreFence();
/* 1019 */                  arrayList3.add(o0iO0ll1IOO);
                        }
/* 1040 */              ArrayList arrayList22 = new ArrayList(IOOi1I.I0000O(arrayList3, 10));
/* 1043 */              it = arrayList3.iterator();
/* 1051 */              while (it.hasNext()) {
/* 1061 */                  arrayList22.add(((O0iO0ll1IOO) it.next()).I0000Il00O);
                        }
/* 1065 */              List listI001i1lo1io2 = IOOi0Ool1i.I001i1lo1io(arrayList22);
/* 1079 */              iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(listI001i1lo1io2, 10));
/* 1085 */              if (iI00000oIO < 16) {
/* 1087 */                  iI00000oIO = 16;
                        }
/* 1088 */              LinkedHashMap linkedHashMap3 = new LinkedHashMap(iI00000oIO);
/* 1099 */              for (Object obj2 : listI001i1lo1io2) {
/* 1108 */                  linkedHashMap3.put(obj2, (String) obj2);
                        }
/* 1153 */              olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), I1iIll0i.I00ilO0, 0, null, 0, null, I0001Ioi1lo(arrayList3, linkedHashMap3), arrayList3, linkedHashMap3, null, 0.0f, "", null, 2846));
/* 1182 */              return ooiIlOl1iI;
                    }
/* 89 */            fArr3 = i1iOI0O1OOO.I00iiI;
/* 91 */            Context context4 = i1iOI0O1OOO.I00iOIl;
/* 93 */            lIoii1l01l0i.I00000oOI(objTranscribeWithSegments);
/* 96 */            context2 = context4;
/* 194 */           list = (List) objTranscribeWithSegments;
/* 200 */           if (list.isEmpty()) {
/* 204 */               I0000oI00("Transcription returned no segments");
/* 207 */               return ooiIlOl1iI;
                    }
/* 218 */           if (((I1iO1loOII1) olO0OIIl1.getValue()).I0000Il00O == I1iIioiI0.I00iOIl) {
/* 280 */               olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), I1iIll0i.I00ilO0, 0, null, 0, null, IOOi0Ool1i.I00IlilI0i0i(list, " ", null, null, new I10I0o1ii10(7), 30), null, null, null, 0.0f, "", null, 3038));
/* 283 */               return ooiIlOl1iI;
                    }
/* 322 */           olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), I1iIll0i.I00ilI0I1, 0, null, 0, null, null, null, null, null, 0.0f, "Diarizing…", null, 3070));
/* 333 */           if (((String) iIlio101Io.I00iiI).length() <= 0 || ((String) iIlio101Io.I00iiO).length() <= 0) {
/* 353 */               File file2 = new File(context2.getExternalFilesDir(null), "__diar_models");
/* 365 */               if (!new File(file2, "seg.onnx").exists() || !new File(file2, "emb.onnx").exists()) {
/* 418 */                   olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), null, 0, null, 0, null, null, null, null, Iii0ool1Io0.I00iiI, 0.0f, null, null, 3839));
/* 421 */                   IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 423 */                   Ii1oo1ooill0 ii1oo1ooill0 = Ii1oo1ooill0.I00iiI;
/* 427 */                   I1iIil1I i1iIil1I2 = new I1iIil1I(this, context2, iOoil1iiIilo, i3);
/* 430 */                   i1iOI0O1OOO.I00iOIl = context2;
/* 432 */                   i1iOI0O1OOO.I00iiI = fArr3;
/* 437 */                   i1iOI0O1OOO.I00iiO = list;
/* 440 */                   i1iOI0O1OOO.I00ilO0 = 2;
/* 442 */                   Object objI0000oI002 = iOi1II01i0.I0000oI00(ii1oo1ooill0, i1iIil1I2, i1iOI0O1OOO);
/* 446 */                   if (objI0000oI002 != ii0111o) {
/* 451 */                       fArr2 = fArr3;
/* 452 */                       list2 = list;
/* 453 */                       objTranscribeWithSegments = objI0000oI002;
/* 454 */                       context3 = context2;
/* 461 */                       if (((Boolean) objTranscribeWithSegments).booleanValue()) {
                                }
                            }
                        }
/* 513 */               iIlio101Io.getClass();
/* 522 */               File file3 = new File(context2.getExternalFilesDir(null), "__diar_models");
/* 534 */               iIlio101Io.I00iiI = new File(file3, "seg.onnx").getAbsolutePath();
/* 545 */               iIlio101Io.I00iiO = new File(file3, "emb.onnx").getAbsolutePath();
/* 560 */               if (new File((String) iIlio101Io.I00iiI).exists()) {
                        }
/* 613 */               olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), null, 0, null, 0, null, null, null, null, Iii0ool1Io0.I00iiO, 0.0f, null, null, 3839));
/* 616 */               IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 621 */               I1iIil1I i1iIil1I3 = new I1iIil1I(this, fArr3, iOoil1iiIilo, 2);
/* 624 */               i1iOI0O1OOO.I00iOIl = null;
/* 626 */               i1iOI0O1OOO.I00iiI = null;
/* 631 */               i1iOI0O1OOO.I00iiO = list;
/* 634 */               i1iOI0O1OOO.I00ilO0 = 3;
/* 636 */               objI0000oI00 = iOi1II01i0.I0000oI00(iiI0oillOO103, i1iIil1I3, i1iOI0O1OOO);
/* 640 */               if (objI0000oI00 != ii0111o) {
                        }
                    } else {
/* 616 */               IiI0oillOO10 iiI0oillOO1032 = IiiIil1lOIO.I00000oIO;
/* 621 */               I1iIil1I i1iIil1I32 = new I1iIil1I(this, fArr3, iOoil1iiIilo, 2);
/* 624 */               i1iOI0O1OOO.I00iOIl = null;
/* 626 */               i1iOI0O1OOO.I00iiI = null;
/* 631 */               i1iOI0O1OOO.I00iiO = list;
/* 634 */               i1iOI0O1OOO.I00ilO0 = 3;
/* 636 */               objI0000oI00 = iOi1II01i0.I0000oI00(iiI0oillOO1032, i1iIil1I32, i1iOI0O1OOO);
/* 640 */               if (objI0000oI00 != ii0111o) {
                        }
                    }
/* 642 */           return ii0111o;
                }

                public final void I000O01llI0(I1iIioiI0 i1iIioiI0) {
/* 3 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 32 */            olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), null, 0, i1iIioiI0, 0, null, null, null, null, null, 0.0f, null, null, 4091));
                }

                public final void I000OOo1O() {
/* 3 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 11 */            I1iIll0i i1iIll0i = ((I1iO1loOII1) olO0OIIl1.getValue()).I00000oIO;
/* 13 */            I1iIll0i i1iIll0i2 = I1iIll0i.I00iiI;
/* 15 */            if (i1iIll0i == i1iIll0i2) {
/* 17 */                return;
                    }
/* 42 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 43 */            olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), i1iIll0i2, 0, null, 0, null, null, null, null, null, 0.0f, null, null, 2044));
/* 48 */            this.I0001Ioi1lo.clear();
/* 51 */            IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 55 */            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 69 */            this.I0000oI00 = iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new I1iOI0oo(this, iOoil1iiIilo, 0), 2);
/* 86 */            this.I000II = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(this), null, null, new I0II0OiI(this, iOoil1iiIilo, 4), 3);
                }
            }
