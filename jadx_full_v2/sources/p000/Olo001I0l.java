            package p000;

            import java.util.List;
            
            public final class Olo001I0l {
                public final String I00000oIO;
                public final String I00000oOI;
                public final String I0000Il00O;
                public final List I0000O;
                public final List I0000oI00;

                public Olo001I0l(String str, String str2, String str3, List list, List list2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
/* 8 */             this.I0000Il00O = str3;
/* 10 */            this.I0000O = list;
/* 12 */            this.I0000oI00 = list2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof Olo001I0l)) {
/* 55 */                return false;
                    }
/* 10 */            Olo001I0l olo001I0l = (Olo001I0l) obj;
/* 20 */            if (O0000Ioio00.I0000O(this.I00000oIO, olo001I0l.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, olo001I0l.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, olo001I0l.I0000Il00O) && this.I0000O.equals(olo001I0l.I0000O)) {
/* 61 */                return this.I0000oI00.equals(olo001I0l.I0000oI00);
                    }
/* 55 */            return false;
                }

                public final int hashCode() {
/* 34 */            return this.I0000oI00.hashCode() + IIl001iO0Io.I0000oI00(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31, this.I0000O);
                }

                public final String toString() {
/* 90 */            return OlOoOOooiIll.I00000oOI(OlOoOOooiIll.I0000O("\n            |ForeignKey {\n            |   referenceTable = '" + this.I00000oIO + "',\n            |   onDelete = '" + this.I00000oOI + "',\n            |   onUpdate = '" + this.I0000Il00O + "',\n            |   columnNames = {" + lOiiOIloll0.I0000O(IOOi0Ool1i.I00Ol10(this.I0000O)) + "\n            |   referenceColumnNames = {" + lOiiOIloll0.I0000Il00O(IOOi0Ool1i.I00Ol10(this.I0000oI00)) + "\n            |}\n        "));
                }
            }
