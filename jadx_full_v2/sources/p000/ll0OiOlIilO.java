            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public abstract class ll0OiOlIilO {
                public static final void I00000oIO(StringBuilder sb, Iterator it, IliIlOOIoIo iliIlOOIoIo) {
/* 5 */             if (it.hasNext()) {
/* 11 */                Map.Entry entry = (Map.Entry) it.next();
/* 21 */                sb.append(IliIlOOIoIo.I0000O(entry.getKey()));
/* 26 */                sb.append("=");
/* 37 */                sb.append(IliIlOOIoIo.I0000O(entry.getValue()));
/* 44 */                while (it.hasNext()) {
/* 48 */                    sb.append((CharSequence) iliIlOOIoIo.I00iiI);
/* 55 */                    Map.Entry entry2 = (Map.Entry) it.next();
/* 65 */                    sb.append(IliIlOOIoIo.I0000O(entry2.getKey()));
/* 68 */                    sb.append("=");
/* 79 */                    sb.append(IliIlOOIoIo.I0000O(entry2.getValue()));
                        }
                    }
                }
            }
