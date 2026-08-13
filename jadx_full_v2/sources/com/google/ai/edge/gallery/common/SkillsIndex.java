            package com.google.ai.edge.gallery.common;

            import java.util.List;
            import kotlin.Metadata;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/google/ai/edge/gallery/common/SkillsIndex;", "", "skills", "", "Lcom/google/ai/edge/gallery/common/SkillInfo;", "<init>", "(Ljava/util/List;)V", "getSkills", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class SkillsIndex {
                public static final int $stable = 8;
                private final List<SkillInfo> skills;

                public SkillsIndex(List<SkillInfo> list) {
/* 4 */             this.skills = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static SkillsIndex copy$default(SkillsIndex skillsIndex, List list, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 list = skillsIndex.skills;
                    }
/* 7 */             return skillsIndex.copy(list);
                }

                public final List<SkillInfo> component1() {
/* 1 */             return this.skills;
                }

                public final SkillsIndex copy(List<SkillInfo> skills) {
/* 3 */             return new SkillsIndex(skills);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof SkillsIndex) && O0000Ioio00.I0000O(this.skills, ((SkillsIndex) other).skills);
                }

                public final List<SkillInfo> getSkills() {
/* 1 */             return this.skills;
                }

                public int hashCode() {
/* 3 */             return this.skills.hashCode();
                }

                public String toString() {
/* 18 */            return "SkillsIndex(skills=" + this.skills + ")";
                }
            }
