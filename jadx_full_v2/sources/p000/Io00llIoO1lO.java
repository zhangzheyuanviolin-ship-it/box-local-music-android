            package p000;

            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public final class Io00llIoO1lO implements Iterator, O0IlIoi {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public Io00llIoO1lO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public void I00000oIO() {
/* 1 */             int i = this.I00iiI;
/* 5 */             IlIl0l ilIl0l = (IlIl0l) this.I00iio;
/* 25 */            Object objInvoke = i == -2 ? ((IllOOo00lI) ilIl0l.I00000oOI).invoke() : ((Function1) ilIl0l.I0000Il00O).invoke(this.I00iiO);
/* 29 */            this.I00iiO = objInvoke;
/* 36 */            this.I00iiI = objInvoke == null ? 0 : 1;
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 80 */                    if (this.I00iiI < 0) {
/* 82 */                        I00000oIO();
                            }
                            return this.I00iiI == 1;
                        case 1:
/* 73 */                    return ((OilO111) this.I00iiO).hasNext();
                        case 2:
/* 64 */                    return ((OilO111) this.I00iiO).hasNext();
                        case 3:
/* 19 */                    Oli1lO oli1lO = (Oli1lO) this.I00iio;
/* 23 */                    Iterator it = (Iterator) this.I00iiO;
/* 29 */                    while (this.I00iiI < oli1lO.I00000oOI && it.hasNext()) {
/* 37 */                        it.next();
                                this.I00iiI++;
                            }
                            return this.I00iiI < oli1lO.I0000Il00O && it.hasNext();
                        default:
/* 12 */                    return ((Iterator) this.I00iiO).hasNext();
                    }
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 113 */                   if (this.I00iiI < 0) {
/* 115 */                       I00000oIO();
                            }
/* 120 */                   if (this.I00iiI == 0) {
/* 128 */                       IoOOl0iOl1io.I00000oOI();
/* 3 */                         return null;
                            }
/* 122 */                   Object obj = this.I00iiO;
/* 125 */                   this.I00iiI = -1;
/* 131 */                   return obj;
                        case 1:
/* 106 */                   return ((OilO111) this.I00iiO).next();
                        case 2:
/* 97 */                    return ((OilO111) this.I00iiO).next();
                        case 3:
/* 46 */                    Oli1lO oli1lO = (Oli1lO) this.I00iio;
/* 50 */                    Iterator it = (Iterator) this.I00iiO;
/* 56 */                    while (this.I00iiI < oli1lO.I00000oOI && it.hasNext()) {
/* 64 */                        it.next();
                                this.I00iiI++;
                            }
/* 74 */                    int i = this.I00iiI;
/* 78 */                    if (i < oli1lO.I0000Il00O) {
/* 82 */                        this.I00iiI = i + 1;
/* 84 */                        return it.next();
                            }
/* 89 */                    IoOOl0iOl1io.I00000oOI();
/* 3 */                     return null;
                        default:
/* 13 */                    IlliIl1l11O illiIl1l11O = (IlliIl1l11O) ((IlIl0l) this.I00iio).I0000Il00O;
/* 15 */                    int i2 = this.I00iiI;
/* 19 */                    this.I00iiI = i2 + 1;
/* 21 */                    if (i2 >= 0) {
/* 35 */                        return illiIl1l11O.invoke(Integer.valueOf(i2), ((Iterator) this.I00iiO).next());
                            }
/* 40 */                    IOOi1I.I000lI();
/* 43 */                    throw null;
                    }
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 58 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 1:
/* 37 */                    int i = this.I00iiI;
/* 39 */                    if (i != -1) {
/* 47 */                        ((OI0oo0o) this.I00iio).I00iiI.I000O01llI0(i);
/* 50 */                        this.I00iiI = -1;
/* 52 */                        return;
                            }
/* 52 */                    return;
                        case 2:
/* 21 */                    int i2 = this.I00iiI;
/* 23 */                    if (i2 != -1) {
/* 31 */                        ((OI10OiOo) this.I00iio).I00iiI.I000lI(i2);
/* 34 */                        this.I00iiI = -1;
/* 36 */                        return;
                            }
/* 36 */                    return;
                        case 3:
/* 20 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 14 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }
            }
