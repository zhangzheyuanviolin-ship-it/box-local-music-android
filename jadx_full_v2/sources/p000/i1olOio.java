            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class i1olOio implements Iterator {
                public final int I00iOIl;
                public Map.Entry I00iiI;
                public Iterator I00iiO;

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiO.hasNext();
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 72 */                    Map.Entry entry = (Map.Entry) this.I00iiO.next();
/* 74 */                    this.I00iiI = entry;
/* 76 */                    return entry.getKey();
                        case 1:
/* 57 */                    Map.Entry entry2 = (Map.Entry) this.I00iiO.next();
/* 59 */                    this.I00iiI = entry2;
/* 61 */                    return entry2.getKey();
                        case 2:
/* 42 */                    Map.Entry entry3 = (Map.Entry) this.I00iiO.next();
/* 44 */                    this.I00iiI = entry3;
/* 46 */                    return entry3.getKey();
                        case 3:
/* 27 */                    Map.Entry entry4 = (Map.Entry) this.I00iiO.next();
/* 29 */                    this.I00iiI = entry4;
/* 31 */                    return entry4.getKey();
                        default:
/* 12 */                    Map.Entry entry5 = (Map.Entry) this.I00iiO.next();
/* 14 */                    this.I00iiI = entry5;
/* 16 */                    return entry5.getKey();
                    }
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 135 */                   Map.Entry entry = this.I00iiI;
/* 140 */                   if (!(entry != null)) {
/* 162 */                       I000II.I001IO000("no calls to next() since the last call to remove()");
                                break;
                            } else {
/* 146 */                       Collection collection = (Collection) entry.getValue();
/* 150 */                       this.I00iiO.remove();
/* 153 */                       collection.size();
/* 156 */                       collection.clear();
/* 159 */                       this.I00iiI = null;
                                break;
                            }
                        case 1:
/* 104 */                   Map.Entry entry2 = this.I00iiI;
/* 109 */                   if (!(entry2 != null)) {
/* 131 */                       I000II.I001IO000("no calls to next() since the last call to remove()");
                                break;
                            } else {
/* 115 */                       Collection collection2 = (Collection) entry2.getValue();
/* 119 */                       this.I00iiO.remove();
/* 122 */                       collection2.size();
/* 125 */                       collection2.clear();
/* 128 */                       this.I00iiI = null;
                                break;
                            }
                        case 2:
/* 73 */                    Map.Entry entry3 = this.I00iiI;
/* 78 */                    if (!(entry3 != null)) {
/* 100 */                       I000II.I001IO000("no calls to next() since the last call to remove()");
                                break;
                            } else {
/* 84 */                        Collection collection3 = (Collection) entry3.getValue();
/* 88 */                        this.I00iiO.remove();
/* 91 */                        collection3.size();
/* 94 */                        collection3.clear();
/* 97 */                        this.I00iiI = null;
                                break;
                            }
                        case 3:
/* 42 */                    Map.Entry entry4 = this.I00iiI;
/* 47 */                    if (!(entry4 != null)) {
/* 69 */                        I000II.I001IO000("no calls to next() since the last call to remove()");
                                break;
                            } else {
/* 53 */                        Collection collection4 = (Collection) entry4.getValue();
/* 57 */                        this.I00iiO.remove();
/* 60 */                        collection4.size();
/* 63 */                        collection4.clear();
/* 66 */                        this.I00iiI = null;
                                break;
                            }
                        default:
/* 11 */                    Map.Entry entry5 = this.I00iiI;
/* 16 */                    if (!(entry5 != null)) {
/* 38 */                        I000II.I001IO000("no calls to next() since the last call to remove()");
                                break;
                            } else {
/* 22 */                        Collection collection5 = (Collection) entry5.getValue();
/* 26 */                        this.I00iiO.remove();
/* 29 */                        collection5.size();
/* 32 */                        collection5.clear();
/* 35 */                        this.I00iiI = null;
                                break;
                            }
                    }
                }
            }
