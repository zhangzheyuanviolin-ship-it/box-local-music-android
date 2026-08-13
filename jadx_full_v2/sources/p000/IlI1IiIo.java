            package p000;

            import android.content.Context;
            import android.graphics.BitmapFactory;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.ai.edge.gallery.data.local.dao.FaceDao;
            import com.google.ai.edge.gallery.data.local.entities.FaceRecord;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public final class IlI1IiIo extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final IlI1loI1lO1 I00iiO;
                public final Context I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlI1IiIo(IlI1loI1lO1 ilI1loI1lO1, Context context, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = ilI1loI1lO1;
/* 5 */             this.I00iio = context;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Context context = this.I00iio;
/* 5 */             IlI1loI1lO1 ilI1loI1lO1 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 20 */                    return new IlI1IiIo(ilI1loI1lO1, context, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new IlI1IiIo(ilI1loI1lO1, context, iOoil1iiIilo, 1);
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
/* 18 */            return ((IlI1IiIo) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object all;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             i1O01oOIoI0I i1o01ooioi0i = BoxChatDatabase.I000l1;
/* 9 */             Context context = this.I00iio;
/* 14 */            IlI1loI1lO1 ilI1loI1lO1 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 278 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 280 */                   int i2 = this.I00iiI;
/* 282 */                   if (i2 == 0) {
/* 295 */                       lIoii1l01l0i.I00000oOI(obj);
/* 302 */                       FaceDao faceDaoI001IO000 = i1o01ooioi0i.I000OiO(context).I001IO000();
/* 306 */                       this.I00iiI = 1;
/* 312 */                       if (faceDaoI001IO000.deleteAll(this) == ii0111o) {
                                    break;
                                }
                            } else if (i2 != 1) {
/* 290 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 286 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 316 */                   ilI1loI1lO1.I000OiO(context);
/* 319 */                   OlO0OIIl1 olO0OIIl1 = ilI1loI1lO1.I00000oOI;
/* 352 */                   olO0OIIl1.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl1.getValue(), null, false, null, "All saved faces cleared", Il01100l.I00iOIl, null, null, 0.0f, false, false, false, 2023));
                            break;
                        default:
/* 20 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 22 */                    int i3 = this.I00iiI;
                            try {
/* 24 */                        if (i3 == 0) {
/* 43 */                            lIoii1l01l0i.I00000oOI(obj);
/* 50 */                            FaceDao faceDaoI001IO0002 = i1o01ooioi0i.I000OiO(context).I001IO000();
/* 54 */                            this.I00iiI = 1;
/* 56 */                            all = faceDaoI001IO0002.getAll(this);
/* 60 */                            if (all == ii0111o2) {
                                        break;
                                    }
                                } else if (i3 != 1) {
/* 37 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
/* 28 */                            lIoii1l01l0i.I00000oOI(obj);
/* 31 */                            all = obj;
                                }
/* 71 */                        LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 82 */                        for (Object obj2 : (List) all) {
/* 91 */                            String name = ((FaceRecord) obj2).getName();
/* 95 */                            Object arrayList = linkedHashMap.get(name);
/* 99 */                            if (arrayList == null) {
/* 103 */                               arrayList = new ArrayList();
/* 106 */                               linkedHashMap.put(name, arrayList);
                                    }
/* 111 */                           ((List) arrayList).add(obj2);
                                }
/* 121 */                       ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
/* 136 */                       for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 148 */                           String str = (String) entry.getKey();
/* 154 */                           List list = (List) entry.getValue();
/* 157 */                           List<FaceRecord> list2 = list;
/* 167 */                           ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 178 */                           for (FaceRecord faceRecord : list2) {
/* 200 */                               arrayList3.add(BitmapFactory.decodeByteArray(faceRecord.getThumbnail(), 0, faceRecord.getThumbnail().length));
                                    }
/* 204 */                           int size = list.size();
/* 210 */                           Il0Oo11iiO il0Oo11iiO = new Il0Oo11iiO();
/* 213 */                           il0Oo11iiO.I00000oIO = str;
/* 215 */                           il0Oo11iiO.I00000oOI = arrayList3;
/* 217 */                           il0Oo11iiO.I0000Il00O = size;
/* 219 */                           VarHandle.storeStoreFence();
/* 222 */                           arrayList2.add(il0Oo11iiO);
                                }
/* 233 */                       List listI00Ol1ll1 = IOOi0Ool1i.I00Ol1ll1(arrayList2, new IliIiio1(17));
/* 237 */                       OlO0OIIl1 olO0OIIl12 = ilI1loI1lO1.I00000oOI;
/* 266 */                       olO0OIIl12.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl12.getValue(), null, false, null, null, null, null, listI00Ol1ll1, 0.0f, false, false, false, 1983));
                                break;
                            } catch (Throwable th) {
/* 274 */                       Log.e("FaceRecViewModel", "load enrolled failed", th);
/* 277 */                       return ooiIlOl1iI;
                            }
                    }
/* 277 */           return ooiIlOl1iI;
                }
            }
