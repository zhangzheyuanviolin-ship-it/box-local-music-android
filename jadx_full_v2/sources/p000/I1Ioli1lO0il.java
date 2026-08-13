            package p000;

            import java.util.RandomAccess;
            
            public final class I1Ioli1lO0il extends I01IO0oio implements RandomAccess {
                public int[] I00iOIl;

                @Override
                public final int I00000oOI() {
/* 3 */             return this.I00iOIl.length;
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             if (!(obj instanceof Integer)) {
/* 5 */                 return false;
                    }
/* 15 */            return I1IoiO1l.I0000oI00(this.I00iOIl, ((Number) obj).intValue());
                }

                @Override
                public final Object get(int i) {
/* 5 */             return Integer.valueOf(this.I00iOIl[i]);
                }

                @Override
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Integer)) {
/* 3 */                 return -1;
                    }
/* 9 */             int iIntValue = ((Number) obj).intValue();
/* 13 */            int[] iArr = this.I00iOIl;
/* 15 */            int length = iArr.length;
/* 17 */            for (int i = 0; i < length; i++) {
/* 21 */                if (iIntValue == iArr[i]) {
/* 23 */                    return i;
                        }
                    }
/* 3 */             return -1;
                }

                @Override
                public final boolean isEmpty() {
                    return this.I00iOIl.length == 0;
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 4 */             if (obj instanceof Integer) {
/* 9 */                 int iIntValue = ((Number) obj).intValue();
/* 13 */                int[] iArr = this.I00iOIl;
                        int length = iArr.length - 1;
/* 17 */                if (length >= 0) {
                            while (true) {
                                int i = length - 1;
/* 23 */                        if (iIntValue == iArr[length]) {
/* 25 */                            return length;
                                }
/* 26 */                        if (i < 0) {
                                    break;
                                }
/* 29 */                        length = i;
                            }
                        }
                    }
/* 3 */             return -1;
                }
            }
