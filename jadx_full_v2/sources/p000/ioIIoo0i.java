            package p000;
            
            public final class ioIIoo0i extends ioIl00 {
                public transient ioIl00 I00o0iI0io1;

                @Override
                public final ioIl00 I001i1O0Ol() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final ioIl00 subList(int i, int i2) {
/* 1 */             ioIl00 ioil00 = this.I00o0iI0io1;
/* 7 */             lio00O0OO.I0000Il00O(i, i2, ioil00.size());
/* 24 */            return ioil00.subList(ioil00.size() - i2, ioil00.size() - i).I001i1O0Ol();
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00o0iI0io1.contains(obj);
                }

                @Override
                public final Object get(int i) {
/* 1 */             ioIl00 ioil00 = this.I00o0iI0io1;
/* 7 */             lio00O0OO.I00000oIO(i, ioil00.size());
/* 17 */            return ioil00.get((ioil00.size() - 1) - i);
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
