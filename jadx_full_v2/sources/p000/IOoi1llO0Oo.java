            package p000;
            
            public final class IOoi1llO0Oo {
                public long I00000oIO;
                public long I00000oOI;
                public long I0000Il00O;
                public long I0000O;
                public long I0000oI00;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 70 */                return true;
                    }
/* 4 */             if (obj == null || !(obj instanceof IOoi1llO0Oo)) {
/* 72 */                return false;
                    }
/* 11 */            long j = this.I00000oIO;
/* 13 */            IOoi1llO0Oo iOoi1llO0Oo = (IOoi1llO0Oo) obj;
/* 15 */            long j2 = iOoi1llO0Oo.I00000oIO;
/* 17 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(j, j2) && Ooi0i1.I00000oOI(this.I00000oOI, iOoi1llO0Oo.I00000oOI) && Ooi0i1.I00000oOI(this.I0000Il00O, iOoi1llO0Oo.I0000Il00O) && Ooi0i1.I00000oOI(this.I0000O, iOoi1llO0Oo.I0000O) && Ooi0i1.I00000oOI(this.I0000oI00, iOoi1llO0Oo.I0000oI00);
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 3 */             int i = IOOiio0i.I000oI1ioi;
/* 36 */            return Long.hashCode(this.I0000oI00) + IIlIOloOOO.I0000O(this.I0000O, IIlIOloOOO.I0000O(this.I0000Il00O, IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(j) * 31, 31), 31), 31);
                }

                public final String toString() {
/* 3 */             String strI000OOo1O = IOOiio0i.I000OOo1O(this.I00000oIO);
/* 9 */             String strI000OOo1O2 = IOOiio0i.I000OOo1O(this.I00000oOI);
/* 15 */            String strI000OOo1O3 = IOOiio0i.I000OOo1O(this.I0000Il00O);
/* 21 */            String strI000OOo1O4 = IOOiio0i.I000OOo1O(this.I0000O);
/* 27 */            String strI000OOo1O5 = IOOiio0i.I000OOo1O(this.I0000oI00);
/* 37 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("ContextMenuColors(backgroundColor=", strI000OOo1O, ", textColor=", strI000OOo1O2, ", iconColor=");
/* 45 */            IIl001iO0Io.I001lIiIIo1O(sbI00111O, strI000OOo1O3, ", disabledTextColor=", strI000OOo1O4, ", disabledIconColor=");
/* 50 */            return IIl001iO0Io.I00100l0(sbI00111O, strI000OOo1O5, ")");
                }
            }
