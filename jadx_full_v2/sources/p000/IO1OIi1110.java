            package p000;

            import android.content.Context;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.data.local.entities.Message;
            import java.lang.invoke.VarHandle;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Objects;
            
/* 17 */    public final class IO1OIi1110 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 0;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public final Object I00ioIO;
                public Object I00l0I0l0lO1;
                public final Object I00l0OO0IO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1OIi1110(ArrayList arrayList, int i, int i2, IOi10loi iOi10loi, OlOI1O olOI1O, IOoil1iiIilo iOoil1iiIilo) {
/* 15 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00ioIO = arrayList;
/* 6 */             this.I00iiO = i;
/* 8 */             this.I00iio = i2;
/* 10 */            this.I00l0I0l0lO1 = iOi10loi;
/* 12 */            this.I00l0OO0IO = olOI1O;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00l0OO0IO;
/* 5 */             Object obj3 = this.I00ioIO;
                    switch (i) {
                        case 0:
/* 39 */                    return new IO1OIi1110((IO1OIo01l1) obj3, (Context) obj2, iOoil1iiIilo);
                        default:
/* 28 */                    return new IO1OIi1110((ArrayList) obj3, this.I00iiO, this.I00iio, (IOi10loi) this.I00l0I0l0lO1, (OlOI1O) obj2, iOoil1iiIilo);
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
/* 18 */            return ((IO1OIi1110) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
                
                    if (r7 == r10) goto L65;
                 */
                /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00b5 A[PHI: r4
                  0x00b5: PHI (r4v14 OlO1ooI0i) = (r4v13 OlO1ooI0i), (r4v15 OlO1ooI0i) binds: [B:15:0x007c, B:20:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x01c4 A[Catch: Exception -> 0x0119, TryCatch #3 {Exception -> 0x0119, blocks: (B:51:0x0112, B:57:0x0135, B:77:0x0266, B:78:0x026c, B:80:0x0272, B:84:0x0289, B:67:0x01be, B:69:0x01c4, B:71:0x01cc, B:73:0x0203, B:74:0x021e, B:60:0x0144, B:66:0x0169, B:63:0x014d), top: B:110:0x00f8 }] */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0272 A[Catch: Exception -> 0x0119, TryCatch #3 {Exception -> 0x0119, blocks: (B:51:0x0112, B:57:0x0135, B:77:0x0266, B:78:0x026c, B:80:0x0272, B:84:0x0289, B:67:0x01be, B:69:0x01c4, B:71:0x01cc, B:73:0x0203, B:74:0x021e, B:60:0x0144, B:66:0x0169, B:63:0x014d), top: B:110:0x00f8 }] */
                /* JADX WARN: Removed duplicated region for block: B:90:0x02f5 A[Catch: Exception -> 0x011b, TRY_LEAVE, TryCatch #1 {Exception -> 0x011b, blocks: (B:86:0x028f, B:87:0x02d2, B:88:0x02ef, B:89:0x02f4, B:90:0x02f5), top: B:107:0x028f }] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0262 -> B:77:0x0266). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OoiIlOl1iI ooiIlOl1iI;
                    IOoil1iiIilo iOoil1iiIilo;
                    int i;
                    Ii0111o ii0111o;
                    Io11l1li io11l1li;
                    IO1OI110o1 iO1OI110o1;
                    SimpleDateFormat simpleDateFormat;
                    Object allConversationsSync;
                    SimpleDateFormat simpleDateFormat2;
                    StringBuilder sb;
                    int i2;
                    Iterator it;
                    int i3;
                    OlO1ooI0i olO1ooI0i;
                    Ool1lo ool1lo;
                    Object objI0000oI00;
                    OI11ol oI11ol;
                    OlO1ooI0i olO1ooI0i2;
                    Object objI0000Il00O;
                    Ool1lo ool1lo2;
/* 3 */             int i4 = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 7 */             Object obj2 = this.I00ioIO;
/* 12 */            Object obj3 = this.I00l0OO0IO;
                    switch (i4) {
                        case 0:
/* 228 */                   Context context = (Context) obj3;
/* 230 */                   IO1OIo01l1 iO1OIo01l1 = (IO1OIo01l1) obj2;
/* 236 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 238 */                   int i5 = this.I00iio;
/* 245 */                   char c = '\n';
                            try {
                            } catch (Exception unused) {
/* 282 */                       ooiIlOl1iI = ooiIlOl1iI2;
                            }
/* 249 */                   if (i5 == 0) {
/* 331 */                       lIoii1l01l0i.I00000oOI(obj);
/* 342 */                       simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
/* 345 */                       IO1loOo1o iO1loOo1o = iO1OIo01l1.I00000oOI;
/* 347 */                       this.I00ilI0I1 = simpleDateFormat;
/* 349 */                       this.I00iio = 1;
/* 353 */                       allConversationsSync = iO1loOo1o.I00000oIO.getAllConversationsSync(this);
                                break;
                            } else if (i5 == 1) {
/* 323 */                       simpleDateFormat = (SimpleDateFormat) this.I00ilI0I1;
/* 325 */                       lIoii1l01l0i.I00000oOI(obj);
/* 328 */                       allConversationsSync = obj;
                            } else {
/* 253 */                       if (i5 != 2) {
/* 255 */                           if (i5 == 3) {
/* 275 */                               lIoii1l01l0i.I00000oOI(obj);
                                    } else {
/* 257 */                               if (i5 != 4) {
/* 269 */                                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 272 */                                   return null;
                                        }
/* 265 */                               lIoii1l01l0i.I00000oOI(obj);
                                    }
/* 278 */                           ooiIlOl1iI = ooiIlOl1iI2;
/* 853 */                           return ooiIlOl1iI;
                                }
/* 290 */                       int i6 = this.I00iiO;
/* 292 */                       int i7 = this.I00iiI;
/* 296 */                       it = (Iterator) this.I00l0I0l0lO1;
/* 300 */                       IO1OIo01l1 iO1OIo01l12 = (IO1OIo01l1) this.I00io1l;
/* 304 */                       sb = (StringBuilder) this.I00ilO0;
/* 308 */                       simpleDateFormat2 = (SimpleDateFormat) this.I00ilI0I1;
/* 310 */                       lIoii1l01l0i.I00000oOI(obj);
/* 313 */                       Object messagesForConversationSync = obj;
/* 315 */                       int i8 = i6;
/* 316 */                       i3 = i7;
/* 317 */                       iO1OIo01l1 = iO1OIo01l12;
/* 318 */                       char c2 = 2;
/* 625 */                       for (Message message : (Iterable) messagesForConversationSync) {
/* 648 */                           String str = O0000Ioio00.I0000O(message.getRole(), "user") ? "You" : "Assistant";
/* 652 */                           int i9 = i3;
/* 654 */                           ooiIlOl1iI = ooiIlOl1iI2;
                                    try {
/* 697 */                               sb.append("[" + simpleDateFormat2.format(new Date(message.getTimestamp())) + "] " + str + ":");
/* 702 */                               sb.append('\n');
/* 709 */                               sb.append(message.getContent());
/* 712 */                               sb.append('\n');
/* 715 */                               sb.append('\n');
/* 718 */                               ooiIlOl1iI2 = ooiIlOl1iI;
/* 720 */                               i3 = i9;
                                    } catch (Exception unused2) {
/* 284 */                               ii0111o = ii0111o2;
/* 285 */                               iOoil1iiIilo = null;
/* 287 */                               i = 0;
/* 826 */                               IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 828 */                               io11l1li = O1OI1l011OO1.I00000oIO;
/* 832 */                               iO1OI110o1 = new IO1OI110o1(context, iOoil1iiIilo, i);
/* 835 */                               this.I00ilI0I1 = iOoil1iiIilo;
/* 837 */                               this.I00ilO0 = iOoil1iiIilo;
/* 839 */                               this.I00io1l = iOoil1iiIilo;
/* 841 */                               this.I00l0I0l0lO1 = iOoil1iiIilo;
/* 844 */                               this.I00iio = 4;
/* 850 */                               if (iOi1II01i0.I0000oI00(io11l1li, iO1OI110o1, this) == ii0111o) {
                                        }
/* 853 */                               return ooiIlOl1iI;
                                    }
                                }
/* 733 */                       sb.append(OlOolloIIOl0.I000OiO(72, "="));
/* 738 */                       sb.append('\n');
/* 742 */                       c = '\n';
/* 745 */                       i2 = i8;
/* 746 */                       ooiIlOl1iI2 = ooiIlOl1iI2;
/* 748 */                       i3 = i3;
/* 451 */                       if (it.hasNext()) {
/* 453 */                           Object next = it.next();
/* 457 */                           i8 = i2 + 1;
/* 459 */                           if (i2 < 0) {
/* 754 */                               IOOi1I.I000lI();
/* 757 */                               throw null;
                                    }
/* 461 */                           Conversation conversation = (Conversation) next;
/* 463 */                           sb.append(c);
/* 500 */                           sb.append("--- Conversation " + i8 + ": \"" + conversation.getTitle() + "\" ---");
/* 503 */                           sb.append(c);
/* 514 */                           if (conversation.getModelName().length() > 0) {
/* 537 */                               sb.append("Model: " + conversation.getModelName());
/* 540 */                               sb.append(c);
                                    }
/* 573 */                           sb.append("Date: " + simpleDateFormat2.format(new Date(conversation.getCreatedAt())));
/* 578 */                           sb.append('\n');
/* 581 */                           sb.append('\n');
/* 584 */                           IO1loOo1o iO1loOo1o2 = iO1OIo01l1.I00000oOI;
/* 586 */                           String id = conversation.getId();
/* 590 */                           this.I00ilI0I1 = simpleDateFormat2;
/* 592 */                           this.I00ilO0 = sb;
/* 594 */                           this.I00io1l = iO1OIo01l1;
/* 596 */                           this.I00l0I0l0lO1 = it;
/* 598 */                           this.I00iiI = i3;
/* 600 */                           this.I00iiO = i8;
/* 602 */                           c2 = 2;
/* 603 */                           this.I00iio = 2;
/* 607 */                           messagesForConversationSync = iO1loOo1o2.I00000oOI.getMessagesForConversationSync(id, this);
/* 611 */                           if (messagesForConversationSync == ii0111o2) {
/* 359 */                               return ii0111o2;
                                    }
/* 625 */                           while (r5.hasNext()) {
                                    }
/* 733 */                           sb.append(OlOolloIIOl0.I000OiO(72, "="));
/* 738 */                           sb.append('\n');
/* 742 */                           c = '\n';
/* 745 */                           i2 = i8;
/* 746 */                           ooiIlOl1iI2 = ooiIlOl1iI2;
/* 748 */                           i3 = i3;
/* 451 */                           if (it.hasNext()) {
/* 758 */                               ooiIlOl1iI = ooiIlOl1iI2;
/* 782 */                               String str2 = "box_chat_export_" + System.currentTimeMillis() + ".txt";
/* 790 */                               boolean zI0000oI00 = IO1OIo01l1.I0000oI00(context, str2, sb.toString());
/* 794 */                               IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 796 */                               Io11l1li io11l1li2 = O1OI1l011OO1.I00000oIO;
/* 798 */                               ii0111o = ii0111o2;
                                        try {
/* 802 */                                   iOoil1iiIilo = null;
/* 804 */                                   i = 0;
                                        } catch (Exception unused3) {
/* 285 */                                   iOoil1iiIilo = null;
/* 287 */                                   i = 0;
/* 826 */                                   IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 828 */                                   io11l1li = O1OI1l011OO1.I00000oIO;
/* 832 */                                   iO1OI110o1 = new IO1OI110o1(context, iOoil1iiIilo, i);
/* 835 */                                   this.I00ilI0I1 = iOoil1iiIilo;
/* 837 */                                   this.I00ilO0 = iOoil1iiIilo;
/* 839 */                                   this.I00io1l = iOoil1iiIilo;
/* 841 */                                   this.I00l0I0l0lO1 = iOoil1iiIilo;
/* 844 */                                   this.I00iio = 4;
/* 850 */                                   if (iOi1II01i0.I0000oI00(io11l1li, iO1OI110o1, this) == ii0111o) {
/* 855 */                                       return ii0111o;
                                            }
/* 853 */                                   return ooiIlOl1iI;
                                        }
                                        try {
/* 805 */                                   IO1O11 io1o11 = new IO1O11(zI0000oI00, context, str2, null, 0);
/* 808 */                                   this.I00ilI0I1 = null;
/* 810 */                                   this.I00ilO0 = null;
/* 812 */                                   this.I00io1l = null;
/* 814 */                                   this.I00l0I0l0lO1 = null;
/* 817 */                                   this.I00iio = 3;
/* 823 */                                   if (iOi1II01i0.I0000oI00(io11l1li2, io1o11, this) == ii0111o) {
/* 855 */                                       return ii0111o;
                                            }
                                        } catch (Exception unused4) {
/* 826 */                                   IiI0oillOO10 iiI0oillOO1032 = IiiIil1lOIO.I00000oIO;
/* 828 */                                   io11l1li = O1OI1l011OO1.I00000oIO;
/* 832 */                                   iO1OI110o1 = new IO1OI110o1(context, iOoil1iiIilo, i);
/* 835 */                                   this.I00ilI0I1 = iOoil1iiIilo;
/* 837 */                                   this.I00ilO0 = iOoil1iiIilo;
/* 839 */                                   this.I00io1l = iOoil1iiIilo;
/* 841 */                                   this.I00l0I0l0lO1 = iOoil1iiIilo;
/* 844 */                                   this.I00iio = 4;
/* 850 */                                   if (iOi1II01i0.I0000oI00(io11l1li, iO1OI110o1, this) == ii0111o) {
                                            }
/* 853 */                                   return ooiIlOl1iI;
                                        }
/* 853 */                               return ooiIlOl1iI;
                                    }
                                }
                            }
/* 362 */                   List list = (List) allConversationsSync;
/* 366 */                   StringBuilder sb2 = new StringBuilder();
/* 371 */                   sb2.append("Box Chat Export");
/* 374 */                   sb2.append('\n');
/* 398 */                   sb2.append("Exported: " + simpleDateFormat.format(new Date()));
/* 401 */                   sb2.append('\n');
/* 420 */                   sb2.append("Total conversations: " + list.size());
/* 423 */                   sb2.append('\n');
/* 430 */                   sb2.append(OlOolloIIOl0.I000OiO(72, "="));
/* 433 */                   sb2.append('\n');
/* 438 */                   Iterator it2 = list.iterator();
/* 442 */                   simpleDateFormat2 = simpleDateFormat;
/* 443 */                   sb = sb2;
/* 444 */                   i2 = 0;
/* 445 */                   it = it2;
/* 446 */                   i3 = 0;
/* 451 */                   if (it.hasNext()) {
                            }
                        default:
/* 20 */                    OlOI1O olOI1O = (OlOI1O) obj3;
/* 22 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 24 */                    int i10 = this.I00iiI;
/* 28 */                    if (i10 == 0) {
/* 94 */                        lIoii1l01l0i.I00000oOI(obj);
/* 101 */                       int i11 = this.I00iiO;
/* 103 */                       int i12 = this.I00iio;
/* 107 */                       IOi10loi iOi10loi = (IOi10loi) this.I00l0I0l0lO1;
/* 109 */                       olO1ooI0i = new OlO1ooI0i();
/* 112 */                       olO1ooI0i.I00000oIO = (ArrayList) obj2;
/* 114 */                       olO1ooI0i.I00000oOI = i11;
/* 116 */                       olO1ooI0i.I0000Il00O = i12;
/* 118 */                       olO1ooI0i.I0000O = iOi10loi;
/* 120 */                       VarHandle.storeStoreFence();
/* 123 */                       ool1lo = olOI1O.I0000O;
/* 125 */                       if (ool1lo != null) {
/* 127 */                           this.I00ilI0I1 = olO1ooI0i;
/* 129 */                           this.I00ilO0 = ool1lo;
/* 131 */                           this.I00iiI = 1;
/* 133 */                           objI0000oI00 = ool1lo.I0000oI00(this);
/* 137 */                           if (objI0000oI00 != ii0111o3) {
                                    }
                                } else {
/* 182 */                           OI1I0OoOl oI1I0OoOl = olOI1O.I0000Il00O;
/* 184 */                           this.I00ilI0I1 = olO1ooI0i;
/* 186 */                           this.I00ilO0 = oI1I0OoOl;
/* 188 */                           this.I00io1l = olOI1O;
/* 190 */                           this.I00iiI = 3;
/* 196 */                           if (oI1I0OoOl.I00000oIO(this) != ii0111o3) {
/* 200 */                               oI11ol = oI1I0OoOl;
/* 201 */                               olO1ooI0i2 = olO1ooI0i;
/* 204 */                               olOI1O.I0000oI00.add(olO1ooI0i2);
/* 207 */                               oI11ol.I00000oOI(null);
/* 216 */                               if (l11I11lO.I0000O(3, "CXCP")) {
                                        }
                                    }
                                }
/* 198 */                       return ii0111o3;
                            }
/* 30 */                    if (i10 != 1) {
/* 32 */                        if (i10 == 2) {
/* 63 */                            olOI1O = (OlOI1O) this.I00io1l;
/* 67 */                            ool1lo2 = (Ool1lo) this.I00ilO0;
/* 71 */                            OlO1ooI0i olO1ooI0i3 = (OlO1ooI0i) this.I00ilI0I1;
/* 73 */                            lIoii1l01l0i.I00000oOI(obj);
/* 76 */                            olO1ooI0i = olO1ooI0i3;
/* 77 */                            objI0000Il00O = obj;
/* 166 */                           IiIOI1ol0o iiIOI1ol0o = (IiIOI1ol0o) objI0000Il00O;
/* 168 */                           if (ool1lo2 == null) {
/* 170 */                               olOI1O.I00000oIO(iiIOI1ol0o, olO1ooI0i, ool1lo2);
/* 221 */                               return ooiIlOl1iI2;
                                    }
/* 174 */                           I000II.I000iOII("Required value was null.");
/* 16 */                            return null;
                                }
/* 34 */                        if (i10 != 3) {
/* 54 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                            return null;
                                }
/* 39 */                        olOI1O = (OlOI1O) this.I00io1l;
/* 43 */                        oI11ol = (OI11ol) this.I00ilO0;
/* 47 */                        olO1ooI0i2 = (OlO1ooI0i) this.I00ilI0I1;
/* 49 */                        lIoii1l01l0i.I00000oOI(obj);
                                try {
/* 204 */                           olOI1O.I0000oI00.add(olO1ooI0i2);
/* 207 */                           oI11ol.I00000oOI(null);
/* 216 */                           if (l11I11lO.I0000O(3, "CXCP")) {
/* 221 */                               return ooiIlOl1iI2;
                                    }
/* 218 */                           Objects.toString(olO1ooI0i2);
/* 221 */                           return ooiIlOl1iI2;
                                } catch (Throwable th) {
/* 223 */                           oI11ol.I00000oOI(null);
/* 226 */                           throw th;
                                }
                            }
/* 82 */                    ool1lo = (Ool1lo) this.I00ilO0;
/* 86 */                    olO1ooI0i = (OlO1ooI0i) this.I00ilI0I1;
/* 88 */                    lIoii1l01l0i.I00000oOI(obj);
/* 91 */                    objI0000oI00 = obj;
/* 146 */                   if (((Boolean) objI0000oI00).booleanValue()) {
/* 148 */                       if (ool1lo == null) {
/* 178 */                           I000II.I000iOII("Required value was null.");
/* 16 */                            return null;
                                }
/* 150 */                       this.I00ilI0I1 = olO1ooI0i;
/* 152 */                       this.I00ilO0 = ool1lo;
/* 154 */                       this.I00io1l = olOI1O;
/* 156 */                       this.I00iiI = 2;
/* 158 */                       objI0000Il00O = olOI1O.I0000Il00O(olO1ooI0i, ool1lo, this);
/* 162 */                       if (objI0000Il00O != ii0111o3) {
/* 165 */                           ool1lo2 = ool1lo;
/* 166 */                           IiIOI1ol0o iiIOI1ol0o2 = (IiIOI1ol0o) objI0000Il00O;
/* 168 */                           if (ool1lo2 == null) {
                                    }
                                }
                            }
/* 198 */                   return ii0111o3;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public IO1OIi1110(IO1OIo01l1 iO1OIo01l1, Context context, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 19 */            this.I00ioIO = iO1OIo01l1;
                    this.I00l0OO0IO = context;
                }
            }
