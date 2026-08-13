            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.os.Parcelable;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.ai.edge.gallery.data.local.dao.FaceDao;
            import com.google.ai.edge.gallery.data.local.entities.FaceRecord;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.FloatBuffer;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            
/* 15 */    public final class IlI10l0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 1;
                public List I00iiI;
                public List I00iiO;
                public IlI00iOi1 I00iio;
                public Collection I00ilI0I1;
                public Iterator I00ilO0;
                public Bitmap I00io1l;
                public float I00ioIO;
                public int I00l0I0l0lO1;
                public int I00l0OO0IO;
                public int I00li1OI;
                public int I00ll1;
                public IlI1loI1lO1 I00lli11;
                public final Context I00lll10;
                public final IlI00iOi1 I00o0iI0io1;
                public Object I00o0l1o1o0;
                public final Parcelable I00o101lO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlI10l0(IlI1loI1lO1 ilI1loI1lO1, Context context, Uri uri, IlI00iOi1 ilI00iOi1, IOoil1iiIilo iOoil1iiIilo) {
/* 13 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00lli11 = ilI1loI1lO1;
/* 6 */             this.I00lll10 = context;
/* 8 */             this.I00o101lO = uri;
/* 10 */            this.I00o0iI0io1 = ilI00iOi1;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Parcelable parcelable = this.I00o101lO;
                    switch (i) {
                        case 0:
/* 43 */                    return new IlI10l0((IlI1loI1lO1) this.I00o0l1o1o0, (Bitmap) parcelable, this.I00lll10, this.I00o0iI0io1, iOoil1iiIilo);
                        default:
/* 15 */                    IlI00iOi1 ilI00iOi1 = this.I00o0iI0io1;
/* 20 */                    IlI10l0 ilI10l0 = new IlI10l0(this.I00lli11, this.I00lll10, (Uri) parcelable, ilI00iOi1, iOoil1iiIilo);
/* 23 */                    ilI10l0.I00o0l1o1o0 = obj;
/* 25 */                    return ilI10l0;
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
/* 18 */            return ((IlI10l0) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Removed duplicated region for block: B:104:0x0357  */
                /* JADX WARN: Removed duplicated region for block: B:105:0x0359 A[Catch: all -> 0x0377, TryCatch #2 {all -> 0x0377, blocks: (B:102:0x0353, B:107:0x0373, B:98:0x0314, B:111:0x0383, B:105:0x0359), top: B:117:0x0353 }] */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0373 A[Catch: all -> 0x0377, TryCatch #2 {all -> 0x0377, blocks: (B:102:0x0353, B:107:0x0373, B:98:0x0314, B:111:0x0383, B:105:0x0359), top: B:117:0x0353 }] */
                /* JADX WARN: Removed duplicated region for block: B:111:0x0383 A[Catch: all -> 0x0377, TRY_LEAVE, TryCatch #2 {all -> 0x0377, blocks: (B:102:0x0353, B:107:0x0373, B:98:0x0314, B:111:0x0383, B:105:0x0359), top: B:117:0x0353 }] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00da A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:12:0x0049, B:45:0x0166, B:61:0x01d8, B:39:0x0116, B:41:0x011c, B:63:0x01e7, B:48:0x0172, B:49:0x017e, B:51:0x0184, B:53:0x01ad, B:55:0x01bc, B:59:0x01ca, B:18:0x0063, B:38:0x00fb, B:19:0x006b, B:32:0x00d2, B:34:0x00da, B:35:0x00e1, B:20:0x0071, B:26:0x00ba, B:28:0x00be, B:29:0x00c5, B:23:0x00a2), top: B:116:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00e1 A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:12:0x0049, B:45:0x0166, B:61:0x01d8, B:39:0x0116, B:41:0x011c, B:63:0x01e7, B:48:0x0172, B:49:0x017e, B:51:0x0184, B:53:0x01ad, B:55:0x01bc, B:59:0x01ca, B:18:0x0063, B:38:0x00fb, B:19:0x006b, B:32:0x00d2, B:34:0x00da, B:35:0x00e1, B:20:0x0071, B:26:0x00ba, B:28:0x00be, B:29:0x00c5, B:23:0x00a2), top: B:116:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x011c A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:12:0x0049, B:45:0x0166, B:61:0x01d8, B:39:0x0116, B:41:0x011c, B:63:0x01e7, B:48:0x0172, B:49:0x017e, B:51:0x0184, B:53:0x01ad, B:55:0x01bc, B:59:0x01ca, B:18:0x0063, B:38:0x00fb, B:19:0x006b, B:32:0x00d2, B:34:0x00da, B:35:0x00e1, B:20:0x0071, B:26:0x00ba, B:28:0x00be, B:29:0x00c5, B:23:0x00a2), top: B:116:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x016a  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0172 A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:12:0x0049, B:45:0x0166, B:61:0x01d8, B:39:0x0116, B:41:0x011c, B:63:0x01e7, B:48:0x0172, B:49:0x017e, B:51:0x0184, B:53:0x01ad, B:55:0x01bc, B:59:0x01ca, B:18:0x0063, B:38:0x00fb, B:19:0x006b, B:32:0x00d2, B:34:0x00da, B:35:0x00e1, B:20:0x0071, B:26:0x00ba, B:28:0x00be, B:29:0x00c5, B:23:0x00a2), top: B:116:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x01d8 A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:12:0x0049, B:45:0x0166, B:61:0x01d8, B:39:0x0116, B:41:0x011c, B:63:0x01e7, B:48:0x0172, B:49:0x017e, B:51:0x0184, B:53:0x01ad, B:55:0x01bc, B:59:0x01ca, B:18:0x0063, B:38:0x00fb, B:19:0x006b, B:32:0x00d2, B:34:0x00da, B:35:0x00e1, B:20:0x0071, B:26:0x00ba, B:28:0x00be, B:29:0x00c5, B:23:0x00a2), top: B:116:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:63:0x01e7 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:12:0x0049, B:45:0x0166, B:61:0x01d8, B:39:0x0116, B:41:0x011c, B:63:0x01e7, B:48:0x0172, B:49:0x017e, B:51:0x0184, B:53:0x01ad, B:55:0x01bc, B:59:0x01ca, B:18:0x0063, B:38:0x00fb, B:19:0x006b, B:32:0x00d2, B:34:0x00da, B:35:0x00e1, B:20:0x0071, B:26:0x00ba, B:28:0x00be, B:29:0x00c5, B:23:0x00a2), top: B:116:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:96:0x030b A[Catch: all -> 0x0271, TRY_LEAVE, TryCatch #0 {all -> 0x0271, blocks: (B:74:0x025e, B:94:0x0305, B:96:0x030b, B:80:0x0280, B:93:0x02e9, B:81:0x0287, B:87:0x02c4, B:89:0x02cc, B:90:0x02d3, B:84:0x02b8), top: B:115:0x0237 }] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x034f -> B:117:0x0353). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x015e -> B:45:0x0166). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OoiIlOl1iI ooiIlOl1iI;
                    Object objI000II;
                    List list;
                    Object all;
                    float f;
                    IlI1loI1lO1 ilI1loI1lO1;
                    List list2;
                    Iterator it;
                    Collection collection;
                    int i;
                    int i2;
                    int i3;
                    float[] fArr;
                    OO0l00Ii10 oO0l00Ii10;
                    Object objI0000oI00;
                    Object objI000II2;
                    List list3;
                    Object all2;
                    float f2;
                    List<FaceRecord> list4;
                    Iterator it2;
                    Collection collection2;
                    int i4;
                    int i5;
                    int i6;
                    Ii0111o ii0111o;
                    IlI00iOi1 ilI00iOi1;
                    int i7;
                    OOloilI1OO oOloilI1OO;
/* 1 */             IlI10l0 ilI10l0 = this;
/* 3 */             int i8 = ilI10l0.I00iOIl;
/* 7 */             IlI00iOi1 ilI00iOi12 = ilI10l0.I00o0iI0io1;
/* 9 */             i1O01oOIoI0I i1o01ooioi0i = BoxChatDatabase.I000l1;
/* 11 */            Parcelable parcelable = ilI10l0.I00o101lO;
/* 15 */            OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 18 */            Context context = ilI10l0.I00lll10;
                    switch (i8) {
                        case 0:
/* 560 */                   IlI1loI1lO1 ilI1loI1lO12 = (IlI1loI1lO1) ilI10l0.I00o0l1o1o0;
/* 562 */                   OlO0OIIl1 olO0OIIl1 = ilI1loI1lO12.I00000oOI;
/* 564 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 566 */                   int i9 = ilI10l0.I00ll1;
                            try {
                            } catch (Throwable th) {
/* 626 */                       th = th;
/* 627 */                       ooiIlOl1iI = ooiIlOl1iI2;
                            }
/* 568 */                   if (i9 == 0) {
/* 654 */                       lIoii1l01l0i.I00000oOI(obj);
/* 694 */                       olO0OIIl1.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl1.getValue(), null, true, null, null, null, Il01100l.I00iOIl, null, 0.0f, false, false, false, 2009));
/* 699 */                       ilI10l0.I00ll1 = 1;
/* 701 */                       objI000II = ilI1loI1lO12.I000II((Bitmap) parcelable, ilI10l0);
/* 705 */                       if (objI000II == ii0111o2) {
                                }
/* 845 */                       return ii0111o2;
                            }
/* 570 */                   if (i9 == 1) {
/* 648 */                       lIoii1l01l0i.I00000oOI(obj);
/* 651 */                       objI000II = obj;
                            } else if (i9 == 2) {
/* 637 */                       List list5 = ilI10l0.I00iiI;
/* 641 */                       lIoii1l01l0i.I00000oOI(obj);
/* 644 */                       list = list5;
/* 645 */                       all = obj;
/* 754 */                       f = ((IlI10IO) olO0OIIl1.getValue()).I000O01llI0;
/* 760 */                       ArrayList arrayList = new ArrayList();
/* 767 */                       ilI1loI1lO1 = ilI1loI1lO12;
/* 746 */                       list2 = (List) all;
/* 763 */                       it = list.iterator();
/* 770 */                       collection = arrayList;
/* 771 */                       i = 0;
/* 772 */                       i2 = 0;
/* 773 */                       i3 = 0;
/* 778 */                       if (!it.hasNext()) {
                                }
                            } else {
/* 575 */                       if (i9 != 3) {
/* 631 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 634 */                           return null;
                                }
/* 577 */                       int i10 = ilI10l0.I00li1OI;
/* 579 */                       int i11 = ilI10l0.I00l0OO0IO;
/* 581 */                       int i12 = ilI10l0.I00l0I0l0lO1;
/* 583 */                       f = ilI10l0.I00ioIO;
/* 585 */                       Bitmap bitmap = ilI10l0.I00io1l;
/* 587 */                       it = ilI10l0.I00ilO0;
/* 589 */                       collection = ilI10l0.I00ilI0I1;
/* 593 */                       ilI1loI1lO1 = ilI10l0.I00lli11;
/* 595 */                       IlI00iOi1 ilI00iOi13 = ilI10l0.I00iio;
/* 597 */                       list2 = ilI10l0.I00iiO;
/* 603 */                       List list6 = ilI10l0.I00iiI;
/* 607 */                       lIoii1l01l0i.I00000oOI(obj);
/* 612 */                       ooiIlOl1iI = ooiIlOl1iI2;
/* 614 */                       int i13 = i10;
/* 615 */                       int i14 = i11;
/* 617 */                       int i15 = i12;
/* 619 */                       ilI00iOi12 = ilI00iOi13;
/* 622 */                       Object objI0000oI002 = obj;
                                try {
/* 852 */                           fArr = (float[]) objI0000oI002;
/* 854 */                           if (fArr != null) {
/* 856 */                               oO0l00Ii10 = null;
                                    } else {
/* 858 */                               ilI1loI1lO1.getClass();
/* 861 */                               OIoi0IIoi oIoi0IIoiI0001Ioi1lo = IlI1loI1lO1.I0001Ioi1lo(fArr, list2, f);
/* 879 */                               oO0l00Ii10 = new OO0l00Ii10(bitmap, fArr, (String) oIoi0IIoiI0001Ioi1lo.I00iOIl, ((Number) oIoi0IIoiI0001Ioi1lo.I00iiI).floatValue());
                                    }
/* 882 */                           if (oO0l00Ii10 != null) {
/* 884 */                               collection.add(oO0l00Ii10);
                                    }
/* 890 */                           ilI10l0 = this;
/* 892 */                           i3 = i13;
/* 893 */                           ooiIlOl1iI2 = ooiIlOl1iI;
/* 895 */                           i = i15;
/* 897 */                           i2 = i14;
                                } catch (Throwable th2) {
/* 888 */                           th = th2;
/* 949 */                           Log.e("FaceRecViewModel", "capture failed", th);
/* 970 */                           ilI1loI1lO12.I000O01llI0("Capture failed: " + th.getMessage());
/* 944 */                           return ooiIlOl1iI;
                                }
/* 778 */                       if (!it.hasNext()) {
/* 784 */                           Bitmap bitmap2 = (Bitmap) it.next();
/* 786 */                           ooiIlOl1iI = ooiIlOl1iI2;
/* 789 */                           ilI10l0.I00iiI = null;
/* 794 */                           ilI10l0.I00iiO = list2;
/* 796 */                           ilI10l0.I00iio = ilI00iOi12;
/* 798 */                           ilI10l0.I00lli11 = ilI1loI1lO1;
/* 803 */                           ilI10l0.I00ilI0I1 = collection;
/* 805 */                           ilI10l0.I00ilO0 = it;
/* 807 */                           ilI10l0.I00io1l = bitmap2;
/* 809 */                           ilI10l0.I00ioIO = f;
/* 811 */                           ilI10l0.I00l0I0l0lO1 = i;
/* 813 */                           ilI10l0.I00l0OO0IO = i2;
/* 815 */                           ilI10l0.I00li1OI = i3;
/* 818 */                           ilI10l0.I00ll1 = 3;
/* 820 */                           ilI00iOi12.getClass();
/* 825 */                           i15 = i;
/* 829 */                           i14 = i2;
/* 831 */                           float f3 = f;
/* 839 */                           objI0000oI002 = iOi1II01i0.I0000oI00(IlI00iOi1.I00000oOI, new I1iIil1I(ilI00iOi12, bitmap2, null, 20), ilI10l0);
/* 843 */                           if (objI0000oI002 != ii0111o2) {
/* 848 */                               i13 = i3;
/* 849 */                               bitmap = bitmap2;
/* 850 */                               f = f3;
/* 852 */                               fArr = (float[]) objI0000oI002;
/* 854 */                               if (fArr != null) {
                                        }
/* 882 */                               if (oO0l00Ii10 != null) {
                                        }
/* 890 */                               ilI10l0 = this;
/* 892 */                               i3 = i13;
/* 893 */                               ooiIlOl1iI2 = ooiIlOl1iI;
/* 895 */                               i = i15;
/* 897 */                               i2 = i14;
/* 778 */                               if (!it.hasNext()) {
/* 900 */                                   ooiIlOl1iI = ooiIlOl1iI2;
/* 941 */                                   olO0OIIl1.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl1.getValue(), null, false, null, null, null, (List) collection, null, 0.0f, false, false, false, 2013));
/* 944 */                                   return ooiIlOl1iI;
                                        }
                                    }
/* 845 */                           return ii0111o2;
                                }
                            }
/* 709 */                   list = (List) objI000II;
/* 715 */                   if (list.isEmpty()) {
/* 719 */                       ilI1loI1lO12.I000O01llI0("No face in the captured frame — try again");
/* 974 */                       return ooiIlOl1iI2;
                            }
/* 728 */                   FaceDao faceDaoI001IO000 = i1o01ooioi0i.I000OiO(context).I001IO000();
/* 735 */                   ilI10l0.I00iiI = list;
/* 737 */                   ilI10l0.I00ll1 = 2;
/* 739 */                   all = faceDaoI001IO000.getAll(ilI10l0);
/* 743 */                   if (all == ii0111o2) {
/* 845 */                       return ii0111o2;
                            }
/* 754 */                   f = ((IlI10IO) olO0OIIl1.getValue()).I000O01llI0;
/* 760 */                   ArrayList arrayList2 = new ArrayList();
/* 767 */                   ilI1loI1lO1 = ilI1loI1lO12;
/* 746 */                   list2 = (List) all;
/* 763 */                   it = list.iterator();
/* 770 */                   collection = arrayList2;
/* 771 */                   i = 0;
/* 772 */                   i2 = 0;
/* 773 */                   i3 = 0;
/* 778 */                   if (!it.hasNext()) {
                            }
                        default:
/* 24 */                    IlI1loI1lO1 ilI1loI1lO13 = ilI10l0.I00lli11;
/* 26 */                    OlO0OIIl1 olO0OIIl12 = ilI1loI1lO13.I00000oOI;
/* 30 */                    Ii0110 ii0110 = (Ii0110) ilI10l0.I00o0l1o1o0;
/* 32 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 34 */                    int i16 = ilI10l0.I00ll1;
                            try {
/* 37 */                        if (i16 == 0) {
/* 120 */                           lIoii1l01l0i.I00000oOI(obj);
/* 160 */                           olO0OIIl12.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl12.getValue(), null, true, null, null, Il01100l.I00iOIl, null, null, 0.0f, false, false, false, 2025));
/* 165 */                           ilI10l0.I00o0l1o1o0 = ii0110;
/* 167 */                           ilI10l0.I00ll1 = 1;
/* 169 */                           IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 179 */                           objI0000oI00 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new I1o0lo01(context, (Uri) parcelable, null, 1), ilI10l0);
/* 183 */                           if (objI0000oI00 == ii0111o3) {
                                    }
/* 348 */                           return ii0111o3;
                                }
/* 39 */                        if (i16 == 1) {
/* 114 */                           lIoii1l01l0i.I00000oOI(obj);
/* 117 */                           objI0000oI00 = obj;
                                } else if (i16 == 2) {
/* 108 */                           lIoii1l01l0i.I00000oOI(obj);
/* 111 */                           objI000II2 = obj;
/* 211 */                           list3 = (List) objI000II2;
/* 217 */                           if (!list3.isEmpty()) {
/* 221 */                               ilI1loI1lO13.I000O01llI0("No faces found in that image");
/* 557 */                               return ooiIlOl1iI2;
                                    }
/* 230 */                           FaceDao faceDaoI001IO0002 = i1o01ooioi0i.I000OiO(context).I001IO000();
/* 235 */                           ilI10l0.I00o0l1o1o0 = null;
/* 240 */                           ilI10l0.I00iiI = list3;
/* 243 */                           ilI10l0.I00ll1 = 3;
/* 245 */                           all2 = faceDaoI001IO0002.getAll(ilI10l0);
/* 249 */                           if (all2 == ii0111o3) {
/* 348 */                               return ii0111o3;
                                    }
/* 260 */                           f2 = ((IlI10IO) olO0OIIl12.getValue()).I000O01llI0;
/* 266 */                           ArrayList arrayList3 = new ArrayList();
/* 252 */                           list4 = (List) all2;
/* 269 */                           it2 = list3.iterator();
/* 275 */                           collection2 = arrayList3;
/* 276 */                           i4 = 0;
/* 277 */                           i5 = 0;
/* 278 */                           i6 = 0;
/* 283 */                           if (!it2.hasNext()) {
                                    }
                                } else if (i16 == 3) {
/* 96 */                            List list7 = ilI10l0.I00iiI;
/* 100 */                           lIoii1l01l0i.I00000oOI(obj);
/* 103 */                           list3 = list7;
/* 104 */                           all2 = obj;
/* 260 */                           f2 = ((IlI10IO) olO0OIIl12.getValue()).I000O01llI0;
/* 266 */                           ArrayList arrayList32 = new ArrayList();
/* 252 */                           list4 = (List) all2;
/* 269 */                           it2 = list3.iterator();
/* 275 */                           collection2 = arrayList32;
/* 276 */                           i4 = 0;
/* 277 */                           i5 = 0;
/* 278 */                           i6 = 0;
/* 283 */                           if (!it2.hasNext()) {
                                    }
                                } else {
/* 46 */                            if (i16 != 4) {
/* 90 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 93 */                                return null;
                                    }
/* 48 */                            int i17 = ilI10l0.I00li1OI;
/* 50 */                            int i18 = ilI10l0.I00l0OO0IO;
/* 52 */                            int i19 = ilI10l0.I00l0I0l0lO1;
/* 54 */                            f2 = ilI10l0.I00ioIO;
/* 56 */                            Bitmap bitmap3 = ilI10l0.I00io1l;
/* 58 */                            Iterator it3 = ilI10l0.I00ilO0;
/* 60 */                            collection2 = ilI10l0.I00ilI0I1;
/* 64 */                            IlI00iOi1 ilI00iOi14 = ilI10l0.I00iio;
/* 66 */                            list4 = ilI10l0.I00iiO;
/* 70 */                            List list8 = ilI10l0.I00iiI;
/* 74 */                            lIoii1l01l0i.I00000oOI(obj);
/* 77 */                            int i20 = i18;
/* 79 */                            Iterator it4 = it3;
/* 80 */                            Object objI0000oI003 = obj;
/* 82 */                            int i21 = i19;
/* 83 */                            int i22 = i17;
/* 84 */                            ilI00iOi12 = ilI00iOi14;
/* 359 */                           float[] fArr2 = (float[]) objI0000oI003;
/* 361 */                           if (fArr2 != null) {
/* 363 */                               ii0111o = ii0111o3;
/* 365 */                               ilI00iOi1 = ilI00iOi12;
/* 367 */                               i7 = i22;
/* 369 */                               oOloilI1OO = null;
                                    } else {
/* 377 */                               ii0111o = ii0111o3;
/* 379 */                               float f4 = -1.0f;
/* 381 */                               String name = null;
/* 387 */                               for (FaceRecord faceRecord : list4) {
/* 395 */                                   Il11ooO1o il11ooO1o = IlI00iOi1.I00000oOI;
/* 405 */                                   IlI00iOi1 ilI00iOi15 = ilI00iOi12;
/* 407 */                                   FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.wrap(faceRecord.getEmbedding()).asFloatBuffer();
/* 411 */                                   int i23 = i22;
/* 417 */                                   float[] fArr3 = new float[floatBufferAsFloatBuffer.remaining()];
/* 419 */                                   floatBufferAsFloatBuffer.get(fArr3);
/* 422 */                                   float fI00000oIO = ilO11lo1O.I00000oIO(fArr2, fArr3);
/* 428 */                                   if (fI00000oIO > f4) {
/* 430 */                                       name = faceRecord.getName();
/* 434 */                                       f4 = fI00000oIO;
/* 435 */                                       i22 = i23;
/* 437 */                                       ilI00iOi12 = ilI00iOi15;
                                            } else {
/* 440 */                                       ilI00iOi12 = ilI00iOi15;
/* 442 */                                       i22 = i23;
                                            }
                                        }
/* 445 */                               ilI00iOi1 = ilI00iOi12;
/* 447 */                               i7 = i22;
/* 458 */                               String str = f4 >= f2 ? name : null;
/* 459 */                               oOloilI1OO = new OOloilI1OO();
/* 462 */                               oOloilI1OO.I00000oIO = bitmap3;
/* 464 */                               oOloilI1OO.I00000oOI = str;
/* 466 */                               oOloilI1OO.I0000Il00O = f4;
/* 468 */                               VarHandle.storeStoreFence();
                                    }
/* 471 */                           if (oOloilI1OO != null) {
/* 473 */                               collection2.add(oOloilI1OO);
                                    }
/* 476 */                           ilI00iOi12 = ilI00iOi1;
/* 478 */                           i6 = i21;
/* 479 */                           it2 = it4;
/* 480 */                           i4 = i20;
/* 482 */                           ii0111o3 = ii0111o;
/* 484 */                           i5 = i7;
/* 283 */                           if (!it2.hasNext()) {
/* 289 */                               Bitmap bitmap4 = (Bitmap) it2.next();
/* 292 */                               ilI10l0.I00o0l1o1o0 = null;
/* 294 */                               ilI10l0.I00iiI = null;
/* 299 */                               ilI10l0.I00iiO = list4;
/* 301 */                               ilI10l0.I00iio = ilI00iOi12;
/* 306 */                               ilI10l0.I00ilI0I1 = collection2;
/* 308 */                               ilI10l0.I00ilO0 = it2;
/* 310 */                               ilI10l0.I00io1l = bitmap4;
/* 312 */                               ilI10l0.I00ioIO = f2;
/* 314 */                               ilI10l0.I00l0I0l0lO1 = i6;
/* 316 */                               ilI10l0.I00l0OO0IO = i4;
/* 318 */                               ilI10l0.I00li1OI = i5;
/* 321 */                               ilI10l0.I00ll1 = 4;
/* 323 */                               ilI00iOi12.getClass();
/* 328 */                               i20 = i4;
/* 332 */                               int i24 = i5;
/* 334 */                               float f5 = f2;
/* 342 */                               objI0000oI003 = iOi1II01i0.I0000oI00(IlI00iOi1.I00000oOI, new I1iIil1I(ilI00iOi12, bitmap4, null, 20), ilI10l0);
/* 346 */                               if (objI0000oI003 != ii0111o3) {
/* 351 */                                   Iterator it5 = it2;
/* 352 */                                   i21 = i6;
/* 353 */                                   bitmap3 = bitmap4;
/* 354 */                                   it4 = it5;
/* 355 */                                   i22 = i24;
/* 357 */                                   f2 = f5;
/* 359 */                                   float[] fArr22 = (float[]) objI0000oI003;
/* 361 */                                   if (fArr22 != null) {
                                            }
/* 471 */                                   if (oOloilI1OO != null) {
                                            }
/* 476 */                                   ilI00iOi12 = ilI00iOi1;
/* 478 */                                   i6 = i21;
/* 479 */                                   it2 = it4;
/* 480 */                                   i4 = i20;
/* 482 */                                   ii0111o3 = ii0111o;
/* 484 */                                   i5 = i7;
/* 283 */                                   if (!it2.hasNext()) {
/* 527 */                                       olO0OIIl12.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl12.getValue(), null, false, null, null, (List) collection2, null, null, 0.0f, false, false, false, 2029));
/* 557 */                                       return ooiIlOl1iI2;
                                            }
                                        }
/* 348 */                               return ii0111o3;
                                    }
                                }
/* 187 */                       Bitmap bitmap5 = (Bitmap) objI0000oI00;
/* 189 */                       if (bitmap5 == null) {
/* 193 */                           ilI1loI1lO13.I000O01llI0("Couldn't read that image");
/* 557 */                           return ooiIlOl1iI2;
                                }
/* 199 */                       ilI10l0.I00o0l1o1o0 = null;
/* 201 */                       ilI10l0.I00ll1 = 2;
/* 203 */                       objI000II2 = ilI1loI1lO13.I000II(bitmap5, ilI10l0);
/* 207 */                       if (objI000II2 != ii0111o3) {
/* 211 */                           list3 = (List) objI000II2;
/* 217 */                           if (!list3.isEmpty()) {
                                    }
                                }
/* 348 */                       return ii0111o3;
                            } catch (Throwable th3) {
/* 533 */                       Log.e("FaceRecViewModel", "recognize failed", th3);
/* 554 */                       ilI1loI1lO13.I000O01llI0("Recognition failed: " + th3.getMessage());
/* 557 */                       return ooiIlOl1iI2;
                            }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public IlI10l0(IlI1loI1lO1 ilI1loI1lO1, Bitmap bitmap, Context context, IlI00iOi1 ilI00iOi1, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 17 */            this.I00o0l1o1o0 = ilI1loI1lO1;
                    this.I00o101lO = bitmap;
                    this.I00lll10 = context;
                    this.I00o0iI0io1 = ilI00iOi1;
                }
            }
