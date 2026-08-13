            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            
/* 35 */    public final class O1OlO1II extends I01IO0oio {
                public final int I00iOIl;
                public Object I00iiI;

                public O1OlO1II(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final int I00000oOI() {
                    switch (this.I00iOIl) {
                        case 0:
/* 25 */                    return ((O1OlOOioiI) this.I00iiI).I00000oIO.groupCount() + 1;
                        default:
/* 10 */                    return ((List) this.I00iiI).size();
                    }
                }

                @Override
                public boolean contains(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 13 */                    if (obj instanceof String) {
/* 19 */                        return super.contains((String) obj);
                            }
/* 15 */                    return false;
                        default:
/* 6 */                     return super.contains(obj);
                    }
                }

                @Override
                public final Object get(int i) {
                    switch (this.I00iOIl) {
                        case 0:
/* 25 */                    String strGroup = ((O1OlOOioiI) this.I00iiI).I00000oIO.group(i);
                            return strGroup == null ? "" : strGroup;
                        default:
/* 14 */                    return ((List) this.I00iiI).get(IOOi0Ool1i.I00OIO1(i, this));
                    }
                }

                @Override
                public int indexOf(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 13 */                    if (obj instanceof String) {
/* 19 */                        return super.indexOf((String) obj);
                            }
/* 15 */                    return -1;
                        default:
/* 6 */                     return super.indexOf(obj);
                    }
                }

                @Override
                public Iterator iterator() {
                    switch (this.I00iOIl) {
                        case 1:
/* 12 */                    return listIterator(0);
                        default:
/* 6 */                     return super.iterator();
                    }
                }

                @Override
                public int lastIndexOf(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 13 */                    if (obj instanceof String) {
/* 19 */                        return super.lastIndexOf((String) obj);
                            }
/* 15 */                    return -1;
                        default:
/* 6 */                     return super.lastIndexOf(obj);
                    }
                }

                @Override
                public ListIterator listIterator(int i) {
                    switch (this.I00iOIl) {
                        case 1:
/* 14 */                    Oi11lo1liI0l oi11lo1liI0l = new Oi11lo1liI0l(1);
/* 17 */                    oi11lo1liI0l.I00iiO = this;
/* 31 */                    oi11lo1liI0l.I00iiI = ((List) this.I00iiI).listIterator(IOOi0Ool1i.I00OIl(i, this));
/* 33 */                    VarHandle.storeStoreFence();
/* 36 */                    return oi11lo1liI0l;
                        default:
/* 6 */                     return super.listIterator(i);
                    }
                }

                @Override
/* 36 */        public ListIterator listIterator() {
                    switch (this.I00iOIl) {
                        case 1:
/* 37 */                    return listIterator(0);
                        default:
                            return super.listIterator();
                    }
                }
            }
