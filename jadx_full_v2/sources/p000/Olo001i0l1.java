            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class Olo001i0l1 {
                public final String I00000oIO;
                public final boolean I00000oOI;
                public final List I0000Il00O;
                public final List I0000O;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
                /* JADX WARN: Type inference failed for: r4v2 */
                /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
                public Olo001i0l1(String str, boolean z, List list, List list2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = z;
/* 8 */             this.I0000Il00O = list;
/* 10 */            this.I0000O = list2;
/* 12 */            List arrayList = list2;
/* 18 */            if (arrayList.isEmpty()) {
/* 20 */                int size = list.size();
/* 26 */                arrayList = new ArrayList(size);
/* 30 */                for (int i = 0; i < size; i++) {
/* 34 */                    arrayList.add("ASC");
                        }
                    }
/* 42 */            this.I0000O = (List) arrayList;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 8 */             if (obj instanceof Olo001i0l1) {
/* 11 */                Olo001i0l1 olo001i0l1 = (Olo001i0l1) obj;
/* 13 */                String str = olo001i0l1.I00000oIO;
/* 19 */                if (this.I00000oOI == olo001i0l1.I00000oOI && this.I0000Il00O.equals(olo001i0l1.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, olo001i0l1.I0000O)) {
/* 44 */                    String str2 = this.I00000oIO;
                            return OlOolloIIOl0.I000l1(str2, "index_", false) ? OlOolloIIOl0.I000l1(str, "index_", false) : str2.equals(str);
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 4 */             String str = this.I00000oIO;
/* 39 */            return this.I0000O.hashCode() + IIl001iO0Io.I0000oI00((((OlOolloIIOl0.I000l1(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.I00000oOI ? 1 : 0)) * 31, 31, this.I0000Il00O);
                }

                public final String toString() {
/* 68 */            return OlOoOOooiIll.I00000oOI(OlOoOOooiIll.I0000O("\n            |Index {\n            |   name = '" + this.I00000oIO + "',\n            |   unique = '" + this.I00000oOI + "',\n            |   columns = {" + lOiiOIloll0.I0000O(this.I0000Il00O) + "\n            |   orders = {" + lOiiOIloll0.I0000Il00O(this.I0000O) + "\n            |}\n        "));
                }
            }
