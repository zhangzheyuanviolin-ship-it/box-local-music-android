            package p000;
            
            public final class O01i0Iiil extends O01lO1iO {
                public final boolean I00iOIl;
                public final OilOloI I00iiI;
                public final String I00iiO;

                public O01i0Iiil(Object obj, boolean z, OilOloI oilOloI) {
/* 4 */             this.I00iOIl = z;
/* 6 */             this.I00iiI = oilOloI;
/* 12 */            this.I00iiO = obj.toString();
/* 14 */            if (oilOloI == null || oilOloI.I00100o1O0lo()) {
/* 215 */               return;
                    }
/* 25 */            I000II.I000iOII("Failed requirement.");
/* 29 */            throw null;
                }

                @Override
                public final String I00000oOI() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final boolean I0000O() {
/* 1 */             return this.I00iOIl;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 35 */                return true;
                    }
/* 4 */             if (obj == null || O01i0Iiil.class != obj.getClass()) {
/* 37 */                return false;
                    }
/* 15 */            O01i0Iiil o01i0Iiil = (O01i0Iiil) obj;
                    return this.I00iOIl == o01i0Iiil.I00iOIl && O0000Ioio00.I0000O(this.I00iiO, o01i0Iiil.I00iiO);
                }

                public final int hashCode() {
/* 15 */            return this.I00iiO.hashCode() + (Boolean.hashCode(this.I00iOIl) * 31);
                }

                @Override
                public final String toString() {
/* 1 */             boolean z = this.I00iOIl;
/* 3 */             String str = this.I00iiO;
/* 5 */             if (!z) {
/* 29 */                return str;
                    }
/* 9 */             StringBuilder sb = new StringBuilder();
/* 12 */            OlOllioI11o1.I00000oIO(sb, str);
/* 15 */            return sb.toString();
                }
            }
