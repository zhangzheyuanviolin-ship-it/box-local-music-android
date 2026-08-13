            package p000;

            import com.google.ai.edge.gallery.data.local.entities.RagChunkEntity;
            import com.google.ai.edge.gallery.data.local.entities.RagDocumentEntity;
            import com.google.ai.edge.litertlm.ReflectionTool;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            
            public final class OOii01Ioi1 implements Function1 {
                public final int I00iOIl;

                public OOii01Ioi1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v0, types: [IOoil1iiIilo] */
                /* JADX WARN: Type inference failed for: r6v19 */
                /* JADX WARN: Type inference failed for: r6v25 */
                @Override
                public final Object invoke(Object obj) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 5 */             int i2 = 3;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 11 */            OlIIi1oIIOlo olIIi1oIIOlo = 0;
/* 11 */            oo0o1OiIo = null;
/* 11 */            Oo0o1OiIo oo0o1OiIo = null;
/* 11 */            olIIi1oIIOlo = 0;
                    switch (i) {
                        case 0:
/* 883 */                   return ooiIlOl1iI;
                        case 1:
/* 876 */                   return Pattern.quote((String) obj);
                        case 2:
/* 790 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT * FROM rag_chunks");
                            try {
/* 794 */                       int iI00000oIO = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "id");
/* 800 */                       int iI00000oIO2 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "document_id");
/* 806 */                       int iI00000oIO3 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "ordinal");
/* 812 */                       int iI00000oIO4 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "text");
/* 818 */                       int iI00000oIO5 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "embedding");
/* 824 */                       ArrayList arrayList = new ArrayList();
/* 831 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 859 */                           arrayList.add(new RagChunkEntity(oiIIl0O1l0lI00000oIO.getLong(iI00000oIO), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO2), (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO3), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO4), oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO5)));
                                }
/* 866 */                       oiIIl0O1l0lI00000oIO.close();
/* 869 */                       return arrayList;
                            } finally {
/* 870 */                       oiIIl0O1l0lI00000oIO.close();
                            }
                        case 3:
/* 702 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO2 = ((Olil0III) obj).I00000oIO("SELECT * FROM rag_documents ORDER BY created_at DESC");
                            try {
/* 706 */                       int iI00000oIO6 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "id");
/* 712 */                       int iI00000oIO7 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "title");
/* 718 */                       int iI00000oIO8 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "uri");
/* 724 */                       int iI00000oIO9 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "created_at");
/* 730 */                       int iI00000oIO10 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "chunk_count");
/* 736 */                       ArrayList arrayList2 = new ArrayList();
/* 743 */                       while (oiIIl0O1l0lI00000oIO2.I00ol1()) {
/* 771 */                           arrayList2.add(new RagDocumentEntity(oiIIl0O1l0lI00000oIO2.I00i0O(iI00000oIO6), oiIIl0O1l0lI00000oIO2.I00i0O(iI00000oIO7), oiIIl0O1l0lI00000oIO2.I00i0O(iI00000oIO8), oiIIl0O1l0lI00000oIO2.getLong(iI00000oIO9), (int) oiIIl0O1l0lI00000oIO2.getLong(iI00000oIO10)));
                                }
/* 781 */                       return arrayList2;
                            } finally {
/* 782 */                       oiIIl0O1l0lI00000oIO2.close();
                            }
                        case 4:
/* 695 */                   return ((Oi10ooi) obj).I00000oIO;
                        case 5:
/* 690 */                   return ((OOio1iliiii) obj).I00000oIO;
                        case 6:
/* 683 */                   return Long.valueOf(((OOio00) obj).I00000oIO);
                        case 7:
/* 1 */                     return ReflectionTool.getTypeJsonSchema$lambda$0((O0IOli0o0) obj);
                        case 8:
/* 669 */                   IOlO1IilOlOl iOlO1IilOlOl = Oi1Io0I.I00000oIO;
/* 671 */                   return ooiIlOl1iI;
                        case 9:
/* 636 */                   Map.Entry entry = (Map.Entry) obj;
/* 642 */                   String str = (String) entry.getKey();
/* 644 */                   Object value = entry.getValue();
/* 650 */                   String strI00IOO = OlOoOIi0o.I00IOO("inline:", str);
/* 654 */                   if (strI00IOO == str) {
/* 656 */                       strI00IOO = null;
                            }
/* 657 */                   if (strI00IOO != null) {
/* 663 */                       return new OIoi0IIoi(strI00IOO, (Ioll0ll0) value);
                            }
/* 11 */                    return null;
                        case 10:
/* 625 */                   long j = IOOiio0i.I000o00OoI0I;
/* 627 */                   Oi1iOI1oI0oi oi1iOI1oI0oi = new Oi1iOI1oI0oi();
/* 630 */                   oi1iOI1oI0oi.I00000oIO = j;
/* 632 */                   VarHandle.storeStoreFence();
/* 635 */                   return oi1iOI1oI0oi;
                        case 11:
/* 620 */                   return ooiIlOl1iI;
                        case 12:
/* 582 */                   IOIooi0ol1i iOIooi0ol1i = (IOIooi0ol1i) obj;
/* 586 */                   OiIO010 oiIO010 = (OiIO010) iOIooi0ol1i.I00000oOI;
/* 600 */                   iOIooi0ol1i.I00000oIO(O1oO0lOoI1.I00iiI, new OiIOIIlI1Ol1(iOIooi0ol1i, oiIO010.I00000oIO, oiIO010.I00000oOI, null));
/* 614 */                   iOIooi0ol1i.I00000oIO.I00ilI0I1.I000II(IoO0l0Iiioll.I00100o1O0lo, new IoIlii1(i2, olIIi1oIIOlo));
/* 617 */                   return ooiIlOl1iI;
                        case 13:
/* 577 */                   return new OiIil1il((Map) obj);
                        case 14:
/* 572 */                   return obj;
                        case 15:
/* 465 */                   List list = (List) obj;
/* 467 */                   Object obj2 = list.get(0);
/* 471 */                   IoloOio0I ioloOio0I = OiO0O10ii001.I000OOo1O;
/* 473 */                   Boolean bool = Boolean.FALSE;
/* 493 */                   OlIIi1oIIOlo olIIi1oIIOlo2 = (O0000Ioio00.I0000O(obj2, bool) || obj2 == null) ? null : (OlIIi1oIIOlo) ((Function1) ioloOio0I.I00iiO).invoke(obj2);
/* 495 */                   Object obj3 = list.get(1);
/* 517 */                   OlIIi1oIIOlo olIIi1oIIOlo3 = (O0000Ioio00.I0000O(obj3, bool) || obj3 == null) ? null : (OlIIi1oIIOlo) ((Function1) ioloOio0I.I00iiO).invoke(obj3);
/* 519 */                   Object obj4 = list.get(2);
/* 541 */                   OlIIi1oIIOlo olIIi1oIIOlo4 = (O0000Ioio00.I0000O(obj4, bool) || obj4 == null) ? null : (OlIIi1oIIOlo) ((Function1) ioloOio0I.I00iiO).invoke(obj4);
/* 543 */                   Object obj5 = list.get(3);
/* 551 */                   if (!O0000Ioio00.I0000O(obj5, bool) && obj5 != null) {
/* 565 */                       olIIi1oIIOlo = (OlIIi1oIIOlo) ((Function1) ioloOio0I.I00iiO).invoke(obj5);
                            }
/* 569 */                   return new Oo0io0OO1(olIIi1oIIOlo2, olIIi1oIIOlo3, olIIi1oIIOlo4, olIIi1oIIOlo);
                        case 16:
/* 420 */                   List list2 = (List) obj;
/* 422 */                   Object obj6 = list2.get(1);
/* 448 */                   List list3 = (O0000Ioio00.I0000O(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) OiO0O10ii001.I00000oOI.I00iiO).invoke(obj6);
/* 450 */                   Object obj7 = list2.get(0);
/* 461 */                   return new I1111OO10i(list3, obj7 != null ? (String) obj7 : null);
                        case 17:
/* 416 */                   return new OlooIOI0O(((Integer) obj).intValue());
                        case PoseLandmark.RIGHT_PINKY:
/* 380 */                   List list4 = (List) obj;
/* 404 */                   return new Oo0OOlO0(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
                        case PoseLandmark.LEFT_INDEX:
/* 314 */                   List list5 = (List) obj;
/* 318 */                   Object obj8 = list5.get(0);
/* 322 */                   Oo0o1iioOiO[] oo0o1iioOiOArr = Oo0o1OiIo.I00000oOI;
/* 324 */                   OiO0IOoOOI0 oiO0IOoOOI0 = OiO0O10ii001.I001i1lo1io;
/* 326 */                   Boolean bool2 = Boolean.FALSE;
/* 348 */                   long j2 = (((O0000Ioio00.I0000O(obj8, bool2) && oiO0IOoOOI0 == null) || obj8 == null) ? null : (Oo0o1OiIo) oiO0IOoOOI0.I00iiI.invoke(obj8)).I00000oIO;
/* 350 */                   Object obj9 = list5.get(1);
/* 358 */                   if ((!O0000Ioio00.I0000O(obj9, bool2) || oiO0IOoOOI0 != null) && obj9 != null) {
/* 372 */                       oo0o1OiIo = (Oo0o1OiIo) oiO0IOoOOI0.I00iiI.invoke(obj9);
                            }
/* 376 */                   return new Oo0OOliO01o(j2, oo0o1OiIo.I00000oIO);
                        case PoseLandmark.RIGHT_INDEX:
/* 310 */                   return new IlilIIiIiO(((Integer) obj).intValue());
                        case PoseLandmark.LEFT_THUMB:
/* 297 */                   return I1oi0illolii.I00000oIO(((Float) obj).floatValue());
                        case PoseLandmark.RIGHT_THUMB:
/* 253 */                   List list6 = (List) obj;
/* 255 */                   Object obj10 = list6.get(0);
/* 265 */                   int iIntValue = (obj10 != null ? (Integer) obj10 : null).intValue();
/* 269 */                   Object obj11 = list6.get(1);
/* 286 */                   return Oo0lI00l.I00000oIO(lOliOi0Oi.I00000oIO(iIntValue, (obj11 != null ? (Integer) obj11 : null).intValue()));
                        case PoseLandmark.LEFT_HIP:
/* 172 */                   List list7 = (List) obj;
/* 176 */                   Object obj12 = list7.get(0);
/* 180 */                   int i3 = IOOiio0i.I000oI1ioi;
/* 182 */                   OiO0IOoOOI0 oiO0IOoOOI02 = OiO0O10ii001.I0010I0i;
/* 184 */                   Boolean bool3 = Boolean.FALSE;
/* 206 */                   long j3 = (((O0000Ioio00.I0000O(obj12, bool3) && oiO0IOoOOI02 == null) || obj12 == null) ? null : (IOOiio0i) oiO0IOoOOI02.I00iiI.invoke(obj12)).I00000oIO;
/* 208 */                   Object obj13 = list7.get(1);
/* 212 */                   OiO0IOoOOI0 oiO0IOoOOI03 = OiO0O10ii001.I001l0I00;
/* 234 */                   long j4 = (((O0000Ioio00.I0000O(obj13, bool3) && oiO0IOoOOI03 == null) || obj13 == null) ? null : (OIOlIiiioi) oiO0IOoOOI03.I00iiI.invoke(obj13)).I00000oIO;
/* 236 */                   Object obj14 = list7.get(2);
/* 249 */                   return new OioOII0oI((obj14 != null ? (Float) obj14 : null).floatValue(), j3, j4);
                        case PoseLandmark.RIGHT_HIP:
/* 167 */                   return OloOOIoO1ii1.I00000oIO(((Integer) obj).intValue());
                        case PoseLandmark.LEFT_KNEE:
/* 115 */                   List list8 = (List) obj;
/* 117 */                   Object obj15 = list8.get(0);
/* 126 */                   String str2 = obj15 != null ? (String) obj15 : null;
/* 127 */                   Object obj16 = list8.get(1);
/* 157 */                   return new O0ooi0ll(str2, (O0000Ioio00.I0000O(obj16, Boolean.FALSE) || obj16 == null) ? null : (Oo0io0OO1) ((Function1) OiO0O10ii001.I000OiO.I00iiO).invoke(obj16), null);
                        case PoseLandmark.RIGHT_KNEE:
/* 100 */                   int iIntValue2 = ((Integer) obj).intValue();
/* 106 */                   OlooIlII1 olooIlII1 = new OlooIlII1();
/* 109 */                   olooIlII1.I00000oIO = iIntValue2;
/* 111 */                   VarHandle.storeStoreFence();
/* 114 */                   return olooIlII1;
                        case 27:
/* 83 */                    int iIntValue3 = ((Integer) obj).intValue();
/* 89 */                    IoOiIO ioOiIO = new IoOiIO();
/* 92 */                    ioOiIO.I00000oIO = iIntValue3;
/* 94 */                    VarHandle.storeStoreFence();
/* 97 */                    return ioOiIO;
                        case PoseLandmark.RIGHT_ANKLE:
/* 26 */                    List list9 = (List) obj;
/* 34 */                    ArrayList arrayList3 = new ArrayList(list9.size());
/* 40 */                    int size = list9.size();
/* 44 */                    for (int i4 = 0; i4 < size; i4++) {
/* 46 */                        Object obj17 = list9.get(i4);
/* 74 */                        arrayList3.add((O0000Ioio00.I0000O(obj17, Boolean.FALSE) || obj17 == null) ? null : (I11110l0o) ((Function1) OiO0O10ii001.I0000Il00O.I00iiO).invoke(obj17));
                            }
/* 80 */                    return arrayList3;
                        default:
/* 21 */                    return Ilil10i.I00000oIO(((Integer) obj).intValue());
                    }
                }
            }
