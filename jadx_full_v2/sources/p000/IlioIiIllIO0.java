            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            
            public final class IlioIiIllIO0 implements O1iOIl0o10 {
                public int I00000oIO;
                public float I00000oOI;

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
                    Object next;
/* 5 */             float f = this.I00000oOI;
/* 7 */             int size = list.size();
/* 11 */            int i = this.I00000oIO;
/* 15 */            Object next2 = null;
/* 16 */            if (size != i * 2) {
/* 340 */               I000II.I001IO000("Check failed.");
/* 15 */                return null;
                    }
/* 20 */            List list2 = list;
/* 22 */            OilO0iOl oilO0iOlI001IO000 = IOOi0Ool1i.I001IO000(list2);
/* 26 */            if (i < 0) {
/* 334 */               I000II.I0010I0i(IIlIOloOOO.I00100l0("Requested element count ", i, " is less than zero."));
/* 15 */                return null;
                    }
/* 47 */            OilO0iOl oilO0iOlI00000oIO = i == 0 ? Il01lilOo00I.I00000oIO : oilO0iOlI001IO000 instanceof Iio0iiOlIOil ? ((Iio0iiOlIOil) oilO0iOlI001IO000).I00000oIO(i) : new Iio0IO(oilO0iOlI001IO000, i, 1);
/* 55 */            OilO0iOl oilO0iOlI0000oI00 = OilO1oiooiII.I0000oI00(IOOi0Ool1i.I001IO000(list2), i);
/* 71 */            List listI000lI = OilO1oiooiII.I000lI(new OoI10o0iO11O(oilO0iOlI00000oIO, new Iil0iiOiI(22)));
/* 76 */            List list3 = listI000lI;
/* 78 */            Iterator it = list3.iterator();
/* 86 */            if (it.hasNext()) {
/* 90 */                next = it.next();
/* 98 */                if (it.hasNext()) {
/* 104 */                   int i2 = ((OO1I0001000i) next).I00iOIl;
/* 123 */                   do {
/* 106 */                       Object next3 = it.next();
/* 113 */                       int i3 = ((OO1I0001000i) next3).I00iOIl;
/* 115 */                       if (i2 < i3) {
/* 117 */                           next = next3;
/* 118 */                           i2 = i3;
                                }
/* 123 */                   } while (it.hasNext());
                        }
                    } else {
/* 88 */                next = null;
                    }
/* 126 */           OO1I0001000i oO1I0001000i = (OO1I0001000i) next;
/* 134 */           int iI000OiO = IOo0oO11ll1O.I000OiO(j) - oO1I0001000i.I00iOIl;
/* 135 */           int i4 = 0;
/* 152 */           long jI0000Il00O = IOo0oO11ll1O.I0000Il00O(j, 0, iI000OiO < 0 ? 0 : iI000OiO, 0, 0, 13);
/* 159 */           I0o0iioo0IO i0o0iioo0IO = new I0o0iioo0IO(5);
/* 162 */           i0o0iioo0IO.I00iiI = jI0000Il00O;
/* 164 */           VarHandle.storeStoreFence();
/* 172 */           List listI000lI2 = OilO1oiooiII.I000lI(new OoI10o0iO11O(oilO0iOlI0000oI00, i0o0iioo0IO));
/* 177 */           List list4 = listI000lI2;
/* 179 */           Iterator it2 = list4.iterator();
/* 187 */           if (it2.hasNext()) {
/* 190 */               next2 = it2.next();
/* 198 */               if (it2.hasNext()) {
/* 204 */                   int i5 = ((OO1I0001000i) next2).I00iOIl;
/* 223 */                   do {
/* 206 */                       Object next4 = it2.next();
/* 213 */                       int i6 = ((OO1I0001000i) next4).I00iOIl;
/* 215 */                       if (i5 < i6) {
/* 217 */                           next2 = next4;
/* 218 */                           i5 = i6;
                                }
/* 223 */                   } while (it2.hasNext());
                        }
                    }
/* 231 */           int i7 = oO1I0001000i.I00iOIl + ((OO1I0001000i) next2).I00iOIl;
/* 232 */           Iterator it3 = list4.iterator();
/* 236 */           int i8 = 0;
/* 241 */           while (it3.hasNext()) {
/* 251 */               i8 += ((OO1I0001000i) it3.next()).I00iiI;
                    }
/* 263 */           int iI00l0OO0IO = (o1iOIoOiO0.I00l0OO0IO(f) * (listI000lI2.size() - 1)) + i8;
/* 264 */           Iterator it4 = list3.iterator();
/* 272 */           while (it4.hasNext()) {
/* 282 */               i4 += ((OO1I0001000i) it4.next()).I00iiI;
                    }
/* 295 */           int iMax = Math.max(iI00l0OO0IO, (o1iOIoOiO0.I00l0OO0IO(f) * (listI000lI.size() - 1)) + i4);
/* 301 */           Ilio1l00 ilio1l00 = new Ilio1l00();
/* 304 */           ilio1l00.I00iOIl = i;
/* 306 */           ilio1l00.I00iiI = listI000lI;
/* 308 */           ilio1l00.I00iiO = listI000lI2;
/* 310 */           ilio1l00.I00iio = o1iOIoOiO0;
/* 312 */           ilio1l00.I00ilI0I1 = f;
/* 314 */           ilio1l00.I00ilO0 = oO1I0001000i;
/* 316 */           VarHandle.storeStoreFence();
/* 321 */           return o1iOIoOiO0.I001i1lo1io(i7, iMax, Il011I1OiO0I.I00iOIl, ilio1l00);
                }
            }
