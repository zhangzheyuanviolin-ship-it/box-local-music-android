            package p000;
            
            public final class iI0io0O extends iI1olii1 {
                public transient iI1olii1 I00o0iI0io1;

                @Override
                public final iI1olii1 I001i1O0Ol() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final iI1olii1 subList(int i, int i2) {
/* 1 */             iI1olii1 ii1olii1 = this.I00o0iI0io1;
/* 7 */             ll0oolI10I.I00000oOI(i, i2, ii1olii1.size());
/* 24 */            return ii1olii1.subList(ii1olii1.size() - i2, ii1olii1.size() - i).I001i1O0Ol();
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00o0iI0io1.contains(obj);
                }

                @Override
                public final Object get(int i) {
/* 1 */             iI1olii1 ii1olii1 = this.I00o0iI0io1;
/* 7 */             ll0oolI10I.I00000oIO(i, ii1olii1.size());
/* 17 */            return ii1olii1.get((ii1olii1.size() - 1) - i);
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             int iLastIndexOf = this.I00o0iI0io1.lastIndexOf(obj);
/* 8 */             if (iLastIndexOf >= 0) {
/* 15 */                return (r1.size() - 1) - iLastIndexOf;
                    }
/* 7 */             return -1;
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 3 */             int iIndexOf = this.I00o0iI0io1.indexOf(obj);
/* 8 */             if (iIndexOf >= 0) {
/* 15 */                return (r1.size() - 1) - iIndexOf;
                    }
/* 7 */             return -1;
                }

                @Override
                public final int size() {
/* 3 */             return this.I00o0iI0io1.size();
                }
            }
