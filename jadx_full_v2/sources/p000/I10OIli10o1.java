            package p000;

            import android.util.Log;
            import com.google.ai.edge.gallery.data.local.entities.RagDocumentEntity;
            import com.google.mlkit.genai.prompt.Candidate;
            import com.google.mlkit.genai.prompt.GenerateContentResponse;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class I10OIli10o1 implements IlOil1iooOO0 {
                public final int I00iOIl;
                public IlOil1iooOO0 I00iiI;

                public I10OIli10o1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:116:0x01f6  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:151:0x0297  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    I10OIOII1 i10oioii1;
                    I1Oo1I i1Oo1I;
                    Ii1Ili1iIII ii1Ili1iIII;
                    String zza;
                    Object objEmit;
                    OI1lOI oI1lOI;
                    OO111l0 oO111l0;
                    IIllII iIllIII00000oIO;
                    OOioo01O000i oOioo01O000i;
/* 1 */             int i = this.I00iOIl;
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 10 */            Ol0i11lo1l1I ol0i11lo1l1I = null;
                    switch (i) {
                        case 0:
/* 649 */                   if (iOoil1iiIilo instanceof I10OIOII1) {
/* 652 */                       i10oioii1 = (I10OIOII1) iOoil1iiIilo;
/* 654 */                       int i2 = i10oioii1.I00iiI;
/* 658 */                       if ((i2 & Integer.MIN_VALUE) != 0) {
/* 661 */                           i10oioii1.I00iiI = i2 - Integer.MIN_VALUE;
                                } else {
/* 666 */                           i10oioii1 = new I10OIOII1(this, iOoil1iiIilo);
                                }
                            }
/* 669 */                   Object obj2 = i10oioii1.I00iOIl;
/* 671 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 673 */                   int i3 = i10oioii1.I00iiI;
/* 675 */                   if (i3 != 0) {
/* 677 */                       if (i3 == 1) {
/* 679 */                           lIoii1l01l0i.I00000oOI(obj2);
/* 735 */                           return ooiIlOl1iI;
                                }
/* 683 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 688 */                   lIoii1l01l0i.I00000oOI(obj2);
/* 691 */                   IlOil1iooOO0 ilOil1iooOO0 = this.I00iiI;
/* 695 */                   List list = ((i00lliOilOo) obj).I00000oIO;
/* 701 */                   ArrayList arrayList = new ArrayList();
/* 712 */                   for (Object obj3 : list) {
/* 720 */                       if (obj3 instanceof Io1IIIi01) {
/* 722 */                           arrayList.add(obj3);
                                }
                            }
/* 726 */                   i10oioii1.I00iiI = 1;
                            return ilOil1iooOO0.emit(arrayList, i10oioii1) == ii0111o ? ii0111o : ooiIlOl1iI;
                        case 1:
/* 488 */                   if (iOoil1iiIilo instanceof I1Oo1I) {
/* 491 */                       i1Oo1I = (I1Oo1I) iOoil1iiIilo;
/* 493 */                       int i4 = i1Oo1I.I00iiI;
/* 497 */                       if ((i4 & Integer.MIN_VALUE) != 0) {
/* 500 */                           i1Oo1I.I00iiI = i4 - Integer.MIN_VALUE;
                                } else {
/* 505 */                           i1Oo1I = new I1Oo1I(this, iOoil1iiIilo);
                                }
                            }
/* 508 */                   Object obj4 = i1Oo1I.I00iOIl;
/* 510 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 512 */                   int i5 = i1Oo1I.I00iiI;
/* 514 */                   if (i5 != 0) {
/* 516 */                       if (i5 == 1) {
/* 518 */                           lIoii1l01l0i.I00000oOI(obj4);
/* 646 */                           return ooiIlOl1iI;
                                }
/* 523 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 529 */                   lIoii1l01l0i.I00000oOI(obj4);
/* 532 */                   IlOil1iooOO0 ilOil1iooOO02 = this.I00iiI;
/* 536 */                   long j = ((Ol0i1I) obj).I00000oIO;
/* 545 */                   if (j == 9205357640488583168L) {
/* 547 */                       ol0i11lo1l1I = Ol0i11lo1l1I.I0000Il00O;
                            } else if (Ol0i1I.I0000oI00(j) >= 0.5d && Ol0i1I.I0000Il00O(j) >= 0.5d) {
/* 572 */                       float fI0000oI00 = Ol0i1I.I0000oI00(j);
/* 576 */                       boolean zIsInfinite = Float.isInfinite(fI0000oI00);
/* 580 */                       il1OioiO il1oioioI00000oIO = Iii10OOOI.I00000oIO;
/* 603 */                       il1OioiO il1oioioI00000oIO2 = (zIsInfinite || Float.isNaN(fI0000oI00)) ? il1oioioI00000oIO : iO1o1O.I00000oIO(O1OooO0IlOo.I000II(Ol0i1I.I0000oI00(j)));
/* 604 */                       float fI0000Il00O = Ol0i1I.I0000Il00O(j);
/* 612 */                       if (!Float.isInfinite(fI0000Il00O) && !Float.isNaN(fI0000Il00O)) {
/* 628 */                           il1oioioI00000oIO = iO1o1O.I00000oIO(O1OooO0IlOo.I000II(Ol0i1I.I0000Il00O(j)));
                                }
/* 632 */                       ol0i11lo1l1I = new Ol0i11lo1l1I(il1oioioI00000oIO2, il1oioioI00000oIO);
                            }
/* 635 */                   if (ol0i11lo1l1I == null) {
/* 646 */                       return ooiIlOl1iI;
                            }
/* 637 */                   i1Oo1I.I00iiI = 1;
                            return ilOil1iooOO02.emit(ol0i11lo1l1I, i1Oo1I) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                        case 2:
/* 389 */                   if (iOoil1iiIilo instanceof Ii1Ili1iIII) {
/* 392 */                       ii1Ili1iIII = (Ii1Ili1iIII) iOoil1iiIilo;
/* 394 */                       int i6 = ii1Ili1iIII.I00iiI;
/* 398 */                       if ((i6 & Integer.MIN_VALUE) != 0) {
/* 401 */                           ii1Ili1iIII.I00iiI = i6 - Integer.MIN_VALUE;
                                } else {
/* 406 */                           ii1Ili1iIII = new Ii1Ili1iIII(this, iOoil1iiIilo);
                                }
                            }
/* 409 */                   Object obj5 = ii1Ili1iIII.I00iOIl;
/* 411 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 413 */                   int i7 = ii1Ili1iIII.I00iiI;
/* 415 */                   if (i7 == 0) {
/* 428 */                       lIoii1l01l0i.I00000oOI(obj5);
/* 431 */                       IlOil1iooOO0 ilOil1iooOO03 = this.I00iiI;
/* 433 */                       OlO00iO01io olO00iO01io = (OlO00iO01io) obj;
/* 437 */                       if (olO00iO01io instanceof OOlIilOIlOi1) {
/* 485 */                           throw ((OOlIilOIlOi1) olO00iO01io).I00000oOI;
                                }
/* 441 */                       if (olO00iO01io instanceof Ii11I1iOiIo) {
/* 445 */                           Object obj6 = ((Ii11I1iOiIo) olO00iO01io).I00000oOI;
/* 447 */                           ii1Ili1iIII.I00iiI = 1;
                                    return ilOil1iooOO03.emit(obj6, ii1Ili1iIII) == ii0111o3 ? ii0111o3 : ooiIlOl1iI;
                                }
/* 459 */                       if ((olO00iO01io instanceof IlIo0ol0) || (olO00iO01io instanceof Ooi1ol) || (olO00iO01io instanceof OIIl11)) {
/* 476 */                           I000II.I001IO000("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                } else {
/* 470 */                           I000II.I00000oIO();
                                }
                            } else {
/* 417 */                       if (i7 == 1) {
/* 419 */                           lIoii1l01l0i.I00000oOI(obj5);
/* 480 */                           return ooiIlOl1iI;
                                }
/* 423 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                            }
/* 10 */                    return null;
                        case 3:
/* 357 */                   Candidate candidate = (Candidate) IOOi0Ool1i.I00II0Ol1O0l(((GenerateContentResponse) obj).getCandidates());
/* 359 */                   if (candidate == null || (zza = candidate.getZza()) == null) {
/* 367 */                       zza = "";
                            }
                            return (zza.length() <= 0 || (objEmit = this.I00iiI.emit(zza, iOoil1iiIilo)) != Ii0111o.I00iOIl) ? ooiIlOl1iI : objEmit;
                        case 4:
/* 284 */                   if (iOoil1iiIilo instanceof OI1lOI) {
/* 287 */                       oI1lOI = (OI1lOI) iOoil1iiIilo;
/* 289 */                       int i8 = oI1lOI.I00iiI;
/* 293 */                       if ((i8 & Integer.MIN_VALUE) != 0) {
/* 296 */                           oI1lOI.I00iiI = i8 - Integer.MIN_VALUE;
                                } else {
/* 301 */                           oI1lOI = new OI1lOI(this, iOoil1iiIilo);
                                }
                            }
/* 304 */                   Object obj7 = oI1lOI.I00iOIl;
/* 306 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 308 */                   int i9 = oI1lOI.I00iiI;
/* 310 */                   if (i9 != 0) {
/* 312 */                       if (i9 == 1) {
/* 314 */                           lIoii1l01l0i.I00000oOI(obj7);
/* 346 */                           return ooiIlOl1iI;
                                }
/* 318 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 323 */                   lIoii1l01l0i.I00000oOI(obj7);
/* 326 */                   IlOil1iooOO0 ilOil1iooOO04 = this.I00iiI;
/* 335 */                   if (((Boolean) obj).booleanValue()) {
/* 346 */                       return ooiIlOl1iI;
                            }
/* 337 */                   oI1lOI.I00iiI = 1;
                            return ilOil1iooOO04.emit(obj, oI1lOI) == ii0111o4 ? ii0111o4 : ooiIlOl1iI;
                        case 5:
/* 169 */                   if (iOoil1iiIilo instanceof OO111l0) {
/* 172 */                       oO111l0 = (OO111l0) iOoil1iiIilo;
/* 174 */                       int i10 = oO111l0.I00iiI;
/* 178 */                       if ((i10 & Integer.MIN_VALUE) != 0) {
/* 181 */                           oO111l0.I00iiI = i10 - Integer.MIN_VALUE;
                                } else {
/* 186 */                           oO111l0 = new OO111l0(this, iOoil1iiIilo);
                                }
                            }
/* 189 */                   Object obj8 = oO111l0.I00iOIl;
/* 191 */                   Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 193 */                   int i11 = oO111l0.I00iiI;
/* 195 */                   if (i11 != 0) {
/* 197 */                       if (i11 == 1) {
/* 199 */                           lIoii1l01l0i.I00000oOI(obj8);
/* 281 */                           return ooiIlOl1iI;
                                }
/* 203 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 208 */                   lIoii1l01l0i.I00000oOI(obj8);
/* 211 */                   IlOil1iooOO0 ilOil1iooOO05 = this.I00iiI;
/* 219 */                   ArrayList arrayList2 = new ArrayList();
/* 222 */                   Iterator it = ((List) obj).iterator();
/* 230 */                   while (it.hasNext()) {
/* 238 */                       String str = ((IIllI0o) it.next()).I00000oIO;
                                try {
/* 240 */                           iIllIII00000oIO = iOillilIolO.I00000oIO(str, null, null);
                                } catch (Exception e) {
/* 262 */                           Log.w("PipePresenceSrc", "Failed to create CameraIdentifier for pipeId: " + str, e);
/* 265 */                           iIllIII00000oIO = null;
                                }
/* 266 */                       if (iIllIII00000oIO != null) {
/* 268 */                           arrayList2.add(iIllIII00000oIO);
                                }
                            }
/* 272 */                   oO111l0.I00iiI = 1;
                            return ilOil1iooOO05.emit(arrayList2, oO111l0) == ii0111o5 ? ii0111o5 : ooiIlOl1iI;
                        case 6:
/* 40 */                    if (iOoil1iiIilo instanceof OOioo01O000i) {
/* 43 */                        oOioo01O000i = (OOioo01O000i) iOoil1iiIilo;
/* 45 */                        int i12 = oOioo01O000i.I00iiI;
/* 49 */                        if ((i12 & Integer.MIN_VALUE) != 0) {
/* 52 */                            oOioo01O000i.I00iiI = i12 - Integer.MIN_VALUE;
                                } else {
/* 57 */                            oOioo01O000i = new OOioo01O000i(this, iOoil1iiIilo);
                                }
                            }
/* 60 */                    Object obj9 = oOioo01O000i.I00iOIl;
/* 62 */                    Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 64 */                    int i13 = oOioo01O000i.I00iiI;
/* 66 */                    if (i13 != 0) {
/* 68 */                        if (i13 == 1) {
/* 70 */                            lIoii1l01l0i.I00000oOI(obj9);
/* 166 */                           return ooiIlOl1iI;
                                }
/* 74 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 79 */                    lIoii1l01l0i.I00000oOI(obj9);
/* 82 */                    IlOil1iooOO0 ilOil1iooOO06 = this.I00iiI;
/* 84 */                    List<RagDocumentEntity> list2 = (List) obj;
/* 96 */                    ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 107 */                   for (RagDocumentEntity ragDocumentEntity : list2) {
/* 117 */                       String id = ragDocumentEntity.getId();
/* 121 */                       String title = ragDocumentEntity.getTitle();
/* 125 */                       String uri = ragDocumentEntity.getUri();
/* 129 */                       long createdAt = ragDocumentEntity.getCreatedAt();
/* 133 */                       int chunkCount = ragDocumentEntity.getChunkCount();
/* 137 */                       OOio1iliiii oOio1iliiii = new OOio1iliiii();
/* 140 */                       oOio1iliiii.I00000oIO = id;
/* 142 */                       oOio1iliiii.I00000oOI = title;
/* 144 */                       oOio1iliiii.I0000Il00O = uri;
/* 146 */                       oOio1iliiii.I0000O = createdAt;
/* 148 */                       oOio1iliiii.I0000oI00 = chunkCount;
/* 150 */                       VarHandle.storeStoreFence();
/* 153 */                       arrayList3.add(oOio1iliiii);
                            }
/* 157 */                   oOioo01O000i.I00iiI = 1;
                            return ilOil1iooOO06.emit(arrayList3, oOioo01O000i) == ii0111o6 ? ii0111o6 : ooiIlOl1iI;
                        default:
/* 16 */                    IlOil1iooOO0 ilOil1iooOO07 = this.I00iiI;
/* 20 */                    OOl010 oOl010 = new OOl010();
/* 23 */                    oOl010.I00000oIO = (String) obj;
/* 25 */                    VarHandle.storeStoreFence();
/* 28 */                    Object objEmit2 = ilOil1iooOO07.emit(oOl010, iOoil1iiIilo);
                            return objEmit2 == Ii0111o.I00iOIl ? objEmit2 : ooiIlOl1iI;
                    }
                }
            }
