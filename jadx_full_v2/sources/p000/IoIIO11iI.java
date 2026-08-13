            package p000;

            import java.io.IOException;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public abstract class IoIIO11iI {
                public static final Io1IiiI11[] I00000oIO;
                public static final Map I00000oOI;

                static {
/* 7 */             Io1IiiI11 io1IiiI11 = new Io1IiiI11(Io1IiiI11.I000OOo1O, "");
/* 12 */            IIOIIi1ilIO iIOIIi1ilIO = Io1IiiI11.I0001Ioi1lo;
/* 16 */            Io1IiiI11 io1IiiI112 = new Io1IiiI11(iIOIIi1ilIO, "GET");
/* 23 */            Io1IiiI11 io1IiiI113 = new Io1IiiI11(iIOIIi1ilIO, "POST");
/* 29 */            IIOIIi1ilIO iIOIIi1ilIO2 = Io1IiiI11.I000II;
/* 33 */            Io1IiiI11 io1IiiI114 = new Io1IiiI11(iIOIIi1ilIO2, "/");
/* 40 */            Io1IiiI11 io1IiiI115 = new Io1IiiI11(iIOIIi1ilIO2, "/index.html");
/* 46 */            IIOIIi1ilIO iIOIIi1ilIO3 = Io1IiiI11.I000O01llI0;
/* 50 */            Io1IiiI11 io1IiiI116 = new Io1IiiI11(iIOIIi1ilIO3, "http");
/* 57 */            Io1IiiI11 io1IiiI117 = new Io1IiiI11(iIOIIi1ilIO3, "https");
/* 63 */            IIOIIi1ilIO iIOIIi1ilIO4 = Io1IiiI11.I0000oI00;
/* 642 */           Io1IiiI11[] io1IiiI11Arr = {io1IiiI11, io1IiiI112, io1IiiI113, io1IiiI114, io1IiiI115, io1IiiI116, io1IiiI117, new Io1IiiI11(iIOIIi1ilIO4, "200"), new Io1IiiI11(iIOIIi1ilIO4, "204"), new Io1IiiI11(iIOIIi1ilIO4, "206"), new Io1IiiI11(iIOIIi1ilIO4, "304"), new Io1IiiI11(iIOIIi1ilIO4, "400"), new Io1IiiI11(iIOIIi1ilIO4, "404"), new Io1IiiI11(iIOIIi1ilIO4, "500"), new Io1IiiI11("accept-charset", ""), new Io1IiiI11("accept-encoding", "gzip, deflate"), new Io1IiiI11("accept-language", ""), new Io1IiiI11("accept-ranges", ""), new Io1IiiI11("accept", ""), new Io1IiiI11("access-control-allow-origin", ""), new Io1IiiI11("age", ""), new Io1IiiI11("allow", ""), new Io1IiiI11("authorization", ""), new Io1IiiI11("cache-control", ""), new Io1IiiI11("content-disposition", ""), new Io1IiiI11("content-encoding", ""), new Io1IiiI11("content-language", ""), new Io1IiiI11("content-length", ""), new Io1IiiI11("content-location", ""), new Io1IiiI11("content-range", ""), new Io1IiiI11("content-type", ""), new Io1IiiI11("cookie", ""), new Io1IiiI11("date", ""), new Io1IiiI11("etag", ""), new Io1IiiI11("expect", ""), new Io1IiiI11("expires", ""), new Io1IiiI11("from", ""), new Io1IiiI11("host", ""), new Io1IiiI11("if-match", ""), new Io1IiiI11("if-modified-since", ""), new Io1IiiI11("if-none-match", ""), new Io1IiiI11("if-range", ""), new Io1IiiI11("if-unmodified-since", ""), new Io1IiiI11("last-modified", ""), new Io1IiiI11("link", ""), new Io1IiiI11("location", ""), new Io1IiiI11("max-forwards", ""), new Io1IiiI11("proxy-authenticate", ""), new Io1IiiI11("proxy-authorization", ""), new Io1IiiI11("range", ""), new Io1IiiI11("referer", ""), new Io1IiiI11("refresh", ""), new Io1IiiI11("retry-after", ""), new Io1IiiI11("server", ""), new Io1IiiI11("set-cookie", ""), new Io1IiiI11("strict-transport-security", ""), new Io1IiiI11("transfer-encoding", ""), new Io1IiiI11("user-agent", ""), new Io1IiiI11("vary", ""), new Io1IiiI11("via", ""), new Io1IiiI11("www-authenticate", "")};
/* 646 */           I00000oIO = io1IiiI11Arr;
/* 652 */           LinkedHashMap linkedHashMap = new LinkedHashMap(61);
/* 656 */           for (int i = 0; i < 61; i++) {
/* 666 */               if (!linkedHashMap.containsKey(io1IiiI11Arr[i].I00000oIO)) {
/* 676 */                   linkedHashMap.put(io1IiiI11Arr[i].I00000oIO, Integer.valueOf(i));
                        }
                    }
/* 686 */           I00000oOI = Collections.unmodifiableMap(linkedHashMap);
                }

                public static void I00000oIO(IIOIIi1ilIO iIOIIi1ilIO) throws IOException {
/* 1 */             int iI00000oOI = iIOIIi1ilIO.I00000oOI();
/* 6 */             for (int i = 0; i < iI00000oOI; i++) {
/* 8 */                 byte bI000II = iIOIIi1ilIO.I000II(i);
/* 14 */                if (65 <= bI000II && bI000II < 91) {
/* 31 */                    IioIoO10iOiI.I000OOo1O("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iIOIIi1ilIO.I000o00OoI0I()));
/* 34 */                    return;
                        }
                    }
                }
            }
