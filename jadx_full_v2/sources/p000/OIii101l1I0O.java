            package p000;

            import java.util.concurrent.ConcurrentHashMap;
            
            public final class OIii101l1I0O {
                public static final ConcurrentHashMap I0000Il00O = new ConcurrentHashMap();
                public final String I00000oIO;
                public byte[] I00000oOI;

                public OIii101l1I0O(String str) {
/* 4 */             this.I00000oIO = str;
/* 12 */            if (str.startsWith("/")) {
/* 23 */                I000II.I000iOII(IlIi0I0.I000lI("Operators are not allowed to start with / '", str, "'"));
/* 49 */                throw null;
                    }
                }

                public static OIii101l1I0O I00000oIO(String str) {
/* 7 */             if (str.equals("ID") || "BI".equals(str)) {
/* 51 */                return new OIii101l1I0O(str);
                    }
/* 18 */            ConcurrentHashMap concurrentHashMap = I0000Il00O;
/* 24 */            OIii101l1I0O oIii101l1I0O = (OIii101l1I0O) concurrentHashMap.get(str);
                    return (oIii101l1I0O == null && (oIii101l1I0O = (OIii101l1I0O) concurrentHashMap.putIfAbsent(str, new OIii101l1I0O(str))) == null) ? (OIii101l1I0O) concurrentHashMap.get(str) : oIii101l1I0O;
                }

                public final String toString() {
/* 12 */            return IIl001iO0Io.I00100l0(new StringBuilder("PDFOperator{"), this.I00000oIO, "}");
                }
            }
