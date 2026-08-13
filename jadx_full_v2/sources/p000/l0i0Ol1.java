            package p000;

            import java.util.Collection;
            import java.util.Locale;
            import java.util.Map;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class l0i0Ol1 {
                public String I00000oIO;
                public String I00000oOI;
                public Boolean I0000Il00O;
                public lOI1lll1l10 I0000O;
                public l0i0Ol1 I0000oI00;
                public Long I0001Ioi1lo;
                public Long I000II;
                public lOI1lll1l10 I000O01llI0;
                public lOliil I000OOo1O;
                public Double I000OiO;
                public Double I000iOII;
                public int I000l1;

                public final JSONObject I00000oIO() throws JSONException {
                    String lowerCase;
                    String str;
/* 3 */             JSONObject jSONObject = new JSONObject();
/* 6 */             int i = this.I000l1;
/* 8 */             if (i != 0) {
                        switch (i - 1) {
                            case 1:
/* 63 */                        lowerCase = "string";
                                break;
                            case 2:
/* 60 */                        lowerCase = "number";
                                break;
                            case 3:
/* 57 */                        lowerCase = "integer";
                                break;
                            case 4:
/* 54 */                        lowerCase = "boolean";
                                break;
                            case 5:
/* 51 */                        lowerCase = "array";
                                break;
                            case 6:
/* 48 */                        lowerCase = "object";
                                break;
                            default:
                                switch (i) {
                                    case 1:
/* 39 */                                str = "UNSPECIFIED";
                                        break;
                                    case 2:
/* 36 */                                str = "STRING";
                                        break;
                                    case 3:
/* 33 */                                str = "NUMBER";
                                        break;
                                    case 4:
/* 30 */                                str = "INTEGER";
                                        break;
                                    case 5:
/* 27 */                                str = "BOOLEAN";
                                        break;
                                    case 6:
/* 24 */                                str = "ARRAY";
                                        break;
                                    case 7:
/* 21 */                                str = "OBJECT";
                                        break;
                                    default:
/* 18 */                                str = "null";
                                        break;
                                }
/* 43 */                        lowerCase = str.toLowerCase(Locale.US);
                                break;
                        }
/* 67 */                jSONObject.put("type", lowerCase);
                    }
/* 74 */            jSONObject.putOpt("description", this.I00000oOI);
/* 81 */            jSONObject.putOpt("format", this.I00000oIO);
/* 88 */            jSONObject.putOpt("nullable", this.I0000Il00O);
/* 94 */            jSONObject.putOpt("title", null);
/* 97 */            lOI1lll1l10 loi1lll1l10 = this.I0000O;
/* 99 */            if (loi1lll1l10 != null && !loi1lll1l10.isEmpty()) {
/* 114 */               jSONObject.put("enum", new JSONArray((Collection) loi1lll1l10));
                    }
/* 121 */           jSONObject.putOpt("maxItems", this.I0001Ioi1lo);
/* 128 */           jSONObject.putOpt("minItems", this.I000II);
/* 131 */           l0i0Ol1 l0i0ol1 = this.I0000oI00;
/* 133 */           if (l0i0ol1 != null) {
/* 141 */               jSONObject.put("items", l0i0ol1.I00000oIO());
                    }
/* 144 */           lOI1lll1l10 loi1lll1l102 = this.I000O01llI0;
/* 146 */           if (loi1lll1l102 != null && !loi1lll1l102.isEmpty()) {
/* 161 */               jSONObject.put("required", new JSONArray((Collection) loi1lll1l102));
                    }
/* 166 */           jSONObject.putOpt("maxProperties", null);
/* 171 */           jSONObject.putOpt("minProperties", null);
/* 174 */           lOliil loliil = this.I000OOo1O;
/* 176 */           if (loliil != null) {
/* 180 */               JSONObject jSONObject2 = new JSONObject();
/* 187 */               OoiOOoOlo ooiOOoOloI000iOII = loliil.entrySet().I000iOII();
/* 195 */               while (ooiOOoOloI000iOII.hasNext()) {
/* 201 */                   Map.Entry entry = (Map.Entry) ooiOOoOloI000iOII.next();
/* 219 */                   jSONObject2.put((String) entry.getKey(), ((l0i0Ol1) entry.getValue()).I00000oIO());
                        }
/* 225 */               jSONObject.put("properties", jSONObject2);
                    }
/* 232 */           jSONObject.putOpt("maximum", this.I000iOII);
/* 239 */           jSONObject.putOpt("minimum", this.I000OiO);
/* 244 */           jSONObject.putOpt("maxLength", null);
/* 249 */           jSONObject.putOpt("minLength", null);
/* 254 */           jSONObject.putOpt("pattern", null);
/* 257 */           return jSONObject;
                }

                public final iiooOolI1 I00000oOI() {
                    int i;
/* 1 */             loliio1il loliio1ilVarI00000oOI = iiooOolI1.I00000oOI();
/* 5 */             int i2 = this.I000l1;
/* 8 */             if (i2 != 0) {
                        int i3 = i2 - 1;
/* 12 */                if (i3 != 0) {
/* 14 */                    i = 1;
/* 15 */                    if (i3 != 1) {
/* 17 */                        i = 2;
/* 18 */                        if (i3 != 2) {
/* 20 */                            i = 3;
/* 21 */                            if (i3 != 3) {
/* 23 */                                if (i3 != 4) {
/* 25 */                                    i = 5;
/* 26 */                                    if (i3 != 5) {
/* 28 */                                        i = 6;
                                            }
                                        } else {
/* 30 */                                    i = 4;
                                        }
                                    }
                                }
                            }
                        } else {
/* 32 */                    i = 0;
                        }
/* 33 */                loliio1ilVarI00000oOI.I00000oIO(i);
                    }
/* 36 */            String str = this.I00000oIO;
/* 38 */            if (str != null) {
/* 40 */                loliio1ilVarI00000oOI.I00000oOI = str;
                    }
/* 42 */            String str2 = this.I00000oOI;
/* 44 */            if (str2 != null) {
/* 46 */                loliio1ilVarI00000oOI.I0000Il00O = str2;
                    }
/* 48 */            Boolean bool = this.I0000Il00O;
/* 50 */            if (bool != null) {
/* 52 */                loliio1ilVarI00000oOI.I0000O = bool;
                    }
/* 54 */            lOI1lll1l10 loi1lll1l10 = this.I0000O;
/* 56 */            if (loi1lll1l10 != null) {
/* 58 */                loliio1ilVarI00000oOI.I0000oI00 = loi1lll1l10;
                    }
/* 60 */            l0i0Ol1 l0i0ol1 = this.I0000oI00;
/* 62 */            if (l0i0ol1 != null) {
/* 68 */                loliio1ilVarI00000oOI.I0001Ioi1lo = l0i0ol1.I00000oOI();
                    }
/* 70 */            Long l = this.I0001Ioi1lo;
/* 72 */            if (l != null) {
/* 74 */                loliio1ilVarI00000oOI.I000II = l;
                    }
/* 76 */            Long l2 = this.I000II;
/* 78 */            if (l2 != null) {
/* 80 */                loliio1ilVarI00000oOI.I000O01llI0 = l2;
                    }
/* 82 */            lOI1lll1l10 loi1lll1l102 = this.I000O01llI0;
/* 84 */            if (loi1lll1l102 != null) {
/* 86 */                loliio1ilVarI00000oOI.I000OOo1O = loi1lll1l102;
                    }
/* 88 */            lOliil loliil = this.I000OOo1O;
/* 90 */            if (loliil != null) {
/* 96 */                I00Ol00 i00Ol00 = new I00Ol00(4, 22);
/* 103 */               OoiOOoOlo ooiOOoOloI000iOII = loliil.entrySet().I000iOII();
/* 111 */               while (ooiOOoOloI000iOII.hasNext()) {
/* 117 */                   Map.Entry entry = (Map.Entry) ooiOOoOloI000iOII.next();
/* 135 */                   i00Ol00.I001iOo1i0O((String) entry.getKey(), ((l0i0Ol1) entry.getValue()).I00000oOI());
                        }
/* 143 */               loliio1ilVarI00000oOI.I000oI1ioi = i00Ol00.I001lllioOl();
                    }
/* 145 */           Double d = this.I000OiO;
/* 147 */           if (d != null) {
/* 149 */               loliio1ilVarI00000oOI.I000OiO = d;
                    }
/* 151 */           Double d2 = this.I000iOII;
/* 153 */           if (d2 != null) {
/* 155 */               loliio1ilVarI00000oOI.I000iOII = d2;
                    }
/* 157 */           return loliio1ilVarI00000oOI.I00000oOI();
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 188 */               return true;
                    }
/* 7 */             if (!(obj instanceof l0i0Ol1)) {
/* 190 */               return false;
                    }
/* 9 */             l0i0Ol1 l0i0ol1 = (l0i0Ol1) obj;
/* 11 */            int i = this.I000l1;
/* 13 */            int i2 = l0i0ol1.I000l1;
/* 15 */            if (i == 0) {
/* 17 */                if (i2 != 0) {
/* 190 */                   return false;
                        }
                    } else if (i != i2) {
/* 190 */               return false;
                    }
/* 22 */            String str = this.I00000oIO;
/* 24 */            String str2 = l0i0ol1.I00000oIO;
/* 26 */            if (str == null) {
/* 28 */                if (str2 != null) {
/* 190 */                   return false;
                        }
                    } else if (!str.equals(str2)) {
/* 190 */               return false;
                    }
/* 37 */            String str3 = this.I00000oOI;
/* 39 */            String str4 = l0i0ol1.I00000oOI;
/* 41 */            if (str3 == null) {
/* 43 */                if (str4 != null) {
/* 190 */                   return false;
                        }
                    } else if (!str3.equals(str4)) {
/* 190 */               return false;
                    }
/* 52 */            Boolean bool = this.I0000Il00O;
/* 54 */            Boolean bool2 = l0i0ol1.I0000Il00O;
/* 56 */            if (bool == null) {
/* 58 */                if (bool2 != null) {
/* 190 */                   return false;
                        }
                    } else if (!bool.equals(bool2)) {
/* 190 */               return false;
                    }
/* 67 */            lOI1lll1l10 loi1lll1l10 = this.I0000O;
/* 69 */            lOI1lll1l10 loi1lll1l102 = l0i0ol1.I0000O;
/* 71 */            if (loi1lll1l10 == null) {
/* 73 */                if (loi1lll1l102 != null) {
/* 190 */                   return false;
                        }
                    } else if (!loi1lll1l10.equals(loi1lll1l102)) {
/* 190 */               return false;
                    }
/* 82 */            l0i0Ol1 l0i0ol12 = this.I0000oI00;
/* 84 */            l0i0Ol1 l0i0ol13 = l0i0ol1.I0000oI00;
/* 86 */            if (l0i0ol12 == null) {
/* 88 */                if (l0i0ol13 != null) {
/* 190 */                   return false;
                        }
                    } else if (!l0i0ol12.equals(l0i0ol13)) {
/* 190 */               return false;
                    }
/* 97 */            Long l = this.I0001Ioi1lo;
/* 99 */            Long l2 = l0i0ol1.I0001Ioi1lo;
/* 101 */           if (l == null) {
/* 103 */               if (l2 != null) {
/* 190 */                   return false;
                        }
                    } else if (!l.equals(l2)) {
/* 190 */               return false;
                    }
/* 112 */           Long l3 = this.I000II;
/* 114 */           Long l4 = l0i0ol1.I000II;
/* 116 */           if (l3 == null) {
/* 118 */               if (l4 != null) {
/* 190 */                   return false;
                        }
                    } else if (!l3.equals(l4)) {
/* 190 */               return false;
                    }
/* 127 */           lOI1lll1l10 loi1lll1l103 = this.I000O01llI0;
/* 129 */           lOI1lll1l10 loi1lll1l104 = l0i0ol1.I000O01llI0;
/* 131 */           if (loi1lll1l103 == null) {
/* 133 */               if (loi1lll1l104 != null) {
/* 190 */                   return false;
                        }
                    } else if (!loi1lll1l103.equals(loi1lll1l104)) {
/* 190 */               return false;
                    }
/* 142 */           lOliil loliil = this.I000OOo1O;
/* 144 */           lOliil loliil2 = l0i0ol1.I000OOo1O;
/* 146 */           if (loliil == null) {
/* 148 */               if (loliil2 != null) {
/* 190 */                   return false;
                        }
                    } else if (!loliil.equals(loliil2)) {
/* 190 */               return false;
                    }
/* 157 */           Double d = this.I000OiO;
/* 159 */           Double d2 = l0i0ol1.I000OiO;
/* 161 */           if (d == null) {
/* 163 */               if (d2 != null) {
/* 190 */                   return false;
                        }
                    } else if (!d.equals(d2)) {
/* 190 */               return false;
                    }
/* 172 */           Double d3 = this.I000iOII;
/* 174 */           Double d4 = l0i0ol1.I000iOII;
                    return d3 == null ? d4 == null : d3.equals(d4);
                }

                public final int hashCode() {
/* 1 */             int i = this.I000l1;
/* 4 */             if (i == 0) {
/* 6 */                 i = 0;
                    }
/* 7 */             String str = this.I00000oIO;
/* 23 */            int iHashCode = (((i ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
/* 24 */            String str2 = this.I00000oOI;
/* 35 */            int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
/* 36 */            Boolean bool = this.I0000Il00O;
/* 47 */            int iHashCode3 = (iHashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
/* 48 */            lOI1lll1l10 loi1lll1l10 = this.I0000O;
/* 59 */            int iHashCode4 = (iHashCode3 ^ (loi1lll1l10 == null ? 0 : loi1lll1l10.hashCode())) * 1000003;
/* 60 */            l0i0Ol1 l0i0ol1 = this.I0000oI00;
/* 71 */            int iHashCode5 = (iHashCode4 ^ (l0i0ol1 == null ? 0 : l0i0ol1.hashCode())) * 1000003;
/* 72 */            Long l = this.I0001Ioi1lo;
/* 83 */            int iHashCode6 = (iHashCode5 ^ (l == null ? 0 : l.hashCode())) * 1000003;
/* 84 */            Long l2 = this.I000II;
/* 95 */            int iHashCode7 = (iHashCode6 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
/* 96 */            lOI1lll1l10 loi1lll1l102 = this.I000O01llI0;
/* 107 */           int iHashCode8 = (iHashCode7 ^ (loi1lll1l102 == null ? 0 : loi1lll1l102.hashCode())) * 1000003;
/* 108 */           lOliil loliil = this.I000OOo1O;
/* 118 */           int iHashCode9 = iHashCode8 ^ (loliil == null ? 0 : loliil.hashCode());
/* 119 */           Double d = this.I000OiO;
/* 134 */           int iHashCode10 = ((iHashCode9 * 583896283) ^ (d == null ? 0 : d.hashCode())) * 1000003;
/* 135 */           Double d2 = this.I000iOII;
/* 149 */           return (iHashCode10 ^ (d2 != null ? d2.hashCode() : 0)) * 272515929;
                }

                public final String toString() {
                    String str;
/* 3 */             lOliil loliil = this.I000OOo1O;
/* 5 */             lOI1lll1l10 loi1lll1l10 = this.I000O01llI0;
/* 7 */             l0i0Ol1 l0i0ol1 = this.I0000oI00;
/* 11 */            String strValueOf = String.valueOf(this.I0000O);
/* 15 */            String strValueOf2 = String.valueOf(l0i0ol1);
/* 19 */            String strValueOf3 = String.valueOf(loi1lll1l10);
/* 23 */            String strValueOf4 = String.valueOf(loliil);
/* 27 */            String str2 = this.I00000oIO;
/* 33 */            int length = String.valueOf(str2).length();
/* 37 */            String str3 = this.I00000oOI;
/* 43 */            int length2 = String.valueOf(str3).length();
/* 47 */            Boolean bool = this.I0000Il00O;
/* 53 */            int length3 = String.valueOf(bool).length();
/* 57 */            int length4 = strValueOf.length();
/* 61 */            int length5 = strValueOf2.length();
/* 65 */            Long l = this.I0001Ioi1lo;
/* 71 */            int length6 = String.valueOf(l).length();
/* 75 */            Long l2 = this.I000II;
/* 81 */            int length7 = String.valueOf(l2).length();
/* 85 */            int length8 = strValueOf3.length();
/* 89 */            int length9 = strValueOf4.length();
/* 95 */            Double d = this.I000OiO;
/* 101 */           int length10 = String.valueOf(d).length();
/* 107 */           Double d2 = this.I000iOII;
/* 113 */           int length11 = String.valueOf(d2).length();
                    switch (this.I000l1) {
                        case 1:
/* 149 */                   str = "UNSPECIFIED";
                            break;
                        case 2:
/* 146 */                   str = "STRING";
                            break;
                        case 3:
/* 143 */                   str = "NUMBER";
                            break;
                        case 4:
/* 140 */                   str = "INTEGER";
                            break;
                        case 5:
/* 137 */                   str = "BOOLEAN";
                            break;
                        case 6:
/* 134 */                   str = "ARRAY";
                            break;
                        case 7:
/* 131 */                   str = "OBJECT";
                            break;
                        default:
/* 126 */                   str = "null";
                            break;
                    }
/* 128 */           String str4 = str;
/* 202 */           StringBuilder sb = new StringBuilder(str4.length() + 32 + length + 14 + length2 + 11 + length3 + 13 + length4 + 8 + length5 + 11 + length6 + 11 + length7 + 11 + length8 + 13 + length9 + 50 + length10 + 10 + length11 + 94);
/* 211 */           IIl001iO0Io.I001lIiIIo1O(sb, "LlmResponseSchema{type=", str4, ", format=", str2);
/* 216 */           sb.append(", description=");
/* 219 */           sb.append(str3);
/* 224 */           sb.append(", nullable=");
/* 227 */           sb.append(bool);
/* 234 */           IIl001iO0Io.I001lIiIIo1O(sb, ", enumValues=", strValueOf, ", items=", strValueOf2);
/* 239 */           sb.append(", maxItems=");
/* 242 */           sb.append(l);
/* 247 */           sb.append(", minItems=");
/* 250 */           sb.append(l2);
/* 257 */           IIl001iO0Io.I001lIiIIo1O(sb, ", required=", strValueOf3, ", properties=", strValueOf4);
/* 262 */           sb.append(", minProperties=null, maxProperties=null, minimum=");
/* 265 */           sb.append(d);
/* 270 */           sb.append(", maximum=");
/* 273 */           sb.append(d2);
/* 278 */           sb.append(", minLength=null, maxLength=null, pattern=null, anyOf=null, propertyOrdering=null, title=null}");
/* 281 */           return sb.toString();
                }
            }
