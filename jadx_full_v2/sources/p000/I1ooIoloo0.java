            package p000;

            import android.view.KeyEvent;
            import com.google.ai.edge.gallery.data.RuntimeType;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.data.local.entities.Message;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            import kotlin.jvm.functions.Function1;
            
/* 12 */    public class I1ooIoloo0 implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public I1ooIoloo0(O1I0OloI o1I0OloI, ConcurrentHashMap concurrentHashMap, Function1 function1) {
/* 2 */             this.I00iOIl = 3;
/* 7 */             this.I00iiI = o1I0OloI;
/* 9 */             this.I00iiO = concurrentHashMap;
/* 11 */            this.I00iio = function1;
                }

                public static void I00000oIO(int i) {
/* 10 */            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 20 */            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
/* 26 */            if (i == 1) {
/* 49 */                objArr[0] = "map";
                    } else if (i == 2) {
/* 44 */                objArr[0] = "compute";
                    } else if (i == 3 || i == 4) {
/* 39 */                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                    } else {
/* 36 */                objArr[0] = "storageManager";
                    }
/* 51 */            if (i == 3) {
/* 65 */                objArr[1] = "recursionDetected";
                    } else if (i != 4) {
/* 55 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                    } else {
/* 60 */                objArr[1] = "raceCondition";
                    }
/* 67 */            if (i != 3 && i != 4) {
/* 73 */                objArr[2] = "<init>";
                    }
/* 75 */            String str2 = String.format(str, objArr);
/* 79 */            if (i != 3 && i != 4) {
/* 168 */               throw new IllegalArgumentException(str2);
                    }
/* 168 */           throw new IllegalStateException(str2);
                }

                public AssertionError I0000O(Object obj, Object obj2) {
/* 47 */            AssertionError assertionError = new AssertionError("Inconsistent key detected. " + O1I0IoIO0li.I00iiI + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((O1I0OloI) this.I00iiI));
/* 50 */            O1I0OloI.I0000oI00(assertionError);
/* 106 */           return assertionError;
                }

                public AssertionError I0000oI00(Object obj, Object obj2) {
/* 37 */            AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((O1I0OloI) this.I00iiI));
/* 40 */            O1I0OloI.I0000oI00(assertionError);
/* 106 */           return assertionError;
                }

                public AssertionError I0001Ioi1lo(Object obj, Throwable th) {
/* 29 */            AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((O1I0OloI) this.I00iiI), th);
/* 32 */            O1I0OloI.I0000oI00(assertionError);
/* 37 */            return assertionError;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:53:0x015f A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:38:0x0137, B:41:0x0142, B:43:0x0148, B:45:0x014c, B:50:0x0157, B:51:0x015c, B:53:0x015f, B:55:0x0165, B:57:0x0169, B:58:0x016c, B:59:0x0171, B:61:0x0174, B:79:0x01a0, B:83:0x01ac, B:84:0x01b0, B:85:0x01b1, B:86:0x01b3, B:91:0x01bc, B:93:0x01cc, B:94:0x01d0, B:95:0x01d1, B:96:0x01d4, B:98:0x01d8, B:99:0x01db, B:101:0x01dd, B:102:0x01e1, B:88:0x01b5, B:89:0x01b9, B:81:0x01a6, B:97:0x01d5), top: B:143:0x0137, inners: #1, #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0172  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object invoke(Object obj) throws Throwable {
                    O1oIOiI11o0 o1oIOiI11o0I001IIilI0O;
                    AssertionError assertionErrorI0000oI00;
                    AssertionError assertionErrorI0001Ioi1lo;
                    AssertionError assertionErrorI0001Ioi1lo2;
                    Object obj2;
/* 5 */             int i = this.I00iOIl;
/* 7 */             int i2 = 10;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 777 */                   KeyEvent keyEvent = ((O0O1l0ilO) obj).I00000oIO;
/* 781 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 785 */                   Oo1o1iil oo1o1iil = (Oo1o1iil) this.I00iiI;
/* 791 */                   if (!oo1o1iil.I00000oOI()) {
/* 795 */                       oI10i0Il.setValue(Boolean.FALSE);
                            } else if (l0iloO.I00000oOI(keyEvent) == 2 && O0O11OI0i.I00000oIO(l0lIloi.I00000oIO(keyEvent.getKeyCode()), O0O11OI0i.I001IIilI0O)) {
/* 828 */                       ((OI10i0Il) this.I00iio).setValue(Boolean.FALSE);
/* 831 */                       oo1o1iil.I00000oIO();
/* 834 */                       return Boolean.TRUE;
                            }
/* 837 */                   return Boolean.FALSE;
                        case 1:
/* 544 */                   Conversation conversation = (Conversation) obj;
/* 553 */                   O1oIOiI11o0 o1oIOiI11o0 = null;
/* 563 */                   List<Message> list = (List) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new IO1O10IIi((IO1OIo01l1) this.I00iiI, conversation, 0 == true ? 1 : 0, 0));
/* 575 */                   ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 586 */                   for (Message message : list) {
/* 629 */                       arrayList.add(new IO1iI1i(message.getContent(), O0000Ioio00.I0000O(message.getRole(), "user") ? IO1loo.I00iOIl : IO1loo.I00iiI, message.getLatencyMs(), null, false, 248));
                            }
/* 641 */                   if (conversation.getModelName().length() > 0) {
/* 643 */                       String modelName = conversation.getModelName();
/* 647 */                       RuntimeType runtimeType = RuntimeType.LITERT_LM;
/* 657 */                       Il01100l il01100l = Il01100l.I00iOIl;
/* 706 */                       o1oIOiI11o0 = new O1oIOiI11o0(modelName, null, il01100l, null, null, null, "", 0L, "", null, null, true, null, null, runtimeType, null, false, false, false, false, false, false, false, false, null, null, 0, il01100l, null, 1886612598, 2042);
                            }
/* 710 */                   if (o1oIOiI11o0 != null) {
/* 712 */                       String str = o1oIOiI11o0.I00000oIO;
/* 716 */                       O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiO;
/* 720 */                       OI1o1o1iO1l oI1o1o1iO1l = (OI1o1o1iO1l) this.I00iio;
/* 722 */                       if (o1ol100o0O != null && (o1oIOiI11o0I001IIilI0O = o1ol100o0O.I001IIilI0O(str)) != null) {
/* 730 */                           o1ol100o0O.I00IlilI0i0i(o1oIOiI11o0I001IIilI0O);
/* 735 */                           Ii0ioo10iO0 ii0ioo10iO0I00111O = o1ol100o0O.I00111O("llm_chat");
/* 739 */                           if (ii0ioo10iO0I00111O != null && oI1o1o1iO1l != null) {
/* 747 */                               String str2 = ii0ioo10iO0I00111O.I00000oOI().I00000oIO;
/* 749 */                               String id = conversation.getId();
/* 759 */                               StringBuilder sbI00111O = IIl001iO0Io.I00111O("route_model/", str2, "/", str, "?conversationId=");
/* 763 */                               sbI00111O.append(id);
/* 770 */                               OI1o1o1iO1l.I0000Il00O(oI1o1o1iO1l, sbI00111O.toString());
                                    }
                                }
                            }
/* 773 */                   return ooiIlOl1iI;
                        case 2:
/* 488 */                   OoIOloiIii ooIOloiIii = (OoIOloiIii) obj;
/* 491 */                   IilI0O iilI0O = (IilI0O) ooIOloiIii;
/* 515 */                   if (!((I0o11ooo00l1) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O((IilI0O) this.I00iiO)).m27getDragAndDropManager()).I00000oOI.contains(iilI0O) || !il1llll.I00000oIO(iilI0O, il1loioIiio.I00000oIO((I0IIiO0iI) this.I00iio))) {
/* 540 */                       return OoIOloOIOI1l.I00iOIl;
                            }
/* 535 */                   ((OOo0ooi) this.I00iiI).I00iOIl = ooIOloiIii;
/* 537 */                   return OoIOloOIOI1l.I00iiO;
                        case 3:
/* 276 */                   O1I0OloI o1I0OloI = (O1I0OloI) this.I00iiI;
/* 278 */                   iolOOiI iolooii = o1I0OloI.I00000oOI;
/* 280 */                   Ol0IlIoIIIoO ol0IlIoIIIoO = o1I0OloI.I00000oIO;
/* 284 */                   ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.I00iiO;
/* 286 */                   Object obj3 = concurrentHashMap.get(obj);
/* 290 */                   Object obj4 = i01l0l.I00000oIO;
/* 292 */                   O1I0IoIO0li o1I0IoIO0li = O1I0IoIO0li.I00iiI;
/* 294 */                   if (obj3 != null && obj3 != o1I0IoIO0li) {
/* 298 */                       i01l0l.I00000oIO(obj3);
/* 301 */                       if (obj3 == obj4) {
/* 303 */                           return null;
                                }
/* 306 */                       return obj3;
                            }
/* 309 */                   ol0IlIoIIIoO.lock();
                            try {
/* 312 */                       Object obj5 = concurrentHashMap.get(obj);
/* 319 */                       O1I0IoIO0li o1I0IoIO0li2 = O1I0IoIO0li.I00iiO;
/* 321 */                       if (obj5 == o1I0IoIO0li) {
/* 323 */                           IIOo1i iIOo1iI0000O = o1I0OloI.I0000O("", obj);
/* 327 */                           if (iIOo1iI0000O == null) {
/* 344 */                               I00000oIO(3);
/* 349 */                               throw null;
                                    }
/* 331 */                           if (iIOo1iI0000O.I00000oOI) {
/* 342 */                               obj5 = o1I0IoIO0li2;
/* 350 */                               if (obj5 == o1I0IoIO0li2) {
                                        }
                                    } else {
/* 333 */                               obj2 = iIOo1iI0000O.I0000Il00O;
                                    }
                                } else if (obj5 == o1I0IoIO0li2) {
/* 352 */                           IIOo1i iIOo1iI0000O2 = o1I0OloI.I0000O("", obj);
/* 356 */                           if (iIOo1iI0000O2 == null) {
/* 365 */                               I00000oIO(3);
/* 370 */                               throw null;
                                    }
/* 360 */                           if (!iIOo1iI0000O2.I00000oOI) {
/* 362 */                               obj2 = iIOo1iI0000O2.I0000Il00O;
                                    }
                                } else if (obj5 != null) {
/* 373 */                           i01l0l.I00000oIO(obj5);
/* 380 */                           obj2 = obj5 == obj4 ? null : obj5;
                                } else {
                                    try {
/* 382 */                               concurrentHashMap.put(obj, o1I0IoIO0li);
/* 389 */                               Object objInvoke = ((Function1) this.I00iio).invoke(obj);
/* 393 */                               if (objInvoke != null) {
/* 396 */                                   obj4 = objInvoke;
                                        }
/* 397 */                               Object objPut = concurrentHashMap.put(obj, obj4);
/* 401 */                               if (objPut == o1I0IoIO0li) {
/* 406 */                                   return objInvoke;
                                        }
/* 408 */                               assertionErrorI0000oI00 = I0000oI00(obj, objPut);
                                        try {
/* 412 */                                   throw assertionErrorI0000oI00;
                                        } catch (Throwable th) {
/* 413 */                                   th = th;
/* 421 */                                   if (ilIiIlIII0.I00000oIO(th)) {
                                                try {
/* 423 */                                           Object objRemove = concurrentHashMap.remove(obj);
/* 427 */                                           if (objRemove != o1I0IoIO0li) {
/* 433 */                                               throw I0000O(obj, objRemove);
                                                    }
/* 436 */                                           throw th;
                                                } finally {
                                                }
                                            }
/* 443 */                                   if (th == assertionErrorI0000oI00) {
                                                try {
/* 470 */                                           concurrentHashMap.remove(obj);
/* 473 */                                           iolooii.getClass();
/* 476 */                                           throw th;
                                                } finally {
                                                }
                                            }
/* 447 */                                   i01l0iOIii i01l0ioiii = new i01l0iOIii();
/* 450 */                                   i01l0ioiii.I00000oIO = th;
/* 452 */                                   VarHandle.storeStoreFence();
/* 455 */                                   Object objPut2 = concurrentHashMap.put(obj, i01l0ioiii);
/* 459 */                                   if (objPut2 != o1I0IoIO0li) {
/* 465 */                                       throw I0000oI00(obj, objPut2);
                                            }
/* 466 */                                   iolooii.getClass();
/* 469 */                                   throw th;
/* 483 */                                   ol0IlIoIIIoO.unlock();
                                        }
                                    } catch (Throwable th2) {
/* 415 */                               th = th2;
/* 416 */                               assertionErrorI0000oI00 = null;
                                    }
                                }
/* 407 */                       return obj2;
                            } finally {
/* 483 */                       ol0IlIoIIIoO.unlock();
                            }
                        case 4:
/* 69 */                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 76 */                    O1i1O1I o1i1O1I = (O1i1O1I) this.I00iiI;
/* 82 */                    String strI001i1O0Ol = ((O1i1OolO) this.I00iiO).I001i1O0Ol();
/* 90 */                    String strI001IO000 = ((O1iI0OiI) this.I00iio).I001IO000();
/* 94 */                    OlO0OIIl1 olO0OIIl1 = o1i1O1I.I0000O;
                            while (true) {
/* 96 */                        Object value = olO0OIIl1.getValue();
/* 101 */                       O1i1IIoO1IIl o1i1IIoO1IIl = (O1i1IIoO1IIl) value;
/* 103 */                       List<O1i1Ooo0ll> list2 = o1i1IIoO1IIl.I00000oIO;
/* 113 */                       ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list2, i2));
/* 124 */                       for (O1i1Ooo0ll o1i1Ooo0ll : list2) {
/* 132 */                           O1i1OolO o1i1OolO = o1i1Ooo0ll.I00000oIO;
/* 142 */                           if (O0000Ioio00.I0000O(o1i1OolO.I001i1O0Ol(), strI001i1O0Ol)) {
/* 144 */                               Iool1IOO1o0i<O1iI0OiI> iool1IOO1o0iI001IO000 = o1i1OolO.I001IO000();
/* 154 */                               ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(iool1IOO1o0iI001IO000, i2));
/* 165 */                               for (O1iI0OiI o1iI0OiI : iool1IOO1o0iI001IO000) {
/* 181 */                                   if (O0000Ioio00.I0000O(o1iI0OiI.I001IO000(), strI001IO000)) {
/* 187 */                                       O1i1oiOO0O o1i1oiOO0O = (O1i1oiOO0O) o1iI0OiI.I00100o1O0lo();
/* 189 */                                       o1i1oiOO0O.I0000O();
/* 196 */                                       ((O1iI0OiI) o1i1oiOO0O.I00iiI).I001l0I00(zBooleanValue);
/* 204 */                                       o1iI0OiI = (O1iI0OiI) o1i1oiOO0O.I00000oOI();
                                            }
/* 206 */                                   arrayList3.add(o1iI0OiI);
                                        }
/* 216 */                               O1i1OO0O10Io o1i1OO0O10Io = (O1i1OO0O10Io) o1i1OolO.I00100o1O0lo();
/* 218 */                               o1i1OO0O10Io.I0000O();
/* 225 */                               ((O1i1OolO) o1i1OO0O10Io.I00iiI).I0010o();
/* 228 */                               o1i1OO0O10Io.I000II(arrayList3);
/* 243 */                               o1i1Ooo0ll = new O1i1Ooo0ll((O1i1OolO) o1i1OO0O10Io.I00000oOI(), o1i1Ooo0ll.I00000oOI, o1i1Ooo0ll.I0000Il00O);
                                    }
/* 246 */                           arrayList2.add(o1i1Ooo0ll);
/* 249 */                           i2 = 10;
                                }
/* 253 */                       o1i1O1I.I000OiO(arrayList2);
/* 267 */                       if (olO0OIIl1.I000iOII(value, O1i1IIoO1IIl.I00000oIO(o1i1IIoO1IIl, arrayList2, false, null, 6))) {
/* 269 */                           return ooiIlOl1iI;
                                }
/* 270 */                       i2 = 10;
                            }
                        default:
/* 17 */                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
/* 23 */                    Ol0oI1llIloI ol0oI1llIloI = (Ol0oI1llIloI) this.I00iio;
/* 27 */                    Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00iiI;
/* 29 */                    Ol0ioI1iI ol0ioI1iI = ol0oI1llIloI.I00000oIO;
/* 31 */                    if (zBooleanValue2) {
/* 37 */                        ol1o0O0O0.add(ol0ioI1iI.I001i1O0Ol());
                            } else {
/* 45 */                        ol1o0O0O0.remove(ol0ioI1iI.I001i1O0Ol());
/* 52 */                        if (ol1o0O0O0.isEmpty()) {
/* 56 */                            OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 58 */                            List list3 = Ol0lllilO0Ol.I00000oIO;
/* 62 */                            oI10i0Il2.setValue(Boolean.FALSE);
                                }
                            }
/* 65 */                    return ooiIlOl1iI;
                    }
                }

/* 13 */        public I1ooIoloo0(int i) {
/* 14 */            this.I00iOIl = i;
                }
            }
