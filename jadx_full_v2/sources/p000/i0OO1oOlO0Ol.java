            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.function.BinaryOperator;
            
            public final class i0OO1oOlO0Ol implements BinaryOperator {
                public static final i0OO1oOlO0Ol I00000oOI = new i0OO1oOlO0Ol(7);
                public static final i0OO1oOlO0Ol I0000Il00O = new i0OO1oOlO0Ol(8);
                public static final i0OO1oOlO0Ol I0000O = new i0OO1oOlO0Ol(9);
                public final int I00000oIO;

                public i0OO1oOlO0Ol(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object apply(Object obj, Object obj2) {
                    switch (this.I00000oIO) {
                        case 0:
/* 416 */                   i0Ii0iIliIil i0ii0iiliiil = (i0Ii0iIliIil) obj;
/* 420 */                   i0ii0iiliiil.getClass();
/* 425 */                   Iterator it = ((i0Ii0iIliIil) obj2).I00000oIO.iterator();
/* 433 */                   while (it.hasNext()) {
/* 439 */                       i0IioIo i0iioio = (i0IioIo) it.next();
/* 449 */                       if (i0iioio.I00iOIl.equals(i0iioio.I00iiI)) {
/* 465 */                           I000II.I000iOII(liO10OoIlll.I00000oIO("range must not be empty, but was %s", i0iioio));
/* 7 */                             return null;
                                }
/* 453 */                       i0ii0iiliiil.I00000oIO.add(i0iioio);
                            }
/* 469 */                   return i0ii0iiliiil;
                        case 1:
/* 370 */                   i0IIl1IOl1oO i0iil1iol1oo = (i0IIl1IOl1oO) obj;
/* 372 */                   i0IIl1IOl1oO i0iil1iol1oo2 = (i0IIl1IOl1oO) obj2;
/* 374 */                   Object[] objArr = i0iil1iol1oo2.I00000oOI;
/* 376 */                   int i = i0iil1iol1oo2.I0000Il00O;
/* 379 */                   for (int i2 = 0; i2 < i; i2++) {
/* 381 */                       i0iil1iol1oo.getClass();
/* 386 */                       if (objArr[i2] == null) {
/* 395 */                           IOOlIIilOl0.I000II(Oi010OO0.I000oI1ioi(i2, "at index "));
/* 7 */                             return null;
                                }
                            }
/* 399 */                   i0iil1iol1oo.I0000oI00(i);
/* 406 */                   System.arraycopy(objArr, 0, i0iil1iol1oo.I00000oOI, i0iil1iol1oo.I0000Il00O, i);
                            i0iil1iol1oo.I0000Il00O += i;
/* 414 */                   return i0iil1iol1oo;
                        case 2:
/* 324 */                   i0Ii1001oOI i0ii1001ooi = (i0Ii1001oOI) obj;
/* 326 */                   i0Ii1001oOI i0ii1001ooi2 = (i0Ii1001oOI) obj2;
/* 328 */                   Object[] objArr2 = i0ii1001ooi2.I00000oOI;
/* 330 */                   int i3 = i0ii1001ooi2.I0000Il00O;
/* 333 */                   for (int i4 = 0; i4 < i3; i4++) {
/* 335 */                       i0ii1001ooi.getClass();
/* 340 */                       if (objArr2[i4] == null) {
/* 349 */                           IOOlIIilOl0.I000II(Oi010OO0.I000oI1ioi(i4, "at index "));
/* 7 */                             return null;
                                }
                            }
/* 353 */                   i0ii1001ooi.I0000oI00(i3);
/* 360 */                   System.arraycopy(objArr2, 0, i0ii1001ooi.I00000oOI, i0ii1001ooi.I0000Il00O, i3);
                            i0ii1001ooi.I0000Il00O += i3;
/* 368 */                   return i0ii1001ooi;
                        case 3:
/* 274 */                   i0IOoO1 i0iooo1 = (i0IOoO1) obj;
/* 276 */                   i0IOoO1 i0iooo12 = (i0IOoO1) obj2;
/* 278 */                   i0iooo1.getClass();
/* 281 */                   i0iooo12.getClass();
/* 288 */                   int i5 = i0iooo1.I00000oOI + i0iooo12.I00000oOI;
/* 289 */                   Object[] objArrCopyOf = i0iooo1.I00000oIO;
/* 291 */                   int length = objArrCopyOf.length;
/* 292 */                   int i6 = i5 + i5;
/* 293 */                   if (i6 > length) {
/* 299 */                       objArrCopyOf = Arrays.copyOf(objArrCopyOf, IoilIilo.I0000O(length, i6));
/* 303 */                       i0iooo1.I00000oIO = objArrCopyOf;
                            }
/* 305 */                   Object[] objArr3 = i0iooo12.I00000oIO;
/* 307 */                   int i7 = i0iooo1.I00000oOI;
/* 310 */                   int i8 = i0iooo12.I00000oOI;
/* 313 */                   System.arraycopy(objArr3, 0, objArrCopyOf, i7 + i7, i8 + i8);
                            i0iooo1.I00000oOI += i0iooo12.I00000oOI;
/* 323 */                   return i0iooo1;
                        case 4:
/* 219 */                   ioOI00O0o1li iooi00o0o1li = (ioOI00O0o1li) obj;
/* 223 */                   iooi00o0o1li.getClass();
/* 228 */                   Iterator it2 = ((ioOI00O0o1li) obj2).I00000oIO.iterator();
/* 236 */                   while (it2.hasNext()) {
/* 242 */                       ioo01ioIl ioo01ioil = (ioo01ioIl) it2.next();
/* 252 */                       if (ioo01ioil.I00iOIl.equals(ioo01ioil.I00iiI)) {
/* 268 */                           I000II.I000iOII(lio011oio0.I00000oIO("range must not be empty, but was %s", ioo01ioil));
/* 7 */                             return null;
                                }
/* 256 */                       iooi00o0o1li.I00000oIO.add(ioo01ioil);
                            }
/* 272 */                   return iooi00o0o1li;
                        case 5:
/* 173 */                   io1ooI0l io1ooi0l = (io1ooI0l) obj;
/* 175 */                   io1ooI0l io1ooi0l2 = (io1ooI0l) obj2;
/* 177 */                   Object[] objArr4 = io1ooi0l2.I00000oOI;
/* 179 */                   int i9 = io1ooi0l2.I0000Il00O;
/* 182 */                   for (int i10 = 0; i10 < i9; i10++) {
/* 184 */                       io1ooi0l.getClass();
/* 189 */                       if (objArr4[i10] == null) {
/* 198 */                           IOOlIIilOl0.I000II(Oi010OO0.I000oI1ioi(i10, "at index "));
/* 7 */                             return null;
                                }
                            }
/* 202 */                   io1ooi0l.I000iOII(i9);
/* 209 */                   System.arraycopy(objArr4, 0, io1ooi0l.I00000oOI, io1ooi0l.I0000Il00O, i9);
                            io1ooi0l.I0000Il00O += i9;
/* 217 */                   return io1ooi0l;
                        case 6:
/* 127 */                   ioOil0i1o iooil0i1o = (ioOil0i1o) obj;
/* 129 */                   ioOil0i1o iooil0i1o2 = (ioOil0i1o) obj2;
/* 131 */                   Object[] objArr5 = iooil0i1o2.I00000oOI;
/* 133 */                   int i11 = iooil0i1o2.I0000Il00O;
/* 136 */                   for (int i12 = 0; i12 < i11; i12++) {
/* 138 */                       iooil0i1o.getClass();
/* 143 */                       if (objArr5[i12] == null) {
/* 152 */                           IOOlIIilOl0.I000II(Oi010OO0.I000oI1ioi(i12, "at index "));
/* 7 */                             return null;
                                }
                            }
/* 156 */                   iooil0i1o.I000iOII(i11);
/* 163 */                   System.arraycopy(objArr5, 0, iooil0i1o.I00000oOI, iooil0i1o.I0000Il00O, i11);
                            iooil0i1o.I0000Il00O += i11;
/* 171 */                   return iooil0i1o;
                        case 7:
/* 97 */                    lO1l0Oi lo1l0oi = (lO1l0Oi) obj2;
/* 99 */                    lO1l0Oi lo1l0oi2 = (lO1l0Oi) obj;
/* 101 */                   Object[] objArr6 = lo1l0oi.I00000oOI;
/* 103 */                   int i13 = lo1l0oi.I0000Il00O;
/* 105 */                   lo1l0oi2.getClass();
/* 108 */                   ll0lIii.I00000oIO(i13, objArr6);
/* 111 */                   lo1l0oi2.I000iOII(i13);
/* 118 */                   System.arraycopy(objArr6, 0, lo1l0oi2.I00000oOI, lo1l0oi2.I0000Il00O, i13);
                            lo1l0oi2.I0000Il00O += i13;
/* 126 */                   return lo1l0oi2;
                        case 8:
/* 44 */                    lOIllO loillo = (lOIllO) obj;
/* 46 */                    loillo.getClass();
/* 51 */                    Iterator it3 = ((lOIllO) obj2).I00000oIO.iterator();
/* 59 */                    while (it3.hasNext()) {
/* 65 */                        lOio1lIO loio1lio = (lOio1lIO) it3.next();
/* 75 */                        if (loio1lio.I00iOIl.equals(loio1lio.I00iiI)) {
/* 91 */                            I000II.I000iOII(ll0Oo10I10.I00000oIO("range must not be empty, but was %s", loio1lio));
/* 7 */                             return null;
                                }
/* 79 */                        loillo.I00000oIO.add(loio1lio);
                            }
/* 95 */                    return loillo;
                        default:
/* 12 */                    lOO0OIOiiOO loo0oioiioo = (lOO0OIOiiOO) obj2;
/* 14 */                    lOO0OIOiiOO loo0oioiioo2 = (lOO0OIOiiOO) obj;
/* 16 */                    Object[] objArr7 = loo0oioiioo.I00000oOI;
/* 18 */                    int i14 = loo0oioiioo.I0000Il00O;
/* 20 */                    loo0oioiioo2.getClass();
/* 23 */                    ll0lIii.I00000oIO(i14, objArr7);
/* 26 */                    loo0oioiioo2.I000iOII(i14);
/* 33 */                    System.arraycopy(objArr7, 0, loo0oioiioo2.I00000oOI, loo0oioiioo2.I0000Il00O, i14);
                            loo0oioiioo2.I0000Il00O += i14;
/* 41 */                    return loo0oioiioo2;
                    }
                }
            }
