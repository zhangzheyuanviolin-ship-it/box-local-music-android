            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            
            public final class Ol11OOooIo extends Oi10IOIi implements IlliIl1l11O {
                public Object I00iiI;
                public Iterator I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public Object I00io1l;
                public final int I00ioIO;
                public final int I00l0I0l0lO1;
                public final Iterator I00l0OO0IO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ol11OOooIo(int i, int i2, Iterator it, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00ioIO = i;
/* 3 */             this.I00l0I0l0lO1 = i2;
/* 5 */             this.I00l0OO0IO = it;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             Ol11OOooIo ol11OOooIo = new Ol11OOooIo(this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, iOoil1iiIilo);
/* 12 */            ol11OOooIo.I00io1l = obj;
/* 89 */            return ol11OOooIo;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((Ol11OOooIo) create((OilO111) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x013e A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i;
                    int i2;
                    int i3;
                    Iterator it;
                    Oi1iIoi1oOI oi1iIoi1oOI;
                    ArrayList arrayList;
                    int i4;
                    Iterator it2;
                    int i5;
                    int i6;
                    Oi1iIoi1oOI oi1iIoi1oOI2;
                    boolean z;
/* 5 */             OilO111 oilO111 = (OilO111) this.I00io1l;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i7 = this.I00ilO0;
/* 15 */            int i8 = this.I00l0I0l0lO1;
/* 17 */            boolean z2 = true;
/* 18 */            int i9 = this.I00ioIO;
/* 21 */            if (i7 == 0) {
/* 107 */               lIoii1l01l0i.I00000oOI(obj);
/* 110 */               int i10 = Barcode.FORMAT_UPC_E;
/* 112 */               if (i9 <= 1024) {
/* 115 */                   i10 = i9;
                        }
/* 116 */               i = i8 - i9;
/* 118 */               Iterator it3 = this.I00l0OO0IO;
/* 121 */               if (i >= 0) {
/* 125 */                   arrayList = new ArrayList(i10);
/* 128 */                   i4 = i10;
/* 129 */                   it2 = it3;
/* 130 */                   i5 = 0;
/* 135 */                   while (it2.hasNext()) {
                            }
/* 177 */                   if (!arrayList.isEmpty()) {
                            }
                        } else {
/* 201 */                   Oi1iIoi1oOI oi1iIoi1oOI3 = new Oi1iIoi1oOI(new Object[i10], 0);
/* 206 */                   i2 = i10;
/* 207 */                   i3 = i;
/* 208 */                   it = it3;
/* 209 */                   oi1iIoi1oOI = oi1iIoi1oOI3;
                            while (true) {
/* 211 */                       int i11 = oi1iIoi1oOI.I00iiI;
/* 213 */                       Object[] objArr = oi1iIoi1oOI.I00iOIl;
/* 219 */                       if (it.hasNext()) {
                                }
/* 286 */                       z2 = z;
                            }
                        }
                    } else if (i7 != 1) {
/* 25 */                if (i7 == 2) {
                        } else if (i7 == 3) {
/* 64 */                    i3 = this.I00ilI0I1;
/* 66 */                    i2 = this.I00iio;
/* 68 */                    it = this.I00iiO;
/* 72 */                    oi1iIoi1oOI = (Oi1iIoi1oOI) this.I00iiI;
/* 74 */                    lIoii1l01l0i.I00000oOI(obj);
/* 77 */                    oi1iIoi1oOI.I0000O(i8);
                            while (true) {
/* 211 */                       int i112 = oi1iIoi1oOI.I00iiI;
/* 213 */                       Object[] objArr2 = oi1iIoi1oOI.I00iOIl;
/* 219 */                       if (it.hasNext()) {
/* 319 */                           i6 = i2;
/* 320 */                           oi1iIoi1oOI2 = oi1iIoi1oOI;
                                    break;
                                }
/* 221 */                       Object next = it.next();
/* 225 */                       z = z2;
/* 231 */                       if (oi1iIoi1oOI.I00000oOI() == i112) {
/* 315 */                           I000II.I001IO000("ring buffer is full");
/* 20 */                            return null;
                                }
/* 233 */                       int i12 = oi1iIoi1oOI.I00iiO;
/* 235 */                       int i13 = oi1iIoi1oOI.I00iio;
/* 239 */                       objArr2[(i12 + i13) % i112] = next;
/* 243 */                       oi1iIoi1oOI.I00iio = i13 + 1;
/* 249 */                       if (oi1iIoi1oOI.I00000oOI() == i112) {
/* 253 */                           if (oi1iIoi1oOI.I00iio >= i9) {
/* 292 */                               ArrayList arrayList2 = new ArrayList(oi1iIoi1oOI);
/* 295 */                               this.I00io1l = oilO111;
/* 297 */                               this.I00iiI = oi1iIoi1oOI;
/* 299 */                               this.I00iiO = it;
/* 301 */                               this.I00iio = i2;
/* 303 */                               this.I00ilI0I1 = i3;
/* 305 */                               this.I00ilO0 = 3;
/* 307 */                               oilO111.I00000oOI(this, arrayList2);
/* 310 */                               Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 312 */                               return ii0111o;
                                    }
/* 258 */                           int i14 = i112 + (i112 >> 1) + 1;
/* 260 */                           if (i14 > i9) {
/* 262 */                               i14 = i9;
                                    }
/* 282 */                           oi1iIoi1oOI = new Oi1iIoi1oOI(oi1iIoi1oOI.I00iiO == 0 ? Arrays.copyOf(objArr2, i14) : oi1iIoi1oOI.toArray(new Object[i14]), oi1iIoi1oOI.I00iio);
                                }
/* 286 */                       z2 = z;
                            }
                        } else if (i7 == 4) {
/* 48 */                    i3 = this.I00ilI0I1;
/* 50 */                    i6 = this.I00iio;
/* 54 */                    oi1iIoi1oOI2 = (Oi1iIoi1oOI) this.I00iiI;
/* 56 */                    lIoii1l01l0i.I00000oOI(obj);
/* 59 */                    oi1iIoi1oOI2.I0000O(i8);
/* 323 */                   if (oi1iIoi1oOI2.I00iio > i8) {
/* 327 */                       ArrayList arrayList3 = new ArrayList(oi1iIoi1oOI2);
/* 330 */                       this.I00io1l = oilO111;
/* 332 */                       this.I00iiI = oi1iIoi1oOI2;
/* 334 */                       this.I00iiO = null;
/* 336 */                       this.I00iio = i6;
/* 338 */                       this.I00ilI0I1 = i3;
/* 340 */                       this.I00ilO0 = 4;
/* 342 */                       oilO111.I00000oOI(this, arrayList3);
/* 345 */                       Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 347 */                       return ii0111o;
                            }
/* 352 */                   if (!oi1iIoi1oOI2.isEmpty()) {
/* 354 */                       this.I00io1l = null;
/* 356 */                       this.I00iiI = null;
/* 358 */                       this.I00iiO = null;
/* 360 */                       this.I00iio = i6;
/* 362 */                       this.I00ilI0I1 = i3;
/* 365 */                       this.I00ilO0 = 5;
/* 367 */                       oilO111.I00000oOI(this, oi1iIoi1oOI2);
/* 370 */                       Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 372 */                       return ii0111o;
                            }
                        } else {
/* 31 */                    if (i7 != 5) {
/* 44 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 20 */                        return null;
                            }
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(obj);
                    } else {
/* 87 */                i5 = this.I00ilI0I1;
/* 89 */                i4 = this.I00iio;
/* 91 */                it2 = this.I00iiO;
/* 97 */                lIoii1l01l0i.I00000oOI(obj);
/* 102 */               arrayList = new ArrayList(i9);
/* 105 */               i = i5;
/* 135 */               while (it2.hasNext()) {
/* 137 */                   Object next2 = it2.next();
/* 141 */                   if (i5 > 0) {
                                i5--;
                            } else {
/* 146 */                       arrayList.add(next2);
/* 153 */                       if (arrayList.size() == i9) {
/* 155 */                           this.I00io1l = oilO111;
/* 157 */                           this.I00iiI = arrayList;
/* 159 */                           this.I00iiO = it2;
/* 161 */                           this.I00iio = i4;
/* 163 */                           this.I00ilI0I1 = i;
/* 165 */                           this.I00ilO0 = 1;
/* 167 */                           oilO111.I00000oOI(this, arrayList);
/* 170 */                           Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 172 */                           return ii0111o;
                                }
                            }
                        }
/* 177 */               if (!arrayList.isEmpty()) {
/* 179 */                   this.I00io1l = null;
/* 181 */                   this.I00iiI = null;
/* 183 */                   this.I00iiO = null;
/* 185 */                   this.I00iio = i4;
/* 187 */                   this.I00ilI0I1 = i;
/* 189 */                   this.I00ilO0 = 2;
/* 191 */                   oilO111.I00000oOI(this, arrayList);
/* 194 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 196 */                   return ii0111o;
                        }
                    }
/* 373 */           return OoiIlOl1iI.I00000oIO;
                }
            }
