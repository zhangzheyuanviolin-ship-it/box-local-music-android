            package p000;
            
            public final class lO1oil1IoI extends lOI1lll1l10 {
                public final transient lOI1lll1l10 I00iiO;

                public lO1oil1IoI(lOI1lll1l10 loi1lll1l10) {
/* 4 */             this.I00iiO = loi1lll1l10;
                }

                @Override
                public final boolean I000OOo1O() {
/* 3 */             return this.I00iiO.I000OOo1O();
                }

                @Override
                public final lOI1lll1l10 I000iOII() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final lOI1lll1l10 subList(int i, int i2) {
/* 1 */             lOI1lll1l10 loi1lll1l10 = this.I00iiO;
/* 7 */             ll0OlOllOl.I0000oI00(i, i2, loi1lll1l10.size());
/* 24 */            return loi1lll1l10.subList(loi1lll1l10.size() - i2, loi1lll1l10.size() - i).I000iOII();
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00iiO.contains(obj);
                }

                @Override
                public final Object get(int i) {
/* 1 */             lOI1lll1l10 loi1lll1l10 = this.I00iiO;
/* 7 */             ll0OlOllOl.I0000Il00O(i, loi1lll1l10.size());
/* 17 */            return loi1lll1l10.get((loi1lll1l10.size() - 1) - i);
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             int iLastIndexOf = this.I00iiO.lastIndexOf(obj);
/* 8 */             if (iLastIndexOf >= 0) {
/* 15 */                return (r1.size() - 1) - iLastIndexOf;
                    }
/* 7 */             return -1;
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 3 */             int iIndexOf = this.I00iiO.indexOf(obj);
/* 8 */             if (iIndexOf >= 0) {
/* 15 */                return (r1.size() - 1) - iIndexOf;
                    }
/* 7 */             return -1;
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iiO.size();
                }
            }
