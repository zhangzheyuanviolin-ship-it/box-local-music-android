            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Typeface;
            import android.graphics.drawable.Drawable;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.util.AttributeSet;
            import android.util.Log;
            import android.util.Pair;
            import android.util.Rational;
            import android.util.Size;
            import android.util.TypedValue;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicLong;
            
/* 111 */   public class OlilOlOiI implements Illo1O0O10l, i0Ii0I1ll, i0IoOO1i1, OIOolOo, iOlolIi, IIiOOIoi0, ioooOO1I1, iooOIOOo1, l0iO00i1IO0 {
                public static OlilOlOiI I00ilI0I1;
                public static OlilOlOiI I00ilO0;
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public OlilOlOiI(IIllOioOlolI iIllOioOlolI, Size size) {
                    Rational rational;
/* 2 */             this.I00iOIl = 0;
/* 7 */             this.I00iiI = iIllOioOlolI;
/* 9 */             iIllOioOlolI.I0000oI00();
/* 12 */            iIllOioOlolI.I000iOII();
/* 15 */            if (size != null) {
/* 27 */                rational = new Rational(size.getWidth(), size.getHeight());
                    } else {
/* 33 */                List listI00111O = iIllOioOlolI.I00111O(Barcode.FORMAT_QR_CODE);
/* 41 */                if (listI00111O.isEmpty()) {
/* 44 */                    rational = null;
                        } else {
/* 55 */                    Size size2 = (Size) Collections.max(listI00111O, new IOi101(false));
/* 67 */                    rational = new Rational(size2.getWidth(), size2.getHeight());
                        }
                    }
/* 70 */            this.I00iiO = rational;
/* 74 */            II1011i iI1011i = new II1011i();
/* 81 */            iI1011i.I00000oIO = iIllOioOlolI.I0000oI00();
/* 87 */            iI1011i.I00000oOI = iIllOioOlolI.I000iOII();
/* 89 */            iI1011i.I0000O = rational;
/* 105 */           iI1011i.I0000Il00O = rational == null || rational.getNumerator() >= rational.getDenominator();
/* 107 */           VarHandle.storeStoreFence();
/* 110 */           this.I00iio = iI1011i;
                }

                public static ArrayList I000o00OoI0I(ArrayList arrayList) {
/* 3 */             ArrayList arrayList2 = new ArrayList();
/* 8 */             arrayList2.add(I1O0oI0ol.I00000oIO);
/* 13 */            arrayList2.add(I1O0oI0ol.I0000Il00O);
/* 16 */            Iterator it = arrayList.iterator();
/* 24 */            while (it.hasNext()) {
/* 30 */                Size size = (Size) it.next();
/* 42 */                Rational rational = new Rational(size.getWidth(), size.getHeight());
/* 49 */                if (!arrayList2.contains(rational)) {
/* 51 */                    Iterator it2 = arrayList2.iterator();
                            while (true) {
/* 59 */                        if (!it2.hasNext()) {
/* 74 */                            arrayList2.add(rational);
                                    break;
                                }
/* 71 */                        if (I1O0oI0ol.I00000oIO((Rational) it2.next(), size)) {
                                    break;
                                }
                            }
                        }
                    }
/* 168 */           return arrayList2;
                }

                public static Rational I00100l0(int i, boolean z) {
/* 2 */             if (i == -1 || i == 0) {
                        return z ? I1O0oI0ol.I00000oIO : I1O0oI0ol.I00000oOI;
                    }
/* 7 */             if (i == 1) {
                        return z ? I1O0oI0ol.I0000Il00O : I1O0oI0ol.I0000O;
                    }
/* 25 */            l11I11lO.I00000oIO("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
/* 28 */            return null;
                }

                public static HashMap I00100o1O0lo(ArrayList arrayList) {
/* 3 */             HashMap map = new HashMap();
/* 10 */            Iterator it = I000o00OoI0I(arrayList).iterator();
/* 18 */            while (it.hasNext()) {
/* 31 */                map.put((Rational) it.next(), new ArrayList());
                    }
/* 35 */            Iterator it2 = arrayList.iterator();
/* 43 */            while (it2.hasNext()) {
/* 49 */                Size size = (Size) it2.next();
/* 63 */                for (Rational rational : map.keySet()) {
/* 75 */                    if (I1O0oI0ol.I00000oIO(rational, size)) {
/* 83 */                        ((List) map.get(rational)).add(size);
                            }
                        }
                    }
/* 168 */           return map;
                }

                public static OlilOlOiI I0010I0i(Context context, AttributeSet attributeSet, int[] iArr, int i) {
/* 8 */             return new OlilOlOiI(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
                }

                public static void I00111O(List list, Size size, boolean z) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 12 */            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
/* 18 */                Size size3 = (Size) list.get(size2);
/* 28 */                if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                            break;
                        }
/* 41 */                arrayList.add(0, size3);
                    }
/* 47 */            list.removeAll(arrayList);
/* 50 */            Collections.reverse(list);
/* 53 */            if (z) {
/* 55 */                list.addAll(arrayList);
                    }
                }

                public static void I001IIilI0O(List list, Size size, boolean z) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 12 */            for (int i = 0; i < list.size(); i++) {
/* 18 */                Size size2 = (Size) list.get(i);
/* 28 */                if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                            break;
                        }
/* 40 */                arrayList.add(0, size2);
                    }
/* 46 */            list.removeAll(arrayList);
/* 49 */            if (z) {
/* 51 */                list.addAll(arrayList);
                    }
                }

                public static OlilOlOiI I001IO000(l0olllO1i l0olllo1i) {
/* 1 */             OlilOlOiI olilOlOiI = I00ilO0;
/* 3 */             if (olilOlOiI != null) {
/* 77 */                return olilOlOiI;
                    }
/* 7 */             Context context = l0olllo1i.I00iOIl;
/* 11 */            OlilOlOiI olilOlOiI2 = new OlilOlOiI(27);
/* 21 */            olilOlOiI2.I00iio = new AtomicLong(-1L);
/* 25 */            OloOII1ioI1l oloOII1ioI1l = new OloOII1ioI1l();
/* 30 */            oloOII1ioI1l.I00000oOI = "measurement:api";
/* 32 */            VarHandle.storeStoreFence();
/* 39 */            olilOlOiI2.I00iiO = lOio11O.I00000oIO(context, oloOII1ioI1l);
/* 41 */            olilOlOiI2.I00iiI = l0olllo1i;
/* 43 */            VarHandle.storeStoreFence();
/* 46 */            I00ilO0 = olilOlOiI2;
/* 77 */            return olilOlOiI2;
                }

                @Override
                public void I00000oIO(String str) {
/* 3 */             I000O01llI0(0L, str);
                }

                @Override
                public void I00000oOI() {
/* 23 */            ((Bundle) this.I00iio).putBoolean("notification_intent_reconstruct_from_data", ((Ii11I1OOII1) this.I00iiO).I00000oIO(((String) this.I00iiI).concat("notification_intent_reconstruct_from_data")));
                }

                @Override
                public Object I0000Il00O() {
                    switch (this.I00iOIl) {
                        case 6:
/* 55 */                    Context contextI00000oOI = ((i0O00lI) this.I00iiI).I00000oOI();
/* 63 */                    Object objI0000Il00O = ((i0IOo0i0) this.I00iiO).I0000Il00O();
/* 79 */                    i0OI1IOoili1 i0oi1iooili1 = (i0OI1IOoili1) ((i0IOo0i0) this.I00iio).I0000Il00O();
/* 81 */                    i0Ii1l i0ii1l = new i0Ii1l();
/* 89 */                    i0ii1l.I0001Ioi1lo = new AtomicBoolean();
/* 95 */                    i0ii1l.I00000oIO = contextI00000oOI.getPackageName();
/* 97 */                    i0ii1l.I00000oOI = (i0O0oOiO11) objI0000Il00O;
/* 99 */                    i0ii1l.I0000Il00O = i0oi1iooili1;
/* 105 */                   if (i0IIOO.I00000oIO(contextI00000oOI)) {
/* 109 */                       Context applicationContext = contextI00000oOI.getApplicationContext();
/* 113 */                       if (applicationContext == null) {
/* 116 */                           applicationContext = contextI00000oOI;
                                }
/* 117 */                       OlOilIlol1 olOilIlol1 = i0Ii1l.I000II;
/* 119 */                       Intent intent = i0Ii1l.I000O01llI0;
/* 126 */                       i0ii1l.I0000O = new i0Oii0oo1i(applicationContext, olOilIlol1, "AssetPackService", intent);
/* 130 */                       Context applicationContext2 = contextI00000oOI.getApplicationContext();
/* 134 */                       if (applicationContext2 != null) {
/* 136 */                           contextI00000oOI = applicationContext2;
                                }
/* 142 */                       i0ii1l.I0000oI00 = new i0Oii0oo1i(contextI00000oOI, olOilIlol1, "AssetPackService-keepAlive", intent);
                            }
/* 151 */                   i0Ii1l.I000II.I00000oIO("AssetPackService initiated.", new Object[0]);
/* 154 */                   VarHandle.storeStoreFence();
/* 157 */                   return i0ii1l;
                        default:
/* 8 */                     i0IOo0i0 i0ioo0i0 = (i0IOo0i0) this.I00iio;
/* 12 */                    i0IOo0i0 i0ioo0i02 = (i0IOo0i0) this.I00iiO;
/* 18 */                    Object objI0000Il00O2 = ((i0IOo0i0) this.I00iiI).I0000Il00O();
/* 22 */                    Object objI0000Il00O3 = i0ioo0i02.I0000Il00O();
/* 36 */                    i0Iol0l1lIl i0iol0l1lil = (i0Iol0l1lIl) i0ioo0i0.I0000Il00O();
/* 38 */                    i0O1O1I i0o1o1i = new i0O1O1I();
/* 41 */                    i0o1o1i.I00000oIO = (i0O1I1o) objI0000Il00O2;
/* 43 */                    i0o1o1i.I00000oOI = (i0Il00O1) objI0000Il00O3;
/* 45 */                    i0o1o1i.I0000Il00O = i0iol0l1lil;
/* 47 */                    VarHandle.storeStoreFence();
/* 50 */                    return i0o1o1i;
                    }
                }

                @Override
                public void I0000O(String str) {
/* 20 */            String[] strArrI0000O = ((Ii11I1OOII1) this.I00iiO).I0000O(IIl001iO0Io.I00100l0(new StringBuilder((String) this.I00iiI), str, ":intent_data"));
/* 24 */            if (strArrI0000O == null) {
/* 26 */                return;
                    }
/* 30 */            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(strArrI0000O.length);
/* 35 */            for (String str2 : strArrI0000O) {
/* 60 */                arrayList.add(str2.isEmpty() ? null : new Intent().setData(Uri.parse(str2)));
                    }
/* 70 */            ((Bundle) this.I00iio).putParcelableArrayList(str, arrayList);
                }

                @Override
                public void I0000oI00(String str) {
/* 3 */             String str2 = (String) this.I00iiI;
/* 20 */            Object obj = ((Ii11I1OOII1) this.I00iiO).I00000oIO.get(str2.concat(str));
/* 39 */            ((Bundle) this.I00iio).putInt(str, ((Number) (obj instanceof Integer ? obj : 0)).intValue());
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
/* 16 */            iIllIoiiIO.I0001Ioi1lo(true, (ListenableFuture) this.I00iiI, (IIiOOI) this.I00iiO, Iii11l.I00000oIO());
                }

                @Override
                public ArrayList I000II(String str) {
/* 13 */            String[] strArrI0000O = ((Ii11I1OOII1) this.I00iiO).I0000O(((String) this.I00iiI).concat(str));
/* 17 */            if (strArrI0000O == null) {
/* 21 */                return new ArrayList();
                    }
/* 28 */            ArrayList<String> arrayList = new ArrayList<>(strArrI0000O.length);
/* 33 */            for (String str2 : strArrI0000O) {
/* 42 */                if (true == str2.isEmpty()) {
/* 44 */                    str2 = null;
                        }
/* 45 */                arrayList.add(str2);
                    }
/* 55 */            ((Bundle) this.I00iio).putStringArrayList(str, arrayList);
/* 77 */            return arrayList;
                }

                @Override
                public void I000O01llI0(long j, String str) {
/* 21 */            ((Bundle) this.I00iio).putLong(str, ((Ii11I1OOII1) this.I00iiO).I00000oOI(((String) this.I00iiI).concat(str), j));
                }

                @Override
                public void I000OOo1O(String str) {
/* 21 */            ((Bundle) this.I00iio).putString(str, ((Ii11I1OOII1) this.I00iiO).I0000Il00O(((String) this.I00iiI).concat(str)));
                }

                public ColorStateList I000OiO(int i) {
                    int resourceId;
                    ColorStateList colorStateListI00000oOI;
/* 3 */             TypedArray typedArray = (TypedArray) this.I00iiO;
                    return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListI00000oOI = iOI10i0I11.I00000oOI((Context) this.I00iiI, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListI00000oOI;
                }

                public Drawable I000iOII(int i) {
                    int resourceId;
/* 3 */             TypedArray typedArray = (TypedArray) this.I00iiO;
                    return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : iOO0oOI1Ol.I00000oIO((Context) this.I00iiI, resourceId);
                }

                public Drawable I000l1(int i) {
                    int resourceId;
                    Drawable drawableI0000oI00;
/* 9 */             if (!((TypedArray) this.I00iiO).hasValue(i) || (resourceId = ((TypedArray) this.I00iiO).getResourceId(i, 0)) == 0) {
/* 43 */                return null;
                    }
/* 22 */            I11oo00 i11oo00I00000oIO = I11oo00.I00000oIO();
/* 28 */            Context context = (Context) this.I00iiI;
                    synchronized (i11oo00I00000oIO) {
/* 34 */                drawableI0000oI00 = i11oo00I00000oIO.I00000oIO.I0000oI00(context, resourceId, true);
                    }
/* 39 */            return drawableI0000oI00;
                }

                public Typeface I000lI(int i, int i2, I1I1OO00o1o i1I1OO00o1o) {
/* 6 */             int resourceId = ((TypedArray) this.I00iiO).getResourceId(i, 0);
/* 10 */            if (resourceId == 0) {
/* 40 */                return null;
                    }
/* 15 */            TypedValue typedValue = (TypedValue) this.I00iio;
/* 17 */            if (typedValue == null) {
/* 21 */                typedValue = new TypedValue();
/* 24 */                this.I00iio = typedValue;
                    }
/* 26 */            TypedValue typedValue2 = typedValue;
/* 30 */            Context context = (Context) this.I00iiI;
/* 32 */            ThreadLocal threadLocal = Oi0oolOI.I00000oIO;
/* 38 */            if (context.isRestricted()) {
/* 40 */                return null;
                    }
/* 45 */            return Oi0oolOI.I00000oIO(context, resourceId, typedValue2, i2, i1I1OO00o1o, true);
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public ArrayList I000oI1ioi(OolIl0ii1 oolIl0ii1) {
                    Size[] sizeArr;
                    Rational rational;
/* 3 */             IIllOioOlolI iIllOioOlolI = (IIllOioOlolI) this.I00iiI;
/* 6 */             IoiIli1i0Oil ioiIli1i0Oil = (IoiIli1i0Oil) oolIl0ii1;
/* 15 */            List list = (List) ioiIli1i0Oil.I00000oOI(IoiIli1i0Oil.I001lloI, null);
/* 25 */            ArrayList arrayList = list != null ? new ArrayList(list) : null;
/* 26 */            if (arrayList != null) {
/* 28 */                return arrayList;
                    }
/* 35 */            Oi0Oliol oi0Oliol = (Oi0Oliol) ioiIli1i0Oil.I00000oOI(IoiIli1i0Oil.I001lllioOl, null);
/* 43 */            List<Pair> list2 = (List) ioiIli1i0Oil.I00000oOI(IoiIli1i0Oil.I001lIiIIo1O, null);
/* 45 */            int iI000o00OoI0I = oolIl0ii1.I000o00OoI0I();
/* 49 */            if (list2 != null) {
/* 59 */                for (Pair pair : list2) {
/* 75 */                    if (((Integer) pair.first).intValue() == iI000o00OoI0I) {
/* 79 */                        sizeArr = (Size[]) pair.second;
                                break;
                            }
                        }
/* 82 */                sizeArr = null;
                    } else {
/* 82 */                sizeArr = null;
                    }
/* 87 */            List listAsList = sizeArr == null ? null : Arrays.asList(sizeArr);
/* 91 */            if (listAsList == null) {
/* 93 */                listAsList = iIllOioOlolI.I00111O(iI000o00OoI0I);
                    }
/* 99 */            ArrayList arrayList2 = new ArrayList(listAsList);
/* 108 */           Collections.sort(arrayList2, new IOi101(true));
/* 117 */           if (arrayList2.isEmpty()) {
/* 138 */               l11I11lO.I0000oI00("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + iI000o00OoI0I + ".");
                    }
/* 142 */           if (oi0Oliol != null) {
/* 563 */               Size size = (Size) ((IoiIli1i0Oil) oolIl0ii1).I00000oOI(IoiIli1i0Oil.I001l0I00, null);
/* 565 */               ioiIli1i0Oil.I001lloI(0);
/* 582 */               if (!((Boolean) oolIl0ii1.I00000oOI(OolIl0ii1.I00OIO1, Boolean.FALSE)).booleanValue()) {
/* 584 */                   oolIl0ii1.I000o00OoI0I();
                        }
/* 587 */               oolIl0ii1.toString();
/* 590 */               arrayList2.toString();
/* 594 */               l11I11lO.I0000O(3, "SupportedOutputSizesCollector");
/* 603 */               Oi0Oliol oi0Oliol2 = (Oi0Oliol) ioiIli1i0Oil.I0000O(IoiIli1i0Oil.I001lllioOl);
/* 607 */               Rational rational2 = (Rational) this.I00iiO;
/* 609 */               iOl0lOIi11 iol0loii11 = oi0Oliol2.I00000oIO;
/* 611 */               HashMap mapI00100o1O0lo = I00100o1O0lo(arrayList2);
/* 629 */               boolean z = rational2 == null || rational2.getNumerator() >= rational2.getDenominator();
/* 630 */               iol0loii11.getClass();
/* 633 */               Rational rationalI00100l0 = I00100l0(0, z);
/* 643 */               ArrayList arrayList3 = new ArrayList(mapI00100o1O0lo.keySet());
/* 651 */               Collections.sort(arrayList3, new I1O0o0101O(rationalI00100l0, rational2));
/* 656 */               LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 659 */               Iterator it = arrayList3.iterator();
/* 667 */               while (it.hasNext()) {
/* 673 */                   Rational rational3 = (Rational) it.next();
/* 681 */                   linkedHashMap.put(rational3, (List) mapI00100o1O0lo.get(rational3));
                        }
/* 685 */               if (size != null) {
/* 687 */                   Size size2 = Ol0ilIo.I00000oIO;
/* 697 */                   int height = size.getHeight() * size.getWidth();
/* 702 */                   Iterator it2 = linkedHashMap.keySet().iterator();
/* 710 */                   while (it2.hasNext()) {
/* 722 */                       List<Size> list3 = (List) linkedHashMap.get((Rational) it2.next());
/* 726 */                       ArrayList arrayList4 = new ArrayList();
/* 737 */                       for (Size size3 : list3) {
/* 749 */                           if (Ol0ilIo.I00000oIO(size3) <= height) {
/* 751 */                               arrayList4.add(size3);
                                    }
                                }
/* 755 */                       list3.clear();
/* 758 */                       list3.addAll(arrayList4);
                            }
                        }
/* 762 */               Oi0Oo11I oi0Oo11I = oi0Oliol2.I00000oOI;
/* 764 */               if (oi0Oo11I != null) {
/* 771 */                   Iterator it3 = linkedHashMap.keySet().iterator();
/* 779 */                   while (it3.hasNext()) {
/* 791 */                       List list4 = (List) linkedHashMap.get((Rational) it3.next());
/* 797 */                       if (!list4.isEmpty()) {
/* 800 */                           int i = oi0Oo11I.I00000oOI;
/* 804 */                           if (oi0Oo11I != Oi0Oo11I.I0000Il00O) {
/* 806 */                               Size size4 = oi0Oo11I.I00000oIO;
/* 808 */                               if (i == 0) {
/* 837 */                                   boolean zContains = list4.contains(size4);
/* 841 */                                   list4.clear();
/* 844 */                                   if (zContains) {
/* 846 */                                       list4.add(size4);
                                            }
                                        } else if (i == 1) {
/* 833 */                                   I00111O(list4, size4, true);
                                        } else if (i == 2) {
/* 829 */                                   I00111O(list4, size4, false);
                                        } else if (i == 3) {
/* 825 */                                   I001IIilI0O(list4, size4, true);
                                        } else if (i == 4) {
/* 821 */                                   I001IIilI0O(list4, size4, false);
                                        }
                                    }
                                }
                            }
                        }
/* 852 */               ArrayList arrayList5 = new ArrayList();
/* 859 */               Iterator it4 = linkedHashMap.values().iterator();
/* 867 */               while (it4.hasNext()) {
/* 883 */                   for (Size size5 : (List) it4.next()) {
/* 895 */                       if (!arrayList5.contains(size5)) {
/* 897 */                           arrayList5.add(size5);
                                }
                            }
                        }
/* 1261 */              return arrayList5;
                    }
/* 146 */           II1011i iI1011i = (II1011i) this.I00iio;
/* 148 */           iI1011i.getClass();
/* 155 */           if (arrayList2.isEmpty()) {
/* 157 */               return arrayList2;
                    }
/* 160 */           ArrayList arrayList6 = new ArrayList(arrayList2);
/* 168 */           Collections.sort(arrayList6, new IOi101(true));
/* 173 */           ArrayList arrayList7 = new ArrayList();
/* 176 */           IoiIli1i0Oil ioiIli1i0Oil2 = (IoiIli1i0Oil) oolIl0ii1;
/* 184 */           Size size6 = (Size) ioiIli1i0Oil2.I00000oOI(IoiIli1i0Oil.I001l0I00, null);
/* 190 */           Size size7 = (Size) arrayList6.get(0);
/* 192 */           if (size6 != null) {
/* 207 */               if (Ol0ilIo.I00000oIO(size7) < size6.getHeight() * size6.getWidth()) {
/* 209 */                   size6 = size7;
                        }
                    }
/* 210 */           Size sizeI00000oIO = iI1011i.I00000oIO(ioiIli1i0Oil2);
/* 214 */           Size size8 = Ol0ilIo.I00000oOI;
/* 216 */           int iI00000oIO = Ol0ilIo.I00000oIO(size8);
/* 224 */           if (Ol0ilIo.I00000oIO(size6) < iI00000oIO) {
/* 226 */               size8 = Ol0ilIo.I00000oIO;
                    } else if (sizeI00000oIO != null) {
/* 240 */               if (sizeI00000oIO.getHeight() * sizeI00000oIO.getWidth() < iI00000oIO) {
/* 242 */                   size8 = sizeI00000oIO;
                        }
                    }
/* 243 */           Iterator it5 = arrayList6.iterator();
/* 251 */           while (it5.hasNext()) {
/* 257 */               Size size9 = (Size) it5.next();
/* 272 */               if (Ol0ilIo.I00000oIO(size9) <= size6.getHeight() * size6.getWidth()) {
/* 287 */                   if (size9.getHeight() * size9.getWidth() >= Ol0ilIo.I00000oIO(size8) && !arrayList7.contains(size9)) {
/* 295 */                       arrayList7.add(size9);
                            }
                        }
                    }
/* 303 */           if (arrayList7.isEmpty()) {
/* 553 */               throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size8 + "\nmaxSize = " + size6 + "\ninitial size list: " + arrayList6);
                    }
/* 305 */           I1ioiI i1ioiI = IoiIli1i0Oil.I00111O;
/* 311 */           if (ioiIli1i0Oil2.I000O01llI0(i1ioiI)) {
/* 325 */               rational = I00100l0(((Integer) ioiIli1i0Oil2.I0000O(i1ioiI)).intValue(), iI1011i.I0000Il00O);
                    } else {
/* 330 */               Size sizeI00000oIO2 = iI1011i.I00000oIO(ioiIli1i0Oil2);
/* 334 */               if (sizeI00000oIO2 != null) {
/* 340 */                   Iterator it6 = I000o00OoI0I(arrayList7).iterator();
                            while (true) {
/* 348 */                       if (!it6.hasNext()) {
/* 374 */                           rational = new Rational(sizeI00000oIO2.getWidth(), sizeI00000oIO2.getHeight());
                                    break;
                                }
/* 354 */                       Rational rational4 = (Rational) it6.next();
/* 360 */                       if (I1O0oI0ol.I00000oIO(rational4, sizeI00000oIO2)) {
/* 362 */                           rational = rational4;
                                    break;
                                }
                            }
                        } else {
/* 379 */                   rational = null;
                        }
                    }
/* 380 */           if (sizeI00000oIO == null) {
/* 389 */               sizeI00000oIO = (Size) ioiIli1i0Oil2.I00000oOI(IoiIli1i0Oil.I001iOo1i0O, null);
                    }
/* 393 */           ArrayList arrayList8 = new ArrayList();
/* 398 */           new HashMap();
/* 401 */           if (rational == null) {
/* 403 */               arrayList8.addAll(arrayList7);
/* 406 */               if (sizeI00000oIO != null) {
/* 408 */                   I00111O(arrayList8, sizeI00000oIO, true);
/* 411 */                   return arrayList8;
                        }
                    } else {
/* 412 */               HashMap mapI00100o1O0lo2 = I00100o1O0lo(arrayList7);
/* 416 */               if (sizeI00000oIO != null) {
/* 422 */                   Iterator it7 = mapI00100o1O0lo2.keySet().iterator();
/* 430 */                   while (it7.hasNext()) {
/* 444 */                       I00111O((List) mapI00100o1O0lo2.get((Rational) it7.next()), sizeI00000oIO, true);
                            }
                        }
/* 454 */               ArrayList arrayList9 = new ArrayList(mapI00100o1O0lo2.keySet());
/* 466 */               Collections.sort(arrayList9, new I1O0o0101O(rational, (Rational) iI1011i.I0000O));
/* 469 */               Iterator it8 = arrayList9.iterator();
/* 477 */               while (it8.hasNext()) {
/* 499 */                   for (Size size10 : (List) mapI00100o1O0lo2.get((Rational) it8.next())) {
/* 511 */                       if (!arrayList8.contains(size10)) {
/* 513 */                           arrayList8.add(size10);
                                }
                            }
                        }
                    }
/* 517 */           return arrayList8;
                }

                public void I0010o() {
/* 5 */             ((TypedArray) this.I00iiO).recycle();
                }

                public void I001i1O0Ol(int i, String str) {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_THUMB:
/* 54 */                    String strValueOf = String.valueOf(i);
/* 62 */                    ilO1Iiioio ilo1iiioio = new ilO1Iiioio(21);
/* 69 */                    ((Oo1ol1ll) this.I00iio).I00iio = ilo1iiioio;
/* 71 */                    this.I00iio = ilo1iiioio;
/* 73 */                    ilo1iiioio.I00iiO = strValueOf;
/* 75 */                    ilo1iiioio.I00iiI = str;
                            break;
                        case PoseLandmark.LEFT_HIP:
                        default:
/* 6 */                     String strValueOf2 = String.valueOf(i);
/* 14 */                    ill0o1I1 ill0o1i1 = new ill0o1I1(24);
/* 21 */                    ((Oo1ol1ll) this.I00iio).I00iio = ill0o1i1;
/* 23 */                    this.I00iio = ill0o1i1;
/* 25 */                    ill0o1i1.I00iiO = strValueOf2;
/* 27 */                    ill0o1i1.I00iiI = str;
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 30 */                    String strValueOf3 = String.valueOf(i);
/* 38 */                    iliillIi iliillii = new iliillIi(23);
/* 45 */                    ((OlilOlOiI) this.I00iio).I00iio = iliillii;
/* 47 */                    this.I00iio = iliillii;
/* 49 */                    iliillii.I00iiO = strValueOf3;
/* 51 */                    iliillii.I00iiI = str;
                            break;
                    }
                }

                public byte[] I001i1lo1io(liiI0oII0iO liii0oii0io) {
                    il110I il110i;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 10 */                HashMap map = (HashMap) this.I00iiI;
/* 14 */                HashMap map2 = (HashMap) this.I00iiO;
/* 18 */                iIOo0oiIi1 iioo0oiii1 = (iIOo0oiIi1) this.I00iio;
/* 20 */                il110i = new il110I();
/* 27 */                OOiI1O oOiI1O = new OOiI1O(8);
/* 31 */                oOiI1O.I00000oOI = false;
/* 33 */                oOiI1O.I0000Il00O = false;
/* 35 */                oOiI1O.I0000oI00 = il110i;
/* 37 */                VarHandle.storeStoreFence();
/* 40 */                il110i.I0000oI00 = oOiI1O;
/* 42 */                il110i.I00000oIO = byteArrayOutputStream;
/* 44 */                il110i.I00000oOI = map;
/* 46 */                il110i.I0000Il00O = map2;
/* 48 */                il110i.I0000O = iioo0oiii1;
/* 50 */                VarHandle.storeStoreFence();
/* 59 */                oIOi0lOI = (OIOi0lOI) map.get(liiI0oII0iO.class);
                    } catch (IOException unused) {
                    }
/* 61 */            if (oIOi0lOI == null) {
/* 82 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(liiI0oII0iO.class)));
                    }
/* 63 */            oIOi0lOI.encode(liii0oii0io, il110i);
/* 83 */            return byteArrayOutputStream.toByteArray();
                }

                public byte[] I001iOo1i0O(ll00O01Ooli ll00o01ooli) {
                    iiolO00 iiolo00;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 10 */                HashMap map = (HashMap) this.I00iiI;
/* 14 */                HashMap map2 = (HashMap) this.I00iiO;
/* 18 */                iIOo0oiIi1 iioo0oiii1 = (iIOo0oiIi1) this.I00iio;
/* 20 */                iiolo00 = new iiolO00();
/* 26 */                OOiI1O oOiI1O = new OOiI1O(6);
/* 30 */                oOiI1O.I00000oOI = false;
/* 32 */                oOiI1O.I0000Il00O = false;
/* 34 */                oOiI1O.I0000oI00 = iiolo00;
/* 36 */                VarHandle.storeStoreFence();
/* 39 */                iiolo00.I0000oI00 = oOiI1O;
/* 41 */                iiolo00.I00000oIO = byteArrayOutputStream;
/* 43 */                iiolo00.I00000oOI = map;
/* 45 */                iiolo00.I0000Il00O = map2;
/* 47 */                iiolo00.I0000O = iioo0oiii1;
/* 49 */                VarHandle.storeStoreFence();
/* 58 */                oIOi0lOI = (OIOi0lOI) map.get(ll00O01Ooli.class);
                    } catch (IOException unused) {
                    }
/* 60 */            if (oIOi0lOI == null) {
/* 81 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(ll00O01Ooli.class)));
                    }
/* 62 */            oIOi0lOI.encode(ll00o01ooli, iiolo00);
/* 82 */            return byteArrayOutputStream.toByteArray();
                }

                public byte[] I001l0I00(loo0IlI1li loo0ili1li) {
                    l0i1lOIl l0i1loil;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 10 */                HashMap map = (HashMap) this.I00iiI;
/* 14 */                HashMap map2 = (HashMap) this.I00iiO;
/* 18 */                l0iO10io0IOO l0io10io0ioo = (l0iO10io0IOO) this.I00iio;
/* 20 */                l0i1loil = new l0i1lOIl();
/* 27 */                OOiI1O oOiI1O = new OOiI1O(11);
/* 31 */                oOiI1O.I00000oOI = false;
/* 33 */                oOiI1O.I0000Il00O = false;
/* 35 */                oOiI1O.I0000oI00 = l0i1loil;
/* 37 */                VarHandle.storeStoreFence();
/* 40 */                l0i1loil.I0000oI00 = oOiI1O;
/* 42 */                l0i1loil.I00000oIO = byteArrayOutputStream;
/* 44 */                l0i1loil.I00000oOI = map;
/* 46 */                l0i1loil.I0000Il00O = map2;
/* 48 */                l0i1loil.I0000O = l0io10io0ioo;
/* 50 */                VarHandle.storeStoreFence();
/* 59 */                oIOi0lOI = (OIOi0lOI) map.get(loo0IlI1li.class);
                    } catch (IOException unused) {
                    }
/* 61 */            if (oIOi0lOI == null) {
/* 82 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(loo0IlI1li.class)));
                    }
/* 63 */            oIOi0lOI.encode(loo0ili1li, l0i1loil);
/* 83 */            return byteArrayOutputStream.toByteArray();
                }

                public synchronized void I001lIiIIo1O(int i, int i2, long j, long j2) {
/* 10 */            ((l0olllO1i) this.I00iiI).I00li1OI.getClass();
/* 13 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 19 */            AtomicLong atomicLong = (AtomicLong) this.I00iio;
/* 29 */            if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
/* 46 */                return;
                    }
/* 85 */            o0IiOl o0iiolI0000Il00O = ((i0i01Ii0iII) this.I00iiO).I0000Il00O(new OloOI1o(0, Arrays.asList(new O1lli10oolO(36301, i, 0, j, j2, null, null, 0, i2))));
/* 92 */            Io1OIO1l0o io1OIO1l0o = new Io1OIO1l0o(3);
/* 95 */            io1OIO1l0o.I00iiO = this;
/* 97 */            io1OIO1l0o.I00iiI = jElapsedRealtime;
/* 99 */            VarHandle.storeStoreFence();
/* 102 */           o0iiolI0000Il00O.I0000Il00O(io1OIO1l0o);
                }

                @Override
                public void I00II0oii1o(Throwable th) {
/* 1 */             boolean z = th instanceof CancellationException;
/* 5 */             IIiOOI iIiOOI = (IIiOOI) this.I00iiO;
/* 8 */             if (z) {
/* 29 */                lII1OI11o1I.I0000oI00(null, iIiOOI.I0000O(new Oll01O(((String) this.I00iio).concat(" cancelled."), th)));
                    } else {
/* 33 */                iIiOOI.I00000oOI(null);
                    }
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
/* 4 */             int i = 4;
/* 5 */             int i2 = 6;
/* 7 */             int i3 = 2;
/* 8 */             int i4 = 0;
                    switch (this.I00iOIl) {
                        case 12:
/* 365 */                   ilIoi0 ilioi0 = (ilIoi0) this.I00iiI;
/* 369 */                   il0Oi10O1 il0oi10o1 = (il0Oi10O1) this.I00iiO;
/* 373 */                   il1ioo0oooi il1ioo0oooiVar = (il1ioo0oooi) this.I00iio;
                            try {
/* 375 */                       o0Il0li o0il0li = il0oi10o1.I00000oIO;
/* 379 */                       iii1IIii iii1iiii = new iii1IIii(i4);
/* 382 */                       iii1iiii.I00iiI = iIiOOI;
/* 384 */                       VarHandle.storeStoreFence();
/* 387 */                       liiiO1I1IlI liiio1i1iliI00000oOI = ilioi0.I00000oOI(o0il0li, il1ioo0oooiVar, iii1iiii);
/* 393 */                       iiIiOlII01o1 iiiiolii01o1 = new iiIiOlII01o1(1);
/* 396 */                       iiiiolii01o1.I00iiI = liiio1i1iliI00000oOI;
/* 398 */                       VarHandle.storeStoreFence();
/* 403 */                       iIiOOI.I00000oIO(iiiiolii01o1, ilioi0.I0000O);
/* 406 */                       return "runInferenceFuture";
                            } catch (RemoteException e) {
/* 429 */                       iIiOOI.I0000O(new iOiI1oOo1l(2, 6, "Failed to run inference", e));
/* 6 */                         return null;
                            } catch (RuntimeException e2) {
/* 420 */                       iIiOOI.I0000O(new iOiI1oOo1l(2, 0, "Failed to run inference", e2));
/* 6 */                         return null;
                            }
                        case 13:
/* 293 */                   iiI11l01l iii11l01l = (iiI11l01l) this.I00iiI;
/* 297 */                   il1iII1Oo il1iii1oo = (il1iII1Oo) this.I00iiO;
/* 301 */                   iOolO1ll1I ioolo1ll1i = (iOolO1ll1I) this.I00iio;
                            try {
/* 303 */                       o00iIloIO o00iiloio = il1iii1oo.I00000oIO;
/* 307 */                       i1Il01 i1il01 = new i1Il01(i);
/* 310 */                       i1il01.I00iiI = iIiOOI;
/* 312 */                       VarHandle.storeStoreFence();
/* 315 */                       li0ioOOll li0iooollI0000O = iiI11l01l.I0000O(o00iiloio, ioolo1ll1i, i1il01);
/* 321 */                       iiiOloI1iOl iiioloi1iol = new iiiOloI1iOl(1);
/* 324 */                       iiioloi1iol.I00iiI = li0iooollI0000O;
/* 326 */                       VarHandle.storeStoreFence();
/* 331 */                       iIiOOI.I00000oIO(iiioloi1iol, iii11l01l.I0000O);
/* 334 */                       return "runInferenceFuture";
                            } catch (RemoteException e3) {
/* 357 */                       iIiOOI.I0000O(new iOIIOoOoii(2, 6, "Failed to run inference", e3));
/* 6 */                         return null;
                            } catch (RuntimeException e4) {
/* 348 */                       iIiOOI.I0000O(new iOIIOoOoii(2, 0, "Failed to run inference", e4));
/* 6 */                         return null;
                            }
                        case 17:
/* 195 */                   il0llll00oO il0llll00oo = (il0llll00oO) this.I00iiI;
/* 199 */                   IIiOiI0il iIiOiI0il = (IIiOiI0il) this.I00iiO;
/* 203 */                   illlllioii1 illlllioii1Var = (illlllioii1) this.I00iio;
/* 207 */                   il0II0 il0ii0 = new il0II0(i3);
/* 210 */                   il0ii0.I00iiI = iIiOiI0il;
/* 212 */                   VarHandle.storeStoreFence();
/* 215 */                   Executor executor = iol1Iil.I00iOIl;
/* 217 */                   iIiOOI.I00000oIO(il0ii0, executor);
/* 222 */                   IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(i2);
/* 225 */                   illoOi1I1OO.I00iiI = iIiOOI;
/* 227 */                   illoOi1I1OO.I00iiO = illlllioii1Var;
/* 229 */                   VarHandle.storeStoreFence();
                            synchronized (il0llll00oo.I00000oOI) {
                                try {
/* 237 */                           if (il0llll00oo.I0000O) {
/* 239 */                               illoOi1I1OO.run();
                                    } else {
/* 249 */                               il0llll00oo.I0000Il00O.add(illoOi1I1OO);
                                    }
                                } finally {
                                }
                            }
/* 257 */                   OlilOlOiI olilOlOiI = new OlilOlOiI(18);
/* 260 */                   olilOlOiI.I00iiI = iIiOOI;
/* 262 */                   olilOlOiI.I00iiO = illoOi1I1OO;
/* 264 */                   olilOlOiI.I00iio = il0llll00oo;
/* 266 */                   VarHandle.storeStoreFence();
/* 271 */                   iooili01 iooili01Var = new iooili01(i4);
/* 274 */                   iooili01Var.I00iiI = iIiOiI0il;
/* 276 */                   iooili01Var.I00iiO = olilOlOiI;
/* 278 */                   VarHandle.storeStoreFence();
/* 281 */                   iIiOiI0il.addListener(iooili01Var, executor);
/* 284 */                   return "FailureSignal.propagate";
                        case PoseLandmark.RIGHT_KNEE:
/* 111 */                   l00Oi001i1l l00oi001i1l = (l00Oi001i1l) this.I00iio;
/* 115 */                   ioii01Ii100 ioii01ii100 = (ioii01Ii100) this.I00iiI;
/* 117 */                   Object obj = this.I00iiO;
/* 119 */                   ioii01ii100.getClass();
                            try {
/* 133 */                       iOio1i0 ioio1i0I0000oI00 = ioii01ii100.I0000oI00(obj, l00oi001i1l.I00000oIO, new io0O1l(ioii01ii100, iIiOOI, 0));
/* 139 */                       io1O1OoO1 io1o1ooo1 = new io1O1OoO1(2);
/* 142 */                       io1o1ooo1.I00iiI = ioio1i0I0000oI00;
/* 144 */                       VarHandle.storeStoreFence();
/* 149 */                       iIiOOI.I00000oIO(io1o1ooo1, ioii01ii100.I0000O);
/* 152 */                       return "getTokenInfoFuture";
                            } catch (RemoteException e5) {
/* 178 */                       Log.e("ioii01Ii100", "Failed to tokenize the input query.", e5);
/* 189 */                       iIiOOI.I0000O(new ilIoOl(5, 6, "Failed to tokenize the input query.", e5, null));
/* 6 */                         return null;
                            } catch (RuntimeException e6) {
/* 163 */                       Log.e("ioii01Ii100", "Failed to tokenize the input query.", e6);
/* 174 */                       iIiOOI.I0000O(new ilIoOl(5, 0, "Failed to tokenize the input query.", e6, null));
/* 6 */                         return null;
                            }
                        default:
/* 14 */                    il0llll00oO il0llll00oo2 = (il0llll00oO) this.I00iiI;
/* 18 */                    IIiOiI0il iIiOiI0il2 = (IIiOiI0il) this.I00iiO;
/* 22 */                    lIi1Illloi lii1illloi = (lIi1Illloi) this.I00iio;
/* 26 */                    il0II0 il0ii02 = new il0II0(i);
/* 29 */                    il0ii02.I00iiI = iIiOiI0il2;
/* 31 */                    VarHandle.storeStoreFence();
/* 34 */                    Executor executor2 = liI1iIi1IllO.I00iOIl;
/* 36 */                    iIiOOI.I00000oIO(il0ii02, executor2);
/* 42 */                    IlloOi1I1OO illoOi1I1OO2 = new IlloOi1I1OO(7);
/* 45 */                    illoOi1I1OO2.I00iiI = iIiOOI;
/* 47 */                    illoOi1I1OO2.I00iiO = lii1illloi;
/* 49 */                    VarHandle.storeStoreFence();
                            synchronized (il0llll00oo2.I00000oOI) {
                                try {
/* 57 */                            if (il0llll00oo2.I0000O) {
/* 59 */                                illoOi1I1OO2.run();
                                    } else {
/* 69 */                                il0llll00oo2.I0000Il00O.add(illoOi1I1OO2);
                                    }
                                } finally {
                                }
                            }
/* 77 */                    Oo1ol1ll oo1ol1ll = new Oo1ol1ll(27);
/* 80 */                    oo1ol1ll.I00iiI = iIiOOI;
/* 82 */                    oo1ol1ll.I00iiO = illoOi1I1OO2;
/* 84 */                    oo1ol1ll.I00iio = il0llll00oo2;
/* 86 */                    VarHandle.storeStoreFence();
/* 91 */                    liOO1i1 lioo1i1 = new liOO1i1(i4);
/* 94 */                    lioo1i1.I00iiI = iIiOiI0il2;
/* 96 */                    lioo1i1.I00iiO = oo1ol1ll;
/* 98 */                    VarHandle.storeStoreFence();
/* 101 */                   iIiOiI0il2.addListener(lioo1i1, executor2);
/* 104 */                   return "FailureSignal.propagate";
                    }
                }

                public Object clone() {
                    switch (this.I00iOIl) {
                        case 9:
/* 17 */                    i1IO0oi1I i1io0oi1iI00000oIO = ((i1IO0oi1I) this.I00iiI).clone();
/* 23 */                    OlilOlOiI olilOlOiI = new OlilOlOiI(9);
/* 26 */                    olilOlOiI.I00iiI = i1io0oi1iI00000oIO;
/* 32 */                    olilOlOiI.I00iiO = i1io0oi1iI00000oIO.clone();
/* 39 */                    olilOlOiI.I00iio = new ArrayList();
/* 45 */                    Iterator it = ((ArrayList) this.I00iio).iterator();
/* 53 */                    while (it.hasNext()) {
/* 69 */                        ((ArrayList) olilOlOiI.I00iio).add(((i1IO0oi1I) it.next()).clone());
                            }
/* 73 */                    return olilOlOiI;
                        default:
/* 6 */                     return super.clone();
                    }
                }

                @Override
                public void onComplete(OloIIoII1oo oloIIoII1oo) {
/* 6 */             ((O1oo1il01OoO) this.I00iiI).removeCallbacksAndMessages(null);
/* 11 */            OloIlI0ll oloIlI0ll = (OloIlI0ll) this.I00iiO;
/* 17 */            if (oloIIoII1oo.I000OOo1O()) {
/* 23 */                oloIlI0ll.I0000O(oloIIoII1oo.I000II());
                    } else {
/* 32 */                if (((o0IiOl) oloIIoII1oo).I0000O) {
/* 40 */                    ((iOoIlOOO0) this.I00iio).I00000oIO.I000o00OoI0I(null);
/* 43 */                    return;
                        }
/* 44 */                Exception excI0001Ioi1lo = oloIIoII1oo.I0001Ioi1lo();
/* 48 */                Objects.requireNonNull(excI0001Ioi1lo);
/* 51 */                oloIlI0ll.I0000Il00O(excI0001Ioi1lo);
                    }
                }

                public String toString() {
/* 10 */            String str = "";
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_INDEX:
/* 293 */                   StringBuilder sb = new StringBuilder(32);
/* 300 */                   sb.append((String) this.I00iiI);
/* 303 */                   sb.append('{');
/* 312 */                   OlilOlOiI olilOlOiI = (OlilOlOiI) ((OlilOlOiI) this.I00iiO).I00iio;
/* 314 */                   while (olilOlOiI != null) {
/* 316 */                       Object obj = olilOlOiI.I00iiO;
/* 318 */                       sb.append(str);
/* 323 */                       String str2 = (String) olilOlOiI.I00iiI;
/* 325 */                       if (str2 != null) {
/* 327 */                           sb.append(str2);
/* 330 */                           sb.append('=');
                                }
/* 333 */                       if (obj == null || !obj.getClass().isArray()) {
/* 363 */                           sb.append(obj);
                                } else {
/* 359 */                           sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                                }
/* 368 */                       olilOlOiI = (OlilOlOiI) olilOlOiI.I00iio;
/* 5 */                         str = ", ";
                            }
/* 372 */                   sb.append('}');
/* 375 */                   return sb.toString();
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        default:
/* 19 */                    return super.toString();
                        case PoseLandmark.RIGHT_THUMB:
/* 204 */                   StringBuilder sb2 = new StringBuilder(32);
/* 211 */                   sb2.append((String) this.I00iiI);
/* 214 */                   sb2.append('{');
/* 223 */                   Oo1ol1ll oo1ol1ll = (Oo1ol1ll) ((Oo1ol1ll) this.I00iiO).I00iio;
/* 225 */                   while (oo1ol1ll != null) {
/* 227 */                       Object obj2 = oo1ol1ll.I00iiO;
/* 229 */                       sb2.append(str);
/* 234 */                       String str3 = (String) oo1ol1ll.I00iiI;
/* 236 */                       if (str3 != null) {
/* 238 */                           sb2.append(str3);
/* 241 */                           sb2.append('=');
                                }
/* 244 */                       if (obj2 == null || !obj2.getClass().isArray()) {
/* 274 */                           sb2.append(obj2);
                                } else {
/* 270 */                           sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                                }
/* 279 */                       oo1ol1ll = (Oo1ol1ll) oo1ol1ll.I00iio;
/* 5 */                         str = ", ";
                            }
/* 283 */                   sb2.append('}');
/* 286 */                   return sb2.toString();
                        case PoseLandmark.RIGHT_HIP:
/* 115 */                   StringBuilder sb3 = new StringBuilder(32);
/* 122 */                   sb3.append((String) this.I00iiI);
/* 125 */                   sb3.append('{');
/* 134 */                   OlilOlOiI olilOlOiI2 = (OlilOlOiI) ((OlilOlOiI) this.I00iiO).I00iio;
/* 136 */                   while (olilOlOiI2 != null) {
/* 138 */                       Object obj3 = olilOlOiI2.I00iiO;
/* 140 */                       sb3.append(str);
/* 145 */                       String str4 = (String) olilOlOiI2.I00iiI;
/* 147 */                       if (str4 != null) {
/* 149 */                           sb3.append(str4);
/* 152 */                           sb3.append('=');
                                }
/* 155 */                       if (obj3 == null || !obj3.getClass().isArray()) {
/* 185 */                           sb3.append(obj3);
                                } else {
/* 181 */                           sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj3}), 1, r5.length() - 1);
                                }
/* 190 */                       olilOlOiI2 = (OlilOlOiI) olilOlOiI2.I00iio;
/* 5 */                         str = ", ";
                            }
/* 194 */                   sb3.append('}');
/* 197 */                   return sb3.toString();
                        case PoseLandmark.LEFT_KNEE:
/* 26 */                    StringBuilder sb4 = new StringBuilder(32);
/* 33 */                    sb4.append((String) this.I00iiI);
/* 36 */                    sb4.append('{');
/* 45 */                    Oo1ol1ll oo1ol1ll2 = (Oo1ol1ll) ((Oo1ol1ll) this.I00iiO).I00iio;
/* 47 */                    while (oo1ol1ll2 != null) {
/* 49 */                        Object obj4 = oo1ol1ll2.I00iiO;
/* 51 */                        sb4.append(str);
/* 56 */                        String str5 = (String) oo1ol1ll2.I00iiI;
/* 58 */                        if (str5 != null) {
/* 60 */                            sb4.append(str5);
/* 63 */                            sb4.append('=');
                                }
/* 66 */                        if (obj4 == null || !obj4.getClass().isArray()) {
/* 96 */                            sb4.append(obj4);
                                } else {
/* 92 */                            sb4.append((CharSequence) Arrays.deepToString(new Object[]{obj4}), 1, r5.length() - 1);
                                }
/* 101 */                       oo1ol1ll2 = (Oo1ol1ll) oo1ol1ll2.I00iio;
/* 5 */                         str = ", ";
                            }
/* 105 */                   sb4.append('}');
/* 108 */                   return sb4.toString();
                    }
                }

                @Override
                public void zza(Throwable th) {
                    switch (this.I00iOIl) {
                        case 16:
/* 100 */                   IIiOOI iIiOOI = (IIiOOI) this.I00iiI;
/* 104 */                   if (th instanceof iOlI0O0iIiO) {
/* 106 */                       iIiOOI.I0000O(th);
                            } else if (th instanceof CancellationException) {
/* 118 */                       iIiOOI.I0000O(iOlI0O0iIiO.I00000oIO("Operation was cancelled.", th, 7));
                            } else {
/* 126 */                       iIiOOI.I0000O(iOlI0O0iIiO.I00000oIO("AiCore request could not be completed.", th, 0));
                            }
/* 137 */                   il0llll00oO.I000OiO((il0llll00oO) this.I00iio, (liOO1i1) this.I00iiO);
                            break;
                        case 17:
                        default:
/* 14 */                    IIiOOI iIiOOI2 = (IIiOOI) this.I00iiI;
/* 18 */                    if (th instanceof iOIIOoOoii) {
/* 20 */                        iIiOOI2.I0000O(th);
                            } else if (th instanceof CancellationException) {
/* 32 */                        iIiOOI2.I0000O(iOIIOoOoii.I00000oIO("Operation was cancelled.", th, 7));
                            } else {
/* 40 */                        iIiOOI2.I0000O(iOIIOoOoii.I00000oIO("AiCore request could not be completed.", th, 0));
                            }
/* 51 */                    il0llll00oO.I000OOo1O((il0llll00oO) this.I00iio, (iooiio1i0) this.I00iiO);
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 57 */                    IIiOOI iIiOOI3 = (IIiOOI) this.I00iiI;
/* 61 */                    if (th instanceof iOiIOO1ll) {
/* 63 */                        iIiOOI3.I0000O(th);
                            } else if (th instanceof CancellationException) {
/* 75 */                        iIiOOI3.I0000O(iOiIOO1ll.I00000oIO("Operation was cancelled.", th, 7));
                            } else {
/* 83 */                        iIiOOI3.I0000O(iOiIOO1ll.I00000oIO("AiCore request could not be completed.", th, 0));
                            }
/* 94 */                    il0llll00oO.I000O01llI0((il0llll00oO) this.I00iio, (IlloOi1I1OO) this.I00iiO);
                            break;
                    }
                }

                @Override
                public boolean zzb() {
                    String str;
                    iI0IO110Iil ii0io110iil;
                    String strI0001Ioi1lo;
                    iOlii1iOOil iolii1iooil;
                    String strI0001Ioi1lo2;
                    iI0IO110Iil ii0io110iilI0000O;
                    String strI0001Ioi1lo3;
                    boolean z;
                    IoiOloi ioiOloi;
                    int i;
                    iOiooo0O1l ioiooo0o1l;
                    String strI00iiI;
/* 5 */             iOliiiI1 ioliiii1 = (iOliiiI1) this.I00iiI;
/* 9 */             iOlii1iOOil iolii1iooil2 = (iOlii1iOOil) this.I00iiO;
/* 14 */            i0O1001OIi i0o1001oii = (i0O1001OIi) this.I00iio;
/* 16 */            i11I1Ili i11i1ili = ioliiii1.I0000O;
/* 28 */            String str2 = ioliiii1.I0000oI00;
/* 30 */            IliIlOOIoIo iliIlOOIoIo = ioliiii1.I00000oIO;
/* 32 */            iliIlOOIoIo.getClass();
/* 48 */            String str3 = str2 + "/projects/722550545529/installations";
/* 56 */            ArrayList arrayList = new ArrayList(20);
/* 59 */            String str4 = iliIlOOIoIo.I00iiI;
/* 63 */            illliIoo1l0O.I00000oIO("x-goog-api-key");
/* 66 */            illliIoo1l0O.I00000oOI(str4, "x-goog-api-key");
/* 69 */            arrayList.add("x-goog-api-key");
/* 80 */            arrayList.add(OlOoOIi0o.I00OIo(str4).toString());
/* 94 */            Io1Io0OOi011 io1Io0OOi011 = new Io1Io0OOi011((String[]) arrayList.toArray(new String[0]));
/* 103 */           String strI000lI = IlIi0I0.I000lI("{fid: '", iolii1iooil2.I00000oIO, "', appId: '1:722550545529:android:82c62205f0ef0ea96608a8', authVersion: 'FIS_v2', sdkVersion: 'o:a:mlkit:1.0.0'}");
/* 107 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 113 */           i0O1001OIi i0o1001oii2 = new i0O1001OIi();
/* 118 */           lIO0IIo lio0iio = (lIO0IIo) i0o1001oii2.I0000O;
/* 126 */           i0o1001oii2.I00000oIO = SystemClock.elapsedRealtime();
/* 130 */           I00Ol00 i00Ol00I0000O = I00Ol00.I0000O(iOliiiI1.I0001Ioi1lo, strI000lI);
/* 138 */           I1ii1o0 i1ii1o0 = new I1ii1o0(14);
/* 145 */           i1ii1o0.I00iio = io1Io0OOi011.I000OOo1O();
/* 147 */           i1ii1o0.I00IoiI(str3);
/* 152 */           i1ii1o0.I00Io1lO("POST", i00Ol00I0000O);
/* 155 */           I0Oi111ii i0Oi111iiI00100o1O0lo = i1ii1o0.I00100o1O0lo();
/* 159 */           OIOlo0OloOi oIOlo0OloOi = ioliiii1.I00000oOI;
/* 161 */           oIOlo0OloOi.getClass();
                    try {
/* 169 */               Oi1001l0Il oi1001l0IlI0000oI00 = new OOlioiIOOO1(oIOlo0OloOi, i0Oi111iiI00100o1O0lo).I0000oI00();
/* 173 */               ioiOloi = oi1001l0IlI0000oI00.I00io1l;
/* 175 */               i = oi1001l0IlI0000oI00.I00iio;
/* 177 */               i0o1001oii2.I0000Il00O = i;
/* 181 */               ioiooo0o1l = iOiooo0O1l.RPC_ERROR;
                    } catch (IOException e) {
/* 332 */               Log.e("MLKitFbInstsRestClient", "Connection error (or timeout) sending HTTPS POST request to <" + str3 + ">", e);
/* 335 */               iOiooo0O1l ioiooo0o1l2 = iOiooo0O1l.NO_CONNECTION;
/* 337 */               lio0iio.I000O01llI0(ioiooo0o1l2);
/* 344 */               ((lIO0IIo) i0o1001oii.I0001Ioi1lo).I000O01llI0(ioiooo0o1l2);
                    }
/* 183 */           if (i >= 200) {
                        try {
/* 187 */                   if (i < 300) {
                                try {
/* 190 */                           String strI00iiI2 = ioiOloi.I00iiI();
/* 194 */                           ioiOloi.close();
/* 197 */                           str = strI00iiI2;
                                } finally {
                                }
                            }
/* 272 */                   Log.e("MLKitFbInstsRestClient", "Got HTTP status " + i + " from HTTPS POST request to <" + str3 + ">");
                        } catch (IOException e2) {
/* 232 */                   Log.e("MLKitFbInstsRestClient", "Error retrieving response body from HTTPS POST request to <" + str3 + ">", e2);
/* 235 */                   lio0iio.I000O01llI0(ioiooo0o1l);
/* 242 */                   ((lIO0IIo) i0o1001oii.I0001Ioi1lo).I000O01llI0(ioiooo0o1l);
                        }
                        try {
                            try {
/* 275 */                       strI00iiI = ioiOloi.I00iiI();
/* 279 */                       ioiOloi.close();
                            } catch (IOException unused) {
/* 296 */                       strI00iiI = "<none>";
                            }
/* 300 */                   "HTTP Response Body:\n".concat(strI00iiI);
/* 303 */                   lio0iio.I000O01llI0(ioiooo0o1l);
/* 310 */                   ((lIO0IIo) i0o1001oii.I0001Ioi1lo).I000O01llI0(ioiooo0o1l);
/* 245 */                   str = null;
                        } finally {
/* 285 */                   if (ioiOloi == null) {
/* 295 */                       throw th;
                            }
                            try {
/* 287 */                       ioiOloi.close();
/* 295 */                       throw th;
                            } catch (Throwable th) {
/* 292 */                       th.addSuppressed(th);
                            }
                        }
                    } else {
/* 272 */               Log.e("MLKitFbInstsRestClient", "Got HTTP status " + i + " from HTTPS POST request to <" + str3 + ">");
/* 275 */               strI00iiI = ioiOloi.I00iiI();
/* 279 */               ioiOloi.close();
/* 300 */               "HTTP Response Body:\n".concat(strI00iiI);
/* 303 */               lio0iio.I000O01llI0(ioiooo0o1l);
/* 310 */               ((lIO0IIo) i0o1001oii.I0001Ioi1lo).I000O01llI0(ioiooo0o1l);
/* 245 */               str = null;
                    }
/* 348 */           i0o1001oii2.I00000oIO();
/* 351 */           if (str == null) {
/* 353 */               z = false;
                    } else {
                        try {
                            try {
/* 360 */                       iI0IO110Iil ii0io110iilI00000oOI = lii0olO.I00000oOI(str).I00000oOI();
                                try {
/* 370 */                           strI0001Ioi1lo = ii0io110iilI00000oOI.I0000oI00("name").I0001Ioi1lo();
/* 386 */                           iolii1iooil = new iOlii1iOOil(ii0io110iilI00000oOI.I0000oI00("fid").I0001Ioi1lo());
/* 395 */                           strI0001Ioi1lo2 = ii0io110iilI00000oOI.I0000oI00("refreshToken").I0001Ioi1lo();
/* 399 */                           ii0io110iilI0000O = ii0io110iilI00000oOI.I0000O();
/* 409 */                           strI0001Ioi1lo3 = ii0io110iilI0000O.I0000oI00("token").I0001Ioi1lo();
/* 425 */                           ii0io110iil = ii0io110iilI00000oOI;
                                } catch (ClassCastException | IllegalStateException | NullPointerException e3) {
/* 478 */                           e = e3;
/* 479 */                           ii0io110iil = ii0io110iilI00000oOI;
                                }
                            } catch (iI0Iol1l | IllegalStateException | NullPointerException e4) {
/* 551 */                       Log.e("MLKitFbInstsRestClient", "Error parsing JSON object returned from <" + str3 + ">:\n" + str, e4);
/* 554 */                       iOiooo0O1l ioiooo0o1l3 = iOiooo0O1l.RPC_RETURNED_MALFORMED_RESULT;
/* 556 */                       lio0iio.I000O01llI0(ioiooo0o1l3);
/* 563 */                       ((lIO0IIo) i0o1001oii.I0001Ioi1lo).I000O01llI0(ioiooo0o1l3);
                            }
                            try {
/* 441 */                       long j = (Long.parseLong(ii0io110iilI0000O.I0000oI00("expiresIn").I0001Ioi1lo().replaceFirst("s$", "")) * 1000) + jCurrentTimeMillis;
/* 455 */                       Log.i("MLKitFbInstsRestClient", "installation name: " + strI0001Ioi1lo);
/* 458 */                       String.valueOf(ii0io110iilI0000O);
/* 470 */                       ioliiii1.I0000Il00O = new IioiI0IIIIO(j, iolii1iooil, strI0001Ioi1lo2, strI0001Ioi1lo3);
/* 472 */                       z = true;
                            } catch (ClassCastException | IllegalStateException | NullPointerException e5) {
/* 476 */                       e = e5;
/* 513 */                       Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from url <" + str3 + ">:\nraw json:\n" + str + "\nparsed json:\n" + ii0io110iil.toString(), e);
/* 516 */                       iOiooo0O1l ioiooo0o1l4 = iOiooo0O1l.RPC_RETURNED_INVALID_RESULT;
/* 518 */                       lio0iio.I000O01llI0(ioiooo0o1l4);
/* 525 */                       ((lIO0IIo) i0o1001oii.I0001Ioi1lo).I000O01llI0(ioiooo0o1l4);
/* 353 */                       z = false;
/* 573 */                       return z;
                            }
                        } finally {
/* 576 */                   i11i1ili.I0000O(iOIo11i.INSTALLATION_ID_FIS_CREATE_INSTALLATION, i0o1001oii2);
                        }
                    }
/* 573 */           return z;
                }

/* 112 */       public OlilOlOiI(String str, Ii11I1OOII1 ii11I1OOII1) {
                    this.I00iOIl = 7;
                    this.I00iio = new Bundle();
                    this.I00iiI = str;
                    this.I00iiO = ii11I1OOII1;
                }

/* 113 */       public OlilOlOiI(Context context, TypedArray typedArray) {
                    this.I00iOIl = 2;
/* 115 */           this.I00iiI = context;
/* 116 */           this.I00iiO = typedArray;
                }

/* 116 */       public OlilOlOiI(int i) {
/* 117 */           this.I00iOIl = i;
                }

/* 117 */       public OlilOlOiI() {
                    this.I00iOIl = 5;
/* 119 */           List list = Collections.EMPTY_LIST;
                    this.I00iiI = list;
/* 120 */           this.I00iiO = list;
                }

                @Override
/* 579 */       public void zzb(Object obj) {
                    switch (this.I00iOIl) {
                        case 16:
/* 584 */                   ((IIiOOI) this.I00iiI).I00000oOI(obj);
/* 585 */                   il0llll00oO.I000OiO((il0llll00oO) this.I00iio, (liOO1i1) this.I00iiO);
                            break;
                        case 17:
                        default:
/* 580 */                   ((IIiOOI) this.I00iiI).I00000oOI(obj);
/* 581 */                   il0llll00oO.I000OOo1O((il0llll00oO) this.I00iio, (iooiio1i0) this.I00iiO);
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 582 */                   ((IIiOOI) this.I00iiI).I00000oOI(obj);
/* 583 */                   il0llll00oO.I000O01llI0((il0llll00oO) this.I00iio, (IlloOi1I1OO) this.I00iiO);
                            break;
                    }
                }
            }
