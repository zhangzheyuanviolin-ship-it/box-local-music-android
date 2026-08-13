            package p000;

            import java.util.HashMap;
            
            public final class i1IO0oi1I {
                public static final Ioio0O I0000O = Ioio0O.I000o00OoI0I(3, "_syn", "_err", "_el");
                public String I00000oIO;
                public final long I00000oOI;
                public final HashMap I0000Il00O;

                public i1IO0oi1I(String str, long j, HashMap map) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = j;
/* 10 */            HashMap map2 = new HashMap();
/* 13 */            this.I0000Il00O = map2;
/* 15 */            if (map != null) {
/* 17 */                map2.putAll(map);
                    }
                }

                public static Object I00000oOI(Object obj, String str, Object obj2) {
/* 7 */             if (I0000O.contains(str) && (obj2 instanceof Double)) {
/* 23 */                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
                    }
/* 34 */            if (str.startsWith("_")) {
/* 38 */                if (!(obj instanceof String) && obj != null) {
/* 43 */                    return obj;
                        }
                    } else if (!(obj instanceof Double)) {
/* 50 */                if (obj instanceof Long) {
/* 62 */                    return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
                        }
/* 69 */                if (obj instanceof String) {
/* 71 */                    return obj2.toString();
                        }
                    }
/* 98 */            return obj2;
                }

                public final i1IO0oi1I clone() {
/* 14 */            return new i1IO0oi1I(this.I00000oIO, this.I00000oOI, new HashMap(this.I0000Il00O));
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof i1IO0oi1I)) {
/* 31 */                return false;
                    }
/* 10 */            i1IO0oi1I i1io0oi1i = (i1IO0oi1I) obj;
/* 18 */            if (this.I00000oOI == i1io0oi1i.I00000oOI && this.I00000oIO.equals(i1io0oi1i.I00000oIO)) {
/* 37 */                return this.I0000Il00O.equals(i1io0oi1i.I0000Il00O);
                    }
/* 31 */            return false;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 11 */            long j = this.I00000oOI;
/* 27 */            return this.I0000Il00O.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 5 */             String string = this.I0000Il00O.toString();
/* 13 */            int length = String.valueOf(str).length();
/* 17 */            long j = this.I00000oOI;
/* 41 */            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
/* 46 */            sb.append("Event{name='");
/* 49 */            sb.append(str);
/* 54 */            sb.append("', timestamp=");
/* 57 */            sb.append(j);
/* 62 */            sb.append(", params=");
/* 65 */            sb.append(string);
/* 70 */            sb.append("}");
/* 73 */            return sb.toString();
                }
            }
