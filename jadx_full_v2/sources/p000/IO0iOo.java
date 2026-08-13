            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class IO0iOo implements Iterator, O0IlIoi {
                public final int I00iOIl;
                public int I00iiI;
                public String I00iiO;
                public IO0l0Il0lO0 I00iio;

                public IO0iOo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 34 */                    if (this.I00iiI < this.I00iio.I00ilI0I1) {
                                break;
                            }
                            break;
                        case 1:
/* 24 */                    if (this.I00iiI < this.I00iio.I00ilI0I1) {
                                break;
                            }
                            break;
                        default:
/* 14 */                    if (this.I00iiI < this.I00iio.I00ilI0I1) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final Object next() {
                    int i;
                    int i2;
                    int i3;
/* 3 */             Object obj = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 116 */                   IO0l0Il0lO0 iO0l0Il0lO0 = this.I00iio;
/* 122 */                   if (!hasNext()) {
/* 184 */                       IoOOl0iOl1io.I00000oOI();
/* 3 */                         return null;
                            }
/* 124 */                   int[] iArr = iO0l0Il0lO0.I00iio;
/* 126 */                   int i4 = this.I00iiI;
/* 128 */                   int i5 = iArr[i4];
/* 132 */                   String str = iO0l0Il0lO0.I00iOIl[i5];
/* 134 */                   this.I00iiO = str;
/* 140 */                   Object obj2 = iO0l0Il0lO0.I00iiI[i5];
/* 143 */                   IO0iioo1 iO0iioo1 = new IO0iioo1(0);
/* 146 */                   iO0iioo1.I00iio = iO0l0Il0lO0;
/* 148 */                   iO0iioo1.I00iiO = str;
/* 150 */                   iO0iioo1.I00iiI = obj2;
/* 152 */                   VarHandle.storeStoreFence();
/* 157 */                   this.I00iiI = i4 + 1;
                            while (true) {
/* 159 */                       int i6 = this.I00iiI;
/* 163 */                       if (i6 < iO0l0Il0lO0.I00ilI0I1 && ((i = iO0l0Il0lO0.I00iio[i6]) < 0 || iO0l0Il0lO0.I00iOIl[i] == null)) {
/* 179 */                           this.I00iiI = i6 + 1;
                                }
                            }
/* 182 */                   return iO0iioo1;
                        case 1:
/* 62 */                    IO0l0Il0lO0 iO0l0Il0lO02 = this.I00iio;
/* 68 */                    if (!hasNext()) {
/* 112 */                       IoOOl0iOl1io.I00000oOI();
/* 3 */                         return null;
                            }
/* 70 */                    int[] iArr2 = iO0l0Il0lO02.I00iio;
/* 72 */                    int i7 = this.I00iiI;
/* 80 */                    this.I00iiO = iO0l0Il0lO02.I00iOIl[iArr2[i7]];
/* 84 */                    this.I00iiI = i7 + 1;
                            while (true) {
/* 86 */                        int i8 = this.I00iiI;
/* 90 */                        if (i8 < iO0l0Il0lO02.I00ilI0I1 && ((i2 = iO0l0Il0lO02.I00iio[i8]) < 0 || iO0l0Il0lO02.I00iOIl[i2] == null)) {
/* 106 */                           this.I00iiI = i8 + 1;
                                }
                            }
/* 109 */                   return this.I00iiO;
                        default:
/* 7 */                     IO0l0Il0lO0 iO0l0Il0lO03 = this.I00iio;
/* 13 */                    if (hasNext()) {
/* 15 */                        int[] iArr3 = iO0l0Il0lO03.I00iio;
/* 17 */                        int i9 = this.I00iiI;
/* 19 */                        int i10 = iArr3[i9];
/* 25 */                        this.I00iiO = iO0l0Il0lO03.I00iOIl[i10];
/* 29 */                        obj = iO0l0Il0lO03.I00iiI[i10];
/* 33 */                        this.I00iiI = i9 + 1;
                                while (true) {
/* 35 */                            int i11 = this.I00iiI;
/* 39 */                            if (i11 < iO0l0Il0lO03.I00ilI0I1 && ((i3 = iO0l0Il0lO03.I00iio[i11]) < 0 || iO0l0Il0lO03.I00iOIl[i3] == null)) {
/* 55 */                                this.I00iiI = i11 + 1;
                                    }
                                }
                            } else {
/* 58 */                        IoOOl0iOl1io.I00000oOI();
                            }
/* 61 */                    return obj;
                    }
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 41 */                    String str = this.I00iiO;
/* 43 */                    if (str == null) {
/* 53 */                        I000II.I001IO000("next() must be called before remove()");
                                break;
                            } else {
/* 47 */                        this.I00iio.remove(str);
/* 50 */                        this.I00iiO = null;
                                break;
                            }
                        case 1:
/* 25 */                    String str2 = this.I00iiO;
/* 27 */                    if (str2 == null) {
/* 37 */                        I000II.I001IO000("next() must be called before remove()");
                                break;
                            } else {
/* 31 */                        this.I00iio.remove(str2);
/* 34 */                        this.I00iiO = null;
                                break;
                            }
                        default:
/* 9 */                     String str3 = this.I00iiO;
/* 11 */                    if (str3 == null) {
/* 21 */                        I000II.I001IO000("next() must be called before remove()");
                                break;
                            } else {
/* 15 */                        this.I00iio.remove(str3);
/* 18 */                        this.I00iiO = null;
                                break;
                            }
                    }
                }
            }
