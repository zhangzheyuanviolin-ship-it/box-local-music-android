            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class OIIl1OIol {
                public OIIl1OIol I00000oIO = null;
                public OIIl1OIol I00000oOI = null;
                public OIIl1OIol I0000Il00O = null;
                public OIIl1OIol I0000O = null;
                public OIIl1OIol I0000oI00 = null;
                public ArrayList I0001Ioi1lo = null;

                public abstract void I00000oIO(O1I1OO o1i1oo);

                public final void I00000oOI(OlIIOI0o olIIOI0o) {
/* 1 */             ArrayList arrayList = this.I0001Ioi1lo;
/* 3 */             if (arrayList == null) {
/* 7 */                 arrayList = new ArrayList();
/* 10 */                this.I0001Ioi1lo = arrayList;
                    }
/* 12 */            arrayList.add(olIIOI0o);
                }

                public final void I0000Il00O(OIIl1OIol oIIl1OIol) {
/* 1 */             oIIl1OIol.I000OOo1O();
/* 4 */             oIIl1OIol.I0001Ioi1lo(this);
/* 7 */             OIIl1OIol oIIl1OIol2 = this.I0000Il00O;
/* 9 */             if (oIIl1OIol2 == null) {
/* 18 */                this.I00000oOI = oIIl1OIol;
/* 20 */                this.I0000Il00O = oIIl1OIol;
                    } else {
/* 11 */                oIIl1OIol2.I0000oI00 = oIIl1OIol;
/* 13 */                oIIl1OIol.I0000O = oIIl1OIol2;
/* 15 */                this.I0000Il00O = oIIl1OIol;
                    }
                }

                public final List I0000O() {
/* 1 */             ArrayList arrayList = this.I0001Ioi1lo;
                    return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
                }

                public final void I0000oI00(OIIl1OIol oIIl1OIol) {
/* 1 */             oIIl1OIol.I000OOo1O();
/* 4 */             OIIl1OIol oIIl1OIol2 = this.I0000oI00;
/* 6 */             oIIl1OIol.I0000oI00 = oIIl1OIol2;
/* 8 */             if (oIIl1OIol2 != null) {
/* 10 */                oIIl1OIol2.I0000O = oIIl1OIol;
                    }
/* 12 */            oIIl1OIol.I0000O = this;
/* 14 */            this.I0000oI00 = oIIl1OIol;
/* 16 */            OIIl1OIol oIIl1OIol3 = this.I00000oIO;
/* 18 */            oIIl1OIol.I00000oIO = oIIl1OIol3;
/* 22 */            if (oIIl1OIol.I0000oI00 == null) {
/* 24 */                oIIl1OIol3.I0000Il00O = oIIl1OIol;
                    }
                }

                public void I0001Ioi1lo(OIIl1OIol oIIl1OIol) {
/* 1 */             this.I00000oIO = oIIl1OIol;
                }

                public final void I000II(List list) {
/* 5 */             if (list.isEmpty()) {
/* 8 */                 this.I0001Ioi1lo = null;
                    } else {
/* 16 */                this.I0001Ioi1lo = new ArrayList(list);
                    }
                }

                public String I000O01llI0() {
/* 1 */             return "";
                }

                public final void I000OOo1O() {
/* 1 */             OIIl1OIol oIIl1OIol = this.I0000O;
/* 3 */             if (oIIl1OIol != null) {
/* 7 */                 oIIl1OIol.I0000oI00 = this.I0000oI00;
                    } else {
/* 10 */                OIIl1OIol oIIl1OIol2 = this.I00000oIO;
/* 12 */                if (oIIl1OIol2 != null) {
/* 16 */                    oIIl1OIol2.I00000oOI = this.I0000oI00;
                        }
                    }
/* 18 */            OIIl1OIol oIIl1OIol3 = this.I0000oI00;
/* 20 */            if (oIIl1OIol3 != null) {
/* 22 */                oIIl1OIol3.I0000O = oIIl1OIol;
                    } else {
/* 25 */                OIIl1OIol oIIl1OIol4 = this.I00000oIO;
/* 27 */                if (oIIl1OIol4 != null) {
/* 29 */                    oIIl1OIol4.I0000Il00O = oIIl1OIol;
                        }
                    }
/* 32 */            this.I00000oIO = null;
/* 34 */            this.I0000oI00 = null;
/* 36 */            this.I0000O = null;
                }

                public final String toString() {
/* 31 */            return getClass().getSimpleName() + "{" + I000O01llI0() + "}";
                }
            }
