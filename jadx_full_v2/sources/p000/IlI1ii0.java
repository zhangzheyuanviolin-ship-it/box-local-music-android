            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.Rect;
            import android.util.Log;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.face.Face;
            import com.google.mlkit.vision.face.FaceDetector;
            import com.google.mlkit.vision.facemesh.FaceMesh;
            import com.google.mlkit.vision.facemesh.FaceMeshDetector;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            
            public final class IlI1ii0 extends Oll0io implements IlliIl1l11O {
                public IlI00iOi1 I00iOIl;
                public List I00iiI;
                public List I00iiO;
                public List I00iio;
                public IlI1loI1lO1 I00ilI0I1;
                public Bitmap I00ilO0;
                public Collection I00io1l;
                public Iterator I00ioIO;
                public Face I00l0I0l0lO1;
                public Collection I00l0OO0IO;
                public float I00li1OI;
                public int I00ll1;
                public int I00lli11;
                public int I00lll10;
                public final O1oIOiI11o0 I00o0iI0io1;
                public final Bitmap I00o0l1o1o0;
                public final IlI1loI1lO1 I00o101lO;
                public final Context I00oI0i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlI1ii0(O1oIOiI11o0 o1oIOiI11o0, Bitmap bitmap, IlI1loI1lO1 ilI1loI1lO1, Context context, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00o0iI0io1 = o1oIOiI11o0;
/* 3 */             this.I00o0l1o1o0 = bitmap;
/* 5 */             this.I00o101lO = ilI1loI1lO1;
/* 7 */             this.I00oI0i = context;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            return new IlI1ii0(this.I00o0iI0io1, this.I00o0l1o1o0, this.I00o101lO, this.I00oI0i, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IlI1ii0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0128 A[Catch: all -> 0x0077, TryCatch #3 {all -> 0x0077, blocks: (B:91:0x02a4, B:89:0x0287, B:16:0x0067, B:53:0x0186, B:57:0x01a4, B:58:0x01ac, B:60:0x01b2, B:67:0x01ed, B:71:0x01f9, B:45:0x0122, B:47:0x0128, B:49:0x0139, B:72:0x0212, B:21:0x0082, B:44:0x00ff, B:24:0x008d, B:36:0x00d1, B:38:0x00d9, B:40:0x00e7, B:33:0x00b4), top: B:101:0x0015 }] */
                /* JADX WARN: Removed duplicated region for block: B:57:0x01a4 A[Catch: all -> 0x0077, TryCatch #3 {all -> 0x0077, blocks: (B:91:0x02a4, B:89:0x0287, B:16:0x0067, B:53:0x0186, B:57:0x01a4, B:58:0x01ac, B:60:0x01b2, B:67:0x01ed, B:71:0x01f9, B:45:0x0122, B:47:0x0128, B:49:0x0139, B:72:0x0212, B:21:0x0082, B:44:0x00ff, B:24:0x008d, B:36:0x00d1, B:38:0x00d9, B:40:0x00e7, B:33:0x00b4), top: B:101:0x0015 }] */
                /* JADX WARN: Removed duplicated region for block: B:66:0x01e7  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x01f7  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x01f8  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x0212 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #3 {all -> 0x0077, blocks: (B:91:0x02a4, B:89:0x0287, B:16:0x0067, B:53:0x0186, B:57:0x01a4, B:58:0x01ac, B:60:0x01b2, B:67:0x01ed, B:71:0x01f9, B:45:0x0122, B:47:0x0128, B:49:0x0139, B:72:0x0212, B:21:0x0082, B:44:0x00ff, B:24:0x008d, B:36:0x00d1, B:38:0x00d9, B:40:0x00e7, B:33:0x00b4), top: B:101:0x0015 }] */
                /* JADX WARN: Removed duplicated region for block: B:81:0x026e A[Catch: all -> 0x0280, LOOP:0: B:79:0x0268->B:81:0x026e, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0280, blocks: (B:78:0x0257, B:79:0x0268, B:81:0x026e), top: B:95:0x0257 }] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x017f -> B:53:0x0186). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0193 -> B:55:0x01a0). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OlO0OIIl1 olO0OIIl1;
                    IlI00iOi1 ilI00iOi1;
                    Object objI00000oIO;
                    Object objI000OOo1O;
                    IlI00iOi1 ilI00iOi12;
                    List list;
                    IlI1loI1lO1 ilI1loI1lO1;
                    float f;
                    Collection arrayList;
                    Bitmap bitmap;
                    int i;
                    Iterator it;
                    List list2;
                    int i2;
                    Il01100l il01100l;
                    List list3;
                    List list4;
                    Object objI00000oIO2;
                    Il01100l il01100l2;
                    List list5;
                    float f2;
                    String str;
                    Iterator it2;
/* 3 */             IlI1loI1lO1 ilI1loI1lO12 = this.I00o101lO;
/* 5 */             OlO0OIIl1 olO0OIIl12 = ilI1loI1lO12.I00000oOI;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i3 = this.I00lll10;
/* 17 */            Il01100l il01100l3 = Il01100l.I00iOIl;
/* 19 */            Bitmap bitmap2 = this.I00o0l1o1o0;
                    try {
/* 22 */                if (i3 == 0) {
/* 148 */                   olO0OIIl1 = olO0OIIl12;
/* 150 */                   lIoii1l01l0i.I00000oOI(obj);
/* 155 */                   Object obj2 = this.I00o0iI0io1.I00IlilI0i0i;
/* 164 */                   ilI00iOi1 = obj2 instanceof IlI00iOi1 ? (IlI00iOi1) obj2 : null;
/* 165 */                   if (ilI00iOi1 == null) {
/* 177 */                       return new O110ooO1O(bitmap2.getWidth(), bitmap2.getHeight());
                            }
/* 194 */                   OloIIoII1oo oloIIoII1ooProcess = ((FaceDetector) ilI1loI1lO12.I0000O.getValue()).process(InputImage.fromBitmap(bitmap2, 0));
/* 198 */                   this.I00iOIl = ilI00iOi1;
/* 200 */                   this.I00lll10 = 1;
/* 202 */                   objI00000oIO = lOio0oO.I00000oIO(oloIIoII1ooProcess, this);
/* 206 */                   if (objI00000oIO == ii0111o) {
                            }
/* 598 */                   return ii0111o;
                        }
/* 24 */                if (i3 != 1) {
/* 26 */                    if (i3 == 2) {
/* 123 */                       olO0OIIl1 = olO0OIIl12;
/* 125 */                       list = this.I00iiI;
/* 129 */                       ilI00iOi12 = this.I00iOIl;
/* 131 */                       lIoii1l01l0i.I00000oOI(obj);
/* 134 */                       objI000OOo1O = obj;
/* 266 */                       List list6 = list;
/* 283 */                       ilI1loI1lO1 = ilI1loI1lO12;
/* 264 */                       f = ((IlI10IO) olO0OIIl1.getValue()).I000O01llI0;
/* 276 */                       arrayList = new ArrayList(IOOi1I.I0000O(list6, 10));
/* 286 */                       bitmap = bitmap2;
/* 287 */                       i = 0;
/* 279 */                       it = list6.iterator();
/* 256 */                       list2 = (List) objI000OOo1O;
/* 290 */                       i2 = 0;
/* 295 */                       if (it.hasNext()) {
                                }
/* 598 */                       return ii0111o;
                            }
/* 28 */                    if (i3 != 3) {
/* 30 */                        if (i3 != 4) {
/* 60 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 21 */                            return null;
                                }
/* 32 */                        list4 = this.I00iio;
/* 36 */                        List list7 = this.I00iiO;
/* 40 */                        List list8 = this.I00iiI;
                                try {
/* 44 */                            lIoii1l01l0i.I00000oOI(obj);
/* 47 */                            objI00000oIO2 = obj;
/* 49 */                            il01100l = il01100l3;
                                    try {
/* 600 */                               Iterable iterable = (Iterable) objI00000oIO2;
/* 610 */                               ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(iterable, 10));
/* 613 */                               it2 = iterable.iterator();
/* 621 */                               while (it2.hasNext()) {
/* 637 */                                   arrayList2.add(ilO1io0.I00000oIO(((FaceMesh) it2.next()).getAllPoints()));
                                        }
/* 643 */                               il01100l2 = arrayList2;
                                    } catch (Throwable th) {
/* 641 */                               th = th;
/* 669 */                               Log.e("FaceRecViewModel", "mesh detect failed: " + th.getMessage());
/* 672 */                               il01100l2 = il01100l;
/* 644 */                               list3 = list4;
/* 687 */                               return new O110ooO1O(bitmap2.getWidth(), bitmap2.getHeight(), list3, il01100l2);
                                    }
                                } catch (Throwable th2) {
/* 53 */                            th = th2;
/* 54 */                            il01100l = il01100l3;
/* 669 */                           Log.e("FaceRecViewModel", "mesh detect failed: " + th.getMessage());
/* 672 */                           il01100l2 = il01100l;
/* 644 */                           list3 = list4;
/* 687 */                           return new O110ooO1O(bitmap2.getWidth(), bitmap2.getHeight(), list3, il01100l2);
                                }
/* 644 */                       list3 = list4;
/* 687 */                       return new O110ooO1O(bitmap2.getWidth(), bitmap2.getHeight(), list3, il01100l2);
                            }
/* 64 */                    int i4 = this.I00lli11;
/* 66 */                    i = this.I00ll1;
/* 68 */                    f = this.I00li1OI;
/* 70 */                    arrayList = this.I00l0OO0IO;
/* 74 */                    Face face = this.I00l0I0l0lO1;
/* 76 */                    it = this.I00ioIO;
/* 78 */                    Collection collection = this.I00io1l;
/* 82 */                    Bitmap bitmap3 = this.I00ilO0;
/* 84 */                    ilI1loI1lO1 = this.I00ilI0I1;
/* 86 */                    olO0OIIl1 = olO0OIIl12;
/* 88 */                    List list9 = this.I00iio;
/* 92 */                    List list10 = this.I00iiO;
/* 98 */                    List list11 = this.I00iiI;
/* 102 */                   IlI00iOi1 ilI00iOi13 = this.I00iOIl;
/* 104 */                   lIoii1l01l0i.I00000oOI(obj);
/* 107 */                   int i5 = i4;
/* 109 */                   Bitmap bitmap4 = bitmap3;
/* 111 */                   List list12 = list10;
/* 113 */                   IlI00iOi1 ilI00iOi14 = ilI00iOi13;
/* 114 */                   Il01100l il01100l4 = il01100l3;
/* 116 */                   Object objI0000oI00 = obj;
/* 392 */                   float[] fArr = (float[]) objI0000oI00;
/* 394 */                   List<OIoi0IIoi> list13 = list12;
/* 395 */                   ilI00iOi12 = ilI00iOi14;
/* 396 */                   i2 = i5;
/* 398 */                   Collection collection2 = collection;
/* 400 */                   Face face2 = face;
/* 401 */                   bitmap = bitmap4;
/* 419 */                   if (fArr != null) {
/* 425 */                       float f3 = -1.0f;
/* 427 */                       String str2 = null;
/* 433 */                       for (OIoi0IIoi oIoi0IIoi : list13) {
/* 439 */                           List list14 = list13;
/* 445 */                           IlI00iOi1 ilI00iOi15 = ilI00iOi12;
/* 449 */                           String str3 = (String) oIoi0IIoi.I00iOIl;
/* 453 */                           float[] fArr2 = (float[]) oIoi0IIoi.I00iiI;
/* 455 */                           Il11ooO1o il11ooO1o = IlI00iOi1.I00000oOI;
/* 457 */                           float fI00000oIO = ilO11lo1O.I00000oIO(fArr, fArr2);
/* 463 */                           if (fI00000oIO > f3) {
/* 465 */                               f3 = fI00000oIO;
/* 467 */                               str2 = str3;
/* 469 */                               ilI00iOi12 = ilI00iOi15;
/* 471 */                               list13 = list14;
                                    } else {
/* 474 */                               list13 = list14;
/* 476 */                               ilI00iOi12 = ilI00iOi15;
                                    }
                                }
/* 479 */                       list5 = list13;
/* 481 */                       str = str2;
/* 483 */                       f2 = f3;
                            } else {
/* 488 */                       list5 = list13;
/* 490 */                       f2 = -1.0f;
/* 492 */                       str = null;
                            }
/* 485 */                   IlI00iOi1 ilI00iOi16 = ilI00iOi12;
/* 496 */                   Rect boundingBox = face2.getBoundingBox();
/* 502 */                   if (f2 < f) {
/* 505 */                       str = null;
                            }
/* 506 */                   O110oiIo00 o110oiIo00 = new O110oiIo00();
/* 509 */                   o110oiIo00.I00000oIO = boundingBox;
/* 511 */                   o110oiIo00.I00000oOI = str;
/* 513 */                   o110oiIo00.I0000Il00O = f2;
/* 515 */                   VarHandle.storeStoreFence();
/* 518 */                   arrayList.add(o110oiIo00);
/* 521 */                   list2 = list5;
/* 523 */                   il01100l3 = il01100l4;
/* 525 */                   arrayList = collection2;
/* 527 */                   ilI00iOi12 = ilI00iOi16;
/* 295 */                   if (it.hasNext()) {
/* 301 */                       face2 = (Face) it.next();
/* 303 */                       ilI1loI1lO1.getClass();
/* 306 */                       List list15 = list2;
/* 308 */                       Bitmap bitmapI0000oI00 = IlI1loI1lO1.I0000oI00(bitmap, face2);
/* 312 */                       if (bitmapI0000oI00 != null) {
/* 314 */                           this.I00iOIl = ilI00iOi12;
/* 316 */                           il01100l4 = il01100l3;
/* 319 */                           this.I00iiI = null;
/* 325 */                           this.I00iiO = list15;
/* 328 */                           this.I00iio = null;
/* 330 */                           this.I00ilI0I1 = ilI1loI1lO1;
/* 332 */                           this.I00ilO0 = bitmap;
/* 337 */                           this.I00io1l = arrayList;
/* 339 */                           this.I00ioIO = it;
/* 341 */                           this.I00l0I0l0lO1 = face2;
/* 346 */                           this.I00l0OO0IO = arrayList;
/* 348 */                           this.I00li1OI = f;
/* 350 */                           this.I00ll1 = i;
/* 352 */                           this.I00lli11 = i2;
/* 355 */                           this.I00lll10 = 3;
/* 357 */                           ilI00iOi12.getClass();
/* 362 */                           i5 = i2;
/* 366 */                           bitmap4 = bitmap;
/* 370 */                           Iterator it3 = it;
/* 376 */                           objI0000oI00 = iOi1II01i0.I0000oI00(IlI00iOi1.I00000oOI, new I1iIil1I(ilI00iOi12, bitmapI0000oI00, null, 20), this);
/* 380 */                           if (objI0000oI00 != ii0111o) {
/* 384 */                               ilI00iOi14 = ilI00iOi12;
/* 385 */                               face = face2;
/* 386 */                               collection = arrayList;
/* 387 */                               it = it3;
/* 389 */                               list12 = list15;
/* 392 */                               float[] fArr3 = (float[]) objI0000oI00;
/* 394 */                               List<OIoi0IIoi> list132 = list12;
/* 395 */                               ilI00iOi12 = ilI00iOi14;
/* 396 */                               i2 = i5;
/* 398 */                               Collection collection22 = collection;
/* 400 */                               Face face22 = face;
/* 401 */                               bitmap = bitmap4;
/* 419 */                               if (fArr3 != null) {
                                        }
/* 485 */                               IlI00iOi1 ilI00iOi162 = ilI00iOi12;
/* 496 */                               Rect boundingBox2 = face22.getBoundingBox();
/* 502 */                               if (f2 < f) {
                                        }
/* 506 */                               O110oiIo00 o110oiIo002 = new O110oiIo00();
/* 509 */                               o110oiIo002.I00000oIO = boundingBox2;
/* 511 */                               o110oiIo002.I00000oOI = str;
/* 513 */                               o110oiIo002.I0000Il00O = f2;
/* 515 */                               VarHandle.storeStoreFence();
/* 518 */                               arrayList.add(o110oiIo002);
/* 521 */                               list2 = list5;
/* 523 */                               il01100l3 = il01100l4;
/* 525 */                               arrayList = collection22;
/* 527 */                               ilI00iOi12 = ilI00iOi162;
/* 295 */                               if (it.hasNext()) {
/* 531 */                                   il01100l = il01100l3;
/* 534 */                                   list3 = (List) arrayList;
/* 544 */                                   if (!((IlI10IO) olO0OIIl1.getValue()).I000iOII) {
/* 675 */                                       il01100l2 = il01100l;
/* 687 */                                       return new O110ooO1O(bitmap2.getWidth(), bitmap2.getHeight(), list3, il01100l2);
                                            }
                                            try {
/* 559 */                                       OloIIoII1oo oloIIoII1ooProcess2 = ((FaceMeshDetector) ilI1loI1lO12.I0000oI00.getValue()).process(InputImage.fromBitmap(bitmap2, 0));
/* 564 */                                       this.I00iOIl = null;
/* 566 */                                       this.I00iiI = null;
/* 568 */                                       this.I00iiO = null;
/* 573 */                                       this.I00iio = list3;
/* 575 */                                       this.I00ilI0I1 = null;
/* 577 */                                       this.I00ilO0 = null;
/* 579 */                                       this.I00io1l = null;
/* 581 */                                       this.I00ioIO = null;
/* 583 */                                       this.I00l0I0l0lO1 = null;
/* 585 */                                       this.I00l0OO0IO = null;
/* 587 */                                       this.I00li1OI = f;
/* 590 */                                       this.I00lll10 = 4;
/* 592 */                                       objI00000oIO2 = lOio0oO.I00000oIO(oloIIoII1ooProcess2, this);
                                            } catch (Throwable th3) {
/* 646 */                                       th = th3;
/* 647 */                                       list4 = list3;
/* 669 */                                       Log.e("FaceRecViewModel", "mesh detect failed: " + th.getMessage());
/* 672 */                                       il01100l2 = il01100l;
/* 644 */                                       list3 = list4;
/* 687 */                                       return new O110ooO1O(bitmap2.getWidth(), bitmap2.getHeight(), list3, il01100l2);
                                            }
/* 596 */                                   if (objI00000oIO2 != ii0111o) {
/* 599 */                                       list4 = list3;
/* 600 */                                       Iterable iterable2 = (Iterable) objI00000oIO2;
/* 610 */                                       ArrayList arrayList22 = new ArrayList(IOOi1I.I0000O(iterable2, 10));
/* 613 */                                       it2 = iterable2.iterator();
/* 621 */                                       while (it2.hasNext()) {
                                                }
/* 643 */                                       il01100l2 = arrayList22;
/* 644 */                                       list3 = list4;
/* 687 */                                       return new O110ooO1O(bitmap2.getWidth(), bitmap2.getHeight(), list3, il01100l2);
                                            }
                                        }
                                    }
                                } else {
/* 410 */                           il01100l4 = il01100l3;
/* 412 */                           list132 = list15;
/* 414 */                           fArr3 = null;
/* 415 */                           collection22 = arrayList;
/* 419 */                           if (fArr3 != null) {
                                    }
/* 485 */                           IlI00iOi1 ilI00iOi1622 = ilI00iOi12;
/* 496 */                           Rect boundingBox22 = face22.getBoundingBox();
/* 502 */                           if (f2 < f) {
                                    }
/* 506 */                           O110oiIo00 o110oiIo0022 = new O110oiIo00();
/* 509 */                           o110oiIo0022.I00000oIO = boundingBox22;
/* 511 */                           o110oiIo0022.I00000oOI = str;
/* 513 */                           o110oiIo0022.I0000Il00O = f2;
/* 515 */                           VarHandle.storeStoreFence();
/* 518 */                           arrayList.add(o110oiIo0022);
/* 521 */                           list2 = list5;
/* 523 */                           il01100l3 = il01100l4;
/* 525 */                           arrayList = collection22;
/* 527 */                           ilI00iOi12 = ilI00iOi1622;
/* 295 */                           if (it.hasNext()) {
                                    }
                                }
                            }
/* 598 */                   return ii0111o;
                        }
/* 138 */               olO0OIIl1 = olO0OIIl12;
/* 140 */               ilI00iOi1 = this.I00iOIl;
/* 142 */               lIoii1l01l0i.I00000oOI(obj);
/* 145 */               objI00000oIO = obj;
/* 210 */               List list16 = (List) objI00000oIO;
/* 216 */               if (list16.isEmpty()) {
/* 228 */                   return new O110ooO1O(bitmap2.getWidth(), bitmap2.getHeight());
                        }
/* 232 */               Context context = this.I00oI0i;
/* 234 */               this.I00iOIl = ilI00iOi1;
/* 239 */               this.I00iiI = list16;
/* 241 */               this.I00lll10 = 2;
/* 243 */               objI000OOo1O = ilI1loI1lO12.I000OOo1O(context, this);
/* 247 */               if (objI000OOo1O == ii0111o) {
/* 598 */                   return ii0111o;
                        }
/* 253 */               ilI00iOi12 = ilI00iOi1;
/* 254 */               list = list16;
/* 266 */               List list62 = list;
/* 283 */               ilI1loI1lO1 = ilI1loI1lO12;
/* 264 */               f = ((IlI10IO) olO0OIIl1.getValue()).I000O01llI0;
/* 276 */               arrayList = new ArrayList(IOOi1I.I0000O(list62, 10));
/* 286 */               bitmap = bitmap2;
/* 287 */               i = 0;
/* 279 */               it = list62.iterator();
/* 256 */               list2 = (List) objI000OOo1O;
/* 290 */               i2 = 0;
/* 295 */               if (it.hasNext()) {
                        }
/* 598 */               return ii0111o;
                    } catch (Throwable th4) {
/* 693 */               Log.e("FaceRecViewModel", "live recognise failed", th4);
/* 706 */               return new O110ooO1O(bitmap2.getWidth(), bitmap2.getHeight());
                    }
                }
            }
