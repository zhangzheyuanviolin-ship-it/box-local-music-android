            package p000;

            import java.util.Map;
            
/* 21 */    public final class iI0lliloO implements Map.Entry {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public int I00iio;
                public Map.Entry I00ilI0I1;
                public Map.Entry I00ilO0;
                public Map.Entry I00io1l;
                public Map.Entry I00ioIO;
                public Map.Entry I00l0I0l0lO1;

                public iI0lliloO(iI0lliloO ii0lliloo, Object obj, iI0lliloO ii0lliloo2, iI0lliloO ii0lliloo3) {
/* 2 */             this.I00iOIl = 0;
/* 7 */             this.I00ilI0I1 = ii0lliloo;
/* 9 */             this.I00iiI = obj;
/* 12 */            this.I00iio = 1;
/* 14 */            this.I00ioIO = ii0lliloo2;
/* 16 */            this.I00l0I0l0lO1 = ii0lliloo3;
/* 18 */            ii0lliloo3.I00ioIO = this;
/* 20 */            ii0lliloo2.I00l0I0l0lO1 = this;
                }

                @Override
                public final boolean equals(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 60 */                    if (obj instanceof Map.Entry) {
/* 62 */                        Map.Entry entry = (Map.Entry) obj;
/* 64 */                        Object obj2 = this.I00iiI;
/* 66 */                        if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
/* 85 */                            Object obj3 = this.I00iiO;
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
/* 35 */                            Object obj5 = this.I00iiO;
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
/* 6 */             return this.I00iiO;
                }

                @Override
                public final int hashCode() {
                    switch (this.I00iOIl) {
                        case 0:
/* 29 */                    Object obj = this.I00iiI;
/* 35 */                    int iHashCode = obj == null ? 0 : obj.hashCode();
/* 39 */                    Object obj2 = this.I00iiO;
/* 48 */                    return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
                        default:
/* 7 */                     Object obj3 = this.I00iiI;
/* 13 */                    int iHashCode2 = obj3 == null ? 0 : obj3.hashCode();
/* 17 */                    Object obj4 = this.I00iiO;
/* 26 */                    return iHashCode2 ^ (obj4 != null ? obj4.hashCode() : 0);
                    }
                }

                @Override
                public final Object setValue(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    if (obj == null) {
/* 27 */                        IOOlIIilOl0.I000II("value == null");
                                break;
                            } else {
/* 22 */                        Object obj2 = this.I00iiO;
/* 24 */                        this.I00iiO = obj;
                                break;
                            }
                        default:
/* 9 */                     if (obj == null) {
/* 16 */                        IOOlIIilOl0.I000II("value == null");
                                break;
                            } else {
/* 11 */                        Object obj3 = this.I00iiO;
/* 13 */                        this.I00iiO = obj;
                                break;
                            }
                    }
/* 3 */             return null;
                }

                public final String toString() {
                    switch (this.I00iOIl) {
                    }
/* 20 */            return IlIi0I0.I000lI(String.valueOf(this.I00iiI), "=", String.valueOf(this.I00iiO));
                }

/* 22 */        public iI0lliloO(int i) {
/* 23 */            this.I00iOIl = i;
                }

/* 23 */        public iI0lliloO(iI0lliloO ii0lliloo, Object obj, iI0lliloO ii0lliloo2, iI0lliloO ii0lliloo3, byte b) {
                    this.I00iOIl = 1;
                    this.I00ilI0I1 = ii0lliloo;
                    this.I00iiI = obj;
                    this.I00iio = 1;
                    this.I00ioIO = ii0lliloo2;
                    this.I00l0I0l0lO1 = ii0lliloo3;
                    ii0lliloo3.I00ioIO = this;
/* 25 */            ii0lliloo2.I00l0I0l0lO1 = this;
                }
            }
