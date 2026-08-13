            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class OII0Il implements O1iOIl0o10 {
                public IiloOlIoIool I00000oIO;
                public OI10i0Il I00000oOI;
                public OIooO1iiliI I0000Il00O;

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
                    Integer numValueOf;
/* 8 */             long jI0000Il00O = IOo0oO11ll1O.I0000Il00O(j, 0, 0, 0, 0, 10);
/* 18 */            ArrayList arrayList = new ArrayList(list.size());
/* 24 */            int size = list.size();
/* 29 */            for (int i = 0; i < size; i++) {
/* 41 */                arrayList.add(((O1iIo0ll) list.get(i)).I001lllioOl(jI0000Il00O));
                    }
/* 51 */            Integer numValueOf2 = null;
/* 52 */            int i2 = 1;
/* 53 */            if (arrayList.isEmpty()) {
/* 55 */                numValueOf = null;
                    } else {
/* 65 */                numValueOf = Integer.valueOf(((OO1I0001000i) arrayList.get(0)).I00iOIl);
/* 69 */                int iI000II = IOOi1I.I000II(arrayList);
/* 73 */                if (1 <= iI000II) {
/* 75 */                    int i3 = 1;
                            while (true) {
/* 84 */                        Integer numValueOf3 = Integer.valueOf(((OO1I0001000i) arrayList.get(i3)).I00iOIl);
/* 92 */                        if (numValueOf3.compareTo(numValueOf) > 0) {
/* 94 */                            numValueOf = numValueOf3;
                                }
/* 95 */                        if (i3 == iI000II) {
                                    break;
                                }
/* 97 */                        i3++;
                            }
                        }
                    }
/* 107 */           int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
/* 112 */           if (!arrayList.isEmpty()) {
/* 123 */               numValueOf2 = Integer.valueOf(((OO1I0001000i) arrayList.get(0)).I00iiI);
/* 127 */               int iI000II2 = IOOi1I.I000II(arrayList);
/* 131 */               if (1 <= iI000II2) {
                            while (true) {
/* 141 */                       Integer numValueOf4 = Integer.valueOf(((OO1I0001000i) arrayList.get(i2)).I00iiI);
/* 149 */                       if (numValueOf4.compareTo(numValueOf2) > 0) {
/* 151 */                           numValueOf2 = numValueOf4;
                                }
/* 152 */                       if (i2 == iI000II2) {
                                    break;
                                }
/* 154 */                       i2++;
                            }
                        }
                    }
/* 159 */           int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
/* 163 */           IiloOlIoIool iiloOlIoIool = this.I00000oIO;
/* 165 */           OI10i0Il oI10i0Il = this.I00000oOI;
/* 167 */           OIooO1iiliI oIooO1iiliI = this.I0000Il00O;
/* 172 */           IOOllI0o iOOllI0o = new IOOllI0o(3);
/* 175 */           iOOllI0o.I00iiO = iiloOlIoIool;
/* 177 */           iOOllI0o.I00iiI = iIntValue;
/* 179 */           iOOllI0o.I00iio = arrayList;
/* 181 */           iOOllI0o.I00ilI0I1 = oI10i0Il;
/* 183 */           iOOllI0o.I00ilO0 = oIooO1iiliI;
/* 185 */           VarHandle.storeStoreFence();
/* 190 */           return o1iOIoOiO0.I001i1lo1io(iIntValue, iIntValue2, Il011I1OiO0I.I00iOIl, iOOllI0o);
                }
            }
