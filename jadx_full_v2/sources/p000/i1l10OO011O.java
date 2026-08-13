            package p000;
            
            public final class i1l10OO011O implements Cloneable {
                public final i1loi1lII I00iOIl;
                public i1loi1lII I00iiI;

                public i1l10OO011O(i1loi1lII i1loi1lii) {
/* 4 */             this.I00iOIl = i1loi1lii;
/* 10 */            if (i1loi1lii.I000O01llI0()) {
/* 21 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 16 */            this.I00iiI = i1loi1lii.I0000Il00O();
                }

                public final i1loi1lII I00000oIO() {
/* 3 */             boolean zI000O01llI0 = this.I00iiI.I000O01llI0();
/* 7 */             i1loi1lII i1loi1lii = this.I00iiI;
/* 9 */             if (!zI000O01llI0) {
/* 11 */                return i1loi1lii;
                    }
/* 12 */            i1loi1lii.getClass();
/* 25 */            iI00o0I11.I0000Il00O.I00000oIO(i1loi1lii.getClass()).zze(i1loi1lii);
/* 28 */            i1loi1lii.I0000oI00();
/* 31 */            return this.I00iiI;
                }

                public final Object clone() {
/* 8 */             i1l10OO011O i1l10oo011o = (i1l10OO011O) this.I00iOIl.I00000oIO(5);
/* 14 */            i1l10oo011o.I00iiI = I00000oIO();
/* 20 */            return i1l10oo011o;
                }
            }
