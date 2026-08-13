            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.RandomAccess;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public abstract class il0ilIoI {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r13v0, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v5, types: [I0IO1io0I, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v6 */
                public static final void I00000oIO(ArrayList arrayList, List list, Set set, Set set2, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-720826424);
/* 23 */            int i2 = (i & 6) == 0 ? (iloI0lOlll1.I000OOo1O(arrayList) ? 4 : 2) | i : i;
/* 26 */            if ((i & 48) == 0) {
/* 39 */                i2 |= iloI0lOlll1.I000OOo1O(list) ? 32 : 16;
                    }
/* 42 */            if ((i & 384) == 0) {
/* 55 */                i2 |= iloI0lOlll1.I000OOo1O(set) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 58 */            if ((i & 3072) == 0) {
/* 71 */                i2 |= iloI0lOlll1.I000OOo1O(set2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 88 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 1171) != 1170)) {
/* 90 */                OI10i0Il oI10i0IlI00000oOI = lOO00IiI0li.I00000oOI(arrayList, iloI0lOlll1);
/* 94 */                OI10i0Il oI10i0IlI00000oOI2 = lOO00IiI0li.I00000oOI(list, iloI0lOlll1);
/* 98 */                int size = arrayList.size();
/* 102 */               for (int i3 = 0; i3 < size; i3++) {
/* 110 */                   Object obj = ((OI1llOooOl1) arrayList.get(i3)).I00000oOI;
/* 112 */                   set.add(obj);
/* 115 */                   List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(arrayList);
/* 142 */                   boolean zI000II = iloI0lOlll1.I000II(oI10i0IlI00000oOI) | iloI0lOlll1.I000OOo1O(obj) | iloI0lOlll1.I000OOo1O(set) | iloI0lOlll1.I000OOo1O(set2) | iloI0lOlll1.I000II(oI10i0IlI00000oOI2);
/* 143 */                   ?? I00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 147 */                   if (zI000II || I00O0i0ii == IOl11li.I00000oIO) {
/* 155 */                       I00O0i0ii = new I0IO1io0I(4);
/* 158 */                       I00O0i0ii.I00iiO = obj;
/* 160 */                       I00O0i0ii.I00iio = set;
/* 162 */                       I00O0i0ii.I00ilI0I1 = set2;
/* 164 */                       I00O0i0ii.I00iiI = oI10i0IlI00000oOI;
/* 166 */                       I00O0i0ii.I00ilO0 = oI10i0IlI00000oOI2;
/* 168 */                       VarHandle.storeStoreFence();
/* 171 */                       iloI0lOlll1.I00iio(I00O0i0ii);
                            }
/* 176 */                   iIO0iiOiOl0l.I00000oIO(obj, listI00iIi0i1o, (Function1) I00O0i0ii, iloI0lOlll1);
                        }
                    } else {
/* 182 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 185 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 189 */           if (oOloioIlI001IO000 != null) {
/* 194 */               I0io0io i0io0io = new I0io0io(3);
/* 197 */               i0io0io.I00ilI0I1 = arrayList;
/* 199 */               i0io0io.I00iiI = list;
/* 201 */               i0io0io.I00ilO0 = set;
/* 203 */               i0io0io.I00iiO = set2;
/* 205 */               i0io0io.I00iio = i;
/* 207 */               VarHandle.storeStoreFence();
/* 210 */               oOloioIlI001IO000.I0000O = i0io0io;
                    }
                }

                public static final OI1llOooOl1 I00000oOI(OI1llOooOl1 oI1llOooOl1, List list, Set set, Set set2, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i01iIIliI(-1239021605);
/* 7 */             OI10i0Il oI10i0IlI00000oOI = lOO00IiI0li.I00000oOI(list, iloI0lOlll1);
/* 11 */            Object obj = oI1llOooOl1.I00000oOI;
/* 16 */            iloI0lOlll1.I00Ol1ll1(-993800456, obj);
/* 24 */            I1o0Il1lli1i i1o0Il1lli1i = new I1o0Il1lli1i(2);
/* 27 */            i1o0Il1lli1i.I00iio = set2;
/* 29 */            i1o0Il1lli1i.I00ilI0I1 = obj;
/* 31 */            i1o0Il1lli1i.I00ilO0 = set;
/* 33 */            i1o0Il1lli1i.I00iiO = oI10i0IlI00000oOI;
/* 35 */            i1o0Il1lli1i.I00iiI = list;
/* 37 */            i1o0Il1lli1i.I00io1l = oI1llOooOl1;
/* 39 */            VarHandle.storeStoreFence();
/* 49 */            OI1llOooOl1 oI1llOooOl12 = new OI1llOooOl1(oI1llOooOl1, iiioOl1O.I00000oOI(-1349345695, i1o0Il1lli1i, iloI0lOlll1));
/* 53 */            iloI0lOlll1.I0010I0i(false);
/* 56 */            iloI0lOlll1.I0010I0i(false);
/* 685 */           return oI1llOooOl12;
                }

                public static final ArrayList I0000Il00O(List list, List list2, IloI0lOlll1 iloI0lOlll1, int i) {
                    List list3;
                    IloI0lOlll1 iloI0lOlll12;
                    ArrayList arrayList;
/* 1 */             Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 5 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 7 */             if (objI00O0i0ii == iOO0o0I1l) {
/* 11 */                objI00O0i0ii = new LinkedHashSet();
/* 14 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
/* 18 */            Set set = (Set) objI00O0i0ii;
/* 20 */            Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 24 */            if (objI00O0i0ii2 == iOO0o0I1l) {
/* 28 */                objI00O0i0ii2 = new LinkedHashSet();
/* 31 */                iloI0lOlll1.I00iio(objI00O0i0ii2);
                    }
/* 35 */            Set set2 = (Set) objI00O0i0ii2;
/* 40 */            iloI0lOlll1.I00i01iIIliI(110758886);
/* 46 */            if (list instanceof RandomAccess) {
/* 54 */                arrayList = new ArrayList(list.size());
/* 60 */                int size = list.size();
/* 64 */                int i2 = 0;
/* 65 */                while (i2 < size) {
/* 75 */                    List list4 = list2;
/* 81 */                    arrayList.add(I00000oOI((OI1llOooOl1) list.get(i2), list4, set, set2, iloI0lOlll1, i & 112));
/* 84 */                    i2++;
/* 86 */                    list2 = list4;
                        }
/* 88 */                list3 = list2;
/* 89 */                iloI0lOlll12 = iloI0lOlll1;
                    } else {
/* 92 */                list3 = list2;
/* 93 */                iloI0lOlll12 = iloI0lOlll1;
/* 94 */                List list5 = list;
/* 104 */               arrayList = new ArrayList(IOOi1I.I0000O(list5, 10));
/* 107 */               Iterator it = list5.iterator();
/* 115 */               while (it.hasNext()) {
/* 130 */                   arrayList.add(I00000oOI((OI1llOooOl1) it.next(), list3, set, set2, iloI0lOlll12, i & 112));
                        }
                    }
/* 90 */            ArrayList arrayList2 = arrayList;
/* 134 */           iloI0lOlll12.I0010I0i(false);
/* 139 */           I00000oIO(arrayList2, list3, set, set2, iloI0lOlll12, i & 112);
/* 204 */           return arrayList2;
                }
            }
