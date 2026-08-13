            package p000;

            import java.util.ArrayList;
            import java.util.Map;
            
/* 23 */    public final class IlIOoOIo0l {
                public final boolean I00000oIO;
                public final boolean I00000oOI;
                public final OO0IIO1Il I0000Il00O;
                public final Long I0000O;
                public final Long I0000oI00;
                public final Long I0001Ioi1lo;
                public final Long I000II;
                public final Map I000O01llI0;

                public IlIOoOIo0l(boolean z, boolean z2, OO0IIO1Il oO0IIO1Il, Long l, Long l2, Long l3, Long l4, Map map) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = z2;
/* 8 */             this.I0000Il00O = oO0IIO1Il;
/* 10 */            this.I0000O = l;
/* 12 */            this.I0000oI00 = l2;
/* 14 */            this.I0001Ioi1lo = l3;
/* 16 */            this.I000II = l4;
/* 22 */            this.I000O01llI0 = O1Oii0O0loo.I000iOII(map);
                }

                public final String toString() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             if (this.I00000oIO) {
/* 12 */                arrayList.add("isRegularFile");
                    }
/* 17 */            if (this.I00000oOI) {
/* 21 */                arrayList.add("isDirectory");
                    }
/* 24 */            Long l = this.I0000O;
/* 26 */            if (l != null) {
/* 46 */                arrayList.add("byteCount=" + l.longValue());
                    }
/* 49 */            Long l2 = this.I0000oI00;
/* 51 */            if (l2 != null) {
/* 71 */                arrayList.add("createdAt=" + l2.longValue());
                    }
/* 74 */            Long l3 = this.I0001Ioi1lo;
/* 76 */            if (l3 != null) {
/* 96 */                arrayList.add("lastModifiedAt=" + l3.longValue());
                    }
/* 99 */            Long l4 = this.I000II;
/* 101 */           if (l4 != null) {
/* 121 */               arrayList.add("lastAccessedAt=" + l4.longValue());
                    }
/* 124 */           Map map = this.I000O01llI0;
/* 130 */           if (!map.isEmpty()) {
/* 146 */               arrayList.add("extras=" + map);
                    }
/* 158 */           return IOOi0Ool1i.I00IlilI0i0i(arrayList, ", ", "FileMetadata(", ")", null, 56);
                }

/* 24 */        public IlIOoOIo0l(boolean z, boolean z2, OO0IIO1Il oO0IIO1Il, Long l, Long l2, Long l3, Long l4) {
/* 26 */            this(z, z2, oO0IIO1Il, l, l2, l3, l4, Il011I1OiO0I.I00iOIl);
                }
            }
