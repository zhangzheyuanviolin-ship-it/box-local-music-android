            package com.google.ai.edge.gallery.data;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.OiliO0I;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/google/ai/edge/gallery/data/DeviceRequirements;", "", "allowedDeviceGroups", "", "Lcom/google/ai/edge/gallery/data/NamedDeviceGroup;", "<init>", "(Ljava/util/List;)V", "getAllowedDeviceGroups", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 8 */     public final class DeviceRequirements {
                public static final int $stable = 8;

                @OiliO0I("allowedDeviceGroups")
                private final List<NamedDeviceGroup> allowedDeviceGroups;

                public DeviceRequirements(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 6 */             this((i & 1) != 0 ? null : list);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static DeviceRequirements copy$default(DeviceRequirements deviceRequirements, List list, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 list = deviceRequirements.allowedDeviceGroups;
                    }
/* 7 */             return deviceRequirements.copy(list);
                }

                public final List<NamedDeviceGroup> component1() {
/* 1 */             return this.allowedDeviceGroups;
                }

                public final DeviceRequirements copy(List<NamedDeviceGroup> allowedDeviceGroups) {
/* 3 */             return new DeviceRequirements(allowedDeviceGroups);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof DeviceRequirements) && O0000Ioio00.I0000O(this.allowedDeviceGroups, ((DeviceRequirements) other).allowedDeviceGroups);
                }

                public final List<NamedDeviceGroup> getAllowedDeviceGroups() {
/* 1 */             return this.allowedDeviceGroups;
                }

                public int hashCode() {
/* 1 */             List<NamedDeviceGroup> list = this.allowedDeviceGroups;
/* 3 */             if (list == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return list.hashCode();
                }

                public String toString() {
/* 18 */            return "DeviceRequirements(allowedDeviceGroups=" + this.allowedDeviceGroups + ")";
                }

/* 9 */         public DeviceRequirements(List<NamedDeviceGroup> list) {
/* 11 */            this.allowedDeviceGroups = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 11 */        public DeviceRequirements() {
/* 12 */            this(null, 1, 0 == true ? 1 : 0);
                }
            }
