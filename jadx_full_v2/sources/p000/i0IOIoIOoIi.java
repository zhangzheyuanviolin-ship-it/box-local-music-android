            package p000;
            
            public final class i0IOIoIOoIi extends i0IOo0 {
                public transient i0IOo0 I00o0iI0io1;

                @Override
                public final i0IOo0 I001i1O0Ol() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final i0IOo0 subList(int i, int i2) {
/* 1 */             i0IOo0 i0ioo0 = this.I00o0iI0io1;
/* 7 */             liO0oIOlo0.I0000Il00O(i, i2, i0ioo0.size());
/* 24 */            return i0ioo0.subList(i0ioo0.size() - i2, i0ioo0.size() - i).I001i1O0Ol();
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00o0iI0io1.contains(obj);
                }

                @Override
                public final Object get(int i) {
/* 1 */             i0IOo0 i0ioo0 = this.I00o0iI0io1;
/* 7 */             liO0oIOlo0.I00000oIO(i, i0ioo0.size());
/* 17 */            return i0ioo0.get((i0ioo0.size() - 1) - i);
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
