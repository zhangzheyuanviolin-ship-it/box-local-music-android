            package p000;

            import java.io.IOException;
            import java.util.HashMap;
            import java.util.Map;
            
            public final class loOloI01ioO extends llOl001olOi {
                public static final loIiOOlI0oI1 I0000oI00 = new loIiOOlI0oI1(2);
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;

                public loOloI01ioO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object I00000oIO(o0IlOioo o0iloioo) throws IOException {
                    int i;
/* 3 */             Map map = null;
                    switch (this.I00000oIO) {
                        case 0:
/* 202 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 204 */                       o0iloioo.I00lli11();
/* 3 */                         return null;
                            }
/* 208 */                   String strI00ioIO = o0iloioo.I00ioIO();
/* 221 */                   Enum r1 = (Enum) ((HashMap) this.I00000oOI).get(strI00ioIO);
                            return r1 != null ? r1 : (Enum) ((HashMap) this.I0000Il00O).get(strI00ioIO);
                        default:
/* 9 */                     int iI00ooIo0 = o0iloioo.I00ooIo0();
/* 13 */                    if (iI00ooIo0 == 9) {
/* 15 */                        o0iloioo.I00lli11();
                            } else {
/* 28 */                        map = (Map) ((lo11I0lO) this.I0000O).zza();
/* 35 */                        if (iI00ooIo0 == 1) {
/* 37 */                            o0iloioo.I00Io1lO();
/* 44 */                            while (o0iloioo.I00Ol00()) {
/* 46 */                                o0iloioo.I00Io1lO();
/* 55 */                                Object objI00000oIO = ((o0I100l0o0O) this.I00000oOI).I00000oOI.I00000oIO(o0iloioo);
/* 65 */                                Object objI00000oIO2 = ((o0I100l0o0O) this.I0000Il00O).I00000oOI.I00000oIO(o0iloioo);
/* 73 */                                if (map.containsKey(objI00000oIO)) {
/* 95 */                                    throw new llO11IolIO("duplicate key: ".concat(String.valueOf(objI00000oIO)), 25);
                                        }
/* 75 */                                map.put(objI00000oIO, objI00000oIO2);
/* 78 */                                o0iloioo.I00IoiI();
                                    }
/* 96 */                            o0iloioo.I00IoiI();
                                } else {
/* 100 */                           o0iloioo.I00OIl();
/* 107 */                           while (o0iloioo.I00Ol00()) {
/* 111 */                               Iioi0lilII.I00lll10.getClass();
/* 114 */                               int iI00iOIl = o0iloioo.I00ioIO;
/* 116 */                               if (iI00iOIl == 0) {
/* 118 */                                   iI00iOIl = o0iloioo.I00iOIl();
                                        }
/* 124 */                               if (iI00iOIl == 13) {
/* 126 */                                   i = 9;
                                        } else if (iI00iOIl == 12) {
/* 132 */                                   i = 8;
                                        } else {
/* 137 */                                   if (iI00iOIl != 14) {
/* 193 */                                       throw o0iloioo.I00IOO("a name");
                                            }
/* 139 */                                   i = 10;
                                        }
/* 141 */                               o0iloioo.I00ioIO = i;
/* 149 */                               Object objI00000oIO3 = ((o0I100l0o0O) this.I00000oOI).I00000oOI.I00000oIO(o0iloioo);
/* 159 */                               Object objI00000oIO4 = ((o0I100l0o0O) this.I0000Il00O).I00000oOI.I00000oIO(o0iloioo);
/* 167 */                               if (map.containsKey(objI00000oIO3)) {
/* 186 */                                   throw new llO11IolIO("duplicate key: ".concat(String.valueOf(objI00000oIO3)), 25);
                                        }
/* 169 */                               map.put(objI00000oIO3, objI00000oIO4);
                                    }
/* 194 */                           o0iloioo.I00OOll1();
                                }
                            }
/* 197 */                   return map;
                    }
                }
            }
