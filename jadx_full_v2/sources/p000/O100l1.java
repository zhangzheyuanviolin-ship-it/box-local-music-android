            package p000;

            import java.util.Map;
            
/* 23 */    public final class O100l1 implements Map.Entry {
                public final int I00iOIl;
                public Object I00iiI;
                public boolean I00iiO;
                public Object I00iio;
                public int I00ilI0I1;
                public Map.Entry I00ilO0;
                public Map.Entry I00io1l;
                public Map.Entry I00ioIO;
                public Map.Entry I00l0I0l0lO1;
                public Map.Entry I00l0OO0IO;

                public O100l1(boolean z, O100l1 o100l1, Object obj, O100l1 o100l12, O100l1 o100l13) {
/* 2 */             this.I00iOIl = 0;
/* 7 */             this.I00ilO0 = o100l1;
/* 9 */             this.I00iiI = obj;
/* 11 */            this.I00iiO = z;
/* 14 */            this.I00ilI0I1 = 1;
/* 16 */            this.I00l0I0l0lO1 = o100l12;
/* 18 */            this.I00l0OO0IO = o100l13;
/* 20 */            o100l13.I00l0I0l0lO1 = this;
/* 22 */            o100l12.I00l0OO0IO = this;
                }

                @Override
                public final boolean equals(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 60 */                    if (obj instanceof Map.Entry) {
/* 62 */                        Map.Entry entry = (Map.Entry) obj;
/* 64 */                        Object obj2 = this.I00iiI;
/* 66 */                        if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
/* 85 */                            Object obj3 = this.I00iio;
/* 87 */                            if (obj3 == null) {
/* 93 */                                if (entry.getValue() == null) {
                                        }
                                    } else if (obj3.equals(entry.getValue())) {
                                    }
                                }
                            }
                            break;
                        default:
/* 10 */                    if (obj instanceof Map.Entry) {
/* 12 */                        Map.Entry entry2 = (Map.Entry) obj;
/* 14 */                        Object obj4 = this.I00iiI;
/* 16 */                        if (obj4 != null ? obj4.equals(entry2.getKey()) : entry2.getKey() == null) {
/* 35 */                            Object obj5 = this.I00iio;
/* 37 */                            if (obj5 == null) {
/* 43 */                                if (entry2.getValue() == null) {
                                        }
                                    } else if (obj5.equals(entry2.getValue())) {
                                    }
                                }
                            }
                            break;
                    }
/* 4 */             return false;
                }

                @Override
                public final Object getKey() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return this.I00iiI;
                }

                @Override
                public final Object getValue() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return this.I00iio;
                }

                @Override
                public final int hashCode() {
                    switch (this.I00iOIl) {
                        case 0:
/* 29 */                    Object obj = this.I00iiI;
/* 35 */                    int iHashCode = obj == null ? 0 : obj.hashCode();
/* 39 */                    Object obj2 = this.I00iio;
/* 48 */                    return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
                        default:
/* 7 */                     Object obj3 = this.I00iiI;
/* 13 */                    int iHashCode2 = obj3 == null ? 0 : obj3.hashCode();
/* 17 */                    Object obj4 = this.I00iio;
/* 26 */                    return iHashCode2 ^ (obj4 != null ? obj4.hashCode() : 0);
                    }
                }

                @Override
                public final Object setValue(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 25 */                    if (obj == null && !this.I00iiO) {
/* 32 */                        IOOlIIilOl0.I000II("value == null");
/* 3 */                         return null;
                            }
/* 36 */                    Object obj2 = this.I00iio;
/* 38 */                    this.I00iio = obj;
/* 40 */                    return obj2;
                        default:
/* 9 */                     if (obj == null && !this.I00iiO) {
/* 16 */                        IOOlIIilOl0.I000II("value == null");
/* 3 */                         return null;
                            }
/* 20 */                    Object obj3 = this.I00iio;
/* 22 */                    this.I00iio = obj;
/* 24 */                    return obj3;
                    }
                }

                public final String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 59 */                    return this.I00iiI + "=" + this.I00iio;
                        default:
/* 10 */                    String strValueOf = String.valueOf(this.I00iiI);
/* 16 */                    String strValueOf2 = String.valueOf(this.I00iio);
/* 36 */                    return IIlIOloOOO.I0010I0i(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
                    }
                }

/* 24 */        public O100l1(boolean z, O100l1 o100l1, Object obj, O100l1 o100l12, O100l1 o100l13, byte b) {
                    this.I00iOIl = 1;
                    this.I00ilO0 = o100l1;
                    this.I00iiI = obj;
                    this.I00iiO = z;
                    this.I00ilI0I1 = 1;
                    this.I00l0I0l0lO1 = o100l12;
                    this.I00l0OO0IO = o100l13;
                    o100l13.I00l0I0l0lO1 = this;
/* 26 */            o100l12.I00l0OO0IO = this;
                }

/* 26 */        public O100l1(int i) {
/* 27 */            this.I00iOIl = i;
                }
            }
