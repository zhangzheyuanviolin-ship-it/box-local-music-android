            package com.google.mlkit.genai.schema.guided;

            import java.util.Arrays;
            import java.util.List;
            import kotlin.Metadata;
            import p000.O0000Ioio00;
            import p000.O0IOli0o0;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0017B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0004HÖ\u0081\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/google/mlkit/genai/schema/guided/GenerableDetail;", "T", "", "description", "", "guideDetails", "", "Lcom/google/mlkit/genai/schema/guided/GenerableDetail$GuideDetail;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getGuideDetails", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "GuideDetail", "java.com.google.android.libraries.mlkit.granules.genai.schema_mlkit_genai_schema"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class GenerableDetail<T> {

                private final String description;

                private final List guideDetails;

                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0016\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u009a\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0016R\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b7\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b:\u0010 R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010#R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b\u0011\u0010\u001aR\u001d\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b=\u0010\u0018¨\u0006>"}, d2 = {"Lcom/google/mlkit/genai/schema/guided/GenerableDetail$GuideDetail;", "", "", "name", "LO0IOli0o0;", "type", "", "nullable", "description", "", "maxItems", "minItems", "", "maximum", "minimum", "", "enumValues", "isList", "listItemType", "<init>", "(Ljava/lang/String;LO0IOli0o0;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;[Ljava/lang/String;ZLO0IOli0o0;)V", "component1", "()Ljava/lang/String;", "component2", "()LO0IOli0o0;", "component3", "()Z", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "()Ljava/lang/Double;", "component8", "component9", "()[Ljava/lang/String;", "component10", "component11", "copy", "(Ljava/lang/String;LO0IOli0o0;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;[Ljava/lang/String;ZLO0IOli0o0;)Lcom/google/mlkit/genai/schema/guided/GenerableDetail$GuideDetail;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "LO0IOli0o0;", "getType", "Z", "getNullable", "getDescription", "Ljava/lang/Integer;", "getMaxItems", "getMinItems", "Ljava/lang/Double;", "getMaximum", "getMinimum", "[Ljava/lang/String;", "getEnumValues", "getListItemType", "java.com.google.android.libraries.mlkit.granules.genai.schema_mlkit_genai_schema"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class GuideDetail {

                    private final String name;

                    private final O0IOli0o0 type;

                    private final boolean nullable;

                    private final String description;

                    private final Integer maxItems;

                    private final Integer minItems;

                    private final Double maximum;

                    private final Double minimum;

                    private final String[] enumValues;

                    private final boolean isList;

                    private final O0IOli0o0 listItemType;

                    public GuideDetail(String str, O0IOli0o0 o0IOli0o0, boolean z, String str2, Integer num, Integer num2, Double d, Double d2, String[] strArr, boolean z2, O0IOli0o0 o0IOli0o02) {
/* 4 */                 this.name = str;
/* 6 */                 this.type = o0IOli0o0;
/* 8 */                 this.nullable = z;
/* 10 */                this.description = str2;
/* 12 */                this.maxItems = num;
/* 14 */                this.minItems = num2;
/* 16 */                this.maximum = d;
/* 18 */                this.minimum = d2;
/* 20 */                this.enumValues = strArr;
/* 22 */                this.isList = z2;
/* 24 */                this.listItemType = o0IOli0o02;
                    }

                    public final String getName() {
/* 1 */                 return this.name;
                    }

                    public final boolean getIsList() {
/* 1 */                 return this.isList;
                    }

                    public final O0IOli0o0 getListItemType() {
/* 1 */                 return this.listItemType;
                    }

                    public final O0IOli0o0 getType() {
/* 1 */                 return this.type;
                    }

                    public final boolean getNullable() {
/* 1 */                 return this.nullable;
                    }

                    public final String getDescription() {
/* 1 */                 return this.description;
                    }

                    public final Integer getMaxItems() {
/* 1 */                 return this.maxItems;
                    }

                    public final Integer getMinItems() {
/* 1 */                 return this.minItems;
                    }

                    public final Double getMaximum() {
/* 1 */                 return this.maximum;
                    }

                    public final Double getMinimum() {
/* 1 */                 return this.minimum;
                    }

                    public final String[] getEnumValues() {
/* 1 */                 return this.enumValues;
                    }

                    public final GuideDetail copy(String name, O0IOli0o0 type, boolean nullable, String description, Integer maxItems, Integer minItems, Double maximum, Double minimum, String[] enumValues, boolean isList, O0IOli0o0 listItemType) {
/* 3 */                 return new GuideDetail(name, type, nullable, description, maxItems, minItems, maximum, minimum, enumValues, isList, listItemType);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(other instanceof GuideDetail)) {
/* 7 */                     return false;
                        }
/* 11 */                GuideDetail guideDetail = (GuideDetail) other;
                        return O0000Ioio00.I0000O(this.name, guideDetail.name) && O0000Ioio00.I0000O(this.type, guideDetail.type) && this.nullable == guideDetail.nullable && O0000Ioio00.I0000O(this.description, guideDetail.description) && O0000Ioio00.I0000O(this.maxItems, guideDetail.maxItems) && O0000Ioio00.I0000O(this.minItems, guideDetail.minItems) && O0000Ioio00.I0000O(this.maximum, guideDetail.maximum) && O0000Ioio00.I0000O(this.minimum, guideDetail.minimum) && O0000Ioio00.I0000O(this.enumValues, guideDetail.enumValues) && this.isList == guideDetail.isList && O0000Ioio00.I0000O(this.listItemType, guideDetail.listItemType);
                    }

                    public final String getDescription() {
/* 1 */                 return this.description;
                    }

                    public final String[] getEnumValues() {
/* 1 */                 return this.enumValues;
                    }

                    public final O0IOli0o0 getListItemType() {
/* 1 */                 return this.listItemType;
                    }

                    public final Integer getMaxItems() {
/* 1 */                 return this.maxItems;
                    }

                    public final Double getMaximum() {
/* 1 */                 return this.maximum;
                    }

                    public final Integer getMinItems() {
/* 1 */                 return this.minItems;
                    }

                    public final Double getMinimum() {
/* 1 */                 return this.minimum;
                    }

                    public final String getName() {
/* 1 */                 return this.name;
                    }

                    public final boolean getNullable() {
/* 1 */                 return this.nullable;
                    }

                    public final O0IOli0o0 getType() {
/* 1 */                 return this.type;
                    }

                    public int hashCode() {
/* 24 */                int iHashCode = Boolean.hashCode(this.nullable) + ((this.type.hashCode() + (this.name.hashCode() * 31)) * 31);
/* 25 */                String str = this.description;
/* 38 */                int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
/* 39 */                Integer num = this.maxItems;
/* 50 */                int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
/* 51 */                Integer num2 = this.minItems;
/* 62 */                int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
/* 63 */                Double d = this.maximum;
/* 74 */                int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
/* 75 */                Double d2 = this.minimum;
/* 86 */                int iHashCode6 = (iHashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
/* 87 */                String[] strArr = this.enumValues;
/* 101 */               int iI000OOo1O = Oi010OO0.I000OOo1O((iHashCode6 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31, 31, this.isList);
/* 105 */               O0IOli0o0 o0IOli0o0 = this.listItemType;
/* 114 */               return iI000OOo1O + (o0IOli0o0 != null ? o0IOli0o0.hashCode() : 0);
                    }

                    public final boolean isList() {
/* 1 */                 return this.isList;
                    }

                    public String toString() {
/* 5 */                 String string = Arrays.toString(this.enumValues);
/* 9 */                 String str = this.name;
/* 15 */                int length = String.valueOf(str).length();
/* 19 */                O0IOli0o0 o0IOli0o0 = this.type;
/* 25 */                int length2 = String.valueOf(o0IOli0o0).length();
/* 29 */                boolean z = this.nullable;
/* 35 */                int length3 = String.valueOf(z).length();
/* 39 */                String str2 = this.description;
/* 45 */                int length4 = String.valueOf(str2).length();
/* 49 */                Integer num = this.maxItems;
/* 55 */                int length5 = String.valueOf(num).length();
/* 59 */                Integer num2 = this.minItems;
/* 65 */                int length6 = String.valueOf(num2).length();
/* 69 */                Double d = this.maximum;
/* 75 */                int length7 = String.valueOf(d).length();
/* 81 */                Double d2 = this.minimum;
/* 87 */                int length8 = String.valueOf(d2).length();
/* 95 */                int length9 = String.valueOf(string).length();
/* 101 */               boolean z2 = this.isList;
/* 107 */               int length10 = String.valueOf(z2).length();
/* 111 */               O0IOli0o0 o0IOli0o02 = this.listItemType;
/* 165 */               StringBuilder sb = new StringBuilder(length + 24 + length2 + 11 + length3 + 14 + length4 + 11 + length5 + 11 + length6 + 10 + length7 + 10 + length8 + 13 + length9 + 9 + length10 + 15 + String.valueOf(o0IOli0o02).length() + 1);
/* 170 */               sb.append("GuideDetail(name=");
/* 173 */               sb.append(str);
/* 178 */               sb.append(", type=");
/* 181 */               sb.append(o0IOli0o0);
/* 186 */               sb.append(", nullable=");
/* 189 */               sb.append(z);
/* 194 */               sb.append(", description=");
/* 197 */               sb.append(str2);
/* 202 */               sb.append(", maxItems=");
/* 205 */               sb.append(num);
/* 210 */               sb.append(", minItems=");
/* 213 */               sb.append(num2);
/* 218 */               sb.append(", maximum=");
/* 221 */               sb.append(d);
/* 226 */               sb.append(", minimum=");
/* 229 */               sb.append(d2);
/* 234 */               sb.append(", enumValues=");
/* 237 */               sb.append(string);
/* 242 */               sb.append(", isList=");
/* 245 */               sb.append(z2);
/* 250 */               sb.append(", listItemType=");
/* 253 */               sb.append(o0IOli0o02);
/* 258 */               sb.append(")");
/* 261 */               return sb.toString();
                    }
                }

                public GenerableDetail(String str, List<GuideDetail> list) {
/* 4 */             this.description = str;
/* 6 */             this.guideDetails = list;
                }

                public final String getDescription() {
/* 1 */             return this.description;
                }

                public final List<GuideDetail> component2() {
/* 1 */             return this.guideDetails;
                }

                public final GenerableDetail<T> copy(String description, List<GuideDetail> guideDetails) {
/* 3 */             return new GenerableDetail<>(description, guideDetails);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof GenerableDetail)) {
/* 7 */                 return false;
                    }
/* 11 */            GenerableDetail generableDetail = (GenerableDetail) other;
                    return O0000Ioio00.I0000O(this.description, generableDetail.description) && O0000Ioio00.I0000O(this.guideDetails, generableDetail.guideDetails);
                }

                public final String getDescription() {
/* 1 */             return this.description;
                }

                public final List<GuideDetail> getGuideDetails() {
/* 1 */             return this.guideDetails;
                }

                public int hashCode() {
/* 15 */            return this.guideDetails.hashCode() + (this.description.hashCode() * 31);
                }

                public String toString() {
/* 1 */             String str = this.description;
/* 7 */             int length = String.valueOf(str).length();
/* 11 */            List list = this.guideDetails;
/* 28 */            StringBuilder sb = new StringBuilder(length + 43 + String.valueOf(list).length() + 1);
/* 33 */            sb.append("GenerableDetail(description=");
/* 36 */            sb.append(str);
/* 41 */            sb.append(", guideDetails=");
/* 44 */            sb.append(list);
/* 49 */            sb.append(")");
/* 52 */            return sb.toString();
                }
            }
