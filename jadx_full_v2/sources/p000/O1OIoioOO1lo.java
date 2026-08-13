            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class O1OIoioOO1lo extends OlloI01I implements Iterator, O0IlIoi {
                public final int I00ilI0I1;

                public O1OIoioOO1lo(O1OOII o1ooii, int i) {
/* 1 */             this.I00ilI0I1 = i;
/* 6 */             this.I00iiI = o1ooii;
/* 9 */             this.I00iiO = -1;
/* 13 */            this.I00iio = o1ooii.I00ioIO;
/* 15 */            I0000Il00O();
                }

                @Override
                public final Object next() {
                    switch (this.I00ilI0I1) {
                        case 0:
/* 69 */                    I00000oOI();
/* 72 */                    int i = this.I00iOIl;
/* 76 */                    O1OOII o1ooii = (O1OOII) this.I00iiI;
/* 80 */                    if (i >= o1ooii.I00ilO0) {
/* 108 */                       IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 84 */                        this.I00iOIl = i + 1;
/* 86 */                        this.I00iiO = i;
/* 90 */                        O1OO1illI1 o1OO1illI1 = new O1OO1illI1();
/* 93 */                        o1OO1illI1.I00iOIl = o1ooii;
/* 95 */                        o1OO1illI1.I00iiI = i;
/* 99 */                        o1OO1illI1.I00iiO = o1ooii.I00ioIO;
/* 101 */                       VarHandle.storeStoreFence();
/* 104 */                       I0000Il00O();
                                break;
                            }
                        case 1:
/* 38 */                    I00000oOI();
/* 41 */                    int i2 = this.I00iOIl;
/* 45 */                    O1OOII o1ooii2 = (O1OOII) this.I00iiI;
/* 49 */                    if (i2 >= o1ooii2.I00ilO0) {
/* 65 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 53 */                        this.I00iOIl = i2 + 1;
/* 55 */                        this.I00iiO = i2;
/* 59 */                        Object obj = o1ooii2.I00iOIl[i2];
/* 61 */                        I0000Il00O();
                                break;
                            }
                        default:
/* 7 */                     I00000oOI();
/* 10 */                    int i3 = this.I00iOIl;
/* 14 */                    O1OOII o1ooii3 = (O1OOII) this.I00iiI;
/* 18 */                    if (i3 >= o1ooii3.I00ilO0) {
/* 34 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 22 */                        this.I00iOIl = i3 + 1;
/* 24 */                        this.I00iiO = i3;
/* 28 */                        Object obj2 = o1ooii3.I00iiI[i3];
/* 30 */                        I0000Il00O();
                                break;
                            }
                    }
/* 3 */             return null;
                }
            }
