            package com.google.ai.edge.gallery.data;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.OiliO0I;
            
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/google/ai/edge/gallery/data/ModelAllowlist;", "", "models", "", "Lcom/google/ai/edge/gallery/data/AllowedModel;", "aicoreRequirements", "Lcom/google/ai/edge/gallery/data/DeviceRequirements;", "<init>", "(Ljava/util/List;Lcom/google/ai/edge/gallery/data/DeviceRequirements;)V", "getModels", "()Ljava/util/List;", "getAicoreRequirements", "()Lcom/google/ai/edge/gallery/data/DeviceRequirements;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 8 */     public final class ModelAllowlist {
                public static final int $stable = 8;

                @OiliO0I("aicoreRequirements")
                private final DeviceRequirements aicoreRequirements;
                private final List<AllowedModel> models;

                public ModelAllowlist(List list, DeviceRequirements deviceRequirements, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 6 */             this(list, (i & 2) != 0 ? null : deviceRequirements);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static ModelAllowlist copy$default(ModelAllowlist modelAllowlist, List list, DeviceRequirements deviceRequirements, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 list = modelAllowlist.models;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                deviceRequirements = modelAllowlist.aicoreRequirements;
                    }
/* 13 */            return modelAllowlist.copy(list, deviceRequirements);
                }

                public final List<AllowedModel> component1() {
/* 1 */             return this.models;
                }

                public final DeviceRequirements getAicoreRequirements() {
/* 1 */             return this.aicoreRequirements;
                }

                public final ModelAllowlist copy(List<AllowedModel> models, DeviceRequirements aicoreRequirements) {
/* 3 */             return new ModelAllowlist(models, aicoreRequirements);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof ModelAllowlist)) {
/* 7 */                 return false;
                    }
/* 11 */            ModelAllowlist modelAllowlist = (ModelAllowlist) other;
                    return O0000Ioio00.I0000O(this.models, modelAllowlist.models) && O0000Ioio00.I0000O(this.aicoreRequirements, modelAllowlist.aicoreRequirements);
                }

                public final DeviceRequirements getAicoreRequirements() {
/* 1 */             return this.aicoreRequirements;
                }

                public final List<AllowedModel> getModels() {
/* 1 */             return this.models;
                }

                public int hashCode() {
/* 7 */             int iHashCode = this.models.hashCode() * 31;
/* 9 */             DeviceRequirements deviceRequirements = this.aicoreRequirements;
/* 19 */            return iHashCode + (deviceRequirements == null ? 0 : deviceRequirements.hashCode());
                }

                public String toString() {
/* 28 */            return "ModelAllowlist(models=" + this.models + ", aicoreRequirements=" + this.aicoreRequirements + ")";
                }

/* 9 */         public ModelAllowlist(List<AllowedModel> list, DeviceRequirements deviceRequirements) {
/* 11 */            this.models = list;
/* 12 */            this.aicoreRequirements = deviceRequirements;
                }
            }
