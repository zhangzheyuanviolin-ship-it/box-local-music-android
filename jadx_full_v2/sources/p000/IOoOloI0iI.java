            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Set;
            
/* 11 */    public final class IOoOloI0iI {
                public static final IOoOloI0iI I0000oI00;
                public String I00000oIO;
                public List I00000oOI;
                public final String I0000Il00O;
                public final String I0000O;

                static {
/* 3 */             String str = "*";
/* 8 */             I0000oI00 = new IOoOloI0iI(str, str);
                }

                public IOoOloI0iI(String str, String str2, String str3, List list) {
/* 4 */             this.I00000oIO = str3;
/* 6 */             this.I00000oOI = list;
/* 8 */             this.I0000Il00O = str;
/* 10 */            this.I0000O = str2;
                }

                public final boolean I00000oIO(IOoOloI0iI iOoOloI0iI) {
                    boolean zI000O01llI0;
/* 1 */             String str = iOoOloI0iI.I0000O;
/* 3 */             String str2 = iOoOloI0iI.I0000Il00O;
/* 13 */            if (!O0000Ioio00.I0000O(str2, "*") && !OlOolloIIOl0.I000O01llI0(str2, this.I0000Il00O, true)) {
/* 11 */                return false;
                    }
/* 28 */            if (!O0000Ioio00.I0000O(str, "*") && !OlOolloIIOl0.I000O01llI0(str, this.I0000O, true)) {
/* 11 */                return false;
                    }
/* 49 */            for (Io1IilIliiI io1IilIliiI : iOoOloI0iI.I00000oOI) {
/* 57 */                String str3 = io1IilIliiI.I00000oIO;
/* 59 */                String str4 = io1IilIliiI.I00000oOI;
/* 65 */                if (O0000Ioio00.I0000O(str3, "*")) {
/* 71 */                    if (!O0000Ioio00.I0000O(str4, "*")) {
/* 75 */                        List list = this.I00000oOI;
/* 81 */                        if (!(list instanceof Collection) || !list.isEmpty()) {
/* 94 */                            Iterator it = list.iterator();
/* 102 */                           while (it.hasNext()) {
/* 116 */                               if (OlOolloIIOl0.I000O01llI0(((Io1IilIliiI) it.next()).I00000oOI, str4, true)) {
                                        }
                                    }
                                }
/* 92 */                        zI000O01llI0 = false;
                            }
/* 73 */                    zI000O01llI0 = true;
                            break;
                        }
/* 119 */               String strI00000oOI = I00000oOI(str3);
/* 127 */               if (!O0000Ioio00.I0000O(str4, "*")) {
/* 132 */                   zI000O01llI0 = OlOolloIIOl0.I000O01llI0(strI00000oOI, str4, true);
                        } else {
/* 129 */                   if (strI00000oOI != null) {
/* 73 */                        zI000O01llI0 = true;
                                break;
                                break;
                            }
/* 92 */                    zI000O01llI0 = false;
                        }
/* 136 */               if (!zI000O01llI0) {
/* 11 */                    return false;
                        }
                    }
/* 12 */            return true;
                }

                public final String I00000oOI(String str) {
/* 1 */             List list = this.I00000oOI;
/* 3 */             int iI000II = IOOi1I.I000II(list);
/* 7 */             if (iI000II < 0) {
/* 33 */                return null;
                    }
/* 9 */             int i = 0;
                    while (true) {
/* 14 */                Io1IilIliiI io1IilIliiI = (Io1IilIliiI) list.get(i);
/* 23 */                if (OlOolloIIOl0.I000O01llI0(io1IilIliiI.I00000oIO, str, true)) {
/* 25 */                    return io1IilIliiI.I00000oOI;
                        }
/* 28 */                if (i == iI000II) {
/* 33 */                    return null;
                        }
/* 30 */                i++;
                    }
                }

                public final IOoOloI0iI I0000Il00O() {
                    return this.I00000oOI.isEmpty() ? this : new IOoOloI0iI(this.I0000Il00O, this.I0000O);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof IOoOloI0iI)) {
/* 39 */                return false;
                    }
/* 5 */             IOoOloI0iI iOoOloI0iI = (IOoOloI0iI) obj;
                    return OlOolloIIOl0.I000O01llI0(this.I0000Il00O, iOoOloI0iI.I0000Il00O, true) && OlOolloIIOl0.I000O01llI0(this.I0000O, iOoOloI0iI.I0000O, true) && O0000Ioio00.I0000O(this.I00000oOI, iOoOloI0iI.I00000oOI);
                }

                public final int hashCode() {
/* 1 */             Locale locale = Locale.ROOT;
/* 9 */             int iHashCode = this.I0000Il00O.toLowerCase(locale).hashCode();
/* 21 */            int iHashCode2 = this.I0000O.toLowerCase(locale).hashCode();
/* 35 */            return (this.I00000oOI.hashCode() * 31) + iHashCode2 + (iHashCode * 31) + iHashCode;
                }

                /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x011f A[LOOP:1: B:12:0x0045->B:64:0x011f, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x012a A[EDGE_INSN: B:71:0x012a->B:67:0x012a BREAK  A[LOOP:1: B:12:0x0045->B:64:0x011f], SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
                    int length;
                    int i;
                    int length2;
                    int i2;
/* 1 */             List<Io1IilIliiI> list = this.I00000oOI;
/* 3 */             boolean zIsEmpty = list.isEmpty();
/* 7 */             String str = this.I00000oIO;
/* 9 */             if (zIsEmpty) {
/* 11 */                return str;
                    }
/* 12 */            int length3 = str.length();
/* 24 */            int length4 = 0;
/* 29 */            for (Io1IilIliiI io1IilIliiI : list) {
/* 52 */                length4 += io1IilIliiI.I00000oOI.length() + io1IilIliiI.I00000oIO.length() + 3;
                    }
/* 57 */            StringBuilder sb = new StringBuilder(length3 + length4);
/* 60 */            sb.append(str);
/* 63 */            int iI000II = IOOi1I.I000II(list);
/* 67 */            if (iI000II >= 0) {
/* 69 */                int i3 = 0;
                        while (true) {
/* 74 */                    Io1IilIliiI io1IilIliiI2 = (Io1IilIliiI) list.get(i3);
/* 78 */                    sb.append("; ");
/* 83 */                    sb.append(io1IilIliiI2.I00000oIO);
/* 88 */                    sb.append("=");
/* 91 */                    String str2 = io1IilIliiI2.I00000oOI;
/* 93 */                    Set set = Io1IlIO0.I00000oIO;
/* 103 */                   if (str2.length() == 0) {
/* 203 */                       StringBuilder sb2 = new StringBuilder("\"");
/* 206 */                       length = str2.length();
/* 211 */                       while (i < length) {
                                }
/* 269 */                       sb2.append("\"");
/* 276 */                       sb.append(sb2.toString());
/* 286 */                       if (i3 != iI000II) {
                                }
                            } else if (str2.length() >= 2) {
/* 118 */                       if (str2.length() == 0) {
/* 294 */                           OIiilo1Ool0o.I000II("Char sequence is empty.");
/* 297 */                           return null;
                                }
/* 124 */                       if (str2.charAt(0) == '\"' && OlOoOIi0o.I001lIiIIo1O(str2) == '\"') {
/* 133 */                           int i4 = 1;
/* 172 */                           do {
/* 135 */                               int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str2, '\"', i4, 4);
/* 143 */                               if (iI001i1O0Ol == OlOoOIi0o.I00111O(str2)) {
                                            break;
                                        }
/* 149 */                               int i5 = 0;
/* 154 */                               for (int i6 = iI001i1O0Ol - 1; str2.charAt(i6) == '\\'; i6--) {
/* 156 */                                   i5++;
                                        }
/* 163 */                               if (i5 % 2 == 0) {
/* 176 */                                   length2 = str2.length();
/* 181 */                                   while (i2 < length2) {
                                            }
                                        } else {
/* 166 */                                   i4 = iI001i1O0Ol + 1;
                                        }
/* 172 */                           } while (i4 < str2.length());
/* 283 */                           sb.append(str2);
/* 286 */                           if (i3 != iI000II) {
                                    }
                                } else {
/* 176 */                           length2 = str2.length();
/* 181 */                           for (i2 = 0; i2 < length2; i2++) {
/* 197 */                               if (Io1IlIO0.I00000oIO.contains(Character.valueOf(str2.charAt(i2)))) {
/* 203 */                                   StringBuilder sb22 = new StringBuilder("\"");
/* 206 */                                   length = str2.length();
/* 211 */                                   for (i = 0; i < length; i++) {
/* 213 */                                       char cCharAt = str2.charAt(i);
/* 219 */                                       if (cCharAt == '\t') {
/* 263 */                                           sb22.append("\\t");
                                                } else if (cCharAt == '\n') {
/* 257 */                                           sb22.append("\\n");
                                                } else if (cCharAt == '\r') {
/* 251 */                                           sb22.append("\\r");
                                                } else if (cCharAt == '\"') {
/* 245 */                                           sb22.append("\\\"");
                                                } else if (cCharAt != '\\') {
/* 233 */                                           sb22.append(cCharAt);
                                                } else {
/* 239 */                                           sb22.append("\\\\");
                                                }
                                            }
/* 269 */                                   sb22.append("\"");
/* 276 */                                   sb.append(sb22.toString());
/* 286 */                                   if (i3 != iI000II) {
                                                break;
                                            }
/* 288 */                                   i3++;
                                        }
                                    }
/* 283 */                           sb.append(str2);
/* 286 */                           if (i3 != iI000II) {
                                    }
                                }
                            }
                        }
                    }
/* 299 */           return sb.toString();
                }

/* 12 */        public IOoOloI0iI(String str, String str2, List list) {
/* 14 */            this(str, str2, IIlIOloOOO.I000oI1ioi('/', str, str2), list);
                }

/* 14 */        public IOoOloI0iI(String str, String str2) {
/* 16 */            this(str, str2, Il01100l.I00iOIl);
                }
            }
