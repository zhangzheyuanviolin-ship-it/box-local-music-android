            package com.google.ai.edge.gallery.common;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/google/ai/edge/gallery/common/SkillInfo;", "", "skillMd", "", "skillUrl", "tryoutChip", "Lcom/google/ai/edge/gallery/common/SkillTryOutChip;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/ai/edge/gallery/common/SkillTryOutChip;)V", "getSkillMd", "()Ljava/lang/String;", "getSkillUrl", "getTryoutChip", "()Lcom/google/ai/edge/gallery/common/SkillTryOutChip;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 14 */    public final class SkillInfo {
                public static final int $stable = 0;
                private final String skillMd;
                private final String skillUrl;
                private final SkillTryOutChip tryoutChip;

                public SkillInfo(String str, String str2, SkillTryOutChip skillTryOutChip, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 12 */            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : skillTryOutChip);
                }

                public static SkillInfo copy$default(SkillInfo skillInfo, String str, String str2, SkillTryOutChip skillTryOutChip, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = skillInfo.skillMd;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = skillInfo.skillUrl;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                skillTryOutChip = skillInfo.tryoutChip;
                    }
/* 19 */            return skillInfo.copy(str, str2, skillTryOutChip);
                }

                public final String getSkillMd() {
/* 1 */             return this.skillMd;
                }

                public final String getSkillUrl() {
/* 1 */             return this.skillUrl;
                }

                public final SkillTryOutChip getTryoutChip() {
/* 1 */             return this.tryoutChip;
                }

                public final SkillInfo copy(String skillMd, String skillUrl, SkillTryOutChip tryoutChip) {
/* 3 */             return new SkillInfo(skillMd, skillUrl, tryoutChip);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof SkillInfo)) {
/* 7 */                 return false;
                    }
/* 11 */            SkillInfo skillInfo = (SkillInfo) other;
                    return O0000Ioio00.I0000O(this.skillMd, skillInfo.skillMd) && O0000Ioio00.I0000O(this.skillUrl, skillInfo.skillUrl) && O0000Ioio00.I0000O(this.tryoutChip, skillInfo.tryoutChip);
                }

                public final String getSkillMd() {
/* 1 */             return this.skillMd;
                }

                public final String getSkillUrl() {
/* 1 */             return this.skillUrl;
                }

                public final SkillTryOutChip getTryoutChip() {
/* 1 */             return this.tryoutChip;
                }

                public int hashCode() {
/* 7 */             int iHashCode = this.skillMd.hashCode() * 31;
/* 9 */             String str = this.skillUrl;
/* 21 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 23 */            SkillTryOutChip skillTryOutChip = this.tryoutChip;
/* 32 */            return iHashCode2 + (skillTryOutChip != null ? skillTryOutChip.hashCode() : 0);
                }

                public String toString() {
/* 1 */             String str = this.skillMd;
/* 3 */             String str2 = this.skillUrl;
/* 5 */             SkillTryOutChip skillTryOutChip = this.tryoutChip;
/* 13 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("SkillInfo(skillMd=", str, ", skillUrl=", str2, ", tryoutChip=");
/* 17 */            sbI00111O.append(skillTryOutChip);
/* 22 */            sbI00111O.append(")");
/* 25 */            return sbI00111O.toString();
                }

/* 15 */        public SkillInfo(String str, String str2, SkillTryOutChip skillTryOutChip) {
/* 17 */            this.skillMd = str;
/* 18 */            this.skillUrl = str2;
/* 19 */            this.tryoutChip = skillTryOutChip;
                }
            }
