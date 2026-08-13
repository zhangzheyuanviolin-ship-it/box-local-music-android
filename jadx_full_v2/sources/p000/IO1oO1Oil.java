            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.data.local.entities.Message;
            import java.io.File;
            import java.io.FileInputStream;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class IO1oO1Oil extends Oll0io implements IlliIl1l11O {
                public O11iO00I1o I00iOIl;
                public String I00iiI;
                public int I00iiO;
                public final O11iO00I1o I00iio;
                public final O1oIOiI11o0 I00ilI0I1;
                public final String I00ilO0;
                public final boolean I00io1l;
                public final Context I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1oO1Oil(O11iO00I1o o11iO00I1o, O1oIOiI11o0 o1oIOiI11o0, String str, boolean z, Context context, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iio = o11iO00I1o;
/* 3 */             this.I00ilI0I1 = o1oIOiI11o0;
/* 5 */             this.I00ilO0 = str;
/* 7 */             this.I00io1l = z;
/* 9 */             this.I00ioIO = context;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            return new IO1oO1Oil(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IO1oO1Oil) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:132:0x02a6, code lost:
                
                    if (r0 != r2) goto L134;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
                
                    if (r9 == r2) goto L133;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:104:0x01e0  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x0250  */
                /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x0285  */
                /* JADX WARN: Removed duplicated region for block: B:142:0x02c7  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x013a A[Catch: Exception -> 0x0130, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0130, blocks: (B:54:0x0104, B:64:0x012b, B:74:0x013a, B:76:0x0146, B:82:0x0154, B:83:0x0157, B:75:0x0142, B:80:0x0152), top: B:147:0x0104, inners: #0, #3 }] */
                /* JADX WARN: Type inference failed for: r3v1, types: [Il01100l] */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
                /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    O11iO00I1o o11iO00I1o;
                    String id;
                    Object objI00100o1O0lo;
                    O11iO00I1o o11iO00I1o2;
                    String str;
                    Object objI0010o;
                    List<Message> list;
                    ?? arrayList;
                    ConcurrentHashMap concurrentHashMap;
                    String str2;
                    Context context;
                    int i;
                    String str3;
                    Object conversationById;
                    String imagePaths;
                    Bitmap bitmapDecodeByteArray;
                    String systemPrompt;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i2 = this.I00iiO;
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 12 */            O1oIOiI11o0 o1oIOiI11o0 = this.I00ilI0I1;
/* 15 */            if (i2 == 0) {
/* 59 */                lIoii1l01l0i.I00000oOI(obj);
/* 62 */                o11iO00I1o = this.I00iio;
/* 82 */                List list2 = (List) ((IO1looOIi) o11iO00I1o.I0000Il00O.I00iOIl.getValue()).I0000O.get(o1oIOiI11o0.I00000oIO);
/* 86 */                if (list2 == null || list2.isEmpty()) {
/* 94 */                    id = this.I00ilO0;
/* 96 */                    if (id == null) {
/* 106 */                       if (this.I00io1l) {
/* 108 */                           String str4 = o1oIOiI11o0.I00000oIO;
/* 110 */                           this.I00iOIl = o11iO00I1o;
/* 112 */                           this.I00iiO = 1;
/* 114 */                           objI00100o1O0lo = o11iO00I1o.I00100o1O0lo(str4, this);
                                }
/* 131 */                       o11iO00I1o2 = o11iO00I1o;
/* 132 */                       str = null;
/* 133 */                       if (str != null) {
/* 712 */                           String str5 = o1oIOiI11o0.I00000oIO;
/* 714 */                           o11iO00I1o2.I0001Ioi1lo = null;
/* 1261 */                          return ooiIlOl1iI;
                                }
/* 135 */                       String str6 = o1oIOiI11o0.I00000oIO;
/* 137 */                       this.I00iOIl = o11iO00I1o2;
/* 139 */                       this.I00iiI = str;
/* 141 */                       this.I00iiO = 2;
/* 143 */                       objI0010o = o11iO00I1o2.I0010o(str, this);
/* 147 */                       if (objI0010o != ii0111o) {
/* 48 */                            String str7 = str;
/* 151 */                           list = (List) objI0010o;
/* 153 */                           if (list != null) {
                                    }
/* 158 */                           boolean z = false;
/* 161 */                           if (list != null) {
                                    }
/* 477 */                           o11iO00I1o2.I0001Ioi1lo = str7;
/* 479 */                           if (list == null) {
                                    }
/* 595 */                           concurrentHashMap = o11iO00I1o2.I000O01llI0;
/* 597 */                           str2 = o1oIOiI11o0.I00000oIO;
/* 599 */                           context = o11iO00I1o2.I0000oI00;
/* 601 */                           if (context != null) {
/* 635 */                               concurrentHashMap.put(str2, arrayList);
/* 644 */                               if (l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0) instanceof O1111lilIi0) {
/* 622 */                                   i = 3;
/* 623 */                                   str3 = null;
                                        }
/* 663 */                               this.I00iOIl = o11iO00I1o2;
/* 665 */                               this.I00iiI = str3;
/* 667 */                               this.I00iiO = i;
/* 675 */                               conversationById = o11iO00I1o2.I00100l0().I00000oIO.getConversationById(str7, this);
                                    } else {
/* 635 */                               concurrentHashMap.put(str2, arrayList);
/* 644 */                               if (l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0) instanceof O1111lilIi0) {
                                        }
/* 663 */                               this.I00iOIl = o11iO00I1o2;
/* 665 */                               this.I00iiI = str3;
/* 667 */                               this.I00iiO = i;
/* 675 */                               conversationById = o11iO00I1o2.I00100l0().I00000oIO.getConversationById(str7, this);
                                    }
                                }
/* 681 */                       return ii0111o;
                            }
/* 98 */                    String str8 = id;
/* 100 */                   o11iO00I1o2 = o11iO00I1o;
/* 101 */                   str = str8;
/* 133 */                   if (str != null) {
                            }
                        }
/* 711 */               return ooiIlOl1iI;
                    }
/* 17 */            if (i2 == 1) {
/* 51 */                o11iO00I1o = this.I00iOIl;
/* 53 */                lIoii1l01l0i.I00000oOI(obj);
/* 56 */                objI00100o1O0lo = obj;
                    } else {
/* 19 */                if (i2 != 2) {
/* 21 */                    if (i2 != 3) {
/* 35 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                        return null;
                            }
/* 23 */                    O11iO00I1o o11iO00I1o3 = this.I00iOIl;
/* 25 */                    lIoii1l01l0i.I00000oOI(obj);
/* 28 */                    o11iO00I1o2 = o11iO00I1o3;
/* 29 */                    conversationById = obj;
/* 682 */                   Conversation conversation = (Conversation) conversationById;
/* 684 */                   if (conversation != null && (systemPrompt = conversation.getSystemPrompt()) != null && systemPrompt.length() > 0) {
/* 698 */                       String systemPrompt2 = conversation.getSystemPrompt();
/* 702 */                       OlO0OIIl1 olO0OIIl1 = o11iO00I1o2.I000OOo1O;
/* 704 */                       olO0OIIl1.getClass();
/* 708 */                       olO0OIIl1.I000lI(null, systemPrompt2);
                            }
/* 711 */                   return ooiIlOl1iI;
                        }
/* 39 */                str = this.I00iiI;
/* 41 */                o11iO00I1o2 = this.I00iOIl;
/* 43 */                lIoii1l01l0i.I00000oOI(obj);
/* 46 */                objI0010o = obj;
/* 48 */                String str72 = str;
/* 151 */               list = (List) objI0010o;
/* 153 */               if (list != null) {
/* 155 */                   list.size();
                        }
/* 158 */               boolean z2 = false;
/* 161 */               if (list != null) {
/* 166 */                   Context context2 = this.I00ioIO;
/* 176 */                   for (Message message : list) {
/* 194 */                       if (!O0000Ioio00.I0000O(message.getRole(), "user_image") || (imagePaths = message.getImagePaths()) == null || imagePaths.length() == 0) {
/* 467 */                           o11iO00I1o2.I0000oI00(o1oIOiI11o0, new IO1iI1i(message.getContent(), O0000Ioio00.I0000O(message.getRole(), "user") ? IO1loo.I00iOIl : IO1loo.I00iiI, message.getLatencyMs(), null, false, 248));
                                } else {
/* 221 */                           List<String> listI00IoIO0lI = OlOoOIi0o.I00IoIO0lI(message.getImagePaths(), new String[]{","}, 6);
/* 229 */                           ArrayList arrayList2 = new ArrayList();
/* 240 */                           for (String str9 : listI00IoIO0lI) {
/* 250 */                               File file = new File(str9);
/* 257 */                               if (file.exists()) {
                                            try {
/* 271 */                                       if (OlOolloIIOl0.I000II(file.getName(), ".png.enc", z2)) {
/* 319 */                                           Il0IOIi il0IOIiI00100o1O0lo = i1Iolo.I00000oIO(context2, file).I00100o1O0lo();
                                                    try {
/* 323 */                                               byte[] bArrI00000oOI = iOiOlIoI.I00000oOI(il0IOIiI00100o1O0lo);
/* 327 */                                               il0IOIiI00100o1O0lo.close();
/* 332 */                                               bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrI00000oOI, 0, bArrI00000oOI.length);
                                                    } finally {
                                                    }
                                                } else {
                                                    try {
/* 275 */                                               byte[] bArr = new byte[4];
/* 279 */                                               FileInputStream fileInputStream = new FileInputStream(file);
                                                        try {
/* 282 */                                                   int i3 = fileInputStream.read(bArr);
/* 286 */                                                   fileInputStream.close();
/* 290 */                                                   if (i3 == 4 && Arrays.equals(bArr, i1Iolo.I00000oIO)) {
/* 300 */                                                       bitmapDecodeByteArray = BitmapFactory.decodeFile(str9);
                                                            }
                                                        } catch (Throwable th) {
                                                            try {
/* 309 */                                                       throw th;
                                                            } catch (Throwable th2) {
/* 311 */                                                       ii1OOii.I00000oIO(fileInputStream, th);
/* 314 */                                                       throw th2;
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                }
                                            } catch (Exception e) {
/* 349 */                                       Log.e("ChatImageStore", "Failed to load chat image", e);
                                            }
                                        } else {
/* 259 */                                   bitmapDecodeByteArray = null;
                                        }
/* 353 */                               if (bitmapDecodeByteArray != null) {
/* 355 */                                   arrayList2.add(bitmapDecodeByteArray);
                                        }
/* 360 */                               z2 = false;
                                    }
/* 366 */                           if (!arrayList2.isEmpty()) {
/* 376 */                               ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(arrayList2, 10));
/* 379 */                               Iterator it = arrayList2.iterator();
/* 387 */                               while (it.hasNext()) {
/* 400 */                                   arrayList3.add(new I0oO00o((Bitmap) it.next()));
                                        }
/* 421 */                               o11iO00I1o2.I0000oI00(o1oIOiI11o0, new IO1OoiOlOO(arrayList2, arrayList3, 0, IO1loo.I00iOIl, 116));
                                    }
                                }
/* 474 */                       z2 = false;
                            }
                        }
/* 477 */               o11iO00I1o2.I0001Ioi1lo = str72;
/* 479 */               if (list == null) {
/* 485 */                   ArrayList arrayList4 = new ArrayList();
/* 496 */                   for (Object obj2 : list) {
/* 503 */                       Message message2 = (Message) obj2;
/* 513 */                       if (O0000Ioio00.I0000O(message2.getRole(), "user") || O0000Ioio00.I0000O(message2.getRole(), "assistant")) {
/* 535 */                           if (!OlOoOIi0o.I001l0I00(message2.getContent())) {
/* 537 */                               arrayList4.add(obj2);
                                    }
                                }
                            }
/* 549 */                   arrayList = new ArrayList(IOOi1I.I0000O(arrayList4, 10));
/* 552 */                   Iterator it2 = arrayList4.iterator();
/* 560 */                   while (it2.hasNext()) {
/* 566 */                       Message message3 = (Message) it2.next();
/* 589 */                       arrayList.add(new OIoi0IIoi(Boolean.valueOf(O0000Ioio00.I0000O(message3.getRole(), "user")), message3.getContent()));
                            }
                        } else {
/* 593 */                   arrayList = Il01100l.I00iOIl;
                        }
/* 595 */               concurrentHashMap = o11iO00I1o2.I000O01llI0;
/* 597 */               str2 = o1oIOiI11o0.I00000oIO;
/* 599 */               context = o11iO00I1o2.I0000oI00;
/* 601 */               if ((context != null || context.getSharedPreferences("box_settings", 0).getBoolean("chat_restore_memory", true)) && !arrayList.isEmpty()) {
/* 635 */                   concurrentHashMap.put(str2, arrayList);
/* 644 */                   if (l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0) instanceof O1111lilIi0) {
/* 654 */                       i = 3;
/* 655 */                       str3 = null;
/* 660 */                       iOi1II01i0.I0000O(OooiooIOO.I00000oIO(o11iO00I1o2), IiiIil1lOIO.I00000oIO, null, new II1iIl0Ililo(o1oIOiI11o0, o11iO00I1o2, (IOoil1iiIilo) null, 3), 2);
                            }
/* 663 */                   this.I00iOIl = o11iO00I1o2;
/* 665 */                   this.I00iiI = str3;
/* 667 */                   this.I00iiO = i;
/* 675 */                   conversationById = o11iO00I1o2.I00100l0().I00000oIO.getConversationById(str72, this);
                        } else {
/* 631 */                   concurrentHashMap.remove(str2);
                        }
/* 622 */               i = 3;
/* 623 */               str3 = null;
/* 663 */               this.I00iOIl = o11iO00I1o2;
/* 665 */               this.I00iiI = str3;
/* 667 */               this.I00iiO = i;
/* 675 */               conversationById = o11iO00I1o2.I00100l0().I00000oIO.getConversationById(str72, this);
                    }
/* 122 */           Conversation conversation2 = (Conversation) objI00100o1O0lo;
/* 124 */           if (conversation2 != null) {
/* 126 */               id = conversation2.getId();
/* 98 */                String str82 = id;
/* 100 */               o11iO00I1o2 = o11iO00I1o;
/* 101 */               str = str82;
/* 133 */               if (str != null) {
                        }
                    }
/* 131 */           o11iO00I1o2 = o11iO00I1o;
/* 132 */           str = null;
/* 133 */           if (str != null) {
                    }
                }
            }
