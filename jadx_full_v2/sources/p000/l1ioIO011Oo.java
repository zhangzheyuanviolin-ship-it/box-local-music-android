            package p000;

            import android.os.Bundle;
            import java.util.EnumMap;
            import java.util.Iterator;
            
/* 26 */    public final class l1ioIO011Oo {
                public static final l1ioIO011Oo I0000Il00O = new l1ioIO011Oo(100);
                public final EnumMap I00000oIO;
                public final int I00000oOI;

                public l1ioIO011Oo(int i) {
/* 8 */             EnumMap enumMap = new EnumMap(l1iioiool.class);
/* 11 */            this.I00000oIO = enumMap;
/* 13 */            l1iioiool l1iioioolVar = l1iioiool.AD_STORAGE;
/* 15 */            l1iIoO01 l1iioo01 = l1iIoO01.UNINITIALIZED;
/* 17 */            enumMap.put((EnumMap) l1iioioolVar, (l1iioiool) l1iioo01);
/* 22 */            enumMap.put((EnumMap) l1iioiool.ANALYTICS_STORAGE, (l1iioiool) l1iioo01);
/* 25 */            this.I00000oOI = i;
                }

                public static String I00000oIO(int i) {
                    return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
                }

                public static l1ioIO011Oo I00000oOI(int i, Bundle bundle) {
/* 1 */             if (bundle == null) {
/* 5 */                 return new l1ioIO011Oo(i);
                    }
/* 13 */            EnumMap enumMap = new EnumMap(l1iioiool.class);
/* 22 */            for (l1iioiool l1iioioolVar : l1iOili.STORAGE.I00iOIl) {
/* 36 */                enumMap.put((EnumMap) l1iioioolVar, (l1iioiool) I0000O(bundle.getString(l1iioioolVar.I00iOIl)));
                    }
/* 44 */            return new l1ioIO011Oo(enumMap, i);
                }

                public static l1ioIO011Oo I0000Il00O(int i, String str) {
/* 5 */             EnumMap enumMap = new EnumMap(l1iioiool.class);
/* 10 */            l1iioiool[] l1iioioolVarArr = l1iOili.STORAGE.I00iOIl;
/* 14 */            for (int i2 = 0; i2 < l1iioioolVarArr.length; i2++) {
/* 21 */                String str2 = str == null ? "" : str;
/* 22 */                l1iioiool l1iioioolVar = l1iioioolVarArr[i2];
/* 24 */                int i3 = i2 + 2;
/* 30 */                if (i3 < str2.length()) {
/* 40 */                    enumMap.put((EnumMap) l1iioioolVar, (l1iioiool) I0000oI00(str2.charAt(i3)));
                        } else {
/* 46 */                    enumMap.put((EnumMap) l1iioioolVar, (l1iioiool) l1iIoO01.UNINITIALIZED);
                        }
                    }
/* 54 */            return new l1ioIO011Oo(enumMap, i);
                }

                public static l1iIoO01 I0000O(String str) {
/* 1 */             l1iIoO01 l1iioo01 = l1iIoO01.UNINITIALIZED;
                    return str == null ? l1iioo01 : str.equals("granted") ? l1iIoO01.GRANTED : str.equals("denied") ? l1iIoO01.DENIED : l1iioo01;
                }

                public static l1iIoO01 I0000oI00(char c) {
                    return c != '+' ? c != '0' ? c != '1' ? l1iIoO01.UNINITIALIZED : l1iIoO01.GRANTED : l1iIoO01.DENIED : l1iIoO01.POLICY;
                }

                public static char I000O01llI0(l1iIoO01 l1iioo01) {
/* 1 */             if (l1iioo01 == null) {
/* 26 */                return '-';
                    }
/* 3 */             int iOrdinal = l1iioo01.ordinal();
/* 8 */             if (iOrdinal == 1) {
/* 23 */                return '+';
                    }
/* 11 */            if (iOrdinal != 2) {
                        return iOrdinal != 3 ? '-' : '1';
                    }
/* 20 */            return '0';
                }

                public static boolean I000l1(int i, int i2) {
/* 1 */             int i3 = -30;
/* 5 */             if (i == -20) {
/* 7 */                 if (i2 == -30) {
/* 23 */                    return true;
                        }
/* 9 */                 i = -20;
                    }
/* 10 */            if (i != -30) {
/* 15 */                i3 = i;
                    } else if (i2 == -20) {
/* 23 */                return true;
                    }
                    return i3 == i2 || i < i2;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I0001Ioi1lo() {
                    int iOrdinal;
/* 5 */             StringBuilder sb = new StringBuilder("G1");
/* 14 */            for (l1iioiool l1iioioolVar : l1iOili.STORAGE.I00iOIl) {
/* 24 */                l1iIoO01 l1iioo01 = (l1iIoO01) this.I00000oIO.get(l1iioioolVar);
/* 26 */                char c = '-';
/* 28 */                if (l1iioo01 != null && (iOrdinal = l1iioo01.ordinal()) != 0) {
/* 37 */                    if (iOrdinal == 1) {
/* 49 */                        c = '1';
                            } else if (iOrdinal == 2) {
/* 46 */                        c = '0';
                            } else if (iOrdinal != 3) {
                            }
                        }
/* 51 */                sb.append(c);
                    }
/* 57 */            return sb.toString();
                }

                public final String I000II() {
/* 5 */             StringBuilder sb = new StringBuilder("G1");
/* 14 */            for (l1iioiool l1iioioolVar : l1iOili.STORAGE.I00iOIl) {
/* 30 */                sb.append(I000O01llI0((l1iIoO01) this.I00000oIO.get(l1iioioolVar)));
                    }
/* 36 */            return sb.toString();
                }

                public final boolean I000OOo1O(l1iioiool l1iioioolVar) {
                    return ((l1iIoO01) this.I00000oIO.get(l1iioioolVar)) != l1iIoO01.DENIED;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final l1ioIO011Oo I000OiO(l1ioIO011Oo l1ioio011oo) {
/* 5 */             EnumMap enumMap = new EnumMap(l1iioiool.class);
/* 14 */            for (l1iioiool l1iioioolVar : l1iOili.STORAGE.I00iOIl) {
/* 24 */                l1iIoO01 l1iioo01 = (l1iIoO01) this.I00000oIO.get(l1iioioolVar);
/* 32 */                l1iIoO01 l1iioo012 = (l1iIoO01) l1ioio011oo.I00000oIO.get(l1iioioolVar);
/* 34 */                if (l1iioo01 != null) {
/* 37 */                    if (l1iioo012 != null) {
/* 39 */                        l1iIoO01 l1iioo013 = l1iIoO01.UNINITIALIZED;
/* 41 */                        if (l1iioo01 != l1iioo013) {
/* 44 */                            if (l1iioo012 != l1iioo013) {
/* 46 */                                l1iIoO01 l1iioo014 = l1iIoO01.POLICY;
/* 48 */                                if (l1iioo01 == l1iioo014) {
/* 50 */                                    l1iioo01 = l1iioo012;
                                        } else if (l1iioo012 != l1iioo014) {
/* 54 */                                    l1iIoO01 l1iioo015 = l1iIoO01.DENIED;
/* 64 */                                    l1iioo01 = (l1iioo01 == l1iioo015 || l1iioo012 == l1iioo015) ? l1iioo015 : l1iIoO01.GRANTED;
                                        }
                                    }
                                }
                            }
                        }
/* 65 */                if (l1iioo01 != null) {
/* 67 */                    enumMap.put((EnumMap) l1iioioolVar, (l1iioiool) l1iioo01);
                        }
                    }
/* 77 */            return new l1ioIO011Oo(enumMap, 100);
                }

                public final l1ioIO011Oo I000iOII(l1ioIO011Oo l1ioio011oo) {
/* 5 */             EnumMap enumMap = new EnumMap(l1iioiool.class);
/* 14 */            for (l1iioiool l1iioioolVar : l1iOili.STORAGE.I00iOIl) {
/* 24 */                l1iIoO01 l1iioo01 = (l1iIoO01) this.I00000oIO.get(l1iioioolVar);
/* 28 */                if (l1iioo01 == l1iIoO01.UNINITIALIZED) {
/* 36 */                    l1iioo01 = (l1iIoO01) l1ioio011oo.I00000oIO.get(l1iioioolVar);
                        }
/* 38 */                if (l1iioo01 != null) {
/* 40 */                    enumMap.put((EnumMap) l1iioioolVar, (l1iioiool) l1iioo01);
                        }
                    }
/* 50 */            return new l1ioIO011Oo(enumMap, this.I00000oOI);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof l1ioIO011Oo) {
/* 7 */                 l1ioIO011Oo l1ioio011oo = (l1ioIO011Oo) obj;
/* 11 */                l1iioiool[] l1iioioolVarArr = l1iOili.STORAGE.I00iOIl;
/* 13 */                int length = l1iioioolVarArr.length;
/* 14 */                int i = 0;
                        while (true) {
/* 15 */                    if (i < length) {
/* 17 */                        l1iioiool l1iioioolVar = l1iioioolVarArr[i];
/* 31 */                        if (this.I00000oIO.get(l1iioioolVar) != l1ioio011oo.I00000oIO.get(l1iioioolVar)) {
                                    break;
                                }
/* 34 */                        i++;
                            } else if (this.I00000oOI == l1ioio011oo.I00000oOI) {
/* 43 */                        return true;
                            }
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 7 */             Iterator it = this.I00000oIO.values().iterator();
/* 13 */            int iHashCode = this.I00000oOI * 17;
/* 19 */            while (it.hasNext()) {
/* 33 */                iHashCode = (iHashCode * 31) + ((l1iIoO01) it.next()).hashCode();
                    }
/* 55 */            return iHashCode;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("source=");
/* 14 */            sb.append(I00000oIO(this.I00000oOI));
/* 23 */            for (l1iioiool l1iioioolVar : l1iOili.STORAGE.I00iOIl) {
/* 29 */                sb.append(",");
/* 34 */                sb.append(l1iioioolVar.I00iOIl);
/* 39 */                sb.append("=");
/* 48 */                l1iIoO01 l1iioo01 = (l1iIoO01) this.I00000oIO.get(l1iioioolVar);
/* 50 */                if (l1iioo01 == null) {
/* 52 */                    l1iioo01 = l1iIoO01.UNINITIALIZED;
                        }
/* 54 */                sb.append(l1iioo01);
                    }
/* 60 */            return sb.toString();
                }

/* 27 */        public l1ioIO011Oo(EnumMap enumMap, int i) {
                    EnumMap enumMap2 = new EnumMap(l1iioiool.class);
                    this.I00000oIO = enumMap2;
/* 29 */            enumMap2.putAll(enumMap);
                    this.I00000oOI = i;
                }
            }
