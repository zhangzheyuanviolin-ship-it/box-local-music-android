            package com.google.ai.edge.gallery.data;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            import p000.OiliO0I;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/google/ai/edge/gallery/data/AllowedSkill;", "", "name", "", "description", "skillUrl", "attributionLabel", "attributionUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getDescription", "getSkillUrl", "getAttributionLabel", "getAttributionUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 14 */    public final class AllowedSkill {
                public static final int $stable = 0;

                @OiliO0I("attributionLabel")
                private final String attributionLabel;

                @OiliO0I("attributionUrl")
                private final String attributionUrl;
                private final String description;
                private final String name;

                @OiliO0I("skillUrl")
                private final String skillUrl;

                public AllowedSkill(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 12 */            this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
                }

                public static AllowedSkill copy$default(AllowedSkill allowedSkill, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = allowedSkill.name;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = allowedSkill.description;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = allowedSkill.skillUrl;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                str4 = allowedSkill.attributionLabel;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                str5 = allowedSkill.attributionUrl;
                    }
/* 32 */            String str6 = str5;
/* 34 */            String str7 = str3;
/* 37 */            return allowedSkill.copy(str, str2, str7, str4, str6);
                }

                public final String getName() {
/* 1 */             return this.name;
                }

                public final String getDescription() {
/* 1 */             return this.description;
                }

                public final String getSkillUrl() {
/* 1 */             return this.skillUrl;
                }

                public final String getAttributionLabel() {
/* 1 */             return this.attributionLabel;
                }

                public final String getAttributionUrl() {
/* 1 */             return this.attributionUrl;
                }

                public final AllowedSkill copy(String name, String description, String skillUrl, String attributionLabel, String attributionUrl) {
/* 3 */             return new AllowedSkill(name, description, skillUrl, attributionLabel, attributionUrl);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof AllowedSkill)) {
/* 7 */                 return false;
                    }
/* 11 */            AllowedSkill allowedSkill = (AllowedSkill) other;
                    return O0000Ioio00.I0000O(this.name, allowedSkill.name) && O0000Ioio00.I0000O(this.description, allowedSkill.description) && O0000Ioio00.I0000O(this.skillUrl, allowedSkill.skillUrl) && O0000Ioio00.I0000O(this.attributionLabel, allowedSkill.attributionLabel) && O0000Ioio00.I0000O(this.attributionUrl, allowedSkill.attributionUrl);
                }

                public final String getAttributionLabel() {
/* 1 */             return this.attributionLabel;
                }

                public final String getAttributionUrl() {
/* 1 */             return this.attributionUrl;
                }

                public final String getDescription() {
/* 1 */             return this.description;
                }

                public final String getName() {
/* 1 */             return this.name;
                }

                public final String getSkillUrl() {
/* 1 */             return this.skillUrl;
                }

                public int hashCode() {
/* 18 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.name.hashCode() * 31, 31, this.description), 31, this.skillUrl);
/* 22 */            String str = this.attributionLabel;
/* 34 */            int iHashCode = (iI000O01llI0 + (str == null ? 0 : str.hashCode())) * 31;
/* 35 */            String str2 = this.attributionUrl;
/* 44 */            return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
/* 1 */             String str = this.name;
/* 3 */             String str2 = this.description;
/* 5 */             String str3 = this.skillUrl;
/* 7 */             String str4 = this.attributionLabel;
/* 9 */             String str5 = this.attributionUrl;
/* 17 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("AllowedSkill(name=", str, ", description=", str2, ", skillUrl=");
/* 25 */            IIl001iO0Io.I001lIiIIo1O(sbI00111O, str3, ", attributionLabel=", str4, ", attributionUrl=");
/* 30 */            return IIl001iO0Io.I00100l0(sbI00111O, str5, ")");
                }

/* 15 */        public AllowedSkill(String str, String str2, String str3, String str4, String str5) {
/* 17 */            this.name = str;
/* 18 */            this.description = str2;
/* 19 */            this.skillUrl = str3;
/* 20 */            this.attributionLabel = str4;
/* 21 */            this.attributionUrl = str5;
                }
            }
