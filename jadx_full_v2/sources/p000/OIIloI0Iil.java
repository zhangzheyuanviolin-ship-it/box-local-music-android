            package p000;

            import java.util.ArrayDeque;
            import java.util.Iterator;
            import java.util.Stack;
            
/* 54 */    public final class OIIloI0Iil implements Iterator {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public OIIloI0Iil(ii01lO0l11ii ii01lo0l11ii) {
/* 2 */             this.I00iOIl = 2;
/* 9 */             if (!(ii01lo0l11ii instanceof ii0oOlo)) {
/* 49 */                this.I00iiI = null;
/* 53 */                this.I00iiO = (ii01iiOoo) ii01lo0l11ii;
/* 77 */                return;
                    }
/* 11 */            ii0oOlo ii0oolo = (ii0oOlo) ii01lo0l11ii;
/* 17 */            ArrayDeque arrayDeque = new ArrayDeque(ii0oolo.I00io1l);
/* 20 */            this.I00iiI = arrayDeque;
/* 22 */            arrayDeque.push(ii0oolo);
/* 25 */            ii01lO0l11ii ii01lo0l11ii2 = ii0oolo.I00iio;
/* 29 */            while (ii01lo0l11ii2 instanceof ii0oOlo) {
/* 31 */                ii0oOlo ii0oolo2 = (ii0oOlo) ii01lo0l11ii2;
/* 37 */                ((ArrayDeque) this.I00iiI).push(ii0oolo2);
/* 40 */                ii01lo0l11ii2 = ii0oolo2.I00iio;
                    }
/* 45 */            this.I00iiO = (ii01iiOoo) ii01lo0l11ii2;
                }

                public O1101ooIo0l I00000oIO() {
/* 3 */             Stack stack = (Stack) this.I00iiI;
/* 7 */             O1101ooIo0l o1101ooIo0l = (O1101ooIo0l) this.I00iiO;
/* 9 */             O1101ooIo0l o1101ooIo0l2 = null;
/* 10 */            if (o1101ooIo0l == null) {
/* 51 */                IoOOl0iOl1io.I00000oOI();
/* 9 */                 return null;
                    }
                    while (true) {
/* 16 */                if (!stack.isEmpty()) {
/* 25 */                    IIOII1 iioii1 = ((OiI01lII01oI) stack.pop()).I00iio;
/* 29 */                    while (iioii1 instanceof OiI01lII01oI) {
/* 31 */                        OiI01lII01oI oiI01lII01oI = (OiI01lII01oI) iioii1;
/* 33 */                        stack.push(oiI01lII01oI);
/* 36 */                        iioii1 = oiI01lII01oI.I00iiO;
                            }
/* 39 */                    O1101ooIo0l o1101ooIo0l3 = (O1101ooIo0l) iioii1;
/* 44 */                    if (o1101ooIo0l3.I00iiI.length != 0) {
/* 47 */                        o1101ooIo0l2 = o1101ooIo0l3;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
/* 48 */            this.I00iiO = o1101ooIo0l2;
/* 50 */            return o1101ooIo0l;
                }

                public ii01iiOoo I00000oOI() {
/* 3 */             ArrayDeque arrayDeque = (ArrayDeque) this.I00iiI;
/* 7 */             ii01iiOoo ii01iiooo = (ii01iiOoo) this.I00iiO;
/* 9 */             ii01iiOoo ii01iiooo2 = null;
/* 10 */            if (ii01iiooo == null) {
/* 53 */                IoOOl0iOl1io.I00000oOI();
/* 9 */                 return null;
                    }
                    while (true) {
/* 12 */                if (arrayDeque == null || arrayDeque.isEmpty()) {
                            break;
                        }
/* 27 */                ii01lO0l11ii ii01lo0l11ii = ((ii0oOlo) arrayDeque.pop()).I00ilI0I1;
/* 31 */                while (ii01lo0l11ii instanceof ii0oOlo) {
/* 33 */                    ii0oOlo ii0oolo = (ii0oOlo) ii01lo0l11ii;
/* 35 */                    arrayDeque.push(ii0oolo);
/* 38 */                    ii01lo0l11ii = ii0oolo.I00iio;
                        }
/* 41 */                ii01iiOoo ii01iiooo3 = (ii01iiOoo) ii01lo0l11ii;
/* 47 */                if (ii01iiooo3.I0001Ioi1lo() != 0) {
/* 49 */                    ii01iiooo2 = ii01iiooo3;
                            break;
                        }
                    }
/* 50 */            this.I00iiO = ii01iiooo2;
/* 52 */            return ii01iiooo;
                }

                public il1lilI1Ol I0000Il00O() {
/* 3 */             ArrayDeque arrayDeque = (ArrayDeque) this.I00iiI;
/* 7 */             il1lilI1Ol il1lili1ol = (il1lilI1Ol) this.I00iiO;
/* 9 */             il1lilI1Ol il1lili1ol2 = null;
/* 10 */            if (il1lili1ol == null) {
/* 53 */                IoOOl0iOl1io.I00000oOI();
/* 9 */                 return null;
                    }
                    while (true) {
/* 12 */                if (arrayDeque == null || arrayDeque.isEmpty()) {
                            break;
                        }
/* 27 */                il1oII0OlIo il1oii0olio = ((ioo11I) arrayDeque.pop()).I00ilI0I1;
/* 31 */                while (il1oii0olio instanceof ioo11I) {
/* 33 */                    ioo11I ioo11i = (ioo11I) il1oii0olio;
/* 35 */                    arrayDeque.push(ioo11i);
/* 38 */                    il1oii0olio = ioo11i.I00iio;
                        }
/* 41 */                il1lilI1Ol il1lili1ol3 = (il1lilI1Ol) il1oii0olio;
/* 47 */                if (il1lili1ol3.I0001Ioi1lo() != 0) {
/* 49 */                    il1lili1ol2 = il1lili1ol3;
                            break;
                        }
                    }
/* 50 */            this.I00iiO = il1lili1ol2;
/* 52 */            return il1lili1ol;
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 34 */                    OIIl1OIol oIIl1OIol = (OIIl1OIol) this.I00iiI;
/* 36 */                    if (oIIl1OIol != null && oIIl1OIol != ((OIIl1OIol) this.I00iiO)) {
                                break;
                            }
                            break;
                        case 1:
/* 28 */                    if (((O1101ooIo0l) this.I00iiO) != null) {
                                break;
                            }
                            break;
                        case 2:
/* 20 */                    if (((ii01iiOoo) this.I00iiO) != null) {
                                break;
                            }
                            break;
                        default:
/* 12 */                    if (((il1lilI1Ol) this.I00iiO) != null) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 23 */                    OIIl1OIol oIIl1OIol = (OIIl1OIol) this.I00iiI;
/* 27 */                    this.I00iiI = oIIl1OIol.I0000oI00;
/* 29 */                    return oIIl1OIol;
                        case 1:
/* 16 */                    return I00000oIO();
                        case 2:
/* 11 */                    return I00000oOI();
                        default:
/* 6 */                     return I0000Il00O();
                    }
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 31 */                    throw new UnsupportedOperationException("remove");
                        case 1:
/* 23 */                    throw new UnsupportedOperationException();
                        case 2:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

/* 56 */        public OIIloI0Iil(il1oII0OlIo il1oii0olio) {
                    this.I00iOIl = 3;
                    if (il1oii0olio instanceof ioo11I) {
                        ioo11I ioo11i = (ioo11I) il1oii0olio;
/* 59 */                ArrayDeque arrayDeque = new ArrayDeque(ioo11i.I00io1l);
                        this.I00iiI = arrayDeque;
/* 60 */                arrayDeque.push(ioo11i);
/* 61 */                il1oII0OlIo il1oii0olio2 = ioo11i.I00iio;
/* 62 */                while (il1oii0olio2 instanceof ioo11I) {
                            ioo11I ioo11i2 = (ioo11I) il1oii0olio2;
/* 63 */                    ((ArrayDeque) this.I00iiI).push(ioo11i2);
/* 64 */                    il1oii0olio2 = ioo11i2.I00iio;
                        }
/* 66 */                this.I00iiO = (il1lilI1Ol) il1oii0olio2;
                        return;
                    }
                    this.I00iiI = null;
/* 67 */            this.I00iiO = (il1lilI1Ol) il1oii0olio;
                }

/* 67 */        public OIIloI0Iil(IIOII1 iioii1) {
                    this.I00iOIl = 1;
/* 69 */            this.I00iiI = new Stack();
/* 70 */            while (iioii1 instanceof OiI01lII01oI) {
/* 71 */                OiI01lII01oI oiI01lII01oI = (OiI01lII01oI) iioii1;
/* 72 */                ((Stack) this.I00iiI).push(oiI01lII01oI);
/* 73 */                iioii1 = oiI01lII01oI.I00iiO;
                    }
/* 75 */            this.I00iiO = (O1101ooIo0l) iioii1;
                }
            }
