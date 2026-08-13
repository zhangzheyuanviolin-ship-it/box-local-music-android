            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class Ollo0lo implements OI0Iolo0lIiI {
                public Ollo10o1IO I00000oIO;

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
/* 5 */             ArrayList arrayList = (ArrayList) list;
/* 12 */            List list2 = (List) arrayList.get(0);
/* 19 */            List list3 = (List) arrayList.get(1);
/* 26 */            List list4 = (List) arrayList.get(2);
/* 28 */            int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 32 */            int size = list2.size();
/* 38 */            OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 41 */            if (size > 0) {
/* 45 */                oOo0ll111.I00iOIl = iI000OiO / size;
                    }
/* 47 */            Integer numValueOf = 0;
/* 52 */            List list5 = list2;
/* 54 */            int size2 = list5.size();
/* 59 */            for (int i = 0; i < size2; i++) {
/* 81 */                numValueOf = Integer.valueOf(Math.max(((O1iIo0ll) list2.get(i)).I0000Il00O(oOo0ll111.I00iOIl), numValueOf.intValue()));
                    }
/* 88 */            int iIntValue = numValueOf.intValue();
/* 94 */            Ollo10o1IO ollo10o1IO = this.I00000oIO;
/* 98 */            ArrayList arrayList2 = new ArrayList(size);
/* 102 */           for (int i2 = 0; i2 < size; i2++) {
/* 127 */               Iil1010O iil1010OI00000oIO = Iil1010O.I00000oIO(o1iOIoOiO0.I00O0o1oo(Math.min(((O1iIo0ll) list2.get(i2)).I001iOo1i0O(iIntValue), oOo0ll111.I00iOIl)) - 32.0f);
/* 133 */               Iil1010O iil1010OI00000oIO2 = Iil1010O.I00000oIO(24.0f);
/* 141 */               if (iil1010OI00000oIO.compareTo(iil1010OI00000oIO2) < 0) {
/* 144 */                   iil1010OI00000oIO = iil1010OI00000oIO2;
                        }
/* 166 */               arrayList2.add(new Olll1Oi(o1iOIoOiO0.I00O0o1oo(oOo0ll111.I00iOIl) * i2, o1iOIoOiO0.I00O0o1oo(oOo0ll111.I00iOIl), iil1010OI00000oIO.I00iOIl));
                    }
/* 175 */           ollo10o1IO.I00000oIO.setValue(arrayList2);
/* 184 */           ArrayList arrayList3 = new ArrayList(list2.size());
/* 187 */           int size3 = list5.size();
/* 192 */           for (int i3 = 0; i3 < size3; i3++) {
/* 198 */               O1iIo0ll o1iIo0ll = (O1iIo0ll) list2.get(i3);
/* 200 */               int i4 = oOo0ll111.I00iOIl;
/* 210 */               arrayList3.add(o1iIo0ll.I001lllioOl(IOo0oO11ll1O.I00000oOI(i4, i4, iIntValue, iIntValue)));
                    }
/* 222 */           ArrayList arrayList4 = new ArrayList(list3.size());
/* 228 */           int size4 = list3.size();
/* 233 */           for (int i5 = 0; i5 < size4; i5++) {
/* 258 */               arrayList4.add(((O1iIo0ll) list3.get(i5)).I001lllioOl(IOo0oO11ll1O.I0000Il00O(j, 0, 0, 0, 0, 11)));
                    }
/* 270 */           ArrayList arrayList5 = new ArrayList(list4.size());
/* 276 */           int size5 = list4.size();
/* 281 */           for (int i6 = 0; i6 < size5; i6++) {
/* 287 */               O1iIo0ll o1iIo0ll2 = (O1iIo0ll) list4.get(i6);
/* 289 */               int i7 = oOo0ll111.I00iOIl;
/* 300 */               arrayList5.add(o1iIo0ll2.I001lllioOl(IOo0oO11ll1O.I00000oOI(i7, i7, 0, iIntValue)));
                    }
/* 309 */           IOOllI0o iOOllI0o = new IOOllI0o(5);
/* 312 */           iOOllI0o.I00iiO = arrayList3;
/* 314 */           iOOllI0o.I00iio = arrayList4;
/* 316 */           iOOllI0o.I00ilI0I1 = arrayList5;
/* 318 */           iOOllI0o.I00ilO0 = oOo0ll111;
/* 320 */           iOOllI0o.I00iiI = iIntValue;
/* 322 */           VarHandle.storeStoreFence();
/* 327 */           return o1iOIoOiO0.I001i1lo1io(iI000OiO, iIntValue, Il011I1OiO0I.I00iOIl, iOOllI0o);
                }
            }
