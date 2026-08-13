            package p000;

            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Set;
            
            public final class IiIO0i100IO {
                public String I00000oIO;
                public Io0IIl00 I00000oOI;

                public static String I00000oOI(Set set) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             Iterator it = set.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                I1l1000Io i1l1000Io = (I1l1000Io) it.next();
/* 24 */                sb.append(i1l1000Io.I00000oIO);
/* 29 */                sb.append('/');
/* 34 */                sb.append(i1l1000Io.I00000oOI);
/* 41 */                if (it.hasNext()) {
/* 45 */                    sb.append(' ');
                        }
                    }
/* 49 */            return sb.toString();
                }

                public final String I00000oIO() {
                    Set setUnmodifiableSet;
                    Set setUnmodifiableSet2;
/* 1 */             Io0IIl00 io0IIl00 = this.I00000oOI;
                    synchronized (io0IIl00.I00000oIO) {
/* 8 */                 setUnmodifiableSet = Collections.unmodifiableSet(io0IIl00.I00000oIO);
                    }
/* 13 */            boolean zIsEmpty = setUnmodifiableSet.isEmpty();
/* 17 */            String str = this.I00000oIO;
/* 19 */            if (zIsEmpty) {
/* 21 */                return str;
                    }
/* 24 */            StringBuilder sb = new StringBuilder(str);
/* 29 */            sb.append(' ');
                    synchronized (io0IIl00.I00000oIO) {
/* 37 */                setUnmodifiableSet2 = Collections.unmodifiableSet(io0IIl00.I00000oIO);
                    }
/* 46 */            sb.append(I00000oOI(setUnmodifiableSet2));
/* 49 */            return sb.toString();
                }
            }
