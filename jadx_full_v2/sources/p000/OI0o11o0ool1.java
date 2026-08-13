            package p000;

            import java.util.List;
            import java.util.ListIterator;
            
            public final class OI0o11o0ool1 implements ListIterator, O0IlIoi {
                public final int I00iOIl;
                public final List I00iiI;
                public int I00iiO;

                public OI0o11o0ool1(List list, int i, int i2) {
/* 1 */             this.I00iOIl = i2;
                    switch (i2) {
                        case 1:
/* 19 */                    this.I00iiI = list;
/* 21 */                    this.I00iiO = i;
                            break;
                        default:
/* 9 */                     this.I00iiI = list;
/* 13 */                    this.I00iiO = i - 1;
                            break;
                    }
                }

                @Override
                public final void add(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             List list = this.I00iiI;
                    switch (i) {
                        case 0:
/* 22 */                    int i2 = this.I00iiO + 1;
/* 24 */                    this.I00iiO = i2;
/* 26 */                    list.add(i2, obj);
                            break;
                        default:
/* 10 */                    list.add(this.I00iiO, obj);
                            this.I00iiO++;
                            break;
                    }
                }

                @Override
                public final boolean hasNext() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             List list = this.I00iiI;
                    switch (i) {
                        case 0:
/* 27 */                    if (this.I00iiO < list.size() - 1) {
                                break;
                            }
                            break;
                        default:
/* 16 */                    if (this.I00iiO < list.size()) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final boolean hasPrevious() {
                    switch (this.I00iOIl) {
                        case 0:
/* 16 */                    if (this.I00iiO >= 0) {
                            }
                            break;
                        default:
/* 8 */                     if (this.I00iiO > 0) {
                            }
                            break;
                    }
/* 12 */            return false;
                }

                @Override
                public final Object next() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             List list = this.I00iiI;
                    switch (i) {
                        case 0:
/* 21 */                    int i2 = this.I00iiO + 1;
/* 23 */                    this.I00iiO = i2;
/* 25 */                    return list.get(i2);
                        default:
/* 8 */                     int i3 = this.I00iiO;
/* 12 */                    this.I00iiO = i3 + 1;
/* 14 */                    return list.get(i3);
                    }
                }

                @Override
                public final int nextIndex() {
                    switch (this.I00iOIl) {
                        case 0:
/* 11 */                    return this.I00iiO + 1;
                        default:
/* 6 */                     return this.I00iiO;
                    }
                }

                @Override
                public final Object previous() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             List list = this.I00iiI;
                    switch (i) {
                        case 0:
/* 19 */                    int i2 = this.I00iiO;
/* 23 */                    this.I00iiO = i2 - 1;
/* 25 */                    return list.get(i2);
                        default:
                            int i3 = this.I00iiO - 1;
/* 12 */                    this.I00iiO = i3;
/* 14 */                    return list.get(i3);
                    }
                }

                @Override
                public final int previousIndex() {
                    switch (this.I00iOIl) {
                        case 0:
/* 11 */                    return this.I00iiO;
                        default:
/* 8 */                     return this.I00iiO - 1;
                    }
                }

                @Override
                public final void remove() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             List list = this.I00iiI;
                    switch (i) {
                        case 0:
/* 20 */                    list.remove(this.I00iiO);
                            this.I00iiO--;
                            break;
                        default:
                            int i2 = this.I00iiO - 1;
/* 12 */                    this.I00iiO = i2;
/* 14 */                    list.remove(i2);
                            break;
                    }
                }

                @Override
                public final void set(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             List list = this.I00iiI;
                    switch (i) {
                        case 0:
/* 16 */                    list.set(this.I00iiO, obj);
                            break;
                        default:
/* 10 */                    list.set(this.I00iiO, obj);
                            break;
                    }
                }
            }
