            package p000;

            import java.util.ConcurrentModificationException;
            import java.util.Map;
            
            public final class O1OO1illI1 implements Map.Entry, O0IloIo {
                public O1OOII I00iOIl;
                public int I00iiI;
                public int I00iiO;

                public final void I00000oIO() {
/* 7 */             if (this.I00iOIl.I00ioIO != this.I00iiO) {
/* 29 */                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
                    }
                }

                @Override
                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof Map.Entry)) {
/* 37 */                return false;
                    }
/* 5 */             Map.Entry entry = (Map.Entry) obj;
                    return O0000Ioio00.I0000O(entry.getKey(), getKey()) && O0000Ioio00.I0000O(entry.getValue(), getValue());
                }

                @Override
                public final Object getKey() {
/* 1 */             I00000oIO();
/* 10 */            return this.I00iOIl.I00iOIl[this.I00iiI];
                }

                @Override
                public final Object getValue() {
/* 1 */             I00000oIO();
/* 10 */            return this.I00iOIl.I00iiI[this.I00iiI];
                }

                @Override
                public final int hashCode() {
/* 1 */             Object key = getKey();
/* 13 */            int iHashCode = key != null ? key.hashCode() : 0;
/* 14 */            Object value = getValue();
/* 24 */            return iHashCode ^ (value != null ? value.hashCode() : 0);
                }

                @Override
                public final Object setValue(Object obj) {
/* 1 */             I00000oIO();
/* 4 */             O1OOII o1ooii = this.I00iOIl;
/* 6 */             o1ooii.I0000Il00O();
/* 9 */             Object[] objArr = o1ooii.I00iiI;
/* 11 */            if (objArr == null) {
/* 16 */                int length = o1ooii.I00iOIl.length;
/* 17 */                if (length < 0) {
/* 32 */                    I000II.I000iOII("capacity must be non-negative.");
/* 35 */                    return null;
                        }
/* 19 */                objArr = new Object[length];
/* 21 */                o1ooii.I00iiI = objArr;
                    }
/* 23 */            int i = this.I00iiI;
/* 25 */            Object obj2 = objArr[i];
/* 27 */            objArr[i] = obj;
/* 29 */            return obj2;
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(getKey());
/* 15 */            sb.append('=');
/* 22 */            sb.append(getValue());
/* 25 */            return sb.toString();
                }
            }
