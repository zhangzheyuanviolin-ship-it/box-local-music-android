            package com.google.ai.edge.gallery.common;

            import kotlin.Metadata;
            import p000.IIl001iO0Io;
            import p000.IoiOolO1iOo;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lcom/google/ai/edge/gallery/common/SkillTryOutChip;", "", "LIoiOolO1iOo;", "icon", "", "label", "prompt", "skillName", "<init>", "(LIoiOolO1iOo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()LIoiOolO1iOo;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(LIoiOolO1iOo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/ai/edge/gallery/common/SkillTryOutChip;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LIoiOolO1iOo;", "getIcon", "Ljava/lang/String;", "getLabel", "getPrompt", "getSkillName", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class SkillTryOutChip {
                public static final int $stable = 0;
                private final IoiOolO1iOo icon;
                private final String label;
                private final String prompt;
                private final String skillName;

                public SkillTryOutChip(IoiOolO1iOo ioiOolO1iOo, String str, String str2, String str3) {
/* 4 */             this.icon = ioiOolO1iOo;
/* 6 */             this.label = str;
/* 8 */             this.prompt = str2;
/* 10 */            this.skillName = str3;
                }

                public static SkillTryOutChip copy$default(SkillTryOutChip skillTryOutChip, IoiOolO1iOo ioiOolO1iOo, String str, String str2, String str3, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 ioiOolO1iOo = skillTryOutChip.icon;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str = skillTryOutChip.label;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str2 = skillTryOutChip.prompt;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                str3 = skillTryOutChip.skillName;
                    }
/* 25 */            return skillTryOutChip.copy(ioiOolO1iOo, str, str2, str3);
                }

                public final IoiOolO1iOo getIcon() {
/* 1 */             return this.icon;
                }

                public final String getLabel() {
/* 1 */             return this.label;
                }

                public final String getPrompt() {
/* 1 */             return this.prompt;
                }

                public final String getSkillName() {
/* 1 */             return this.skillName;
                }

                public final SkillTryOutChip copy(IoiOolO1iOo icon, String label, String prompt, String skillName) {
/* 3 */             return new SkillTryOutChip(icon, label, prompt, skillName);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof SkillTryOutChip)) {
/* 7 */                 return false;
                    }
/* 11 */            SkillTryOutChip skillTryOutChip = (SkillTryOutChip) other;
                    return O0000Ioio00.I0000O(this.icon, skillTryOutChip.icon) && O0000Ioio00.I0000O(this.label, skillTryOutChip.label) && O0000Ioio00.I0000O(this.prompt, skillTryOutChip.prompt) && O0000Ioio00.I0000O(this.skillName, skillTryOutChip.skillName);
                }

                public final IoiOolO1iOo getIcon() {
/* 1 */             return this.icon;
                }

                public final String getLabel() {
/* 1 */             return this.label;
                }

                public final String getPrompt() {
/* 1 */             return this.prompt;
                }

                public final String getSkillName() {
/* 1 */             return this.skillName;
                }

                public int hashCode() {
/* 28 */            return this.skillName.hashCode() + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.icon.hashCode() * 31, 31, this.label), 31, this.prompt);
                }

                public String toString() {
/* 1 */             IoiOolO1iOo ioiOolO1iOo = this.icon;
/* 3 */             String str = this.label;
/* 5 */             String str2 = this.prompt;
/* 7 */             String str3 = this.skillName;
/* 13 */            StringBuilder sb = new StringBuilder("SkillTryOutChip(icon=");
/* 16 */            sb.append(ioiOolO1iOo);
/* 21 */            sb.append(", label=");
/* 24 */            sb.append(str);
/* 29 */            sb.append(", prompt=");
/* 36 */            return IIl001iO0Io.I00100o1O0lo(sb, str2, ", skillName=", str3, ")");
                }
            }
