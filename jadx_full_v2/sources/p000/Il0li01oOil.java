            package p000;

            import java.io.Serializable;
            import java.util.RandomAccess;
            
            public final class Il0li01oOil extends I01IO0oio implements Il0lIli0, RandomAccess, Serializable {
                public Enum[] I00iOIl;

                @Override
                public final int I00000oOI() {
/* 3 */             return this.I00iOIl.length;
                }

                @Override
                public final boolean contains(Object obj) {
/* 4 */             if (!(obj instanceof Enum)) {
/* 3 */                 return false;
                    }
/* 7 */             Enum r3 = (Enum) obj;
                    return ((Enum) I1IoiO1l.I001iOo1i0O(r3.ordinal(), this.I00iOIl)) == r3;
                }

                @Override
                public final Object get(int i) {
/* 1 */             Enum[] enumArr = this.I00iOIl;
/* 3 */             int length = enumArr.length;
/* 4 */             if (i >= 0 && i < length) {
/* 8 */                 return enumArr[i];
                    }
/* 19 */            I000II.I0010o(IIl001iO0Io.I000l1(i, length, "index: ", ", size: "));
/* 22 */            return null;
                }

                @Override
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Enum)) {
/* 3 */                 return -1;
                    }
/* 7 */             Enum r3 = (Enum) obj;
/* 9 */             int iOrdinal = r3.ordinal();
/* 21 */            if (((Enum) I1IoiO1l.I001iOo1i0O(iOrdinal, this.I00iOIl)) == r3) {
/* 23 */                return iOrdinal;
                    }
/* 3 */             return -1;
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 4 */             if (!(obj instanceof Enum)) {
/* 3 */                 return -1;
                    }
/* 7 */             Enum r3 = (Enum) obj;
/* 9 */             int iOrdinal = r3.ordinal();
/* 21 */            if (((Enum) I1IoiO1l.I001iOo1i0O(iOrdinal, this.I00iOIl)) == r3) {
/* 23 */                return iOrdinal;
                    }
/* 3 */             return -1;
                }
            }
