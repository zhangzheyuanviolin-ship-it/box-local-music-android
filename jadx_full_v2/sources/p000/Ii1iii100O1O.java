            package p000;

            import android.util.Log;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.jvm.functions.Function3;
            
/* 8 */     public final class Ii1iii100O1O extends Oll0io implements Function3 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1iii100O1O(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = obj;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 3;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 107 */                   Ii1iii100O1O ii1iii100O1O = new Ii1iii100O1O((Ii1l01l) this.I00iiO, (IOoil1iiIilo) obj3, 0);
/* 110 */                   ii1iii100O1O.I00iiI = (Throwable) obj2;
/* 112 */                   ii1iii100O1O.invokeSuspend(ooiIlOl1iI);
/* 115 */                   return ooiIlOl1iI;
                        case 1:
/* 85 */                    Ii1iii100O1O ii1iii100O1O2 = new Ii1iii100O1O((IoiIII) this.I00iiO, (IOoil1iiIilo) obj3, 1);
/* 88 */                    ii1iii100O1O2.I00iiI = (Throwable) obj2;
/* 90 */                    ii1iii100O1O2.invokeSuspend(ooiIlOl1iI);
/* 93 */                    return ooiIlOl1iI;
                        case 2:
/* 63 */                    Ii1iii100O1O ii1iii100O1O3 = new Ii1iii100O1O((Io0IOO01iIO1) this.I00iiO, (IOoil1iiIilo) obj3, 2);
/* 66 */                    ii1iii100O1O3.I00iiI = (Throwable) obj2;
/* 68 */                    ii1iii100O1O3.invokeSuspend(ooiIlOl1iI);
/* 71 */                    return ooiIlOl1iI;
                        case 3:
/* 41 */                    Ii1iii100O1O ii1iii100O1O4 = new Ii1iii100O1O((OoIlIoo1oiOo) this.I00iiO, (IOoil1iiIilo) obj3, i2);
/* 44 */                    ii1iii100O1O4.I00iiI = (Throwable) obj2;
/* 46 */                    ii1iii100O1O4.invokeSuspend(ooiIlOl1iI);
/* 49 */                    return ooiIlOl1iI;
                        default:
/* 17 */                    Ii1iii100O1O ii1iii100O1O5 = new Ii1iii100O1O(i2, (IOoil1iiIilo) obj3);
/* 20 */                    ii1iii100O1O5.I00iiI = (OiooOii1o) obj;
/* 22 */                    ii1iii100O1O5.I00iiO = (OI0ooi10l) obj2;
/* 24 */                    return ii1iii100O1O5.invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 3 */             int i = this.I00iOIl;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 509 */                   Throwable th = (Throwable) this.I00iiI;
/* 511 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 513 */                   lIoii1l01l0i.I00000oOI(obj);
/* 518 */                   Ii1l01l ii1l01l = (Ii1l01l) this.I00iiO;
/* 520 */                   int i2 = Ii1l01l.I00lll10;
/* 522 */                   ii1l01l.I00000oOI();
/* 525 */                   if (th == null || (th instanceof CancellationException)) {
/* 532 */                       return ooiIlOl1iI;
                            }
/* 542 */                   throw new OiIIoOll0Il(null, th, th.getMessage(), 1);
                        case 1:
/* 453 */                   Throwable th2 = (Throwable) this.I00iiI;
/* 455 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 457 */                   lIoii1l01l0i.I00000oOI(obj);
/* 464 */                   OlO0OIIl1 olO0OIIl1 = ((IoiIII) this.I00iiO).I00000oOI;
/* 471 */                   IoiII1lloI ioiII1lloI = (IoiII1lloI) olO0OIIl1.getValue();
/* 473 */                   String message = th2.getMessage();
/* 477 */                   if (message == null) {
/* 479 */                       message = "Generation failed";
                            }
/* 503 */                   olO0OIIl1.I000lI(null, IoiII1lloI.I00000oIO(ioiII1lloI, null, null, 0, 0.0f, null, false, 0, 0, null, message, false, 0.0f, false, 7647));
/* 506 */                   return ooiIlOl1iI;
                        case 2:
/* 421 */                   Throwable th3 = (Throwable) this.I00iiI;
/* 423 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 425 */                   lIoii1l01l0i.I00000oOI(obj);
/* 432 */                   Log.e("AGMAViewModel", "Failed to run inference", th3);
/* 437 */                   Io0IOO01iIO1 io0IOO01iIO1 = (Io0IOO01iIO1) this.I00iiO;
/* 439 */                   String message2 = th3.getMessage();
/* 443 */                   if (message2 == null) {
/* 445 */                       message2 = "Unknown error";
                            }
/* 447 */                   io0IOO01iIO1.invoke(message2);
/* 450 */                   return ooiIlOl1iI;
                        case 3:
/* 375 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 377 */                   lIoii1l01l0i.I00000oOI(obj);
/* 382 */                   Throwable th4 = (Throwable) this.I00iiI;
/* 388 */                   Log.e("PipePresenceSrc", "Error in camera ID flow collection.", th4);
/* 393 */                   OoIlIoo1oiOo ooIlIoo1oiOo = (OoIlIoo1oiOo) this.I00iiO;
/* 403 */                   if (((AtomicBoolean) ooIlIoo1oiOo.I00l0OO0IO).get()) {
/* 405 */                       ooIlIoo1oiOo.I000oI1ioi(null, th4);
                            } else {
/* 415 */                       iOi100.I00000oIO(Log.d("PipePresenceSrc", "Ignoring error because monitoring is stopped."));
                            }
/* 418 */                   return ooiIlOl1iI;
                        default:
/* 12 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    OiooOii1o oiooOii1o = (OiooOii1o) this.I00iiI;
/* 23 */                    OI0ooi10l oI0ooi10l = (OI0ooi10l) this.I00iiO;
/* 29 */                    Set setKeySet = oI0ooi10l.I00000oIO().keySet();
/* 43 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(setKeySet, 10));
/* 46 */                    Iterator it = setKeySet.iterator();
/* 54 */                    while (it.hasNext()) {
/* 64 */                        arrayList.add(((OOI0IO111Ii) it.next()).I00000oIO);
                            }
/* 70 */                    Map<String, ?> all = oiooOii1o.I00000oIO.getAll();
/* 76 */                    LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 91 */                    for (Map.Entry<String, ?> entry : all.entrySet()) {
/* 99 */                        String key = entry.getKey();
/* 105 */                       Set set = oiooOii1o.I00000oOI;
/* 115 */                       if (set != null ? set.contains(key) : true) {
/* 125 */                           linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
/* 139 */                   LinkedHashMap linkedHashMap2 = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(linkedHashMap.size()));
/* 156 */                   for (Map.Entry entry2 : linkedHashMap.entrySet()) {
/* 164 */                       Object key2 = entry2.getKey();
/* 168 */                       Object value = entry2.getValue();
/* 174 */                       if (value instanceof Set) {
/* 178 */                           value = IOOi0Ool1i.I00iio((Iterable) value);
                                }
/* 182 */                       linkedHashMap2.put(key2, value);
                            }
/* 188 */                   LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 203 */                   for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
/* 221 */                       if (!arrayList.contains((String) entry3.getKey())) {
/* 231 */                           linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                                }
                            }
/* 247 */                   OI0ooi10l oI0ooi10l2 = new OI0ooi10l(new LinkedHashMap(oI0ooi10l.I00000oIO()), false);
/* 262 */                   for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
/* 274 */                       String str = (String) entry4.getKey();
/* 276 */                       Object value2 = entry4.getValue();
/* 282 */                       if (value2 instanceof Boolean) {
/* 289 */                           oI0ooi10l2.I0000O(new OOI0IO111Ii(str), value2);
                                } else if (value2 instanceof Float) {
/* 302 */                           oI0ooi10l2.I0000O(new OOI0IO111Ii(str), value2);
                                } else if (value2 instanceof Integer) {
/* 315 */                           oI0ooi10l2.I0000O(new OOI0IO111Ii(str), value2);
                                } else if (value2 instanceof Long) {
/* 328 */                           oI0ooi10l2.I0000O(new OOI0IO111Ii(str), value2);
                                } else if (value2 instanceof String) {
/* 341 */                           oI0ooi10l2.I0000O(new OOI0IO111Ii(str), value2);
                                } else if (value2 instanceof Set) {
/* 356 */                           oI0ooi10l2.I0000O(new OOI0IO111Ii(str), (Set) value2);
                                }
                            }
/* 371 */                   return new OI0ooi10l(new LinkedHashMap(oI0ooi10l2.I00000oIO()), true);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public Ii1iii100O1O(int i, IOoil1iiIilo iOoil1iiIilo) {
                    super(i, iOoil1iiIilo);
/* 10 */            this.I00iOIl = 4;
                }
            }
