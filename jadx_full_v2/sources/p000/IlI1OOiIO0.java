            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.ai.edge.gallery.data.local.dao.FaceDao;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            
            public final class IlI1OOiIO0 extends Oll0io implements IlliIl1l11O {
                public List I00iOIl;
                public List I00iiI;
                public IlI00iOi1 I00iiO;
                public IlI1loI1lO1 I00iio;
                public Collection I00ilI0I1;
                public Iterator I00ilO0;
                public Bitmap I00io1l;
                public float I00ioIO;
                public int I00l0I0l0lO1;
                public int I00l0OO0IO;
                public int I00li1OI;
                public int I00ll1;
                public Object I00lli11;
                public final IlI1loI1lO1 I00lll10;
                public final Context I00o0iI0io1;
                public final Uri I00o0l1o1o0;
                public final IlI00iOi1 I00o101lO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlI1OOiIO0(IlI1loI1lO1 ilI1loI1lO1, Context context, Uri uri, IlI00iOi1 ilI00iOi1, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00lll10 = ilI1loI1lO1;
/* 3 */             this.I00o0iI0io1 = context;
/* 5 */             this.I00o0l1o1o0 = uri;
/* 7 */             this.I00o101lO = ilI00iOi1;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            IlI1OOiIO0 ilI1OOiIO0 = new IlI1OOiIO0(this.I00lll10, this.I00o0iI0io1, this.I00o0l1o1o0, this.I00o101lO, iOoil1iiIilo);
/* 15 */            ilI1OOiIO0.I00lli11 = obj;
/* 37 */            return ilI1OOiIO0;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IlI1OOiIO0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Removed duplicated region for block: B:33:0x00d4 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:9:0x003e, B:45:0x0163, B:50:0x0187, B:39:0x0117, B:41:0x011d, B:52:0x0191, B:48:0x016b, B:16:0x0058, B:38:0x00f6, B:17:0x005f, B:31:0x00cc, B:33:0x00d4, B:35:0x00da, B:18:0x0067, B:24:0x00b5, B:26:0x00b9, B:28:0x00bf, B:21:0x009d), top: B:56:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00da A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:9:0x003e, B:45:0x0163, B:50:0x0187, B:39:0x0117, B:41:0x011d, B:52:0x0191, B:48:0x016b, B:16:0x0058, B:38:0x00f6, B:17:0x005f, B:31:0x00cc, B:33:0x00d4, B:35:0x00da, B:18:0x0067, B:24:0x00b5, B:26:0x00b9, B:28:0x00bf, B:21:0x009d), top: B:56:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x011d A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:9:0x003e, B:45:0x0163, B:50:0x0187, B:39:0x0117, B:41:0x011d, B:52:0x0191, B:48:0x016b, B:16:0x0058, B:38:0x00f6, B:17:0x005f, B:31:0x00cc, B:33:0x00d4, B:35:0x00da, B:18:0x0067, B:24:0x00b5, B:26:0x00b9, B:28:0x00bf, B:21:0x009d), top: B:56:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0167  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x016b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:9:0x003e, B:45:0x0163, B:50:0x0187, B:39:0x0117, B:41:0x011d, B:52:0x0191, B:48:0x016b, B:16:0x0058, B:38:0x00f6, B:17:0x005f, B:31:0x00cc, B:33:0x00d4, B:35:0x00da, B:18:0x0067, B:24:0x00b5, B:26:0x00b9, B:28:0x00bf, B:21:0x009d), top: B:56:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0187 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:9:0x003e, B:45:0x0163, B:50:0x0187, B:39:0x0117, B:41:0x011d, B:52:0x0191, B:48:0x016b, B:16:0x0058, B:38:0x00f6, B:17:0x005f, B:31:0x00cc, B:33:0x00d4, B:35:0x00da, B:18:0x0067, B:24:0x00b5, B:26:0x00b9, B:28:0x00bf, B:21:0x009d), top: B:56:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0191 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #0 {all -> 0x0047, blocks: (B:9:0x003e, B:45:0x0163, B:50:0x0187, B:39:0x0117, B:41:0x011d, B:52:0x0191, B:48:0x016b, B:16:0x0058, B:38:0x00f6, B:17:0x005f, B:31:0x00cc, B:33:0x00d4, B:35:0x00da, B:18:0x0067, B:24:0x00b5, B:26:0x00b9, B:28:0x00bf, B:21:0x009d), top: B:56:0x0016 }] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x015f -> B:45:0x0163). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objI0000oI00;
                    Object objI000II;
                    List list;
                    Object all;
                    IlI1loI1lO1 ilI1loI1lO1;
                    Iterator it;
                    IlI00iOi1 ilI00iOi1;
                    Collection collection;
                    int i;
                    List list2;
                    float f;
                    int i2;
                    int i3;
                    Ii0111o ii0111o;
                    OO0l00Ii10 oO0l00Ii10;
/* 1 */             IlI1OOiIO0 ilI1OOiIO0 = this;
/* 3 */             IlI1loI1lO1 ilI1loI1lO12 = ilI1OOiIO0.I00lll10;
/* 5 */             OlO0OIIl1 olO0OIIl1 = ilI1loI1lO12.I00000oOI;
/* 9 */             Ii0110 ii0110 = (Ii0110) ilI1OOiIO0.I00lli11;
/* 11 */            Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 13 */            int i4 = ilI1OOiIO0.I00ll1;
/* 15 */            Context context = ilI1OOiIO0.I00o0iI0io1;
/* 21 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    try {
/* 23 */                if (i4 == 0) {
/* 114 */                   lIoii1l01l0i.I00000oOI(obj);
/* 155 */                   olO0OIIl1.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl1.getValue(), null, true, null, null, null, Il01100l.I00iOIl, null, 0.0f, false, false, false, 2009));
/* 158 */                   Uri uri = ilI1OOiIO0.I00o0l1o1o0;
/* 160 */                   ilI1OOiIO0.I00lli11 = ii0110;
/* 162 */                   ilI1OOiIO0.I00ll1 = 1;
/* 164 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 174 */                   objI0000oI00 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new I1o0lo01(context, uri, null, 1), ilI1OOiIO0);
/* 178 */                   if (objI0000oI00 == ii0111o2) {
                            }
/* 351 */                   return ii0111o2;
                        }
/* 25 */                if (i4 == 1) {
/* 106 */                   lIoii1l01l0i.I00000oOI(obj);
/* 109 */                   objI0000oI00 = obj;
                        } else if (i4 == 2) {
/* 98 */                    lIoii1l01l0i.I00000oOI(obj);
/* 101 */                   objI000II = obj;
/* 205 */                   list = (List) objI000II;
/* 211 */                   if (!list.isEmpty()) {
/* 215 */                       ilI1loI1lO12.I000O01llI0("No faces found in that image");
/* 218 */                       return ooiIlOl1iI;
                            }
/* 225 */                   FaceDao faceDaoI001IO000 = BoxChatDatabase.I000l1.I000OiO(context).I001IO000();
/* 230 */                   ilI1OOiIO0.I00lli11 = null;
/* 235 */                   ilI1OOiIO0.I00iOIl = list;
/* 237 */                   ilI1OOiIO0.I00ll1 = 3;
/* 239 */                   all = faceDaoI001IO000.getAll(ilI1OOiIO0);
/* 243 */                   if (all == ii0111o2) {
/* 351 */                       return ii0111o2;
                            }
/* 255 */                   float f2 = ((IlI10IO) olO0OIIl1.getValue()).I000O01llI0;
/* 259 */                   IlI00iOi1 ilI00iOi12 = ilI1OOiIO0.I00o101lO;
/* 263 */                   ArrayList arrayList = new ArrayList();
/* 271 */                   ilI1loI1lO1 = ilI1loI1lO12;
/* 266 */                   it = list.iterator();
/* 273 */                   ilI00iOi1 = ilI00iOi12;
/* 274 */                   collection = arrayList;
/* 275 */                   i = 0;
/* 247 */                   list2 = (List) all;
/* 277 */                   f = f2;
/* 278 */                   i2 = 0;
/* 279 */                   i3 = 0;
/* 284 */                   if (!it.hasNext()) {
                            }
                        } else if (i4 == 3) {
/* 85 */                    list = ilI1OOiIO0.I00iOIl;
/* 89 */                    lIoii1l01l0i.I00000oOI(obj);
/* 92 */                    all = obj;
/* 255 */                   float f22 = ((IlI10IO) olO0OIIl1.getValue()).I000O01llI0;
/* 259 */                   IlI00iOi1 ilI00iOi122 = ilI1OOiIO0.I00o101lO;
/* 263 */                   ArrayList arrayList2 = new ArrayList();
/* 271 */                   ilI1loI1lO1 = ilI1loI1lO12;
/* 266 */                   it = list.iterator();
/* 273 */                   ilI00iOi1 = ilI00iOi122;
/* 274 */                   collection = arrayList2;
/* 275 */                   i = 0;
/* 247 */                   list2 = (List) all;
/* 277 */                   f = f22;
/* 278 */                   i2 = 0;
/* 279 */                   i3 = 0;
/* 284 */                   if (!it.hasNext()) {
                            }
                        } else {
/* 31 */                    if (i4 != 4) {
/* 79 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 75 */                        return null;
                            }
/* 33 */                    int i5 = ilI1OOiIO0.I00li1OI;
/* 35 */                    i2 = ilI1OOiIO0.I00l0OO0IO;
/* 37 */                    i3 = ilI1OOiIO0.I00l0I0l0lO1;
/* 39 */                    f = ilI1OOiIO0.I00ioIO;
/* 41 */                    Bitmap bitmap = ilI1OOiIO0.I00io1l;
/* 43 */                    it = ilI1OOiIO0.I00ilO0;
/* 45 */                    collection = ilI1OOiIO0.I00ilI0I1;
/* 49 */                    ilI1loI1lO1 = ilI1OOiIO0.I00iio;
/* 51 */                    ilI00iOi1 = ilI1OOiIO0.I00iiO;
/* 53 */                    list2 = ilI1OOiIO0.I00iiI;
/* 59 */                    List list3 = ilI1OOiIO0.I00iOIl;
/* 63 */                    lIoii1l01l0i.I00000oOI(obj);
/* 66 */                    int i6 = i5;
/* 68 */                    Object objI0000oI002 = obj;
/* 356 */                   float[] fArr = (float[]) objI0000oI002;
/* 358 */                   if (fArr != null) {
/* 360 */                       ii0111o = ii0111o2;
/* 362 */                       oO0l00Ii10 = null;
                            } else {
/* 364 */                       ilI1loI1lO1.getClass();
/* 367 */                       OIoi0IIoi oIoi0IIoiI0001Ioi1lo = IlI1loI1lO1.I0001Ioi1lo(fArr, list2, f);
/* 383 */                       ii0111o = ii0111o2;
/* 387 */                       oO0l00Ii10 = new OO0l00Ii10(bitmap, fArr, (String) oIoi0IIoiI0001Ioi1lo.I00iOIl, ((Number) oIoi0IIoiI0001Ioi1lo.I00iiI).floatValue());
                            }
/* 390 */                   if (oO0l00Ii10 != null) {
/* 392 */                       collection.add(oO0l00Ii10);
                            }
/* 395 */                   ilI1OOiIO0 = this;
/* 397 */                   i = i6;
/* 399 */                   ii0111o2 = ii0111o;
/* 284 */                   if (!it.hasNext()) {
/* 290 */                       bitmap = (Bitmap) it.next();
/* 293 */                       ilI1OOiIO0.I00lli11 = null;
/* 295 */                       ilI1OOiIO0.I00iOIl = null;
/* 300 */                       ilI1OOiIO0.I00iiI = list2;
/* 302 */                       ilI1OOiIO0.I00iiO = ilI00iOi1;
/* 304 */                       ilI1OOiIO0.I00iio = ilI1loI1lO1;
/* 309 */                       ilI1OOiIO0.I00ilI0I1 = collection;
/* 311 */                       ilI1OOiIO0.I00ilO0 = it;
/* 313 */                       ilI1OOiIO0.I00io1l = bitmap;
/* 315 */                       ilI1OOiIO0.I00ioIO = f;
/* 317 */                       ilI1OOiIO0.I00l0I0l0lO1 = i3;
/* 319 */                       ilI1OOiIO0.I00l0OO0IO = i2;
/* 321 */                       ilI1OOiIO0.I00li1OI = i;
/* 324 */                       ilI1OOiIO0.I00ll1 = 4;
/* 326 */                       ilI00iOi1.getClass();
/* 331 */                       i6 = i;
/* 335 */                       int i7 = i2;
/* 339 */                       int i8 = i3;
/* 345 */                       objI0000oI002 = iOi1II01i0.I0000oI00(IlI00iOi1.I00000oOI, new I1iIil1I(ilI00iOi1, bitmap, null, 20), ilI1OOiIO0);
/* 349 */                       if (objI0000oI002 != ii0111o2) {
/* 352 */                           i2 = i7;
/* 354 */                           i3 = i8;
/* 356 */                           float[] fArr2 = (float[]) objI0000oI002;
/* 358 */                           if (fArr2 != null) {
                                    }
/* 390 */                           if (oO0l00Ii10 != null) {
                                    }
/* 395 */                           ilI1OOiIO0 = this;
/* 397 */                           i = i6;
/* 399 */                           ii0111o2 = ii0111o;
/* 284 */                           if (!it.hasNext()) {
/* 441 */                               olO0OIIl1.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl1.getValue(), null, false, null, null, null, (List) collection, null, 0.0f, false, false, false, 2013));
/* 444 */                               return ooiIlOl1iI;
                                    }
                                }
/* 351 */                       return ii0111o2;
                            }
                        }
/* 182 */               Bitmap bitmap2 = (Bitmap) objI0000oI00;
/* 184 */               if (bitmap2 == null) {
/* 188 */                   ilI1loI1lO12.I000O01llI0("Couldn't read that image");
/* 191 */                   return ooiIlOl1iI;
                        }
/* 193 */               ilI1OOiIO0.I00lli11 = null;
/* 195 */               ilI1OOiIO0.I00ll1 = 2;
/* 197 */               objI000II = ilI1loI1lO12.I000II(bitmap2, ilI1OOiIO0);
/* 201 */               if (objI000II != ii0111o2) {
/* 205 */                   list = (List) objI000II;
/* 211 */                   if (!list.isEmpty()) {
                            }
                        }
/* 351 */               return ii0111o2;
                    } catch (Throwable th) {
/* 449 */               Log.e("FaceRecViewModel", "enroll-detect failed", th);
/* 470 */               ilI1loI1lO12.I000O01llI0("Detection failed: " + th.getMessage());
/* 1261 */              return ooiIlOl1iI;
                    }
                }
            }
