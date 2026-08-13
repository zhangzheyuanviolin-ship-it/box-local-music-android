            package p000;

            import java.util.AbstractMap;
            import java.util.Iterator;
            
/* 26 */    public abstract class i1OOoII implements Iterator {
                public final int I00iOIl = 0;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public final AbstractMap I00ilI0I1;

                public i1OOoII(iI0iIIo ii0iiio, byte b) {
/* 7 */             this.I00ilI0I1 = ii0iiio;
/* 11 */            this.I00iiI = ii0iiio.I00ilO0;
/* 23 */            this.I00iiO = ii0iiio.isEmpty() ? -1 : 0;
/* 25 */            this.I00iio = -1;
                }

                public abstract Object I00000oIO(int i);

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 56 */                    if (this.I00iiO >= 0) {
                            }
                            break;
                        case 1:
/* 48 */                    if (this.I00iiO >= 0) {
                            }
                            break;
                        case 2:
/* 40 */                    if (this.I00iiO >= 0) {
                            }
                            break;
                        case 3:
/* 32 */                    if (this.I00iiO >= 0) {
                            }
                            break;
                        case 4:
/* 24 */                    if (this.I00iiO >= 0) {
                            }
                            break;
                        case 5:
/* 16 */                    if (this.I00iiO >= 0) {
                            }
                            break;
                        default:
/* 8 */                     if (this.I00iiO >= 0) {
                            }
                            break;
                    }
/* 12 */            return false;
                }

                @Override
                public final Object next() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             AbstractMap abstractMap = this.I00ilI0I1;
/* 6 */             Object objI00000oIO = null;
                    switch (i) {
                        case 0:
/* 262 */                   iI0iIIo ii0iiio = (iI0iIIo) abstractMap;
/* 268 */                   if (ii0iiio.I00ilO0 != this.I00iiI) {
/* 300 */                       I000II.I001IIilI0O();
                                break;
                            } else if (!hasNext()) {
/* 296 */                       IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 276 */                       int i2 = this.I00iiO;
/* 278 */                       this.I00iio = i2;
/* 280 */                       objI00000oIO = I00000oIO(i2);
/* 286 */                       int i3 = this.I00iiO + 1;
/* 293 */                       this.I00iiO = i3 < ii0iiio.I00io1l ? i3 : -1;
                                break;
                            }
                        case 1:
/* 220 */                   iI0iIIo ii0iiio2 = (iI0iIIo) abstractMap;
/* 226 */                   if (ii0iiio2.I00ilO0 != this.I00iiI) {
/* 258 */                       I000II.I001IIilI0O();
                                break;
                            } else if (!hasNext()) {
/* 254 */                       IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 234 */                       int i4 = this.I00iiO;
/* 236 */                       this.I00iio = i4;
/* 238 */                       objI00000oIO = I00000oIO(i4);
/* 244 */                       int i5 = this.I00iiO + 1;
/* 251 */                       this.I00iiO = i5 < ii0iiio2.I00io1l ? i5 : -1;
                                break;
                            }
                        case 2:
/* 178 */                   iI0iIIo ii0iiio3 = (iI0iIIo) abstractMap;
/* 184 */                   if (ii0iiio3.I00ilO0 != this.I00iiI) {
/* 216 */                       I000II.I001IIilI0O();
                                break;
                            } else if (!hasNext()) {
/* 212 */                       IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 192 */                       int i6 = this.I00iiO;
/* 194 */                       this.I00iio = i6;
/* 196 */                       objI00000oIO = I00000oIO(i6);
/* 202 */                       int i7 = this.I00iiO + 1;
/* 209 */                       this.I00iiO = i7 < ii0iiio3.I00io1l ? i7 : -1;
                                break;
                            }
                        case 3:
/* 136 */                   iI0iIIo ii0iiio4 = (iI0iIIo) abstractMap;
/* 142 */                   if (ii0iiio4.I00ilO0 != this.I00iiI) {
/* 174 */                       I000II.I001IIilI0O();
                                break;
                            } else if (!hasNext()) {
/* 170 */                       IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 150 */                       int i8 = this.I00iiO;
/* 152 */                       this.I00iio = i8;
/* 154 */                       objI00000oIO = I00000oIO(i8);
/* 160 */                       int i9 = this.I00iiO + 1;
/* 167 */                       this.I00iiO = i9 < ii0iiio4.I00io1l ? i9 : -1;
                                break;
                            }
                        case 4:
/* 94 */                    iI0iIIo ii0iiio5 = (iI0iIIo) abstractMap;
/* 100 */                   if (ii0iiio5.I00ilO0 != this.I00iiI) {
/* 132 */                       I000II.I001IIilI0O();
                                break;
                            } else if (!hasNext()) {
/* 128 */                       IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 108 */                       int i10 = this.I00iiO;
/* 110 */                       this.I00iio = i10;
/* 112 */                       objI00000oIO = I00000oIO(i10);
/* 118 */                       int i11 = this.I00iiO + 1;
/* 125 */                       this.I00iiO = i11 < ii0iiio5.I00io1l ? i11 : -1;
                                break;
                            }
                        case 5:
/* 52 */                    iI0iIIo ii0iiio6 = (iI0iIIo) abstractMap;
/* 58 */                    if (ii0iiio6.I00ilO0 != this.I00iiI) {
/* 90 */                        I000II.I001IIilI0O();
                                break;
                            } else if (!hasNext()) {
/* 86 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 66 */                        int i12 = this.I00iiO;
/* 68 */                        this.I00iio = i12;
/* 70 */                        objI00000oIO = I00000oIO(i12);
/* 76 */                        int i13 = this.I00iiO + 1;
/* 83 */                        this.I00iiO = i13 < ii0iiio6.I00io1l ? i13 : -1;
                                break;
                            }
                        default:
/* 10 */                    iI0iIIo ii0iiio7 = (iI0iIIo) abstractMap;
/* 16 */                    if (ii0iiio7.I00ilO0 != this.I00iiI) {
/* 48 */                        I000II.I001IIilI0O();
                                break;
                            } else if (!hasNext()) {
/* 44 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 24 */                        int i14 = this.I00iiO;
/* 26 */                        this.I00iio = i14;
/* 28 */                        objI00000oIO = I00000oIO(i14);
/* 34 */                        int i15 = this.I00iiO + 1;
/* 41 */                        this.I00iiO = i15 < ii0iiio7.I00io1l ? i15 : -1;
                                break;
                            }
                    }
/* 51 */            return objI00000oIO;
                }

                @Override
                public final void remove() {
/* 1 */             int i = this.I00iOIl;
/* 7 */             AbstractMap abstractMap = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 280 */                   iI0iIIo ii0iiio = (iI0iIIo) abstractMap;
/* 282 */                   int i2 = ii0iiio.I00ilO0;
/* 284 */                   int i3 = this.I00iiI;
/* 286 */                   if (i2 != i3) {
/* 320 */                       I000II.I001IIilI0O();
                                break;
                            } else {
/* 288 */                       int i4 = this.I00iio;
/* 293 */                       if (!(i4 >= 0)) {
/* 316 */                           I000II.I001IO000("no calls to next() since the last call to remove()");
                                    break;
                                } else {
/* 297 */                           this.I00iiI = i3 + 32;
/* 305 */                           ii0iiio.remove(ii0iiio.I00000oOI()[i4]);
                                    this.I00iiO--;
/* 313 */                           this.I00iio = -1;
                                    break;
                                }
                            }
                        case 1:
/* 235 */                   iI0iIIo ii0iiio2 = (iI0iIIo) abstractMap;
/* 237 */                   int i5 = ii0iiio2.I00ilO0;
/* 239 */                   int i6 = this.I00iiI;
/* 241 */                   if (i5 != i6) {
/* 276 */                       I000II.I001IIilI0O();
                                break;
                            } else {
/* 243 */                       int i7 = this.I00iio;
/* 248 */                       if (!(i7 >= 0)) {
/* 272 */                           I000II.I001IO000("no calls to next() since the last call to remove()");
                                    break;
                                } else {
/* 252 */                           this.I00iiI = i6 + 32;
/* 254 */                           Object[] objArr = ii0iiio2.I00iio;
/* 256 */                           objArr.getClass();
/* 261 */                           ii0iiio2.remove(objArr[i7]);
                                    this.I00iiO--;
/* 269 */                           this.I00iio = -1;
                                    break;
                                }
                            }
                        case 2:
/* 191 */                   iI0iIIo ii0iiio3 = (iI0iIIo) abstractMap;
/* 193 */                   int i8 = ii0iiio3.I00ilO0;
/* 195 */                   int i9 = this.I00iiI;
/* 197 */                   if (i8 != i9) {
/* 231 */                       I000II.I001IIilI0O();
                                break;
                            } else {
/* 199 */                       int i10 = this.I00iio;
/* 204 */                       if (!(i10 >= 0)) {
/* 227 */                           I000II.I001IO000("no calls to next() since the last call to remove()");
                                    break;
                                } else {
/* 208 */                           this.I00iiI = i9 + 32;
/* 216 */                           ii0iiio3.remove(ii0iiio3.I00000oOI()[i10]);
                                    this.I00iiO--;
/* 224 */                           this.I00iio = -1;
                                    break;
                                }
                            }
                        case 3:
/* 147 */                   iI0iIIo ii0iiio4 = (iI0iIIo) abstractMap;
/* 149 */                   int i11 = ii0iiio4.I00ilO0;
/* 151 */                   int i12 = this.I00iiI;
/* 153 */                   if (i11 != i12) {
/* 187 */                       I000II.I001IIilI0O();
                                break;
                            } else {
/* 155 */                       int i13 = this.I00iio;
/* 160 */                       if (!(i13 >= 0)) {
/* 183 */                           I000II.I001IO000("no calls to next() since the last call to remove()");
                                    break;
                                } else {
/* 164 */                           this.I00iiI = i12 + 32;
/* 172 */                           ii0iiio4.remove(ii0iiio4.I00000oOI()[i13]);
                                    this.I00iiO--;
/* 180 */                           this.I00iio = -1;
                                    break;
                                }
                            }
                        case 4:
/* 103 */                   iI0iIIo ii0iiio5 = (iI0iIIo) abstractMap;
/* 105 */                   int i14 = ii0iiio5.I00ilO0;
/* 107 */                   int i15 = this.I00iiI;
/* 109 */                   if (i14 != i15) {
/* 143 */                       I000II.I001IIilI0O();
                                break;
                            } else {
/* 111 */                       int i16 = this.I00iio;
/* 116 */                       if (!(i16 >= 0)) {
/* 139 */                           I000II.I001IO000("no calls to next() since the last call to remove()");
                                    break;
                                } else {
/* 120 */                           this.I00iiI = i15 + 32;
/* 128 */                           ii0iiio5.remove(ii0iiio5.I00000oOI()[i16]);
                                    this.I00iiO--;
/* 136 */                           this.I00iio = -1;
                                    break;
                                }
                            }
                        case 5:
/* 58 */                    iI0iIIo ii0iiio6 = (iI0iIIo) abstractMap;
/* 60 */                    int i17 = ii0iiio6.I00ilO0;
/* 62 */                    int i18 = this.I00iiI;
/* 64 */                    if (i17 != i18) {
/* 99 */                        I000II.I001IIilI0O();
                                break;
                            } else {
/* 66 */                        int i19 = this.I00iio;
/* 71 */                        if (!(i19 >= 0)) {
/* 95 */                            I000II.I001IO000("no calls to next() since the last call to remove()");
                                    break;
                                } else {
/* 75 */                            this.I00iiI = i18 + 32;
/* 77 */                            Object[] objArr2 = ii0iiio6.I00iio;
/* 79 */                            objArr2.getClass();
/* 84 */                            ii0iiio6.remove(objArr2[i19]);
                                    this.I00iiO--;
/* 92 */                            this.I00iio = -1;
                                    break;
                                }
                            }
                        default:
/* 13 */                    iI0iIIo ii0iiio7 = (iI0iIIo) abstractMap;
/* 19 */                    if (ii0iiio7.I00ilO0 != this.I00iiI) {
/* 54 */                        I000II.I001IIilI0O();
                                break;
                            } else {
/* 26 */                        lil0iIo1Oiil.I0000Il00O("no calls to next() since the last call to remove()", this.I00iio >= 0);
                                this.I00iiI += 32;
/* 43 */                        ii0iiio7.remove(ii0iiio7.I00000oOI()[this.I00iio]);
                                this.I00iiO--;
/* 51 */                        this.I00iio = -1;
                                break;
                            }
                    }
                }

/* 27 */        public i1OOoII(iI0iIIo ii0iiio) {
                    this.I00ilI0I1 = ii0iiio;
/* 30 */            this.I00iiI = ii0iiio.I00ilO0;
/* 32 */            this.I00iiO = ii0iiio.isEmpty() ? -1 : 0;
                    this.I00iio = -1;
                }

/* 32 */        public i1OOoII(iI0iIIo ii0iiio, byte b, byte b2) {
                    this.I00ilI0I1 = ii0iiio;
/* 35 */            this.I00iiI = ii0iiio.I00ilO0;
/* 37 */            this.I00iiO = ii0iiio.isEmpty() ? -1 : 0;
                    this.I00iio = -1;
                }

/* 37 */        public i1OOoII(iI0iIIo ii0iiio, byte b, boolean z) {
                    this.I00ilI0I1 = ii0iiio;
/* 40 */            this.I00iiI = ii0iiio.I00ilO0;
/* 42 */            this.I00iiO = ii0iiio.isEmpty() ? -1 : 0;
                    this.I00iio = -1;
                }

/* 42 */        public i1OOoII(iI0iIIo ii0iiio, char c) {
                    this.I00ilI0I1 = ii0iiio;
/* 45 */            this.I00iiI = ii0iiio.I00ilO0;
/* 47 */            this.I00iiO = ii0iiio.isEmpty() ? -1 : 0;
                    this.I00iio = -1;
                }

/* 47 */        public i1OOoII(iI0iIIo ii0iiio, int i) {
                    this.I00ilI0I1 = ii0iiio;
/* 50 */            this.I00iiI = ii0iiio.I00ilO0;
/* 52 */            this.I00iiO = ii0iiio.isEmpty() ? -1 : 0;
                    this.I00iio = -1;
                }

/* 52 */        public i1OOoII(iI0iIIo ii0iiio, short s) {
                    this.I00ilI0I1 = ii0iiio;
/* 55 */            this.I00iiI = ii0iiio.I00ilO0;
/* 57 */            this.I00iiO = ii0iiio.isEmpty() ? -1 : 0;
                    this.I00iio = -1;
                }
            }
