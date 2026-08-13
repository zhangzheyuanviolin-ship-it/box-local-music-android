            package com.google.ai.edge.gallery.data;

            import java.util.List;
            import kotlin.Metadata;
            import p000.O0000Ioio00;
            import p000.OiliO0I;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/google/ai/edge/gallery/data/SkillAllowlist;", "", "featuredSkills", "", "Lcom/google/ai/edge/gallery/data/AllowedSkill;", "<init>", "(Ljava/util/List;)V", "getFeaturedSkills", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class SkillAllowlist {
                public static final int $stable = 8;

                @OiliO0I("featuredSkills")
                private final List<AllowedSkill> featuredSkills;

                public SkillAllowlist(List<AllowedSkill> list) {
/* 4 */             this.featuredSkills = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static SkillAllowlist copy$default(SkillAllowlist skillAllowlist, List list, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 list = skillAllowlist.featuredSkills;
                    }
/* 7 */             return skillAllowlist.copy(list);
                }

                public final List<AllowedSkill> component1() {
/* 1 */             return this.featuredSkills;
                }

                public final SkillAllowlist copy(List<AllowedSkill> featuredSkills) {
/* 3 */             return new SkillAllowlist(featuredSkills);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof SkillAllowlist) && O0000Ioio00.I0000O(this.featuredSkills, ((SkillAllowlist) other).featuredSkills);
                }

                public final List<AllowedSkill> getFeaturedSkills() {
/* 1 */             return this.featuredSkills;
                }

                public int hashCode() {
/* 3 */             return this.featuredSkills.hashCode();
                }

                public String toString() {
/* 18 */            return "SkillAllowlist(featuredSkills=" + this.featuredSkills + ")";
                }
            }
