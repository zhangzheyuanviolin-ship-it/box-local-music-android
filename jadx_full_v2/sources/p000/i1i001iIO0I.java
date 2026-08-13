            package p000;
            
            public final class i1i001iIO0I implements Cloneable {
                public final i1ilOol I00iOIl;
                public i1ilOol I00iiI;

                public i1i001iIO0I(i1ilOol i1ilool) {
/* 4 */             this.I00iOIl = i1ilool;
/* 10 */            if (i1ilool.I000O01llI0()) {
/* 21 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 16 */            this.I00iiI = i1ilool.I0000Il00O();
                }

                public final i1ilOol I00000oIO() {
/* 3 */             boolean zI000O01llI0 = this.I00iiI.I000O01llI0();
/* 7 */             i1ilOol i1ilool = this.I00iiI;
/* 9 */             if (!zI000O01llI0) {
/* 11 */                return i1ilool;
                    }
/* 12 */            i1ilool.getClass();
/* 25 */            i1o1i00IlOiO.I0000Il00O.I00000oIO(i1ilool.getClass()).zze(i1ilool);
/* 28 */            i1ilool.I0000oI00();
/* 31 */            return this.I00iiI;
                }

                public final Object clone() {
/* 8 */             i1i001iIO0I i1i001iio0i = (i1i001iIO0I) this.I00iOIl.I00000oIO(5);
/* 14 */            i1i001iio0i.I00iiI = I00000oIO();
/* 20 */            return i1i001iio0i;
                }
            }
