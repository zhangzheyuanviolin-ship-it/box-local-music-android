            package p000;
            
            public abstract class lOloIoil00 {
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                public static Oo1II0I1llO I00000oIO(String str) {
/* 1 */             int iHashCode = str.hashCode();
/* 8 */             if (iHashCode != 79201641) {
/* 13 */                if (iHashCode != 79923350) {
                            switch (iHashCode) {
                                case -503070503:
/* 47 */                            if (str.equals("TLSv1.1")) {
/* 49 */                                return Oo1II0I1llO.TLS_1_1;
                                    }
                                    break;
                                case -503070502:
/* 36 */                            if (str.equals("TLSv1.2")) {
/* 38 */                                return Oo1II0I1llO.TLS_1_2;
                                    }
                                    break;
                                case -503070501:
/* 25 */                            if (str.equals("TLSv1.3")) {
/* 27 */                                return Oo1II0I1llO.TLS_1_3;
                                    }
                                    break;
                            }
                        } else if (str.equals("TLSv1")) {
/* 60 */                    return Oo1II0I1llO.TLS_1_0;
                        }
                    } else if (str.equals("SSLv3")) {
/* 71 */                return Oo1II0I1llO.SSL_3_0;
                    }
/* 80 */            I000II.I000iOII("Unexpected TLS version: ".concat(str));
/* 83 */            return null;
                }
            }
