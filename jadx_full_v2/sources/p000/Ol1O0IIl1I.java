            package p000;

            import java.util.AbstractMap;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class Ol1O0IIl1I implements Iterator {
                public final int I00iOIl;
                public int I00iiI;
                public boolean I00iiO;
                public Iterator I00iio;
                public AbstractMap I00ilI0I1;

                public Ol1O0IIl1I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public Iterator I00000oIO() {
                    switch (this.I00iOIl) {
                        case 0:
/* 48 */                    Iterator it = this.I00iio;
/* 50 */                    if (it != null) {
/* 68 */                        return it;
                            }
/* 62 */                    Iterator it2 = ((Ol1Ili0) this.I00ilI0I1).I00iiO.entrySet().iterator();
/* 66 */                    this.I00iio = it2;
/* 68 */                    return it2;
                        case 1:
/* 27 */                    Iterator it3 = this.I00iio;
/* 29 */                    if (it3 != null) {
/* 47 */                        return it3;
                            }
/* 41 */                    Iterator it4 = ((Ol1Io01IOiO) this.I00ilI0I1).I00iiO.entrySet().iterator();
/* 45 */                    this.I00iio = it4;
/* 47 */                    return it4;
                        default:
/* 6 */                     Iterator it5 = this.I00iio;
/* 8 */                     if (it5 != null) {
/* 26 */                        return it5;
                            }
/* 20 */                    Iterator it6 = ((Ol1Io11i1Ol) this.I00ilI0I1).I00iiI.entrySet().iterator();
/* 24 */                    this.I00iio = it6;
/* 26 */                    return it6;
                    }
                }

                public Iterator I00000oOI() {
/* 1 */             Iterator it = this.I00iio;
/* 3 */             if (it != null) {
/* 55 */                return it;
                    }
/* 15 */            Iterator it2 = ((i11o10OIl) this.I00ilI0I1).I00iiO.entrySet().iterator();
/* 19 */            this.I00iio = it2;
/* 55 */            return it2;
                }

                public Iterator I0000Il00O() {
                    switch (this.I00iOIl) {
                        case 4:
/* 90 */                    Iterator it = this.I00iio;
/* 92 */                    if (it != null) {
/* 110 */                       return it;
                            }
/* 104 */                   Iterator it2 = ((iI11OIoO) this.I00ilI0I1).I00iiO.entrySet().iterator();
/* 108 */                   this.I00iio = it2;
/* 110 */                   return it2;
                        case 5:
/* 69 */                    Iterator it3 = this.I00iio;
/* 71 */                    if (it3 != null) {
/* 89 */                        return it3;
                            }
/* 83 */                    Iterator it4 = ((ii0oll0il) this.I00ilI0I1).I00iiO.entrySet().iterator();
/* 87 */                    this.I00iio = it4;
/* 89 */                    return it4;
                        case 6:
/* 48 */                    Iterator it5 = this.I00iio;
/* 50 */                    if (it5 != null) {
/* 68 */                        return it5;
                            }
/* 62 */                    Iterator it6 = ((ioolilol1oO0) this.I00ilI0I1).I00iiO.entrySet().iterator();
/* 66 */                    this.I00iio = it6;
/* 68 */                    return it6;
                        case 7:
/* 27 */                    Iterator it7 = this.I00iio;
/* 29 */                    if (it7 != null) {
/* 47 */                        return it7;
                            }
/* 41 */                    Iterator it8 = ((lOI1I000IoiI) this.I00ilI0I1).I00iiO.entrySet().iterator();
/* 45 */                    this.I00iio = it8;
/* 47 */                    return it8;
                        default:
/* 6 */                     Iterator it9 = this.I00iio;
/* 8 */                     if (it9 != null) {
/* 26 */                        return it9;
                            }
/* 20 */                    Iterator it10 = ((o0OIiOo0oOi) this.I00ilI0I1).I00iiO.entrySet().iterator();
/* 24 */                    this.I00iio = it10;
/* 26 */                    return it10;
                    }
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 266 */                   int i = this.I00iiI + 1;
/* 269 */                   Ol1Ili0 ol1Ili0 = (Ol1Ili0) this.I00ilI0I1;
/* 273 */                   if (i >= ol1Ili0.I00iiI) {
/* 281 */                       if (ol1Ili0.I00iiO.isEmpty() || !I00000oIO().hasNext()) {
                                    break;
                                }
                            }
                            break;
                        case 1:
/* 249 */                   if (this.I00iiI + 1 >= ((Ol1Io01IOiO) this.I00ilI0I1).I00iiI.size() && !I00000oIO().hasNext()) {
                                break;
                            }
                            break;
                        case 2:
/* 202 */                   int i2 = this.I00iiI + 1;
/* 205 */                   Ol1Io11i1Ol ol1Io11i1Ol = (Ol1Io11i1Ol) this.I00ilI0I1;
/* 213 */                   if (i2 >= ol1Io11i1Ol.I00iOIl.size()) {
/* 221 */                       if (ol1Io11i1Ol.I00iiI.isEmpty() || !I00000oIO().hasNext()) {
                                    break;
                                }
                            }
                            break;
                        case 3:
/* 170 */                   int i3 = this.I00iiI + 1;
/* 173 */                   i11o10OIl i11o10oil = (i11o10OIl) this.I00ilI0I1;
/* 177 */                   if (i3 >= i11o10oil.I00iiI) {
/* 185 */                       if (i11o10oil.I00iiO.isEmpty() || !I00000oOI().hasNext()) {
                                    break;
                                }
                            }
                            break;
                        case 4:
/* 138 */                   int i4 = this.I00iiI + 1;
/* 141 */                   iI11OIoO ii11oioo = (iI11OIoO) this.I00ilI0I1;
/* 145 */                   if (i4 >= ii11oioo.I00iiI) {
/* 153 */                       if (ii11oioo.I00iiO.isEmpty() || !I0000Il00O().hasNext()) {
                                    break;
                                }
                            }
                            break;
                        case 5:
/* 106 */                   int i5 = this.I00iiI + 1;
/* 109 */                   ii0oll0il ii0oll0ilVar = (ii0oll0il) this.I00ilI0I1;
/* 113 */                   if (i5 >= ii0oll0ilVar.I00iiI) {
/* 121 */                       if (ii0oll0ilVar.I00iiO.isEmpty() || !I0000Il00O().hasNext()) {
                                    break;
                                }
                            }
                            break;
                        case 6:
/* 74 */                    int i6 = this.I00iiI + 1;
/* 77 */                    ioolilol1oO0 ioolilol1oo0 = (ioolilol1oO0) this.I00ilI0I1;
/* 81 */                    if (i6 >= ioolilol1oo0.I00iiI) {
/* 89 */                        if (ioolilol1oo0.I00iiO.isEmpty() || !I0000Il00O().hasNext()) {
                                    break;
                                }
                            }
                            break;
                        case 7:
/* 42 */                    int i7 = this.I00iiI + 1;
/* 45 */                    lOI1I000IoiI loi1i000ioii = (lOI1I000IoiI) this.I00ilI0I1;
/* 49 */                    if (i7 >= loi1i000ioii.I00iiI) {
/* 57 */                        if (loi1i000ioii.I00iiO.isEmpty() || !I0000Il00O().hasNext()) {
                                    break;
                                }
                            }
                            break;
                        default:
/* 10 */                    int i8 = this.I00iiI + 1;
/* 13 */                    o0OIiOo0oOi o0oiioo0ooi = (o0OIiOo0oOi) this.I00ilI0I1;
/* 17 */                    if (i8 >= o0oiioo0ooi.I00iiI) {
/* 25 */                        if (o0oiioo0ooi.I00iiO.isEmpty() || !I0000Il00O().hasNext()) {
                                    break;
                                }
                            }
                            break;
                    }
/* 4 */             return false;
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 287 */                   this.I00iiO = true;
/* 291 */                   int i = this.I00iiI + 1;
/* 292 */                   this.I00iiI = i;
/* 296 */                   Ol1Ili0 ol1Ili0 = (Ol1Ili0) this.I00ilI0I1;
/* 300 */                   if (i >= ol1Ili0.I00iiI) {
                                break;
                            } else {
                                break;
                            }
                        case 1:
/* 246 */                   this.I00iiO = true;
/* 250 */                   int i2 = this.I00iiI + 1;
/* 251 */                   this.I00iiI = i2;
/* 255 */                   Ol1Io01IOiO ol1Io01IOiO = (Ol1Io01IOiO) this.I00ilI0I1;
/* 263 */                   if (i2 >= ol1Io01IOiO.I00iiI.size()) {
                                break;
                            } else {
                                break;
                            }
                        case 2:
/* 205 */                   this.I00iiO = true;
/* 209 */                   int i3 = this.I00iiI + 1;
/* 210 */                   this.I00iiI = i3;
/* 214 */                   Ol1Io11i1Ol ol1Io11i1Ol = (Ol1Io11i1Ol) this.I00ilI0I1;
/* 222 */                   if (i3 >= ol1Io11i1Ol.I00iOIl.size()) {
                                break;
                            } else {
                                break;
                            }
                        case 3:
/* 172 */                   this.I00iiO = true;
/* 176 */                   int i4 = this.I00iiI + 1;
/* 177 */                   this.I00iiI = i4;
/* 181 */                   i11o10OIl i11o10oil = (i11o10OIl) this.I00ilI0I1;
/* 185 */                   if (i4 >= i11o10oil.I00iiI) {
                                break;
                            } else {
                                break;
                            }
                        case 4:
/* 139 */                   this.I00iiO = true;
/* 143 */                   int i5 = this.I00iiI + 1;
/* 144 */                   this.I00iiI = i5;
/* 148 */                   iI11OIoO ii11oioo = (iI11OIoO) this.I00ilI0I1;
/* 152 */                   if (i5 >= ii11oioo.I00iiI) {
                                break;
                            } else {
                                break;
                            }
                        case 5:
/* 106 */                   this.I00iiO = true;
/* 110 */                   int i6 = this.I00iiI + 1;
/* 111 */                   this.I00iiI = i6;
/* 115 */                   ii0oll0il ii0oll0ilVar = (ii0oll0il) this.I00ilI0I1;
/* 119 */                   if (i6 >= ii0oll0ilVar.I00iiI) {
                                break;
                            } else {
                                break;
                            }
                        case 6:
/* 73 */                    this.I00iiO = true;
/* 77 */                    int i7 = this.I00iiI + 1;
/* 78 */                    this.I00iiI = i7;
/* 82 */                    ioolilol1oO0 ioolilol1oo0 = (ioolilol1oO0) this.I00ilI0I1;
/* 86 */                    if (i7 >= ioolilol1oo0.I00iiI) {
                                break;
                            } else {
                                break;
                            }
                        case 7:
/* 40 */                    this.I00iiO = true;
/* 44 */                    int i8 = this.I00iiI + 1;
/* 45 */                    this.I00iiI = i8;
/* 49 */                    lOI1I000IoiI loi1i000ioii = (lOI1I000IoiI) this.I00ilI0I1;
/* 53 */                    if (i8 >= loi1i000ioii.I00iiI) {
                                break;
                            } else {
                                break;
                            }
                        default:
/* 7 */                     this.I00iiO = true;
/* 11 */                    int i9 = this.I00iiI + 1;
/* 12 */                    this.I00iiI = i9;
/* 16 */                    o0OIiOo0oOi o0oiioo0ooi = (o0OIiOo0oOi) this.I00ilI0I1;
/* 20 */                    if (i9 >= o0oiioo0ooi.I00iiI) {
                                break;
                            } else {
                                break;
                            }
                    }
/* 37 */            return (Map.Entry) I0000Il00O().next();
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 349 */                   Ol1Ili0 ol1Ili0 = (Ol1Ili0) this.I00ilI0I1;
/* 353 */                   if (!this.I00iiO) {
/* 384 */                       I000II.I001IO000("remove() was called before next()");
                                break;
                            } else {
/* 355 */                       this.I00iiO = false;
/* 357 */                       int i = Ol1Ili0.I00io1l;
/* 359 */                       ol1Ili0.I00000oOI();
/* 362 */                       int i2 = this.I00iiI;
/* 366 */                       if (i2 >= ol1Ili0.I00iiI) {
/* 380 */                           I00000oIO().remove();
                                    break;
                                } else {
/* 370 */                           this.I00iiI = i2 - 1;
/* 372 */                           ol1Ili0.I000OiO(i2);
                                    break;
                                }
                            }
                        case 1:
/* 302 */                   Ol1Io01IOiO ol1Io01IOiO = (Ol1Io01IOiO) this.I00ilI0I1;
/* 306 */                   if (!this.I00iiO) {
/* 343 */                       I000II.I001IO000("remove() was called before next()");
                                break;
                            } else {
/* 308 */                       this.I00iiO = false;
/* 310 */                       int i3 = Ol1Io01IOiO.I00ilO0;
/* 312 */                       ol1Io01IOiO.I00000oOI();
/* 323 */                       if (this.I00iiI >= ol1Io01IOiO.I00iiI.size()) {
/* 339 */                           I00000oIO().remove();
                                    break;
                                } else {
/* 325 */                           int i4 = this.I00iiI;
/* 329 */                           this.I00iiI = i4 - 1;
/* 331 */                           ol1Io01IOiO.I000OOo1O(i4);
                                    break;
                                }
                            }
                        case 2:
/* 255 */                   Ol1Io11i1Ol ol1Io11i1Ol = (Ol1Io11i1Ol) this.I00ilI0I1;
/* 259 */                   if (!this.I00iiO) {
/* 296 */                       I000II.I001IO000("remove() was called before next()");
                                break;
                            } else {
/* 261 */                       this.I00iiO = false;
/* 263 */                       int i5 = Ol1Io11i1Ol.I00ilO0;
/* 265 */                       ol1Io11i1Ol.I00000oOI();
/* 276 */                       if (this.I00iiI >= ol1Io11i1Ol.I00iOIl.size()) {
/* 292 */                           I00000oIO().remove();
                                    break;
                                } else {
/* 278 */                           int i6 = this.I00iiI;
/* 282 */                           this.I00iiI = i6 - 1;
/* 284 */                           ol1Io11i1Ol.I000OiO(i6);
                                    break;
                                }
                            }
                        case 3:
/* 214 */                   i11o10OIl i11o10oil = (i11o10OIl) this.I00ilI0I1;
/* 218 */                   if (!this.I00iiO) {
/* 249 */                       I000II.I001IO000("remove() was called before next()");
                                break;
                            } else {
/* 220 */                       this.I00iiO = false;
/* 222 */                       int i7 = i11o10OIl.I00io1l;
/* 224 */                       i11o10oil.I000OOo1O();
/* 227 */                       int i8 = this.I00iiI;
/* 231 */                       if (i8 >= i11o10oil.I00iiI) {
/* 245 */                           I00000oOI().remove();
                                    break;
                                } else {
/* 235 */                           this.I00iiI = i8 - 1;
/* 237 */                           i11o10oil.I000II(i8);
                                    break;
                                }
                            }
                        case 4:
/* 175 */                   if (!this.I00iiO) {
/* 208 */                       I000II.I001IO000("remove() was called before next()");
                                break;
                            } else {
/* 177 */                       this.I00iiO = false;
/* 181 */                       iI11OIoO ii11oioo = (iI11OIoO) this.I00ilI0I1;
/* 183 */                       ii11oioo.I000O01llI0();
/* 186 */                       int i9 = this.I00iiI;
/* 190 */                       if (i9 >= ii11oioo.I00iiI) {
/* 204 */                           I0000Il00O().remove();
                                    break;
                                } else {
/* 194 */                           this.I00iiI = i9 - 1;
/* 196 */                           ii11oioo.I0000O(i9);
                                    break;
                                }
                            }
                        case 5:
/* 134 */                   ii0oll0il ii0oll0ilVar = (ii0oll0il) this.I00ilI0I1;
/* 138 */                   if (!this.I00iiO) {
/* 169 */                       I000II.I001IO000("remove() was called before next()");
                                break;
                            } else {
/* 140 */                       this.I00iiO = false;
/* 142 */                       int i10 = ii0oll0il.I00io1l;
/* 144 */                       ii0oll0ilVar.I000OOo1O();
/* 147 */                       int i11 = this.I00iiI;
/* 151 */                       if (i11 >= ii0oll0ilVar.I00iiI) {
/* 165 */                           I0000Il00O().remove();
                                    break;
                                } else {
/* 155 */                           this.I00iiI = i11 - 1;
/* 157 */                           ii0oll0ilVar.I000II(i11);
                                    break;
                                }
                            }
                        case 6:
/* 93 */                    ioolilol1oO0 ioolilol1oo0 = (ioolilol1oO0) this.I00ilI0I1;
/* 97 */                    if (!this.I00iiO) {
/* 128 */                       I000II.I001IO000("remove() was called before next()");
                                break;
                            } else {
/* 99 */                        this.I00iiO = false;
/* 101 */                       int i12 = ioolilol1oO0.I00io1l;
/* 103 */                       ioolilol1oo0.I000OOo1O();
/* 106 */                       int i13 = this.I00iiI;
/* 110 */                       if (i13 >= ioolilol1oo0.I00iiI) {
/* 124 */                           I0000Il00O().remove();
                                    break;
                                } else {
/* 114 */                           this.I00iiI = i13 - 1;
/* 116 */                           ioolilol1oo0.I000II(i13);
                                    break;
                                }
                            }
                        case 7:
/* 52 */                    lOI1I000IoiI loi1i000ioii = (lOI1I000IoiI) this.I00ilI0I1;
/* 56 */                    if (!this.I00iiO) {
/* 87 */                        I000II.I001IO000("remove() was called before next()");
                                break;
                            } else {
/* 58 */                        this.I00iiO = false;
/* 60 */                        int i14 = lOI1I000IoiI.I00io1l;
/* 62 */                        loi1i000ioii.I000OOo1O();
/* 65 */                        int i15 = this.I00iiI;
/* 69 */                        if (i15 >= loi1i000ioii.I00iiI) {
/* 83 */                            I0000Il00O().remove();
                                    break;
                                } else {
/* 73 */                            this.I00iiI = i15 - 1;
/* 75 */                            loi1i000ioii.I000II(i15);
                                    break;
                                }
                            }
                        default:
/* 11 */                    o0OIiOo0oOi o0oiioo0ooi = (o0OIiOo0oOi) this.I00ilI0I1;
/* 15 */                    if (!this.I00iiO) {
/* 46 */                        I000II.I001IO000("remove() was called before next()");
                                break;
                            } else {
/* 17 */                        this.I00iiO = false;
/* 19 */                        int i16 = o0OIiOo0oOi.I00io1l;
/* 21 */                        o0oiioo0ooi.I000OOo1O();
/* 24 */                        int i17 = this.I00iiI;
/* 28 */                        if (i17 >= o0oiioo0ooi.I00iiI) {
/* 42 */                            I0000Il00O().remove();
                                    break;
                                } else {
/* 32 */                            this.I00iiI = i17 - 1;
/* 34 */                            o0oiioo0ooi.I000II(i17);
                                    break;
                                }
                            }
                    }
                }
            }
