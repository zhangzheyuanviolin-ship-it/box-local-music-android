            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public class Oi11oio0l<T> {
                private List<T> I00000oIO;
                private List<Integer> I00000oOI;

                private List<T> I0000Il00O() {
/* 1 */             List<T> list = this.I00000oIO;
/* 3 */             if (list != null) {
/* 29 */                return list;
                    }
/* 7 */             ArrayList arrayList = new ArrayList();
/* 10 */            this.I00000oIO = arrayList;
/* 29 */            return arrayList;
                }

                private List<Integer> I0000oI00() {
/* 1 */             List<Integer> list = this.I00000oOI;
/* 3 */             if (list != null) {
/* 29 */                return list;
                    }
/* 7 */             ArrayList arrayList = new ArrayList();
/* 10 */            this.I00000oOI = arrayList;
/* 29 */            return arrayList;
                }

                public void I00000oIO(T t, int i) {
/* 5 */             I0000Il00O().add(t);
/* 16 */            I0000oI00().add(Integer.valueOf(i));
                }

                public T I00000oOI(int i) {
/* 5 */             return I0000Il00O().get(i);
                }

                public int I0000O(int i) {
/* 11 */            return I0000oI00().get(i).intValue();
                }

                public void I0001Ioi1lo(T t, int i) {
/* 5 */             int iIndexOf = I0000Il00O().indexOf(t);
/* 10 */            if (iIndexOf > -1) {
/* 20 */                I0000oI00().set(iIndexOf, Integer.valueOf(i));
                    }
                }

                public int I000II() {
/* 5 */             return I0000Il00O().size();
                }

                public String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 15 */            for (int i = 0; i < I0000Il00O().size(); i++) {
/* 17 */                if (i > 0) {
/* 21 */                    sb.append("; ");
                        }
/* 26 */                sb.append("object=");
/* 37 */                sb.append(I0000Il00O().get(i));
/* 42 */                sb.append(", revisionNumber=");
/* 49 */                sb.append(I0000O(i));
                    }
/* 55 */            return sb.toString();
                }
            }
