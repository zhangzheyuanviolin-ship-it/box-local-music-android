            package com.google.ai.edge.gallery.data;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.OiliO0I;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/google/ai/edge/gallery/data/NamedDeviceGroup;", "", "groupName", "", "description", "deviceModels", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getGroupName", "()Ljava/lang/String;", "getDescription", "getDeviceModels", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 9 */     public final class NamedDeviceGroup {
                public static final int $stable = 8;

                @OiliO0I("description")
                private final String description;

                @OiliO0I("deviceModels")
                private final List<String> deviceModels;

                @OiliO0I("groupName")
                private final String groupName;

                public NamedDeviceGroup(String str, String str2, List<String> list) {
/* 4 */             this.groupName = str;
/* 6 */             this.description = str2;
/* 8 */             this.deviceModels = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static NamedDeviceGroup copy$default(NamedDeviceGroup namedDeviceGroup, String str, String str2, List list, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = namedDeviceGroup.groupName;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = namedDeviceGroup.description;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                list = namedDeviceGroup.deviceModels;
                    }
/* 19 */            return namedDeviceGroup.copy(str, str2, list);
                }

                public final String getGroupName() {
/* 1 */             return this.groupName;
                }

                public final String getDescription() {
/* 1 */             return this.description;
                }

                public final List<String> component3() {
/* 1 */             return this.deviceModels;
                }

                public final NamedDeviceGroup copy(String groupName, String description, List<String> deviceModels) {
/* 3 */             return new NamedDeviceGroup(groupName, description, deviceModels);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof NamedDeviceGroup)) {
/* 7 */                 return false;
                    }
/* 11 */            NamedDeviceGroup namedDeviceGroup = (NamedDeviceGroup) other;
                    return O0000Ioio00.I0000O(this.groupName, namedDeviceGroup.groupName) && O0000Ioio00.I0000O(this.description, namedDeviceGroup.description) && O0000Ioio00.I0000O(this.deviceModels, namedDeviceGroup.deviceModels);
                }

                public final String getDescription() {
/* 1 */             return this.description;
                }

                public final List<String> getDeviceModels() {
/* 1 */             return this.deviceModels;
                }

                public final String getGroupName() {
/* 1 */             return this.groupName;
                }

                public int hashCode() {
/* 7 */             int iHashCode = this.groupName.hashCode() * 31;
/* 9 */             String str = this.description;
/* 28 */            return this.deviceModels.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public String toString() {
/* 1 */             String str = this.groupName;
/* 3 */             String str2 = this.description;
/* 5 */             List<String> list = this.deviceModels;
/* 13 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("NamedDeviceGroup(groupName=", str, ", description=", str2, ", deviceModels=");
/* 17 */            sbI00111O.append(list);
/* 22 */            sbI00111O.append(")");
/* 25 */            return sbI00111O.toString();
                }

/* 10 */        public NamedDeviceGroup(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 11 */            this(str, (i & 2) != 0 ? null : str2, list);
                }
            }
