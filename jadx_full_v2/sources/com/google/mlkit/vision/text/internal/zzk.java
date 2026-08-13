            package com.google.mlkit.vision.text.internal;

            import android.graphics.Matrix;
            import android.graphics.Point;
            import android.graphics.Rect;
            import android.util.SparseArray;
            import com.google.mlkit.vision.text.Text;
            import java.lang.invoke.VarHandle;
            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import p000.ii1101o1o0o1;
            import p000.ii1i1oI1o1O0;
            import p000.iilOoOO00;
            import p000.io0oOoOi0o;
            import p000.lIOl1OOi;
            import p000.lilOlilOOi;
            import p000.ll1iOi;
            import p000.lli0oio0;
            import p000.lolii010oOiI;
            import p000.o00i10i;
            
            final class zzk {
                static final o00i10i zza;
                public static final int zzb = 0;
                private static final Comparator zzc;

                static {
/* 3 */             o00i10i o00i10iVar = new o00i10i();
/* 6 */             VarHandle.storeStoreFence();
/* 9 */             zza = o00i10iVar;
/* 16 */            zzc = new Comparator() {
                        @Override
                        public final int compare(Object obj, Object obj2) {
/* 5 */                     int i = zzk.zzb;
/* 19 */                    return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
                        }
                    };
                }

                public static Text zza(lIOl1OOi[] liol1ooiArr, final Matrix matrix) {
                    boolean z;
/* 5 */             SparseArray sparseArray = new SparseArray();
/* 9 */             int i = 0;
/* 11 */            for (lIOl1OOi liol1ooi : liol1ooiArr) {
/* 21 */                SparseArray sparseArray2 = (SparseArray) sparseArray.get(liol1ooi.I00l0OO0IO);
/* 23 */                if (sparseArray2 == null) {
/* 27 */                    sparseArray2 = new SparseArray();
/* 32 */                    sparseArray.append(liol1ooi.I00l0OO0IO, sparseArray2);
                        }
/* 37 */                sparseArray2.append(liol1ooi.I00li1OI, liol1ooi);
                    }
/* 43 */            int i2 = 4;
/* 44 */            Object[] objArrCopyOf = new Object[4];
/* 46 */            int i3 = 0;
/* 47 */            int i4 = 0;
/* 52 */            while (i3 < sparseArray.size()) {
/* 58 */                SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i3);
/* 60 */                Object[] objArrCopyOf2 = new Object[i2];
/* 62 */                int i5 = i;
/* 63 */                int i6 = i5;
                        while (true) {
/* 68 */                    z = true;
/* 69 */                    if (i5 >= sparseArray3.size()) {
                                break;
                            }
/* 75 */                    lIOl1OOi liol1ooi2 = (lIOl1OOi) sparseArray3.valueAt(i5);
/* 77 */                    liol1ooi2.getClass();
/* 80 */                    int i7 = i6 + 1;
/* 82 */                    int length = objArrCopyOf2.length;
/* 83 */                    if (length < i7) {
/* 88 */                        int i8 = length + (length >> 1) + 1;
/* 89 */                        if (i8 < i7) {
/* 91 */                            int iHighestOneBit = Integer.highestOneBit(i6);
/* 95 */                            i8 = iHighestOneBit + iHighestOneBit;
                                }
/* 104 */                       objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, i8 < 0 ? Integer.MAX_VALUE : i8);
                            }
/* 108 */                   objArrCopyOf2[i6] = liol1ooi2;
/* 110 */                   i5++;
/* 112 */                   i6 = i7;
                        }
/* 114 */               iilOoOO00 iiloooo00I001iOo1i0O = ii1i1oI1o1O0.I001iOo1i0O(i6, objArrCopyOf2);
/* 125 */               AbstractList abstractListI00000oIO = lilOlilOOi.I00000oIO(iiloooo00I001iOo1i0O, new lolii010oOiI() {
                            @Override
                            public final Object zza(Object obj) {
/* 1 */                         lIOl1OOi liol1ooi3 = (lIOl1OOi) obj;
/* 3 */                         int i9 = zzk.zzb;
/* 5 */                         io0oOoOi0o io0ooooi0o = liol1ooi3.I00iiI;
/* 7 */                         String str = liol1ooi3.I00io1l;
/* 9 */                         List listZzb = zza.zzb(io0ooooi0o);
/* 15 */                        String str2 = liol1ooi3.I00ilI0I1;
/* 21 */                        if (ll1iOi.I00000oOI(str2)) {
/* 23 */                            str2 = "";
                                }
/* 25 */                        String str3 = str2;
/* 26 */                        Rect rectZza = zza.zza(listZzb);
/* 34 */                        if (ll1iOi.I00000oOI(str)) {
/* 36 */                            str = "und";
                                }
/* 39 */                        final Matrix matrix2 = matrix;
/* 62 */                        return new Text.Line(str3, rectZza, listZzb, str, matrix2, lilOlilOOi.I00000oIO(Arrays.asList(liol1ooi3.I00iOIl), new lolii010oOiI() {
                                    @Override
                                    public final Object zza(Object obj2) {
/* 1 */                                 lli0oio0 lli0oio0Var = (lli0oio0) obj2;
/* 3 */                                 int i10 = zzk.zzb;
/* 5 */                                 io0oOoOi0o io0ooooi0o2 = lli0oio0Var.I00iiI;
/* 7 */                                 String str4 = lli0oio0Var.I00ilO0;
/* 9 */                                 List listZzb2 = zza.zzb(io0ooooi0o2);
/* 15 */                                String str5 = lli0oio0Var.I00iio;
/* 21 */                                if (ll1iOi.I00000oOI(str5)) {
/* 23 */                                    str5 = "";
                                        }
/* 25 */                                String str6 = str5;
/* 26 */                                Rect rectZza2 = zza.zza(listZzb2);
/* 34 */                                if (ll1iOi.I00000oOI(str4)) {
/* 36 */                                    str4 = "und";
                                        }
/* 39 */                                Matrix matrix3 = matrix2;
/* 41 */                                float f = lli0oio0Var.I00ilI0I1;
/* 45 */                                float f2 = lli0oio0Var.I00iiI.I00ilI0I1;
/* 47 */                                ii1101o1o0o1 ii1101o1o0o1Var = ii1i1oI1o1O0.I00lll10;
/* 51 */                                return new Text.Element(str6, rectZza2, listZzb2, str4, matrix3, f, f2, iilOoOO00.I00o101lO);
                                    }
                                }), liol1ooi3.I00ilO0, liol1ooi3.I00iiI.I00ilI0I1);
                            }
                        });
/* 135 */               io0oOoOi0o io0ooooi0o = ((lIOl1OOi) iiloooo00I001iOo1i0O.get(i)).I00iiI;
/* 137 */               ii1101o1o0o1 ii1101o1o0o1VarListIterator = iiloooo00I001iOo1i0O.listIterator(i);
/* 141 */               int iMax = Integer.MIN_VALUE;
/* 143 */               int iMax2 = Integer.MIN_VALUE;
/* 144 */               int iMin = Integer.MAX_VALUE;
/* 147 */               int iMin2 = Integer.MAX_VALUE;
/* 154 */               while (ii1101o1o0o1VarListIterator.hasNext()) {
/* 160 */                   int i9 = i;
/* 166 */                   io0oOoOi0o io0ooooi0o2 = ((lIOl1OOi) ii1101o1o0o1VarListIterator.next()).I00iiI;
/* 168 */                   int i10 = io0ooooi0o.I00iOIl;
/* 170 */                   boolean z2 = z;
/* 172 */                   float f = io0ooooi0o.I00ilI0I1;
/* 177 */                   int i11 = -io0ooooi0o.I00iiI;
/* 178 */                   int i12 = i3;
/* 180 */                   int i13 = i4;
                            double d = f;
/* 187 */                   double dSin = Math.sin(Math.toRadians(d));
/* 195 */                   double dCos = Math.cos(Math.toRadians(d));
/* 199 */                   SparseArray sparseArray4 = sparseArray;
/* 202 */                   Point[] pointArr = new Point[4];
/* 208 */                   int i14 = io0ooooi0o2.I00iOIl;
/* 212 */                   int i15 = io0ooooi0o2.I00iio;
/* 214 */                   int i16 = io0ooooi0o2.I00iiO;
/* 218 */                   Point point = new Point(i14, io0ooooi0o2.I00iiI);
/* 221 */                   pointArr[i9] = point;
/* 223 */                   point.offset(-i10, i11);
/* 226 */                   Point point2 = pointArr[i9];
/* 228 */                   int i17 = point2.x;
/* 233 */                   double d2 = point2.y;
/* 250 */                   int i18 = (int) ((i17 * dCos) + (d2 * dSin));
/* 251 */                   point2.x = i18;
/* 255 */                   int i19 = (int) (((-i17) * dSin) + (d2 * dCos));
/* 256 */                   point2.y = i19;
/* 260 */                   int i20 = i16 + i18;
/* 264 */                   pointArr[z2 ? 1 : 0] = new Point(i20, i19);
/* 268 */                   int i21 = i19 + i15;
/* 274 */                   pointArr[2] = new Point(i20, i21);
/* 282 */                   pointArr[3] = new Point(i18, i21);
/* 287 */                   for (int i22 = i9; i22 < 4; i22++) {
/* 289 */                       Point point3 = pointArr[i22];
/* 293 */                       iMin = Math.min(iMin, point3.x);
/* 299 */                       iMax = Math.max(iMax, point3.x);
/* 305 */                       iMin2 = Math.min(iMin2, point3.y);
/* 311 */                       iMax2 = Math.max(iMax2, point3.y);
                            }
/* 319 */                   i = i9;
/* 321 */                   z = z2 ? 1 : 0;
/* 323 */                   i3 = i12;
/* 325 */                   i4 = i13;
/* 327 */                   sparseArray = sparseArray4;
                        }
/* 331 */               SparseArray sparseArray5 = sparseArray;
/* 333 */               int i23 = i;
/* 335 */               int i24 = i3;
/* 337 */               int i25 = i4;
/* 341 */               int i26 = io0ooooi0o.I00iOIl;
/* 343 */               float f2 = io0ooooi0o.I00ilI0I1;
/* 345 */               int i27 = io0ooooi0o.I00iiI;
                        double d3 = f2;
/* 352 */               double dSin2 = Math.sin(Math.toRadians(d3));
/* 360 */               double dCos2 = Math.cos(Math.toRadians(d3));
/* 384 */               Point[] pointArr2 = {new Point(iMin, iMin2), new Point(iMax, iMin2), new Point(iMax, iMax2), new Point(iMin, iMax2)};
/* 388 */               int i28 = i23;
/* 391 */               while (i28 < 4) {
/* 393 */                   Point point4 = pointArr2[i28];
/* 395 */                   double d4 = point4.x;
/* 398 */                   double d5 = d4 * dCos2;
/* 402 */                   double d6 = dCos2;
/* 400 */                   double d7 = point4.y;
/* 415 */                   point4.x = (int) (d5 - (d7 * dSin2));
/* 420 */                   point4.y = (int) ((d4 * dSin2) + (d7 * d6));
/* 422 */                   point4.offset(i26, i27);
/* 425 */                   i28++;
/* 427 */                   dCos2 = d6;
                        }
/* 430 */               List listAsList = Arrays.asList(pointArr2);
/* 436 */               o00i10i o00i10iVar = zza;
/* 443 */               AbstractList abstractListI00000oIO2 = lilOlilOOi.I00000oIO(abstractListI00000oIO, new lolii010oOiI() {
                            @Override
                            public final Object zza(Object obj) {
/* 3 */                         return ((Text.Line) obj).getText();
                            }
                        });
/* 447 */               o00i10iVar.getClass();
/* 466 */               Text.TextBlock textBlock = new Text.TextBlock(o00i10i.I00000oIO(abstractListI00000oIO2), zza.zza(listAsList), listAsList, zzb(abstractListI00000oIO), matrix, abstractListI00000oIO);
/* 469 */               i4 = i25 + 1;
/* 471 */               int length2 = objArrCopyOf.length;
/* 472 */               if (length2 < i4) {
/* 477 */                   int i29 = length2 + (length2 >> 1) + 1;
/* 479 */                   if (i29 < i4) {
/* 481 */                       int iHighestOneBit2 = Integer.highestOneBit(i25);
/* 485 */                       i29 = iHighestOneBit2 + iHighestOneBit2;
                            }
/* 493 */                   objArrCopyOf = Arrays.copyOf(objArrCopyOf, i29 < 0 ? Integer.MAX_VALUE : i29);
                        }
/* 498 */               objArrCopyOf[i25] = textBlock;
/* 500 */               i3 = i24 + 1;
/* 502 */               i = i23;
/* 504 */               sparseArray = sparseArray5;
/* 506 */               i2 = 4;
                    }
/* 510 */           iilOoOO00 iiloooo00I001iOo1i0O2 = ii1i1oI1o1O0.I001iOo1i0O(i4, objArrCopyOf);
/* 516 */           o00i10i o00i10iVar2 = zza;
/* 523 */           AbstractList abstractListI00000oIO3 = lilOlilOOi.I00000oIO(iiloooo00I001iOo1i0O2, new lolii010oOiI() {
                        @Override
                        public final Object zza(Object obj) {
/* 3 */                     return ((Text.TextBlock) obj).getText();
                        }
                    });
/* 527 */           o00i10iVar2.getClass();
/* 534 */           return new Text(o00i10i.I00000oIO(abstractListI00000oIO3), iiloooo00I001iOo1i0O2);
                }

                private static String zzb(List list) {
/* 3 */             HashMap map = new HashMap();
/* 6 */             Iterator it = list.iterator();
/* 14 */            while (it.hasNext()) {
/* 22 */                String recognizedLanguage = ((Text.Line) it.next()).getRecognizedLanguage();
/* 50 */                map.put(recognizedLanguage, Integer.valueOf((map.containsKey(recognizedLanguage) ? ((Integer) map.get(recognizedLanguage)).intValue() : 0) + 1));
                    }
/* 54 */            Set setEntrySet = map.entrySet();
/* 62 */            if (setEntrySet.isEmpty()) {
/* 86 */                return "und";
                    }
/* 77 */            String str = (String) ((Map.Entry) Collections.max(setEntrySet, zzc)).getKey();
                    return !ll1iOi.I00000oOI(str) ? str : "und";
                }
            }
