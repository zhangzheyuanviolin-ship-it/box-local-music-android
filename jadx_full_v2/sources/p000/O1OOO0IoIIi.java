            package p000;

            import java.util.List;
            import java.util.Map;
            
/* 9 */     public class O1OOO0IoIIi implements Map.Entry, O0IlIoi {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public O1OOO0IoIIi(int i, Object obj, Object obj2) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
/* 5 */             this.I00iiO = obj2;
                }

                @Override
                public boolean equals(Object obj) {
                    Map.Entry entry;
                    switch (this.I00iOIl) {
                        case 0:
/* 90 */                    entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                            return entry != null && O0000Ioio00.I0000O(entry.getKey(), this.I00iiI) && O0000Ioio00.I0000O(entry.getValue(), getValue());
                        case 1:
/* 55 */                    entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                            return entry != null && O0000Ioio00.I0000O(entry.getKey(), this.I00iiI) && O0000Ioio00.I0000O(entry.getValue(), this.I00iiO);
                        case 2:
                        default:
/* 9 */                     return super.equals(obj);
                        case 3:
/* 16 */                    if (!(obj instanceof Map.Entry)) {
/* 4 */                         return false;
                            }
/* 18 */                    Map.Entry entry2 = (Map.Entry) obj;
                            return O0000Ioio00.I0000O(entry2.getKey(), (String) this.I00iiI) && O0000Ioio00.I0000O(entry2.getValue(), (List) this.I00iiO);
                    }
                }

                @Override
                public final Object getKey() {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    return this.I00iiI;
                        case 1:
/* 14 */                    return this.I00iiI;
                        case 2:
/* 11 */                    return this.I00iiI;
                        default:
/* 8 */                     return (String) this.I00iiI;
                    }
                }

                @Override
                public Object getValue() {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    return this.I00iiO;
                        case 1:
/* 14 */                    return this.I00iiO;
                        case 2:
/* 11 */                    return this.I00iiO;
                        default:
/* 8 */                     return (List) this.I00iiO;
                    }
                }

                @Override
                public int hashCode() {
                    switch (this.I00iOIl) {
                        case 0:
/* 51 */                    Object obj = this.I00iiI;
/* 60 */                    int iHashCode = obj != null ? obj.hashCode() : 0;
/* 61 */                    Object value = getValue();
/* 71 */                    return iHashCode ^ (value != null ? value.hashCode() : 0);
                        case 1:
/* 30 */                    Object obj2 = this.I00iiI;
/* 39 */                    int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
/* 40 */                    Object obj3 = this.I00iiO;
/* 48 */                    return iHashCode2 ^ (obj3 != null ? obj3.hashCode() : 0);
                        case 2:
                        default:
/* 7 */                     return super.hashCode();
                        case 3:
/* 28 */                    return ((List) this.I00iiO).hashCode() ^ ((String) this.I00iiI).hashCode();
                    }
                }

                @Override
                public Object setValue(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 37 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 1:
/* 29 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 2:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 82 */                    return this.I00iiI + "=" + getValue();
                        case 1:
/* 39 */                    StringBuilder sb = new StringBuilder();
/* 44 */                    sb.append(this.I00iiI);
/* 47 */                    sb.append('=');
/* 52 */                    sb.append(this.I00iiO);
/* 55 */                    return sb.toString();
                        case 2:
                        default:
/* 8 */                     return super.toString();
                        case 3:
/* 32 */                    return ((String) this.I00iiI) + '=' + ((List) this.I00iiO);
                    }
                }
            }
