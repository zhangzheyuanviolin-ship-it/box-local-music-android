            package p000;

            import com.google.mlkit.genai.common.GenAiException;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public final class IoOIoo implements Comparable {
                public static final IoOIoo I00iiO;
                public static final IoOIoo I00iio;
                public static final IoOIoo I00ilI0I1;
                public static final IoOIoo I00ilO0;
                public static final List I00io1l;
                public static final LinkedHashMap I00ioIO;
                public final int I00iOIl;
                public final String I00iiI;

                static {
/* 7 */             IoOIoo ioOIoo = new IoOIoo(100, "Continue");
/* 16 */            IoOIoo ioOIoo2 = new IoOIoo(101, "Switching Protocols");
/* 25 */            IoOIoo ioOIoo3 = new IoOIoo(102, "Processing");
/* 34 */            IoOIoo ioOIoo4 = new IoOIoo(200, "OK");
/* 37 */            I00iiO = ioOIoo4;
/* 45 */            IoOIoo ioOIoo5 = new IoOIoo(201, "Created");
/* 54 */            IoOIoo ioOIoo6 = new IoOIoo(202, "Accepted");
/* 57 */            I00iio = ioOIoo6;
/* 65 */            IoOIoo ioOIoo7 = new IoOIoo(203, "Non-Authoritative Information");
/* 74 */            IoOIoo ioOIoo8 = new IoOIoo(204, "No Content");
/* 77 */            I00ilI0I1 = ioOIoo8;
/* 85 */            IoOIoo ioOIoo9 = new IoOIoo(205, "Reset Content");
/* 94 */            IoOIoo ioOIoo10 = new IoOIoo(206, "Partial Content");
/* 103 */           IoOIoo ioOIoo11 = new IoOIoo(207, "Multi-Status");
/* 112 */           IoOIoo ioOIoo12 = new IoOIoo(300, "Multiple Choices");
/* 121 */           IoOIoo ioOIoo13 = new IoOIoo(301, "Moved Permanently");
/* 130 */           IoOIoo ioOIoo14 = new IoOIoo(302, "Found");
/* 141 */           IoOIoo ioOIoo15 = new IoOIoo(303, "See Other");
/* 152 */           IoOIoo ioOIoo16 = new IoOIoo(304, "Not Modified");
/* 163 */           IoOIoo ioOIoo17 = new IoOIoo(305, "Use Proxy");
/* 174 */           IoOIoo ioOIoo18 = new IoOIoo(306, "Switch Proxy");
/* 185 */           IoOIoo ioOIoo19 = new IoOIoo(307, "Temporary Redirect");
/* 196 */           IoOIoo ioOIoo20 = new IoOIoo(308, "Permanent Redirect");
/* 207 */           IoOIoo ioOIoo21 = new IoOIoo(400, "Bad Request");
/* 218 */           IoOIoo ioOIoo22 = new IoOIoo(401, "Unauthorized");
/* 229 */           IoOIoo ioOIoo23 = new IoOIoo(402, "Payment Required");
/* 240 */           IoOIoo ioOIoo24 = new IoOIoo(403, "Forbidden");
/* 251 */           IoOIoo ioOIoo25 = new IoOIoo(404, "Not Found");
/* 262 */           IoOIoo ioOIoo26 = new IoOIoo(405, "Method Not Allowed");
/* 265 */           I00ilO0 = ioOIoo26;
/* 648 */           List listI000O01llI0 = IOOi1I.I000O01llI0(ioOIoo, ioOIoo2, ioOIoo3, ioOIoo4, ioOIoo5, ioOIoo6, ioOIoo7, ioOIoo8, ioOIoo9, ioOIoo10, ioOIoo11, ioOIoo12, ioOIoo13, ioOIoo14, ioOIoo15, ioOIoo16, ioOIoo17, ioOIoo18, ioOIoo19, ioOIoo20, ioOIoo21, ioOIoo22, ioOIoo23, ioOIoo24, ioOIoo25, ioOIoo26, new IoOIoo(406, "Not Acceptable"), new IoOIoo(407, "Proxy Authentication Required"), new IoOIoo(408, "Request Timeout"), new IoOIoo(409, "Conflict"), new IoOIoo(410, "Gone"), new IoOIoo(411, "Length Required"), new IoOIoo(412, "Precondition Failed"), new IoOIoo(413, "Payload Too Large"), new IoOIoo(414, "Request-URI Too Long"), new IoOIoo(415, "Unsupported Media Type"), new IoOIoo(416, "Requested Range Not Satisfiable"), new IoOIoo(417, "Expectation Failed"), new IoOIoo(422, "Unprocessable Entity"), new IoOIoo(423, "Locked"), new IoOIoo(424, "Failed Dependency"), new IoOIoo(425, "Too Early"), new IoOIoo(426, "Upgrade Required"), new IoOIoo(429, "Too Many Requests"), new IoOIoo(431, "Request Header Fields Too Large"), new IoOIoo(500, "Internal Server Error"), new IoOIoo(GenAiException.ErrorCode.NOT_ENOUGH_DISK_SPACE, "Not Implemented"), new IoOIoo(502, "Bad Gateway"), new IoOIoo(503, "Service Unavailable"), new IoOIoo(504, "Gateway Timeout"), new IoOIoo(505, "HTTP Version Not Supported"), new IoOIoo(506, "Variant Also Negotiates"), new IoOIoo(507, "Insufficient Storage"));
/* 652 */           I00io1l = listI000O01llI0;
/* 654 */           List list = listI000O01llI0;
/* 662 */           int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(list, 10));
/* 668 */           if (iI00000oIO < 16) {
/* 670 */               iI00000oIO = 16;
                    }
/* 673 */           LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 684 */           for (Object obj : list) {
/* 699 */               linkedHashMap.put(Integer.valueOf(((IoOIoo) obj).I00iOIl), obj);
                    }
/* 703 */           I00ioIO = linkedHashMap;
                }

                public IoOIoo(int i, String str) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = str;
                }

                @Override
                public final int compareTo(Object obj) {
/* 7 */             return this.I00iOIl - ((IoOIoo) obj).I00iOIl;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IoOIoo) && ((IoOIoo) obj).I00iOIl == this.I00iOIl;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00iOIl);
                }

                public final String toString() {
/* 21 */            return this.I00iOIl + ' ' + this.I00iiI;
                }
            }
