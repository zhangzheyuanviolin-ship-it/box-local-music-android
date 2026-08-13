            package p000;

            import android.os.Bundle;
            import java.util.EnumMap;
            import java.util.Objects;
            
/* 45 */    public final class iOoOIi0i {
                public static final iOoOIi0i I0001Ioi1lo = new iOoOIi0i((Boolean) null, 100, (Boolean) null, (String) null);
                public final int I00000oIO;
                public final String I00000oOI;
                public final Boolean I0000Il00O;
                public final String I0000O;
                public final EnumMap I0000oI00;

                public iOoOIi0i(Boolean bool, int i, Boolean bool2, String str) {
/* 8 */             EnumMap enumMap = new EnumMap(l1iioiool.class);
/* 11 */            this.I0000oI00 = enumMap;
/* 31 */            enumMap.put((EnumMap) l1iioiool.AD_USER_DATA, (l1iioiool) (bool == null ? l1iIoO01.UNINITIALIZED : bool.booleanValue() ? l1iIoO01.GRANTED : l1iIoO01.DENIED));
/* 34 */            this.I00000oIO = i;
/* 40 */            this.I00000oOI = I0000O();
/* 42 */            this.I0000Il00O = bool2;
/* 44 */            this.I0000O = str;
                }

                public static iOoOIi0i I00000oOI(String str) throws NumberFormatException {
/* 1 */             if (str == null || str.length() <= 0) {
/* 67 */                return I0001Ioi1lo;
                    }
/* 12 */            String[] strArrSplit = str.split(":");
/* 19 */            int i = Integer.parseInt(strArrSplit[0]);
/* 27 */            EnumMap enumMap = new EnumMap(l1iioiool.class);
/* 32 */            l1iioiool[] l1iioioolVarArr = l1iOili.DMA.I00iOIl;
/* 34 */            int length = l1iioioolVarArr.length;
/* 35 */            int i2 = 1;
/* 36 */            int i3 = 0;
/* 37 */            while (i3 < length) {
/* 53 */                enumMap.put((EnumMap) l1iioioolVarArr[i3], (l1iioiool) l1ioIO011Oo.I0000oI00(strArrSplit[i2].charAt(0)));
/* 56 */                i3++;
/* 41 */                i2++;
                    }
/* 63 */            return new iOoOIi0i(enumMap, i, (Boolean) null, (String) null);
                }

                public static iOoOIi0i I0000Il00O(int i, Bundle bundle) {
/* 2 */             if (bundle == null) {
/* 6 */                 return new iOoOIi0i((Boolean) null, i, (Boolean) null, (String) null);
                    }
/* 14 */            EnumMap enumMap = new EnumMap(l1iioiool.class);
/* 23 */            for (l1iioiool l1iioioolVar : l1iOili.DMA.I00iOIl) {
/* 37 */                enumMap.put((EnumMap) l1iioioolVar, (l1iioiool) l1ioIO011Oo.I0000O(bundle.getString(l1iioioolVar.I00iOIl)));
                    }
/* 67 */            return new iOoOIi0i(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
                }

                public final l1iIoO01 I00000oIO() {
/* 9 */             l1iIoO01 l1iioo01 = (l1iIoO01) this.I0000oI00.get(l1iioiool.AD_USER_DATA);
                    return l1iioo01 == null ? l1iIoO01.UNINITIALIZED : l1iioo01;
                }

                public final String I0000O() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(this.I00000oIO);
/* 17 */            for (l1iioiool l1iioioolVar : l1iOili.DMA.I00iOIl) {
/* 23 */                sb.append(":");
/* 38 */                sb.append(l1ioIO011Oo.I000O01llI0((l1iIoO01) this.I0000oI00.get(l1iioioolVar)));
                    }
/* 44 */            return sb.toString();
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof iOoOIi0i)) {
/* 37 */                return false;
                    }
/* 6 */             iOoOIi0i ioooii0i = (iOoOIi0i) obj;
/* 16 */            if (this.I00000oOI.equalsIgnoreCase(ioooii0i.I00000oOI) && Objects.equals(this.I0000Il00O, ioooii0i.I0000Il00O)) {
/* 32 */                return Objects.equals(this.I0000O, ioooii0i.I0000O);
                    }
/* 37 */            return false;
                }

                public final int hashCode() {
/* 1 */             Boolean bool = this.I0000Il00O;
/* 17 */            int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
/* 18 */            String str = this.I0000O;
/* 40 */            return ((str == null ? 17 : str.hashCode()) * 137) + this.I00000oOI.hashCode() + (i * 29);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("source=");
/* 14 */            sb.append(l1ioIO011Oo.I00000oIO(this.I00000oIO));
/* 23 */            for (l1iioiool l1iioioolVar : l1iOili.DMA.I00iOIl) {
/* 29 */                sb.append(",");
/* 34 */                sb.append(l1iioioolVar.I00iOIl);
/* 39 */                sb.append("=");
/* 48 */                l1iIoO01 l1iioo01 = (l1iIoO01) this.I0000oI00.get(l1iioioolVar);
/* 52 */                if (l1iioo01 == null) {
/* 54 */                    sb.append("uninitialized");
                        } else {
/* 58 */                    int iOrdinal = l1iioo01.ordinal();
/* 62 */                    if (iOrdinal == 0) {
/* 92 */                        sb.append("uninitialized");
                            } else if (iOrdinal == 1) {
/* 88 */                        sb.append("eu_consent_policy");
                            } else if (iOrdinal == 2) {
/* 82 */                        sb.append("denied");
                            } else if (iOrdinal == 3) {
/* 76 */                        sb.append("granted");
                            }
                        }
                    }
/* 98 */            Boolean bool = this.I0000Il00O;
/* 100 */           if (bool != null) {
/* 104 */               sb.append(",isDmaRegion=");
/* 107 */               sb.append(bool);
                    }
/* 110 */           String str = this.I0000O;
/* 112 */           if (str != null) {
/* 116 */               sb.append(",cpsDisplayStr=");
/* 119 */               sb.append(str);
                    }
/* 122 */           return sb.toString();
                }

/* 46 */        public iOoOIi0i(EnumMap enumMap, int i, Boolean bool, String str) {
                    EnumMap enumMap2 = new EnumMap(l1iioiool.class);
                    this.I0000oI00 = enumMap2;
/* 48 */            enumMap2.putAll(enumMap);
                    this.I00000oIO = i;
/* 49 */            this.I00000oOI = I0000O();
                    this.I0000Il00O = bool;
                    this.I0000O = str;
                }
            }
