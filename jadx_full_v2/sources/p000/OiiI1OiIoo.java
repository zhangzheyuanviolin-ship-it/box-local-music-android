            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            import kotlin.jvm.functions.Function1;
            
            public final class OiiI1OiIoo implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public float I00iiO;
                public Object I00iio;
                public IlliIlI I00ilI0I1;

                public OiiI1OiIoo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ArrayList<List> arrayList;
                    Object next;
/* 5 */             boolean z = true;
                    switch (this.I00iOIl) {
                        case 0:
/* 478 */                   O1ooiI111i o1ooiI111i = (O1ooiI111i) this.I00iio;
/* 480 */                   float f = this.I00iiO;
/* 484 */                   IOii1l iOii1l = (IOii1l) this.I00ilI0I1;
/* 486 */                   int i = this.I00iiI;
/* 496 */                   ((Integer) obj2).getClass();
/* 505 */                   lO1Ii0lI.I0000oI00(o1ooiI111i, f, iOii1l, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(i | 1));
/* 508 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 9 */                     int i2 = this.I00iiI;
/* 13 */                    List list = (List) this.I00iio;
/* 15 */                    float f2 = this.I00iiO;
/* 19 */                    Function1 function1 = (Function1) this.I00ilI0I1;
/* 23 */                    Oli1oI111 oli1oI111 = (Oli1oI111) obj;
/* 27 */                    IOo0oO11ll1O iOo0oO11ll1O = (IOo0oO11ll1O) obj2;
/* 29 */                    Boolean bool = Boolean.FALSE;
/* 33 */                    Ol0O0O0 ol0O0O0 = new Ol0O0O0();
/* 36 */                    ol0O0O0.I00iOIl = list;
/* 38 */                    ol0O0O0.I00iiI = i2;
/* 40 */                    VarHandle.storeStoreFence();
/* 51 */                    List listI000o00OoI0I = oli1oI111.I000o00OoI0I(new IOii1l(-223867091, ol0O0O0, true), bool);
/* 58 */                    if (i2 <= 0 || i2 <= 0) {
/* 469 */                       I000II.I0010I0i(IIlIOloOOO.I00100l0("size ", i2, " must be greater than zero."));
                            } else {
/* 64 */                        int iIntValue = 0;
/* 65 */                        if ((listI000o00OoI0I instanceof RandomAccess) && (listI000o00OoI0I instanceof List)) {
/* 71 */                            List list2 = listI000o00OoI0I;
/* 73 */                            int size = list2.size();
/* 89 */                            arrayList = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
/* 93 */                            for (int i3 = 0; i3 >= 0 && i3 < size; i3 += i2) {
/* 97 */                                int i4 = size - i3;
/* 99 */                                if (i2 <= i4) {
/* 102 */                                   i4 = i2;
                                        }
/* 105 */                               ArrayList arrayList2 = new ArrayList(i4);
/* 108 */                               int i5 = 0;
                                        while (true) {
/* 109 */                                   boolean z2 = z;
/* 111 */                                   if (i5 < i4) {
/* 119 */                                       arrayList2.add(list2.get(i5 + i3));
/* 122 */                                       i5++;
/* 124 */                                       z = z2;
                                            }
                                        }
/* 127 */                               arrayList.add(arrayList2);
                                    }
                                } else {
/* 139 */                           arrayList = new ArrayList();
/* 142 */                           Iterator it = listI000o00OoI0I.iterator();
/* 160 */                           Iterator itI00000oIO = !it.hasNext() ? Il010loii1OO.I00iOIl : OilOIIlI.I00000oIO(new Ol11OOooIo(i2, i2, it, null));
/* 168 */                           while (itI00000oIO.hasNext()) {
/* 176 */                               arrayList.add((List) itI00000oIO.next());
                                    }
                                }
/* 188 */                       if (arrayList.size() == list.size()) {
/* 190 */                           long j = iOo0oO11ll1O.I00000oIO;
/* 196 */                           if (IOo0oO11ll1O.I0001Ioi1lo(j)) {
/* 209 */                               float fI000OiO = (IOo0oO11ll1O.I000OiO(j) - ((i2 + 1) * f2)) / i2;
/* 217 */                               float size2 = (arrayList.size() + 1) * f2;
/* 228 */                               long jI0000oI00 = IOo0olo.I0000oI00(IOo0olo.I00000oOI(0, O1OooO0IlOo.I000II(fI000OiO), 0, 0, 13), j);
/* 240 */                               ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 251 */                               for (List list3 : arrayList) {
/* 267 */                                   ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(list3, 10));
/* 270 */                                   Iterator it2 = list3.iterator();
/* 278 */                                   while (it2.hasNext()) {
/* 290 */                                       arrayList4.add(((O1iIo0ll) it2.next()).I001lllioOl(jI0000oI00));
                                            }
/* 294 */                                   arrayList3.add(arrayList4);
                                        }
/* 305 */                               ArrayList arrayList5 = new ArrayList(IOOi1I.I0000O(arrayList3, 10));
/* 308 */                               Iterator it3 = arrayList3.iterator();
/* 316 */                               while (it3.hasNext()) {
/* 326 */                                   Iterator it4 = ((List) it3.next()).iterator();
/* 334 */                                   if (it4.hasNext()) {
/* 338 */                                       next = it4.next();
/* 346 */                                       if (it4.hasNext()) {
/* 352 */                                           int i6 = ((OO1I0001000i) next).I00iiI;
/* 371 */                                           do {
/* 354 */                                               Object next2 = it4.next();
/* 361 */                                               int i7 = ((OO1I0001000i) next2).I00iiI;
/* 363 */                                               if (i6 < i7) {
/* 365 */                                                   next = next2;
/* 366 */                                                   i6 = i7;
                                                        }
/* 371 */                                           } while (it4.hasNext());
                                                }
                                            } else {
/* 336 */                                       next = null;
                                            }
/* 381 */                                   arrayList5.add(Integer.valueOf(((OO1I0001000i) next).I00iiI));
                                        }
/* 385 */                               int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 389 */                               Iterator it5 = arrayList5.iterator();
/* 397 */                               while (it5.hasNext()) {
/* 409 */                                   iIntValue += ((Number) it5.next()).intValue();
                                        }
/* 413 */                               int iI000II = O1OooO0IlOo.I000II(iIntValue + size2);
/* 419 */                               Ol0O010O1o01 ol0O010O1o01 = new Ol0O010O1o01();
/* 422 */                               ol0O010O1o01.I00iOIl = f2;
/* 424 */                               ol0O010O1o01.I00iiI = arrayList3;
/* 426 */                               ol0O010O1o01.I00iiO = oli1oI111;
/* 428 */                               ol0O010O1o01.I00iio = iI000OiO;
/* 430 */                               ol0O010O1o01.I00ilI0I1 = iI000II;
/* 432 */                               ol0O010O1o01.I00ilO0 = arrayList5;
/* 434 */                               ol0O010O1o01.I00io1l = fI000OiO;
/* 436 */                               ol0O010O1o01.I00ioIO = function1;
/* 438 */                               VarHandle.storeStoreFence();
/* 443 */                               return oli1oI111.I001i1lo1io(iI000OiO, iI000II, Il011I1OiO0I.I00iOIl, ol0O010O1o01);
                                    }
/* 450 */                           I000II.I001IO000("Table must have bounded width");
                                } else {
/* 457 */                           I000II.I001IO000("Check failed.");
                                }
                            }
/* 453 */                   return null;
                    }
                }
            }
