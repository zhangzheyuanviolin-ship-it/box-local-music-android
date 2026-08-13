            package p000;
            
            public final class Ioilo1l {
                public final Object I00000oIO;
                public final Object I00000oOI;
                public final Object I0000Il00O;

                public Ioilo1l(Object obj, Object obj2, Object obj3) {
/* 4 */             this.I00000oIO = obj;
/* 6 */             this.I00000oOI = obj2;
/* 8 */             this.I0000Il00O = obj3;
                }

                public final IllegalArgumentException I00000oIO() {
/* 7 */             StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
/* 10 */            Object obj = this.I00000oIO;
/* 12 */            sb.append(obj);
/* 17 */            sb.append("=");
/* 22 */            sb.append(this.I00000oOI);
/* 27 */            sb.append(" and ");
/* 30 */            sb.append(obj);
/* 33 */            sb.append("=");
/* 38 */            sb.append(this.I0000Il00O);
/* 45 */            return new IllegalArgumentException(sb.toString());
                }
            }
