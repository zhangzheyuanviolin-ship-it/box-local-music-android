            package p000;

            import java.io.IOException;
            
            public final class OoO1o1 extends OoO00O1IiOl {
                public final int I00000oIO;
                public final boolean I00000oOI;

                public OoO1o1(boolean z, int i) {
/* 1 */             this.I00000oIO = i;
/* 3 */             this.I00000oOI = z;
                }

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
                    switch (this.I00000oIO) {
                        case 0:
/* 33 */                    if (o01loll1loll.peek() != 9) {
/* 43 */                        return Double.valueOf(o01loll1loll.I00OIl());
                            }
/* 35 */                    o01loll1loll.I00ioIO();
/* 3 */                     return null;
                        default:
/* 13 */                    if (o01loll1loll.peek() != 9) {
/* 24 */                        return Float.valueOf((float) o01loll1loll.I00OIl());
                            }
/* 15 */                    o01loll1loll.I00ioIO();
/* 3 */                     return null;
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 1 */             int i = this.I00000oIO;
/* 3 */             boolean z = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 39 */                    Number number = (Number) obj;
/* 41 */                    if (number != null) {
/* 47 */                        double dDoubleValue = number.doubleValue();
/* 51 */                        if (z) {
/* 53 */                            OoOI01I0lI0.I00000oIO(dDoubleValue);
                                }
/* 56 */                        o01ooi1IIiiO.I00iiI();
/* 62 */                        if (o01ooi1IIiiO.I00ioIO != 1 && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
/* 79 */                            IoOOl0iOl1io.I000II("Numeric values must be finite, but was ", dDoubleValue);
                                    break;
                                } else {
/* 83 */                            o01ooi1IIiiO.I00000oIO();
/* 92 */                            o01ooi1IIiiO.I00iOIl.append((CharSequence) Double.toString(dDoubleValue));
                                    break;
                                }
                            } else {
/* 43 */                        o01ooi1IIiiO.I00IOO();
                                break;
                            }
                            break;
                        default:
/* 8 */                     Number numberValueOf = (Number) obj;
/* 10 */                    if (numberValueOf != null) {
/* 16 */                        float fFloatValue = numberValueOf.floatValue();
/* 20 */                        if (z) {
/* 23 */                            OoOI01I0lI0.I00000oIO(fFloatValue);
                                }
/* 28 */                        if (!(numberValueOf instanceof Float)) {
/* 31 */                            numberValueOf = Float.valueOf(fFloatValue);
                                }
/* 35 */                        o01ooi1IIiiO.I00OOll1(numberValueOf);
                                break;
                            } else {
/* 12 */                        o01ooi1IIiiO.I00IOO();
                                break;
                            }
                    }
                }
            }
