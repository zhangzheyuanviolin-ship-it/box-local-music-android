            package p000;

            import java.util.Collections;
            import java.util.List;
            
            public final class OoOOlOlI implements O0O0OIOO {
                public Object I00iOIl;
                public O0ioIllo0i1 I00iiI;
                public String I00iiO;
                public O0O10O I00iio;
                public volatile List I00ilI0I1;

                @Override
                public final O0O10O I000l1() {
/* 1 */             return this.I00iio;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OoOOlOlI)) {
/* 29 */                return false;
                    }
/* 7 */             OoOOlOlI ooOOlOlI = (OoOOlOlI) obj;
                    return O0000Ioio00.I0000O(this.I00iiO, ooOOlOlI.I00iiO) && O0000Ioio00.I0000O(this.I00iOIl, ooOOlOlI.I00iOIl);
                }

                @Override
                public final String getName() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final List getUpperBounds() {
/* 1 */             List list = this.I00ilI0I1;
/* 3 */             if (list != null) {
/* 29 */                return list;
                    }
/* 5 */             OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 20 */            List listSingletonList = Collections.singletonList(oOoOl1001II.I000lI(oOoOl1001II.I00000oOI(Object.class), Collections.EMPTY_LIST, true));
/* 24 */            this.I00ilI0I1 = listSingletonList;
/* 29 */            return listSingletonList;
                }

                public final int hashCode() {
/* 15 */            return this.I00iiO.hashCode() + (this.I00iOIl.hashCode() * 31);
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             int iOrdinal = this.I00iio.ordinal();
/* 12 */            if (iOrdinal != 0) {
/* 15 */                if (iOrdinal == 1) {
/* 33 */                    sb.append("in ");
                        } else {
/* 18 */                    if (iOrdinal != 2) {
/* 26 */                        I000II.I00000oIO();
/* 29 */                        return null;
                            }
/* 22 */                    sb.append("out ");
                        }
                    }
/* 38 */            sb.append(this.I00iiO);
/* 41 */            return sb.toString();
                }
            }
