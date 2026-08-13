            package p000;

            import java.util.AbstractSet;
            import java.util.Map;
            import java.util.Set;
            
            public final class Olo01l {
                public final String I00000oIO;
                public final Map I00000oOI;
                public final Set I0000Il00O;
                public final Set I0000O;

                public Olo01l(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = map;
/* 8 */             this.I0000Il00O = abstractSet;
/* 10 */            this.I0000O = abstractSet2;
                }

                public final boolean equals(Object obj) {
                    Set set;
/* 1 */             if (this == obj) {
/* 59 */                return true;
                    }
/* 6 */             if (!(obj instanceof Olo01l)) {
/* 43 */                return false;
                    }
/* 9 */             Olo01l olo01l = (Olo01l) obj;
/* 19 */            if (!this.I00000oIO.equals(olo01l.I00000oIO) || !this.I00000oOI.equals(olo01l.I00000oOI) || !this.I0000Il00O.equals(olo01l.I0000Il00O)) {
/* 43 */                return false;
                    }
/* 45 */            Set set2 = this.I0000O;
/* 47 */            if (set2 == null || (set = olo01l.I0000O) == null) {
/* 59 */                return true;
                    }
/* 54 */            return set2.equals(set);
                }

                public final int hashCode() {
/* 22 */            return this.I0000Il00O.hashCode() + Oi010OO0.I000iOII(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append("',\n            |    columns = {");
/* 42 */            sb.append(lOiiOIloll0.I00000oOI(IOOi0Ool1i.I00Ol1ll1(this.I00000oOI.values(), new OiOIlO1OII0(5))));
/* 47 */            sb.append("\n            |    foreignKeys = {");
/* 58 */            sb.append(lOiiOIloll0.I00000oOI(this.I0000Il00O));
/* 63 */            sb.append("\n            |    indices = {");
/* 66 */            Set set = this.I0000O;
/* 91 */            sb.append(lOiiOIloll0.I00000oOI(set != null ? IOOi0Ool1i.I00Ol1ll1(set, new OiOIlO1OII0(6)) : Il01100l.I00iOIl));
/* 96 */            sb.append("\n            |}\n        ");
/* 103 */           return OlOoOOooiIll.I0000O(sb.toString());
                }
            }
